import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class70 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "[J")
    public static long[] field1015 = new long[100];

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1019 = null;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[S")
    public static short[] field1016 = new short[500];

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field1018 = 0;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Z")
    public static boolean field1017 = false;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILed;)Z")
    public static final boolean method439(int arg0, class195 arg1) {
        field1020++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 23155) {
            method443((byte) 30);
        }
        if (!arg1.field3098) {
            return false;
        } else if (!arg1.method1354(true)) {
            return false;
        } else if (class145.field2289.method872((byte) -118, (long) arg1.field3096) == null) {
            return class75.field1183.method872((byte) -86, (long) arg1.field3099) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([IIIIII)V")
    public static final void method440(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class154 var6 = class27.field346[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class168 var7 = var6.field2423;
        if (var7 != null) {
            int var8 = var7.field2625;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class153 var10 = var6.field2428;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2395;
        int var12 = var10.field2389;
        int var13 = var10.field2393;
        int var14 = var10.field2383;
        int[] var15 = class187.field2898[var11];
        int[] var16 = class139.field2147[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILrf;)Lrf;")
    public abstract class306 method441(int arg0, class306 arg1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLma;)V")
    public static final void method442(byte arg0, class202 arg1) {
        if (arg0 < 96) {
            method443((byte) 0);
        }
        for (int var2 = 0; var2 < class216.field3438; var2++) {
            int var3 = arg1.method1450(-80);
            int var4 = arg1.method1419(110);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class35.field443[var3] != null) {
                class35.field443[var3].field3997 = var4;
            }
        }
        field1021++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method443(byte arg0) {
        field1015 = null;
        int var1 = -29 / ((arg0 + 55) / 58);
        field1019 = null;
        field1016 = null;
    }
}
