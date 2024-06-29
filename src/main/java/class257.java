import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class257 implements class126 {

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lib;")
    private class105 field3706 = new class105(256);

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Lhh;")
    private class84 field3704;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Lhh;")
    private class84 field3705;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "[Ljs;")
    private class216[] field3707;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lf;")
    public static class528 field3697;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)Z", line = 5)
    public final boolean method937(byte arg0, int arg1) {
        if (arg0 == 43) {
            field3698++;
            class251 var3 = this.method1630(101, arg1);
            return var3 != null && var3.method1599((byte) 44, this.field3705, this);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZFBII)[I", line = 21)
    public final int[] method938(int arg0, boolean arg1, float arg2, byte arg3, int arg4, int arg5) {
        if (arg3 > -30) {
            this.field3704 = null;
        }
        field3701++;
        return this.method1630(118, arg0).method1597(this.field3705, arg1, arg4, (double) arg2, (byte) -86, this, arg5, this.field3707[arg0].field3115);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Ljs;", line = 35)
    public final class216 method935(int arg0, int arg1) {
        if (arg1 == -8037) {
            field3703++;
            return this.field3707[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(FBIIZI)[F", line = 46)
    public final float[] method934(float arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3700++;
        if (arg1 > -108) {
            this.field3704 = null;
        }
        return this.method1630(108, arg5).method1596(arg2, arg3, this.field3707[arg5].field3115, this, -114, this.field3705);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 58)
    public static void method1629(int arg0) {
        if (arg0 > -14) {
            method1629(51);
        }
        field3697 = null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)Lom;", line = 70)
    private final class251 method1630(int arg0, int arg1) {
        if (arg0 <= 72) {
            this.method935(-115, -38);
        }
        field3702++;
        class117 var3 = this.field3706.method797(50, (long) arg1);
        if (var3 != null) {
            return (class251) var3;
        }
        byte[] var4 = this.field3704.method680(true, arg1);
        if (var4 == null) {
            return null;
        } else {
            class251 var5 = new class251(new class303(var4));
            this.field3706.method793((byte) -91, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BZIIIF)[I", line = 98)
    public final int[] method936(byte arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        field3699++;
        int var7 = 102 / ((arg0 + 38) / 44);
        return this.method1630(118, arg2).method1601(arg4, -89, arg3, this.field3707[arg2].field3115, (double) arg5, this.field3705, this);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lhh;Lhh;Lhh;)V", line = 110)
    public class257(class84 arg0, class84 arg1, class84 arg2) {
        this.field3704 = arg1;
        this.field3705 = arg2;
        class303 var4 = new class303(arg0.method683(0, 0, 5));
        int var5 = var4.method1868(0);
        this.field3707 = new class216[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1918((byte) 112) == 1) {
                this.field3707[var6] = new class216();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3707[var7] != null) {
                this.field3707[var7].field3114 = var4.method1918((byte) 115) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3707[var8] != null) {
                this.field3707[var8].field3095 = var4.method1918((byte) -55) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3707[var9] != null) {
                this.field3707[var9].field3112 = var4.method1918((byte) 97) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3707[var10] != null) {
                this.field3707[var10].field3097 = var4.method1918((byte) -75) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3707[var11] != null) {
                this.field3707[var11].field3099 = var4.method1899((byte) 109);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3707[var12] != null) {
                this.field3707[var12].field3116 = var4.method1899((byte) 70);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3707[var13] != null) {
                this.field3707[var13].field3109 = var4.method1899((byte) -96);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3707[var14] != null) {
                this.field3707[var14].field3118 = var4.method1899((byte) 33);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3707[var15] != null) {
                this.field3707[var15].field3119 = (short) var4.method1868(0);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field3707[var16] != null) {
                this.field3707[var16].field3096 = var4.method1899((byte) 74);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field3707[var17] != null) {
                this.field3707[var17].field3111 = var4.method1899((byte) 124);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field3707[var18] != null) {
                this.field3707[var18].field3113 = var4.method1918((byte) -67) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field3707[var19] != null) {
                this.field3707[var19].field3115 = var4.method1918((byte) 98) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field3707[var20] != null) {
                this.field3707[var20].field3108 = var4.method1899((byte) 74);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field3707[var21] != null) {
                this.field3707[var21].field3120 = var4.method1918((byte) -104) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field3707[var22] != null) {
                this.field3707[var22].field3104 = var4.method1918((byte) 122) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field3707[var23] != null) {
                this.field3707[var23].field3098 = var4.method1918((byte) -126) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field3707[var24] != null) {
                this.field3707[var24].field3100 = var4.method1918((byte) 111);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field3707[var25] != null) {
                this.field3707[var25].field3117 = var4.method1870(-1945262512);
            }
        }
    }
}
