import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class class71 {

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field803 = 0;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "Lwf;")
    public static class70 field802 = new class70(128);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "Ltc;")
    public static class196 field807;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "Lud;")
    public static class23 field806;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
    public static int[] field805;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V", line = 7)
    public static void method416(byte arg0) {
        field806 = null;
        if (arg0 != 117) {
            method416((byte) -63);
        }
        field805 = null;
        field807 = null;
        field802 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILlm;Lgk;Len;)V", line = 24)
    public static final void method417(int arg0, class290 arg1, class278 arg2, class174 arg3) {
        field800++;
        class11 var4 = arg1.method1852(-15913, arg3);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method51();
        if (var4.method49() > var5) {
            var5 = var4.method49();
        }
        byte var6 = 10;
        int var7 = arg2.field3918;
        int var8 = arg2.field3926;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg1.field4142 != null) {
            var9 = class324.field4570.method1752((int[]) null, arg1.field4142, class88.field986, (class11[]) null, arg0 ^ 0x6914);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class88.field986[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class157.field2232.method180(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class157.field2232.method176() + (class157.field2232.method178() / 2);
        }
        int var15 = arg2.field3918 + (var5 / 2);
        int var16 = arg2.field3926;
        if (var7 < (class106.field1220 + var5)) {
            var15 = var5 / 2 + class106.field1220 + var10 / 2 + var6 + 5;
            var7 = class106.field1220;
        } else if (class106.field1229 - var5 < var7) {
            var15 = class106.field1229 - (var5 / 2) - var6 - (var10 / 2) - 5;
            var7 = class106.field1229 - var5;
        }
        if ((class106.field1224 + var5) > var8) {
            var16 = var5 / 2 + class106.field1224 + var6;
            var8 = class106.field1224;
        } else if (var8 > (class106.field1233 - var5)) {
            var16 = class106.field1233 - (var5 / 2) - var6 - var11;
            var8 = class106.field1233 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg2.field3918), (double) (var8 - arg2.field3926)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method94((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg0 != -26981) {
            return;
        }
        if (arg1.field4142 != null) {
            var19 = var16;
            var18 = var15 - var10 / 2 - 5;
            var20 = var10 + var18 + 10;
            var21 = var16 + class157.field2232.method176() * var9 + 3;
            if (arg1.field4151 != 0) {
                arg3.method1150((byte) 124, var16, var18, var21 - var16, var20 - var18, arg1.field4151);
            }
            if (arg1.field4136 != 0) {
                arg3.method1149(arg1.field4136, (byte) -112, var16, var18, var21 - var16, -var18 + var20);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class88.field986[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class157.field2232.method179(arg3, var23, var15, var16, arg1.field4149, true);
                var16 += class157.field2232.method176();
            }
        }
        int var24 = var5 >> 1;
        if (var7 - var24 >= class57.field654 || var7 + var24 <= class57.field654 || (var8 - var24) >= class48.field562 || class48.field562 >= var8 + var24 && class57.field654 <= var18 || class57.field654 >= var20 || class48.field562 <= var19 || class48.field562 >= var21) {
            return;
        }
        if (arg1.field4143[4] != null) {
            class70.method411(1006, arg1.field4143[4], arg1.field4125, -1, arg0 + 26981, 0, 0, (long) arg2.field3920);
        }
        if (arg1.field4143[3] != null) {
            class70.method411(1003, arg1.field4143[3], arg1.field4125, -1, 0, 0, 0, (long) arg2.field3920);
        }
        if (arg1.field4143[2] != null) {
            class70.method411(1008, arg1.field4143[2], arg1.field4125, -1, 0, 0, 0, (long) arg2.field3920);
        }
        if (arg1.field4143[1] != null) {
            class70.method411(1010, arg1.field4143[1], arg1.field4125, -1, arg0 ^ -26981, 0, 0, (long) arg2.field3920);
        }
        if (arg1.field4143[0] != null) {
            class70.method411(1011, arg1.field4143[0], arg1.field4125, -1, 0, 0, 0, (long) arg2.field3920);
            return;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lra;Len;Z)V", line = 192)
    public static final void method418(class57 arg0, class174 arg1, boolean arg2) {
        field804++;
        class145[] var3 = class145.method865(arg0, class215.field2925, 0);
        class344.field5066 = new class11[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class344.field5066[var4] = arg1.method955(var3[var4], true);
        }
        class145[] var5 = class145.method865(arg0, class136.field1914, 0);
        class176.field2449 = new class11[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class176.field2449[var6] = arg1.method955(var5[var6], true);
        }
        class145[] var7 = class145.method865(arg0, class261.field3603, 0);
        class225.field3075 = new class11[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class225.field3075[var8] = arg1.method955(var7[var8], true);
        }
        class145[] var9 = class145.method865(arg0, class401.field5832, 0);
        class51.field593 = new class11[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class51.field593[var10] = arg1.method955(var9[var10], true);
        }
        class145[] var11 = class145.method865(arg0, class27.field258, 0);
        class159.field2258 = new class11[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class159.field2258[var12] = arg1.method955(var11[var12], true);
        }
        class145[] var13 = class145.method865(arg0, class421.field6052, 0);
        class147.field2062 = new class11[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class147.field2062[var14] = arg1.method955(var13[var14], true);
        }
        class145[] var15 = class145.method865(arg0, class287.field4051, 0);
        class248.field3369 = new class11[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class248.field3369[var16] = arg1.method955(var15[var16], true);
        }
        class145[] var17 = class145.method865(arg0, class34.field332, 0);
        class137.field1928 = new class11[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class137.field1928[var18] = arg1.method955(var17[var18], true);
        }
        class145[] var19 = class145.method865(arg0, class109.field1261, 0);
        class118.field1411 = new class11[var19.length];
        if (arg2) {
            field806 = null;
        }
        for (int var20 = 0; var20 < var19.length; var20++) {
            class118.field1411[var20] = arg1.method955(var19[var20], true);
        }
        class145[] var21 = class145.method865(arg0, class266.field3730, 0);
        class12.field130 = new class11[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class12.field130[var22] = arg1.method955(var21[var22], true);
        }
        class145[] var23 = class145.method865(arg0, class350.field5113, 0);
        class45.field548 = new class11[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class45.field548[var24] = arg1.method955(var23[var24], true);
        }
        class145[] var25 = class145.method865(arg0, class407.field5909, 0);
        class159.field2247 = new class11[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class159.field2247[var26] = arg1.method955(var25[var26], true);
        }
        class145[] var27 = class145.method865(arg0, class190.field2588, 0);
        class166.field2328 = new class11[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class166.field2328[var28] = arg1.method955(var27[var28], true);
        }
        class159.field2260 = arg1.method955(class145.method854(arg0, class158.field2238, 0), true);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BILbk;)Ljava/lang/String;", line = 325)
    public static final String method419(byte arg0, int arg1, class211 arg2) {
        field801++;
        try {
            int var3 = arg2.method1376(128);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field2888 += class278.field3915.method2620(var4, arg2.field2888, var3, arg2.field2867, -126, 0);
            if (arg0 < 70) {
                field802 = null;
            }
            return class288.method1835(var4, var3, 0, 56);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
    public abstract void method124(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public abstract void method131(int arg0);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIII)V")
    public abstract void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
    public abstract void method118(int arg0);

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(III)V")
    public abstract void method123(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "()V")
    public abstract void method116();

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III[I)V")
    public abstract void method130(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V")
    public abstract void method129(int arg0);

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V")
    public abstract void method117(int arg0);

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)V")
    public abstract void method125(int arg0);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lvr;)V")
    public abstract void method120(class71 arg0);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "([I)V")
    public abstract void method121(int[] arg0);
}
