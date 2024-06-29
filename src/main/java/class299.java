import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class299 extends class445 {

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "[B")
    public byte[] field3998;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "Lh;")
    public static class434 field4002 = new class434(71, 20);

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "[Lnt;")
    public static class134[] field4005 = new class134[14];

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "Lr;")
    public static class110 field4004;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "Lod;")
    public static class321 field3997;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "Lha;")
    public static class40 field4003;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)I", line = 3)
    public static final int method1678(int arg0, int arg1, int arg2) {
        if (arg1 <= 13) {
            method1680(-92);
        }
        field4001++;
        return arg0 == 4 || arg0 == 5 ? class110.field1678[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLoo;)V", line = 23)
    public static final void method1679(boolean arg0, class408 arg1) {
        field3999++;
        arg1.field5584 = null;
        if (class324.field4326 < 20) {
            class103.field1473.method2767(-1830, arg1);
            class324.field4326++;
        }
        if (arg0) {
            method1681((byte) 123, 49);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 41)
    public static void method1680(int arg0) {
        if (arg0 != 3) {
            return;
        }
        field4004 = null;
        field4003 = null;
        field3997 = null;
        field4002 = null;
        field4005 = null;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([B)V", line = 55)
    public class299(byte[] arg0) {
        this.field3998 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)V", line = 63)
    public static final void method1681(byte arg0, int arg1) {
        field4000++;
        int var2 = class70.field968 - class294.field3934;
        if (var2 >= 100) {
            class56.field772 = 1;
            return;
        }
        int var3 = (int) class239.field3186;
        if (class387.field5358 >> 8 > var3) {
            var3 = class387.field5358 >> 8;
        }
        if (class278.field3687[4] && var3 < class4.field61[4] + 128) {
            var3 = class4.field61[4] + 128;
        }
        int var4 = (int) class270.field3610 + class41.field582 & 0x3FFF;
        class26.method151(true, (var3 >> 3) * 3 + 600, class87.field1215, arg1, class247.method1385(94, class233.field3103.field6501, class233.field3103.field6507, class373.field5104) - 50, class36.field544, var4, var3);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        if (arg0 <= 40) {
            return;
        }
        class412.field5637 = (int) ((float) (class412.field5637 - class336.field4540) * var5 + (float) class336.field4540);
        class197.field2680 = (int) ((float) (class197.field2680 - class243.field3237) * var5 + (float) class243.field3237);
        class195.field2638 = (int) ((float) (class195.field2638 - class268.field3584) * var5 + (float) class268.field3584);
        class155.field2171 = (int) ((float) (class155.field2171 - class374.field5152) * var5 + (float) class374.field5152);
        int var6 = class348.field4796 - class120.field1771;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class348.field4796 = (int) ((float) var6 * var5 + (float) class120.field1771);
        class348.field4796 &= 0x3FFF;
    }
}
