import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class130 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lad;")
    public class5 field2927 = new class5();

    @OriginalMember(owner = "client!se", name = "f", descriptor = "[I")
    public static int[] field2930 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Lhe;")
    public static class54 field2935 = class6.method58("Schrifts-=tze geladen)3", false);

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field2933 = 7759444;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lhe;")
    public static class54 field2934 = class6.method58("Ein kostenloses Spielkonto erstellen)3", false);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lhe;")
    private static class54 field2926 = class6.method58(" more options", false);

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Lhe;")
    private static class54 field2947 = class6.method58("(U4", false);

    @OriginalMember(owner = "client!se", name = "z", descriptor = "Lhe;")
    public static class54 field2950 = class6.method58("Ihr Spielkonto wurde deaktiviert)3", false);

    @OriginalMember(owner = "client!se", name = "y", descriptor = "Lhe;")
    public static class54 field2949 = field2926;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Lef;")
    public static class35 field2932;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "Lef;")
    public static class35 field2953;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lad;")
    private class5 field2946;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "[I")
    public static int[] field2925;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
    public static int[] field2938;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "[I")
    public static int[] field2945;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "[I")
    public static int[] field2948;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "[Lqb;")
    public static class113[] field2931;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)Lad;")
    public final class5 method975(boolean arg0) {
        field2940++;
        class5 var2 = this.field2946;
        if (this.field2927 == var2) {
            this.field2946 = null;
            return null;
        }
        this.field2946 = var2.field158;
        if (arg0) {
            this.method985(false, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lad;B)V")
    public final void method976(class5 arg0, byte arg1) {
        field2929++;
        if (arg0.field158 != null) {
            arg0.method48(-315);
        }
        if (arg1 <= -114) {
            arg0.field153 = this.field2927;
            arg0.field158 = this.field2927.field158;
            arg0.field158.field153 = arg0;
            arg0.field153.field158 = arg0;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Lad;")
    public final class5 method977(int arg0) {
        if (arg0 != 2) {
            field2949 = null;
        }
        field2943++;
        class5 var2 = this.field2927.field158;
        if (this.field2927 == var2) {
            return null;
        } else {
            var2.method48(-315);
            return var2;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public final void method978(byte arg0) {
        int var2 = 75 / ((43 - arg0) / 59);
        field2952++;
        while (true) {
            class5 var3 = this.field2927.field153;
            if (this.field2927 == var3) {
                return;
            }
            var3.method48(-315);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Lad;")
    public final class5 method979(int arg0) {
        if (arg0 >= -119) {
            this.method986(-10);
        }
        field2941++;
        class5 var2 = this.field2927.field153;
        if (this.field2927 == var2) {
            this.field2946 = null;
            return null;
        } else {
            this.field2946 = var2.field153;
            return var2;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)Lad;")
    public final class5 method980(int arg0) {
        field2944++;
        class5 var2 = this.field2927.field153;
        if (this.field2927 == var2) {
            return null;
        }
        var2.method48(arg0 - 313);
        if (arg0 != -2) {
            method981(false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
    public static void method981(boolean arg0) {
        field2948 = null;
        field2935 = null;
        if (arg0) {
            field2925 = null;
        }
        field2950 = null;
        field2947 = null;
        field2930 = null;
        field2925 = null;
        field2949 = null;
        field2926 = null;
        field2953 = null;
        field2931 = null;
        field2945 = null;
        field2932 = null;
        field2934 = null;
        field2938 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lad;BLad;)V")
    public final void method982(class5 arg0, byte arg1, class5 arg2) {
        if (arg0.field158 != null) {
            arg0.method48(-315);
        }
        if (arg1 > -46) {
            field2948 = null;
        }
        arg0.field158 = arg2.field158;
        field2942++;
        arg0.field153 = arg2;
        arg0.field158.field153 = arg0;
        arg0.field153.field158 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)Lad;")
    public final class5 method983(int arg0) {
        class5 var2 = this.field2946;
        field2939++;
        if (this.field2927 == var2) {
            this.field2946 = null;
            return null;
        }
        this.field2946 = var2.field153;
        if (arg0 != 18485) {
            field2930 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lhe;Lnc;Z)Lhe;")
    public static final class54 method984(class54 arg0, class93 arg1, boolean arg2) {
        if (arg0.method382(class120.field2798, (byte) 126) != -1) {
            label67: while (true) {
                int var3 = arg0.method382(class54.field1321, (byte) -95);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method382(class18.field519, (byte) -52);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method382(class129.field2899, (byte) -22);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method382(field2947, (byte) -75);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method382(class142.field3244, (byte) 120);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method382(class28.field747, (byte) -108);
                                                        if (var8 == -1) {
                                                            break label67;
                                                        }
                                                        class54 var9 = class24.field671;
                                                        if (class118.field2764 != null) {
                                                            var9 = class155.method1195(class118.field2764.field1141, -60);
                                                            try {
                                                                if (class118.field2764.field1143 != null) {
                                                                    byte[] var10 = ((String) class118.field2764.field1143).getBytes("ISO-8859-1");
                                                                    var9 = class123.method948(var10.length, (byte) 73, 0, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class143.method1105(new class54[] { arg0.method408((byte) 10, 0, var8), var9, arg0.method384(var8 + 4, 88) }, -842);
                                                    }
                                                }
                                                arg0 = class143.method1105(new class54[] { arg0.method408((byte) 85, 0, var7), class112.method842(class95.method761((byte) 63, 4, arg1), true), arg0.method384(var7 + 2, 115) }, -842);
                                            }
                                        }
                                        arg0 = class143.method1105(new class54[] { arg0.method408((byte) -3, 0, var6), class112.method842(class95.method761((byte) 44, 3, arg1), true), arg0.method384(var6 + 2, -107) }, -842);
                                    }
                                }
                                arg0 = class143.method1105(new class54[] { arg0.method408((byte) 3, 0, var5), class112.method842(class95.method761((byte) 81, 2, arg1), true), arg0.method384(var5 + 2, -74) }, -842);
                            }
                        }
                        arg0 = class143.method1105(new class54[] { arg0.method408((byte) -112, 0, var4), class112.method842(class95.method761((byte) 106, 1, arg1), true), arg0.method384(var4 + 2, 113) }, -842);
                    }
                }
                arg0 = class143.method1105(new class54[] { arg0.method408((byte) -123, 0, var3), class112.method842(class95.method761((byte) 87, 0, arg1), !arg2), arg0.method384(var3 + 2, -72) }, -842);
            }
        }
        if (arg2) {
            method984(null, null, true);
        }
        field2928++;
        return arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLad;)V")
    public final void method985(boolean arg0, class5 arg1) {
        field2937++;
        if (arg1.field158 != null) {
            arg1.method48(-315);
        }
        arg1.field153 = this.field2927.field153;
        if (!arg0) {
            arg1.field158 = this.field2927;
            arg1.field158.field153 = arg1;
            arg1.field153.field158 = arg1;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)Lad;")
    public final class5 method986(int arg0) {
        field2936++;
        if (arg0 != 0) {
            this.method985(false, null);
        }
        class5 var2 = this.field2927.field158;
        if (this.field2927 == var2) {
            this.field2946 = null;
            return null;
        } else {
            this.field2946 = var2.field158;
            return var2;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class130() {
        this.field2927.field158 = this.field2927;
        this.field2927.field153 = this.field2927;
    }
}
