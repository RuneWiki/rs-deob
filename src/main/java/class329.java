import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class329 extends class106 implements class194 {

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    private int field4451;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lem;")
    public static class206 field4449 = new class206(60, 3);

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Ltp;")
    public static class494 field4456 = new class494();

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
    public static void method1955(int arg0) {
        field4456 = null;
        field4449 = null;
        if (arg0 != -25415) {
            field4456 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)I")
    public final int method591(boolean arg0) {
        ++field4454;
        return !arg0 ? -64 : 0;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)I")
    public final int method590(int arg0) {
        ++field4453;
        int var2 = -89 / ((arg0 - -23) / 36);
        return this.field4451;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[BII)V")
    public final void method595(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field4455;
        this.method777(arg1, arg2);
        if (arg3 != -24007) {
            method1957(79);
        }
        this.field4451 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Llj;ILjaclib/memory/Buffer;)V")
    public class329(class565 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field4451 = arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIBI)V")
    public static final void method1956(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field4450;
        int var5 = 0;
        if (arg3 <= -62) {
            int var6 = arg1;
            int var7 = -arg1;
            int var8 = -1;
            int var9 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1 + arg2);
            int var10 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg2 - arg1);
            class470.method2660(var10, var9, class344.field4599[arg4], (byte) 11, arg0);
            while (var5 < var6) {
                var8 += 2;
                var7 += var8;
                if (var7 > 0) {
                    --var6;
                    var7 -= var6 << 1;
                    int var11 = -var6 + arg4;
                    int var12 = arg4 + var6;
                    if (var12 >= class469.field6466 && ~class533.field7200 <= ~var11) {
                        int var13 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg2 + var5);
                        int var14 = class280.method1727((byte) 94, class529.field7169, class128.field1831, -var5 + arg2);
                        if (~class533.field7200 <= ~var12) {
                            class470.method2660(var14, var13, class344.field4599[var12], (byte) 11, arg0);
                        }
                        if (class469.field6466 <= var11) {
                            class470.method2660(var14, var13, class344.field4599[var11], (byte) 11, arg0);
                        }
                    }
                }
                ++var5;
                int var15 = arg4 - var5;
                int var16 = arg4 + var5;
                if (var16 >= class469.field6466 && var15 <= class533.field7200) {
                    int var17 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg2 + var6);
                    int var18 = class280.method1727((byte) 94, class529.field7169, class128.field1831, -var6 + arg2);
                    if (~var16 >= ~class533.field7200) {
                        class470.method2660(var18, var17, class344.field4599[var16], (byte) 11, arg0);
                    }
                    if (var15 >= class469.field6466) {
                        class470.method2660(var18, var17, class344.field4599[var15], (byte) 11, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)J")
    public final long method593(int arg0) {
        ++field4457;
        if (arg0 != -24269) {
            this.method595(69, (byte[]) null, -124, -107);
        }
        return super.field1487.getAddress();
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
    public static final void method1957(int arg0) {
        ++field4452;
        if (arg0 == 0) {
            if (class610.field8464 != null) {
                class374[] var1 = class610.field8464;
                for (int var2 = 0; ~var1.length < ~var2; ++var2) {
                    class374 var3 = var1[var2];
                    var3.method2151((byte) -122);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Llj;I[BI)V")
    public class329(class565 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4451 = arg1;
    }
}
