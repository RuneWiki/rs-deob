import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class224 extends class3 {

    @OriginalMember(owner = "client!h", name = "N", descriptor = "Z")
    public volatile boolean field3590 = true;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "Lok;")
    public static class41 field3583 = class137.method956("mapscene", 45);

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Lok;")
    private static class41 field3588 = class137.method956("Walk here", 45);

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Lok;")
    public static class41 field3584 = field3588;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "Lok;")
    public static class41 field3593 = class137.method956("showVideoAd", 45);

    @OriginalMember(owner = "client!h", name = "O", descriptor = "Lok;")
    public static class41 field3591 = class137.method956(")2", 45);

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "Lmh;")
    public static class65 field3592;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Z")
    public boolean field3585;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "Z")
    public boolean field3587;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "[[[B")
    public static byte[][][] field3586;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Lid;", line = 5)
    public static final class107 method1614(int arg0, int arg1, int arg2) {
        class308 var3 = class205.field3312[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class107 var4 = var3.field5207;
            var3.field5207 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILmh;)Lka;", line = 20)
    public static final class279 method1615(int arg0, int arg1, int arg2, class65 arg3) {
        field3589++;
        if (class10.method40(arg1, true, arg2, arg3)) {
            if (arg0 != 8253) {
                field3592 = (class65) null;
            }
            return class306.method2113((byte) 84);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V", line = 34)
    public static void method1616(byte arg0) {
        field3592 = null;
        field3591 = null;
        field3588 = null;
        field3584 = null;
        field3586 = (byte[][][]) null;
        field3583 = null;
        field3593 = null;
        if (arg0 != -96) {
            field3593 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method1266(boolean arg0);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(B)I")
    public abstract int method1264(byte arg0);
}
