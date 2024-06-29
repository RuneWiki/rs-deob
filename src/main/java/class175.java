import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class175 {

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public int field2052;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public int field2060;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field2047;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "B")
    public byte field2059;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public int field2051;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field2050 = 0;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field2061 = 0;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "[[I")
    public static int[][] field2062 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Luc;")
    public static class27 field2049 = new class27(12, 7);

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field2063 = 0;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Lhl;")
    public class494 field2058;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lft;")
    public class4 field2053;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Lid;")
    public class547 field2055;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Lfh;")
    public class609 field2057;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Z")
    public final boolean method1047(int arg0) {
        field2056++;
        if (arg0 != 4) {
            method1050(true);
        }
        return this.field2059 == 2 || this.field2059 == 3;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method1048(int arg0) {
        if (arg0 == 4) {
            field2049 = null;
            field2062 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static final void method1049(byte arg0) {
        field2054++;
        try {
            if (class76.field1000 == 1) {
                int var1 = class367.field4751.method1987(-117);
                if (var1 > 0 && class367.field4751.method1980(0)) {
                    int var2 = var1 - class662.field8973;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class367.field4751.method1984(arg0 ^ 0xFFFFFF9A, var2);
                    return;
                }
                class367.field4751.method1961(18234);
                class367.field4751.method1964((byte) -128);
                if (class334.field4134 == null) {
                    class76.field1000 = 0;
                } else {
                    class76.field1000 = 2;
                }
                class266.field3364 = null;
                class669.field9071 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class367.field4751.method1961(18234);
            class76.field1000 = 0;
            class334.field4134 = null;
            class669.field9071 = null;
            class266.field3364 = null;
        }
        if (arg0 != 2) {
            method1050(true);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Z")
    public static final boolean method1050(boolean arg0) {
        for (int var1 = class631.field8559; var1 < class709.field9904; var1++) {
            class565[][] var2 = class407.field5237[var1];
            for (int var3 = -class664.field9021; var3 <= 0; var3++) {
                int var4 = class662.field8971 + var3;
                int var5 = class662.field8971 - var3;
                if (var4 >= class254.field3275 || var5 < class683.field9311) {
                    for (int var6 = -class664.field9021; var6 <= 0; var6++) {
                        int var7 = class513.field6440 + var6;
                        int var8 = class513.field6440 - var6;
                        if (var4 >= class254.field3275) {
                            if (var7 >= class430.field5431) {
                                class565 var9 = var2[var4][var7];
                                if (var9 != null && var9.field7088) {
                                    class618.field8386 = arg0;
                                    class489.field6114.method1807(-18542, var9);
                                    class489.field6114.method1808(3);
                                }
                            }
                            if (var8 < class711.field9935) {
                                class565 var10 = var2[var4][var8];
                                if (var10 != null && var10.field7088) {
                                    class618.field8386 = arg0;
                                    class489.field6114.method1807(-18542, var10);
                                    class489.field6114.method1808(3);
                                }
                            }
                        }
                        if (var5 < class683.field9311) {
                            if (var7 >= class430.field5431) {
                                class565 var11 = var2[var5][var7];
                                if (var11 != null && var11.field7088) {
                                    class618.field8386 = arg0;
                                    class489.field6114.method1807(-18542, var11);
                                    class489.field6114.method1808(3);
                                }
                            }
                            if (var8 < class711.field9935) {
                                class565 var12 = var2[var5][var8];
                                if (var12 != null && var12.field7088) {
                                    class618.field8386 = arg0;
                                    class489.field6114.method1807(-18542, var12);
                                    class489.field6114.method1808(3);
                                }
                            }
                        }
                        if (class238.field3091 == 0) {
                            if (class24.field281) {
                                class489.field6114.method1806(24, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(BIIIII)V")
    public class175(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2064 = arg3;
        this.field2052 = arg1;
        this.field2060 = arg2;
        this.field2047 = arg4;
        this.field2059 = arg0;
        this.field2051 = arg5;
    }
}
