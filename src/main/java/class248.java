import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class248 extends class175 {

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "Z")
    public static boolean field4292 = true;

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
    public static int field4297 = 0;

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "Loa;")
    public static class262 field4296 = new class262();

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "I")
    private int field4298;

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "I")
    private int field4300;

    @OriginalMember(owner = "client!fj", name = "ab", descriptor = "I")
    private int field4301;

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class248() {
        this(0);
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(B)V")
    public static final void method1733(byte arg0) {
        ++field4295;
        if (arg0 <= 111) {
            method1737((byte) -35);
        }
        for (int var1 = 0; class157.field2745 > var1; ++var1) {
            int var2 = class78.field1335[var1];
            class47 var3 = class22.field371[var2];
            int var4 = class1.field4.method1651(4139);
            if ((var4 & 8) != 0) {
                var4 += class1.field4.method1651(4139) << 8;
            }
            class19.method142(var4, var3, -300, var2);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        if (arg1 != 64) {
            method1736(23, true);
        }
        ++field4291;
        int[][] var3 = super.field3035.method637(arg0, false);
        if (super.field3035.field1493) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class1.field11 > var7; ++var7) {
                var4[var7] = this.field4301;
                var5[var7] = this.field4298;
                var6[var7] = this.field4300;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)Lde;")
    public static final class193 method1734(int arg0, int arg1) {
        ++field4293;
        if (arg1 >= -90) {
            method1737((byte) -52);
        }
        class193 var2 = (class193) class10.field166.method84(-106, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class181.field3136.method23(arg0, 103, 4);
            class193 var4 = new class193();
            if (var3 != null) {
                var4.method1350(arg0, new class239(var3), (byte) 8);
            }
            class10.field166.method88(var4, 16518, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field4299;
        if (~arg1 == -1) {
            this.method1735(arg2.method1660(-335289648), -1408737204);
        }
        int var5 = -26 / ((arg0 - -22) / 58);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I)V")
    private class248(int arg0) {
        super(0, false);
        this.method1735(arg0, -1408737204);
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)V")
    private final void method1735(int arg0, int arg1) {
        this.field4301 = arg0 >> 12 & 4080;
        this.field4298 = 4080 & arg0 >> 4;
        ++field4290;
        this.field4300 = (arg0 & 255) << 4;
        if (arg1 != -1408737204) {
            method1736(26, true);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)V")
    public static final void method1736(int arg0, boolean arg1) {
        ++field4294;
        class43 var2 = class270.method1847(arg0, -10277, 3);
        if (arg1) {
            method1737((byte) 75);
        }
        var2.method339(!arg1);
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(B)V")
    public static void method1737(byte arg0) {
        field4296 = null;
        if (arg0 >= -59) {
            method1736(-18, false);
        }
    }
}
