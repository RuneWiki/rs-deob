import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class203 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2716 = 0;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lfd;")
    public static class194 field2717 = null;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lph;")
    public static class114 field2718 = new class114(30);

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lmk;")
    public static class154 field2721 = new class154();

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2723 = 0;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[[I")
    public static int[][] field2722;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 6)
    public static void method1101(byte arg0) {
        int var1 = -35 % ((-arg0 - 26) / 43);
        field2718 = null;
        field2717 = null;
        field2721 = null;
        field2722 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIZ[BIILvm;I[Lqs;II)V", line = 27)
    public static final void method1102(int arg0, byte arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6, class322 arg7, int arg8, class438[] arg9, int arg10, int arg11) {
        field2719++;
        class250 var12 = new class250(arg4);
        if (arg1 < 115) {
            method1101((byte) -69);
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method1369((byte) 47);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1383(255);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method1350(31351);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg5 == var19 && var18 >= arg0 && arg0 + 8 > var18 && arg6 <= var17 && var17 < (arg6 + 8)) {
                    class225 var23 = class281.method1655((byte) -28, var13);
                    int var24 = arg8 + class108.method571(var23.field3019, var18 & 0x7, (byte) -70, var22, arg10, var23.field2995, var17 & 0x7);
                    int var25 = arg11 + class179.method947(var22, (byte) -108, var18 & 0x7, var23.field3019, var23.field2995, arg10, var17 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < class315.field4214 - 1 && class340.field4549 - 1 > var25) {
                        class438 var26 = null;
                        if (!arg3) {
                            int var27 = arg2;
                            if ((class282.field3872[1][var24][var25] & 0x2) == 2) {
                                var27 = arg2 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg9[var27];
                            }
                        }
                        client.method1414(arg3, var25, var24, arg2, true, -1, var26, var13, var21, arg2, 0, arg7, arg10 + var22 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 112)
    public static final void method1103(int arg0) {
        field2715++;
        if (class41.field432 < 1024.0F) {
            class41.field432 = 1024.0F;
        }
        while (class425.field6241 >= 16384.0F) {
            class425.field6241 -= 16384.0F;
        }
        if (class41.field432 > 3072.0F) {
            class41.field432 = 3072.0F;
        }
        while (class425.field6241 < 0.0F) {
            class425.field6241 += 16384.0F;
        }
        int var1 = class449.field6526 >> 7;
        int var2 = class275.field3706 >> 7;
        int var3 = class201.method1098(class449.field6526, class275.field3706, class263.field3592, (byte) 96);
        int var4 = arg0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class263.field3592;
                    if (var7 < 3 && class67.method381((byte) -14, var6, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class271.field3670 != null && class271.field3670[var7] != null) {
                        var8 = (class271.field3670[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 - (class98.field1161[var7].method271(var5, var6) - var8);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class96.field1142) {
            class96.field1142 += (var10 - class96.field1142) / 24;
        } else if (class96.field1142 > var10) {
            class96.field1142 += (var10 - class96.field1142) / 80;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZC)Z", line = 196)
    public static final boolean method1104(boolean arg0, char arg1) {
        if (arg0) {
            field2721 = null;
        }
        field2720++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }
}
