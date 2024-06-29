import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class37 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Lae;")
    public static class6 field836 = class64.method474(111, "titlebox");

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Lae;")
    private static class6 field846 = class64.method474(114, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static volatile int field847 = 0;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lae;")
    public static class6 field838 = field846;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lae;")
    public static class6 field844 = field846;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "[[B")
    public static byte[][] field843 = new byte[250][];

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field834 = new CRC32();

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field850 = 0;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lae;")
    private static class6 field849 = class64.method474(105, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Lae;")
    public static class6 field848 = field849;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lp;")
    public static class95 field851 = new class95();

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field853 = -1;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Lae;")
    private static class6 field855 = class64.method474(120, "Ok");

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Lae;")
    public static class6 field854 = field855;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lsd;")
    public static class114 field852;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "[I")
    public static int[] field837;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 18)
    public static final void method325(byte arg0) {
        field835++;
        if (class82.field2017 && class92.field2180 != class15.field305) {
            class34.method308(class15.field305, class130.field3167, (byte) -96, class12.field229.field1796[0], class12.field229.field1726[0], class75.field1688);
            return;
        }
        if (class87.field2095 != class15.field305) {
            class87.field2095 = class15.field305;
            class95.method787((byte) -112, class15.field305);
        }
        int var1 = -29 / ((arg0 - 14) / 44);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 46)
    public static void method326(int arg0) {
        field846 = null;
        field849 = null;
        field852 = null;
        field834 = null;
        field836 = null;
        field851 = null;
        field848 = null;
        field855 = null;
        field854 = null;
        if (arg0 != -1) {
            field847 = 118;
        }
        field844 = null;
        field837 = null;
        field843 = null;
        field838 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBILbf;)[Lq;", line = 76)
    public static final class101[] method327(int arg0, byte arg1, int arg2, class14 arg3) {
        field842++;
        if (arg1 == -49) {
            return client.method197(arg2, arg0, (byte) 29, arg3) ? class121.method990(5563) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)I", line = 126)
    public static final int method328(byte arg0) {
        int var1 = class20.method193(class68.field1513, 9990, class15.field305, class103.field2439);
        if (arg0 != 108) {
            method328((byte) -105);
        }
        field839++;
        return var1 - class96.field2291 >= 800 || (class108.field2582[class15.field305][class103.field2439 >> 7][class68.field1513 >> 7] & 0x4) == 0 ? 3 : class15.field305;
    }
}
