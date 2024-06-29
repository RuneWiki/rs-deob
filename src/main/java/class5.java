import java.awt.Point;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class5 {

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Lrd;")
    private class225 field63 = new class225();

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Lrd;")
    private class225 field65 = new class225();

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Lrd;")
    private class225 field66 = new class225();

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "Lrd;")
    private class225 field67 = new class225();

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "Lkh;")
    private class166 field70 = new class166(4);

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "B")
    private byte field75 = 0;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public volatile int field74 = 0;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public volatile int field73 = 0;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "Lkh;")
    private class166 field72 = new class166(8);

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "[F")
    public static float[] field55 = new float[4];

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field46 = "M";

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "J")
    private long field71;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "Lun;")
    private class136 field76;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Ldb;")
    private class43 field68;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZIBI)Lun;", line = 6)
    public final class136 method20(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        long var6 = (long) ((arg4 << 16) + arg2);
        field56++;
        class136 var8 = new class136();
        var8.field2980 = var6;
        if (arg0 >= -48) {
            this.field70 = (class166) null;
        }
        var8.field2312 = arg1;
        var8.field2147 = arg3;
        if (arg1) {
            if (this.method24(-31645) >= 20) {
                throw new RuntimeException();
            }
            this.field63.method1595(true, var8);
        } else if (this.method27(621) < 20) {
            this.field66.method1595(true, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 46)
    public final void method21(int arg0) {
        field60++;
        try {
            this.field68.method365(arg0);
        } catch (Exception var3) {
        }
        this.field75 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field68 = null;
        this.field74++;
        this.field73 = -1;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 61)
    public final void method22(int arg0) {
        if (this.field68 != null) {
            this.field68.method369((byte) -66);
        }
        if (arg0 <= -10) {
            field61++;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V", line = 80)
    private final void method23(boolean arg0) {
        field49++;
        if (this.field68 == null) {
            return;
        }
        try {
            this.field70.field2532 = 0;
            this.field70.method1132((byte) 29, 6);
            if (!arg0) {
                return;
            }
            this.field70.method1152(-1054044208, 3);
            this.field68.method370(1, this.field70.field2500, 0, 4);
        } catch (IOException var5) {
            try {
                this.field68.method365(1);
            } catch (Exception var4) {
            }
            this.field68 = null;
            this.field74++;
            this.field73 = -2;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)I", line = 109)
    public final int method24(int arg0) {
        field58++;
        return arg0 == -31645 ? this.field63.method1597(true) + this.field65.method1597(true) : -25;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V", line = 121)
    public final void method25(int arg0) {
        if (this.field68 != null) {
            this.field68.method365(1);
        }
        field51++;
        if (arg0 <= 55) {
            this.field70 = (class166) null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IJ)V", line = 141)
    public static final void method26(int arg0, long arg1) {
        field48++;
        if (arg1 <= (long) arg0) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class244.method1691(arg1 - 1L, -118);
            class244.method1691(1L, -112);
        } else {
            class244.method1691(arg1, -114);
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)I", line = 161)
    private final int method27(int arg0) {
        field47++;
        return arg0 == 621 ? this.field66.method1597(true) + this.field67.method1597(true) : -115;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)Lrj;", line = 176)
    public static final class338 method28(boolean arg0) {
        if (arg0) {
            return (class338) null;
        }
        field59++;
        class338 var1 = (class338) class34.field527.method1589(0);
        if (var1 != null) {
            var1.method403(1);
            var1.method1412(0);
            return var1;
        }
        class338 var2;
        do {
            var2 = (class338) class331.field5156.method1589(0);
            if (var2 == null) {
                return null;
            }
            if (var2.method2346(1) > class102.method743((byte) 103)) {
                return null;
            }
            var2.method403(1);
            var2.method1412(0);
        } while ((Long.MIN_VALUE & var2.field2980) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ldb;IZ)V", line = 216)
    public final void method29(class43 arg0, int arg1, boolean arg2) {
        if (this.field68 != null) {
            try {
                this.field68.method365(1);
            } catch (Exception var11) {
            }
            this.field68 = null;
        }
        field54++;
        this.field68 = arg0;
        this.method23(true);
        this.method34(98, arg2);
        this.field76 = null;
        this.field72.field2532 = 0;
        while (true) {
            class136 var5 = (class136) this.field65.method1596((byte) 103);
            if (var5 == null) {
                while (true) {
                    class136 var6 = (class136) this.field67.method1596((byte) 110);
                    if (var6 == null) {
                        if (this.field75 != 0) {
                            try {
                                this.field70.field2532 = 0;
                                this.field70.method1132((byte) 29, 4);
                                this.field70.method1132((byte) 29, this.field75);
                                this.field70.method1150(0, arg1 ^ 0xDA88E4C8);
                                this.field68.method370(arg1 ^ 0x1, this.field70.field2500, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field68.method365(1);
                                } catch (Exception var9) {
                                }
                                this.field73 = -2;
                                this.field74++;
                                this.field68 = null;
                            }
                        }
                        this.field69 = arg1;
                        this.field71 = class102.method743((byte) 80);
                        return;
                    }
                    this.field66.method1595(true, var6);
                }
            }
            this.field63.method1595(true, var5);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 284)
    public final void method30(byte arg0) {
        if (arg0 <= 63) {
            return;
        }
        field62++;
        if (this.field68 == null) {
            return;
        }
        try {
            this.field70.field2532 = 0;
            this.field70.method1132((byte) 29, 7);
            this.field70.method1152(-1054044208, 0);
            this.field68.method370(1, this.field70.field2500, 0, 4);
        } catch (IOException var5) {
            try {
                this.field68.method365(1);
            } catch (Exception var4) {
            }
            this.field73 = -2;
            this.field68 = null;
            this.field74++;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V", line = 317)
    public static void method31(byte arg0) {
        int var1 = 77 / ((-arg0 - 55) / 56);
        field55 = null;
        field46 = null;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)Z", line = 327)
    public final boolean method32(byte arg0) {
        if (arg0 != 96) {
            this.method23(true);
        }
        field57++;
        return this.method27(621) >= 20;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)Z", line = 342)
    public final boolean method33(int arg0) {
        field52++;
        if (this.field68 != null) {
            long var2 = class102.method743((byte) 106);
            int var4 = (int) (var2 - this.field71);
            this.field71 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field69 += var4;
            if (this.field69 > 30000) {
                try {
                    this.field68.method365(1);
                } catch (Exception var30) {
                }
                this.field68 = null;
            }
        }
        if (arg0 < 36) {
            return false;
        } else if (this.field68 == null) {
            return this.method24(-31645) == 0 && this.method27(621) == 0;
        } else {
            try {
                this.field68.method372(2);
                for (class136 var6 = (class136) this.field63.method1589(0); var6 != null; var6 = (class136) this.field63.method1591((byte) 87)) {
                    this.field70.field2532 = 0;
                    this.field70.method1132((byte) 29, 1);
                    this.field70.method1152(-1054044208, (int) var6.field2980);
                    this.field68.method370(1, this.field70.field2500, 0, 4);
                    this.field65.method1595(true, var6);
                }
                for (class136 var7 = (class136) this.field66.method1589(0); var7 != null; var7 = (class136) this.field66.method1591((byte) 81)) {
                    this.field70.field2532 = 0;
                    this.field70.method1132((byte) 29, 0);
                    this.field70.method1152(-1054044208, (int) var7.field2980);
                    this.field68.method370(1, this.field70.field2500, 0, 4);
                    this.field67.method1595(true, var7);
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field68.method366(88);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field69 = 0;
                    byte var10 = 0;
                    if (this.field76 == null) {
                        var10 = 8;
                    } else if (this.field76.field2155 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field72.field2532;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        this.field68.method367((byte) 98, var11, this.field72.field2532, this.field72.field2500);
                        if (this.field75 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field72.field2500[this.field72.field2532 + var12] = (byte) class81.method583(this.field72.field2500[this.field72.field2532 + var12], this.field75);
                            }
                        }
                        this.field72.field2532 += var11;
                        if (var10 <= this.field72.field2532) {
                            if (this.field76 == null) {
                                this.field72.field2532 = 0;
                                int var13 = this.field72.method1178(0);
                                Object var14 = null;
                                int var15 = this.field72.method1151(-70);
                                int var16 = this.field72.method1178(0);
                                int var17 = this.field72.method1137(104);
                                long var18 = (long) ((var13 << 16) + var15);
                                boolean var20 = (var16 & 0x80) != 0;
                                int var21 = var16 & 0x7F;
                                class136 var22;
                                if (var20) {
                                    for (var22 = (class136) this.field67.method1589(0); var22 != null && var22.field2980 != var18; var22 = (class136) this.field67.method1591((byte) 95)) {
                                    }
                                } else {
                                    for (var22 = (class136) this.field65.method1589(0); var22 != null && var22.field2980 != var18; var22 = (class136) this.field65.method1591((byte) 123)) {
                                    }
                                }
                                if (var22 == null) {
                                    throw new IOException();
                                }
                                this.field76 = var22;
                                int var23 = var21 == 0 ? 5 : 9;
                                this.field76.field2156 = new class166(this.field76.field2147 + var17 + var23);
                                this.field76.field2156.method1132((byte) 29, var21);
                                this.field76.field2156.method1174((byte) -32, var17);
                                this.field76.field2155 = 8;
                                this.field72.field2532 = 0;
                            } else if (this.field76.field2155 != 0) {
                                throw new IOException();
                            } else if (this.field72.field2500[0] == -1) {
                                this.field76.field2155 = 1;
                                this.field72.field2532 = 0;
                            } else {
                                this.field76 = null;
                            }
                        }
                    } else {
                        int var24 = 512 - this.field76.field2155;
                        int var25 = this.field76.field2156.field2500.length - this.field76.field2147;
                        if ((var25 - this.field76.field2156.field2532) < var24) {
                            var24 = var25 - this.field76.field2156.field2532;
                        }
                        if (var24 > var9) {
                            var24 = var9;
                        }
                        this.field68.method367((byte) 116, var24, this.field76.field2156.field2532, this.field76.field2156.field2500);
                        if (this.field75 != 0) {
                            for (int var26 = 0; var26 < var24; var26++) {
                                this.field76.field2156.field2500[this.field76.field2156.field2532 + var26] = (byte) class81.method583(this.field76.field2156.field2500[this.field76.field2156.field2532 + var26], this.field75);
                            }
                        }
                        this.field76.field2155 += var24;
                        this.field76.field2156.field2532 += var24;
                        if (this.field76.field2156.field2532 == var25) {
                            this.field76.method1412(0);
                            this.field76.field2317 = false;
                            this.field76 = null;
                        } else if (this.field76.field2155 == 512) {
                            this.field76.field2155 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    this.field68.method365(1);
                } catch (Exception var29) {
                }
                this.field74++;
                this.field73 = -2;
                this.field68 = null;
                return this.method24(-31645) == 0 && this.method27(621) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)V", line = 618)
    public final void method34(int arg0, boolean arg1) {
        field64++;
        if (this.field68 == null) {
            return;
        }
        int var3 = -20 % ((arg0 + 48) / 46);
        try {
            this.field70.field2532 = 0;
            this.field70.method1132((byte) 29, arg1 ? 2 : 3);
            this.field70.method1152(-1054044208, 0);
            this.field68.method370(1, this.field70.field2500, 0, 4);
        } catch (IOException var7) {
            try {
                this.field68.method365(1);
            } catch (Exception var6) {
            }
            this.field68 = null;
            this.field74++;
            this.field73 = -2;
        }
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)Z", line = 646)
    public final boolean method35(int arg0) {
        field45++;
        if (arg0 == -1) {
            return this.method24(-31645) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)V", line = 668)
    public static final void method36(boolean arg0, int arg1) {
        field53++;
        if (!class210.field3208) {
            arg1 = -1;
        }
        if (class231.field3653 == arg1) {
            return;
        }
        if (arg0) {
            field46 = (String) null;
        }
        if (arg1 != -1) {
            class55 var2 = class299.method2025(arg1, true);
            class249 var3 = var2.method448((byte) -63);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class32.field471.method1284(var3.field4211, class238.field3782, new Point(var2.field923, var2.field920), false, var3.method1717(), var3.field4201);
                class231.field3653 = arg1;
            }
        }
        if (arg1 == -1 && class231.field3653 != -1) {
            class32.field471.method1284(-1, class238.field3782, new Point(), arg0, (int[]) null, -1);
            class231.field3653 = -1;
        }
    }
}
