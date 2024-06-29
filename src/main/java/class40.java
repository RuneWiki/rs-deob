import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class40 {

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lfe;")
    private class97 field646 = new class97(256);

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lfe;")
    private class97 field648 = new class97(256);

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lsi;")
    private class66 field645;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lsi;")
    private class66 field638;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lph;")
    public static class229 field643 = class266.method1858("rot:", 0);

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lph;")
    public static class229 field637 = class266.method1858("1", 0);

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lph;")
    public static class229 field639 = class266.method1858("Connexion perdue)3", 0);

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Z")
    public static boolean field647 = false;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Lph;")
    public static class229 field650 = class266.method1858("headicons_prayer", 0);

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field652 = -1;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([IIBI)Lqd;", line = 29)
    private final class182 method302(int[] arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 11) {
            return (class182) null;
        }
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFF8) ^ arg1;
        int var6 = var5 | arg3 << 16;
        field635++;
        long var7 = (long) var6 ^ 0x100000000L;
        class182 var9 = (class182) this.field648.method713(3365, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class150 var10 = (class150) this.field646.method713(arg2 + 3354, var7);
            if (var10 == null) {
                var10 = class150.method1099(this.field638, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field646.method710(var10, (byte) -84, var7);
            }
            class182 var11 = var10.method1093(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method598(70);
                this.field648.method710(var11, (byte) -119, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 70)
    public static void method303(int arg0) {
        if (arg0 != 683336428) {
            field650 = (class229) null;
        }
        field643 = null;
        field637 = null;
        field639 = null;
        field650 = null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V", line = 85)
    public static final void method304(int arg0) {
        class9.method61();
        class282.field4678 = new class14[7];
        class282.field4678[1] = new class56();
        field644++;
        class282.field4678[2] = new class13();
        class282.field4678[3] = new class64();
        class282.field4678[4] = new class261();
        if (arg0 >= -55) {
            method308(112, 4, -80, 40);
        }
        class282.field4678[5] = new class148();
        class282.field4678[6] = new class309();
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 108)
    public static final void method305(int arg0) {
        field636++;
        if (class24.field305 == -1 || class265.field4470 == -1) {
            return;
        }
        int var1 = class249.field4140 + ((class217.field3570 - class249.field4140) * class129.field2121 >> 16);
        class129.field2121 += var1;
        float[] var2 = new float[3];
        if (class129.field2121 < 65535) {
            class132.field2149 = false;
            class18.field244 = false;
        } else {
            if (class18.field244) {
                class132.field2149 = false;
            } else {
                class132.field2149 = true;
            }
            class129.field2121 = 65535;
            class18.field244 = true;
        }
        float var3 = (float) class129.field2121 / 65535.0F;
        int var4 = class37.field603 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class191.field3156[class24.field305][var4][var5] * 3;
            int var7 = (class191.field3156[class24.field305][var4 + 2][var5] + class191.field3156[class24.field305][var4 + 2][var5] - class191.field3156[class24.field305][var4 + 3][var5]) * 3;
            int var8 = class191.field3156[class24.field305][var4 + 1][var5] * 3;
            int var9 = class191.field3156[class24.field305][var4][var5];
            int var10 = var8 - var6;
            int var11 = var7 + var6 - (var8 * 2);
            int var12 = class191.field3156[class24.field305][var4 + 2][var5] + var8 - var9 - var7;
            var2[var5] = (((float) var12 * var3 + (float) var11) * var3 + (float) var10) * var3 + (float) var9;
        }
        class167.field2725 = (int) var2[2] - (class1.field1 * 128);
        class205.field3387 = (int) var2[1] * -1;
        class192.field3177 = (int) var2[0] - class1.field9 * 128;
        int var13 = class112.field1895 * 2;
        float[] var14 = new float[3];
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class191.field3156[class265.field4470][var13][var15] * 3;
            int var17 = (class191.field3156[class265.field4470][var13 + 2][var15] + class191.field3156[class265.field4470][var13 + 2][var15] - class191.field3156[class265.field4470][var13 + 3][var15]) * 3;
            int var18 = class191.field3156[class265.field4470][var13][var15];
            int var19 = class191.field3156[class265.field4470][var13 + 1][var15] * 3;
            int var20 = class191.field3156[class265.field4470][var13 + 2][var15] - (var18 - var19) - var17;
            int var21 = var16 + var17 - (var19 * 2);
            int var22 = var19 - var16;
            var14[var15] = (((float) var20 * var3 + (float) var21) * var3 + (float) var22) * var3 + (float) var18;
        }
        float var23 = var14[0] - var2[0];
        int var24 = -89 / ((-arg0) / 44);
        float var25 = (var14[1] - var2[1]) * -1.0F;
        float var26 = var14[2] - var2[2];
        double var27 = Math.sqrt((double) (var23 * var23 + var26 * var26));
        class179.field2945 = (float) Math.atan2((double) var25, var27);
        class195.field3268 = -((float) Math.atan2((double) var23, (double) var26));
        class65.field1004 = (int) ((double) class195.field3268 * 325.949D) & 0x7FF;
        class222.field3653 = (int) ((double) class179.field2945 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI[I)Lqd;", line = 219)
    public final class182 method306(boolean arg0, int arg1, int[] arg2) {
        field649++;
        if (this.field645.method499((byte) -103) == 1) {
            return this.method309(arg1, 0, true, arg2);
        }
        if (arg0) {
            this.field645 = (class66) null;
        }
        if (this.field645.method517((byte) -126, arg1) != 1) {
            throw new RuntimeException();
        }
        return this.method309(0, arg1, true, arg2);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lsi;Lsi;)V", line = 352)
    public class40(class66 arg0, class66 arg1) {
        this.field645 = arg0;
        this.field638 = arg1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II[I)Lqd;", line = 250)
    public final class182 method307(int arg0, int arg1, int[] arg2) {
        field641++;
        if (this.field638.method499((byte) -97) == 1) {
            return this.method302(arg2, arg1, (byte) 11, 0);
        } else if (this.field638.method517((byte) -126, arg1) == 1) {
            return this.method302(arg2, 0, (byte) 11, arg1);
        } else {
            if (arg0 != 0) {
                this.field638 = (class66) null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)I", line = 292)
    public static final int method308(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 11995) {
            field643 = (class229) null;
        }
        field651++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZ[I)Lqd;", line = 320)
    private final class182 method309(int arg0, int arg1, boolean arg2, int[] arg3) {
        field642++;
        int var5 = (arg1 >>> 12 | arg1 << 4 & 0xFFFD) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class182 var9 = (class182) this.field648.method713(3365, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class197 var10 = class197.method1388(this.field645, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class182 var11 = var10.method1385();
            if (!arg2) {
                field652 = -56;
            }
            this.field648.method710(var11, (byte) -96, var7);
            if (arg3 != null) {
                arg3[0] -= var11.field2973.length;
            }
            return var11;
        } else {
            return null;
        }
    }
}
