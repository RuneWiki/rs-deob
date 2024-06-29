import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class229 {

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Ltja;")
    private class288 field2719 = new class288(64);

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lbt;")
    private class48 field2713;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Lls;")
    public class151 field2721;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2710 = null;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "F")
    public static float field2718 = 1024.0F;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[Ltf;")
    public static class312[] field2712;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[[B")
    public static byte[][] field2709;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZIII)Lkaa;", line = 6)
    public static final class52 method1411(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2715++;
        class52 var5 = new class52();
        var5.field713 = arg3;
        var5.field711 = arg2;
        class728.field10205.method2112(var5, (byte) 6, (long) arg0);
        class728.method4114(-75, arg3);
        class620 var6 = class479.method2848(arg0, (byte) -47);
        if (var6 != null) {
            class576.method3330(var6, arg4 ^ 0xFFFFFFDF);
        }
        if (class683.field9354 != null) {
            class576.method3330(class683.field9354, -1);
            class683.field9354 = null;
        }
        class448.method2639((byte) -23);
        if (var6 != null) {
            class690.method3851(!arg1, 17959, var6);
        }
        if (arg4 != 32) {
            method1412((byte) 125);
        }
        if (!arg1) {
            class142.method1043(arg3);
        }
        if (!arg1 && class131.field1615 != -1) {
            class314.method1853(class131.field1615, 1, -90);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 50)
    public static void method1412(byte arg0) {
        field2710 = null;
        field2712 = null;
        field2709 = null;
        int var1 = 49 % ((arg0 + 55) / 42);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V", line = 63)
    public final void method1413(boolean arg0) {
        field2711++;
        if (!arg0) {
            class288 var2 = this.field2719;
            synchronized (this.field2719) {
                this.field2719.method1690(0);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V", line = 79)
    public final void method1414(byte arg0) {
        class288 var2 = this.field2719;
        synchronized (this.field2719) {
            this.field2719.method1687((byte) 61);
        }
        field2716++;
        if (arg0 <= 0) {
            field2710 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)Lvl;", line = 95)
    public final class15 method1415(byte arg0, int arg1) {
        field2720++;
        class288 var3 = this.field2719;
        class15 var4;
        synchronized (this.field2719) {
            var4 = (class15) this.field2719.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = 72 % ((-arg0 - 50) / 41);
        class48 var6 = this.field2713;
        byte[] var7;
        synchronized (this.field2713) {
            var7 = this.field2713.method437(32, (byte) 89, arg1);
        }
        class15 var8 = new class15();
        var8.field283 = this;
        if (var7 != null) {
            var8.method201(true, new class403(var7));
        }
        class288 var9 = this.field2719;
        synchronized (this.field2719) {
            this.field2719.method1686(-25638, (long) arg1, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lbt;Lha;Z)V", line = 125)
    public static final void method1416(class48 arg0, class66 arg1, boolean arg2) {
        field2717++;
        class600[] var3 = class600.method3418(arg0, class395.field5123, 0);
        class689.field9388 = new class312[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class689.field9388[var4] = arg1.method640(var3[var4], true);
        }
        class600[] var5 = class600.method3418(arg0, class653.field9016, 0);
        class215.field2533 = new class312[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class215.field2533[var6] = arg1.method640(var5[var6], true);
        }
        class600[] var7 = class600.method3418(arg0, class648.field8838, 0);
        field2712 = new class312[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            field2712[var8] = arg1.method640(var7[var8], true);
        }
        class600[] var9 = class600.method3418(arg0, class507.field7208, 0);
        class342.field4291 = new class312[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class342.field4291[var10] = arg1.method640(var9[var10], true);
        }
        class600[] var11 = class600.method3418(arg0, class687.field9371, 0);
        class636.field8668 = new class312[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class636.field8668[var12] = arg1.method640(var11[var12], true);
        }
        class600[] var13 = class600.method3418(arg0, class183.field2236, 0);
        class535.field7535 = new class312[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class535.field7535[var14] = arg1.method640(var13[var14], true);
        }
        class600[] var15 = class600.method3418(arg0, class274.field3219, 0);
        class342.field4287 = new class312[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class342.field4287[var16] = arg1.method640(var15[var16], true);
        }
        class600[] var17 = class600.method3418(arg0, class424.field5632, 0);
        class318.field3916 = new class312[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class318.field3916[var18] = arg1.method640(var17[var18], true);
        }
        class600[] var19 = class600.method3418(arg0, class459.field6465, 0);
        class720.field10114 = new class312[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class720.field10114[var20] = arg1.method640(var19[var20], true);
        }
        class600[] var21 = class600.method3418(arg0, class298.field3563, 0);
        class251.field2949 = new class312[var21.length];
        if (arg2) {
            method1416(null, null, true);
        }
        for (int var22 = 0; var22 < var21.length; var22++) {
            class251.field2949[var22] = arg1.method640(var21[var22], true);
        }
        class600[] var23 = class600.method3418(arg0, class757.field10490, 0);
        class597.field8101 = new class312[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class597.field8101[var24] = arg1.method640(var23[var24], true);
        }
        class600[] var25 = class600.method3418(arg0, class141.field1768, 0);
        class388.field5008 = new class312[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class388.field5008[var26] = arg1.method640(var25[var26], true);
        }
        class331.field4095 = arg1.method640(class600.method3429(arg0, class74.field1022, 0), true);
        class433.field5716 = arg1.method640(class600.method3429(arg0, class563.field7775, 0), true);
        class600[] var27 = class600.method3418(arg0, class256.field3030, 0);
        class310.field3851 = new class312[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class310.field3851[var28] = arg1.method640(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V", line = 256)
    public final void method1417(int arg0, int arg1) {
        class288 var3 = this.field2719;
        synchronized (this.field2719) {
            this.field2719.method1694(arg1, -104);
        }
        field2714++;
        if (arg0 != 0) {
            field2712 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lmja;ILbt;Lls;)V", line = 282)
    public class229(class441 arg0, int arg1, class48 arg2, class151 arg3) {
        this.field2713 = arg2;
        this.field2713.method431(4, 32);
        this.field2721 = arg3;
    }
}
