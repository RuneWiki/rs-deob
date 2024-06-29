import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class35 extends class450 {

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    private int field523 = 0;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    private int field527 = 0;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    private int field528 = -1;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    private int field538 = -32768;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "Z")
    public boolean field545 = false;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    private int field546 = 0;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "Lna;")
    private class320 field532;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "D")
    public static double field530 = -1.0D;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field537 = -1;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Z")
    public static boolean field544 = false;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "Lvt;")
    public static class344 field525 = new class344("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "Llm;")
    private class309 field540;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lkr;")
    public static class329 field547;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        ++field541;
        class521 var3 = this.method207(arg1, 19122, this.field522, 2048 | (this.field546 == 0 ? 0 : 5));
        int var4 = 42 % ((arg0 - -30) / 63);
        if (var3 == null) {
            return null;
        } else {
            if (this.field546 != 0) {
                var3.method1567(this.field546 * 2048);
            }
            class105 var5 = arg1.method964();
            var5.method361(super.field6362, super.field6366, super.field6368);
            if (this.field540 != null) {
                class174 var6 = this.field540.method1864();
                arg1.method947(var3, var6, var5, (class378) null, 0);
            } else {
                var3.method1595(var5, (class378) null, 0);
            }
            this.field538 = var3.method1579();
            this.method211((byte) -82, var3, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        ++field535;
        int var3 = -25 / ((4 - arg0) / 47);
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lqa;III)Lr;")
    private final class521 method207(class167 arg0, int arg1, int arg2, int arg3) {
        ++field529;
        if (arg1 != 19122) {
            return null;
        } else {
            class628 var5 = class410.field5636.method348(6410, arg2);
            class544 var6 = class50.field672[super.field6358];
            class544 var7 = ~this.field531 > -4 ? class50.field672[this.field531 + 1] : null;
            return this.field545 ? var5.method3637(arg3, true, 0, -1, arg0, (byte) 101, super.field6362, var6, -1, super.field6366, super.field6368, var7, class609.field8754) : var5.method3637(arg3, true, this.field527, this.field523, arg0, (byte) 75, super.field6362, var6, this.field528, super.field6366, super.field6368, var7, class609.field8754);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ldda;)V")
    public static final void method208(class597 arg0) {
        if (class444.field6143 < 65535) {
            class592 var1 = arg0.field8621;
            class256.field3175[class444.field6143] = arg0;
            class209.field2709[class444.field6143] = false;
            ++class444.field6143;
            int var2 = arg0.field8612;
            if (arg0.field8607) {
                var2 = 0;
            }
            int var3 = arg0.field8612;
            if (arg0.field8610) {
                var3 = class183.field2341 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method3415((byte) 117) - var1.method3420(true) + class337.field4699 >> class400.field5480;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method3415((byte) 117) + var1.method3420(true) - class337.field4699 >> class400.field5480;
                if (var7 >= class541.field7566) {
                    var7 = class541.field7566 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field8611[var5++];
                    int var10 = (var1.method3414(232) - var1.method3420(true) + class337.field4699 >> class400.field5480) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class260.field3211) {
                        var11 = class260.field3211 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class238.field3050[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class238.field3050[var4][var12][var8] = var13 | (long) class444.field6143;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class238.field3050[var4][var12][var8] = var13 | (long) class444.field6143 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class238.field3050[var4][var12][var8] = var13 | (long) class444.field6143 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class238.field3050[var4][var12][var8] = var13 | (long) class444.field6143 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public final void method209(int arg0) {
        ++field526;
        if (arg0 != 1) {
            this.method56((byte) -63);
        }
        if (this.field540 != null) {
            this.field540.method1861();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILqa;IZLlb;)V")
    public final void method54(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, class239 arg6) {
        if (arg1 > 67) {
            ++field543;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)I")
    public final int method103(byte arg0) {
        ++field534;
        if (arg0 > -98) {
            this.method63(-22, -119, (class167) null, -80);
        }
        return this.field538;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static void method210(int arg0) {
        field547 = null;
        if (arg0 == -13652) {
            field525 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        ++field533;
        class521 var3 = this.method207(arg0, 19122, this.field522, arg1);
        if (var3 != null) {
            this.method211((byte) -59, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public final void method56(byte arg0) {
        ++field542;
        if (arg0 != 52) {
            this.field531 = 28;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLr;Lqa;)V")
    private final void method211(byte arg0, class521 arg1, class167 arg2) {
        ++field536;
        class601[] var4 = arg1.method1600();
        class55[] var5 = arg1.method1584();
        if ((this.field540 == null || this.field540.field3949) && (var4 != null || var5 != null)) {
            this.field540 = class309.method1850(class7.field61);
        }
        if (this.field540 != null) {
            this.field540.method1856(arg2, (long) class7.field61, var4, var5, false);
            this.field540.method1859(super.field6358, super.field6361, super.field6357, super.field6359, super.field6367);
        }
        if (arg0 >= -55) {
            method210(-65);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)V")
    public final void method212(byte arg0, int arg1) {
        ++field519;
        if (!this.field545) {
            this.field527 += arg1;
            while (this.field527 > this.field532.field4432[this.field523]) {
                this.field527 -= this.field532.field4432[this.field523];
                ++this.field523;
                if (this.field523 >= this.field532.field4431.length) {
                    this.field545 = true;
                    break;
                }
            }
            if (!this.field545) {
                class627.method3629(super.field6368, false, this.field532, this.field523, super.field6358, (byte) -109, super.field6362);
            }
            if (arg0 != 49) {
                this.field521 = -52;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        if (arg3 > -35) {
            this.finalize();
        }
        ++field524;
        return false;
    }

    @OriginalMember(owner = "client!pc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field539;
        if (this.field540 != null) {
            this.field540.method1861();
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        ++field520;
        if (arg0 != -1) {
            this.field527 = 19;
        }
        return false;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field546 = arg12;
        this.field521 = arg1 + arg2;
        this.field531 = arg4;
        this.field522 = arg0;
        class628 var14 = class410.field5636.method348(6410, this.field522);
        int var15 = var14.field9152;
        if (var15 != -1) {
            this.field532 = class609.field8754.method535(var15, true);
            this.field545 = false;
        } else {
            this.field545 = true;
        }
        if (~this.field521 == ~arg2) {
            class627.method3629(super.field6368, false, this.field532, this.field523, super.field6358, (byte) -127, super.field6362);
        }
    }
}
