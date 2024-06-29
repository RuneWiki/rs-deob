import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class60 {

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    private int field1110 = 32;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "J")
    private long field1094 = class53.method405(73);

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "Z")
    private boolean field1114 = true;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "J")
    private long field1115 = 0L;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    private int field1122 = 0;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "[Lda;")
    private class184[] field1119 = new class184[8];

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    private int field1116 = 0;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    private int field1123 = 0;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    private int field1113 = 0;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "J")
    private long field1118 = 0L;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "[Lda;")
    private class184[] field1121 = new class184[8];

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1093 = -1;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Lqk;")
    public static class207 field1111 = class24.method212(255, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field1112 = 0;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    private int field1117;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lda;")
    private class184 field1095;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "[I")
    public int[] field1100;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "[Lqk;")
    public static class207[] field1104;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public final synchronized void method436(int arg0) {
        field1107++;
        if (this.field1100 == null) {
            return;
        }
        long var2 = class53.method405(98);
        try {
            if (this.field1118 != 0L) {
                if (var2 < this.field1118) {
                    return;
                }
                this.method438(this.field1120);
                this.field1114 = true;
                this.field1118 = 0L;
            }
            int var4 = this.method451();
            if (this.field1122 - var4 > this.field1123) {
                this.field1123 = this.field1122 - var4;
            }
            int var5 = this.field1124 + this.field1117;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field1120 < var5 + 256) {
                this.field1120 += 1024;
                if (this.field1120 > 16384) {
                    this.field1120 = 16384;
                }
                var4 = 0;
                this.method440();
                this.method438(this.field1120);
                this.field1114 = true;
                if (var5 + 256 > this.field1120) {
                    var5 = this.field1120 - 256;
                    this.field1117 = var5 - this.field1124;
                }
            }
            while (var4 < var5) {
                this.method444(this.field1100, 256);
                this.method446();
                var4 += 256;
            }
            if (this.field1115 < var2) {
                if (this.field1114) {
                    this.field1114 = false;
                } else if (this.field1123 == 0 && this.field1116 == 0) {
                    this.method440();
                    this.field1118 = var2 + 2000L;
                    return;
                } else {
                    this.field1117 = Math.min(this.field1116, this.field1123);
                    this.field1116 = this.field1123;
                }
                this.field1115 = var2 + 2000L;
                this.field1123 = 0;
            }
            this.field1122 = var4;
        } catch (Exception var7) {
            this.method440();
            this.field1118 = var2 + 2000L;
        }
        try {
            if (this.field1094 + 500000L < var2) {
                var2 = this.field1094;
            }
            while ((this.field1094 + 5000L) < var2) {
                this.method437(false, 256);
                this.field1094 += (long) (256000 / class275.field4822);
            }
            if (arg0 != 16138) {
                field1096 = -37;
            }
        } catch (Exception var6) {
            this.field1094 = var2;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)V")
    private final void method437(boolean arg0, int arg1) {
        this.field1113 -= arg1;
        if (this.field1113 < 0) {
            this.field1113 = 0;
        }
        if (arg0) {
            this.field1095 = null;
        }
        if (this.field1095 != null) {
            this.field1095.method203(arg1);
        }
        field1099++;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public void method438(int arg0) throws Exception {
        field1106++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method439(Component arg0) throws Exception {
        field1109++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
    public void method440() {
        field1097++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILda;I)V")
    private final void method441(int arg0, class184 arg1, int arg2) {
        int var4 = arg0 >> 5;
        field1108++;
        if (arg2 > -76) {
            return;
        }
        class184 var5 = this.field1119[var4];
        if (var5 == null) {
            this.field1121[var4] = arg1;
        } else {
            var5.field3274 = arg1;
        }
        this.field1119[var4] = arg1;
        arg1.field3272 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public final synchronized void method442(int arg0) {
        if (client.field2695 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (client.field2695.field2187[var3] == this) {
                    client.field2695.field2187[var3] = null;
                }
                if (client.field2695.field2187[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                client.field2695.field2190 = true;
                while (client.field2695.field2182) {
                    class153.method1098((byte) 76, 50L);
                }
                client.field2695 = null;
            }
        }
        field1105++;
        if (arg0 >= 23) {
            this.method440();
            this.field1100 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
    public final synchronized void method443(boolean arg0) {
        field1101++;
        this.field1114 = arg0;
        try {
            this.method447();
        } catch (Exception var2) {
            this.method440();
            this.field1118 = class53.method405(79) + 2000L;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([II)V")
    private final void method444(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class286.field5020) {
            var3 = arg1 << 1;
        }
        class274.method1860(arg0, 0, var3);
        this.field1113 -= arg1;
        if (this.field1095 != null && this.field1113 <= 0) {
            this.field1113 += class275.field4822 >> 4;
            class45.method345(this.field1095, false);
            this.method441(this.field1095.method579(), this.field1095, -92);
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
                        class184 var10 = null;
                        class184 var11 = this.field1121[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class84 var12 = var11.field3273;
                                if (var12 == null || var12.field1537 <= var8) {
                                    var11.field3271 = true;
                                    int var13 = var11.method187();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1537 += var13;
                                    }
                                    if (var4 >= this.field1110) {
                                        break label107;
                                    }
                                    class184 var14 = var11.method210();
                                    if (var14 != null) {
                                        int var15 = var11.field3272;
                                        while (var14 != null) {
                                            this.method441(var15 * var14.method579() >> 8, var14, -110);
                                            var14 = var11.method196();
                                        }
                                    }
                                    class184 var16 = var11.field3274;
                                    var11.field3274 = null;
                                    if (var10 == null) {
                                        this.field1121[var7] = var16;
                                    } else {
                                        var10.field3274 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1119[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3274;
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
                class184 var18 = this.field1121[var17];
                this.field1121[var17] = this.field1119[var17] = null;
                while (var18 != null) {
                    class184 var19 = var18.field3274;
                    var18.field3274 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1113 < 0) {
            this.field1113 = 0;
        }
        if (this.field1095 != null) {
            this.field1095.method191(arg0, 0, arg1);
        }
        this.field1094 = class53.method405(121);
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
    public static final void method445(int arg0) {
        field1090++;
        if (class51.field994 > 0) {
            class97.method687(arg0 - 51091);
            return;
        }
        class227.field4170 = class98.field1738;
        if (arg0 != 28636) {
            field1096 = -10;
        }
        class98.field1738 = null;
        class193.method1345(10, 40);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()V")
    public void method446() throws Exception {
        field1098++;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()V")
    public void method447() throws Exception {
        field1089++;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
    public final void method448(int arg0) {
        this.field1114 = true;
        field1103++;
        if (arg0 != 0) {
            this.field1119 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public static void method449(int arg0) {
        if (arg0 < 99) {
            method450(96, -13, -57, 72, -112, (class286) null, 43);
        }
        field1104 = null;
        field1111 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIILlh;I)V")
    public static final void method450(int arg0, int arg1, int arg2, int arg3, int arg4, class286 arg5, int arg6) {
        class199.method1381(arg6, arg5.field5072, arg5.field5104, arg4, arg1, 1480421801, arg0, arg2);
        field1102++;
        if (arg3 != -3125) {
            method445(88);
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "()I")
    public int method451() throws Exception {
        field1091++;
        return this.field1120;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILda;)V")
    public final synchronized void method452(int arg0, class184 arg1) {
        this.field1095 = arg1;
        if (arg0 != 2000) {
            this.method442(5);
        }
        field1092++;
    }
}
