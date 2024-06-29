import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class404 {

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    private int field5700 = -1;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    private int field5699 = 0;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "Lv;")
    private class165 field5693 = new class165();

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "Z")
    public boolean field5704 = false;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    private int field5688;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    private int field5691;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "[Lcc;")
    private class187[] field5698;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "[[I")
    private int[][] field5694;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "Lv;")
    public static class165 field5689 = new class165();

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "[[I")
    public static int[][] field5703 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "Z")
    public static boolean field5701;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "[I")
    public static int[] field5702;

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "[I")
    public static int[] field5705;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)[I")
    public final int[] method2475(int arg0, int arg1) {
        if (arg1 != 30011) {
            field5701 = true;
        }
        field5695++;
        if (this.field5691 == this.field5688) {
            this.field5704 = this.field5698[arg0] == null;
            this.field5698[arg0] = class685.field9570;
            return this.field5694[arg0];
        } else if (this.field5688 == 1) {
            this.field5704 = this.field5700 != arg0;
            this.field5700 = arg0;
            return this.field5694[0];
        } else {
            class187 var3 = this.field5698[arg0];
            if (var3 == null) {
                this.field5704 = true;
                if (this.field5688 <= this.field5699) {
                    class187 var4 = (class187) this.field5693.method1045((byte) -128);
                    var3 = new class187(arg0, var4.field2334);
                    this.field5698[var4.field2330] = null;
                    var4.method527(-11229);
                } else {
                    var3 = new class187(arg0, this.field5699);
                    this.field5699++;
                }
                this.field5698[arg0] = var3;
            } else {
                this.field5704 = false;
            }
            this.field5693.method1042(var3, arg1 + 1018821);
            return this.field5694[var3.field2334];
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Lhv;")
    public static final class226 method2476(int arg0) {
        field5696++;
        if (arg0 >= -72) {
            method2478((byte) -43);
        }
        if (class46.field490 == null || class290.field4278 == null) {
            return null;
        }
        class290.field4278.method2433(16, class46.field490);
        class226 var1 = (class226) class290.field4278.method2437(1316);
        if (var1 == null) {
            return null;
        } else {
            class547 var2 = class46.field485.method514(var1.field3433, (byte) -90);
            return var2 != null && var2.field7617 && var2.method3238(-2, class46.field481) ? var1 : class298.method1948(-10618);
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
    public final void method2477(int arg0) {
        field5692++;
        for (int var2 = arg0; var2 < this.field5688; var2++) {
            this.field5694[var2] = null;
        }
        this.field5694 = null;
        this.field5698 = null;
        this.field5693.method1046((byte) 125);
        this.field5693 = null;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V")
    public static void method2478(byte arg0) {
        field5702 = null;
        field5689 = null;
        field5703 = null;
        field5705 = null;
        if (arg0 <= 22) {
            method2479(-40, (byte) 23, 14, 42);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IBII)V")
    public static final void method2479(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = 32 % ((11 - arg1) / 58);
        class533.field7338 = new byte[arg2][arg0][arg3];
        field5697++;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
    public static final boolean method2480(int arg0, int arg1, int arg2) {
        if (arg0 >= -62) {
            return true;
        } else {
            field5690++;
            return class385.method2391((byte) 97, arg1, arg2) & class428.method2578(-71, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)[[I")
    public final int[][] method2481(int arg0) {
        field5687++;
        if (this.field5691 != this.field5688) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 >= -26) {
            field5703 = null;
        }
        for (int var2 = 0; var2 < this.field5688; var2++) {
            this.field5698[var2] = class685.field9570;
        }
        return this.field5694;
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(III)V")
    public class404(int arg0, int arg1, int arg2) {
        this.field5688 = arg0;
        this.field5691 = arg1;
        this.field5698 = new class187[this.field5691];
        this.field5694 = new int[this.field5688][arg2];
    }
}
