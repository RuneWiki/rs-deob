import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class564 implements class552 {

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lsd;")
    private class80 field8035 = new class80(128);

    @OriginalMember(owner = "client!og", name = "n", descriptor = "[I")
    private int[] field8043 = new int[class574.field8290.field1987];

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[I")
    public int[] field8040 = new int[class574.field8290.field1987];

    @OriginalMember(owner = "client!og", name = "o", descriptor = "Lig;")
    public static class206 field8044 = new class206(87, -1);

    @OriginalMember(owner = "client!og", name = "p", descriptor = "Lkca;")
    public static class73 field8045 = new class73(55, 7);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field8030;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field8034;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Ljq;")
    public static class443 field8033;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method3260(int arg0) {
        field8033 = null;
        if (arg0 != 0) {
            field8033 = null;
        }
        field8044 = null;
        field8045 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IZ)I")
    public final int method3261(int arg0, boolean arg1) {
        if (arg0 != 0) {
            method3263(12, -25, (byte) 89);
        }
        field8041++;
        long var3 = class84.method550((byte) -87);
        for (class550 var5 = arg1 ? (class550) this.field8035.method523(59) : (class550) this.field8035.method530(12714); var5 != null; var5 = (class550) this.field8035.method530(12714)) {
            if ((var5.field7848 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field7848 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field4676;
                    this.field8040[var6] = this.field8043[var6];
                    var5.method2108(true);
                    return var6;
                }
                var5.method2108(true);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public final void method3262(int arg0) {
        for (int var2 = arg0; var2 < class574.field8290.field1987; var2++) {
            class18 var3 = class574.field8290.method944(true, var2);
            if (var3 != null && var3.field185 == 0) {
                this.field8043[var2] = 0;
                this.field8040[var2] = 0;
            }
        }
        field8034++;
        this.field8035 = new class80(128);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3263(int arg0, int arg1, byte arg2) {
        int var3 = -83 / (arg2 / 60);
        field8036++;
        return class197.method1256(arg1, 7496, arg0) & ((arg1 & 0x2000) != 0 | class330.method2154(arg1, arg0, (byte) 29) | class623.method3573(arg1, (byte) -48, arg0));
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBI)V")
    public final void method3264(int arg0, byte arg1, int arg2) {
        field8046++;
        class310 var4 = class300.field4421.method1252(arg2, 0);
        int var5 = var4.field4556;
        int var6 = var4.field4555;
        if (arg1 != -114) {
            this.method3265((byte) 79, -120, 79);
        }
        int var7 = var4.field4558;
        int var8 = class521.field7570[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method3265((byte) 91, var5, arg0 << var6 & var9 | ~var9 & this.field8040[var5]);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)V")
    public final void method3265(byte arg0, int arg1, int arg2) {
        this.field8040[arg1] = arg2;
        field8042++;
        int var4 = 31 / ((54 - arg0) / 32);
        class550 var5 = (class550) this.field8035.method524((byte) 91, (long) arg1);
        if (var5 == null) {
            class550 var6 = new class550(class84.method550((byte) -92) + 500L);
            this.field8035.method520((byte) -91, var6, (long) arg1);
        } else {
            var5.field7848 = class84.method550((byte) -99) + 500L;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I")
    public final int method3196(int arg0, int arg1) {
        if (arg1 == 0) {
            field8030++;
            return this.field8040[arg0];
        } else {
            return 114;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
    public final void method3266(int arg0, int arg1, int arg2) {
        field8037++;
        this.field8043[arg0] = arg1;
        if (arg2 != 28848) {
            return;
        }
        class550 var4 = (class550) this.field8035.method524((byte) 118, (long) arg0);
        if (var4 == null) {
            class550 var5 = new class550(4611686018427387905L);
            this.field8035.method520((byte) -61, var5, (long) arg0);
        } else if (var4.field7848 != 4611686018427387905L) {
            var4.field7848 = class84.method550((byte) -108) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(FFFB)I")
    public static final int method3267(float arg0, float arg1, float arg2, byte arg3) {
        field8032++;
        float var4 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var5 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (arg3 < 3) {
            field8045 = null;
        }
        if (var4 < var5 && var6 < var5) {
            return (arg1 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var5 < var6) {
            return (arg2 > 0.0F) ? 2 : 3;
        } else if ((arg0 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(BII)V")
    public final void method3268(byte arg0, int arg1, int arg2) {
        field8039++;
        if (arg0 != -26) {
            this.field8043 = null;
        }
        class310 var4 = class300.field4421.method1252(arg1, 0);
        int var5 = var4.field4556;
        int var6 = var4.field4555;
        int var7 = var4.field4558;
        int var8 = class521.field7570[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method3266(var5, ~var9 & this.field8043[var5] | arg2 << var6 & var9, 28848);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)I")
    public final int method3195(int arg0, boolean arg1) {
        field8038++;
        if (!arg1) {
            return 54;
        }
        class310 var3 = class300.field4421.method1252(arg0, 0);
        int var4 = var3.field4556;
        int var5 = var3.field4555;
        int var6 = var3.field4558;
        int var7 = class521.field7570[var6 - var5];
        return this.field8040[var4] >> var5 & var7;
    }
}
