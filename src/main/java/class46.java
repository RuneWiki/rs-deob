import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class46 extends class142 {

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "Lai;")
    public static class10 field760 = class44.method278("mapmarker", 92);

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    public static int field757 = 0;

    @OriginalMember(owner = "client!eg", name = "hb", descriptor = "Lai;")
    public static class10 field765 = class44.method278("Untersuchen", -7);

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "Lai;")
    private static class10 field759 = class44.method278("Try again in 60 secs)3)3)3", -95);

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "Lai;")
    private static class10 field751 = class44.method278("Password: ", 105);

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "Lai;")
    public static class10 field748 = field751;

    @OriginalMember(owner = "client!eg", name = "jb", descriptor = "Lai;")
    public static class10 field767 = class44.method278("gelb:", 99);

    @OriginalMember(owner = "client!eg", name = "lb", descriptor = "Lai;")
    private static class10 field769 = class44.method278("Prepared visibility map", 118);

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "Lai;")
    public static class10 field764 = field769;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "Lai;")
    public static class10 field753 = field759;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "Ldd;")
    public static class34 field756 = new class34(64);

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    private int field749;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!eg", name = "ib", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!eg", name = "kb", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "[I")
    public static int[] field763;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "[Lwa;")
    public static class200[] field754;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "[[[B")
    public static byte[][][] field755;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        ++field768;
        if (arg1) {
            this.method78((class114) null, 29, (byte) 16);
        }
        int[][] var3 = super.field2666.method956(arg0, -92);
        if (super.field2666.field2664) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class133.field2499 > var7; ++var7) {
                var4[var7] = this.field761;
                var5[var7] = this.field749;
                var6[var7] = this.field752;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)V")
    private final void method284(int arg0, byte arg1) {
        int var3 = 69 % ((-39 - arg1) / 47);
        this.field749 = 4080 & arg0 >> 4;
        this.field752 = (arg0 & 255) << 4;
        ++field750;
        this.field761 = arg0 >> 12 & 4080;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg2 < -34) {
            if (~arg1 == -1) {
                this.method284(arg0.method771(122), (byte) 95);
            }
            ++field762;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V")
    private class46(int arg0) {
        super(0, false);
        this.method284(arg0, (byte) -86);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class46() {
        this(0);
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(Z)V")
    public static final void method285(boolean arg0) {
        ++field766;
        if (class126.field2406 && ~class42.field687 != ~class104.field1956) {
            class30.method199(class145.field2767.field1106[0], true, class145.field2767.field1099[0], class42.field687, class117.field2265, class159.field3054);
        } else {
            if (class42.field687 != class13.field220) {
                class13.field220 = class42.field687;
                class114.method782(class42.field687, -5577);
            }
            if (arg0) {
                method285(false);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
    public static void method286(int arg0) {
        field753 = null;
        field765 = null;
        field767 = null;
        field748 = null;
        field763 = null;
        field764 = null;
        field756 = null;
        field755 = null;
        field754 = null;
        field769 = null;
        field751 = null;
        field760 = null;
        field759 = null;
        if (arg0 != -334031132) {
            field769 = null;
        }
    }
}
