import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class212 extends class199 {

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "Lqe;")
    public static class37 field3231 = null;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "[I")
    public static int[] field3235 = new int[64];

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3230 = "slide:";

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "I")
    public static int field3234 = 0;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "Ll;")
    public static class133 field3221;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "Ljava/lang/String;")
    public String field3223;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "[C")
    public char[] field3222;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "[C")
    public char[] field3225;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "[I")
    public int[] field3215;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "[I")
    public int[] field3233;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 6)
    public static final void method1489(byte arg0) {
        int var1 = 104 / ((-arg0 - 2) / 38);
        field3216++;
        class251.field3968.method2174(-10385);
        class291.field4522.method2174(-10385);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BC)I", line = 21)
    public final int method1490(byte arg0, char arg1) {
        field3219++;
        if (this.field3215 == null) {
            return -1;
        } else if (arg0 <= 119) {
            return 13;
        } else {
            for (int var3 = 0; var3 < this.field3215.length; var3++) {
                if (this.field3225[var3] == arg1) {
                    return this.field3215[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLkh;)V", line = 55)
    public final void method1491(byte arg0, class166 arg1) {
        field3224++;
        while (true) {
            int var3 = arg1.method1178(0);
            if (var3 == 0) {
                int var4 = 15 % ((-arg0 - 55) / 48);
                return;
            }
            this.method1493(var3, (byte) -53, arg1);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V", line = 74)
    public static void method1492(byte arg0) {
        field3235 = null;
        field3230 = null;
        field3221 = null;
        int var1 = -80 % ((80 - arg0) / 32);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBLkh;)V", line = 103)
    private final void method1493(int arg0, byte arg1, class166 arg2) {
        if (arg1 >= -28) {
            this.field3222 = (char[]) null;
        }
        if (arg0 == 1) {
            this.field3223 = arg2.method1179((byte) 73);
        } else if (arg0 == 2) {
            int var4 = arg2.method1178(0);
            this.field3215 = new int[var4];
            this.field3225 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3215[var5] = arg2.method1151(-108);
                byte var6 = arg2.method1143(101);
                this.field3225[var5] = var6 == 0 ? 0 : class214.method1503(var6, (byte) 58);
            }
        } else if (arg0 == 3) {
            int var7 = arg2.method1178(0);
            this.field3233 = new int[var7];
            this.field3222 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3233[var8] = arg2.method1151(-117);
                byte var9 = arg2.method1143(-111);
                this.field3222[var8] = var9 == 0 ? 0 : class214.method1503(var9, (byte) 58);
            }
        } else if (arg0 != 4) {
        }
        field3228++;
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(I)V", line = 170)
    public final void method1494(int arg0) {
        field3232++;
        if (this.field3233 != null) {
            for (int var2 = 0; var2 < this.field3233.length; var2++) {
                this.field3233[var2] = class222.method1577(this.field3233[var2], 32768);
            }
        }
        if (this.field3215 != null) {
            for (int var3 = 0; var3 < this.field3215.length; var3++) {
                this.field3215[var3] = class222.method1577(this.field3215[var3], 32768);
            }
        }
        if (arg0 != 20196) {
            method1492((byte) 120);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(CI)I", line = 206)
    public final int method1495(char arg0, int arg1) {
        field3229++;
        if (this.field3233 == null) {
            return -1;
        }
        int var3 = 11 % ((arg1 - 42) / 38);
        for (int var4 = 0; var4 < this.field3233.length; var4++) {
            if (this.field3222[var4] == arg0) {
                return this.field3233[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(BI)V", line = 229)
    public static final void method1496(byte arg0, int arg1) {
        int var2 = 113 / ((21 - arg0) / 56);
        class307.field4768 = arg1;
        field3217++;
        class128.method928(3, true);
        class128.method928(4, true);
    }
}
