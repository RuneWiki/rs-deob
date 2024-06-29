import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class68 extends class40 {

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    private int field911 = -1;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field910 = 0;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "Lsm;")
    public static class156 field915 = null;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "Lld;")
    public static class94 field914 = class297.method2007(-1);

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "[I")
    private int[] field908;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)I", line = 8)
    public final int method267(int arg0) {
        if (arg0 != 28891) {
            return 27;
        } else {
            ++field912;
            return this.field911;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZI)V", line = 23)
    public final void method260(int arg0, boolean arg1, int arg2) {
        super.method260(arg0, arg1, arg2);
        ++field907;
        if (this.field911 >= 0 && class166.field2373 != null) {
            int var4 = class166.field2373.method1475(this.field911, 17673).field4164 ? 64 : 128;
            this.field908 = class166.field2373.method1474(var4, false, 1.0F, var4, (byte) -127, this.field911);
            this.field905 = var4;
            this.field904 = var4;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[[I", line = 42)
    public final int[][] method112(int arg0, int arg1) {
        ++field906;
        if (arg0 != 1) {
            this.field904 = 35;
        }
        int[][] var3 = super.field555.method2070(arg0 + -1, arg1);
        if (super.field555.field4489) {
            int var4 = (~class440.field6297 != ~this.field905 ? this.field905 * arg1 / class440.field6297 : arg1) * this.field904;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class410.field5886 != this.field904) {
                for (int var8 = 0; ~class410.field5886 < ~var8; ++var8) {
                    int var9 = this.field904 * var8 / class410.field5886;
                    int var10 = this.field908[var4 + var9];
                    var7[var8] = class209.method1483(4080, var10 << 4);
                    var6[var8] = class209.method1483(var10, 65280) >> 4;
                    var5[var8] = class209.method1483(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; var11 < class410.field5886; ++var11) {
                    int var12 = this.field908[var4++];
                    var7[var11] = class209.method1483(255, var12) << 4;
                    var6[var11] = class209.method1483(65280, var12) >> 4;
                    var5[var11] = class209.method1483(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 113)
    public class68() {
        super(0, false);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILlf;)V", line = 117)
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (arg0 == 0) {
            this.field911 = arg2.method798(false);
        }
        if (arg1 <= 79) {
            field915 = null;
        }
        ++field909;
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(B)V", line = 130)
    public final void method264(byte arg0) {
        ++field913;
        super.method264(arg0);
        this.field908 = null;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V", line = 140)
    public static void method423(int arg0) {
        if (arg0 == 4080) {
            field914 = null;
            field915 = null;
        }
    }
}
