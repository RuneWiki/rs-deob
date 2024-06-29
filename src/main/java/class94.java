import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class94 {

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "[B")
    private byte[] field1722 = new byte[4];

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lhj;")
    private class69 field1718;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    private int field1721;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "J")
    private long field1725;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field1717 = 0;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Ljd;")
    public static class85 field1713 = class221.method1499("<img=0>", (byte) 117);

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Ljd;")
    private static class85 field1714 = class221.method1499("glow1:", (byte) 89);

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Ljd;")
    public static class85 field1723 = field1714;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Ljd;")
    public static class85 field1716 = field1714;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lve;")
    public static class184 field1715 = new class184(64);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    private int field1728;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1729;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "[B")
    private byte[] field1724;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[I")
    public static int[] field1719;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "[Lfg;")
    public static class12[] field1731;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "[Lfg;")
    public static class12[] field1732;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "[Lee;")
    public static class266[] field1727;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[BIZIIZI[Lkc;II)V")
    public static final void method674(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7, class264[] arg8, int arg9, int arg10) {
        field1726++;
        int var11 = -1;
        class247 var12 = new class247(arg1);
        if (arg6) {
            return;
        }
        while (true) {
            int var13 = var12.method1718(32767);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method1710(2006);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var12.method1711((byte) -67);
                int var19 = var18 & 0x3;
                int var20 = var14 >> 12;
                int var21 = var18 >> 2;
                if (arg4 == var20 && var17 >= arg10 && (arg10 + 8) > var17 && arg7 <= var16 && var16 < arg7 + 8) {
                    class199 var22 = class110.method753(var11, (byte) 120);
                    int var23 = arg5 + class128.method872(var22.field3473, arg9, var19, var22.field3464, var17 & 0x7, 35, var16 & 0x7);
                    int var24 = arg0 + class50.method337(var22.field3473, var22.field3464, var19, arg9, var17 & 0x7, -121, var16 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class264 var25 = null;
                        if (!arg3) {
                            int var26 = arg2;
                            if ((class228.field3952[1][var23][var24] & 0x2) == 2) {
                                var26 = arg2 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg8[var26];
                            }
                        }
                        class104.method719(arg3, arg2, var11, arg2, var24, var19 + arg9 & 0x3, var25, 14013, var23, var21, !arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method675(int arg0) {
        field1715 = null;
        field1713 = null;
        field1719 = null;
        if (arg0 > -59) {
            field1723 = null;
        }
        field1716 = null;
        field1714 = null;
        field1731 = null;
        field1723 = null;
        field1727 = null;
        field1732 = null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)[B")
    public final byte[] method676(int arg0) throws IOException {
        field1720++;
        if (this.field1725 < class28.method200(arg0 + 53)) {
            throw new IOException("fdt");
        }
        if (this.field1721 == 0) {
            if (this.field1718.field1296 == 2) {
                throw new IOException("fds");
            }
            if (this.field1718.field1296 == 1) {
                this.field1721 = 1;
                this.field1729 = (DataInputStream) this.field1718.field1292;
            }
        }
        if (this.field1721 == 1) {
            int var2 = this.field1729.available();
            if (var2 > 0) {
                if (this.field1728 + var2 > 4) {
                    var2 = 4 - this.field1728;
                }
                this.field1728 += this.field1729.read(this.field1722, this.field1728, var2);
                if (this.field1728 == 4) {
                    int var3 = (new class247(this.field1722)).method1712(arg0 ^ 0x18EA);
                    this.field1721 = 2;
                    this.field1724 = new byte[var3];
                }
            }
        }
        if (arg0 != 63) {
            method674(-56, (byte[]) null, -99, true, 52, 43, false, -49, (class264[]) null, 20, -98);
        }
        if (this.field1721 == 2) {
            int var4 = this.field1729.available();
            if (var4 > 0) {
                if (this.field1730 + var4 > this.field1724.length) {
                    var4 = this.field1724.length - this.field1730;
                }
                this.field1730 += this.field1729.read(this.field1724, this.field1730, var4);
                if (this.field1724.length == this.field1730) {
                    return this.field1724;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lb;Ljava/net/URL;)V")
    public class94(class81 arg0, URL arg1) {
        this.field1718 = arg0.method551(false, arg1);
        this.field1721 = 0;
        this.field1725 = class28.method200(-26) + 30000L;
    }
}
