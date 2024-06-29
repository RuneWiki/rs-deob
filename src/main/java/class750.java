import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class750 {

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
    public int field10400;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "[I")
    public static int[] field10395 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
    public static int field10393 = -1;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    public static int field10397 = 0;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "J")
    public static long field10399 = -1L;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public static int field10394;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
    public static int field10396;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "I")
    public static int field10401;

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "I")
    public static int field10402;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "Ljt;")
    public static class107 field10398;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)[Lfha;", line = 3)
    public static final class382[] method4178(int arg0) {
        field10402++;
        if (arg0 != -1) {
            method4178(66);
        }
        return new class382[] { class348.field4628, class180.field2212, class541.field7357, class617.field8660, class589.field8226, class494.field6733, class26.field196, class614.field8606, class262.field3428, class363.field4805, class103.field1384, class295.field3976, class571.field8045, class583.field8164, class516.field6965 };
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)V", line = 22)
    public static final void method4179(int arg0, int arg1) {
        if (arg0 != -4365) {
            method4179(88, -16);
        }
        class239.field3133 = -1;
        field10394++;
        class450.field6297 = arg1;
        class239.field3133 = -1;
        class582.method3255(arg0 + 4364);
    }

    @OriginalMember(owner = "client!hda", name = "toString", descriptor = "()Ljava/lang/String;", line = 36)
    public final String toString() {
        field10396++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V", line = 54)
    public static final void method4180(byte arg0) {
        field10401++;
        if (arg0 != -46) {
            field10398 = null;
        }
        class11.field63 = true;
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)V", line = 70)
    public static void method4181(byte arg0) {
        field10395 = null;
        if (arg0 > 106) {
            field10398 = null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(II)V", line = 82)
    public class750(int arg0, int arg1) {
        this.field10400 = arg1;
    }
}
