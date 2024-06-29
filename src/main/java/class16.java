import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class16 extends class24 {

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "J")
    public static long field161 = 0L;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "D")
    public static double field165 = -1.0D;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "Ljava/lang/String;")
    public static String field166 = "Continue";

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "[J")
    public static long[] field162 = new long[32];

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "Lbm;")
    public static class60 field167;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public static void method108(byte arg0) {
        field166 = null;
        if (arg0 < 114) {
            method110(-128);
        }
        field162 = null;
        field167 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[SI[Ljava/lang/String;B)V")
    public static final void method109(int arg0, short[] arg1, int arg2, String[] arg3, byte arg4) {
        if (arg4 < 38) {
            method109(-80, (short[]) null, -117, (String[]) null, (byte) 98);
        }
        field160++;
        if (arg0 >= arg2) {
            return;
        }
        int var5 = (arg0 + arg2) / 2;
        int var6 = arg0;
        String var7 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var7;
        short var8 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var8;
        for (int var9 = arg0; var9 < arg2; var9++) {
            if (var7 == null || arg3[var9] != null && arg3[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6] = var10;
                short var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg3[arg2] = arg3[var6];
        arg3[var6] = var7;
        arg1[arg2] = arg1[var6];
        arg1[var6] = var8;
        method109(arg0, arg1, var6 - 1, arg3, (byte) 68);
        method109(var6 + 1, arg1, arg2, arg3, (byte) 118);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public static final void method110(int arg0) {
        field168++;
        class351.field5125.method2052(0);
        class437.field6406.method2052(arg0 - 32);
        if (arg0 != 32) {
            field162 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILra;)V")
    public static final void method111(int arg0, class57 arg1) {
        class157.field2233 = arg1;
        if (arg0 == 0) {
            field164++;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)I")
    public static final int method112(int arg0, int arg1) {
        field159++;
        if (arg0 != 30673) {
            method109(-127, (short[]) null, 123, (String[]) null, (byte) -30);
        }
        class100 var2 = class152.method906((byte) -44, arg1);
        int var3 = var2.field1123;
        int var4 = var2.field1131;
        int var5 = var2.field1121;
        int var6 = class410.field5934[var5 - var4];
        return var6 & class283.field3972[var3] >> var4;
    }
}
