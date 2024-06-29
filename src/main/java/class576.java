import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class576 {

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "B")
    private byte field8441;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public int field8436;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public int field8435;

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
    public int field8445;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public int field8434;

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "I")
    public int field8444;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "[F")
    public static float[] field8440 = new float[4];

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field8439;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)I", line = 8)
    public final int method3336(byte arg0) {
        if (arg0 == -69) {
            field8438++;
            return this.field8441 & 0x7;
        } else {
            return -94;
        }
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(B)V", line = 20)
    public static void method3337(byte arg0) {
        if (arg0 != 37) {
            method3339(18);
        }
        field8440 = null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V", line = 38)
    public static final void method3338(int arg0) {
        if (arg0 != 1) {
            method3337((byte) -111);
        }
        class117 var1 = class691.field9789;
        synchronized (class691.field9789) {
            class691.field9789.method936(-45);
        }
        field8439++;
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V", line = 53)
    public static final void method3339(int arg0) {
        if (arg0 != 2) {
            field8442 = -116;
        }
        field8443++;
        class634 var1 = (class634) class31.field459.method3905(-111);
        boolean var2 = class512.field7616 != null || class221.field3307 > 0;
        if (var2) {
            class564.field8256 = 1;
        }
        if (class577.field8449 && class236.field3494.method668(arg0 ^ 0xFFFFFFA0, 81) && class400.field5784 > 2) {
            if (var2) {
                class225.field3367 = (class673) class150.field2533.field9799.field6258.field6258;
            } else {
                class583.method3372(false, var1.method333(25632), var1.method334(true), (class673) class150.field2533.field9799.field6258.field6258);
            }
        } else if (var2) {
            class225.field3367 = (class673) class150.field2533.field9799.field6258;
        } else {
            class583.method3372(false, var1.method333(25632), var1.method334(true), (class673) class150.field2533.field9799.field6258);
        }
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "(B)I", line = 88)
    public final int method3340(byte arg0) {
        field8437++;
        if (arg0 > -100) {
            return 63;
        } else if ((this.field8441 & 0x8) == 8) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "()V", line = 102)
    public class576() {
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lek;)V", line = 104)
    public class576(class465 arg0) {
        this.field8441 = arg0.method2712(-60);
        this.field8436 = arg0.method2755((byte) -62);
        this.field8435 = arg0.method2691((byte) -67);
        this.field8445 = arg0.method2691((byte) -67);
        this.field8434 = arg0.method2691((byte) -67);
        this.field8444 = arg0.method2691((byte) -67);
    }
}
