import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class30 {

    @OriginalMember(owner = "client!db", name = "i", descriptor = "[I")
    private int[] field596;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[I")
    private int[] field588;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[B")
    private byte[] field590;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lea;")
    private static class38 field600 = class9.method46((byte) 124, "Please wait)3)3)3");

    @OriginalMember(owner = "client!db", name = "p", descriptor = "[I")
    public static int[] field603 = new int[1000];

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lea;")
    public static class38 field602 = class9.method46((byte) 122, "Registrierter Benutzer");

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Lea;")
    public static class38 field589 = field600;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lea;")
    public static class38 field607 = null;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lob;")
    public static class127 field597;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Ldd;")
    public static class32 field592;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lk;")
    public static class89 field593;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "[I")
    public static int[] field605;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[Lpa;")
    public static class135[] field595;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([BII[BII)I")
    public final int method186(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field594++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg4 + arg5;
        int var8 = 0;
        int var9 = -61 / ((arg2 + 79) / 41);
        int var10 = arg1;
        while (true) {
            byte var11 = arg3[var10];
            if (var11 >= 0) {
                var8++;
            } else {
                var8 = this.field596[var8];
            }
            int var12;
            if ((var12 = this.field596[var8]) < 0) {
                arg0[arg5++] = (byte) ~var12;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field596[var8];
            }
            int var13;
            if ((var13 = this.field596[var8]) < 0) {
                arg0[arg5++] = (byte) ~var13;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field596[var8];
            }
            int var14;
            if ((var14 = this.field596[var8]) < 0) {
                arg0[arg5++] = (byte) ~var14;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field596[var8];
            }
            int var15;
            if ((var15 = this.field596[var8]) < 0) {
                arg0[arg5++] = (byte) ~var15;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field596[var8];
            }
            int var16;
            if ((var16 = this.field596[var8]) < 0) {
                arg0[arg5++] = (byte) ~var16;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field596[var8];
            }
            int var17;
            if ((var17 = this.field596[var8]) < 0) {
                arg0[arg5++] = (byte) ~var17;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field596[var8];
            }
            int var18;
            if ((var18 = this.field596[var8]) < 0) {
                arg0[arg5++] = (byte) ~var18;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field596[var8];
            }
            int var19;
            if ((var19 = this.field596[var8]) < 0) {
                arg0[arg5++] = (byte) ~var19;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static void method187(byte arg0) {
        field600 = null;
        field597 = null;
        field592 = null;
        field593 = null;
        if (arg0 != 60) {
            return;
        }
        field595 = null;
        field607 = null;
        field602 = null;
        field589 = null;
        field603 = null;
        field605 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([B)V")
    public class30(byte[] arg0) {
        int var2 = arg0.length;
        this.field596 = new int[8];
        this.field588 = new int[var2];
        this.field590 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field588[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class94.method794(var10, var11);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field596[var14] == 0) {
                            this.field596[var14] = var4;
                        }
                        var14 = this.field596[var14];
                    }
                    if (this.field596.length <= var14) {
                        int[] var17 = new int[this.field596.length * 2];
                        for (int var18 = 0; var18 < this.field596.length; var18++) {
                            var17[var18] = this.field596[var18];
                        }
                        this.field596 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field596[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I[BIII[B)I")
    public final int method188(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        int var7 = arg2 + arg4;
        field604++;
        int var8 = 0;
        int var9 = arg3 << 3;
        while (var7 > arg2) {
            int var10 = arg5[arg2] & 0xFF;
            int var11 = this.field588[var10];
            byte var12 = this.field590[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            var9 += var12;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class94.method794(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var8 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        if (arg0 != 32) {
            field597 = null;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static final void method189(int arg0) {
        field601++;
        if (!class185.field3688) {
            return;
        }
        class5.field151 = null;
        class51.field1297 = null;
        class145.field3029 = null;
        class111.field2472 = null;
        class137.field2880 = null;
        class187.field3718 = null;
        class176.field3570 = null;
        class117.field2561 = null;
        class136.field2864 = null;
        class124.field2662 = null;
        class165.field3412 = null;
        class154.field3204 = null;
        if (arg0 >= -122) {
            method190(69, null);
        }
        field593 = null;
        class68.field1720 = null;
        class59.field1478 = null;
        class33.field677 = null;
        class123.field2624 = null;
        class100.field2234 = null;
        class187.field3722 = null;
        class87.field2019 = null;
        class94.field2126 = null;
        class111.field2470 = null;
        class80.method679(-110, 2);
        class14.method84(151, true);
        class185.field3688 = false;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method190(int arg0, Component arg1) {
        arg1.addMouseListener(class155.field3213);
        arg1.addMouseMotionListener(class155.field3213);
        arg1.addFocusListener(class155.field3213);
        field599++;
        if (arg0 <= 82) {
            method189(-31);
        }
    }
}
