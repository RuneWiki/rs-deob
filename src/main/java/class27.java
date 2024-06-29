import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class27 extends class316 implements class679 {

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Lmg;")
    private class134 field419;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "Lfa;")
    public static class214 field425;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V", line = 6)
    public static void method422(int arg0) {
        if (arg0 != 2) {
            field425 = null;
        }
        field425 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIILol;I)V", line = 16)
    public static final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, class260 arg5, int arg6) {
        class466.method2906(arg6, arg3, arg5.field9695, (byte) -29, arg0, arg5.field9705, arg5.field9696, arg2, arg1, arg4);
        ++field420;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V", line = 24)
    public final void method424(byte arg0, int arg1) {
        super.method424((byte) -111, this.field419.field2196 * arg1);
        ++field424;
        if (arg0 > -66) {
            field425 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)Z", line = 38)
    public final boolean method425(int arg0) {
        if (arg0 != 30899) {
            this.field419 = null;
        }
        ++field422;
        return super.method2156((byte) 51, super.field4976.field3427);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lbea;Lmg;Z)V", line = 49)
    public class27(class205 arg0, class134 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field419 = arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B[B)V", line = 57)
    public static final void method426(byte arg0, byte[] arg1) {
        if (arg0 >= -81) {
            field425 = null;
        }
        ++field428;
        class6 var2 = new class6(arg1);
        while (true) {
            int var3 = var2.method70(-9059);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class484.field7102 = var2.method67(12021);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)Lmg;", line = 88)
    public final class134 method427(int arg0) {
        ++field427;
        return arg0 != 31337 ? null : this.field419;
    }

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)[Lica;", line = 99)
    public static final class615[] method428(int arg0) {
        if (class576.field8217 == null) {
            class615[] var1 = class373.method2458(class402.field6207, arg0);
            class615[] var2 = new class615[var1.length];
            int var3 = 0;
            int var4 = class17.field282.method2086(arg0 + 32416, class497.field7259);
            label73: for (int var5 = 0; var5 < var1.length; ++var5) {
                class615 var9 = var1[var5];
                if ((~var9.field8739 >= -1 || var9.field8739 >= 24) && var9.field8738 >= 800 && ~var9.field8734 <= -601 && (var4 != 2 || var9.field8738 <= 800 && ~var9.field8734 >= -601) && (~var4 != -2 || ~var9.field8738 >= -1025 && ~var9.field8734 >= -769)) {
                    for (int var10 = 0; var3 > var10; ++var10) {
                        class615 var11 = var2[var10];
                        if (var9.field8738 == var11.field8738 && var9.field8734 == var11.field8734) {
                            if (var9.field8739 > var11.field8739) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    ++var3;
                }
            }
            class576.field8217 = new class615[var3];
            class398.method2564(var2, 0, class576.field8217, 0, var3);
            int[] var6 = new int[class576.field8217.length];
            for (int var7 = 0; class576.field8217.length > var7; ++var7) {
                class615 var8 = class576.field8217[var7];
                var6[var7] = var8.field8738 * var8.field8734;
            }
            class158.method1303(class576.field8217, 0, var6);
        }
        if (arg0 != 0) {
            field425 = null;
        }
        ++field426;
        return class576.field8217;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)I", line = 185)
    public final int method429(int arg0) {
        if (arg0 != 34962) {
            this.field419 = null;
        }
        ++field423;
        return super.method429(arg0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 207)
    public final Buffer method430(boolean arg0, byte arg1) {
        if (arg1 != -107) {
            this.method424((byte) -125, -63);
        }
        ++field429;
        return super.method2157(super.field4976.field3427, arg0, (byte) -89);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 219)
    public final void method431(int arg0) {
        ++field421;
        super.method431(arg0);
    }
}
