import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class82 extends class160 {

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1238 = -1;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lac;")
    public static class139 field1239;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "[[B")
    public static byte[][] field1243;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "[[[B")
    public static byte[][][] field1242;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method640(int arg0) {
        field1243 = null;
        field1239 = null;
        field1242 = null;
        if (arg0 != -8) {
            field1243 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)Lnl;")
    public static final class98 method641(boolean arg0) {
        field1237++;
        if (class261.field4126.length > class226.field3622) {
            return class261.field4126[class226.field3622++];
        } else if (arg0) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)Lmk;")
    public static final class106 method642(int arg0, int arg1, int arg2) {
        class22 var3 = class149.field2210[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class106 var4 = var3.field377;
            var3.field377 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BIIII)V")
    public static final void method643(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1241++;
        if (arg0 <= 76) {
            field1243 = null;
        }
        if (class259.field4106 == 1) {
            class162.field2433[class274.field4368 / 100].method425(class207.field3206 - 8, class26.field447 + -8);
        }
        if (class259.field4106 == 2) {
            class162.field2433[class274.field4368 / 100 + 4].method425(class207.field3206 - 8, class26.field447 + -8);
        }
        class294.method1949(-6783);
    }
}
