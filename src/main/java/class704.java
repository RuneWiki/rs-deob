import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class704 extends class529 {

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "I")
    private int field9925 = 1365;

    @OriginalMember(owner = "client!nv", name = "M", descriptor = "I")
    private int field9932 = 0;

    @OriginalMember(owner = "client!nv", name = "N", descriptor = "I")
    private int field9933 = 20;

    @OriginalMember(owner = "client!nv", name = "P", descriptor = "I")
    private int field9935 = 0;

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "[B")
    public static byte[] field9931;

    @OriginalMember(owner = "client!nv", name = "O", descriptor = "Lus;")
    public static class328 field9934;

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!nv", name = "G", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!nv", name = "H", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!nv", name = "Q", descriptor = "Lwp;")
    public static class435 field9936;

    @OriginalMember(owner = "client!nv", name = "R", descriptor = "Low;")
    public static class637 field9937;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(III)Z")
    public static final boolean method3902(int arg0, int arg1, int arg2) {
        if (arg0 != 32) {
            return true;
        } else {
            ++field9927;
            return (32 & arg1) != 0;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field9923;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field9932 = arg2.method1107(false);
                    }
                } else {
                    this.field9935 = arg2.method1107(false);
                }
            } else {
                this.field9933 = arg2.method1107(false);
            }
        } else {
            this.field9925 = arg2.method1107(false);
        }
        if (arg1 <= 45) {
            field9934 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "(I)V")
    public static void method3903(int arg0) {
        field9934 = null;
        if (arg0 != 32767) {
            method3902(-93, -78, 91);
        }
        field9931 = null;
        field9936 = null;
        field9937 = null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLtn;)Ljava/lang/String;")
    public static final String method3904(byte arg0, class179 arg1) {
        int var2 = -80 % ((-57 - arg0) / 41);
        ++field9928;
        return class34.method311(32767, arg1, 4);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field9924;
        int var3 = -85 / ((arg1 - 27) / 49);
        int[] var4 = super.field7456.method1635(arg0, -101);
        if (super.field7456.field3449) {
            for (int var5 = 0; class304.field3909 > var5; ++var5) {
                int var6 = (class225.field2973[var5] << 12) / this.field9925 + this.field9935;
                int var7 = (class310.field3960[arg0] << 12) / this.field9925 + this.field9932;
                int var8 = var6;
                int var9 = var7;
                int var10 = var6;
                int var11 = var7;
                int var12 = var6 * var6 >> 12;
                int var13 = var7 * var7 >> 12;
                int var14 = 0;
                while (var12 + var13 < 16384 && var14 < this.field9933) {
                    var11 = (var10 * var11 >> 12) * 2 + var9;
                    var10 = -var13 + var8 + var12;
                    var13 = var11 * var11 >> 12;
                    ++var14;
                    var12 = var10 * var10 >> 12;
                }
                var4[var5] = var14 < this.field9933 + -1 ? (var14 << 12) / this.field9933 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V")
    public static final void method3905(byte arg0) throws IOException {
        if (arg0 < 110) {
            field9934 = null;
        }
        if (class426.field6057 != null && class756.field10532 > 0) {
            class643.field8869.field2354 = 0;
            while (true) {
                class650 var1 = (class650) class4.field33.method3111(96);
                if (var1 == null || class643.field8869.field2325.length + -class643.field8869.field2354 < var1.field8930) {
                    class426.field6057.method868(103, 0, class643.field8869.field2325, class643.field8869.field2354);
                    class462.field6704 = 0;
                    class229.field2994 += class643.field8869.field2354;
                    break;
                }
                class643.field8869.method1123(var1.field8930, (byte) -104, 0, var1.field8928.field2325);
                class756.field10532 -= var1.field8930;
                var1.method3426((byte) -23);
                var1.field8928.method1148(1);
                var1.method3510(12);
            }
        }
        ++field9930;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)I")
    public static final int method3906(int arg0, int arg1) {
        if (arg1 != 21544) {
            return 41;
        } else {
            ++field9929;
            return arg0 & 127;
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "()V")
    public class704() {
        super(0, true);
    }

    static {
        int var0 = 0;
        field9931 = new byte[32896];
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var1 <= ~var2; ++var2) {
                field9931[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field9934 = new class328(33, 11);
    }
}
