import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class274 {

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "Lwd;")
    public class229 field3798 = new class229();

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "Z")
    public boolean field3803 = false;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "Lcba;")
    public static class471 field3796 = new class471(41, 3);

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lqa;)V")
    public static final void method1769(class207 arg0) {
        for (int var1 = class244.field3410; var1 < class395.field5610; var1++) {
            for (int var2 = 0; var2 < class332.field4447; var2++) {
                for (int var3 = 0; var3 < class34.field624; var3++) {
                    class622 var4 = class356.field4807[var1][var2][var3];
                    if (var4 != null) {
                        class344 var5 = var4.field8985;
                        class344 var6 = var4.field8982;
                        if (var5 != null && var5.method264(1)) {
                            class297.method1894(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method264(1)) {
                                class297.method1894(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method258(0, false, 85, 0, var5, 0, arg0);
                                var6.method262(1);
                            }
                            var5.method262(1);
                        }
                        for (class559 var7 = var4.field8973; var7 != null; var7 = var7.field7736) {
                            class425 var9 = var7.field7742;
                            if (var9 != null && var9.method264(1)) {
                                class297.method1894(arg0, var9, var1, var2, var3, var9.field6030 + 1 - var9.field6036, var9.field6031 - var9.field6028 + 1);
                                var9.method262(1);
                            }
                        }
                        class197 var8 = var4.field8979;
                        if (var8 != null && var8.method264(1)) {
                            class113.method795(arg0, var8, var1, var2, var3);
                            var8.method262(1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public static void method1770(byte arg0) {
        field3796 = null;
        if (arg0 < 18) {
            method1771(32, -11, -100);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)Z")
    public static final boolean method1771(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method1769(null);
        }
        field3800++;
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLmc;Z)V")
    public static final void method1772(byte arg0, class114 arg1, boolean arg2) {
        field3797++;
        int var3 = arg1.field1846 == 0 ? arg1.field1853 : arg1.field1846;
        int var4 = arg1.field1802 == 0 ? arg1.field1769 : arg1.field1802;
        class440.method2598(class618.field8850[arg1.field1810 >> 16], var4, var3, arg2, arg1.field1810, 127);
        if (arg1.field1886 != null) {
            class440.method2598(arg1.field1886, var4, var3, arg2, arg1.field1810, 119);
        }
        if (arg0 != -122) {
            method1770((byte) -108);
        }
        class128 var5 = (class128) class211.field2971.method1242(arg0 + 122, (long) arg1.field1810);
        if (var5 != null) {
            class595.method3520(var3, var4, var5.field2065, arg2, false);
        }
    }
}
