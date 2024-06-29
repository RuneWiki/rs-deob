import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 extends class618 implements class532 {

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "Llw;")
    public class618 field216;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "F")
    public static float field223;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Loa;BI)Lba;", line = 3)
    public final class358 method137(class651 arg0, byte arg1, int arg2) {
        if (arg1 != -47) {
            this.method151((byte) 33);
        }
        field226++;
        return null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Loa;I)V", line = 15)
    public final void method138(class651 arg0, int arg1) {
        if (arg1 == 2215) {
            field227++;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Z", line = 27)
    public final boolean method139(int arg0) {
        field228++;
        if (arg0 != 2) {
            field223 = -1.270268F;
        }
        return false;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V", line = 40)
    public static final void method140(int arg0) {
        field217++;
        if (class444.field6084 != null) {
            return;
        }
        class444.field6084 = new int[65536];
        int var1 = 17 / ((21 - arg0) / 62);
        double var2 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        for (int var4 = 0; var4 < 65536; var4++) {
            double var5 = (double) ((var4 & 0xFE2A) >> 10) / 64.0D + 0.0078125D;
            double var7 = (double) (var4 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var9 = (double) (var4 & 0x7F) / 128.0D;
            double var11 = var9;
            double var13 = var9;
            double var15 = var9;
            if (var7 != 0.0D) {
                double var17;
                if (var9 < 0.5D) {
                    var17 = (var7 + 1.0D) * var9;
                } else {
                    var17 = var7 + var9 - (var7 * var9);
                }
                double var19 = var9 * 2.0D - var17;
                double var21 = var5 + 0.3333333333333333D;
                if (var21 > 1.0D) {
                    var21--;
                }
                double var25 = var5 - 0.3333333333333333D;
                if (var21 * 6.0D < 1.0D) {
                    var11 = (var17 - var19) * 6.0D * var21 + var19;
                } else if ((var21 * 2.0D < 1.0D)) {
                    var11 = var17;
                } else if ((var21 * 3.0D < 2.0D)) {
                    var11 = (var17 - var19) * (0.6666666666666666D - var21) * 6.0D + var19;
                } else {
                    var11 = var19;
                }
                if (var25 < 0.0D) {
                    var25++;
                }
                if ((var5 * 6.0D < 1.0D)) {
                    var13 = (var17 - var19) * 6.0D * var5 + var19;
                } else if ((var5 * 2.0D < 1.0D)) {
                    var13 = var17;
                } else if (var5 * 3.0D < 2.0D) {
                    var13 = (var17 - var19) * (0.6666666666666666D - var5) * 6.0D + var19;
                } else {
                    var13 = var19;
                }
                if (var25 * 6.0D < 1.0D) {
                    var15 = (var17 - var19) * 6.0D * var25 + var19;
                } else if ((var25 * 2.0D < 1.0D)) {
                    var15 = var17;
                } else if (var25 * 3.0D < 2.0D) {
                    var15 = (var17 - var19) * (0.6666666666666666D - var25) * 6.0D + var19;
                } else {
                    var15 = var19;
                }
            }
            double var27 = Math.pow(var11, var2);
            double var29 = Math.pow(var13, var2);
            double var31 = Math.pow(var15, var2);
            int var33 = (int) (var27 * 256.0D);
            int var34 = (int) (var29 * 256.0D);
            int var35 = (int) (var31 * 256.0D);
            int var36 = (var34 << 8) + (var33 << 16) + var35;
            class444.field6084[var4] = var36;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILoa;ILni;ZZI)V", line = 153)
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        field230++;
        if (!arg5) {
            this.method144(false);
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V", line = 164)
    public final void method142(byte arg0) {
        if (arg0 != -77) {
            this.method148(null, (byte) 38);
        }
        field220++;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIILlw;)V", line = 174)
    public class13(int arg0, int arg1, int arg2, class618 arg3) {
        super(arg0, arg1, arg2, arg3.field8195, false, false);
        this.field216 = arg3;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILoa;)Ldd;", line = 184)
    public final class660 method143(int arg0, class651 arg1) {
        if (arg0 == 31358) {
            field225++;
            return this.field216.method143(31358, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V", line = 197)
    public final void method144(boolean arg0) {
        field232++;
        if (arg0) {
            field223 = -1.0707986F;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLoa;)Lpe;", line = 211)
    public final class571 method145(byte arg0, class651 arg1) {
        if (arg0 == 124) {
            field222++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)I", line = 222)
    public final int method146(boolean arg0) {
        field219++;
        if (arg0) {
            field223 = 0.14150876F;
        }
        return 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Loa;Z)V", line = 236)
    public final void method147(class651 arg0, boolean arg1) {
        if (arg1) {
            field215++;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Loa;B)V", line = 250)
    public final void method148(class651 arg0, byte arg1) {
        if (arg1 != 70) {
            this.method152(true);
        }
        field224++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BILoa;I)Z", line = 262)
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        int var5 = 115 / ((-arg0 - 26) / 38);
        field214++;
        return false;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Z", line = 273)
    public final boolean method150(byte arg0) {
        if (arg0 >= -34) {
            return false;
        } else {
            field231++;
            return false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)I", line = 284)
    public final int method151(byte arg0) {
        if (arg0 == 78) {
            field229++;
            return 0;
        } else {
            return 55;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(Z)I", line = 295)
    public final int method152(boolean arg0) {
        field221++;
        if (!arg0) {
            this.field216 = null;
        }
        return 0;
    }
}
