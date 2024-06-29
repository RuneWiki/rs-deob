import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class515 extends class508 {

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    public int field7569;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    public int field7572;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "Lpi;")
    public static class340 field7570;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "Z")
    public static boolean field7573;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public static void method3063(int arg0) {
        if (arg0 != 12481) {
            field7570 = null;
        }
        field7570 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method3064(int arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field7571++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class95.field1325.field1870 : class95.field1325.field1866) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class255 var11 = class95.field1325.method972(-31926, var8);
            if (var11.field3229 && var11.method1595((byte) 121).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class252.field3200 = null;
                    class25.field439 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class25.field439 = var5;
        class252.field3200 = var4;
        class476.field6953 = arg0;
        String[] var9 = new String[class25.field439];
        for (int var10 = 0; var10 < class25.field439; var10++) {
            var9[var10] = class95.field1325.method972(-31926, var4[var10]).method1595((byte) -69);
        }
        class338.method1995(true, var9, class252.field3200);
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(II)V")
    public class515(int arg0, int arg1) {
        this.field7569 = arg0;
        this.field7572 = arg1;
    }

    static {
        new class169(" days.", " Tage.", " jours.", " dias.");
        field7570 = new class340(10, 3);
        field7573 = false;
    }
}
