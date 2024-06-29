import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class129 extends class293 {

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[I")
    public static int[] field2329 = new int[2000];

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "[I")
    public static int[] field2332 = new int[32];

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "[I")
    public static int[] field2337;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "[Lnk;")
    public static class22[] field2335;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "[Lpm;")
    public static class99[] field2336;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILob;B)I", line = 5)
    public static final int method1035(int arg0, class78 arg1, byte arg2) {
        field2331++;
        if (arg1.field1259 == null || arg0 >= arg1.field1259.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field1259[arg0];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            if (arg2 >= -25) {
                field2334 = -115;
            }
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 1) {
                    var8 = class50.field807[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class58.field914[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class135.field2404[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class78 var12 = class61.method419((byte) 28, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class304.method2075(var13, 4).field2107 || class261.field4356)) {
                        for (int var14 = 0; var14 < var12.field1381.length; var14++) {
                            if (var13 + 1 == var12.field1381[var14]) {
                                var8 += var12.field1368[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = field2329[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class279.field4694[class58.field914[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = field2329[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class122.field2215.field642;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class80.field1398[var15]) {
                            var8 += class58.field914[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class78 var18 = class61.method419((byte) 28, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class304.method2075(var19, 4).field2107 || class261.field4356)) {
                        for (int var20 = 0; var20 < var18.field1381.length; var20++) {
                            if (var19 + 1 == var18.field1381[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class259.field4313;
                }
                if (var7 == 12) {
                    var8 = class259.field4312;
                }
                if (var7 == 13) {
                    int var21 = field2329[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class153.method1195((byte) 127, var23);
                }
                if (var7 == 18) {
                    var8 = (class122.field2215.field5013 >> 7) + class178.field3052;
                }
                if (var7 == 19) {
                    var8 = (class122.field2215.field5047 >> 7) + class258.field4294;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var6 += var8;
                    }
                    if (var5 == 1) {
                        var6 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var6 /= var8;
                    }
                    if (var5 == 3) {
                        var6 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I", line = 212)
    public static final int method1036(int arg0, int arg1) {
        field2338++;
        if (arg1 < 0) {
            return 0;
        }
        class101 var2 = (class101) class40.field651.method1672((long) arg1, 19760);
        if (var2 == null) {
            return class240.method1700(arg1, 126).field3618;
        }
        if (arg0 != -5041) {
            method1038(-99, -81);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field1847.length; var4++) {
            if (var2.field1847[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class240.method1700(arg1, arg0 + 5162).field3618 - var2.field1847.length);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 248)
    public static void method1037(int arg0) {
        field2329 = null;
        field2336 = null;
        field2335 = null;
        field2337 = null;
        field2332 = null;
        if (arg0 != -5417) {
            field2337 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V", line = 266)
    public static final void method1038(int arg0, int arg1) {
        if (arg1 <= 48) {
            method1036(4, 40);
        }
        class198.field3365.method1538(arg0, (byte) -43);
        field2333++;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2332[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 306)
    public static final void method1039(int arg0, String arg1, Throwable arg2) {
        field2330++;
        try {
            if (arg0 != -8) {
                return;
            }
            String var3 = "";
            if (arg2 != null) {
                var3 = class59.method409(-1, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class264.field4400.field469 == null) {
                return;
            }
            class166 var8 = class264.field4400.method236(new URL(class264.field4400.field469.getCodeBase(), "clienterror.ws?c=" + class260.field4326 + "&u=" + class27.field465 + "&v1=" + class28.field468 + "&v2=" + class28.field474 + "&e=" + var7), 0);
            while (var8.field2934 == 0) {
                class177.method1342(1L, arg0 + 9);
            }
            if (var8.field2934 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2933;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }
}
