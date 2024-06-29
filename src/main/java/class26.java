import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class26 extends class243 {

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "Lfha;")
    public static class382 field196 = new class382(6, 3);

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "Lcc;")
    public static class731 field193;

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
    public class26() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V")
    public static void method101(boolean arg0) {
        if (arg0) {
            method102(-69, -23, -110, (class60) null, -114, 47, 46);
        }
        field196 = null;
        field193 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIILha;III)Lka;")
    public static final class472 method102(int arg0, int arg1, int arg2, class60 arg3, int arg4, int arg5, int arg6) {
        ++field194;
        long var7 = (long) arg4;
        class472 var9 = (class472) class554.field7826.method1571(-126, var7);
        short var10 = 2055;
        if (var9 == null) {
            class446 var11 = class317.method1898(0, -9252, class430.field6050, arg4);
            if (var11 == null) {
                return null;
            }
            if (~var11.field6189 > -14) {
                var11.method2502(13746, 2);
            }
            var9 = arg3.method407(var11, var10, class726.field10131, 64, 768);
            class554.field7826.method1574(var7, var9, (byte) -80);
        }
        class472 var12 = var9.method241((byte) 2, var10, true);
        if (arg1 != 0) {
            var12.method197(arg1);
        }
        if (arg2 != 0) {
            var12.method229(arg2);
        }
        if (~arg0 != -1) {
            var12.method216(arg0);
        }
        if (arg5 < 68) {
            method102(80, 14, 63, (class60) null, -118, 89, 104);
        }
        if (arg6 != 0) {
            var12.method237(0, arg6, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        ++field195;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (arg0 != 255) {
            field196 = null;
        }
        if (super.field3164.field9250) {
            int[][] var4 = this.method1457(arg1, 24431, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class687.field9628; ++var8) {
                var3[var8] = (var6[var8] - -var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }
}
