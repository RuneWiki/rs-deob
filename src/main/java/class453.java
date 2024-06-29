import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class453 extends class268 {

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    private int field6699 = 0;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Lcm;")
    private class382 field6698 = new class382(16);

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    private int field6733 = 0;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "Lsf;")
    private class398 field6735 = new class398();

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "J")
    private long field6737 = 0L;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    private int field6705;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Luj;")
    private class415 field6712;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "Z")
    private boolean field6730;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "Lsf;")
    private class398 field6732;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "Lgh;")
    private class51 field6720;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    private int field6716;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "Z")
    private boolean field6738;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lp;")
    private class164 field6700;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    private int field6722;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "Luj;")
    private class415 field6721;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Ln;")
    private class344 field6701;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field6723 = 0;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "[I")
    public static int[] field6719 = new int[8];

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field6725 = 1;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lsf;")
    public static class398 field6703 = new class398();

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "Lnn;")
    public static class151 field6736 = new class151("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Lat;")
    private class387 field6704;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "Z")
    private boolean field6731;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "[B")
    private byte[] field6729;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)I")
    public final int method2811(int arg0) {
        if (arg0 == 100) {
            field6714++;
            return this.field6699;
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)I")
    public final int method2812(int arg0) {
        if (arg0 < 30) {
            this.method2821(true);
        }
        field6715++;
        if (this.field6704 == null) {
            return 0;
        } else if (this.field6730) {
            class97 var2 = this.field6732.method2514((byte) 61);
            return var2 == null ? 0 : (int) var2.field1339;
        } else {
            return this.field6704.field5726;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
    public final void method1667(int arg0, boolean arg1) {
        field6709++;
        if (this.field6712 == null) {
            return;
        }
        for (class97 var3 = this.field6735.method2514((byte) 61); var3 != null; var3 = this.field6735.method2511(88)) {
            if ((long) arg0 == var3.field1339) {
                return;
            }
        }
        if (!arg1) {
            this.field6729 = null;
        }
        class97 var4 = new class97();
        var4.field1339 = (long) arg0;
        this.field6735.method2504(42, var4);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[B")
    public final byte[] method1668(int arg0, int arg1) {
        field6727++;
        class344 var3 = this.method2822(arg0, 0, (byte) 108);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method880(arg1);
            var3.method625((byte) -50);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILiq;)V")
    public static final void method2813(int arg0, class134 arg1) {
        field6702++;
        class303.field4587 = arg1;
        if (arg0 <= 103) {
            method2813(50, (class134) null);
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
    public final void method2814(int arg0) {
        field6706++;
        if (this.field6712 == null) {
            return;
        }
        if (arg0 != -612) {
            this.field6732 = null;
        }
        this.field6731 = true;
        if (this.field6732 == null) {
            this.field6732 = new class398();
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)I")
    public final int method1670(int arg0, int arg1) {
        field6726++;
        class344 var3 = (class344) this.field6698.method2302((long) arg1, 23576);
        if (arg0 != 0) {
            this.field6712 = null;
        }
        return var3 == null ? 0 : var3.method875(0);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Lat;")
    public final class387 method1671(int arg0) {
        field6728++;
        if (this.field6704 != null) {
            return this.field6704;
        }
        if (this.field6701 == null) {
            if (this.field6720.method290(-101)) {
                return null;
            }
            this.field6701 = this.field6720.method289(255, true, 31996, this.field6705, (byte) 0);
        }
        if (this.field6701.field5140) {
            return null;
        }
        byte[] var2 = this.field6701.method880(0);
        if (this.field6701 instanceof class303) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6704 = new class387(var2, this.field6722);
                if (this.field6704.field5729 != this.field6716) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field6704 = null;
                if (this.field6720.method290(-101)) {
                    this.field6701 = null;
                } else {
                    this.field6701 = this.field6720.method289(255, true, 31996, this.field6705, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6704 = new class387(var2, this.field6722);
            } catch (RuntimeException var4) {
                this.field6720.method291(255);
                this.field6704 = null;
                if (this.field6720.method290(-101)) {
                    this.field6701 = null;
                } else {
                    this.field6701 = this.field6720.method289(255, true, 31996, this.field6705, (byte) 0);
                }
                return null;
            }
            if (this.field6721 != null) {
                this.field6700.method989(this.field6721, var2, this.field6705, -19015);
            }
        }
        if (arg0 > -45) {
            this.field6730 = false;
        }
        this.field6701 = null;
        if (this.field6712 != null) {
            this.field6699 = 0;
            this.field6729 = new byte[this.field6704.field5714];
        }
        return this.field6704;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(II)V")
    public static final void method2815(int arg0, int arg1) {
        int var2 = -20 % ((arg0 - 57) / 46);
        field6711++;
        class422.field6216 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)I")
    public final int method2816(boolean arg0) {
        if (arg0) {
            field6718++;
            return this.field6704 == null ? 0 : this.field6704.field5726;
        } else {
            return 15;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
    public static void method2817(boolean arg0) {
        if (!arg0) {
            field6708 = -106;
        }
        field6703 = null;
        field6736 = null;
        field6719 = null;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
    public static final void method2818(int arg0) {
        class183.field2754 = null;
        class288.field4377 = null;
        class430.field6314 = null;
        class416.field6181 = null;
        class99.field1362 = null;
        field6707++;
        class91.field1289 = null;
        class85.field1126 = null;
        class351.field5212 = null;
        if (arg0 != -1) {
            method2818(73);
        }
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
    public final void method2819(int arg0) {
        field6734++;
        if (arg0 != -9924) {
            method2813(15, (class134) null);
        }
        if (this.field6732 != null) {
            if (this.method1671(-89) == null) {
                return;
            }
            if (this.field6730) {
                boolean var2 = true;
                for (class97 var3 = this.field6732.method2514((byte) 61); var3 != null; var3 = this.field6732.method2511(127)) {
                    int var5 = (int) var3.field1339;
                    if (this.field6729[var5] == 0) {
                        this.method2822(var5, 1, (byte) 108);
                    }
                    if (this.field6729[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method625((byte) -50);
                    }
                }
                while (this.field6704.field5717.length > this.field6733) {
                    if (this.field6704.field5717[this.field6733] == 0) {
                        this.field6733++;
                    } else {
                        if (this.field6700.field2287 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field6729[this.field6733] == 0) {
                            this.method2822(this.field6733, 1, (byte) 108);
                        }
                        if (this.field6729[this.field6733] == 0) {
                            class97 var4 = new class97();
                            var4.field1339 = (long) this.field6733;
                            this.field6732.method2504(42, var4);
                            var2 = false;
                        }
                        this.field6733++;
                    }
                }
                if (var2) {
                    this.field6730 = false;
                    this.field6733 = 0;
                }
            } else if (this.field6731) {
                boolean var6 = true;
                for (class97 var7 = this.field6732.method2514((byte) 61); var7 != null; var7 = this.field6732.method2511(69)) {
                    int var9 = (int) var7.field1339;
                    if (this.field6729[var9] != 1) {
                        this.method2822(var9, 2, (byte) 108);
                    }
                    if (this.field6729[var9] == 1) {
                        var7.method625((byte) -50);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field6704.field5717.length > this.field6733) {
                    if (this.field6704.field5717[this.field6733] == 0) {
                        this.field6733++;
                    } else {
                        if (this.field6720.method298((byte) 46)) {
                            var6 = false;
                            break;
                        }
                        if (this.field6729[this.field6733] != 1) {
                            this.method2822(this.field6733, 2, (byte) 108);
                        }
                        if (this.field6729[this.field6733] != 1) {
                            class97 var8 = new class97();
                            var8.field1339 = (long) this.field6733;
                            this.field6732.method2504(arg0 ^ 0xFFFFD916, var8);
                            var6 = false;
                        }
                        this.field6733++;
                    }
                }
                if (var6) {
                    this.field6733 = 0;
                    this.field6731 = false;
                }
            } else {
                this.field6732 = null;
            }
        }
        if (!this.field6738 || class445.method2750(-27580) < this.field6737) {
            return;
        }
        for (class344 var10 = (class344) this.field6698.method2296(5773); var10 != null; var10 = (class344) this.field6698.method2304(100)) {
            if (!var10.field5140) {
                if (var10.field5141) {
                    if (!var10.field5144) {
                        throw new RuntimeException();
                    }
                    var10.method625((byte) -50);
                } else {
                    var10.field5141 = true;
                }
            }
        }
        this.field6737 = class445.method2750(-27580) + 1000L;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)I")
    public final int method2820(byte arg0) {
        field6717++;
        if (arg0 != -79) {
            this.method1670(-40, -113);
        }
        if (this.method1671(-80) == null) {
            return this.field6701 == null ? 0 : this.field6701.method875(0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)V")
    public final void method2821(boolean arg0) {
        if (arg0) {
            method2813(-63, (class134) null);
        }
        field6713++;
        if (this.field6732 == null || this.method1671(-48) == null) {
            return;
        }
        for (class97 var2 = this.field6735.method2514((byte) 61); var2 != null; var2 = this.field6735.method2511(-106)) {
            int var3 = (int) var2.field1339;
            if (var3 < 0 || this.field6704.field5714 <= var3 || this.field6704.field5717[var3] == 0) {
                var2.method625((byte) -50);
            } else {
                if (this.field6729[var3] == 0) {
                    this.method2822(var3, 1, (byte) 108);
                }
                if (this.field6729[var3] == -1) {
                    this.method2822(var3, 2, (byte) 108);
                }
                if (this.field6729[var3] == 1) {
                    var2.method625((byte) -50);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB)Ln;")
    private final class344 method2822(int arg0, int arg1, byte arg2) {
        field6724++;
        if (arg2 != 108) {
            field6719 = null;
        }
        class344 var4 = (class344) this.field6698.method2302((long) arg0, 23576);
        if (var4 != null && arg1 == 0 && !var4.field5144 && var4.field5140) {
            var4.method625((byte) -50);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field6712 == null || this.field6729[arg0] == -1) {
                    if (this.field6720.method290(arg2 - 209)) {
                        return null;
                    }
                    var4 = this.field6720.method289(this.field6705, true, 31996, arg0, (byte) 2);
                } else {
                    var4 = this.field6700.method986(arg0, 3, this.field6712);
                }
            } else if (arg1 == 1) {
                if (this.field6712 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field6700.method985(3, this.field6712, arg0);
            } else if (arg1 == 2) {
                if (this.field6712 == null) {
                    throw new RuntimeException();
                }
                if (this.field6729[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field6720.method298((byte) 46)) {
                    return null;
                }
                var4 = this.field6720.method289(this.field6705, false, 31996, arg0, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field6698.method2301(116, var4, (long) arg0);
        }
        if (var4.field5140) {
            return null;
        }
        byte[] var5 = var4.method880(0);
        if (!var4 instanceof class303) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class438.field6451.reset();
                class438.field6451.update(var5, 0, var5.length - 2);
                int var6 = (int) class438.field6451.getValue();
                if (this.field6704.field5725[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field6720.field671 = 0;
                this.field6720.field669 = 0;
            } catch (RuntimeException var12) {
                this.field6720.method291(255);
                var4.method625((byte) -50);
                if (var4.field5144 && !this.field6720.method290(arg2 ^ 0xFFFFFFF7)) {
                    class138 var7 = this.field6720.method289(this.field6705, true, 31996, arg0, (byte) 2);
                    this.field6698.method2301(118, var7, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field6704.field5723[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field6704.field5723[arg0];
            if (this.field6712 != null) {
                this.field6700.method989(this.field6712, var5, arg0, arg2 - 19123);
                if (this.field6729[arg0] != 1) {
                    this.field6699++;
                    this.field6729[arg0] = 1;
                }
            }
            if (!var4.field5144) {
                var4.method625((byte) -50);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class438.field6451.reset();
            class438.field6451.update(var5, 0, var5.length - 2);
            int var8 = (int) class438.field6451.getValue();
            if (this.field6704.field5725[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field6704.field5723[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field6729[arg0] != 1) {
                this.field6699++;
                this.field6729[arg0] = 1;
            }
            if (!var4.field5144) {
                var4.method625((byte) -50);
            }
            return var4;
        } catch (Exception var11) {
            this.field6729[arg0] = -1;
            var4.method625((byte) -50);
            if (var4.field5144 && !this.field6720.method290(arg2 ^ 0xFFFFFFF7)) {
                class138 var10 = this.field6720.method289(this.field6705, true, arg2 ^ 0x7C90, arg0, (byte) 2);
                this.field6698.method2301(arg2 ^ 0x2E, var10, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(ILuj;Luj;Lgh;Lp;IIZ)V")
    public class453(int arg0, class415 arg1, class415 arg2, class51 arg3, class164 arg4, int arg5, int arg6, boolean arg7) {
        this.field6705 = arg0;
        this.field6712 = arg1;
        if (this.field6712 == null) {
            this.field6730 = false;
        } else {
            this.field6730 = true;
            this.field6732 = new class398();
        }
        this.field6720 = arg3;
        this.field6716 = arg6;
        this.field6738 = arg7;
        this.field6700 = arg4;
        this.field6722 = arg5;
        this.field6721 = arg2;
        if (this.field6721 != null) {
            this.field6701 = this.field6700.method986(this.field6705, 3, this.field6721);
        }
    }
}
