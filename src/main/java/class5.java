import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    private int field60 = 32;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Z")
    private boolean field62 = false;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "J")
    private long field66 = class269.method1823(-111);

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "[Lfg;")
    private class12[] field82 = new class12[8];

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    private int field81 = 0;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "J")
    private long field84 = 0L;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    private int field87 = 0;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    private int field89 = 0;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "[Lfg;")
    private class12[] field93 = new class12[8];

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "Z")
    private boolean field86 = true;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    private int field97 = 0;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "J")
    private long field99 = 0L;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field74 = new String[200];

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field78 = 0;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field76 = 0;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "Led;")
    public static class186 field85 = new class186(5000);

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field94 = 2301979;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "Lta;")
    public static class262 field88 = new class262(64);

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public static int field96 = 0;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "[I")
    public static int[] field95 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Lfg;")
    private class12 field80;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "[I")
    public int[] field67;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "[[[I")
    public static int[][][] field98;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()V")
    public void method54() throws Exception {
        field58++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLfg;)V")
    public final synchronized void method55(byte arg0, class12 arg1) {
        this.field80 = arg1;
        if (arg0 <= -93) {
            field70++;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZLfg;I)V")
    private final void method56(boolean arg0, class12 arg1, int arg2) {
        field63++;
        int var4 = arg2 >> 5;
        class12 var5 = this.field82[var4];
        if (var5 == null) {
            this.field93[var4] = arg1;
        } else {
            var5.field218 = arg1;
        }
        if (arg0) {
            this.field82[var4] = arg1;
            arg1.field216 = arg2;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)Lag;")
    public static final class188 method57(byte arg0, int arg1) {
        int var2 = arg1 >> 16;
        field68++;
        int var3 = arg1 & 0xFFFF;
        if (arg0 >= -92) {
            field88 = null;
        }
        if (class261.field4006[var2] == null || class261.field4006[var2][var3] == null) {
            boolean var4 = class103.method784(-1, var2);
            if (!var4) {
                return null;
            }
        }
        return class261.field4006[var2][var3];
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method58(int arg0) {
        field88 = null;
        field74 = null;
        if (arg0 >= -110) {
            method57((byte) -112, 41);
        }
        field98 = null;
        field85 = null;
        field95 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)V")
    public static final void method59(int arg0, byte arg1) {
        field77++;
        class295 var2 = class250.method1673(-121, 9, arg0);
        var2.method1979(-8205);
        if (arg1 != -110) {
            method62(41, 42, -117, -46, 109, 8, (byte) 45, -42);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "()V")
    public void method60() {
        field79++;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public final synchronized void method61(int arg0) {
        this.field86 = true;
        try {
            if (arg0 != 2000) {
                this.method65((int[]) null, 31);
            }
            this.method63();
        } catch (Exception var2) {
            this.method60();
            this.field84 = class269.method1823(arg0 - 2038) + 2000L;
        }
        field71++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field91++;
        int var8 = 0;
        int var9 = 0;
        if (arg6 <= 75) {
            field85 = null;
        }
        int var10 = arg7;
        int var11 = arg0 * arg0;
        int var12 = arg7 - arg4;
        int var13 = arg7 * arg7;
        int var14 = arg0 - arg4;
        int var15 = var14 * var14;
        int var16 = var12 * var12;
        int var17 = var11 << 1;
        int var18 = var15 << 1;
        int var19 = var16 << 1;
        int var20 = var13 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var11 + var20;
        int var24 = var13 - ((var21 - 1) * var17);
        int var25 = var16 - ((var22 - 1) * var18);
        int var26 = (1 - var22) * var15 + var19;
        int var27 = var11 << 2;
        int var28 = var13 << 2;
        int var29 = var20 * 3;
        int var30 = var19 * 3;
        int var31 = var15 << 2;
        int var32 = (var22 - 3) * var18;
        int var33 = var16 << 2;
        int var34 = (var21 - 3) * var17;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var33;
        if (class271.field4289 <= arg3 && arg3 <= class113.field1779) {
            int[] var38 = class156.field2379[arg3];
            int var39 = class68.method533(class75.field1265, class261.field4025, arg2 - arg0, (byte) 46);
            int var40 = class68.method533(class75.field1265, class261.field4025, arg0 + arg2, (byte) 52);
            int var41 = class68.method533(class75.field1265, class261.field4025, arg2 - var14, (byte) 49);
            int var42 = class68.method533(class75.field1265, class261.field4025, arg2 + var14, (byte) 39);
            class263.method1788(var39, -18732, arg5, var38, var41);
            class263.method1788(var41, -18732, arg1, var38, var42);
            class263.method1788(var42, -18732, arg5, var38, var40);
        }
        int var43 = (var12 - 1) * var31;
        while (var10 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var29;
                    var29 += var28;
                    var24 += var35;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var35 += var28;
                var23 += var29;
                var29 += var28;
                var8++;
            }
            var24 += -var34;
            var23 += -var36;
            var36 -= var27;
            boolean var44 = var10 <= var12;
            if (var44) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var25 += var37;
                        var26 += var30;
                        var9++;
                        var37 += var33;
                        var30 += var33;
                    }
                }
                if (var25 < 0) {
                    var9++;
                    var26 += var30;
                    var30 += var33;
                    var25 += var37;
                    var37 += var33;
                }
                var26 += -var43;
                var25 += -var32;
                var32 -= var31;
                var43 -= var31;
            }
            var10--;
            var34 -= var27;
            int var45 = arg3 - var10;
            int var46 = arg3 + var10;
            if (class271.field4289 <= var46 && var45 <= class113.field1779) {
                int var47 = class68.method533(class75.field1265, class261.field4025, arg2 + var8, (byte) 71);
                int var48 = class68.method533(class75.field1265, class261.field4025, arg2 - var8, (byte) 28);
                if (var44) {
                    int var49 = class68.method533(class75.field1265, class261.field4025, arg2 + var9, (byte) 21);
                    int var50 = class68.method533(class75.field1265, class261.field4025, arg2 - var9, (byte) 88);
                    if (var45 >= class271.field4289) {
                        int[] var51 = class156.field2379[var45];
                        class263.method1788(var48, -18732, arg5, var51, var50);
                        class263.method1788(var50, -18732, arg1, var51, var49);
                        class263.method1788(var49, -18732, arg5, var51, var47);
                    }
                    if (var46 <= class113.field1779) {
                        int[] var52 = class156.field2379[var46];
                        class263.method1788(var48, -18732, arg5, var52, var50);
                        class263.method1788(var50, -18732, arg1, var52, var49);
                        class263.method1788(var49, -18732, arg5, var52, var47);
                    }
                } else {
                    if (var45 >= class271.field4289) {
                        class263.method1788(var48, -18732, arg5, class156.field2379[var45], var47);
                    }
                    if (class113.field1779 >= var46) {
                        class263.method1788(var48, -18732, arg5, class156.field2379[var46], var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "()V")
    public void method63() throws Exception {
        field72++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public final synchronized void method64(byte arg0) {
        field61++;
        if (this.field62) {
            return;
        }
        long var2 = class269.method1823(-65);
        try {
            if ((this.field66 + 500000L) < var2) {
                this.field66 = var2 - 500000L;
            }
            while (var2 > (this.field66 + 5000L)) {
                this.method71(0, 256);
                this.field66 += (long) (256000 / class234.field3622);
            }
        } catch (Exception var7) {
            this.field66 = var2;
        }
        if (this.field67 == null) {
            return;
        }
        try {
            if (this.field84 != 0L) {
                if (var2 < this.field84) {
                    return;
                }
                this.method67(this.field83);
                this.field86 = true;
                this.field84 = 0L;
            }
            int var4 = this.method69();
            int var5 = this.field92 + this.field90;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field89 < (this.field87 - var4)) {
                this.field89 = this.field87 - var4;
            }
            if ((var5 + 256) > this.field83) {
                var4 = 0;
                this.field83 += 1024;
                if (this.field83 > 16384) {
                    this.field83 = 16384;
                }
                this.method60();
                this.method67(this.field83);
                if (var5 + 256 > this.field83) {
                    var5 = this.field83 - 256;
                    this.field90 = var5 - this.field92;
                }
                this.field86 = true;
            }
            while (var4 < var5) {
                this.method65(this.field67, 256);
                this.method54();
                var4 += 256;
            }
            if (var2 > this.field99) {
                if (this.field86) {
                    this.field86 = false;
                } else if (this.field89 == 0 && this.field97 == 0) {
                    this.method60();
                    this.field84 = var2 + 2000L;
                    return;
                } else {
                    this.field90 = Math.min(this.field97, this.field89);
                    this.field97 = this.field89;
                }
                this.field89 = 0;
                this.field99 = var2 + 2000L;
            }
            if (arg0 != -106) {
                method62(121, -125, -29, -72, -59, 102, (byte) -50, 65);
            }
            this.field87 = var4;
        } catch (Exception var6) {
            this.method60();
            this.field84 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([II)V")
    private final void method65(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class230.field3589) {
            var3 = arg1 << 1;
        }
        class236.method1590(arg0, 0, var3);
        this.field81 -= arg1;
        if (this.field80 != null && this.field81 <= 0) {
            this.field81 += class234.field3622 >> 4;
            class209.method1402(this.field80, 0);
            this.method56(true, this.field80, this.field80.method129());
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
                        class12 var10 = null;
                        class12 var11 = this.field93[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class110 var12 = var11.field217;
                                if (var12 == null || var12.field1744 <= var8) {
                                    var11.field215 = true;
                                    int var13 = var11.method127();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1744 += var13;
                                    }
                                    if (var4 >= this.field60) {
                                        break label107;
                                    }
                                    class12 var14 = var11.method123();
                                    if (var14 != null) {
                                        int var15 = var11.field216;
                                        while (var14 != null) {
                                            this.method56(true, var14, var15 * var14.method129() >> 8);
                                            var14 = var11.method125();
                                        }
                                    }
                                    class12 var16 = var11.field218;
                                    var11.field218 = null;
                                    if (var10 == null) {
                                        this.field93[var7] = var16;
                                    } else {
                                        var10.field218 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field82[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field218;
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
                class12 var18 = this.field93[var17];
                this.field93[var17] = this.field82[var17] = null;
                while (var18 != null) {
                    class12 var19 = var18.field218;
                    var18.field218 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field81 < 0) {
            this.field81 = 0;
        }
        if (this.field80 != null) {
            this.field80.method126(arg0, 0, arg1);
        }
        this.field66 = class269.method1823(-36);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
    public final void method66(byte arg0) {
        if (arg0 == 122) {
            this.field86 = true;
            field69++;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
    public void method67(int arg0) throws Exception {
        field73++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIILbf;JZ)V")
    public static final void method68(int arg0, int arg1, int arg2, int arg3, class205 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class180 var8 = new class180();
        var8.field2689 = arg4;
        var8.field2692 = arg1 * 128 + 64;
        var8.field2688 = arg2 * 128 + 64;
        var8.field2687 = arg3;
        var8.field2686 = arg5;
        if (class255.field3907[arg0][arg1][arg2] == null) {
            class255.field3907[arg0][arg1][arg2] = new class23(arg0, arg1, arg2);
        }
        class255.field3907[arg0][arg1][arg2].field363 = var8;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "()I")
    public int method69() throws Exception {
        field65++;
        return this.field83;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V")
    public final synchronized void method70(int arg0) {
        if (class287.field4526 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class287.field4526.field1149[var3] == this) {
                    class287.field4526.field1149[var3] = null;
                }
                if (class287.field4526.field1149[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class287.field4526.field1146 = true;
                while (class287.field4526.field1143) {
                    class42.method354(50L, false);
                }
                class287.field4526 = null;
            }
        }
        this.method60();
        field75++;
        this.field67 = null;
        if (arg0 != 50) {
            method62(113, -102, 16, -108, 93, -21, (byte) 85, 52);
        }
        this.field62 = true;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
    private final void method71(int arg0, int arg1) {
        this.field81 -= arg1;
        if (this.field81 < arg0) {
            this.field81 = 0;
        }
        if (this.field80 != null) {
            this.field80.method124(arg1);
        }
        field64++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method72(Component arg0) throws Exception {
        field59++;
    }
}
