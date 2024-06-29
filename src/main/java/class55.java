import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class55 extends class317 {

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    private int field741 = -1;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field739 = 500;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "S")
    public static short field743 = 256;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "S")
    public static short field738 = 32767;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "[[S")
    public static short[][] field750 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "[I")
    private int[] field748;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)I", line = 5)
    public final int method377(int arg0) {
        field745++;
        if (arg0 != 14118) {
            this.field741 = -106;
        }
        return this.field741;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lcg;Z)Llf;", line = 19)
    public static final class317 method378(class316 arg0, boolean arg1) {
        field744++;
        arg0.method2219(16448);
        int var2 = arg0.method2219(16448);
        if (!arg1) {
            return (class317) null;
        }
        class317 var3 = class274.method1886(-25826, var2);
        var3.field4830 = arg0.method2219(16448);
        int var4 = arg0.method2219(16448);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method2219(16448);
            var3.method60(arg0, -115, var6);
        }
        var3.method546(-21522);
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 52)
    public class55() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 74)
    public final void method379(boolean arg0) {
        field749++;
        super.method379(arg0);
        this.field748 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lcg;II)V", line = 84)
    public final void method60(class316 arg0, int arg1, int arg2) {
        int var4 = 24 % ((-arg1 - 17) / 40);
        if (arg2 == 0) {
            this.field741 = arg0.method2220((byte) 122);
        }
        field740++;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)V", line = 113)
    public static void method380(byte arg0) {
        if (arg0 < 49) {
            method381(-1, 32, 49, (byte) -43);
        }
        field750 = (short[][]) null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[[I", line = 123)
    public final int[][] method53(int arg0, int arg1) {
        field737++;
        int var3 = -110 / ((arg0 + 31) / 37);
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352 && this.method382(-91)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = this.field742 * (class340.field5109 == this.field752 ? arg1 : this.field752 * arg1 / class340.field5109);
            if (class326.field4933 == this.field742) {
                for (int var9 = 0; var9 < class326.field4933; var9++) {
                    int var10 = this.field748[var8++];
                    var7[var9] = class47.method303(4080, var10 << 4);
                    var6[var9] = class47.method303(var10, 65280) >> 4;
                    var5[var9] = class47.method303(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; var11 < class326.field4933; var11++) {
                    int var12 = this.field742 * var11 / class326.field4933;
                    int var13 = this.field748[var8 + var12];
                    var7[var11] = class47.method303(var13 << 4, 4080);
                    var6[var11] = class47.method303(var13, 65280) >> 4;
                    var5[var11] = class47.method303(4080, var13 >> 12);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIB)V", line = 193)
    public static final void method381(int arg0, int arg1, int arg2, byte arg3) {
        field747++;
        if (arg3 == -47) {
            class143 var4 = class163.method1176((byte) -105, arg1, 9);
            var4.method1032((byte) 123);
            var4.field1965 = arg2;
            var4.field1958 = arg0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)Z", line = 210)
    private final boolean method382(int arg0) {
        if (arg0 >= -40) {
            return true;
        }
        field746++;
        if (this.field748 != null) {
            return true;
        } else if (this.field741 < 0) {
            return false;
        } else {
            int var2 = class326.field4933;
            int var3 = class340.field5109;
            int var4 = class237.field3365.method1504(this.field741, 23925).field3315 ? 64 : 128;
            this.field748 = class237.field3365.method1509(var4, 1.0F, (byte) -2, this.field741, false, var4);
            this.field752 = var4;
            this.field742 = var4;
            class111.method810(var2, var3, -1);
            return this.field748 != null;
        }
    }
}
