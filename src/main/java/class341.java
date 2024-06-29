import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class341 extends class82 {

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "Lre;")
    public static class515 field4399 = null;

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "Lsw;")
    public static class641 field4398 = new class641(32);

    @OriginalMember(owner = "client!ns", name = "V", descriptor = "I")
    public static int field4402 = 0;

    @OriginalMember(owner = "client!ns", name = "L", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ns", name = "M", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ns", name = "O", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ns", name = "P", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ns", name = "Q", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ns", name = "U", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ns", name = "T", descriptor = "[Lmca;")
    public static class29[] field4400;

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
    public class341() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Los;I)Lal;")
    public static final class82 method1905(class374 arg0, int arg1) {
        ++field4396;
        arg0.method2129(arg1 + -80);
        int var2 = arg0.method2129(-99);
        class82 var3 = class625.method3578(var2, -71);
        var3.field987 = arg0.method2129(arg1 + -112);
        int var4 = arg0.method2129(arg1 ^ -122);
        for (int var5 = arg1; ~var4 < ~var5; ++var5) {
            int var6 = arg0.method2129(-103);
            var3.method198(var6, arg1 + -111, arg0);
        }
        var3.method438(-2);
        return var3;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "([BIIB)Ljava/lang/String;")
    public static final String method1906(byte[] arg0, int arg1, int arg2, byte arg3) {
        ++field4397;
        int var4 = 69 / ((arg3 - 29) / 50);
        char[] var5 = new char[arg2];
        int var6 = 0;
        for (int var7 = 0; arg2 > var7; ++var7) {
            int var8 = arg0[arg1 + var7] & 255;
            if (~var8 != -1) {
                if (~var8 <= -129 && ~var8 > -161) {
                    char var9 = class88.field1082[var8 + -128];
                    if (~var9 == -1) {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var5[var6++] = (char) var8;
            }
        }
        return new String(var5, 0, var6);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public static void method1907(byte arg0) {
        field4399 = null;
        field4400 = null;
        int var1 = 22 / ((arg0 - 17) / 39);
        field4398 = null;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field4392;
        if (arg1 != 12218) {
            return null;
        } else {
            int[] var3 = super.field990.method1566((byte) 116, arg0);
            if (super.field990.field3641) {
                int[] var4 = this.method489(false, 0, arg0);
                for (int var5 = 0; ~class629.field9033 < ~var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field4395;
        if (~arg0 == -1) {
            super.field999 = arg2.method2129(-80) == 1;
        }
        int var4 = -15 % ((-69 - arg1) / 42);
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)[[I")
    public final int[][] method481(int arg0, int arg1) {
        if (arg0 != 1000) {
            this.method198(-117, 86, (class374) null);
        }
        ++field4401;
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (super.field992.field7962) {
            int[][] var4 = this.method488(0, arg1, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class629.field9033; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }
}
