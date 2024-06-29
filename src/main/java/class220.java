import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class220 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lvd;")
    public static class222 field4063 = class212.method1357("b12_full", 10731);

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lvd;")
    public static class222 field4069 = class212.method1357("Bitte geben Sie Ihren Benutzernamen ein)3", 10731);

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field4076 = 50;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[Lvd;")
    public static class222[] field4070 = new class222[field4076];

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
    public static int[] field4068 = new int[field4076];

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
    public static int[] field4075 = new int[field4076];

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "[I")
    public static int[] field4067 = new int[field4076];

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[I")
    public static int[] field4065 = new int[field4076];

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
    public static int[] field4073 = new int[field4076];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[I")
    public static int[] field4062 = new int[field4076];

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "[I")
    public static int[] field4077 = new int[field4076];

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Lvd;")
    public static class222 field4078 = class212.method1357("::gc", 10731);

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lqh;")
    public class176 field4072;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "[I")
    public int[] field4079;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "[Lva;")
    public static class219[] field4080;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[[Lba;")
    public static class13[][] field4066;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field4067 = null;
        field4065 = null;
        field4073 = null;
        field4075 = null;
        field4069 = null;
        field4066 = null;
        field4077 = null;
        if (arg0 != 0) {
            return;
        }
        field4068 = null;
        field4078 = null;
        field4080 = null;
        field4063 = null;
        field4070 = null;
        field4062 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[Lba;B)V")
    public static final void method1398(int arg0, class13[] arg1, byte arg2) {
        field4074++;
        if (arg2 != -36) {
            method1398(-113, null, (byte) -109);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class13 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field365 == 0) {
                    if (var4.field307 != null) {
                        method1398(arg0, var4.field307, (byte) -36);
                    }
                    class21 var5 = (class21) class208.field3863.method1520((long) var4.field269, 124);
                    if (var5 != null) {
                        class8.method65(var5.field493, 1, arg0);
                    }
                }
                if (arg0 == 0 && var4.field296 != null) {
                    class191 var6 = new class191();
                    var6.field3510 = var4.field296;
                    var6.field3521 = var4;
                    class52.method373(arg2 ^ 0x7F0C, var6);
                }
                if (arg0 == 1 && var4.field237 != null) {
                    if (var4.field264 >= 0) {
                        class13 var7 = class10.method92(923, var4.field269);
                        if (var7 == null || var7.field307 == null || var4.field264 >= var7.field307.length || var7.field307[var4.field264] != var4) {
                            continue;
                        }
                    }
                    class191 var8 = new class191();
                    var8.field3521 = var4;
                    var8.field3510 = var4.field237;
                    class52.method373(arg2 ^ 0x7F0C, var8);
                }
            }
        }
    }
}
