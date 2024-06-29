import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class257 {

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    private int field3764 = 32;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "Z")
    private boolean field3765 = false;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "J")
    private long field3768 = class437.method2644(-99);

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    private int field3783 = 0;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "[Lti;")
    private class304[] field3787 = new class304[8];

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "J")
    private long field3789 = 0L;

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "Z")
    private boolean field3790 = true;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "I")
    private int field3785 = 0;

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
    private int field3791 = 0;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "[Lti;")
    private class304[] field3793 = new class304[8];

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "J")
    private long field3792 = 0L;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
    private int field3794 = 0;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "Lsl;")
    public static class318 field3773 = new class318(54, 12);

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "Lsl;")
    public static class318 field3778 = new class318(5, 5);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "I")
    private int field3784;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "I")
    public int field3786;

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "Ll;")
    public static class16 field3781;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Lti;")
    private class304 field3763;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "[I")
    public int[] field3777;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
    private final void method1648(int arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        field3766++;
        this.field3785 -= arg0;
        if (this.field3785 < 0) {
            this.field3785 = 0;
        }
        if (this.field3763 != null) {
            this.field3763.method136(arg0);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
    public static void method1649(byte arg0) {
        field3778 = null;
        field3773 = null;
        if (arg0 != -57) {
            field3781 = null;
        }
        field3781 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public final synchronized void method1650(int arg0) {
        this.field3790 = true;
        field3775++;
        try {
            this.method1455();
        } catch (Exception var2) {
            this.method1456();
            this.field3792 = class437.method2644(-123) + 2000L;
        }
        if (arg0 != 2000) {
            method1651((byte) -2);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
    public void method1451(int arg0) throws Exception {
        field3772++;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1454(Component arg0) throws Exception {
        field3767++;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "()I")
    public int method1453() throws Exception {
        field3762++;
        return this.field3786;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V")
    public static final void method1651(byte arg0) {
        field3770++;
        if (arg0 != 14) {
            return;
        }
        class300 var1 = null;
        try {
            class449 var2 = class498.field7404.method2561((byte) -73, "2");
            while (var2.field6617 == 0) {
                class213.method1462(1L, -5184);
            }
            if (var2.field6617 == 1) {
                var1 = (class300) var2.field6613;
                byte[] var3 = new byte[(int) var1.method1888(74)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1886(var4, var3.length - var4, var3, (byte) -89);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class273.method1760(-2, new class65(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1884(-1);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
    public final synchronized void method1652(int arg0) {
        field3774++;
        if (this.field3765) {
            return;
        }
        long var2 = class437.method2644(arg0 ^ 0xFFFFFFC7);
        try {
            if (var2 > (this.field3768 + 500000L)) {
                this.field3768 = var2 - 500000L;
            }
            while ((this.field3768 + 5000L) < var2) {
                this.method1648(256, 1);
                this.field3768 += (256000 / class405.field6017);
            }
        } catch (Exception var7) {
            this.field3768 = var2;
        }
        if (this.field3777 == null) {
            return;
        }
        try {
            if ((long) arg0 != this.field3792) {
                if (var2 < this.field3792) {
                    return;
                }
                this.method1451(this.field3786);
                this.field3792 = 0L;
                this.field3790 = true;
            }
            int var4 = this.method1453();
            if (this.field3783 < this.field3791 - var4) {
                this.field3783 = this.field3791 - var4;
            }
            int var5 = this.field3788 + this.field3784;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field3786 < (var5 + 256)) {
                this.field3786 += 1024;
                if (this.field3786 > 16384) {
                    this.field3786 = 16384;
                }
                this.method1456();
                this.method1451(this.field3786);
                var4 = 0;
                this.field3790 = true;
                if (this.field3786 < (var5 + 256)) {
                    var5 = this.field3786 - 256;
                    this.field3784 = var5 - this.field3788;
                }
            }
            while (var4 < var5) {
                this.method1656(this.field3777, 256);
                this.method1452();
                var4 += 256;
            }
            if (this.field3789 < var2) {
                if (this.field3790) {
                    this.field3790 = false;
                } else if (this.field3783 == 0 && this.field3794 == 0) {
                    this.method1456();
                    this.field3792 = var2 + 2000L;
                    return;
                } else {
                    this.field3784 = Math.min(this.field3794, this.field3783);
                    this.field3794 = this.field3783;
                }
                this.field3789 = var2 + 2000L;
                this.field3783 = 0;
            }
            this.field3791 = var4;
        } catch (Exception var6) {
            this.method1456();
            this.field3792 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lti;B)V")
    public final synchronized void method1653(class304 arg0, byte arg1) {
        field3780++;
        this.field3763 = arg0;
        if (arg1 != -15) {
            this.field3768 = -125L;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "()V")
    public void method1456() {
        field3779++;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "()V")
    public void method1455() throws Exception {
        field3782++;
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "()V")
    public void method1452() throws Exception {
        field3769++;
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
    public final synchronized void method1654(int arg0) {
        if (arg0 != 12) {
            this.method1650(-32);
        }
        field3761++;
        if (class398.field5830 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class398.field5830.field1914[var3] == this) {
                    class398.field5830.field1914[var3] = null;
                }
                if (class398.field5830.field1914[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class398.field5830.field1912 = true;
                while (class398.field5830.field1915) {
                    class213.method1462(50L, -5184);
                }
                class398.field5830 = null;
            }
        }
        this.method1456();
        this.field3777 = null;
        this.field3765 = true;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILti;)V")
    private final void method1655(int arg0, int arg1, class304 arg2) {
        field3776++;
        int var4 = arg1 >> 5;
        class304 var5 = this.field3787[var4];
        if (var5 == null) {
            this.field3793[var4] = arg2;
        } else {
            var5.field4327 = arg2;
        }
        int var6 = -106 % ((arg0 - 36) / 55);
        this.field3787[var4] = arg2;
        arg2.field4326 = arg1;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([II)V")
    private final void method1656(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class241.field3572) {
            var3 = arg1 << 1;
        }
        class201.method1408(arg0, 0, var3);
        this.field3785 -= arg1;
        if (this.field3763 != null && this.field3785 <= 0) {
            this.field3785 += class405.field6017 >> 4;
            class88.method776(this.field3763, 7582);
            this.method1655(126, this.field3763.method153(), this.field3763);
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
                        class304 var10 = null;
                        class304 var11 = this.field3793[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class54 var12 = var11.field4329;
                                if (var12 == null || var12.field583 <= var8) {
                                    var11.field4328 = true;
                                    int var13 = var11.method143();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field583 += var13;
                                    }
                                    if (var4 >= this.field3764) {
                                        break label107;
                                    }
                                    class304 var14 = var11.method151();
                                    if (var14 != null) {
                                        int var15 = var11.field4326;
                                        while (var14 != null) {
                                            this.method1655(101, var15 * var14.method153() >> 8, var14);
                                            var14 = var11.method173();
                                        }
                                    }
                                    class304 var16 = var11.field4327;
                                    var11.field4327 = null;
                                    if (var10 == null) {
                                        this.field3793[var7] = var16;
                                    } else {
                                        var10.field4327 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3787[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4327;
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
                class304 var18 = this.field3793[var17];
                this.field3793[var17] = this.field3787[var17] = null;
                while (var18 != null) {
                    class304 var19 = var18.field4327;
                    var18.field4327 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3785 < 0) {
            this.field3785 = 0;
        }
        if (this.field3763 != null) {
            this.field3763.method147(arg0, 0, arg1);
        }
        this.field3768 = class437.method2644(-58);
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)V")
    public final void method1657(byte arg0) {
        this.field3790 = true;
        field3771++;
        int var2 = -26 % ((arg0 - 60) / 49);
    }
}
