import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class85 extends class137 {

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "Lhh;")
    public class163 field1608;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "Lpg;")
    public static class81 field1606;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "[[I")
    public static int[][] field1605;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILpa;II)Z")
    public static final boolean method677(int arg0, class123 arg1, int arg2, int arg3) {
        field1611++;
        byte[] var4 = arg1.method973(arg3, true, arg0);
        if (var4 == null) {
            return false;
        }
        class164.method1233(var4, true);
        if (arg2 != 20888) {
            method680(-91, 102);
        }
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V")
    public static final void method678(byte arg0) {
        int var1 = -40 % ((57 - arg0) / 56);
        field1604++;
        client.field2001.method120((byte) -123);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([BIIZIIIII[Lcg;I)V")
    public static final void method679(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class1[] arg9, int arg10) {
        byte var11;
        if (arg3) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        field1610++;
        if (!arg3) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg5 + var12 > 0 && (arg5 + var12) < 103 && (arg4 + var13) > 0 && (arg4 + var13) < 103) {
                        arg9[arg6].field11[arg5 + var12][arg4 + var13] = class7.method50(arg9[arg6].field11[arg5 + var12][arg4 + var13], -16777217);
                    }
                }
            }
        }
        class81 var14 = new class81(arg0);
        if (arg8 != -16964) {
            field1605 = null;
        }
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg1 == var15 && arg2 <= var16 && arg2 + 8 > var16 && arg7 <= var17 && var17 < (arg7 + 8)) {
                        class229.method1595(arg4 + class244.method1685(arg10, var17 & 0x7, var16 & 0x7, 1687343696), arg6, var14, class75.method553(var17 & 0x7, var16 & 0x7, (byte) -33, arg10) + arg5, arg3, -3781, arg10, 0, 0);
                    } else {
                        class229.method1595(-1, 0, var14, -1, arg3, arg8 ^ 0x4C87, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z")
    public static final boolean method680(int arg0, int arg1) {
        field1607++;
        if (arg1 != 14213) {
            method678((byte) -35);
        }
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class85() {
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lhh;I)V")
    public class85(class163 arg0, int arg1) {
        this.field1608 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public static void method681(int arg0) {
        field1605 = null;
        if (arg0 != -9464) {
            field1606 = null;
        }
        field1606 = null;
    }
}
