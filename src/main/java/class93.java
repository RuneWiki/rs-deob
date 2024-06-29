import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class93 extends class210 {

    @OriginalMember(owner = "client!je", name = "E", descriptor = "Z")
    public boolean field1885;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "[Lje;")
    public class93[] field1894;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "[J")
    public static long[] field1878 = new long[200];

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field1874 = 0;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Ljd;")
    public static class92 field1875 = class202.method1325((byte) 90, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!je", name = "v", descriptor = "[I")
    public static int[] field1876 = new int[5];

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Ljd;")
    public static class92 field1893 = class202.method1325((byte) 90, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "La;")
    public static class1 field1897 = null;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public int field1877;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public int field1881;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "Loc;")
    public class137 field1887;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "Lud;")
    public static class192 field1892;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Lia;")
    public class81 field1873;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "[I")
    public static int[] field1888;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(B)V")
    public void method87(byte arg0) {
        if (arg0 == -85) {
            field1879++;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)[I")
    public final int[] method648(byte arg0, int arg1, int arg2) {
        if (arg0 <= 36) {
            this.method62(-70, -85);
        }
        field1884++;
        return this.field1894[arg2].field1885 ? this.field1894[arg2].method66(arg1, (byte) 120) : this.field1894[arg2].method62(arg1, 4096)[0];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZI)[[I")
    public final int[][] method649(int arg0, boolean arg1, int arg2) {
        field1880++;
        if (!arg1) {
            this.field1885 = true;
        }
        if (this.field1894[arg0].field1885) {
            int[] var4 = this.field1894[arg0].method66(arg2, (byte) 110);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1894[arg0].method62(arg2, 4096);
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(B)V")
    public final void method650(byte arg0) {
        field1896++;
        if (this.field1885) {
            this.field1887.method914(true);
            this.field1887 = null;
        } else {
            this.field1873.method552(-1);
            this.field1873 = null;
        }
        if (arg0 >= -28) {
            method653(8);
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)I")
    public int method651(int arg0) {
        field1898++;
        return arg0 == -1 ? -1 : -79;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lud;II)V")
    public static final void method652(class192 arg0, int arg1, int arg2) {
        if (arg1 != -24780) {
            return;
        }
        field1891++;
        if (class76.field1590 == null) {
            class139.method928(255, arg1 ^ 0xFFFFFD49, 0, (byte) 0, null, 255, true);
            client.field674[arg2] = arg0;
        } else {
            class76.field1590.field1472 = arg2 * 8 + 5;
            int var3 = class76.field1590.method453(110);
            int var4 = class76.field1590.method453(52);
            arg0.method1274(var4, (byte) 72, var3);
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
    public static final void method653(int arg0) {
        field1882++;
        for (int var1 = arg0; var1 < class208.field4003; var1++) {
            int var2 = class135.field2710[var1];
            class91 var3 = class172.field3347[var2];
            int var4 = class185.field3497.method443(255);
            if ((var4 & 0x2) != 0) {
                var4 += class185.field3497.method443(arg0 ^ 0xFF) << 8;
            }
            class136.method907(var4, arg0 - 116, var3, var2);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    public final void method654(int arg0, int arg1, int arg2) {
        int var4 = this.field1877 == 255 ? arg0 : this.field1877;
        if (arg2 <= 52) {
            field1893 = null;
        }
        field1871++;
        if (this.field1885) {
            this.field1887 = new class137(var4, arg0, arg1);
        } else {
            this.field1873 = new class81(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(B)V")
    public static void method655(byte arg0) {
        field1897 = null;
        if (arg0 != 70) {
            method655((byte) -40);
        }
        field1892 = null;
        field1893 = null;
        field1878 = null;
        field1888 = null;
        field1875 = null;
        field1876 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILh;I)V")
    public void method63(int arg0, class70 arg1, int arg2) {
        field1895++;
        if (arg2 != 0) {
            this.method63(-75, null, -4);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[[I")
    public int[][] method62(int arg0, int arg1) {
        field1870++;
        if (arg1 == 4096) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(B)I")
    public int method656(byte arg0) {
        field1886++;
        int var2 = 7 / ((42 - arg0) / 60);
        return -1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)Lse;")
    public static final class175 method657(boolean arg0) {
        field1889++;
        try {
            if (!arg0) {
                method653(-19);
            }
            return (class175) Class.forName("fe").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class212();
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IZ)V")
    public class93(int arg0, boolean arg1) {
        this.field1885 = arg1;
        this.field1894 = new class93[arg0];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[I")
    public int[] method66(int arg0, byte arg1) {
        int var3 = 51 % ((arg1 - 67) / 42);
        field1883++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }
}
