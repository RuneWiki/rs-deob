import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class666 implements class137 {

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "Lib;")
    public static class1 field9451 = new class1(true);

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "Ltm;")
    public static class334 field9461 = new class334(81, -2);

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public int field9446;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public int field9448;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public int field9449;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public static int field9450;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    public static int field9453;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public int field9454;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    public int field9458;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public int field9460;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "Lla;")
    public static class422 field9462;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "Z")
    public boolean field9455;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "[I")
    public static int[] field9464;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "[Lbg;")
    public static class328[] field9463;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 4)
    public static final int method3732(boolean arg0, String arg1) {
        field9452++;
        if (arg0) {
            return -6;
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) - (var3 - arg1.charAt(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Leq;B)Z", line = 28)
    public final boolean method1089(class137 arg0, byte arg1) {
        field9447++;
        if (!(arg0 instanceof class666)) {
            return false;
        } else if (arg1 > -116) {
            return false;
        } else {
            class666 var3 = (class666) arg0;
            if (this.field9460 != var3.field9460) {
                return false;
            } else if (this.field9449 != var3.field9449) {
                return false;
            } else if (this.field9458 != var3.field9458) {
                return false;
            } else if (this.field9448 != var3.field9448) {
                return false;
            } else if (this.field9446 != var3.field9446) {
                return false;
            } else if (this.field9454 == var3.field9454) {
                return this.field9455 == var3.field9455;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V", line = 70)
    public static void method3733(boolean arg0) {
        field9451 = null;
        field9462 = null;
        field9461 = null;
        field9463 = null;
        field9464 = null;
        if (!arg0) {
            field9451 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)I", line = 84)
    public static final int method3734(byte arg0, int arg1) {
        if (arg0 < 84) {
            return -36;
        } else {
            field9453++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)Lhs;", line = 97)
    public static final class358 method3735(int arg0) {
        field9456++;
        class327 var1 = null;
        class358 var2 = new class358(class519.field7498, 0);
        try {
            class162 var3 = class706.field9962.method4056((byte) 121, true, "");
            if (arg0 != 10178) {
                method3734((byte) 85, 127);
            }
            while (var3.field2512 == 0) {
                class484.method2932(true, 1L);
            }
            if (var3.field2512 == 1) {
                var1 = (class327) var3.field2517;
                byte[] var4 = new byte[(int) var1.method2113(-1)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method2109(var4.length - var5, (byte) 92, var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class358(new class301(var4), class519.field7498, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method2110((byte) 52);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)J", line = 156)
    public final long method1088(int arg0) {
        field9457++;
        long[] var2 = class285.field4388;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field9460 ^ var3) & 0xFFL)];
        long var7 = var2[(int) ((var5 ^ (long) (this.field9449 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        if (arg0 < 86) {
            method3736(false, -61, -57, -96, -108, 64);
        }
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field9449 ^ var7) & 0xFFL)];
        long var11 = var2[(int) ((var9 ^ (long) (this.field9458 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field9458 >> 16)) & 0xFFL)];
        long var15 = var2[(int) (((long) (this.field9458 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) (((long) this.field9458 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) (((long) this.field9448 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field9446 >> 24) ^ var19) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field9446 >> 16) ^ var21) & 0xFFL)];
        long var25 = var2[(int) ((var23 ^ (long) (this.field9446 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) (((long) this.field9446 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field9454) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) (((long) (this.field9455 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZIIIII)V", line = 190)
    public static final void method3736(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9450++;
        long var6 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg4);
        class33 var8 = (class33) class379.field5696.method3512(true, var6);
        if (var8 == null) {
            var8 = new class33();
            class379.field5696.method3516(255, var6, var8);
        }
        if (arg3 > -26) {
            method3735(105);
        }
        if (var8.field311.length <= arg1) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; var11 < var8.field311.length; var11++) {
                var9[var11] = var8.field311[var11];
                var10[var11] = var8.field310[var11];
            }
            for (int var12 = var8.field311.length; var12 < arg1; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field311 = var9;
            var8.field310 = var10;
        }
        var8.field311[arg1] = arg2;
        var8.field310[arg1] = arg5;
    }
}
