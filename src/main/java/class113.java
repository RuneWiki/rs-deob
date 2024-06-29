import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class113 extends class233 {

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    private int field1725 = -32768;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "Z")
    public boolean field1732 = false;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
    private int field1746 = 0;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    private int field1734 = -1;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    private int field1742 = 0;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public int field1723;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "Lof;")
    private class272 field1739;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "Lom;")
    public static class156 field1737 = new class156();

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field1747 = 0;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "Lbh;")
    private class18 field1733;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "Llm;")
    public static class210 field1744;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "Lf;")
    public static class329 field1743;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()I", line = 4)
    public final int method115() {
        field1731++;
        return this.field1725;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I", line = 13)
    public static final int method779(int arg0) {
        if (arg0 == 4096) {
            field1745++;
            return class265.field4064.method2187((byte) 124);
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILre;)V", line = 27)
    public static final void method780(int arg0, class263 arg1) {
        if (arg0 != 1) {
            method779(74);
        }
        field1726++;
        while (true) {
            while (arg1.field4025 < arg1.field3986.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1787(false) == 1) {
                    var4 = arg1.method1787(false);
                    var3 = arg1.method1787(false);
                    var2 = true;
                }
                int var5 = arg1.method1787(false);
                int var6 = arg1.method1787(false);
                int var7 = class111.field1719 - (var6 * 64 + -class296.field4533) - 1;
                int var8 = var5 * 64 - class292.field4439;
                if (var8 >= 0 && (var7 - 63) >= 0 && (var8 + 63) < class41.field497 && var7 < class111.field1719) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var4 * 8) && (var4 * 8 + 8) > var11 && (var3 * 8) <= var12 && var3 * 8 + 8 > var12) {
                                byte var13 = arg1.method1810((byte) 127);
                                if (var13 != 0) {
                                    if (client.field1952[var9][var10] == null) {
                                        client.field1952[var9][var10] = new byte[4096];
                                    }
                                    client.field1952[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1810((byte) 123);
                                    if (class317.field4780[var9][var10] == null) {
                                        class317.field4780[var9][var10] = new byte[4096];
                                    }
                                    class317.field4780[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1810((byte) 113);
                        if (var16 != 0) {
                            arg1.field4025++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIIJILbh;)V", line = 130)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class18 arg10) {
        class100 var13 = this.method782((byte) 113);
        field1729++;
        if (var13 != null) {
            var13.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1733);
            this.field1725 = var13.method115();
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(III)V", line = 162)
    public static final void method781(int arg0, int arg1, int arg2) {
        field1724++;
        class54.field680 = class38.field462[arg2][arg1].field2737;
        if (arg0 == 4096) {
            class152.field2283 = class38.field462[arg2][arg1].field2736;
            class243.field3641 = class38.field462[arg2][arg1].field2742;
            class280.method1958((float) class54.field680, (float) class152.field2283, (float) class243.field3641);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)Lnj;", line = 177)
    private final class100 method782(byte arg0) {
        field1736++;
        class48 var2 = class8.method31(this.field1738, (byte) -126);
        class100 var3;
        if (this.field1732) {
            var3 = var2.method331(0, true, -1, -1);
        } else {
            var3 = var2.method331(this.field1742, true, this.field1746, this.field1734);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 113) {
                field1747 = 81;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIII)V", line = 284)
    public class113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1749 = arg4;
        this.field1741 = arg6 + arg5;
        this.field1723 = arg1;
        this.field1730 = arg3;
        this.field1727 = arg2;
        this.field1738 = arg0;
        int var8 = class8.method31(this.field1738, (byte) -126).field615;
        if (var8 == -1) {
            this.field1732 = true;
        } else {
            this.field1732 = false;
            this.field1739 = class72.method468(var8, -126);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V", line = 209)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1735++;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V", line = 230)
    public static void method783(byte arg0) {
        field1743 = null;
        field1744 = null;
        if (arg0 != 94) {
            field1744 = (class210) null;
        }
        field1737 = null;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)V", line = 243)
    public final void method784(int arg0, int arg1) {
        field1728++;
        if (this.field1732) {
            return;
        }
        if (arg1 != 0) {
            this.field1723 = 92;
        }
        this.field1742 += arg0;
        while (this.field1742 > this.field1739.field4184[this.field1746]) {
            this.field1742 -= this.field1739.field4184[this.field1746];
            this.field1746++;
            if (this.field1739.field4160.length <= this.field1746) {
                this.field1732 = true;
                break;
            }
        }
    }
}
