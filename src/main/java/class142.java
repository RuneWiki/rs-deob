import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class142 extends class206 {

    @OriginalMember(owner = "client!hw", name = "A", descriptor = "I")
    public int field1709 = 0;

    @OriginalMember(owner = "client!hw", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field1715 = new String[] { method1214(method1213("N&/oJ")), method1214(method1213("N&/lJ")) };

    @OriginalMember(owner = "client!hw", name = "G", descriptor = "Lel;")
    public static class573 field1703 = new class573(133, 0);

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "client!hw", name = "B", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
    public int field1686;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!hw", name = "D", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!hw", name = "N", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "client!hw", name = "L", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "client!hw", name = "v", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "client!hw", name = "M", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "client!hw", name = "I", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!hw", name = "E", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "Lps;")
    public class105 field1692;

    @OriginalMember(owner = "client!hw", name = "H", descriptor = "Lps;")
    public class105 field1711;

    @OriginalMember(owner = "client!hw", name = "C", descriptor = "Lc;")
    public class198 field1699;

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "Loaa;")
    public class303 field1700;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "Loaa;")
    public class303 field1712;

    @OriginalMember(owner = "client!hw", name = "w", descriptor = "Lnv;")
    public class438 field1691;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "Lnv;")
    public class438 field1697;

    @OriginalMember(owner = "client!hw", name = "J", descriptor = "Lnw;")
    public class612 field1702;

    @OriginalMember(owner = "client!hw", name = "x", descriptor = "Lic;")
    public class726 field1688;

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "Z")
    public boolean field1701;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "Z")
    public boolean field1704;

    @OriginalMember(owner = "client!hw", name = "K", descriptor = "Z")
    public boolean field1705;

    @OriginalMember(owner = "client!hw", name = "F", descriptor = "Z")
    public static boolean field1713;

    @OriginalMember(owner = "client!hw", name = "u", descriptor = "[I")
    public int[] field1706;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V", line = 18)
    public final void method1211(int arg0) {
        try {
            field1708++;
            int var2 = this.field1698;
            if (arg0 != 1733170857) {
                this.field1692 = null;
            }
            boolean var3 = this.field1701;
            if (this.field1699 != null) {
                class198 var6 = this.field1699.method1764(class276.field4168, -174);
                if (var6 == null) {
                    this.field1705 = false;
                    this.field1695 = 0;
                    this.field1707 = 0;
                    this.field1698 = -1;
                    this.field1696 = 0;
                    this.field1710 = 256;
                    this.field1684 = 0;
                    this.field1685 = 256;
                    this.field1706 = null;
                    this.field1686 = 0;
                    this.field1701 = false;
                } else {
                    this.field1695 = var6.field3091;
                    this.field1686 = var6.field3075 << 9;
                    this.field1706 = var6.field3086;
                    this.field1701 = var6.field3056;
                    this.field1696 = var6.field3092;
                    this.field1705 = var6.field3084;
                    this.field1685 = var6.field3012;
                    this.field1698 = var6.field3067;
                    this.field1707 = var6.field3035;
                    this.field1710 = var6.field3005;
                }
            } else if (this.field1702 != null) {
                int var4 = class555.method4175(-1, this.field1702);
                if (var2 != var4) {
                    this.field1698 = var4;
                    class496 var5 = this.field1702.field8947;
                    if (var5.field7110 != null) {
                        var5 = var5.method3742(arg0 ^ 0x98B1E956, class276.field4168);
                    }
                    if (var5 == null) {
                        this.field1707 = this.field1686 = this.field1684 = 0;
                        this.field1685 = 256;
                        this.field1710 = 256;
                        this.field1701 = this.field1702.field8947.field7140;
                    } else {
                        this.field1686 = var5.field7167 << 9;
                        this.field1684 = var5.field7138 << 9;
                        this.field1710 = var5.field7160;
                        this.field1707 = var5.field7131;
                        this.field1685 = var5.field7158;
                        this.field1701 = var5.field7140;
                    }
                }
            } else if (this.field1688 != null) {
                this.field1698 = class538.method4057(4, this.field1688);
                this.field1701 = this.field1688.field10525;
                this.field1686 = this.field1688.field10488 << 9;
                this.field1707 = this.field1688.field10517;
                this.field1710 = 256;
                this.field1685 = 256;
                this.field1684 = 0;
            }
            if (this.field1698 != var2 || var3 != this.field1701) {
                if (this.field1700 == null) {
                    return;
                }
                class594.field8714.method4980(this.field1700);
                this.field1691 = null;
                this.field1692 = null;
                this.field1700 = null;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1715[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 154)
    public static void method1212(int arg0) {
        try {
            if (arg0 != -17552) {
                method1212(65);
            }
            field1703 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1715[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1213(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x62);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1214(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 81;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 98;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
