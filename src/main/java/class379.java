import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class379 {

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "Z")
    private boolean field5084 = false;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    private int field5100 = 32;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "J")
    private long field5097 = class488.method2835(30160);

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
    private int field5107 = 0;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "[Lff;")
    private class9[] field5105 = new class9[8];

    @OriginalMember(owner = "client!pr", name = "E", descriptor = "I")
    private int field5113 = 0;

    @OriginalMember(owner = "client!pr", name = "G", descriptor = "I")
    private int field5115 = 0;

    @OriginalMember(owner = "client!pr", name = "F", descriptor = "[Lff;")
    private class9[] field5114 = new class9[8];

    @OriginalMember(owner = "client!pr", name = "H", descriptor = "I")
    private int field5116 = 0;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "J")
    private long field5108 = 0L;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "Z")
    private boolean field5106 = true;

    @OriginalMember(owner = "client!pr", name = "I", descriptor = "J")
    private long field5117 = 0L;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "Z")
    public static boolean field5098 = false;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "Loca;")
    public static class221 field5102 = new class221(4, 1, 1, 1);

    @OriginalMember(owner = "client!pr", name = "C", descriptor = "[S")
    public static short[] field5111 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!pr", name = "A", descriptor = "I")
    public int field5109;

    @OriginalMember(owner = "client!pr", name = "B", descriptor = "I")
    public int field5110;

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "I")
    private int field5112;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "Lff;")
    private class9 field5090;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "[I")
    public int[] field5088;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public final synchronized void method2235(int arg0) {
        if (class515.field7247 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class515.field7247.field4651[var3] == this) {
                    class515.field7247.field4651[var3] = null;
                }
                if (class515.field7247.field4651[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class515.field7247.field4646 = true;
                while (class515.field7247.field4653) {
                    class21.method220(0, 50L);
                }
                class515.field7247 = null;
            }
        }
        field5095++;
        this.method2056();
        this.field5084 = true;
        this.field5088 = null;
        int var4 = -36 % ((-arg0 - 44) / 53);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "()V")
    public void method2054() throws Exception {
        field5086++;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "([II)V")
    private final void method2236(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class626.field9116) {
            var3 = arg1 << 1;
        }
        class416.method2499(arg0, 0, var3);
        this.field5113 -= arg1;
        if (this.field5090 != null && this.field5113 <= 0) {
            this.field5113 += class223.field3180 >> 4;
            class63.method539(this.field5090, 0);
            this.method2237(this.field5090, this.field5090.method50(), (byte) -23);
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
                        class9 var10 = null;
                        class9 var11 = this.field5105[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class373 var12 = var11.field103;
                                if (var12 == null || var12.field5028 <= var8) {
                                    var11.field105 = true;
                                    int var13 = var11.method51();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field5028 += var13;
                                    }
                                    if (var4 >= this.field5100) {
                                        break label107;
                                    }
                                    class9 var14 = var11.method53();
                                    if (var14 != null) {
                                        int var15 = var11.field102;
                                        while (var14 != null) {
                                            this.method2237(var14, var15 * var14.method50() >> 8, (byte) -23);
                                            var14 = var11.method52();
                                        }
                                    }
                                    class9 var16 = var11.field104;
                                    var11.field104 = null;
                                    if (var10 == null) {
                                        this.field5105[var7] = var16;
                                    } else {
                                        var10.field104 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5114[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field104;
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
                class9 var18 = this.field5105[var17];
                this.field5105[var17] = this.field5114[var17] = null;
                while (var18 != null) {
                    class9 var19 = var18.field104;
                    var18.field104 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5113 < 0) {
            this.field5113 = 0;
        }
        if (this.field5090 != null) {
            this.field5090.method55(arg0, 0, arg1);
        }
        this.field5097 = class488.method2835(30160);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lff;IB)V")
    private final void method2237(class9 arg0, int arg1, byte arg2) {
        field5096++;
        if (arg2 > -17) {
            this.field5105 = null;
        }
        int var4 = arg1 >> 5;
        class9 var5 = this.field5114[var4];
        if (var5 == null) {
            this.field5105[var4] = arg0;
        } else {
            var5.field104 = arg0;
        }
        this.field5114[var4] = arg0;
        arg0.field102 = arg1;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
    public final synchronized void method2238(int arg0) {
        field5089++;
        if (this.field5084) {
            return;
        }
        long var2 = class488.method2835(30160);
        try {
            if ((this.field5097 + 500000L) < var2) {
                this.field5097 = var2 - 500000L;
            }
            while (this.field5097 + 5000L < var2) {
                this.method2244(-9941, 256);
                this.field5097 += (256000 / class223.field3180);
            }
        } catch (Exception var8) {
            this.field5097 = var2;
        }
        if (this.field5088 == null) {
            return;
        }
        try {
            if (this.field5117 != 0L) {
                if (this.field5117 > var2) {
                    return;
                }
                this.method2053(this.field5109);
                this.field5106 = true;
                this.field5117 = 0L;
            }
            int var4 = 60 % ((-arg0 - 33) / 49);
            int var5 = this.method2052();
            if ((this.field5107 - var5) > this.field5116) {
                this.field5116 = this.field5107 - var5;
            }
            int var6 = this.field5110 + this.field5112;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if (this.field5109 < var6 + 256) {
                this.field5109 += 1024;
                if (this.field5109 > 16384) {
                    this.field5109 = 16384;
                }
                this.method2056();
                var5 = 0;
                this.method2053(this.field5109);
                if (this.field5109 < (var6 + 256)) {
                    var6 = this.field5109 - 256;
                    this.field5112 = var6 - this.field5110;
                }
                this.field5106 = true;
            }
            while (var5 < var6) {
                this.method2236(this.field5088, 256);
                var5 += 256;
                this.method2050();
            }
            if (var2 > this.field5108) {
                if (this.field5106) {
                    this.field5106 = false;
                } else if (this.field5116 == 0 && this.field5115 == 0) {
                    this.method2056();
                    this.field5117 = var2 + 2000L;
                    return;
                } else {
                    this.field5112 = Math.min(this.field5115, this.field5116);
                    this.field5115 = this.field5116;
                }
                this.field5116 = 0;
                this.field5108 = var2 + 2000L;
            }
            this.field5107 = var5;
        } catch (Exception var7) {
            this.method2056();
            this.field5117 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
    public static final void method2239(int arg0, int arg1) {
        if (arg0 < -47) {
            field5083++;
            class314 var2 = class483.method2819(7, arg1, 21303);
            var2.method1962((byte) 0);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLmc;)V")
    public static final void method2240(boolean arg0, class114 arg1) {
        field5104++;
        if (!class493.field6904) {
            return;
        }
        if (!arg0) {
            field5102 = null;
        }
        class142.field2201++;
        if (arg1.field1869 != null) {
            class114 var2 = class512.method2969(class608.field8768, class103.field1566, (byte) 115);
            if (var2 != null) {
                class224 var3 = new class224();
                var3.field3210 = arg1;
                var3.field3204 = var2;
                var3.field3207 = arg1.field1869;
                class123.method862(var3);
            }
        }
        class351.method2108(class471.field6620, -10511);
        class479.field6754.method117(-127, arg1.field1810);
        class479.field6754.method109(class461.field6472, 255);
        class479.field6754.method76(arg1.field1749, (byte) 81);
        class479.field6754.method68(125, class608.field8768);
        class479.field6754.method91((byte) 88, class103.field1566);
        class479.field6754.method84(arg1.field1787, (byte) -102);
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "()V")
    public void method2056() {
        field5103++;
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "()V")
    public void method2050() throws Exception {
        field5099++;
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
    public final synchronized void method2241(int arg0) {
        field5085++;
        this.field5106 = true;
        try {
            if (arg0 == 13670) {
                this.method2054();
            }
        } catch (Exception var2) {
            this.method2056();
            this.field5117 = class488.method2835(30160) + 2000L;
        }
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
    public void method2053(int arg0) throws Exception {
        field5087++;
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "()I")
    public int method2052() throws Exception {
        field5101++;
        return this.field5109;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLff;)V")
    public final synchronized void method2242(byte arg0, class9 arg1) {
        this.field5090 = arg1;
        if (arg0 < -114) {
            field5093++;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method2055(Component arg0) throws Exception {
        field5094++;
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)V")
    public static void method2243(int arg0) {
        if (arg0 == -11310) {
            field5111 = null;
            field5102 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)V")
    private final void method2244(int arg0, int arg1) {
        this.field5113 -= arg1;
        field5092++;
        if (this.field5113 < 0) {
            this.field5113 = 0;
        }
        if (this.field5090 != null) {
            this.field5090.method54(arg1);
        }
        if (arg0 != -9941) {
            this.method2238(-100);
        }
    }
}
