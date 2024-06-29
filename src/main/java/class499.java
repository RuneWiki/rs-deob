import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class499 {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Z")
    public boolean field6972 = false;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public int field6973 = 64;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public int field6971 = -1;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public int field6982 = 1;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public int field6983 = 2;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Z")
    public boolean field6984 = false;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public int field6977 = 64;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field6974 = 0;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "F")
    public static float field6970;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[[S")
    public static short[][] field6975;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILfca;)I", line = 7)
    public static final int method2903(int arg0, class75 arg1) {
        if (arg0 != 7491) {
            field6975 = null;
        }
        field6979++;
        if (class666.field9494 == arg1) {
            return 6407;
        } else if (class391.field5229 == arg1) {
            return 6408;
        } else if (class384.field5117 == arg1) {
            return 6406;
        } else if (class702.field9917 == arg1) {
            return 6409;
        } else if (class426.field6122 == arg1) {
            return 6410;
        } else if (class438.field6259 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII[III)Z", line = 60)
    public static final boolean method2904(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg4 != 6408) {
            method2904(97, -101, -92, -41, 48, null, 107, -69);
        }
        if (class353.field4718 < arg0) {
            arg0 = class353.field4718;
        }
        field6980++;
        if (arg0 <= arg2) {
            return true;
        }
        int var8 = arg2 * arg3 + arg1;
        int var9 = arg0 - arg2 >> 2;
        int var10 = arg2 + arg7 - 1;
        if (class159.field1938 == 1) {
            class86.field1213 += var9;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var11 = arg0 - arg2 & 0x3;
                    while (true) {
                        var11--;
                        if (var11 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg5[var10] > var8) {
                            arg5[var10] = var8;
                        }
                        var8 += arg3;
                    }
                }
                var10++;
                if (arg5[var10] > var8) {
                    arg5[var10] = var8;
                }
                int var12 = arg3 + var8;
                var10++;
                if (var12 < arg5[var10]) {
                    arg5[var10] = var12;
                }
                int var13 = arg3 + var12;
                var10++;
                if (arg5[var10] > var13) {
                    arg5[var10] = var13;
                }
                int var14 = arg3 + var13;
                var10++;
                if (arg5[var10] > var14) {
                    arg5[var10] = var14;
                }
                var8 = arg3 + var14;
            }
        } else {
            var8 -= 15360;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var15 = arg0 - arg2 & 0x3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg5[var10] > var8) {
                            return false;
                        }
                        var8 += arg3;
                    }
                }
                int var10000 = ~var8;
                var10++;
                if (var10000 > ~arg5[var10]) {
                    return false;
                }
                int var16 = arg3 + var8;
                var10000 = ~var16;
                var10++;
                if (var10000 > ~arg5[var10]) {
                    return false;
                }
                int var17 = arg3 + var16;
                var10000 = ~var17;
                var10++;
                if (var10000 > ~arg5[var10]) {
                    return false;
                }
                int var18 = arg3 + var17;
                var10000 = ~var18;
                var10++;
                if (var10000 > ~arg5[var10]) {
                    return false;
                }
                var8 = arg3 + var18;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBLun;)V", line = 153)
    public final void method2905(int arg0, byte arg1, class389 arg2) {
        while (true) {
            int var4 = arg2.method2229(255);
            if (var4 == 0) {
                field6969++;
                if (arg1 < 110) {
                    this.method2907(4, null, 11, 17);
                    return;
                }
                return;
            }
            this.method2907(arg0, arg2, var4, -18991);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 186)
    public static void method2906(int arg0) {
        if (arg0 >= 40) {
            field6975 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILun;II)V", line = 206)
    private final void method2907(int arg0, class389 arg1, int arg2, int arg3) {
        field6976++;
        if (arg2 == 1) {
            this.field6971 = arg1.method2260(-53);
            if (this.field6971 == 65535) {
                this.field6971 = -1;
            }
        } else if (arg2 == 2) {
            this.field6977 = arg1.method2260(-44) + 1;
            this.field6973 = arg1.method2260(-103) + 1;
        } else if (arg2 == 3) {
            arg1.method2249((byte) -70);
        } else if (arg2 == 4) {
            this.field6983 = arg1.method2229(255);
        } else if (arg2 == 5) {
            this.field6982 = arg1.method2229(arg3 + 19246);
        } else if (arg2 == 6) {
            this.field6984 = true;
        } else if (arg2 == 7) {
            this.field6972 = true;
        }
        if (arg3 != -18991) {
            this.field6973 = -26;
        }
    }
}
