import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class330 extends class176 {

    @OriginalMember(owner = "client!am", name = "w", descriptor = "Lnk;")
    public class2 field5104 = new class2();

    @OriginalMember(owner = "client!am", name = "I", descriptor = "Lui;")
    public class28 field5116 = new class28();

    @OriginalMember(owner = "client!am", name = "F", descriptor = "Lcl;")
    private class63 field5113;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5099 = "Created gameworld";

    @OriginalMember(owner = "client!am", name = "G", descriptor = "Ljava/lang/String;")
    public static String field5114 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!am", name = "D", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field5101;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "()I", line = 5)
    public final int method216() {
        field5110++;
        return 0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 15)
    public static void method2229(byte arg0) {
        field5114 = null;
        field5099 = null;
        if (arg0 != -43) {
            method2232(125);
        }
        field5101 = null;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V", line = 33)
    public final void method211(int arg0) {
        this.field5116.method211(arg0);
        for (class276 var2 = (class276) this.field5104.method10((byte) 111); var2 != null; var2 = (class276) this.field5104.method13((byte) -32)) {
            if (!this.field5113.method434((byte) -87, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4261) {
                        this.method2234(var3, var2, (byte) -121);
                        var2.field4261 -= var3;
                        break;
                    }
                    this.method2234(var2.field4261, var2, (byte) -113);
                    var3 -= var2.field4261;
                } while (!this.field5113.method433(var3, 0, 128, (int[]) null, var2));
            }
        }
        field5109++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "()Lic;", line = 68)
    public final class176 method220() {
        field5106++;
        class276 var1 = (class276) this.field5104.method10((byte) 122);
        if (var1 == null) {
            return null;
        } else if (var1.field4251 == null) {
            return this.method213();
        } else {
            return var1.field4251;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILwe;BII)Ljava/awt/Frame;", line = 87)
    public static final Frame method2230(int arg0, int arg1, class224 arg2, byte arg3, int arg4, int arg5) {
        field5111++;
        if (!arg2.method1522(71)) {
            return null;
        }
        if (arg0 == 0) {
            class288[] var6 = class24.method178(arg2, (byte) 99);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4414 == arg5 && var6[var8].field4406 == arg4 && (arg1 == 0 || var6[var8].field4402 == arg1) && (!var7 || arg0 < var6[var8].field4411)) {
                    arg0 = var6[var8].field4411;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class252 var9 = arg2.method1517(arg5, (byte) -58, arg1, arg4, arg0);
        while (var9.field3931 == 0) {
            class96.method657(10L, (byte) -115);
        }
        Frame var10 = (Frame) var9.field3929;
        if (var10 == null) {
            return null;
        } else if (var9.field3931 == 2) {
            class95.method655(true, arg2, var10);
            return null;
        } else {
            if (arg3 != 112) {
                method2233(96, 70);
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "([III)V", line = 156)
    public final void method217(int[] arg0, int arg1, int arg2) {
        field5115++;
        this.field5116.method217(arg0, arg1, arg2);
        for (class276 var4 = (class276) this.field5104.method10((byte) 112); var4 != null; var4 = (class276) this.field5104.method13((byte) -32)) {
            if (!this.field5113.method434((byte) -113, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field4261) {
                        this.method2231(arg0, var5, (byte) 126, var5 + var6, var6, var4);
                        var4.field4261 -= var6;
                        break;
                    }
                    this.method2231(arg0, var5, (byte) 126, var5 + var6, var4.field4261, var4);
                    var6 -= var4.field4261;
                    var5 += var4.field4261;
                } while (!this.field5113.method433(var6, var5, 128, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([IIBIILlj;)V", line = 196)
    private final void method2231(int[] arg0, int arg1, byte arg2, int arg3, int arg4, class276 arg5) {
        field5107++;
        if ((this.field5113.field937[arg5.field4249] & 0x4) != 0 && arg5.field4256 < 0) {
            int var7 = this.field5113.field882[arg5.field4249] / class282.field4337;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field4246) / var7;
                if (var8 > arg4) {
                    arg5.field4246 += arg4 * var7;
                    break;
                }
                arg5.field4251.method217(arg0, arg1, var8);
                arg4 -= var8;
                arg1 += var8;
                arg5.field4246 += var7 * var8 - 1048576;
                int var9 = class282.field4337 / 100;
                class331 var10 = arg5.field4251;
                int var11 = 262144 / var7;
                if (var9 > var11) {
                    var9 = var11;
                }
                if (this.field5113.field893[arg5.field4249] == 0) {
                    arg5.field4251 = class331.method2263(arg5.field4245, var10.method2249(), var10.method2248(), var10.method2264());
                } else {
                    arg5.field4251 = class331.method2263(arg5.field4245, var10.method2249(), 0, var10.method2264());
                    this.field5113.method417(arg5.field4254.field2546[arg5.field4242] < 0, 8, arg5);
                    arg5.field4251.method2266(var9, var10.method2248());
                }
                if (arg5.field4254.field2546[arg5.field4242] < 0) {
                    arg5.field4251.method2262(-1);
                }
                var10.method2259(var9);
                var10.method217(arg0, arg1, arg3 - arg1);
                if (var10.method2271()) {
                    this.field5116.method214(var10);
                }
            }
        }
        if (arg2 >= 125) {
            arg5.field4251.method217(arg0, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V", line = 257)
    public static final void method2232(int arg0) {
        field5117++;
        if (class312.field4940 > 0) {
            class173.method1177((byte) -74);
            return;
        }
        class193.field2914 = class308.field4851;
        if (arg0 < 102) {
            method2230(-43, 61, (class224) null, (byte) 5, -57, 54);
        }
        class308.field4851 = null;
        class231.method1583(40, (byte) -63);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V", line = 277)
    public static final void method2233(int arg0, int arg1) {
        field5105++;
        if (!class183.method1263(arg0 - 24687, arg1)) {
            return;
        }
        class207[] var2 = class219.field3487[arg1];
        if (arg0 != 24687) {
            method2233(10, -4);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class207 var4 = var2[var3];
            if (var4 != null) {
                var4.field3210 = 1;
                var4.field3289 = 0;
                var4.field3275 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "()Lic;", line = 314)
    public final class176 method213() {
        field5103++;
        class276 var1;
        do {
            var1 = (class276) this.field5104.method13((byte) -32);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4251 == null);
        return var1.field4251;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILlj;B)V", line = 337)
    private final void method2234(int arg0, class276 arg1, byte arg2) {
        field5112++;
        if ((this.field5113.field937[arg1.field4249] & 0x4) != 0 && arg1.field4256 < 0) {
            int var4 = this.field5113.field882[arg1.field4249] / class282.field4337;
            int var5 = (1048575 - (arg1.field4246 - var4)) / var4;
            arg1.field4246 = arg0 * var4 + arg1.field4246 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field5113.field893[arg1.field4249] == 0) {
                    arg1.field4251 = class331.method2263(arg1.field4245, arg1.field4251.method2249(), arg1.field4251.method2248(), arg1.field4251.method2264());
                } else {
                    arg1.field4251 = class331.method2263(arg1.field4245, arg1.field4251.method2249(), 0, arg1.field4251.method2264());
                    this.field5113.method417(arg1.field4254.field2546[arg1.field4242] < 0, 8, arg1);
                }
                if (arg1.field4254.field2546[arg1.field4242] < 0) {
                    arg1.field4251.method2262(-1);
                }
                arg0 = arg1.field4246 / var4;
            }
        }
        int var6 = -120 % ((arg2 + 55) / 56);
        arg1.field4251.method211(arg0);
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lcl;)V", line = 389)
    public class330(class63 arg0) {
        this.field5113 = arg0;
    }
}
