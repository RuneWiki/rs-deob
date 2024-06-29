import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class80 {

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "[B")
    private byte[] field1136;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "[I")
    private int[] field1138;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "[I")
    private int[] field1135;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Lla;")
    public static class319 field1132 = new class319(83, -2);

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Lga;")
    public static class282 field1139 = null;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "Lla;")
    public static class319 field1140 = new class319(41, 20);

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1141 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "Lof;")
    public static class446 field1142 = new class446("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I[BI[BII)I", line = 5)
    public final int method543(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field1133++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg2 + arg4;
        int var8 = 0;
        if (arg0 != -1) {
            this.field1138 = null;
        }
        int var9 = arg5;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field1135[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1135[var8]) < 0) {
                arg3[arg2++] = (byte) (~var11);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1135[var8];
            }
            int var12;
            if ((var12 = this.field1135[var8]) < 0) {
                arg3[arg2++] = (byte) (~var12);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1135[var8];
            }
            int var13;
            if ((var13 = this.field1135[var8]) < 0) {
                arg3[arg2++] = (byte) (~var13);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1135[var8];
            }
            int var14;
            if ((var14 = this.field1135[var8]) < 0) {
                arg3[arg2++] = (byte) (~var14);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1135[var8];
            }
            int var15;
            if ((var15 = this.field1135[var8]) < 0) {
                arg3[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1135[var8];
            }
            int var16;
            if ((var16 = this.field1135[var8]) < 0) {
                arg3[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1135[var8];
            }
            int var17;
            if ((var17 = this.field1135[var8]) < 0) {
                arg3[arg2++] = (byte) (~var17);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1135[var8];
            }
            int var18;
            if ((var18 = this.field1135[var8]) < 0) {
                arg3[arg2++] = (byte) (~var18);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)Lkr;", line = 160)
    public static final class535 method544(int arg0, int arg1, int arg2) {
        class452 var3 = class443.field6672[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6797;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II[B[BII)I", line = 168)
    public final int method545(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        field1137++;
        int var7 = arg1;
        int var8 = arg0 << 3;
        int var9 = arg4 + arg5;
        while (arg4 < var9) {
            int var10 = arg2[arg4] & 0xFF;
            int var11 = this.field1138[var10];
            byte var12 = this.field1136[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class311.method1956(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var8 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 239)
    public static void method546(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field1139 = null;
        field1142 = null;
        field1132 = null;
        field1141 = null;
        field1140 = null;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "([B)V", line = 258)
    public class80(byte[] arg0) {
        int var2 = arg0.length;
        this.field1136 = arg0;
        this.field1138 = new int[var2];
        this.field1135 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1138[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class311.method1956(var11, var12);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1135[var14] == 0) {
                            this.field1135[var14] = var4;
                        }
                        var14 = this.field1135[var14];
                    }
                    if (this.field1135.length <= var14) {
                        int[] var17 = new int[this.field1135.length * 2];
                        for (int var18 = 0; var18 < this.field1135.length; var18++) {
                            var17[var18] = this.field1135[var18];
                        }
                        this.field1135 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field1135[var14] = ~var5;
            }
        }
    }
}
