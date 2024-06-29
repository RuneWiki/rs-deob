import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class447 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    private int field6514;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public int field6517;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "Lra;")
    public static class57 field6519;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field6520;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mo", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field6521;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mo", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field6522;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "[I")
    public static int[] field6515;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2777(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILbm;Lam;ILjava/awt/Canvas;)Len;", line = 4)
    public static final class174 method2770(int arg0, int arg1, class60 arg2, class378 arg3, int arg4, Canvas arg5) {
        field6509++;
        try {
            Class var6 = Class.forName("po");
            Constructor var7 = var6.getConstructor(field6520 == null ? (field6520 = method2777("java.awt.Canvas")) : field6520, field6521 == null ? (field6521 = method2777("bm")) : field6521, Integer.TYPE, Integer.TYPE, field6522 == null ? (field6522 = method2777("am")) : field6522);
            return arg1 == 0 ? (class174) var7.newInstance(arg5, arg2, Integer.valueOf(arg4), new Integer(arg0), arg3) : null;
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 30)
    public static void method2771(int arg0) {
        field6515 = null;
        if (arg0 != 16383) {
            method2771(-32);
        }
        field6519 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V", line = 42)
    public final void method2772(boolean arg0) {
        this.field6517 &= 0x3FFF;
        field6516++;
        if (!arg0) {
            method2771(124);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIB)Z", line = 54)
    public final boolean method2773(int arg0, int arg1, int arg2, byte arg3) {
        field6518++;
        int var5 = 100 / ((arg3 - 66) / 36);
        int var6 = this.field6514;
        if (this.field6517 == arg2 && this.field6514 == 0) {
            return false;
        }
        boolean var9;
        if (this.field6514 == 0) {
            if (arg2 > this.field6517 && arg2 <= (this.field6517 + arg1) || this.field6517 > arg2 && this.field6517 - arg1 <= arg2) {
                this.field6517 = arg2;
                return false;
            }
            var9 = true;
        } else if (this.field6514 > 0 && this.field6517 < arg2) {
            int var7 = this.field6514 * this.field6514 / (arg1 * 2);
            int var8 = this.field6517 + var7;
            if (var8 < arg2 && this.field6517 <= var8) {
                var9 = true;
            } else {
                var9 = false;
            }
        } else if (this.field6514 < 0 && this.field6517 > arg2) {
            int var10 = this.field6514 * this.field6514 / (arg1 * 2);
            int var11 = this.field6517 - var10;
            if (var11 > arg2 && var11 <= this.field6517) {
                var9 = true;
            } else {
                var9 = false;
            }
        } else {
            var9 = false;
        }
        if (var9) {
            if (arg2 <= this.field6517) {
                this.field6514 -= arg1;
                if (arg0 != 0 && (-arg0) > this.field6514) {
                    this.field6514 = -arg0;
                }
            } else {
                this.field6514 += arg1;
                if (arg0 != 0 && arg0 < this.field6514) {
                    this.field6514 = arg0;
                }
            }
            if (this.field6514 != var6) {
                int var12 = this.field6514 * this.field6514 / (arg1 * 2);
                if (this.field6517 < arg2) {
                    if ((this.field6517 + var12) > arg2) {
                        this.field6514 = var6;
                    }
                } else if (this.field6517 > arg2 && arg2 > this.field6517 - var12) {
                    this.field6514 = var6;
                }
            }
        } else if (this.field6514 > 0) {
            this.field6514 -= arg1;
            if (this.field6514 < 0) {
                this.field6514 = 0;
            }
        } else {
            this.field6514 += arg1;
            if (this.field6514 > 0) {
                this.field6514 = 0;
            }
        }
        this.field6517 += this.field6514 + var6 >> 1;
        return var9;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Ljava/lang/String;", line = 190)
    public static final String method2774(int arg0, int arg1) {
        field6512++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class306.field4389 + "</col>";
        } else {
            int var2 = 69 % ((arg0 + 47) / 54);
            return "<col=00ff80>" + arg1 / 1000000 + class98.field1101 + "</col>";
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)V", line = 208)
    public final void method2775(boolean arg0, int arg1) {
        this.field6517 = arg1;
        this.field6514 = 0;
        field6511++;
        if (!arg0) {
            this.method2772(true);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)I", line = 233)
    public final int method2776(int arg0) {
        field6513++;
        int var2 = -71 % ((arg0 - 69) / 44);
        return this.field6517 & 0x3FFF;
    }
}
