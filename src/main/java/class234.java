import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class234 {

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[B")
    public byte[] field3667;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "[Ljava/lang/String;")
    public String[] field3673;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "[I")
    public int[] field3676;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
    public int[] field3665;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lsl;")
    public static class39 field3677 = new class39(16);

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "[I")
    public static int[] field3683 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Lfd;")
    public static class206 field3681;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Lbm;")
    public static class307 field3682;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Z", line = 5)
    public final boolean method1551(int arg0, int arg1) {
        int var3 = 109 / ((arg1 + 9) / 35);
        field3668++;
        return (this.field3667[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)Lwi;", line = 20)
    public static final class220 method1552(int arg0, int arg1) {
        class220 var2 = (class220) class125.field2161.method1881(true, (long) arg1);
        field3679++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 <= 0) {
            method1561(false);
        }
        byte[] var3 = class158.field2588.method2036(31, arg1, (byte) 113);
        class220 var4 = new class220();
        if (var3 != null) {
            var4.method1463(-4, new class202(var3), arg1);
        }
        class125.field2161.method1880(var4, (long) arg1, 62);
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZII)V", line = 43)
    public static final void method1553(boolean arg0, int arg1, int arg2) {
        if (class294.field4489 != arg2) {
            class51.field1027 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class51.field1027[var3] = (var3 << 12) / arg2;
            }
            class186.field3021 = arg2 * 32;
            class4.field108 = arg2 - 1;
            class294.field4489 = arg2;
        }
        if (!arg0) {
            return;
        }
        if (class147.field2421 != arg1) {
            if (class294.field4489 == arg1) {
                class330.field5058 = class51.field1027;
            } else {
                class330.field5058 = new int[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    class330.field5058[var4] = (var4 << 12) / arg1;
                }
            }
            class204.field3323 = arg1 - 1;
            class147.field2421 = arg1;
        }
        field3666++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 94)
    public static final void method1554(byte arg0) {
        field3670++;
        class342.field5311.method1877(-29702);
        class128.field2198.method1877(-29702);
        if (arg0 < -100) {
            class24.field478.method1877(-29702);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)V", line = 109)
    public static final void method1555(byte arg0, int arg1) {
        field3678++;
        if (arg1 == -1 || !class165.method1056(arg1, (byte) 24)) {
            return;
        }
        class68[] var2 = class138.field2300[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class68 var4 = var2[var3];
            if (var4.field1310 != null) {
                class106 var5 = new class106();
                var5.field1823 = var4;
                var5.field1841 = var4.field1310;
                class99.method657(var5, (byte) -61, 2000000);
            }
        }
        int var6 = -16 % ((8 - arg0) / 35);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)I", line = 154)
    public final int method1556(int arg0, int arg1) {
        int var3 = 79 % ((arg0 + 79) / 42);
        field3675++;
        return this.field3667[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", line = 168)
    public static final void method1557(String arg0, String arg1, String arg2, int arg3, int arg4, int arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class42.field811[var6] = class42.field811[var6 - 1];
            client.field910[var6] = client.field910[var6 - 1];
            class39.field769[var6] = class39.field769[var6 - 1];
            class187.field3039[var6] = class187.field3039[var6 - 1];
            class67.field1278[var6] = class67.field1278[var6 - 1];
        }
        field3669++;
        class85.field1610++;
        class42.field811[0] = arg3;
        class67.field1278[0] = arg5;
        class46.field942 = class342.field5323;
        client.field910[0] = arg1;
        class39.field769[0] = arg2;
        if (arg4 <= 49) {
            field3682 = (class307) null;
        }
        class187.field3039[0] = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I)V", line = 195)
    public class234(int arg0) {
        this.field3672 = arg0;
        this.field3667 = new byte[this.field3672];
        this.field3673 = new String[this.field3672];
        this.field3676 = new int[this.field3672];
        this.field3665 = new int[this.field3672];
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZZ)V", line = 208)
    public static final void method1558(boolean arg0, boolean arg1) {
        class319.field4874 = new int[104];
        field3680++;
        class69.field1474 = new int[104];
        class328.field5032 = new int[104];
        class50.field1014 = new int[104];
        if (!arg1) {
            return;
        }
        class72.field1499 = 99;
        class331.field5079 = new int[104];
        class134.field2253 = new int[5];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class267.field4121 = new int[var2][105][105];
        class46.field957 = new byte[var2][105][105];
        class325.field4968 = new byte[var2][104][104];
        class160.field2607 = new byte[var2][104][104];
        class269.field4162 = new byte[var2][104][104];
        class153.field2507 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(BI)Z", line = 238)
    public final boolean method1559(byte arg0, int arg1) {
        if (arg0 > -3) {
            return false;
        } else {
            field3671++;
            return (this.field3667[arg1] & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)Z", line = 249)
    public final boolean method1560(int arg0, int arg1) {
        if (arg1 == 4) {
            field3684++;
            return (this.field3667[arg0] & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 260)
    public static void method1561(boolean arg0) {
        field3677 = null;
        field3681 = null;
        field3682 = null;
        field3683 = null;
        if (arg0) {
            field3681 = (class206) null;
        }
    }
}
