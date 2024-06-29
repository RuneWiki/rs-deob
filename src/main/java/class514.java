import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class514 implements class516 {

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Lpda;")
    private class584 field7253;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "[Lcca;")
    private class226[] field7263;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Lqfa;")
    public static class85 field7255 = new class85(29, -2);

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "[C")
    public static char[] field7262 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "F")
    public static float field7264;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "Lr;")
    private class167 field7251;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "Z")
    private boolean field7260;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)I")
    public final int method1767(int arg0) {
        field7252++;
        if (arg0 != -4979) {
            this.method1767(-68);
        }
        int var2 = 0;
        class226[] var3 = this.field7263;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class226 var5 = var3[var4];
            if (var5 == null || var5.method1398((byte) 115)) {
                var2++;
            }
        }
        return var2 * 100 / this.field7263.length;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(JI)Z")
    public final boolean method1768(long arg0, int arg1) {
        field7254++;
        int var4 = 35 / ((arg1 - 17) / 47);
        return class525.method3074((byte) -101) >= arg0 + ((long) this.field7253.field8440);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
    public final void method1765(byte arg0) {
        int var2 = -11 % ((-arg0 - 24) / 34);
        field7258++;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
    public static void method3030(int arg0) {
        field7262 = null;
        field7255 = null;
        if (arg0 != 0) {
            field7255 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)I")
    public final int method1770(byte arg0) {
        field7261++;
        if (arg0 > -27) {
            this.field7260 = false;
        }
        return this.field7253.field8439;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BIIII)V")
    public static final void method3031(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field7259++;
        class19 var5 = class373.method2355(arg0 + 63, arg3, 4);
        if (arg0 != 64) {
            method3031((byte) -11, 110, -128, -82, 43);
        }
        var5.method432(36);
        var5.field833 = arg1;
        var5.field827 = arg4;
        var5.field829 = arg2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLqh;)Lu;")
    public static final class66 method3032(boolean arg0, class61 arg1) {
        field7256++;
        class234 var2 = class569.method3281(arg1, -1);
        int var3 = arg1.method730(-91);
        int var4 = arg1.method730(-125);
        int var5 = arg1.method723((byte) -25);
        return arg0 ? null : new class66(var2.field3490, var2.field3499, var2.field3497, var2.field3496, var2.field3492, var2.field3491, var2.field3500, var2.field3502, var2.field3498, var3, var4, var5);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZB)V")
    public final void method1763(boolean arg0, byte arg1) {
        boolean var3 = true;
        field7257++;
        if (arg1 != -91) {
            field7262 = null;
        }
        class226[] var4 = this.field7263;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class226 var6 = var4[var5];
            if (var6 != null) {
                var6.method1432(var3 || this.field7260, false);
            }
        }
        this.field7260 = false;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public final void method1766(int arg0) {
        field7250++;
        if (class623.field9017 != this.field7251) {
            this.field7260 = true;
            this.field7251 = class623.field9017;
        }
        this.field7251.method42(0);
        if (arg0 != 32363) {
            this.method1768(-19L, 118);
        }
        class226[] var2 = this.field7263;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class226 var4 = var2[var3];
            if (var4 != null) {
                var4.method1400((byte) -10);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lpda;Lsn;)V")
    public class514(class584 arg0, class585 arg1) {
        this.field7253 = arg0;
        this.field7263 = new class226[this.field7253.field8444.length];
        for (int var3 = 0; var3 < this.field7263.length; var3++) {
            this.field7263[var3] = arg1.method3348(-77, this.field7253.field8444[var3]);
        }
    }
}
