import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class506 extends class748 {

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    private int field7066 = 0;

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "I")
    private int field7071 = 4096;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "Lmha;")
    public static class701 field7069 = new class701(12, 0, 1, 0);

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!ss", name = "N", descriptor = "Lwu;")
    public static class557 field7072;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field7070;
        int[] var3 = super.field10407.method3873(arg1 + -255, arg0);
        if (super.field10407.field9527) {
            int[] var4 = this.method4157(0, (byte) 57, arg0);
            for (int var5 = 0; var5 < class424.field5889; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field7066 >= ~var6 && ~this.field7071 <= ~var6 ? 4096 : 0;
            }
        }
        if (arg1 != 255) {
            this.field7071 = 58;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
    public class506() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "(I)V")
    public static final void method3021(int arg0) {
        ++field7067;
        if (class674.field9500.field5113.method3798(0) == 0 && class392.field5459 != class183.field2654) {
            class92.method555(512, 11, class585.field8427, class13.field192, false);
        } else {
            class222.method1448(23, class96.field1401);
            int var1 = -78 / ((arg0 - 85) / 39);
            if (class41.field576 != class392.field5459) {
                class78.method474(-3625);
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field7071 = arg2.method193(2);
            }
        } else {
            this.field7066 = arg2.method193(2);
        }
        if (arg1) {
            method3021(-121);
        }
        ++field7068;
    }

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "(I)V")
    public static void method3022(int arg0) {
        field7072 = null;
        if (arg0 == 14941) {
            field7069 = null;
        }
    }
}
