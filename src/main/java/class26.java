import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class26 {

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[I")
    public static int[] field429 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[[B")
    public static byte[][] field427;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method130(int arg0) {
        field427 = null;
        field429 = null;
        if (arg0 < 26) {
            field427 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
    public abstract void method100(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIB)V")
    public abstract void method106(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Lub;")
    public static final class227 method131(int arg0, int arg1) {
        field430++;
        class227 var2 = class204.method1303(arg0, 1);
        int var3 = var2.method1521((byte) 86) - 3;
        int var4 = 8 % ((arg1 - 33) / 51);
        while (var3 > 0) {
            var2 = class76.method445((byte) 40, new class227[] { var2.method1532((byte) 56, 0, var3), class20.field338, var2.method1517((byte) 126, var3) });
            var3 -= 3;
        }
        if (var2.method1521((byte) 101) > 9) {
            return class76.method445((byte) 95, new class227[] { class69.field1227, var2.method1532((byte) 87, 0, var2.method1521((byte) 100) - 8), class57.field1058, class178.field3020, var2, class218.field3670 });
        } else if (var2.method1521((byte) 100) > 6) {
            return class76.method445((byte) 75, new class227[] { class89.field1539, var2.method1532((byte) 96, 0, var2.method1521((byte) 57) - 4), class83.field1464, class178.field3020, var2, class218.field3670 });
        } else {
            return class76.method445((byte) -81, new class227[] { class191.field3254, var2, class179.field3081 });
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIB)V")
    public abstract void method103(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILja;)V")
    public static final void method132(int arg0, class4 arg1) {
        field428++;
        arg1.field82 = arg1.field61;
        if (arg1.field111 == 0) {
            arg1.field84 = 0;
            return;
        }
        if (arg1.field101 != -1 && arg1.field60 == 0) {
            class51 var2 = class25.method127(true, arg1.field101);
            if (arg1.field76 > 0 && var2.field888 == 0) {
                arg1.field84++;
                return;
            }
            if (arg1.field76 <= 0 && var2.field906 == 0) {
                arg1.field84++;
                return;
            }
        }
        int var3 = arg1.field50;
        int var4 = arg1.field78[arg1.field111 - 1] * 128 + (arg1.field45 * 64);
        int var5 = arg1.field99;
        int var6 = arg1.field49[arg1.field111 - 1] * 128 + (arg1.field45 * 64);
        if (var4 - var3 > 256 || var4 - var3 < -256 || (var6 - var5) > 256 || (var6 - var5) < -256) {
            arg1.field50 = var4;
            arg1.field99 = var6;
            return;
        }
        if (var3 < var4) {
            if (var6 > var5) {
                arg1.field94 = 1280;
            } else if (var5 <= var6) {
                arg1.field94 = 1536;
            } else {
                arg1.field94 = 1792;
            }
        } else if (var4 < var3) {
            if (var5 < var6) {
                arg1.field94 = 768;
            } else if (var5 > var6) {
                arg1.field94 = 256;
            } else {
                arg1.field94 = 512;
            }
        } else if (var5 < var6) {
            arg1.field94 = 1024;
        } else if (var6 < var5) {
            arg1.field94 = 0;
        }
        int var7 = arg1.field55;
        if (arg0 >= -64) {
            method130(-7);
        }
        int var8 = arg1.field94 - arg1.field106 & 0x7FF;
        int var9 = 4;
        boolean var10 = true;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg1.field63;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg1.field100;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg1.field64;
        }
        if (var7 == -1) {
            var7 = arg1.field63;
        }
        arg1.field82 = var7;
        if (arg1 instanceof class195) {
            var10 = ((class195) arg1).field3315.field2580;
        }
        if (var10) {
            if (arg1.field94 != arg1.field106 && arg1.field108 == -1 && arg1.field81 != 0) {
                var9 = 2;
            }
            if (arg1.field111 > 2) {
                var9 = 6;
            }
            if (arg1.field111 > 3) {
                var9 = 8;
            }
            if (arg1.field84 > 0 && arg1.field111 > 1) {
                arg1.field84--;
                var9 = 8;
            }
        } else {
            if (arg1.field111 > 1) {
                var9 = 6;
            }
            if (arg1.field111 > 2) {
                var9 = 8;
            }
            if (arg1.field84 > 0 && arg1.field111 > 1) {
                arg1.field84--;
                var9 = 8;
            }
        }
        if (arg1.field59[arg1.field111 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 < var6) {
            arg1.field99 += var9;
            if (arg1.field99 > var6) {
                arg1.field99 = var6;
            }
        } else if (var6 < var5) {
            arg1.field99 -= var9;
            if (var6 > arg1.field99) {
                arg1.field99 = var6;
            }
        }
        if (var9 >= 8 && arg1.field82 == arg1.field63 && arg1.field96 != -1) {
            arg1.field82 = arg1.field96;
        }
        if (var3 < var4) {
            arg1.field50 += var9;
            if (arg1.field50 > var4) {
                arg1.field50 = var4;
            }
        } else if (var4 < var3) {
            arg1.field50 -= var9;
            if (var4 > arg1.field50) {
                arg1.field50 = var4;
            }
        }
        if (arg1.field50 == var4 && arg1.field99 == var6) {
            if (arg1.field76 > 0) {
                arg1.field76--;
            }
            arg1.field111--;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)V")
    public static final void method133(int arg0, boolean arg1) {
        field431++;
        if (arg0 == 512) {
            class67.field1216 = arg1;
            class226.field3860 = !class34.method178(true);
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(III)V")
    public class26(int arg0, int arg1, int arg2) {
        this.field436 = arg0;
        this.field434 = arg2;
        this.field433 = arg1;
    }
}
