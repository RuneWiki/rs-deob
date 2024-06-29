import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class585 {

    @OriginalMember(owner = "client!po", name = "f", descriptor = "J")
    private long field7981;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    private int field7978;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field7977 = -1;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field7976;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lso;[IBI)Lcg;")
    public static final class149 method3361(class496 arg0, int[] arg1, byte arg2, int arg3) {
        field7979++;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        float[][] var7 = null;
        if (arg2 != -51) {
            field7977 = 6;
        }
        if (arg0.field6915 != null) {
            int var8 = arg0.field6911;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; var15++) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            var6 = new int[var8];
            var7 = new float[var8][];
            var4 = new int[var8];
            for (int var16 = 0; var16 < arg3; var16++) {
                int var23 = arg1[var16];
                if (arg0.field6915[var23] != -1) {
                    int var24 = arg0.field6915[var23] & 0xFF;
                    for (int var25 = 0; var25 < 3; var25++) {
                        short var26;
                        if (var25 == 0) {
                            var26 = arg0.field6900[var23];
                        } else if (var25 == 1) {
                            var26 = arg0.field6936[var23];
                        } else {
                            var26 = arg0.field6921[var23];
                        }
                        int var27 = arg0.field6926[var26];
                        int var28 = arg0.field6913[var26];
                        int var29 = arg0.field6894[var26];
                        if (var9[var24] > var27) {
                            var9[var24] = var27;
                        }
                        if (var27 > var10[var24]) {
                            var10[var24] = var27;
                        }
                        if (var28 < var11[var24]) {
                            var11[var24] = var28;
                        }
                        if (var28 > var12[var24]) {
                            var12[var24] = var28;
                        }
                        if (var13[var24] > var29) {
                            var13[var24] = var29;
                        }
                        if (var29 > var14[var24]) {
                            var14[var24] = var29;
                        }
                    }
                }
            }
            var5 = new int[var8];
            for (int var17 = 0; var17 < var8; var17++) {
                byte var18 = arg0.field6898[var17];
                if (var18 > 0) {
                    var4[var17] = (var9[var17] + var10[var17]) / 2;
                    var5[var17] = (var11[var17] + var12[var17]) / 2;
                    var6[var17] = (var13[var17] + var14[var17]) / 2;
                    float var20;
                    float var21;
                    float var22;
                    if (var18 == 1) {
                        int var19 = arg0.field6945[var17];
                        var20 = 64.0F / (float) arg0.field6922[var17];
                        if (var19 == 0) {
                            var22 = 1.0F;
                            var21 = 1.0F;
                        } else if (var19 <= 0) {
                            var21 = (float) (-var19) / 1024.0F;
                            var22 = 1.0F;
                        } else {
                            var21 = 1.0F;
                            var22 = (float) var19 / 1024.0F;
                        }
                    } else if (var18 == 2) {
                        var20 = 64.0F / (float) arg0.field6922[var17];
                        var21 = 64.0F / (float) arg0.field6945[var17];
                        var22 = 64.0F / (float) arg0.field6925[var17];
                    } else {
                        var20 = (float) arg0.field6922[var17] / 1024.0F;
                        var21 = (float) arg0.field6945[var17] / 1024.0F;
                        var22 = (float) arg0.field6925[var17] / 1024.0F;
                    }
                    var7[var17] = class267.method1582(arg0.field6937[var17], var20, (byte) 23, var22, class296.method1733(255, arg0.field6929[var17]), arg0.field6932[var17], arg0.field6895[var17], var21);
                }
            }
        }
        return new class149(var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)I")
    private final int method3362(int arg0, int arg1) {
        field7976++;
        if (arg1 != 15) {
            field7977 = -115;
        }
        return (int) (this.field7981 >> class504.field7137 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(II)Llia;")
    public final class504 method3363(int arg0, int arg1) {
        if (arg1 != -3) {
            this.method3365(-79);
        }
        field7982++;
        return class504.method3026(-15281, this.method3362(arg0, 15));
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BLlia;)V")
    private final void method3364(byte arg0, class504 arg1) {
        this.field7981 |= (arg1.field7131 << class504.field7137 * this.field7978++);
        field7983++;
        if (arg0 >= -21) {
            method3361(null, null, (byte) -79, -62);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)I")
    public final int method3365(int arg0) {
        if (arg0 != 0) {
            field7977 = 4;
        }
        field7980++;
        return this.field7978;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Llia;)V")
    public class585(class504 arg0) {
        this.field7981 = arg0.field7131;
        this.field7978 = 1;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "([Llia;)V")
    public class585(class504[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method3364((byte) -101, arg0[var2]);
        }
    }
}
