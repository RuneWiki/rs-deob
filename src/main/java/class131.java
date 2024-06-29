import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class131 extends class264 {

    @OriginalMember(owner = "client!jg", name = "ib", descriptor = "Z")
    private boolean field1960 = true;

    @OriginalMember(owner = "client!jg", name = "gb", descriptor = "Z")
    private boolean field1958 = true;

    @OriginalMember(owner = "client!jg", name = "hb", descriptor = "Lma;")
    private static class5 field1959 = class12.method119("Loading wordpack )2 ", (byte) 81);

    @OriginalMember(owner = "client!jg", name = "mb", descriptor = "Lma;")
    public static class5 field1964 = field1959;

    @OriginalMember(owner = "client!jg", name = "lb", descriptor = "Ltj;")
    public static class73 field1963 = new class73(64);

    @OriginalMember(owner = "client!jg", name = "nb", descriptor = "Lma;")
    public static class5 field1965 = class12.method119("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", (byte) 117);

    @OriginalMember(owner = "client!jg", name = "pb", descriptor = "[Lma;")
    public static class5[] field1967 = new class5[100];

    @OriginalMember(owner = "client!jg", name = "ob", descriptor = "Lma;")
    public static class5 field1966 = class12.method119("mapflag", (byte) 79);

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!jg", name = "jb", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!jg", name = "kb", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 7)
    public class131() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(BI)[[I", line = 18)
    public final int[][] method138(byte arg0, int arg1) {
        int var3 = -61 % ((-arg0 - 43) / 55);
        field1961++;
        int[][] var4 = this.field4524.method1462(-15077, arg1);
        if (this.field4524.field3506) {
            int[][] var5 = this.method1817(-94, 0, this.field1958 ? class68.field1082 - arg1 : arg1);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (this.field1960) {
                for (int var13 = 0; var13 < class226.field3716; var13++) {
                    var9[var13] = var6[class256.field4370 - var13];
                    var10[var13] = var8[class256.field4370 - var13];
                    var11[var13] = var7[class256.field4370 - var13];
                }
            } else {
                for (int var12 = 0; var12 < class226.field3716; var12++) {
                    var9[var12] = var6[var12];
                    var10[var12] = var8[var12];
                    var11[var12] = var7[var12];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)V", line = 82)
    public static void method863(boolean arg0) {
        field1963 = null;
        field1966 = null;
        field1965 = null;
        field1964 = null;
        field1967 = null;
        field1959 = null;
        if (arg0) {
            field1959 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)[I", line = 106)
    public final int[] method5(int arg0, int arg1) {
        field1962++;
        if (arg0 >= -58) {
            return (int[]) null;
        }
        int[] var3 = this.field4501.method1176(arg1, 126);
        if (this.field4501.field2741) {
            int[] var4 = this.method1815(0, this.field1958 ? class68.field1082 - arg1 : arg1, -121);
            if (this.field1960) {
                for (int var5 = 0; var5 < class226.field3716; var5++) {
                    var3[var5] = var4[class256.field4370 - var5];
                }
            } else {
                class42.method293(var4, 0, var3, 0, class226.field3716);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILii;)V", line = 150)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 > -27) {
            this.method5(84, -23);
        }
        field1957++;
        if (arg0 == 0) {
            this.field1960 = arg2.method1509(true) == 1;
        } else if (arg0 == 1) {
            this.field1958 = arg2.method1509(true) == 1;
        } else if (arg0 == 2) {
            this.field4496 = arg2.method1509(true) == 1;
        }
    }
}
