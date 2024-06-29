import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class138 extends class24 {

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field2124 = 0;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "Lj;")
    public static class153 field2125 = new class153(8);

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public static int field2134 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    public static int field2133 = 0;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field2132 = 0;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2135 = new CRC32();

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Lfh;")
    public class110 field2129;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Lfj;")
    public class283 field2127;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "[B")
    public byte[] field2128;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BII)V", line = 11)
    public static final void method952(byte arg0, int arg1, int arg2) {
        if (arg0 != 49) {
            field2124 = -81;
        }
        field2131++;
        int var3 = arg1--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class263.field4456[arg1];
        int var5 = class240.field3899[arg1];
        if (arg2 == 0) {
            class249.field4262.method726(219, 2138389379);
            class249.field4262.method1095(var3 + var3 + 3, -34);
            class130.field2025++;
        }
        if (arg2 == 1) {
            class249.field4262.method726(34, 2138389379);
            class249.field4262.method1095(var3 + var3 + 3 + 14, -47);
            class289.field4876++;
        }
        if (arg2 == 2) {
            class189.field2993++;
            class249.field4262.method726(100, 2138389379);
            class249.field4262.method1095(var3 + var3 + 3, -34);
        }
        class215.field3509 = class263.field4456[0];
        class151.field2348 = class240.field3899[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class249.field4262.method1068(arg0 + 40, class240.field3899[arg1] - var5);
            class249.field4262.method1095(class263.field4456[arg1] - var4, -49);
        }
        class249.field4262.method1050(class276.field4641 + var4, -29944);
        class249.field4262.method1092(128, class182.field2916 + var5);
        class249.field4262.method1068(arg0 - 2, class190.field3071[82] ? 1 : 0);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V", line = 80)
    public static void method953(byte arg0) {
        field2135 = null;
        int var1 = 57 % ((arg0 + 6) / 61);
        field2125 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Luf;", line = 96)
    public static final class168 method954(int arg0, int arg1) {
        field2123++;
        if (arg1 < 100000) {
            return class134.method938((byte) -123, new class168[] { class22.field262, class169.method1228(arg1, 0), class241.field3913 });
        } else if (arg0 == 33) {
            return arg1 < 10000000 ? class134.method938((byte) -124, new class168[] { class190.field3068, class169.method1228(arg1 / 1000, 0), class154.field2432, class241.field3913 }) : class134.method938((byte) -123, new class168[] { class209.field3460, class169.method1228(arg1 / 1000000, 0), class121.field1885, class241.field3913 });
        } else {
            return (class168) null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)Z", line = 127)
    public static final boolean method955(int arg0, int arg1) {
        field2130++;
        if (arg1 <= 52) {
            method955(100, -35);
        }
        return (-arg0 & arg0) == arg0;
    }
}
