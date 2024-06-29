import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class170 extends class330 {

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    private int field2159 = 4096;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "Laf;")
    public static class39 field2167 = new class39(8);

    @OriginalMember(owner = "client!q", name = "E", descriptor = "F")
    public static float field2158;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "Lae;")
    public static class283 field2160;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "Luia;")
    public static class589 field2161;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "[I")
    public static int[] field2162;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(B)V", line = 5)
    public static final void method1093(byte arg0) {
        if (arg0 < 117) {
            method1097((byte) -117, (Component) null);
        }
        ++field2157;
        class678.field9487.method319(-30);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)[I", line = 19)
    public final int[] method464(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field2164;
            int[] var3 = super.field4630.method2475(arg0, 30011);
            if (super.field4630.field5704) {
                int[] var4 = this.method2084(0, class385.field5505 & arg0 - 1, (byte) -126);
                int[] var5 = this.method2084(0, arg0, (byte) -115);
                int[] var6 = this.method2084(0, class385.field5505 & arg0 + 1, (byte) 97);
                for (int var7 = 0; var7 < class80.field901; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field2159;
                    int var9 = (var5[class639.field8988 & var7 - -1] + -var5[class639.field8988 & var7 - 1]) * this.field2159;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                    int var15 = var14 != 0 ? 16777216 / var14 : 0;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lgga;IB)V", line = 75)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field2168;
        if (~arg1 == -1) {
            this.field2159 = arg0.method3002(-1);
        }
        int var4 = 56 % ((-41 - arg2) / 42);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)V", line = 88)
    public static final void method1094(byte arg0, int arg1) {
        int var2 = 85 / ((arg0 - -36) / 39);
        ++field2163;
        class17 var3 = class245.method1634(1, (long) arg1, 16);
        var3.method69(13);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 105)
    public static void method1095(int arg0) {
        field2160 = null;
        if (arg0 != -28951) {
            method1093((byte) 59);
        }
        field2161 = null;
        field2167 = null;
        field2162 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 120)
    public class170() {
        super(1, true);
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(B)V", line = 123)
    public static final void method1096(byte arg0) {
        if (arg0 != -7) {
            field2156 = -23;
        }
        ++field2166;
        class453.field6317.method3672(0);
        class604.field8477.method3672(0);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLjava/awt/Component;)Laba;", line = 145)
    public static final class140 method1097(byte arg0, Component arg1) {
        ++field2165;
        if (arg0 != 22) {
            field2158 = -1.0836936F;
        }
        return new class33(arg1);
    }
}
