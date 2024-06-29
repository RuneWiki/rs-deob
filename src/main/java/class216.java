import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class216 extends class141 {

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    private int field3443 = 0;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "Lsa;")
    private class110 field3447 = new class110(16);

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    private int field3465 = 0;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "Lea;")
    private class204 field3461 = new class204();

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "J")
    private long field3468 = 0L;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "Lpm;")
    private class103 field3458;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    private int field3436;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "Z")
    private boolean field3466;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "Lea;")
    private class204 field3463;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    private int field3445;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Lpm;")
    private class103 field3448;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    private int field3450;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Lrg;")
    private class96 field3459;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "Z")
    private boolean field3467;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lvf;")
    private class309 field3439;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Lsi;")
    private class317 field3438;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "Z")
    public static boolean field3460 = false;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "Lhm;")
    private class20 field3446;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "Ltd;")
    public static class241 field3455;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "Z")
    private boolean field3462;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "[B")
    private byte[] field3444;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V", line = 7)
    public final void method1082(int arg0, byte arg1) {
        int var3 = 120 / ((arg1 - 44) / 55);
        field3442++;
        if (this.field3458 == null) {
            return;
        }
        for (class240 var4 = this.field3461.method1490(200); var4 != null; var4 = this.field3461.method1487((byte) 117)) {
            if (((long) arg0) == var4.field3734) {
                return;
            }
        }
        class240 var5 = new class240();
        var5.field3734 = (long) arg0;
        this.field3461.method1493(-119, var5);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 37)
    public final void method1560(int arg0) {
        field3456++;
        if (arg0 <= 9) {
            this.field3450 = 94;
        }
        if (this.field3463 != null) {
            if (this.method1078((byte) 0) == null) {
                return;
            }
            if (this.field3466) {
                boolean var6 = true;
                for (class240 var7 = this.field3463.method1490(200); var7 != null; var7 = this.field3463.method1487((byte) 117)) {
                    int var8 = (int) var7.field3734;
                    if (this.field3444[var8] == 0) {
                        this.method1561((byte) -66, var8, 1);
                    }
                    if (this.field3444[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method1701(-119);
                    }
                }
                while (this.field3465 < this.field3446.field376.length) {
                    if (this.field3446.field376[this.field3465] == 0) {
                        this.field3465++;
                    } else {
                        if (this.field3439.field4869 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3444[this.field3465] == 0) {
                            this.method1561((byte) -66, this.field3465, 1);
                        }
                        if (this.field3444[this.field3465] == 0) {
                            class240 var9 = new class240();
                            var6 = false;
                            var9.field3734 = (long) this.field3465;
                            this.field3463.method1493(-125, var9);
                        }
                        this.field3465++;
                    }
                }
                if (var6) {
                    this.field3465 = 0;
                    this.field3466 = false;
                }
            } else if (this.field3462) {
                boolean var2 = true;
                for (class240 var3 = this.field3463.method1490(200); var3 != null; var3 = this.field3463.method1487((byte) 117)) {
                    int var4 = (int) var3.field3734;
                    if (this.field3444[var4] != 1) {
                        this.method1561((byte) -66, var4, 2);
                    }
                    if (this.field3444[var4] == 1) {
                        var3.method1701(-108);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3446.field376.length > this.field3465) {
                    if (this.field3446.field376[this.field3465] == 0) {
                        this.field3465++;
                    } else {
                        if (this.field3459.method685(15989)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3444[this.field3465] != 1) {
                            this.method1561((byte) -66, this.field3465, 2);
                        }
                        if (this.field3444[this.field3465] != 1) {
                            var2 = false;
                            class240 var5 = new class240();
                            var5.field3734 = (long) this.field3465;
                            this.field3463.method1493(-74, var5);
                        }
                        this.field3465++;
                    }
                }
                if (var2) {
                    this.field3462 = false;
                    this.field3465 = 0;
                }
            } else {
                this.field3463 = null;
            }
        }
        if (!this.field3467 || class154.method1172((byte) 85) < this.field3468) {
            return;
        }
        for (class317 var10 = (class317) this.field3447.method841(0); var10 != null; var10 = (class317) this.field3447.method842((byte) -40)) {
            if (!var10.field4940) {
                if (var10.field4937) {
                    if (!var10.field4935) {
                        throw new RuntimeException();
                    }
                    var10.method1701(-96);
                } else {
                    var10.field4937 = true;
                }
            }
        }
        this.field3468 = class154.method1172((byte) 122) + 1000L;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(II)[B", line = 219)
    public final byte[] method1080(int arg0, int arg1) {
        class317 var3 = this.method1561((byte) -66, arg1, 0);
        if (arg0 < 99) {
            this.field3444 = (byte[]) null;
        }
        field3464++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method402((byte) -51);
            var3.method1701(-80);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BII)Lsi;", line = 238)
    private final class317 method1561(byte arg0, int arg1, int arg2) {
        field3441++;
        class317 var4 = (class317) this.field3447.method833(false, (long) arg1);
        if (var4 != null && arg2 == 0 && !var4.field4935 && var4.field4940) {
            var4.method1701(arg0 - 54);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field3458 == null || this.field3444[arg1] == -1) {
                    if (this.field3459.method687((byte) 45)) {
                        return null;
                    }
                    var4 = this.field3459.method696(745955184, arg1, (byte) 2, true, this.field3436);
                } else {
                    var4 = this.field3439.method2142(this.field3458, (byte) 126, arg1);
                }
            } else if (arg2 == 1) {
                if (this.field3458 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3439.method2141(arg0 + 4836, arg1, this.field3458);
            } else if (arg2 == 2) {
                if (this.field3458 == null) {
                    throw new RuntimeException();
                }
                if (this.field3444[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3459.method685(15989)) {
                    return null;
                }
                var4 = this.field3459.method696(arg0 ^ 0xD389A0CE, arg1, (byte) 2, false, this.field3436);
            } else {
                throw new RuntimeException();
            }
            this.field3447.method845(var4, (byte) -90, (long) arg1);
        }
        if (var4.field4940) {
            return null;
        }
        if (arg0 != -66) {
            this.method1567(6);
        }
        byte[] var5 = var4.method402((byte) -84);
        if (!var4 instanceof class228) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class318.field4944.reset();
                class318.field4944.update(var5, 0, var5.length - 2);
                int var6 = (int) class318.field4944.getValue();
                if (this.field3446.field368[arg1] != var6) {
                    throw new RuntimeException();
                }
                this.field3459.field1606 = 0;
                this.field3459.field1607 = 0;
            } catch (RuntimeException var14) {
                this.field3459.method698(-95);
                var4.method1701(-104);
                if (var4.field4935 && !this.field3459.method687((byte) 86)) {
                    class55 var8 = this.field3459.method696(arg0 ^ 0xD389A0CE, arg1, (byte) 2, true, this.field3436);
                    this.field3447.method845(var8, (byte) -98, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3446.field379[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field3446.field379[arg1];
            if (this.field3458 != null) {
                this.field3439.method2137(this.field3458, arg1, var5, -4293);
                if (this.field3444[arg1] != 1) {
                    this.field3443++;
                    this.field3444[arg1] = 1;
                }
            }
            if (!var4.field4935) {
                var4.method1701(-91);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class318.field4944.reset();
            class318.field4944.update(var5, 0, var5.length - 2);
            int var9 = (int) class318.field4944.getValue();
            if (this.field3446.field368[arg1] != var9) {
                throw new RuntimeException();
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3446.field379[arg1] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field3444[arg1] != 1) {
                if (this.field3444[arg1] != 0) {
                }
                this.field3443++;
                this.field3444[arg1] = 1;
            }
            if (!var4.field4935) {
                var4.method1701(-116);
            }
            return var4;
        } catch (Exception var13) {
            this.field3444[arg1] = -1;
            var4.method1701(arg0 - 59);
            if (var4.field4935 && !this.field3459.method687((byte) 96)) {
                class55 var12 = this.field3459.method696(745955184, arg1, (byte) 2, true, this.field3436);
                this.field3447.method845(var12, (byte) 71, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)I", line = 454)
    public final int method1075(int arg0, int arg1) {
        field3451++;
        if (arg0 != 0) {
            this.method1080(-48, 50);
        }
        class317 var3 = (class317) this.field3447.method833(false, (long) arg1);
        return var3 == null ? 0 : var3.method406((byte) 34);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V", line = 471)
    public final void method1562(byte arg0) {
        field3454++;
        if (this.field3463 == null || this.method1078((byte) 0) == null) {
            return;
        }
        for (class240 var2 = this.field3461.method1490(200); var2 != null; var2 = this.field3461.method1487((byte) 117)) {
            int var3 = (int) var2.field3734;
            if (var3 < 0 || this.field3446.field383 <= var3 || this.field3446.field376[var3] == 0) {
                var2.method1701(-89);
            } else {
                if (this.field3444[var3] == 0) {
                    this.method1561((byte) -66, var3, 1);
                }
                if (this.field3444[var3] == -1) {
                    this.method1561((byte) -66, var3, 2);
                }
                if (this.field3444[var3] == 1) {
                    var2.method1701(arg0 - 96);
                }
            }
        }
        if (arg0 != 1) {
            this.field3436 = -96;
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)I", line = 515)
    public final int method1563(int arg0) {
        field3440++;
        if (arg0 != 0) {
            this.field3467 = false;
        }
        if (this.field3446 == null) {
            return 0;
        } else if (this.field3466) {
            class240 var2 = this.field3463.method1490(200);
            return var2 == null ? 0 : (int) var2.field3734;
        } else {
            return this.field3446.field380;
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V", line = 540)
    public static void method1564(int arg0) {
        field3455 = null;
        if (arg0 != 0) {
            field3460 = false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)I", line = 554)
    public final int method1565(int arg0) {
        if (arg0 != 0) {
            this.method1561((byte) 99, -8, -56);
        }
        field3449++;
        if (this.method1078((byte) 0) == null) {
            return this.field3438 == null ? 0 : this.field3438.method406((byte) 34);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)I", line = 586)
    public final int method1566(int arg0) {
        field3457++;
        int var2 = 28 / ((arg0 - 3) / 50);
        return this.field3443;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)Lhm;", line = 597)
    public final class20 method1078(byte arg0) {
        field3453++;
        if (this.field3446 != null) {
            return this.field3446;
        }
        if (this.field3438 == null) {
            if (this.field3459.method687((byte) 110)) {
                return null;
            }
            this.field3438 = this.field3459.method696(745955184, this.field3436, (byte) 0, true, 255);
        }
        if (this.field3438.field4940) {
            return null;
        }
        if (arg0 != 0) {
            this.field3447 = (class110) null;
        }
        byte[] var2 = this.field3438.method402((byte) -113);
        if (this.field3438 instanceof class228) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3446 = new class20(var2, this.field3450);
                if (this.field3446.field378 != this.field3445) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field3446 = null;
                if (this.field3459.method687((byte) 113)) {
                    this.field3438 = null;
                } else {
                    this.field3438 = this.field3459.method696(745955184, this.field3436, (byte) 0, true, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3446 = new class20(var2, this.field3450);
            } catch (RuntimeException var6) {
                this.field3459.method698(-78);
                this.field3446 = null;
                if (this.field3459.method687((byte) 79)) {
                    this.field3438 = null;
                } else {
                    this.field3438 = this.field3459.method696(745955184, this.field3436, (byte) 0, true, 255);
                }
                return null;
            }
            if (this.field3448 != null) {
                this.field3439.method2137(this.field3448, this.field3436, var2, -4293);
            }
        }
        if (this.field3458 != null) {
            this.field3443 = 0;
            this.field3444 = new byte[this.field3446.field383];
        }
        this.field3438 = null;
        return this.field3446;
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)I", line = 697)
    public final int method1567(int arg0) {
        field3437++;
        if (this.field3446 == null) {
            return 0;
        } else if (arg0 == 12480) {
            return this.field3446.field380;
        } else {
            return 42;
        }
    }

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "(I)V", line = 712)
    public final void method1568(int arg0) {
        if (arg0 != -2) {
            return;
        }
        field3452++;
        if (this.field3458 != null) {
            this.field3462 = true;
            if (this.field3463 == null) {
                this.field3463 = new class204();
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(ILpm;Lpm;Lrg;Lvf;IIZ)V", line = 762)
    public class216(int arg0, class103 arg1, class103 arg2, class96 arg3, class309 arg4, int arg5, int arg6, boolean arg7) {
        this.field3458 = arg1;
        this.field3436 = arg0;
        if (this.field3458 == null) {
            this.field3466 = false;
        } else {
            this.field3466 = true;
            this.field3463 = new class204();
        }
        this.field3445 = arg6;
        this.field3448 = arg2;
        this.field3450 = arg5;
        this.field3459 = arg3;
        this.field3467 = arg7;
        this.field3439 = arg4;
        if (this.field3448 != null) {
            this.field3438 = this.field3439.method2142(this.field3448, (byte) 125, this.field3436);
        }
    }
}
