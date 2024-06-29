import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class353 extends class436 {

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    private int field4936 = 4;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    private int field4940 = 1024;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    private int field4950 = 8;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    private int field4944 = 1024;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    private int field4948 = 204;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "I")
    private int field4955 = 81;

    @OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
    private int field4957 = 0;

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "I")
    private int field4953 = 409;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "[I")
    public static int[] field4937 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field4935 = 0;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "[S")
    public static short[] field4942 = new short[256];

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "[Ljava/lang/String;")
    public static String[] field4952 = new String[100];

    @OriginalMember(owner = "client!th", name = "fb", descriptor = "Lrg;")
    public static class383 field4958 = null;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    private int field4946;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "I")
    private int field4949;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
    private int field4954;

    @OriginalMember(owner = "client!th", name = "db", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!th", name = "gb", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "Lqj;")
    public static class296 field4943;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Lpb;")
    public static class393 field4938;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "[I")
    private int[] field4933;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "[[I")
    private int[][] field4947;

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "[[I")
    private int[][] field4951;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
    public static final void method2284(int arg0) {
        ++field4941;
        if (class282.field3867 != 0) {
            try {
                if (~(++class76.field1194) < -2001) {
                    if (class199.field2749 != null) {
                        class199.field2749.method1593(arg0 ^ 2);
                        class199.field2749 = null;
                    }
                    if (class221.field2961 >= 1) {
                        class165.field2352 = -5;
                        class282.field3867 = 0;
                        return;
                    }
                    class282.field3867 = 1;
                    ++class221.field2961;
                    if (~class276.field3748 == ~class254.field3489) {
                        class254.field3489 = class281.field3863;
                    } else {
                        class254.field3489 = class276.field3748;
                    }
                    class76.field1194 = 0;
                }
                if (class282.field3867 == arg0) {
                    class311.field4250 = class204.field2772.method2239(class7.field115, class254.field3489, 0);
                    class282.field3867 = 2;
                }
                if (~class282.field3867 == -3) {
                    if (~class311.field4250.field4068 == -3) {
                        throw new IOException();
                    }
                    if (~class311.field4250.field4068 != -2) {
                        return;
                    }
                    class199.field2749 = new class258((Socket) class311.field4250.field4070, class204.field2772);
                    class311.field4250 = null;
                    class199.field2749.method1579(0, 5000, class442.field6400.field5258, class442.field6400.field5273);
                    if (class326.field4451 != null) {
                        class326.field4451.method1475(923);
                    }
                    if (class64.field993 != null) {
                        class64.field993.method1475(923);
                    }
                    int var1 = class199.field2749.method1591(arg0 ^ 1);
                    if (class326.field4451 != null) {
                        class326.field4451.method1475(923);
                    }
                    if (class64.field993 != null) {
                        class64.field993.method1475(923);
                    }
                    if (~var1 != -22) {
                        class282.field3867 = 0;
                        class165.field2352 = var1;
                        class199.field2749.method1593(arg0 ^ 2);
                        class199.field2749 = null;
                        return;
                    }
                    class282.field3867 = 3;
                }
                if (class282.field3867 == 3) {
                    if (~class199.field2749.method1580(1031) > -2) {
                        return;
                    }
                    class67.field1047 = new String[class199.field2749.method1591(0)];
                    class282.field3867 = 4;
                }
                if (class282.field3867 == 4) {
                    if (~class199.field2749.method1580(arg0 ^ 1030) <= ~(class67.field1047.length * 8)) {
                        class393.field5747.field5273 = 0;
                        class199.field2749.method1584(class67.field1047.length * 8, class393.field5747.field5258, 118, 0);
                        for (int var2 = 0; ~class67.field1047.length < ~var2; ++var2) {
                            class67.field1047[var2] = class261.method1608(-107, class393.field5747.method2397((byte) 126));
                        }
                        class282.field3867 = 0;
                        class165.field2352 = 21;
                        class199.field2749.method1593(3);
                        class199.field2749 = null;
                    }
                }
            } catch (IOException var3) {
                if (class199.field2749 != null) {
                    class199.field2749.method1593(3);
                    class199.field2749 = null;
                }
                if (~class221.field2961 <= -2) {
                    class165.field2352 = -4;
                    class282.field3867 = 0;
                } else {
                    if (class276.field3748 == class254.field3489) {
                        class254.field3489 = class281.field3863;
                    } else {
                        class254.field3489 = class276.field3748;
                    }
                    class282.field3867 = 1;
                    ++class221.field2961;
                    class76.field1194 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class353() {
        super(0, true);
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(B)V")
    private final void method2285(byte arg0) {
        int var2 = -14 / ((arg0 - 56) / 33);
        ++field4959;
        Random var3 = new Random((long) this.field4950);
        this.field4954 = 4096 / this.field4950;
        this.field4946 = this.field4955 / 2;
        this.field4949 = 4096 / this.field4936;
        int var4 = this.field4949 / 2;
        this.field4951 = new int[this.field4950][this.field4936 + 1];
        this.field4947 = new int[this.field4950][this.field4936];
        this.field4933 = new int[this.field4950 + 1];
        int var5 = this.field4954 / 2;
        this.field4933[0] = 0;
        for (int var6 = 0; this.field4950 > var6; ++var6) {
            if (var6 > 0) {
                int var7 = this.field4954;
                int var8 = (-2048 + class99.method704(var3, 4096, (byte) -10)) * this.field4948 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field4933[var6] = this.field4933[var6 + -1] + var9;
            }
            this.field4951[var6][0] = 0;
            for (int var10 = 0; ~this.field4936 < ~var10; ++var10) {
                if (var10 > 0) {
                    int var11 = this.field4949;
                    int var12 = (class99.method704(var3, 4096, (byte) -10) + -2048) * this.field4953 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field4951[var6][var10] = this.field4951[var6][var10 + -1] + var13;
                }
                this.field4947[var6][var10] = this.field4940 > 0 ? -class99.method704(var3, this.field4940, (byte) -10) + 4096 : 4096;
            }
            this.field4951[var6][this.field4936] = 4096;
        }
        this.field4933[this.field4950] = 4096;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        ++field4934;
        if (arg1 != 18338) {
            method2284(-52);
        }
        int[] var3 = super.field6258.method2688((byte) -108, arg0);
        if (super.field6258.field6138) {
            int var4 = 0;
            int var5;
            for (var5 = class32.field499[arg0] + this.field4957; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field4950 && var5 >= this.field4933[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field4933[var4];
            int var9 = this.field4933[var4 + -1];
            if (var5 > this.field4946 + var9 && -this.field4946 + var8 > var5) {
                for (int var10 = 0; ~var10 > ~class43.field653; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field4944 : -this.field4944;
                    int var13;
                    for (var13 = (this.field4949 * var12 >> 12) + class249.field3455[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field4936 && this.field4951[var6][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field4951[var6][var14];
                    int var16 = this.field4951[var6][var11];
                    if (~var13 < ~(this.field4946 + var15) && ~(-this.field4946 + var16) < ~var13) {
                        var3[var10] = this.field4947[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class150.method1021(var3, 0, class43.field653, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
    public final void method44(int arg0) {
        ++field4956;
        if (arg0 != -14) {
            this.field4950 = 15;
        }
        this.method2285((byte) 94);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg0 != 34) {
            this.field4944 = 52;
        }
        ++field4945;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field4940 = arg2.method2403((byte) 73);
                                    }
                                } else {
                                    this.field4955 = arg2.method2403((byte) 64);
                                }
                            } else {
                                this.field4957 = arg2.method2403((byte) 81);
                            }
                        } else {
                            this.field4944 = arg2.method2403((byte) 109);
                        }
                    } else {
                        this.field4948 = arg2.method2403((byte) 113);
                    }
                } else {
                    this.field4953 = arg2.method2403((byte) 125);
                }
            } else {
                this.field4950 = arg2.method2429(arg0 + -34);
            }
        } else {
            this.field4936 = arg2.method2429(0);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjj;)V")
    public static final void method2286(int arg0, class61 arg1) {
        ++field4939;
        int var2 = -class35.field541 + arg1.field912;
        int var3 = arg1.field852 * 128 - -(64 * arg1.method410((byte) 35));
        int var4 = arg1.field901 * 128 + 64 * arg1.method410((byte) 37);
        arg1.field6192 += (var4 - arg1.field6192) / var2;
        if (arg0 == 8192) {
            arg1.field6197 += (-arg1.field6197 + var3) / var2;
            arg1.field942 = 0;
            if (~arg1.field873 == -1) {
                arg1.method395(0, 8192);
            }
            if (arg1.field873 == 1) {
                arg1.method395(0, 12288);
            }
            if (~arg1.field873 == -3) {
                arg1.method395(0, 0);
            }
            if (~arg1.field873 == -4) {
                arg1.method395(arg0 ^ 8192, 4096);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
    public static void method2287(int arg0) {
        if (arg0 <= 90) {
            method2286(-67, (class61) null);
        }
        field4942 = null;
        field4943 = null;
        field4952 = null;
        field4938 = null;
        field4958 = null;
        field4937 = null;
    }
}
