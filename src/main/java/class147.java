import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public abstract class class147 extends class198 {

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "[I")
    public static int[] field2189 = new int[2];

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "Z")
    public static boolean field2200 = false;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Lcl;")
    public static class145 field2188 = new class145();

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "F")
    public static float field2202;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Ltj;")
    public static class108 field2191;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "Lt;")
    public static class400 field2199;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "Z")
    public boolean field2192;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)Z")
    public final boolean method610(int arg0) {
        field2193++;
        if (arg0 != -439) {
            this.method611((class269) null, false, (class198) null, 90, 25, (byte) -105, 41);
        }
        return false;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1086(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2194++;
        if (arg4) {
            class291.method1974(109);
        }
        if (class213.field3016 != null && (arg1 != 3 || class291.field4225 != arg3 || class145.field2183 != arg0)) {
            class314.method2102(class213.field3016, class401.field5628, arg2 - 835);
            class213.field3016 = null;
        }
        if (arg1 == 3 && class213.field3016 == null) {
            class213.field3016 = class140.method1060(arg0, 0, arg3, class401.field5628, 103, 0);
            if (class213.field3016 != null) {
                class145.field2183 = arg0;
                class291.field4225 = arg3;
                class415.method2612(class401.field5628, 120);
            }
        }
        if (arg1 == 3 && class213.field3016 == null) {
            method1086(-1, class220.field3168, 768, -1, true, arg5);
            return;
        }
        Container var6;
        if (class213.field3016 != null) {
            class338.field4901 = arg0;
            class261.field3865 = arg3;
            var6 = class213.field3016;
        } else if (class369.field5255 == null) {
            var6 = class401.field5628.field3154;
            class261.field3865 = var6.getSize().width;
            class338.field4901 = var6.getSize().height;
        } else {
            Insets var7 = class369.field5255.getInsets();
            int var10001 = var7.left + var7.right;
            class261.field3865 = class369.field5255.getSize().width - var10001;
            class338.field4901 = class369.field5255.getSize().height - var7.bottom - var7.top;
            var6 = class369.field5255;
        }
        if (arg1 == 1) {
            class238.field3520 = (class261.field3865 - 765) / 2;
            class24.field307 = 765;
            class19.field251 = 0;
            class316.field4643 = 503;
        } else if (class306.field4461 < 96 && class110.field1418 == 0) {
            int var8 = class261.field3865 > 1024 ? 1024 : class261.field3865;
            class238.field3520 = (class261.field3865 - var8) / 2;
            int var9 = class338.field4901 > 768 ? 768 : class338.field4901;
            class24.field307 = var8;
            class19.field251 = 0;
            class316.field4643 = var9;
        } else {
            class316.field4643 = class338.field4901;
            class24.field307 = class261.field3865;
            class19.field251 = 0;
            class238.field3520 = 0;
        }
        if (class214.field3022 != 0) {
            boolean var10000;
            if (class24.field307 < 1024 && class316.field4643 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class358.method2335((byte) 88, class110.field1418);
        } else {
            class117.field1588.setSize(class24.field307, class316.field4643);
            if (class59.field786 != null) {
                class59.field786.method950();
            }
            if (class369.field5255 == var6) {
                Insets var10 = class369.field5255.getInsets();
                class117.field1588.setLocation(class238.field3520 + var10.left, class19.field251 + var10.top);
            } else {
                class117.field1588.setLocation(class238.field3520, class19.field251);
            }
        }
        if (arg1 < 2) {
            class199.field2845 = false;
        } else {
            class199.field2845 = true;
        }
        if (class265.field3898 != -1) {
            class378.method2411((byte) 89, true);
        }
        if (arg2 != 768) {
            field2188 = null;
        }
        if (class199.field2847 != null && (class423.field6041 == 30 || class423.field6041 == 25)) {
            class130.method805(arg2 ^ 0xFFFFFC94);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class353.field5126[var11] = true;
        }
        class240.field3543 = true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    public static void method1087(byte arg0) {
        field2189 = null;
        field2191 = null;
        if (arg0 > 88) {
            field2188 = null;
            field2199 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)[Lj;")
    public static final class321[] method1088(int arg0) {
        field2198++;
        int var1 = 73 % ((34 - arg0) / 39);
        if (class91.field1173 == null) {
            class321[] var2 = class226.method1584(class401.field5628, (byte) -21);
            class321[] var3 = new class321[var2.length];
            int var4 = 0;
            label63: for (int var5 = 0; var5 < var2.length; var5++) {
                class321 var9 = var2[var5];
                if ((var9.field4695 <= 0 || var9.field4695 >= 24) && var9.field4698 >= 800 && var9.field4693 >= 600 && (class306.field4461 >= 96 || class110.field1418 != 0 || var9.field4698 <= 1024 && var9.field4693 <= 768)) {
                    for (int var10 = 0; var10 < var4; var10++) {
                        class321 var11 = var3[var10];
                        if (var9.field4698 == var11.field4698 && var9.field4693 == var11.field4693) {
                            if (var9.field4695 > var11.field4695) {
                                var3[var10] = var9;
                            }
                            continue label63;
                        }
                    }
                    var3[var4] = var9;
                    var4++;
                }
            }
            class91.field1173 = new class321[var4];
            class271.method1852(var3, 0, class91.field1173, 0, var4);
            int[] var6 = new int[class91.field1173.length];
            for (int var7 = 0; var7 < class91.field1173.length; var7++) {
                class321 var8 = class91.field1173[var7];
                var6[var7] = var8.field4698 * var8.field4693;
            }
            class125.method746(var6, class91.field1173, (byte) 122);
        }
        return class91.field1173;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)V")
    public final void method613(byte arg0) {
        if (arg0 <= -56) {
            field2197++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lvq;ZLkm;IIBI)V")
    public final void method611(class269 arg0, boolean arg1, class198 arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = 82 / ((arg5 - 12) / 40);
        field2195++;
        throw new IllegalStateException();
    }
}
