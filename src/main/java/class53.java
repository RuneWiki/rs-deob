import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class53 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Leh;")
    public static class47 field1026 = class195.method1282((byte) -4, "::errortest");

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lpa;")
    public static class136 field1031 = new class136(30);

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Leh;")
    public static class47 field1037 = class195.method1282((byte) -4, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field1034 = 0;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field1032 = 0;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Leh;")
    public static class47 field1035 = class195.method1282((byte) -4, "mapmarker");

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "Leh;")
    public static class47 field1039 = class195.method1282((byte) -4, " <col=ffff00>");

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "Leh;")
    public static class47 field1038 = class195.method1282((byte) -4, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field1033 = 0;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method467(int arg0) {
        field1038 = null;
        field1026 = null;
        field1031 = null;
        field1039 = null;
        field1035 = null;
        field1037 = null;
        if (arg0 != 23221) {
            method469(-112, 105, (byte) -35, 122);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lah;I)V")
    public static final void method468(class9 arg0, int arg1) {
        field1028++;
        if (arg1 < 34) {
            field1039 = null;
        }
        class103.field2164 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBI)I")
    public static final int method469(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= -58) {
            field1034 = 23;
        }
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        field1030++;
        return (arg1 >> 2 << 10) - (-(arg0 >> 5 << 7) - (arg3 >> 1));
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public abstract void method85(int arg0);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)I")
    public static final int method470(int arg0, int arg1, int arg2) {
        field1029++;
        if (arg1 != -1) {
            return -63;
        }
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)J")
    public static final long method471(int arg0, int arg1, int arg2) {
        class152 var3 = class173.field3351[arg0][arg1][arg2];
        return var3 == null || var3.field2990 == null ? 0L : var3.field2990.field2370;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(III)I")
    public abstract int method86(int arg0, int arg1, int arg2);
}
