import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class145 {

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Lok;")
    public static class41 field2211 = class137.method956("Ablegen", 45);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public int field2216;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "[B")
    public byte[] field2212;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "[B")
    public byte[] field2213;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 11)
    public static final void method1000(int arg0) {
        field2208++;
        class35.field532.method135(18436);
        if (arg0 != -1225681535) {
            method1000(-58);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 29)
    public static void method1001(byte arg0) {
        field2211 = null;
        if (arg0 != 61) {
            field2211 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V", line = 40)
    public static final void method1002(int arg0) {
        if (class43.field679 != null) {
            class252 var1 = class43.field679;
            synchronized (class43.field679) {
                class43.field679 = null;
            }
        }
        if (arg0 != -22841) {
            method1005(-15, false);
        }
        field2209++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIB)V", line = 63)
    public static final void method1003(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2214++;
        if (arg4 != -32) {
            field2211 = (class41) null;
        }
        class273.field4449 = arg3;
        class153.field2439 = arg2;
        class15.field192 = arg0;
        class237.field3801 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZIIIIIIIIII)Z", line = 78)
    public static final boolean method1004(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2207++;
        if (class62.field913.method1753((byte) -15) == 2) {
            return class41.method311(arg4, -31429, arg3, arg5, arg9, arg7, arg11, arg6, arg0, arg1, arg2, arg8);
        } else if (class62.field913.method1753((byte) -15) > 2) {
            return class38.method258(19661187, arg1, arg4, arg11, arg9, arg0, arg3, arg7, arg5, arg6, arg2, arg8, class62.field913.method1753((byte) -15));
        } else {
            if (arg10 >= -120) {
                field2211 = (class41) null;
            }
            return class286.method2007(arg1, arg0, arg2, arg6, arg7, arg11, arg9, arg4, arg3, arg5, arg8, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V", line = 104)
    public static final void method1005(int arg0, boolean arg1) {
        if (arg0 != 13) {
            field2211 = (class41) null;
        }
        field2210++;
        byte[][] var2;
        byte var3;
        if (class166.field2625 && arg1) {
            var2 = class62.field902;
            var3 = 1;
        } else {
            var2 = class14.field187;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class234.method1685(-20783);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class248.field3959[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = (var7 & 0x38DE31C) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = (var7 & 0x3FFF) >> 3;
                            int var12 = var7 >> 14 & 0x3FF;
                            int var13 = (var12 / 8 << 8) + (var11 / 8);
                            for (int var14 = 0; var14 < class110.field1557.length; var14++) {
                                if (class110.field1557[var14] == var13 && var2[var14] != null) {
                                    var8 = true;
                                    class207.method1462(arg0 ^ 0xFFFFFF84, arg1, var9, var5 * 8, var4, var2[var14], (var12 & 0x7) * 8, class222.field3548, (var11 & 0x7) * 8, var6 * 8, var10);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class133.method935(var6 * 8, 8, 8, var5 * 8, var4, (byte) 100);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)[F", line = 197)
    public static final float[] method1006(int arg0, byte arg1) {
        field2201++;
        float var2 = class58.method411() + class58.method409();
        int var3 = class58.method406();
        int var4 = 94 % ((arg1 - 29) / 33);
        float var5 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var6 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        class256.field4106[3] = 1.0F;
        float var7 = 0.58823526F;
        class256.field4106[0] = var2 * (float) class217.method1563(255, arg0 >> 16) / 255.0F * var6 * var7;
        class256.field4106[1] = var2 * var7 * var5 * ((float) (class217.method1563(arg0, 65301) >> 8) / 255.0F);
        float var8 = (float) (var3 & 0xFF) / 255.0F;
        class256.field4106[2] = var2 * var7 * (float) class217.method1563(255, arg0) / 255.0F * var8;
        return class256.field4106;
    }
}
