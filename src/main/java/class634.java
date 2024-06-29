import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class634 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    private int field8893 = -1;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Z")
    public boolean field8904 = true;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    private int field8906;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lve;")
    private class528 field8894;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    private int field8907;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lpj;")
    private class156 field8901;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    private int field8900;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    private int field8903;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Ldk;")
    private class535 field8902;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public int field8899;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Loga;")
    private class498 field8897;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Z")
    public static boolean field8905 = false;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    private final void method3624(byte arg0) {
        field8896++;
        if (!this.field8904) {
            return;
        }
        this.field8904 = false;
        if (arg0 != 8) {
            return;
        }
        byte[] var2 = this.field8894.field7543;
        int var3 = 0;
        int var4 = this.field8894.field7540;
        int var5 = this.field8906 + (this.field8894.field7540 * this.field8907);
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field8897 != null && this.field8893 == var3) {
            this.field8904 = false;
            return;
        }
        this.field8893 = var3;
        int var7 = 0;
        int var8 = this.field8907 * var4 + this.field8906;
        if (!this.field8901.method1198(13554, class88.field993, class34.field457)) {
            if (class342.field4768 == null) {
                class342.field4768 = new int[16384];
            }
            int[] var9 = class342.field4768;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var8] == 0) {
                        int var12 = 0;
                        if (var2[var8 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var8] != 0) {
                            var12++;
                        }
                        var9[var7++] = var12 * 17 << 24;
                    } else {
                        var9[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field8894.field7540 - 128;
            }
            if (this.field8897 == null) {
                this.field8897 = this.field8901.method1093((byte) 112, false, 128, class342.field4768, 128);
                this.field8897.method2021(false, false, (byte) 23);
            } else {
                this.field8897.method2020(128, 128, 0, (byte) -103, 0, class342.field4768, 128, 0);
            }
            return;
        }
        if (class516.field7294 == null) {
            class516.field7294 = new byte[16384];
        }
        byte[] var13 = class516.field7294;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var8] == 0) {
                    int var16 = 0;
                    if (var2[var8 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var16++;
                    }
                    var13[var7++] = (byte) (var16 * 17);
                } else {
                    var13[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field8894.field7540 - 128;
        }
        if (this.field8897 == null) {
            this.field8897 = this.field8901.method1141(128, 128, class516.field7294, false, false, class88.field993);
            this.field8897.method2021(false, false, (byte) 23);
        } else {
            this.field8897.method2023(128, 0, class88.field993, 0, 128, 128, 8409, class516.field7294, 0);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public final void method3625(byte arg0) {
        field8898++;
        this.method3626(this.field8902, this.field8899, true);
        if (arg0 != -30) {
            this.field8900 = 82;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ldk;IZ)V")
    public final void method3626(class535 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field8895++;
        if (arg1 > 0) {
            this.method3624((byte) 8);
            this.field8901.method1118(0, this.field8897);
            this.field8901.method1091(arg1, arg0, this.field8903, 0, this.field8900 + 1 - this.field8903, class207.field3204, (byte) -29);
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lpj;Lve;Lmf;IIIII)V")
    public class634(class156 arg0, class528 arg1, class439 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field8906 = arg6;
        this.field8894 = arg1;
        this.field8907 = arg7;
        this.field8901 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field4289 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field5942[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field8897 = null;
            this.field8899 = 0;
        } else {
            this.field8900 = Integer.MIN_VALUE;
            this.field8903 = Integer.MAX_VALUE;
            this.field8902 = this.field8901.method1184(2, false);
            this.field8902.method604(var10, 115);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field8902.method605((byte) 100, true);
                if (var15 != null) {
                    Stream var16 = this.field8901.method1190(0, var15);
                    if (Stream.method3953()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field4289 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field5942[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 < this.field8903) {
                                            this.field8903 = var28;
                                        }
                                        if (var28 > this.field8900) {
                                            this.field8900 = var28;
                                        }
                                        var16.method3947(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field4289 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field5942[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 > this.field8900) {
                                            this.field8900 = var22;
                                        }
                                        if (var22 < this.field8903) {
                                            this.field8903 = var22;
                                        }
                                        var16.method3954(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3945();
                    if (this.field8902.method601(-123)) {
                        break;
                    }
                }
            }
            this.field8899 = var10 / 3;
        }
    }
}
