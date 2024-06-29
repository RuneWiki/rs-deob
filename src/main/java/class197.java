import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class197 extends class102 {

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "Lr;")
    public static class66 field3406 = class93.method641(43, ":");

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field3403 = 0;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field3407 = 0;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public int field3405;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "Lr;")
    public class66 field3412;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)I")
    public final int method1283(int arg0) {
        ++field3409;
        if (arg0 != -1597153401) {
            this.method1288((byte) -37);
        }
        return (int) super.field1560;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
    public final void method1284(int arg0) {
        ++field3408;
        super.field1990 |= Long.MIN_VALUE;
        if ((long) arg0 == this.method1285(arg0 + 255)) {
            class98.field1921.method1135(arg0 ^ 75, this);
        }
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)J")
    public final long method1285(int arg0) {
        if (arg0 != 255) {
            field3406 = null;
        }
        ++field3411;
        return super.field1990 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static void method1286(boolean arg0) {
        if (arg0) {
            field3407 = 85;
        }
        field3406 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBI)V")
    public static final void method1287(int arg0, byte arg1, int arg2) {
        ++field3410;
        class125 var3 = class63.field1249[class196.field3401][arg0][arg2];
        if (var3 == null) {
            class24.method106(class196.field3401, arg0, arg2);
        } else {
            if (arg1 != -52) {
                method1287(-71, (byte) -68, -62);
            }
            int var4 = -99999999;
            class216 var5 = (class216) var3.method873((byte) 76);
            class216 var6 = null;
            while (var5 != null) {
                class157 var13 = class40.method242(-25672, var5.field3713.field60);
                int var14 = var13.field2826;
                if (~var13.field2832 == -2) {
                    var14 = (var5.field3713.field65 + 1) * var14;
                }
                if (~var4 > ~var14) {
                    var4 = var14;
                    var6 = var5;
                }
                var5 = (class216) var3.method870((byte) 67);
            }
            if (var6 == null) {
                class24.method106(class196.field3401, arg0, arg2);
            } else {
                var3.method871((byte) 43, var6);
                class216 var7 = (class216) var3.method873((byte) 76);
                class7 var8 = null;
                class7 var9 = null;
                while (var7 != null) {
                    class7 var12 = var7.field3713;
                    if (~var6.field3713.field60 != ~var12.field60) {
                        if (var9 == null) {
                            var9 = var12;
                        }
                        if (var9.field60 != var12.field60 && var8 == null) {
                            var8 = var12;
                        }
                    }
                    var7 = (class216) var3.method870((byte) -125);
                }
                long var10 = (long) ((arg2 << 7) + arg0 + 1610612736);
                class260.method1776(class196.field3401, arg0, arg2, class45.method327(arg0 * 128 + 64, class196.field3401, arg2 * 128 - -64, false), var6.field3713, var10, var9, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V")
    public class197(int arg0, int arg1) {
        super.field1560 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
    public final void method1288(byte arg0) {
        int var2 = 17 / ((arg0 - 9) / 37);
        super.field1990 = Long.MIN_VALUE & super.field1990 | 500L + class3.method13(17161);
        class19.field251.method1135(124, this);
        ++field3413;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)I")
    public final int method1289(boolean arg0) {
        ++field3404;
        if (arg0) {
            method1286(true);
        }
        return (int) (255L & super.field1560 >>> 32);
    }
}
