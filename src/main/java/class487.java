import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class487 {

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public int field7194 = -1;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "Z")
    public boolean field7197 = true;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    private int field7203 = 0;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
    public int field7208 = 128;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field7193 = 0;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "Lki;")
    public static class498 field7195 = new class498(68, 4);

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public static int field7205 = 0;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    public int field7200;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public int field7201;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    public int field7206;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    public int field7207;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILvg;)Ljava/lang/String;")
    public static final String method2889(int arg0, class38 arg1) {
        field7198++;
        if (client.method1328(arg1).method2361((byte) 84) == 0) {
            return null;
        }
        if (arg0 != 3644) {
            method2889(8, null);
        }
        if (arg1.field439 == null || arg1.field439.trim().length() == 0) {
            return class187.field2783 ? "Hidden-use" : null;
        } else {
            return arg1.field439;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)V")
    private final void method2890(int arg0, int arg1) {
        field7196++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF7F) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (arg0 != -21149) {
            return;
        }
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
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
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field7207 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field7200 = (int) (var17 * 256.0D);
        if (this.field7207 < 0) {
            this.field7207 = 0;
        } else if (this.field7207 > 255) {
            this.field7207 = 255;
        }
        if (this.field7200 < 0) {
            this.field7200 = 0;
        } else if (this.field7200 > 255) {
            this.field7200 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field7201 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field7201 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field7201 < 1) {
            this.field7201 = 1;
        }
        this.field7206 = (int) ((double) this.field7201 * var19);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILdh;B)V")
    private final void method2891(int arg0, class209 arg1, byte arg2) {
        if (arg2 <= 52) {
            this.method2890(-78, -6);
        }
        field7202++;
        if (arg0 == 1) {
            this.field7203 = arg1.method1458((byte) -10);
            this.method2890(-21149, this.field7203);
        } else if (arg0 == 2) {
            this.field7194 = arg1.method1450((byte) 50);
            if (this.field7194 != 65535) {
                return;
            }
            this.field7194 = -1;
        } else if (arg0 == 3) {
            this.field7208 = arg1.method1450((byte) 81) << 0;
            return;
        } else if (arg0 == 4) {
            this.field7197 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIBI)Z")
    public static final boolean method2892(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field7204++;
        if (arg4 <= 68) {
            method2894(94);
        }
        for (int var6 = arg1; var6 <= arg5; var6++) {
            for (int var7 = arg2; var7 <= arg3; var7++) {
                if (class397.field5963[var6][var7] == arg0 && class468.field6902[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ILdh;)V")
    public final void method2893(int arg0, class209 arg1) {
        while (true) {
            int var3 = arg1.method1428(32122);
            if (var3 == 0) {
                field7199++;
                if (arg0 <= 106) {
                    this.method2890(-101, -52);
                    return;
                }
                return;
            }
            this.method2891(var3, arg1, (byte) 72);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public static void method2894(int arg0) {
        field7195 = null;
        if (arg0 != 256) {
            field7195 = null;
        }
    }
}
