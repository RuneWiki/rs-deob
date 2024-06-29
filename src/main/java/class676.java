import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class676 implements Runnable {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Ljga;")
    private class749 field9592 = new class325();

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Ljga;")
    private class749 field9596 = null;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9607 = new String[] { method4933(method4932("Zz\u0004=\u0018")), method4933(method4932("M7\u0004TM")), method4933(method4932("Zz\u00042\u0018")), method4933(method4932("XlF\u0016")), method4933(method4932("Zz\u00049\u0018")), method4933(method4932("Zz\u0004?\u0018")), method4933(method4932("Zz\u00043\u0018")), method4933(method4932("Zz\u00041\u0018")), method4933(method4932("Zz\u0004<\u0018")), method4933(method4932("Zz\u00048\u0018")), method4933(method4932("\u00161x\u001fSYoO\bUR0\n")), method4933(method4932("Zz\u0004\bEX1")), method4933(method4932("Zz\u0004>\u0018")), method4933(method4932("Zz\u00040\u0018")), method4933(method4932("Zz\u0004;\u0018")) };

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field9588;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field9593;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    private int field9595;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    private int field9597;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field9606;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "J")
    private long field9594;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "J")
    private long field9599;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lbl;")
    private class678 field9603;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Ljava/lang/String;")
    private String field9598;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Z")
    private boolean field9585;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Z")
    private volatile boolean field9591;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
    public final int method4921(int arg0) {
        try {
            field9606++;
            if (arg0 <= 19) {
                this.field9598 = null;
            }
            return this.field9595;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9607[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I")
    public final int method4922(byte arg0) {
        try {
            if (arg0 != -128) {
                this.method4929(true);
            }
            field9586++;
            return this.field9597;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9607[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBJLjava/lang/String;Lbl;)V")
    public final synchronized void method4923(int arg0, byte arg1, long arg2, String arg3, class678 arg4) {
        try {
            this.field9598 = arg3;
            field9590++;
            this.field9603 = arg4;
            this.field9595 = arg0;
            if (arg1 >= 43) {
                this.field9599 = arg2;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field9607[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field9607[3] : field9607[1]) + ',' + (arg4 == null ? field9607[3] : field9607[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (!this.field9591) {
                long var1 = class712.method5167(-2334);
                synchronized (this) {
                    try {
                        this.field9597++;
                        if (this.field9592 instanceof class325) {
                            this.field9592.method2362(this.field9585, (byte) -86);
                        } else {
                            long var4 = class712.method5167(-2334);
                            if (class662.field9437 == null || this.field9596 == null || this.field9596.method2357(false) == 0 || this.field9594 < (var4 - (long) this.field9596.method2357(false))) {
                                if (this.field9596 != null) {
                                    this.field9585 = true;
                                    this.field9596.method2361((byte) 111);
                                    this.field9596 = null;
                                }
                                if (this.field9585) {
                                    class592.method4345(true);
                                    if (class662.field9437 != null) {
                                        class662.field9437.method182(0);
                                    }
                                }
                                this.field9592.method2362(this.field9585 || class662.field9437 != null && class662.field9437.method219(), (byte) -83);
                            } else {
                                int var6 = (int) ((var4 - this.field9594) * 255L / (long) this.field9596.method2357(false));
                                int var7 = 255 - var6;
                                class592.method4345(true);
                                int var8 = var6 << 24 | 0xFFFFFF;
                                int var9 = var7 << 24 | 0xFFFFFF;
                                class662.field9437.method182(0);
                                class107 var10 = class662.field9437.method179(class64.field881, class333.field5444, true);
                                class662.field9437.method667((byte) -85, var10);
                                this.field9596.method2362(true, (byte) -53);
                                class662.field9437.method222();
                                var10.method19(0, 0, 0, var9, 1);
                                class662.field9437.method667((byte) 119, var10);
                                class662.field9437.method182(0);
                                this.field9592.method2362(true, (byte) -92);
                                class662.field9437.method222();
                                var10.method19(0, 0, 0, var8, 1);
                            }
                            try {
                                if (class662.field9437 != null && !(this.field9592 instanceof class325)) {
                                    class662.field9437.method660(false);
                                }
                            } catch (class146 var19) {
                                class622.method4544(var19, var19.getMessage() + field9607[10] + class392.field6245.method2714(16383), true);
                                class679.method4942(true, (byte) 91, 0);
                            }
                        }
                        Container var12;
                        if (class517.field7660 != null) {
                            var12 = class517.field7660;
                        } else if (class476.field7255 == null) {
                            var12 = class540.field7955;
                        } else {
                            var12 = class476.field7255;
                        }
                        var12.getSize();
                        var12.getSize();
                        if (class517.field7660 == var12) {
                            class517.field7660.getInsets();
                        }
                        this.field9585 = false;
                        if (class662.field9437 != null && !(this.field9592 instanceof class325) && this.field9603.method4937(100) < class678.field9639.method4937(100)) {
                            class497.method3759((byte) -27);
                        }
                    } catch (Exception var20) {
                        continue;
                    }
                }
                long var13 = class712.method5167(-2334);
                int var15 = (int) (var1 + 20L - var13);
                if (var15 > 0) {
                    class524.method3918(-4, (long) var15);
                }
            }
            field9588++;
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field9607[11] + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
    public final synchronized boolean method4924(int arg0) {
        try {
            if (arg0 != 0) {
                this.field9594 = 124L;
            }
            field9604++;
            return this.field9592.method2363(this.field9594, arg0 ^ 0x7CD8);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9607[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public final void method4925(int arg0) {
        try {
            this.field9591 = true;
            if (arg0 != -24773) {
                this.field9597 = 77;
            }
            field9605++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9607[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Ljava/lang/String;")
    public final String method4926(int arg0) {
        try {
            if (arg0 == -17786) {
                field9587++;
                return this.field9598;
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9607[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjga;)V")
    public final synchronized void method4927(byte arg0, class749 arg1) {
        try {
            this.field9596 = this.field9592;
            field9593++;
            this.field9592 = arg1;
            this.field9594 = class712.method5167(arg0 - 2326);
            if (arg0 != -8) {
                this.method4927((byte) 95, null);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9607[2] + arg0 + ',' + (arg1 == null ? field9607[3] : field9607[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)I")
    public final int method4928(byte arg0) {
        try {
            field9601++;
            if (this.field9603 == null) {
                return 0;
            } else if (arg0 > -57) {
                return -43;
            } else {
                int var2 = this.field9603.method4937(100);
                if (this.field9603.field9612 && this.field9595 < this.field9603.field9621) {
                    return this.field9595 + 1;
                } else if (var2 >= 0 && var2 < (class594.field8589.length - 1)) {
                    return this.field9603.field9611 == this.field9595 ? this.field9603.field9621 : this.field9603.field9611;
                } else {
                    return 100;
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9607[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Lbl;")
    public final class678 method4929(boolean arg0) {
        try {
            field9602++;
            if (arg0) {
                this.method4928((byte) 16);
            }
            return this.field9603;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9607[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
    public final synchronized void method4930(int arg0) {
        try {
            this.field9585 = true;
            field9600++;
            if (arg0 != 1) {
                this.method4924(-111);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9607[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)J")
    public final long method4931(int arg0) {
        try {
            if (arg0 != 0) {
                this.method4928((byte) -76);
            }
            field9589++;
            return this.field9599;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9607[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4932(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4933(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 25;
                    break;
                case 2:
                    var10005 = 42;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 48;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
