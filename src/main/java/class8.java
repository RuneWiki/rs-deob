import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class class8 extends class202 {

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "Z")
    public boolean field115;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "[Lrj;")
    public class8[] field111;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field107 = 0;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field112 = 0;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "Lsb;")
    public class225 field110;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Lfb;")
    public class29 field93;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V")
    public static final void method56(int arg0) {
        if (arg0 < 15) {
            return;
        }
        while (class67.field1103.method537(8, class115.field1912) >= 11) {
            int var1 = class67.field1103.method540(11, 882786883);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class35.field548[var1] == null) {
                var2 = true;
                class35.field548[var1] = new class33();
                if (class16.field265[var1] != null) {
                    class35.field548[var1].method285(class16.field265[var1], (byte) -99);
                }
            }
            class57.field973[class155.field2514++] = var1;
            class33 var3 = class35.field548[var1];
            var3.field3376 = class222.field3682;
            int var4 = class67.field1103.method540(1, 882786883);
            int var5 = class67.field1103.method540(5, 882786883);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class67.field1103.method540(1, 882786883);
            if (var6 == 1) {
                class106.field1701[class43.field802++] = var1;
            }
            int var7 = class199.field3184[class67.field1103.method540(3, 882786883)];
            if (var2) {
                var3.field3322 = var3.field3320 = var7;
            }
            int var8 = class67.field1103.method540(5, 882786883);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method279(class167.field2655.field3340[0] + var5, class167.field2655.field3321[0] + var8, false, var4 == 1);
        }
        class67.field1103.method539(111);
        field102++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZBILf;I)V")
    public static final void method57(boolean arg0, byte arg1, int arg2, class36 arg3, int arg4) {
        field101++;
        int var5 = arg3.field642;
        if (arg3.field660 == 0) {
            arg3.field642 = arg3.field711;
        } else if (arg3.field660 == 1) {
            arg3.field642 = arg4 - arg3.field711;
        } else if (arg3.field660 == 2) {
            arg3.field642 = arg3.field711 * arg4 >> 14;
        } else if (arg3.field660 == 3) {
            if (arg3.field709 == 2) {
                arg3.field642 = (arg3.field711 - 1) * arg3.field653 + arg3.field711 * 32;
            } else if (arg3.field709 == 7) {
                arg3.field642 = (arg3.field711 - 1) * arg3.field653 + arg3.field711 * 115;
            }
        }
        int var6 = arg3.field676;
        if (arg3.field601 == 0) {
            arg3.field676 = arg3.field556;
        } else if (arg3.field601 == 1) {
            arg3.field676 = arg2 - arg3.field556;
        } else if (arg3.field601 == 2) {
            arg3.field676 = arg3.field556 * arg2 >> 14;
        } else if (arg3.field601 == 3) {
            if (arg3.field709 == 2) {
                arg3.field676 = (arg3.field556 - 1) * arg3.field641 + arg3.field556 * 32;
            } else if (arg3.field709 == 7) {
                arg3.field676 = (arg3.field556 - 1) * arg3.field641 + arg3.field556 * 12;
            }
        }
        if (arg3.field660 == 4) {
            arg3.field642 = arg3.field676 * arg3.field578 / arg3.field568;
        }
        if (arg3.field601 == 4) {
            arg3.field676 = arg3.field642 * arg3.field568 / arg3.field578;
        }
        int var7 = 38 / ((arg1 + 1) / 63);
        if (class103.field1675 && (client.method1093(arg3).field1313 != 0 || arg3.field709 == 0)) {
            if (arg3.field676 < 5 && arg3.field642 < 5) {
                arg3.field676 = 5;
                arg3.field642 = 5;
            } else {
                if (arg3.field676 <= 0) {
                    arg3.field676 = 5;
                }
                if (arg3.field642 <= 0) {
                    arg3.field642 = 5;
                }
            }
        }
        if (arg3.field570 == 1337) {
            class277.field4360 = arg3;
        }
        if (arg0 && arg3.field609 != null && arg3.field642 != var5 || arg3.field676 != var6) {
            class213 var8 = new class213();
            var8.field3477 = arg3.field609;
            var8.field3480 = arg3;
            class182.field2860.method855(false, var8);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)I")
    public int method58(byte arg0) {
        if (arg0 == 112) {
            field113++;
            return -1;
        } else {
            return -60;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public void method59(byte arg0) {
        field98++;
        if (this.field115) {
            this.field110.method1584((byte) 126);
            this.field110 = null;
        } else {
            this.field93.method250(45);
            this.field93 = null;
        }
        if (arg0 > -73) {
            field105 = -5;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)[[I")
    public final int[][] method60(int arg0, int arg1, int arg2) {
        if (arg2 <= 89) {
            this.method44(-78, -49);
        }
        field109++;
        if (!this.field111[arg1].field115) {
            return this.field111[arg1].method65(arg0, (byte) -104);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field111[arg1].method44(3, arg0);
        var4[1] = var5;
        var4[0] = var5;
        var4[2] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)[I")
    public int[] method44(int arg0, int arg1) {
        if (arg0 != 3) {
            this.method59((byte) 55);
        }
        field99++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)[I")
    public final int[] method61(int arg0, int arg1, int arg2) {
        field96++;
        int var4 = 4 / ((arg1 - 70) / 50);
        return this.field111[arg2].field115 ? this.field111[arg2].method44(3, arg0) : this.field111[arg2].method65(arg0, (byte) 125)[0];
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BII)V")
    public final void method62(byte arg0, int arg1, int arg2) {
        if (arg0 != 19) {
            return;
        }
        int var4 = this.field114 == 255 ? arg1 : this.field114;
        if (this.field115) {
            this.field110 = new class225(var4, arg1, arg2);
        } else {
            this.field93 = new class29(var4, arg1, arg2);
        }
        field95++;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)I")
    public int method63(byte arg0) {
        field106++;
        int var2 = 48 % ((57 - arg0) / 49);
        return -1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLog;I)V")
    public void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 >= 62) {
            field116++;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[[I")
    public int[][] method65(int arg0, byte arg1) {
        field103++;
        int var3 = 74 / ((-arg1 - 48) / 46);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(Z)V")
    public void method66(boolean arg0) {
        if (arg0) {
            method57(true, (byte) 97, 64, (class36) null, -70);
        }
        field108++;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IZ)V")
    public class8(int arg0, boolean arg1) {
        this.field115 = arg1;
        this.field111 = new class8[arg0];
    }
}
