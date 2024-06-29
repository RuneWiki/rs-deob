import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class48 {

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
    public static int[] field878 = new int[256];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lal;")
    public static class230 field874;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)Z")
    public static final boolean method307(boolean arg0) {
        field880++;
        try {
            if (arg0) {
                field874 = null;
            }
            if (class76.field1375 == 2) {
                if (class243.field4276 == null) {
                    class243.field4276 = class280.method1928(class128.field2254, class99.field1757, class93.field1643);
                    if (class243.field4276 == null) {
                        return false;
                    }
                }
                if (class230.field4024 == null) {
                    class230.field4024 = new class206(class146.field2633, class276.field4938);
                }
                if (class189.field3382.method579(class230.field4024, 9, 22050, class269.field4841, class243.field4276)) {
                    class189.field3382.method549((byte) -109);
                    class189.field3382.method567(class71.field1246, 52);
                    class189.field3382.method570(124, class243.field4276, class10.field133);
                    class76.field1375 = 0;
                    class128.field2254 = null;
                    class243.field4276 = null;
                    class230.field4024 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class189.field3382.method553(-118);
            class230.field4024 = null;
            class76.field1375 = 0;
            class243.field4276 = null;
            class128.field2254 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final void method308(byte arg0) {
        class253.field4437++;
        class208.field3720.method162(2, 184);
        field875++;
        for (class3 var1 = (class3) class34.field499.method633((byte) 33); var1 != null; var1 = (class3) class34.field499.method630(11)) {
            if (var1.field37 == 0) {
                class40.method239(var1, true, 15361);
            }
        }
        if (arg0 == 10 && class263.field4677 != null) {
            class182.method1267(class263.field4677, 103);
            class263.field4677 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method309(int arg0) {
        if (arg0 != 1) {
            field877 = 28;
        }
        field878 = null;
        field874 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBIIII)V")
    public static final void method310(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field879++;
        int var6 = arg0 - arg4;
        int var7 = arg3 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class82.method611(arg0, arg4, arg1 - 59, arg5, arg2);
            }
        } else if (var6 == 0) {
            class230.method1546(arg4, arg3, 28375, arg5, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg5;
                arg5 = arg4;
                arg4 = var9;
                int var10 = arg3;
                arg3 = arg0;
                arg0 = var10;
            }
            if (arg3 < arg5) {
                int var11 = arg4;
                int var12 = arg5;
                arg5 = arg3;
                arg3 = var12;
                arg4 = arg0;
                arg0 = var11;
            }
            if (arg1 == 67) {
                int var13 = arg0 - arg4;
                int var14 = arg4;
                if (var13 < 0) {
                    var13 = -var13;
                }
                int var15 = arg3 - arg5;
                int var16 = -(var15 >> 1);
                int var17 = arg4 < arg0 ? 1 : -1;
                if (var8) {
                    for (int var18 = arg5; var18 <= arg3; var18++) {
                        class15.field220[var18][var14] = arg2;
                        var16 += var13;
                        if (var16 > 0) {
                            var16 -= var15;
                            var14 += var17;
                        }
                    }
                } else {
                    for (int var19 = arg5; var19 <= arg3; var19++) {
                        class15.field220[var14][var19] = arg2;
                        var16 += var13;
                        if (var16 > 0) {
                            var16 -= var15;
                            var14 += var17;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[III[I)V")
    public static final void method311(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg0 != 1) {
            return;
        }
        field873++;
        if (arg2 <= arg3) {
            return;
        }
        int var5 = (arg3 + arg2) / 2;
        int var6 = arg3;
        int var7 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var7;
        int var8 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var8;
        for (int var9 = arg3; var9 < arg2; var9++) {
            if (arg1[var9] > ((var9 & 0x1) + var7)) {
                int var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                int var11 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6++] = var11;
            }
        }
        arg1[arg2] = arg1[var6];
        arg1[var6] = var7;
        arg4[arg2] = arg4[var6];
        arg4[var6] = var8;
        method311(1, arg1, var6 - 1, arg3, arg4);
        method311(arg0, arg1, arg2, var6 + 1, arg4);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field878[var0] = var1;
        }
    }
}
