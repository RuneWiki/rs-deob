import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class388 extends class55 {

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public int field5475;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public int field5469;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "[I")
    public int[] field5477;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "[I")
    public int[] field5472;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "[Z")
    public boolean[] field5470;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "[[I")
    public int[][] field5478;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Llga;")
    public static class712 field5471 = new class712(67, 8);

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILha;BZ)Lda;")
    public static final class61 method2265(int arg0, class60 arg1, byte arg2, boolean arg3) {
        if (arg2 < 74) {
            return null;
        } else {
            field5479++;
            class535 var4 = class175.method1005(arg0, arg3, arg1, true);
            return var4 == null ? null : var4.field7254;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILsba;)V")
    public static final void method2266(int arg0, int arg1, int arg2, class218 arg3) {
        field5473++;
        class21.field151 = arg3;
        if (arg1 <= -104) {
            class571.field8036 = arg2;
            class441.field6155 = arg0;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method2267(int arg0) {
        field5471 = null;
        if (arg0 != -20899) {
            field5471 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I[B)V")
    public class388(int arg0, byte[] arg1) {
        this.field5475 = arg0;
        class611 var3 = new class611(arg1);
        this.field5469 = var3.method3428((byte) 38);
        this.field5477 = new int[this.field5469];
        this.field5472 = new int[this.field5469];
        this.field5470 = new boolean[this.field5469];
        this.field5478 = new int[this.field5469][];
        for (int var4 = 0; var4 < this.field5469; var4++) {
            this.field5472[var4] = var3.method3428((byte) -126);
            if (this.field5472[var4] == 6) {
                this.field5472[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field5469; var5++) {
            this.field5470[var5] = var3.method3428((byte) -128) == 1;
        }
        for (int var6 = 0; var6 < this.field5469; var6++) {
            this.field5477[var6] = var3.method3402((byte) 127);
        }
        for (int var7 = 0; var7 < this.field5469; var7++) {
            this.field5478[var7] = new int[var3.method3428((byte) -119)];
        }
        for (int var8 = 0; var8 < this.field5469; var8++) {
            for (int var9 = 0; var9 < this.field5478[var8].length; var9++) {
                this.field5478[var8][var9] = var3.method3428((byte) 125);
            }
        }
    }
}
