import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class87 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lok;")
    private class138 field1309 = new class138();

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Luj;")
    public static class156 field1318 = new class156();

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "[I")
    public static int[] field1321 = new int[128];

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "[Lnl;")
    public static class196[] field1326 = new class196[5000];

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "Lck;")
    public static class119 field1327 = class298.method1987((byte) 90, "slr2)3ws?order=LPWM");

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lok;")
    private class138 field1317;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "[I")
    public static int[] field1320;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILok;)V", line = 4)
    public final void method582(int arg0, class138 arg1) {
        if (arg1.field2213 != null) {
            arg1.method911((byte) 125);
        }
        arg1.field2213 = this.field1309.field2213;
        if (arg0 == 3) {
            arg1.field2218 = this.field1309;
            arg1.field2213.field2218 = arg1;
            field1325++;
            arg1.field2218.field2213 = arg1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Lok;", line = 21)
    public final class138 method583(byte arg0) {
        if (arg0 <= 78) {
            this.method582(62, (class138) null);
        }
        field1315++;
        class138 var2 = this.field1309.field2218;
        if (this.field1309 == var2) {
            this.field1317 = null;
            return null;
        } else {
            this.field1317 = var2.field2218;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lok;BLok;)V", line = 46)
    public final void method584(class138 arg0, byte arg1, class138 arg2) {
        field1310++;
        if (arg1 < 121) {
            this.field1309 = (class138) null;
        }
        if (arg2.field2213 != null) {
            arg2.method911((byte) 114);
        }
        arg2.field2213 = arg0;
        arg2.field2218 = arg0.field2218;
        arg2.field2213.field2218 = arg2;
        arg2.field2218.field2213 = arg2;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V", line = 63)
    public static void method585(byte arg0) {
        field1321 = null;
        field1320 = null;
        field1326 = null;
        field1318 = null;
        field1327 = null;
        if (arg0 != 93) {
            method585((byte) 24);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V", line = 85)
    public final void method586(byte arg0) {
        field1319++;
        if (arg0 != 126) {
            this.method588(100);
        }
        while (true) {
            class138 var2 = this.field1309.field2218;
            if (this.field1309 == var2) {
                this.field1317 = null;
                return;
            }
            var2.method911((byte) 89);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLml;)Z", line = 109)
    public static final boolean method587(byte arg0, class134 arg1) {
        if (arg0 != -12) {
            method585((byte) -26);
        }
        field1316++;
        if (arg1.field2066 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field2066.length; var2++) {
            int var3 = class36.method269(arg1, (byte) 71, var2);
            int var4 = arg1.field2033[var2];
            if (arg1.field2066[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field2066[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field2066[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V", line = 296)
    public class87() {
        this.field1309.field2218 = this.field1309;
        this.field1309.field2213 = this.field1309;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)Lok;", line = 202)
    public final class138 method588(int arg0) {
        if (arg0 != 3) {
            return (class138) null;
        }
        field1314++;
        class138 var2 = this.field1317;
        if (this.field1309 == var2) {
            this.field1317 = null;
            return null;
        } else {
            this.field1317 = var2.field2218;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)V", line = 225)
    public static final void method589(byte arg0) {
        if (arg0 > -115) {
            return;
        }
        field1311++;
        class22.field333.method962(8);
        int var1 = class22.field333.method961(-108, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class22.field333.method961(-123, 2);
        if (var2 == 0) {
            class113.field1723[class81.field1238++] = 2047;
        } else if (var2 == 1) {
            int var3 = class22.field333.method961(-123, 3);
            class124.field1917.method1985(var3, false, (byte) -41);
            int var4 = class22.field333.method961(71, 1);
            if (var4 == 1) {
                class113.field1723[class81.field1238++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class22.field333.method961(121, 3);
            class124.field1917.method1985(var5, true, (byte) -41);
            int var6 = class22.field333.method961(51, 3);
            class124.field1917.method1985(var6, true, (byte) -41);
            int var7 = class22.field333.method961(69, 1);
            if (var7 == 1) {
                class113.field1723[class81.field1238++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class22.field333.method961(-104, 7);
            int var9 = class22.field333.method961(-111, 1);
            if (var9 == 1) {
                class113.field1723[class81.field1238++] = 2047;
            }
            int var10 = class22.field333.method961(50, 7);
            int var11 = class22.field333.method961(-104, 1);
            class10.field189 = class22.field333.method961(122, 2);
            class124.field1917.method1982(var8, 7, var10, var11 == 1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLok;)V", line = 310)
    public final void method590(byte arg0, class138 arg1) {
        field1324++;
        if (arg1.field2213 != null) {
            arg1.method911((byte) 81);
        }
        arg1.field2218 = this.field1309.field2218;
        int var3 = 76 % ((arg0 - 58) / 54);
        arg1.field2213 = this.field1309;
        arg1.field2213.field2218 = arg1;
        arg1.field2218.field2213 = arg1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 326)
    public static final void method591(String arg0, Throwable arg1, int arg2) {
        field1313++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class189.method1198(arg2 ^ 0xFFFFFFC5, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace((char) arg2, '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class288.field4743.field4664 == null) {
                return;
            }
            class275 var8 = class288.field4743.method1867(new URL(class288.field4743.field4664.getCodeBase(), "clienterror.ws?c=" + class203.field3221 + "&u=" + class227.field3642 + "&v1=" + class282.field4656 + "&v2=" + class282.field4649 + "&e=" + var7), (byte) 1);
            while (var8.field4496 == 0) {
                class232.method1493(1L, (byte) -51);
            }
            if (var8.field4496 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field4499;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Lok;", line = 382)
    public final class138 method592(boolean arg0) {
        if (arg0) {
            this.method582(-116, (class138) null);
        }
        field1328++;
        class138 var2 = this.field1309.field2218;
        if (this.field1309 == var2) {
            return null;
        } else {
            var2.method911((byte) 109);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIZIILwi;I)V", line = 400)
    public static final void method593(byte arg0, int arg1, boolean arg2, int arg3, int arg4, class23 arg5, int arg6) {
        field1329++;
        long var7 = (long) ((arg4 << 16) + arg6);
        class117 var9 = (class117) class209.field3332.method1329((byte) 90, var7);
        if (var9 != null) {
            return;
        }
        class117 var10 = (class117) class93.field1431.method1329((byte) 90, var7);
        if (var10 != null) {
            return;
        }
        class117 var11 = (class117) class261.field4177.method1329((byte) 90, var7);
        if (var11 == null) {
            if (!arg2) {
                class117 var12 = (class117) class260.field4153.method1329((byte) 90, var7);
                if (var12 != null) {
                    return;
                }
            }
            if (arg3 != 455041648) {
                field1318 = (class156) null;
            }
            class117 var13 = new class117();
            var13.field1762 = arg5;
            var13.field1761 = arg1;
            var13.field1766 = arg0;
            if (arg2) {
                class209.field3332.method1326(var7, (byte) -124, var13);
                class196.field3139++;
            } else {
                class265.field4328.method582(3, var13);
                class261.field4177.method1326(var7, (byte) -109, var13);
                class46.field666++;
            }
        } else if (arg2) {
            var11.method911((byte) 119);
            class209.field3332.method1326(var7, (byte) -113, var11);
            class196.field3139++;
            class46.field666--;
        }
    }
}
