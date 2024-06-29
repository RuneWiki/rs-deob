import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class class120 extends class254 {

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public static int field2126 = 0;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field2134 = 0;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "Lnh;")
    public static class54 field2131 = new class54(2);

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    public static int field2138 = 0;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "Lcf;")
    public static class93 field2137 = class147.method1066("voudrait faire un -Bchange avec vous)3", -48);

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public int field2127;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public int field2130;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)V")
    public abstract void method568(int arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIII)V")
    public abstract void method558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIBII)V")
    public final void method889(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2136++;
        int var6 = this.field2129 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        if (arg2 > 69) {
            int var8 = this.field2130 << 3;
            int var9 = (arg4 << 4) + (var8 & 0xF);
            this.method558(var8, var6, var9, var7, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lee;B)V")
    public static final void method890(class280 arg0, byte arg1) {
        if (arg1 >= -118) {
            method893(12);
        }
        field2125++;
        while (true) {
            while (arg0.field5027 < arg0.field5011.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method1907(16832) == 1) {
                    var2 = arg0.method1907(16832);
                    var4 = arg0.method1907(16832);
                    var3 = true;
                }
                int var5 = arg0.method1907(16832);
                int var6 = arg0.method1907(16832);
                int var7 = class183.field3373 - (var6 * 64 - class76.field1404) - 1;
                int var8 = var5 * 64 - class251.field4518;
                if (var8 >= 0 && (var7 - 63) >= 0 && class148.field2599 > (var8 + 63) && class183.field3373 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var2 * 8 <= var11 && var2 * 8 + 8 > var11 && var12 >= var4 * 8 && (var4 * 8 + 8) > var12) {
                                byte var13 = arg0.method1925(true);
                                if (var13 != 0) {
                                    if (class37.field558[var9][var10] == null) {
                                        class37.field558[var9][var10] = new byte[4096];
                                    }
                                    class37.field558[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1925(true);
                                    if (class232.field4143[var9][var10] == null) {
                                        class232.field4143[var9][var10] = new byte[4096];
                                    }
                                    class232.field4143[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1925(true);
                        if (var16 != 0) {
                            arg0.field5027++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(II)V")
    public static final void method891(int arg0, int arg1) {
        field2128++;
        if (arg1 != -1) {
            field2138 = -70;
        }
        class212 var2 = class123.method905(-1205364448, 1, arg0);
        var2.method1502(arg1 + 256);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BZLcf;)V")
    public static final void method892(byte arg0, boolean arg1, class93 arg2) {
        field2132++;
        if (arg1) {
            try {
                class51.field843.getAppletContext().showDocument(arg2.method662(false, class51.field843.getCodeBase()), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class51.field843.getAppletContext().showDocument(arg2.method662(false, class51.field843.getCodeBase()), "_top");
            } catch (Exception var3) {
            }
        }
        if (arg0 != 91) {
            field2137 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
    public abstract void method559(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(II)V")
    public abstract void method570(int arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V")
    public abstract void method562(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(II)V")
    public abstract void method560(int arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V")
    public abstract void method563(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
    public static void method893(int arg0) {
        if (arg0 < 50) {
            field2134 = -88;
        }
        field2137 = null;
        field2131 = null;
    }
}
