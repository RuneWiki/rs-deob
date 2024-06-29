import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class133 extends class472 {

    @OriginalMember(owner = "client!rt", name = "O", descriptor = "Z")
    public boolean field1962 = true;

    @OriginalMember(owner = "client!rt", name = "N", descriptor = "[I")
    public static int[] field1961 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rt", name = "G", descriptor = "[I")
    public static int[] field1954 = new int[4];

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!rt", name = "B", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!rt", name = "C", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!rt", name = "E", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!rt", name = "H", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!rt", name = "K", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!rt", name = "M", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!rt", name = "P", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!rt", name = "R", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!rt", name = "S", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!rt", name = "I", descriptor = "Lbe;")
    public class151 field1956;

    @OriginalMember(owner = "client!rt", name = "J", descriptor = "[I")
    public int[] field1957;

    @OriginalMember(owner = "client!rt", name = "Q", descriptor = "[I")
    private int[] field1964;

    @OriginalMember(owner = "client!rt", name = "F", descriptor = "[Ljava/lang/String;")
    private String[] field1953;

    @OriginalMember(owner = "client!rt", name = "D", descriptor = "[[I")
    private int[][] field1951;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZLfh;)V", line = 5)
    private final void method968(int arg0, boolean arg1, class194 arg2) {
        if (arg0 == 1) {
            this.field1953 = class454.method2784('<', 1, arg2.method1347(-116));
        } else if (arg0 == 2) {
            int var4 = arg2.method1337((byte) -8);
            this.field1957 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1957[var5] = arg2.method1396(-115);
            }
        } else if (arg0 == 3) {
            int var6 = arg2.method1337((byte) -123);
            this.field1964 = new int[var6];
            this.field1951 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1396(-119);
                class270 var9 = class14.method85(var8, -28358);
                if (var9 != null) {
                    this.field1964[var7] = var8;
                    this.field1951[var7] = new int[var9.field4271];
                    for (int var10 = 0; var10 < var9.field4271; var10++) {
                        this.field1951[var7][var10] = arg2.method1396(-124);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field1962 = false;
        }
        if (!arg1) {
            field1949++;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IB)V", line = 86)
    public static final void method969(int arg0, byte arg1) {
        if (arg1 != 123) {
            return;
        }
        if (class23.field262 == 1) {
            class330.field4979 = arg0;
        } else if (class23.field262 == 2 || class23.field262 == 3) {
            class350.field5219 = arg0;
        }
        field1958++;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 106)
    public final void method970(int arg0) {
        if (this.field1957 != null) {
            for (int var2 = 0; var2 < this.field1957.length; var2++) {
                this.field1957[var2] = class19.method118(this.field1957[var2], 32768);
            }
        }
        field1950++;
        int var3 = 0 % ((arg0 + 60) / 59);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLfh;[I)V", line = 126)
    public final void method971(byte arg0, class194 arg1, int[] arg2) {
        field1959++;
        if (arg0 <= 62) {
            this.method976(-95);
        }
        if (this.field1964 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1964.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = this.method975((byte) 113, var4).field4272;
            if (var5 > 0) {
                arg1.method1367(false, (long) arg2[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLfh;)V", line = 155)
    public final void method972(byte arg0, class194 arg1) {
        field1966++;
        if (arg0 >= -30) {
            return;
        }
        while (true) {
            int var3 = arg1.method1337((byte) -118);
            if (var3 == 0) {
                return;
            }
            this.method968(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILfh;)Ljava/lang/String;", line = 177)
    public final String method973(int arg0, class194 arg1) {
        if (arg0 > -118) {
            return null;
        }
        field1963++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1964 != null) {
            for (int var4 = 0; var4 < this.field1964.length; var4++) {
                var3.append(this.field1953[var4]);
                var3.append(this.field1956.method1086(this.field1951[var4], arg1.method1388(class14.method85(this.field1964[var4], -28358).field4273, 8), this.method975((byte) 113, var4), 0));
            }
        }
        var3.append(this.field1953[this.field1953.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)I", line = 207)
    public final int method974(int arg0, int arg1, int arg2) {
        field1960++;
        if (this.field1964 == null || arg0 < 0 || this.field1964.length < arg0) {
            return -1;
        } else {
            if (arg1 < 4) {
                field1954 = null;
            }
            return this.field1951[arg0] == null || arg2 < 0 || this.field1951[arg0].length < arg2 ? -1 : this.field1951[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(BI)Lsc;", line = 228)
    public final class270 method975(byte arg0, int arg1) {
        field1955++;
        if (this.field1964 == null || arg1 < 0 || arg1 > this.field1964.length) {
            return null;
        } else {
            if (arg0 != 113) {
                this.method971((byte) -78, null, null);
            }
            return class14.method85(this.field1964[arg1], -28358);
        }
    }

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "(I)Ljava/lang/String;", line = 245)
    public final String method976(int arg0) {
        field1948++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1953 == null) {
            return "";
        }
        var2.append(this.field1953[arg0]);
        for (int var3 = 1; var3 < this.field1953.length; var3++) {
            var2.append("...");
            var2.append(this.field1953[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V", line = 270)
    public static void method977(byte arg0) {
        if (arg0 == -42) {
            field1954 = null;
            field1961 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)I", line = 290)
    public final int method978(byte arg0) {
        field1965++;
        int var2 = -86 / (arg0 / 34);
        return this.field1964 == null ? 0 : this.field1964.length;
    }
}
