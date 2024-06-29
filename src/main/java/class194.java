import java.io.IOException;
import java.net.Socket;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class194 extends class199 {

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    private int field2675 = 1;

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
    private int field2684 = 204;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    private int field2676 = 1;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field2673 = 0;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
    public static int field2682 = -1;

    @OriginalMember(owner = "client!qj", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field2688 = "Please remove ";

    @OriginalMember(owner = "client!qj", name = "ib", descriptor = "[I")
    public static int[] field2689 = new int[2000];

    @OriginalMember(owner = "client!qj", name = "jb", descriptor = "Ljava/lang/String;")
    public static String field2690 = null;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!qj", name = "fb", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!qj", name = "gb", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!qj", name = "eb", descriptor = "[[B")
    public static byte[][] field2685;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I", line = 13)
    public final int[] method190(int arg0, int arg1) {
        field2678++;
        if (arg0 != -1735) {
            method1404((byte) -48);
        }
        int[] var3 = this.field2802.method2502(arg1, -93);
        if (this.field2802.field5637) {
            for (int var4 = 0; var4 < class95.field1235; var4++) {
                int var5 = class82.field1062[var4];
                int var6 = this.field2675 * var5 >> 12;
                int var7 = class274.field3919[arg1];
                int var8 = this.field2676 * var7 >> 12;
                int var9 = var5 % (4096 / this.field2675) * this.field2675;
                int var10 = var7 % (4096 / this.field2676) * this.field2676;
                if (var10 < this.field2684) {
                    for (var6 -= var8; var6 < 0; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field2684) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field2684) {
                    int var11;
                    for (var11 = var6 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 104)
    public class194() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLfd;I)V", line = 118)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2675 = arg1.method2096((byte) -122);
        } else if (arg2 == 1) {
            this.field2676 = arg1.method2096((byte) -122);
        } else if (arg2 == 2) {
            this.field2684 = arg1.method2083((byte) -101);
        }
        if (arg0 == -43) {
            field2680++;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)V", line = 151)
    public static final void method1401(int arg0, int arg1) {
        field2683++;
        int var2 = -3 / ((1 - arg1) / 52);
        class17.field205.method2264((byte) -123, arg0);
        class122.field1597.method2264((byte) 88, arg0);
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V", line = 162)
    public static void method1402(int arg0) {
        field2690 = null;
        if (arg0 != 0) {
            method1406(-115);
        }
        field2689 = null;
        field2688 = null;
        field2685 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()V", line = 178)
    public static final void method1403() {
        GL var0 = class47.field592;
        var0.glDisableClientState(32886);
        class47.method367(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class47.method346();
        for (int var1 = 0; var1 < class133.field1810[0].length; var1++) {
            class70 var2 = class133.field1810[0][var1];
            if (var2.field913 >= 0 && class328.method2271(class350.field5467.method905(var2.field913, 255), (byte) -123)) {
                var0.glColor4fv(class196.method1417(-13316, var2.field898), 0);
                float var3 = 201.5F - (var2.field909 ? 1.0F : 0.5F);
                var2.method515(class345.field5367, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class47.method375();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class47.method348();
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)V", line = 215)
    public static final void method1404(byte arg0) {
        field2687++;
        if (arg0 != -23) {
            return;
        }
        class56.method423();
        for (int var1 = 0; var1 < 4; var1++) {
            class231.field3312[var1].method56(11736);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 234)
    public static final void method1405(String arg0, int arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        field2681++;
        int var4 = 0;
        short[] var5 = new short[16];
        if (arg1 < 63) {
            field2690 = (String) null;
        }
        for (int var6 = 0; var6 < class26.field296; var6++) {
            class362 var7 = class172.method1265(var6, (byte) 2);
            if ((!arg2 || var7.field5666) && var7.field5700 == -1 && var7.field5687 == -1 && var7.field5658 == 0 && var7.field5674.toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 250) {
                    class299.field4376 = -1;
                    class225.field3242 = null;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var4++] = (short) var6;
            }
        }
        class299.field4376 = var4;
        class86.field1103 = 0;
        class225.field3242 = var5;
        String[] var10 = new String[class299.field4376];
        for (int var11 = 0; var11 < class299.field4376; var11++) {
            var10[var11] = class172.method1265(var5[var11], (byte) -121).field5674;
        }
        class294.method2009(class225.field3242, -87, var10);
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V", line = 306)
    public static final void method1406(int arg0) {
        if (arg0 >= -76) {
            method1404((byte) 124);
        }
        class182.field2482.method2258((byte) 86);
        field2686++;
        class142.field1982.method2258((byte) 86);
        class103.field1335.method2258((byte) 86);
        class253.field3698.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(B)V", line = 323)
    public static final void method1407(byte arg0) {
        if (arg0 != 57) {
            method1405((String) null, -5, false);
        }
        field2677++;
        if (class217.field3067 == 0 || class217.field3067 == 5) {
            return;
        }
        try {
            if (++class274.field3922 > 2000) {
                if (class265.field3848 != null) {
                    class265.field3848.method526(-19055);
                    class265.field3848 = null;
                }
                if (class28.field322 >= 1) {
                    class217.field3067 = 0;
                    class49.field654 = -5;
                    return;
                }
                if (class238.field3441 == class170.field2360) {
                    class238.field3441 = class331.field4941;
                } else {
                    class238.field3441 = class170.field2360;
                }
                class28.field322++;
                class217.field3067 = 1;
                class274.field3922 = 0;
            }
            if (class217.field3067 == 1) {
                class236.field3406 = class157.field2216.method505(19, class167.field2336, class238.field3441);
                class217.field3067 = 2;
            }
            if (class217.field3067 == 2) {
                if (class236.field3406.field2608 == 2) {
                    throw new IOException();
                }
                if (class236.field3406.field2608 != 1) {
                    return;
                }
                class265.field3848 = new class71((Socket) class236.field3406.field2606, class157.field2216);
                class236.field3406 = null;
                long var1 = class336.field5242 = class201.method1476(-122, class89.field1117);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class251.field3681.field4351 = 0;
                class251.field3681.method2048(14, 114);
                class251.field3681.method2048(var3, 91);
                class265.field3848.method530(0, class251.field3681.field4350, 2, 30000);
                if (class335.field5234 != null) {
                    class335.field5234.method2458(2);
                }
                if (class328.field4801 != null) {
                    class328.field4801.method2458(2);
                }
                int var4 = class265.field3848.method528(true);
                if (class335.field5234 != null) {
                    class335.field5234.method2458(arg0 ^ 0x3B);
                }
                if (class328.field4801 != null) {
                    class328.field4801.method2458(2);
                }
                if (var4 != 0) {
                    class49.field654 = var4;
                    class217.field3067 = 0;
                    class265.field3848.method526(-19055);
                    class265.field3848 = null;
                    return;
                }
                class217.field3067 = 3;
            }
            if (class217.field3067 == 3) {
                if (class265.field3848.method524((byte) -75) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class265.field3848.method522(0, class240.field3490.field4350, 8, (byte) 21);
                class240.field3490.field4351 = 0;
                class354.field5532 = class240.field3490.method2089((byte) 114);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class354.field5532;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class251.field3681.field4351 = 0;
                var5[2] = (int) (class354.field5532 >> 32);
                class251.field3681.method2048(10, 107);
                class251.field3681.method2084(true, var5[0]);
                class251.field3681.method2084(true, var5[1]);
                class251.field3681.method2084(true, var5[2]);
                class251.field3681.method2084(true, var5[3]);
                class251.field3681.method2049(-19780, class201.method1476(arg0 - 183, class89.field1117));
                class251.field3681.method2042(class314.field4635, -37);
                class251.field3681.method2095(class71.field926, class312.field4586, 0);
                class10.field123.field4351 = 0;
                if (class316.field4661 == 40) {
                    class10.field123.method2048(18, 126);
                } else {
                    class10.field123.method2048(16, 61);
                }
                class10.field123.method2098(arg0 - 161, class251.field3681.field4351 + 163 - -class173.method1271((byte) 102, field2690));
                class10.field123.method2084(true, 550);
                class10.field123.method2048(class315.field4643, 65);
                class10.field123.method2048(class16.field203 ? 1 : 0, 81);
                class10.field123.method2048(1, 81);
                class10.field123.method2048(class33.method213(59), 90);
                class10.field123.method2098(-82, class163.field2314);
                class10.field123.method2098(arg0 ^ 0xFFFFFF9F, class192.field2660);
                class10.field123.method2048(class24.field266, 99);
                class167.method1243(class10.field123, arg0 ^ 0xFFFFFFC6);
                class10.field123.method2042(field2690, -31);
                class10.field123.method2084(true, class185.field2522);
                class10.field123.method2084(true, class330.method2283((byte) -67));
                class352.field5491 = true;
                class10.field123.method2098(-70, class107.field1386);
                class10.field123.method2084(true, class96.field1249.method1086(arg0 + 28475));
                class10.field123.method2084(true, class340.field5313.method1086(28532));
                class10.field123.method2084(true, class3.field24.method1086(28532));
                class10.field123.method2084(true, class293.field4264.method1086(28532));
                class10.field123.method2084(true, class17.field213.method1086(28532));
                class10.field123.method2084(true, class5.field61.method1086(28532));
                class10.field123.method2084(true, class305.field4459.method1086(28532));
                class10.field123.method2084(true, class262.field3790.method1086(28532));
                class10.field123.method2084(true, class1.field7.method1086(arg0 + 28475));
                class10.field123.method2084(true, class143.field1998.method1086(28532));
                class10.field123.method2084(true, class27.field317.method1086(28532));
                class10.field123.method2084(true, class135.field1844.method1086(arg0 + 28475));
                class10.field123.method2084(true, class52.field692.method1086(28532));
                class10.field123.method2084(true, class283.field4033.method1086(arg0 + 28475));
                class10.field123.method2084(true, class72.field959.method1086(28532));
                class10.field123.method2084(true, class275.field3949.method1086(28532));
                class10.field123.method2084(true, class9.field103.method1086(28532));
                class10.field123.method2084(true, class35.field431.method1086(28532));
                class10.field123.method2084(true, class328.field4802.method1086(arg0 + 28475));
                class10.field123.method2084(true, class144.field2007.method1086(arg0 ^ 0x6F4D));
                class10.field123.method2084(true, class208.field2954.method1086(arg0 ^ 0x6F4D));
                class10.field123.method2084(true, class323.field4733.method1086(28532));
                class10.field123.method2084(true, class336.field5245.method1086(28532));
                class10.field123.method2084(true, class114.field1473.method1086(28532));
                class10.field123.method2084(true, class346.field5381.method1086(28532));
                class10.field123.method2084(true, class315.field4642.method1086(28532));
                class10.field123.method2084(true, class297.field4306.method1086(arg0 ^ 0x6F4D));
                class10.field123.method2084(true, class102.field1324.method1086(arg0 + 28475));
                class10.field123.method2084(true, class169.field2355.method1086(28532));
                class10.field123.method2061(0, class251.field3681.field4350, class251.field3681.field4351, (byte) -109);
                class265.field3848.method530(0, class10.field123.field4350, class10.field123.field4351, 30000);
                class251.field3681.method1298(var5, -1);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class240.field3490.method1298(var5, -1);
                class217.field3067 = 4;
            }
            if (class217.field3067 == 4) {
                if (class265.field3848.method524((byte) -55) < 1) {
                    return;
                }
                int var7 = class265.field3848.method528(true);
                if (var7 == 21) {
                    class217.field3067 = 7;
                } else if (var7 == 29) {
                    class217.field3067 = 10;
                } else if (var7 == 1) {
                    class49.field654 = var7;
                    class217.field3067 = 5;
                    return;
                } else if (var7 == 2) {
                    class217.field3067 = 8;
                } else if (var7 == 15) {
                    class49.field654 = var7;
                    class217.field3067 = 0;
                    return;
                } else if (var7 == 23 && class28.field322 < 1) {
                    class217.field3067 = 1;
                    class274.field3922 = 0;
                    class28.field322++;
                    class265.field3848.method526(-19055);
                    class265.field3848 = null;
                    return;
                } else {
                    class49.field654 = var7;
                    class217.field3067 = 0;
                    class265.field3848.method526(-19055);
                    class265.field3848 = null;
                    return;
                }
            }
            if (class217.field3067 == 6) {
                class251.field3681.field4351 = 0;
                class251.field3681.method1309(23, 17);
                class265.field3848.method530(0, class251.field3681.field4350, class251.field3681.field4351, arg0 ^ 0x7509);
                class217.field3067 = 4;
                return;
            }
            if (class217.field3067 == 7) {
                if (class265.field3848.method524((byte) -64) >= 1) {
                    class44.field549 = class265.field3848.method528(true) * 60 + 180;
                    class217.field3067 = 0;
                    class49.field654 = 21;
                    class265.field3848.method526(arg0 ^ 0xFFFFB5A8);
                    class265.field3848 = null;
                    return;
                }
                return;
            }
            if (class217.field3067 == 10) {
                if (class265.field3848.method524((byte) 107) < 1) {
                    return;
                }
                class275.field3937 = class265.field3848.method528(true);
                class49.field654 = 29;
                class217.field3067 = 0;
                class265.field3848.method526(-19055);
                class265.field3848 = null;
                return;
            }
            if (class217.field3067 == 8) {
                if (class265.field3848.method524((byte) 121) < 14) {
                    return;
                }
                class265.field3848.method522(0, class240.field3490.field4350, 14, (byte) 42);
                class240.field3490.field4351 = 0;
                class217.field3070 = class240.field3490.method2096((byte) -122);
                class130.field1779 = class240.field3490.method2096((byte) -122);
                class78.field1006 = class240.field3490.method2096((byte) -122) == 1;
                class94.field1231 = class240.field3490.method2096((byte) -122) == 1;
                class330.field4836 = class240.field3490.method2096((byte) -122) == 1;
                class226.field3249 = class240.field3490.method2096((byte) -122) == 1;
                class144.field2004 = class240.field3490.method2096((byte) -122) == 1;
                class103.field1333 = class240.field3490.method2083((byte) -16);
                class190.field2623 = class240.field3490.method2096((byte) -122) == 1;
                class225.field3244 = class240.field3490.method2096((byte) -122) == 1;
                class362.method2525(class225.field3244, arg0 ^ 0xFFFFFFCF);
                class297.method2031(class225.field3244, (byte) -54);
                class93.method674(class225.field3244, 6497794);
                if (!class16.field203) {
                    if ((!class78.field1006 || class330.field4836) && !class190.field2623) {
                        try {
                            class200.method1469(class157.field2216.field883, -18278, "unzap");
                        } catch (Throwable var13) {
                        }
                    } else {
                        try {
                            class200.method1469(class157.field2216.field883, -18278, "zap");
                        } catch (Throwable var14) {
                        }
                    }
                }
                try {
                    class200.method1469(class157.field2216.field883, -18278, "loggedin");
                } catch (Throwable var12) {
                }
                class154.field2147 = class240.field3490.method1305(false);
                class315.field4648 = class240.field3490.method2083((byte) -19);
                class217.field3067 = 9;
            }
            if (class217.field3067 == 9) {
                if (class265.field3848.method524((byte) -62) >= class315.field4648) {
                    class240.field3490.field4351 = 0;
                    class265.field3848.method522(0, class240.field3490.field4350, class315.field4648, (byte) 41);
                    class49.field654 = 2;
                    class217.field3067 = 0;
                    class161.method1226(0);
                    class253.field3699 = -1;
                    class156.method1196(false, -51);
                    class154.field2147 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var15) {
            if (class265.field3848 != null) {
                class265.field3848.method526(arg0 - 19112);
                class265.field3848 = null;
            }
            if (class28.field322 < 1) {
                class28.field322++;
                class217.field3067 = 1;
                if (class238.field3441 == class170.field2360) {
                    class238.field3441 = class331.field4941;
                } else {
                    class238.field3441 = class170.field2360;
                }
                class274.field3922 = 0;
            } else {
                class217.field3067 = 0;
                class49.field654 = -4;
            }
        }
    }
}
