import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class57 {

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "Lak;")
    public static class498 field967 = new class498();

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field971 = 0;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lcs;I)V")
    public static final void method546(class335 arg0, int arg1) {
        int var2 = -10 / ((64 - arg1) / 54);
        field968++;
        if (arg0.field4591 == null && arg0.field4557 == null) {
            return;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < arg0.field4591.length; var4++) {
            int var5 = -1;
            if (arg0.field4591 != null) {
                var5 = arg0.field4591[var4];
            }
            if (var5 != -1) {
                var3 = false;
                boolean var6 = false;
                boolean var7 = false;
                int var10;
                int var12;
                if ((var5 & 0xC0000000) == -1073741824) {
                    int var8 = var5 & 0xFFFFFFF;
                    int var9 = var8 >> 14;
                    var10 = arg0.field3923 - ((var9 - class41.field693) * 512) - 256;
                    int var11 = var8 & 0x3FFF;
                    var12 = arg0.field3916 - ((var11 - class71.field1085) * 512) - 256;
                } else if ((var5 & 0x8000) == 0) {
                    class63 var13 = (class63) class389.field5608.method4020((long) var5, (byte) -65);
                    if (var13 == null) {
                        arg0.method2060((byte) 74, -1, var4);
                        continue;
                    }
                    class571 var14 = var13.field1004;
                    var12 = arg0.field3916 - var14.field3916;
                    var10 = arg0.field3923 - var14.field3923;
                } else {
                    int var15 = var5 & 0x7FFF;
                    class639 var16 = class536.field7796[var15];
                    if (var16 == null) {
                        arg0.method2060((byte) 84, -1, var4);
                        continue;
                    }
                    var12 = arg0.field3916 - var16.field3916;
                    var10 = arg0.field3923 - var16.field3923;
                }
                if (var10 != 0 || var12 != 0) {
                    arg0.method2060((byte) 33, (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF, var4);
                }
            } else if (!arg0.method2060((byte) 63, -1, var4)) {
                var3 = false;
            }
        }
        if (var3) {
            arg0.field4591 = null;
            arg0.field4557 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field966++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public static void method547(byte arg0) {
        field967 = null;
        if (arg0 != -77) {
            method548(28, 39, -32);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)I")
    public static final int method548(int arg0, int arg1, int arg2) {
        field970++;
        if (arg1 != 28612) {
            field972 = 95;
        }
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(II)V")
    public class57(int arg0, int arg1) {
        this.field964 = arg1;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBI)V")
    public static final void method549(int arg0, byte arg1, int arg2) {
        field965++;
        class327.field4442 = arg2;
        class271.field3851 = arg0;
        if (arg1 < 92) {
            method547((byte) 88);
        }
        if (class270.field3833 == 0) {
            class222.field3279 = class572.field8257 * 2 + class271.field3851;
            class492.field7090 = class327.field4442 + (class678.field9625 * 2);
        } else if (class270.field3833 == 1) {
            class595.field8451 = class327.field4442 / class519.field7488 + class635.field8963 + 2;
            class565.field8192 = class271.field3851 / class381.field5523 + class272.field3855 + 2;
            class222.field3279 = class565.field8192 * class381.field5523;
            class492.field7090 = class595.field8451 * class519.field7488;
            class678.field9625 = class492.field7090 - class327.field4442 >> 1;
            class572.field8257 = class222.field3279 - class271.field3851 >> 1;
        } else if (class270.field3833 == 2) {
            class222.field3279 = class271.field3851;
            class492.field7090 = class327.field4442;
            return;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([Lqk;BI)V")
    public static final void method550(class146[] arg0, byte arg1, int arg2) {
        if (arg1 >= -108) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class146 var4 = arg0[var3];
            if (var4 != null && var4.field2109 == arg2 && !client.method2735(var4)) {
                if (var4.field2112 == 0) {
                    method550(arg0, (byte) -126, var4.field2079);
                    if (var4.field2019 != null) {
                        method550(var4.field2019, (byte) -115, var4.field2079);
                    }
                    class182 var5 = (class182) class591.field8410.method4020((long) var4.field2079, (byte) -66);
                    if (var5 != null) {
                        class339.method2088(var5.field2505, 3705);
                    }
                }
                if (var4.field2112 == 6 && var4.field2062 != -1) {
                    class131 var6 = class610.field8698.method2999(var4.field2062, false);
                    if (var6 != null) {
                        var4.field2007 += class731.field10244;
                        int var7 = var4.field1986;
                        while (var4.field2007 > var6.field1812[var4.field1986]) {
                            var4.field2007 -= var6.field1812[var4.field1986];
                            var4.field1986++;
                            if (var6.field1792.length <= var4.field1986) {
                                var4.field1986 -= var6.field1800;
                                if (var4.field1986 < 0 || var4.field1986 >= var6.field1792.length) {
                                    var4.field1986 = 0;
                                }
                            }
                            var4.field2070 = var4.field1986 + 1;
                            if (var4.field2070 >= var6.field1792.length) {
                                var4.field2070 -= var6.field1800;
                                if (var4.field2070 < 0 || var4.field2070 >= var6.field1792.length) {
                                    var4.field2070 = -1;
                                }
                            }
                            class401.method2439(1723, var4);
                        }
                        if (var4.field1986 != var7) {
                            class348.method2217(256, var6, var4.field1986);
                        }
                    }
                }
            }
        }
        field969++;
    }
}
