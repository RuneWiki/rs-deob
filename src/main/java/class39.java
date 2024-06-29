import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class39 {

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Lhc;")
    private class212 field609 = new class212(256);

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Lhc;")
    private class212 field613 = new class212(256);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Lu;")
    private class111 field601;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Lu;")
    private class111 field606;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field602 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "Lja;")
    public static class55 field614;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "[I")
    public static int[] field612;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[II)Lci;")
    private final class224 method192(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = (arg0 << 4 & 0xFFF9 | arg0 >>> 12) ^ arg1;
        field600++;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class224 var9 = (class224) this.field613.method1453(var7, 1);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class117 var10 = class117.method852(this.field606, arg0, arg1);
            if (arg3 != 0) {
                return null;
            } else if (var10 == null) {
                return null;
            } else {
                class224 var11 = var10.method853();
                this.field613.method1447(-120, var7, var11);
                if (arg2 != null) {
                    arg2[0] -= var11.field3943.length;
                }
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIB)I")
    public static final int method193(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 53) {
            return 120;
        }
        field603++;
        if (arg0 > 243) {
            arg1 >>= 0x4;
        } else if (arg0 > 217) {
            arg1 >>= 0x3;
        } else if (arg0 > 192) {
            arg1 >>= 0x2;
        } else if (arg0 > 179) {
            arg1 >>= 0x1;
        }
        return (arg0 >> 1) + (arg1 >> 5 << 7) + (arg2 >> 2 << 10);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method194(int arg0) {
        field614 = null;
        field612 = null;
        if (arg0 == 7759) {
            field602 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[II)Lci;")
    public final class224 method195(int arg0, int[] arg1, int arg2) {
        field611++;
        if (this.field601.method818((byte) -81) == 1) {
            return this.method200(arg1, arg0 ^ 0xFFFFAA0A, arg2, 0);
        } else if (~this.field601.method821(false, arg2) == arg0) {
            return this.method200(arg1, 22004, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([III)Lci;")
    public final class224 method196(int[] arg0, int arg1, int arg2) {
        if (arg2 != -769) {
            return null;
        }
        field608++;
        if (this.field606.method818((byte) 41) == 1) {
            return this.method192(0, arg1, arg0, arg2 + 769);
        } else if (this.field606.method821(false, arg1) == 1) {
            return this.method192(arg1, 0, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Lei;")
    public static final class162 method197(int arg0, int arg1, int arg2) {
        class97 var3 = class27.field395[arg0][arg1][arg2];
        return var3 == null || var3.field1614 == null ? null : var3.field1614;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lrb;I)V")
    public static final void method198(class247 arg0, int arg1) {
        field605++;
        arg0.field4314 = arg0.field4304;
        if (arg0.field4347 == 0) {
            arg0.field4296 = 0;
            return;
        }
        if (arg0.field4344 != -1 && arg0.field4321 == 0) {
            class151 var2 = class72.method501(arg0.field4344, (byte) 40);
            if (arg0.field4279 > 0 && var2.field2524 == 0) {
                arg0.field4296++;
                return;
            }
            if (arg0.field4279 <= 0 && var2.field2515 == 0) {
                arg0.field4296++;
                return;
            }
        }
        int var3 = arg0.field4348;
        int var4 = arg0.field4343[arg0.field4347 - 1] * 128 + arg0.field4345 * 64;
        int var5 = arg0.field4319;
        int var6 = arg0.field4336[arg0.field4347 - 1] * 128 + (arg0.field4345 * 64);
        if ((var4 - var5) > 256 || var4 - var5 < -256 || (var6 - var3) > 256 || (var6 - var3) < -256) {
            arg0.field4319 = var4;
            arg0.field4348 = var6;
            return;
        }
        if (var4 <= var5) {
            if (var4 < var5) {
                if (var6 > var3) {
                    arg0.field4294 = 768;
                } else if (var6 >= var3) {
                    arg0.field4294 = 512;
                } else {
                    arg0.field4294 = 256;
                }
            } else if (var6 > var3) {
                arg0.field4294 = 1024;
            } else if (var3 > var6) {
                arg0.field4294 = 0;
            }
        } else if (var6 > var3) {
            arg0.field4294 = 1280;
        } else if (var6 >= var3) {
            arg0.field4294 = 1536;
        } else {
            arg0.field4294 = 1792;
        }
        int var7 = arg0.field4294 - arg0.field4326 & 0x7FF;
        int var8 = arg0.field4287;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field4298;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field4341;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field4312;
        }
        if (var8 == -1) {
            var8 = arg0.field4298;
        }
        arg0.field4314 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class83) {
            var10 = ((class83) arg0).field1392.field161;
        }
        if (var10) {
            if (arg0.field4326 != arg0.field4294 && arg0.field4355 == -1 && arg0.field4307 != 0) {
                var9 = 2;
            }
            if (arg0.field4347 > 2) {
                var9 = 6;
            }
            if (arg0.field4347 > 3) {
                var9 = 8;
            }
            if (arg0.field4296 > 0 && arg0.field4347 > 1) {
                arg0.field4296--;
                var9 = 8;
            }
        } else {
            if (arg0.field4347 > 1) {
                var9 = 6;
            }
            if (arg0.field4347 > 2) {
                var9 = 8;
            }
            if (arg0.field4296 > 0 && arg0.field4347 > 1) {
                var9 = 8;
                arg0.field4296--;
            }
        }
        if (arg0.field4349[arg0.field4347 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field4314 == arg0.field4298 && arg0.field4354 != -1) {
            arg0.field4314 = arg0.field4354;
        }
        if (var4 > var5) {
            arg0.field4319 += var9;
            if (var4 < arg0.field4319) {
                arg0.field4319 = var4;
            }
        } else if (var4 < var5) {
            arg0.field4319 -= var9;
            if (arg0.field4319 < var4) {
                arg0.field4319 = var4;
            }
        }
        if (var3 < var6) {
            arg0.field4348 += var9;
            if (var6 < arg0.field4348) {
                arg0.field4348 = var6;
            }
        } else if (var3 > var6) {
            arg0.field4348 -= var9;
            if (arg0.field4348 < var6) {
                arg0.field4348 = var6;
            }
        }
        if (arg0.field4319 == var4 && arg0.field4348 == var6) {
            arg0.field4347--;
            if (arg0.field4279 > 0) {
                arg0.field4279--;
            }
        }
        if (arg1 != 8) {
            method198((class247) null, -37);
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lu;Lu;)V")
    public class39(class111 arg0, class111 arg1) {
        this.field601 = arg1;
        this.field606 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
    public static final void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            return;
        }
        if (arg0 >= arg2) {
            class242.method1660((byte) -79, class80.field1324[arg1], arg3, arg0, arg2);
        } else {
            class242.method1660((byte) -79, class80.field1324[arg1], arg3, arg2, arg0);
        }
        field607++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIII)Lci;")
    private final class224 method200(int[] arg0, int arg1, int arg2, int arg3) {
        field610++;
        int var5 = (arg3 << 4 & 0xFFFE | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class224 var9 = (class224) this.field613.method1453(var7, 1);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class250 var10 = (class250) this.field609.method1453(var7, 1);
            if (var10 == null) {
                var10 = class250.method1705(this.field601, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field609.method1447(31, var7, var10);
            }
            class224 var11 = var10.method1696(arg0);
            if (var11 == null) {
                return null;
            }
            if (arg1 != 22004) {
                this.method192(127, 79, (int[]) null, 74);
            }
            var10.method764((byte) -58);
            this.field613.method1447(arg1 - 22105, var7, var11);
            return var11;
        } else {
            return null;
        }
    }
}
