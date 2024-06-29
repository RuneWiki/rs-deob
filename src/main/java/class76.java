import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class76 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public int field1186 = -1;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
    public boolean field1187 = false;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public int field1196 = -1;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Z")
    public boolean field1200 = false;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public int field1202 = 2;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public int field1204 = -1;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public int field1197 = -1;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Z")
    public boolean field1201 = false;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public int field1198 = 99;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public int field1214 = 5;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    public int field1212 = -1;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
    public boolean field1190 = false;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "[I")
    public static int[] field1188 = new int[100];

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[I")
    public static int[] field1192 = new int[14];

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field1193 = 0;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[I")
    public int[] field1191;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "[I")
    public int[] field1194;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "[I")
    private int[] field1199;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "[Z")
    public boolean[] field1209;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "[[I")
    public int[][] field1189;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public final void method564(int arg0) {
        if (this.field1212 == -1) {
            if (this.field1209 == null) {
                this.field1212 = 0;
            } else {
                this.field1212 = 2;
            }
        }
        field1210++;
        if (this.field1204 != arg0) {
            return;
        }
        if (this.field1209 == null) {
            this.field1204 = 0;
        } else {
            this.field1204 = 2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method565(byte arg0) {
        field1192 = null;
        field1188 = null;
        if (arg0 != 127) {
            method567(-5, 62);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BJ)V")
    public static final void method566(byte arg0, long arg1) {
        field1213++;
        if (!class299.field4829) {
            class180.field2705 += (float) arg1 * class270.field4376 / 40.0F;
            class102.field1736 += (float) arg1 * class280.field4521 / 40.0F;
        }
        int var3 = class119.field1928 + class213.field3139.field3753;
        if (arg0 <= 77) {
            return;
        }
        int var4 = class213.field3139.field3660 + class107.field1826;
        if (class160.field2487 - var4 < -500 || class160.field2487 - var4 > 500 || (class276.field4466 - var3) < -500 || class276.field4466 - var3 > 500) {
            class276.field4466 = var3;
            class160.field2487 = var4;
        }
        if (class160.field2487 != var4) {
            int var5 = var4 - class160.field2487;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class160.field2487 += var6;
        }
        if (class276.field4466 != var3) {
            int var7 = var3 - class276.field4466;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class276.field4466 += var8;
        }
        class74.method555(-1);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lng;")
    public static final class137 method567(int arg0, int arg1) {
        field1216++;
        class137 var2 = (class137) class35.field446.method2099((byte) 125, (long) arg0);
        if (arg1 != -2882) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class78.field1239.method1868(class306.method2075(arg1 + 2965, arg0), class229.method1594(arg0, -70), arg1 ^ 0xFFFFF4BF);
            class137 var4 = new class137();
            if (var3 != null) {
                var4.method1038(-12916, new class53(var3));
            }
            class35.field446.method2103(var4, -1, (long) arg0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIBLmg;)Lmg;")
    public final class58 method568(int arg0, int arg1, int arg2, byte arg3, class58 arg4) {
        field1211++;
        int var6 = this.field1194[arg0];
        int var7 = this.field1191[arg0];
        class114 var8 = class86.method636(-3, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method419(true, true, true);
        } else if (arg3 == 18) {
            class114 var10 = null;
            if ((this.field1201 || class279.field4487) && arg2 != -1 && this.field1191.length > arg2) {
                int var11 = this.field1191[arg2];
                var10 = class86.method636(arg3 ^ 0xFFFFFFEF, var11 >> 16);
                arg2 = var11 & 0xFFFF;
            }
            class58 var12;
            if (var10 == null) {
                var12 = arg4.method419(!var8.method854((byte) -119, var9), !var8.method858((byte) 104, var9), !this.field1187);
            } else {
                var12 = arg4.method419(!var8.method854((byte) -120, var9) & !var10.method854((byte) -123, arg2), !var8.method858((byte) 104, var9) & !var10.method858((byte) 104, arg2), !this.field1187);
            }
            var12.method426(var8, var9, var10, arg2, arg1 - 1, var6, this.field1187);
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
    public static final void method569(int arg0, int arg1, int arg2) {
        int var3 = -122 % ((arg2 - 8) / 58);
        if (class119.field1931 == 2) {
            class268.field4303 = arg0;
            class115.field1906 = arg1;
        }
        class102.field1736 = (float) arg0;
        class180.field2705 = (float) arg1;
        class74.method555(-1);
        field1195++;
        class180.field2709 = true;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BIILmg;I)Lmg;")
    public final class58 method570(byte arg0, int arg1, int arg2, class58 arg3, int arg4) {
        field1205++;
        int var6 = this.field1191[arg4];
        int var7 = this.field1194[arg4];
        class114 var8 = class86.method636(-3, var6 >> 16);
        int var9 = var6 & 0xFFFF;
        if (var8 == null) {
            return arg3.method412(true, true, true);
        }
        class114 var10 = null;
        int var11 = 0;
        class114 var12 = null;
        class114 var13 = null;
        if ((this.field1201 || class279.field4487) && arg2 != -1 && this.field1191.length > arg2) {
            int var14 = this.field1191[arg2];
            var13 = class86.method636(-3, var14 >> 16);
            arg2 = var14 & 0xFFFF;
        }
        int var15 = 0;
        int var16 = -9 / ((arg0 + 58) / 62);
        if (this.field1199 != null) {
            if (arg4 < this.field1199.length) {
                var11 = this.field1199[arg4];
                if (var11 != 65535) {
                    var10 = class86.method636(-3, var11 >> 16);
                    var11 &= 0xFFFF;
                }
            }
            if ((this.field1201 || class279.field4487) && arg2 != -1 && this.field1199.length > arg2) {
                var15 = this.field1199[arg2];
                if (var15 != 65535) {
                    var12 = class86.method636(-3, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var17 = !var8.method854((byte) -127, var9);
        boolean var18 = !var8.method858((byte) 104, var9);
        if (var10 != null) {
            var17 &= !var10.method854((byte) -121, var11);
            var18 &= !var10.method858((byte) 104, var11);
        }
        if (var13 != null) {
            var17 &= !var13.method854((byte) -118, arg2);
            var18 &= !var13.method858((byte) 104, arg2);
        }
        if (var12 != null) {
            var17 &= !var12.method854((byte) -126, var15);
            var18 &= !var12.method858((byte) 104, var15);
        }
        class58 var19 = arg3.method412(var17, var18, !this.field1187);
        var19.method426(var8, var9, var13, arg2, arg1 - 1, var7, this.field1187);
        if (var10 != null) {
            var19.method426(var10, var11, var12, var15, arg1 - 1, var7, this.field1187);
        }
        return var19;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V")
    public static final void method571(int arg0, byte arg1) {
        class279 var2 = class111.method844(arg0, 12, -1780180960);
        if (arg1 >= 16) {
            var2.method1934((byte) -114);
            field1203++;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lhc;I)V")
    public final void method572(class53 arg0, int arg1) {
        field1215++;
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var3 = arg0.method366(-16505);
            if (var3 == 0) {
                return;
            }
            this.method574(arg0, var3, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lmg;IIIII)Lmg;")
    public final class58 method573(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1217++;
        int var7 = this.field1194[arg1];
        int var8 = this.field1191[arg1];
        class114 var9 = class86.method636(-3, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method428(true, true, true);
        }
        int var11 = arg3 & 0x3;
        class114 var12 = null;
        if ((this.field1201 || class279.field4487) && arg5 != -1 && arg5 < this.field1191.length) {
            int var13 = this.field1191[arg5];
            var12 = class86.method636(-3, var13 >> 16);
            arg5 = var13 & 0xFFFF;
        }
        class58 var14;
        if (var12 == null) {
            var14 = arg0.method428(!var9.method854((byte) -121, var10), !var9.method858((byte) 104, var10), !this.field1187);
        } else {
            var14 = arg0.method428(!var9.method854((byte) -124, var10) & !var12.method854((byte) -121, arg5), !var9.method858((byte) 104, var10) & !var12.method858((byte) 104, arg5), !this.field1187);
        }
        if (var11 == 1) {
            var14.method406();
        } else if (var11 == 2) {
            var14.method432();
        } else if (var11 == 3) {
            var14.method418();
        }
        if (arg4 > -65) {
            method567(-118, -45);
        }
        var14.method426(var9, var10, var12, arg5, arg2 - 1, var7, this.field1187);
        if (var11 == 1) {
            var14.method418();
        } else if (var11 == 2) {
            var14.method432();
        } else if (var11 == 3) {
            var14.method406();
        }
        return var14;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lhc;IB)V")
    private final void method574(class53 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            int var4 = arg0.method331(-7);
            this.field1194 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1194[var5] = arg0.method331(-61);
            }
            this.field1191 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1191[var6] = arg0.method331(-116);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1191[var7] = (arg0.method331(-42) << 16) + this.field1191[var7];
            }
        } else if (arg1 == 2) {
            this.field1186 = arg0.method331(arg2 ^ 0x3E);
        } else if (arg1 == 3) {
            this.field1209 = new boolean[256];
            int var8 = arg0.method366(arg2 - 16468);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1209[arg0.method366(-16505)] = true;
            }
        } else if (arg1 == 4) {
            this.field1200 = true;
        } else if (arg1 == 5) {
            this.field1214 = arg0.method366(-16505);
        } else if (arg1 == 6) {
            this.field1197 = arg0.method331(-116);
        } else if (arg1 == 7) {
            this.field1196 = arg0.method331(-14);
        } else if (arg1 == 8) {
            this.field1198 = arg0.method366(-16505);
        } else if (arg1 == 9) {
            this.field1212 = arg0.method366(-16505);
        } else if (arg1 == 10) {
            this.field1204 = arg0.method366(-16505);
        } else if (arg1 == 11) {
            this.field1202 = arg0.method366(-16505);
        } else if (arg1 == 12) {
            int var14 = arg0.method366(-16505);
            this.field1199 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field1199[var15] = arg0.method331(class224.method1553(arg2, 46));
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field1199[var16] += arg0.method331(-42) << 16;
            }
        } else if (arg1 == 13) {
            int var10 = arg0.method331(-4);
            this.field1189 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method366(-16505);
                if (var12 > 0) {
                    this.field1189[var11] = new int[var12];
                    this.field1189[var11][0] = arg0.method362(-4);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field1189[var11][var13] = arg0.method331(-74);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field1187 = true;
        } else if (arg1 == 15) {
            this.field1201 = true;
        } else if (arg1 == 16) {
            this.field1190 = true;
        }
        field1206++;
        if (arg2 != -37) {
            this.field1209 = null;
        }
    }
}
