import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class30 {

    @OriginalMember(owner = "client!hba", name = "D", descriptor = "Lem;")
    public static class206 field97 = new class206(30, -1);

    @OriginalMember(owner = "client!hba", name = "E", descriptor = "Lem;")
    public static class206 field98 = new class206(39, 6);

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!hba", name = "A", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!hba", name = "C", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!hba", name = "B", descriptor = "Lln;")
    public static class345 field95;

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "()V")
    public class10() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(B)I")
    public static final int method47(byte arg0) {
        if (arg0 < 2) {
            return -125;
        } else {
            ++field94;
            if (class541.field7327) {
                return 6;
            } else if (class84.field1244 == null) {
                return 0;
            } else {
                int var1 = class84.field1244.field6780;
                if (class483.method2713(28934, var1)) {
                    return 1;
                } else if (class420.method2434(var1, (byte) -35)) {
                    return 2;
                } else if (class556.method3115(30916, var1)) {
                    return 3;
                } else {
                    return class628.method3514(var1, (byte) 49) ? 4 : 5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field96;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (arg0 != 1) {
            field98 = null;
        }
        if (super.field374.field9032) {
            int[][] var4 = this.method292(arg0 ^ 106, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class31.field399 > var8; ++var8) {
                var3[var8] = (var5[var8] - (-var6[var8] - var7[var8])) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "(I)V")
    public static void method49(int arg0) {
        field95 = null;
        field97 = null;
        field98 = null;
        if (arg0 > -58) {
            method47((byte) -5);
        }
    }
}
