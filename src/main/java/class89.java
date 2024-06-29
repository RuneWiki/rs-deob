import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field2193 = 0;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Loc;")
    public static class99 field2196 = class48.method402((byte) -104, ")3");

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Loc;")
    public static class99 field2197 = class48.method402((byte) -104, ",Zffentlicher Chat");

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Loc;")
    public static class99 field2194 = class48.method402((byte) -104, "(X");

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field2201 = 0;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Loc;")
    public static class99 field2198 = class48.method402((byte) -104, " weitere Optionen");

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field2205 = 0;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Loc;")
    public static class99 field2206 = null;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Loc;")
    private static class99 field2208 = class48.method402((byte) -104, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Loc;")
    public static class99 field2204 = field2208;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Ljc;")
    public static class64 field2210;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Z")
    public static boolean field2207;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "[Ldc;")
    public static class24[] field2202;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static final void method746(int arg0) {
        class5.field96 = null;
        class74.field1887 = null;
        class95.field2319 = null;
        if (arg0 <= 98) {
            field2210 = null;
        }
        field2199++;
        class86.field2142 = null;
        class119.field2929 = null;
        class21.field508 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public static final void method747(int arg0) {
        field2211++;
        try {
            Graphics var1 = class5.field99.getGraphics();
            if (arg0 != 0) {
                method749(-67);
            }
            class17.field453.method109(4, 4, arg0, var1);
        } catch (Exception var2) {
            class5.field99.repaint();
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Z")
    public static final boolean method748(int arg0) {
        field2200++;
        long var1 = class60.method535(2);
        int var3 = (int) (var1 - class68.field1745);
        if (var3 > 200) {
            var3 = 200;
        }
        class79.field1944 += var3;
        class68.field1745 = var1;
        if (class102.field2485 == 0 && class84.field2082 == 0 && class84.field2115 == 0 && class144.field3591 == 0) {
            return true;
        }
        if (arg0 != 2031725280) {
            field2202 = null;
        }
        if (class118.field2904 == null) {
            return false;
        }
        try {
            if (class79.field1944 > 30000) {
                throw new IOException();
            }
            while (class84.field2082 < 20 && class144.field3591 > 0) {
                class61 var4 = (class61) class20.field488.method1002(-55);
                class57 var5 = new class57(4);
                var5.method514((byte) 73, 1);
                var5.method477(false, (int) var4.field1138);
                class118.field2904.method1214(0, true, var5.field1469, 4);
                class7.field205.method1006(var4.field1138, var4, arg0 ^ 0x86E65571);
                class84.field2082++;
                class144.field3591--;
            }
            while (class102.field2485 < 20 && class84.field2115 > 0) {
                class61 var6 = (class61) class48.field1171.method597(false);
                class57 var7 = new class57(4);
                var7.method514((byte) 73, 0);
                var7.method477(false, (int) var6.field1138);
                class118.field2904.method1214(0, true, var7.field1469, 4);
                var6.method1010((byte) 45);
                class91.field2214.method1006(var6.field1138, var6, -120);
                class102.field2485++;
                class84.field2115--;
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = class118.field2904.method1216(-12320);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                byte var10 = 0;
                if (class42.field1019 == null) {
                    var10 = 8;
                } else if (class60.field1615 == 0) {
                    var10 = 1;
                }
                class79.field1944 = 0;
                if (var10 <= 0) {
                    int var11 = 512 - class60.field1615;
                    int var12 = class79.field1956.field1469.length - class42.field1019.field1645;
                    if (var12 - class79.field1956.field1477 < var11) {
                        var11 = var12 - class79.field1956.field1477;
                    }
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    class118.field2904.method1218(class79.field1956.field1477, class79.field1956.field1469, -12219, var11);
                    if (class20.field495 != 0) {
                        for (int var13 = 0; var13 < var11; var13++) {
                            class79.field1956.field1469[class79.field1956.field1477 + var13] = (byte) class69.method609(class79.field1956.field1469[class79.field1956.field1477 + var13], class20.field495);
                        }
                    }
                    class79.field1956.field1477 += var11;
                    class60.field1615 += var11;
                    if (class79.field1956.field1477 == var12) {
                        if (class42.field1019.field1138 == 16711935L) {
                            class3.field55 = class79.field1956;
                            for (int var15 = 0; var15 < 256; var15++) {
                                class35 var16 = class145.field3627[var15];
                                if (var16 != null) {
                                    class3.field55.field1477 = var15 * 4 + 5;
                                    int var17 = class3.field55.method495(16711680);
                                    var16.method311(255, var17);
                                }
                            }
                        } else {
                            class101.field2459.reset();
                            class101.field2459.update(class79.field1956.field1469, 0, var12);
                            int var14 = (int) class101.field2459.getValue();
                            if (class42.field1019.field1624 != var14) {
                                try {
                                    class118.field2904.method1215(false);
                                } catch (Exception var29) {
                                }
                                class20.field495 = (byte) (Math.random() * 255.0D + 1.0D);
                                class118.field2904 = null;
                                class87.field2179++;
                                return false;
                            }
                            class87.field2179 = 0;
                            class1.field19 = 0;
                            class42.field1019.field1627.method305(class60.field1606, (int) (class42.field1019.field1138 & 0xFFFFL), (class42.field1019.field1138 & 0xFF0000L) == 16711680L, class79.field1956.field1469, arg0 - 2031725249);
                        }
                        class42.field1019.method394((byte) 96);
                        class60.field1615 = 0;
                        class42.field1019 = null;
                        class79.field1956 = null;
                        if (class60.field1606) {
                            class84.field2082--;
                        } else {
                            class102.field2485--;
                        }
                    } else {
                        if (class60.field1615 != 512) {
                            break;
                        }
                        class60.field1615 = 0;
                    }
                } else {
                    int var18 = var10 - class57.field1478.field1477;
                    if (var18 > var9) {
                        var18 = var9;
                    }
                    class118.field2904.method1218(class57.field1478.field1477, class57.field1478.field1469, -12219, var18);
                    if (class20.field495 != 0) {
                        for (int var19 = 0; var19 < var18; var19++) {
                            class57.field1478.field1469[class57.field1478.field1477 + var19] = (byte) class69.method609(class57.field1478.field1469[class57.field1478.field1477 + var19], class20.field495);
                        }
                    }
                    class57.field1478.field1477 += var18;
                    if (class57.field1478.field1477 < var10) {
                        break;
                    }
                    if (class42.field1019 == null) {
                        class57.field1478.field1477 = 0;
                        int var20 = class57.field1478.method510(-111);
                        int var21 = class57.field1478.method506(-1);
                        int var22 = class57.field1478.method510(-126);
                        int var23 = class57.field1478.method495(16711680);
                        long var24 = (long) ((var20 << 16) + var21);
                        class61 var26 = (class61) class7.field205.method1001(var24, (byte) 46);
                        class60.field1606 = true;
                        if (var26 == null) {
                            var26 = (class61) class91.field2214.method1001(var24, (byte) -51);
                            class60.field1606 = false;
                        }
                        if (var26 == null) {
                            throw new IOException();
                        }
                        class42.field1019 = var26;
                        int var27 = var22 == 0 ? 5 : 9;
                        class79.field1956 = new class57(var23 + class42.field1019.field1645 + var27);
                        class79.field1956.method514((byte) 73, var22);
                        class79.field1956.method507(arg0 - 2031700145, var23);
                        class60.field1615 = 8;
                        class57.field1478.field1477 = 0;
                    } else if (class60.field1615 == 0) {
                        if (class57.field1478.field1469[0] == -1) {
                            class60.field1615 = 1;
                            class57.field1478.field1477 = 0;
                        } else {
                            class42.field1019 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var30) {
            try {
                class118.field2904.method1215(false);
            } catch (Exception var28) {
            }
            class118.field2904 = null;
            class1.field19++;
            return false;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
    public static final void method749(int arg0) {
        field2209++;
        if (class80.field1971) {
            class111.method949(18645);
            class80.field1971 = false;
            class99.method839(0);
            class113.field2832 = true;
            class52.field1243 = true;
            class130.field3190 = true;
            class34.field872 = true;
        }
        class9.method108(-2910);
        if (class55.field1432 && class99.field2365 == 1) {
            class52.field1243 = true;
        }
        if (class27.field679 != -1) {
            boolean var1 = class88.method742(class27.field679, 76);
            if (var1) {
                class52.field1243 = true;
            }
        }
        if (field2201 == 2) {
            class52.field1243 = true;
        }
        if (class118.field2915 == 2) {
            class52.field1243 = true;
        }
        if (class52.field1243) {
            class52.field1243 = false;
            class57.method494((byte) -25);
        }
        if (class87.field2162 == -1) {
            class79.field1939.field1378 = class88.field2189 - class141.field3490 - 77;
            if (class148.field3656 > 17 && class148.field3656 < 560 && class80.field1969 > 332) {
                class136.method1139(-1, class80.field1969 - 357, 0, (byte) -43, 463, class88.field2189, class148.field3656 - 17, 77, class79.field1939);
            }
            int var2 = class88.field2189 - class79.field1939.field1378 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class88.field2189 - 77) {
                var2 = class88.field2189 - 77;
            }
            if (class141.field3490 != var2) {
                class141.field3490 = var2;
                class113.field2832 = true;
            }
        }
        if (class87.field2162 == -1 && class3.field56 == 3) {
            class79.field1939.field1378 = class58.field1541;
            int var3 = class18.field480 * 14 + 7;
            if (class148.field3656 > 17 && class148.field3656 < 560 && class80.field1969 > 332) {
                class136.method1139(-1, class80.field1969 - 357, 0, (byte) -43, 463, var3, class148.field3656 - 17, 77, class79.field1939);
            }
            int var4 = class79.field1939.field1378;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > var3 - 77) {
                var4 = var3 - 77;
            }
            if (class58.field1541 != var4) {
                class113.field2832 = true;
                class58.field1541 = var4;
            }
        }
        if (class87.field2162 != -1) {
            boolean var5 = class88.method742(class87.field2162, 108);
            if (var5) {
                class113.field2832 = true;
            }
        }
        if (arg0 < 88) {
            method753(-117, (byte) -95, 56);
        }
        if (field2201 == 3) {
            class113.field2832 = true;
        }
        if (class118.field2915 == 3) {
            class113.field2832 = true;
        }
        if (class93.field2251 != null) {
            class113.field2832 = true;
        }
        if (class55.field1432 && class99.field2365 == 2) {
            class113.field2832 = true;
        }
        if (class113.field2832) {
            class113.field2832 = false;
            class105.method894((byte) -110);
        }
        class42.method361(true);
        if (class77.field1923 != -1) {
            class130.field3190 = true;
        }
        if (class130.field3190) {
            if (class77.field1923 != -1 && class77.field1923 == class57.field1473) {
                class14.field348++;
                class77.field1923 = -1;
                class134.field3276.method869((byte) 11, 66);
                class134.field3276.method514((byte) 73, class57.field1473);
            }
            class130.field3190 = false;
            class121.field2945 = true;
            class82.method710(1619, class57.field1473, class101.field2444 % 20 < 10 ? -1 : class77.field1923, class27.field679 == -1, class134.field3301);
        }
        if (class34.field872) {
            class121.field2945 = true;
            class34.field872 = false;
            class27.method252(class113.field2826, (byte) -128, class84.field2096, client.field529, class55.field1414);
        }
        class54.method445(-21808, class69.field1770.field3115, class84.field2116, class69.field1770.field3077, class143.field3566);
        class143.field3566 = 0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method750(byte arg0) {
        field2206 = null;
        field2197 = null;
        if (arg0 != 118) {
            return;
        }
        field2210 = null;
        field2194 = null;
        field2208 = null;
        field2204 = null;
        field2202 = null;
        field2198 = null;
        field2196 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lpc;Lpc;I)V")
    public static final void method751(class105 arg0, class105 arg1, int arg2) {
        class148.field3678 = arg1;
        class110.field2734 = arg0;
        int var3 = 17 / ((52 - arg2) / 55);
        field2212++;
        class132.field3228 = class110.field2734.method892(true, 3);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([BB)[B")
    public static final byte[] method752(byte[] arg0, byte arg1) {
        field2203++;
        class57 var2 = new class57(arg0);
        if (arg1 <= 124) {
            method747(-122);
        }
        int var3 = var2.method510(-124);
        int var4 = var2.method495(16711680);
        if (var4 < 0 || class11.field263 != 0 && var4 > class11.field263) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method493(0, var5, false, var4);
            return var5;
        } else {
            int var6 = var2.method495(16711680);
            if (var6 < 0 || class11.field263 != 0 && class11.field263 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class19.method183(var7, var6, arg0, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var9) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBI)V")
    public static final void method753(int arg0, byte arg1, int arg2) {
        field2195++;
        class83 var3 = class18.field476[class84.field2116][arg0][arg2];
        if (var3 == null) {
            class68.field1757.method68(class84.field2116, arg0, arg2);
            return;
        }
        class112 var4 = null;
        class112 var5 = (class112) var3.method722(114);
        int var6 = -99999999;
        while (var5 != null) {
            class143 var12 = class1.method2((byte) 116, var5.field2799);
            int var13 = var12.field3534;
            if (var12.field3568 == 1) {
                var13 = (var5.field2800 + 1) * var13;
            }
            if (var13 > var6) {
                var4 = var5;
                var6 = var13;
            }
            var5 = (class112) var3.method716(true);
        }
        if (var4 == null) {
            class68.field1757.method68(class84.field2116, arg0, arg2);
            return;
        }
        var3.method724(var4, 0);
        class112 var7 = (class112) var3.method722(121);
        int var8 = -10 % ((arg1 - 36) / 39);
        class112 var9 = null;
        class112 var10 = null;
        while (var7 != null) {
            if (var4.field2799 != var7.field2799) {
                if (var9 == null) {
                    var9 = var7;
                }
                if (var7.field2799 != var9.field2799 && var10 == null) {
                    var10 = var7;
                }
            }
            var7 = (class112) var3.method716(true);
        }
        int var11 = (arg2 << 7) + arg0 + 1610612736;
        class68.field1757.method44(class84.field2116, arg0, arg2, class137.method1144(true, arg0 * 128 + 64, arg2 * 128 - -64, class84.field2116), var4, var11, var9, var10);
    }
}
