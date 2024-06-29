import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class25 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    private int field418 = -1;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    private int field432 = -1;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    private int field439 = -1;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public int field438 = -1;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public int field423 = -1;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    private int field426 = -1;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Z")
    public boolean field440 = false;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public int field429 = -1;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Z")
    public boolean field441 = true;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "Z")
    public boolean field444 = true;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public int field445 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public int field430 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public int field431 = 0;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "[Ljava/lang/String;")
    public String[] field425 = new String[5];

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public int field435 = -1;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public int field450 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    private int field436 = -1;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "Z")
    public boolean field452 = true;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public int field456 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "Lbj;")
    public static class131 field457;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "[Z")
    public static boolean[] field458;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public int field453;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "Ljava/lang/String;")
    public String field443;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "Ljava/lang/String;")
    public String field446;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "[I")
    public int[] field442;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLkh;)V")
    public final void method290(boolean arg0, class11 arg1) {
        while (true) {
            int var3 = arg1.method172((byte) 52);
            if (var3 == 0) {
                if (!arg0) {
                    field459 = -116;
                }
                field434++;
                return;
            }
            this.method291((byte) 101, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BILkh;)V")
    private final void method291(byte arg0, int arg1, class11 arg2) {
        if (arg0 < 89) {
            return;
        }
        if (arg1 == 1) {
            this.field435 = arg2.method174(255);
        } else if (arg1 == 2) {
            this.field423 = arg2.method174(255);
        } else if (arg1 == 3) {
            this.field446 = arg2.method171(-9265);
        } else if (arg1 == 4) {
            this.field437 = arg2.method208(27308);
        } else if (arg1 == 5) {
            this.field438 = arg2.method208(27308);
        } else if (arg1 == 6) {
            this.field431 = arg2.method172((byte) 52);
        } else if (arg1 == 7) {
            int var4 = arg2.method172((byte) 52);
            if ((var4 & 0x2) == 2) {
                this.field440 = true;
            }
            if ((var4 & 0x1) == 0) {
                this.field441 = false;
            }
        } else if (arg1 == 8) {
            this.field444 = arg2.method172((byte) 52) == 1;
        } else if (arg1 == 9) {
            this.field436 = arg2.method174(255);
            if (this.field436 == 65535) {
                this.field436 = -1;
            }
            this.field426 = arg2.method174(255);
            if (this.field426 == 65535) {
                this.field426 = -1;
            }
            this.field449 = arg2.method185(25239);
            this.field448 = arg2.method185(25239);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field425[arg1 - 10] = arg2.method171(-9265);
        } else if (arg1 == 15) {
            int var5 = arg2.method172((byte) 52);
            this.field442 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field442[var6] = arg2.method207(7124);
            }
            this.field422 = arg2.method185(25239);
            this.field453 = arg2.method185(25239);
        } else if (arg1 == 16) {
            this.field452 = false;
        } else if (arg1 == 17) {
            this.field443 = arg2.method171(-9265);
        } else if (arg1 == 18) {
            this.field432 = arg2.method174(255);
        } else if (arg1 == 19) {
            this.field429 = arg2.method174(255);
        } else if (arg1 == 20) {
            this.field439 = arg2.method174(255);
            if (this.field439 == 65535) {
                this.field439 = -1;
            }
            this.field418 = arg2.method174(255);
            if (this.field418 == 65535) {
                this.field418 = -1;
            }
            this.field447 = arg2.method185(25239);
            this.field455 = arg2.method185(25239);
        } else if (arg1 == 21) {
            this.field454 = arg2.method185(25239);
        } else if (arg1 == 22) {
            this.field427 = arg2.method185(25239);
        }
        field424++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Luo;B)Lsg;")
    public final class226 method292(class345 arg0, byte arg1) {
        field421++;
        class226 var3 = (class226) class376.field5368.method904(false, (long) (arg0.field4704 << 29 | 0x20000 | this.field432));
        if (var3 != null) {
            return var3;
        }
        class414.field5875.method1759(-70, this.field432);
        class238 var4 = class238.method1606(class414.field5875, this.field432, 0);
        if (arg1 != -77) {
            this.field455 = -126;
        }
        if (var4 != null) {
            var3 = arg0.method105(var4, true);
            class376.field5368.method902((long) (this.field432 | 0x20000 | arg0.field4704 << 29), (byte) 112, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method293(int arg0, int arg1, boolean arg2) {
        field419++;
        if (arg1 != 10) {
            field458 = null;
        }
        return arg2 && arg0 >= 0 ? class326.method2092(arg0, 918, 10, arg2) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method294(int arg0) {
        if (arg0 == -17450) {
            field458 = null;
            field457 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZLuo;)Lsg;")
    public final class226 method295(boolean arg0, boolean arg1, class345 arg2) {
        field417++;
        int var4 = arg1 ? this.field423 : this.field435;
        int var5 = var4 | arg2.field4704 << 29;
        class226 var6 = (class226) class376.field5368.method904(arg0, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (class414.field5875.method1759(-115, var4)) {
            class238 var7 = class238.method1606(class414.field5875, var4, 0);
            if (var7 != null) {
                var6 = arg2.method105(var7, true);
                class376.field5368.method902((long) var5, (byte) 112, var6);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
    public static final void method296(int arg0, int arg1) {
        if (arg1 != -17) {
            field458 = null;
        }
        field451++;
        class368.field5191 = arg0;
        class131 var2 = class440.field6202;
        synchronized (class440.field6202) {
            class440.field6202.method905((byte) 120);
        }
        class131 var3 = class450.field6291;
        synchronized (class450.field6291) {
            class450.field6291.method905((byte) 42);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public final void method297(int arg0) {
        if (arg0 != Integer.MIN_VALUE) {
            this.method295(false, true, (class345) null);
        }
        if (this.field442 != null) {
            for (int var2 = 0; var2 < this.field442.length; var2 += 2) {
                if (this.field430 > this.field442[var2]) {
                    this.field430 = this.field442[var2];
                } else if (this.field450 < this.field442[var2]) {
                    this.field450 = this.field442[var2];
                }
                if (this.field442[var2 + 1] < this.field456) {
                    this.field456 = this.field442[var2 + 1];
                } else if (this.field445 < this.field442[var2 + 1]) {
                    this.field445 = this.field442[var2 + 1];
                }
            }
        }
        field433++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Z")
    public final boolean method298(byte arg0) {
        int var2 = -56 % ((-arg0 - 52) / 63);
        field428++;
        if (this.field426 == -1 && this.field436 == -1) {
            return true;
        }
        boolean var3 = false;
        int var4;
        if (this.field426 == -1) {
            var4 = class386.method2445((byte) -97, this.field436);
        } else {
            var4 = class297.field4156[this.field426];
        }
        if (var4 < this.field449 || var4 > this.field448) {
            return false;
        } else if (this.field418 == -1 && this.field439 == -1) {
            return true;
        } else {
            boolean var5 = false;
            int var6;
            if (this.field418 == -1) {
                var6 = class386.method2445((byte) -97, this.field439);
            } else {
                var6 = class297.field4156[this.field418];
            }
            return this.field447 <= var6 && this.field455 >= var6;
        }
    }

    static {
        new class442("From", "Von:", "De", "De");
        field457 = new class131(64);
        field458 = new boolean[100];
    }
}
