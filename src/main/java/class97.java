import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class97 {

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    private int field1160 = 0;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    private int field1150 = 128;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "Z")
    public boolean field1158 = false;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
    public int field1166 = -1;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    private int field1164 = 0;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    private int field1151 = 128;

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "I")
    private int field1174 = 0;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "Z")
    public boolean field1154 = false;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "Liq;")
    public static class362 field1163 = new class362("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
    public static int field1170 = 0;

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "Llb;")
    public static class322 field1169 = new class322();

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!wp", name = "w", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!wp", name = "y", descriptor = "Ltq;")
    public static class376 field1173;

    @OriginalMember(owner = "client!wp", name = "x", descriptor = "Lwk;")
    public static class75 field1172;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "[Lwl;")
    public static class233[] field1168;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "[Lgj;")
    public static class381[] field1167;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "[S")
    private short[] field1149;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "[S")
    private short[] field1156;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "[S")
    private short[] field1157;

    @OriginalMember(owner = "client!wp", name = "A", descriptor = "[S")
    private short[] field1175;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILdg;)V")
    public final void method532(int arg0, class236 arg1) {
        if (arg0 != 1066) {
            this.method536(-113, (class236) null, 104);
        }
        while (true) {
            int var3 = arg1.method1574(-36);
            if (var3 == 0) {
                field1153++;
                return;
            }
            this.method536(var3, arg1, 40);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "([I[B[[BI[I[[BBI)I")
    public static final int method533(int[] arg0, byte[] arg1, byte[][] arg2, int arg3, int[] arg4, byte[][] arg5, byte arg6, int arg7) {
        field1165++;
        int var8 = arg0[arg3];
        int var9 = arg4[arg3] + var8;
        int var10 = arg0[arg7];
        int var11 = arg4[arg7] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg1[arg3] & 0xFF;
        if (var14 > (arg1[arg7] & 0xFF)) {
            var14 = arg1[arg7] & 0xFF;
        }
        byte[] var15 = arg2[arg3];
        byte[] var16 = arg5[arg7];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        if (arg6 < 22) {
            field1170 = 46;
        }
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public static final void method534(int arg0) {
        field1152++;
        class305.field4288.method644(((float) class23.field289 * 0.1F + 0.7F) * 1.1523438F);
        class305.field4288.method640(class39.field446, 0.69921875F, 1.2F, (float) arg0, -60.0F, -50.0F);
        class305.field4288.method627(class32.field371, -1);
        class305.field4288.method688(class335.field4740);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILae;IBII)Lbk;")
    public final class210 method535(int arg0, class134 arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1171++;
        int var7 = arg0;
        class412 var8 = this.field1166 == -1 || arg2 == -1 ? null : class189.method1288(arg3 ^ 0x1FE0, this.field1166);
        if (var8 != null) {
            var7 = arg0 | var8.method2625(arg4, arg2, 104, false);
        }
        if (this.field1150 != 128) {
            var7 |= 0x2;
        }
        if (this.field1151 != 128 || this.field1164 != 0) {
            var7 |= 0x5;
        }
        class237 var9 = class285.field4005;
        class210 var10;
        synchronized (class285.field4005) {
            var10 = (class210) class285.field4005.method1625((long) (this.field1159 |= arg1.field1620 << 29), 0);
        }
        if (var10 == null || arg1.method689(var10.method1410(), var7) != 0) {
            if (var10 != null) {
                var7 = arg1.method625(var7, var10.method1410());
            }
            int var11 = var7;
            if (this.field1156 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field1175 != null) {
                var11 |= 0x4000;
            }
            class160 var12 = class248.method1690(class412.field5909, true, 0, this.field1162);
            if (var12 == null) {
                return null;
            }
            var10 = arg1.method605(var12, var11, class273.field3873, this.field1160 + 64, this.field1174 - -850);
            if (this.field1156 != null) {
                for (int var13 = 0; var13 < this.field1156.length; var13++) {
                    var10.method1392(this.field1156[var13], this.field1157[var13]);
                }
            }
            if (this.field1175 != null) {
                for (int var14 = 0; var14 < this.field1175.length; var14++) {
                    var10.method1376(this.field1175[var14], this.field1149[var14]);
                }
            }
            var10.method1387(var7);
            class237 var15 = class285.field4005;
            synchronized (class285.field4005) {
                class285.field4005.method1622((byte) 13, var10, (long) (this.field1159 |= arg1.field1620 << 29));
            }
        }
        class210 var16 = var8 == null ? var10.method1411((byte) 2, var7, true) : var8.method2631(arg2, arg4, 0, arg5, var7, (byte) 2, 1527433072, var10);
        if (this.field1151 != 128 || this.field1150 != 128) {
            var16.method1420(this.field1151, this.field1150, this.field1151);
        }
        if (this.field1164 != 0) {
            if (this.field1164 == 90) {
                var16.method1413(4096);
            }
            if (this.field1164 == 180) {
                var16.method1413(8192);
            }
            if (this.field1164 == 270) {
                var16.method1413(12288);
            }
        }
        var16.method1387(arg0);
        if (arg3 != -32) {
            method533((int[]) null, (byte[]) null, (byte[][]) null, -120, (int[]) null, (byte[][]) null, (byte) -16, -85);
        }
        return var16;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILdg;I)V")
    private final void method536(int arg0, class236 arg1, int arg2) {
        field1161++;
        if (arg2 != 40) {
            field1173 = null;
        }
        if (arg0 == 1) {
            this.field1162 = arg1.method1617((byte) 48);
        } else if (arg0 == 2) {
            this.field1166 = arg1.method1617((byte) 48);
        } else if (arg0 == 4) {
            this.field1151 = arg1.method1617((byte) 48);
        } else if (arg0 == 5) {
            this.field1150 = arg1.method1617((byte) 48);
        } else if (arg0 == 6) {
            this.field1164 = arg1.method1617((byte) 48);
        } else if (arg0 == 7) {
            this.field1160 = arg1.method1574(-64);
        } else if (arg0 == 8) {
            this.field1174 = arg1.method1574(arg2 ^ 0xFFFFFFAE);
        } else if (arg0 == 9) {
            this.field1154 = true;
        } else if (arg0 == 10) {
            this.field1158 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method1574(-10);
            this.field1157 = new short[var6];
            this.field1156 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1156[var7] = (short) arg1.method1617((byte) 48);
                this.field1157[var7] = (short) arg1.method1617((byte) 48);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method1574(arg2 - 52);
            this.field1175 = new short[var4];
            this.field1149 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1175[var5] = (short) arg1.method1617((byte) 48);
                this.field1149[var5] = (short) arg1.method1617((byte) 48);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
    public static void method537(byte arg0) {
        field1172 = null;
        field1173 = null;
        field1167 = null;
        field1168 = null;
        if (arg0 == 2) {
            field1163 = null;
            field1169 = null;
        }
    }
}
