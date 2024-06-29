import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class354 extends class601 {

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    private int field4318 = -1;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
    public int field4319;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "I")
    public int field4321;

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!cs", name = "O", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!cs", name = "P", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "[I")
    public int[] field4320;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "(I)V")
    public static final void method2036(int arg0) {
        ++field4322;
        class26.method113((byte) 95, 11);
        class363.method2086(true);
        int var1 = -97 / (-arg0 / 39);
        System.gc();
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(II)[[I")
    public int[][] method638(int arg0, int arg1) {
        ++field4326;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306 && this.method2037((byte) -126)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class418.field5514 != this.field4319 ? this.field4319 * arg1 / class418.field5514 : arg1) * this.field4321;
            if (class418.field5518 == this.field4321) {
                for (int var8 = 0; ~var8 > ~class418.field5518; ++var8) {
                    int var9 = this.field4320[var7++];
                    var6[var8] = class249.method1625(var9, 255) << 4;
                    var5[var8] = class249.method1625(var9, 65280) >> 4;
                    var4[var8] = class249.method1625(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; class418.field5518 > var10; ++var10) {
                    int var11 = this.field4321 * var10 / class418.field5518;
                    int var12 = this.field4320[var7 + var11];
                    var6[var10] = class249.method1625(4080, var12 << 4);
                    var5[var10] = class249.method1625(65280, var12) >> 4;
                    var4[var10] = class249.method1625(4080, var12 >> 12);
                }
            }
        }
        if (arg0 != 2017) {
            this.field4319 = -24;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
    public class354() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(B)Z")
    public final boolean method2037(byte arg0) {
        ++field4324;
        if (arg0 >= -84) {
            this.method2039(-88);
        }
        if (this.field4320 != null) {
            return true;
        } else if (~this.field4318 <= -1) {
            class388 var2 = ~class305.field3843 <= -1 ? class388.method2232(class121.field1629, class305.field3843, this.field4318) : class388.method2239(class121.field1629, this.field4318);
            var2.method2231();
            this.field4320 = var2.method2233();
            this.field4321 = var2.field4950;
            this.field4319 = var2.field4946;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public final void method2038(byte arg0) {
        int var2 = -115 % ((-47 - arg0) / 58);
        super.method2038((byte) -113);
        ++field4325;
        this.field4320 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
    public final int method2039(int arg0) {
        if (arg0 != -1) {
            return -17;
        } else {
            ++field4323;
            return this.field4318;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field4317;
        int var4 = -59 % ((40 - arg2) / 52);
        if (arg1 == 0) {
            this.field4318 = arg0.method1553((byte) 86);
        }
    }
}
