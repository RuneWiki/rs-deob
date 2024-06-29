import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class114 {

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Llt;")
    public static class475 field1725 = new class475("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    private int field1721;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)I")
    public final int method757(int arg0) {
        field1722++;
        return arg0 < 4 ? -33 : this.field1724 & 0x3FFF;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lsq;Z)Z")
    public static final boolean method758(class117 arg0, boolean arg1) {
        boolean var2 = class86.field1324 == class31.field335;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method784(true);
        if (arg0.field1762 < 0 || arg0.field1771 < 0 || arg0.field1770 >= class361.field5554 || arg0.field1765 >= class484.field7096) {
            return false;
        }
        for (int var6 = arg0.field1762; var6 <= arg0.field1770; var6++) {
            for (int var9 = arg0.field1771; var9 <= arg0.field1765; var9++) {
                class518 var10 = class110.method674(arg0.field1768, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field1762) {
                        var11++;
                    }
                    if (var6 < arg0.field1770) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field1771) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field1765) {
                        var11 += 2;
                    }
                    class284 var12 = class359.method2234(var11, arg0, -13659);
                    class284 var13 = var10.field7569;
                    if (var13 == null) {
                        var10.field7569 = var12;
                    } else {
                        while (var13.field4087 != null) {
                            var13 = var13.field4087;
                        }
                        var13.field4087 = var12;
                    }
                    var10.field7567 = (byte) (var10.field7567 | var11);
                    if (var2 && (class200.field2889[var6][var9] & 0xFF000000) != 0) {
                        var3 = class200.field2889[var6][var9];
                        var4 = class339.field4778[var6][var9];
                        var5 = class180.field2647[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field1762; var7 <= arg0.field1770; var7++) {
                for (int var8 = arg0.field1771; var8 <= arg0.field1765; var8++) {
                    if ((class200.field2889[var7][var8] & 0xFF000000) == 0) {
                        class200.field2889[var7][var8] = var3;
                        class339.field4778[var7][var8] = var4;
                        class180.field2647[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class377.field5758[class526.field7784++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljd;IIIII)V")
    public static final void method759(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field2259 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class9.field123[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class419 var13 = class517.field7540[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field2259; var14++) {
                            if (arg0.field2265[var14] == var13.field6301) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field2265[arg0.field2259++] = var13.field6301;
                        if (arg0.field2259 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field2259; var15 < 4; var15++) {
            arg0.field2265[var15] = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public final void method760(byte arg0) {
        int var2 = 102 / ((arg0 + 40) / 56);
        this.field1724 &= 0x3FFF;
        field1723++;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static void method761(int arg0) {
        field1725 = null;
        if (arg0 < 53) {
            method761(56);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILvg;I)I")
    public static final int method762(int arg0, class38 arg1, int arg2) {
        field1726++;
        if (arg2 != -1) {
            field1725 = null;
        }
        if (!client.method1328(arg1).method2359(arg0, (byte) -10) && arg1.field504 == null) {
            return -1;
        } else if (arg1.field474 == null || arg0 >= arg1.field474.length) {
            return -1;
        } else {
            return arg1.field474[arg0];
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)Z")
    public final boolean method763(int arg0, int arg1, int arg2, int arg3) {
        field1720++;
        int var5 = this.field1721;
        if (this.field1724 == arg2 && this.field1721 == 0) {
            return false;
        }
        if (arg0 != 2) {
            field1725 = null;
        }
        boolean var6;
        if (this.field1721 == 0) {
            if (this.field1724 < arg2 && arg2 <= (this.field1724 + arg1) || this.field1724 > arg2 && arg2 >= (this.field1724 - arg1)) {
                this.field1724 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field1721 > 0 && arg2 > this.field1724) {
            int var7 = this.field1721 * this.field1721 / (arg1 * 2);
            int var8 = this.field1724 + var7;
            if (var8 < arg2 && var8 >= this.field1724) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field1721 < 0 && arg2 < this.field1724) {
            int var9 = this.field1721 * this.field1721 / (arg1 * 2);
            int var10 = this.field1724 - var9;
            if (arg2 < var10 && var10 <= this.field1724) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field1724 >= arg2) {
                this.field1721 -= arg1;
                if (arg3 != 0 && (-arg3) > this.field1721) {
                    this.field1721 = -arg3;
                }
            } else {
                this.field1721 += arg1;
                if (arg3 != 0 && this.field1721 > arg3) {
                    this.field1721 = arg3;
                }
            }
            if (this.field1721 != var5) {
                int var11 = this.field1721 * this.field1721 / (arg1 * 2);
                if (this.field1724 < arg2) {
                    if (arg2 < (this.field1724 + var11)) {
                        this.field1721 = var5;
                    }
                } else if (arg2 < this.field1724 && (this.field1724 - var11) < arg2) {
                    this.field1721 = var5;
                }
            }
        } else if (this.field1721 > 0) {
            this.field1721 -= arg1;
            if (this.field1721 < 0) {
                this.field1721 = 0;
            }
        } else {
            this.field1721 += arg1;
            if (this.field1721 > 0) {
                this.field1721 = 0;
            }
        }
        this.field1724 += this.field1721 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)V")
    public final void method764(int arg0, byte arg1) {
        if (arg1 != 0) {
            this.field1724 = -128;
        }
        this.field1721 = 0;
        field1727++;
        this.field1724 = arg0;
    }
}
