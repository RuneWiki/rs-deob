import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class375 extends class601 {

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "Lbq;")
    public static class289 field4815 = new class289();

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "[I")
    public static int[] field4823 = new int[128];

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4827;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "Lvw;")
    public static class304 field4818;

    static {
        for (int var0 = 0; var0 < field4823.length; ++var0) {
            field4823[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; ++var1) {
            field4823[var1] = var1 + -65;
        }
        for (int var2 = 97; ~var2 >= -123; ++var2) {
            field4823[var2] = var2 + -97 + 26;
        }
        for (int var3 = 48; var3 <= 57; ++var3) {
            field4823[var3] = var3 + 4;
        }
        field4823[45] = field4823[47] = 63;
        field4823[42] = field4823[43] = 62;
        field4827 = new CRC32();
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(II)I", line = 4)
    public final int method34(int arg0, int arg1) {
        ++field4822;
        if (super.field8563.method3930(19)) {
            return 3;
        } else {
            if (arg1 != 15706) {
                method2183(85, false, true, -31, -8);
            }
            return super.field8563.field9836.method466(arg1 ^ 15696) == 0 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZZII)I", line = 25)
    public static final int method2183(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        ++field4819;
        class755 var5 = class149.method926(Integer.MIN_VALUE, arg1, arg4);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            for (int var7 = arg0; ~var7 > ~var5.field10531.length; ++var7) {
                if (~var5.field10531[var7] <= -1 && ~var5.field10531[var7] > ~class361.field4643.field1614) {
                    class431 var8 = class361.field4643.method912((byte) 1, var5.field10531[var7]);
                    int var9 = var8.method2710(0, arg3, class84.field884.method98(true, arg3).field9906);
                    if (arg2) {
                        var6 += var5.field10534[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(ILgn;)V", line = 62)
    public class375(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZ)V", line = 65)
    public final void method40(int arg0, boolean arg1) {
        ++field4821;
        if (arg1) {
            field4823 = null;
        }
        super.field8565 = arg0;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lgh;I)[Lvj;", line = 76)
    public static final class440[] method2184(class546 arg0, int arg1) {
        ++field4816;
        if (!arg0.method3216(-116)) {
            return new class440[0];
        } else {
            class290 var2 = arg0.method3200((byte) -94);
            while (var2.field3573 == 0) {
                class524.method3076(1, 10L);
            }
            if (var2.field3573 == 2) {
                return new class440[0];
            } else {
                int[] var3 = (int[]) var2.field3577;
                class440[] var4 = new class440[var3.length >> 2];
                for (int var5 = 0; ~var4.length < ~var5; ++var5) {
                    class440 var6 = new class440();
                    var4[var5] = var6;
                    var6.field6388 = var3[var5 << 2];
                    var6.field6382 = var3[(var5 << 2) + 1];
                    var6.field6385 = var3[(var5 << 2) + 2];
                    var6.field6383 = var3[(var5 << 2) - -3];
                }
                if (arg1 > -121) {
                    field4827 = null;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I", line = 119)
    public final int method2185(int arg0) {
        ++field4824;
        int var2 = 50 % ((-59 - arg0) / 61);
        return super.field8565;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V", line = 129)
    public static void method2186(int arg0) {
        field4818 = null;
        field4823 = null;
        field4827 = null;
        field4815 = null;
        if (arg0 != -3) {
            field4827 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lgn;)V", line = 149)
    public class375(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)Z", line = 153)
    public final boolean method2187(int arg0) {
        ++field4825;
        if (super.field8563.method3930(19)) {
            return false;
        } else {
            if (arg0 != -9242) {
                this.method39((byte) -98);
            }
            return super.field8563.field9836.method466(arg0 ^ 9318) != 0;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V", line = 172)
    public final void method35(byte arg0) {
        if (arg0 <= -37) {
            if (super.field8563.method3930(19)) {
                super.field8565 = 0;
            }
            ++field4817;
            if (super.field8563.field9836.method466(-124) == 0) {
                super.field8565 = 0;
            }
            if (super.field8565 < 0 || ~super.field8565 < -3) {
                super.field8565 = this.method39((byte) -17);
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)I", line = 230)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            return -81;
        } else {
            ++field4826;
            return 2;
        }
    }
}
