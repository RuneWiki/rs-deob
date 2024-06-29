import java.awt.Font;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class30 extends InputStream {

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field413 = -1;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field420 = 0;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[I")
    public static int[] field422 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field425 = 0;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Ljava/awt/Font;")
    public static Font field421;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
    public static int[] field418;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 15)
    public static final void method142(byte arg0) {
        class264 var1 = class50.field761;
        synchronized (class50.field761) {
            if (arg0 != -70) {
                field420 = 69;
            }
            class14.field196 = class70.field1151;
            class98.field1587++;
            if (class270.field4566 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class217.field3655[var2] = false;
                }
                class270.field4566 = class219.field3672;
            } else {
                while (class270.field4566 != class219.field3672) {
                    int var3 = class227.field3816[class219.field3672];
                    class219.field3672 = class219.field3672 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class217.field3655[var3] = true;
                    } else {
                        class217.field3655[~var3] = false;
                    }
                }
            }
            class70.field1151 = class205.field3517;
        }
        field419++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 62)
    public static void method143(int arg0) {
        if (arg0 != 32767) {
            method146(true);
        }
        field421 = null;
        field422 = null;
        field418 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B[B)Lcm;", line = 74)
    public static final class312 method144(byte arg0, byte[] arg1) {
        field414++;
        if (arg0 < 11) {
            method144((byte) -13, (byte[]) null);
        }
        if (arg1 == null) {
            return null;
        }
        class312 var2;
        if (class56.field846) {
            var2 = new class299(arg1, class27.field386, class63.field1032, class279.field4643, class263.field4389, class190.field3255);
        } else {
            var2 = new class275(arg1, class27.field386, class63.field1032, class279.field4643, class263.field4389, class190.field3255);
        }
        class197.method1395((byte) 127);
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILlk;)V", line = 100)
    public static final void method145(int arg0, class252 arg1) {
        field417++;
        long var2 = 0L;
        if (arg1.field4221 == 0) {
            var2 = class214.method1486(arg1.field4228, arg1.field4209, arg1.field4230);
        }
        int var4 = -1;
        if (arg1.field4221 == 1) {
            var2 = class71.method513(arg1.field4228, arg1.field4209, arg1.field4230);
        }
        if (arg1.field4221 == 2) {
            var2 = class7.method39(arg1.field4228, arg1.field4209, arg1.field4230);
        }
        if (arg1.field4221 == 3) {
            var2 = class187.method1353(arg1.field4228, arg1.field4209, arg1.field4230);
        }
        int var5 = 0;
        if (arg0 >= -100) {
            method145(-56, (class252) null);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var5 = (int) var2 >> 20 & 0x3;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = ((int) var2 & 0x7D52A) >> 14;
        }
        arg1.field4222 = var4;
        arg1.field4217 = var5;
        arg1.field4231 = var6;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V", line = 147)
    public static final void method146(boolean arg0) {
        field423++;
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < class206.field3528; var1++) {
            int var2 = class139.field2526[var1];
            class89 var3 = class199.field3391[var2];
            int var4 = class227.field3834.method948(-123);
            if ((var4 & 0x80) != 0) {
                if (var3.field1389.method2045(-1)) {
                    class102.method697((byte) -124, var3);
                }
                var3.method625(class54.method344(class227.field3834.method971(-12), (byte) 35), 18);
                var3.method1015(11380, var3.field1389.field5109);
                var3.field2494 = var3.field1389.field5068;
                var3.field2458 = var3.field1389.field5086;
                var3.field2465 = var3.field1389.field5098;
                var3.field2441 = var3.field1389.field5115;
                var3.field2496 = var3.field1389.field5054;
                var3.field2474 = var3.field1389.field5084;
                var3.field2506 = var3.field1389.field5056;
                var3.field2442 = var3.field1389.field5066;
                if (var3.field1389.method2045(-1)) {
                    class53.method336(128, 0, var3, (class265) null, var3.field2460[0], (class301) null, class131.field2250, var3.field2471[0]);
                }
            }
            if ((var4 & 0x1) != 0) {
                int var5 = class227.field3834.method932(121);
                boolean var6 = true;
                int var7 = class227.field3834.method957(496113200);
                if (var5 == 65535) {
                    var5 = -1;
                }
                if (var5 != -1 && var3.field2445 != -1 && class110.method721(-125, class173.method1261(false, var5).field2976).field4878 < class110.method721(-125, class173.method1261(false, var3.field2445).field2976).field4878) {
                    var6 = false;
                }
                if (var6) {
                    var3.field2495 = var7 >> 16;
                    var3.field2445 = var5;
                    var3.field2439 = 0;
                    var3.field2477 = 0;
                    var3.field2466 = (var7 & 0xFFFF) + class249.field4174;
                    if (var3.field2466 > class249.field4174) {
                        var3.field2477 = -1;
                    }
                    if (var3.field2445 != -1 && class249.field4174 == var3.field2466) {
                        int var8 = class173.method1261(false, var3.field2445).field2976;
                        if (var8 != -1) {
                            class294 var9 = class110.method721(-124, var8);
                            if (var9 != null && var9.field4890 != null) {
                                class241.method1660(0, var3.field2461, false, var3.field2487, var9, (byte) -90);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                int var10 = class227.field3834.method948(-124);
                int var11 = class227.field3834.method948(-122);
                var3.method1009(class249.field4174, 0, var10, var11);
                var3.field2510 = class249.field4174 + 300;
                var3.field2454 = class227.field3834.method966(91);
            }
            if ((var4 & 0x4) != 0) {
                var3.field2446 = class227.field3834.method970(1);
                var3.field2456 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var12 = class227.field3834.method982((byte) 63);
                int var13 = class227.field3834.method966(58);
                if (var12 == 65535) {
                    var12 = -1;
                }
                class41.method262(var3, var13, var12, 0);
            }
            if ((var4 & 0x40) != 0) {
                var3.field2498 = class227.field3834.method942(true);
                var3.field2457 = class227.field3834.method982((byte) 66);
            }
            if ((var4 & 0x20) != 0) {
                var3.field2475 = class227.field3834.method932(110);
                if (var3.field2475 == 65535) {
                    var3.field2475 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var14 = class227.field3834.method928((byte) -51);
                int var15 = class227.field3834.method948(-121);
                var3.method1009(class249.field4174, 0, var14, var15);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V", line = 307)
    public static final void method147(int arg0, int arg1) {
        field416++;
        class97.field1563 = arg0;
        class281.method1880(arg1, arg1 - 3);
        class281.method1880(4, 0);
    }

    @OriginalMember(owner = "client!wc", name = "read", descriptor = "()I", line = 324)
    public final int read() {
        class313.method2158(30000L, true);
        field415++;
        return -1;
    }
}
