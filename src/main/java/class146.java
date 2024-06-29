import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class146 {

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public int field2315 = 1190717;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public int field2313 = 16;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
    public boolean field2311 = false;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Z")
    public boolean field2317 = true;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public int field2320 = 8;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Z")
    public boolean field2321 = true;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public int field2316 = 128;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public int field2323 = -1;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public int field2325 = -1;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public int field2328 = 0;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "[Z")
    public static boolean[] field2322 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2314 = "Connecting to update server";

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "[I")
    public static int[] field2324 = new int[8];

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
    public static boolean field2312 = false;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILlf;II)V", line = 29)
    private final void method1076(int arg0, class143 arg1, int arg2, int arg3) {
        field2327++;
        if (arg0 != 25445) {
            field2314 = (String) null;
        }
        if (arg3 == 1) {
            this.field2328 = class23.method178(arg1.method1017((byte) 101), (byte) -117);
        } else if (arg3 == 2) {
            this.field2323 = arg1.method1043(true);
        } else if (arg3 == 3) {
            this.field2323 = arg1.method1051(1);
            if (this.field2323 == 65535) {
                this.field2323 = -1;
            }
        } else if (arg3 == 5) {
            this.field2317 = false;
        } else if (arg3 == 7) {
            this.field2325 = class23.method178(arg1.method1017((byte) 101), (byte) -106);
        } else if (arg3 == 8) {
            class182.field2741 = arg2;
        } else if (arg3 == 9) {
            this.field2316 = arg1.method1051(arg0 ^ 0x6364);
        } else if (arg3 == 10) {
            this.field2321 = false;
        } else if (arg3 == 11) {
            this.field2320 = arg1.method1043(true);
        } else if (arg3 == 12) {
            this.field2311 = true;
        } else if (arg3 == 13) {
            this.field2315 = arg1.method1017((byte) 101);
        } else if (arg3 == 14) {
            this.field2313 = arg1.method1043(true);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 121)
    public static void method1077(byte arg0) {
        field2324 = null;
        if (arg0 == 49) {
            field2322 = null;
            field2314 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Llf;IB)V", line = 138)
    public final void method1078(class143 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method1043(true);
            if (var4 == 0) {
                field2326++;
                int var5 = 74 % ((arg2 - 60) / 47);
                return;
            }
            this.method1076(25445, arg0, arg1, var4);
        }
    }
}
