import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class8 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public int field105 = 8;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public int field113 = 16777215;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static volatile int field110 = 0;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Z")
    public static boolean field112;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Z")
    public boolean field116;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "[[[I")
    public static int[][][] field114;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method44(int arg0) {
        if (arg0 >= 116) {
            field114 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLim;I)V")
    public final void method45(byte arg0, class170 arg1, int arg2) {
        field103++;
        while (true) {
            int var4 = arg1.method1218(-124);
            if (var4 == 0) {
                if (arg0 == 88) {
                    return;
                } else {
                    this.field104 = -3;
                    return;
                }
            }
            this.method48((byte) -42, arg1, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public static final void method46(int arg0, int arg1) {
        field115++;
        if (arg1 != -1) {
            method44(-1);
        }
        class84.field1301.method1514(arg0, (byte) -55);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIBI)V")
    public static final void method47(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 >= -71) {
            return;
        }
        field118++;
        if (arg0 >= arg4) {
            class16.method97(-7, class78.field1180[arg2], arg0, arg1, arg4);
        } else {
            class16.method97(-7, class78.field1180[arg2], arg4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLim;II)V")
    private final void method48(byte arg0, class170 arg1, int arg2, int arg3) {
        if (arg0 != -42) {
            return;
        }
        if (arg3 == 1) {
            this.field105 = arg1.method1186((byte) -79);
        } else if (arg3 == 2) {
            this.field116 = true;
        } else if (arg3 == 3) {
            this.field104 = arg1.method1193(-1);
            this.field107 = arg1.method1193(-1);
            this.field119 = arg1.method1193(-1);
        } else if (arg3 == 4) {
            this.field117 = arg1.method1218(arg0 ^ 0xFFFFFFB0);
        } else if (arg3 == 5) {
            this.field106 = arg1.method1186((byte) -55);
        } else if (arg3 == 6) {
            this.field113 = arg1.method1212(460736848);
        }
        field111++;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)I")
    public static final int method49(int arg0, int arg1) {
        field109++;
        if (arg1 > 0) {
            return 1;
        } else if (arg1 < 0) {
            return -1;
        } else {
            if (arg0 != 6) {
                method47(-118, 106, -73, (byte) 127, -120);
            }
            return 0;
        }
    }
}
