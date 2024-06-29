import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class74 {

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    private int field1832 = -1;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    private int field1823 = 0;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lqd;")
    private class148 field1833 = new class148();

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Z")
    public boolean field1840 = false;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[Lpg;")
    private class142[] field1825;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    private int field1839;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    private int field1826;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[[I")
    private int[][] field1836;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Z")
    public static boolean field1822 = false;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lgg;")
    private static class63 field1828 = class116.method911(43, "Loaded input handler");

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lgg;")
    public static class63 field1820 = field1828;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "J")
    public static volatile long field1835 = 0L;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lgg;")
    public static class63 field1837 = class116.method911(43, "welle2:");

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)[[I")
    public final int[][] method678(boolean arg0) {
        field1827++;
        if (this.field1839 != this.field1826) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (!arg0) {
            this.field1826 = -29;
        }
        for (int var2 = 0; var2 < this.field1839; var2++) {
            this.field1825[var2] = class51.field1228;
        }
        return this.field1836;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method679(int arg0) {
        Object var1 = class183.field3710;
        synchronized (class183.field3710) {
            if (arg0 != -25) {
                return;
            }
            if (class189.field3801 == 0) {
                class79.field1924.method1045(new class77(), (byte) -102, 5);
            }
            class189.field3801 = 600;
        }
        field1831++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lud;")
    public static final class184 method680(int arg0, int arg1) {
        field1824++;
        class184 var2 = (class184) class23.field535.method289((long) arg0, -130079263);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class52.field1275.method745(arg1, arg0, 0);
        class184 var4 = new class184();
        if (var3 != null) {
            var4.method1210(new class3(var3), (byte) -20);
        }
        class23.field535.method293(false, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[I")
    public final int[] method681(int arg0, byte arg1) {
        field1829++;
        if (arg1 >= -31) {
            return null;
        } else if (this.field1839 == this.field1826) {
            this.field1840 = this.field1825[arg0] == null;
            this.field1825[arg0] = class51.field1228;
            return this.field1836[arg0];
        } else if (this.field1839 == 1) {
            this.field1840 = this.field1832 != arg0;
            this.field1832 = arg0;
            return this.field1836[0];
        } else {
            class142 var3 = this.field1825[arg0];
            if (this.field1840 = var3 == null) {
                if (this.field1839 > this.field1823) {
                    var3 = new class142(arg0, this.field1823);
                    this.field1823++;
                } else {
                    class142 var4 = (class142) this.field1833.method1040(-124);
                    var3 = new class142(arg0, var4.field3040);
                    this.field1825[var4.field3047] = null;
                    var4.method1172(-73);
                }
                this.field1825[arg0] = var3;
            }
            this.field1833.method1038(0, var3);
            return this.field1836[var3.field3040];
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public final void method682(int arg0) {
        field1838++;
        if (arg0 != 600) {
            method680(-125, -66);
        }
        for (int var2 = 0; var2 < this.field1839; var2++) {
            this.field1836[var2] = null;
        }
        this.field1836 = null;
        this.field1825 = null;
        this.field1833.method1031(0);
        this.field1833 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method683(byte arg0) {
        field1837 = null;
        field1828 = null;
        if (arg0 >= -79) {
            method679(-3);
        }
        field1820 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lab;B)V")
    public static final void method684(class3 arg0, byte arg1) {
        if (arg1 >= -93) {
            field1837 = null;
        }
        byte[] var2 = new byte[24];
        field1834++;
        if (class180.field3666 != null) {
            try {
                int var3 = 0;
                class180.field3666.method160(-127, 0L);
                class180.field3666.method162(var2, 0);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method72(0, (byte) -69, 24, var2);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III)V")
    public class74(int arg0, int arg1, int arg2) {
        this.field1825 = new class142[arg1];
        this.field1839 = arg0;
        this.field1826 = arg1;
        this.field1836 = new int[arg0][arg2];
    }
}
