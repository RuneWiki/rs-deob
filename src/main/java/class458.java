import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class458 {

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public int field6302 = -1;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public int field6297;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public int field6298;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public int field6300;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public int field6303;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public int field6304;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public int field6307;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public int field6308;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public int field6309;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Ljj;")
    public static class99 field6305;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Ljava/lang/Object;")
    public static Object field6306;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIFIZII)[[I")
    public static final int[][] method2667(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field6310++;
        int[][] var9 = new int[arg1][arg8];
        class513 var10 = new class513();
        var10.field7239 = arg2;
        var10.field7250 = arg5;
        var10.field7238 = arg6;
        var10.field7246 = arg3;
        var10.field7242 = (int) (arg4 * 4096.0F);
        var10.method438(-2);
        class218.method1257((byte) -5, arg8, arg1);
        int var11 = 11 % ((-arg0 - 34) / 61);
        for (int var12 = 0; var12 < arg1; var12++) {
            var10.method2947(var9[var12], var12, 11474);
        }
        return var9;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBIIIILmd;)V")
    public static final void method2668(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class463 arg6) {
        field6299++;
        if (arg1 != -6) {
            field6305 = null;
        }
        class632.method3634(arg2, arg5, arg6.field8660, arg4, arg0, arg6.field8661, arg3, 0, arg6.field8652, (byte) 63);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method2669(int arg0) {
        field6306 = null;
        if (arg0 != -9321) {
            field6305 = null;
        }
        field6305 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZZLjava/lang/String;)V")
    public static final void method2670(boolean arg0, boolean arg1, String arg2) {
        field6301++;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class191.field2300.field3234 : class191.field2300.field3237);
        for (int var8 = var6; var8 < var7; var8++) {
            class62 var11 = class191.field2300.method1427(var8, 24845);
            if (var11.field615 && var11.method364(99).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class585.field8497 = -1;
                    class160.field1941 = null;
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
        if (arg1) {
            field6305 = null;
        }
        class247.field3162 = 0;
        class160.field1941 = var4;
        class585.field8497 = var5;
        String[] var9 = new String[class585.field8497];
        for (int var10 = 0; var10 < class585.field8497; var10++) {
            var9[var10] = class191.field2300.method1427(var4[var10], 24845).method364(99);
        }
        class620.method3561(var9, (byte) -125, class160.field1941);
    }
}
