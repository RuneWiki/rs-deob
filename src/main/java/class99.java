import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class99 extends class6 {

    @OriginalMember(owner = "client!q", name = "Lb", descriptor = "I")
    private int field2577;

    @OriginalMember(owner = "client!q", name = "Rb", descriptor = "I")
    private int field2583;

    @OriginalMember(owner = "client!q", name = "Sb", descriptor = "I")
    private int field2584;

    @OriginalMember(owner = "client!q", name = "Fb", descriptor = "I")
    private int field2571;

    @OriginalMember(owner = "client!q", name = "ob", descriptor = "I")
    private int field2554;

    @OriginalMember(owner = "client!q", name = "Nb", descriptor = "I")
    private int field2579;

    @OriginalMember(owner = "client!q", name = "wb", descriptor = "I")
    private int field2562;

    @OriginalMember(owner = "client!q", name = "Ub", descriptor = "Laa;")
    private class1 field2586;

    @OriginalMember(owner = "client!q", name = "yb", descriptor = "I")
    private int field2564;

    @OriginalMember(owner = "client!q", name = "pb", descriptor = "I")
    private int field2555;

    @OriginalMember(owner = "client!q", name = "vb", descriptor = "Lke;")
    public static class65 field2561 = class1.method17("Stufe)2", -114);

    @OriginalMember(owner = "client!q", name = "Cb", descriptor = "Lke;")
    private static class65 field2568 = class1.method17("Classic", -113);

    @OriginalMember(owner = "client!q", name = "Db", descriptor = "Lke;")
    private static class65 field2569 = class1.method17("Could not complete login)3", -117);

    @OriginalMember(owner = "client!q", name = "Bb", descriptor = "[I")
    public static int[] field2567 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!q", name = "sb", descriptor = "Lke;")
    public static class65 field2558 = field2569;

    @OriginalMember(owner = "client!q", name = "Gb", descriptor = "Lke;")
    private static class65 field2572 = class1.method17("Loading wordpack )2 ", -126);

    @OriginalMember(owner = "client!q", name = "ub", descriptor = "I")
    public static int field2560 = 0;

    @OriginalMember(owner = "client!q", name = "qb", descriptor = "Lke;")
    public static class65 field2556 = field2572;

    @OriginalMember(owner = "client!q", name = "Kb", descriptor = "I")
    public static int field2576 = 0;

    @OriginalMember(owner = "client!q", name = "Ab", descriptor = "Lke;")
    public static class65 field2566 = field2568;

    @OriginalMember(owner = "client!q", name = "Hb", descriptor = "Lke;")
    public static class65 field2573 = class1.method17("0(U", -115);

    @OriginalMember(owner = "client!q", name = "Ob", descriptor = "Lke;")
    private static class65 field2580 = class1.method17("Your account is already logged in)3", -125);

    @OriginalMember(owner = "client!q", name = "Eb", descriptor = "Lke;")
    public static class65 field2570 = field2580;

    @OriginalMember(owner = "client!q", name = "Mb", descriptor = "Lke;")
    public static class65 field2578 = class1.method17("Gegenstand f-Ur Mitglieder", -120);

    @OriginalMember(owner = "client!q", name = "Tb", descriptor = "I")
    public static int field2585 = 99;

    @OriginalMember(owner = "client!q", name = "rb", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!q", name = "tb", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!q", name = "xb", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!q", name = "zb", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!q", name = "Ib", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!q", name = "Pb", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!q", name = "Qb", descriptor = "[I")
    public static int[] field2582;

    @OriginalMember(owner = "client!q", name = "Vb", descriptor = "[I")
    public static int[] field2587;

    @OriginalMember(owner = "client!q", name = "Jb", descriptor = "[Luc;")
    public static class119[] field2575;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 11)
    public static void method828(boolean arg0) {
        field2568 = null;
        field2587 = null;
        field2573 = null;
        field2578 = null;
        field2566 = null;
        field2570 = null;
        field2567 = null;
        field2572 = null;
        if (!arg0) {
            field2560 = -122;
        }
        field2580 = null;
        field2561 = null;
        field2558 = null;
        field2582 = null;
        field2575 = null;
        field2569 = null;
        field2556 = null;
    }

    @OriginalMember(owner = "client!q", name = "i", descriptor = "(I)V", line = 48)
    public static final void method829(int arg0) {
        int var1 = class64.field1664 * 128 + 64;
        field2559++;
        int var2 = class56.field1461 * 128 + 64;
        int var3 = class58.method495(var2, var1, true, class19.field462) - class104.field2689;
        if (var3 > class5.field102) {
            class5.field102 += (var3 - class5.field102) * class13.field265 / 1000 + class39.field986;
            if (var3 < class5.field102) {
                class5.field102 = var3;
            }
        }
        if (var3 < class5.field102) {
            class5.field102 -= (class5.field102 - var3) * class13.field265 / 1000 + class39.field986;
            if (class5.field102 < var3) {
                class5.field102 = var3;
            }
        }
        if (var2 > class51.field1293) {
            class51.field1293 += (var2 - class51.field1293) * class13.field265 / 1000 + class39.field986;
            if (var2 < class51.field1293) {
                class51.field1293 = var2;
            }
        }
        if (var1 > class102.field2642) {
            class102.field2642 += class39.field986 + (var1 - class102.field2642) * class13.field265 / 1000;
            if (class102.field2642 > var1) {
                class102.field2642 = var1;
            }
        }
        if (var2 < class51.field1293) {
            class51.field1293 -= class39.field986 + (class51.field1293 - var2) * class13.field265 / 1000;
            if (var2 > class51.field1293) {
                class51.field1293 = var2;
            }
        }
        if (class102.field2642 > var1) {
            class102.field2642 -= (class102.field2642 - var1) * class13.field265 / 1000 + class39.field986;
            if (class102.field2642 < var1) {
                class102.field2642 = var1;
            }
        }
        int var4 = class47.field1220 * 128 + 64;
        int var5 = class70.field1814 * 128 + 64;
        int var6 = class58.method495(var4, var5, true, class19.field462) - class26.field639;
        int var7 = var4 - class51.field1293;
        int var8 = var6 - class5.field102;
        int var9 = var5 - class102.field2642;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var7)) & 0x7FF;
        int var13 = var12 - class51.field1295;
        if (class76.field2038 < var11) {
            class76.field2038 += (var11 - class76.field2038) * class53.field1339 / 1000 + class64.field1690;
            if (class76.field2038 > var11) {
                class76.field2038 = var11;
            }
        }
        if (var11 < class76.field2038) {
            class76.field2038 -= (class76.field2038 - var11) * class53.field1339 / 1000 + class64.field1690;
            if (class76.field2038 < var11) {
                class76.field2038 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (arg0 != 18271) {
            method828(true);
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class51.field1295 += class53.field1339 * var13 / 1000 + class64.field1690;
            class51.field1295 &= 0x7FF;
        }
        if (var13 < 0) {
            class51.field1295 -= -var13 * class53.field1339 / 1000 + class64.field1690;
            class51.field1295 &= 0x7FF;
        }
        int var14 = var12 - class51.field1295;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class51.field1295 = var12;
        }
    }

    @OriginalMember(owner = "client!q", name = "g", descriptor = "(I)Lga;", line = 217)
    public final class37 method45(int arg0) {
        field2557++;
        if (this.field2586 != null) {
            int var2 = class76.field2028 - this.field2564;
            if (var2 > 100 && this.field2586.field6 > 0) {
                var2 = 100;
            }
            label38: {
                do {
                    do {
                        if (this.field2586.field24[this.field2555] >= var2) {
                            break label38;
                        }
                        var2 -= this.field2586.field24[this.field2555];
                        this.field2555++;
                    } while (this.field2586.field21.length > this.field2555);
                    this.field2555 -= this.field2586.field6;
                } while (this.field2555 >= 0 && this.field2555 < this.field2586.field21.length);
                this.field2586 = null;
            }
            this.field2564 = class76.field2028 - var2;
        }
        class19 var3 = class54.method435(32247, this.field2562);
        if (var3.field439 != null) {
            var3 = var3.method162((byte) -96);
        }
        if (var3 == null) {
            return null;
        } else {
            int var4 = 114 % ((arg0 + 6) / 52);
            return var3.method153((byte) -81, this.field2579, this.field2571, this.field2586, this.field2554, this.field2583, this.field2577, this.field2584, this.field2555);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z[BIII)V", line = 269)
    public static final void method830(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field2565++;
        if (class93.field2464 == null) {
            return;
        }
        if (class35.field890 >= 0) {
            class110.field2722 = arg2;
            if (class35.field890 == 0) {
                class12.field246 = 1;
            } else {
                int var5 = class112.method924(2, class35.field890);
                int var6 = var5 - class56.field1462;
                class12.field246 = (var6 + 3600) / arg2;
                if (class12.field246 < 1) {
                    class12.field246 = 1;
                }
            }
            class23.field572 = arg4;
            class125.field3047 = arg0;
            class58.field1593 = arg1;
        } else if (class12.field246 == 0) {
            class66.method567(arg4, arg0, arg1, 50);
        } else {
            class58.field1593 = arg1;
            class23.field572 = arg4;
            class125.field3047 = arg0;
        }
        if (arg3 >= -88) {
            field2569 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIIIIIIZ)V", line = 352)
    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field2577 = arg2;
        this.field2583 = arg4;
        this.field2584 = arg3;
        this.field2571 = arg6;
        this.field2554 = arg5;
        this.field2579 = arg1;
        this.field2562 = arg0;
        if (arg7 != -1) {
            this.field2586 = class80.method702(119, arg7);
            this.field2564 = class76.field2028 - 1;
            this.field2555 = 0;
            if (arg8 && this.field2586.field6 != -1) {
                this.field2555 = (int) (Math.random() * (double) this.field2586.field21.length);
                this.field2564 -= (int) ((double) this.field2586.field24[this.field2555] * Math.random());
                return;
            }
        }
    }
}
