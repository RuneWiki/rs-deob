import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class680 {

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public int field9510 = -1;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public int field9512 = -1;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "Z")
    public boolean field9513 = true;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "Z")
    public boolean field9503 = true;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "Z")
    public boolean field9501 = false;

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "I")
    private int field9520 = -1;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    private int field9507 = -1;

    @OriginalMember(owner = "client!rs", name = "H", descriptor = "Z")
    public boolean field9528 = true;

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "[Ljava/lang/String;")
    public String[] field9534 = new String[5];

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "I")
    public int field9516 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
    private int field9533 = -1;

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "I")
    private int field9521 = -1;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public int field9514 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
    public int field9525 = -1;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
    public int field9530 = -1;

    @OriginalMember(owner = "client!rs", name = "T", descriptor = "I")
    public int field9540 = -1;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "I")
    private int field9515 = -1;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public int field9504 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rs", name = "P", descriptor = "I")
    public int field9536 = -1;

    @OriginalMember(owner = "client!rs", name = "U", descriptor = "I")
    public int field9541 = 0;

    @OriginalMember(owner = "client!rs", name = "X", descriptor = "I")
    public int field9544 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
    public int field9535 = -1;

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "Lee;")
    public static class706 field9518 = new class706(16);

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    private int field9495;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public int field9499;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field9500;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public int field9505;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    private int field9511;

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "I")
    public static int field9517;

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "I")
    public static int field9522;

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "I")
    public static int field9523;

    @OriginalMember(owner = "client!rs", name = "D", descriptor = "I")
    public int field9524;

    @OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
    public static int field9526;

    @OriginalMember(owner = "client!rs", name = "G", descriptor = "I")
    private int field9527;

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "I")
    public int field9531;

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
    public int field9537;

    @OriginalMember(owner = "client!rs", name = "R", descriptor = "I")
    public int field9538;

    @OriginalMember(owner = "client!rs", name = "V", descriptor = "I")
    private int field9542;

    @OriginalMember(owner = "client!rs", name = "W", descriptor = "I")
    public int field9543;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "Lb;")
    public class354 field9508;

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "Lee;")
    private class706 field9519;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "Ljava/lang/String;")
    public String field9496;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "Ljava/lang/String;")
    public String field9506;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "[B")
    public byte[] field9502;

    @OriginalMember(owner = "client!rs", name = "S", descriptor = "[I")
    public int[] field9539;

    @OriginalMember(owner = "client!rs", name = "Y", descriptor = "[I")
    public int[] field9545;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
    public final String method3755(int arg0, byte arg1, String arg2) {
        field9532++;
        if (this.field9519 == null) {
            return arg2;
        }
        if (arg1 >= -34) {
            this.method3756(null, 100, -82);
        }
        class482 var4 = (class482) this.field9519.method3953((long) arg0, 14);
        return var4 == null ? arg2 : var4.field6664;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljp;II)V")
    private final void method3756(class376 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field9536 = arg0.method2359(-1);
        } else if (arg2 == 2) {
            this.field9525 = arg0.method2359(arg1 ^ 0x16);
        } else if (arg2 == 3) {
            this.field9496 = arg0.method2379((byte) 85);
        } else if (arg2 == 4) {
            this.field9537 = arg0.method2373(1223262424);
        } else if (arg2 == 5) {
            this.field9535 = arg0.method2373(1223262424);
        } else if (arg2 == 6) {
            this.field9541 = arg0.method2398(-1372747256);
        } else if (arg2 == 7) {
            int var15 = arg0.method2398(arg1 ^ 0x51D275E1);
            if ((var15 & 0x2) == 2) {
                this.field9501 = true;
            }
            if ((var15 & 0x1) == 0) {
                this.field9513 = false;
            }
        } else if (arg2 == 8) {
            this.field9503 = arg0.method2398(-1372747256) == 1;
        } else if (arg2 == 9) {
            this.field9521 = arg0.method2359(arg1 ^ 0x16);
            if (this.field9521 == 65535) {
                this.field9521 = -1;
            }
            this.field9533 = arg0.method2359(-1);
            if (this.field9533 == 65535) {
                this.field9533 = -1;
            }
            this.field9527 = arg0.method2384(arg1 + 67);
            this.field9542 = arg0.method2384(59);
        } else if (arg2 >= 10 && arg2 <= 14) {
            this.field9534[arg2 - 10] = arg0.method2379((byte) 85);
        } else if (arg2 == 15) {
            int var10 = arg0.method2398(-1372747256);
            this.field9539 = new int[var10 * 2];
            for (int var11 = 0; var11 < var10 * 2; var11++) {
                this.field9539[var11] = arg0.method2355(3);
            }
            this.field9524 = arg0.method2384(112);
            int var12 = arg0.method2398(arg1 - 1372747233);
            this.field9545 = new int[var12];
            for (int var13 = 0; var13 < this.field9545.length; var13++) {
                this.field9545[var13] = arg0.method2384(class471.method2773(arg1, -108));
            }
            this.field9502 = new byte[var10];
            for (int var14 = 0; var14 < var10; var14++) {
                this.field9502[var14] = arg0.method2387((byte) 34);
            }
        } else if (arg2 == 16) {
            this.field9528 = false;
        } else if (arg2 == 17) {
            this.field9506 = arg0.method2379((byte) 85);
        } else if (arg2 == 18) {
            this.field9515 = arg0.method2359(-1);
        } else if (arg2 == 19) {
            this.field9512 = arg0.method2359(-1);
        } else if (arg2 == 20) {
            this.field9520 = arg0.method2359(-1);
            if (this.field9520 == 65535) {
                this.field9520 = -1;
            }
            this.field9507 = arg0.method2359(-1);
            if (this.field9507 == 65535) {
                this.field9507 = -1;
            }
            this.field9511 = arg0.method2384(70);
            this.field9495 = arg0.method2384(8);
        } else if (arg2 == 21) {
            this.field9538 = arg0.method2384(21);
        } else if (arg2 == 22) {
            this.field9543 = arg0.method2384(88);
        } else if (arg2 == 23) {
            this.field9530 = arg0.method2398(-1372747256);
            this.field9510 = arg0.method2398(arg1 - 1372747233);
            this.field9540 = arg0.method2398(-1372747256);
        } else if (arg2 == 24) {
            this.field9531 = arg0.method2355(arg1 + 26);
            this.field9499 = arg0.method2355(arg1 ^ 0xFFFFFFEA);
        } else if (arg2 == 249) {
            int var4 = arg0.method2398(-1372747256);
            if (this.field9519 == null) {
                int var5 = class719.method4014(var4, (byte) -100);
                this.field9519 = new class706(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method2398(arg1 ^ 0x51D275E1) == 1;
                int var8 = arg0.method2373(1223262424);
                class101 var9;
                if (var7) {
                    var9 = new class482(arg0.method2379((byte) 85));
                } else {
                    var9 = new class119(arg0.method2384(117));
                }
                this.field9519.method3962((long) var8, var9, -105);
            }
        }
        field9509++;
        if (arg1 != -23) {
            this.method3761(false, -102, null);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public final void method3757(int arg0) {
        if (arg0 > -12) {
            this.field9505 = -7;
        }
        field9522++;
        if (this.field9539 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field9539.length; var2 += 2) {
            if (this.field9539[var2] < this.field9516) {
                this.field9516 = this.field9539[var2];
            } else if (this.field9544 < this.field9539[var2]) {
                this.field9544 = this.field9539[var2];
            }
            if (this.field9539[var2 + 1] < this.field9514) {
                this.field9514 = this.field9539[var2 + 1];
            } else if (this.field9539[var2 + 1] > this.field9504) {
                this.field9504 = this.field9539[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)I")
    public final int method3758(int arg0, int arg1, int arg2) {
        field9497++;
        if (this.field9519 == null) {
            return arg0;
        }
        class119 var4 = (class119) this.field9519.method3953((long) arg1, 14);
        if (var4 == null) {
            return arg0;
        } else {
            if (arg2 != 17110) {
                this.field9544 = 42;
            }
            return var4.field1725;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLii;)Z")
    public final boolean method3759(byte arg0, class580 arg1) {
        if (arg0 >= -100) {
            this.method3760(48, null);
        }
        field9523++;
        int var3;
        if (this.field9533 == -1) {
            if (this.field9521 == -1) {
                return true;
            }
            var3 = arg1.method2271(this.field9521, 14194);
        } else {
            var3 = arg1.method2272(0, this.field9533);
        }
        if (var3 < this.field9527 || this.field9542 < var3) {
            return false;
        }
        boolean var4 = false;
        int var5;
        if (this.field9507 == -1) {
            if (this.field9520 == -1) {
                return true;
            }
            var5 = arg1.method2271(this.field9520, 14194);
        } else {
            var5 = arg1.method2272(0, this.field9507);
        }
        return var5 >= this.field9511 && var5 <= this.field9495;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjp;)V")
    public final void method3760(int arg0, class376 arg1) {
        field9526++;
        while (true) {
            int var3 = arg1.method2398(-1372747256);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    this.field9503 = true;
                    return;
                }
            }
            this.method3756(arg1, arg0 - 23, var3);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZILha;)Lvr;")
    public final class147 method3761(boolean arg0, int arg1, class65 arg2) {
        field9500++;
        int var4 = arg0 ? this.field9525 : this.field9536;
        int var5 = arg2.field913 << 29 | var4;
        class147 var6 = (class147) this.field9508.field5201.method1541(-10, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (this.field9508.field5198.method2104(-106, var4)) {
            class508 var7 = class508.method2950(this.field9508.field5198, var4, arg1);
            if (var7 != null) {
                var6 = arg2.method477(var7, true);
                this.field9508.field5201.method1544(true, var6, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lha;B)Lvr;")
    public final class147 method3762(class65 arg0, byte arg1) {
        field9498++;
        class147 var3 = (class147) this.field9508.field5201.method1541(-10, (long) (this.field9515 | 0x20000 | arg0.field913 << 29));
        if (var3 != null) {
            return var3;
        }
        this.field9508.field5198.method2104(arg1 - 127, this.field9515);
        class508 var4 = class508.method2950(this.field9508.field5198, this.field9515, 0);
        if (arg1 != 2) {
            return null;
        }
        if (var4 != null) {
            var3 = arg0.method477(var4, true);
            this.field9508.field5201.method1544(true, var3, (long) (this.field9515 | 0x20000 | arg0.field913 << 29));
        }
        return var3;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
    public static void method3763(byte arg0) {
        if (arg0 == -67) {
            field9518 = null;
        }
    }

    static {
        new BitSet(65536);
    }
}
