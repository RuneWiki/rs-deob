import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class23 implements Runnable {

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Z")
    public boolean field309 = true;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Ljava/lang/Object;")
    public Object field318 = new Object();

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
    public int[] field321 = new int[500];

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "[I")
    public int[] field322 = new int[500];

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public int field323 = 0;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
    public static int[] field313 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field315 = 2;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lcc;")
    public static class263 field310;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 12)
    public static final void method148(byte arg0) {
        int var1 = 56 % ((arg0 + 33) / 55);
        int var2 = class286.method2045(75);
        if (var2 == 0) {
            class15.field215 = (byte[][][]) null;
            class281.method2008(0, 0);
        } else if (var2 == 1) {
            class89.method525(false, (byte) 0);
            class281.method2008(512, 0);
            if (class264.field4163 != null) {
                class277.method1994(76);
            }
        } else {
            class89.method525(false, (byte) (class262.field3962 - 4 & 0xFF));
            class281.method2008(2, 0);
        }
        field311++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)I", line = 42)
    public static final int method149(byte arg0, int arg1) {
        field312++;
        if (arg1 < 0) {
            return 0;
        }
        class286 var2 = (class286) class229.field3337.method1537((long) arg1, -22708);
        if (var2 == null) {
            return class152.method1014(arg1, 76).field4977;
        }
        int var3 = 0;
        int var4 = 127 / ((arg0 + 46) / 62);
        for (int var5 = 0; var5 < var2.field4498.length; var5++) {
            if (var2.field4498[var5] == -1) {
                var3++;
            }
        }
        return var3 + (class152.method1014(arg1, 98).field4977 - var2.field4498.length);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)[Ljd;", line = 76)
    public static final class149[] method150(boolean arg0) {
        field308++;
        if (class109.field1493 == null) {
            class149[] var1 = class177.method1215(21134, class9.field131);
            int var2 = 0;
            class149[] var3 = new class149[var1.length];
            label58: for (int var4 = 0; var4 < var1.length; var4++) {
                class149 var5 = var1[var4];
                if ((var5.field2069 <= 0 || var5.field2069 >= 24) && var5.field2077 >= 800 && var5.field2067 >= 600) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        class149 var7 = var3[var6];
                        if (var5.field2077 == var7.field2077 && var5.field2067 == var7.field2067) {
                            if (var7.field2069 < var5.field2069) {
                                var3[var6] = var5;
                            }
                            continue label58;
                        }
                    }
                    var3[var2] = var5;
                    var2++;
                }
            }
            class109.field1493 = new class149[var2];
            class86.method508(var3, 0, class109.field1493, 0, var2);
            int[] var8 = new int[class109.field1493.length];
            for (int var9 = 0; var9 < class109.field1493.length; var9++) {
                class149 var10 = class109.field1493[var9];
                var8[var9] = var10.field2077 * var10.field2067;
            }
            class145.method981(true, class109.field1493, var8);
        }
        if (arg0) {
            field313 = (int[]) null;
        }
        return class109.field1493;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V", line = 157)
    public static final void method151(int arg0, byte arg1) {
        field314++;
        int var2 = class130.field1792;
        int var3 = class301.field4704;
        int var4 = class109.field1506;
        int var5 = class30.field380;
        int var6 = class323.field4975;
        int var7 = (int) class184.field2664;
        if (var7 < client.field4233 / 256) {
            var7 = client.field4233 / 256;
        }
        if (class74.field958[4] && (class98.field1282[4] + 128) > var7) {
            var7 = class98.field1282[4] + 128;
        }
        int var8 = (int) class280.field4344 + class238.field3501 & 0x7FF;
        class89.method524(class184.method1278(class138.field1940, -13660, class118.field1664.field2357, class118.field1664.field2392) - 50, class158.field2180, var7 * 3 + 600, var8, arg0, 17699, class231.field3370, var7);
        if (class130.field1792 == var2 && class301.field4704 == var3 && class109.field1506 == var4 && class30.field380 == var5 && class323.field4975 == var6) {
            class118.field1671 = 1;
            return;
        }
        class221.field3122 = 10;
        class68.field897 = 10;
        int var9 = class323.field4975 - var6;
        class149.field2066 = 10;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (class30.field380 > var5) {
            var5 += (class30.field380 - var5) * class149.field2066 / 1000 + class68.field897;
            if (var5 < class30.field380) {
                class30.field380 = var5;
            }
        }
        if (class30.field380 < var5) {
            int var10 = var5 - ((var5 - class30.field380) * class149.field2066 / 1000 + class68.field897);
            if (var10 > class30.field380) {
                class30.field380 = var10;
            }
        }
        class216.field3028 = 10;
        if (var3 < class301.field4704) {
            var3 += (class301.field4704 - var3) * class221.field3122 / 1000 + class216.field3028;
            if (class301.field4704 > var3) {
                class301.field4704 = var3;
            }
        }
        if (class109.field1506 > var4) {
            var4 += class216.field3028 + ((class109.field1506 - var4) * class221.field3122 / 1000);
            if (var4 < class109.field1506) {
                class109.field1506 = var4;
            }
        }
        if (var4 > class109.field1506) {
            int var11 = var4 - (class216.field3028 + ((var4 - class109.field1506) * class221.field3122 / 1000));
            if (var11 > class109.field1506) {
                class109.field1506 = var11;
            }
        }
        if (var2 < class130.field1792) {
            var2 += class216.field3028 + ((class130.field1792 - var2) * class221.field3122 / 1000);
            if (var2 < class130.field1792) {
                class130.field1792 = var2;
            }
        }
        if (arg1 != -78) {
            field315 = 9;
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        if (class130.field1792 < var2) {
            int var12 = var2 - ((var2 - class130.field1792) * class221.field3122 / 1000 + class216.field3028);
            if (class130.field1792 < var12) {
                class130.field1792 = var12;
            }
        }
        if (var3 > class301.field4704) {
            int var13 = var3 - (class216.field3028 + ((var3 - class301.field4704) * class221.field3122 / 1000));
            if (class301.field4704 < var13) {
                class301.field4704 = var13;
            }
        }
        if (var9 > 0) {
            int var14 = class149.field2066 * var9 / 1000 + class68.field897 + var6;
            var6 = var14 & 0x7FF;
        }
        if (var9 < 0) {
            int var15 = var6 - (-var9 * class149.field2066 / 1000 + class68.field897);
            var6 = var15 & 0x7FF;
        }
        int var16 = class323.field4975 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var9 <= 0 || var16 > 0 && var9 < 0) {
            class323.field4975 = var6;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 305)
    public static void method152(int arg0) {
        field313 = null;
        field310 = null;
        if (arg0 != 256) {
            method149((byte) -42, 124);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Llc;ZI)Lbi;", line = 321)
    public static final class91 method153(class175 arg0, boolean arg1, int arg2) {
        field307++;
        if (arg1) {
            return class115.method786(arg2, 122, arg0) ? class61.method356((byte) -101) : null;
        } else {
            return (class91) null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 336)
    public static final void method154(byte arg0, String arg1, boolean arg2) {
        field317++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class179.field2601.method63(arg1, 250);
        int var7 = class179.field2601.method70(arg1, 250) * 13;
        if (arg0 != -32) {
            return;
        }
        if (class250.field3787) {
            class306.method2154(var4 - var3, -var3 + var5, var3 + var3 + var6, var7 - -var3 + var3, 0);
            class306.method2156(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        } else {
            class144.method977(var4 - var3, -var3 + var5, var3 + var3 + var6, var3 + var7 - -var3, 0);
            class144.method964(var4 - var3, -var3 + var5, var6 - (-var3 - var3), var3 - -var3 + var7, 16777215);
        }
        class179.field2601.method83(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class63.method390(var5 - var3, var7 - -var3 + var3, arg0 + 158, -var3 + var4, var6 + var3 + var3);
        if (!arg2) {
            class227.method1561(var6, var4, var7, var5, arg0 + 50);
        } else if (class250.field3787) {
            class250.method1809();
        } else {
            try {
                Graphics var8 = class260.field3941.getGraphics();
                class72.field916.method909(var8, 0, 0, (byte) 71);
            } catch (Exception var10) {
                class260.field3941.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "run", descriptor = "()V", line = 391)
    public final void run() {
        while (this.field309) {
            Object var1 = this.field318;
            synchronized (this.field318) {
                if (this.field323 < 500) {
                    this.field322[this.field323] = class211.field2987;
                    this.field321[this.field323] = class161.field2216;
                    this.field323++;
                }
            }
            class81.method485(50L, 1);
        }
        field316++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Llc;Llc;I)V", line = 414)
    public static final void method155(class175 arg0, class175 arg1, int arg2) {
        field306++;
        class316.field4877 = arg1;
        class177.field2579 = arg0;
        if (arg2 != 8957) {
            field313 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 430)
    public static final void method156(byte arg0) {
        class213.field2998.method1237((byte) -92);
        if (arg0 > -14) {
            field315 = 58;
        }
        field319++;
        class133.field1826.method1237((byte) -104);
        class301.field4689.method1237((byte) 77);
    }
}
