import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class162 implements class197 {

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Lmh;")
    private static class128 field2768 = class22.method156(122, "wave2:");

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lmh;")
    public static class128 field2769 = field2768;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lmh;")
    public static class128 field2771 = field2768;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lmh;")
    public static class128 field2772 = class22.method156(125, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lpa;")
    public static class2 field2775;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Ldj;")
    public static class314 field2765;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 10)
    public static void method1066(int arg0) {
        field2775 = null;
        field2765 = null;
        field2769 = null;
        if (arg0 < 4) {
            method1068(-74, 85);
        }
        field2768 = null;
        field2771 = null;
        field2772 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(JII[I)Lmh;", line = 33)
    public final class128 method1067(long arg0, int arg1, int arg2, int[] arg3) {
        field2774++;
        if (arg1 == 0) {
            class196 var7 = class176.method1211(50, arg3[0]);
            return var7.method1371((int) arg0, (byte) 73);
        } else if (arg1 == 1 || arg1 == 10) {
            class200 var6 = class180.method1226(false, (int) arg0);
            return var6.field3506;
        } else if (arg1 == 6 || arg1 == 7) {
            return class176.method1211(50, arg3[0]).method1371((int) arg0, (byte) 55);
        } else if (arg2 < 47) {
            return (class128) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z", line = 90)
    public static final boolean method1068(int arg0, int arg1) {
        field2773++;
        if (arg1 == 211742934) {
            return (arg0 >> 22 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
