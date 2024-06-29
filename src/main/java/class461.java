import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class461 extends class404 {

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    private int field7097 = 585;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Loe;")
    public static class127 field7090;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "[[B")
    public static byte[][] field7092;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method2753(boolean arg0, int arg1) {
        ++field7091;
        if (!arg0) {
            field7099 = 116;
        }
        class64 var2 = class230.method1387(arg1, (byte) 40, 5);
        var2.method446(-20033);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ltq;IB)I", line = 16)
    public static final int method2754(class427 arg0, int arg1, byte arg2) {
        ++field7093;
        if (!client.method1176(arg0).method374(797621697, arg1) && arg0.field6226 == null) {
            return -1;
        } else {
            if (arg2 != -62) {
                method2757(54, -13);
            }
            return arg0.field6142 != null && arg1 < arg0.field6142.length ? arg0.field6142[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[I", line = 35)
    public final int[] method90(int arg0, int arg1) {
        ++field7094;
        if (arg0 > -47) {
            method2754((class427) null, -29, (byte) 110);
        }
        int[] var3 = super.field5870.method372(arg1, (byte) -116);
        if (super.field5870.field810) {
            int var4 = class289.field4381[arg1];
            for (int var5 = 0; ~class431.field6348 < ~var5; ++var5) {
                int var6 = class167.field2594[var5];
                if (this.field7097 < var6 && -this.field7097 + 4096 > var6 && ~(-this.field7097 + 2048) > ~var4 && this.field7097 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field7097 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field7097 + 2048) > ~var6 && ~var6 > ~(this.field7097 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field7097;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field7097);
                } else if (this.field7097 <= var4 && ~(-this.field7097 + 4096) <= ~var4) {
                    if (~var6 <= ~this.field7097 && ~var6 >= ~(-this.field7097 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field7097 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field7097;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field7097 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(ZI)V", line = 115)
    public static final void method2755(boolean arg0, int arg1) {
        if (class276.field4181 == null || ~arg1 < ~class276.field4181.length) {
            class276.field4181 = new int[arg1];
        }
        ++field7095;
        if (arg0) {
            method2755(false, -106);
        }
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)V", line = 133)
    public static void method2756(int arg0) {
        field7092 = null;
        field7090 = null;
        if (arg0 != -11566) {
            method2754((class427) null, -106, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 146)
    public class461() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(II)V", line = 154)
    public static final void method2757(int arg0, int arg1) {
        int var2 = -102 % ((-34 - arg1) / 37);
        ++field7098;
        class57.field973.method1760(arg0, 30398);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILha;I)V", line = 165)
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field7096;
        if (arg2 == 0) {
            this.field7097 = arg1.method254((byte) -86);
        }
        if (arg0 != 0) {
            field7090 = null;
        }
    }
}
