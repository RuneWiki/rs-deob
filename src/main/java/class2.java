import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class2 {

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    private int field11 = 0;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "Z")
    public boolean field19 = true;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public int field8 = 128;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public int field7 = -1;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
    public static final void method8(int arg0, int arg1) {
        field12++;
        if (arg0 <= -74) {
            class436 var2 = class459.method2712(16, arg1, -1759243680);
            var2.method2567(16013);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILbt;)V")
    public final void method9(int arg0, class88 arg1) {
        field9++;
        while (true) {
            int var3 = arg1.method617(arg0 + 2);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    this.field8 = -82;
                    return;
                }
            }
            this.method11(var3, arg0 ^ 0x13A, arg1);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIII)I")
    public static final int method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field13++;
        if (class92.field1285 == null) {
            return 0;
        }
        if (arg0 < 3) {
            label102: {
                int var6 = arg5 >> 7;
                int var7 = arg3 >> 7;
                if (arg1 >= 0 && arg2 >= 0 && arg1 <= class200.field2594 - 1 && class118.field1647 - 1 >= arg2) {
                    if (var6 >= 1 && var7 >= 1 && var6 <= (class200.field2594 - 1) && class118.field1647 - 1 >= var7) {
                        boolean var8 = (class8.field76[1][arg5 >> 7][arg3 >> 7] & 0x2) != 0;
                        if ((arg5 & 0x7F) == 0) {
                            boolean var9 = (class8.field76[1][var6 - 1][arg3 >> 7] & 0x2) != 0;
                            boolean var10 = (class8.field76[1][var6][arg3 >> 7] & 0x2) != 0;
                            if (var10 != var9) {
                                var8 = (class8.field76[1][arg1][arg2] & 0x2) != 0;
                            }
                        }
                        if ((arg3 & 0x7F) == 0) {
                            boolean var11 = (class8.field76[1][arg5 >> 7][var7 - 1] & 0x2) != 0;
                            boolean var12 = (class8.field76[1][arg5 >> 7][var7] & 0x2) != 0;
                            if (var11 != var12) {
                                var8 = (class8.field76[1][arg1][arg2] & 0x2) != 0;
                            }
                        }
                        if (var8) {
                            arg0++;
                        }
                        break label102;
                    }
                    return 0;
                }
                return 0;
            }
        }
        if (arg4 != 28783) {
            method8(51, 70);
        }
        return class92.field1285[arg0].method1185(arg5, arg3);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILbt;)V")
    private final void method11(int arg0, int arg1, class88 arg2) {
        if (arg1 != 314) {
            this.field11 = 127;
        }
        if (arg0 == 1) {
            this.field11 = arg2.method584(255);
            this.method12(-48, this.field11);
        } else if (arg0 == 2) {
            this.field7 = arg2.method568((byte) 110);
            if (this.field7 == 65535) {
                this.field7 = -1;
            }
        } else if (arg0 == 3) {
            this.field8 = arg2.method568((byte) 110) << 0;
        } else if (arg0 == 4) {
            this.field19 = false;
        }
        field15++;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(II)V")
    private final void method12(int arg0, int arg1) {
        field16++;
        double var3 = (double) ((arg1 & 0xFF95EF) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF7D) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        if (arg0 >= -45) {
            this.field19 = true;
        }
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
        this.field18 = (int) (var17 * 256.0D);
        this.field17 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field17 < 0) {
            this.field17 = 0;
        } else if (this.field17 > 255) {
            this.field17 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field14 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field14 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field18 < 0) {
            this.field18 = 0;
        } else if (this.field18 > 255) {
            this.field18 = 255;
        }
        if (this.field14 < 1) {
            this.field14 = 1;
        }
        this.field10 = (int) ((double) this.field14 * var19);
    }
}
