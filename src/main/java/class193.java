import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class193 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field3109 = -1;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Z")
    public boolean field3118 = true;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Z")
    public boolean field3111 = true;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field3116 = 16;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field3114 = 0;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field3115 = -1;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Z")
    public boolean field3123 = false;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public int field3126 = 127;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public int field3124 = 128;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public int field3120 = 8;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public int field3121 = -1;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public int field3125 = 1190717;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lcq;")
    public class329 field3117;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILnn;)V", line = 6)
    public final void method1304(int arg0, class289 arg1) {
        while (true) {
            int var3 = arg1.method1858(-3256);
            if (var3 == 0) {
                field3128++;
                if (arg0 != -21420) {
                    this.method1309((byte) -125, -1, null);
                    return;
                }
                return;
            }
            this.method1309((byte) 119, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Lao;", line = 39)
    public static final class191 method1305(int arg0) {
        field3113++;
        if (arg0 != -23338) {
            field3110 = 51;
        }
        return class319.field4850;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 56)
    public final void method1306(int arg0) {
        if (this.field3115 == -1) {
            this.field3115 = this.field3121;
        }
        if (arg0 == 23020) {
            field3129++;
            this.field3120 = this.field3120 << 8 | this.field3119;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V", line = 72)
    public static final void method1307(int arg0) {
        field3122++;
        class496.method2995(class186.field2990.field2545, false);
        int var1 = (class509.field7427 >> 10) + (class496.field7292 >> 3);
        int var2 = (class432.field6435 >> 10) + (class212.field3378 >> 3);
        class211.field3371 = class15.field266.field6084 = 0;
        class15.field266.method2237((byte) 97, 8, 8);
        byte var3 = 18;
        class110.field2006 = new int[var3];
        class383.field5600 = new int[var3];
        class58.field1227 = new int[var3];
        class77.field1551 = new int[var3];
        class96.field1883 = new byte[var3][];
        class386.field5634 = new byte[var3][];
        class236.field3639 = new int[var3];
        class204.field3272 = new int[var3];
        int var4 = 5 % ((arg0 - 8) / 36);
        class321.field4905 = new int[var3][4];
        class87.field1782 = new byte[var3][];
        class299.field4526 = new byte[var3][];
        class533.field7730 = new byte[var3][];
        int var5 = 0;
        for (int var6 = (var1 - (class339.field5099 >> 4)) / 8; var6 <= (var1 + (class339.field5099 >> 4)) / 8; var6++) {
            for (int var9 = (var2 - (class484.field7129 >> 4)) / 8; var9 <= ((class484.field7129 >> 4) + var2) / 8; var9++) {
                int var10 = (var6 << 8) + var9;
                class58.field1227[var5] = var10;
                class77.field1551[var5] = class361.field5290.method2735("m" + var6 + "_" + var9, -50);
                class236.field3639[var5] = class361.field5290.method2735("l" + var6 + "_" + var9, -29);
                class110.field2006[var5] = class361.field5290.method2735("n" + var6 + "_" + var9, 101);
                class204.field3272[var5] = class361.field5290.method2735("um" + var6 + "_" + var9, 120);
                class383.field5600[var5] = class361.field5290.method2735("ul" + var6 + "_" + var9, -40);
                if (class110.field2006[var5] == -1) {
                    class77.field1551[var5] = -1;
                    class236.field3639[var5] = -1;
                    class204.field3272[var5] = -1;
                    class383.field5600[var5] = -1;
                }
                var5++;
            }
        }
        for (int var7 = var5; var7 < class110.field2006.length; var7++) {
            class110.field2006[var7] = -1;
            class77.field1551[var7] = -1;
            class236.field3639[var7] = -1;
            class204.field3272[var7] = -1;
            class383.field5600[var7] = -1;
        }
        byte var8;
        if (class466.field6932 == 1 || class466.field6932 == 2) {
            var8 = 3;
        } else {
            var8 = 7;
        }
        class379.method2333(false, var8, 1, var2, var1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[B)Lmd;", line = 170)
    public static final class384 method1308(int arg0, byte[] arg1) {
        field3127++;
        class384 var2 = new class384();
        class289 var3 = new class289(arg1);
        var3.field4399 = var3.field4408.length - 2;
        int var4 = var3.method1841((byte) 8);
        int var5 = var3.field4408.length - var4 - 12 - 2;
        var3.field4399 = var5;
        int var6 = var3.method1815((byte) -118);
        var2.field5616 = var3.method1841((byte) -15);
        var2.field5612 = var3.method1841((byte) 22);
        var2.field5611 = var3.method1841((byte) -122);
        if (arg0 <= 24) {
            method1307(20);
        }
        var2.field5609 = var3.method1841((byte) -120);
        int var7 = var3.method1858(-3256);
        if (var7 > 0) {
            var2.field5607 = new class249[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1841((byte) -121);
                class249 var10 = new class249(class184.method1256(var9, (byte) 83));
                var2.field5607[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1815((byte) -114);
                    int var12 = var3.method1815((byte) -86);
                    var10.method1618(new class100(var12), (long) var11, -1);
                }
            }
        }
        var3.field4399 = 0;
        var2.field5613 = var3.method1846((byte) -16);
        var2.field5614 = new String[var6];
        var2.field5615 = new int[var6];
        var2.field5606 = new int[var6];
        int var13 = 0;
        while (var3.field4399 < var5) {
            int var14 = var3.method1841((byte) 114);
            if (var14 == 3) {
                var2.field5614[var13] = var3.method1834(-17823).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field5615[var13] = var3.method1858(-3256);
            } else {
                var2.field5615[var13] = var3.method1815((byte) -119);
            }
            var2.field5606[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BILnn;)V", line = 258)
    private final void method1309(byte arg0, int arg1, class289 arg2) {
        field3112++;
        if (arg0 != 119) {
            this.method1309((byte) -9, -93, null);
        }
        if (arg1 == 1) {
            this.field3114 = class66.method577(arg0 - 120, arg2.method1863(-122));
        } else if (arg1 == 2) {
            this.field3121 = arg2.method1858(arg0 - 3375);
        } else if (arg1 == 3) {
            this.field3121 = arg2.method1841((byte) -121);
            if (this.field3121 == 65535) {
                this.field3121 = -1;
                return;
            }
        } else if (arg1 == 5) {
            this.field3111 = false;
        } else if (arg1 == 7) {
            this.field3109 = class66.method577(-1, arg2.method1863(126));
            return;
        } else if (arg1 == 8) {
            this.field3117.field4991 = this.field3119;
            return;
        } else if (arg1 == 9) {
            this.field3124 = arg2.method1841((byte) -121) << 0;
            return;
        } else if (arg1 == 10) {
            this.field3118 = false;
            return;
        } else if (arg1 == 11) {
            this.field3120 = arg2.method1858(-3256);
            return;
        } else if (arg1 == 12) {
            this.field3123 = true;
            return;
        } else {
            if (arg1 == 13) {
                this.field3125 = arg2.method1863(-53);
            } else if (arg1 == 14) {
                this.field3116 = arg2.method1858(-3256) << 0;
                return;
            } else if (arg1 == 15) {
                this.field3115 = arg2.method1841((byte) -123);
                if (this.field3115 == 65535) {
                    this.field3115 = -1;
                    return;
                }
                return;
            } else if (arg1 == 16) {
                this.field3126 = arg2.method1858(arg0 ^ 0xFFFFF33F);
                return;
            }
            return;
        }
    }
}
