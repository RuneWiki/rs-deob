import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class86 {

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Z")
    public boolean field1244 = false;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
    public static boolean field1234 = false;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lha;")
    public static class29 field1232 = new class29(5000);

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "J")
    public static volatile long field1238 = 0L;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field1242 = 0;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "[I")
    public static int[] field1243 = new int[500];

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "J")
    public long field1237;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Lkm;")
    public class162 field1235;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([BI)[B", line = 9)
    public static final byte[] method563(byte[] arg0, int arg1) {
        field1241++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class298.method2103(arg0, 0, var3, arg1, var2);
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 22)
    public static void method564(int arg0) {
        field1243 = null;
        field1232 = null;
        if (arg0 != -1533600255) {
            method563((byte[]) null, -47);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIII)V", line = 41)
    public static final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1240++;
        int var7 = arg1 - arg4;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = 0;
        class251.method1789(arg1, (byte) 26);
        int var9 = -arg1;
        int var10 = -var7;
        int var11 = arg1;
        int var12 = var7;
        if (arg0 >= class33.field505 && arg0 <= class278.field4586) {
            int[] var13 = class306.field4998[arg0];
            int var14 = class34.method288(3, arg5 - arg1, class341.field5494, class196.field3001);
            int var15 = class34.method288(arg6 ^ 0xFFFFFFFC, arg1 + arg5, class341.field5494, class196.field3001);
            int var16 = class34.method288(3, arg5 - var7, class341.field5494, class196.field3001);
            int var17 = class34.method288(3, arg5 + var7, class341.field5494, class196.field3001);
            class270.method1906(arg3, var16, var14, var13, arg6 + 126);
            class270.method1906(arg2, var17, var16, var13, 122);
            class270.method1906(arg3, var15, var17, var13, arg6 + 122);
        }
        int var18 = arg6;
        int var19 = -1;
        while (var8 < var11) {
            var18 += 2;
            var19 += 2;
            var10 += var19;
            if (var10 >= 0 && var12 >= 1) {
                var12--;
                class216.field3338[var12] = var8;
                var10 -= var12 << 1;
            }
            var9 += var18;
            var8++;
            if (var9 >= 0) {
                var11--;
                int var20 = arg0 - var11;
                int var21 = arg0 + var11;
                var9 -= var11 << 1;
                if (var21 >= class33.field505 && var20 <= class278.field4586) {
                    if (var11 >= var7) {
                        int var22 = class34.method288(3, arg5 + var8, class341.field5494, class196.field3001);
                        int var23 = class34.method288(3, arg5 - var8, class341.field5494, class196.field3001);
                        if (class278.field4586 >= var21) {
                            class270.method1906(arg3, var22, var23, class306.field4998[var21], arg6 + 121);
                        }
                        if (class33.field505 <= var20) {
                            class270.method1906(arg3, var22, var23, class306.field4998[var20], 126);
                        }
                    } else {
                        int var24 = class216.field3338[var11];
                        int var25 = class34.method288(3, arg5 + var8, class341.field5494, class196.field3001);
                        int var26 = class34.method288(3, arg5 - var8, class341.field5494, class196.field3001);
                        int var27 = class34.method288(arg6 + 4, arg5 + var24, class341.field5494, class196.field3001);
                        int var28 = class34.method288(3, arg5 - var24, class341.field5494, class196.field3001);
                        if (var21 <= class278.field4586) {
                            int[] var29 = class306.field4998[var21];
                            class270.method1906(arg3, var28, var26, var29, arg6 + 124);
                            class270.method1906(arg2, var27, var28, var29, 127);
                            class270.method1906(arg3, var25, var27, var29, 125);
                        }
                        if (var20 >= class33.field505) {
                            int[] var30 = class306.field4998[var20];
                            class270.method1906(arg3, var28, var26, var30, arg6 + 127);
                            class270.method1906(arg2, var27, var28, var30, arg6 ^ 0xFFFFFF89);
                            class270.method1906(arg3, var25, var27, var30, 127);
                        }
                    }
                }
            }
            int var31 = arg0 + var8;
            int var32 = arg0 - var8;
            if (var31 >= class33.field505 && var32 <= class278.field4586) {
                int var33 = arg5 + var11;
                int var34 = arg5 - var11;
                if (class341.field5494 <= var33 && var34 <= class196.field3001) {
                    int var35 = class34.method288(3, var33, class341.field5494, class196.field3001);
                    int var36 = class34.method288(3, var34, class341.field5494, class196.field3001);
                    if (var7 <= var8) {
                        if (var31 <= class278.field4586) {
                            class270.method1906(arg3, var35, var36, class306.field4998[var31], 123);
                        }
                        if (class33.field505 <= var32) {
                            class270.method1906(arg3, var35, var36, class306.field4998[var32], arg6 ^ 0xFFFFFF84);
                        }
                    } else {
                        int var37 = var12 >= var8 ? var12 : class216.field3338[var8];
                        int var38 = class34.method288(3, arg5 + var37, class341.field5494, class196.field3001);
                        int var39 = class34.method288(3, arg5 - var37, class341.field5494, class196.field3001);
                        if (class278.field4586 >= var31) {
                            int[] var40 = class306.field4998[var31];
                            class270.method1906(arg3, var39, var36, var40, 127);
                            class270.method1906(arg2, var38, var39, var40, 119);
                            class270.method1906(arg3, var35, var38, var40, 119);
                        }
                        if (var32 >= class33.field505) {
                            int[] var41 = class306.field4998[var32];
                            class270.method1906(arg3, var39, var36, var41, 119);
                            class270.method1906(arg2, var38, var39, var41, 127);
                            class270.method1906(arg3, var35, var38, var41, 125);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 229)
    public static final Class method566(int arg0, String arg1) throws ClassNotFoundException {
        field1231++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            int var2 = 12 / ((arg0 - 42) / 52);
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }
}
