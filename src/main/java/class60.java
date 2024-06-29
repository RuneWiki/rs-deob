import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class60 implements class80 {

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Lnc;")
    private class89 field983 = new class89(256);

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lpk;")
    private class237 field981;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "Lpk;")
    private class237 field988;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[Lpd;")
    private class236[] field978;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "[I")
    public static int[] field987 = new int[50];

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Ljd;")
    public static class227 field979;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Lpk;")
    public static class237 field984;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Z")
    public final boolean method488(int arg0, int arg1) {
        if (arg0 == 0) {
            field977++;
            class183 var3 = this.method493(arg1, arg0 - 84);
            return var3 != null && var3.method1203((byte) 89, this, this.field981);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(FZIIII)[I")
    public final int[] method489(float arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field980++;
        if (arg5 != 0) {
            field984 = null;
        }
        return this.method493(arg2, -41).method1200(this, arg1, this.field978[arg2].field3622, arg4, -1839, arg3, (double) arg0, this.field981);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public static void method490(byte arg0) {
        field984 = null;
        if (arg0 == -49) {
            field987 = null;
            field979 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)Lpd;")
    public final class236 method491(int arg0, int arg1) {
        if (arg1 > -21) {
            this.method489(-0.87018F, true, -108, 77, -60, -26);
        }
        field985++;
        return this.field978[arg0];
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLca;)Lei;")
    public static final class216 method492(byte arg0, class54 arg1) {
        if (arg0 > -37) {
            field987 = null;
        }
        field982++;
        return new class216(arg1.method457((byte) 48), arg1.method457((byte) 68), arg1.method457((byte) 98), arg1.method457((byte) 61), arg1.method408(8), arg1.method408(8), arg1.method407(255));
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(II)Lof;")
    public class183 method493(int arg0, int arg1) {
        field986++;
        class259 var3 = this.field983.method675(31558, (long) arg0);
        if (var3 != null) {
            return (class183) var3;
        }
        byte[] var4 = this.field988.method1620(false, arg0);
        if (var4 == null) {
            return null;
        } else {
            class183 var5 = new class183(new class54(var4));
            this.field983.method677((byte) 108, (long) arg0, var5);
            return arg1 >= -22 ? null : var5;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lpk;Lpk;Lpk;)V")
    public class60(class237 arg0, class237 arg1, class237 arg2) {
        this.field981 = arg2;
        this.field988 = arg1;
        class54 var4 = new class54(arg0.method1605(-125, 0, 0));
        int var5 = var4.method423(120);
        this.field978 = new class236[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method407(255) == 1) {
                this.field978[var6] = new class236();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field978[var7] != null) {
                this.field978[var7].field3626 = var4.method407(255) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field978[var8] != null) {
                this.field978[var8].field3631 = var4.method407(255) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field978[var9] != null) {
                this.field978[var9].field3620 = var4.method407(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field978[var10] != null) {
                var4.method407(255);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field978[var11] != null) {
                var4.method459(false);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field978[var12] != null) {
                var4.method459(false);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field978[var13] != null) {
                var4.method459(false);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field978[var14] != null) {
                var4.method459(false);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field978[var15] != null) {
                this.field978[var15].field3627 = (short) var4.method423(-91);
            }
        }
        if (var4.field848.length > var4.field887) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field978[var16] != null) {
                    var4.method459(false);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field978[var17] != null) {
                    var4.method459(false);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field978[var18] != null) {
                    var4.method407(255);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field978[var19] != null) {
                    this.field978[var19].field3622 = var4.method407(255) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field978[var20] != null) {
                    var4.method459(false);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field978[var21] != null) {
                    var4.method407(255);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field978[var22] != null) {
                    var4.method407(255);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field978[var23] != null) {
                    var4.method407(255);
                }
            }
        }
    }
}
