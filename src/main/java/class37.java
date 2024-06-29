import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class37 extends class114 {

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "[I")
    private int[] field534 = new int[this.field1796];

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "Ljava/lang/String;")
    public static String field529 = "glow2:";

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public static int field535 = -1;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "F")
    public static float field536;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "[B")
    private byte[] field528;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V", line = 4)
    public static void method282(int arg0) {
        if (arg0 == 0) {
            field529 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZIIIIILog;)Lrj;", line = 24)
    public static final class269 method283(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class295 arg6) {
        int var8 = (arg5 << 17) + ((arg0 ? 65536 : 0) + arg2 + (arg3 << 19));
        long var9 = (long) arg1 * 3147483667L + (long) var8 * 3849834839L;
        field540++;
        class269 var11 = (class269) class65.field938.method747(var9, (byte) 108);
        if (var11 != null) {
            return var11;
        }
        if (arg4 != -32534) {
            method282(108);
        }
        class164.field2663 = false;
        class269 var12 = class267.method1876(arg2, arg0, -2, arg1, arg5, false, arg3, arg6, false);
        if (var12 != null && !class164.field2663) {
            class65.field938.method744(var12, -15692, var9);
        }
        return var12;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIIF)V", line = 50)
    public class37(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field1796; var7++) {
            this.field534[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V", line = 70)
    public static final void method284(int arg0) {
        field530++;
        if (class1.field20 != null) {
            class1.field20.method1653(arg0 - 19746);
            class1.field20 = null;
        }
        class267.method1874((byte) 125);
        class241.method1673();
        for (int var1 = 0; var1 < 4; var1++) {
            class91.field1323[var1].method2386(arg0 + 12908);
        }
        class267.method1873(false, (byte) -32);
        System.gc();
        class239.method1664(2, (byte) 84);
        class132.field2016 = false;
        class276.field4284 = -1;
        class159.method1190(true, true);
        class234.field3559 = 0;
        class76.field1113 = false;
        class293.field4522 = 0;
        class327.field5054 = 0;
        class305.field4773 = 0;
        for (int var2 = 0; var2 < class118.field1837.length; var2++) {
            class118.field1837[var2] = null;
        }
        class234.field3563 = 0;
        class52.field702 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class201.field3096[var3] = null;
            class210.field3219[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class264.field4064[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class265.field4136[var5][var6][var7] = null;
                }
            }
        }
        class187.method1386(arg0 ^ 0x5C);
        class98.field1413 = arg0;
        class213.method1528(false);
        class270.method1889(-1206115993, true);
        try {
            class199.method1445(arg0 ^ 0xFFFFFF82, "loggedout", class330.field5074.field95);
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 164)
    public final void method285(int arg0) {
        field532++;
        this.field533 = 0;
        if (arg0 == 255) {
            this.field537 = 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V", line = 178)
    public final void method286(int arg0, int arg1, int arg2) {
        this.field537 += this.field534[arg1] * arg2 >> 12;
        if (arg0 < 31) {
            this.field537 = 17;
        }
        field538++;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(IB)V", line = 193)
    public void method287(int arg0, byte arg1) {
        field539++;
        this.field528[this.field533++] = (byte) ((class149.method1117(255, arg1) >> 1) + 127);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 205)
    public final void method288(byte arg0) {
        this.field537 = Math.abs(this.field537);
        field531++;
        if (this.field537 >= 4096) {
            this.field537 = 4095;
        }
        if (arg0 <= 112) {
            method284(45);
        }
        this.method287(this.field533++, (byte) (this.field537 >> 4));
        this.field537 = 0;
    }
}
