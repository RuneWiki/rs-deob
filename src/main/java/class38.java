import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class38 extends class251 {

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "[S")
    public static short[] field651 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "[I")
    public static int[] field647 = new int[2500];

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "Lsj;")
    public static class49 field648;

    @OriginalMember(owner = "client!uc", name = "nb", descriptor = "[[[I")
    public static int[][][] field656;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)V")
    public static void method283(int arg0) {
        field651 = null;
        if (arg0 != 0) {
            method285((byte) 101, -118);
        }
        field647 = null;
        field648 = null;
        field656 = null;
    }

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "(I)I")
    public static final int method284(int arg0) {
        ++field653;
        if (arg0 != 16) {
            field656 = null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(BI)Lcc;")
    public static final class209 method285(byte arg0, int arg1) {
        if (arg0 > -86) {
            method285((byte) -17, -72);
        }
        ++field650;
        return class229.method1604(new class209[] { class66.method485(255 & arg1 >> 24, (byte) 61), class106.field2075, class66.method485((16771843 & arg1) >> 16, (byte) 101), class106.field2075, class66.method485(arg1 >> 8 & 255, (byte) 94), class106.field2075, class66.method485(arg1 & 255, (byte) 3) }, (byte) 41);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        ++field649;
        int[][] var3 = super.field2872.method533(arg1, 3);
        if (arg0 != 1) {
            field648 = null;
        }
        if (super.field2872.field1434 && this.method1737(-24871)) {
            int[] var4 = var3[0];
            int var5 = arg1 % super.field4510 * super.field4510;
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; ~class226.field4124 < ~var8; ++var8) {
                int var9 = super.field4518[var5 - -(var8 % super.field4514)];
                var6[var8] = class27.method220(var9 << 4, 4080);
                var7[var8] = class27.method220(65280, var9) >> 4;
                var4[var8] = class27.method220(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(III)Lma;")
    public static final class187 method286(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class187 var4 = var3.field2213;
            var3.field2213 = null;
            return var4;
        }
    }
}
