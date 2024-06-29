import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class527 {

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    private int field7826 = -1;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "Z")
    public boolean field7833 = true;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "Lkw;")
    private class174 field7820;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "Lpr;")
    private class304 field7829;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    private int field7825;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    private int field7821;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public int field7819;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "Lhc;")
    private class391 field7827;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    private int field7822;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    private int field7830;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "Lg;")
    private class512 field7823;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
    public final void method3115(byte arg0) {
        field7832++;
        if (arg0 >= -108) {
            this.method3115((byte) -81);
        }
        this.method3117(-96, this.field7819, this.field7823);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    private final void method3116(int arg0) {
        field7828++;
        if (!this.field7833) {
            return;
        }
        this.field7833 = false;
        byte[] var2 = this.field7829.field4432;
        int var3 = 0;
        int var4 = this.field7829.field4444;
        int var5 = this.field7829.field4444 * this.field7821 + this.field7825;
        if (arg0 != -18591) {
            return;
        }
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field7827 != null && this.field7826 == var3) {
            this.field7833 = false;
            return;
        }
        this.field7826 = var3;
        int var7 = this.field7821 * var4 + this.field7825;
        int var8 = 0;
        if (!this.field7820.method338(false, class629.field9208, class566.field8401)) {
            if (class465.field6735 == null) {
                class465.field6735 = new int[16384];
            }
            int[] var9 = class465.field6735;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var7] == 0) {
                        int var12 = 0;
                        if (var2[var7 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var12++;
                        }
                        var9[var8++] = var12 * 17 << 24;
                    } else {
                        var9[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field7829.field4444 - 128;
            }
            if (this.field7827 == null) {
                this.field7827 = this.field7820.method1105(class465.field6735, false, 128, 6978, 128);
                this.field7827.method563(false, -125, false);
            } else {
                this.field7827.method561(0, 12382, 128, class465.field6735, 128, 0, 0, 128);
            }
            return;
        }
        if (class487.field7380 == null) {
            class487.field7380 = new byte[16384];
        }
        byte[] var13 = class487.field7380;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var7] == 0) {
                    int var16 = 0;
                    if (var2[var7 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var16++;
                    }
                    var13[var8++] = (byte) (var16 * 17);
                } else {
                    var13[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field7829.field4444 - 128;
        }
        if (this.field7827 == null) {
            this.field7827 = this.field7820.method1165(false, class487.field7380, 128, 128, -15, class566.field8401);
            this.field7827.method563(false, -122, false);
        } else {
            this.field7827.method558(0, class566.field8401, -1294, class487.field7380, 128, 128, 128, 0, 0);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IILg;)V")
    public final void method3117(int arg0, int arg1, class512 arg2) {
        int var4 = 26 % ((-arg0 - 21) / 50);
        if (arg1 > 0) {
            this.method3116(-18591);
            this.field7820.method1152(this.field7827, true);
            this.field7820.method292(false, arg2, 0, class386.field5653, arg1, this.field7822, this.field7830 + 1 - this.field7822);
        }
        field7818++;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II[[[Lsk;ZII)Z")
    public static final boolean method3118(int arg0, int arg1, class415[][][] arg2, boolean arg3, int arg4, int arg5) {
        field7831++;
        byte var6 = arg3 ? 1 : (byte) (class614.field9000 & 0xFF);
        if (class22.field197[class355.field5157][arg0][arg4] == var6) {
            return false;
        } else if ((class237.field3473[class355.field5157][arg0][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class258.field3778[var7] = arg0;
            int var8 = 0;
            int var9 = 52 / ((arg5 - 41) / 52);
            int var36 = var7 + 1;
            class556.field8257[var7] = arg4;
            class22.field197[class355.field5157][arg0][arg4] = var6;
            while (var36 != var8) {
                int var10 = class258.field3778[var8] & 0xFFFF;
                int var11 = (class258.field3778[var8] & 0xFF04B3) >> 16;
                int var12 = class258.field3778[var8] >> 24 & 0xFF;
                int var13 = class556.field8257[var8] & 0xFFFF;
                int var14 = class556.field8257[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class237.field3473[class355.field5157][var10][var13] & 0x4) == 0) {
                    var15 = true;
                }
                boolean var16 = false;
                label233: for (int var17 = class355.field5157 + 1; var17 <= 3; var17++) {
                    if ((class237.field3473[var17][var10][var13] & 0x8) == 0) {
                        if (var15 && arg2[var17][var10][var13] != null) {
                            if (arg2[var17][var10][var13].field5987 != null) {
                                int var21 = class178.method1187(var11, 100);
                                if (arg2[var17][var10][var13].field5987.field8512 == var21 || arg2[var17][var10][var13].field5978 != null && arg2[var17][var10][var13].field5978.field8512 == var21) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var22 = class178.method1187(var12, 103);
                                    if (arg2[var17][var10][var13].field5987.field8512 == var22 || arg2[var17][var10][var13].field5978 != null && arg2[var17][var10][var13].field5978.field8512 == var22) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var23 = class178.method1187(var14, 114);
                                    if (arg2[var17][var10][var13].field5987.field8512 == var23 || arg2[var17][var10][var13].field5978 != null && arg2[var17][var10][var13].field5978.field8512 == var23) {
                                        continue;
                                    }
                                }
                            }
                            class415 var24 = arg2[var17][var10][var13];
                            if (var24.field5981 != null) {
                                for (class639 var25 = var24.field5981; var25 != null; var25 = var25.field9291) {
                                    class237 var26 = var25.field9288;
                                    if (var26 instanceof class438) {
                                        class438 var27 = (class438) var26;
                                        int var28 = var27.method171(true);
                                        int var29 = var27.method170(-5527);
                                        if (var28 == 21) {
                                            var28 = 19;
                                        }
                                        int var30 = var28 | var29 << 6;
                                        if (var11 == var30 || var12 != 0 && var12 == var30 || var14 != 0 && var14 == var30) {
                                            continue label233;
                                        }
                                    }
                                }
                            }
                        }
                        class415 var31 = arg2[var17][var10][var13];
                        if (var31 != null && var31.field5981 != null) {
                            for (class639 var32 = var31.field5981; var32 != null; var32 = var32.field9291) {
                                class237 var33 = var32.field9288;
                                if (var33.field3469 != var33.field3459 || var33.field3472 != var33.field3462) {
                                    for (int var34 = var33.field3469; var34 <= var33.field3459; var34++) {
                                        for (int var35 = var33.field3472; var35 <= var33.field3462; var35++) {
                                            class22.field197[var17][var34][var35] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class22.field197[var17][var10][var13] = var6;
                        var16 = true;
                    }
                }
                if (var16) {
                    int var18 = class235.field3455[class355.field5157 + 1].method1319(var10, var13);
                    if (class109.field1384[arg1] < var18) {
                        class109.field1384[arg1] = var18;
                    }
                    int var19 = var10 << 7;
                    if (var19 < class89.field1133[arg1]) {
                        class89.field1133[arg1] = var19;
                    } else if (class200.field3004[arg1] < var19) {
                        class200.field3004[arg1] = var19;
                    }
                    int var20 = var13 << 7;
                    if (var20 < class190.field2886[arg1]) {
                        class190.field2886[arg1] = var20;
                    } else if (var20 > class426.field6079[arg1]) {
                        class426.field6079[arg1] = var20;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class22.field197[class355.field5157][var10 - 1][var13] != var6) {
                        class258.field3778[var36] = class313.method1926(-754974720, class313.method1926(1179648, var10 - 1));
                        class556.field8257[var36] = class313.method1926(var13, 1245184);
                        class22.field197[class355.field5157][var10 - 1][var13] = var6;
                        var36 = var36 + 1 & 0xFFF;
                    }
                    var13++;
                    if (var13 < class382.field5586) {
                        if ((var10 - 1) >= 0 && class22.field197[class355.field5157][var10 - 1][var13] != var6 && (class237.field3473[class355.field5157][var10][var13] & 0x4) == 0 && (class237.field3473[class355.field5157][var10 - 1][var13 - 1] & 0x4) == 0) {
                            class258.field3778[var36] = class313.method1926(1375731712, class313.method1926(1179648, var10 - 1));
                            class556.field8257[var36] = class313.method1926(1245184, var13);
                            var36 = var36 + 1 & 0xFFF;
                            class22.field197[class355.field5157][var10 - 1][var13] = var6;
                        }
                        if (class22.field197[class355.field5157][var10][var13] != var6) {
                            class258.field3778[var36] = class313.method1926(318767104, class313.method1926(var10, 5373952));
                            class556.field8257[var36] = class313.method1926(var13, 5439488);
                            var36 = var36 + 1 & 0xFFF;
                            class22.field197[class355.field5157][var10][var13] = var6;
                        }
                        if (var10 + 1 < class35.field399 && class22.field197[class355.field5157][var10 + 1][var13] != var6 && (class237.field3473[class355.field5157][var10][var13] & 0x4) == 0 && (class237.field3473[class355.field5157][var10 + 1][var13 - 1] & 0x4) == 0) {
                            class258.field3778[var36] = class313.method1926(class313.method1926(var10 + 1, 5373952), -1845493760);
                            class556.field8257[var36] = class313.method1926(var13, 5439488);
                            class22.field197[class355.field5157][var10 + 1][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if (class35.field399 > (var10 + 1) && class22.field197[class355.field5157][var10 + 1][var13] != var6) {
                        class258.field3778[var36] = class313.method1926(class313.method1926(var10 + 1, 9568256), 1392508928);
                        class556.field8257[var36] = class313.method1926(9633792, var13);
                        var36 = var36 + 1 & 0xFFF;
                        class22.field197[class355.field5157][var10 + 1][var13] = var6;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if (var10 - 1 >= 0 && class22.field197[class355.field5157][var10 - 1][var13] != var6 && (class237.field3473[class355.field5157][var10][var13] & 0x4) == 0 && (class237.field3473[class355.field5157][var10 - 1][var13 + 1] & 0x4) == 0) {
                            class258.field3778[var36] = class313.method1926(301989888, class313.method1926(var10 - 1, 13762560));
                            class556.field8257[var36] = class313.method1926(13828096, var13);
                            class22.field197[class355.field5157][var10 - 1][var13] = var6;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if (class22.field197[class355.field5157][var10][var13] != var6) {
                            class258.field3778[var36] = class313.method1926(-1828716544, class313.method1926(13762560, var10));
                            class556.field8257[var36] = class313.method1926(13828096, var13);
                            var36 = var36 + 1 & 0xFFF;
                            class22.field197[class355.field5157][var10][var13] = var6;
                        }
                        if (class35.field399 > (var10 + 1) && class22.field197[class355.field5157][var10 + 1][var13] != var6 && (class237.field3473[class355.field5157][var10][var13] & 0x4) == 0 && (class237.field3473[class355.field5157][var10 + 1][var13 + 1] & 0x4) == 0) {
                            class258.field3778[var36] = class313.method1926(-771751936, class313.method1926(var10 + 1, 9568256));
                            class556.field8257[var36] = class313.method1926(var13, 9633792);
                            var36 = var36 + 1 & 0xFFF;
                            class22.field197[class355.field5157][var10 + 1][var13] = var6;
                        }
                    }
                }
            }
            if (class109.field1384[arg1] != -1000000) {
                class109.field1384[arg1] += 10;
                class89.field1133[arg1] -= 50;
                class200.field3004[arg1] += 50;
                class426.field6079[arg1] += 50;
                class190.field2886[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lkw;Lpr;Leo;IIIII)V")
    public class527(class174 arg0, class304 arg1, class516 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7820 = arg0;
        this.field7829 = arg1;
        this.field7825 = arg6;
        this.field7821 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field8121 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field7655[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field7819 = 0;
            this.field7827 = null;
        } else {
            this.field7822 = Integer.MAX_VALUE;
            this.field7830 = Integer.MIN_VALUE;
            this.field7823 = this.field7820.method302(false, -125);
            this.field7823.method464(true, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field7823.method410(true, (byte) -56);
                if (var15 != null) {
                    Stream var16 = this.field7820.method1163(var15, -4455);
                    if (Stream.method3328()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field8121 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field7655[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field7830) {
                                            this.field7830 = var28;
                                        }
                                        if (var28 < this.field7822) {
                                            this.field7822 = var28;
                                        }
                                        var16.method3337(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field8121 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field7655[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field7822 > var22) {
                                            this.field7822 = var22;
                                        }
                                        if (var22 > this.field7830) {
                                            this.field7830 = var22;
                                        }
                                        var16.method3336(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3332();
                    if (this.field7823.method411(112)) {
                        break;
                    }
                }
            }
            this.field7819 = var10 / 3;
        }
    }
}
