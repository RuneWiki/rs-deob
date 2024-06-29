import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class109 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Z")
    public boolean field1509 = true;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    private int field1517 = -1;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Loaa;")
    private class289 field1511;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lwu;")
    private class373 field1513;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Lch;")
    private class465 field1519;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Ljf;")
    private class216 field1514;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZB)V")
    public static final void method812(boolean arg0, byte arg1) {
        field1524++;
        if (class533.field7668 != null) {
            class533.field7668.method850(2);
            class533.field7668 = null;
        }
        class233.field3400 = 0;
        class132.method934(false);
        class252.method1662();
        for (int var2 = 0; var2 < 4; var2++) {
            class326.field4655[var2].method1590((byte) -52);
        }
        client.method1892(-120, false);
        System.gc();
        class144.method1007(2, (byte) 25);
        class9.field142 = -1;
        class202.field3022 = false;
        class718.method4079((byte) -86);
        class760.method4229(true, 124);
        class582.field8288 = 0;
        class499.field7093 = 0;
        class9.field132 = 0;
        class288.field4088 = 0;
        class352.field5126 = 0;
        class361.field5224 = 0;
        for (int var3 = 0; var3 < class554.field7904.length; var3++) {
            class554.field7904[var3] = null;
        }
        class580.method3365((byte) 94);
        for (int var4 = 0; var4 < 2048; var4++) {
            class314.field4456[var4] = null;
        }
        class441.field6552 = 0;
        class497.field7067.method2289(1393);
        class567.field8058 = 0;
        class12.field173.method2289(1393);
        class80.method650(-95);
        class352.field5129 = 0;
        class83.field1160.method2612(-14537);
        int var5 = 46 / ((arg1 - 39) / 59);
        class124.method886(118);
        class276.method1752(-68);
        class524.field7489 = null;
        class430.field6434 = 0L;
        if (arg0) {
            class49.method363(12, 116);
            return;
        }
        class49.method363(3, 98);
        try {
            class121.method877(class466.field6830, "loggedout", -22421);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
    public static final void method813(int arg0, int arg1) {
        field1512++;
        class93.field1336.method807(arg1, -1);
        class79.field1102.method807(arg1, -1);
        class255.field3668.method807(arg1, -1);
        class528.field7528.method807(arg1, -1);
        if (arg0 <= 70) {
            method813(-30, 28);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    private final void method814(int arg0) {
        field1510++;
        if (!this.field1509) {
            return;
        }
        this.field1509 = false;
        byte[] var2 = this.field1511.field4125;
        int var3 = 0;
        int var4 = this.field1511.field4121;
        int var5 = this.field1521 + (this.field1511.field4121 * this.field1525);
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field1519 != null && this.field1517 == var3) {
            this.field1509 = false;
            return;
        }
        this.field1517 = var3;
        if (arg0 > -40) {
            this.method816(null, -98, -85);
        }
        int var7 = this.field1525 * var4 + this.field1521;
        int var8 = 0;
        if (!this.field1513.method2311((byte) -13, class256.field3677, class39.field413)) {
            if (class712.field10049 == null) {
                class712.field10049 = new int[16384];
            }
            int[] var13 = class712.field10049;
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
                        if (var2[var7 + var4] != 0) {
                            var16++;
                        }
                        var13[var8++] = var16 * 17 << 24;
                    } else {
                        var13[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field1511.field4121 - 128;
            }
            if (this.field1519 == null) {
                this.field1519 = this.field1513.method2358(-121, false, 128, class712.field10049, 128);
                this.field1519.method1272(false, (byte) -120, false);
            } else {
                this.field1519.method1268(0, 128, 0, 128, 128, 0, class712.field10049, 100);
            }
            return;
        }
        if (class593.field8426 == null) {
            class593.field8426 = new byte[16384];
        }
        byte[] var9 = class593.field8426;
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
                    if (var2[var7 + var4] != 0) {
                        var12++;
                    }
                    var9[var8++] = (byte) (var12 * 17);
                } else {
                    var9[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field1511.field4121 - 128;
        }
        if (this.field1519 == null) {
            this.field1519 = this.field1513.method2386(128, (byte) -78, false, class593.field8426, class39.field413, 128);
            this.field1519.method1272(false, (byte) -116, false);
        } else {
            this.field1519.method1265(0, 128, 0, -106, 128, 128, 0, class593.field8426, class39.field413);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public final void method815(boolean arg0) {
        this.method816(this.field1514, 91, this.field1520);
        field1522++;
        if (!arg0) {
            this.method815(false);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljf;II)V")
    public final void method816(class216 arg0, int arg1, int arg2) {
        if (arg2 > 0) {
            this.method814(-54);
            this.field1513.method2294(this.field1519, -2);
            this.field1513.method2325(arg2, 0, this.field1516 + 1 - this.field1515, this.field1515, arg0, -8, class506.field7196);
        }
        field1523++;
        int var4 = 94 / ((arg1 + 58) / 47);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
    public static final void method817(int arg0, int arg1, int arg2) {
        class186 var3 = class80.field1136[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class51.method371(var3.field2834);
        class51.method371(var3.field2841);
        if (var3.field2834 != null) {
            var3.field2834 = null;
        }
        if (var3.field2841 != null) {
            var3.field2841 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lwu;Loaa;Llw;IIIII)V")
    public class109(class373 arg0, class289 arg1, class662 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1511 = arg1;
        this.field1521 = arg6;
        this.field1513 = arg0;
        this.field1525 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field3963 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field9253[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field1520 = 0;
            this.field1519 = null;
        } else {
            this.field1515 = Integer.MAX_VALUE;
            this.field1516 = Integer.MIN_VALUE;
            this.field1514 = this.field1513.method2362(58, false);
            this.field1514.method1458((byte) 91, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field1514.method1457(true, -112);
                if (var15 != null) {
                    Stream var16 = this.field1513.method2392(var15, -15232);
                    if (Stream.method3869()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field3963 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field9253[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field1516 < var22) {
                                            this.field1516 = var22;
                                        }
                                        if (var22 < this.field1515) {
                                            this.field1515 = var22;
                                        }
                                        var16.method3861(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field3963 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field9253[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 < this.field1515) {
                                            this.field1515 = var28;
                                        }
                                        if (var28 > this.field1516) {
                                            this.field1516 = var28;
                                        }
                                        var16.method3858(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3872();
                    if (this.field1514.method1459(-26499)) {
                        break;
                    }
                }
            }
            this.field1520 = var10 / 3;
        }
    }
}
