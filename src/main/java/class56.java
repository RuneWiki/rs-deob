import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class56 {

    @OriginalMember(owner = "client!oia", name = "h", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!oia", name = "u", descriptor = "[B")
    private byte[] field736;

    @OriginalMember(owner = "client!oia", name = "n", descriptor = "Luw;")
    public static class208 field729 = new class208(105, 5);

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "client!oia", name = "f", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!oia", name = "l", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!oia", name = "m", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!oia", name = "o", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!oia", name = "p", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!oia", name = "q", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!oia", name = "e", descriptor = "Ljw;")
    public class297 field720;

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "[I")
    public int[] field717;

    @OriginalMember(owner = "client!oia", name = "i", descriptor = "[I")
    public int[] field724;

    @OriginalMember(owner = "client!oia", name = "j", descriptor = "[I")
    public int[] field725;

    @OriginalMember(owner = "client!oia", name = "t", descriptor = "[I")
    public int[] field735;

    @OriginalMember(owner = "client!oia", name = "v", descriptor = "[I")
    public int[] field737;

    @OriginalMember(owner = "client!oia", name = "w", descriptor = "[I")
    public int[] field738;

    @OriginalMember(owner = "client!oia", name = "s", descriptor = "[Ljw;")
    public class297[] field734;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "[[B")
    public byte[][] field716;

    @OriginalMember(owner = "client!oia", name = "g", descriptor = "[[I")
    public int[][] field722;

    @OriginalMember(owner = "client!oia", name = "r", descriptor = "[[I")
    public int[][] field733;

    @OriginalMember(owner = "client!oia", name = "k", descriptor = "[[Z")
    public static boolean[][] field726;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(BI)[I", line = 3)
    public static final int[] method339(byte arg0, int arg1) {
        field732++;
        if (arg0 != 117) {
            return null;
        }
        int[] var2 = new int[3];
        class525.method2886(-95, class544.method2953((byte) -95, arg1));
        var2[0] = class368.field4508.get(5);
        var2[1] = class368.field4508.get(2);
        var2[2] = class368.field4508.get(1);
        return var2;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)Ljava/lang/String;", line = 31)
    public static final String method340(int arg0) {
        field721++;
        if (arg0 >= -36) {
            field729 = null;
        }
        return class525.field6678 || class643.field8232 == null ? "" : class643.field8232.field10406;
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)V", line = 54)
    public static void method341(int arg0) {
        field729 = null;
        field726 = null;
        if (arg0 <= 73) {
            field729 = null;
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(II)V", line = 72)
    public static final void method342(int arg0, int arg1) {
        field718++;
        if (class333.field4070 == null || class333.field4070.length < arg0) {
            class333.field4070 = new int[arg0];
        }
        if (arg1 != -1) {
            field729 = null;
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "([BZ)V", line = 88)
    private final void method343(byte[] arg0, boolean arg1) {
        field727++;
        class234 var3 = new class234(class60.method357(arg0, -31464));
        int var4 = var3.method1509(!arg1);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field730 = 0;
        } else {
            this.field730 = var3.method1497((byte) 83);
        }
        int var5 = var3.method1509(true);
        boolean var6 = (var5 & 0x1) != 0;
        this.field731 = var3.method1553((byte) 57);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        int var9 = -1;
        this.field724 = new int[this.field731];
        for (int var10 = 0; var10 < this.field731; var10++) {
            this.field724[var10] = var8 += var3.method1553((byte) -108);
            if (this.field724[var10] > var9) {
                var9 = this.field724[var10];
            }
        }
        this.field719 = var9 + 1;
        this.field737 = new int[this.field719];
        if (var7) {
            this.field716 = new byte[this.field719][];
        }
        this.field733 = new int[this.field719][];
        this.field725 = new int[this.field719];
        this.field735 = new int[this.field719];
        this.field717 = new int[this.field719];
        if (var6) {
            this.field738 = new int[this.field719];
            for (int var11 = 0; var11 < this.field719; var11++) {
                this.field738[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field731; var12++) {
                this.field738[this.field724[var12]] = var3.method1497((byte) 54);
            }
            this.field720 = new class297(this.field738);
        }
        for (int var13 = 0; var13 < this.field731; var13++) {
            this.field717[this.field724[var13]] = var3.method1497((byte) 44);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field731; var14++) {
                byte[] var15 = new byte[64];
                var3.method1495(64, 0, (byte) -127, var15);
                this.field716[this.field724[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field731; var16++) {
            this.field725[this.field724[var16]] = var3.method1497((byte) 31);
        }
        for (int var17 = 0; var17 < this.field731; var17++) {
            this.field735[this.field724[var17]] = var3.method1553((byte) 125);
        }
        for (int var18 = 0; var18 < this.field731; var18++) {
            int var25 = this.field724[var18];
            int var26 = this.field735[var25];
            int var27 = 0;
            this.field733[var25] = new int[var26];
            int var28 = -1;
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field733[var25][var29] = var27 += var3.method1553((byte) 85);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field737[var25] = var28 + 1;
            if ((var28 + 1) == var26) {
                this.field733[var25] = null;
            }
        }
        if (arg1) {
            this.field717 = null;
        }
        if (!var6) {
            return;
        }
        this.field734 = new class297[var9 + 1];
        this.field722 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field731; var19++) {
            int var20 = this.field724[var19];
            int var21 = this.field735[var20];
            this.field722[var20] = new int[this.field737[var20]];
            for (int var22 = 0; var22 < this.field737[var20]; var22++) {
                this.field722[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field733[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field733[var20][var23];
                }
                this.field722[var20][var24] = var3.method1497((byte) 86);
            }
            this.field734[var20] = new class297(this.field722[var20]);
        }
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "([BI[B)V", line = 287)
    public class56(byte[] arg0, int arg1, byte[] arg2) {
        this.field723 = class169.method1075(true, arg0.length, arg0);
        if (this.field723 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field736 = class172.method1082(arg0, arg0.length, 53, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field736[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method343(arg0, false);
    }
}
