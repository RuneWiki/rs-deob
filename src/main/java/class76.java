import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 {

    @OriginalMember(owner = "client!l", name = "j", descriptor = "[B")
    private byte[] field1664 = new byte[4];

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Laf;")
    private class7 field1665;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    private int field1670;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "J")
    private long field1663;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lqf;")
    private static class117 field1658 = class72.method514(106, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Lqf;")
    public static class117 field1671 = class72.method514(103, "runes");

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lqf;")
    private static class117 field1668 = class72.method514(122, "Welcome to RuneScape");

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Lqf;")
    public static class117 field1672 = field1668;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Lqf;")
    public static class117 field1669 = class72.method514(127, "redstone1");

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lqf;")
    public static class117 field1659 = field1658;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "Lqf;")
    public static class117 field1680 = class72.method514(118, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Z")
    public static boolean field1676 = false;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "Lqf;")
    private static class117 field1681 = class72.method514(110, "yellow:");

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lqf;")
    public static class117 field1674 = field1681;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lqf;")
    public static class117 field1675 = field1681;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lqf;")
    private static class117 field1656 = class72.method514(119, "Connection timed out)3");

    @OriginalMember(owner = "client!l", name = "B", descriptor = "Z")
    public static boolean field1682 = false;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "Lqf;")
    public static class117 field1679 = field1656;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    private int field1661;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    private int field1662;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Lr;")
    public static class118 field1677;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Ldf;")
    public static class28 field1666;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lma;")
    public static class84 field1667;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1660;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "[B")
    private byte[] field1657;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)[Lma;")
    public static final class84[] method547(int arg0) {
        field1678++;
        class84[] var1 = new class84[class140.field3340];
        for (int var2 = arg0; var2 < class140.field3340; var2++) {
            class84 var3 = var1[var2] = new class84();
            var3.field1921 = class132.field3122;
            var3.field1919 = class99.field2384;
            var3.field1918 = class116.field2758[var2];
            var3.field1917 = class41.field806[var2];
            var3.field1916 = class21.field354[var2];
            var3.field1920 = class42.field840[var2];
            byte[] var4 = class3.field58[var2];
            int var5 = var3.field1920 * var3.field1916;
            var3.field1915 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field1915[var6] = class144.field3536[class16.method135(var4[var6], 255)];
            }
        }
        class73.method525(-21572);
        return var1;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)[B")
    public final byte[] method548(int arg0) throws IOException {
        if (arg0 > -34) {
            method549(-6, -89);
        }
        field1673++;
        if (class122.method977(false) > this.field1663) {
            throw new IOException("fdt");
        }
        if (this.field1670 == 0) {
            if (this.field1665.field108 == 2) {
                throw new IOException("fds");
            }
            if (this.field1665.field108 == 1) {
                this.field1670 = 1;
                this.field1660 = (DataInputStream) this.field1665.field106;
            }
        }
        if (this.field1670 == 1) {
            int var2 = this.field1660.available();
            if (var2 > 0) {
                if (var2 + this.field1662 > 4) {
                    var2 = 4 - this.field1662;
                }
                this.field1662 += this.field1660.read(this.field1664, this.field1662, var2);
                if (this.field1662 == 4) {
                    int var3 = (new class77(this.field1664)).method554((byte) 39);
                    this.field1670 = 2;
                    this.field1657 = new byte[var3];
                }
            }
        }
        if (this.field1670 == 2) {
            int var4 = this.field1660.available();
            if (var4 > 0) {
                if (this.field1657.length < this.field1661 + var4) {
                    var4 = this.field1657.length - this.field1661;
                }
                this.field1661 += this.field1660.read(this.field1657, this.field1661, var4);
                if (this.field1657.length == this.field1661) {
                    return this.field1657;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lqf;")
    public static final class117 method549(int arg0, int arg1) {
        field1655++;
        if (arg0 != 255) {
            method549(-58, -11);
        }
        return class73.method530((byte) -83, new class117[] { class79.method614(15591, arg1 >> 24 & 0xFF), class28.field558, class79.method614(15591, arg1 >> 16 & 0xFF), class28.field558, class79.method614(15591, arg1 >> 8 & 0xFF), class28.field558, class79.method614(15591, arg1 & 0xFF) });
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static void method550(boolean arg0) {
        field1679 = null;
        field1680 = null;
        field1668 = null;
        if (arg0) {
            method550(true);
        }
        field1667 = null;
        field1675 = null;
        field1666 = null;
        field1659 = null;
        field1681 = null;
        field1671 = null;
        field1677 = null;
        field1658 = null;
        field1672 = null;
        field1669 = null;
        field1656 = null;
        field1674 = null;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lu;Ljava/net/URL;)V")
    public class76(class137 arg0, URL arg1) {
        this.field1665 = arg0.method1069(119, arg1);
        this.field1670 = 0;
        this.field1663 = class122.method977(false) + 30000L;
    }
}
