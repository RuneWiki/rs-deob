import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class157 extends class32 {

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "[B")
    public byte[] field3616;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "[S")
    public short[] field3604;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "[Leb;")
    public class31[] field3614;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "[B")
    public byte[] field3623;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "[B")
    public byte[] field3613;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "[I")
    private int[] field3608;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "[Lpe;")
    public class109[] field3622;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field3607 = 0;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "Lv;")
    public static class146 field3611 = class159.method1226((byte) -37, "Spieler");

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field3615 = 0;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field3612 = 99;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "Lua;")
    public static class140 field3618 = new class140(64);

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "Lv;")
    public static class146 field3625 = class159.method1226((byte) -37, "au");

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "[Z")
    public static boolean[] field3627 = new boolean[100];

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Lv;")
    public static class146 field3624 = class159.method1226((byte) -37, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lv;")
    public static class146 field3628 = class159.method1226((byte) -37, "_");

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "Ldd;")
    public static class26 field3617;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lmd;[I[BI)Z")
    public final boolean method1215(class87 arg0, int[] arg1, byte[] arg2, int arg3) {
        field3605++;
        int var5 = 0;
        boolean var6 = true;
        class109 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field3608[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method695(var9 >> 2, 1, arg1);
                        } else {
                            var7 = arg0.method693(var9 >> 2, arg1, -46);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3622[var8] = var7;
                        this.field3608[var8] = 0;
                    }
                }
            }
        }
        if (arg3 >= -31) {
            method1217(null, null, (byte) 54, null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static void method1216(boolean arg0) {
        field3617 = null;
        field3611 = null;
        field3624 = null;
        field3618 = null;
        field3627 = null;
        field3625 = null;
        if (arg0) {
            field3624 = null;
        }
        field3628 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lla;Lla;BLjava/awt/Component;)V")
    public static final void method1217(class77 arg0, class77 arg1, byte arg2, Component arg3) {
        field3620++;
        if (class6.field149) {
            return;
        }
        class56.method374();
        byte[] var4 = arg0.method583(class52.field1181, (byte) -122, class134.field3064);
        class88.field2090 = new class61(var4, arg3);
        class81.field1971 = class88.field2090.method449();
        class101.field2455 = class29.method199(class134.field3064, class150.field3470, arg1, -10);
        class143.field3260 = class29.method199(class134.field3064, class155.field3535, arg1, 127);
        class51.field1157 = class29.method199(class134.field3064, class1.field13, arg1, -32);
        class88.field2077 = class100.method835(arg1, class134.field3064, class8.field152, (byte) -118);
        class78.field1888 = class100.method835(arg1, class134.field3064, class75.field1802, (byte) -127);
        class77.field1871 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class77.field1871[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class77.field1871[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class77.field1871[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class77.field1871[var8 + 192] = 16777215;
        }
        class76.field1810 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class76.field1810[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class76.field1810[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class76.field1810[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class76.field1810[var12 + 192] = 16777215;
        }
        class125.field2911 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class125.field2911[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class125.field2911[var14 + 64] = var14 * 262144 + 255;
        }
        int var15 = -50 % ((61 - arg2) / 37);
        for (int var16 = 0; var16 < 64; var16++) {
            class125.field2911[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class125.field2911[var17 + 192] = 16777215;
        }
        class97.field2349 = new int[256];
        class68.field1541 = new int[32768];
        class9.field176 = new int[32768];
        class22.method141(null, (byte) -45);
        if (class38.field852 == 0) {
            class101.field2454 = true;
        } else {
            class101.field2454 = false;
        }
        class49.field1121 = new int[32768];
        class75.field1800 = new int[32768];
        class134.field3056 = class134.field3064;
        class72.field1684 = 0;
        class134.field3057 = class134.field3064;
        class123.field2859 = false;
        if (class101.field2454) {
            class145.method1067(2, 0);
        } else {
            class91.method724(false, class134.field3064, 120, class126.field2916, 255, class60.field1377, 2);
        }
        class30.method205(0, false);
        class6.field149 = true;
        class88.field2090.method430(0, 0);
        class81.field1971.method430(382, 0);
        class101.field2455.method1065(382 - class101.field2455.field3280 / 2, 18);
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
    public static final void method1218(int arg0) {
        class75.method567((byte) 119, client.field340);
        field3626++;
        class57.field1280++;
        if (class103.field2513 && class52.field1204) {
            int var1 = class2.field45;
            int var2 = var1 - class118.field2755;
            if (var2 < class66.field1484) {
                var2 = class66.field1484;
            }
            if (var2 + client.field340.field543 > class66.field1484 + class67.field1518.field543) {
                var2 = class66.field1484 + class67.field1518.field543 - client.field340.field543;
            }
            int var3 = var2 - class75.field1801;
            int var4 = class151.field3491;
            int var5 = client.field340.field508;
            int var6 = var4 - class125.field2897;
            if (var6 < class33.field707) {
                var6 = class33.field707;
            }
            if (class33.field707 + class67.field1518.field513 < client.field340.field513 + var6) {
                var6 = class33.field707 + class67.field1518.field513 - client.field340.field513;
            }
            int var7 = class67.field1518.field505 + var6 - class33.field707;
            int var8 = var6 - class75.field1803;
            int var9 = 84 / ((-arg0 - 45) / 49);
            if (class57.field1280 > client.field340.field483 && (var5 < var3 || var3 < -var5 || var8 > var5 || -var5 > var8)) {
                class8.field161 = true;
            }
            int var10 = class67.field1518.field502 + var2 - class66.field1484;
            if (client.field340.field515 != null && class8.field161) {
                class120 var11 = new class120();
                var11.field2799 = var7;
                var11.field2777 = var10;
                var11.field2787 = client.field340;
                var11.field2790 = client.field340.field515;
                class25.method157(var11, 5);
            }
            if (class146.field3386 == 0) {
                if (class8.field161) {
                    if (client.field340.field535 != null) {
                        class120 var12 = new class120();
                        var12.field2786 = class92.field2207;
                        var12.field2790 = client.field340.field535;
                        var12.field2777 = var10;
                        var12.field2787 = client.field340;
                        var12.field2799 = var7;
                        class25.method157(var12, 5);
                    }
                    if (class92.field2207 != null && class100.method832(3116, client.field340) != null) {
                        class82.field1990.method265((byte) -85, 68);
                        class82.field1990.method756(client.field340.field461, false);
                        class121.field2804++;
                        class82.field1990.method788(class92.field2207.field547, -730641264);
                        class82.field1990.method757((byte) 127, class92.field2207.field461);
                        class82.field1990.method788(client.field340.field547, -730641264);
                    }
                } else if ((class9.field178 == 1 || class5.method46(class13.field208 - 1, (byte) -110)) && class13.field208 > 2) {
                    class125.method937(765);
                } else if (class13.field208 > 0) {
                    class154.method1158((byte) -91, class13.field208 - 1);
                }
                client.field340 = null;
            }
        } else if (class57.field1280 > 1) {
            client.field340 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public final void method1219(byte arg0) {
        field3610++;
        this.field3608 = null;
        int var2 = 68 % ((arg0 - 2) / 59);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lef;B)V")
    public static final void method1220(class35 arg0, byte arg1) {
        field3609++;
        arg0.field809 = arg0.field752;
        if (arg0.field811 == 0) {
            arg0.field796 = 0;
            return;
        }
        if (arg0.field753 != -1 && arg0.field791 == 0) {
            class72 var2 = class141.method1052(true, arg0.field753);
            if (arg0.field773 > 0 && var2.field1669 == 0) {
                arg0.field796++;
                return;
            }
            if (arg0.field773 <= 0 && var2.field1683 == 0) {
                arg0.field796++;
                return;
            }
        }
        int var3 = arg0.field757;
        int var4 = arg0.field790;
        int var5 = arg0.field738[arg0.field811 - 1] * 128 + arg0.field742 * 64;
        int var6 = arg0.field788[arg0.field811 - 1] * 128 + arg0.field742 * 64;
        if (var6 - var3 > 256 || var6 - var3 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
            arg0.field790 = var5;
            arg0.field757 = var6;
            return;
        }
        if (var6 <= var3) {
            if (var3 > var6) {
                if (var4 < var5) {
                    arg0.field780 = 768;
                } else if (var4 > var5) {
                    arg0.field780 = 256;
                } else {
                    arg0.field780 = 512;
                }
            } else if (var5 > var4) {
                arg0.field780 = 1024;
            } else if (var5 < var4) {
                arg0.field780 = 0;
            }
        } else if (var5 > var4) {
            arg0.field780 = 1280;
        } else if (var4 > var5) {
            arg0.field780 = 1792;
        } else {
            arg0.field780 = 1536;
        }
        int var7 = arg0.field784;
        int var8 = arg0.field780 - arg0.field763 & 0x7FF;
        if (arg1 < 61) {
            method1216(true);
        }
        int var9 = 4;
        boolean var10 = true;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field813;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field751;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field802;
        }
        if (var7 == -1) {
            var7 = arg0.field813;
        }
        arg0.field809 = var7;
        if (arg0 instanceof class38) {
            var10 = ((class38) arg0).field849.field1925;
        }
        if (var10) {
            if (arg0.field780 != arg0.field763 && arg0.field774 == -1 && arg0.field807 != 0) {
                var9 = 2;
            }
            if (arg0.field811 > 2) {
                var9 = 6;
            }
            if (arg0.field811 > 3) {
                var9 = 8;
            }
            if (arg0.field796 > 0 && arg0.field811 > 1) {
                var9 = 8;
                arg0.field796--;
            }
        } else {
            if (arg0.field811 > 1) {
                var9 = 6;
            }
            if (arg0.field811 > 2) {
                var9 = 8;
            }
            if (arg0.field796 > 0 && arg0.field811 > 1) {
                var9 = 8;
                arg0.field796--;
            }
        }
        if (arg0.field748[arg0.field811 - 1]) {
            var9 <<= 0x1;
        }
        if (var3 < var6) {
            arg0.field757 += var9;
            if (var6 < arg0.field757) {
                arg0.field757 = var6;
            }
        } else if (var6 < var3) {
            arg0.field757 -= var9;
            if (var6 > arg0.field757) {
                arg0.field757 = var6;
            }
        }
        if (var9 >= 8 && arg0.field813 == arg0.field809 && arg0.field800 != -1) {
            arg0.field809 = arg0.field800;
        }
        if (var4 < var5) {
            arg0.field790 += var9;
            if (var5 < arg0.field790) {
                arg0.field790 = var5;
            }
        } else if (var5 < var4) {
            arg0.field790 -= var9;
            if (var5 > arg0.field790) {
                arg0.field790 = var5;
            }
        }
        if (arg0.field757 == var6 && arg0.field790 == var5) {
            if (arg0.field773 > 0) {
                arg0.field773--;
            }
            arg0.field811--;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class157() {
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
    public class157(byte[] arg0) {
        this.field3616 = new byte[128];
        this.field3604 = new short[128];
        this.field3614 = new class31[128];
        this.field3623 = new byte[128];
        this.field3613 = new byte[128];
        this.field3608 = new int[128];
        this.field3622 = new class109[128];
        int var2 = 0;
        class95 var3 = new class95(arg0);
        while (var3.field2320[var3.field2304 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method770((byte) 127);
        }
        var2++;
        int var6 = 0;
        var3.field2304++;
        int var7 = var3.field2304;
        var3.field2304 += var2;
        while (var3.field2320[var3.field2304 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method770((byte) -119);
        }
        var3.field2304++;
        var6++;
        int var10 = var3.field2304;
        var3.field2304 += var6;
        int var11;
        for (var11 = 0; var3.field2320[var3.field2304 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method770((byte) 50);
        }
        var11++;
        var3.field2304++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method790((byte) 73);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class31[] var18 = new class31[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class31 var102 = var18[var19] = new class31();
            int var103 = var3.method790((byte) 73);
            if (var103 > 0) {
                var102.field645 = new byte[var103 * 2];
            }
            int var104 = var3.method790((byte) 73);
            if (var104 > 0) {
                var102.field642 = new byte[var104 * 2 + 2];
                var102.field642[1] = 64;
            }
        }
        int var20 = var3.method790((byte) 73);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method790((byte) 73);
        int var23;
        for (var23 = 0; var3.field2320[var3.field2304 + var23] != 0; var23++) {
        }
        byte[] var24 = new byte[var23];
        for (int var25 = 0; var25 < var23; var25++) {
            var24[var25] = var3.method770((byte) 121);
        }
        int var26 = 0;
        byte[] var27 = var22 <= 0 ? null : new byte[var22 * 2];
        var3.field2304++;
        var23++;
        for (int var28 = 0; var28 < 128; var28++) {
            var26 += var3.method790((byte) 73);
            this.field3604[var28] = (short) var26;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method790((byte) 73);
            this.field3604[var30] = (short) (this.field3604[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var33 == 0) {
                if (var31 < var24.length) {
                    var33 = var24[var31++];
                } else {
                    var33 = -1;
                }
                var32 = var3.method741(-1);
            }
            var33--;
            this.field3604[var34] = (short) (this.field3604[var34] + (class90.method711(2, var32 - 1) << 14));
            this.field3608[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3608[var38] != 0) {
                if (var36 == 0) {
                    if (var35 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                    var37 = var3.field2320[var7++] - 1;
                }
                this.field3616[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3608[var42] != 0) {
                if (var40 == 0) {
                    if (var8.length <= var39) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                    var41 = var3.field2320[var10++] + 16 << 2;
                }
                var40--;
                this.field3623[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        class31 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3608[var46] != 0) {
                if (var45 == 0) {
                    var44 = var18[var14[var43]];
                    if (var43 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var43++];
                    }
                }
                this.field3614[var46] = var44;
                var45--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var49 >= var24.length) {
                    var48 = -1;
                } else {
                    var48 = var24[var49++];
                }
                if (this.field3608[var50] > 0) {
                    var47 = var3.method790((byte) 73) + 1;
                }
            }
            this.field3613[var50] = (byte) var47;
            var48--;
        }
        this.field3606 = var3.method790((byte) 73) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class31 var99 = var18[var51];
            if (var99.field645 != null) {
                for (int var100 = 1; var100 < var99.field645.length; var100 += 2) {
                    var99.field645[var100] = var3.method770((byte) -110);
                }
            }
            if (var99.field642 != null) {
                for (int var101 = 3; var101 < var99.field642.length - 2; var101 += 2) {
                    var99.field642[var101] = var3.method770((byte) 62);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method770((byte) 92);
            }
        }
        if (var27 != null) {
            for (int var53 = 1; var53 < var27.length; var53 += 2) {
                var27[var53] = var3.method770((byte) -110);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class31 var96 = var18[var54];
            if (var96.field642 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field642.length; var98 += 2) {
                    var97 = var97 + var3.method790((byte) 73) + 1;
                    var96.field642[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class31 var93 = var18[var55];
            if (var93.field645 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field645.length; var95 += 2) {
                    var94 = var3.method790((byte) 73) + var94 + 1;
                    var93.field645[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method790((byte) 73);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var3.method790((byte) 73) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3613[var60] = (byte) (this.field3613[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class37.method247(var66, var64 - var58, (byte) 51);
                    this.field3613[var67] = (byte) (this.field3613[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var58 = var64;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field3613[var62] = (byte) (this.field3613[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var27 != null) {
            int var69 = var3.method790((byte) 73);
            var27[0] = (byte) var69;
            for (int var70 = 2; var70 < var27.length; var70 += 2) {
                var69 = var69 + var3.method790((byte) 73) + 1;
                var27[var70] = (byte) var69;
            }
            byte var71 = var27[0];
            int var72 = var27[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3623[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3623[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var27.length; var74 += 2) {
                byte var78 = var27[var74];
                int var79 = (var78 - var71) / 2 + (var78 - var71) * var72;
                int var80 = var27[var74 + 1] << 1;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class37.method247(var79, var78 - var71, (byte) -92);
                    var79 += var80 - var72;
                    int var83 = (this.field3623[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3623[var81] = (byte) var83;
                }
                var72 = var80;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field3623[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3623[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field656 = var3.method790((byte) 73);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class31 var92 = var18[var86];
            if (var92.field645 != null) {
                var92.field653 = var3.method790((byte) 73);
            }
            if (var92.field642 != null) {
                var92.field641 = var3.method790((byte) 73);
            }
            if (var92.field656 > 0) {
                var92.field657 = var3.method790((byte) 73);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field644 = var3.method790((byte) 73);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class31 var91 = var18[var88];
            if (var91.field644 > 0) {
                var91.field646 = var3.method790((byte) 73);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class31 var90 = var18[var89];
            if (var90.field646 > 0) {
                var90.field652 = var3.method790((byte) 73);
            }
        }
    }
}
