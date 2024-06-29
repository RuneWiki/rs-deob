import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class632 extends class366 {

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field8849 = 0;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "[Lio;")
    public static class401[] field8852;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
    public static void method3512(int arg0) {
        if (arg0 == -24199) {
            field8852 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIZB)V")
    public final void method1228(int arg0, int arg1, boolean arg2, byte arg3) {
        if (arg3 != -68) {
            method3512(28);
        }
        ++field8853;
        int var5 = class514.field7031 * super.field5206.field1113 / 100;
        class630.field8790.method472(arg0, arg1 + 2, var5, super.field5206.field1109 - 2, ((class651) super.field5206).field9214, 0);
        class630.field8790.method472(arg0 + var5, arg1 + 2, super.field5206.field1113 - var5, super.field5206.field1109 - 2, 0, 0);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIZI)V")
    public final void method1227(int arg0, int arg1, boolean arg2, int arg3) {
        class630.field8790.method399(arg1 + -2, arg0, super.field5206.field1113 + 4, super.field5206.field1109 + 2, ((class651) super.field5206).field9212, 0);
        if (arg3 != 63) {
            method3513((String) null, (byte[]) null, false, 21);
        }
        ++field8850;
        class630.field8790.method399(arg1 - 1, arg0 + 1, super.field5206.field1113 + 2, super.field5206.field1109, 0, 0);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/String;[BZI)I")
    public static final int method3513(String arg0, byte[] arg1, boolean arg2, int arg3) {
        ++field8854;
        int var4 = arg0.length();
        int var5 = arg3;
        if (!arg2) {
            field8849 = -17;
        }
        for (int var6 = 0; var4 > var6; ++var6) {
            char var7 = arg0.charAt(var6);
            if (~var7 >= -128) {
                arg1[var5++] = (byte) var7;
            } else if (var7 > 2047) {
                arg1[var5++] = (byte) (class266.method1624(919972, var7) >> 12);
                arg1[var5++] = (byte) class266.method1624(128, class249.method1537(63, var7 >> 6));
                arg1[var5++] = (byte) class266.method1624(class249.method1537(var7, 63), 128);
            } else {
                arg1[var5++] = (byte) class266.method1624(192, var7 >> 6);
                arg1[var5++] = (byte) class266.method1624(class249.method1537(var7, 63), 128);
            }
        }
        return -arg3 + var5;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)Z")
    public final boolean method104(byte arg0) {
        if (arg0 < 18) {
            this.method108(69);
        }
        ++field8855;
        return true;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lki;)V")
    public class632(class651 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZLtt;)[Ll;")
    public static final class18[] method3514(boolean arg0, class79 arg1) {
        ++field8851;
        if (!arg1.method631(5631)) {
            return new class18[0];
        } else {
            class260 var2 = arg1.method619(30795);
            while (var2.field3702 == 0) {
                class419.method2390(29, 10L);
            }
            if (var2.field3702 == 2) {
                return new class18[0];
            } else {
                int[] var3 = (int[]) var2.field3706;
                class18[] var4 = new class18[var3.length >> 2];
                if (!arg0) {
                    field8849 = -72;
                }
                for (int var5 = 0; var4.length > var5; ++var5) {
                    class18 var6 = new class18();
                    var4[var5] = var6;
                    var6.field271 = var3[var5 << 2];
                    var6.field270 = var3[(var5 << 2) + 1];
                    var6.field272 = var3[(var5 << 2) + 2];
                    var6.field267 = var3[(var5 << 2) - -3];
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        ++field8856;
        int var2 = 9 / ((arg0 - 41) / 54);
    }
}
