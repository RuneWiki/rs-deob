import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LPVEAYFU")
public class class41 extends class12 {

    @OriginalMember(owner = "LPVEAYFU", name = "x", descriptor = "Z")
    private boolean field1068 = true;

    @OriginalMember(owner = "LPVEAYFU", name = "B", descriptor = "I")
    private int field1072 = 5;

    @OriginalMember(owner = "LPVEAYFU", name = "t", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "LPVEAYFU", name = "u", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "LPVEAYFU", name = "v", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "LPVEAYFU", name = "o", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "LPVEAYFU", name = "p", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "LPVEAYFU", name = "q", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "LPVEAYFU", name = "r", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "LPVEAYFU", name = "n", descriptor = "LIUTBNGPH;")
    private class32 field1058;

    @OriginalMember(owner = "LPVEAYFU", name = "w", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "LPVEAYFU", name = "s", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "LPVEAYFU", name = "z", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "LPVEAYFU", name = "A", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "LPVEAYFU", name = "C", descriptor = "[I")
    public int[] field1073;

    @OriginalMember(owner = "LPVEAYFU", name = "y", descriptor = "Lclient;")
    public static client field1069;

    @OriginalMember(owner = "LPVEAYFU", name = "a", descriptor = "(B)LQMZPELNG;")
    public final class54 method368(byte arg0) {
        int var2 = -1;
        if (arg0 != 35) {
            this.field1072 = -450;
        }
        if (this.field1070 != -1) {
            class13 var3 = class13.field586[this.field1070];
            int var4 = var3.field588;
            int var5 = var3.field589;
            int var6 = var3.field590;
            int var7 = client.field534[var6 - var5];
            var2 = field1069.field414[var4] >> var5 & var7;
        } else if (this.field1071 != -1) {
            var2 = field1069.field414[this.field1071];
        }
        return var2 < 0 || var2 >= this.field1073.length || this.field1073[var2] == -1 ? null : class54.method486(this.field1073[var2]);
    }

    @OriginalMember(owner = "LPVEAYFU", name = "a", descriptor = "(I)LLFTMDGKK;")
    public final class37 method1(int arg0) {
        int var2 = -1;
        if (this.field1058 != null) {
            int var3 = client.field183 - this.field1063;
            if (var3 > 100 && this.field1058.field821 > 0) {
                var3 = 100;
            }
            label50: {
                do {
                    do {
                        if (var3 <= this.field1058.method322((byte) 5, this.field1067)) {
                            break label50;
                        }
                        var3 -= this.field1058.method322((byte) 5, this.field1067);
                        this.field1067++;
                    } while (this.field1067 < this.field1058.field817);
                    this.field1067 -= this.field1058.field821;
                } while (this.field1067 >= 0 && this.field1067 < this.field1058.field817);
                this.field1058 = null;
            }
            this.field1063 = client.field183 - var3;
            if (this.field1058 != null) {
                var2 = this.field1058.field818[this.field1067];
            }
        }
        class54 var4;
        if (this.field1073 == null) {
            var4 = class54.method486(this.field1064);
        } else {
            var4 = this.method368((byte) 35);
        }
        if (var4 == null) {
            return null;
        }
        class37 var5 = var4.method478(this.field1065, this.field1066, this.field1059, this.field1060, this.field1061, this.field1062, var2);
        if (arg0 != 0) {
            this.field1068 = !this.field1068;
        }
        return var5;
    }

    @OriginalMember(owner = "LPVEAYFU", name = "<init>", descriptor = "(BZIIIIIIII)V")
    public class41(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1064 = arg5;
        this.field1065 = arg6;
        this.field1066 = arg7;
        this.field1059 = arg3;
        this.field1060 = arg4;
        this.field1061 = arg8;
        this.field1062 = arg2;
        if (arg9 != -1) {
            this.field1058 = class32.field816[arg9];
            this.field1067 = 0;
            this.field1063 = client.field183;
            if (arg1 && this.field1058.field821 != -1) {
                this.field1067 = (int) (Math.random() * (double) this.field1058.field817);
                this.field1063 -= (int) (Math.random() * (double) this.field1058.method322((byte) 5, this.field1067));
            }
        }
        class54 var11 = class54.method486(this.field1064);
        this.field1070 = var11.field1344;
        this.field1071 = var11.field1375;
        if (arg0 != 1) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        this.field1073 = var11.field1340;
    }
}
