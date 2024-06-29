import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class90 extends class642 {

    @OriginalMember(owner = "client!wea", name = "B", descriptor = "I")
    private int field1368 = -1;

    @OriginalMember(owner = "client!wea", name = "E", descriptor = "[I")
    public static int[] field1371 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!wea", name = "N", descriptor = "Lau;")
    public static class692 field1380 = new class692(64);

    @OriginalMember(owner = "client!wea", name = "C", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!wea", name = "D", descriptor = "I")
    private int field1370;

    @OriginalMember(owner = "client!wea", name = "F", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!wea", name = "I", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!wea", name = "J", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "client!wea", name = "K", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!wea", name = "L", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!wea", name = "M", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!wea", name = "O", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!wea", name = "G", descriptor = "Lgw;")
    public static class73 field1373;

    @OriginalMember(owner = "client!wea", name = "H", descriptor = "[I")
    private int[] field1374;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(B)V", line = 6)
    public static void method501(byte arg0) {
        field1371 = null;
        field1380 = null;
        field1373 = null;
        if (arg0 > -13) {
            field1380 = null;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IBI)V", line = 20)
    public final void method502(int arg0, byte arg1, int arg2) {
        ++field1381;
        super.method502(arg0, arg1, arg2);
        if (~this.field1368 <= -1 && class564.field8243 != null) {
            int var4 = !class564.field8243.method955(-1330, this.field1368).field6610 ? 128 : 64;
            this.field1374 = class564.field8243.method958(1.0F, var4, -17786, false, var4, this.field1368);
            this.field1370 = var4;
            this.field1376 = var4;
        }
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V", line = 46)
    public final void method503(int arg0) {
        ++field1377;
        super.method503(arg0);
        this.field1374 = null;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)[[I", line = 55)
    public final int[][] method138(int arg0, int arg1) {
        ++field1378;
        int[][] var3 = super.field9211.method1068(arg0 ^ arg0, arg1);
        if (super.field9211.field2131) {
            int var4 = this.field1376 * (class106.field1578 == this.field1370 ? arg1 : this.field1370 * arg1 / class106.field1578);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class338.field4909 == this.field1376) {
                for (int var8 = 0; ~var8 > ~class338.field4909; ++var8) {
                    int var9 = this.field1374[var4++];
                    var7[var8] = class425.method2563(var9, 255) << 4;
                    var6[var8] = class425.method2563(var9, 65280) >> 4;
                    var5[var8] = class425.method2563(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~var10 > ~class338.field4909; ++var10) {
                    int var11 = this.field1376 * var10 / class338.field4909;
                    int var12 = this.field1374[var4 - -var11];
                    var7[var10] = class425.method2563(var12, 255) << 4;
                    var6[var10] = class425.method2563(65280, var12) >> 4;
                    var5[var10] = class425.method2563(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)I", line = 121)
    public final int method504(int arg0) {
        ++field1372;
        int var2 = 106 / ((-74 - arg0) / 33);
        return this.field1368;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILgk;B)V", line = 132)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg2 > 29) {
            if (arg0 == 0) {
                this.field1368 = arg1.method3169(26488);
            }
            ++field1375;
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "()V", line = 153)
    public class90() {
        super(0, false);
    }
}
