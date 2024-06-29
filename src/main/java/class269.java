import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class269 extends class279 {

    @OriginalMember(owner = "client!t", name = "L", descriptor = "Ltl;")
    public static class59 field4669 = class85.method639("(U", 9588);

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    public static int field4672 = 0;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "Ltl;")
    public static class59 field4665 = class85.method639("Cabbage", 9588);

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "Ldf;")
    public static class152 field4674;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "Lbh;")
    public static class183 field4666;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "Lme;")
    public static class295 field4664;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "[Lkm;")
    public static class86[] field4671;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V", line = 6)
    public static void method1878(int arg0) {
        field4664 = null;
        field4666 = null;
        field4669 = null;
        field4671 = null;
        field4665 = null;
        if (arg0 < 89) {
            field4669 = (class59) null;
        }
        field4674 = null;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V", line = 26)
    public class269() {
        super(0, true);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BIII)I", line = 31)
    public static final int method1879(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= -11) {
            field4674 = (class152) null;
        }
        int var4 = class298.field5102[class258.method1790(arg3, arg1)];
        if (arg2 > 0) {
            int var5 = class298.field5107.method380(arg2 & 0xFFFF, 255);
            if (var5 != 0) {
                int var6;
                if (arg1 < 0) {
                    var6 = 0;
                } else if (arg1 <= 127) {
                    var6 = arg1 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class298.field5107.method378(-27774, arg2 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = (var4 >> 16 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 >> 8 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 & 0xFF00) + (var10 >> 8) + (var11 << 8 & 0xFF00FA);
            }
        }
        field4673++;
        return var4;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(II)I", line = 100)
    public static final int method1880(int arg0, int arg1) {
        field4667++;
        int var2 = -82 / ((65 - arg0) / 61);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)[I", line = 129)
    public final int[] method44(boolean arg0, int arg1) {
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            class63.method522(var3, 0, class56.field835, class71.field1104[arg1]);
        }
        if (arg0) {
            method1880(-21, -112);
        }
        field4670++;
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(B)V", line = 152)
    public static final void method1881(byte arg0) {
        field4668++;
        if (arg0 != -1) {
            return;
        }
        if (class237.field3934 != null) {
            class237.field3934.method549((byte) -124);
        }
        if (class227.field3652 != null) {
            class227.field3652.method549((byte) -127);
        }
    }
}
