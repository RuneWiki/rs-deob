import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class49 {

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "[I")
    public static int[] field773 = new int[1000];

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
    public static boolean field782 = true;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Ldf;")
    public static class51 field780 = class46.method233("Gegenstand f-Ur Mitglieder", 100);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lja;")
    public static class55 field783;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lla;")
    public static class91 field786;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method249(Throwable arg0, int arg1) throws IOException {
        field770++;
        String var3;
        if (arg0 instanceof class177) {
            class177 var2 = (class177) arg0;
            var3 = var2.field2896 + " | ";
            arg0 = var2.field2894;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 >= -20) {
            field767 = -44;
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lsh;")
    public static final class196 method250(int arg0, int arg1) {
        field774++;
        if (arg1 == 0) {
            return new class220();
        } else if (arg1 == 1) {
            return new class28();
        } else if (arg1 == 2) {
            return new class227();
        } else if (arg1 == 3) {
            return new class57();
        } else if (arg1 == 4) {
            return new class202();
        } else if (arg1 == 5) {
            return new class233();
        } else if (arg1 == 6) {
            return new class9();
        } else if (arg1 == 7) {
            return new class261();
        } else if (arg1 == 8) {
            return new class134();
        } else if (arg1 == 9) {
            return new class34();
        } else if (arg1 == 10) {
            return new class53();
        } else if (arg1 == 11) {
            return new class128();
        } else if (arg1 == 12) {
            return new class38();
        } else if (arg1 == 13) {
            return new class69();
        } else if (arg1 == 14) {
            return new class47();
        } else if (arg1 == 15) {
            return new class14();
        } else if (arg1 == 16) {
            return new class201();
        } else if (arg1 == 17) {
            return new class218();
        } else if (arg1 == 18) {
            return new class99();
        } else if (arg1 == 19) {
            return new class12();
        } else if (arg1 == 20) {
            return new class32();
        } else if (arg1 == 21) {
            return new class27();
        } else if (arg1 == 22) {
            return new class211();
        } else if (arg1 == 23) {
            return new class214();
        } else if (arg1 == 24) {
            return new class79();
        } else if (arg1 == 25) {
            return new class265();
        } else if (arg1 == 26) {
            return new class161();
        } else if (arg1 == 27) {
            return new class85();
        } else if (arg1 == 28) {
            return new class16();
        } else if (arg1 == 29) {
            return new class264();
        } else if (arg1 == 30) {
            return new class168();
        } else if (arg1 == 31) {
            return new class123();
        } else if (arg1 == 32) {
            return new class160();
        } else if (arg1 == 33) {
            return new class147();
        } else if (arg1 == 34) {
            return new class230();
        } else if (arg1 == 35) {
            return new class141();
        } else if (arg1 == 36) {
            return new class193();
        } else if (arg1 == 37) {
            return new class129();
        } else if (arg1 == 38) {
            return new class237();
        } else if (arg1 == 39) {
            return new class169();
        } else {
            if (arg0 != 74) {
                field783 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method251(int arg0) {
        field784++;
        if (arg0 != 44) {
            method250(38, -48);
        }
        if (class229.field4003.toLowerCase().indexOf("microsoft") != -1) {
            class185.field3053[186] = 57;
            class185.field3053[191] = 73;
            class185.field3053[222] = 59;
            class185.field3053[220] = 74;
            class185.field3053[188] = 71;
            class185.field3053[189] = 26;
            class185.field3053[221] = 43;
            class185.field3053[219] = 42;
            class185.field3053[192] = 58;
            class185.field3053[190] = 72;
            class185.field3053[223] = 28;
            class185.field3053[187] = 27;
            return;
        }
        class185.field3053[93] = 43;
        class185.field3053[44] = 71;
        class185.field3053[45] = 26;
        class185.field3053[92] = 74;
        class185.field3053[47] = 73;
        class185.field3053[46] = 72;
        class185.field3053[61] = 27;
        if (class229.field3984 == null) {
            class185.field3053[222] = 59;
            class185.field3053[192] = 58;
        } else {
            class185.field3053[222] = 58;
            class185.field3053[192] = 28;
            class185.field3053[520] = 59;
        }
        class185.field3053[91] = 42;
        class185.field3053[59] = 57;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)Li;")
    public static final class52 method252(int arg0, int arg1) {
        if (arg0 != -1) {
            return null;
        }
        class52 var2 = (class52) class168.field2733.method1491((long) arg1, (byte) 95);
        field768++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class70.field1125.method828(class4.method17((byte) -43, arg1), (byte) 99, class225.method1552(arg1, (byte) 105));
        class52 var4 = new class52();
        if (var3 != null) {
            var4.method326(12345678, new class121(var3));
        }
        class168.field2733.method1492(false, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static final void method253(int arg0) {
        for (int var1 = arg0; var1 < class86.field1444; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class75.field1195[var1];
            }
            class103 var6 = class66.field1055[var5];
            if (var6 != null && var6.field4323 > 0) {
                var6.field4323--;
                if (var6.field4323 == 0) {
                    var6.field4353 = null;
                }
            }
        }
        field776++;
        for (int var2 = 0; var2 < class218.field3788; var2++) {
            int var3 = class193.field3242[var2];
            class83 var4 = class34.field512[var3];
            if (var4 != null && var4.field4323 > 0) {
                var4.field4323--;
                if (var4.field4323 == 0) {
                    var4.field4353 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()I")
    public abstract int method94();

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V")
    public static final void method254(int arg0, int arg1) {
        class166.field2697.method1348(0, arg0);
        field781++;
        if (arg1 <= 119) {
            field786 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIIII)V")
    public void method118(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 50 / ((76 - arg0) / 33);
        field778++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method255(byte arg0) {
        if (class195.field3249 == 30) {
            class100.method734(true, 25);
        }
        if (arg0 <= 41) {
            field780 = null;
        }
        field769++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZB)V")
    public static final void method256(boolean arg0, byte arg1) {
        field777++;
        int var2 = class86.field1444;
        if (class44.field706.field4319 >> 7 == class96.field1581 && class44.field706.field4348 >> 7 == class248.field4373) {
            class96.field1581 = 0;
        }
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class103 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class44.field706;
            } else {
                var4 = (long) class75.field1195[var3] << 32;
                var6 = class66.field1055[class75.field1195[var3]];
            }
            if (var6 != null && var6.method646((byte) -57)) {
                var6.field1696 = false;
                int var7 = var6.field4348 >> 7;
                if ((class35.field517 && class86.field1444 > 200 || class86.field1444 > 50) && !arg0 && var6.field4314 == var6.field4304) {
                    var6.field1696 = true;
                }
                int var8 = var6.field4319 >> 7;
                if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
                    if (var6.field1719 == null || var6.field1703 > class179.field2960 || var6.field1686 <= class179.field2960) {
                        if (var6.field4345 == 1 && (var6.field4319 & 0x7F) == 64 && (var6.field4348 & 0x7F) == 64) {
                            if (class101.field1683[var8][var7] == class182.field2994) {
                                continue;
                            }
                            class101.field1683[var8][var7] = class182.field2994;
                        }
                        var6.field4328 = class207.method1424(class257.field4496, var6.field4319, (byte) 65, var6.field4348);
                        class78.method552(class257.field4496, var6.field4319, var6.field4348, var6.field4328, var6.field4345 * 64 + 60 - 64, var6, var6.field4326, var4, var6.field4282);
                    } else {
                        var6.field1696 = false;
                        var6.field4328 = class207.method1424(class257.field4496, var6.field4319, (byte) 93, var6.field4348);
                        class202.method1409(class257.field4496, var6.field4319, var6.field4348, var6.field4328, var6, var6.field4326, var4, var6.field1690, var6.field1694, var6.field1714, var6.field1718);
                    }
                }
            }
        }
        if (arg1 >= -85) {
            method251(-113);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    public static final void method257(byte arg0) {
        class44.field712 = 0;
        if (arg0 != -77) {
            field780 = null;
        }
        field772++;
        class185.field3060 = 0;
        class136.method988((byte) -60);
        class218.method1498((byte) -128);
        class51.method297((byte) 121);
        for (int var1 = 0; var1 < class44.field712; var1++) {
            int var3 = class16.field238[var1];
            if (class179.field2960 != class34.field512[var3].field4309) {
                if (class34.field512[var3].field1392.method64(-8093)) {
                    class245.method1671(-12011, class34.field512[var3]);
                }
                class34.field512[var3].field1392 = null;
                class34.field512[var3] = null;
            }
        }
        if (class70.field1128 != class97.field1622.field2026) {
            throw new RuntimeException("gnp1 pos:" + class97.field1622.field2026 + " psize:" + class70.field1128);
        }
        for (int var2 = 0; var2 < class218.field3788; var2++) {
            if (class34.field512[class193.field3242[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class218.field3788);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
    public static final void method258(byte arg0) {
        class261.field4557.method1350((byte) 119);
        if (arg0 > -72) {
            method252(26, -70);
        }
        field785++;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()Z")
    public boolean method259() {
        field771++;
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)Lkb;")
    public class49 method260(int arg0, int arg1, int arg2) {
        field787++;
        return this;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lkb;IIIZ)V")
    public void method261(class49 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field779++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)I")
    public static final int method262(int arg0, byte arg1, int arg2) {
        field775++;
        if (arg1 != -28) {
            method250(23, -45);
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static void method263(int arg0) {
        field773 = null;
        field780 = null;
        field783 = null;
        if (arg0 < -33) {
            field786 = null;
        }
    }
}
