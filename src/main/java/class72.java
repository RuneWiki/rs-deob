import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class72 extends class304 {

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
    private int field1035;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "[[B")
    public static byte[][] field1030 = new byte[50][];

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "Ljava/lang/String;")
    public static String field1031 = "flash2:";

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
    public static int field1036 = 0;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V", line = 5)
    public static void method508(int arg0) {
        field1030 = (byte[][]) null;
        field1031 = null;
        if (arg0 != -1) {
            field1036 = 115;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLjd;Ljd;Ljd;Ljd;)V", line = 19)
    public static final void method509(byte arg0, class95 arg1, class95 arg2, class95 arg3, class95 arg4) {
        class191.field2984 = arg4;
        field1033++;
        class223.field3398 = arg2;
        class307.field4785 = arg1;
        if (arg0 < 107) {
            field1036 = 79;
        }
        class146.field2228 = arg3;
        class8.field128 = new class161[class223.field3398.method687((byte) 20)][];
        class95.field1361 = new boolean[class223.field3398.method687((byte) 20)];
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)I", line = 45)
    public static final int method510(int arg0, int arg1) {
        field1034++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFFE1) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 > var2) {
            var8 = var4;
        }
        double var10 = var2;
        if (var8 < var6) {
            var8 = var6;
        }
        if (var4 < var2) {
            var10 = var4;
        }
        if (var10 > var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var2 == var8) {
                var12 = (var4 - var6) / (var8 - var10);
            } else if (var4 == var8) {
                var12 = (var6 - var2) / (var8 - var10) + 2.0D;
            } else if (var6 == var8) {
                var12 = (var2 - var4) / (var8 - var10) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var8 - var10) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var8 - var10) / (2.0D - var8 - var10);
            }
        }
        int var18 = (int) (var14 * 256.0D);
        if (arg0 > -55) {
            method509((byte) 118, (class95) null, (class95) null, (class95) null, (class95) null);
        }
        double var19 = var12 / 6.0D;
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var18 >>= 0x4;
        } else if (var22 > 217) {
            var18 >>= 0x3;
        } else if (var22 > 192) {
            var18 >>= 0x2;
        } else if (var22 > 179) {
            var18 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var22 >> 1) + (var18 >> 5 << 7);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 147)
    public class72() {
        this(4096);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lwm;II)V", line = 155)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg2 != -2828) {
            method514(-42, (byte) 30, (String) null);
        }
        if (arg1 == 0) {
            this.field1035 = (arg0.method1774((byte) 90) << 12) / 255;
        }
        field1032++;
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)Lhk;", line = 181)
    public static final class42 method511(int arg0) {
        field1025++;
        class42 var1 = new class42(class233.field3554, class38.field559, class304.field4666[0], class27.field293[0], class133.field2028[arg0], class209.field3191[0], class220.field3362[0], class82.field1212);
        class245.method1684(255);
        return var1;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V", line = 192)
    public class72(int arg0) {
        super(0, true);
        this.field1035 = 4096;
        this.field1035 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLjava/lang/String;)I", line = 201)
    public static final int method512(byte arg0, String arg1) {
        field1028++;
        if (arg1 == null) {
            return -1;
        }
        if (arg0 != -3) {
            method508(-41);
        }
        for (int var2 = 0; var2 < class159.field2416; var2++) {
            if (arg1.equalsIgnoreCase(class309.field4819[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lkk;III)V", line = 245)
    public static final void method513(class76 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field4707 == arg3 && arg3 != -1) {
            class28 var4 = client.method1010(arg3, (byte) 111);
            int var5 = var4.field335;
            if (var5 == 1) {
                arg0.field4684 = arg2;
                arg0.field4724 = 0;
                arg0.field4685 = 1;
                arg0.field4699 = 0;
                arg0.field4727 = 0;
                class146.method1105(arg0.field4727, false, 6924, arg0.field4731, var4, arg0.field4713);
            }
            if (var5 == 2) {
                arg0.field4724 = 0;
            }
        } else if (arg3 == -1 || arg0.field4707 == -1 || client.method1010(arg3, (byte) 106).field314 >= client.method1010(arg0.field4707, (byte) 125).field314) {
            arg0.field4707 = arg3;
            arg0.field4727 = 0;
            arg0.field4684 = arg2;
            arg0.field4694 = arg0.field4716;
            arg0.field4685 = 1;
            arg0.field4724 = 0;
            arg0.field4699 = 0;
            if (arg0.field4707 != -1) {
                class146.method1105(arg0.field4727, false, 6924, arg0.field4731, client.method1010(arg0.field4707, (byte) 121), arg0.field4713);
            }
        }
        int var6 = 69 % ((56 - arg1) / 51);
        field1027++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)[I", line = 304)
    public final int[] method71(int arg0, int arg1) {
        field1026++;
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (arg0 != 7) {
            field1031 = (String) null;
        }
        if (this.field4669.field5223) {
            class126.method946(var3, 0, class218.field3333, this.field1035);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 328)
    public static final void method514(int arg0, byte arg1, String arg2) {
        class85.field1236.method1141((byte) 91, 147);
        class169.field2732++;
        if (arg1 != -8) {
            field1031 = (String) null;
        }
        field1029++;
        class85.field1236.method1731(class49.method374(arg2, -1), (byte) -105);
        class85.field1236.method1747(-119, arg0);
    }
}
