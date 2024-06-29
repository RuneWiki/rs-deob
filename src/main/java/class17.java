import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class17 implements class788 {

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "client!tia", name = "f", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "[F")
    public float[] field181;

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "Lin;")
    public static class380 field182 = new class380(34, -1);

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "I")
    public static int field185 = 0;

    @OriginalMember(owner = "client!tia", name = "c", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!tia", name = "h", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!tia", name = "i", descriptor = "Lfe;")
    public static class345 field189;

    @OriginalMember(owner = "client!tia", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field187;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lol;BLts;)Ldt;", line = 6)
    public static final class643 method174(class431 arg0, byte arg1, class42 arg2) {
        field188++;
        class643 var3 = new class643(arg2);
        int var4 = arg0.method2557(14929);
        boolean var5 = (var4 & 0x1) != 0;
        boolean var6 = (var4 & 0x2) != 0;
        if (arg1 <= 18) {
            return null;
        }
        boolean var7 = (var4 & 0x4) != 0;
        if (var5) {
            var3.field9150[0] = arg0.method2565((byte) -104);
            var3.field9151[0] = arg0.method2565((byte) -104);
            if (arg2.field573 != -1 || arg2.field514 != -1) {
                var3.field9150[1] = arg0.method2565((byte) -117);
                var3.field9151[1] = arg0.method2565((byte) -102);
            }
            if (arg2.field534 != -1 || arg2.field517 != -1) {
                var3.field9150[2] = arg0.method2565((byte) -89);
                var3.field9151[2] = arg0.method2565((byte) -96);
            }
        }
        boolean var8 = (var4 & 0x8) != 0;
        if (var6) {
            var3.field9148[0] = arg0.method2565((byte) -116);
            var3.field9144[0] = arg0.method2565((byte) -86);
            if (arg2.field526 != -1 || arg2.field532 != -1) {
                var3.field9148[1] = arg0.method2565((byte) -94);
                var3.field9144[1] = arg0.method2565((byte) -113);
            }
        }
        if (var7) {
            int var9 = arg0.method2565((byte) -126);
            int[] var10 = new int[] { class194.method1380(var9, 15), class194.method1380(var9 >> 4, 15), class194.method1380(4045, var9) >> 8, class194.method1380(var9, 63495) >> 12 };
            for (int var11 = 0; var11 < 4; var11++) {
                if (var10[var11] != 15) {
                    var3.field9149[var10[var11]] = (short) arg0.method2565((byte) -125);
                }
            }
        }
        if (var8) {
            int var12 = arg0.method2557(14929);
            int[] var13 = new int[] { class194.method1380(15, var12), class194.method1380(240, var12) >> 4 };
            for (int var14 = 0; var14 < 2; var14++) {
                if (var13[var14] != 15) {
                    var3.field9146[var13[var14]] = (short) arg0.method2565((byte) -120);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Z)V", line = 105)
    public static final void method175(boolean arg0) {
        class591.field8484 = 1;
        class347.field4939 = -1;
        field183++;
        long var1 = 0L;
        if (class692.field9757 == null) {
            class330.method2010(23708, 35);
        } else {
            class431 var3 = new class431(class563.method3280(class611.method3536(class692.field9757, (byte) -30), 64));
            long var4 = var3.method2567((byte) -126);
            class507.field6971 = var3.method2567((byte) -127);
            class563.method3279(arg0, class549.method3176(false, var4), "", -6864);
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V", line = 130)
    public static void method176(int arg0) {
        if (arg0 != 18864) {
            method175(true);
        }
        field182 = null;
        field187 = null;
        field189 = null;
    }

    @OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(II)V", line = 148)
    public class17(int arg0, int arg1) {
        this.field184 = arg1;
        this.field186 = arg0;
        this.field181 = new float[arg0 * arg1];
    }
}
