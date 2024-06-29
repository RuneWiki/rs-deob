import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 {

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    private int field209 = 32;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "J")
    private long field197 = class77.method569((byte) -122);

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    private int field216 = 0;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    private int field220 = 0;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "J")
    private long field218 = 0L;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "[Lji;")
    private class42[] field221 = new class42[8];

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "Z")
    private boolean field215 = true;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    private int field217 = 0;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "[Lji;")
    private class42[] field223 = new class42[8];

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    private int field224 = 0;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "J")
    private long field225 = 0L;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Lp;")
    public static class280 field196 = class18.method140((byte) -120, "::");

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field190 = 0;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Z")
    public static boolean field193 = false;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "Lp;")
    public static class280 field208 = class18.method140((byte) -123, "(U(Y");

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Lfb;")
    public static class29 field201;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lji;")
    private class42 field194;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "[I")
    public int[] field214;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()V")
    public void method83() {
        field200++;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()I")
    public int method84() throws Exception {
        field207++;
        return this.field222;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public final void method85(int arg0) {
        if (arg0 != 7) {
            this.field215 = true;
        }
        this.field215 = true;
        field213++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)I")
    public static final int method86(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lji;I)V")
    public final synchronized void method87(class42 arg0, int arg1) {
        this.field194 = arg0;
        field202++;
        if (arg1 != 28667) {
            this.method93(33);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public final synchronized void method88(int arg0) {
        field199++;
        this.field215 = true;
        try {
            if (arg0 <= -65) {
                this.method90();
            }
        } catch (Exception var2) {
            this.method83();
            this.field218 = class77.method569((byte) 23) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILji;)V")
    private final void method89(int arg0, int arg1, class42 arg2) {
        if (arg0 != 31225) {
            this.field221 = null;
        }
        field212++;
        int var4 = arg1 >> 5;
        class42 var5 = this.field221[var4];
        if (var5 == null) {
            this.field223[var4] = arg2;
        } else {
            var5.field713 = arg2;
        }
        this.field221[var4] = arg2;
        arg2.field710 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "()V")
    public void method90() throws Exception {
        field206++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method91(Component arg0) throws Exception {
        field203++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)I")
    public static final int method92(int arg0, byte arg1) {
        field204++;
        int var2 = -110 / ((arg1 + 19) / 59);
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
    public final synchronized void method93(int arg0) {
        field189++;
        if (arg0 <= 103) {
            this.method88(18);
        }
        if (class200.field3498 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class200.field3498.field1311[var3] == this) {
                    class200.field3498.field1311[var3] = null;
                }
                if (class200.field3498.field1311[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class200.field3498.field1314 = true;
                while (class200.field3498.field1312) {
                    class159.method1130(50L, 0);
                }
                class200.field3498 = null;
            }
        }
        this.method83();
        this.field214 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public final synchronized void method94(byte arg0) {
        field198++;
        if (this.field214 == null) {
            return;
        }
        long var2 = class77.method569((byte) -117);
        try {
            if (this.field218 != 0L) {
                if (var2 < this.field218) {
                    return;
                }
                this.method95(this.field222);
                this.field215 = true;
                this.field218 = 0L;
            }
            int var4 = this.method84();
            if (this.field220 < (this.field216 - var4)) {
                this.field220 = this.field216 - var4;
            }
            int var5 = this.field226 + this.field219;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field222) {
                this.field222 += 1024;
                var4 = 0;
                if (this.field222 > 16384) {
                    this.field222 = 16384;
                }
                this.method83();
                this.method95(this.field222);
                this.field215 = true;
                if (var5 + 256 > this.field222) {
                    var5 = this.field222 - 256;
                    this.field219 = var5 - this.field226;
                }
            }
            while (var4 < var5) {
                this.method96(this.field214, 256);
                var4 += 256;
                this.method97();
            }
            if (this.field225 < var2) {
                if (this.field215) {
                    this.field215 = false;
                } else if (this.field220 == 0 && this.field224 == 0) {
                    this.method83();
                    this.field218 = var2 + 2000L;
                    return;
                } else {
                    this.field219 = Math.min(this.field224, this.field220);
                    this.field224 = this.field220;
                }
                this.field220 = 0;
                this.field225 = var2 + 2000L;
            }
            int var6 = 22 % ((-arg0 - 49) / 49);
            this.field216 = var4;
        } catch (Exception var8) {
            this.method83();
            this.field218 = var2 + 2000L;
        }
        try {
            if (var2 > (this.field197 + 500000L)) {
                var2 = this.field197;
            }
            while (var2 > (this.field197 + 5000L)) {
                this.method100(0, 256);
                this.field197 += (long) (256000 / class204.field3549);
            }
        } catch (Exception var7) {
            this.field197 = var2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public void method95(int arg0) throws Exception {
        field191++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([II)V")
    private final void method96(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class283.field4981) {
            var3 = arg1 << 1;
        }
        class143.method990(arg0, 0, var3);
        this.field217 -= arg1;
        if (this.field194 != null && this.field217 <= 0) {
            this.field217 += class204.field3549 >> 4;
            class33.method282(true, this.field194);
            this.method89(31225, this.field194.method322(), this.field194);
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
                        class42 var10 = null;
                        class42 var11 = this.field223[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class110 var12 = var11.field711;
                                if (var12 == null || var12.field1832 <= var8) {
                                    var11.field712 = true;
                                    int var13 = var11.method27();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1832 += var13;
                                    }
                                    if (var4 >= this.field209) {
                                        break label107;
                                    }
                                    class42 var14 = var11.method37();
                                    if (var14 != null) {
                                        int var15 = var11.field710;
                                        while (var14 != null) {
                                            this.method89(31225, var15 * var14.method322() >> 8, var14);
                                            var14 = var11.method3();
                                        }
                                    }
                                    class42 var16 = var11.field713;
                                    var11.field713 = null;
                                    if (var10 == null) {
                                        this.field223[var7] = var16;
                                    } else {
                                        var10.field713 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field221[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field713;
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
                class42 var18 = this.field223[var17];
                this.field223[var17] = this.field221[var17] = null;
                while (var18 != null) {
                    class42 var19 = var18.field713;
                    var18.field713 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field217 < 0) {
            this.field217 = 0;
        }
        if (this.field194 != null) {
            this.field194.method20(arg0, 0, arg1);
        }
        this.field197 = class77.method569((byte) -116);
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "()V")
    public void method97() throws Exception {
        field192++;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
    public static void method98(int arg0) {
        if (arg0 > 30) {
            field208 = null;
            field201 = null;
            field196 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)Z")
    public static final boolean method99(int arg0, int arg1) {
        field210++;
        if (arg0 >= 0 && arg0 < class101.field1647.length) {
            if (arg1 != 65408) {
                field190 = 91;
            }
            return class101.field1647[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)V")
    private final void method100(int arg0, int arg1) {
        this.field217 -= arg1;
        if (arg0 > this.field217) {
            this.field217 = 0;
        }
        if (this.field194 != null) {
            this.field194.method21(arg1);
        }
        field211++;
    }
}
