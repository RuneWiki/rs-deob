import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class131 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lvh;")
    private class212 field1993 = new class212(256);

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lvh;")
    private class212 field2003 = new class212(256);

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lva;")
    private class36 field1999;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lva;")
    private class36 field1996;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Lml;")
    public static class134 field2007 = null;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field2006 = 0;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Lck;")
    public static class119 field1998 = class298.method1987((byte) 59, "rect_debug=");

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Lck;")
    public static class119 field2004 = class298.method1987((byte) 101, " (X");

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIB[I)Lph;", line = 9)
    private final class34 method865(int arg0, int arg1, byte arg2, int[] arg3) {
        field2001++;
        if (arg2 <= 8) {
            return (class34) null;
        }
        int var5 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF5);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class34 var9 = (class34) this.field2003.method1329((byte) 90, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class15 var10 = class15.method120(this.field1999, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class34 var11 = var10.method122();
            this.field2003.method1326(var7, (byte) -101, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field476.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([III)Lph;", line = 45)
    public final class34 method866(int[] arg0, int arg1, int arg2) {
        field1994++;
        if (this.field1996.method258(-20811) == 1) {
            return this.method867(arg0, arg1, -104, 0);
        } else if (this.field1996.method263(arg1, 100) == 1) {
            return this.method867(arg0, 0, -115, arg1);
        } else {
            int var4 = -14 % ((arg2 + 82) / 38);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([IIII)Lph;", line = 73)
    private final class34 method867(int[] arg0, int arg1, int arg2, int arg3) {
        field2002++;
        int var5 = arg1 ^ (arg3 << 4 & 0xFFF7 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class34 var9 = (class34) this.field2003.method1329((byte) 90, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class188 var10 = (class188) this.field1993.method1329((byte) 90, var7);
            if (var10 == null) {
                var10 = class188.method1184(this.field1996, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field1993.method1326(var7, (byte) -101, var10);
            }
            class34 var11 = var10.method1191(arg0);
            if (var11 == null) {
                return null;
            }
            if (arg2 >= -98) {
                field1998 = (class119) null;
            }
            var10.method552((byte) 86);
            this.field2003.method1326(var7, (byte) -100, var11);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "([III)Lph;", line = 123)
    public final class34 method868(int[] arg0, int arg1, int arg2) {
        field1997++;
        if (this.field1999.method258(-20811) == arg1) {
            return this.method865(arg2, 0, (byte) 62, arg0);
        } else if (this.field1999.method263(arg2, 100) == 1) {
            return this.method865(0, arg2, (byte) 97, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[[FLog;[[F[IZ[[III[[FLtg;)V", line = 140)
    public static final void method869(int arg0, float[][] arg1, class159 arg2, float[][] arg3, int[] arg4, boolean arg5, int[][] arg6, int arg7, int arg8, float[][] arg9, class243 arg10) {
        field2005++;
        int[] var11 = new int[arg4.length / 2];
        if (arg5) {
            field2004 = (class119) null;
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg4[var12 + var12];
            int var14 = arg4[var12 + var12 + 1];
            if (arg7 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg7 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg7 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg1[arg0][arg8];
                var18 = arg3[arg0][arg8];
                var19 = arg9[arg0][arg8];
            } else if (var13 == 128 && var14 == 0) {
                var17 = arg1[arg0 + 1][arg8];
                var19 = arg9[arg0 + 1][arg8];
                var18 = arg3[arg0 + 1][arg8];
            } else if (var13 == 128 && var14 == 128) {
                var18 = arg3[arg0 + 1][arg8 + 1];
                var19 = arg9[arg0 + 1][arg8 + 1];
                var17 = arg1[arg0 + 1][arg8 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg9[arg0][arg8 + 1];
                var18 = arg3[arg0][arg8 + 1];
                var17 = arg1[arg0][arg8 + 1];
            } else {
                float var20 = arg9[arg0][arg8];
                float var21 = arg1[arg0][arg8];
                float var22 = (float) var13 / 128.0F;
                float var23 = (arg1[arg0 + 1][arg8] - var21) * var22 + var21;
                float var24 = arg3[arg0][arg8];
                float var25 = (arg3[arg0 + 1][arg8] - var24) * var22 + var24;
                float var26 = (arg9[arg0 + 1][arg8] - var20) * var22 + var20;
                float var27 = (float) var14 / 128.0F;
                float var28 = arg9[arg0][arg8 + 1];
                float var29 = (arg9[arg0 + 1][arg8 + 1] - var28) * var22 + var28;
                float var30 = arg1[arg0][arg8 + 1];
                float var31 = (arg1[arg0 + 1][arg8 + 1] - var30) * var22 + var30;
                float var32 = arg3[arg0][arg8 + 1];
                var19 = (var29 - var26) * var27 + var26;
                float var33 = (arg3[arg0 + 1][arg8 + 1] - var32) * var22 + var32;
                var17 = (var31 - var23) * var27 + var23;
                var18 = (var33 - var25) * var27 + var25;
            }
            int var34 = (arg8 << 7) + var14;
            int var35 = (arg0 << 7) + var13;
            int var36 = class4.method78(arg0, var13, arg8, var14, -65, arg6);
            var11[var12] = arg2.method1015(arg10, var35, var36, var34, var19, var18, var17);
        }
        arg2.method1016(var11);
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lva;Lva;)V", line = 276)
    public class131(class36 arg0, class36 arg1) {
        this.field1999 = arg0;
        this.field1996 = arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 289)
    public static void method870(byte arg0) {
        field2004 = null;
        field2007 = null;
        field1998 = null;
        if (arg0 > -89) {
            method870((byte) -82);
        }
    }
}
