import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class253 extends class408 {

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    private int field3644;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "Lqe;")
    public static class469 field3647 = new class469(68, 1);

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "[Lps;")
    public class97[] field3650;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[[B")
    private byte[][] field3639;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lrg;I)Ljava/lang/String;", line = 3)
    public static final String method1663(class645 arg0, int arg1) {
        if (arg1 != -26790) {
            field3647 = null;
        }
        field3643++;
        return class587.method3397(32767, (byte) -108, arg0);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Z", line = 17)
    public final boolean method1664(byte arg0) {
        field3645++;
        if (this.field3650 != null) {
            return true;
        }
        if (this.field3639 == null) {
            class39 var2 = class74.field1033;
            synchronized (class74.field1033) {
                if (!class74.field1033.method219(2, this.field3644)) {
                    return false;
                }
                int[] var4 = class74.field1033.method223(-96, this.field3644);
                this.field3639 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field3639[var5] = class74.field1033.method211(true, this.field3644, var4[var5]);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field3639.length; var7++) {
            byte[] var8 = this.field3639[var7];
            class645 var9 = new class645(var8);
            var9.field9084 = 1;
            int var10 = var9.method3712((byte) -105);
            class39 var11 = class228.field3354;
            synchronized (class228.field3354) {
                var6 &= class228.field3354.method208(var10, (byte) 70);
            }
        }
        if (!var6) {
            return false;
        }
        class164 var12 = new class164();
        class39 var13 = class74.field1033;
        int[] var15;
        synchronized (class74.field1033) {
            int var14 = class74.field1033.method229(this.field3644, 0);
            this.field3650 = new class97[var14];
            var15 = class74.field1033.method223(50, this.field3644);
        }
        int var16 = 123 % ((67 - arg0) / 52);
        for (int var17 = 0; var17 < var15.length; var17++) {
            byte[] var18 = this.field3639[var17];
            class645 var19 = new class645(var18);
            var19.field9084 = 1;
            int var20 = var19.method3712((byte) -109);
            class173 var21 = null;
            for (class173 var22 = (class173) var12.method1195(0); var22 != null; var22 = (class173) var12.method1201(2)) {
                if (var22.field2681 == var20) {
                    var21 = var22;
                    break;
                }
            }
            if (var21 == null) {
                class39 var23 = class228.field3354;
                synchronized (class228.field3354) {
                    var21 = new class173(var20, class228.field3354.method226(77, var20));
                }
                var12.method1203(var21, (byte) 99);
            }
            this.field3650[var15[var17]] = new class97(var18, var21);
        }
        this.field3639 = null;
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)V", line = 128)
    public static void method1665(byte arg0) {
        field3647 = null;
        int var1 = 51 / ((arg0 - 20) / 61);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)Z", line = 139)
    public final boolean method1666(int arg0, int arg1) {
        field3640++;
        if (arg1 != 10963) {
            method1669(-127, '\u0013');
        }
        return this.field3650[arg0].field1375;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)Z", line = 151)
    public final boolean method1667(int arg0, boolean arg1) {
        field3641++;
        return arg1 ? true : this.field3650[arg0].field1363;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)Z", line = 162)
    public final boolean method1668(int arg0, int arg1) {
        field3646++;
        if (arg1 != 21665) {
            field3647 = null;
        }
        return this.field3650[arg0].field1361;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IC)I", line = 174)
    public static final int method1669(int arg0, char arg1) {
        field3648++;
        return arg0 >= ~arg1 && class368.field5296.length > arg1 ? class368.field5296[arg1] : -1;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V", line = 193)
    public class253(int arg0) {
        this.field3644 = arg0;
    }
}
