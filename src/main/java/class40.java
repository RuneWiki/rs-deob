import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class40 extends class350 {

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "Lim;")
    public static class353 field599;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "[B")
    private byte[] field596;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIII)[B")
    public final byte[] method231(int arg0, int arg1, int arg2, int arg3) {
        this.field596 = new byte[arg0 * arg2 * arg1 * 2];
        if (arg3 == 0) {
            field598++;
            this.method3138(1036486092, arg1, arg0, arg2);
            return this.field596;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)V")
    public static final void method232(int arg0, int arg1, byte arg2) {
        field597++;
        if (arg2 >= -44) {
            field599 = null;
        }
        class632 var3 = class641.method3699(-120, 5, arg0);
        var3.method3656(0);
        var3.field9198 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIB)V")
    public final void method233(byte arg0, int arg1, byte arg2) {
        field595++;
        byte var4 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        if (arg2 != 61) {
            method235(null, -21, -63);
        }
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field596[var10001] = var4;
        this.field596[var6] = var4;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class40() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
    public static void method234(int arg0) {
        if (arg0 != -2030) {
            field599 = null;
        }
        field599 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljj;II)V")
    public static final void method235(class66 arg0, int arg1, int arg2) {
        field594++;
        boolean var3 = arg0.method377(8, 1) == 1;
        if (var3) {
            class610.field8776[class80.field1087++] = arg2;
        }
        int var4 = arg0.method377(8, 2);
        class20 var5 = class364.field5092[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field276 = false;
            } else if (class182.field2335 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class61 var6 = class58.field785[arg2] = new class61();
                var6.field841 = (var5.field419[0] + class525.field7310 >> 6 << 14) + ((var5.field6358 << 28) + (class58.field786 + var5.field417[0] >> 6));
                if (var5.field262 == -1) {
                    var6.field844 = var5.field338.method160(true);
                } else {
                    var6.field844 = var5.field262;
                }
                var6.field846 = var5.field399;
                var6.field842 = var5.field271;
                if (var5.field265 > 0) {
                    class627.method3630(var5, (byte) -38);
                }
                class364.field5092[arg2] = null;
                if (arg0.method377(arg1 + 6, 1) != 0) {
                    class49.method272(arg0, arg1 ^ 0x195F, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method377(8, 3);
            int var8 = var5.field419[0];
            int var9 = var5.field417[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field276 = true;
                var5.field244 = var8;
                var5.field263 = var9;
            } else {
                var5.method115(var8, (byte) 13, class635.field9236[arg2], var9);
            }
        } else if (arg1 == var4) {
            int var10 = arg0.method377(arg1 + 6, 4);
            int var11 = var5.field419[0];
            int var12 = var5.field417[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field276 = true;
                var5.field244 = var11;
                var5.field263 = var12;
            } else {
                var5.method115(var11, (byte) 13, class635.field9236[arg2], var12);
            }
        } else {
            int var13 = arg0.method377(8, 1);
            if (var13 == 0) {
                int var14 = arg0.method377(8, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field419[0] + var16;
                int var19 = var5.field417[0] + var17;
                if (var3) {
                    var5.field276 = true;
                    var5.field244 = var18;
                    var5.field263 = var19;
                } else {
                    var5.method115(var18, (byte) 13, class635.field9236[arg2], var19);
                }
                var5.field6358 = (byte) (var5.field6358 + var15 & 0x3);
                if (class182.field2335 == arg2) {
                    class187.field2407 = var5.field6358;
                }
            } else {
                int var20 = arg0.method377(8, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field419[0] + var22 + class525.field7310 & 0x3FFF) - class525.field7310;
                int var25 = (var5.field417[0] - (-class58.field786 - var23) & 0x3FFF) - class58.field786;
                if (var3) {
                    var5.field263 = var25;
                    var5.field244 = var24;
                    var5.field276 = true;
                } else {
                    var5.method115(var24, (byte) 13, class635.field9236[arg2], var25);
                }
                var5.field6358 = (byte) (var5.field6358 + var21 & 0x3);
                if (class182.field2335 == arg2) {
                    class187.field2407 = var5.field6358;
                }
            }
        }
    }

    static {
        new class344("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field599 = new class353(4, -1);
    }
}
