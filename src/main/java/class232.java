import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class232 extends Exception {

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "Z")
    public static boolean field3066 = false;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "[I")
    public static int[] field3068 = new int[2];

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "Ldc;")
    public static class302 field3072 = new class302();

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "Lvg;")
    public static class622 field3073 = new class622(111, -1);

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    public static int field3075 = 2;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "Liba;")
    public static class211 field3074 = new class211(64, 3);

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 19)
    public static final void method1437(int arg0) {
        if (arg0 > -7) {
            return;
        }
        field3069++;
        class639.field9177.method1355((byte) 114);
        for (int var1 = 0; var1 < 32; var1++) {
            class249.field3278[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class209.field2840[var2] = 0L;
        }
        class216.field2891 = 0;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V", line = 51)
    public static void method1438(byte arg0) {
        field3073 = null;
        field3068 = null;
        field3072 = null;
        field3074 = null;
        if (arg0 != 40) {
            field3066 = true;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IBI)Z", line = 67)
    public static final boolean method1439(int arg0, byte arg1, int arg2) {
        if (arg1 > -96) {
            method1437(7);
        }
        field3071++;
        return (arg2 & 0x580) != 0;
    }
}
