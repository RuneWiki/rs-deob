import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class431 {

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    private int field6390 = -1;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    private int field6396 = -1;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public int field6397 = -1;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public int field6400 = 0;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    private int field6389 = -1;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Z")
    public boolean field6398 = true;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public int field6403 = -1;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public int field6407 = -1;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public int field6391 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public int field6410 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    private int field6394 = -1;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    private int field6414 = -1;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Z")
    public boolean field6401 = false;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public int field6412 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "[Ljava/lang/String;")
    public String[] field6422 = new String[5];

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "Z")
    public boolean field6419 = true;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "Z")
    public boolean field6425 = true;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    public int field6426 = -1;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public int field6402 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public int field6386;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public int field6387;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public int field6392;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    private int field6393;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public int field6399;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public int field6411;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    private int field6413;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    private int field6415;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public int field6416;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    private int field6420;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "Lik;")
    public class178 field6421;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "Lsd;")
    private class80 field6404;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Ljava/lang/String;")
    public String field6406;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "Ljava/lang/String;")
    public String field6418;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "[I")
    public int[] field6428;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "[[[Luaa;")
    public static class99[][][] field6408;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILrt;)V")
    public final void method2687(int arg0, class194 arg1) {
        while (true) {
            int var3 = arg1.method1177(255);
            if (var3 == 0) {
                if (arg0 > -77) {
                    return;
                }
                field6423++;
                return;
            }
            this.method2692(var3, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method2688(String arg0, int arg1, int arg2) {
        field6388++;
        if (this.field6404 == null) {
            return arg0;
        }
        class621 var4 = (class621) this.field6404.method524((byte) 123, (long) arg1);
        if (arg2 != Integer.MIN_VALUE) {
            this.field6414 = 113;
        }
        return var4 == null ? arg0 : var4.field8996;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZLsp;)Z")
    public final boolean method2689(boolean arg0, class552 arg1) {
        field6395++;
        int var3;
        if (this.field6396 == -1) {
            if (this.field6389 == -1) {
                return true;
            }
            var3 = arg1.method3195(this.field6389, true);
        } else {
            var3 = arg1.method3196(this.field6396, 0);
        }
        if (this.field6415 > var3 || this.field6413 < var3) {
            return false;
        }
        if (!arg0) {
            this.method2693(-114, -18, -49);
        }
        boolean var4 = false;
        int var5;
        if (this.field6394 == -1) {
            if (this.field6414 == -1) {
                return true;
            }
            var5 = arg1.method3195(this.field6414, true);
        } else {
            var5 = arg1.method3196(this.field6394, 0);
        }
        return var5 >= this.field6393 && this.field6420 >= var5;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Loa;I)Lxa;")
    public final class433 method2690(class605 arg0, int arg1) {
        field6424++;
        class433 var3 = (class433) this.field6421.field2198.method1801(0, (long) (arg0.field8846 << 29 | this.field6390 | arg1));
        if (var3 != null) {
            return var3;
        }
        this.field6421.field2186.method1311(this.field6390, (byte) -93);
        class372 var4 = class372.method2398(this.field6421.field2186, this.field6390, 0);
        if (var4 != null) {
            var3 = arg0.method388(var4, true);
            this.field6421.field2198.method1808((long) (this.field6390 | 0x20000 | arg0.field8846 << 29), var3, (byte) -60);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZLoa;I)Lxa;")
    public final class433 method2691(boolean arg0, class605 arg1, int arg2) {
        field6417++;
        int var4 = arg0 ? this.field6397 : this.field6407;
        int var5 = var4 | arg1.field8846 << 29;
        class433 var6 = (class433) this.field6421.field2198.method1801(0, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (!this.field6421.field2186.method1311(var4, (byte) -93)) {
            return null;
        } else if (arg2 == 1768021437) {
            class372 var7 = class372.method2398(this.field6421.field2186, var4, 0);
            if (var7 != null) {
                var6 = arg1.method388(var7, true);
                this.field6421.field2198.method1808((long) var5, var6, (byte) -119);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILrt;I)V")
    private final void method2692(int arg0, class194 arg1, int arg2) {
        if (arg0 == 1) {
            this.field6407 = arg1.method1220(arg2 - 101);
        } else if (arg0 == 2) {
            this.field6397 = arg1.method1220(-59);
        } else if (arg0 == 3) {
            this.field6418 = arg1.method1218(false);
        } else if (arg0 == 4) {
            this.field6392 = arg1.method1180(-832631516);
        } else if (arg0 == 5) {
            this.field6426 = arg1.method1180(-832631516);
        } else if (arg0 == 6) {
            this.field6400 = arg1.method1177(255);
        } else if (arg0 == 7) {
            int var4 = arg1.method1177(arg2 ^ 0xFFFFFF00);
            if ((var4 & 0x1) == 0) {
                this.field6425 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field6401 = true;
            }
        } else if (arg0 == 8) {
            this.field6398 = arg1.method1177(255) == 1;
        } else if (arg0 == 9) {
            this.field6389 = arg1.method1220(-98);
            if (this.field6389 == 65535) {
                this.field6389 = -1;
            }
            this.field6396 = arg1.method1220(arg2 + 121);
            if (this.field6396 == 65535) {
                this.field6396 = -1;
            }
            this.field6415 = arg1.method1178(-230315992);
            this.field6413 = arg1.method1178(-230315992);
        } else if (arg0 >= 10 && arg0 <= 14) {
            this.field6422[arg0 - 10] = arg1.method1218(false);
        } else if (arg0 == 15) {
            int var5 = arg1.method1177(255);
            this.field6428 = new int[var5 * 2];
            for (int var6 = 0; var6 < var5 * 2; var6++) {
                this.field6428[var6] = arg1.method1233(65280);
            }
            this.field6399 = arg1.method1178(-230315992);
            this.field6387 = arg1.method1178(-230315992);
        } else if (arg0 == 16) {
            this.field6419 = false;
        } else if (arg0 == 17) {
            this.field6406 = arg1.method1218(false);
        } else if (arg0 == 18) {
            this.field6390 = arg1.method1220(121);
        } else if (arg0 == 19) {
            this.field6403 = arg1.method1220(116);
        } else if (arg0 == 20) {
            this.field6414 = arg1.method1220(113);
            if (this.field6414 == 65535) {
                this.field6414 = -1;
            }
            this.field6394 = arg1.method1220(-47);
            if (this.field6394 == 65535) {
                this.field6394 = -1;
            }
            this.field6393 = arg1.method1178(-230315992);
            this.field6420 = arg1.method1178(-230315992);
        } else if (arg0 == 21) {
            this.field6411 = arg1.method1178(arg2 ^ 0xDBA57D7);
        } else if (arg0 == 22) {
            this.field6416 = arg1.method1178(arg2 ^ 0xDBA57D7);
        } else if (arg0 == 249) {
            int var7 = arg1.method1177(255);
            if (this.field6404 == null) {
                int var8 = class367.method2354(-224121456, var7);
                this.field6404 = new class80(var8);
            }
            for (int var9 = 0; var9 < var7; var9++) {
                boolean var10 = arg1.method1177(arg2 ^ 0xFFFFFF00) == 1;
                int var11 = arg1.method1180(-832631516);
                class324 var12;
                if (var10) {
                    var12 = new class621(arg1.method1218(false));
                } else {
                    var12 = new class388(arg1.method1178(-230315992));
                }
                this.field6404.method520((byte) -75, var12, (long) var11);
            }
        }
        field6409++;
        if (arg2 != -1) {
            this.method2692(-27, null, 46);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)I")
    public final int method2693(int arg0, int arg1, int arg2) {
        field6405++;
        if (this.field6404 == null) {
            return arg1;
        }
        class388 var4 = (class388) this.field6404.method524((byte) 95, (long) arg0);
        if (arg2 >= -62) {
            method2694(126);
        }
        return var4 == null ? arg1 : var4.field5965;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public static void method2694(int arg0) {
        field6408 = null;
        if (arg0 != -1) {
            field6408 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
    public final void method2695(boolean arg0) {
        field6427++;
        if (arg0) {
            this.field6396 = -127;
        }
        if (this.field6428 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field6428.length; var2 += 2) {
            if (this.field6428[var2] < this.field6391) {
                this.field6391 = this.field6428[var2];
            } else if (this.field6428[var2] > this.field6410) {
                this.field6410 = this.field6428[var2];
            }
            if (this.field6428[var2 + 1] < this.field6402) {
                this.field6402 = this.field6428[var2 + 1];
            } else if (this.field6428[var2 + 1] > this.field6412) {
                this.field6412 = this.field6428[var2 + 1];
            }
        }
    }
}
