import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lod;")
    private static class101 field861 = class46.method335(-84, " from your friend list first");

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lod;")
    public static class101 field864 = class46.method335(-76, "Texturen geladen)3");

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lod;")
    public static class101 field870 = class46.method335(101, "<)4col> x");

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lod;")
    public static class101 field863 = field861;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lsa;")
    public static class126 field872 = null;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "[I")
    public static int[] field878 = new int[128];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field859 = 99;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Lod;")
    private static class101 field881 = class46.method335(-120, "Please enter your username)3");

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lod;")
    public static class101 field860 = class46.method335(-121, "<col=c0ff00>");

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lod;")
    public static class101 field871 = field881;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lod;")
    public static class101 field866 = class46.method335(68, "sl_arrows");

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "Lod;")
    public static class101 field873 = class46.method335(-85, "title_mute");

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "Lod;")
    public static class101 field883 = class46.method335(-104, "null");

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Lod;")
    public class101 field877;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lme;")
    public static class88 field867;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Z")
    public boolean field875;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "[I")
    public static int[] field868;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZLjava/lang/Object;)[B")
    public static final byte[] method255(byte arg0, boolean arg1, Object arg2) {
        if (arg0 != 83) {
            method257(11);
        }
        field874++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class57.method403(-108, var3) : var3;
        } else if (arg2 instanceof class154) {
            class154 var4 = (class154) arg2;
            return var4.method395(-21);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static final void method256(int arg0) {
        class153 var1 = class8.field122;
        synchronized (class8.field122) {
            class27.field724 = class65.field1481;
            class40.field947 = class147.field3370;
            class105.field2264 = class83.field1816;
            class119.field2629 = class94.field2029;
            class147.field3369 = class96.field2096;
            class80.field1684 = class43.field1037;
            class118.field2615 = class25.field630;
            class94.field2029 = arg0;
        }
        field882++;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static void method257(int arg0) {
        field878 = null;
        field873 = null;
        field863 = null;
        field860 = null;
        field883 = null;
        if (arg0 != 128) {
            method257(46);
        }
        field872 = null;
        field871 = null;
        field870 = null;
        field881 = null;
        field868 = null;
        field861 = null;
        field866 = null;
        field867 = null;
        field864 = null;
    }
}
