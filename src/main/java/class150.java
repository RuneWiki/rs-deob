import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class150 extends class29 {

    @OriginalMember(owner = "client!la", name = "V", descriptor = "Z")
    public boolean field2042 = true;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "[I")
    public static int[] field2039 = new int[4];

    @OriginalMember(owner = "client!la", name = "J", descriptor = "Lbn;")
    public static class160 field2030 = new class160(20, 4);

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field2043 = 0;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "[I")
    public static int[] field2045 = new int[14];

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "Lqm;")
    public static class297 field2032;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "[I")
    public int[] field2034;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "[I")
    private int[] field2038;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "[Ljava/lang/String;")
    private String[] field2041;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "[[I")
    private int[][] field2040;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BII)I")
    public final int method1026(byte arg0, int arg1, int arg2) {
        field2029++;
        if (this.field2038 == null || arg1 < 0 || this.field2038.length < arg1) {
            return -1;
        } else if (this.field2040[arg1] == null || arg2 < 0 || this.field2040[arg1].length < arg2) {
            return -1;
        } else if (arg0 == 103) {
            return this.field2040[arg1][arg2];
        } else {
            return -21;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(BI)V")
    public static final void method1027(byte arg0, int arg1) {
        for (class264 var2 = class51.field635.method608((byte) 125); var2 != null; var2 = class51.field635.method604(-106)) {
            if ((long) arg1 == (var2.field3907 >> 48 & 0xFFFFL)) {
                var2.method1820(-25246);
            }
        }
        int var3 = -49 % ((29 - arg0) / 63);
        field2024++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILat;)Ljava/lang/String;")
    public final String method1028(int arg0, class256 arg1) {
        field2036++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2038 != null) {
            for (int var4 = 0; var4 < this.field2038.length; var4++) {
                var3.append(this.field2041[var4]);
                var3.append(class208.method1437(arg1.method1751(1, class106.field1435[this.field2038[var4]]), this.field2040[var4], false, this.field2038[var4]));
            }
        }
        var3.append(this.field2041[this.field2041.length - 1]);
        if (arg0 != 29465) {
            this.field2034 = null;
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z[ILat;)V")
    public final void method1029(boolean arg0, int[] arg1, class256 arg2) {
        field2033++;
        if (arg0) {
            this.field2038 = null;
        }
        if (this.field2038 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2038.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = class429.field6238[this.method1033(var4, (byte) 79)];
            if (var5 > 0) {
                arg2.method1717(128, (long) arg1[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lat;I)V")
    public final void method1030(class256 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field2035++;
        while (true) {
            int var3 = arg0.method1738((byte) 122);
            if (var3 == 0) {
                return;
            }
            this.method1034(var3, arg0, (byte) 71);
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(B)I")
    public final int method1031(byte arg0) {
        field2037++;
        if (arg0 < 104) {
            return -79;
        } else if (this.field2038 == null) {
            return 0;
        } else {
            return this.field2038.length;
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method1032(int arg0) {
        field2027++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2041 == null) {
            return "";
        }
        var2.append(this.field2041[0]);
        for (int var3 = arg0; var3 < this.field2041.length; var3++) {
            var2.append("...");
            var2.append(this.field2041[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)I")
    public final int method1033(int arg0, byte arg1) {
        int var3 = 28 / ((arg1 - 5) / 45);
        field2025++;
        return this.field2038 == null || arg0 < 0 || arg0 > this.field2038.length ? -1 : this.field2038[arg0];
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILat;B)V")
    private final void method1034(int arg0, class256 arg1, byte arg2) {
        if (arg2 != 71) {
            field2045 = null;
        }
        if (arg0 == 1) {
            this.field2041 = class278.method1886('<', -19369, arg1.method1715(true));
        } else if (arg0 == 2) {
            int var4 = arg1.method1738((byte) 60);
            this.field2034 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2034[var5] = arg1.method1767(1930493576);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method1738((byte) -118);
            this.field2040 = new int[var6][];
            this.field2038 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1767(arg2 ^ 0x7310FECF);
                this.field2038[var7] = var8;
                this.field2040[var7] = new int[class315.field4617[var8]];
                for (int var9 = 0; var9 < class315.field4617[var8]; var9++) {
                    this.field2040[var7][var9] = arg1.method1767(1930493576);
                }
            }
        } else if (arg0 == 4) {
            this.field2042 = false;
        }
        field2031++;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(B)V")
    public final void method1035(byte arg0) {
        if (arg0 != -126) {
            this.method1032(39);
        }
        field2044++;
        if (this.field2034 != null) {
            for (int var2 = 0; var2 < this.field2034.length; var2++) {
                this.field2034[var2] = class259.method1785(this.field2034[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(B)V")
    public static void method1036(byte arg0) {
        if (arg0 >= -98) {
            method1027((byte) -63, -6);
        }
        field2039 = null;
        field2045 = null;
        field2030 = null;
        field2032 = null;
    }
}
