import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class102 extends class89 {

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Z")
    public boolean field1957;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "[Lje;")
    public class102[] field1959;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public static int field1963 = 127;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public static int field1961 = 0;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "Lqe;")
    public static class179 field1971 = class206.method1380("Mitglieder)2Welt", (byte) -128);

    @OriginalMember(owner = "client!je", name = "E", descriptor = "Lqe;")
    public static class179 field1965 = class206.method1380("::autoshadow on", (byte) -127);

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public int field1958;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "Ljj;")
    public class107 field1960;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Leh;")
    public static class52 field1949;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lic;")
    public class90 field1950;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "[[[B")
    public static byte[][][] field1947;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "[[[B")
    public static byte[][][] field1951;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)[I")
    public int[] method11(boolean arg0, int arg1) {
        if (arg0) {
            field1952++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public void method446(int arg0) {
        field1967++;
        if (this.field1957) {
            this.field1960.method702((byte) 73);
            this.field1960 = null;
        } else {
            this.field1950.method595(1);
            this.field1950 = null;
        }
        if (arg0 >= -56) {
            field1963 = -54;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIZII)Lnb;")
    public static final class143 method676(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1968++;
        long var6 = ((long) arg2 << 16) + (long) arg1 + (arg3 ? 137438953472L : 0L) + ((long) arg0 << 38) + ((long) arg5 << 40);
        if (arg4 != 21308) {
            method681(-107, null);
        }
        class143 var8 = (class143) class15.field422.method1299((byte) 101, var6);
        if (var8 != null) {
            return var8;
        }
        class143 var9 = class38.method247(arg3, arg5, false, true, arg1, arg2, arg0, false);
        if (var9 != null) {
            class15.field422.method1303(var9, var6, (byte) 101);
        }
        return var9;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)[[I")
    public final int[][] method677(int arg0, int arg1, int arg2) {
        field1953++;
        if (arg0 <= 42) {
            this.field1959 = null;
        }
        if (!this.field1959[arg2].field1957) {
            return this.field1959[arg2].method14(arg1, 64);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field1959[arg2].method11(true, arg1);
        var4[0] = var5;
        var4[2] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public void method191(int arg0) {
        field1948++;
        if (arg0 != 14005) {
            this.method449(-75);
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)I")
    public int method449(int arg0) {
        if (arg0 != -7615) {
            field1947 = null;
        }
        field1970++;
        return -1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[[I")
    public int[][] method14(int arg0, int arg1) {
        field1964++;
        if (arg1 == 64) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(III)V")
    public final void method678(int arg0, int arg1, int arg2) {
        field1969++;
        int var4 = this.field1958 == 255 ? arg0 : this.field1958;
        if (this.field1957) {
            this.field1960 = new class107(var4, arg0, arg1);
        } else {
            this.field1950 = new class90(var4, arg0, arg1);
        }
        int var5 = -15 / ((80 - arg2) / 42);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lra;IZ)V")
    public void method13(class185 arg0, int arg1, boolean arg2) {
        field1955++;
        if (arg2) {
            field1961 = -114;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)[I")
    public final int[] method679(int arg0, int arg1, byte arg2) {
        field1972++;
        if (arg2 != -109) {
            this.field1957 = true;
        }
        return this.field1959[arg1].field1957 ? this.field1959[arg1].method11(true, arg0) : this.field1959[arg1].method14(arg0, 64)[0];
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)I")
    public int method680(byte arg0) {
        field1954++;
        if (arg0 > -93) {
            this.field1950 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILbh;)V")
    public static final void method681(int arg0, class19 arg1) {
        field1956++;
        class11.method76(arg1, arg0, arg0 ^ 0xFFFCF2F1);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IZ)V")
    public class102(int arg0, boolean arg1) {
        this.field1957 = arg1;
        this.field1959 = new class102[arg0];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public static void method682(boolean arg0) {
        field1951 = null;
        if (!arg0) {
            field1947 = null;
            field1971 = null;
            field1965 = null;
            field1949 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIILrb;JZ)V")
    public static final void method683(int arg0, int arg1, int arg2, int arg3, class186 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class47 var8 = new class47();
        var8.field1028 = arg4;
        var8.field1018 = arg1 * 128 + 64;
        var8.field1019 = arg2 * 128 + 64;
        var8.field1020 = arg3;
        var8.field1026 = arg5;
        if (class229.field4232[arg0][arg1][arg2] == null) {
            class229.field4232[arg0][arg1][arg2] = new class197(arg0, arg1, arg2);
        }
        class229.field4232[arg0][arg1][arg2].field3681 = var8;
    }
}
