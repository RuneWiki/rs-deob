import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BMMXGYBV")
public class class6 extends class11 {

    @OriginalMember(owner = "client!BMMXGYBV", name = "u", descriptor = "Z")
    private boolean field102 = false;

    @OriginalMember(owner = "client!BMMXGYBV", name = "o", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client!BMMXGYBV", name = "p", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client!BMMXGYBV", name = "q", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client!BMMXGYBV", name = "v", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!BMMXGYBV", name = "w", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client!BMMXGYBV", name = "x", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!BMMXGYBV", name = "y", descriptor = "I")
    private int field106;

    @OriginalMember(owner = "client!BMMXGYBV", name = "z", descriptor = "LKSVXFIAD;")
    private class34 field107;

    @OriginalMember(owner = "client!BMMXGYBV", name = "r", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!BMMXGYBV", name = "t", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!BMMXGYBV", name = "m", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!BMMXGYBV", name = "n", descriptor = "I")
    public int field95;

    @OriginalMember(owner = "client!BMMXGYBV", name = "l", descriptor = "[I")
    public int[] field93;

    @OriginalMember(owner = "client!BMMXGYBV", name = "s", descriptor = "Lclient;")
    public static client field100;

    @OriginalMember(owner = "client!BMMXGYBV", name = "<init>", descriptor = "(IIIIIIIIZI)V")
    public class6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field96 = arg2;
        this.field97 = arg0;
        this.field98 = arg9;
        this.field103 = arg7;
        this.field104 = arg6;
        this.field105 = arg5;
        this.field106 = arg1;
        if (arg4 != -1) {
            this.field107 = class34.field1140[arg4];
            this.field99 = 0;
            this.field101 = client.field493;
            if (arg8 && this.field107.field1145 != -1) {
                this.field99 = (int) (Math.random() * (double) this.field107.field1141);
                this.field101 -= (int) (Math.random() * (double) this.field107.method375((byte) -37, this.field99));
            }
        }
        class55 var11 = class55.method499(this.field96);
        if (arg3 < 2 || arg3 > 2) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        this.field94 = var11.field1468;
        this.field95 = var11.field1466;
        this.field93 = var11.field1516;
    }

    @OriginalMember(owner = "client!BMMXGYBV", name = "a", descriptor = "(I)LOGORHYVW;")
    public final class45 method5(int arg0) {
        int var2 = -1;
        if (this.field107 != null) {
            int var3 = client.field493 - this.field101;
            if (var3 > 100 && this.field107.field1145 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field107.method375((byte) -37, this.field99)) {
                            break label45;
                        }
                        var3 -= this.field107.method375((byte) -37, this.field99);
                        this.field99++;
                    } while (this.field99 < this.field107.field1141);
                    this.field99 -= this.field107.field1145;
                } while (this.field99 >= 0 && this.field99 < this.field107.field1141);
                this.field107 = null;
            }
            this.field101 = client.field493 - var3;
            if (this.field107 != null) {
                var2 = this.field107.field1142[this.field99];
            }
        }
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        class55 var4;
        if (this.field93 == null) {
            var4 = class55.method499(this.field96);
        } else {
            var4 = this.method11(363);
        }
        return var4 == null ? null : var4.method496(this.field97, this.field98, this.field103, this.field104, this.field105, this.field106, var2);
    }

    @OriginalMember(owner = "client!BMMXGYBV", name = "b", descriptor = "(I)LSOLNFIIQ;")
    public final class55 method11(int arg0) {
        int var2 = -1;
        if (arg0 <= 0) {
            this.field102 = !this.field102;
        }
        if (this.field94 != -1) {
            class60 var3 = class60.field1604[this.field94];
            int var4 = var3.field1606;
            int var5 = var3.field1607;
            int var6 = var3.field1608;
            int var7 = client.field632[var6 - var5];
            var2 = field100.field511[var4] >> var5 & var7;
        } else if (this.field95 != -1) {
            var2 = field100.field511[this.field95];
        }
        return var2 < 0 || var2 >= this.field93.length || this.field93[var2] == -1 ? null : class55.method499(this.field93[var2]);
    }
}
