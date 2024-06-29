import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class184 implements class582 {

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Lpj;")
    private class132 field2708;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "Lni;")
    public class479 field2703;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field2710 = 0;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "Lpo;")
    public static class513 field2707 = new class513(0, -1);

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "Lfc;")
    public static class235 field2711 = new class235(18, 3);

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "Lof;")
    public static class568 field2712 = new class568(0, 16);

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "J")
    public static long field2713;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Lxa;")
    public class461 field2709;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 3)
    public final void method108(int arg0) {
        field2706++;
        this.field2709 = class110.method823(this.field2708.method938(this.field2703.field6686, (byte) -53), true);
        this.method109(8444, true);
        int var2 = 62 / ((arg0 - 41) / 54);
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V", line = 18)
    public static void method1236(int arg0) {
        field2711 = null;
        field2712 = null;
        if (arg0 >= -43) {
            field2712 = null;
        }
        field2707 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZ)V", line = 30)
    public void method109(int arg0, boolean arg1) {
        field2704++;
        if (arg1) {
            int var3 = this.field2703.field6683.method371(this.field2709.method33(), (byte) -111, class652.field9217) + this.field2703.field6687;
            int var4 = this.field2703.field6685.method2192(class603.field8386, 2, this.field2709.method29()) + this.field2703.field6690;
            this.field2709.method2660(var3, var4);
        }
        if (arg0 != 8444) {
            field2707 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lpu;)V", line = 52)
    public static final void method1237(class517 arg0) {
        if (class68.field935 >= 65535) {
            return;
        }
        class154 var1 = arg0.field7053;
        class324.field4793[class68.field935] = arg0;
        class250.field3526[class68.field935] = false;
        class68.field935++;
        int var2 = arg0.field7057;
        if (arg0.field7055) {
            var2 = 0;
        }
        int var3 = arg0.field7057;
        if (arg0.field7061) {
            var3 = class552.field7467 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method1074(0) + class634.field8905 - var1.method1072(2) >> class627.field8753;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method1074(0) + var1.method1072(2) - class634.field8905 >> class627.field8753;
            if (var7 >= class22.field308) {
                var7 = class22.field308 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field7063[var5++];
                int var10 = (var1.method1079(-868177151) + class634.field8905 - var1.method1072(2) >> class627.field8753) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class137.field1931) {
                    var11 = class137.field1931 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class185.field2716[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class185.field2716[var4][var12][var8] = var13 | (long) class68.field935;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class185.field2716[var4][var12][var8] = var13 | (long) class68.field935 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class185.field2716[var4][var12][var8] = var13 | (long) class68.field935 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class185.field2716[var4][var12][var8] = var13 | (long) class68.field935 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Z", line = 146)
    public final boolean method104(byte arg0) {
        field2705++;
        if (arg0 < 18) {
            this.field2708 = null;
        }
        return this.field2708.method947(127, this.field2703.field6686);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lpj;Lni;)V", line = 159)
    public class184(class132 arg0, class479 arg1) {
        this.field2708 = arg0;
        this.field2703 = arg1;
    }
}
