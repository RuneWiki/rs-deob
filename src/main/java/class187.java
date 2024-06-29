import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class187 {

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Z")
    public boolean field2584 = false;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lqk;")
    public static class65 field2581 = new class65();

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "F")
    public static float field2589 = 0.0F;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "[[B")
    public static byte[][] field2593 = new byte[50][];

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Z")
    public static boolean field2594 = false;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Lin;")
    public static class344 field2591 = null;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "[B")
    public static byte[] field2587;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 4)
    public static final void method1307(String arg0, Throwable arg1, int arg2) {
        field2576++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class47.method300(arg1, -124);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            int var4 = -109 / ((-arg2 - 28) / 60);
            class317.method2226((byte) 86, var3);
            String var5 = class103.method761(-6399, var3, "%3a", ":");
            String var6 = class103.method761(-6399, var5, "%40", "@");
            String var7 = class103.method761(-6399, var6, "%26", "&");
            String var8 = class103.method761(-6399, var7, "%23", "#");
            if (class92.field1279.field1157 == null) {
                return;
            }
            class285 var9 = class92.field1279.method620(new URL(class92.field1279.field1157.getCodeBase(), "clienterror.ws?c=" + class161.field2217 + "&u=" + class66.field866 + "&v1=" + class80.field1149 + "&v2=" + class80.field1161 + "&e=" + var8), (byte) -57);
            while (var9.field4241 == 0) {
                class186.method1304(10, 1L);
            }
            if (var9.field4241 == 1) {
                DataInputStream var10 = (DataInputStream) var9.field4244;
                var10.read();
                var10.close();
            }
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 55)
    public static final void method1308(int arg0) {
        field2590++;
        class162.field2232.method717((byte) 74);
        if (arg0 != -8558) {
            method1311(true);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILkm;)V", line = 67)
    public static final void method1309(int arg0, class133 arg1) {
        field2580++;
        class234.field3313 = arg1.method964(101, "titlebg");
        if (arg0 != -13521) {
            field2592 = -126;
        }
        class119.field1607 = arg1.method964(127, "logo");
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILcg;)V", line = 84)
    public final void method1310(int arg0, int arg1, class316 arg2) {
        while (true) {
            int var4 = arg2.method2219(16448);
            if (var4 == 0) {
                if (arg1 != 0) {
                    field2591 = (class344) null;
                }
                field2579++;
                return;
            }
            this.method1313(arg0, var4, arg1 - 1, arg2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 102)
    public static final void method1311(boolean arg0) {
        field2577++;
        class248.field3574.method724(0);
        if (!arg0) {
            field2588 = 36;
        }
        class276.field4141.method724(0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)V", line = 114)
    public static final void method1312(int arg0, byte arg1) {
        if (arg1 >= -90) {
            method1308(-123);
        }
        class100.field1372 = new int[arg0];
        class254.field3632 = new int[arg0];
        class289.field4306 = new int[arg0];
        class21.field277 = new int[arg0];
        class124.field1672 = new int[arg0];
        field2583++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIILcg;)V", line = 132)
    private final void method1313(int arg0, int arg1, int arg2, class316 arg3) {
        field2595++;
        if (arg2 != -1) {
            method1316((byte) -4);
        }
        if (arg1 == 1) {
            this.field2586 = arg3.method2220((byte) 91);
        } else if (arg1 == 2) {
            this.field2582 = arg3.method2210((byte) -5);
        } else if (arg1 == 3) {
            this.field2584 = true;
        } else if (arg1 == 4) {
            this.field2586 = -1;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V", line = 166)
    public static void method1314(boolean arg0) {
        field2587 = null;
        field2591 = null;
        field2593 = (byte[][]) null;
        if (arg0) {
            field2581 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZI)Ltj;", line = 181)
    public final class258 method1315(int arg0, boolean arg1, int arg2) {
        if (arg0 != 948979152) {
            return (class258) null;
        }
        field2585++;
        class258 var4 = (class258) class276.field4141.method716((long) ((arg1 ? 262144 : 0) | this.field2586 | arg2 << 16), false);
        if (var4 != null) {
            return var4;
        }
        class119.field1602.method961(this.field2586, (byte) -128);
        class258 var5 = class282.method1949(0, class119.field1602, (byte) -77, this.field2586);
        if (var5 != null) {
            var5.method1779(class235.field3333, class222.field3190, class48.field593);
            var5.field30 = var5.field38;
            var5.field31 = var5.field28;
            if (arg1) {
                var5.method1780();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method1775();
            }
            class276.field4141.method721((long) ((arg1 ? 262144 : 0) | this.field2586 | arg2 << 16), var5, arg0 ^ 0x389045D0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 248)
    public static final void method1316(byte arg0) {
        field2578++;
        if (class291.field4348 != null || class134.field1852 != null) {
            return;
        }
        int var1 = class123.field1666;
        if (arg0 < 64) {
            return;
        }
        if (!class100.field1380) {
            if (var1 == 1 && class204.field2938 > 0) {
                short var2 = class54.field722[class204.field2938 - 1];
                if (var2 == 23 || var2 == 1 || var2 == 41 || var2 == 33 || var2 == 22 || var2 == 17 || var2 == 24 || var2 == 44 || var2 == 25 || var2 == 21 || var2 == 28 || var2 == 1003) {
                    int var3 = class334.field5049[class204.field2938 - 1];
                    int var4 = class20.field252[class204.field2938 - 1];
                    class344 var5 = class151.method1101(-26, var4);
                    class300 var6 = client.method821(var5);
                    if (var6.method2038(23211) || var6.method2034(true)) {
                        class10.field110 = false;
                        class196.field2734 = 0;
                        if (class291.field4348 != null) {
                            class255.method1741(class291.field4348, false);
                        }
                        class291.field4348 = class151.method1101(-44, var4);
                        class210.field3040 = class217.field3104;
                        class336.field5064 = var3;
                        class1.field9 = class155.field2142;
                        class255.method1741(class291.field4348, false);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class252.field3616 == 1 && class204.field2938 > 2 || class85.method664(class204.field2938 - 1, 2000))) {
                var1 = 2;
            }
            if (var1 == 2 && class204.field2938 > 0 || class316.field4811 == 1) {
                class231.method1600((byte) 105);
            }
            if (var1 == 1 && class204.field2938 > 0 || class316.field4811 == 2) {
                class138.method1001(2);
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class206.field2962;
            int var8 = class282.field4220;
            if ((class8.field79 - 10) > var7 || class8.field79 + class183.field2524 + 10 < var7 || var8 < (class312.field4704 - 10) || class312.field4704 + class218.field3131 + 10 < var8) {
                class100.field1380 = false;
                class253.method1728(class183.field2524, class218.field3131, (byte) 59, class312.field4704, class8.field79);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class8.field79;
        int var10 = class183.field2524;
        int var11 = class217.field3104;
        int var12 = -1;
        int var13 = class312.field4704;
        int var14 = class155.field2142;
        for (int var15 = 0; var15 < class204.field2938; var15++) {
            if (class141.field1924) {
                int var17 = (class204.field2938 - var15 - 1) * 15 + var13 + 33;
                if (var9 < var11 && (var9 + var10) > var11 && var17 - 13 < var14 && (var17 + 3) > var14) {
                    var12 = var15;
                }
            } else {
                int var16 = var13 - (-((class204.field2938 - var15 - 1) * 15) - 31);
                if (var11 > var9 && (var9 + var10) > var11 && (var16 - 13) < var14 && var14 < var16 + 3) {
                    var12 = var15;
                }
            }
        }
        if (var12 != -1) {
            class203.method1440(var12, (byte) 39);
        }
        class100.field1380 = false;
        class253.method1728(class183.field2524, class218.field3131, (byte) -69, class312.field4704, class8.field79);
    }
}
