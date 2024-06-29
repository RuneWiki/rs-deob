import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class425 extends class105 {

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    private int field6179;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    private int field6175;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    private int field6172;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    private int field6178;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V")
    public static final void method2617(int arg0, int arg1) {
        class31 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class38 var4 = class14.field152[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class114.field1494; ++var5) {
                    for (int var6 = 0; var6 < class515.field7487; ++var6) {
                        var2 = var4.method221(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class351.field4688;
                            int var8 = var5 << class351.field4688;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class38 var10 = class14.field152[var9];
                                if (var10 != null) {
                                    int var11 = var4.method217(var6, var5) - var10.method217(var6, var5);
                                    int var12 = var4.method217(var6 + 1, var5) - var10.method217(var6 + 1, var5);
                                    int var13 = var4.method217(var6 + 1, var5 + 1) - var10.method217(var6 + 1, var5 + 1);
                                    int var14 = var4.method217(var6, var5 + 1) - var10.method217(var6, var5 + 1);
                                    var10.method214(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZ)V")
    public final void method637(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2618(21, 124);
        }
        ++field6177;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
    public final void method640(int arg0, int arg1, int arg2) {
        ++field6171;
        if (arg1 != -3686) {
            method2617(90, 110);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(II)I")
    public static final int method2618(int arg0, int arg1) {
        int var2 = (arg1 >>> 1 & -715827883) + (1431655765 & arg1);
        ++field6176;
        int var3 = ((-858993457 & var2) >>> 2) + (858993459 & var2);
        int var4 = (var3 >>> 4) + var3 & 252645135;
        int var5 = (var4 >>> 8) + var4;
        if (arg0 != 13227) {
            return -25;
        } else {
            int var6 = (var5 >>> 16) + var5;
            return var6 & 255;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
    public final void method638(int arg0, int arg1, int arg2) {
        if (arg0 < 4) {
            this.method640(-116, 37, -125);
        }
        ++field6174;
        int var4 = this.field6172 * arg1 >> 12;
        int var5 = this.field6178 * arg1 >> 12;
        int var6 = this.field6179 * arg2 >> 12;
        int var7 = this.field6175 * arg2 >> 12;
        class87.method477(var5, var4, var6, 87, super.field1411, var7);
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIII)V")
    public class425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field6179 = arg1;
        this.field6175 = arg3;
        this.field6172 = arg0;
        this.field6178 = arg2;
    }
}
