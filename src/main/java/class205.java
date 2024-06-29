import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class205 extends class320 {

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public int field3162 = 0;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field3164 = 0;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "[[I")
    public static int[][] field3166 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3167;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "[[Lmi;")
    public static class125[][] field3168;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lug;I)V", line = 12)
    public final void method1527(class25 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method281(126);
            if (var3 == 0) {
                field3163++;
                if (arg1 != 128) {
                    field3164 = 20;
                }
                return;
            }
            this.method1528(arg0, (byte) 117, var3);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lug;BI)V", line = 37)
    private final void method1528(class25 arg0, byte arg1, int arg2) {
        field3161++;
        if (arg2 == 2) {
            this.field3162 = arg0.method314((byte) 105);
        }
        if (arg1 <= 65) {
            field3164 = 53;
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V", line = 60)
    public static void method1529(int arg0) {
        if (arg0 != 128) {
            method1529(113);
        }
        field3167 = null;
        field3168 = (class125[][]) null;
        field3166 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lrg;ZI)V", line = 79)
    public static final void method1530(class342 arg0, boolean arg1, int arg2) {
        field3160++;
        if (arg2 != 0) {
            method1530((class342) null, false, -20);
        }
        int var3 = arg0.field5278 == 0 ? arg0.field5374 : arg0.field5278;
        int var4 = arg0.field5264 == 0 ? arg0.field5339 : arg0.field5264;
        class283.method2061(arg0.field5433, class334.field5108[arg0.field5433 >> 16], var4, arg1, var3, (byte) -128);
        if (arg0.field5312 != null) {
            class283.method2061(arg0.field5433, arg0.field5312, var4, arg1, var3, (byte) -128);
        }
        class36 var5 = (class36) class135.field2251.method370((byte) -120, (long) arg0.field5433);
        if (var5 != null) {
            class140.method1173(arg1, var4, 15504954, var5.field540, var3);
        }
    }
}
