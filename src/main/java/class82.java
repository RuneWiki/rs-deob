import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class82 {

    @OriginalMember(owner = "client!vga", name = "i", descriptor = "Z")
    public boolean field1186 = false;

    @OriginalMember(owner = "client!vga", name = "l", descriptor = "I")
    public int field1189 = 99;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    public int field1179 = -1;

    @OriginalMember(owner = "client!vga", name = "v", descriptor = "I")
    public int field1199 = 5;

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "I")
    public int field1183 = -1;

    @OriginalMember(owner = "client!vga", name = "p", descriptor = "Z")
    public boolean field1193 = false;

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "Z")
    public boolean field1184 = false;

    @OriginalMember(owner = "client!vga", name = "r", descriptor = "I")
    public int field1195 = 2;

    @OriginalMember(owner = "client!vga", name = "x", descriptor = "I")
    public int field1201 = -1;

    @OriginalMember(owner = "client!vga", name = "D", descriptor = "I")
    public int field1207 = -1;

    @OriginalMember(owner = "client!vga", name = "A", descriptor = "I")
    public int field1204 = -1;

    @OriginalMember(owner = "client!vga", name = "C", descriptor = "Z")
    public boolean field1206 = false;

    @OriginalMember(owner = "client!vga", name = "q", descriptor = "Ltm;")
    public static class334 field1194 = new class334(67, 0);

    @OriginalMember(owner = "client!vga", name = "E", descriptor = "[[[I")
    public static int[][][] field1208 = new int[2][][];

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!vga", name = "n", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!vga", name = "s", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!vga", name = "u", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!vga", name = "w", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!vga", name = "z", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!vga", name = "B", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!vga", name = "F", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!vga", name = "G", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "Loj;")
    public static class208 field1185;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "Lrca;")
    public class368 field1180;

    @OriginalMember(owner = "client!vga", name = "j", descriptor = "[I")
    public int[] field1187;

    @OriginalMember(owner = "client!vga", name = "k", descriptor = "[I")
    private int[] field1188;

    @OriginalMember(owner = "client!vga", name = "m", descriptor = "[I")
    public int[] field1190;

    @OriginalMember(owner = "client!vga", name = "t", descriptor = "[I")
    public int[] field1197;

    @OriginalMember(owner = "client!vga", name = "y", descriptor = "[I")
    public int[] field1202;

    @OriginalMember(owner = "client!vga", name = "H", descriptor = "[I")
    public int[] field1211;

    @OriginalMember(owner = "client!vga", name = "I", descriptor = "[Z")
    public boolean[] field1212;

    @OriginalMember(owner = "client!vga", name = "o", descriptor = "[[I")
    public int[][] field1192;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(ILka;IZII)Lka;", line = 3)
    public final class282 method727(int arg0, class282 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1200++;
        int var7 = this.field1211[arg2];
        int var8 = this.field1197[arg2];
        class249 var9 = this.field1180.method2350(var8 >> 16, true);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method1025((byte) 1, arg0, true);
        }
        class249 var11 = null;
        if ((this.field1184 || class584.field8245) && arg5 != -1 && arg5 < this.field1197.length) {
            int var12 = this.field1197[arg5];
            var11 = this.field1180.method2350(var12 >> 16, true);
            arg5 = var12 & 0xFFFF;
        }
        class249 var13 = null;
        class249 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field1188 != null) {
            if (this.field1188.length > arg2) {
                var15 = this.field1188[arg2];
                if (var15 != 65535) {
                    var13 = this.field1180.method2350(var15 >> 16, arg3);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1184 || class584.field8245) && arg5 != -1 && arg5 < this.field1188.length) {
                var16 = this.field1188[arg5];
                if (var16 != 65535) {
                    var14 = this.field1180.method2350(var16 >> 16, true);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1186) {
            arg0 |= 0x200;
        }
        if (var9.method1713(-77, var10)) {
            arg0 |= 0x80;
        }
        if (var9.method1711(var10, 0)) {
            arg0 |= 0x100;
        }
        if (var9.method1709(var10, 4)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1713(-55, var15)) {
                arg0 |= 0x80;
            }
            if (var13.method1711(var15, 0)) {
                arg0 |= 0x100;
            }
            if (var13.method1709(var15, 4)) {
                arg0 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method1713(-108, arg5)) {
                arg0 |= 0x80;
            }
            if (var11.method1711(arg5, 0)) {
                arg0 |= 0x100;
            }
            if (var11.method1709(arg5, 4)) {
                arg0 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method1713(-45, var16)) {
                arg0 |= 0x80;
            }
            if (var14.method1711(var16, 0)) {
                arg0 |= 0x100;
            }
            if (var14.method1709(var16, 4)) {
                arg0 |= 0x400;
            }
        }
        int var17 = arg0 | 0x20;
        if (!arg3) {
            method729(89, -123);
        }
        class282 var18 = arg1.method1025((byte) 1, var17, true);
        var18.method1853(arg5, var10, 116, var9, this.field1186, var11, 0, arg4 - 1, var7);
        if (var13 != null) {
            var18.method1853(var16, var15, -79, var13, this.field1186, var14, 0, arg4 - 1, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "([BBI)[B", line = 136)
    public static final byte[] method728(byte[] arg0, byte arg1, int arg2) {
        field1196++;
        byte[] var3 = new byte[arg2];
        if (arg1 > -113) {
            field1185 = null;
        }
        class571.method3313(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)I", line = 150)
    public static final int method729(int arg0, int arg1) {
        if (arg0 == 127) {
            field1178++;
            return arg1 & 0x7F;
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(II)Lln;", line = 167)
    public static final class472 method730(int arg0, int arg1) {
        field1181++;
        class472[] var2 = class443.method2714(-19757);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field6847 == arg0) {
                return var2[var3];
            }
        }
        if (arg1 >= -50) {
            field1208 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BLofa;I)V", line = 202)
    private final void method731(byte arg0, class301 arg1, int arg2) {
        field1209++;
        if (arg0 != 97) {
            return;
        }
        if (arg2 == 1) {
            int var4 = arg1.method1989((byte) -108);
            this.field1211 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1211[var5] = arg1.method1989((byte) -96);
            }
            this.field1197 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1197[var6] = arg1.method1989((byte) -91);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1197[var7] = (arg1.method1989((byte) -80) << 16) + this.field1197[var7];
            }
        } else if (arg2 == 2) {
            this.field1179 = arg1.method1989((byte) -117);
        } else if (arg2 == 3) {
            this.field1212 = new boolean[256];
            int var18 = arg1.method1987(arg0 - 139);
            for (int var19 = 0; var19 < var18; var19++) {
                this.field1212[arg1.method1987(-125)] = true;
            }
        } else if (arg2 == 5) {
            this.field1199 = arg1.method1987(-81);
        } else if (arg2 == 6) {
            this.field1201 = arg1.method1989((byte) -64);
        } else if (arg2 == 7) {
            this.field1204 = arg1.method1989((byte) -63);
        } else if (arg2 == 8) {
            this.field1189 = arg1.method1987(-117);
        } else if (arg2 == 9) {
            this.field1183 = arg1.method1987(-122);
        } else if (arg2 == 10) {
            this.field1207 = arg1.method1987(arg0 - 129);
        } else if (arg2 == 11) {
            this.field1195 = arg1.method1987(arg0 ^ 0xFFFFFF88);
        } else if (arg2 == 12) {
            int var8 = arg1.method1987(-73);
            this.field1188 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1188[var9] = arg1.method1989((byte) -44);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field1188[var10] = (arg1.method1989((byte) -53) << 16) + this.field1188[var10];
            }
        } else if (arg2 == 13) {
            int var11 = arg1.method1989((byte) -41);
            this.field1192 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg1.method1987(-119);
                if (var13 > 0) {
                    this.field1192[var12] = new int[var13];
                    this.field1192[var12][0] = arg1.method1952(arg0 + 21988);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field1192[var12][var14] = arg1.method1989((byte) -50);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field1186 = true;
        } else if (arg2 == 15) {
            this.field1184 = true;
        } else if (arg2 == 16) {
            this.field1206 = true;
        } else if (arg2 == 18) {
            this.field1193 = true;
        } else if (arg2 == 19) {
            if (this.field1190 == null) {
                this.field1190 = new int[this.field1192.length];
                for (int var15 = 0; var15 < this.field1192.length; var15++) {
                    this.field1190[var15] = 255;
                }
            }
            this.field1190[arg1.method1987(-127)] = arg1.method1987(class584.method3367(arg0, -100));
            return;
        } else if (arg2 == 20) {
            if (this.field1187 == null || this.field1202 == null) {
                this.field1187 = new int[this.field1192.length];
                this.field1202 = new int[this.field1192.length];
                for (int var16 = 0; var16 < this.field1192.length; var16++) {
                    this.field1187[var16] = 256;
                    this.field1202[var16] = 256;
                }
            }
            int var17 = arg1.method1987(arg0 - 177);
            this.field1187[var17] = arg1.method1989((byte) -43);
            this.field1202[var17] = arg1.method1989((byte) -27);
            return;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZIII)I", line = 404)
    public final int method732(boolean arg0, int arg1, int arg2, int arg3) {
        field1203++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field1197[arg1];
        class249 var8 = null;
        class249 var9 = this.field1180.method2350(var7 >> 16, true);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field1184 || class584.field8245) && arg2 != -1 && arg2 < this.field1197.length) {
            int var11 = this.field1197[arg2];
            var8 = this.field1180.method2350(var11 >> 16, true);
            var6 = var11 & 0xFFFF;
        }
        if (this.field1186) {
            var5 |= 0x200;
        }
        if (var9.method1713(arg3 - 365, var10)) {
            var5 |= 0x80;
        }
        if (var9.method1711(var10, 0)) {
            var5 |= 0x100;
        }
        if (var9.method1709(var10, arg3 ^ 0x104)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method1713(-77, var6)) {
                var5 |= 0x80;
            }
            if (var8.method1711(var6, 0)) {
                var5 |= 0x100;
            }
            if (var8.method1709(var6, 4)) {
                var5 |= 0x400;
            }
        }
        if (arg3 != 256) {
            method733(68);
        }
        if (this.field1188 != null && arg0) {
            if (arg1 < this.field1188.length) {
                int var12 = this.field1188[arg1];
                if (var12 != 65535) {
                    class249 var13 = this.field1180.method2350(var12 >> 16, true);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1713(-48, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1711(var14, 0)) {
                            var5 |= 0x100;
                        }
                        if (var13.method1709(var14, 4)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field1184 || class584.field8245) && arg2 != -1 && arg2 < this.field1188.length) {
                int var15 = this.field1188[arg2];
                if (var15 != 65535) {
                    class249 var16 = this.field1180.method2350(var15 >> 16, true);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1713(-63, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1711(var17, 0)) {
                            var5 |= 0x100;
                        }
                        if (var16.method1709(var17, 4)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V", line = 528)
    public static void method733(int arg0) {
        field1185 = null;
        field1194 = null;
        if (arg0 == 0) {
            field1208 = null;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lofa;B)V", line = 556)
    public final void method734(class301 arg0, byte arg1) {
        int var3 = -2 % ((arg1 - 13) / 63);
        field1191++;
        while (true) {
            int var4 = arg0.method1987(-35);
            if (var4 == 0) {
                return;
            }
            this.method731((byte) 97, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BIIIIILka;I)Lka;", line = 581)
    public final class282 method735(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class282 arg6, int arg7) {
        field1205++;
        int var9 = this.field1211[arg3];
        int var10 = this.field1197[arg3];
        class249 var11 = this.field1180.method2350(var10 >> 16, true);
        int var12 = var10 & arg4;
        if (var11 == null) {
            return arg6.method1025(arg0, arg5, true);
        }
        class249 var13 = null;
        if ((this.field1184 || class584.field8245) && arg7 != -1 && arg7 < this.field1197.length) {
            int var14 = this.field1197[arg7];
            var13 = this.field1180.method2350(var14 >> 16, true);
            arg7 = var14 & 0xFFFF;
        }
        if (this.field1186) {
            arg5 |= 0x200;
        }
        if (var11.method1713(-107, var12)) {
            arg5 |= 0x80;
        }
        if (var11.method1711(var12, 0)) {
            arg5 |= 0x100;
        }
        if (var11.method1709(var12, 4)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1713(-114, arg7)) {
                arg5 |= 0x80;
            }
            if (var13.method1711(arg7, 0)) {
                arg5 |= 0x100;
            }
            if (var13.method1709(arg7, 4)) {
                arg5 |= 0x400;
            }
        }
        int var15 = arg5 | 0x20;
        class282 var16 = arg6.method1025(arg0, var15, true);
        var16.method1853(arg7, var12, -43, var11, this.field1186, var13, arg1, arg2 - 1, var9);
        return var16;
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V", line = 667)
    public final void method736(int arg0) {
        field1210++;
        if (this.field1183 == -1) {
            if (this.field1212 == null) {
                this.field1183 = 0;
            } else {
                this.field1183 = 2;
            }
        }
        if (this.field1207 == -1) {
            if (this.field1212 == null) {
                this.field1207 = 0;
            } else {
                this.field1207 = 2;
            }
        }
        if (arg0 != 99) {
            this.field1188 = null;
        }
    }
}
