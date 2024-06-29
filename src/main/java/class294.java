import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class294 extends class177 {

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "[I")
    public static int[] field4955 = new int[32];

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "[S")
    public static short[] field4962 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lbe;")
    private static class283 field4968;

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "Lbe;")
    public static class283 field4969;

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "Ltf;")
    public static class242 field4970;

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "Lbe;")
    public static class283 field4972;

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "[Lwf;")
    public static class54[] field4971;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "J")
    public static long field4964;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "Lbe;")
    public class283 field4959;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "[I")
    public int[] field4957;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "[I")
    public int[] field4960;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "[I")
    public int[] field4961;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "[I")
    public int[] field4963;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lfe;IB)V", line = 9)
    private final void method1987(class229 arg0, int arg1, byte arg2) {
        if (arg2 <= 25) {
            this.method1994(29, (class229) null);
        }
        if (arg1 == 1) {
            this.field4959 = arg0.method1549(true);
        } else if (arg1 == 2) {
            int var7 = arg0.method1535((byte) 73);
            this.field4960 = new int[var7];
            this.field4957 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4960[var8] = arg0.method1496(true);
                int var9 = arg0.method1535((byte) 103);
                if (var9 == 0) {
                    this.field4957[var8] = -1;
                } else {
                    this.field4957[var8] = var9;
                }
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method1535((byte) 109);
            this.field4963 = new int[var4];
            this.field4961 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4963[var5] = arg0.method1496(true);
                int var6 = arg0.method1535((byte) 86);
                if (var6 == 0) {
                    this.field4961[var5] = -1;
                } else {
                    this.field4961[var5] = var6;
                }
            }
        } else if (arg1 != 4) {
        }
        field4958++;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V", line = 85)
    public final void method1988(byte arg0) {
        if (this.field4963 != null) {
            for (int var2 = 0; var2 < this.field4963.length; var2++) {
                this.field4963[var2] = class53.method337(this.field4963[var2], 32768);
            }
        }
        int var3 = 71 / ((7 - arg0) / 35);
        if (this.field4960 != null) {
            for (int var4 = 0; var4 < this.field4960.length; var4++) {
                this.field4960[var4] = class53.method337(this.field4960[var4], 32768);
            }
        }
        field4956++;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4955[var1] = var0 - 1;
            var0 += var0;
        }
        field4968 = class153.method941(127, "Members only world");
        field4969 = field4968;
        field4970 = new class242(5);
        field4972 = class153.method941(3, "Lade Konfiguration )2 ");
        field4971 = new class54[27];
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIB)V", line = 133)
    public static final void method1989(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class72 var5 = class25.method174(arg1, (byte) 110, 10);
        field4953++;
        var5.method477(-128);
        var5.field1262 = arg0;
        if (arg4 < 45) {
            field4962 = (short[]) null;
        }
        var5.field1268 = arg3;
        var5.field1265 = arg2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I", line = 157)
    public static final int method1990(int arg0, int arg1) {
        field4967++;
        return arg0 == 29373 ? arg1 >> 18 & 0x7 : -97;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)I", line = 173)
    public final int method1991(int arg0, int arg1) {
        field4966++;
        if (this.field4960 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field4960.length; var3++) {
            if (this.field4957[var3] == arg0) {
                return this.field4960[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)I", line = 202)
    public final int method1992(int arg0, int arg1) {
        field4954++;
        if (this.field4963 == null) {
            return -1;
        } else if (arg1 == 14082) {
            for (int var3 = 0; var3 < this.field4963.length; var3++) {
                if (this.field4961[var3] == arg0) {
                    return this.field4963[var3];
                }
            }
            return -1;
        } else {
            return -112;
        }
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V", line = 225)
    public static void method1993(int arg0) {
        field4971 = null;
        if (arg0 != 0) {
            method1990(-124, 36);
        }
        field4972 = null;
        field4969 = null;
        field4955 = null;
        field4968 = null;
        field4970 = null;
        field4962 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILfe;)V", line = 242)
    public final void method1994(int arg0, class229 arg1) {
        if (arg0 != -12453) {
            method1989(-75, 19, -56, -51, (byte) 40);
        }
        field4965++;
        while (true) {
            int var3 = arg1.method1535((byte) 105);
            if (var3 == 0) {
                return;
            }
            this.method1987(arg1, var3, (byte) 54);
        }
    }
}
