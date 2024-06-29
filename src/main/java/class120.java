import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class120 extends class285 {

    @OriginalMember(owner = "client!nn", name = "R", descriptor = "Z")
    private boolean field1824 = true;

    @OriginalMember(owner = "client!nn", name = "V", descriptor = "Z")
    private boolean field1828 = true;

    @OriginalMember(owner = "client!nn", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1827 = "Unable to find ";

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!nn", name = "P", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!nn", name = "Q", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!nn", name = "S", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!nn", name = "T", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!nn", name = "W", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "(I)V", line = 4)
    public static void method841(int arg0) {
        field1827 = null;
        if (arg0 > -16) {
            field1827 = (String) null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "(I)V", line = 17)
    public static final void method842(int arg0) {
        class90.field1246.method707(arg0);
        class207.field3409.method707(0);
        field1829++;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZLjj;I)V", line = 43)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1828 = arg1.method286((byte) -88) == 1;
        } else if (arg2 == 1) {
            this.field1824 = arg1.method286((byte) -94) == 1;
        } else if (arg2 == 2) {
            this.field4572 = arg1.method286((byte) -72) == 1;
        }
        field1822++;
        if (!arg0) {
            this.method60(false, -24);
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 142)
    public class120() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)[I", line = 80)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1828 = false;
        }
        int[] var3 = this.field4573.method1116(97, arg1);
        field1821++;
        if (this.field4573.field2420) {
            int[] var4 = this.method2048(0, (byte) 122, this.field1824 ? class32.field432 - arg1 : arg1);
            if (this.field1828) {
                for (int var5 = 0; var5 < class287.field4599; var5++) {
                    var3[var5] = var4[class112.field1717 - var5];
                }
            } else {
                class9.method53(var4, 0, var3, 0, class287.field4599);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)I", line = 128)
    public static final int method843(int arg0, int arg1) {
        int var2 = -114 % ((arg0 + 42) / 33);
        int var8 = arg1 - 1;
        int var3 = var8 | var8 >>> 1;
        int var4 = var3 | var3 >>> 2;
        field1826++;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)[[I", line = 146)
    public final int[][] method62(byte arg0, int arg1) {
        if (arg0 <= 121) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        field1823++;
        if (this.field4564.field3529) {
            int[][] var4 = this.method2053((byte) -57, 0, this.field1824 ? class32.field432 - arg1 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field1828) {
                for (int var12 = 0; var12 < class287.field4599; var12++) {
                    var7[var12] = var5[class112.field1717 - var12];
                    var9[var12] = var8[class112.field1717 - var12];
                    var10[var12] = var6[class112.field1717 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class287.field4599; var11++) {
                    var7[var11] = var5[var11];
                    var9[var11] = var8[var11];
                    var10[var11] = var6[var11];
                }
            }
        }
        return var3;
    }
}
