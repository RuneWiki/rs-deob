import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 extends RuntimeException {

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1789;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1790;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lfc;")
    public static class39 field1791 = class90.method774("Ihre Nachricht an: ", -105);

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lp;")
    public static class104 field1788 = new class104(500);

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1798 = 0;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lfc;")
    public static class39 field1796 = class90.method774("backleft1", -113);

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Lfc;")
    private static class39 field1799 = class90.method774("No matching objects found)1 please shorten search", -116);

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "[J")
    public static long[] field1795 = new long[100];

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lfc;")
    public static class39 field1792 = class90.method774("Bitte laden Sie die Seite neu)3", -119);

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lfc;")
    public static class39 field1797 = field1799;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lee;")
    public static class34 field1794 = new class34(5000);

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Lfc;")
    public static class39 field1801 = class90.method774("Name des Gegenstands eingeben:", -107);

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Lfc;")
    public static class39 field1803 = class90.method774("Angreifen", -120);

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "Lfc;")
    private static class39 field1802 = class90.method774("Enter message to send to ", -111);

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field1804 = 0;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Lfc;")
    public static class39 field1805 = class90.method774("backvmid2", -88);

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lfc;")
    public static class39 field1800 = field1802;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Ltc;")
    public static class133 field1793;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 11)
    public static void method682(byte arg0) {
        field1799 = null;
        field1800 = null;
        field1794 = null;
        if (arg0 <= 56) {
            method683(-128);
        }
        field1803 = null;
        field1802 = null;
        field1801 = null;
        field1805 = null;
        field1797 = null;
        field1788 = null;
        field1791 = null;
        field1796 = null;
        field1795 = null;
        field1792 = null;
        field1793 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 36)
    public static final void method683(int arg0) {
        if (arg0 <= 96) {
            method685(-89, -68);
        }
        field1784++;
        class92.field2163.method927(false);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILq;)V", line = 47)
    public static final void method684(int arg0, class111 arg1) {
        field1787++;
        int var2 = arg1.field2874 * 128 + arg1.field2918 * 64;
        arg1.field2872 = 0;
        if (~arg1.field2922 == arg0) {
            arg1.field2887 = 1024;
        }
        int var3 = arg1.field2918 * 64 + arg1.field2862 * 128;
        int var4 = arg1.field2904 - class70.field1654;
        arg1.field2916 += (var2 - arg1.field2916) / var4;
        arg1.field2909 += (var3 - arg1.field2909) / var4;
        if (arg1.field2922 == 1) {
            arg1.field2887 = 1536;
        }
        if (arg1.field2922 == 2) {
            arg1.field2887 = 0;
        }
        if (arg1.field2922 == 3) {
            arg1.field2887 = 512;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lkb;", line = 75)
    public static final class71 method685(int arg0, int arg1) {
        field1785++;
        class71 var2 = (class71) class80.field1810.method931(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class110.field2848.method839(5, 5, arg0);
        class71 var4 = new class71();
        if (var3 != null) {
            var4.method661(true, new class25(var3));
        }
        class80.field1810.method934(0, var4, (long) arg0);
        if (arg1 != -13919) {
            field1792 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V", line = 118)
    public static final void method686(int arg0) {
        class68.field1626 = 0;
        field1786++;
        class28.field801 = 0;
        class109.method953(-858993460);
        class26.method335(32);
        class134.method1092((byte) -117);
        for (int var1 = 0; var1 < class28.field801; var1++) {
            int var4 = class31.field871[var1];
            if (class70.field1654 != class118.field3092[var4].field2868) {
                class118.field3092[var4].field3163 = null;
                class118.field3092[var4] = null;
            }
        }
        if (class128.field3275 != class39.field1065.field710) {
            throw new RuntimeException("gnp1 pos:" + class39.field1065.field710 + " psize:" + class128.field3275);
        }
        int var2 = 108 / ((arg0 - 82) / 37);
        for (int var3 = 0; var3 < class15.field416; var3++) {
            if (class118.field3092[class121.field3176[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class15.field416);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 166)
    public class79(Throwable arg0, String arg1) {
        this.field1789 = arg1;
        this.field1790 = arg0;
    }
}
