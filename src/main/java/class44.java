import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 extends class46 {

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "Lsc;")
    public static class128 field824 = class129.method1017(false, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!ga", name = "fb", descriptor = "[S")
    public static short[] field826 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "Lsc;")
    public static class128 field823 = class129.method1017(false, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!ga", name = "gb", descriptor = "B")
    public byte field827;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ga", name = "ib", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ga", name = "jb", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!ga", name = "lb", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ga", name = "kb", descriptor = "Lsf;")
    public static class131 field831;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "Lae;")
    public class6 field825;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;BII)Lrd;")
    public static final class122 method313(Component arg0, byte arg1, int arg2, int arg3) {
        field822++;
        try {
            Class var4 = Class.forName("hc");
            class122 var5 = (class122) var4.getDeclaredConstructor().newInstance();
            var5.method67(arg3, false, arg0, arg2);
            if (arg1 != 55) {
                method317(-85);
            }
            return var5;
        } catch (Throwable var7) {
            class9 var6 = new class9();
            var6.method67(arg3, false, arg0, arg2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lud;BZ)V")
    public static final void method314(class143 arg0, byte arg1, boolean arg2) {
        int var3 = -84 % ((-arg1 - 4) / 33);
        int var4 = arg0.field3349;
        int var5 = (int) arg0.field365;
        arg0.method172(-2658);
        if (arg2) {
            class55.method426(var4, 0);
        }
        field817++;
        class108.method835(1576156720, var4);
        class54 var6 = class46.method338(var5, 92);
        if (var6 != null) {
            class89.method696(var6, 1);
        }
        class7.field103 = 0;
        class135.field3180 = false;
        class19.method169((byte) -58, class99.field2298, class149.field3441, class92.field2082, class100.field2306);
        if (class29.field556 != -1) {
            class122.method937((byte) -68, 1, class29.field556);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)Ls;")
    public static final class125 method315(boolean arg0, int arg1) {
        class125 var2 = (class125) class51.field1034.method917((long) arg1, -1);
        if (arg0) {
            field831 = null;
        }
        field828++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class79.field1755.method1023(arg1, 3, (byte) -35);
        class125 var4 = new class125();
        if (var3 != null) {
            var4.method952(new class86(var3), -113);
        }
        class51.field1034.method913((long) arg1, var4, (byte) 91);
        return var4;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static final void method316(int arg0) {
        field819++;
        if (class12.field193 > 0) {
            class90.method704(arg0 ^ 0xFFFFA19D);
        } else if (arg0 == 4550) {
            class23.method206(arg0 - 4530, 40);
            class106.field2417 = class63.field1358;
            class63.field1358 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public static final void method317(int arg0) {
        class75.method558(97, false);
        boolean var1 = true;
        field820++;
        client.field428 = 0;
        for (int var2 = 0; var2 < class12.field203.length; var2++) {
            if (class79.field1753[var2] != -1 && class12.field203[var2] == null) {
                class12.field203[var2] = class1.field1.method1023(0, class79.field1753[var2], (byte) -35);
                if (class12.field203[var2] == null) {
                    client.field428++;
                    var1 = false;
                }
            }
            if (class18.field335[var2] != -1 && class110.field2488[var2] == null) {
                class110.field2488[var2] = class1.field1.method1042(33, class36.field702[var2], class18.field335[var2], 0);
                if (class110.field2488[var2] == null) {
                    client.field428++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class89.field2034 = 1;
            return;
        }
        class49.field876 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class12.field203.length; var4++) {
            byte[] var56 = class110.field2488[var4];
            if (var56 != null) {
                int var57 = (class65.field1446[var4] >> 8) * 64 - class62.field1325;
                int var58 = (class65.field1446[var4] & 0xFF) * 64 - class66.field1482;
                if (class41.field766) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class125.method955(var56, var57, true, var58);
            }
        }
        if (!var3) {
            class89.field2034 = 2;
            return;
        }
        if (class89.field2034 != 0) {
            class63.method468(true, class51.method395(new class128[] { class27.field526, class151.field3468 }, false), (byte) 64);
        }
        class7.method31((byte) 0);
        class122.method939(28803);
        class7.method31((byte) 0);
        class154.field3553.method109();
        class7.method31((byte) 0);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class104.field2359[var5].method211(128);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class110.field2485[var6][var54][var55] = 0;
                }
            }
        }
        class7.method31((byte) 0);
        class67.method506(104);
        int var7 = class12.field203.length;
        class7.method36(arg0 ^ 0xFFFFAD2B);
        class75.method558(arg0 - 21081, true);
        if (!class41.field766) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class65.field1446[var8] >> 8) * 64 - class62.field1325;
                int var18 = (class65.field1446[var8] & 0xFF) * 64 - class66.field1482;
                byte[] var19 = class12.field203[var8];
                if (var19 != null) {
                    class7.method31((byte) 0);
                    class18.method160(class104.field2359, var18, (class27.field515 - 6) * 8, (byte) 102, var19, class30.field602 * 8 - 48, var17);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class65.field1446[var9] >> 8) * 64 - class62.field1325;
                byte[] var15 = class12.field203[var9];
                int var16 = (class65.field1446[var9] & 0xFF) * 64 - class66.field1482;
                if (var15 == null && class27.field515 < 800) {
                    class7.method31((byte) 0);
                    class42.method301(var16, 10772, var14, 64, 64);
                }
            }
            class75.method558(arg0 - 21063, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class110.field2488[var10];
                if (var11 != null) {
                    int var12 = (class65.field1446[var10] >> 8) * 64 - class62.field1325;
                    int var13 = (class65.field1446[var10] & 0xFF) * 64 - class66.field1482;
                    class7.method31((byte) 0);
                    class66.method495(var11, var13, var12, arg0 - 21180, class154.field3553, class104.field2359);
                }
            }
        }
        if (class41.field766) {
            for (int var20 = 0; var20 < 4; var20++) {
                class7.method31((byte) 0);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class103.field2353[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 1 & 0x3;
                            int var40 = var37 >> 14 & 0x3FF;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + (var41 / 8);
                            for (int var43 = 0; var43 < class65.field1446.length; var43++) {
                                if (class65.field1446[var43] == var42 && class12.field203[var43] != null) {
                                    class129.method1019((var40 & 0x7) * 8, (var41 & 0x7) * 8, class12.field203[var43], 2048, var20, var39, class104.field2359, var34 * 8, var35 * 8, var38);
                                    var36 = true;
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class111.method855(var20, var34 * 8, var35 * 8, arg0 ^ 0xFFFFAD43);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class103.field2353[0][var21][var32];
                    if (var33 == -1) {
                        class42.method301(var32 * 8, 10772, var21 * 8, 8, 8);
                    }
                }
            }
            class75.method558(124, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class7.method31((byte) 0);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class103.field2353[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + (var28 / 8);
                            for (int var31 = 0; var31 < class65.field1446.length; var31++) {
                                if (class65.field1446[var31] == var30 && class110.field2488[var31] != null) {
                                    class113.method865(var22, (var28 & 0x7) * 8, var26, class110.field2488[var31], class154.field3553, class104.field2359, 0, var24 * 8, var23 * 8, var27, (var29 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class75.method558(100, true);
        class122.method939(28803);
        class7.method31((byte) 0);
        class151.method1200(true, class104.field2359, class154.field3553);
        if (arg0 != 21180) {
            return;
        }
        class75.method558(103, true);
        int var44 = class93.field2146;
        if (class29.field553 < var44) {
            var44 = class29.field553;
        }
        if (class29.field553 - 1 > var44) {
            int var45 = class29.field553 - 1;
        }
        if (class110.field2487) {
            class154.field3553.method116(class93.field2146);
        } else {
            class154.field3553.method116(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class55.method424(var46, var53, (byte) 125);
            }
        }
        class7.method31((byte) 0);
        class131.method1030(arg0 ^ 0x52DC);
        class42.field783.method919((byte) -104);
        if (class115.field2577 != null) {
            class99.field2290++;
            class152.field3502.method507(arg0 - 21303, 141);
            class152.field3502.method649(-123, 1057001181);
        }
        if (!class41.field766) {
            int var47 = (class27.field515 - 6) / 8;
            int var48 = (class27.field515 + 6) / 8;
            int var49 = (class30.field602 + 6) / 8;
            int var50 = (class30.field602 - 6) / 8;
            for (int var51 = var50 - 1; var51 <= var49 + 1; var51++) {
                for (int var52 = var47 - 1; var52 <= var48 + 1; var52++) {
                    if (var50 > var51 || var51 > var49 || var47 > var52 || var48 < var52) {
                        class1.field1.method1046(class51.method395(new class128[] { class140.field3268, class111.method857(var51, (byte) -61), class124.field2804, class111.method857(var52, (byte) 111) }, false), 0);
                        class1.field1.method1046(class51.method395(new class128[] { class106.field2423, class111.method857(var51, (byte) 126), class124.field2804, class111.method857(var52, (byte) -13) }, false), 0);
                    }
                }
            }
        }
        class23.method206(arg0 - 21160, 30);
        class7.method31((byte) 0);
        class124.method947(-257);
        class152.field3502.method507(-116, 124);
        class104.method777((byte) -125);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILsc;Ljava/awt/Color;I)V")
    public static final void method318(int arg0, class128 arg1, Color arg2, int arg3) {
        field829++;
        try {
            Graphics var4 = class127.field2888.getGraphics();
            int var5 = 22 % ((arg3 + 59) / 51);
            if (class84.field1883 == null) {
                class84.field1883 = new Font("Helvetica", 1, 13);
                class36.field684 = class127.field2888.getFontMetrics(class84.field1883);
            }
            if (class121.field2755) {
                class121.field2755 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class89.field2036, class6.field99);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class113.field2544 == null) {
                    class113.field2544 = class127.field2888.createImage(304, 34);
                }
                Graphics var6 = class113.field2544.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(class84.field1883);
                var6.setColor(Color.white);
                arg1.method997(22, var6, (byte) 108, (304 - arg1.method1013(0, class36.field684)) / 2);
                var4.drawImage(class113.field2544, class89.field2036 / 2 - 152, class6.field99 / 2 + -18, null);
            } catch (Exception var9) {
                int var7 = class89.field2036 / 2 - 152;
                int var8 = class6.field99 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 - -1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class84.field1883);
                var4.setColor(Color.white);
                arg1.method997(var8 + 22, var4, (byte) 84, (304 - arg1.method1013(0, class36.field684)) / 2 + var7);
            }
        } catch (Exception var10) {
            class127.field2888.repaint();
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Lbc;")
    public static final class11 method319(int arg0, int arg1) {
        field832++;
        class11 var2 = (class11) class46.field845.method917((long) arg0, -1);
        if (var2 != null) {
            return var2;
        }
        int var3 = 60 / ((arg1 + 57) / 48);
        byte[] var4 = class93.field2148.method1023(arg0, 5, (byte) -35);
        class11 var5 = new class11();
        if (var4 != null) {
            var5.method87(30, new class86(var4));
        }
        class46.field845.method913((long) arg0, var5, (byte) 107);
        return var5;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V")
    public static void method320(byte arg0) {
        if (arg0 == 108) {
            field824 = null;
            field831 = null;
            field823 = null;
            field826 = null;
        }
    }
}
