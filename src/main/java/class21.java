import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class21 {

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Lpn;")
    public static class523 field236 = new class523("", 10);

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field240 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lsb;")
    public static class191 field238;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method187(byte arg0) {
        field240 = null;
        field236 = null;
        if (arg0 < -53) {
            field238 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIB)V")
    public static final void method188(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field235++;
        for (class307 var5 = (class307) class134.field1942.method1018(76); var5 != null; var5 = (class307) class134.field1942.method1022((byte) -112)) {
            class465.method2787(true, arg3, arg0, arg2, var5, arg1);
        }
        class307 var6 = (class307) class250.field3680.method1018(61);
        if (arg4 != -107) {
            field239 = 91;
        }
        while (var6 != null) {
            byte var11 = 1;
            class531 var12 = var6.field4349.method969(-1);
            if (var6.field4349.field1743) {
                var11 = 0;
            } else if (var6.field4349.field1763 == var12.field7785 || var6.field4349.field1763 == var12.field7771 || var6.field4349.field1763 == var12.field7781 || var6.field4349.field1763 == var12.field7805) {
                var11 = 2;
            } else if (var6.field4349.field1763 == var12.field7783 || var6.field4349.field1763 == var12.field7799 || var6.field4349.field1763 == var12.field7808 || var6.field4349.field1763 == var12.field7791) {
                var11 = 3;
            }
            if (var6.field4362 != var11) {
                int var13 = class49.method494((byte) -26, var6.field4349);
                if (var6.field4356 != var13) {
                    if (var6.field4367 != null) {
                        class273.field4030.method1242(var6.field4367);
                        var6.field4367 = null;
                    }
                    var6.field4356 = var13;
                }
                var6.field4362 = var11;
            }
            var6.field4353 = var6.field4349.field6335;
            var6.field4354 = var6.field4349.field6335 + (var6.field4349.method963((byte) 127) << 6);
            var6.field4350 = var6.field4349.field6334;
            var6.field4346 = var6.field4349.field6334 + (var6.field4349.method963((byte) 127) << 6);
            class465.method2787(true, arg3, arg0, arg2, var6, arg1);
            var6 = (class307) class250.field3680.method1022((byte) -112);
        }
        for (class307 var7 = (class307) class453.field6669.method880((byte) -23); var7 != null; var7 = (class307) class453.field6669.method879((byte) -20)) {
            byte var8 = 1;
            class531 var9 = var7.field4355.method969(-1);
            if (var7.field4355.field1743) {
                var8 = 0;
            } else if (var7.field4355.field1763 == var9.field7785 || var7.field4355.field1763 == var9.field7771 || var7.field4355.field1763 == var9.field7781 || var7.field4355.field1763 == var9.field7805) {
                var8 = 2;
            } else if (var7.field4355.field1763 == var9.field7783 || var7.field4355.field1763 == var9.field7799 || var7.field4355.field1763 == var9.field7808 || var7.field4355.field1763 == var9.field7791) {
                var8 = 3;
            }
            if (var7.field4362 != var8) {
                int var10 = class75.method707((byte) -70, var7.field4355);
                if (var7.field4356 != var10) {
                    if (var7.field4367 != null) {
                        class273.field4030.method1242(var7.field4367);
                        var7.field4367 = null;
                    }
                    var7.field4356 = var10;
                }
                var7.field4362 = var8;
            }
            var7.field4353 = var7.field4355.field6335;
            var7.field4354 = var7.field4355.field6335 + (var7.field4355.method963((byte) 127) << 6);
            var7.field4350 = var7.field4355.field6334;
            var7.field4346 = var7.field4355.field6334 + (var7.field4355.method963((byte) 127) << 6);
            class465.method2787(true, arg3, arg0, arg2, var7, arg1);
        }
    }
}
