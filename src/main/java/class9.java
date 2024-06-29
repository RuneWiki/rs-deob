import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 extends class145 {

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "[Ltd;")
    public static class136[] field150 = new class136[1000];

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "Ltd;")
    public static class136 field156 = class145.method1172("M", 45);

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "Ltd;")
    public static class136 field161 = class145.method1172("Sprites geladen)3", 45);

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "I")
    public static int field163 = 0;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "Lsb;")
    public static class127 field152 = new class127(new byte[5000]);

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "Lue;")
    public static class143 field165 = new class143(128);

    @OriginalMember(owner = "client!ba", name = "lb", descriptor = "Ltd;")
    private static class136 field166 = class145.method1172("Members object", 45);

    @OriginalMember(owner = "client!ba", name = "mb", descriptor = "Ltd;")
    public static class136 field167 = field166;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ba", name = "nb", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "Ltd;")
    public class136 field162;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "[I")
    public int[] field149;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "[I")
    public int[] field158;

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "[Ltd;")
    public class136[] field157;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)V")
    public static final void method42(int arg0, long arg1) {
        field164++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == (long) arg0) {
            class77.method555(arg1 - 1L, true);
            class77.method555(1L, true);
        } else {
            class77.method555(arg1, true);
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    public static void method43(int arg0) {
        field167 = null;
        field150 = null;
        field161 = null;
        field152 = null;
        field165 = null;
        field166 = null;
        field156 = null;
        if (arg0 != 10) {
            method43(108);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILmd;)V")
    public static final void method44(int arg0, class87 arg1) {
        field153++;
        if (arg0 != 14104) {
            method42(56, 71L);
        }
        class78.field1797 = arg1;
    }
}
