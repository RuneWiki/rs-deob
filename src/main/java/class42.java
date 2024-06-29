import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class42 {

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Z")
    private boolean field505 = false;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    private int field503 = 32;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "J")
    private long field507 = class445.method2750(-27580);

    @OriginalMember(owner = "client!il", name = "y", descriptor = "J")
    private long field524 = 0L;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    private int field527 = 0;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "Z")
    private boolean field530 = true;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    private int field529 = 0;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "J")
    private long field534 = 0L;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "[Lwf;")
    private class29[] field533 = new class29[8];

    @OriginalMember(owner = "client!il", name = "A", descriptor = "[Lwf;")
    private class29[] field526 = new class29[8];

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    private int field531 = 0;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    private int field535 = 0;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Lwl;")
    public static class452 field512 = new class452(27, 3);

    @OriginalMember(owner = "client!il", name = "w", descriptor = "Lnq;")
    public static class433 field522 = new class433();

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Lwf;")
    private class29 field502;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "[I")
    public int[] field520;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method230(int arg0) {
        field512 = null;
        field522 = null;
        if (arg0 != 82) {
            method231((byte) -89);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static final void method231(byte arg0) {
        field504++;
        class241 var1 = class338.field5048;
        synchronized (class338.field5048) {
            if (arg0 <= 122) {
                field512 = null;
            }
            class338.field5048.method1485(-22032);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([II)V")
    private final void method232(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class278.field4229) {
            var3 = arg1 << 1;
        }
        class129.method763(arg0, 0, var3);
        this.field527 -= arg1;
        if (this.field502 != null && this.field527 <= 0) {
            this.field527 += class81.field1082 >> 4;
            class134.method807(this.field502, -1);
            this.method233(50, this.field502, this.field502.method165());
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
                        class29 var10 = null;
                        class29 var11 = this.field533[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class159 var12 = var11.field369;
                                if (var12 == null || var12.field2205 <= var8) {
                                    var11.field371 = true;
                                    int var13 = var11.method166();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2205 += var13;
                                    }
                                    if (var4 >= this.field503) {
                                        break label107;
                                    }
                                    class29 var14 = var11.method170();
                                    if (var14 != null) {
                                        int var15 = var11.field370;
                                        while (var14 != null) {
                                            this.method233(50, var14, var15 * var14.method165() >> 8);
                                            var14 = var11.method169();
                                        }
                                    }
                                    class29 var16 = var11.field368;
                                    var11.field368 = null;
                                    if (var10 == null) {
                                        this.field533[var7] = var16;
                                    } else {
                                        var10.field368 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field526[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field368;
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
                class29 var18 = this.field533[var17];
                this.field533[var17] = this.field526[var17] = null;
                while (var18 != null) {
                    class29 var19 = var18.field368;
                    var18.field368 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field527 < 0) {
            this.field527 = 0;
        }
        if (this.field502 != null) {
            this.field502.method167(arg0, 0, arg1);
        }
        this.field507 = class445.method2750(-27580);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILwf;I)V")
    private final void method233(int arg0, class29 arg1, int arg2) {
        if (arg0 != 50) {
            return;
        }
        field523++;
        int var4 = arg2 >> 5;
        class29 var5 = this.field526[var4];
        if (var5 == null) {
            this.field533[var4] = arg1;
        } else {
            var5.field368 = arg1;
        }
        this.field526[var4] = arg1;
        arg1.field370 = arg2;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()I")
    public int method234() throws Exception {
        field521++;
        return this.field532;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lmf;III)V")
    public static final void method235(class45 arg0, int arg1, int arg2, int arg3) {
        long var4 = class452.field6688[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field559 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field554[arg0.field559++] = class281.field4303[var8 - 1];
            var6 += 16L;
        }
        for (int var9 = arg0.field559; var9 < 4; var9++) {
            arg0.field554[var9] = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()V")
    public void method236() {
        field511++;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "()V")
    public void method237() throws Exception {
        field515++;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
    public final synchronized void method238(int arg0) {
        field518++;
        if (class307.field4636 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class307.field4636.field5338[var3] == this) {
                    class307.field4636.field5338[var3] = null;
                }
                if (class307.field4636.field5338[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class307.field4636.field5341 = true;
                while (class307.field4636.field5346) {
                    class109.method674((byte) 99, 50L);
                }
                class307.field4636 = null;
            }
        }
        if (arg0 != 0) {
            this.field502 = null;
        }
        this.method236();
        this.field505 = true;
        this.field520 = null;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "()V")
    public void method239() throws Exception {
        field508++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lwf;B)V")
    public final synchronized void method240(class29 arg0, byte arg1) {
        if (arg1 != 3) {
            this.field529 = -42;
        }
        this.field502 = arg0;
        field509++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)V")
    private final void method241(byte arg0, int arg1) {
        this.field527 -= arg1;
        field517++;
        if (arg0 != -8) {
            method244(true);
        }
        if (this.field527 < 0) {
            this.field527 = 0;
        }
        if (this.field502 != null) {
            this.field502.method168(arg1);
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V")
    public void method242(int arg0) throws Exception {
        field510++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method243(Component arg0) throws Exception {
        field516++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public static final void method244(boolean arg0) {
        if (arg0) {
            field522 = null;
        }
        field513++;
        if (class19.field263 == 10) {
            class316.method1929(false, 28);
        }
        if (class19.field263 == 30) {
            class316.method1929(false, 25);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BLps;)V")
    public static final void method245(byte arg0, class306 arg1) {
        field514++;
        if (arg1 == null || class372.field5433.field5946 == arg1) {
            return;
        }
        int var2 = arg1.field4618;
        int var3 = arg1.field4619;
        int var4 = arg1.field4616;
        int var5 = (int) arg1.field4626;
        if (arg0 > -62) {
            field512 = null;
        }
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = arg1.field4626;
        int var8;
        int var9;
        if (class465.field6850 == null) {
            var9 = class455.field6755;
            var8 = class180.field2714;
        } else {
            var8 = class465.field6850.method467(9);
            var9 = class465.field6850.method465((byte) -105);
        }
        if (var4 == 45) {
            class155.field2159 = var9;
            class172.field2643 = var8;
            class268.field4081 = 2;
            class213.field3199++;
            class330.field4940 = 0;
            class177.method1082(class334.field4974, 0);
            class189.field2840.method2321(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 106);
            class189.field2840.method2377(class112.field1487 + var3, -115);
            class189.field2840.method2360(128, class185.field2786.method578(false, 82) ? 1 : 0);
            class189.field2840.method2334(var2 + class17.field250, 1833667168);
            class364.method2184(true, var6, var2, var3);
        }
        if (var4 == 11) {
            class169 var10 = class140.field1883[var5];
            if (var10 != null) {
                class155.field2159 = var9;
                class172.field2643 = var8;
                class268.field4081 = 2;
                class94.field1314++;
                class330.field4940 = 0;
                class177.method1082(class91.field1284, 0);
                class189.field2840.method2371(true, class185.field2786.method578(false, 82) ? 1 : 0);
                class189.field2840.method2377(var5, -28);
                class416.method2595(var10.method911(0), -58, var10.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var10.field2018[0], var10.method911(0), true, 0);
            }
        }
        if (var4 == 21 && class98.field1359 == null) {
            class50.method286(-17357, var3, var2);
            class98.field1359 = class455.method2827(var2, false, var3);
            class405.method2543(class98.field1359, 126);
        }
        if (var4 == 1007 || var4 == 1011 || var4 == 1012 || var4 == 1008 || var4 == 1001) {
            class87.method566(-1002, var5, var2, var4);
        }
        if (var4 == 1003) {
            class155.field2159 = var9;
            class330.field4940 = 0;
            class268.field4081 = 2;
            class172.field2643 = var8;
            class155 var11 = class170.field2626[var5];
            if (var11 != null) {
                class271 var12 = var11.field2137;
                if (var12.field4100 != null) {
                    var12 = var12.method1684(6);
                }
                if (var12 != null) {
                    class26.field331++;
                    class177.method1082(class406.field6033, 0);
                    class189.field2840.method2377(var12.field4121, -57);
                }
            }
        }
        if (var4 == 9) {
            class170 var13 = class455.method2827(var2, false, var3);
            if (var13 != null) {
                class108.method668((byte) -3, var13);
            }
        }
        if (var4 == 25) {
            class170 var14 = class455.method2827(var2, false, var3);
            if (var14 != null) {
                class284.method1746(-1);
                class312 var15 = client.method2796(var14);
                class149.method928(29, var15.method1903(5), var3, var2, var15.field4687, var14.field2499, var14.field2477);
                class284.field4319 = class364.method2188(0, var14);
                class411.field6116 = var14.field2533 + "<col=ffffff>";
                if (class284.field4319 == null) {
                    class284.field4319 = "Null";
                }
            }
            return;
        }
        if (var4 == 50) {
            class155 var16 = class170.field2626[var5];
            if (var16 != null) {
                class330.field4940 = 0;
                class228.field3466++;
                class172.field2643 = var8;
                class155.field2159 = var9;
                class268.field4081 = 2;
                class177.method1082(class220.field3357, 0);
                class189.field2840.method2377(class390.field5763, -7);
                class189.field2840.method2334(class54.field729, 1833667168);
                class189.field2840.method2352(class185.field2786.method578(false, 82) ? 1 : 0, -128);
                class189.field2840.method2373(-121, class186.field2795);
                class189.field2840.method2340((byte) -61, var5);
                class416.method2595(var16.method911(0), -70, var16.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var16.field2018[0], var16.method911(0), true, 0);
            }
        }
        if (var4 == 1002) {
            class172.field2643 = var8;
            class155.field2159 = var9;
            class268.field4081 = 2;
            class383.field5583++;
            class330.field4940 = 0;
            class177.method1082(class382.field5578, 0);
            class189.field2840.method2377(var5, -46);
        }
        if (var4 == 15) {
            class169 var17 = class140.field1883[var5];
            if (var17 != null) {
                class330.field4940 = 0;
                class268.field4081 = 2;
                client.field6667++;
                class172.field2643 = var8;
                class155.field2159 = var9;
                class177.method1082(class143.field1907, 0);
                class189.field2840.method2366(class185.field2786.method578(false, 82) ? 1 : 0, true);
                class189.field2840.method2321(var5, (byte) 62);
                class416.method2595(var17.method911(0), -78, var17.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var17.field2018[0], var17.method911(0), true, 0);
            }
        }
        if (var4 == 4) {
            class268.field4081 = 2;
            class172.field2643 = var8;
            class155.field2159 = var9;
            class422.field6210++;
            class330.field4940 = 0;
            class177.method1082(class423.field6229, 0);
            class189.field2840.method2334(class112.field1487 + var3, 1833667168);
            class189.field2840.method2334(class17.field250 + var2, 1833667168);
            class189.field2840.method2340((byte) -128, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class189.field2840.method2366(class185.field2786.method578(false, 82) ? 1 : 0, true);
            class364.method2184(true, var6, var2, var3);
        }
        if (var4 == 12) {
            class268.field4081 = 2;
            class453.field6710++;
            class330.field4940 = 0;
            class155.field2159 = var9;
            class172.field2643 = var8;
            class177.method1082(class105.field1404, 0);
            class189.field2840.method2321(class17.field250 + var2, (byte) 61);
            class189.field2840.method2340((byte) -50, var5);
            class189.field2840.method2360(128, class185.field2786.method578(false, 82) ? 1 : 0);
            class189.field2840.method2321(class112.field1487 + var3, (byte) 75);
            class86.method563(var3, 22696, var2);
        }
        if (var4 == 30) {
            class155 var18 = class170.field2626[var5];
            if (var18 != null) {
                class399.field5958++;
                class330.field4940 = 0;
                class268.field4081 = 2;
                class172.field2643 = var8;
                class155.field2159 = var9;
                class177.method1082(class98.field1350, 0);
                class189.field2840.method2340((byte) -104, var5);
                class189.field2840.method2360(128, class185.field2786.method578(false, 82) ? 1 : 0);
                class416.method2595(var18.method911(0), -120, var18.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var18.field2018[0], var18.method911(0), true, 0);
            }
        }
        if (var4 == 10) {
            class169 var19 = class140.field1883[var5];
            if (var19 != null) {
                class268.field4081 = 2;
                class330.field4940 = 0;
                class155.field2159 = var9;
                class465.field6849++;
                class172.field2643 = var8;
                class177.method1082(class335.field4985, 0);
                class189.field2840.method2366(class185.field2786.method578(false, 82) ? 1 : 0, true);
                class189.field2840.method2377(var5, -45);
                class416.method2595(var19.method911(0), -103, var19.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var19.field2018[0], var19.method911(0), true, 0);
            }
        }
        if (var4 == 46) {
            class172.field2643 = var8;
            class268.field4081 = 2;
            class62.field790++;
            class330.field4940 = 0;
            class155.field2159 = var9;
            class177.method1082(class383.field5586, 0);
            class189.field2840.method2377(class112.field1487 + var3, -63);
            class189.field2840.method2334(var5, 1833667168);
            class189.field2840.method2360(128, class185.field2786.method578(false, 82) ? 1 : 0);
            class189.field2840.method2377(class17.field250 + var2, -87);
            class86.method563(var3, 22696, var2);
        }
        if (var4 == 59) {
            if (class143.field1912 > 0 && class185.field2786.method578(false, 82) && class185.field2786.method578(false, 81)) {
                class367.method2205(class112.field1487 + var3, class113.field1500.field1902, (byte) -62, class17.field250 + var2);
            } else {
                class155.field2159 = var9;
                class330.field4940 = 0;
                class268.field4081 = 1;
                class355.field5244++;
                class172.field2643 = var8;
                class177.method1082(class212.field3181, 0);
                class189.field2840.method2334(class112.field1487 + var3, 1833667168);
                class189.field2840.method2334(class17.field250 + var2, 1833667168);
            }
        }
        if (var4 == 1009) {
            class307.field4635++;
            class330.field4940 = 0;
            class172.field2643 = var8;
            class155.field2159 = var9;
            class268.field4081 = 2;
            class177.method1082(class281.field4299, 0);
            class189.field2840.method2377(var5, -17);
        }
        if (var4 == 19) {
            class169 var20 = class140.field1883[var5];
            if (var20 != null) {
                class292.field4437++;
                class268.field4081 = 2;
                class155.field2159 = var9;
                class172.field2643 = var8;
                class330.field4940 = 0;
                class177.method1082(class315.field4771, 0);
                class189.field2840.method2366(class185.field2786.method578(false, 82) ? 1 : 0, true);
                class189.field2840.method2381(class186.field2795, 0);
                class189.field2840.method2377(var5, -115);
                class189.field2840.method2321(class390.field5763, (byte) 87);
                class189.field2840.method2334(class54.field729, 1833667168);
                class416.method2595(var20.method911(0), -92, var20.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var20.field2018[0], var20.method911(0), true, 0);
            }
        }
        if (var4 == 20) {
            if (class143.field1912 > 0 && class185.field2786.method578(false, 82) && class185.field2786.method578(false, 81)) {
                class367.method2205(class112.field1487 + var3, class113.field1500.field1902, (byte) -62, class17.field250 + var2);
            } else {
                class154.method951(var5, var2, var3, (byte) 98);
                if (var5 == 1) {
                    class189.field2840.method2366(-1, true);
                    class189.field2840.method2366(-1, true);
                    class189.field2840.method2377((int) class462.field6810, -98);
                    class189.field2840.method2366(57, true);
                    class189.field2840.method2366(class3.field39, true);
                    class189.field2840.method2366(class343.field5138, true);
                    class189.field2840.method2366(89, true);
                    class189.field2840.method2377(class113.field1500.field1900, -84);
                    class189.field2840.method2377(class113.field1500.field1892, -106);
                    class189.field2840.method2366(63, true);
                } else {
                    class172.field2643 = var8;
                    class330.field4940 = 0;
                    class155.field2159 = var9;
                    class268.field4081 = 1;
                }
                class416.method2595(1, -77, var2, 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -4, var3, 1, true, 0);
            }
        }
        if (var4 == 8) {
            class155 var21 = class170.field2626[var5];
            if (var21 != null) {
                class372.field5427++;
                class172.field2643 = var8;
                class155.field2159 = var9;
                class330.field4940 = 0;
                class268.field4081 = 2;
                class177.method1082(class244.field3659, 0);
                class189.field2840.method2366(class185.field2786.method578(false, 82) ? 1 : 0, true);
                class189.field2840.method2334(var5, 1833667168);
                class416.method2595(var21.method911(0), -89, var21.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var21.field2018[0], var21.method911(0), true, 0);
            }
        }
        if (var4 == 51) {
            class172.field2643 = var8;
            class330.field4940 = 0;
            class333.field4966++;
            class155.field2159 = var9;
            class268.field4081 = 2;
            class177.method1082(class373.field5436, 0);
            class189.field2840.method2334(class390.field5763, 1833667168);
            class189.field2840.method2377(var5, -20);
            class189.field2840.method2321(class17.field250 + var2, (byte) 82);
            class189.field2840.method2334(class112.field1487 + var3, 1833667168);
            class189.field2840.method2366(class185.field2786.method578(false, 82) ? 1 : 0, true);
            class189.field2840.method2340((byte) -49, class54.field729);
            class189.field2840.method2344(255, class186.field2795);
            class86.method563(var3, 22696, var2);
        }
        if (var4 == 3) {
            class177.field2685++;
            class268.field4081 = 2;
            class155.field2159 = var9;
            class330.field4940 = 0;
            class172.field2643 = var8;
            class177.method1082(class109.field1447, 0);
            class189.field2840.method2334(class112.field1487 + var3, 1833667168);
            class189.field2840.method2321((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 106);
            class189.field2840.method2366(class185.field2786.method578(false, 82) ? 1 : 0, true);
            class189.field2840.method2334(class17.field250 + var2, 1833667168);
            class364.method2184(true, var6, var2, var3);
        }
        if (var4 == 60 || var4 == 1006) {
            class427.method2631(arg1.field4621, false, var2, var5, var3);
        }
        if (var4 == 5) {
            class169 var22 = class140.field1883[var5];
            if (var22 != null) {
                class172.field2643 = var8;
                class268.field4081 = 2;
                class155.field2159 = var9;
                class330.field4940 = 0;
                class415.field6160++;
                class177.method1082(class374.field5446, 0);
                class189.field2840.method2360(128, class185.field2786.method578(false, 82) ? 1 : 0);
                class189.field2840.method2377(var5, -40);
                class416.method2595(var22.method911(0), -64, var22.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var22.field2018[0], var22.method911(0), true, 0);
            }
        }
        if (var4 == 44) {
            class172.field2643 = var8;
            class268.field4081 = 2;
            class330.field4940 = 0;
            class155.field2159 = var9;
            class106.field1417++;
            class177.method1082(class280.field4287, 0);
            class189.field2840.method2340((byte) -69, var2 + class17.field250);
            class189.field2840.method2377(var3 + class112.field1487, -88);
            class189.field2840.method2377(var5, -105);
            class189.field2840.method2371(true, class185.field2786.method578(false, 82) ? 1 : 0);
            class86.method563(var3, 22696, var2);
        }
        if (var4 == 18) {
            class169 var23 = class140.field1883[var5];
            if (var23 != null) {
                class330.field4940 = 0;
                class268.field4081 = 2;
                class155.field2159 = var9;
                class172.field2643 = var8;
                class172.field2646++;
                class177.method1082(class95.field1323, 0);
                class189.field2840.method2377(var5, -33);
                class189.field2840.method2371(true, class185.field2786.method578(false, 82) ? 1 : 0);
                class416.method2595(var23.method911(0), -86, var23.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var23.field2018[0], var23.method911(0), true, 0);
            }
        }
        if (var4 == 17) {
            class298.field4517++;
            class268.field4081 = 1;
            class155.field2159 = var9;
            class172.field2643 = var8;
            class330.field4940 = 0;
            class177.method1082(class111.field1458, 0);
            class189.field2840.method2377(class17.field250 + var2, -18);
            class189.field2840.method2334(class390.field5763, 1833667168);
            class189.field2840.method2373(-86, class186.field2795);
            class189.field2840.method2340((byte) -120, class112.field1487 + var3);
            class189.field2840.method2340((byte) -88, class54.field729);
            class416.method2595(1, -70, var2, 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -4, var3, 1, true, 0);
        }
        if (var4 == 49) {
            class169 var24 = class140.field1883[var5];
            if (var24 != null) {
                class330.field4940 = 0;
                class221.field3364++;
                class268.field4081 = 2;
                class155.field2159 = var9;
                class172.field2643 = var8;
                class177.method1082(class43.field538, 0);
                class189.field2840.method2340((byte) -46, var5);
                class189.field2840.method2366(class185.field2786.method578(false, 82) ? 1 : 0, true);
                class416.method2595(var24.method911(0), -84, var24.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var24.field2018[0], var24.method911(0), true, 0);
            }
        }
        if (var4 == 2) {
            class155.field2159 = var9;
            class172.field2643 = var8;
            class268.field4081 = 2;
            class330.field4940 = 0;
            class312.field4702++;
            class177.method1082(class219.field3336, 0);
            class189.field2840.method2321(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 74);
            class189.field2840.method2321(class17.field250 + var2, (byte) 110);
            class189.field2840.method2340((byte) -94, class54.field729);
            class189.field2840.method2371(true, class185.field2786.method578(false, 82) ? 1 : 0);
            class189.field2840.method2357(class186.field2795, (byte) 98);
            class189.field2840.method2340((byte) -105, class390.field5763);
            class189.field2840.method2340((byte) -90, class112.field1487 + var3);
            class364.method2184(true, var6, var2, var3);
        }
        if (var4 == 47) {
            class155 var25 = class170.field2626[var5];
            if (var25 != null) {
                class172.field2643 = var8;
                class155.field2159 = var9;
                class268.field4081 = 2;
                class162.field2248++;
                class330.field4940 = 0;
                class177.method1082(class315.field4774, 0);
                class189.field2840.method2334(var5, 1833667168);
                class189.field2840.method2352(class185.field2786.method578(false, 82) ? 1 : 0, -128);
                class416.method2595(var25.method911(0), -100, var25.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var25.field2018[0], var25.method911(0), true, 0);
            }
        }
        if (var4 == 1010) {
            class359.field5292++;
            class155.field2159 = var9;
            class172.field2643 = var8;
            class330.field4940 = 0;
            class268.field4081 = 2;
            class177.method1082(class375.field5477, 0);
            class189.field2840.method2340((byte) -78, var3 + class112.field1487);
            class189.field2840.method2377(var2 + class17.field250, -10);
            class189.field2840.method2377(Integer.MAX_VALUE & (int) (var6 >>> 32), -128);
            class189.field2840.method2366(class185.field2786.method578(false, 82) ? 1 : 0, true);
            class364.method2184(true, var6, var2, var3);
        }
        if (var4 == 22) {
            class155.field2159 = var9;
            class268.field4081 = 2;
            class172.field2643 = var8;
            class87.field1232++;
            class330.field4940 = 0;
            class177.method1082(class261.field3973, 0);
            class189.field2840.method2340((byte) -68, class112.field1487 + var3);
            class189.field2840.method2340((byte) -89, class17.field250 + var2);
            class189.field2840.method2377(var5, -72);
            class189.field2840.method2352(class185.field2786.method578(false, 82) ? 1 : 0, -128);
            class86.method563(var3, 22696, var2);
        }
        if (var4 == 48) {
            class1.field10++;
            class172.field2643 = var8;
            class155.field2159 = var9;
            class330.field4940 = 0;
            class268.field4081 = 2;
            class177.method1082(class398.field5944, 0);
            class189.field2840.method2340((byte) -109, class17.field250 + var2);
            class189.field2840.method2360(128, class185.field2786.method578(false, 82) ? 1 : 0);
            class189.field2840.method2340((byte) -125, class112.field1487 + var3);
            class189.field2840.method2377((int) (var6 >>> 32) & Integer.MAX_VALUE, -72);
            class364.method2184(true, var6, var2, var3);
        }
        if (var4 == 6) {
            class155 var26 = class170.field2626[var5];
            if (var26 != null) {
                class268.field4081 = 2;
                class145.field1927++;
                class172.field2643 = var8;
                class155.field2159 = var9;
                class330.field4940 = 0;
                class177.method1082(class291.field4427, 0);
                class189.field2840.method2352(class185.field2786.method578(false, 82) ? 1 : 0, -128);
                class189.field2840.method2340((byte) -123, var5);
                class416.method2595(var26.method911(0), -95, var26.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var26.field2018[0], var26.method911(0), true, 0);
            }
        }
        if (var4 == 23) {
            class11.field119++;
            class330.field4940 = 0;
            class172.field2643 = var8;
            class268.field4081 = 2;
            class155.field2159 = var9;
            class177.method1082(class273.field4183, 0);
            class189.field2840.method2366(class185.field2786.method578(false, 82) ? 1 : 0, true);
            class189.field2840.method2340((byte) -50, var5);
            class189.field2840.method2340((byte) -73, class17.field250 + var2);
            class189.field2840.method2340((byte) -96, class112.field1487 + var3);
            class86.method563(var3, 22696, var2);
        }
        if (var4 == 58) {
            class169 var27 = class140.field1883[var5];
            if (var27 != null) {
                class286.field4351++;
                class155.field2159 = var9;
                class330.field4940 = 0;
                class172.field2643 = var8;
                class268.field4081 = 2;
                class177.method1082(class90.field1274, 0);
                class189.field2840.method2352(class185.field2786.method578(false, 82) ? 1 : 0, -128);
                class189.field2840.method2334(var5, 1833667168);
                class416.method2595(var27.method911(0), -116, var27.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var27.field2018[0], var27.method911(0), true, 0);
            }
        }
        if (var4 == 13) {
            class155 var28 = class170.field2626[var5];
            if (var28 != null) {
                class330.field4940 = 0;
                class155.field2159 = var9;
                class172.field2643 = var8;
                class280.field4285++;
                class268.field4081 = 2;
                class177.method1082(class429.field6299, 0);
                class189.field2840.method2371(true, class185.field2786.method578(false, 82) ? 1 : 0);
                class189.field2840.method2334(var5, 1833667168);
                class416.method2595(var28.method911(0), -89, var28.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var28.field2018[0], var28.method911(0), true, 0);
            }
        }
        if (var4 == 57) {
            class169 var29 = class140.field1883[var5];
            if (var29 != null) {
                class268.field4081 = 2;
                class155.field2159 = var9;
                class184.field2772++;
                class172.field2643 = var8;
                class330.field4940 = 0;
                class177.method1082(class466.field6864, 0);
                class189.field2840.method2366(class185.field2786.method578(false, 82) ? 1 : 0, true);
                class189.field2840.method2334(var5, 1833667168);
                class416.method2595(var29.method911(0), -72, var29.field2019[0], 0, class113.field1500.field2019[0], class113.field1500.field2018[0], -2, var29.field2018[0], var29.method911(0), true, 0);
            }
        }
        if (class132.field1692) {
            class284.method1746(-1);
        }
        if (class81.field1076 != null && class108.field1437 == 0) {
            class405.method2543(class81.field1076, 125);
        }
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
    public final synchronized void method246(int arg0) {
        field501++;
        if (this.field505) {
            return;
        }
        long var2 = class445.method2750(-27580);
        try {
            if (this.field507 + 500000L < var2) {
                this.field507 = var2 - 500000L;
            }
            while (this.field507 + 5000L < var2) {
                this.method241((byte) -8, 256);
                this.field507 += (long) (256000 / class81.field1082);
            }
        } catch (Exception var7) {
            this.field507 = var2;
        }
        if (this.field520 == null) {
            return;
        }
        try {
            if ((long) arg0 != this.field534) {
                if (var2 < this.field534) {
                    return;
                }
                this.method242(this.field532);
                this.field534 = 0L;
                this.field530 = true;
            }
            int var4 = this.method234();
            if ((this.field529 - var4) > this.field535) {
                this.field535 = this.field529 - var4;
            }
            int var5 = this.field528 + this.field525;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field532 < var5 + 256) {
                this.field532 += 1024;
                if (this.field532 > 16384) {
                    this.field532 = 16384;
                }
                this.method236();
                var4 = 0;
                this.method242(this.field532);
                if (this.field532 < (var5 + 256)) {
                    var5 = this.field532 - 256;
                    this.field528 = var5 - this.field525;
                }
                this.field530 = true;
            }
            while (var4 < var5) {
                this.method232(this.field520, 256);
                this.method239();
                var4 += 256;
            }
            if (this.field524 < var2) {
                if (this.field530) {
                    this.field530 = false;
                } else if (this.field535 == 0 && this.field531 == 0) {
                    this.method236();
                    this.field534 = var2 + 2000L;
                    return;
                } else {
                    this.field528 = Math.min(this.field531, this.field535);
                    this.field531 = this.field535;
                }
                this.field524 = var2 + 2000L;
                this.field535 = 0;
            }
            this.field529 = var4;
        } catch (Exception var6) {
            this.method236();
            this.field534 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
    public final void method247(int arg0) {
        field500++;
        this.field530 = true;
        if (arg0 != 2000) {
            this.method249(-104);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)Z")
    public static final boolean method248(int arg0, boolean arg1) {
        field519++;
        if (arg0 != 1) {
            return true;
        }
        boolean var2 = class196.field2965.method387();
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class196.field2965.method440();
        } else if (!class196.field2965.method376()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class289.field4391 = arg1;
            class36.method206(arg0 ^ 0xFFFFB8E8, class79.field1043);
            return true;
        }
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V")
    public final synchronized void method249(int arg0) {
        this.field530 = true;
        field506++;
        try {
            this.method237();
        } catch (Exception var2) {
            this.method236();
            this.field534 = class445.method2750(-27580) + 2000L;
        }
        if (arg0 != 1) {
            this.field534 = 97L;
        }
    }
}
