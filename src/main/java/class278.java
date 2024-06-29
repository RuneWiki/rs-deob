import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class278 extends class286 {

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
    private int field4642 = 4;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
    private int field4640 = 4;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "Lnk;")
    public static class12 field4645 = new class12();

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "Lbe;")
    public static class283 field4647 = class153.method941(-75, "mapflag");

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "Lbe;")
    private static class283 field4649 = class153.method941(-86, "OFF");

    @OriginalMember(owner = "client!gm", name = "ab", descriptor = "Lbe;")
    public static class283 field4652 = class153.method941(126, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "I")
    public static int field4648 = 0;

    @OriginalMember(owner = "client!gm", name = "bb", descriptor = "Lbe;")
    public static class283 field4653 = class153.method941(-123, "(U0a )2 in: ");

    @OriginalMember(owner = "client!gm", name = "cb", descriptor = "Lbe;")
    public static class283 field4654 = field4649;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "Lbe;")
    public static class283 field4651;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "(I)V", line = 4)
    public static void method1857(int arg0) {
        field4647 = null;
        field4653 = null;
        field4652 = null;
        field4651 = null;
        if (arg0 != 20019) {
            field4649 = (class283) null;
        }
        field4649 = null;
        field4645 = null;
        field4654 = null;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 247)
    public class278() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)[I", line = 38)
    public final int[] method14(int arg0, int arg1) {
        field4646++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int var4 = class27.field410 / this.field4640;
            int var5 = class13.field124 / this.field4642;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method1963(0, 0, -1);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1963(class13.field124 * var7 / var5, 0, -1);
            }
            for (int var8 = 0; var8 < class27.field410; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class27.field410 * var9 / var4];
                }
            }
        }
        if (arg0 > -52) {
            this.method19((class229) null, true, -79);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lkg;B)V", line = 96)
    public static final void method1858(class69 arg0, byte arg1) {
        if (arg1 >= -106) {
            return;
        }
        int var2 = arg0.field975;
        field4639++;
        if (var2 == 324) {
            if (class201.field3438 == -1) {
                class157.field2569 = arg0.field1035;
                class201.field3438 = arg0.field1060;
            }
            if (class116.field1957.field4460) {
                arg0.field1060 = class201.field3438;
            } else {
                arg0.field1060 = class157.field2569;
            }
        } else if (var2 == 325) {
            if (class201.field3438 == -1) {
                class201.field3438 = arg0.field1060;
                class157.field2569 = arg0.field1035;
            }
            if (class116.field1957.field4460) {
                arg0.field1060 = class157.field2569;
            } else {
                arg0.field1060 = class201.field3438;
            }
        } else if (var2 == 327) {
            arg0.field1099 = 150;
            arg0.field977 = (int) (Math.sin((double) class75.field1309 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1057 = -1;
            arg0.field1072 = 5;
        } else if (var2 == 328) {
            if (class213.field3624.field3274 == null) {
                arg0.field1057 = 0;
            } else {
                arg0.field1099 = 150;
                arg0.field977 = (int) (Math.sin((double) class75.field1309 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1072 = 5;
                arg0.field1057 = ((int) class213.field3624.field3274.method1929((byte) -24) << 11) + 2047;
                arg0.field1075 = class213.field3624.field1205;
                arg0.field1052 = class213.field3624.field1219;
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)[[I", line = 183)
    public final int[][] method16(int arg0, byte arg1) {
        field4641++;
        if (arg1 != -19) {
            this.method19((class229) null, true, 121);
        }
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524) {
            int var4 = class27.field410 / this.field4640;
            int var5 = class13.field124 / this.field4642;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method1964(class13.field124 * var6 / var5, 0, false);
            } else {
                var7 = this.method1964(0, 0, false);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class27.field410; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class27.field410 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lfe;ZI)V", line = 252)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field4648 = 84;
        }
        if (arg2 == 0) {
            this.field4640 = arg0.method1535((byte) 70);
        } else if (arg2 == 1) {
            this.field4642 = arg0.method1535((byte) 94);
        }
        field4643++;
    }
}
