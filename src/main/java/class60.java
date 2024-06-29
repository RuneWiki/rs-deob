import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class60 extends class124 {

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
    public int field1693 = 1000;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "Lrd;")
    public static class117 field1681 = class95.method812("headicons_hint", (byte) 8);

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "Lrd;")
    private static class117 field1690 = class95.method812("Connecting to friendserver", (byte) 8);

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "Lrd;")
    public static class117 field1691 = class95.method812("Cabbage", (byte) 8);

    @OriginalMember(owner = "client!id", name = "lb", descriptor = "Lrd;")
    public static class117 field1694 = class95.method812("Menge eingeben:", (byte) 8);

    @OriginalMember(owner = "client!id", name = "mb", descriptor = "[Lwe;")
    public static class148[] field1695 = new class148[16];

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "Lrd;")
    public static class117 field1687 = class95.method812("Update)2Liste geladen)3", (byte) 8);

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
    public static int field1684 = -1;

    @OriginalMember(owner = "client!id", name = "nb", descriptor = "Lrd;")
    public static class117 field1696 = field1690;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "[[I")
    public static int[][] field1686;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIII)V")
    public void method291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1682++;
        class28 var10 = this.method448(-16777217);
        if (var10 != null) {
            this.field1693 = var10.field1693;
            var10.method291(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)Z")
    public static final boolean method610(int arg0, boolean arg1) {
        field1683++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class79.field2119[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg1) {
            return false;
        } else {
            return var2 == 32;
        }
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)Ldf;")
    public class28 method448(int arg0) {
        if (arg0 == -16777217) {
            field1692++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(JZ)V")
    public static final void method611(long arg0, boolean arg1) {
        field1685++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class22.method247((byte) -85, arg0 - 1L);
            class22.method247((byte) -85, 1L);
        } else {
            class22.method247((byte) -85, arg0);
        }
        if (!arg1) {
            method613(null, false);
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
    public static void method612(byte arg0) {
        field1687 = null;
        field1695 = null;
        if (arg0 != 72) {
            return;
        }
        field1694 = null;
        field1691 = null;
        field1686 = null;
        field1681 = null;
        field1690 = null;
        field1696 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method613(Component arg0, boolean arg1) {
        arg0.addMouseListener(class35.field1041);
        arg0.addMouseMotionListener(class35.field1041);
        if (!arg1) {
            method610(-35, false);
        }
        arg0.addFocusListener(class35.field1041);
        field1688++;
    }
}
