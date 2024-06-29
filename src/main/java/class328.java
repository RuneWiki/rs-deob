import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class328 extends class311 {

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public int field4453 = 0;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "[[I")
    public static int[][] field4450 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field4461 = new String[200];

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public int field4447;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public int field4449;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public int field4451;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public int field4458;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public int field4459;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public int field4464;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public int field4466;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public int field4467;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public int field4470;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public int field4471;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "Lqe;")
    public class148 field4452;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Lqe;")
    public class148 field4460;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "Lrd;")
    public class419 field4469;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "Lof;")
    public class423 field4457;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Lp;")
    public class447 field4454;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Z")
    public boolean field4455;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "[I")
    public int[] field4463;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "[Lwn;")
    public static class77[] field4462;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IJ)V", line = 6)
    public static final void method1999(int arg0, long arg1) {
        if (arg0 != 0) {
            field4462 = null;
        }
        field4456++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class84.method673((byte) -123, arg1 - 1L);
            class84.method673((byte) -123, 1L);
        } else {
            class84.method673((byte) -124, arg1);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V", line = 46)
    public final void method2000(boolean arg0) {
        field4468++;
        int var2 = this.field4458;
        if (this.field4454 != null) {
            class447 var3 = this.field4454.method2772(-123);
            if (var3 == null) {
                this.field4470 = 0;
                this.field4463 = null;
                this.field4464 = 0;
                this.field4449 = 0;
                this.field4471 = 0;
                this.field4458 = -1;
            } else {
                this.field4471 = var3.field6313;
                this.field4449 = var3.field6318;
                this.field4464 = var3.field6311;
                this.field4470 = var3.field6333 * 128;
                this.field4463 = var3.field6300;
                this.field4458 = var3.field6281;
            }
        } else if (this.field4469 != null) {
            int var4 = class403.method2492(this.field4469, false);
            if (var2 != var4) {
                this.field4458 = var4;
                class233 var5 = this.field4469.field5807;
                if (var5.field3327 != null) {
                    var5 = var5.method1524((byte) 92);
                }
                if (var5 == null) {
                    this.field4464 = this.field4470 = 0;
                } else {
                    this.field4464 = var5.field3333;
                    this.field4470 = var5.field3266 * 128;
                }
            }
        } else if (this.field4457 != null) {
            this.field4458 = class47.method389(this.field4457, false);
            this.field4464 = this.field4457.field5889;
            this.field4470 = this.field4457.field5852 * 128;
        }
        if (this.field4458 != var2 && this.field4452 != null) {
            class48.field616.method1128(this.field4452);
            this.field4452 = null;
        }
        if (arg0) {
            this.method2000(false);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V", line = 131)
    public static void method2001(byte arg0) {
        if (arg0 <= 24) {
            field4448 = 46;
        }
        field4461 = null;
        field4462 = null;
        field4450 = null;
    }
}
