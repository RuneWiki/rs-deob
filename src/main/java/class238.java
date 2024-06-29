import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class238 extends class42 {

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "Lff;")
    public static class9 field3183 = new class9(54, 9);

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "Lek;")
    public static class350 field3188 = new class350(0, -1);

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "I")
    public static int field3189 = 0;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "[[Lcr;")
    public static class403[][] field3185;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "([[BI[II[B[IB[[B)I", line = 9)
    public static final int method1472(byte[][] arg0, int arg1, int[] arg2, int arg3, byte[] arg4, int[] arg5, byte arg6, byte[][] arg7) {
        field3184++;
        int var8 = arg5[arg3];
        int var9 = arg2[arg3] + var8;
        int var10 = arg5[arg1];
        int var11 = 25 / ((arg6 - 19) / 38);
        int var12 = var10 + arg2[arg1];
        int var13 = var8;
        if (var10 > var8) {
            var13 = var10;
        }
        int var14 = var9;
        if (var9 > var12) {
            var14 = var12;
        }
        int var15 = arg4[arg3] & 0xFF;
        if ((arg4[arg1] & 0xFF) < var15) {
            var15 = arg4[arg1] & 0xFF;
        }
        byte[] var16 = arg0[arg3];
        byte[] var17 = arg7[arg1];
        int var18 = var13 - var8;
        int var19 = var13 - var10;
        for (int var20 = var13; var20 < var14; var20++) {
            int var21 = var17[var19++] + var16[var18++];
            if (var21 < var15) {
                var15 = var21;
            }
        }
        return -var15;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(JI)V", line = 66)
    public static final void method1473(long arg0, int arg1) {
        field3186++;
        int var3 = class375.field5094;
        if (arg1 != 9) {
            return;
        }
        int var4 = class183.field2610;
        if (class150.field2135 != var3) {
            int var5 = var3 - class150.field2135;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class150.field2135 += var6;
        }
        if (!class154.field2244.field7738) {
            class184.field2621 += (float) arg0 * class467.field6440 / 40.0F * 8.0F;
            class426.field5820 += (float) arg0 * class48.field754 / 40.0F * 8.0F;
        }
        if (class429.field5883 != var4) {
            int var7 = var4 - class429.field5883;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class429.field5883 += var8;
        }
        class393.method2306(0);
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(II)V", line = 150)
    public class238(int arg0, int arg1) {
        this.field3179 = arg0;
        this.field3180 = arg1;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)Lii;", line = 159)
    public static final class386 method1474(boolean arg0, int arg1) {
        if (arg0) {
            field3188 = null;
        }
        field3181++;
        return class168.field2434 && arg1 >= class147.field2085 && class114.field1629 >= arg1 ? class45.field676[arg1 - class147.field2085] : null;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(Z)Lnn;", line = 174)
    public static final class285 method1475(boolean arg0) {
        field3182++;
        if (!arg0) {
            field3183 = null;
        }
        try {
            return (class285) Class.forName("uv").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 189)
    public static void method1476(int arg0) {
        if (arg0 == -1) {
            field3183 = null;
            field3185 = null;
            field3188 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lj;III[Z)V", line = 204)
    public static final void method1477(class377 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class37.field582 == class141.field2049) {
            return;
        }
        int var5 = class209.field2868[arg1].method276(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class35 var7 = class209.field2868[var6];
                if (var7 != null) {
                    var7.method281(arg0, arg2, var5 - var7.method276(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}
