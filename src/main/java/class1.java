import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public abstract class class1 {

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "Lh;")
    public static class15 field70 = class26.method190(true, "Windmill");

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "Lh;")
    public static class15 field73 = class26.method190(true, "Altar");

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "Lh;")
    public static class15 field72 = class26.method190(true, "Anvil");

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Lh;")
    public static class15 field76 = class26.method190(true, "Fur Trader");

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "[[B")
    public static byte[][] field77 = new byte[250][];

    @OriginalMember(owner = "mapview!a", name = "j", descriptor = "Lh;")
    public static class15 field79 = class26.method190(true, "Herbalist");

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "I")
    public static int field74 = 20;

    @OriginalMember(owner = "mapview!a", name = "i", descriptor = "Lh;")
    public static class15 field78 = class26.method190(true, "Short)2cut");

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "Lh;")
    public static class15 field71 = class26.method190(true, " )2 ");

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 7)
    public static final void method24(boolean arg0, Component arg1) {
        arg1.removeMouseListener(class15.field251);
        arg1.removeMouseMotionListener(class15.field251);
        if (arg0) {
            method24(true, null);
        }
        arg1.removeFocusListener(class15.field251);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 33)
    public static final void method26(Component arg0, int arg1) {
        if (arg1 >= -71) {
            field78 = null;
        }
        arg0.addMouseListener(class15.field251);
        arg0.addMouseMotionListener(class15.field251);
        arg0.addFocusListener(class15.field251);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)V", line = 49)
    public static final void method27(byte arg0) {
        if (class27.field368.toLowerCase().indexOf("microsoft") == -1) {
            class14.field245[44] = 71;
            class14.field245[45] = 26;
            class14.field245[46] = 72;
            class14.field245[47] = 73;
            class14.field245[59] = 57;
            class14.field245[61] = 27;
            class14.field245[91] = 42;
            class14.field245[92] = 74;
            class14.field245[93] = 43;
            if (class27.field371 == null) {
                class14.field245[192] = 58;
                class14.field245[222] = 59;
            } else {
                class14.field245[192] = 28;
                class14.field245[222] = 58;
                class14.field245[520] = 59;
            }
        } else {
            class14.field245[186] = 57;
            class14.field245[187] = 27;
            class14.field245[188] = 71;
            class14.field245[189] = 26;
            class14.field245[190] = 72;
            class14.field245[191] = 73;
            class14.field245[192] = 58;
            class14.field245[219] = 42;
            class14.field245[220] = 74;
            class14.field245[221] = 43;
            class14.field245[222] = 59;
            class14.field245[223] = 28;
        }
        if (arg0 != -38) {
            field75 = 106;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(I)V", line = 114)
    public static void method28(int arg0) {
        field71 = null;
        field79 = null;
        field77 = null;
        field72 = null;
        field76 = null;
        field70 = null;
        field73 = null;
        if (arg0 == -25433) {
            field78 = null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(ZLjava/awt/Component;)V", line = 136)
    public static final void method29(boolean arg0, Component arg1) {
        try {
            Method var2 = class27.field371;
            if (arg0) {
                method28(16);
            }
            if (var2 != null) {
                var2.invoke(arg1, Boolean.FALSE);
            }
        } catch (Throwable var4) {
        }
        arg1.addKeyListener(class26.field354);
        arg1.addFocusListener(class26.field354);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(BIIII)V", line = 189)
    public static final void method31(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 67 / ((40 - arg2) / 44);
        int var6 = arg4 >> 6;
        int var7 = arg1 >> 6;
        if (class25.field346[arg3][var7][var6] == null) {
            class25.field346[arg3][var7][var6] = new byte[4096];
        }
        class25.field346[arg3][var7][var6][class16.method141(arg1 << 6, 4032) + class16.method141(63, arg4)] = arg0;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I)V")
    public abstract void method25(int arg0);

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IBI)I")
    public abstract int method30(int arg0, byte arg1, int arg2);
}
