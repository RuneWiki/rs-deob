import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class511 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lbu;")
    public static class21 field7229 = new class21(119, 10);

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    public static int[] field7231 = new int[4096];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    public static int[] field7230;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V", line = 6)
    public static final void method3089(int arg0, int arg1) {
        if (arg1 != 4096) {
            field7231 = null;
        }
        if (class90.field1011 == 0) {
            class686.field9533.method2776((byte) -104, arg0);
        } else {
            class14.field279 = arg0;
        }
        field7226++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lvea;B)I", line = 23)
    public static final int method3090(class288 arg0, byte arg1) {
        if (arg1 != -39) {
            field7230 = null;
        }
        field7227++;
        if (class306.field4412 == arg0) {
            return 6407;
        } else if (class691.field9659 == arg0) {
            return 6408;
        } else if (class88.field993 == arg0) {
            return 6406;
        } else if (class154.field2178 == arg0) {
            return 6409;
        } else if (class315.field4480 == arg0) {
            return 6410;
        } else if (class653.field9125 == arg0) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 60)
    public static void method3091(int arg0) {
        field7230 = null;
        if (arg0 != 10) {
            method3090(null, (byte) -66);
        }
        field7229 = null;
        field7231 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)V", line = 73)
    public static final void method3092(int arg0, boolean arg1) {
        class138.field2063 = -1;
        class67.field823 = -1;
        field7228++;
        class671.field9338 = arg0;
        if (arg1) {
            method3091(33);
        }
        class665.method3789(-127);
    }
}
