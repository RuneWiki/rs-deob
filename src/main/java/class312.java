import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class312 extends class150 {

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "Lkc;")
    public static class145 field4254;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "Lrt;")
    public class241 field4261;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "Lgj;")
    public static class662 field4256;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "[B")
    public byte[] field4255;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V", line = 15)
    public static void method1980(int arg0) {
        if (arg0 != -15805) {
            method1982((class199) null);
        }
        field4256 = null;
        field4254 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILfca;)Lhja;", line = 26)
    public static final class429 method1981(int arg0, class93 arg1) {
        ++field4258;
        class70 var2 = class111.method972((byte) 125, arg1);
        int var3 = arg1.method763(105);
        int var4 = arg1.method763(116);
        int var5 = -7 / ((-38 - arg0) / 52);
        int var6 = arg1.method763(-32);
        int var7 = arg1.method763(81);
        int var8 = arg1.method763(-4);
        int var9 = arg1.method763(-42);
        return new class429(var2.field1041, var2.field1039, var2.field1035, var2.field1033, var2.field1031, var2.field1030, var2.field1032, var2.field1034, var2.field1040, var3, var4, var6, var7, var8, var9);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I", line = 50)
    public final int method1192(int arg0) {
        ++field4260;
        if (super.field2489) {
            return 0;
        } else {
            if (arg0 != 100) {
                method1981(65, (class93) null);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)[B", line = 67)
    public final byte[] method1194(byte arg0) {
        ++field4257;
        if (arg0 != 118) {
            this.field4255 = null;
        }
        if (super.field2489) {
            throw new RuntimeException();
        } else {
            return this.field4255;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lffa;)V", line = 87)
    public static final void method1982(class199 arg0) {
        if (class155.field2534 < 65535) {
            class307 var1 = arg0.field3001;
            class98.field1601[class155.field2534] = arg0;
            class444.field6025[class155.field2534] = false;
            ++class155.field2534;
            int var2 = arg0.field3015;
            if (arg0.field3002) {
                var2 = 0;
            }
            int var3 = arg0.field3015;
            if (arg0.field3019) {
                var3 = class62.field856 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method1958(true) - var1.method1963((byte) 108) + class370.field5022 >> class654.field9055;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method1958(true) + var1.method1963((byte) 126) - class370.field5022 >> class654.field9055;
                if (var7 >= class375.field5083) {
                    var7 = class375.field5083 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field3014[var5++];
                    int var10 = (var1.method1962(0) - var1.method1963((byte) 124) + class370.field5022 >> class654.field9055) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class441.field5980) {
                        var11 = class441.field5980 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class227.field3295[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class227.field3295[var4][var12][var8] = var13 | (long) class155.field2534;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class227.field3295[var4][var12][var8] = var13 | (long) class155.field2534 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class227.field3295[var4][var12][var8] = var13 | (long) class155.field2534 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class227.field3295[var4][var12][var8] = var13 | (long) class155.field2534 << 48;
                        }
                    }
                }
            }
        }
    }
}
