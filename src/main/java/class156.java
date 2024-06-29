import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class156 {

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    private int field2775 = 32;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "J")
    private long field2776 = class181.method1244((byte) -89);

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "J")
    private long field2777 = 0L;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "[Lwf;")
    private class1[] field2779 = new class1[8];

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    private int field2782 = 0;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    private int field2778 = 0;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "J")
    private long field2791 = 0L;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "Z")
    private boolean field2793 = true;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    private int field2789 = 0;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "[Lwf;")
    private class1[] field2795 = new class1[8];

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    private int field2794 = 0;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "Lpj;")
    public static class237 field2770 = class33.method353("hint_headicons", 28);

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Lpj;")
    public static class237 field2768 = class33.method353(")4p=", 57);

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "Lpj;")
    public static class237 field2771 = class33.method353("Lade Benutzeroberfl-=che )2 ", 124);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lub;")
    public static class88 field2757 = new class88();

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "Z")
    public static boolean field2783 = false;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "Lpj;")
    public static class237 field2785 = class33.method353("(U0a )2 in: ", 89);

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public static int field2788 = 0;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public static int field2792 = 0;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "Lpj;")
    public static class237 field2784 = class33.method353("Fps:", 126);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    private int field2780;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public int field2786;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Lwf;")
    private class1 field2758;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "[I")
    public int[] field2772;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public void method1072(int arg0) throws Exception {
        field2790++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public final synchronized void method1073(boolean arg0) {
        field2756++;
        if (this.field2772 == null) {
            return;
        }
        long var2 = class181.method1244((byte) -119);
        try {
            if (this.field2791 != 0L) {
                if (this.field2791 > var2) {
                    return;
                }
                this.method1072(this.field2786);
                this.field2793 = true;
                this.field2791 = 0L;
            }
            int var4 = this.method1081();
            if (this.field2782 < this.field2794 - var4) {
                this.field2782 = this.field2794 - var4;
            }
            int var5 = this.field2781 + this.field2780;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field2786) {
                var4 = 0;
                this.field2786 += 1024;
                if (this.field2786 > 16384) {
                    this.field2786 = 16384;
                }
                this.method1084();
                this.method1072(this.field2786);
                if (this.field2786 < var5 + 256) {
                    var5 = this.field2786 - 256;
                    this.field2780 = var5 - this.field2781;
                }
                this.field2793 = true;
            }
            while (var5 > var4) {
                this.method1076(this.field2772, 256);
                this.method1077();
                var4 += 256;
            }
            if (var2 > this.field2777) {
                if (this.field2793) {
                    this.field2793 = false;
                } else if (this.field2782 == 0 && this.field2789 == 0) {
                    this.method1084();
                    this.field2791 = var2 + 2000L;
                    return;
                } else {
                    this.field2780 = Math.min(this.field2789, this.field2782);
                    this.field2789 = this.field2782;
                }
                this.field2782 = 0;
                this.field2777 = var2 + 2000L;
            }
            this.field2794 = var4;
        } catch (Exception var7) {
            this.method1084();
            this.field2791 = var2 + 2000L;
        }
        try {
            if (arg0) {
                this.field2758 = null;
            }
            if ((this.field2776 + 500000L) < var2) {
                var2 = this.field2776;
            }
            while (this.field2776 + 5000L < var2) {
                this.method1083(256, false);
                this.field2776 += (long) (256000 / class255.field4372);
            }
        } catch (Exception var6) {
            this.field2776 = var2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BZ)I")
    public static final int method1074(byte arg0, boolean arg1) {
        if (arg0 <= 89) {
            field2770 = null;
        }
        long var2 = class181.method1244((byte) -34);
        field2769++;
        for (class180 var4 = arg1 ? (class180) class28.field499.method566(0) : (class180) class28.field499.method565(-110); var4 != null; var4 = (class180) class28.field499.method565(123)) {
            if ((var4.field3166 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field3166 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1530;
                    class202.field3471[var5] = class108.field1925[var5];
                    var4.method629(0);
                    return var5;
                }
                var4.method629(0);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method1075(byte arg0) {
        field2771 = null;
        field2785 = null;
        field2757 = null;
        field2770 = null;
        field2768 = null;
        field2784 = null;
        if (arg0 != -33) {
            field2792 = 90;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([II)V")
    private final void method1076(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class268.field4571) {
            var3 = arg1 << 1;
        }
        class171.method1187(arg0, 0, var3);
        this.field2778 -= arg1;
        if (this.field2758 != null && this.field2778 <= 0) {
            this.field2778 += class255.field4372 >> 4;
            class104.method780((byte) 127, this.field2758);
            this.method1088(this.field2758, this.field2758.method1(), 112);
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
                        class1 var10 = null;
                        class1 var11 = this.field2795[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class217 var12 = var11.field4;
                                if (var12 == null || var12.field3765 <= var8) {
                                    var11.field2 = true;
                                    int var13 = var11.method2();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3765 += var13;
                                    }
                                    if (var4 >= this.field2775) {
                                        break label107;
                                    }
                                    class1 var14 = var11.method3();
                                    if (var14 != null) {
                                        int var15 = var11.field1;
                                        while (var14 != null) {
                                            this.method1088(var14, var15 * var14.method1() >> 8, -41);
                                            var14 = var11.method5();
                                        }
                                    }
                                    class1 var16 = var11.field3;
                                    var11.field3 = null;
                                    if (var10 == null) {
                                        this.field2795[var7] = var16;
                                    } else {
                                        var10.field3 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2779[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3;
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
                class1 var18 = this.field2795[var17];
                this.field2795[var17] = this.field2779[var17] = null;
                while (var18 != null) {
                    class1 var19 = var18.field3;
                    var18.field3 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2778 < 0) {
            this.field2778 = 0;
        }
        if (this.field2758 != null) {
            this.field2758.method7(arg0, 0, arg1);
        }
        this.field2776 = class181.method1244((byte) -44);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()V")
    public void method1077() throws Exception {
        field2774++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILwf;)V")
    public final synchronized void method1078(int arg0, class1 arg1) {
        int var3 = 112 / ((34 - arg0) / 34);
        field2760++;
        this.field2758 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public final void method1079(int arg0) {
        this.field2793 = true;
        field2787++;
        int var2 = -20 % ((arg0 - 54) / 51);
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    public final synchronized void method1080(int arg0) {
        if (class183.field3214 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class183.field3214.field699[var3] == this) {
                    class183.field3214.field699[var3] = null;
                }
                if (class183.field3214.field699[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class183.field3214.field704 = true;
                while (class183.field3214.field705) {
                    class84.method645(arg0 + 1, 50L);
                }
                class183.field3214 = null;
            }
        }
        field2759++;
        if (arg0 == 0) {
            this.method1084();
            this.field2772 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()I")
    public int method1081() throws Exception {
        field2773++;
        return this.field2786;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
    public static final void method1082(int arg0) {
        if (arg0 == 0) {
            field2766++;
            class23.field414.method934((byte) 62);
            class111.field1950.method934((byte) 62);
            class114.field2007.method934((byte) 62);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)V")
    private final void method1083(int arg0, boolean arg1) {
        if (arg1) {
            this.method1076((int[]) null, -39);
        }
        field2762++;
        this.field2778 -= arg0;
        if (this.field2778 < 0) {
            this.field2778 = 0;
        }
        if (this.field2758 != null) {
            this.field2758.method6(arg0);
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "()V")
    public void method1084() {
        field2763++;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)V")
    public final synchronized void method1085(boolean arg0) {
        field2767++;
        this.field2793 = arg0;
        try {
            this.method1087();
        } catch (Exception var2) {
            this.method1084();
            this.field2791 = class181.method1244((byte) -128) + 2000L;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1086(Component arg0) throws Exception {
        field2764++;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "()V")
    public void method1087() throws Exception {
        field2765++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lwf;II)V")
    private final void method1088(class1 arg0, int arg1, int arg2) {
        int var4 = arg1 >> 5;
        class1 var5 = this.field2779[var4];
        if (var5 == null) {
            this.field2795[var4] = arg0;
        } else {
            var5.field3 = arg0;
        }
        int var6 = -115 / ((arg2 + 4) / 35);
        this.field2779[var4] = arg0;
        field2761++;
        arg0.field1 = arg1;
    }
}
