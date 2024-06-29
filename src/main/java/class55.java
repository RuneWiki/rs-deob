import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class55 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    private int field755 = 32;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "J")
    private long field764 = class260.method1785((byte) -99);

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    private int field776 = 0;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "[Lof;")
    private class267[] field773 = new class267[8];

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    private int field774 = 0;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "[Lof;")
    private class267[] field779 = new class267[8];

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    private int field782 = 0;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "J")
    private long field772 = 0L;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    private int field780 = 0;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "J")
    private long field775 = 0L;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Z")
    private boolean field777 = true;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field758 = -1;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    private int field784;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lof;")
    private class267 field757;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "[I")
    public int[] field766;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public final synchronized void method393(int arg0) {
        this.field777 = true;
        field756++;
        try {
            this.method394();
        } catch (Exception var2) {
            this.method405();
            this.field775 = class260.method1785((byte) -97) + 2000L;
        }
        if (arg0 != 2000) {
            this.field784 = -72;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public void method394() throws Exception {
        field768++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public final synchronized void method395(byte arg0) {
        if (class179.field2792 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class179.field2792.field1894[var3] == this) {
                    class179.field2792.field1894[var3] = null;
                }
                if (class179.field2792.field1894[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class179.field2792.field1892 = true;
                while (class179.field2792.field1891) {
                    class170.method1183(50L, (byte) -104);
                }
                class179.field2792 = null;
            }
        }
        this.method405();
        this.field766 = null;
        field770++;
        if (arg0 != 116) {
            this.field764 = -31L;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lof;I)V")
    public final synchronized void method396(class267 arg0, int arg1) {
        field771++;
        this.field757 = arg0;
        if (arg1 != 255) {
            this.method402(-25);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILef;)V")
    public static final void method397(int arg0, class214 arg1) {
        if (class57.field811 == arg1.field3495) {
            class110.field1675[arg1.field3389] = true;
        }
        field767++;
        if (arg0 != 0) {
            field758 = -128;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([II)V")
    private final void method398(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class72.field1013) {
            var3 = arg1 << 1;
        }
        class196.method1359(arg0, 0, var3);
        this.field774 -= arg1;
        if (this.field757 != null && this.field774 <= 0) {
            this.field774 += class290.field4582 >> 4;
            class254.method1714(121, this.field757);
            this.method407(this.field757.method1748(), 2000, this.field757);
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
                        class267 var10 = null;
                        class267 var11 = this.field773[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class24 var12 = var11.field4278;
                                if (var12 == null || var12.field293 <= var8) {
                                    var11.field4279 = true;
                                    int var13 = var11.method710();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field293 += var13;
                                    }
                                    if (var4 >= this.field755) {
                                        break label107;
                                    }
                                    class267 var14 = var11.method713();
                                    if (var14 != null) {
                                        int var15 = var11.field4277;
                                        while (var14 != null) {
                                            this.method407(var15 * var14.method1748() >> 8, 2000, var14);
                                            var14 = var11.method717();
                                        }
                                    }
                                    class267 var16 = var11.field4276;
                                    var11.field4276 = null;
                                    if (var10 == null) {
                                        this.field773[var7] = var16;
                                    } else {
                                        var10.field4276 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field779[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4276;
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
                class267 var18 = this.field773[var17];
                this.field773[var17] = this.field779[var17] = null;
                while (var18 != null) {
                    class267 var19 = var18.field4276;
                    var18.field4276 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field774 < 0) {
            this.field774 = 0;
        }
        if (this.field757 != null) {
            this.field757.method712(arg0, 0, arg1);
        }
        this.field764 = class260.method1785((byte) -112);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public final synchronized void method399(boolean arg0) {
        field762++;
        if (this.field766 == null) {
            return;
        }
        long var2 = class260.method1785((byte) -102);
        try {
            if (this.field775 != 0L) {
                if (var2 < this.field775) {
                    return;
                }
                this.method400(this.field781);
                this.field777 = true;
                this.field775 = 0L;
            }
            int var4 = this.method403();
            if (this.field780 < (this.field782 - var4)) {
                this.field780 = this.field782 - var4;
            }
            int var5 = this.field783 + this.field784;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field781 < var5 + 256) {
                var4 = 0;
                this.field781 += 1024;
                if (this.field781 > 16384) {
                    this.field781 = 16384;
                }
                this.method405();
                this.method400(this.field781);
                this.field777 = true;
                if ((var5 + 256) > this.field781) {
                    var5 = this.field781 - 256;
                    this.field784 = var5 - this.field783;
                }
            }
            while (var4 < var5) {
                this.method398(this.field766, 256);
                var4 += 256;
                this.method401();
            }
            if (this.field772 < var2) {
                if (this.field777) {
                    this.field777 = false;
                } else if (this.field780 == 0 && this.field776 == 0) {
                    this.method405();
                    this.field775 = var2 + 2000L;
                    return;
                } else {
                    this.field784 = Math.min(this.field776, this.field780);
                    this.field776 = this.field780;
                }
                this.field780 = 0;
                this.field772 = var2 + 2000L;
            }
            if (arg0) {
                this.field777 = true;
            }
            this.field782 = var4;
        } catch (Exception var7) {
            this.method405();
            this.field775 = var2 + 2000L;
        }
        try {
            if ((this.field764 + 500000L) < var2) {
                var2 = this.field764;
            }
            while (this.field764 + 5000L < var2) {
                this.method406(256, !arg0);
                this.field764 += (long) (256000 / class290.field4582);
            }
        } catch (Exception var6) {
            this.field764 = var2;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public void method400(int arg0) throws Exception {
        field760++;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
    public void method401() throws Exception {
        field769++;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public final void method402(int arg0) {
        if (arg0 < 12) {
            this.field782 = 35;
        }
        field759++;
        this.field777 = true;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()I")
    public int method403() throws Exception {
        field754++;
        return this.field781;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method404(Component arg0) throws Exception {
        field765++;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
    public void method405() {
        field761++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V")
    private final void method406(int arg0, boolean arg1) {
        this.field774 -= arg0;
        if (this.field774 < 0) {
            this.field774 = 0;
        }
        field778++;
        if (this.field757 != null) {
            this.field757.method707(arg0);
        }
        if (!arg1) {
            this.field780 = 120;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILof;)V")
    private final void method407(int arg0, int arg1, class267 arg2) {
        field763++;
        if (arg1 != 2000) {
            this.field776 = -88;
        }
        int var4 = arg0 >> 5;
        class267 var5 = this.field779[var4];
        if (var5 == null) {
            this.field773[var4] = arg2;
        } else {
            var5.field4276 = arg2;
        }
        this.field779[var4] = arg2;
        arg2.field4277 = arg0;
    }
}
