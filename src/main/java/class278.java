import java.util.zip.CRC32;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class278 {

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lma;")
    private static class5 field4719 = class12.method119("Drop", (byte) 84);

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Z")
    public static boolean field4720 = false;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lma;")
    public static class5 field4714 = field4719;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Lma;")
    private static class5 field4723 = class12.method119("Loading sprites )2 ", (byte) 60);

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Lma;")
    public static class5 field4724 = field4723;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4716 = new CRC32();

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Z")
    public static boolean field4726 = false;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Lma;")
    private static class5 field4727 = class12.method119(" more options", (byte) 119);

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Lma;")
    public static class5 field4728 = field4727;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Lod;")
    public static class197 field4721;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[[[I")
    public static int[][][] field4718;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[[[I")
    public static int[][][] field4722;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 25)
    public static void method1887(byte arg0) {
        field4722 = (int[][][]) null;
        field4714 = null;
        field4721 = null;
        field4728 = null;
        field4718 = (int[][][]) null;
        field4723 = null;
        int var1 = -64 % ((arg0 - 66) / 57);
        field4727 = null;
        field4716 = null;
        field4719 = null;
        field4724 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lkb;III)V", line = 46)
    public static final void method1888(class280 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class115.field1721) {
            class198 var4 = class43.field646[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3158 != null && var4.field3158.field809.method1059()) {
                arg0.method1026(var4.field3158.field809, 128, 0, 0, true);
            }
        }
        if (arg3 < class115.field1721) {
            class198 var5 = class43.field646[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3158 != null && var5.field3158.field809.method1059()) {
                arg0.method1026(var5.field3158.field809, 0, 0, 128, true);
            }
        }
        if (arg2 < class115.field1721 && arg3 < class179.field2708) {
            class198 var6 = class43.field646[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3158 != null && var6.field3158.field809.method1059()) {
                arg0.method1026(var6.field3158.field809, 128, 0, 128, true);
            }
        }
        if (arg2 < class115.field1721 && arg3 > 0) {
            class198 var7 = class43.field646[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3158 != null && var7.field3158.field809.method1059()) {
                arg0.method1026(var7.field3158.field809, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)I", line = 103)
    public static final int method1889(int arg0, boolean arg1) {
        field4725++;
        return arg1 ? -82 : arg0 >>> 7;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 114)
    public static final void method1890(int arg0) {
        class45.method319();
        field4717++;
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        if (class207.field3291 != null) {
            class302.method2049(class207.field3291, class267.field4597, 0);
        }
        class207.field3291 = null;
        class282.method1906(-36, 0);
        class69.method498(false);
        if (arg0 < 28) {
            field4722 = (int[][][]) ((int[][][]) null);
        }
    }
}
