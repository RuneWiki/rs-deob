import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class9 extends class276 {

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "S")
    public short field90;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "Llo;")
    public static class306 field91 = new class306("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "[[I")
    public static int[][] field94;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
    public static int field95;

    static {
        new class306("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field94 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZZII)Lqs;", line = 5)
    public static final class496 method52(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 != 23462) {
            field94 = null;
        }
        field92++;
        class436 var5 = null;
        if (class495.field7229 != null) {
            var5 = new class436(arg4, class495.field7229, class160.field2561[arg4], 1000000);
        }
        class436.field6517[arg4] = class403.field6129.method1547(class485.field7115, arg4, true, var5);
        if (arg1) {
            class436.field6517[arg4].method660(-754974720);
        }
        return new class496(class436.field6517[arg4], arg2, arg0);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lec;Lec;Z)V", line = 27)
    public static final void method53(class68 arg0, class68 arg1, boolean arg2) {
        class265.method1775(-2, class115.field2053);
        class438.field6541++;
        field95++;
        if (!arg2) {
            return;
        }
        class261.field4357.method152(arg1.field1059, (byte) -38);
        class261.field4357.method139(arg0.field1152, (byte) 122);
        class261.field4357.method182(arg1.field1152, 107);
        class261.field4357.method182(arg0.field1062, 33);
        class261.field4357.method160(-742698264, arg1.field1062);
        class261.field4357.method122(30393, arg0.field1059);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BIILch;)V", line = 53)
    public static final void method54(byte arg0, int arg1, int arg2, class166 arg3) {
        field93++;
        if (arg3.field3136 == arg1 && arg1 != -1) {
            class145 var4 = class130.field2232.method634(-1271654143, arg1);
            int var5 = var4.field2367;
            if (var5 == 1) {
                arg3.field3093 = 1;
                arg3.field3125 = 0;
                arg3.field3083 = 0;
                arg3.field3098 = arg2;
                arg3.field3067 = 0;
                class172.method1167(arg3.field4714, arg3.field3125, arg3.field4720, arg3.field4716, class302.field4850 == arg3, var4, (byte) 91);
            }
            if (var5 == 2) {
                arg3.field3067 = 0;
            }
        } else if (arg1 == -1 || arg3.field3136 == -1 || class130.field2232.method634(-1271654143, arg1).field2371 >= class130.field2232.method634(-1271654143, arg3.field3136).field2371) {
            arg3.field3098 = arg2;
            arg3.field3093 = 1;
            arg3.field3067 = 0;
            arg3.field3125 = 0;
            arg3.field3136 = arg1;
            arg3.field3154 = arg3.field3153;
            arg3.field3083 = 0;
            if (arg3.field3136 != -1) {
                class172.method1167(arg3.field4714, arg3.field3125, arg3.field4720, arg3.field4716, class302.field4850 == arg3, class130.field2232.method634(-1271654143, arg3.field3136), (byte) 61);
            }
        }
        if (arg0 != -42) {
            method54((byte) -116, -31, -90, null);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 102)
    public static void method55(int arg0) {
        if (arg0 != 6) {
            method53(null, null, false);
        }
        field94 = null;
        field91 = null;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V", line = 115)
    public class9() {
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(S)V", line = 118)
    public class9(short arg0) {
        this.field90 = arg0;
    }
}
