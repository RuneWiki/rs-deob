import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class454 extends class683 {

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
    private int field6512 = -1;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "F")
    public static float field6506;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "Lns;")
    public static class423 field6507;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lhr;B)V")
    public final void method1668(class551 arg0, byte arg1) {
        if (arg1 == -60) {
            field6510++;
            arg0.method3172(arg1 + 22225, this.field6512);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ldt;I)V")
    public final void method1666(class254 arg0, int arg1) {
        this.field6512 = arg0.method1728((byte) 48);
        field6505++;
        arg0.method1731((byte) 64);
        if (arg0.method1731((byte) 64) != 255) {
            arg0.field3725--;
            arg0.method1723(21795);
        }
        if (arg1 >= -81) {
            method2696(11);
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
    public static final void method2696(int arg0) {
        field6509++;
        short var1 = 1024;
        short var2 = 3072;
        if (class408.field5786) {
            var2 = 4096;
            if (class52.field625) {
                var1 = 2048;
            }
        }
        if (class294.field4169 < (float) var1) {
            class294.field4169 = var1;
        }
        while (class514.field7144 >= 16384.0F) {
            class514.field7144 -= 16384.0F;
        }
        if (class294.field4169 > (float) var2) {
            class294.field4169 = var2;
        }
        while (class514.field7144 < 0.0F) {
            class514.field7144 += 16384.0F;
        }
        int var3 = class439.field6328 >> 9;
        int var4 = class400.field5722 >> 9;
        if (arg0 != 4) {
            field6506 = -0.8704953F;
        }
        int var5 = class778.method4273(class400.field5722, (byte) -28, class439.field6328, class184.field2420);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && class102.field1467 - 4 > var3 && class393.field5663 - 4 > var4) {
            for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                for (int var8 = var4 - 4; var8 <= (var4 + 4); var8++) {
                    int var9 = class184.field2420;
                    if (var9 < 3 && class49.method310(var7, var8, (byte) 80)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class131.field1803.field6787 != null && class131.field1803.field6787[var9] != null) {
                        var10 = (class131.field1803.field6787[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class645.field8694 != null && class645.field8694[var9] != null) {
                        int var11 = var10 + var5 - class645.field8694[var9].method1898(var8, var7, (byte) -121);
                        if (var11 > var6) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (var12 > class335.field4729) {
            class335.field4729 += (var12 - class335.field4729) / 24;
        } else if (var12 < class335.field4729) {
            class335.field4729 += (var12 - class335.field4729) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLdt;)Lbu;")
    public static final class21 method2697(boolean arg0, class254 arg1) {
        field6511++;
        if (!arg0) {
            field6506 = -0.11184928F;
        }
        return new class21(arg1.method1695(423951304), arg1.method1695(423951304), arg1.method1695(423951304), arg1.method1695(423951304), arg1.method1695(423951304), arg1.method1695(423951304), arg1.method1695(423951304), arg1.method1695(423951304), arg1.method1722(false), arg1.method1731((byte) 64));
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public static void method2698(byte arg0) {
        field6507 = null;
        if (arg0 <= 118) {
            method2698((byte) 31);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZIILofa;I)V")
    public static final void method2699(boolean arg0, int arg1, int arg2, class347 arg3, int arg4) {
        field6508++;
        int var5 = arg3.field4986;
        if (arg3.field4993 == 0) {
            arg3.field4986 = arg3.field4964;
        } else if (arg3.field4993 == 1) {
            arg3.field4986 = arg2 - arg3.field4964;
        } else if (arg3.field4993 == 2) {
            arg3.field4986 = arg3.field4964 * arg2 >> 14;
        }
        int var6 = arg3.field4940;
        int var7 = 107 / ((arg4 - 49) / 36);
        if (arg3.field5019 == 0) {
            arg3.field4940 = arg3.field4927;
        } else if (arg3.field5019 == 1) {
            arg3.field4940 = arg1 - arg3.field4927;
        } else if (arg3.field5019 == 2) {
            arg3.field4940 = arg3.field4927 * arg1 >> 14;
        }
        if (arg3.field4993 == 4) {
            arg3.field4986 = arg3.field4940 * arg3.field4901 / arg3.field4952;
        }
        if (arg3.field5019 == 4) {
            arg3.field4940 = arg3.field4986 * arg3.field4952 / arg3.field4901;
        }
        if (class341.field4764 && (client.method2055(arg3).field4635 != 0 || arg3.field4884 == 0)) {
            if (arg3.field4940 < 5 && arg3.field4986 < 5) {
                arg3.field4940 = 5;
                arg3.field4986 = 5;
            } else {
                if (arg3.field4940 <= 0) {
                    arg3.field4940 = 5;
                }
                if (arg3.field4986 <= 0) {
                    arg3.field4986 = 5;
                }
            }
        }
        if (class386.field5614 == arg3.field4970) {
            class400.field5718 = arg3;
        }
        if (arg0 && arg3.field4879 != null && arg3.field4986 != var5 || arg3.field4940 != var6) {
            class158 var8 = new class158();
            var8.field2137 = arg3;
            var8.field2128 = arg3.field4879;
            class780.field10708.method689(var8, 104);
        }
    }
}
