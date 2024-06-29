import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class183 {

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "[I")
    private int[] field3202;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "Z")
    public static boolean field3204 = true;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "[S")
    public static short[] field3201 = new short[256];

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Lmh;")
    public static class128 field3208 = null;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field3210 = -1;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "[Z")
    public static boolean[] field3217 = new boolean[5];

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static volatile int field3206 = -1;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "Luc;")
    public static class180 field3214;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "[I")
    public static int[] field3205;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "[[S")
    public static short[][] field3207;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "[[Z")
    public static boolean[][] field3211;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "[[[B")
    public static byte[][][] field3213;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIII)V", line = 9)
    public static final void method1243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class153.method1017((byte) -116, arg1);
        int var7 = -arg1;
        field3203++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = arg1 - arg0;
        if (arg4 > var10) {
            var10 = 0;
        }
        int var11 = -var10;
        int var12 = -1;
        int var13 = var10;
        int var14 = -1;
        if (class70.field1315 <= arg3 && arg3 <= class181.field3173) {
            int[] var15 = class219.field3850[arg3];
            int var16 = class7.method59(class43.field875, arg2 - arg1, class193.field3335, 0);
            int var17 = class7.method59(class43.field875, arg2 + arg1, class193.field3335, arg4 ^ 0x0);
            int var18 = class7.method59(class43.field875, arg2 - var10, class193.field3335, arg4);
            int var19 = class7.method59(class43.field875, arg2 + var10, class193.field3335, arg4 ^ 0x0);
            class314.method2138(var18, true, arg6, var15, var16);
            class314.method2138(var19, true, arg5, var15, var18);
            class314.method2138(var17, true, arg6, var15, var19);
        }
        while (var9 > var8) {
            var14 += 2;
            var12 += 2;
            var7 += var12;
            var11 += var14;
            if (var11 >= 0 && var13 >= 1) {
                var13--;
                var11 -= var13 << 1;
                class64.field1214[var13] = var8;
            }
            var8++;
            if (var7 >= 0) {
                var9--;
                var7 -= var9 << 1;
                int var20 = arg3 - var9;
                int var21 = arg3 + var9;
                if (var21 >= class70.field1315 && var20 <= class181.field3173) {
                    if (var10 > var9) {
                        int var22 = class64.field1214[var9];
                        int var23 = class7.method59(class43.field875, arg2 + var8, class193.field3335, 0);
                        int var24 = class7.method59(class43.field875, arg2 - var8, class193.field3335, 0);
                        int var25 = class7.method59(class43.field875, arg2 + var22, class193.field3335, 0);
                        int var26 = class7.method59(class43.field875, arg2 - var22, class193.field3335, 0);
                        if (class181.field3173 >= var21) {
                            int[] var27 = class219.field3850[var21];
                            class314.method2138(var26, true, arg6, var27, var24);
                            class314.method2138(var25, true, arg5, var27, var26);
                            class314.method2138(var23, true, arg6, var27, var25);
                        }
                        if (class70.field1315 <= var20) {
                            int[] var28 = class219.field3850[var20];
                            class314.method2138(var26, true, arg6, var28, var24);
                            class314.method2138(var25, true, arg5, var28, var26);
                            class314.method2138(var23, true, arg6, var28, var25);
                        }
                    } else {
                        int var29 = class7.method59(class43.field875, arg2 + var8, class193.field3335, 0);
                        int var30 = class7.method59(class43.field875, arg2 - var8, class193.field3335, 0);
                        if (class181.field3173 >= var21) {
                            class314.method2138(var29, true, arg6, class219.field3850[var21], var30);
                        }
                        if (class70.field1315 <= var20) {
                            class314.method2138(var29, true, arg6, class219.field3850[var20], var30);
                        }
                    }
                }
            }
            int var31 = arg3 - var8;
            int var32 = arg3 + var8;
            if (class70.field1315 <= var32 && class181.field3173 >= var31) {
                int var33 = arg2 + var9;
                int var34 = arg2 - var9;
                if (var33 >= class193.field3335 && var34 <= class43.field875) {
                    int var35 = class7.method59(class43.field875, var33, class193.field3335, arg4);
                    int var36 = class7.method59(class43.field875, var34, class193.field3335, arg4);
                    if (var10 > var8) {
                        int var37 = var13 < var8 ? class64.field1214[var8] : var13;
                        int var38 = class7.method59(class43.field875, arg2 + var37, class193.field3335, 0);
                        int var39 = class7.method59(class43.field875, arg2 - var37, class193.field3335, 0);
                        if (var32 <= class181.field3173) {
                            int[] var40 = class219.field3850[var32];
                            class314.method2138(var39, true, arg6, var40, var36);
                            class314.method2138(var38, true, arg5, var40, var39);
                            class314.method2138(var35, true, arg6, var40, var38);
                        }
                        if (var31 >= class70.field1315) {
                            int[] var41 = class219.field3850[var31];
                            class314.method2138(var39, true, arg6, var41, var36);
                            class314.method2138(var38, true, arg5, var41, var39);
                            class314.method2138(var35, true, arg6, var41, var38);
                        }
                    } else {
                        if (var32 <= class181.field3173) {
                            class314.method2138(var35, true, arg6, class219.field3850[var32], var36);
                        }
                        if (class70.field1315 <= var31) {
                            class314.method2138(var35, true, arg6, class219.field3850[var31], var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I", line = 210)
    public final int method1244(int arg0, int arg1) {
        field3215++;
        if (arg1 != 1727) {
            return -128;
        }
        int var3 = (this.field3202.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field3202[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3202[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 244)
    public static void method1245(int arg0) {
        field3217 = null;
        if (arg0 != 1) {
            return;
        }
        field3214 = null;
        field3205 = null;
        field3211 = (boolean[][]) null;
        field3201 = null;
        field3208 = null;
        field3207 = (short[][]) null;
        field3213 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "([I)V", line = 269)
    public class183(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3202 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3202[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3202[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field3202[var5 + var5] = arg0[var4];
            this.field3202[var5 + var5 + 1] = var4++;
        }
    }
}
