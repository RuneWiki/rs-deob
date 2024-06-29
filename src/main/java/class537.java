import java.awt.Component;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class537 {

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    private int field7850 = 32;

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "Z")
    private boolean field7859 = false;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "J")
    private long field7851 = class430.method3299(71);

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    private int field7870 = 0;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "J")
    private long field7874 = 0L;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    private int field7877 = 0;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    private int field7871 = 0;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    private int field7869 = 0;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "[Lfq;")
    private class213[] field7875 = new class213[8];

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "J")
    private long field7879 = 0L;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "Z")
    private boolean field7881 = true;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "[Lfq;")
    private class213[] field7876 = new class213[8];

    @OriginalMember(owner = "client!jq", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field7882 = new String[] { method4056(method4055("!Wml\u0007")), method4056(method4055("!Wmj\u0007")), method4056(method4055("!Wmc\u0007")), method4056(method4055("!Wmk\u0007")), method4056(method4055("!Wmi\u0007")), method4056(method4055("!Wmv\u0007")), method4056(method4055("!Wmd\u0007")), method4056(method4055("!Wmh\u0007")), method4056(method4055("%S/J")), method4056(method4055("0\bm\bR")), method4056(method4055("!Wmo\u0007")), method4056(method4055("!Wmb\u0007")), method4056(method4055("!Wme\u0007")), method4056(method4055("!Wmn\u0007")), method4056(method4055("!Wmg\u0007")), method4056(method4055("!Wm`\u0007")), method4056(method4055("!Wmm\u0007")) };

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field7852 = 0;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    private int field7872;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    public int field7873;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public int field7878;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "Lfq;")
    private class213 field7867;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "[I")
    public int[] field7861;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "()V", line = 3)
    public void method121() throws Exception {
        try {
            field7860++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7882[2] + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILfq;B)V", line = 11)
    private final void method4045(int arg0, class213 arg1, byte arg2) {
        try {
            field7854++;
            int var4 = arg0 >> 5;
            class213 var5 = this.field7876[var4];
            if (var5 == null) {
                this.field7875[var4] = arg1;
            } else {
                var5.field3262 = arg1;
            }
            if (arg2 != -20) {
                this.method4046((byte) -77);
            }
            this.field7876[var4] = arg1;
            arg1.field3263 = arg0;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7882[10] + arg0 + ',' + (arg1 == null ? field7882[8] : field7882[9]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V", line = 33)
    public final synchronized void method4046(byte arg0) {
        try {
            field7865++;
            if (arg0 >= -4) {
                field7852 = -15;
            }
            this.field7881 = true;
            try {
                this.method121();
            } catch (Exception var3) {
                this.method123();
                this.field7874 = class430.method3299(80) + 2000L;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7882[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "()V", line = 52)
    public void method123() {
        try {
            field7864++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7882[12] + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 61)
    public void method119(Component arg0) throws Exception {
        try {
            field7863++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7882[15] + (arg0 == null ? field7882[8] : field7882[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Z", line = 71)
    public static final boolean method4047(int arg0, int arg1) {
        try {
            field7857++;
            if (arg1 > -56) {
                field7852 = 57;
            }
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7882[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 83)
    public void method122(int arg0) throws Exception {
        try {
            field7868++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7882[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "([II)V", line = 91)
    private final void method4048(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class247.field3844) {
            var3 = arg1 << 1;
        }
        class467.method3557(arg0, 0, var3);
        this.field7869 -= arg1;
        if (this.field7867 != null && this.field7869 <= 0) {
            this.field7869 += class598.field8803 >> 4;
            class260.method2189(this.field7867, (byte) -108);
            this.method4045(this.field7867.method1870(), this.field7867, (byte) -20);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class213 var10 = null;
                        class213 var11 = this.field7875[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class32 var12 = var11.field3261;
                                if (var12 == null || var12.field368 <= var8) {
                                    var11.field3264 = true;
                                    int var13 = var11.method1152();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field368 += var13;
                                    }
                                    if (var4 >= this.field7850) {
                                        break label107;
                                    }
                                    class213 var14 = var11.method1158();
                                    if (var14 != null) {
                                        int var15 = var11.field3263;
                                        while (var14 != null) {
                                            this.method4045(var15 * var14.method1870() >> 8, var14, (byte) -20);
                                            var14 = var11.method1151();
                                        }
                                    }
                                    class213 var16 = var11.field3262;
                                    var11.field3262 = null;
                                    if (var10 == null) {
                                        this.field7875[var7] = var16;
                                    } else {
                                        var10.field3262 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field7876[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3262;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class213 var18 = this.field7875[var17];
                this.field7875[var17] = this.field7876[var17] = null;
                while (var18 != null) {
                    class213 var19 = var18.field3262;
                    var18.field3262 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field7869 < 0) {
            this.field7869 = 0;
        }
        if (this.field7867 != null) {
            this.field7867.method1156(arg0, 0, arg1);
        }
        this.field7851 = class430.method3299(100);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)I", line = 256)
    public static final int method4049(int arg0, int arg1, int arg2) {
        try {
            field7849++;
            if (class676.field9793 == -1) {
                return 1;
            }
            if (class289.field4305.field812.method1610(false) != arg0) {
                class651.method4784(true, true, class309.field4860.method2616(false, class167.field2300), arg0);
                if (arg0 != class289.field4305.field812.method1610(false)) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class502.field7252.getSize();
                if (arg1 != 16711680) {
                    field7852 = 107;
                }
                class145.method1227(true, class309.field4860.method2616(false, class167.field2300), class309.field4911, class64.field664, class610.field8913, (byte) -124);
                class137 var4 = class772.method5596(0, 25329, class589.field8661, class676.field9793);
                long var5 = class430.method3299(94);
                class610.field8913.method553();
                class272.field4126.method2389(0, class578.field8582, 0);
                class610.field8913.method495(class272.field4126);
                class610.field8913.method479(var3.width / 2, var3.height / 2, 512, 512);
                class610.field8913.method526(1.0F);
                class610.field8913.method516(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class497 var7 = class610.field8913.method552(var4, 2048, 64, 64, 768);
                int var8 = 0;
                label54: for (int var9 = 0; var9 < 500; var9++) {
                    class610.field8913.method483(0);
                    class610.field8913.method586();
                    for (int var10 = 15; var10 >= 0; var10--) {
                        for (int var11 = 0; var11 <= var10; var11++) {
                            class70.field751.method2389((int) (((float) var11 - (float) var10 / 2.0F) * (float) class358.field5488), 0, (var10 + 1) * class358.field5488);
                            var8++;
                            var7.method333(class70.field751, null, 0);
                            if ((class430.method3299(113) - var5) >= ((long) arg2)) {
                                break label54;
                            }
                        }
                    }
                }
                class610.field8913.method473();
                long var12 = (long) (var8 * 1000) / (class430.method3299(115) - var5);
                class610.field8913.method483(0);
                class610.field8913.method586();
                return (int) var12;
            } catch (Throwable var16) {
                var16.printStackTrace();
                return -1;
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field7882[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(III)I", line = 340)
    public static final int method4050(int arg0, int arg1, int arg2) {
        try {
            if (arg0 <= 29) {
                return -3;
            }
            field7858++;
            int var3 = arg1 >>> 24;
            int var7 = ((arg1 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg1 & 0xFF00) * var3 & 0xFF0000) >>> 8;
            int var4 = 255 - var3;
            return (((arg2 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg2 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var7;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7882[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 359)
    public final synchronized void method4051(byte arg0) {
        try {
            field7862++;
            if (class267.field4085 != null) {
                boolean var2 = true;
                for (int var3 = 0; var3 < 2; var3++) {
                    if (class267.field4085.field5583[var3] == this) {
                        class267.field4085.field5583[var3] = null;
                    }
                    if (class267.field4085.field5583[var3] != null) {
                        var2 = false;
                    }
                }
                if (var2) {
                    class267.field4085.field5589 = true;
                    while (class267.field4085.field5585) {
                        class151.method1269(false, 50L);
                    }
                    class267.field4085 = null;
                }
            }
            this.method123();
            this.field7861 = null;
            this.field7859 = true;
            if (arg0 != 19) {
                this.field7881 = false;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7882[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLfq;)V", line = 404)
    public final synchronized void method4052(byte arg0, class213 arg1) {
        try {
            if (arg0 != 31) {
                this.field7871 = 119;
            }
            field7866++;
            this.field7867 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7882[7] + arg0 + ',' + (arg1 == null ? field7882[8] : field7882[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 416)
    public final synchronized void method4053(int arg0) {
        try {
            field7853++;
            if (!this.field7859) {
                long var2 = class430.method3299(85);
                try {
                    if (var2 > (this.field7851 + 6000L)) {
                        this.field7851 = var2 - 6000L;
                    }
                    while (var2 > this.field7851 + 5000L) {
                        this.method4054(125, 256);
                        this.field7851 += (256000 / class598.field8803);
                        var2 = class430.method3299(90);
                    }
                } catch (Exception var8) {
                    this.field7851 = var2;
                }
                if (this.field7861 != null) {
                    try {
                        if (this.field7874 != 0L) {
                            if (var2 < this.field7874) {
                                return;
                            }
                            this.method122(this.field7873);
                            this.field7874 = 0L;
                            this.field7881 = true;
                        }
                        int var4 = this.method118();
                        if (this.field7877 - var4 > this.field7871) {
                            this.field7871 = this.field7877 - var4;
                        }
                        int var5 = this.field7878 + this.field7872;
                        if (var5 + 256 > 16384) {
                            var5 = 16128;
                        }
                        if (var5 + 256 > this.field7873) {
                            this.field7873 += 1024;
                            if (this.field7873 > 16384) {
                                this.field7873 = 16384;
                            }
                            this.method123();
                            var4 = 0;
                            this.method122(this.field7873);
                            if (this.field7873 < (var5 + 256)) {
                                var5 = this.field7873 - 256;
                                this.field7872 = var5 - this.field7878;
                            }
                            this.field7881 = true;
                        }
                        while (var4 < var5) {
                            this.method4048(this.field7861, 256);
                            var4 += 256;
                            this.method120();
                        }
                        if (var2 > this.field7879) {
                            if (this.field7881) {
                                this.field7881 = false;
                            } else if (this.field7871 == 0 && this.field7870 == 0) {
                                this.method123();
                                this.field7874 = var2 + 2000L;
                                return;
                            } else {
                                this.field7872 = Math.min(this.field7870, this.field7871);
                                this.field7870 = this.field7871;
                            }
                            this.field7879 = var2 + 2000L;
                            this.field7871 = 0;
                        }
                        this.field7877 = var4;
                        if (arg0 <= 72) {
                            this.field7850 = 41;
                        }
                    } catch (Exception var7) {
                        this.method123();
                        this.field7874 = var2 + 2000L;
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field7882[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "()V", line = 537)
    public void method120() throws Exception {
        try {
            field7855++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7882[11] + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "()I", line = 546)
    public int method118() throws Exception {
        try {
            field7880++;
            return this.field7873;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7882[6] + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(II)V", line = 567)
    private final void method4054(int arg0, int arg1) {
        try {
            this.field7869 -= arg1;
            field7856++;
            if (this.field7869 < 0) {
                this.field7869 = 0;
            }
            if (this.field7867 != null) {
                this.field7867.method1160(arg1);
            }
            if (arg0 <= 105) {
                method4050(92, -122, -87);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7882[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4055(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4056(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 67;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 47;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
