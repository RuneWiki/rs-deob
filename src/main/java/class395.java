import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class395 {

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    private int field5761 = 32;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "Z")
    private boolean field5762 = false;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "J")
    private long field5757 = class98.method768((byte) 47);

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    private int field5765 = 0;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "J")
    private long field5764 = 0L;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    private int field5766 = 0;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "Z")
    private boolean field5768 = true;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "[Lmq;")
    private class417[] field5770 = new class417[8];

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    private int field5771 = 0;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "[Lmq;")
    private class417[] field5774 = new class417[8];

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    private int field5767 = 0;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "J")
    private long field5773 = 0L;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field5738 = 0;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Z")
    public static boolean field5746 = false;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static volatile int field5755 = 0;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public int field5769;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    private int field5772;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public int field5775;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Ljc;")
    public static class203 field5742;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lmq;")
    private class417 field5741;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5744;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "[I")
    public int[] field5749;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lir;I)V")
    public static final void method2532(class185 arg0, int arg1) {
        field5759++;
        class337.field4981 = arg0.method1220("titlebg", 0);
        class72.field1023 = arg0.method1220("logo", arg1 ^ arg1);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;BC)I")
    public static final int method2533(String arg0, byte arg1, char arg2) {
        field5751++;
        int var3 = 0;
        if (arg1 != 95) {
            field5746 = false;
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public final synchronized void method2534(boolean arg0) {
        if (class356.field5273 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class356.field5273.field4752[var3] == this) {
                    class356.field5273.field4752[var3] = null;
                }
                if (class356.field5273.field4752[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class356.field5273.field4758 = true;
                while (class356.field5273.field4760) {
                    class31.method245(50L, 105);
                }
                class356.field5273 = null;
            }
        }
        field5739++;
        if (arg0) {
            method2540((byte[][]) null, 112, (int[]) null, 83, (byte[]) null, -40, (byte[][]) null, (int[]) null);
        }
        this.method11();
        this.field5762 = true;
        this.field5749 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()I")
    public int method7() throws Exception {
        field5763++;
        return this.field5775;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public void method8(int arg0) throws Exception {
        field5747++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([II)V")
    private final void method2535(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class25.field449) {
            var3 = arg1 << 1;
        }
        class206.method1355(arg0, 0, var3);
        this.field5765 -= arg1;
        if (this.field5741 != null && this.field5765 <= 0) {
            this.field5765 += class388.field5673 >> 4;
            class134.method959(99, this.field5741);
            this.method2537((byte) -89, this.field5741.method1741(), this.field5741);
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
                        class417 var10 = null;
                        class417 var11 = this.field5774[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class363 var12 = var11.field6087;
                                if (var12 == null || var12.field5372 <= var8) {
                                    var11.field6085 = true;
                                    int var13 = var11.method152();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field5372 += var13;
                                    }
                                    if (var4 >= this.field5761) {
                                        break label107;
                                    }
                                    class417 var14 = var11.method189();
                                    if (var14 != null) {
                                        int var15 = var11.field6084;
                                        while (var14 != null) {
                                            this.method2537((byte) -70, var15 * var14.method1741() >> 8, var14);
                                            var14 = var11.method156();
                                        }
                                    }
                                    class417 var16 = var11.field6086;
                                    var11.field6086 = null;
                                    if (var10 == null) {
                                        this.field5774[var7] = var16;
                                    } else {
                                        var10.field6086 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5770[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field6086;
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
                class417 var18 = this.field5774[var17];
                this.field5774[var17] = this.field5770[var17] = null;
                while (var18 != null) {
                    class417 var19 = var18.field6086;
                    var18.field6086 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5765 < 0) {
            this.field5765 = 0;
        }
        if (this.field5741 != null) {
            this.field5741.method165(arg0, 0, arg1);
        }
        this.field5757 = class98.method768((byte) 29);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "()V")
    public void method11() {
        field5743++;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public final void method2536(int arg0) {
        this.field5768 = true;
        if (arg0 != 0) {
            this.field5768 = true;
        }
        field5735++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BILmq;)V")
    private final void method2537(byte arg0, int arg1, class417 arg2) {
        field5753++;
        int var4 = arg1 >> 5;
        class417 var5 = this.field5770[var4];
        if (var5 == null) {
            this.field5774[var4] = arg2;
        } else {
            var5.field6086 = arg2;
        }
        if (arg0 < -65) {
            this.field5770[var4] = arg2;
            arg2.field6084 = arg1;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    private final void method2538(int arg0, int arg1) {
        field5740++;
        this.field5765 -= arg1;
        if (arg0 > this.field5765) {
            this.field5765 = 0;
        }
        if (this.field5741 != null) {
            this.field5741.method187(arg1);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lmq;B)V")
    public final synchronized void method2539(class417 arg0, byte arg1) {
        field5748++;
        if (arg1 >= 37) {
            this.field5741 = arg0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "()V")
    public void method9() throws Exception {
        field5737++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([[BI[II[BI[[B[I)I")
    public static final int method2540(byte[][] arg0, int arg1, int[] arg2, int arg3, byte[] arg4, int arg5, byte[][] arg6, int[] arg7) {
        field5750++;
        int var8 = arg7[arg1];
        int var9 = arg2[arg1] + var8;
        int var10 = arg7[arg3];
        int var11 = arg2[arg3] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg4[arg1] & 0xFF;
        int var15 = -90 / ((27 - arg5) / 52);
        if (var14 > (arg4[arg3] & 0xFF)) {
            var14 = arg4[arg3] & 0xFF;
        }
        byte[] var16 = arg6[arg1];
        byte[] var17 = arg0[arg3];
        int var18 = var12 - var8;
        int var19 = var12 - var10;
        for (int var20 = var12; var20 < var13; var20++) {
            int var21 = var16[var18++] + var17[var19++];
            if (var21 < var14) {
                var14 = var21;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public final synchronized void method2541(byte arg0) {
        this.field5768 = true;
        field5758++;
        int var2 = -103 % ((arg0 + 90) / 36);
        try {
            this.method9();
        } catch (Exception var3) {
            this.method11();
            this.field5764 = class98.method768((byte) -95) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "()V")
    public void method6() throws Exception {
        field5745++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
    public static final void method2542(boolean arg0, int arg1) {
        if (class269.field3989 == null || class269.field3989.length < arg1) {
            class269.field3989 = new int[arg1];
        }
        field5754++;
        if (arg0) {
            method2544((class185) null, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method10(Component arg0) throws Exception {
        field5760++;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public static void method2543(byte arg0) {
        field5744 = null;
        if (arg0 != 95) {
            method2543((byte) -49);
        }
        field5742 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lir;B)V")
    public static final void method2544(class185 arg0, byte arg1) {
        if (arg1 != 11) {
            field5746 = false;
        }
        field5756++;
        class93.field1275 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public final synchronized void method2545(int arg0) {
        field5736++;
        if (this.field5762) {
            return;
        }
        long var2 = class98.method768((byte) -112);
        try {
            if ((long) arg0 + this.field5757 < var2) {
                this.field5757 = var2 - 500000L;
            }
            while (var2 > this.field5757 + 5000L) {
                this.method2538(0, 256);
                this.field5757 += (long) (256000 / class388.field5673);
            }
        } catch (Exception var7) {
            this.field5757 = var2;
        }
        if (this.field5749 == null) {
            return;
        }
        try {
            if (this.field5764 != 0L) {
                if (this.field5764 > var2) {
                    return;
                }
                this.method8(this.field5775);
                this.field5768 = true;
                this.field5764 = 0L;
            }
            int var4 = this.method7();
            if (this.field5767 < (this.field5766 - var4)) {
                this.field5767 = this.field5766 - var4;
            }
            int var5 = this.field5772 + this.field5769;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field5775) {
                this.field5775 += 1024;
                if (this.field5775 > 16384) {
                    this.field5775 = 16384;
                }
                this.method11();
                this.method8(this.field5775);
                var4 = 0;
                this.field5768 = true;
                if (this.field5775 < var5 + 256) {
                    var5 = this.field5775 - 256;
                    this.field5772 = var5 - this.field5769;
                }
            }
            while (var5 > var4) {
                this.method2535(this.field5749, 256);
                var4 += 256;
                this.method6();
            }
            if (var2 > this.field5773) {
                if (this.field5768) {
                    this.field5768 = false;
                } else if (this.field5767 == 0 && this.field5771 == 0) {
                    this.method11();
                    this.field5764 = var2 + 2000L;
                    return;
                } else {
                    this.field5772 = Math.min(this.field5771, this.field5767);
                    this.field5771 = this.field5767;
                }
                this.field5773 = var2 + 2000L;
                this.field5767 = 0;
            }
            this.field5766 = var4;
        } catch (Exception var6) {
            this.method11();
            this.field5764 = var2 + 2000L;
        }
    }
}
