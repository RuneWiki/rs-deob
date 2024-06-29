import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class303 {

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public int field4280 = 99;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public int field4291 = -1;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "Z")
    public boolean field4281 = false;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "Z")
    public boolean field4297 = false;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public int field4294 = -1;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public int field4289 = 2;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "Z")
    public boolean field4282 = false;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public int field4296 = -1;

    @OriginalMember(owner = "client!qp", name = "D", descriptor = "I")
    public int field4306 = -1;

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "I")
    public int field4304 = -1;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "Z")
    public boolean field4300 = false;

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
    public int field4307 = 5;

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
    public static int field4305 = 0;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "Leo;")
    public static class443 field4293 = new class443(4, 4);

    @OriginalMember(owner = "client!qp", name = "H", descriptor = "I")
    public static int field4310 = 0;

    @OriginalMember(owner = "client!qp", name = "G", descriptor = "Lrc;")
    public static class108 field4309 = new class108(47, 2);

    @OriginalMember(owner = "client!qp", name = "I", descriptor = "Z")
    public static boolean field4311;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public int field4288;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "Lvk;")
    public class276 field4299;

    @OriginalMember(owner = "client!qp", name = "F", descriptor = "Z")
    public static boolean field4308;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "[I")
    private int[] field4278;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "[I")
    public int[] field4283;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "[I")
    public int[] field4286;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "[Z")
    public boolean[] field4277;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "[[I")
    public int[][] field4292;

    static {
        new class151("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field4311 = true;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILn;BIIBII)Ln;", line = 4)
    public final class468 method1945(int arg0, class468 arg1, byte arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        int var9 = -75 / ((arg5 - 23) / 60);
        field4303++;
        int var10 = this.field4283[arg6];
        int var11 = this.field4286[arg6];
        class135 var12 = this.field4299.method1855(109, var11 >> 16);
        int var13 = var11 & 0xFFFF;
        if (var12 == null) {
            return arg1.method1600(arg2, arg0, true);
        }
        class135 var14 = null;
        if ((this.field4300 || class439.field6230) && arg7 != -1 && this.field4286.length > arg7) {
            int var15 = this.field4286[arg7];
            var14 = this.field4299.method1855(-127, var15 >> 16);
            arg7 = var15 & 0xFFFF;
        }
        if (this.field4281) {
            arg0 |= 0x200;
        }
        if (var12.method998(var13, (byte) -126)) {
            arg0 |= 0x80;
        }
        if (var12.method999(0, var13)) {
            arg0 |= 0x100;
        }
        if (var14 != null) {
            if (var14.method998(arg7, (byte) -128)) {
                arg0 |= 0x80;
            }
            if (var14.method999(0, arg7)) {
                arg0 |= 0x100;
            }
        }
        int var16 = arg0 | 0x20;
        class468 var17 = arg1.method1600(arg2, var16, true);
        var17.method2790(arg7, this.field4281, var13, var14, var10, -1, var12, arg3, arg4 - 1);
        return var17;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V", line = 60)
    public final void method1946(boolean arg0) {
        if (this.field4296 == -1) {
            if (this.field4277 == null) {
                this.field4296 = 0;
            } else {
                this.field4296 = 2;
            }
        }
        if (!arg0) {
            this.method1945(66, (class468) null, (byte) -45, -89, -10, (byte) -5, -83, 85);
        }
        field4285++;
        if (this.field4291 != -1) {
            return;
        }
        if (this.field4277 == null) {
            this.field4291 = 0;
        } else {
            this.field4291 = 2;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 93)
    public static void method1947(int arg0) {
        field4309 = null;
        field4293 = null;
        if (arg0 != -17010) {
            method1947(89);
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V", line = 105)
    public static final void method1948(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class454.field6438 <= 0) {
            class243.field3527 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class390.field5397.length; var2++) {
                if (class390.field5397[var2].startsWith("--> ")) {
                    var1++;
                    if (class454.field6438 == var1) {
                        class243.field3527 = class390.field5397[var2].substring(4);
                        break;
                    }
                }
            }
        }
        field4295++;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILn;III)Ln;", line = 141)
    public final class468 method1949(int arg0, int arg1, class468 arg2, int arg3, int arg4, int arg5) {
        field4287++;
        int var7 = this.field4283[arg5];
        if (arg4 != 31431) {
            this.method1952((class161) null, 11);
        }
        int var8 = this.field4286[arg5];
        class135 var9 = this.field4299.method1855(-123, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method1600((byte) 1, arg3, true);
        }
        class135 var11 = null;
        if ((this.field4300 || class439.field6230) && arg0 != -1 && arg0 < this.field4286.length) {
            int var12 = this.field4286[arg0];
            var11 = this.field4299.method1855(121, var12 >> 16);
            arg0 = var12 & 0xFFFF;
        }
        class135 var13 = null;
        class135 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field4278 != null) {
            if (arg5 < this.field4278.length) {
                var15 = this.field4278[arg5];
                if (var15 != 65535) {
                    var13 = this.field4299.method1855(-116, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field4300 || class439.field6230) && arg0 != -1 && arg0 < this.field4278.length) {
                var16 = this.field4278[arg0];
                if (var16 != 65535) {
                    var14 = this.field4299.method1855(arg4 - 31333, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field4281) {
            arg3 |= 0x200;
        }
        if (var9.method998(var10, (byte) -128)) {
            arg3 |= 0x80;
        }
        if (var9.method999(0, var10)) {
            arg3 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method998(var15, (byte) -47)) {
                arg3 |= 0x80;
            }
            if (var13.method999(0, var15)) {
                arg3 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method998(arg0, (byte) -128)) {
                arg3 |= 0x80;
            }
            if (var11.method999(0, arg0)) {
                arg3 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method998(var16, (byte) 81)) {
                arg3 |= 0x80;
            }
            if (var14.method999(arg4 - 31431, var16)) {
                arg3 |= 0x100;
            }
        }
        int var17 = arg3 | 0x20;
        class468 var18 = arg2.method1600((byte) 1, var17, true);
        var18.method2790(arg0, this.field4281, var10, var11, var7, -1, var9, 0, arg1 - 1);
        if (var13 != null) {
            var18.method2790(var16, this.field4281, var15, var14, var7, -1, var13, 0, arg1 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIII)I", line = 264)
    public final int method1950(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -13533) {
            method1947(48);
        }
        field4290++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field4286[arg3];
        class135 var8 = null;
        class135 var9 = this.field4299.method1855(arg1 ^ 0xFFFFCB03, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field4300 || class439.field6230) && arg2 != -1 && this.field4286.length > arg2) {
            int var11 = this.field4286[arg2];
            var8 = this.field4299.method1855(arg1 + 13643, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field4281) {
            var5 |= 0x200;
        }
        if (var9.method998(var10, (byte) -23)) {
            var5 |= 0x80;
        }
        if (var9.method999(0, var10)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method998(var6, (byte) -126)) {
                var5 |= 0x80;
            }
            if (var8.method999(arg1 + 13533, var6)) {
                var5 |= 0x100;
            }
        }
        if (this.field4278 != null && arg0) {
            if (arg3 < this.field4278.length) {
                int var12 = this.field4278[arg3];
                if (var12 != 65535) {
                    class135 var13 = this.field4299.method1855(-121, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method998(var14, (byte) -126)) {
                            var5 |= 0x80;
                        }
                        if (var13.method999(0, var14)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field4300 || class439.field6230) && arg2 != -1 && arg2 < this.field4278.length) {
                int var15 = this.field4278[arg2];
                if (var15 != 65535) {
                    class135 var16 = this.field4299.method1855(-111, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method998(var17, (byte) 117)) {
                            var5 |= 0x80;
                        }
                        if (var16.method999(0, var17)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lkk;II)V", line = 372)
    private final void method1951(class161 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            int var4 = arg0.method1134(-16848);
            this.field4283 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4283[var5] = arg0.method1134(-16848);
            }
            this.field4286 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4286[var6] = arg0.method1134(-16848);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4286[var7] = (arg0.method1134(-16848) << 16) + this.field4286[var7];
            }
        } else if (arg1 == 2) {
            this.field4304 = arg0.method1134(-16848);
        } else if (arg1 == 3) {
            this.field4277 = new boolean[256];
            int var15 = arg0.method1172((byte) 26);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4277[arg0.method1172((byte) 46)] = true;
            }
        } else if (arg1 == 4) {
            this.field4297 = true;
        } else if (arg1 == 5) {
            this.field4307 = arg0.method1172((byte) -118);
        } else if (arg1 == 6) {
            this.field4294 = arg0.method1134(-16848);
        } else if (arg1 == 7) {
            this.field4306 = arg0.method1134(-16848);
        } else if (arg1 == 8) {
            this.field4280 = arg0.method1172((byte) 84);
        } else if (arg1 == 9) {
            this.field4296 = arg0.method1172((byte) 118);
        } else if (arg1 == 10) {
            this.field4291 = arg0.method1172((byte) -15);
        } else if (arg1 == 11) {
            this.field4289 = arg0.method1172((byte) -2);
        } else if (arg1 == 12) {
            int var8 = arg0.method1172((byte) -108);
            this.field4278 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4278[var9] = arg0.method1134(-16848);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field4278[var10] = (arg0.method1134(-16848) << 16) + this.field4278[var10];
            }
        } else if (arg1 == 13) {
            int var11 = arg0.method1134(-16848);
            this.field4292 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method1172((byte) -128);
                if (var13 > 0) {
                    this.field4292[var12] = new int[var13];
                    this.field4292[var12][0] = arg0.method1178((byte) 63);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field4292[var12][var14] = arg0.method1134(-16848);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field4281 = true;
        } else if (arg1 == 15) {
            this.field4300 = true;
        } else if (arg1 == 16) {
            this.field4282 = true;
        }
        field4301++;
        if (arg2 < 28) {
            this.field4289 = 18;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lkk;I)V", line = 570)
    public final void method1952(class161 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1172((byte) 127);
            if (var3 == 0) {
                field4279++;
                int var4 = -21 % ((66 - arg1) / 52);
                return;
            }
            this.method1951(arg0, var3, 53);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V", line = 591)
    public static final void method1953(byte arg0) {
        int var1 = 67 / ((-arg0 - 33) / 63);
        for (int var2 = 0; var2 < class24.field257; var2++) {
            int var3 = class193.field2873[var2];
            class361 var4 = class163.field2377[var3];
            if (var4 != null) {
                class53.method503(-119, var4.field4952.field400, var4);
            }
        }
        field4284++;
    }
}
