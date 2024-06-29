import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class28 extends class270 {

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    private int field416 = 4096;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
    private int field417 = 4096;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    private int field418 = 4096;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "S")
    public static short field411 = 205;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
    public static int field421 = 0;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "Z")
    public static boolean field414 = true;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "Ljava/lang/String;")
    public static String field423 = "Loaded input handler";

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "Ldp;")
    public static class174 field422;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "[Lof;")
    public static class421[] field415;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "[[I")
    public static int[][] field412;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)V", line = 13)
    public static void method223(boolean arg0) {
        if (arg0) {
            method224(false, (class174) null);
        }
        field415 = null;
        field422 = null;
        field412 = null;
        field423 = null;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 30)
    public class28() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLec;I)V", line = 33)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        ++field413;
        if (arg0 != 108) {
            field411 = -50;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field417 = arg1.method320((byte) -87);
                }
            } else {
                this.field416 = arg1.method320((byte) -87);
            }
        } else {
            this.field418 = arg1.method320((byte) -87);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)[[I", line = 77)
    public final int[][] method123(boolean arg0, int arg1) {
        ++field420;
        int[][] var3 = super.field4046.method244(arg1, 125);
        if (!arg0) {
            field421 = 69;
        }
        if (super.field4046.field488) {
            int[][] var4 = this.method1930(arg1, 0, (byte) -75);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class161.field2445 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field418 * var12 >> 12;
                    var9[var11] = this.field416 * var13 >> 12;
                    var10[var11] = this.field417 * var14 >> 12;
                } else {
                    var8[var11] = this.field418;
                    var9[var11] = this.field416;
                    var10[var11] = this.field417;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZLdp;)V", line = 152)
    public static final void method224(boolean arg0, class174 arg1) {
        ++field419;
        class185.field2723 = 0;
        if (arg0) {
            class207.field3036 = 0;
            class322.field4654 = new class391();
            class196.field2867 = new class251[1024];
            class19.method118(1047124047, arg1);
            class23.method164(-33, arg1);
        }
    }
}
