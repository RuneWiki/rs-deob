import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class172 extends class101 {

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "S")
    public short field2301;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field2302 = 1338;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 9)
    public static final void method1219(String arg0, int arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        field2300++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class445.field6245.field970 : class445.field6245.field965) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class311 var11 = class445.field6245.method609(var8, 17408);
            if (var11.field4474 && var11.method1953(80).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class356.field5214 = null;
                    class774.field10661 = -1;
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
        class537.field7313 = 0;
        class356.field5214 = var4;
        class774.field10661 = var5;
        String[] var9 = new String[class774.field10661];
        for (int var10 = 0; var10 < class774.field10661; var10++) {
            var9[var10] = class445.field6245.method609(var4[var10], 17408).method1953(80);
        }
        if (arg1 != 18123) {
            method1220(90, (byte) 51);
        }
        class196.method1346(var9, 94, class356.field5214);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)V", line = 83)
    public static final void method1220(int arg0, byte arg1) {
        class397.field5830 = 2;
        class39.field623 = arg0;
        field2299++;
        String var2 = null;
        if (class570.field7586 != null) {
            class376 var3 = new class376(class570.field7586);
            var2 = class667.method3693(-14014, var3.method2366(true));
            class170.field2269 = var3.method2366(true);
        }
        if (arg1 != -43) {
            method1219(null, -109, false);
        }
        if (var2 == null) {
            class624.method3415(35, arg1 + 45);
        } else {
            class187.method1298("", false, 0, var2, true);
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V", line = 116)
    public class172() {
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(S)V", line = 118)
    public class172(short arg0) {
        this.field2301 = arg0;
    }
}
