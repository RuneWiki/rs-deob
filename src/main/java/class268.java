import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class268 extends class273 {

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    private int field4134 = -1;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "[I")
    public static int[] field4124 = new int[4096];

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "J")
    public static long field4127 = 0L;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field4136 = 0;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "Z")
    public static boolean field4135 = false;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    private int field4128;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "I")
    private int field4138;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!uk", name = "ab", descriptor = "[I")
    private int[] field4140;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)I", line = 5)
    public final int method1773(int arg0) {
        field4131++;
        if (arg0 != 14980) {
            field4136 = -90;
        }
        return this.field4134;
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V", line = 16)
    public static void method1774(int arg0) {
        field4124 = null;
        if (arg0 != -23976) {
            method1776(-28);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 27)
    public static final String method1775(String arg0, byte arg1) {
        if (arg1 != -42) {
            method1776(-13);
        }
        field4130++;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class190.method1302(arg1 ^ 0xFFFFFDD6, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)V", line = 82)
    public static final void method1776(int arg0) {
        class51.field728 = -3;
        class27.field352 = arg0;
        class146.field2290 = 1;
        class15.field153 = 0;
        class269.field4144 = false;
        class230.field3716 = 0;
        field4129++;
        class123.field1933 = -1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BILgn;)V", line = 96)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field4139++;
        if (arg1 == 0) {
            this.field4134 = arg2.method1994(false);
        }
        if (arg0 <= 27) {
            field4135 = true;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILwe;)V", line = 110)
    public static final void method1777(int arg0, class224 arg1) {
        field4126++;
        class41 var2 = null;
        try {
            class252 var3 = arg1.method1509((byte) 62, "runescape");
            while (var3.field3931 == 0) {
                class96.method657(1L, (byte) -115);
            }
            if (arg0 != -27637) {
                method1776(-60);
            }
            if (var3.field3931 == 1) {
                var2 = (class41) var3.field3929;
                class303 var4 = class81.method559(true);
                var2.method299(0, -22486, var4.field4716, var4.field4679);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method302((byte) 96);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)[[I", line = 153)
    public final int[][] method170(int arg0, byte arg1) {
        if (arg1 != 68) {
            return (int[][]) ((int[][]) null);
        }
        field4132++;
        int[][] var3 = this.field4200.method539(152, arg0);
        if (this.field4200.field1147 && this.method1778(78)) {
            int var4 = this.field4138 * (class99.field1533 == this.field4128 ? arg0 : this.field4128 * arg0 / class99.field1533);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class27.field346 == this.field4138) {
                for (int var11 = 0; var11 < class27.field346; var11++) {
                    int var12 = this.field4140[var4++];
                    var7[var11] = class311.method2135(var12, 255) << 4;
                    var6[var11] = class311.method2135(var12, 65280) >> 4;
                    var5[var11] = class311.method2135(16711680, var12) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class27.field346; var8++) {
                    int var9 = this.field4138 * var8 / class27.field346;
                    int var10 = this.field4140[var4 + var9];
                    var7[var8] = class311.method2135(4080, var10 << 4);
                    var6[var8] = class311.method2135(65280, var10) >> 4;
                    var5[var8] = class311.method2135(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 218)
    public class268() {
        super(0, false);
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V", line = 229)
    public final void method1417(int arg0) {
        field4137++;
        super.method1417((short) arg0);
        this.field4140 = null;
    }

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)Z", line = 239)
    private final boolean method1778(int arg0) {
        if (arg0 < 54) {
            return false;
        }
        field4125++;
        if (this.field4140 != null) {
            return true;
        } else if (this.field4134 < 0) {
            return false;
        } else {
            int var2 = class27.field346;
            int var3 = class99.field1533;
            int var4 = class35.field446.method1563(this.field4134, (byte) -34).field1694 ? 64 : 128;
            this.field4140 = class35.field446.method1562(false, this.field4134, var4, var4, 1.0F, (byte) 110);
            this.field4128 = var4;
            this.field4138 = var4;
            class269.method1782(0, var2, var3);
            return this.field4140 != null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)V", line = 284)
    public static final void method1779(byte arg0) {
        field4133++;
        if (arg0 != -56) {
            field4124 = (int[]) null;
        }
        class91.field1386.method1296(255);
    }
}
