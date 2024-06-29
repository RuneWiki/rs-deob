import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class500 extends class583 {

    @OriginalMember(owner = "client!eaa", name = "t", descriptor = "I")
    public static int field7171 = 50;

    @OriginalMember(owner = "client!eaa", name = "y", descriptor = "[I")
    public static int[] field7176 = new int[field7171];

    @OriginalMember(owner = "client!eaa", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field7175 = new String[field7171];

    @OriginalMember(owner = "client!eaa", name = "B", descriptor = "[I")
    public static int[] field7179 = new int[field7171];

    @OriginalMember(owner = "client!eaa", name = "D", descriptor = "[I")
    public static int[] field7180 = new int[field7171];

    @OriginalMember(owner = "client!eaa", name = "s", descriptor = "[I")
    public static int[] field7170 = new int[field7171];

    @OriginalMember(owner = "client!eaa", name = "K", descriptor = "[I")
    public static int[] field7187 = new int[field7171];

    @OriginalMember(owner = "client!eaa", name = "F", descriptor = "[I")
    public static int[] field7182 = new int[field7171];

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!eaa", name = "u", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!eaa", name = "v", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!eaa", name = "G", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!eaa", name = "H", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!eaa", name = "I", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!eaa", name = "w", descriptor = "Ljava/lang/String;")
    public String field7174;

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "[C")
    public char[] field7169;

    @OriginalMember(owner = "client!eaa", name = "J", descriptor = "[C")
    public char[] field7186;

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "[I")
    public int[] field7177;

    @OriginalMember(owner = "client!eaa", name = "A", descriptor = "[I")
    public int[] field7178;

    @OriginalMember(owner = "client!eaa", name = "E", descriptor = "[[B")
    public static byte[][] field7181;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILee;)V", line = 17)
    public static final void method2972(int arg0, class675 arg1) {
        if (arg0 != 32768) {
            return;
        }
        for (int var2 = 0; var2 < class704.field9802; var2++) {
            int var3 = arg1.method3693(-90);
            int var4 = arg1.method3757((byte) -65);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class48.field568[var3] != null) {
                class48.field568[var3].field2183 = var4;
            }
        }
        field7184++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lee;II)V", line = 46)
    private final void method2973(class675 arg0, int arg1, int arg2) {
        if (arg2 != -12558) {
            return;
        }
        field7185++;
        if (arg1 == 1) {
            this.field7174 = arg0.method3697(-1);
        } else if (arg1 == 2) {
            int var7 = arg0.method3750((byte) 35);
            this.field7186 = new char[var7];
            this.field7177 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field7177[var8] = arg0.method3757((byte) -65);
                byte var9 = arg0.method3719(1854307120);
                this.field7186[var8] = var9 == 0 ? 0 : class174.method1114(var9, 0);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method3750((byte) 35);
            this.field7178 = new int[var4];
            this.field7169 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7178[var5] = arg0.method3757((byte) -65);
                byte var6 = arg0.method3719(1854307120);
                this.field7169[var5] = var6 == 0 ? 0 : class174.method1114(var6, arg2 + 12558);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(B)V", line = 112)
    public final void method2974(byte arg0) {
        if (this.field7178 != null) {
            for (int var2 = 0; var2 < this.field7178.length; var2++) {
                this.field7178[var2] = class325.method2116(this.field7178[var2], 32768);
            }
        }
        field7168++;
        if (this.field7177 != null) {
            for (int var3 = 0; var3 < this.field7177.length; var3++) {
                this.field7177[var3] = class325.method2116(this.field7177[var3], 32768);
            }
        }
        if (arg0 != 101) {
            method2972(-87, null);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(CI)I", line = 144)
    public final int method2975(char arg0, int arg1) {
        field7173++;
        if (this.field7178 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 <= 112) {
            method2972(101, null);
        }
        while (var3 < this.field7178.length) {
            if (this.field7169[var3] == arg0) {
                return this.field7178[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "(B)V", line = 167)
    public static void method2976(byte arg0) {
        field7181 = null;
        field7175 = null;
        field7179 = null;
        field7187 = null;
        field7180 = null;
        field7176 = null;
        field7182 = null;
        field7170 = null;
        if (arg0 < 54) {
            field7170 = null;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lee;I)V", line = 190)
    public final void method2977(class675 arg0, int arg1) {
        field7183++;
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                int var4 = -120 / ((-arg1 - 47) / 58);
                return;
            }
            this.method2973(arg0, var3, -12558);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BC)I", line = 224)
    public final int method2978(byte arg0, char arg1) {
        field7172++;
        if (arg0 != -43) {
            return -15;
        } else if (this.field7177 == null) {
            return -1;
        } else {
            for (int var3 = 0; var3 < this.field7177.length; var3++) {
                if (this.field7186[var3] == arg1) {
                    return this.field7177[var3];
                }
            }
            return -1;
        }
    }
}
