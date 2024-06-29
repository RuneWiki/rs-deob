import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class70 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "B")
    private byte field1224;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1225 = 0;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field1238 = 1;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Lpk;")
    public static class66 field1237 = new class66(128);

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Lbj;")
    public static class83 field1233;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[[[Lnd;")
    public static class199[][][] field1232;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lng;I)I")
    public static final int method464(class121 arg0, int arg1) {
        field1239++;
        if (arg1 > -55) {
            return -76;
        }
        int var2 = 0;
        if (arg0.method818(0, class223.field3978)) {
            var2++;
        }
        if (arg0.method818(0, class222.field3970)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I")
    public final int method465(int arg0) {
        field1227++;
        if (arg0 == -1515711317) {
            return (this.field1224 & 0x8) == 8 ? 1 : 0;
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)I")
    public final int method466(int arg0) {
        field1240++;
        if (arg0 >= -89) {
            field1235 = 11;
        }
        return this.field1224 & 0x7;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZILeg;I)V")
    public static final void method467(boolean arg0, int arg1, class33 arg2, int arg3) {
        field1226++;
        if (class267.field4726 != 0 && class267.field4726 != 3 || !arg2.method229(true)) {
            return;
        }
        int var4 = arg2.field492[arg1];
        if (var4 > arg3 || arg2.field566[arg1] + var4 < arg3) {
            return;
        }
        int var5 = arg3 - arg2.field537 / 2;
        int var6 = arg1 - arg2.field561 / 2;
        int var7 = class65.field1138 + class137.field2302 & 0x7FF;
        int var8 = class15.field206[var7];
        int var9 = (class114.field1886 + 256) * var8 >> 8;
        int var10 = class15.field204[var7];
        int var11 = (class114.field1886 + 256) * var10 >> 8;
        int var12 = var6 * var9 - (var5 * var11) >> 11;
        if (arg0) {
            field1238 = 116;
        }
        int var13 = var5 * var9 + var6 * var11 >> 11;
        int var14 = class175.field2946.field2972 - var12 >> 7;
        int var15 = class175.field2946.field3003 + var13 >> 7;
        if (class227.field4084 > 0 && class88.field1438[82] && class88.field1438[81]) {
            class104.method651(class225.field4061 + var15, -86, class193.field3474 + var14, class261.field4598);
            return;
        }
        boolean var16 = class97.method604(0, var14, class175.field2946.field2953[0], var15, 0, 0, 1, 0, class175.field2946.field3014[0], 0, true, 119);
        if (!var16) {
            return;
        }
        class53.field963.method1613(var5, 21);
        class53.field963.method1613(var6, 21);
        class53.field963.method1608(class65.field1138, false);
        class53.field963.method1613(57, 21);
        class53.field963.method1613(class137.field2302, 21);
        class53.field963.method1613(class114.field1886, 21);
        class53.field963.method1613(89, 21);
        class53.field963.method1608(class175.field2946.field3003, false);
        class53.field963.method1608(class175.field2946.field2972, false);
        class53.field963.method1613(class45.field809, 21);
        class53.field963.method1613(63, 21);
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V")
    public static void method468(int arg0) {
        field1233 = null;
        if (arg0 <= 85) {
            field1233 = null;
        }
        field1237 = null;
        field1232 = null;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class70() {
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lji;)V")
    public class70(class225 arg0) {
        this.field1224 = arg0.method1575(false);
        this.field1229 = arg0.method1593(true);
        this.field1231 = arg0.method1562(21705);
        this.field1230 = arg0.method1562(21705);
        this.field1234 = arg0.method1562(21705);
        this.field1228 = arg0.method1562(21705);
    }
}
