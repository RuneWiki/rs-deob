import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class159 extends class34 {

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "I")
    private int field2418;

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "[I")
    public static int[] field2416 = new int[1024];

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "F")
    public static float field2420;

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "Lc;")
    public static class512 field2419;

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "[Z")
    public static boolean[] field2417;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V")
    public static void method1131(int arg0) {
        field2419 = null;
        field2417 = null;
        field2416 = null;
        if (arg0 < 16) {
            method1132(false, -69, -121);
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
    public class159(int arg0) {
        super(0, true);
        this.field2418 = 4096;
        this.field2418 = arg0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2418 = (arg0.method1869(-118) << 12) / 255;
        }
        ++field2422;
        if (arg1 < 16) {
            field2417 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field2415;
        int[] var3 = super.field537.method1780(arg0, (byte) 87);
        int var4 = -73 % (-arg1 / 50);
        if (super.field537.field4191) {
            class57.method370(var3, 0, class383.field5502, this.field2418);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(ZII)Z")
    public static final boolean method1132(boolean arg0, int arg1, int arg2) {
        ++field2423;
        if (!arg0) {
            method1132(true, -15, 45);
        }
        return ~(arg1 & 2048) != -1;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
    public class159() {
        this(4096);
    }
}
