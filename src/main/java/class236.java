import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class236 extends class175 {

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    private int field3391 = 0;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "Lic;")
    private class329 field3393 = new class329(16);

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    private int field3416 = 0;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "Lll;")
    private class54 field3419 = new class54();

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "J")
    private long field3421 = 0L;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Lfm;")
    private class179 field3390;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    private int field3400;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "Z")
    private boolean field3417;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "Lll;")
    private class54 field3420;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    private int field3414;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "Z")
    private boolean field3422;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    private int field3392;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Lja;")
    private class112 field3386;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lfm;")
    private class179 field3388;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Len;")
    private class3 field3383;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Lng;")
    private class88 field3408;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3385 = "flash2:";

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Ljava/lang/String;")
    public static String field3396 = "red:";

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Lvk;")
    public static class188 field3406;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "Lfo;")
    private class229 field3405;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "Z")
    private boolean field3418;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "[B")
    private byte[] field3402;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I", line = 6)
    public final int method1675(int arg0) {
        field3413++;
        if (this.field3405 == null) {
            return 0;
        } else if (!this.field3417) {
            return this.field3405.field3281;
        } else if (arg0 == 1) {
            class26 var2 = this.field3420.method413(1253231568);
            return var2 == null ? 0 : (int) var2.field304;
        } else {
            return -10;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V", line = 31)
    public static final void method1676(int arg0, int arg1, int arg2, int arg3) {
        if (~arg1 == arg2) {
            class251.field3681.method1309(23, 230);
            class130.field1773++;
        }
        if (arg1 == 1) {
            class29.field327++;
            class251.field3681.method1309(23, 207);
        }
        field3398++;
        class251.field3681.method2053(82, ++client.field1632);
        class251.field3681.method2048(class143.field1991[82] ? 1 : 0, arg2 ^ 0xFFFFFF86);
        class251.field3681.method2098(arg2 - 105, class355.field5556 + arg3);
        class251.field3681.method2103(class331.field4867 + arg0, (byte) -123);
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)I", line = 54)
    public static final int method1677(int arg0, int arg1) {
        if (arg0 < 17) {
            field3396 = (String) null;
        }
        field3389++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Lfo;", line = 65)
    public final class229 method1292(int arg0) {
        field3397++;
        if (this.field3405 != null) {
            return this.field3405;
        }
        if (arg0 != 0) {
            this.method1686(47);
        }
        if (this.field3408 == null) {
            if (this.field3383.method12(arg0 ^ 0x0)) {
                return null;
            }
            this.field3408 = this.field3383.method17((byte) 0, 255, true, -24559, this.field3400);
        }
        if (this.field3408.field1109) {
            return null;
        }
        byte[] var2 = this.field3408.method636((byte) -90);
        if (this.field3408 instanceof class254) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3405 = new class229(var2, this.field3392);
                if (this.field3405.field3280 != this.field3414) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field3405 = null;
                if (this.field3383.method12(0)) {
                    this.field3408 = null;
                } else {
                    this.field3408 = this.field3383.method17((byte) 0, 255, true, -24559, this.field3400);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3405 = new class229(var2, this.field3392);
            } catch (RuntimeException var6) {
                this.field3383.method20(-30223);
                this.field3405 = null;
                if (this.field3383.method12(0)) {
                    this.field3408 = null;
                } else {
                    this.field3408 = this.field3383.method17((byte) 0, 255, true, -24559, this.field3400);
                }
                return null;
            }
            if (this.field3388 != null) {
                this.field3386.method793((byte) -124, this.field3388, var2, this.field3400);
            }
        }
        if (this.field3390 != null) {
            this.field3391 = 0;
            this.field3402 = new byte[this.field3405.field3296];
        }
        this.field3408 = null;
        return this.field3405;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)I", line = 160)
    public static final int method1678(int arg0) {
        field3403++;
        if (arg0 != 343760616) {
            method1684(110, -72, -67, -25L);
        }
        return class226.field3257 && class143.field1991[81] && class66.field853 > 2 ? class42.field533[class66.field853 - 2] : class42.field533[class66.field853 - 1];
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I", line = 175)
    public final int method1679(byte arg0) {
        field3404++;
        int var2 = 114 % ((arg0 + 38) / 39);
        if (this.method1292(0) == null) {
            return this.field3408 == null ? 0 : this.field3408.method638(99);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V", line = 195)
    public final void method1289(int arg0, int arg1) {
        if (arg1 >= -2) {
            this.method1683(16);
        }
        field3399++;
        if (this.field3390 == null) {
            return;
        }
        for (class26 var3 = this.field3419.method413(1253231568); var3 != null; var3 = this.field3419.method419(64)) {
            if (((long) arg0) == var3.field304) {
                return;
            }
        }
        class26 var4 = new class26();
        var4.field304 = (long) arg0;
        this.field3419.method415((byte) -99, var4);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V", line = 227)
    public static void method1680(byte arg0) {
        if (arg0 == -82) {
            field3396 = null;
            field3406 = null;
            field3385 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V", line = 244)
    public final void method1681(boolean arg0) {
        field3394++;
        if (this.field3420 == null || this.method1292(0) == null) {
            return;
        }
        class26 var2 = this.field3419.method413(1253231568);
        if (arg0) {
            return;
        }
        while (var2 != null) {
            int var3 = (int) var2.field304;
            if (var3 < 0 || this.field3405.field3296 <= var3 || this.field3405.field3285[var3] == 0) {
                var2.method179((byte) 51);
            } else {
                if (this.field3402[var3] == 0) {
                    this.method1687(-1, var3, 1);
                }
                if (this.field3402[var3] == -1) {
                    this.method1687(-1, var3, 2);
                }
                if (this.field3402[var3] == 1) {
                    var2.method179((byte) 51);
                }
            }
            var2 = this.field3419.method419(29);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)I", line = 297)
    public final int method1682(boolean arg0) {
        if (!arg0) {
            this.field3417 = true;
        }
        field3401++;
        return this.field3391;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 318)
    public final void method1683(int arg0) {
        field3387++;
        if (this.field3390 == null) {
            return;
        }
        this.field3418 = true;
        if (this.field3420 == null) {
            this.field3420 = new class54();
        }
        if (arg0 != -94271416) {
            this.method1681(false);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIJ)Z", line = 339)
    public static final boolean method1684(int arg0, int arg1, int arg2, long arg3) {
        class119 var5 = class345.field5367[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1552 != null && var5.field1552.field3302 == arg3) {
            return true;
        } else if (var5.field1566 != null && var5.field1566.field851 == arg3) {
            return true;
        } else if (var5.field1577 != null && var5.field1577.field267 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1563; var6++) {
                if (var5.field1549[var6].field4289 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V", line = 371)
    public static final void method1685(boolean arg0) {
        class348.field5418 = null;
        if (arg0) {
            field3406 = (class188) null;
        }
        class292.field4253 = null;
        field3384++;
        class251.field3673 = null;
        class184.field2508 = null;
        class119.field1578 = null;
        class338.field5276 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)[B", line = 400)
    public final byte[] method1290(int arg0, int arg1) {
        field3409++;
        class88 var3 = this.method1687(-1, arg1, 0);
        if (var3 == null) {
            return null;
        }
        if (arg0 != -94271416) {
            field3385 = (String) null;
        }
        byte[] var4 = var3.method636((byte) -90);
        var3.method179((byte) 51);
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I", line = 423)
    public final int method1686(int arg0) {
        field3410++;
        if (arg0 != 0) {
            this.field3419 = (class54) null;
        }
        return this.field3405 == null ? 0 : this.field3405.field3281;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I", line = 444)
    public final int method1288(int arg0, int arg1) {
        class88 var3 = (class88) this.field3393.method2279((long) arg0, arg1 + 47);
        field3407++;
        if (var3 == null) {
            if (arg1 != -1) {
                this.field3386 = (class112) null;
            }
            return 0;
        } else {
            return var3.method638(117);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Lng;", line = 461)
    private final class88 method1687(int arg0, int arg1, int arg2) {
        field3411++;
        class88 var4 = (class88) this.field3393.method2279((long) arg1, -127);
        if (var4 != null && arg2 == 0 && !var4.field1105 && var4.field1109) {
            var4.method179((byte) 51);
            var4 = null;
        }
        if (arg0 != -1) {
            return (class88) null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field3390 == null || this.field3402[arg1] == -1) {
                    if (this.field3383.method12(0)) {
                        return null;
                    }
                    var4 = this.field3383.method17((byte) 2, this.field3400, true, -24559, arg1);
                } else {
                    var4 = this.field3386.method798((byte) -117, this.field3390, arg1);
                }
            } else if (arg2 == 1) {
                if (this.field3390 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3386.method790(-10260, this.field3390, arg1);
            } else if (arg2 == 2) {
                if (this.field3390 == null) {
                    throw new RuntimeException();
                }
                if (this.field3402[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3383.method24(true)) {
                    return null;
                }
                var4 = this.field3383.method17((byte) 2, this.field3400, false, -24559, arg1);
            } else {
                throw new RuntimeException();
            }
            this.field3393.method2275(var4, 107, (long) arg1);
        }
        if (var4.field1109) {
            return null;
        }
        byte[] var5 = var4.method636((byte) -90);
        if (!var4 instanceof class254) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class121.field1583.reset();
                class121.field1583.update(var5, 0, var5.length - 2);
                int var6 = (int) class121.field1583.getValue();
                if (this.field3405.field3279[arg1] != var6) {
                    throw new RuntimeException();
                }
                this.field3383.field46 = 0;
                this.field3383.field47 = 0;
            } catch (RuntimeException var14) {
                this.field3383.method20(-30223);
                var4.method179((byte) 51);
                if (var4.field1105 && !this.field3383.method12(0)) {
                    class172 var8 = this.field3383.method17((byte) 2, this.field3400, true, -24559, arg1);
                    this.field3393.method2275(var8, 108, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3405.field3295[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field3405.field3295[arg1];
            if (this.field3390 != null) {
                this.field3386.method793((byte) -127, this.field3390, var5, arg1);
                if (this.field3402[arg1] != 1) {
                    this.field3391++;
                    this.field3402[arg1] = 1;
                }
            }
            if (!var4.field1105) {
                var4.method179((byte) 51);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class121.field1583.reset();
            class121.field1583.update(var5, 0, var5.length - 2);
            int var9 = (int) class121.field1583.getValue();
            if (this.field3405.field3279[arg1] != var9) {
                throw new RuntimeException();
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3405.field3295[arg1] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field3402[arg1] != 1) {
                if (this.field3402[arg1] != 0) {
                }
                this.field3391++;
                this.field3402[arg1] = 1;
            }
            if (!var4.field1105) {
                var4.method179((byte) 51);
            }
            return var4;
        } catch (Exception var13) {
            this.field3402[arg1] = -1;
            var4.method179((byte) 51);
            if (var4.field1105 && !this.field3383.method12(0)) {
                class172 var12 = this.field3383.method17((byte) 2, this.field3400, true, -24559, arg1);
                this.field3393.method2275(var12, 89, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V", line = 675)
    public final void method1688(int arg0) {
        if (arg0 != -2) {
            return;
        }
        field3415++;
        if (this.field3420 != null) {
            if (this.method1292(0) == null) {
                return;
            }
            if (this.field3417) {
                boolean var6 = true;
                for (class26 var7 = this.field3420.method413(arg0 ^ 0xB54D342E); var7 != null; var7 = this.field3420.method419(54)) {
                    int var8 = (int) var7.field304;
                    if (this.field3402[var8] == 0) {
                        this.method1687(-1, var8, 1);
                    }
                    if (this.field3402[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method179((byte) 51);
                    }
                }
                while (this.field3416 < this.field3405.field3285.length) {
                    if (this.field3405.field3285[this.field3416] == 0) {
                        this.field3416++;
                    } else {
                        if (this.field3386.field1454 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3402[this.field3416] == 0) {
                            this.method1687(arg0 + 1, this.field3416, 1);
                        }
                        if (this.field3402[this.field3416] == 0) {
                            var6 = false;
                            class26 var9 = new class26();
                            var9.field304 = (long) this.field3416;
                            this.field3420.method415((byte) 88, var9);
                        }
                        this.field3416++;
                    }
                }
                if (var6) {
                    this.field3417 = false;
                    this.field3416 = 0;
                }
            } else if (this.field3418) {
                boolean var2 = true;
                for (class26 var3 = this.field3420.method413(1253231568); var3 != null; var3 = this.field3420.method419(84)) {
                    int var4 = (int) var3.field304;
                    if (this.field3402[var4] != 1) {
                        this.method1687(-1, var4, 2);
                    }
                    if (this.field3402[var4] == 1) {
                        var3.method179((byte) 51);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3405.field3285.length > this.field3416) {
                    if (this.field3405.field3285[this.field3416] == 0) {
                        this.field3416++;
                    } else {
                        if (this.field3383.method24(true)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3402[this.field3416] != 1) {
                            this.method1687(arg0 ^ 0x1, this.field3416, 2);
                        }
                        if (this.field3402[this.field3416] != 1) {
                            var2 = false;
                            class26 var5 = new class26();
                            var5.field304 = (long) this.field3416;
                            this.field3420.method415((byte) 15, var5);
                        }
                        this.field3416++;
                    }
                }
                if (var2) {
                    this.field3418 = false;
                    this.field3416 = 0;
                }
            } else {
                this.field3420 = null;
            }
        }
        if (!this.field3422 || this.field3421 > class6.method37(10828)) {
            return;
        }
        for (class88 var10 = (class88) this.field3393.method2277(13292); var10 != null; var10 = (class88) this.field3393.method2278((byte) -88)) {
            if (!var10.field1109) {
                if (var10.field1111) {
                    if (!var10.field1105) {
                        throw new RuntimeException();
                    }
                    var10.method179((byte) 51);
                } else {
                    var10.field1111 = true;
                }
            }
        }
        this.field3421 = class6.method37(arg0 + 10830) + 1000L;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(ILfm;Lfm;Len;Lja;IIZ)V", line = 877)
    public class236(int arg0, class179 arg1, class179 arg2, class3 arg3, class112 arg4, int arg5, int arg6, boolean arg7) {
        this.field3390 = arg1;
        this.field3400 = arg0;
        if (this.field3390 == null) {
            this.field3417 = false;
        } else {
            this.field3417 = true;
            this.field3420 = new class54();
        }
        this.field3414 = arg6;
        this.field3422 = arg7;
        this.field3392 = arg5;
        this.field3386 = arg4;
        this.field3388 = arg2;
        this.field3383 = arg3;
        if (this.field3388 != null) {
            this.field3408 = this.field3386.method798((byte) -125, this.field3388, this.field3400);
        }
    }
}
