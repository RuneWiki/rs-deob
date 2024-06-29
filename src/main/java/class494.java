import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class494 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Z")
    private boolean field7039 = false;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public int field7046 = 0;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public int field7051 = 0;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field7054 = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    private int field7040;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public int field7045;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public int field7047;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public int field7048;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public int field7049;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public int field7052;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public int field7053;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public int field7055;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public int field7056;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public int field7059;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "J")
    public long field7043;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[[S")
    public static short[][] field7042;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLud;I)V", line = 8)
    private final void method2972(byte arg0, class35 arg1, int arg2) {
        if (arg0 != 34) {
            this.method2974(null, (byte) -77);
        }
        if (arg2 == 1) {
            this.field7040 = arg1.method253(-13900);
        } else if (arg2 == 2) {
            arg1.method273(255);
        } else if (arg2 == 3) {
            this.field7052 = arg1.method234((byte) -111);
            this.field7048 = arg1.method234((byte) -128);
            this.field7047 = arg1.method234((byte) -124);
        } else if (arg2 == 4) {
            this.field7059 = arg1.method273(255);
            this.field7045 = arg1.method234((byte) -108);
        } else if (arg2 == 6) {
            this.field7049 = arg1.method273(255);
        } else if (arg2 == 8) {
            this.field7046 = 1;
        } else if (arg2 == 9) {
            this.field7051 = 1;
        } else if (arg2 == 10) {
            this.field7039 = true;
        }
        field7044++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z", line = 63)
    public static final boolean method2973(int arg0, int arg1, int arg2) {
        int var3 = -69 % ((arg0 + 7) / 53);
        field7050++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lud;B)V", line = 74)
    public final void method2974(class35 arg0, byte arg1) {
        int var3 = 103 / ((6 - arg1) / 60);
        field7041++;
        while (true) {
            int var4 = arg0.method273(255);
            if (var4 == 0) {
                return;
            }
            this.method2972((byte) 34, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 116)
    public final void method2975(int arg0) {
        this.field7056 = class316.field4490[this.field7040 << 3];
        field7038++;
        long var2 = (long) this.field7052;
        long var4 = (long) this.field7048;
        long var6 = (long) this.field7047;
        this.field7055 = (int) Math.sqrt((double) (var2 * var2 + var6 * var6 + (var4 * var4)));
        if (this.field7045 == 0) {
            this.field7045 = 1;
        }
        if (this.field7059 == 0) {
            this.field7043 = 2147483647L;
        } else if (this.field7059 == 1) {
            this.field7043 = (this.field7055 * 8 / this.field7045);
            this.field7043 *= this.field7043;
        } else if (this.field7059 == 2) {
            this.field7043 = (this.field7055 * 8 / this.field7045);
        }
        int var8 = -26 / ((arg0 + 48) / 60);
        if (this.field7039) {
            this.field7055 *= -1;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V", line = 160)
    public static final void method2976(byte arg0) {
        int var1 = 36 / ((-arg0 - 42) / 40);
        field7058++;
        class117.field1849 = new class50[class127.field1923.method1454(-1)][];
        class463.field6662 = new class50[class127.field1923.method1454(-1)][];
        class525.field7464 = new boolean[class127.field1923.method1454(-1)];
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLak;[II)V", line = 176)
    public static final void method2977(boolean arg0, class349 arg1, int[] arg2, int arg3) {
        if (arg1.field885 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field885.length; var5++) {
                if (arg1.field885[var5] != arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field944 != -1) {
                class718 var6 = class698.field9806.method851(arg1.field944, -2);
                int var7 = var6.field10061;
                if (var7 == 1) {
                    arg1.field914 = 1;
                    arg1.field943 = 0;
                    arg1.field904 = 0;
                    arg1.field950 = 0;
                    arg1.field911 = arg3;
                    if (!arg1.field892) {
                        class749.method4165(arg1.field950, (byte) 100, var6, arg1);
                    }
                }
                if (var7 == 2) {
                    arg1.field943 = 0;
                }
            }
        }
        field7057++;
        boolean var8 = arg0;
        for (int var9 = 0; var9 < arg2.length; var9++) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg1.field885 == null || arg1.field885[var9] == -1 || class698.field9806.method851(arg2[var9], -2).field10064 >= class698.field9806.method851(arg1.field885[var9], -2).field10064) {
                arg1.field885 = arg2;
                arg1.field911 = arg3;
                break;
            }
        }
        if (var8) {
            arg1.field885 = arg2;
            arg1.field911 = arg3;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 257)
    public static void method2978(int arg0) {
        int var1 = 0 % ((arg0 - 23) / 34);
        field7042 = null;
    }
}
