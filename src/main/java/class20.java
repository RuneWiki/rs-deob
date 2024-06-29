import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class20 {

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lha;")
    public static class63 field272 = null;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lr;")
    public static class66 field275 = class93.method641(43, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lff;")
    public static class241 field277;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Ljb;")
    public static class256 field270;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Lr;")
    public static final class66 method81(byte arg0, int arg1) {
        if (arg0 > -36) {
            field274 = -44;
        }
        field266++;
        if (arg1 < 100000) {
            return class212.method1372(2, new class66[] { class192.field3328, class144.method989(arg1, 0), class170.field3023 });
        } else if (arg1 < 10000000) {
            return class212.method1372(2, new class66[] { class247.field4298, class144.method989(arg1 / 1000, 0), class96.field1851, class170.field3023 });
        } else {
            return class212.method1372(2, new class66[] { class223.field3798, class144.method989(arg1 / 1000000, 0), class226.field3872, class170.field3023 });
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(La;IIIZ)V")
    public void method82(class20 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field269++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
    public static final byte[] method83(boolean arg0, byte arg1, Object arg2) {
        field267++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class86.method614(var3, false) : var3;
        } else {
            if (arg1 != -4) {
                method84((byte) -77, -30, -86, 85);
            }
            if (!arg2 instanceof class109) {
                throw new IllegalArgumentException();
            }
            class109 var4 = (class109) arg2;
            return var4.method440(-82);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BIII)I")
    public static final int method84(byte arg0, int arg1, int arg2, int arg3) {
        field268++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        }
        int var5 = -17 / ((-arg0 - 35) / 45);
        if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static final void method85(int arg0) {
        field271++;
        class69.field1379.method1614(-20);
        class94.field1806.method1614(111);
        if (arg0 != -7816) {
            field277 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()I")
    public abstract int method28();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)La;")
    public class20 method86(int arg0, int arg1, int arg2) {
        field273++;
        return this;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()Z")
    public boolean method87() {
        field278++;
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILcj;Z)[Ldh;")
    public static final class265[] method88(int arg0, class28 arg1, boolean arg2) {
        field276++;
        if (arg2) {
            field270 = null;
        }
        return class87.method618(arg1, -1, arg0) ? class64.method434(31) : null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
    public void method89(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 96) {
            field274 = 32;
        }
        field279++;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static void method90(int arg0) {
        field270 = null;
        field272 = null;
        field277 = null;
        field275 = null;
        if (arg0 <= 35) {
            method88(5, (class28) null, false);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[BIZIII[Lga;)V")
    public static final void method91(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, class165[] arg7) {
        field265++;
        byte var8;
        if (arg3) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (arg4 >= -1) {
            return;
        }
        if (!arg3) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg2 + var10) > 0 && arg2 + var10 < 103 && (arg0 + var11) > 0 && arg0 + var11 < 103) {
                            arg7[var9].field2976[arg2 + var10][arg0 + var11] = class115.method767(arg7[var9].field2976[arg2 + var10][arg0 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class249 var12 = new class249(arg1);
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class170.method1160(arg3, arg2 + var14, arg6, arg5, var12, var13, 0, (byte) 91, arg0 + var15);
                }
            }
        }
    }
}
