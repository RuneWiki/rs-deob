import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class253 {

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    private int field3259 = 0;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Z")
    public boolean field3257 = true;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public int field3265 = -1;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public int field3266 = 512;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Lcga;")
    public static class449 field3269 = new class449(61, 2);

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public int field3261;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public int field3264;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1523(int arg0) {
        if (arg0 != 2) {
            method1527((byte) -7, null, null, null);
        }
        field3270++;
        if (class211.field2491 != null) {
            class211.field2491.method3623((byte) -121);
            class211.field2491 = null;
            class176.field2066 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBLji;)V", line = 25)
    private final void method1524(int arg0, byte arg1, class572 arg2) {
        if (arg0 == 1) {
            this.field3259 = arg2.method3059(1);
            this.method1526(this.field3259, (byte) -38);
        } else if (arg0 == 2) {
            this.field3265 = arg2.method3031(-1);
            if (this.field3265 == 65535) {
                this.field3265 = -1;
            }
        } else if (arg0 == 3) {
            this.field3266 = arg2.method3031(-1) << 2;
        } else if (arg0 == 4) {
            this.field3257 = false;
        }
        if (arg1 != 35) {
            this.method1526(89, (byte) 66);
        }
        field3260++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)Z", line = 67)
    public static final boolean method1525(int arg0, int arg1, byte arg2) {
        field3262++;
        if (arg2 <= 98) {
            field3268 = -100;
        }
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)V", line = 78)
    private final void method1526(int arg0, byte arg1) {
        field3271++;
        double var3 = (double) ((arg0 & 0xFFBF1A) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        if (arg1 != -38) {
            this.method1526(-103, (byte) 68);
        }
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field3264 = (int) (var15 * 256.0D);
        this.field3261 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field3261 < 0) {
            this.field3261 = 0;
        } else if (this.field3261 > 255) {
            this.field3261 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field3272 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3272 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3264 < 0) {
            this.field3264 = 0;
        } else if (this.field3264 > 255) {
            this.field3264 = 255;
        }
        if (this.field3272 < 1) {
            this.field3272 = 1;
        }
        this.field3267 = (int) ((double) this.field3272 * var19);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLpfa;Lpfa;[I)V", line = 173)
    public static final void method1527(byte arg0, class275 arg1, class275 arg2, int[] arg3) {
        class608.field8288 = arg1;
        if (arg3 != null) {
            class391.field5010 = arg3;
        }
        field3263++;
        class578.field7760 = arg2;
        int var4 = 15 / ((arg0 + 51) / 61);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 187)
    public static void method1528(byte arg0) {
        if (arg0 != 88) {
            field3268 = 12;
        }
        field3269 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lji;I)V", line = 198)
    public final void method1529(class572 arg0, int arg1) {
        if (arg1 != 16793) {
            return;
        }
        while (true) {
            int var3 = arg0.method3097((byte) 12);
            if (var3 == 0) {
                field3256++;
                return;
            }
            this.method1524(var3, (byte) 35, arg0);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZILjava/lang/String;)I", line = 230)
    public static final int method1530(int arg0, boolean arg1, int arg2, String arg3) {
        field3258++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (arg0 != 8042) {
            return -116;
        }
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg2 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }
}
