import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class791 {

    @OriginalMember(owner = "client!wia", name = "y", descriptor = "Lel;")
    private class572 field10867 = null;

    @OriginalMember(owner = "client!wia", name = "Q", descriptor = "I")
    public int field10884;

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "Lis;")
    private class527 field10847;

    @OriginalMember(owner = "client!wia", name = "n", descriptor = "Z")
    private boolean field10856;

    @OriginalMember(owner = "client!wia", name = "i", descriptor = "Lok;")
    public static class266 field10851 = new class266();

    @OriginalMember(owner = "client!wia", name = "T", descriptor = "[I")
    public static int[] field10887 = new int[1];

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "I")
    public static int field10843;

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
    public static int field10844;

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
    public static int field10845;

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "I")
    public static int field10846;

    @OriginalMember(owner = "client!wia", name = "f", descriptor = "I")
    public static int field10848;

    @OriginalMember(owner = "client!wia", name = "g", descriptor = "I")
    public static int field10849;

    @OriginalMember(owner = "client!wia", name = "j", descriptor = "I")
    public static int field10852;

    @OriginalMember(owner = "client!wia", name = "k", descriptor = "I")
    public static int field10853;

    @OriginalMember(owner = "client!wia", name = "l", descriptor = "I")
    public static int field10854;

    @OriginalMember(owner = "client!wia", name = "m", descriptor = "I")
    public static int field10855;

    @OriginalMember(owner = "client!wia", name = "o", descriptor = "I")
    public static int field10857;

    @OriginalMember(owner = "client!wia", name = "p", descriptor = "I")
    public static int field10858;

    @OriginalMember(owner = "client!wia", name = "q", descriptor = "I")
    public static int field10859;

    @OriginalMember(owner = "client!wia", name = "r", descriptor = "I")
    public static int field10860;

    @OriginalMember(owner = "client!wia", name = "s", descriptor = "I")
    public static int field10861;

    @OriginalMember(owner = "client!wia", name = "t", descriptor = "I")
    public static int field10862;

    @OriginalMember(owner = "client!wia", name = "u", descriptor = "I")
    public static int field10863;

    @OriginalMember(owner = "client!wia", name = "v", descriptor = "I")
    public static int field10864;

    @OriginalMember(owner = "client!wia", name = "x", descriptor = "I")
    public static int field10866;

    @OriginalMember(owner = "client!wia", name = "z", descriptor = "I")
    public static int field10868;

    @OriginalMember(owner = "client!wia", name = "A", descriptor = "I")
    public static int field10869;

    @OriginalMember(owner = "client!wia", name = "B", descriptor = "I")
    public static int field10870;

    @OriginalMember(owner = "client!wia", name = "D", descriptor = "I")
    public static int field10872;

    @OriginalMember(owner = "client!wia", name = "E", descriptor = "I")
    public static int field10873;

    @OriginalMember(owner = "client!wia", name = "F", descriptor = "I")
    public static int field10874;

    @OriginalMember(owner = "client!wia", name = "G", descriptor = "I")
    public static int field10875;

    @OriginalMember(owner = "client!wia", name = "H", descriptor = "I")
    public static int field10876;

    @OriginalMember(owner = "client!wia", name = "I", descriptor = "I")
    public static int field10877;

    @OriginalMember(owner = "client!wia", name = "J", descriptor = "I")
    public static int field10878;

    @OriginalMember(owner = "client!wia", name = "L", descriptor = "I")
    public static int field10879;

    @OriginalMember(owner = "client!wia", name = "M", descriptor = "I")
    public static int field10880;

    @OriginalMember(owner = "client!wia", name = "N", descriptor = "I")
    public static int field10881;

    @OriginalMember(owner = "client!wia", name = "O", descriptor = "I")
    public static int field10882;

    @OriginalMember(owner = "client!wia", name = "P", descriptor = "I")
    public static int field10883;

    @OriginalMember(owner = "client!wia", name = "R", descriptor = "I")
    public static int field10885;

    @OriginalMember(owner = "client!wia", name = "S", descriptor = "I")
    public static int field10886;

    @OriginalMember(owner = "client!wia", name = "h", descriptor = "[I")
    public static int[] field10850;

    @OriginalMember(owner = "client!wia", name = "C", descriptor = "[Ljava/lang/Object;")
    private Object[] field10871;

    @OriginalMember(owner = "client!wia", name = "w", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field10865;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method4328(String arg0, byte arg1) {
        if (arg1 <= 82) {
            return true;
        } else {
            field10886++;
            int var3 = this.method4356(76, "");
            return var3 == -1 ? this.method4331((byte) 52, "", arg0) : this.method4331((byte) 45, arg0, "");
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZI)V")
    public final void method4329(boolean arg0, int arg1) {
        field10852++;
        if (!this.method4342((byte) 87, arg1)) {
            return;
        }
        if (this.field10865 != null) {
            this.field10865[arg1] = null;
        }
        if (!arg0) {
            this.method4342((byte) 27, -102);
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)I")
    public final int method4330(int arg0, int arg1) {
        field10860++;
        if (this.method4351(-108)) {
            int var3 = -24 % ((-arg0 - 39) / 48);
            int var4 = this.field10867.field8074.method25(arg1, 14540);
            return this.method4342((byte) 87, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
    private final boolean method4331(byte arg0, String arg1, String arg2) {
        int var4 = -114 / ((arg0 + 44) / 45);
        field10844++;
        if (!this.method4351(-112)) {
            return false;
        }
        String var5 = arg2.toLowerCase();
        String var6 = arg1.toLowerCase();
        int var7 = this.field10867.field8074.method25(class82.method625(101, var5), 14540);
        if (this.method4342((byte) 87, var7)) {
            int var8 = this.field10867.field8081[var7].method25(class82.method625(76, var6), 14540);
            return this.method4359(var7, 0, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)I")
    public final int method4332(byte arg0) {
        field10873++;
        int var2 = 2 / ((arg0 - 76) / 48);
        return this.method4351(-118) ? this.field10867.field8067.length : -1;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(II)I")
    private final int method4333(int arg0, int arg1) {
        field10885++;
        if (this.method4342((byte) 87, arg1)) {
            if (arg0 != -1) {
                this.method4337(-123, null);
            }
            return this.field10871[arg1] == null ? this.field10847.method3178(arg1, -2545) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method4334(byte arg0, String arg1) {
        field10879++;
        if (!this.method4351(-66)) {
            return 0;
        } else if (arg0 == 113) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field10867.field8074.method25(class82.method625(119, var3), 14540);
            return this.method4333(arg0 - 114, var4);
        } else {
            return -79;
        }
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(II)[B")
    public final byte[] method4335(int arg0, int arg1) {
        field10866++;
        if (!this.method4351(-116)) {
            return null;
        } else if (this.field10867.field8067.length == 1) {
            return this.method4339(arg0, arg1, 0);
        } else if (!this.method4342((byte) 87, arg0)) {
            return null;
        } else if (this.field10867.field8067[arg0] == 1) {
            return this.method4339(0, 0, arg0);
        } else {
            if (arg1 != 0) {
                this.method4351(-30);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(III[I)Z")
    private final boolean method4336(int arg0, int arg1, int arg2, int[] arg3) {
        field10882++;
        if (!this.method4342((byte) 87, arg2)) {
            return false;
        } else if (this.field10871[arg2] == null) {
            return false;
        } else {
            int var5 = this.field10867.field8068[arg2];
            int[] var6 = this.field10867.field8084[arg2];
            if (this.field10865[arg2] == null) {
                this.field10865[arg2] = new Object[this.field10867.field8067[arg2]];
            }
            Object[] var7 = this.field10865[arg2];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg3 == null || arg3[0] == 0 && arg3[1] == 0 && arg3[2] == 0 && arg3[3] == 0) {
                var11 = class56.method388(true, false, this.field10871[arg2]);
            } else {
                var11 = class56.method388(true, true, this.field10871[arg2]);
                class494 var12 = new class494(var11);
                var12.method2955(2, var12.field7050.length, arg3, 5);
            }
            byte[] var13;
            try {
                var13 = class179.method1289((byte) -57, var11);
                int var14 = -27 % ((arg1 + 50) / 35);
            } catch (RuntimeException var50) {
                throw class670.method3806(var50, "T3 - " + (arg3 != null) + "," + arg2 + "," + var11.length + "," + class167.method1243(var11, 0, var11.length) + "," + class167.method1243(var11, 0, var11.length - 2) + "," + this.field10867.field8078[arg2] + "," + this.field10867.field8085);
            }
            if (this.field10856) {
                this.field10871[arg2] = null;
            }
            if (var5 <= 1) {
                int var16;
                if (var6 == null) {
                    var16 = 0;
                } else {
                    var16 = var6[0];
                }
                if (this.field10884 == 0) {
                    var7[var16] = class211.method1448(var13, false, 1908068769);
                } else {
                    var7[var16] = var13;
                }
            } else if (this.field10884 == 2) {
                int var33 = var13.length;
                int var52 = var33 - 1;
                int var34 = var13[var52] & 0xFF;
                int var35 = var52 - var5 * var34 * 4;
                class494 var36 = new class494(var13);
                int var37 = 0;
                int var38 = 0;
                var36.field7042 = var35;
                for (int var39 = 0; var39 < var34; var39++) {
                    int var40 = 0;
                    for (int var41 = 0; var41 < var5; var41++) {
                        var40 += var36.method2976(-124);
                        int var42;
                        if (var6 == null) {
                            var42 = var41;
                        } else {
                            var42 = var6[var41];
                        }
                        if (arg0 == var42) {
                            var38 = var42;
                            var37 += var40;
                        }
                    }
                }
                if (var37 == 0) {
                    return true;
                }
                byte[] var43 = new byte[var37];
                int var44 = 0;
                var36.field7042 = var35;
                int var45 = 0;
                for (int var46 = 0; var46 < var34; var46++) {
                    int var47 = 0;
                    for (int var48 = 0; var48 < var5; var48++) {
                        var47 += var36.method2976(-126);
                        int var49;
                        if (var6 == null) {
                            var49 = var48;
                        } else {
                            var49 = var6[var48];
                        }
                        if (arg0 == var49) {
                            class595.method3467(var13, var45, var43, var44, var47);
                            var44 += var47;
                        }
                        var45 += var47;
                    }
                }
                var7[var38] = var43;
            } else {
                int var17 = var13.length;
                int var51 = var17 - 1;
                int var18 = var13[var51] & 0xFF;
                int var19 = var51 - var18 * 4 * var5;
                class494 var20 = new class494(var13);
                int[] var21 = new int[var5];
                var20.field7042 = var19;
                for (int var22 = 0; var22 < var18; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var20.method2976(-125);
                        var21[var24] += var23;
                    }
                }
                byte[][] var25 = new byte[var5][];
                for (int var26 = 0; var26 < var5; var26++) {
                    var25[var26] = new byte[var21[var26]];
                    var21[var26] = 0;
                }
                var20.field7042 = var19;
                int var27 = 0;
                for (int var28 = 0; var28 < var18; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var20.method2976(-127);
                        class595.method3467(var13, var27, var25[var30], var21[var30], var29);
                        var21[var30] += var29;
                        var27 += var29;
                    }
                }
                for (int var31 = 0; var31 < var5; var31++) {
                    int var32;
                    if (var6 == null) {
                        var32 = var31;
                    } else {
                        var32 = var6[var31];
                    }
                    if (this.field10884 == 0) {
                        var7[var32] = class211.method1448(var25[var31], false, 1908068769);
                    } else {
                        var7[var32] = var25[var31];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method4337(int arg0, String arg1) {
        field10863++;
        if (arg0 != 0) {
            return false;
        } else if (this.method4351(-59)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field10867.field8074.method25(class82.method625(106, var3), 14540);
            return this.method4357(22084, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)V")
    public static void method4338(int arg0) {
        if (arg0 == 0) {
            field10887 = null;
            field10850 = null;
            field10851 = null;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(III)[B")
    public final byte[] method4339(int arg0, int arg1, int arg2) {
        field10858++;
        return arg1 == 0 ? this.method4355(arg2, false, arg0, null) : null;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)V")
    public final void method4340(byte arg0) {
        if (this.field10865 != null) {
            for (int var2 = 0; var2 < this.field10865.length; var2++) {
                this.field10865[var2] = null;
            }
        }
        if (arg0 != -111) {
            this.method4349((byte) 81, -62);
        }
        field10881++;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    public final boolean method4341(String arg0, String arg1, byte arg2) {
        field10845++;
        if (!this.method4351(-46)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = -113 % ((29 - arg2) / 47);
        int var7 = this.field10867.field8074.method25(class82.method625(104, var4), 14540);
        if (var7 < 0) {
            return false;
        } else {
            int var8 = this.field10867.field8081[var7].method25(class82.method625(108, var5), 14540);
            return var8 >= 0;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(BI)Z")
    private final boolean method4342(byte arg0, int arg1) {
        field10849++;
        if (arg0 != 87) {
            this.field10865 = null;
        }
        if (!this.method4351(arg0 ^ 0xFFFFFF81)) {
            return false;
        } else if (arg1 >= 0 && this.field10867.field8067.length > arg1 && this.field10867.field8067[arg1] != 0) {
            return true;
        } else if (class263.field3852) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZZ)V")
    public final void method4343(int arg0, boolean arg1, boolean arg2) {
        field10862++;
        if (!this.method4351(arg0 ^ 0x19)) {
            return;
        }
        if (arg0 != -1) {
            this.method4330(72, 39);
        }
        if (arg1) {
            this.field10867.field8082 = null;
            this.field10867.field8074 = null;
        }
        if (arg2) {
            this.field10867.field8066 = null;
            this.field10867.field8081 = null;
        }
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(I)V")
    public final void method4344(int arg0) {
        if (arg0 != 0) {
            this.method4331((byte) 121, null, null);
        }
        field10861++;
        if (this.field10871 != null) {
            for (int var2 = 0; var2 < this.field10871.length; var2++) {
                this.field10871[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILha;I)Ljd;")
    public static final class241 method4345(int arg0, class65 arg1, int arg2) {
        field10857++;
        class244 var3 = (class244) class87.field961.method2242((long) arg0, -1);
        if (arg2 <= 50) {
            return null;
        }
        if (var3 != null) {
            class460 var4 = var3.field3625.method1963(-905192855);
            var3.field3626 = true;
            if (var4 != null) {
                return var4.method2733(arg1, (byte) -120);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(ILjava/lang/String;)V")
    public final void method4346(int arg0, String arg1) {
        if (arg0 != 20660) {
            this.method4353(89, false);
        }
        field10843++;
        if (this.method4351(-29)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field10867.field8074.method25(class82.method625(arg0 ^ 0x50EA, var3), 14540);
            this.method4358(var4, 1);
        }
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(I)I")
    public final int method4347(int arg0) {
        field10874++;
        if (!this.method4351(-125)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field10871.length; var4++) {
            if (this.field10867.field8068[var4] > 0) {
                var2 += 100;
                var3 += this.method4333(-1, var4);
            }
        }
        if (arg0 >= -9) {
            return -30;
        } else if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(BI)[I")
    public final int[] method4348(byte arg0, int arg1) {
        field10870++;
        if (arg0 > -51) {
            method4345(-6, null, -100);
        }
        if (!this.method4342((byte) 87, arg1)) {
            return null;
        }
        int[] var3 = this.field10867.field8084[arg1];
        if (var3 == null) {
            var3 = new int[this.field10867.field8068[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(BI)Z")
    public final boolean method4349(byte arg0, int arg1) {
        field10853++;
        if (!this.method4351(-106)) {
            return false;
        }
        if (arg0 != -102) {
            field10850 = null;
        }
        if (this.field10867.field8067.length == 1) {
            return this.method4359(0, arg0 ^ 0xFFFFFF9A, arg1);
        } else if (!this.method4342((byte) 87, arg1)) {
            return false;
        } else if (this.field10867.field8067[arg1] == 1) {
            return this.method4359(arg1, 0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "(I)Z")
    public final boolean method4350(int arg0) {
        field10868++;
        if (!this.method4351(-66)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 < 65) {
            this.method4361((byte) -7);
        }
        for (int var3 = 0; var3 < this.field10867.field8077.length; var3++) {
            int var4 = this.field10867.field8077[var3];
            if (this.field10871[var4] == null) {
                this.method4354(var4, (byte) -125);
                if (this.field10871[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "(I)Z")
    private final boolean method4351(int arg0) {
        field10864++;
        if (this.field10867 == null) {
            this.field10867 = this.field10847.method3180(-54);
            if (this.field10867 == null) {
                return false;
            }
            this.field10871 = new Object[this.field10867.field8072];
            this.field10865 = new Object[this.field10867.field8072][];
        }
        return arg0 < -20;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method4352(byte arg0, String arg1) {
        field10859++;
        if (!this.method4351(-53)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field10867.field8074.method25(class82.method625(84, var3), 14540);
        if (arg0 < 24) {
            this.method4359(-12, -29, 3);
        }
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZ)I")
    public final int method4353(int arg0, boolean arg1) {
        field10876++;
        if (!arg1) {
            this.field10847 = null;
        }
        return this.method4342((byte) 87, arg0) ? this.field10867.field8067[arg0] : 0;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IB)V")
    private final void method4354(int arg0, byte arg1) {
        if (this.field10856) {
            this.field10871[arg0] = this.field10847.method3181(arg0, false);
        } else {
            this.field10871[arg0] = class211.method1448(this.field10847.method3181(arg0, false), false, 1908068769);
        }
        field10877++;
        if (arg1 > -120) {
            this.method4349((byte) 9, 47);
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZI[I)[B")
    public final byte[] method4355(int arg0, boolean arg1, int arg2, int[] arg3) {
        field10848++;
        if (!this.method4360(true, arg2, arg0)) {
            return null;
        }
        if (this.field10865[arg0] == null || this.field10865[arg0][arg2] == null) {
            boolean var5 = this.method4336(arg2, 113, arg0, arg3);
            if (!var5) {
                this.method4354(arg0, (byte) -125);
                boolean var6 = this.method4336(arg2, -105, arg0, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class56.method388(true, arg1, this.field10865[arg0][arg2]);
        if (this.field10884 == 1) {
            this.field10865[arg0][arg2] = null;
            if (this.field10867.field8067[arg0] == 1) {
                this.field10865[arg0] = null;
            }
        } else if (this.field10884 == 2) {
            this.field10865[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(ILjava/lang/String;)I")
    public final int method4356(int arg0, String arg1) {
        field10880++;
        if (!this.method4351(-35)) {
            return -1;
        } else if (arg0 < 7) {
            return -85;
        } else {
            String var3 = arg1.toLowerCase();
            int var4 = this.field10867.field8074.method25(class82.method625(85, var3), 14540);
            return this.method4342((byte) 87, var4) ? var4 : -1;
        }
    }

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "(II)Z")
    public final boolean method4357(int arg0, int arg1) {
        if (arg0 != 22084) {
            this.field10871 = null;
        }
        field10854++;
        if (!this.method4342((byte) 87, arg1)) {
            return false;
        } else if (this.field10871[arg1] == null) {
            this.method4354(arg1, (byte) -123);
            return this.field10871[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "(II)V")
    private final void method4358(int arg0, int arg1) {
        this.field10847.method3183(arg0, (byte) 100);
        field10875++;
        if (arg1 != 1) {
            this.method4356(-97, null);
        }
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(III)Z")
    public final boolean method4359(int arg0, int arg1, int arg2) {
        field10883++;
        if (arg1 != 0) {
            return false;
        } else if (!this.method4360(true, arg2, arg0)) {
            return false;
        } else if (this.field10865[arg0] != null && this.field10865[arg0][arg2] != null) {
            return true;
        } else if (this.field10871[arg0] == null) {
            this.method4354(arg0, (byte) -127);
            return this.field10871[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZII)Z")
    private final boolean method4360(boolean arg0, int arg1, int arg2) {
        field10869++;
        if (!arg0) {
            return true;
        } else if (!this.method4351(-93)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && arg2 < this.field10867.field8067.length && arg1 < this.field10867.field8067[arg2]) {
            return true;
        } else if (class263.field3852) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lis;ZI)V")
    public class791(class527 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field10884 = arg2;
        this.field10847 = arg0;
        this.field10856 = arg1;
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(B)I")
    public final int method4361(byte arg0) {
        field10846++;
        if (!this.method4351(-120)) {
            throw new IllegalStateException("");
        }
        int var2 = 16 / ((arg0 - 53) / 51);
        return this.field10867.field8085;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
    public final byte[] method4362(String arg0, String arg1, byte arg2) {
        field10855++;
        if (!this.method4351(-83)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = -121 % ((-arg2 - 50) / 37);
        int var7 = this.field10867.field8074.method25(class82.method625(121, var4), 14540);
        if (this.method4342((byte) 87, var7)) {
            int var8 = this.field10867.field8081[var7].method25(class82.method625(85, var5), 14540);
            return this.method4339(var8, 0, var7);
        } else {
            return null;
        }
    }
}
