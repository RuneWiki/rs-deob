import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 extends class121 {

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "Lsf;")
    public static class131 field715 = new class131(50);

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "Lhe;")
    private static class54 field718 = class6.method58("scroll:", false);

    @OriginalMember(owner = "client!de", name = "mb", descriptor = "I")
    public static int field725 = 1;

    @OriginalMember(owner = "client!de", name = "nb", descriptor = "[S")
    public static short[] field726 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!de", name = "jb", descriptor = "Lhe;")
    public static class54 field722 = class6.method58("jolt", false);

    @OriginalMember(owner = "client!de", name = "ob", descriptor = "Lhe;")
    public static class54 field727 = field718;

    @OriginalMember(owner = "client!de", name = "rb", descriptor = "Lhe;")
    private static class54 field730 = class6.method58("purple:", false);

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "Lhe;")
    public static class54 field719 = field718;

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "Lhe;")
    public static class54 field721 = field730;

    @OriginalMember(owner = "client!de", name = "db", descriptor = "Z")
    public static volatile boolean field716 = true;

    @OriginalMember(owner = "client!de", name = "sb", descriptor = "Lhe;")
    public static class54 field731 = class6.method58(")3", false);

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "Lhe;")
    public static class54 field720 = field730;

    @OriginalMember(owner = "client!de", name = "ub", descriptor = "Lhe;")
    public static class54 field733 = class6.method58("weiss:", false);

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!de", name = "kb", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!de", name = "qb", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!de", name = "tb", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "client!de", name = "lb", descriptor = "Z")
    public static boolean field724;

    @OriginalMember(owner = "client!de", name = "pb", descriptor = "[[[B")
    public static byte[][][] field728;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILm;I)V")
    private final void method205(int arg0, class83 arg1, int arg2) {
        field723++;
        if (~arg0 == arg2) {
            this.field729 = arg1.method631((byte) -113);
            this.field732 = arg1.method638(arg2 + 2);
            this.field713 = arg1.method638(0);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lef;ILef;II)Lod;")
    public static final class101 method206(class35 arg0, int arg1, class35 arg2, int arg3, int arg4) {
        field717++;
        if (class107.method814(-30384, arg4, arg3, arg2)) {
            if (arg1 != 4550) {
                method208(null, -77, 57, 47, -70, (byte) 57, null);
            }
            return class144.method1110(-21408, arg0.method266(arg3, (byte) 126, arg4));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILm;)V")
    public final void method207(int arg0, class83 arg1) {
        while (true) {
            int var3 = arg1.method638(0);
            if (var3 == 0) {
                field712++;
                if (arg0 != -1) {
                    method206(null, 101, null, -10, 98);
                    return;
                }
                return;
            }
            this.method205(var3, arg1, -2);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lhe;IIIIBLhe;)V")
    public static final void method208(class54 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class54 arg6) {
        field710++;
        if (class133.field3007) {
            return;
        }
        if (class67.field1641 < 500) {
            class67.field1618[class67.field1641] = arg6;
            class34.field842[class67.field1641] = arg0;
            class157.field3574[class67.field1641] = arg3;
            class7.field214[class67.field1641] = arg4;
            class80.field1976[class67.field1641] = arg2;
            class77.field1880[class67.field1641] = arg1;
            class67.field1641++;
        }
        if (arg5 <= 16) {
            field716 = true;
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public static void method209(int arg0) {
        field715 = null;
        field720 = null;
        field726 = null;
        field730 = null;
        field727 = null;
        field721 = null;
        field728 = null;
        field719 = null;
        field731 = null;
        field718 = null;
        field722 = null;
        if (arg0 > -117) {
            method208(null, -107, -22, -53, -121, (byte) -80, null);
        }
        field733 = null;
    }
}
