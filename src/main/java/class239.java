import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class239 extends class375 {

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "Z")
    public boolean field3730 = true;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public static int field3735 = 0;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    public static int field3747 = 100;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "Luc;")
    public static class27 field3742 = new class27("", 10);

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "Lnba;")
    public static class268 field3748 = new class268();

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "Lwv;")
    public class32 field3733;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "[I")
    private int[] field3739;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "[I")
    public int[] field3745;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field3734;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "[[I")
    private int[][] field3740;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
    public static final void method1627(int arg0, int arg1, int arg2) {
        class40 var3 = class153.field2210[arg0][arg1][arg2];
        if (var3 != null) {
            class300.method1929(var3.field663);
            if (var3.field663 != null) {
                var3.field663 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIILet;)V")
    public static final void method1628(int arg0, int arg1, int arg2, int arg3, class550 arg4) {
        if (arg0 < 101) {
            method1637(-57, 66, 67, -118);
        }
        field3736++;
        for (class28 var5 = (class28) class436.field6382.method472((byte) -96); var5 != null; var5 = (class28) class436.field6382.method482(-121)) {
            if (var5.field426 == arg2 && (arg1 << 9) == var5.field409 && (arg3 << 9) == var5.field416 && var5.field423.field7783 == arg4.field7783) {
                if (var5.field430 != null) {
                    class627.field8780.method2114(var5.field430);
                    var5.field430 = null;
                }
                if (var5.field411 != null) {
                    class627.field8780.method2114(var5.field411);
                    var5.field411 = null;
                }
                var5.method3678(-1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method1629(int arg0) {
        if (arg0 != -9598) {
            return null;
        }
        field3741++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3734 == null) {
            return "";
        }
        var2.append(this.field3734[0]);
        for (int var3 = 1; var3 < this.field3734.length; var3++) {
            var2.append("...");
            var2.append(this.field3734[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILmo;)V")
    public final void method1630(int arg0, class695 arg1) {
        if (arg0 != 0) {
            this.method1638(null, -75, (byte) -78);
        }
        while (true) {
            int var3 = arg1.method3826(false);
            if (var3 == 0) {
                field3743++;
                return;
            }
            this.method1638(arg1, var3, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(ILmo;)Ljava/lang/String;")
    public final String method1631(int arg0, class695 arg1) {
        if (arg0 != -25808) {
            this.field3730 = false;
        }
        field3729++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field3739 != null) {
            for (int var4 = 0; var4 < this.field3739.length; var4++) {
                var3.append(this.field3734[var4]);
                var3.append(this.field3733.method355((byte) 71, this.field3740[var4], arg1.method3817(8, class479.method2803(this.field3739[var4], (byte) 123).field86), this.method1639(var4, 1)));
            }
        }
        var3.append(this.field3734[this.field3734.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    public static void method1632(int arg0) {
        if (arg0 == 0) {
            field3748 = null;
            field3742 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)I")
    public final int method1633(int arg0, int arg1, int arg2) {
        field3744++;
        if (this.field3739 == null || arg2 < 0 || this.field3739.length < arg2) {
            return -1;
        } else {
            if (arg1 > -72) {
                this.method1633(-116, -22, -19);
            }
            return this.field3740[arg2] == null || arg0 < 0 || this.field3740[arg2].length < arg0 ? -1 : this.field3740[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
    public final void method1634(int arg0) {
        if (arg0 != 1) {
            this.method1636(-117);
        }
        if (this.field3745 != null) {
            for (int var2 = 0; var2 < this.field3745.length; var2++) {
                this.field3745[var2] = class486.method2826(this.field3745[var2], 32768);
            }
        }
        field3731++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([ILmo;B)V")
    public final void method1635(int[] arg0, class695 arg1, byte arg2) {
        field3738++;
        if (this.field3739 == null) {
            return;
        }
        if (arg2 != -51) {
            this.method1639(-37, 50);
        }
        for (int var4 = 0; var4 < this.field3739.length; var4++) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = this.method1639(var4, 1).field90;
            if (var5 > 0) {
                arg1.method3846((long) arg0[var4], var5, (byte) 7);
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)I")
    public final int method1636(int arg0) {
        if (arg0 != 9702) {
            this.field3734 = null;
        }
        field3732++;
        return this.field3739 == null ? 0 : this.field3739.length;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)I")
    public static final int method1637(int arg0, int arg1, int arg2, int arg3) {
        field3737++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (arg1 < 0) {
            return -46;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lmo;IB)V")
    private final void method1638(class695 arg0, int arg1, byte arg2) {
        field3728++;
        if (arg2 != 124) {
            return;
        }
        if (arg1 == 1) {
            this.field3734 = class208.method1377('<', (byte) -107, arg0.method3836(false));
        } else if (arg1 == 2) {
            int var9 = arg0.method3826(false);
            this.field3745 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3745[var10] = arg0.method3847((byte) 118);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method3826(false);
            this.field3740 = new int[var4][];
            this.field3739 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method3847((byte) 118);
                class9 var7 = class479.method2803(var6, (byte) 120);
                if (var7 != null) {
                    this.field3739[var5] = var6;
                    this.field3740[var5] = new int[var7.field92];
                    for (int var8 = 0; var8 < var7.field92; var8++) {
                        this.field3740[var5][var8] = arg0.method3847((byte) 118);
                    }
                }
            }
            return;
        } else if (arg1 == 4) {
            this.field3730 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lff;")
    public final class9 method1639(int arg0, int arg1) {
        field3746++;
        if (this.field3739 == null || arg0 < 0 || arg0 > this.field3739.length) {
            return null;
        } else {
            if (arg1 != 1) {
                this.field3740 = null;
            }
            return class479.method2803(this.field3739[arg0], (byte) 114);
        }
    }
}
