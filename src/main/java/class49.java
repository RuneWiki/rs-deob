import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class49 extends class189 {

    @OriginalMember(owner = "client!fa", name = "lb", descriptor = "Lgg;")
    public static class63 field1191 = class116.method911(43, "null");

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "I")
    public static int field1188 = 0;

    @OriginalMember(owner = "client!fa", name = "pb", descriptor = "Lgg;")
    private static class63 field1195 = class116.method911(43, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!fa", name = "qb", descriptor = "Lgg;")
    public static class63 field1196 = field1195;

    @OriginalMember(owner = "client!fa", name = "ob", descriptor = "[[[B")
    public static byte[][][] field1194 = new byte[4][104][104];

    @OriginalMember(owner = "client!fa", name = "kb", descriptor = "Lgg;")
    private static class63 field1190 = class116.method911(43, "green:");

    @OriginalMember(owner = "client!fa", name = "tb", descriptor = "Lgg;")
    public static class63 field1199 = field1190;

    @OriginalMember(owner = "client!fa", name = "rb", descriptor = "Lgg;")
    public static class63 field1197 = field1190;

    @OriginalMember(owner = "client!fa", name = "mb", descriptor = "Lch;")
    public static class29 field1192 = new class29(30);

    @OriginalMember(owner = "client!fa", name = "vb", descriptor = "Lgg;")
    public static class63 field1201 = class116.method911(43, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!fa", name = "jb", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!fa", name = "sb", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!fa", name = "ub", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "Ljc;")
    public static class85 field1187;

    @OriginalMember(owner = "client!fa", name = "nb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1193;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        if (arg0 != 0) {
            method481(29);
        }
        ++field1198;
        int[] var3 = super.field3825.method681(arg1, (byte) -61);
        if (super.field3825.field1840) {
            class102.method850(var3, 0, class54.field1430, class21.field496[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class49() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/awt/Component;IZ)Lbg;")
    public static final class18 method479(int arg0, Component arg1, int arg2, boolean arg3) {
        if (!arg3) {
            method479(70, (Component) null, 37, true);
        }
        ++field1186;
        try {
            Class var4 = Class.forName("ue");
            class18 var5 = (class18) var4.newInstance();
            var5.method193(arg2, arg0, arg1, 118);
            return var5;
        } catch (Throwable var7) {
            class26 var6 = new class26();
            var6.method193(arg2, arg0, arg1, 104);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)Lah;")
    public static final class9 method480(int arg0, int arg1) {
        class9 var2 = (class9) class100.field2351.method289((long) arg1, -130079263);
        ++field1189;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class135.field2924.method745(12, arg1, 0);
            class9 var4 = new class9();
            if (var3 != null) {
                var4.method122(51, new class3(var3));
            }
            var4.method126((byte) -42);
            if (arg0 != 1000) {
                field1190 = null;
            }
            class100.field2351.method293(false, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
    public static void method481(int arg0) {
        if (arg0 != 104) {
            field1193 = null;
        }
        field1192 = null;
        field1190 = null;
        field1195 = null;
        field1191 = null;
        field1197 = null;
        field1187 = null;
        field1194 = null;
        field1201 = null;
        field1199 = null;
        field1196 = null;
        field1193 = null;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(II)Lgg;")
    public static final class63 method482(int arg0, int arg1) {
        ++field1200;
        if (arg1 < 100000) {
            return class89.method772((byte) 86, new class63[] { class158.field3276, class175.method1162((byte) -126, arg1), class183.field3706 });
        } else {
            if (arg0 != 1000000) {
                method481(-101);
            }
            return arg1 < 10000000 ? class89.method772((byte) 56, new class63[] { class155.field3251, class175.method1162((byte) -126, arg1 / 1000), class129.field2819, class183.field3706 }) : class89.method772((byte) 120, new class63[] { class183.field3717, class175.method1162((byte) -126, arg1 / 1000000), class142.field3042, class183.field3706 });
        }
    }
}
