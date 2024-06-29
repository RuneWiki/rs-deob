import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class371 extends class626 {

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "I")
    public int field5203 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    public int field5208 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
    public int field5210 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    public int field5202 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    public int field5201 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
    public int field5206 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
    public int field5204 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public int field5205 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "Lnd;")
    public class541 field5199;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "[I")
    public static int[] field5197;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 7)
    public static void method2327(int arg0) {
        if (arg0 != 9595) {
            field5197 = null;
        }
        field5197 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZC)Z", line = 17)
    public static final boolean method2328(boolean arg0, char arg1) {
        field5211++;
        if (arg0) {
            method2333(-6, 18, -12, -88, (byte) -20);
        }
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)Z", line = 44)
    public final boolean method2329(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2331(10, -51);
        }
        field5207++;
        if (this.field5204 <= arg1 && arg1 <= this.field5205 && arg0 >= this.field5208 && this.field5203 >= arg0) {
            return true;
        } else {
            return this.field5206 <= arg1 && arg1 <= this.field5210 && arg0 >= this.field5202 && this.field5201 >= arg0;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILrca;)I", line = 63)
    public static final int method2330(int arg0, class452 arg1) {
        field5200++;
        int var2 = arg1.method2686(-9380, 2);
        if (arg0 != -31226) {
            method2331(-84, -21);
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method2686(-9380, 5);
        } else if (var2 == 2) {
            var3 = arg1.method2686(-9380, 8);
        } else {
            var3 = arg1.method2686(-9380, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lnd;)V", line = 214)
    public class371(class541 arg0) {
        this.field5199 = arg0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V", line = 94)
    public static final void method2331(int arg0, int arg1) {
        class416 var2 = class390.field5454[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class416 var4 = class390.field5454[var3][arg0][arg1] = class390.field5454[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class217 var5 = var4.field5844; var5 != null; var5 = var5.field3091) {
                    class113 var6 = var5.field3090;
                    if (var6.field1814 == arg0 && var6.field1820 == arg1) {
                        var6.field649--;
                    }
                }
                if (var4.field5846 != null) {
                    var4.field5846.field649--;
                }
                if (var4.field5838 != null) {
                    var4.field5838.field649--;
                }
                if (var4.field5840 != null) {
                    var4.field5840.field649--;
                }
                if (var4.field5845 != null) {
                    var4.field5845.field649--;
                }
                if (var4.field5847 != null) {
                    var4.field5847.field649--;
                }
            }
        }
        if (class390.field5454[0][arg0][arg1] == null) {
            class390.field5454[0][arg0][arg1] = new class416(0);
            class390.field5454[0][arg0][arg1].field5835 = 1;
        }
        class390.field5454[0][arg0][arg1].field5834 = var2;
        class390.field5454[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Lnd;", line = 152)
    public static final class541 method2332(byte arg0) {
        field5209++;
        if (class542.field7626 == null || class628.field9024 == null) {
            return null;
        }
        class628.field9024.method2843((byte) 65, class542.field7626);
        class541 var1 = (class541) class628.field9024.method2841(1);
        int var2 = 101 % ((arg0 + 41) / 63);
        if (var1 == null) {
            return null;
        } else {
            class524 var3 = class542.field7614.method2641(var1.field7608, 127);
            return var3 != null && var3.field7432 && var3.method3108(class542.field7613, 0) ? var1 : class704.method3946((byte) -128);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIB)V", line = 179)
    public static final void method2333(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5198++;
        class694.field9762 = arg1;
        class342.field4819 = arg0;
        class464.field6683 = arg3;
        class292.field4104 = arg2;
        if (arg4 > -124) {
            field5197 = null;
        }
    }
}
