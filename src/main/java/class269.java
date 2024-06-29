import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class269 implements class113 {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lbi;")
    private class449 field3753;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lica;")
    public class621 field3755;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3754 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lxa;")
    public class468 field3757;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Loa;")
    public static class651 field3751;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)Z", line = 10)
    public static final boolean method1637(byte arg0, int arg1, int arg2) {
        field3746++;
        if (arg0 <= 32) {
            method1639(101, 37);
        }
        boolean var3 = (arg1 & 0x37) == 0 ? class271.method1648(0, arg1, arg2) : class513.method2852(false, arg2, arg1);
        return var3 | (arg2 & 0x10000) != 0 | class441.method2498(arg1, 17, arg2);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)V", line = 23)
    public void method912(boolean arg0, int arg1) {
        field3752++;
        if (arg0) {
            int var3 = this.field3755.field8233.method1358(0, this.field3757.method1025(), class641.field8619) + this.field3755.field8236;
            int var4 = this.field3755.field8238.method3790(this.field3757.method1030(), 127, class305.field4229) + this.field3755.field8237;
            this.field3757.method2637(var3, var4);
        }
        if (arg1 != -20667) {
            field3754 = -23;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 43)
    public final void method911(byte arg0) {
        if (arg0 != -13) {
            field3750 = -12;
        }
        field3749++;
        this.field3757 = class429.method2448(this.field3753, 18638, this.field3755.field8235);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Z", line = 58)
    public final boolean method913(int arg0) {
        field3747++;
        if (arg0 <= 13) {
            this.field3755 = null;
        }
        return this.field3753.method2549(this.field3755.field8235, 3015);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 72)
    public static final void method1638(int arg0) {
        field3748++;
        if (class576.field7613) {
            return;
        }
        class457.field6204 = true;
        if (class344.field4718.field5425) {
            class42.field602 = ((int) class42.field602 + 191 & 0xFFFFFF80);
        } else {
            class432.field5908 += (24.0F - class432.field5908) / 2.0F;
        }
        if (arg0 != -128) {
            method1640((byte) 124);
        }
        class576.field7613 = true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Z", line = 97)
    public static final boolean method1639(int arg0, int arg1) {
        field3745++;
        if (class569.field7567[arg0]) {
            return true;
        } else if (class169.field2611.method2548(-11693, arg0)) {
            int var2 = class169.field2611.method2527(0, arg0);
            if (arg1 == var2) {
                class569.field7567[arg0] = true;
                return true;
            }
            if (class601.field7977[arg0] == null) {
                class601.field7977[arg0] = new class625[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class601.field7977[arg0][var3] == null) {
                    byte[] var4 = class169.field2611.method2537(false, arg0, var3);
                    if (var4 != null) {
                        class625 var5 = class601.field7977[arg0][var3] = new class625();
                        var5.field8327 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method3426(arg1 - 2, new class335(var4));
                    }
                }
            }
            class569.field7567[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V", line = 155)
    public static void method1640(byte arg0) {
        field3751 = null;
        if (arg0 != -58) {
            field3750 = -68;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lbi;Lica;)V", line = 166)
    public class269(class449 arg0, class621 arg1) {
        this.field3753 = arg0;
        this.field3755 = arg1;
    }
}
