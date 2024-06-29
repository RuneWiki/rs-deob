import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class159 {

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lmq;")
    private class104 field2294 = new class104(64);

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lfc;")
    private class343 field2291;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2292 = 0;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "[[I")
    public static int[][] field2286 = new int[128][128];

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2300 = 0;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2290;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 4)
    public final void method960(int arg0) {
        field2287++;
        if (arg0 != -6257) {
            field2290 = null;
        }
        class104 var2 = this.field2294;
        synchronized (this.field2294) {
            this.field2294.method656(117);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 18)
    public static final void method961(int arg0) {
        class181.field2625 = class237.method1489(true, 2048, 0.4F, 8, 35, 4, (byte) -122, 8);
        if (arg0 == 128) {
            field2289++;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lms;I)V", line = 29)
    public static final void method962(class363 arg0, int arg1) {
        field2298++;
        class363 var2 = class198.method1258(arg0, arg1 ^ 0x74);
        if (arg1 != 0) {
            field2300 = -97;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class371.field5248;
            var3 = class67.field987;
        } else {
            var3 = var2.field5101;
            var4 = var2.field5200;
        }
        class248.method1537(arg0, arg1 ^ 0x4201, false, var4, var3);
        class321.method1935(var3, var4, arg0, -14047);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Lei;", line = 58)
    public final class307 method963(int arg0, byte arg1) {
        field2295++;
        class104 var3 = this.field2294;
        class307 var4;
        synchronized (this.field2294) {
            var4 = (class307) this.field2294.method659((long) arg0, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2291.method2029(11, arg0, 0);
        class307 var6 = new class307();
        if (var5 != null) {
            var6.method1862((byte) -85, new class425(var5));
        }
        class104 var7 = this.field2294;
        synchronized (this.field2294) {
            int var8 = -15 % ((arg1 - 13) / 54);
            this.field2294.method653(59, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 86)
    public final void method964(int arg0) {
        class104 var2 = this.field2294;
        synchronized (this.field2294) {
            this.field2294.method654(false);
            if (arg0 != 238) {
                this.field2291 = null;
            }
        }
        field2293++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 115)
    public static void method965(byte arg0) {
        field2290 = null;
        field2286 = null;
        if (arg0 <= 123) {
            method961(-121);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)Z", line = 126)
    public static final boolean method966(int arg0, int arg1, int arg2, int arg3) {
        if (!class155.method942(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class259.field3616;
        int var5 = arg2 << class259.field3616;
        int var6 = class317.field4306[arg0].method710(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 == 1) {
            if (var4 > class117.field1648) {
                if (!class210.method1323(var4, var6, var5)) {
                    return false;
                }
                if (!class210.method1323(var4, var6, class372.field5263 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class210.method1323(var4, var7, var5)) {
                    return false;
                }
                if (!class210.method1323(var4, var7, class372.field5263 + var5)) {
                    return false;
                }
            }
            if (class210.method1323(var4, var8, var5)) {
                return class210.method1323(var4, var8, class372.field5263 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class211.field2979) {
                if (!class210.method1323(var4, var6, class372.field5263 + var5)) {
                    return false;
                }
                if (!class210.method1323(class372.field5263 + var4, var6, class372.field5263 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class210.method1323(var4, var7, class372.field5263 + var5)) {
                    return false;
                }
                if (!class210.method1323(class372.field5263 + var4, var7, class372.field5263 + var5)) {
                    return false;
                }
            }
            if (class210.method1323(var4, var8, class372.field5263 + var5)) {
                return class210.method1323(class372.field5263 + var4, var8, class372.field5263 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class117.field1648) {
                if (!class210.method1323(class372.field5263 + var4, var6, var5)) {
                    return false;
                }
                if (!class210.method1323(class372.field5263 + var4, var6, class372.field5263 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class210.method1323(class372.field5263 + var4, var7, var5)) {
                    return false;
                }
                if (!class210.method1323(class372.field5263 + var4, var7, class372.field5263 + var5)) {
                    return false;
                }
            }
            if (class210.method1323(class372.field5263 + var4, var8, var5)) {
                return class210.method1323(class372.field5263 + var4, var8, class372.field5263 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class211.field2979) {
                if (!class210.method1323(var4, var6, var5)) {
                    return false;
                }
                if (!class210.method1323(class372.field5263 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class210.method1323(var4, var7, var5)) {
                    return false;
                }
                if (!class210.method1323(class372.field5263 + var4, var7, var5)) {
                    return false;
                }
            }
            if (class210.method1323(var4, var8, var5)) {
                return class210.method1323(class372.field5263 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class210.method1323(class411.field5703 + var4, var9, class411.field5703 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class210.method1323(var4, var8, class372.field5263 + var5);
        } else if (arg3 == 32) {
            return class210.method1323(class372.field5263 + var4, var8, class372.field5263 + var5);
        } else if (arg3 == 64) {
            return class210.method1323(class372.field5263 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class210.method1323(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILqr;)V", line = 307)
    public static final void method967(int arg0, class23 arg1) {
        field2299++;
        if (arg0 != -747) {
            field2290 = null;
        }
        class462 var2 = (class462) class78.field1184.method2614((long) arg1.field1119, 103);
        if (var2 == null) {
            return;
        }
        if (var2.field6507 != null) {
            class386.field5445.method1313(var2.field6507);
            var2.field6507 = null;
        }
        var2.method1182(28818);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ldk;ILfc;)V", line = 382)
    public class159(class328 arg0, int arg1, class343 arg2) {
        this.field2291 = arg2;
        if (this.field2291 != null) {
            this.field2291.method2054(0, 11);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IB)V", line = 337)
    public final void method968(int arg0, byte arg1) {
        class104 var3 = this.field2294;
        synchronized (this.field2294) {
            this.field2294.method666(arg0, false);
            if (arg1 != -94) {
                method962((class363) null, 115);
            }
        }
        field2296++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIZ)V", line = 351)
    public static final void method969(int arg0, int arg1, int arg2, boolean arg3) {
        field2297++;
        if (arg2 == 0) {
            class131.method793(class125.field1719, 102);
            class357.field4982++;
        }
        if (arg2 == 1) {
            class137.field1944++;
            class131.method793(class36.field624, -95);
        }
        class366.field5214.method2470((byte) -74, class194.field2757.method531(82, 51) ? 1 : 0);
        class366.field5214.method2453(class325.field4472 + arg0, !arg3);
        class366.field5214.method2453(class153.field2204 + arg1, !arg3);
        class372.field5266 = arg1;
        class35.field588 = arg0;
        class131.field1836 = arg3;
        class488.method2869(10);
    }
}
