import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class204 implements class164 {

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lck;")
    private class1 field3340 = new class1(256);

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Lvh;")
    private class108 field3345;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lvh;")
    private class108 field3336;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "[Lkj;")
    private class113[] field3342;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lrc;")
    public static class9 field3333 = new class9(64);

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field3338 = 0;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field3343 = 0;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3339 = null;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[I")
    public static int[] field3344 = new int[14];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static final void method1347(int arg0) {
        class6.field73 = -3;
        field3334++;
        class74.field1222 = -1;
        class122.field2160 = 0;
        class53.field926 = 0;
        class35.field506 = false;
        class295.field4691 = arg0;
        class59.field1030 = 0;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(II)Lhl;")
    public class136 method1348(int arg0, int arg1) {
        field3331++;
        class129 var3 = this.field3340.method3(32, (long) arg1);
        if (var3 != null) {
            return (class136) var3;
        } else if (arg0 >= 0) {
            return null;
        } else {
            byte[] var4 = this.field3336.method755((byte) -74, arg1);
            if (var4 == null) {
                return null;
            } else {
                class136 var5 = new class136(new class101(var4));
                this.field3340.method4(0, var5, (long) arg1);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public static void method1349(boolean arg0) {
        if (!arg0) {
            field3339 = null;
            field3344 = null;
            field3333 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIZI)V")
    public static final void method1350(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3335++;
        class168.field2778.field1762 = 0;
        class168.field2778.method682(20, 22555);
        class168.field2778.method682(arg2, 22555);
        class168.field2778.method682(arg4, 22555);
        class168.field2778.method639(arg1, 15267);
        class168.field2778.method639(arg0, 15267);
        class150.field2514 = 0;
        class139.field2396 = -3;
        class166.field2715 = 1;
        if (!arg3) {
            field3344 = null;
        }
        class54.field934 = 0;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(BI)Lkj;")
    public final class113 method1104(byte arg0, int arg1) {
        if (arg0 > -71) {
            this.method1104((byte) 34, -115);
        }
        field3332++;
        return this.field3342[arg1];
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZIIIF)[I")
    public final int[] method1105(int arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        field3330++;
        int var7 = 62 / ((-arg4 - 28) / 32);
        return this.method1348(-14, arg2).method956(arg0, this, 125, this.field3345, (double) arg5, arg1, arg3, this.field3342[arg2].field2035);
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(II)V")
    public static final void method1351(int arg0, int arg1) {
        class67.field1115.method63(0, arg1);
        int var2 = 28 % ((62 - arg0) / 58);
        field3337++;
        class91.field1609.method63(0, arg1);
        class201.field3302.method63(0, arg1);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(II)Z")
    public final boolean method1106(int arg0, int arg1) {
        field3341++;
        if (arg1 == 8353) {
            class136 var3 = this.method1348(-46, arg0);
            return var3 != null && var3.method959(this.field3345, this, 116);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lvh;Lvh;Lvh;)V")
    public class204(class108 arg0, class108 arg1, class108 arg2) {
        this.field3345 = arg2;
        this.field3336 = arg1;
        class101 var4 = new class101(arg0.method746(0, (byte) -128, 0));
        int var5 = var4.method677(false);
        this.field3342 = new class113[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method669((byte) 36) == 1) {
                this.field3342[var6] = new class113();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3342[var7] != null) {
                this.field3342[var7].field2033 = var4.method669((byte) 36) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3342[var8] != null) {
                this.field3342[var8].field2041 = var4.method669((byte) 36) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3342[var9] != null) {
                this.field3342[var9].field2034 = var4.method669((byte) 36) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3342[var10] != null) {
                var4.method669((byte) 36);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3342[var11] != null) {
                var4.method646(-88);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3342[var12] != null) {
                var4.method646(-73);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3342[var13] != null) {
                var4.method646(120);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3342[var14] != null) {
                var4.method646(-62);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3342[var15] != null) {
                this.field3342[var15].field2047 = (short) var4.method677(false);
            }
        }
        if (var4.field1730.length > var4.field1762) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field3342[var16] != null) {
                    var4.method646(-38);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field3342[var17] != null) {
                    var4.method646(-87);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field3342[var18] != null) {
                    var4.method669((byte) 36);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field3342[var19] != null) {
                    this.field3342[var19].field2035 = var4.method669((byte) 36) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field3342[var20] != null) {
                    var4.method646(-96);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field3342[var21] != null) {
                    var4.method669((byte) 36);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field3342[var22] != null) {
                    var4.method669((byte) 36);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field3342[var23] != null) {
                    var4.method669((byte) 36);
                }
            }
        }
    }
}
