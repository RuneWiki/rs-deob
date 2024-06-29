import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class107 {

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "[[[Lli;")
    public static class277[][][] field2020 = new class277[4][104][104];

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field2027 = 0;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Lli;")
    public static class277 field2023 = new class277();

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Z")
    public static boolean field2028 = true;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "Loh;")
    public static class263 field2030 = class253.method1681(-123, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Loh;")
    public static class263 field2029 = class253.method1681(-120, "floorshadows");

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Lpj;")
    public static class238 field2031;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Lrc;")
    public static class65 field2026;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static final void method716(byte arg0) {
        field2024++;
        if (class11.field254 == 0) {
            return;
        }
        try {
            if ((++class14.field359) > 1500) {
                if (class166.field3023 != null) {
                    class166.field3023.method809((byte) 109);
                    class166.field3023 = null;
                }
                if (class89.field1769 >= 1) {
                    class96.field1873 = -5;
                    class11.field254 = 0;
                    return;
                }
                if (class48.field1032 == class245.field4322) {
                    class48.field1032 = class116.field2164;
                } else {
                    class48.field1032 = class245.field4322;
                }
                class14.field359 = 0;
                class11.field254 = 1;
                class89.field1769++;
            }
            if (class11.field254 == 1) {
                class111.field2098 = class95.field1867.method1736(-69, class48.field1032, class48.field1048);
                class11.field254 = 2;
            }
            if (arg0 != -58) {
                method717((class86) null, false);
            }
            if (class11.field254 == 2) {
                if (class111.field2098.field4114 == 2) {
                    throw new IOException();
                }
                if (class111.field2098.field4114 != 1) {
                    return;
                }
                class166.field3023 = new class125((Socket) class111.field2098.field4117, class95.field1867);
                class111.field2098 = null;
                class166.field3023.method806(0, class154.field2792.field3497, class154.field2792.field3469, -120);
                if (class30.field745 != null) {
                    class30.field745.method1575(arg0 + 58);
                }
                if (class93.field1843 != null) {
                    class93.field1843.method1575(0);
                }
                int var1 = class166.field3023.method800((byte) -126);
                if (class30.field745 != null) {
                    class30.field745.method1575(0);
                }
                if (class93.field1843 != null) {
                    class93.field1843.method1575(0);
                }
                if (var1 != 101) {
                    class11.field254 = 0;
                    class96.field1873 = var1;
                    class166.field3023.method809((byte) 126);
                    class166.field3023 = null;
                    return;
                }
                class11.field254 = 3;
            }
            if (class11.field254 == 3 && class166.field3023.method803(-127) >= 2) {
                int var2 = class166.field3023.method800((byte) -126) << 8 | class166.field3023.method800((byte) -126);
                class200.method1390((byte) 37, var2);
                if (class7.field127 == -1) {
                    class96.field1873 = 6;
                    class11.field254 = 0;
                    class166.field3023.method809((byte) 123);
                    class166.field3023 = null;
                } else {
                    class11.field254 = 0;
                    class166.field3023.method809((byte) 71);
                    class166.field3023 = null;
                    class261.method1720(arg0 ^ 0x39);
                }
            }
        } catch (IOException var3) {
            if (class166.field3023 != null) {
                class166.field3023.method809((byte) 119);
                class166.field3023 = null;
            }
            if (class89.field1769 >= 1) {
                class96.field1873 = -4;
                class11.field254 = 0;
            } else {
                if (class48.field1032 == class245.field4322) {
                    class48.field1032 = class116.field2164;
                } else {
                    class48.field1032 = class245.field4322;
                }
                class11.field254 = 1;
                class14.field359 = 0;
                class89.field1769++;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lue;Z)I")
    public static final int method717(class86 arg0, boolean arg1) {
        field2019++;
        int var2 = 0;
        if (arg0.method602(class94.field1855, 0)) {
            var2++;
        }
        if (arg1) {
            return 95;
        } else {
            if (arg0.method602(class136.field2481, 0)) {
                var2++;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)I")
    public static final int method718(byte arg0) {
        field2021++;
        return arg0 <= 50 ? -19 : 2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static void method719(int arg0) {
        field2026 = null;
        field2031 = null;
        field2020 = null;
        if (arg0 <= 83) {
            method718((byte) -92);
        }
        field2030 = null;
        field2029 = null;
        field2023 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)Lve;")
    public static final class185 method720(int arg0, byte arg1) {
        field2022++;
        class185 var2 = (class185) class249.field4351.method828(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class222.field3930.method596(102, 16, arg0);
        class185 var4 = new class185();
        if (var3 != null) {
            var4.method1222(new class194(var3), 0);
        }
        int var5 = -59 % ((-arg1 - 71) / 50);
        class249.field4351.method826((long) arg0, 9815, var4);
        return var4;
    }
}
