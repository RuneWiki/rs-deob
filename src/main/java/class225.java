import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class225 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Laj;")
    private class199 field3576 = new class199();

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field3583 = 0;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3579 = 0;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "[I")
    public static int[] field3589 = new int[2500];

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Ll;")
    public static class133 field3575;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Laj;")
    private class199 field3587;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Laj;", line = 7)
    public final class199 method1589(int arg0) {
        field3580++;
        if (arg0 != 0) {
            this.method1597(false);
        }
        class199 var2 = this.field3576.field2982;
        if (this.field3576 == var2) {
            this.field3587 = null;
            return null;
        } else {
            this.field3587 = var2.field2982;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V", line = 30)
    public static final void method1590(int arg0, int arg1) {
        if (arg0 != -1684255768) {
            method1598((byte) 40);
        }
        field3578++;
        class247.field3918.method2175(arg1, arg0 ^ 0x37E6D88F);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Laj;", line = 43)
    public final class199 method1591(byte arg0) {
        class199 var2 = this.field3587;
        field3588++;
        if (arg0 < 70) {
            method1598((byte) -2);
        }
        if (this.field3576 == var2) {
            this.field3587 = null;
            return null;
        } else {
            this.field3587 = var2.field2982;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 253)
    public class225() {
        this.field3576.field2979 = this.field3576;
        this.field3576.field2982 = this.field3576;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V", line = 71)
    public static final void method1592(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class267.field4166[var1] = false;
        }
        class7.field82 = -1;
        class30.field442 = 0;
        field3574++;
        class178.field2692 = 5;
        class7.field84 = arg0;
        class300.field4687 = 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BILl;ZLl;)Lv;", line = 88)
    public static final class75 method1593(byte arg0, int arg1, class133 arg2, boolean arg3, class133 arg4) {
        field3585++;
        boolean var5 = true;
        int[] var6 = arg2.method973(0, arg1);
        int var7 = 97 % ((-arg0 - 85) / 36);
        for (int var8 = 0; var8 < var6.length; var8++) {
            byte[] var9 = arg2.method968(arg1, var6[var8], 0);
            if (var9 == null) {
                var5 = false;
            } else {
                int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
                byte[] var11;
                if (arg3) {
                    var11 = arg4.method968(0, var10, 0);
                } else {
                    var11 = arg4.method968(var10, 0, 0);
                }
                if (var11 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class75(arg2, arg4, arg1, arg3);
        } catch (Exception var13) {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V", line = 142)
    public final void method1594(int arg0) {
        if (arg0 < 5) {
            method1592(9);
        }
        field3582++;
        while (true) {
            class199 var2 = this.field3576.field2982;
            if (this.field3576 == var2) {
                this.field3587 = null;
                return;
            }
            var2.method1412(0);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLaj;)V", line = 169)
    public final void method1595(boolean arg0, class199 arg1) {
        if (!arg0) {
            this.method1597(true);
        }
        if (arg1.field2979 != null) {
            arg1.method1412(0);
        }
        arg1.field2979 = this.field3576.field2979;
        field3577++;
        arg1.field2982 = this.field3576;
        arg1.field2979.field2982 = arg1;
        arg1.field2982.field2979 = arg1;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)Laj;", line = 197)
    public final class199 method1596(byte arg0) {
        int var2 = 89 % ((66 - arg0) / 36);
        field3581++;
        class199 var3 = this.field3576.field2982;
        if (this.field3576 == var3) {
            return null;
        } else {
            var3.method1412(0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)I", line = 217)
    public final int method1597(boolean arg0) {
        field3586++;
        if (!arg0) {
            this.method1589(19);
        }
        int var2 = 0;
        class199 var3 = this.field3576.field2982;
        while (this.field3576 != var3) {
            var3 = var3.field2982;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V", line = 238)
    public static void method1598(byte arg0) {
        field3589 = null;
        if (arg0 < -6) {
            field3575 = null;
        }
    }
}
