import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class132 extends class106 {

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public int field2752 = 0;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "Lrf;")
    public static class163 field2753 = class53.method392(-118, "mapmarker");

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "Lrf;")
    public static class163 field2748 = class53.method392(49, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field2751 = 99;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLfa;)V")
    public final void method880(boolean arg0, class52 arg1) {
        if (arg0) {
            field2751 = -79;
        }
        while (true) {
            int var3 = arg1.method344(255);
            if (var3 == 0) {
                field2755++;
                return;
            }
            this.method883(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method881(int arg0, Component arg1) {
        if (arg0 != -27021) {
            return;
        }
        arg1.removeMouseListener(class131.field2735);
        field2747++;
        arg1.removeMouseMotionListener(class131.field2735);
        arg1.removeFocusListener(class131.field2735);
        class177.field3573 = 0;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V")
    public static final void method882(byte arg0) {
        field2749++;
        int var1 = 0;
        int[] var2 = new int[class166.field3384];
        if (arg0 > -88) {
            return;
        }
        for (int var3 = 0; var3 < class166.field3384; var3++) {
            class4 var5 = class97.method669(-87, var3);
            if (var5.field67 >= 0 || var5.field59 >= 0) {
                var2[var1++] = var3;
            }
        }
        class57.field1161 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            class57.field1161[var4] = var2[var4];
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lfa;IZ)V")
    private final void method883(class52 arg0, int arg1, boolean arg2) {
        field2754++;
        if (!arg2) {
            this.method883(null, 70, false);
        }
        if (arg1 == 2) {
            this.field2752 = arg0.method390((byte) 107);
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
    public static void method884(int arg0) {
        field2753 = null;
        if (arg0 != 17771) {
            field2753 = null;
        }
        field2748 = null;
    }
}
