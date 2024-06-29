import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public abstract class class338 extends class745 {

    @OriginalMember(owner = "client!ww", name = "I", descriptor = "S")
    public short field4792;

    @OriginalMember(owner = "client!ww", name = "H", descriptor = "Ltr;")
    public static class133 field4791 = class381.method2296(-1);

    @OriginalMember(owner = "client!ww", name = "P", descriptor = "[[Ljava/lang/String;")
    public static String[][] field4799 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!ww", name = "E", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!ww", name = "F", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!ww", name = "G", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!ww", name = "J", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!ww", name = "K", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!ww", name = "L", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!ww", name = "M", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!ww", name = "N", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!ww", name = "O", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field4798;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)Lbn;", line = 5)
    public static final class517 method2065(int arg0, int arg1) {
        ++field4796;
        if (arg0 != -645087229) {
            return null;
        } else {
            class517[] var2 = class269.method1721(-2);
            for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                class517 var4 = var2[var3];
                if (~var4.field7106 == ~arg1) {
                    return var4;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(IIIIII)V", line = 35)
    public class338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4792 = (short) arg5;
        super.field10347 = arg0;
        super.field10361 = (byte) arg3;
        super.field10350 = arg2;
        super.field10358 = arg1;
        super.field10349 = (byte) arg4;
    }

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "(B)Z", line = 48)
    public final boolean method1429(byte arg0) {
        ++field4790;
        return arg0 < 123 ? true : class737.field10233[(super.field10347 >> class679.field9600) + (-class277.field3995 - -class162.field2499)][(super.field10350 >> class679.field9600) + class162.field2499 - class3.field47];
    }

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "(I)V", line = 59)
    public static void method2066(int arg0) {
        if (arg0 >= 30) {
            field4799 = null;
            field4791 = null;
            field4798 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "(Z)V", line = 73)
    public static final void method2067(boolean arg0) {
        ++field4794;
        if (!class251.method1665(-103, class141.field2306) && !class761.method4207((byte) 99, class141.field2306)) {
            int var1 = class719.field10041.field4142[0] >> 3;
            int var2 = class719.field10041.field4136[0] >> 3;
            if (var1 >= 0 && ~(class192.field2891 >> 3) < ~var1 && ~var2 <= -1 && var2 < class456.field6225 >> 3) {
                class466.method2724(var2, (byte) -42, 5000, var1);
            } else {
                class466.method2724(class456.field6225 >> 4, (byte) 105, 0, class192.field2891 >> 4);
            }
        } else {
            class466.method2724(class286.field4204 >> 12, (byte) 30, 5000, class733.field10199 >> 12);
        }
        class711.method3961(-1);
        class302.method1881(-24878);
        if (arg0) {
            method2065(-21, -13);
        }
        class673.method3769(true);
        class324.method1959((byte) -125);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BLha;)Z", line = 102)
    public final boolean method1428(byte arg0, class475 arg1) {
        if (arg0 > -88) {
            return false;
        } else {
            ++field4793;
            return class198.method1411(super.field10349, super.field10350 >> class679.field9600, super.field10347 >> class679.field9600, (byte) -80, this);
        }
    }

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "(I)[Lhl;", line = 113)
    public static final class353[] method2068(int arg0) {
        ++field4789;
        if (arg0 != -65) {
            method2066(-59);
        }
        return new class353[] { class774.field10651, class116.field1982, class104.field1515, class645.field9175, class614.field8711, class119.field2042, class458.field6261, class568.field7901, class443.field6134, class243.field3479 };
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZB)I", line = 124)
    public static final int method2069(int arg0, int arg1, boolean arg2, byte arg3) {
        ++field4795;
        if (arg3 <= 0) {
            field4799 = null;
        }
        class393 var4 = class275.method1745(arg2, (byte) -61, arg1);
        if (var4 == null) {
            return 0;
        } else {
            return arg0 >= 0 && arg0 < var4.field5460.length ? var4.field5460[arg0] : 0;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I[Lmfa;)I", line = 146)
    public final int method1424(int arg0, class217[] arg1) {
        ++field4788;
        int var3 = super.field10347 >> class679.field9600;
        int var4 = super.field10350 >> class679.field9600;
        int var5 = 0;
        if (class277.field3995 == var3) {
            ++var5;
        } else if (var3 > class277.field3995) {
            var5 += 2;
        }
        if (class3.field47 == var4) {
            var5 += 3;
        } else if (var4 < class3.field47) {
            var5 += 6;
        }
        int var6 = class29.field309[var5];
        if (~(var6 & this.field4792) != -1) {
            return this.method4113(arg1, var4, (byte) 122, var3);
        } else if (~this.field4792 == -2 && ~var3 < -1) {
            return this.method4113(arg1, var4, (byte) 122, var3 + -1);
        } else if (~this.field4792 == -5 && class42.field520 >= var3) {
            return this.method4113(arg1, var4, (byte) 122, var3 + 1);
        } else if (this.field4792 == 8 && var4 > 0) {
            return this.method4113(arg1, var4 - 1, (byte) 122, var3);
        } else if (this.field4792 == 2 && var4 <= class681.field9665) {
            return this.method4113(arg1, var4 + 1, (byte) 122, var3);
        } else if (~this.field4792 == -17 && ~var3 < -1 && ~class681.field9665 <= ~var4) {
            return this.method4113(arg1, var4 + 1, (byte) 122, var3 + -1);
        } else if (~this.field4792 == -33 && var3 <= class42.field520 && ~class681.field9665 <= ~var4) {
            return this.method4113(arg1, var4 + 1, (byte) 122, var3 + 1);
        } else if (this.field4792 == 128 && ~var3 < -1 && ~var4 < -1) {
            return this.method4113(arg1, var4 + -1, (byte) 122, var3 + -1);
        } else {
            if (arg0 != 4) {
                field4799 = null;
            }
            if (~this.field4792 == -65 && class42.field520 >= var3 && var4 > 0) {
                return this.method4113(arg1, var4 + -1, (byte) 122, var3 + 1);
            } else {
                throw new RuntimeException("");
            }
        }
    }
}
