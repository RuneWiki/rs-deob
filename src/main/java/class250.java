import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class250 {

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3982 = "Loading - please wait.";

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3979 = new CRC32();

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "[J")
    public static long[] field3984 = new long[256];

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lfd;")
    public static class130 field3985;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "[S")
    public static short[] field3986;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public int field3971;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[B")
    public byte[] field3973;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "[B")
    public byte[] field3978;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "[Lh;")
    public static class294[] field3987;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method1738(int arg0) {
        if (arg0 != 512) {
            method1738(-34);
        }
        field3986 = null;
        field3987 = null;
        field3979 = null;
        field3985 = null;
        field3984 = null;
        field3982 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static final void method1739(int arg0) {
        field3972++;
        class18.field254.method144(0);
        if (arg0 > -73) {
            field3979 = null;
        }
        class284.field4745.method144(0);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static final void method1740(byte arg0) {
        field3974++;
        if (class176.field2748 || class138.field2130 == 2) {
            return;
        }
        try {
            if (arg0 < 114) {
                method1738(-110);
            }
            class291.method2038("tbrefresh", 20042, class145.field2295);
        } catch (Throwable var1) {
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3984[var0] = var1;
        }
        field3985 = new class130(512);
        field3986 = new short[256];
    }
}
