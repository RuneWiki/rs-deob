import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class5 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Loh;")
    private static class258 field65 = class153.method1046("Members object", 124);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field64 = 0;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Loh;")
    public static class258 field68 = class153.method1046(" <col=00ff80>", 101);

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Loh;")
    public static class258 field75 = field65;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "F")
    public static float field74;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field67;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "[I")
    public static int[] field66;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 44)
    public static final void method28(int arg0) {
        int var1 = class31.method229((byte) 0);
        if (var1 == 0) {
            class8.field101 = (byte[][][]) null;
            class19.method123((byte) 22, 0);
        } else if (var1 == 1) {
            class238.method1635((byte) 0, 0);
            class19.method123((byte) 100, 512);
            class128.method926(11);
        } else {
            class238.method1635((byte) (class61.field1035 - 4 & 0xFF), 0);
            class19.method123((byte) 81, 2);
        }
        if (arg0 != 26286) {
            field68 = (class258) null;
        }
        field71++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)V", line = 94)
    public static final void method29(int arg0, boolean arg1) {
        if (arg1) {
            method30(-113, (class258) null, (class258) null, (byte) -44, (class258) null);
        }
        class286 var2 = class48.method389(arg0, 7, 10738);
        var2.method2010((byte) -38);
        field73++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILoh;Loh;BLoh;)V", line = 114)
    public static final void method30(int arg0, class258 arg1, class258 arg2, byte arg3, class258 arg4) {
        if (arg3 != 14) {
            method30(-118, (class258) null, (class258) null, (byte) 72, (class258) null);
        }
        field72++;
        class122.method893(arg4, arg2, arg0, arg1, arg3 - 1573, -1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 130)
    public static void method31(byte arg0) {
        field68 = null;
        if (arg0 == 0) {
            field75 = null;
            field65 = null;
            field66 = null;
            field67 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lgb;I)V", line = 159)
    public static final void method32(class213 arg0, int arg1) {
        field70++;
        class80.field1371 = arg0;
        if (arg1 != 2423) {
            method29(-60, false);
        }
    }
}
