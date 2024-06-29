import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class289 {

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    private int field4626 = 32;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "Z")
    private boolean field4629 = false;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "J")
    private long field4622 = class191.method1350((byte) 101);

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "Z")
    private boolean field4639 = true;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "J")
    private long field4638 = 0L;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "[Lpd;")
    private class194[] field4643 = new class194[8];

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    private int field4640 = 0;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "J")
    private long field4645 = 0L;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "[Lpd;")
    private class194[] field4642 = new class194[8];

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    private int field4649 = 0;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    private int field4646 = 0;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    private int field4648 = 0;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4627 = "red:";

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public int field4641;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public int field4644;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    private int field4647;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "Lbl;")
    public static class146 field4630;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Lpd;")
    private class194 field4624;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "Z")
    public static boolean field4636;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "[I")
    public int[] field4637;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()V")
    public void method772() throws Exception {
        field4625++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)V")
    private final void method1921(int arg0, byte arg1) {
        field4616++;
        this.field4648 -= arg0;
        if (arg1 > -21) {
            this.field4644 = -104;
        }
        if (this.field4648 < 0) {
            this.field4648 = 0;
        }
        if (this.field4624 != null) {
            this.field4624.method723(arg0);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public final synchronized void method1922(byte arg0) {
        field4631++;
        if (class41.field599 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class41.field599.field3790[var3] == this) {
                    class41.field599.field3790[var3] = null;
                }
                if (class41.field599.field3790[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class41.field599.field3785 = true;
                while (class41.field599.field3796) {
                    class262.method1758(50L, 29552);
                }
                class41.field599 = null;
            }
        }
        this.method775();
        this.field4629 = true;
        if (arg0 <= -9) {
            this.field4637 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()V")
    public void method776() throws Exception {
        field4628++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method1923(int arg0) {
        field4627 = null;
        field4630 = null;
        if (arg0 != 3111) {
            field4627 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
    public final synchronized void method1924(byte arg0) {
        field4623++;
        if (this.field4629) {
            return;
        }
        long var2 = class191.method1350((byte) -85);
        try {
            if (var2 > this.field4622 + 500000L) {
                this.field4622 = var2 - 500000L;
            }
            while ((this.field4622 + 5000L) < var2) {
                this.method1921(256, (byte) -101);
                this.field4622 += (long) (256000 / class133.field2103);
            }
        } catch (Exception var7) {
            this.field4622 = var2;
        }
        if (this.field4637 == null) {
            return;
        }
        try {
            if (arg0 != 89) {
                this.method1924((byte) 102);
            }
            if (this.field4638 != 0L) {
                if (var2 < this.field4638) {
                    return;
                }
                this.method774(this.field4644);
                this.field4638 = 0L;
                this.field4639 = true;
            }
            int var4 = this.method778();
            if (this.field4646 < this.field4649 - var4) {
                this.field4646 = this.field4649 - var4;
            }
            int var5 = this.field4647 + this.field4641;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field4644) {
                var4 = 0;
                this.field4644 += 1024;
                if (this.field4644 > 16384) {
                    this.field4644 = 16384;
                }
                this.method775();
                this.method774(this.field4644);
                if (this.field4644 < (var5 + 256)) {
                    var5 = this.field4644 - 256;
                    this.field4647 = var5 - this.field4641;
                }
                this.field4639 = true;
            }
            while (var4 < var5) {
                this.method1930(this.field4637, 256);
                this.method772();
                var4 += 256;
            }
            if (var2 > this.field4645) {
                if (this.field4639) {
                    this.field4639 = false;
                } else if (this.field4646 == 0 && this.field4640 == 0) {
                    this.method775();
                    this.field4638 = var2 + 2000L;
                    return;
                } else {
                    this.field4647 = Math.min(this.field4640, this.field4646);
                    this.field4640 = this.field4646;
                }
                this.field4646 = 0;
                this.field4645 = var2 + 2000L;
            }
            this.field4649 = var4;
        } catch (Exception var6) {
            this.method775();
            this.field4638 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public final void method1925(int arg0) {
        this.field4639 = true;
        field4614++;
        int var2 = -76 / ((arg0 - 44) / 47);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()V")
    public void method775() {
        field4615++;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    public void method774(int arg0) throws Exception {
        field4635++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lpd;B)V")
    public final synchronized void method1926(class194 arg0, byte arg1) {
        field4618++;
        this.field4624 = arg0;
        if (arg1 <= 49) {
            this.method1931(7);
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V")
    public static final void method1927(byte arg0) {
        field4633++;
        if (class176.field2873 == 0) {
            return;
        }
        try {
            int var1 = -66 / ((28 - arg0) / 36);
            if (++class81.field1364 > 2000) {
                if (class208.field3298 != null) {
                    class208.field3298.method974((byte) 126);
                    class208.field3298 = null;
                }
                if (class225.field3653 >= 1) {
                    class176.field2873 = 0;
                    class9.field91 = -5;
                    return;
                }
                class81.field1364 = 0;
                class176.field2873 = 1;
                class225.field3653++;
                if (class32.field483 == class245.field3903) {
                    class245.field3903 = class52.field870;
                } else {
                    class245.field3903 = class32.field483;
                }
            }
            if (class176.field2873 == 1) {
                class230.field3720 = class268.field4323.method326(true, class145.field2289, class245.field3903);
                class176.field2873 = 2;
            }
            if (class176.field2873 == 2) {
                if (class230.field3720.field2814 == 2) {
                    throw new IOException();
                }
                if (class230.field3720.field2814 != 1) {
                    return;
                }
                class208.field3298 = new class139((Socket) class230.field3720.field2817, class268.field4323);
                class230.field3720 = null;
                class208.field3298.method977(class314.field5061.field2573, class314.field5061.field2568, 0, -27241);
                if (class233.field3750 != null) {
                    class233.field3750.method1925(-12);
                }
                if (class62.field1024 != null) {
                    class62.field1024.method1925(121);
                }
                int var2 = class208.field3298.method978(-122);
                if (class233.field3750 != null) {
                    class233.field3750.method1925(-56);
                }
                if (class62.field1024 != null) {
                    class62.field1024.method1925(-110);
                }
                if (var2 != 21) {
                    class176.field2873 = 0;
                    class9.field91 = var2;
                    class208.field3298.method974((byte) 123);
                    class208.field3298 = null;
                    return;
                }
                class176.field2873 = 3;
            }
            if (class176.field2873 == 3) {
                if (class208.field3298.method972(0) < 1) {
                    return;
                }
                class81.field1363 = new String[class208.field3298.method978(-118)];
                class176.field2873 = 4;
            }
            if (class176.field2873 == 4 && class208.field3298.method972(0) >= class81.field1363.length * 8) {
                class131.field2053.field2568 = 0;
                class208.field3298.method979(class131.field2053.field2573, -1, 0, class81.field1363.length * 8);
                for (int var3 = 0; var3 < class81.field1363.length; var3++) {
                    class81.field1363[var3] = class123.method865(86, class131.field2053.method1119(true));
                }
                class176.field2873 = 0;
                class9.field91 = 21;
                class208.field3298.method974((byte) 113);
                class208.field3298 = null;
            }
        } catch (IOException var4) {
            if (class208.field3298 != null) {
                class208.field3298.method974((byte) 125);
                class208.field3298 = null;
            }
            if (class225.field3653 < 1) {
                class225.field3653++;
                class81.field1364 = 0;
                class176.field2873 = 1;
                if (class32.field483 == class245.field3903) {
                    class245.field3903 = class52.field870;
                } else {
                    class245.field3903 = class32.field483;
                }
            } else {
                class9.field91 = -4;
                class176.field2873 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIILqk;JZ)V")
    public static final void method1928(int arg0, int arg1, int arg2, int arg3, class2 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class188 var8 = new class188();
        var8.field3057 = arg4;
        var8.field3053 = arg1 * 128 + 64;
        var8.field3055 = arg2 * 128 + 64;
        var8.field3054 = arg3;
        var8.field3050 = arg5;
        if (class218.field3584[arg0][arg1][arg2] == null) {
            class218.field3584[arg0][arg1][arg2] = new class151(arg0, arg1, arg2);
        }
        class218.field3584[arg0][arg1][arg2].field2364 = var8;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "()I")
    public int method778() throws Exception {
        field4619++;
        return this.field4644;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method777(Component arg0) throws Exception {
        field4634++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILpd;I)V")
    private final void method1929(int arg0, class194 arg1, int arg2) {
        field4632++;
        int var4 = arg2 >> 5;
        class194 var5 = this.field4643[var4];
        if (var5 == null) {
            this.field4642[var4] = arg1;
        } else {
            var5.field3148 = arg1;
        }
        this.field4643[var4] = arg1;
        if (arg0 < 86) {
            this.method1924((byte) -11);
        }
        arg1.field3150 = arg2;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([II)V")
    private final void method1930(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class262.field4214) {
            var3 = arg1 << 1;
        }
        class157.method1067(arg0, 0, var3);
        this.field4648 -= arg1;
        if (this.field4624 != null && this.field4648 <= 0) {
            this.field4648 += class133.field2103 >> 4;
            class240.method1618(this.field4624, 0);
            this.method1929(124, this.field4624, this.field4624.method724());
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
                        class194 var10 = null;
                        class194 var11 = this.field4642[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class283 var12 = var11.field3147;
                                if (var12 == null || var12.field4512 <= var8) {
                                    var11.field3149 = true;
                                    int var13 = var11.method729();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4512 += var13;
                                    }
                                    if (var4 >= this.field4626) {
                                        break label107;
                                    }
                                    class194 var14 = var11.method728();
                                    if (var14 != null) {
                                        int var15 = var11.field3150;
                                        while (var14 != null) {
                                            this.method1929(113, var14, var15 * var14.method724() >> 8);
                                            var14 = var11.method714();
                                        }
                                    }
                                    class194 var16 = var11.field3148;
                                    var11.field3148 = null;
                                    if (var10 == null) {
                                        this.field4642[var7] = var16;
                                    } else {
                                        var10.field3148 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4643[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3148;
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
                class194 var18 = this.field4642[var17];
                this.field4642[var17] = this.field4643[var17] = null;
                while (var18 != null) {
                    class194 var19 = var18.field3148;
                    var18.field3148 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4648 < 0) {
            this.field4648 = 0;
        }
        if (this.field4624 != null) {
            this.field4624.method734(arg0, 0, arg1);
        }
        this.field4622 = class191.method1350((byte) -113);
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
    public final synchronized void method1931(int arg0) {
        field4620++;
        this.field4639 = true;
        try {
            this.method776();
        } catch (Exception var2) {
            this.method775();
            this.field4638 = class191.method1350((byte) -31) + 2000L;
        }
        if (arg0 != 2000) {
            this.method1924((byte) -39);
        }
    }
}
