import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class121 {

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    private int field1787 = 0;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    private int field1795 = -1;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Lda;")
    private class212 field1786 = new class212();

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "Z")
    public boolean field1798 = false;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    private int field1793;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "[[I")
    private int[][] field1794;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    private int field1790;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "[Lef;")
    private class259[] field1785;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lok;")
    public static class41 field1788 = class137.method956(": ", 45);

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field1796 = 0;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Lok;")
    public static class41 field1799 = class137.method956(" <col=ffffff>", 45);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)[[I", line = 8)
    public final int[][] method860(int arg0) {
        field1791++;
        if (this.field1793 != this.field1790) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field1793; var2++) {
            this.field1785[var2] = class122.field1807;
        }
        return this.field1794;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 33)
    public static void method861(int arg0) {
        field1799 = null;
        if (arg0 != -2) {
            field1788 = (class41) null;
        }
        field1788 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V", line = 49)
    public static final void method862(int arg0, int arg1) {
        if (arg1 == -1 && !class265.field4193) {
            class127.method892(1);
        } else if (arg1 != -1 && (class237.field3805 != arg1 || !class235.method1694((byte) -88)) && class244.field3900 != 0 && !class265.field4193) {
            class234.method1689(0, arg1, 2, class294.field4763, false, (byte) 75, class244.field3900);
        }
        int var2 = -49 % ((-arg0 - 43) / 55);
        class237.field3805 = arg1;
        field1797++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)[I", line = 85)
    public final int[] method863(byte arg0, int arg1) {
        if (arg0 != 34) {
            this.method863((byte) 62, -31);
        }
        field1783++;
        if (this.field1793 == this.field1790) {
            this.field1798 = this.field1785[arg1] == null;
            this.field1785[arg1] = class122.field1807;
            return this.field1794[arg1];
        } else if (this.field1793 == 1) {
            this.field1798 = this.field1795 != arg1;
            this.field1795 = arg1;
            return this.field1794[0];
        } else {
            class259 var3 = this.field1785[arg1];
            if (var3 == null) {
                this.field1798 = true;
                if (this.field1793 <= this.field1787) {
                    class259 var4 = (class259) this.field1786.method1504((byte) 80);
                    var3 = new class259(arg1, var4.field4138);
                    this.field1785[var4.field4134] = null;
                    var4.method418(6971);
                } else {
                    var3 = new class259(arg1, this.field1787);
                    this.field1787++;
                }
                this.field1785[arg1] = var3;
            } else {
                this.field1798 = false;
            }
            this.field1786.method1498(var3, (byte) 60);
            return this.field1794[var3.field4138];
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(III)V", line = 392)
    public class121(int arg0, int arg1, int arg2) {
        this.field1793 = arg0;
        this.field1794 = new int[this.field1793][arg2];
        this.field1790 = arg1;
        this.field1785 = new class259[this.field1790];
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 159)
    public final void method864(byte arg0) {
        for (int var2 = 0; var2 < this.field1793; var2++) {
            this.field1794[var2] = null;
        }
        if (arg0 != -8) {
            field1799 = (class41) null;
        }
        this.field1794 = (int[][]) null;
        this.field1785 = null;
        this.field1786.method1499(arg0 ^ 0xF1C);
        field1784++;
        this.field1786 = null;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V", line = 198)
    public static final void method865(int arg0) {
        field1789++;
        if (class32.field479 == 0) {
            return;
        }
        try {
            if ((++class130.field1947) > 2000) {
                if (class118.field1724 != null) {
                    class118.field1724.method1570((byte) 55);
                    class118.field1724 = null;
                }
                if (class167.field2656 >= 1) {
                    class32.field479 = 0;
                    class32.field471 = -5;
                    return;
                }
                class130.field1947 = 0;
                class32.field479 = 1;
                class167.field2656++;
                if (class234.field3737 == class2.field32) {
                    class2.field32 = class63.field928;
                } else {
                    class2.field32 = class234.field3737;
                }
            }
            if (class32.field479 == 1) {
                class278.field4550 = class138.field2065.method1483(-14479, class177.field2872, class2.field32);
                class32.field479 = 2;
            }
            if (class32.field479 == 2) {
                if (class278.field4550.field2948 == 2) {
                    throw new IOException();
                }
                if (class278.field4550.field2948 != 1) {
                    return;
                }
                class118.field1724 = new class218((Socket) class278.field4550.field2945, class138.field2065);
                class278.field4550 = null;
                class118.field1724.method1572(65, class285.field4642.field1640, 0, class285.field4642.field1607);
                if (class20.field313 != null) {
                    class20.field313.method243((byte) 103);
                }
                if (class77.field1145 != null) {
                    class77.field1145.method243((byte) 107);
                }
                int var1 = class118.field1724.method1567(-15806);
                if (class20.field313 != null) {
                    class20.field313.method243((byte) 123);
                }
                if (class77.field1145 != null) {
                    class77.field1145.method243((byte) 104);
                }
                if (var1 != 21) {
                    class32.field479 = 0;
                    class32.field471 = var1;
                    class118.field1724.method1570((byte) 7);
                    class118.field1724 = null;
                    return;
                }
                class32.field479 = 3;
            }
            if (class32.field479 == 3) {
                if (class118.field1724.method1571(-91) < 1) {
                    return;
                }
                class132.field1974 = new class41[class118.field1724.method1567(-15806)];
                class32.field479 = 4;
            }
            if (class32.field479 == 4) {
                if (class118.field1724.method1571(7) < class132.field1974.length * 8) {
                    return;
                }
                class164.field2597.field1640 = 0;
                class118.field1724.method1575(class132.field1974.length * 8, arg0 ^ 0x44D5, 0, class164.field2597.field1607);
                for (int var2 = 0; var2 < class132.field1974.length; var2++) {
                    class132.field1974[var2] = class235.method1690(class164.field2597.method768((byte) 92), (byte) 127);
                }
                class32.field479 = 0;
                class32.field471 = 21;
                class118.field1724.method1570((byte) 126);
                class118.field1724 = null;
                return;
            }
            if (arg0 != 31803) {
                field1788 = (class41) null;
            }
        } catch (IOException var4) {
            if (class118.field1724 != null) {
                class118.field1724.method1570((byte) 58);
                class118.field1724 = null;
            }
            if (class167.field2656 < 1) {
                class167.field2656++;
                class130.field1947 = 0;
                class32.field479 = 1;
                if (class234.field3737 == class2.field32) {
                    class2.field32 = class63.field928;
                } else {
                    class2.field32 = class234.field3737;
                }
            } else {
                class32.field471 = -4;
                class32.field479 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(FIIBIIZII)[[I", line = 359)
    public static final int[][] method866(float arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field1792++;
        int[][] var9 = new int[arg1][arg5];
        class201 var10 = new class201();
        var10.field3221 = arg2;
        var10.field3209 = arg6;
        var10.field3218 = arg8;
        var10.field3219 = arg7;
        var10.field3230 = (int) (arg0 * 4096.0F);
        var10.method31(-31851);
        class306.method2112(-110, arg5, arg1);
        for (int var11 = 0; var11 < arg1; var11++) {
            var10.method1426(var11, var9[var11], 116);
        }
        int var12 = -116 / ((arg3 + 9) / 50);
        return var9;
    }
}
