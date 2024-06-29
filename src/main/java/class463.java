import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class463 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    private int field6691 = -1;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public int field6694 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "Z")
    public boolean field6705 = false;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    private int field6706 = -1;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public int field6714 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    private int field6708 = -1;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Z")
    public boolean field6713 = true;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public int field6716 = -1;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public int field6712 = -1;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "Z")
    public boolean field6719 = true;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public int field6711 = -1;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public int field6726 = -1;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Z")
    public boolean field6723 = true;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public int field6702 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "[Ljava/lang/String;")
    public String[] field6725 = new String[5];

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    private int field6724 = -1;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public int field6733 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    private int field6732 = -1;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public int field6731 = 0;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field6717 = 0;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public int field6689;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public int field6690;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public int field6693;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    private int field6698;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public int field6699;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    private int field6707;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    private int field6715;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public int field6721;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public int field6722;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    private int field6727;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "Liw;")
    public class212 field6728;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Lhl;")
    private class375 field6720;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Ljava/lang/String;")
    public String field6700;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "Ljava/lang/String;")
    public String field6701;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "[I")
    public int[] field6697;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 5)
    public final String method2740(int arg0, String arg1, int arg2) {
        field6718++;
        if (this.field6720 == null) {
            return arg1;
        } else if (arg2 == -16289) {
            class163 var4 = (class163) this.field6720.method2284(true, (long) arg0);
            return var4 == null ? arg1 : var4.field2461;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lwn;B)V", line = 30)
    public final void method2741(class519 arg0, byte arg1) {
        field6703++;
        while (true) {
            int var3 = arg0.method3072((byte) -123);
            if (var3 == 0) {
                if (arg1 < 118) {
                    this.method2740(-83, null, 102);
                    return;
                } else {
                    return;
                }
            }
            this.method2746(var3, -59, arg0);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 56)
    public final void method2742(int arg0) {
        if (this.field6697 != null) {
            for (int var2 = 0; var2 < this.field6697.length; var2 += 2) {
                if (this.field6694 > this.field6697[var2]) {
                    this.field6694 = this.field6697[var2];
                } else if (this.field6714 < this.field6697[var2]) {
                    this.field6714 = this.field6697[var2];
                }
                if (this.field6702 > this.field6697[var2 + 1]) {
                    this.field6702 = this.field6697[var2 + 1];
                } else if (this.field6733 < this.field6697[var2 + 1]) {
                    this.field6733 = this.field6697[var2 + 1];
                }
            }
        }
        field6729++;
        if (arg0 != -1226) {
            this.method2747(null, (byte) -17, true);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljc;B)Z", line = 98)
    public final boolean method2743(class310 arg0, byte arg1) {
        if (arg1 != -124) {
            method2749(-34, -13, 2);
        }
        field6709++;
        int var3;
        if (this.field6706 == -1) {
            if (this.field6708 == -1) {
                return true;
            }
            var3 = arg0.method1958(this.field6708, arg1 ^ 0xFFFFFF84);
        } else {
            var3 = arg0.method1961(-6019, this.field6706);
        }
        if (var3 < this.field6707 || var3 > this.field6727) {
            return false;
        }
        boolean var4 = false;
        int var5;
        if (this.field6691 == -1) {
            if (this.field6724 == -1) {
                return true;
            }
            var5 = arg0.method1958(this.field6724, 0);
        } else {
            var5 = arg0.method1961(-6019, this.field6691);
        }
        return this.field6698 <= var5 && var5 <= this.field6715;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 137)
    public static final void method2744(int arg0) {
        field6730++;
        for (class50 var1 = (class50) class515.field7469.method863(arg0); var1 != null; var1 = (class50) class515.field7469.method865(-1)) {
            if (var1.field916 == -1) {
                var1.field928 = 0;
                if (var1.field924 >= 0 && var1.field919 >= 0 && var1.field924 < class69.field1139 && class255.field3763 > var1.field919) {
                    class313.method1989(arg0 + 71, var1);
                }
            } else {
                var1.method421(arg0 + 22072);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I", line = 162)
    public final int method2745(int arg0, int arg1, int arg2) {
        field6704++;
        if (this.field6720 == null) {
            return arg0;
        }
        class175 var4 = (class175) this.field6720.method2284(true, (long) arg1);
        if (var4 == null) {
            return arg0;
        } else {
            int var5 = -33 / ((79 - arg2) / 44);
            return var4.field2612;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILwn;)V", line = 182)
    private final void method2746(int arg0, int arg1, class519 arg2) {
        if (arg1 > -55) {
            this.field6722 = -26;
        }
        field6710++;
        if (arg0 == 1) {
            this.field6711 = arg2.method3018(566990904);
        } else if (arg0 == 2) {
            this.field6716 = arg2.method3018(566990904);
        } else if (arg0 == 3) {
            this.field6700 = arg2.method3082((byte) 76);
        } else if (arg0 == 4) {
            this.field6721 = arg2.method3040((byte) -3);
        } else if (arg0 == 5) {
            this.field6726 = arg2.method3040((byte) -3);
            return;
        } else if (arg0 == 6) {
            this.field6731 = arg2.method3072((byte) -119);
            return;
        } else if (arg0 == 7) {
            int var12 = arg2.method3072((byte) -119);
            if ((var12 & 0x1) == 0) {
                this.field6719 = false;
            }
            if ((var12 & 0x2) == 2) {
                this.field6705 = true;
                return;
            }
        } else if (arg0 == 8) {
            this.field6713 = arg2.method3072((byte) -124) == 1;
            return;
        } else if (arg0 == 9) {
            this.field6708 = arg2.method3018(566990904);
            if (this.field6708 == 65535) {
                this.field6708 = -1;
            }
            this.field6706 = arg2.method3018(566990904);
            if (this.field6706 == 65535) {
                this.field6706 = -1;
            }
            this.field6707 = arg2.method3053(-129);
            this.field6727 = arg2.method3053(-129);
            return;
        } else if (arg0 < 10 || arg0 > 14) {
            if (arg0 != 15) {
                if (arg0 == 16) {
                    this.field6723 = false;
                    return;
                }
                if (arg0 == 17) {
                    this.field6701 = arg2.method3082((byte) 78);
                    return;
                }
                if (arg0 == 18) {
                    this.field6732 = arg2.method3018(566990904);
                    return;
                }
                if (arg0 != 19) {
                    if (arg0 != 20) {
                        if (arg0 != 21) {
                            if (arg0 == 22) {
                                this.field6690 = arg2.method3053(-129);
                            } else if (arg0 == 249) {
                                int var6 = arg2.method3072((byte) -120);
                                if (this.field6720 == null) {
                                    int var7 = class487.method2869(1366891568, var6);
                                    this.field6720 = new class375(var7);
                                }
                                for (int var8 = 0; var8 < var6; var8++) {
                                    boolean var9 = arg2.method3072((byte) -127) == 1;
                                    int var10 = arg2.method3040((byte) -3);
                                    class42 var11;
                                    if (var9) {
                                        var11 = new class163(arg2.method3082((byte) 66));
                                    } else {
                                        var11 = new class175(arg2.method3053(-129));
                                    }
                                    this.field6720.method2292((long) var10, var11, (byte) -127);
                                }
                                return;
                            }
                            return;
                        }
                        this.field6693 = arg2.method3053(-129);
                        return;
                    }
                    this.field6724 = arg2.method3018(566990904);
                    if (this.field6724 == 65535) {
                        this.field6724 = -1;
                    }
                    this.field6691 = arg2.method3018(566990904);
                    if (this.field6691 == 65535) {
                        this.field6691 = -1;
                    }
                    this.field6698 = arg2.method3053(-129);
                    this.field6715 = arg2.method3053(-129);
                    return;
                }
                this.field6712 = arg2.method3018(566990904);
                return;
            }
            int var4 = arg2.method3072((byte) -128);
            this.field6697 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field6697[var5] = arg2.method3044((byte) -85);
            }
            this.field6689 = arg2.method3053(-129);
            this.field6722 = arg2.method3053(-129);
            return;
        } else {
            this.field6725[arg0 - 10] = arg2.method3082((byte) 83);
            return;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqa;BZ)Laa;", line = 347)
    public final class343 method2747(class167 arg0, byte arg1, boolean arg2) {
        int var4 = -24 % ((arg1 - 41) / 53);
        field6692++;
        int var5 = arg2 ? this.field6716 : this.field6711;
        int var6 = arg0.field2503 << 29 | var5;
        class343 var7 = (class343) this.field6728.field3202.method2982(0, (long) var6);
        if (var7 != null) {
            return var7;
        } else if (this.field6728.field3190.method2035(var5, (byte) -94)) {
            class104 var8 = class104.method767(this.field6728.field3190, var5, 0);
            if (var8 != null) {
                var7 = arg0.method308(var8, true);
                this.field6728.field3202.method2981(var7, 80, (long) var6);
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lqa;I)Laa;", line = 392)
    public final class343 method2748(class167 arg0, int arg1) {
        field6695++;
        class343 var3 = (class343) this.field6728.field3202.method2982(arg1 + 10795, (long) (arg0.field2503 << 29 | 0x20000 | this.field6732));
        if (var3 != null) {
            return var3;
        }
        this.field6728.field3190.method2035(this.field6732, (byte) -94);
        class104 var4 = class104.method767(this.field6728.field3190, this.field6732, 0);
        if (arg1 != -10795) {
            return null;
        }
        if (var4 != null) {
            var3 = arg0.method308(var4, true);
            this.field6728.field3202.method2981(var3, 56, (long) (this.field6732 | 0x20000 | arg0.field2503 << 29));
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)Z", line = 422)
    public static final boolean method2749(int arg0, int arg1, int arg2) {
        field6696++;
        if (arg2 <= 64) {
            method2749(115, -51, 4);
        }
        return (arg0 & 0x21) != 0;
    }
}
