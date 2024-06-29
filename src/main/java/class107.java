import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class107 extends class65 {

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Lrc;")
    public static class105 field2452 = class43.method374("p12_full", 0);

    @OriginalMember(owner = "client!re", name = "J", descriptor = "Lrc;")
    public static class105 field2451 = class43.method374("Willkommen auf RuneScape", 0);

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field2445 = 0;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "Lmb;")
    public static class74 field2453 = new class74(4096);

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field2464 = 50;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "Lrc;")
    public static class105 field2462 = class43.method374("Registrierter Benutzer", 0);

    @OriginalMember(owner = "client!re", name = "T", descriptor = "Lrc;")
    public static class105 field2461 = class43.method374("(U5", 0);

    @OriginalMember(owner = "client!re", name = "V", descriptor = "Lrc;")
    public static class105 field2463 = class43.method374("Ein kostenloses Spielkonto erstellen)3", 0);

    @OriginalMember(owner = "client!re", name = "R", descriptor = "Z")
    public static boolean field2459 = false;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "J")
    public static long field2458;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "Lre;")
    public class107 field2450;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "Lre;")
    public class107 field2456;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "Lmd;")
    public static class76 field2465;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V", line = 12)
    public static final void method869(int arg0) {
        field2449++;
        class76.field1701 = 0;
        class58.field1237 = 0;
        client.method209(121);
        class116.method938(-2);
        class18.method202(0);
        class71.method604(61);
        for (int var1 = 0; var1 < class58.field1237; var1++) {
            int var4 = class73.field1602[var1];
            if (class104.field2351 != class58.field1303[var4].field1269) {
                class58.field1303[var4] = null;
            }
        }
        if (class80.field1794 != class18.field389.field143) {
            throw new RuntimeException("gpp1 pos:" + class18.field389.field143 + " psize:" + class80.field1794);
        }
        int var2 = 104 / ((arg0 + 58) / 48);
        for (int var3 = 0; var3 < class97.field2250; var3++) {
            if (class58.field1303[class121.field2956[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class97.field2250);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILbd;)V", line = 69)
    public static final void method870(int arg0, class11 arg1) {
        short var2 = 256;
        if (arg0 < 0) {
            field2440 = -71;
        }
        for (int var3 = 0; var3 < class29.field668.length; var3++) {
            class29.field668[var3] = 0;
        }
        field2448++;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class29.field668[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class97.field2241[var15] = (class29.field668[var15 + 128] + class29.field668[var15 - 1] + class29.field668[var15 + 1] + class29.field668[var15 - 128]) / 4;
                }
            }
            int[] var13 = class29.field668;
            class29.field668 = class97.field2241;
            class97.field2241 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field225; var7++) {
            for (int var8 = 0; var8 < arg1.field221; var8++) {
                if (arg1.field218[var6++] != 0) {
                    int var9 = var8 + arg1.field223 + 16;
                    int var10 = var7 + arg1.field219 + 16;
                    int var11 = (var10 << 7) + var9;
                    class29.field668[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lcb;IBI)V", line = 176)
    public static final void method871(class15 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 94) {
            method871(null, 10, (byte) -42, -74);
        }
        field2454++;
        if ((arg3 & 0x20) != 0) {
            arg0.field1264 = class18.field389.method62((byte) 119);
            if (arg0.field1264.method837(0, (byte) 59) == 126) {
                arg0.field1264 = arg0.field1264.method862(1, (byte) 80);
                client.method207(arg0.field300, -49, 2, arg0.field1264);
            } else if (class119.field2842 == arg0) {
                client.method207(arg0.field300, -58, 2, arg0.field1264);
            }
            arg0.field1260 = 150;
            arg0.field1291 = 0;
            arg0.field1225 = 0;
        }
        if ((arg3 & 0x100) != 0) {
            arg0.field1256 = class18.field389.method106((byte) -108);
            arg0.field1287 = class18.field389.method90(91);
            arg0.field1211 = class18.field389.method96(27023);
            arg0.field1248 = class18.field389.method65(false);
            arg0.field1272 = class18.field389.method101(2) + class104.field2351;
            arg0.field1288 = class18.field389.method103(0) + class104.field2351;
            arg0.field1219 = class18.field389.method65(false);
            arg0.method462(7362);
        }
        if ((arg3 & 0x1) != 0) {
            int var4 = class18.field389.method96(27023);
            int var5 = class18.field389.method106((byte) -120);
            arg0.method470(4, var5, var4, class104.field2351);
            arg0.field1221 = class104.field2351 + 300;
            arg0.field1222 = class18.field389.method96(27023);
            arg0.field1251 = class18.field389.method90(113);
        }
        if ((arg3 & 0x2) != 0) {
            arg0.field1277 = class18.field389.method101(2);
            arg0.field1273 = class18.field389.method101(2);
        }
        if ((arg3 & 0x10) != 0) {
            int var6 = class18.field389.method65(false);
            byte[] var7 = new byte[var6];
            class7 var8 = new class7(var7);
            class18.field389.method86(var6, 0, var7, -126);
            class78.field1745[arg1] = var8;
            arg0.method166((byte) 53, var8);
        }
        if ((arg3 & 0x200) != 0) {
            arg0.field1245 = class18.field389.method108((byte) -126);
            int var9 = class18.field389.method87(-3);
            arg0.field1235 = 0;
            if (arg0.field1245 == 65535) {
                arg0.field1245 = -1;
            }
            arg0.field1215 = 0;
            arg0.field1283 = class104.field2351 + (var9 & 0xFFFF);
            arg0.field1216 = var9 >> 16;
            if (arg0.field1283 > class104.field2351) {
                arg0.field1215 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var10 = class18.field389.method103(0);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = class18.field389.method96(27023);
            class76.method652(var10, -30713, arg0, var11);
        }
        if ((arg3 & 0x400) != 0) {
            int var12 = class18.field389.method106((byte) 30);
            int var13 = class18.field389.method65(false);
            arg0.method470(4, var13, var12, class104.field2351);
            arg0.field1221 = class104.field2351 + 300;
            arg0.field1222 = class18.field389.method65(false);
            arg0.field1251 = class18.field389.method96(27023);
        }
        if ((arg3 & 0x4) != 0) {
            arg0.field1214 = class18.field389.method67(0);
            if (arg0.field1214 == 65535) {
                arg0.field1214 = -1;
            }
        }
        if ((arg3 & 0x80) == 0) {
            return;
        }
        int var14 = class18.field389.method108((byte) -128);
        int var15 = class18.field389.method96(27023);
        int var16 = class18.field389.method90(76);
        int var17 = class18.field389.field143;
        if (arg0.field300 != null && arg0.field296 != null) {
            long var18 = arg0.field300.method828(455);
            boolean var20 = false;
            if (var15 <= 1) {
                for (int var21 = 0; var21 < class17.field361; var21++) {
                    if (class37.field866[var21] == var18) {
                        var20 = true;
                        break;
                    }
                }
            }
            if (!var20 && class110.field2556 == 0) {
                class75.field1673.field143 = 0;
                class18.field389.method86(var16, 0, class75.field1673.field117, -94);
                class75.field1673.field143 = 0;
                class105 var22 = class45.method383((byte) -124, class75.field1673).method835((byte) -125);
                arg0.field1264 = var22.method843(32);
                arg0.field1260 = 150;
                arg0.field1291 = var14 & 0xFF;
                arg0.field1225 = var14 >> 8;
                if (var15 == 2 || var15 == 3) {
                    client.method207(class108.method878(new class105[] { class43.field998, arg0.field300 }, 2867), -126, 1, var22);
                } else if (var15 == 1) {
                    client.method207(class108.method878(new class105[] { class80.field1796, arg0.field300 }, 2867), -116, 1, var22);
                } else {
                    client.method207(arg0.field300, -43, 2, var22);
                }
            }
        }
        class18.field389.field143 = var16 + var17;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V", line = 387)
    public static void method872(int arg0) {
        field2465 = null;
        field2452 = null;
        field2461 = null;
        field2463 = null;
        field2451 = null;
        if (arg0 != -20451) {
            method872(29);
        }
        field2462 = null;
        field2453 = null;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V", line = 403)
    public static final void method873(int arg0) {
        field2442++;
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class41.field926[var2 + (var1 - 2 << 7)] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = (int) (Math.random() * 124.0D) + 2;
            int var15 = (int) (Math.random() * 128.0D) + 128;
            int var16 = (var15 << 7) + var14;
            class41.field926[var16] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var12 = 1; var12 < 127; var12++) {
                int var13 = (var4 << 7) + var12;
                class127.field3081[var13] = (class41.field926[var13 + 128] + class41.field926[var13 - 128] + class41.field926[var13 + -1] + class41.field926[var13 + 1]) / 4;
            }
        }
        class6.field76 += 128;
        if (class6.field76 > class29.field668.length) {
            class6.field76 -= class29.field668.length;
            int var5 = (int) (Math.random() * 12.0D);
            method870(70, class65.field1456[var5]);
        }
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var9 = 1; var9 < 127; var9++) {
                int var10 = var9 + (var6 << 7);
                int var11 = class127.field3081[var10 + 128] - class29.field668[class6.field76 + var10 & class29.field668.length + -1] / 5;
                if (var11 < 0) {
                    var11 = 0;
                }
                class41.field926[var10] = var11;
            }
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class97.field2230[var7] = class97.field2230[var7 + 1];
        }
        class97.field2230[var1 - 1] = (int) (Math.sin((double) class104.field2351 / 14.0D) * 16.0D + Math.sin((double) class104.field2351 / 15.0D) * 14.0D + Math.sin((double) class104.field2351 / 16.0D) * 12.0D);
        if (class125.field3053 > 0) {
            class125.field3053 -= 4;
        }
        if (class133.field3220 > 0) {
            class133.field3220 -= 4;
        }
        if (arg0 != -10513) {
            field2451 = null;
        }
        if (class125.field3053 != 0 || class133.field3220 != 0) {
            return;
        }
        int var8 = (int) (Math.random() * 2000.0D);
        if (var8 == 0) {
            class125.field3053 = 1024;
        }
        if (var8 == 1) {
            class133.field3220 = 1024;
            return;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V", line = 565)
    public final void method874(boolean arg0) {
        field2455++;
        if (this.field2456 == null) {
            return;
        }
        this.field2456.field2450 = this.field2450;
        if (arg0) {
            this.field2450.field2456 = this.field2456;
            this.field2456 = null;
            this.field2450 = null;
        }
    }
}
