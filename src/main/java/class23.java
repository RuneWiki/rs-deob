import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class23 extends class175 {

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "Z")
    private boolean field396 = true;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    private int field400 = 4096;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "Ljava/util/Random;")
    public static Random field391 = new Random();

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "Lmb;")
    private static class96 field401 = class243.method1708("Loaded update list", (byte) 106);

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "Lmb;")
    public static class96 field402 = field401;

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "Ldi;")
    public static class39 field403 = class83.method585((byte) 52);

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "[[B")
    public static byte[][] field404 = new byte[50][];

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "Lff;")
    public static class3 field398;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "[I")
    public static int[] field395;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public static final void method163(int arg0) {
        class133.method998((byte) -49);
        class133.method999(-20627);
        class106.method795(arg0 ^ 26207);
        ++field399;
        class221.method1520((byte) 126);
        class54.method405((byte) 110);
        class21.method149(100);
        class268.method1842(-121);
        if (arg0 != -26208) {
            field398 = null;
        }
        class195.method1360(0);
        class198.method1388((byte) 69);
        class41.method321(1000);
        class83.method581(true);
        class246.method1723(arg0 ^ 996);
        class78.method556((byte) 86);
        class220.method1514((byte) 113);
        class265.field4633.method96(false);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field390;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field396 = arg2.method1651(4139) == 1;
            }
        } else {
            this.field400 = arg2.method1663((byte) -105);
        }
        int var5 = 57 / ((arg0 - -22) / 58);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field394;
        int[][] var3 = super.field3035.method637(arg0, false);
        if (super.field3035.field1493) {
            int[] var4 = this.method1255(0, arg0 - 1 & class92.field1520, 128);
            int[] var5 = this.method1255(0, arg0, arg1 ^ 192);
            int[] var6 = this.method1255(0, class92.field1520 & arg0 - -1, 128);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class1.field11; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field400;
                int var12 = (var5[var10 - -1 & class194.field3343] + -var5[class194.field3343 & var10 + -1]) * this.field400;
                int var13 = var12 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var11 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var14 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                } else {
                    var19 = 0;
                    var18 = 0;
                    var20 = 0;
                }
                if (this.field396) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var8[var10] = var20;
                var7[var10] = var19;
                var9[var10] = var18;
            }
        }
        if (arg1 != 64) {
            method165(21);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(B)V")
    public static final void method164(byte arg0) {
        ++field397;
        if (class107.field1825 != -1) {
            class189.method1331(class107.field1825, 2643);
        }
        for (int var1 = 0; var1 < class47.field822; ++var1) {
            if (class176.field3059[var1]) {
                class19.field317[var1] = true;
            }
            class201.field3483[var1] = class176.field3059[var1];
            class176.field3059[var1] = false;
        }
        class265.field4632 = -1;
        class193.field3329 = null;
        class251.field4349 = -1;
        class215.field3695 = class236.field4053;
        if (class107.field1825 != -1) {
            class47.field822 = 0;
            class156.method1134(class232.field3979, 0, class107.field1825, -1, (byte) -17, class168.field2954, 0, 0, 0);
        }
        if (arg0 == 79) {
            class84.method609();
            class62.field1063 = 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public static void method165(int arg0) {
        field402 = null;
        field398 = null;
        field391 = null;
        if (arg0 == -29565) {
            field404 = null;
            field395 = null;
            field401 = null;
            field403 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class23() {
        super(1, false);
    }
}
