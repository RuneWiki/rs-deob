import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class400 {

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    private int field5990 = 32;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Z")
    private boolean field5996 = false;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "J")
    private long field6000 = class256.method1708((byte) 118);

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    private int field6008 = 0;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Z")
    private boolean field6003 = true;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    private int field6011 = 0;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    private int field6010 = 0;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "J")
    private long field6014 = 0L;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    private int field6013 = 0;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "J")
    private long field6006 = 0L;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "[Lhf;")
    private class270[] field6015 = new class270[8];

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "[Lhf;")
    private class270[] field6016 = new class270[8];

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Llt;")
    public static class475 field5993 = new class475("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "[I")
    public static int[] field6009 = new int[14];

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "Lso;")
    public static class327 field6007 = new class327(5, 3);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    private int field6004;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public int field6005;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public int field6012;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lhf;")
    private class270 field5991;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "[I")
    public int[] field5992;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V", line = 3)
    private final void method2407(int arg0, int arg1) {
        field6002++;
        this.field6008 -= arg0;
        if (arg1 != 7) {
            this.method2407(-96, -61);
        }
        if (this.field6008 < 0) {
            this.field6008 = 0;
        }
        if (this.field5991 != null) {
            this.field5991.method566(arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 21)
    public static void method2408(byte arg0) {
        if (arg0 <= -118) {
            field6009 = null;
            field6007 = null;
            field5993 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V", line = 33)
    public void method2319() throws Exception {
        field5997++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 43)
    public final synchronized void method2409(int arg0) {
        field5998++;
        if (this.field5996) {
            return;
        }
        long var2 = class256.method1708((byte) 118);
        if (arg0 != -16934) {
            return;
        }
        try {
            if (this.field6000 + 500000L < var2) {
                this.field6000 = var2 - 500000L;
            }
            while ((this.field6000 + 5000L) < var2) {
                this.method2407(256, arg0 ^ 0xFFFFBDDD);
                this.field6000 += (256000 / class366.field5600);
            }
        } catch (Exception var7) {
            this.field6000 = var2;
        }
        if (this.field5992 == null) {
            return;
        }
        try {
            if (this.field6006 != 0L) {
                if (var2 < this.field6006) {
                    return;
                }
                this.method2320(this.field6005);
                this.field6003 = true;
                this.field6006 = 0L;
            }
            int var4 = this.method2322();
            if (this.field6010 < this.field6013 - var4) {
                this.field6010 = this.field6013 - var4;
            }
            int var5 = this.field6012 + this.field6004;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field6005) {
                this.field6005 += 1024;
                if (this.field6005 > 16384) {
                    this.field6005 = 16384;
                }
                this.method2323();
                var4 = 0;
                this.method2320(this.field6005);
                if (this.field6005 < (var5 + 256)) {
                    var5 = this.field6005 - 256;
                    this.field6004 = var5 - this.field6012;
                }
                this.field6003 = true;
            }
            while (var4 < var5) {
                this.method2413(this.field5992, 256);
                this.method2319();
                var4 += 256;
            }
            if (var2 > this.field6014) {
                if (this.field6003) {
                    this.field6003 = false;
                } else if (this.field6010 == 0 && this.field6011 == 0) {
                    this.method2323();
                    this.field6006 = var2 + 2000L;
                    return;
                } else {
                    this.field6004 = Math.min(this.field6011, this.field6010);
                    this.field6011 = this.field6010;
                }
                this.field6010 = 0;
                this.field6014 = var2 + 2000L;
            }
            this.field6013 = var4;
        } catch (Exception var6) {
            this.method2323();
            this.field6006 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V", line = 165)
    public final synchronized void method2410(byte arg0) {
        field5983++;
        this.field6003 = true;
        try {
            this.method2318();
        } catch (Exception var2) {
            this.method2323();
            this.field6006 = class256.method1708((byte) 118) + 2000L;
        }
        if (arg0 != 5) {
            this.field6003 = false;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)[Lcv;", line = 184)
    public static final class398[] method2411(int arg0) {
        if (arg0 != 0) {
            method2411(34);
        }
        field5987++;
        return new class398[] { class301.field4264, class493.field7289, class266.field3896 };
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 196)
    public final void method2412(boolean arg0) {
        this.field6003 = arg0;
        field5984++;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V", line = 204)
    public void method2320(int arg0) throws Exception {
        field5994++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 211)
    public void method2324(Component arg0) throws Exception {
        field6001++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([II)V", line = 223)
    private final void method2413(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class323.field4619) {
            var3 = arg1 << 1;
        }
        class520.method3072(arg0, 0, var3);
        this.field6008 -= arg1;
        if (this.field5991 != null && this.field6008 <= 0) {
            this.field6008 += class366.field5600 >> 4;
            class106.method652((byte) -119, this.field5991);
            this.method2414((byte) -108, this.field5991.method568(), this.field5991);
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
                        class270 var10 = null;
                        class270 var11 = this.field6015[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class280 var12 = var11.field3931;
                                if (var12 == null || var12.field4027 <= var8) {
                                    var11.field3929 = true;
                                    int var13 = var11.method576();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4027 += var13;
                                    }
                                    if (var4 >= this.field5990) {
                                        break label107;
                                    }
                                    class270 var14 = var11.method563();
                                    if (var14 != null) {
                                        int var15 = var11.field3930;
                                        while (var14 != null) {
                                            this.method2414((byte) -88, var15 * var14.method568() >> 8, var14);
                                            var14 = var11.method585();
                                        }
                                    }
                                    class270 var16 = var11.field3928;
                                    var11.field3928 = null;
                                    if (var10 == null) {
                                        this.field6015[var7] = var16;
                                    } else {
                                        var10.field3928 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field6016[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3928;
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
                class270 var18 = this.field6015[var17];
                this.field6015[var17] = this.field6016[var17] = null;
                while (var18 != null) {
                    class270 var19 = var18.field3928;
                    var18.field3928 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field6008 < 0) {
            this.field6008 = 0;
        }
        if (this.field5991 != null) {
            this.field5991.method583(arg0, 0, arg1);
        }
        this.field6000 = class256.method1708((byte) 118);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BILhf;)V", line = 382)
    private final void method2414(byte arg0, int arg1, class270 arg2) {
        field5999++;
        int var4 = 18 / ((2 - arg0) / 56);
        int var5 = arg1 >> 5;
        class270 var6 = this.field6016[var5];
        if (var6 == null) {
            this.field6015[var5] = arg2;
        } else {
            var6.field3928 = arg2;
        }
        this.field6016[var5] = arg2;
        arg2.field3930 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V", line = 407)
    public final synchronized void method2415(int arg0) {
        field5982++;
        if (class290.field4170 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class290.field4170.field6843[var3] == this) {
                    class290.field4170.field6843[var3] = null;
                }
                if (class290.field4170.field6843[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class290.field4170.field6849 = true;
                while (class290.field4170.field6841) {
                    class246.method1659((byte) 117, 50L);
                }
                class290.field4170 = null;
            }
        }
        int var4 = 59 / ((43 - arg0) / 62);
        this.method2323();
        this.field5992 = null;
        this.field5996 = true;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()V", line = 451)
    public void method2318() throws Exception {
        field5988++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILhf;)V", line = 458)
    public final synchronized void method2416(int arg0, class270 arg1) {
        field5989++;
        if (arg0 == 3) {
            this.field5991 = arg1;
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()I", line = 470)
    public int method2322() throws Exception {
        field5985++;
        return this.field6005;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V", line = 478)
    public static final void method2417(int arg0) {
        class451.field6710 = null;
        class485.field7149 = null;
        class199.field2884 = null;
        class164.field2419 = null;
        class47.field761 = null;
        class294.field4202 = null;
        class392.field5903 = null;
        class495.field7328 = null;
        class302.field4268 = null;
        class87.field1334 = null;
        class167.field2476 = null;
        class250.field3711 = null;
        if (arg0 < 76) {
            field6009 = null;
        }
        class115.field1730 = null;
        class423.field6358 = null;
        class315.field4502 = null;
        class147.field2181 = null;
        class475.field6994 = null;
        class334.field4703 = null;
        field5995++;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()V", line = 511)
    public void method2323() {
        field5986++;
    }
}
