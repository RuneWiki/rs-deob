import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class362 extends class447 {

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public int field5076 = 0;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lcq;")
    public static class272 field5075 = new class272(100);

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "[I")
    public static int[] field5082 = new int[16384];

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "[I")
    public static int[] field5083 = new int[16384];

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "Lng;")
    public static class190 field5084;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "Lng;")
    public static class190 field5087;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "Lqj;")
    public static class296 field5085;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILeb;)V")
    private final void method2330(int arg0, int arg1, class371 arg2) {
        field5074++;
        if (arg0 == 2) {
            this.field5076 = arg2.method2403((byte) 68);
        }
        if (arg1 <= 60) {
            this.field5076 = -62;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)I")
    public static final int method2331(int arg0) {
        field5080++;
        int var1 = 71 / ((arg0 - 65) / 50);
        return 6;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
    public static void method2332(int arg0) {
        field5082 = null;
        field5075 = null;
        field5083 = null;
        field5087 = null;
        int var1 = -42 / ((arg0 - 54) / 60);
        field5084 = null;
        field5085 = null;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
    public static final void method2333(byte arg0) {
        field5078++;
        if (class60.field844.length() == 0) {
            return;
        }
        class250.method1555(-122, "--> " + class60.field844);
        class160.method1064((byte) -60, false, class60.field844);
        class275.field3728 = 0;
        int var1 = 81 / ((62 - arg0) / 34);
        class60.field844 = "";
        class275.field3735 = 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILeb;)V")
    public final void method2334(int arg0, class371 arg1) {
        field5081++;
        while (true) {
            int var3 = arg1.method2429(0);
            if (var3 == 0) {
                if (arg0 <= 27) {
                    field5086 = -7;
                    return;
                } else {
                    return;
                }
            }
            this.method2330(var3, 80, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLqj;)I")
    public static final int method2335(byte arg0, class296 arg1) {
        if (arg0 != -40) {
            field5086 = 88;
        }
        field5079++;
        int var2 = 0;
        if (arg1.method1898(class23.field302, 123)) {
            var2++;
        }
        if (arg1.method1898(class123.field1723, arg0 ^ 0xFFFFFFA3)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
    public static final void method2336(int arg0) {
        class184.field2575 = -1;
        class254.field3486 = 0;
        class236.field3216 = -1;
        class394.field5764 = -1;
        field5077++;
        int var1 = -65 % ((11 - arg0) / 33);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5083[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field5082[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field5084 = new class190(100);
        field5086 = 0;
        field5087 = new class190(64);
    }
}
