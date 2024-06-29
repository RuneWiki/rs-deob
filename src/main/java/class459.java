import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class459 extends class466 {

    @OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
    private int field6459 = 4;

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
    private int field6460 = 4;

    @OriginalMember(owner = "client!ur", name = "I", descriptor = "Lcba;")
    public static class471 field6462 = new class471(54, -2);

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "Lej;")
    public static class104 field6463 = new class104("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "Lvf;")
    public static class131 field6466;

    @OriginalMember(owner = "client!ur", name = "E", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        ++field6458;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field6460 = arg0.method110((byte) 114);
            }
        } else {
            this.field6459 = arg0.method110((byte) 114);
        }
        if (arg1 != -5062) {
            method2684(4);
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
    public class459() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V")
    public static void method2684(int arg0) {
        if (arg0 != -5005) {
            field6462 = null;
        }
        field6462 = null;
        field6463 = null;
        field6466 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field6461;
        int[][] var3 = super.field6569.method828((byte) 127, arg0);
        if (arg1) {
            field6466 = null;
        }
        if (super.field6569.field1934) {
            int var4 = class312.field4207 / this.field6459;
            int var5 = class564.field7814 / this.field6460;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method2719(0, 0, 5);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2719(0, class564.field7814 * var7 / var5, 5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class312.field4207; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class312.field4207 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(JI)V")
    public static final void method2685(long arg0, int arg1) {
        if (class356.field4807 != null) {
            if (class107.field1653 != 1 && ~class107.field1653 != -6) {
                if (class107.field1653 == 4) {
                    class206.method1255(117, arg0);
                }
            } else {
                class372.method2215(1, arg0);
            }
        }
        ++field6465;
        class100.method712(115, class69.field1165, (long) class405.field5763);
        if (~class56.field1005 != 0) {
            class112.method779(class56.field1005, true);
        }
        for (int var3 = 0; var3 < class628.field9187; ++var3) {
            if (class48.field940[var3]) {
                class18.field226[var3] = true;
            }
            class201.field2818[var3] = class48.field940[var3];
            class48.field940[var3] = false;
        }
        class233.field3287 = class405.field5763;
        if (class69.field1165.method1340()) {
            class374.field5039 = true;
        }
        if (~class56.field1005 != 0) {
            class628.field9187 = 0;
            class192.method1191((byte) 49);
        }
        class69.field1165.method1269();
        class525.method3027(false, class69.field1165);
        int var4 = class64.method544((byte) -82);
        if (var4 == -1) {
            var4 = class575.field7926;
        }
        if (~var4 == 0) {
            var4 = class644.field9360;
        }
        class464.method2715((byte) 67, var4);
        class615.method3592(class645.field9372.field6037, class645.field9372.field6035, arg1 + -68, class64.field1097, class645.field9372.field6029);
        if (arg1 != 4) {
            method2685(17L, 19);
        }
        class64.field1097 = 0;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field6464;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (arg1 != 0) {
            this.method6((class11) null, 81, -103);
        }
        if (super.field6557.field1163) {
            int var4 = class312.field4207 / this.field6459;
            int var5 = class564.field7814 / this.field6460;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method2721(0, 0, 2);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2721(0, class564.field7814 * var7 / var5, 2);
            }
            for (int var8 = 0; var8 < class312.field4207; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class312.field4207 * var9 / var4];
                }
            }
        }
        return var3;
    }

    static {
        new class104((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
        field6466 = new class131();
    }
}
