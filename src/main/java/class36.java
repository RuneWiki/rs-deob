import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class36 extends class178 {

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public int field727 = 0;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Loc;")
    public static class151 field728 = class137.method873(2, "Fertigkeit)2");

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public static int field739 = 0;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "Loc;")
    private static class151 field737 = class137.method873(2, "Type");

    @OriginalMember(owner = "client!db", name = "N", descriptor = "Loc;")
    public static class151 field730 = field737;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "Loc;")
    public static class151 field731 = class137.method873(2, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
    public static int field744 = 2;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "Loc;")
    private static class151 field743 = class137.method873(2, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Loc;")
    public static class151 field734 = field743;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field740 = new CRC32();

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
    public static volatile int field748 = 0;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "Loc;")
    public static class151 field747 = class137.method873(2, "lila:");

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "Loc;")
    public static class151 field749 = class137.method873(2, "(U2");

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "Loc;")
    public static class151 field752 = class137.method873(2, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "[I")
    public static int[] field753 = new int[128];

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "Lwh;")
    public static class236 field750 = new class236(4096);

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "Loc;")
    private static class151 field757 = class137.method873(2, "Please wait)3)3)3");

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "Loc;")
    public static class151 field756 = class137.method873(2, "event_opbase");

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "Loc;")
    public static class151 field754 = field757;

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
    public static int field758 = 0;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "Lnd;")
    public static class142 field738;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "Lnd;")
    public static class142 field755;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "Lsd;")
    public static class192 field729;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILwd;)Lwd;")
    public static final class232 method267(int arg0, class232 arg1) {
        if (arg0 < 1) {
            return null;
        }
        int var2 = class111.method672((byte) 48, class174.method1110(true, arg1));
        field732++;
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class175.method1115(-22192, arg1.field4156);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBLwa;)V")
    private final void method268(int arg0, byte arg1, class229 arg2) {
        if (arg0 == 5) {
            this.field727 = arg2.method1490((byte) 73);
        }
        int var4 = -110 % ((-arg1 - 34) / 36);
        field742++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILwa;)V")
    public final void method269(int arg0, class229 arg1) {
        field735++;
        if (arg0 != 0) {
            field755 = null;
        }
        while (true) {
            int var3 = arg1.method1475(arg0 + 255);
            if (var3 == 0) {
                return;
            }
            this.method268(var3, (byte) 66, arg1);
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
    public static void method270(byte arg0) {
        field757 = null;
        field730 = null;
        field737 = null;
        field755 = null;
        field753 = null;
        field750 = null;
        if (arg0 != 59) {
            return;
        }
        field743 = null;
        field729 = null;
        field728 = null;
        field752 = null;
        field756 = null;
        field738 = null;
        field731 = null;
        field749 = null;
        field740 = null;
        field754 = null;
        field734 = null;
        field747 = null;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static final void method271(int arg0) {
        if (class35.field715.toLowerCase().indexOf("microsoft") == -1) {
            class124.field2232[91] = 42;
            class124.field2232[92] = 74;
            class124.field2232[47] = 73;
            class124.field2232[45] = 26;
            class124.field2232[61] = 27;
            class124.field2232[46] = 72;
            class124.field2232[59] = 57;
            class124.field2232[44] = 71;
            class124.field2232[93] = 43;
            if (class35.field710 == null) {
                class124.field2232[222] = 59;
                class124.field2232[192] = 58;
            } else {
                class124.field2232[192] = 28;
                class124.field2232[520] = 59;
                class124.field2232[222] = 58;
            }
        } else {
            class124.field2232[186] = 57;
            class124.field2232[221] = 43;
            class124.field2232[191] = 73;
            class124.field2232[223] = 28;
            class124.field2232[187] = 27;
            class124.field2232[219] = 42;
            class124.field2232[189] = 26;
            class124.field2232[220] = 74;
            class124.field2232[222] = 59;
            class124.field2232[188] = 71;
            class124.field2232[192] = 58;
            class124.field2232[190] = 72;
        }
        if (arg0 == 57) {
            field741++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
    public static final byte[] method272(boolean arg0, byte arg1, Object arg2) {
        field733++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class42.method301(var3, arg1 + 112) : var3;
        } else {
            if (arg1 != 15) {
                method272(true, (byte) -64, null);
            }
            if (!(arg2 instanceof class75)) {
                throw new IllegalArgumentException();
            }
            class75 var4 = (class75) arg2;
            return var4.method398(109);
        }
    }
}
