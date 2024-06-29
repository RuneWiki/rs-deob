import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RSGRNXCC")
public class class46 {

    @OriginalMember(owner = "client!RSGRNXCC", name = "a", descriptor = "Z")
    private boolean field1260 = true;

    @OriginalMember(owner = "client!RSGRNXCC", name = "f", descriptor = "I")
    public int field1265 = -1;

    @OriginalMember(owner = "client!RSGRNXCC", name = "g", descriptor = "Z")
    public boolean field1266 = false;

    @OriginalMember(owner = "client!RSGRNXCC", name = "h", descriptor = "Z")
    public boolean field1267 = true;

    @OriginalMember(owner = "client!RSGRNXCC", name = "b", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!RSGRNXCC", name = "e", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!RSGRNXCC", name = "i", descriptor = "I")
    public int field1268;

    @OriginalMember(owner = "client!RSGRNXCC", name = "j", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "client!RSGRNXCC", name = "k", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "client!RSGRNXCC", name = "l", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!RSGRNXCC", name = "m", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!RSGRNXCC", name = "n", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "client!RSGRNXCC", name = "d", descriptor = "Ljava/lang/String;")
    public String field1263;

    @OriginalMember(owner = "client!RSGRNXCC", name = "c", descriptor = "[LRSGRNXCC;")
    public static class46[] field1262;

    @OriginalMember(owner = "client!RSGRNXCC", name = "a", descriptor = "(ILMAARFNGV;)V")
    public static void method390(int arg0, class29 arg1) {
        class14 var2 = new class14(arg1.method332("flo.dat", null), true);
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1261 = var2.method219();
        if (field1262 == null) {
            field1262 = new class46[field1261];
        }
        for (int var4 = 0; var4 < field1261; var4++) {
            if (field1262[var4] == null) {
                field1262[var4] = new class46();
            }
            field1262[var4].method391(1016, var2);
        }
    }

    @OriginalMember(owner = "client!RSGRNXCC", name = "a", descriptor = "(ILEMWAMCXW;)V")
    public void method391(int arg0, class14 arg1) {
        if (arg0 != 1016) {
            this.field1260 = !this.field1260;
        }
        while (true) {
            int var3 = arg1.method217();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1264 = arg1.method221();
                this.method392(this.field1264, (byte) 7);
            } else if (var3 == 2) {
                this.field1265 = arg1.method217();
            } else if (var3 == 3) {
                this.field1266 = true;
            } else if (var3 == 5) {
                this.field1267 = false;
            } else if (var3 == 6) {
                this.field1263 = arg1.method224();
            } else if (var3 == 7) {
                int var4 = this.field1268;
                int var5 = this.field1269;
                int var6 = this.field1270;
                int var7 = this.field1271;
                int var8 = arg1.method221();
                this.method392(var8, (byte) 7);
                this.field1268 = var4;
                this.field1269 = var5;
                this.field1270 = var6;
                this.field1271 = var7;
                this.field1272 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!RSGRNXCC", name = "a", descriptor = "(IB)V")
    private void method392(int arg0, byte arg1) {
        if (arg0 == 16711935) {
            arg0 = 0;
        }
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (arg1 != 7) {
            return;
        }
        boolean var7 = false;
        double var8 = (double) (arg0 & 0xFF) / 256.0D;
        double var10 = var3;
        if (var5 < var3) {
            var10 = var5;
        }
        if (var8 < var10) {
            var10 = var8;
        }
        double var12 = var3;
        if (var5 > var3) {
            var12 = var5;
        }
        if (var8 > var12) {
            var12 = var8;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        double var18 = (var10 + var12) / 2.0D;
        if (var10 != var12) {
            if (var18 < 0.5D) {
                var16 = (var12 - var10) / (var10 + var12);
            }
            if (var18 >= 0.5D) {
                var16 = (var12 - var10) / (2.0D - var12 - var10);
            }
            if (var3 == var12) {
                var14 = (var5 - var8) / (var12 - var10);
            } else if (var5 == var12) {
                var14 = (var8 - var3) / (var12 - var10) + 2.0D;
            } else if (var8 == var12) {
                var14 = (var3 - var5) / (var12 - var10) + 4.0D;
            }
        }
        double var20 = var14 / 6.0D;
        this.field1268 = (int) (var20 * 256.0D);
        this.field1269 = (int) (var16 * 256.0D);
        this.field1270 = (int) (var18 * 256.0D);
        if (this.field1269 < 0) {
            this.field1269 = 0;
        } else if (this.field1269 > 255) {
            this.field1269 = 255;
        }
        if (this.field1270 < 0) {
            this.field1270 = 0;
        } else if (this.field1270 > 255) {
            this.field1270 = 255;
        }
        if (var18 > 0.5D) {
            this.field1272 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field1272 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field1272 < 1) {
            this.field1272 = 1;
        }
        this.field1271 = (int) ((double) this.field1272 * var20);
        int var22 = this.field1268 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1269 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field1270 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field1273 = this.method393(var22, var23, var24);
    }

    @OriginalMember(owner = "client!RSGRNXCC", name = "a", descriptor = "(III)I")
    private final int method393(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }
}
