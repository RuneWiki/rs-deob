import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class396 {

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Z")
    public static boolean field5667 = false;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lgr;IIIII)V")
    public static final void method2502(class249 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3522 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class54.field754[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class404 var11 = class14.field280[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field3522; var12++) {
                            if (arg0.field3521[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field3521[arg0.field3522++] = var11;
                        if (arg0.field3522 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field3522; var13 < 4; var13++) {
            arg0.field3521[var13] = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BIIJ)V")
    public static final void method2503(byte arg0, int arg1, int arg2, long arg3) {
        field5670++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        int var6 = (int) arg3 >> 20 & 0x3;
        if (arg0 != -102) {
            method2502((class249) null, 16, 78, 3, -11, 33);
        }
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], var5, 0, arg2, var6, arg1, 0, arg0 + 101, 0, true);
            return;
        }
        class64 var8 = class375.method2395((byte) 107, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field872;
            var9 = var8.field950;
        } else {
            var9 = var8.field872;
            var10 = var8.field950;
        }
        int var11 = var8.field942;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class128.method878(class412.field5841.field5326[0], class412.field5841.field5332[0], 0, var10, arg2, 0, arg1, var11, -1, var9, true);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Z")
    public static final boolean method2504(byte arg0) {
        field5671++;
        try {
            int var1 = -12 / ((-arg0 - 25) / 46);
            return class329.method2126(-1);
        } catch (IOException var5) {
            class311.method2003(-1266);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class304.field4190 + "," + class206.field2833 + "," + class50.field698 + " - " + class15.field290 + "," + (class212.field2968 + class412.field5841.field5326[0]) + "," + (class412.field5841.field5332[0] + class447.field6269) + " - ";
            for (int var4 = 0; var4 < class15.field290 && var4 < 50; var4++) {
                var3 = var3 + class333.field4591.field230[var4] + ",";
            }
            class271.method1776(-2296, var6, var3);
            class389.method2466((byte) 111);
            return true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZIILms;)V")
    public static final void method2505(boolean arg0, int arg1, int arg2, class453 arg3) {
        if (!arg0) {
            method2502((class249) null, -16, 3, -91, 30, 101);
        }
        class288.field4050 = arg1;
        class57.field776 = arg2;
        class348.field4779 = arg3;
        field5669++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)Lnn;")
    public static final class239 method2506(boolean arg0) {
        field5668++;
        if (arg0) {
            field5667 = true;
        }
        class239 var1 = (class239) class7.field111.method2482(-24);
        if (var1 != null) {
            var1.method2467((byte) -103);
            var1.method2783((byte) -122);
            return var1;
        }
        class239 var2;
        do {
            var2 = (class239) class428.field6041.method2482(-43);
            if (var2 == null) {
                return null;
            }
            if (var2.method1624(true) > class385.method2442(-6631)) {
                return null;
            }
            var2.method2467((byte) -72);
            var2.method2783((byte) -122);
        } while ((var2.field6253 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method2507(byte arg0, byte[] arg1) {
        int var2 = -122 % ((arg0 + 73) / 41);
        field5666++;
        int var3 = arg1.length;
        byte[] var4 = new byte[var3];
        class36.method344(arg1, 0, var4, 0, var3);
        return var4;
    }
}
