import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class136 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[Lse;")
    public static class130[] field3127 = new class130[32768];

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lja;")
    public static class62 field3129 = class30.method243(43, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!td", name = "c", descriptor = "[I")
    public static int[] field3128 = new int[200];

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3136 = 0;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Lja;")
    public static class62 field3137 = class30.method243(43, "hel");

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Lja;")
    public static class62 field3139 = class30.method243(43, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lpb;")
    public static class105 field3132 = new class105();

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Lo;")
    public static class100 field3140 = new class100(5000);

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Lja;")
    public static class62 field3141 = class30.method243(43, "Welt");

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Lja;")
    private static class62 field3143 = class30.method243(43, "Hidden");

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lja;")
    public static class62 field3144 = class30.method243(43, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Lja;")
    public static class62 field3145 = class30.method243(43, "null");

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Lja;")
    public static class62 field3142 = field3143;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "[I")
    public static int[] field3146;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static final void method1090(int arg0) {
        class53.field1212++;
        field3135++;
        if (arg0 >= -71) {
            return;
        }
        field3140.method810(-2, 33);
        for (class81 var1 = (class81) class16.field372.method531(126); var1 != null; var1 = (class81) class16.field372.method536(98)) {
            if (var1.field1955 == 0 || var1.field1955 == 3) {
                method1093(var1, true, 120);
            }
        }
        if (class119.field2724 != null) {
            client.method163(class119.field2724, -121);
            class119.field2724 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ls;I)Lja;")
    public static final class62 method1091(class128 arg0, int arg1) {
        field3134++;
        if (arg1 != 33) {
            field3129 = null;
        }
        return class56.method384(arg1 ^ 0xFFFFFFDC, arg0, 32767);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1092(int arg0, Component arg1) {
        field3138++;
        arg1.removeKeyListener(class13.field315);
        arg1.removeFocusListener(class13.field315);
        class153.field3570 = -1;
        if (arg0 != 0) {
            method1090(1);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lle;ZI)V")
    public static final void method1093(class81 arg0, boolean arg1, int arg2) {
        int var3 = arg0.field1963;
        int var4 = 57 % ((arg2 - 71) / 49);
        int var5 = (int) arg0.field3493;
        field3130++;
        arg0.method1176((byte) -121);
        if (arg1) {
            class56.method385(0, var3);
        }
        class140.method1118(var3, (byte) 124);
        class54 var6 = class62.method456(var5, (byte) 118);
        if (var6 != null) {
            client.method163(var6, -91);
        }
        class119.field2709 = false;
        class128.field2889 = 0;
        class4.method19(-23707, class84.field2021, class57.field1410, class79.field1914, class148.field3484);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static void method1094(int arg0) {
        field3143 = null;
        field3129 = null;
        field3146 = null;
        field3139 = null;
        if (arg0 != -1362) {
            return;
        }
        field3141 = null;
        field3144 = null;
        field3132 = null;
        field3145 = null;
        field3140 = null;
        field3142 = null;
        field3128 = null;
        field3137 = null;
        field3127 = null;
    }
}
