import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 {

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[B")
    private byte[] field1678 = new byte[4];

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lnc;")
    private class93 field1680;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "J")
    private long field1664;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field1661 = 0;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field1662 = 0;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Loa;")
    public static class98 field1666 = class38.method349(255, " )2> @whi@");

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Loa;")
    private static class98 field1669 = class38.method349(255, "Password: ");

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Loa;")
    public static class98 field1672 = field1669;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Loa;")
    public static class98 field1677 = class38.method349(255, "welle:");

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Loa;")
    private static class98 field1679 = class38.method349(255, "Friends");

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Loa;")
    public static class98 field1660 = field1679;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    private int field1667;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1668;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "[B")
    private byte[] field1670;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBILed;I)V")
    public static final void method621(int arg0, byte arg1, int arg2, class33 arg3, int arg4) {
        field1673++;
        if (class127.field2830 >= 50 || class149.field3671 == 0 || (arg3.field800 == null || arg2 >= arg3.field800.length)) {
            return;
        }
        int var5 = arg3.field800[arg2];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        int var7 = var5 >> 4 & 0x7;
        if (arg1 != 120) {
            method625(119);
        }
        int var8 = var5 & 0xF;
        class64.field1370[class127.field2830] = var6;
        int var9 = (arg0 - 64) / 128;
        class46.field1046[class127.field2830] = var7;
        class15.field318[class127.field2830] = 0;
        int var10 = (arg4 - 64) / 128;
        class26.field634[class127.field2830] = null;
        class134.field3267[class127.field2830] = (var9 << 16) + (var10 << 8) + var8;
        class127.field2830++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)[B")
    public final byte[] method622(int arg0) throws IOException {
        int var2 = 107 % ((-arg0 - 56) / 58);
        field1665++;
        if (this.field1664 < class44.method375((byte) 11)) {
            throw new IOException("fdt");
        }
        if (this.field1676 == 0) {
            if (this.field1680.field2134 == 2) {
                throw new IOException("fds");
            }
            if (this.field1680.field2134 == 1) {
                this.field1668 = (DataInputStream) this.field1680.field2130;
                this.field1676 = 1;
            }
        }
        if (this.field1676 == 1) {
            int var3 = this.field1668.available();
            if (var3 > 0) {
                if (this.field1675 + var3 > 4) {
                    var3 = 4 - this.field1675;
                }
                this.field1675 += this.field1668.read(this.field1678, this.field1675, var3);
                if (this.field1675 == 4) {
                    int var4 = (new class8(this.field1678)).method70(false);
                    this.field1676 = 2;
                    this.field1670 = new byte[var4];
                }
            }
        }
        if (this.field1676 == 2) {
            int var5 = this.field1668.available();
            if (var5 > 0) {
                if (this.field1667 + var5 > this.field1670.length) {
                    var5 = this.field1670.length - this.field1667;
                }
                this.field1667 += this.field1668.read(this.field1670, this.field1667, var5);
                if (this.field1670.length == this.field1667) {
                    return this.field1670;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLkd;Lve;I)V")
    public static final void method623(byte arg0, class73 arg1, class145 arg2, int arg3) {
        field1671++;
        byte[] var4 = null;
        class63 var5 = class53.field1184;
        synchronized (class53.field1184) {
            for (class117 var6 = (class117) class53.field1184.method512(-124); var6 != null; var6 = (class117) class53.field1184.method513(-103)) {
                if ((long) arg3 == var6.field2729 && var6.field2621 == arg2 && var6.field2609 == 0) {
                    var4 = var6.field2614;
                    break;
                }
            }
        }
        if (arg0 < 0) {
            field1679 = null;
        }
        if (var4 == null) {
            byte[] var7 = arg2.method1164(1338129168, arg3);
            arg1.method599(arg2, var7, arg3, false, true);
        } else {
            arg1.method599(arg2, var4, arg3, false, true);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLwb;)V")
    public static final void method624(byte arg0, class148 arg1) {
        field1663++;
        arg1.field3655 = arg1.field3626;
        if (arg1.field3608 == 0) {
            arg1.field3637 = 0;
            return;
        }
        if (arg1.field3612 != -1 && arg1.field3605 == 0) {
            class33 var2 = class48.method413(arg0 - 155, arg1.field3612);
            if (arg1.field3661 > 0 && var2.field785 == 0) {
                arg1.field3637++;
                return;
            }
            if (arg1.field3661 <= 0 && var2.field810 == 0) {
                arg1.field3637++;
                return;
            }
        }
        int var3 = arg1.field3667;
        int var4 = arg1.field3657;
        int var5 = arg1.field3603[arg1.field3608 - 1] * 128 + arg1.field3660 * 64;
        if (arg0 != 31) {
            method621(118, (byte) 9, 17, null, -77);
        }
        int var6 = arg1.field3648[arg1.field3608 - 1] * 128 + arg1.field3660 * 64;
        if (var5 - var4 > 256 || var5 - var4 < -256 || var6 - var3 > 256 || var6 - var3 < -256) {
            arg1.field3667 = var6;
            arg1.field3657 = var5;
            return;
        }
        if (var4 < var5) {
            if (var6 > var3) {
                arg1.field3652 = 1280;
            } else if (var6 >= var3) {
                arg1.field3652 = 1536;
            } else {
                arg1.field3652 = 1792;
            }
        } else if (var5 < var4) {
            if (var3 < var6) {
                arg1.field3652 = 768;
            } else if (var3 <= var6) {
                arg1.field3652 = 512;
            } else {
                arg1.field3652 = 256;
            }
        } else if (var6 > var3) {
            arg1.field3652 = 1024;
        } else if (var6 < var3) {
            arg1.field3652 = 0;
        }
        int var7 = arg1.field3652 - arg1.field3620 & 0x7FF;
        int var8 = arg1.field3640;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field3617;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field3628;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field3624;
        }
        boolean var9 = true;
        if (var8 == -1) {
            var8 = arg1.field3617;
        }
        arg1.field3655 = var8;
        int var10 = 4;
        if (arg1 instanceof class150) {
            var9 = ((class150) arg1).field3709.field3320;
        }
        if (var9) {
            if (arg1.field3652 != arg1.field3620 && arg1.field3668 == -1 && arg1.field3658 != 0) {
                var10 = 2;
            }
            if (arg1.field3608 > 2) {
                var10 = 6;
            }
            if (arg1.field3608 > 3) {
                var10 = 8;
            }
            if (arg1.field3637 > 0 && arg1.field3608 > 1) {
                arg1.field3637--;
                var10 = 8;
            }
        } else {
            if (arg1.field3608 > 1) {
                var10 = 6;
            }
            if (arg1.field3608 > 2) {
                var10 = 8;
            }
            if (arg1.field3637 > 0 && arg1.field3608 > 1) {
                arg1.field3637--;
                var10 = 8;
            }
        }
        if (arg1.field3656[arg1.field3608 - 1]) {
            var10 <<= 0x1;
        }
        if (var10 >= 8 && arg1.field3655 == arg1.field3617 && arg1.field3638 != -1) {
            arg1.field3655 = arg1.field3638;
        }
        if (var3 < var6) {
            arg1.field3667 += var10;
            if (var6 < arg1.field3667) {
                arg1.field3667 = var6;
            }
        } else if (var3 > var6) {
            arg1.field3667 -= var10;
            if (arg1.field3667 < var6) {
                arg1.field3667 = var6;
            }
        }
        if (var5 > var4) {
            arg1.field3657 += var10;
            if (var5 < arg1.field3657) {
                arg1.field3657 = var5;
            }
        } else if (var5 < var4) {
            arg1.field3657 -= var10;
            if (var5 > arg1.field3657) {
                arg1.field3657 = var5;
            }
        }
        if (arg1.field3657 == var5 && arg1.field3667 == var6) {
            if (arg1.field3661 > 0) {
                arg1.field3661--;
            }
            arg1.field3608--;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static void method625(int arg0) {
        field1677 = null;
        field1672 = null;
        field1666 = null;
        field1679 = null;
        if (arg0 == -8404) {
            field1660 = null;
            field1669 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lkc;Ljava/net/URL;)V")
    public class76(class72 arg0, URL arg1) {
        this.field1680 = arg0.method587(arg1, -17597);
        this.field1676 = 0;
        this.field1664 = class44.method375((byte) 48) + 30000L;
    }
}
