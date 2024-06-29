import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class78 {

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "J")
    public static long field1246 = 0L;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
    public static int[] field1245 = new int[1000];

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Ltl;")
    public static class59 field1247 = class85.method639(")1", 9588);

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "[I")
    public static int[] field1249 = new int[100];

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field1248 = 0;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lfg;")
    public class176 field1243;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Llj;")
    public class5 field1241;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[[B")
    public static byte[][] field1240;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "[[[B")
    public static byte[][][] field1250;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 4)
    public static void method608(int arg0) {
        field1249 = null;
        field1247 = null;
        field1240 = (byte[][]) null;
        if (arg0 != -20072) {
            method608(-98);
        }
        field1250 = (byte[][][]) null;
        field1245 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 23)
    public static final void method609(int arg0) {
        if (!class85.field1336) {
            if (class184.field3090 != 0) {
                class90.field1402 = class16.field204;
                class84.field1315 = class248.field4135;
            } else if (class154.field2513 == 0) {
                class90.field1402 = class254.field4213;
                class84.field1315 = class184.field3079;
            } else {
                class84.field1315 = class149.field2444;
                class90.field1402 = class231.field3794;
            }
            class93.field1440[0] = class46.field753;
            class294.field5015[0] = class275.field4742;
            class27.field363[0] = 1004;
            class231.field3803 = 1;
        }
        field1251++;
        if (class262.field4364 != -1) {
            class255.method1778(class262.field4364, 0);
        }
        for (int var1 = 0; var1 < class129.field2137; var1++) {
            if (class102.field1689[var1]) {
                class44.field719[var1] = true;
            }
            class199.field3303[var1] = class102.field1689[var1];
            class102.field1689[var1] = false;
        }
        class99.field1595 = null;
        class113.field1824 = -1;
        class87.field1378 = class30.field420;
        if (class55.field815) {
            class46.field749 = true;
        }
        class102.field1683 = -1;
        if (class262.field4364 != -1) {
            class129.field2137 = 0;
            class70.method569(class262.field4364, 0, -1, class53.field792, 0, 0, class152.field2498, 0, 0);
        }
        if (class55.field815) {
            class240.method1681();
        } else {
            class272.method1907();
        }
        class163.method1160(30903);
        if (class85.field1336) {
            class307.method2128(false);
        } else if (class113.field1824 != -1) {
            class288.method2006((byte) 77, class113.field1824, class102.field1683);
        }
        if (class176.field2888 == 3) {
            for (int var2 = 0; var2 < class129.field2137; var2++) {
                if (class199.field3303[var2]) {
                    if (class55.field815) {
                        class240.method1687(class249.field4144[var2], class229.field3718[var2], class40.field599[var2], field1249[var2], 16711935, 128);
                    } else {
                        class272.method1905(class249.field4144[var2], class229.field3718[var2], class40.field599[var2], field1249[var2], 16711935, 128);
                    }
                } else if (class44.field719[var2]) {
                    if (class55.field815) {
                        class240.method1687(class249.field4144[var2], class229.field3718[var2], class40.field599[var2], field1249[var2], 16711680, 128);
                    } else {
                        class272.method1905(class249.field4144[var2], class229.field3718[var2], class40.field599[var2], field1249[var2], 16711680, 128);
                    }
                }
            }
        }
        class239.method1673(class286.field4920.field1769, class64.field985, class286.field4920.field1774, (byte) 81, class247.field4119);
        class64.field985 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V", line = 143)
    public static final void method610(int arg0) {
        field1242++;
        int var1 = class18.field236.method1762((byte) 9, 8);
        if (class29.field385 > var1) {
            for (int var2 = var1; var2 < class29.field385; var2++) {
                class38.field583[class21.field282++] = class243.field4060[var2];
            }
        }
        if (var1 > class29.field385) {
            throw new RuntimeException("gppov1");
        }
        class29.field385 = 0;
        if (arg0 >= -66) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class243.field4060[var3];
            class102 var5 = class211.field3438[var4];
            int var6 = class18.field236.method1762((byte) 81, 1);
            if (var6 == 0) {
                class243.field4060[class29.field385++] = var4;
                var5.field1761 = class30.field420;
            } else {
                int var7 = class18.field236.method1762((byte) -124, 2);
                if (var7 == 0) {
                    class243.field4060[class29.field385++] = var4;
                    var5.field1761 = class30.field420;
                    class301.field5143[class255.field4242++] = var4;
                } else if (var7 == 1) {
                    class243.field4060[class29.field385++] = var4;
                    var5.field1761 = class30.field420;
                    int var11 = class18.field236.method1762((byte) -113, 3);
                    var5.method794(var11, -65, false);
                    int var12 = class18.field236.method1762((byte) -115, 1);
                    if (var12 == 1) {
                        class301.field5143[class255.field4242++] = var4;
                    }
                } else if (var7 == 2) {
                    class243.field4060[class29.field385++] = var4;
                    var5.field1761 = class30.field420;
                    int var8 = class18.field236.method1762((byte) 38, 3);
                    var5.method794(var8, -74, true);
                    int var9 = class18.field236.method1762((byte) 75, 3);
                    var5.method794(var9, -81, true);
                    int var10 = class18.field236.method1762((byte) 82, 1);
                    if (var10 == 1) {
                        class301.field5143[class255.field4242++] = var4;
                    }
                } else if (var7 == 3) {
                    class38.field583[class21.field282++] = var4;
                }
            }
        }
    }
}
