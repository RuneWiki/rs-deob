import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class108 {

    @OriginalMember(owner = "client!hba", name = "F", descriptor = "Lhv;")
    public static class546 field159 = new class546(3, 2);

    @OriginalMember(owner = "client!hba", name = "K", descriptor = "I")
    public static int field164 = 0;

    @OriginalMember(owner = "client!hba", name = "M", descriptor = "S")
    public static short field166 = 320;

    @OriginalMember(owner = "client!hba", name = "N", descriptor = "[I")
    public static int[] field167 = new int[14];

    @OriginalMember(owner = "client!hba", name = "L", descriptor = "Leo;")
    public static class314 field165 = new class314();

    @OriginalMember(owner = "client!hba", name = "D", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!hba", name = "E", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!hba", name = "G", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!hba", name = "H", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!hba", name = "J", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!hba", name = "O", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!hba", name = "I", descriptor = "[B")
    private byte[] field162;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V")
    public static final void method82(int arg0, int arg1) {
        field163++;
        class16 var2 = class94.method753(arg0, 13175, (long) arg1);
        var2.method118(585134072);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIII)[B")
    public final byte[] method83(int arg0, int arg1, int arg2, int arg3) {
        field158++;
        int var5 = 24 / ((-arg0 - 9) / 47);
        this.field162 = new byte[arg1 * arg2 * arg3 * 2];
        this.method1751((byte) -63, arg3, arg1, arg2);
        return this.field162;
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(B)V")
    public static void method84(byte arg0) {
        field167 = null;
        field159 = null;
        field165 = null;
        if (arg0 != 25) {
            method84((byte) -43);
        }
    }

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "(I)V")
    public static final void method85(int arg0) {
        field157++;
        class513.field7036++;
        class267 var1 = class545.method3099((byte) 37, class269.field3966, class87.field1215);
        if (arg0 != 1624) {
            return;
        }
        var1.field3938.method2380(65280, class485.method2816(72));
        var1.field3938.method2415(false, class593.field8019);
        var1.field3938.method2415(false, class140.field2048);
        var1.field3938.method2380(65280, class712.field9959.field1271.method2880(4));
        class617.method3392(var1, true);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IBB)V")
    public final void method86(int arg0, byte arg1, byte arg2) {
        field160++;
        byte var4 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        int var5 = -93 % ((-arg1 - 75) / 40);
        int var6 = arg0 * 2;
        int var10001 = var6;
        int var7 = var6 + 1;
        this.field162[var10001] = var4;
        this.field162[var7] = var4;
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "()V")
    public class10() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "([I[ILai;III)Lmh;")
    public static final class659 method87(int[] arg0, int[] arg1, class626 arg2, int arg3, int arg4, int arg5) {
        if (arg5 > -6) {
            field164 = -44;
        }
        field161++;
        if (!arg2.method863(class250.field3704, -2, class258.field3847)) {
            int[] var10 = new int[arg3 * arg4];
            for (int var11 = 0; var11 < arg3; var11++) {
                int var12 = arg4 * var11 + arg1[var11];
                for (int var13 = 0; var13 < arg0[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class659(arg2, arg4, arg3, var10);
        }
        byte[] var6 = new byte[arg3 * arg4];
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg4 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class659(arg2, arg4, arg3, var6);
    }
}
