import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class695 {

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "J")
    public long field9780;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "Lfc;")
    private class642 field9786;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "Lin;")
    public static class380 field9787 = new class380(28, 7);

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field9781;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Ld;")
    public static class103 field9782;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "[[[I")
    public static int[][][] field9788;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIZI)V", line = 6)
    public static final void method3905(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field9784++;
        int var6 = arg1 - arg5;
        int var7 = arg0 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class561.method3269(arg2, arg1, 6408, arg3, arg5);
            }
        } else if (var6 == 0) {
            class341.method2097(true, arg2, arg5, arg3, arg0);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (arg4) {
                method3907((byte) 0);
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg3;
                int var10 = arg0;
                arg3 = arg5;
                arg5 = var9;
                arg0 = arg1;
                arg1 = var10;
            }
            if (arg0 < arg3) {
                int var11 = arg3;
                int var12 = arg5;
                arg3 = arg0;
                arg0 = var11;
                arg5 = arg1;
                arg1 = var12;
            }
            int var13 = arg5;
            int var14 = arg0 - arg3;
            int var15 = arg1 - arg5;
            int var16 = -(var14 >> 1);
            int var17 = arg1 <= arg5 ? -1 : 1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg3; var19 <= arg0; var19++) {
                    var16 += var15;
                    class74.field1144[var19][var13] = arg2;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var18 = arg3; var18 <= arg0; var18++) {
                    class74.field1144[var13][var18] = arg2;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "finalize", descriptor = "()V", line = 125)
    protected final void finalize() throws Throwable {
        this.field9786.method3646(120, this.field9780);
        field9783++;
        super.finalize();
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZII[B)[B", line = 134)
    public static final byte[] method3906(boolean arg0, int arg1, int arg2, byte[] arg3) {
        field9781++;
        if (arg0) {
            field9782 = null;
        }
        byte[] var4 = new byte[arg1];
        class171.method1263(arg3, arg2, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V", line = 148)
    public static final void method3907(byte arg0) {
        field9785++;
        class622 var1 = (class622) class108.field1547.method4254((byte) 8);
        int var2 = 89 % ((45 - arg0) / 55);
        while (var1 != null) {
            if (var1.field8775.method3972(118)) {
                class523.method3073((byte) 109, var1.field8778);
            } else {
                var1.field8775.method3401(0);
                try {
                    var1.field8775.method3985(-2);
                } catch (Exception var6) {
                    class349.method2122(var6, "TV: " + var1.field8778, 1);
                    class523.method3073((byte) 120, var1.field8778);
                }
                if (!var1.field8783 && !var1.field8779) {
                    class125 var4 = var1.field8775.method3982(false);
                    if (var4 != null) {
                        class330 var5 = var4.method1084((byte) 119);
                        if (var5 != null) {
                            var5.method2008(var1.field8785, -20);
                            class234.field3399.method4221(var5);
                            var1.field8783 = true;
                        }
                    }
                }
            }
            var1 = (class622) class108.field1547.method4251(-69);
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)V", line = 205)
    public static void method3908(byte arg0) {
        field9782 = null;
        field9788 = null;
        field9787 = null;
        int var1 = -17 % ((arg0 - 60) / 32);
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lfc;J[Lfo;)V", line = 215)
    public class695(class642 arg0, long arg1, class679[] arg2) {
        this.field9780 = arg1;
        this.field9786 = arg0;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)V", line = 227)
    public static final void method3909(int arg0, int arg1, int arg2) {
        class172 var3 = class514.field7096[arg0][arg1][arg2];
        if (var3 != null) {
            class347.method2117(var3.field2595);
            if (var3.field2595 != null) {
                var3.field2595 = null;
            }
        }
    }
}
