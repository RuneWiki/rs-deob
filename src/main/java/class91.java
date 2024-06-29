import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class91 extends class166 {

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
    public int field1963 = 0;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "Z")
    public boolean field1957 = false;

    @OriginalMember(owner = "client!je", name = "db", descriptor = "Z")
    public boolean field1967 = false;

    @OriginalMember(owner = "client!je", name = "lb", descriptor = "I")
    public int field1975 = 0;

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "I")
    public static int field1966 = 0;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "[J")
    public static long[] field1959 = new long[1000];

    @OriginalMember(owner = "client!je", name = "jb", descriptor = "[I")
    private static int[] field1973 = class1.field8;

    @OriginalMember(owner = "client!je", name = "ib", descriptor = "Z")
    public static boolean field1972 = false;

    @OriginalMember(owner = "client!je", name = "mb", descriptor = "[I")
    private static int[] field1976 = class1.field21;

    @OriginalMember(owner = "client!je", name = "pb", descriptor = "I")
    public static int field1979 = 0;

    @OriginalMember(owner = "client!je", name = "ob", descriptor = "I")
    public static int field1978 = 0;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "S")
    public short field1958;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "S")
    public short field1961;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "S")
    public short field1965;

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "S")
    public short field1968;

    @OriginalMember(owner = "client!je", name = "fb", descriptor = "S")
    public short field1969;

    @OriginalMember(owner = "client!je", name = "hb", descriptor = "S")
    public short field1971;

    @OriginalMember(owner = "client!je", name = "nb", descriptor = "S")
    public short field1977;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "[I")
    public int[] field1962;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "[I")
    public int[] field1964;

    @OriginalMember(owner = "client!je", name = "gb", descriptor = "[I")
    public int[] field1970;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "[[I")
    public int[][] field1960;

    @OriginalMember(owner = "client!je", name = "kb", descriptor = "[[I")
    public int[][] field1974;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lj;I)V")
    public abstract void method186(class86 arg0, int arg1);

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(III)V")
    public final void method632(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1963; ++var4) {
            this.field1964[var4] = this.field1964[var4] * arg0 / 128;
            this.field1962[var4] = this.field1962[var4] * arg1 / 128;
            this.field1970[var4] = this.field1970[var4] * arg2 / 128;
        }
        this.field1967 = false;
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
    public final void method633(int arg0) {
        int var2 = field1976[arg0];
        int var3 = field1973[arg0];
        for (int var4 = 0; var4 < this.field1963; ++var4) {
            int var5 = this.field1962[var4] * var3 - this.field1970[var4] * var2 >> 16;
            this.field1970[var4] = this.field1970[var4] * var3 + this.field1962[var4] * var2 >> 16;
            this.field1962[var4] = var5;
        }
        this.field1967 = false;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
    public static void method634() {
        field1976 = null;
        field1973 = null;
        field1959 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()V")
    public final void method635() {
        if (!this.field1967) {
            this.field1967 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field1963; ++var9) {
                int var10 = this.field1964[var9];
                int var11 = this.field1962[var9];
                int var12 = this.field1970[var9];
                if (var10 < var1) {
                    var1 = var10;
                }
                if (var10 > var4) {
                    var4 = var10;
                }
                if (var11 < var2) {
                    var2 = var11;
                }
                if (var11 > var5) {
                    var5 = var11;
                }
                if (var12 < var3) {
                    var3 = var12;
                }
                if (var12 > var6) {
                    var6 = var12;
                }
                int var13 = var10 * var10 + var12 * var12;
                if (var13 > var7) {
                    var7 = var13;
                }
                int var14 = var11 * var11 + var10 * var10 + var12 * var12;
                if (var14 > var8) {
                    var8 = var14;
                }
            }
            this.field1969 = (short) var1;
            this.field1958 = (short) var4;
            super.field3376 = (short) var2;
            this.field1965 = (short) var5;
            this.field1968 = (short) var3;
            this.field1977 = (short) var6;
            this.field1971 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field1961 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)Lje;")
    public abstract class91 method176(boolean arg0);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()V")
    public final void method636() {
        for (int var1 = 0; var1 < this.field1963; ++var1) {
            int var2 = this.field1964[var1];
            this.field1964[var1] = this.field1970[var1];
            this.field1970[var1] = -var2;
        }
        this.field1967 = false;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()V")
    public final void method637() {
        for (int var1 = 0; var1 < this.field1963; ++var1) {
            int var2 = this.field1970[var1];
            this.field1970[var1] = this.field1964[var1];
            this.field1964[var1] = -var2;
        }
        this.field1967 = false;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(III)V")
    public final void method638(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1963; ++var4) {
            this.field1964[var4] += arg0;
            this.field1962[var4] += arg1;
            this.field1970[var4] += arg2;
        }
        this.field1967 = false;
    }

    @OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V")
    public final void method639(int arg0) {
        int var2 = field1976[arg0];
        int var3 = field1973[arg0];
        for (int var4 = 0; var4 < this.field1963; ++var4) {
            int var5 = this.field1964[var4] * var3 + this.field1962[var4] * var2 >> 16;
            this.field1962[var4] = this.field1962[var4] * var3 - this.field1964[var4] * var2 >> 16;
            this.field1964[var4] = var5;
        }
        this.field1967 = false;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "()V")
    public final void method640() {
        for (int var1 = 0; var1 < this.field1963; ++var1) {
            this.field1964[var1] = -this.field1964[var1];
            this.field1970[var1] = -this.field1970[var1];
        }
        this.field1967 = false;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([[IIIIZI)Lje;")
    public abstract class91 method187(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lj;ILj;I[I)V")
    public abstract void method175(class86 arg0, int arg1, class86 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(Z)Lje;")
    public abstract class91 method179(boolean arg0);

    @OriginalMember(owner = "client!je", name = "f", descriptor = "()I")
    public final int method641() {
        this.method635();
        return this.field1971;
    }
}
