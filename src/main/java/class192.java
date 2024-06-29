import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class192 extends class176 {

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public int field3701 = 0;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public int field3700 = -1;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public int field3702 = -1;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Z")
    public boolean field3703 = true;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    public static final void method1266(byte arg0) {
        if (arg0 != 89) {
            method1266((byte) 15);
        }
        field3707++;
        class187.field3622.method1385(9946);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IB)V")
    public static final void method1267(int arg0, byte arg1) {
        if (arg0 == -1 && !class118.field2305) {
            class187.method1245(-38);
        } else if (arg0 != -1 && (class182.field3579 != arg0 || !class92.method630(arg1 + 15620)) && class14.field263 != 0 && !class118.field2305) {
            class196.method1324(arg0, class159.field3067, false, class14.field263, 0, arg1 - 114, 2);
        }
        field3706++;
        class182.field3579 = arg0;
        if (arg1 == 114) {
            ;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)Lra;")
    public static final class170 method1268(int arg0, int arg1) {
        if (arg1 > -42) {
            return null;
        }
        field3699++;
        int var2 = arg0 & 0xFFFF;
        int var3 = arg0 >> 16;
        if (class224.field4232[var3] == null || class224.field4232[var3][var2] == null) {
            boolean var4 = class66.method443(true, var3);
            if (!var4) {
                return null;
            }
        }
        return class224.field4232[var3][var2];
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BILog;)V")
    public final void method1269(byte arg0, int arg1, class146 arg2) {
        field3705++;
        while (true) {
            int var4 = arg2.method991(arg0 ^ 0xFFFFFF1B);
            if (var4 == 0) {
                if (arg0 == -28) {
                    return;
                } else {
                    method1268(-93, -60);
                    return;
                }
            }
            this.method1271(arg2, arg1, var4, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)I")
    private final int method1270(int arg0, int arg1) {
        field3708++;
        if (arg1 == 16711935) {
            return -1;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (arg0 > -114) {
            return 51;
        }
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = 0.0D;
        double var13 = var3;
        double var15 = 0.0D;
        if (var3 < var5) {
            var13 = var5;
        }
        if (var13 < var7) {
            var13 = var7;
        }
        double var17 = (var9 + var13) / 2.0D;
        if (var9 != var13) {
            if (var3 == var13) {
                var15 = (var5 - var7) / (-var9 + var13);
            } else if (var5 == var13) {
                var15 = (var7 - var3) / (var13 - var9) + 2.0D;
            } else if (var7 == var13) {
                var15 = (var3 - var5) / (-var9 + var13) + 4.0D;
            }
            if (var17 < 0.5D) {
                var11 = (var13 - var9) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var11 = (var13 - var9) / (-var13 + 2.0D + -var9);
            }
        }
        double var19 = var15 / 6.0D;
        int var21 = (int) (var17 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var11 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var21 > 243) {
            var22 >>= 0x4;
        } else if (var21 > 217) {
            var22 >>= 0x3;
        } else if (var21 > 192) {
            var22 >>= 0x2;
        } else if (var21 > 179) {
            var22 >>= 0x1;
        }
        int var23 = (int) (var19 * 256.0D);
        return (var23 >> 2 << 10) + (var22 >> 5 << 7) + (var21 >> 1);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Log;IIB)V")
    private final void method1271(class146 arg0, int arg1, int arg2, byte arg3) {
        field3704++;
        if (arg3 != 63) {
            return;
        }
        if (arg2 == 1) {
            this.field3701 = this.method1270(-126, arg0.method1012(-120));
        } else if (arg2 == 2) {
            this.field3702 = arg0.method991(255);
        } else if (arg2 == 3) {
            this.field3702 = arg0.method1007(109);
            if (this.field3702 == 65535) {
                this.field3702 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field3703 = false;
        } else {
            if (arg2 == 7) {
                this.field3700 = this.method1270(-116, arg0.method1012(-121));
            } else if (arg2 != 8 && arg2 == 9) {
                arg0.method1007(arg3 - 29);
                return;
            }
            return;
        }
    }
}
