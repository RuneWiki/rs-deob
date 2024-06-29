import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class336 extends class270 {

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    private int field4810 = 4096;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    private int field4814 = 0;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "[I")
    public static int[] field4806 = new int[1000];

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "Ljava/lang/String;")
    public static String field4817 = "";

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public static int field4809 = 0;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(B)V", line = 5)
    public static void method2185(byte arg0) {
        field4817 = null;
        int var1 = 64 % ((arg0 - -3) / 41);
        field4806 = null;
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(B)V", line = 19)
    public static final void method2186(byte arg0) {
        ++field4816;
        if (!class88.field1411) {
            if (class324.field4673) {
                class436.field6359 = (float) ((int) class436.field6359 + 47 & -16);
            } else {
                class247.field3586 += (12.0F - class247.field3586) / 2.0F;
            }
            class206.field3020 = true;
            if (arg0 != 77) {
                field4811 = 103;
            }
            class88.field1411 = true;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZ)V", line = 44)
    public static final void method2187(int arg0, boolean arg1) {
        class11.method65((byte) -113);
        ++field4812;
        if (class240.field3463 == 30 || class240.field3463 == 25) {
            ++class437.field6371;
            if (~class437.field6371 <= arg0 || arg1) {
                class437.field6371 = 0;
                if (!class61.field991 && class124.field2028 != null) {
                    class13.field216.method2781(false, 104);
                    ++class407.field5937;
                    try {
                        class124.field2028.method1653(class13.field216.field578, 3, class13.field216.field565, 0);
                        class13.field216.field565 = 0;
                    } catch (IOException var2) {
                        class61.field991 = true;
                    }
                }
                class11.method65((byte) 76);
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)[I", line = 76)
    public final int[] method81(byte arg0, int arg1) {
        ++field4807;
        int[] var3 = super.field4053.method396(arg1, -72);
        if (super.field4053.field815) {
            int[] var4 = this.method1927(0, 0, arg1);
            for (int var5 = 0; class161.field2445 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field4814 >= ~var6 && var6 <= this.field4810 ? 4096 : 0;
            }
        }
        if (arg0 <= 26) {
            field4815 = 55;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLec;I)V", line = 112)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field4810 = arg1.method320((byte) -87);
            }
        } else {
            this.field4814 = arg1.method320((byte) -87);
        }
        ++field4813;
        if (arg0 != 108) {
            field4815 = -26;
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 154)
    public class336() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BZLjava/lang/String;)V", line = 161)
    public static final void method2188(byte arg0, boolean arg1, String arg2) {
        ++field4808;
        class40.field620.field2564 = 1;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 1 / ((arg0 - 56) / 43);
        int var6 = 0;
        for (int var7 = 0; ~var7 > ~class100.field1555; ++var7) {
            class124 var10 = class206.method1561(-108, var7);
            if ((!arg1 || var10.field2017) && var10.field1957 == -1 && ~var10.field2034 == 0 && ~var10.field1997 == -1 && ~var10.field1999.toLowerCase().indexOf(var3) != 0) {
                if (~var6 <= -251) {
                    class384.field5515 = -1;
                    class380.field5385 = null;
                    return;
                }
                if (var4.length <= var6) {
                    short[] var11 = new short[var4.length * 2];
                    for (int var12 = 0; var6 > var12; ++var12) {
                        var11[var12] = var4[var12];
                    }
                    var4 = var11;
                }
                var4[var6++] = (short) var7;
            }
        }
        class380.field5385 = var4;
        class384.field5515 = var6;
        class279.field4190 = 0;
        String[] var8 = new String[class384.field5515];
        for (int var9 = 0; ~class384.field5515 < ~var9; ++var9) {
            var8[var9] = class206.method1561(-99, var4[var9]).field1999;
        }
        class254.method1843(var8, class380.field5385, 0);
        class40.field620.method1343(-113);
        class40.field620.field2564 = 2;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(III)Lim;", line = 235)
    public static final class350 method2189(int arg0, int arg1, int arg2) {
        class168 var3 = class443.field6447[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2506;
    }
}
