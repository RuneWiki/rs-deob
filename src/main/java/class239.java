import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class239 {

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "Z")
    private boolean field3577 = false;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    private int field3581 = 32;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "J")
    private long field3598 = class200.method1375(-16185);

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    private int field3600 = 0;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    private int field3601 = 0;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    private int field3602 = 0;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "J")
    private long field3604 = 0L;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "[Lfb;")
    private class65[] field3605 = new class65[8];

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "J")
    private long field3609 = 0L;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "[Lfb;")
    private class65[] field3607 = new class65[8];

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    private int field3608 = 0;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "Z")
    private boolean field3610 = true;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field3568 = 0;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field3585 = 0;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field3584 = 0;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3591 = "Loading textures - ";

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    private int field3599;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public int field3603;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "Lfb;")
    private class65 field3579;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "[I")
    public int[] field3594;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "[Lbi;")
    public static class91[] field3589;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "[[B")
    public static byte[][] field3574;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[[[B")
    public static byte[][][] field3573;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1708(byte arg0) {
        field3570++;
        try {
            if (class281.field4357 == 1) {
                int var1 = class195.field2802.method1577(-2);
                if (var1 > 0 && class195.field2802.method1576((byte) 125)) {
                    int var2 = var1 - class216.field3040;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class195.field2802.method1570(var2, -12088);
                    return;
                }
                class195.field2802.method1609((byte) -40);
                class195.field2802.method1579(70);
                class76.field971 = null;
                class10.field132 = null;
                if (class283.field4440 == null) {
                    class281.field4357 = 0;
                } else {
                    class281.field4357 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class195.field2802.method1609((byte) -87);
            class76.field971 = null;
            class10.field132 = null;
            class281.field4357 = 0;
            class283.field4440 = null;
        }
        if (arg0 != 75) {
            method1716((class263) null, (byte) -101, 45, 111);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 50)
    public final synchronized void method1709(int arg0) {
        if (class165.field2274 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class165.field2274.field2049[var3] == this) {
                    class165.field2274.field2049[var3] = null;
                }
                if (class165.field2274.field2049[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class165.field2274.field2040 = true;
                while (class165.field2274.field2041) {
                    class81.method485(50L, 1);
                }
                class165.field2274 = null;
            }
        }
        field3580++;
        if (arg0 != 0) {
            this.method807();
        }
        this.method807();
        this.field3594 = null;
        this.field3577 = true;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()V", line = 95)
    public void method805() throws Exception {
        field3576++;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "()V", line = 107)
    public void method809() throws Exception {
        field3572++;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "()I", line = 119)
    public int method804() throws Exception {
        field3575++;
        return this.field3606;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V", line = 127)
    public final synchronized void method1710(int arg0) {
        field3597++;
        this.field3610 = true;
        try {
            if (arg0 != -9039) {
                this.method1709(45);
            }
            this.method809();
        } catch (Exception var3) {
            this.method807();
            this.field3604 = class200.method1375(-16185) + 2000L;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([II)V", line = 150)
    private final void method1711(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class177.field2566) {
            var3 = arg1 << 1;
        }
        class86.method511(arg0, 0, var3);
        this.field3600 -= arg1;
        if (this.field3579 != null && this.field3600 <= 0) {
            this.field3600 += class276.field4312 >> 4;
            class311.method2181(this.field3579, -1600071188);
            this.method1715((byte) 45, this.field3579, this.field3579.method406());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
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
                        class65 var10 = null;
                        class65 var11 = this.field3605[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class6 var12 = var11.field844;
                                if (var12 == null || var12.field85 <= var8) {
                                    var11.field843 = true;
                                    int var13 = var11.method37();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field85 += var13;
                                    }
                                    if (var4 >= this.field3581) {
                                        break label105;
                                    }
                                    class65 var14 = var11.method30();
                                    if (var14 != null) {
                                        int var15 = var11.field842;
                                        while (var14 != null) {
                                            this.method1715((byte) 45, var14, var15 * var14.method406() >> 8);
                                            var14 = var11.method33();
                                        }
                                    }
                                    class65 var16 = var11.field845;
                                    var11.field845 = null;
                                    if (var10 == null) {
                                        this.field3605[var7] = var16;
                                    } else {
                                        var10.field845 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3607[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field845;
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
                class65 var18 = this.field3605[var17];
                this.field3605[var17] = this.field3607[var17] = null;
                while (var18 != null) {
                    class65 var19 = var18.field845;
                    var18.field845 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3600 < 0) {
            this.field3600 = 0;
        }
        if (this.field3579 != null) {
            this.field3579.method34(arg0, 0, arg1);
        }
        this.field3598 = class200.method1375(-16185);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILcc;)V", line = 309)
    public static final void method1712(int arg0, class263 arg1) {
        field3586++;
        if (class36.field421 == arg1.field3979) {
            class285.field4483[arg1.field4064] = true;
        }
        if (arg0 != 0) {
            method1712(64, (class263) null);
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 330)
    public static final void method1713(int arg0) {
        field3596++;
        if (class224.field3186 != null) {
            class224.field3186.method1721(84);
        }
        if (class170.field2380 != null) {
            class170.field2380.method1721(arg0 - 31455);
        }
        if (arg0 != 31532) {
            field3584 = -92;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V", line = 351)
    private final void method1714(int arg0, int arg1) {
        field3588++;
        this.field3600 -= arg1;
        if (this.field3600 < 0) {
            this.field3600 = 0;
        }
        if (this.field3579 != null) {
            this.field3579.method35(arg1);
        }
        if (arg0 >= -126) {
            this.method1710(14);
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "()V", line = 375)
    public void method807() {
        field3592++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLfb;I)V", line = 384)
    private final void method1715(byte arg0, class65 arg1, int arg2) {
        if (arg0 != 45) {
            this.method1711((int[]) null, -108);
        }
        int var4 = arg2 >> 5;
        field3569++;
        class65 var5 = this.field3607[var4];
        if (var5 == null) {
            this.field3605[var4] = arg1;
        } else {
            var5.field845 = arg1;
        }
        this.field3607[var4] = arg1;
        arg1.field842 = arg2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lcc;BII)V", line = 405)
    public static final void method1716(class263 arg0, byte arg1, int arg2, int arg3) {
        field3582++;
        if (class310.field4794 < 2 && class314.field4848 == 0 && !class72.field909 || arg1 >= -72) {
            return;
        }
        String var4 = class311.method2185(1);
        if (arg0 == null) {
            int var5 = class88.field1097.method67(var4, arg3 + 4, arg2 + 15, 16777215, 0, class22.field286, class110.field1529);
            class63.method390(arg2, 15, 92, arg3 + 4, class88.field1097.method80(var4) + var5);
            return;
        }
        class11 var6 = arg0.method1899((byte) -128, class79.field1009);
        if (var6 == null) {
            var6 = class88.field1097;
        }
        var6.method72(var4, arg3, arg2, arg0.field3989, arg0.field4096, arg0.field4063, arg0.field3982, arg0.field4018, arg0.field4097, class22.field286, class110.field1529, class78.field980);
        class63.method390(class78.field980[1], class78.field980[3], 81, class78.field980[0], class78.field980[2]);
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V", line = 438)
    public final void method1717(int arg0) {
        if (arg0 != -7234) {
            this.field3607 = (class65[]) null;
        }
        field3567++;
        this.field3610 = true;
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V", line = 453)
    public static void method1718(int arg0) {
        field3591 = null;
        if (arg0 == 1) {
            field3589 = null;
            field3574 = (byte[][]) null;
            field3573 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 471)
    public static final String method1719(boolean arg0) {
        field3578++;
        if (!arg0) {
            return (String) null;
        }
        String var1 = "www";
        if (class5.field83 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class230.field3363 != null) {
            var2 = "/p=" + class230.field3363;
        }
        return "http://" + var1 + ".runescape.com/l=" + class172.field2484 + "/a=" + class244.field3667 + var2 + "/";
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILfb;)V", line = 497)
    public final synchronized void method1720(int arg0, class65 arg1) {
        field3587++;
        if (arg0 != -5605) {
            this.field3610 = false;
        }
        this.field3579 = arg1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 508)
    public void method808(Component arg0) throws Exception {
        field3571++;
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)V", line = 522)
    public void method806(int arg0) throws Exception {
        field3593++;
    }

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)V", line = 533)
    public final synchronized void method1721(int arg0) {
        field3583++;
        if (this.field3577) {
            return;
        }
        long var2 = class200.method1375(-16185);
        if (arg0 <= 61) {
            this.method1717(-66);
        }
        try {
            if (this.field3598 + 500000L < var2) {
                this.field3598 = var2 - 500000L;
            }
            while ((this.field3598 + 5000L) < var2) {
                this.method1714(-128, 256);
                this.field3598 += (long) (256000 / class276.field4312);
            }
        } catch (Exception var9) {
            this.field3598 = var2;
        }
        if (this.field3594 == null) {
            return;
        }
        try {
            if (this.field3604 != 0L) {
                if (var2 < this.field3604) {
                    return;
                }
                this.method806(this.field3606);
                this.field3610 = true;
                this.field3604 = 0L;
            }
            int var5 = this.method804();
            if (this.field3601 < this.field3608 - var5) {
                this.field3601 = this.field3608 - var5;
            }
            int var6 = this.field3603 + this.field3599;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if ((var6 + 256) > this.field3606) {
                var5 = 0;
                this.field3606 += 1024;
                if (this.field3606 > 16384) {
                    this.field3606 = 16384;
                }
                this.method807();
                this.method806(this.field3606);
                if (var6 + 256 > this.field3606) {
                    var6 = this.field3606 - 256;
                    this.field3599 = var6 - this.field3603;
                }
                this.field3610 = true;
            }
            while (var5 < var6) {
                var5 += 256;
                this.method1711(this.field3594, 256);
                this.method805();
            }
            if (this.field3609 < var2) {
                if (this.field3610) {
                    this.field3610 = false;
                } else if (this.field3601 == 0 && this.field3602 == 0) {
                    this.method807();
                    this.field3604 = var2 + 2000L;
                    return;
                } else {
                    this.field3599 = Math.min(this.field3602, this.field3601);
                    this.field3602 = this.field3601;
                }
                this.field3609 = var2 + 2000L;
                this.field3601 = 0;
            }
            this.field3608 = var5;
        } catch (Exception var8) {
            this.method807();
            this.field3604 = var2 + 2000L;
        }
    }
}
