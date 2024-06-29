import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class40 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Lkb;")
    public static class39 field558;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V", line = 15)
    public static final void method275(int arg0, boolean arg1) {
        field557++;
        byte[][] var2;
        byte var3;
        if (class186.field2991 && arg1) {
            var2 = class105.field1596;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class187.field3037;
        }
        int[] var4 = null;
        if (arg0 != 1) {
            method277(100);
        }
        for (int var5 = 0; var5 < var3; var5++) {
            method279(25259);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class114.field1704[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x338E738) >> 24;
                        if (!arg1 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = (var9 & 0x3FFA) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class327.field5096.length; var15++) {
                                if (class327.field5096[var15] == var14 && var2[var15] != null) {
                                    var8 = true;
                                    int[] var16 = class56.method398(var2[var15], var5, var12, var13, var10, var7 * 8, var6 * 8, arg1, (byte) -127, class50.field685, var11);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class302.method2113(var7 * 8, var6 * 8, 8, var5, true, 8);
                    }
                }
            }
        }
        if (var4 == null) {
            class294.field4624 = -1;
            return;
        }
        class294.field4624 = var4[0];
        class93.field1429 = var4[1];
        class157.field2423 = var4[3];
        class209.field3417 = var4[2];
        class100.field1521 = var4[4];
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 127)
    public static void method276(byte arg0) {
        if (arg0 >= 93) {
            field558 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)[Lug;", line = 147)
    public static final class321[] method277(int arg0) {
        field556++;
        class321[] var1 = new class321[class56.field740];
        if (arg0 <= 23) {
            method279(114);
        }
        for (int var2 = 0; var2 < class56.field740; var2++) {
            int var3 = class244.field3885[var2] * class21.field316[var2];
            byte[] var4 = class3.field20[var2];
            if (class181.field2927[var2]) {
                byte[] var5 = class269.field4251[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class24.method149(class305.field4754[class200.method1465(255, var4[var7])], class200.method1465(var5[var7], 255) << 24);
                }
                if (class186.field2991) {
                    var1[var2] = new class311(class163.field2659, class113.field1698, class163.field2657[var2], class162.field2647[var2], class244.field3885[var2], class21.field316[var2], var6);
                } else {
                    var1[var2] = new class82(class163.field2659, class113.field1698, class163.field2657[var2], class162.field2647[var2], class244.field3885[var2], class21.field316[var2], var6);
                }
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class305.field4754[class200.method1465(255, var4[var9])];
                }
                if (class186.field2991) {
                    var1[var2] = new class14(class163.field2659, class113.field1698, class163.field2657[var2], class162.field2647[var2], class244.field3885[var2], class21.field316[var2], var8);
                } else {
                    var1[var2] = new class298(class163.field2659, class113.field1698, class163.field2657[var2], class162.field2647[var2], class244.field3885[var2], class21.field316[var2], var8);
                }
            }
        }
        class17.method115((byte) -86);
        return var1;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 222)
    public static final void method278(int arg0) {
        field559++;
        if (arg0 != 0) {
            field558 = (class39) null;
        }
        for (class224 var1 = (class224) class176.field2870.method1746((byte) -33); var1 != null; var1 = (class224) class176.field2870.method1749((byte) 127)) {
            int var2 = var1.field3564;
            if (class204.method1498((byte) -97, var2)) {
                boolean var3 = true;
                class160[] var4 = class21.field309[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2551;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field916;
                    class160 var7 = class37.method238((byte) 26, var6);
                    if (var7 != null) {
                        class219.method1600(var7, 114);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 280)
    public static final void method279(int arg0) {
        if (class296.field4640 != null) {
            class296.field4640.method655((byte) -120);
        }
        field561++;
        if (class154.field2355 != null) {
            class154.field2355.method655((byte) -121);
        }
        if (arg0 != 25259) {
            field558 = (class39) null;
        }
    }
}
