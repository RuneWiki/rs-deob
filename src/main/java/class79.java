import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class79 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public int field1526;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1518 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lig;")
    public static class93 field1517 = new class93(64);

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Z")
    public static boolean field1522 = false;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1523 = 0;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method521(byte arg0) {
        field1517 = null;
        if (arg0 != 97) {
            method521((byte) -88);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([Lvd;B)[Lvd;")
    public static final class222[] method522(class222[] arg0, byte arg1) {
        field1520++;
        if (arg1 != -124) {
            return null;
        }
        class222[] var2 = new class222[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class234.method1531(new class222[] { class56.method414(class168.method1082(arg1, 2), var3), class127.field2451 }, -10949);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class234.method1531(new class222[] { var2[var3], arg0[var3] }, arg1 - 10825);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
    public static final int method523(int arg0, int arg1, int arg2) {
        field1519++;
        if (arg0 == 172275167) {
            int var3 = arg2 >> 31 & arg1 - 1;
            return ((arg2 >>> 31) + arg2) % arg1 + var3;
        } else {
            return 97;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILgg;)V")
    public static final void method524(int arg0, class72 arg1) {
        field1528++;
        if (class222.field4168 == 1) {
            short var2 = 280;
            if (var2 <= class64.field1168 && class64.field1168 <= var2 + 14 && class153.field2938 >= 4 && class153.field2938 <= 18) {
                class128.method810(0, 4, 0);
                return;
            }
            if (var2 + 15 <= class64.field1168 && var2 + 80 >= class64.field1168 && class153.field2938 >= 4 && class153.field2938 <= 18) {
                class128.method810(1, 4, 0);
                return;
            }
            short var3 = 390;
            if (var3 <= class64.field1168 && var3 + 14 >= class64.field1168 && class153.field2938 >= 4 && class153.field2938 <= 18) {
                class128.method810(0, 4, 1);
                return;
            }
            if (var3 + 15 <= class64.field1168 && class64.field1168 <= var3 + 80 && class153.field2938 >= 4 && class153.field2938 <= 18) {
                class128.method810(1, arg0 - 13610, 1);
                return;
            }
            short var4 = 500;
            if (class64.field1168 >= var4 && var4 + 14 >= class64.field1168 && class153.field2938 >= 4 && class153.field2938 <= 18) {
                class128.method810(0, arg0 - 13610, 2);
                return;
            }
            if (var4 + 15 <= class64.field1168 && var4 + 80 >= class64.field1168 && class153.field2938 >= 4 && class153.field2938 <= 18) {
                class128.method810(1, 4, 2);
                return;
            }
            short var5 = 610;
            if (class64.field1168 >= var5 && var5 + 14 >= class64.field1168 && class153.field2938 >= 4 && class153.field2938 <= 18) {
                class128.method810(0, arg0 ^ 0x352A, 3);
                return;
            }
            if (class64.field1168 >= var5 + 15 && var5 + 80 >= class64.field1168 && class153.field2938 >= 4 && class153.field2938 <= 18) {
                class128.method810(1, 4, 3);
                return;
            }
            if (class64.field1168 >= 700 && class153.field2938 >= 4 && class64.field1168 <= 758 && class153.field2938 <= 20) {
                class39.field862 = false;
                class124.method787(-18622);
                return;
            }
            if (class104.field1931 != -1) {
                class151 var6 = class99.field1863[class104.field1931];
                if (class206.field3835 == var6.field2926) {
                    byte[] var7 = class234.method1531(new class222[] { var6.field2920, class193.field3546 }, -10949).method1439(arg0 - 13614);
                    class120.field2266 = new String(var7, 0, var7.length);
                    if (class95.field1781 != 0) {
                        class26.field593 = 43594;
                        class181.field3359 = 43594;
                        class226.field4238 = 443;
                        class95.field1781 = 0;
                    }
                    class39.field862 = false;
                    class208.field3875 = var6.field2923;
                    class124.method787(-18622);
                    return;
                }
                class222 var8 = class234.method1531(new class222[] { class32.field673, var6.field2920, class181.field3360, class56.method414(arg0 - 13715, class103.field1915), class190.field3505, class56.method414(-113, class122.field2331 ? 1 : 0), class200.field3655, class56.method414(-128, class44.field925), class6.field96, class56.method414(-99, class204.field3798) }, -10949);
                try {
                    arg1.getAppletContext().showDocument(var8.method1418(true), "_self");
                } catch (Exception var9) {
                }
            }
        }
        if (arg0 != 13614) {
            field1523 = -103;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class79() {
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lhc;)V")
    public class79(class79 arg0) {
        this.field1521 = arg0.field1521;
        this.field1526 = arg0.field1526;
        this.field1524 = arg0.field1524;
        this.field1525 = arg0.field1525;
    }
}
