import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class638 {

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    private int field8979 = 0;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "[Lsja;")
    public class69[] field8962;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public int field8960;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Z")
    public static boolean field8971 = false;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Llk;")
    public static class638 field8966 = new class638(512);

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "J")
    public static long field8975 = -1L;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "[I")
    public static int[] field8976 = new int[6];

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "J")
    private long field8973;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lsja;")
    private class69 field8964;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "Lsja;")
    private class69 field8978;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([Lsja;Z)I", line = 11)
    public final int method3663(class69[] arg0, boolean arg1) {
        field8963++;
        int var3 = 0;
        int var4 = 0;
        if (arg1) {
            return -31;
        }
        while (var4 < this.field8960) {
            class69 var5 = this.field8962[var4];
            for (class69 var6 = var5.field767; var6 != var5; var6 = var6.field767) {
                arg0[var3++] = var6;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)I", line = 43)
    public final int method3664(int arg0) {
        field8968++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field8960; var3++) {
            class69 var4 = this.field8962[var3];
            for (class69 var5 = var4.field767; var5 != var4; var5 = var5.field767) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 73)
    public static void method3665(int arg0) {
        if (arg0 != 1083) {
            field8976 = null;
        }
        field8976 = null;
        field8966 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BJLsja;)V", line = 84)
    public final void method3666(byte arg0, long arg1, class69 arg2) {
        if (arg2.field760 != null) {
            arg2.method527(arg0 ^ 0xFFFFD462);
        }
        field8972++;
        class69 var5 = this.field8962[(int) ((long) (this.field8960 - 1) & arg1)];
        arg2.field760 = var5.field760;
        arg2.field767 = var5;
        arg2.field760.field767 = arg2;
        arg2.field767.field760 = arg2;
        arg2.field762 = arg1;
        if (arg0 != 65) {
            this.method3664(-64);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)Lsja;", line = 104)
    public final class69 method3667(byte arg0) {
        field8965++;
        if (this.field8979 > 0 && this.field8962[this.field8979 - 1] != this.field8978) {
            class69 var2 = this.field8978;
            this.field8978 = var2.field767;
            return var2;
        }
        while (this.field8960 > this.field8979) {
            class69 var4 = this.field8962[this.field8979++].field767;
            if (this.field8962[this.field8979 - 1] != var4) {
                this.field8978 = var4.field767;
                return var4;
            }
        }
        int var3 = -79 % ((arg0 + 6) / 53);
        return null;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)Lsja;", line = 134)
    public final class69 method3668(int arg0) {
        this.field8979 = 0;
        field8959++;
        int var2 = -122 / ((-arg0 - 40) / 41);
        return this.method3667((byte) -59);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZJ)Lsja;", line = 147)
    public final class69 method3669(boolean arg0, long arg1) {
        field8967++;
        this.field8973 = arg1;
        class69 var4 = this.field8962[(int) (arg1 & (long) (this.field8960 - 1))];
        for (this.field8964 = var4.field767; this.field8964 != var4; this.field8964 = this.field8964.field767) {
            if (this.field8964.field762 == arg1) {
                class69 var5 = this.field8964;
                this.field8964 = this.field8964.field767;
                return var5;
            }
        }
        if (arg0) {
            this.field8979 = -1;
        }
        this.field8964 = null;
        return null;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)I", line = 177)
    public final int method3670(byte arg0) {
        field8969++;
        int var2 = -38 / ((arg0 - 86) / 40);
        return this.field8960;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)I", line = 191)
    public static final int method3671(int arg0, int arg1, int arg2) {
        field8970++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1 <= 39) {
            method3665(-25);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 214)
    public final void method3672(int arg0) {
        field8974++;
        for (int var2 = arg0; var2 < this.field8960; var2++) {
            class69 var3 = this.field8962[var2];
            while (true) {
                class69 var4 = var3.field767;
                if (var3 == var4) {
                    break;
                }
                var4.method527(-11229);
            }
        }
        this.field8964 = null;
        this.field8978 = null;
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)Lsja;", line = 251)
    public final class69 method3673(int arg0) {
        field8961++;
        if (arg0 >= -71) {
            method3665(20);
        }
        if (this.field8964 == null) {
            return null;
        }
        class69 var2 = this.field8962[(int) ((long) (this.field8960 - 1) & this.field8973)];
        while (this.field8964 != var2) {
            if (this.field8964.field762 == this.field8973) {
                class69 var3 = this.field8964;
                this.field8964 = this.field8964.field767;
                return var3;
            }
            this.field8964 = this.field8964.field767;
        }
        this.field8964 = null;
        return null;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V", line = 291)
    public class638(int arg0) {
        this.field8962 = new class69[arg0];
        this.field8960 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class69 var3 = this.field8962[var2] = new class69();
            var3.field760 = var3;
            var3.field767 = var3;
        }
    }
}
