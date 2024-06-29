import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class72 extends class123 {

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    private int field1308 = 3072;

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "I")
    private int field1316 = 2048;

    @OriginalMember(owner = "client!vg", name = "mb", descriptor = "I")
    private int field1322 = 1024;

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "Lka;")
    public static class245 field1313 = null;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "Leb;")
    public static class230 field1311 = class68.method589(0, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "[Z")
    public static boolean[] field1314 = new boolean[8];

    @OriginalMember(owner = "client!vg", name = "ib", descriptor = "I")
    public static int field1318 = 0;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!vg", name = "jb", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!vg", name = "lb", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!vg", name = "kb", descriptor = "[I")
    public static int[] field1320;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "[Leb;")
    public static class230[] field1307;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        if (arg1 != 26080) {
            field1320 = null;
        }
        ++field1321;
        int[][] var3 = super.field2152.method1106(arg0, -7034);
        if (super.field2152.field2616) {
            int[][] var4 = this.method960(0, arg0, (byte) -68);
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var4[0];
            int[] var10 = var3[0];
            for (int var11 = 0; ~var11 > ~class140.field2505; ++var11) {
                var10[var11] = (var9[var11] * this.field1316 >> 12) + this.field1322;
                var6[var11] = (var7[var11] * this.field1316 >> 12) + this.field1322;
                var5[var11] = this.field1322 - -(var8[var11] * this.field1316 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V")
    public static void method613(int arg0) {
        field1314 = null;
        if (arg0 > 2) {
            field1320 = null;
            field1307 = null;
            field1311 = null;
            field1313 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(II)V")
    public static final void method614(int arg0, int arg1) {
        ++field1309;
        class146.field2634.method1121(0, arg1);
        if (arg0 >= 10) {
            class1.field1.method1121(0, arg1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int var3 = 64 % ((-24 - arg1) / 57);
        int[] var4 = super.field2160.method1323((byte) 54, arg0);
        if (super.field2160.field3243) {
            int[] var5 = this.method965(0, arg0, (byte) 62);
            for (int var6 = 0; var6 < class140.field2505; ++var6) {
                var4[var6] = this.field1322 - -(var5[var6] * this.field1316 >> 12);
            }
        }
        ++field1310;
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field1312;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field2147 = arg1.method200(arg2 + -1876195533) == 1;
                }
            } else {
                this.field1308 = arg1.method161(4);
            }
        } else {
            this.field1322 = arg1.method161(4);
        }
        if (arg2 != 1876195788) {
            field1314 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class72() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        if (arg0 != 0) {
            this.method257(105);
        }
        ++field1315;
        this.field1316 = -this.field1322 + this.field1308;
    }
}
