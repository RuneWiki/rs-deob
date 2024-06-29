import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class19 extends class113 {

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "Lfo;")
    public static class22 field169 = new class22(9, 14);

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "Lqu;")
    public static class364 field172 = new class364(53, -1);

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "Lqc;")
    public static class325 field173 = new class325(5);

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "Lpm;")
    public static class129 field175 = new class129();

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "[I")
    public static int[] field179 = new int[1000];

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "[Ljava/lang/String;")
    public static String[] field177 = new String[200];

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "Lnj;")
    public static class487 field178 = new class487("K", "T", "K", "K");

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "Z")
    public static boolean field181 = false;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    public static int field180 = 0;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "[I")
    public static int[] field174;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static final void method88(byte arg0) {
        if (arg0 != 51) {
            method88((byte) -76);
        }
        field170++;
        int var1 = (int) ((double) class35.field399 * 34.46D);
        int var2 = var1 << 0;
        if (class379.field5558.method1006()) {
            var2 += 128;
        }
        class379.field5558.method1021(50, var2);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Z")
    public static final boolean method89(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field180 = 127;
        }
        field171++;
        return class264.method1693(arg1, -111, arg2) || class350.method2142(arg2, arg1, (byte) -96);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
    public static void method90(byte arg0) {
        field179 = null;
        field178 = null;
        field174 = null;
        field172 = null;
        if (arg0 != -8) {
            field179 = null;
        }
        field177 = null;
        field169 = null;
        field175 = null;
        field173 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIB)V")
    public static final void method91(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field168++;
        float var5 = (float) class113.field1439 / (float) class113.field1438;
        int var6 = arg1;
        int var7 = arg3;
        if (arg4 > -94) {
            return;
        }
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = arg2 - (arg1 - var6) / 2;
        int var9 = arg0 - (arg3 - var7) / 2;
        class53.field639 = -1;
        class527.field7824 = class113.field1439 - class113.field1439 * var9 / var7;
        class17.field147 = -1;
        class296.field4338 = class113.field1438 * var8 / var6;
        class424.method2511(-1);
    }
}
