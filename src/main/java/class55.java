import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class55 extends class182 {

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    private int field1091 = 1;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    private int field1095 = 0;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    private int field1093 = 0;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    public static int field1087 = 0;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1089 = "Loaded update list";

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "[[[I")
    public static int[][][] field1085;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Loe;IB)V", line = 9)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        field1086++;
        if (arg2 != 60) {
            return;
        }
        if (arg1 == 0) {
            this.field1093 = arg0.method1005((byte) 122);
        } else if (arg1 == 1) {
            this.field1095 = arg0.method1005((byte) 122);
        } else if (arg1 == 3) {
            this.field1091 = arg0.method1005((byte) 122);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V", line = 55)
    public static void method471(byte arg0) {
        field1089 = null;
        field1085 = (int[][][]) null;
        if (arg0 <= 104) {
            method471((byte) -122);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 98)
    public class55() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(BII)I", line = 73)
    public static final int method472(byte arg0, int arg1, int arg2) {
        field1090++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            if (arg0 < 39) {
                method472((byte) -119, 76, -57);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)V", line = 104)
    public static final void method473(int arg0) {
        field1097++;
        if (class295.field4818) {
            return;
        }
        if (arg0 < 6) {
            method473(24);
        }
        class295.field4818 = true;
        if (class151.field2559) {
            class87.field1523 = (float) ((int) class87.field1523 - 17 & 0xFFFFFFF0);
        } else {
            class335.field5335 += (-class335.field5335 - 12.0F) / 2.0F;
        }
        class312.field5074 = true;
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V", line = 140)
    public final void method163(int arg0) {
        field1092++;
        if (arg0 != 100) {
            method473(15);
        }
        class219.method1526(256);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)[I", line = 154)
    public final int[] method125(int arg0, int arg1) {
        field1094++;
        int[] var3 = this.field3166.method775(arg1, 126);
        if (arg0 != 2) {
            return (int[]) null;
        }
        if (this.field3166.field1903) {
            int var4 = class248.field4066[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class26.field672; var6++) {
                int var7 = class21.field539[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field1093 == 0) {
                    var9 = (var7 - var4) * this.field1091;
                } else {
                    int var10 = var8 * var8 + (var5 * var5) >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field1091 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field1095 == 0) {
                    var12 = class223.field3690[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field1095 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }
}
