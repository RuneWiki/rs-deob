import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class313 extends class115 {

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public int field4851;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public int field4852;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static final void method1970(int arg0) {
        class384.field5777.method2955(2131289328);
        field4850++;
        if (arg0 != -16152) {
            method1971(-15, 126, 2, -88);
        }
        for (class477 var1 = (class477) class154.field2334.method2957(arg0 + 16088); var1 != null; var1 = (class477) class154.field2334.method2947(arg0 + 16214)) {
            if (var1.field7034 < 1000) {
                var1.method876((byte) -96);
                class384.field5777.method2958(var1, (byte) 73);
            }
        }
        class384.field5777.method2961(class154.field2334, (byte) 49);
        int var2 = -1;
        class376 var3 = (class376) class483.field7130.method2957(-87);
        if (var3 != null) {
            var2 = var3.method955((byte) -122);
        }
        if (!class495.field7350) {
            if (var2 == 0 && (class301.field4483 == 1 && class448.field6610 > 2 || class61.method435(false))) {
                var2 = 2;
            }
            if (var2 == 2 && class448.field6610 > 0 && var3 != null) {
                if (class251.field3435 == null && class9.field88 == 0) {
                    class431.method2549(var3.method952(25407), (byte) -114, var3.method954(3));
                } else {
                    class36.field496 = 2;
                }
            }
            if (var2 == 0 && class448.field6610 > 0) {
                class440.method2578((byte) 122);
            }
            if (class251.field3435 != null || class9.field88 != 0) {
                return;
            }
            class521.field7664 = null;
            class36.field496 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class45.field591.method44((byte) 45);
            int var5 = class45.field591.method54(28455);
            if ((class148.field2227 - 10) > var4 || class148.field2227 + class88.field1383 + 10 < var4 || var5 < class274.field4094 - 10 || var5 > class27.field396 + class274.field4094 + 10) {
                class258.method1583(-12144);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class148.field2227;
        int var7 = class274.field4094;
        int var8 = class88.field1383;
        int var9 = var3.method952(25407);
        int var10 = var3.method954(arg0 + 16155);
        int var11 = -1;
        for (int var12 = 0; var12 < class448.field6610; var12++) {
            if (class56.field774) {
                int var17 = (class448.field6610 - var12 - 1) * 16 + var7 + 33;
                if (var9 > var6 && var9 < var6 + var8 && var10 > var17 - 13 && var17 + 4 > var10) {
                    var11 = var12;
                }
            } else {
                int var16 = ((class448.field6610 - (var12 + 1)) * 16) + var7 + 31;
                if (var6 < var9 && var6 + var8 > var9 && var10 > (var16 - 13) && var10 < (var16 + 3)) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class535 var14 = new class535(class154.field2334);
            for (class477 var15 = (class477) var14.method3164((byte) -68); var15 != null; var15 = (class477) var14.method3162((byte) -79)) {
                if (var11 == var13) {
                    class101.method771(var10, (byte) 112, var15, var9);
                }
                var13++;
            }
        }
        class258.method1583(-12144);
        return;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIII)V")
    public static final void method1971(int arg0, int arg1, int arg2, int arg3) {
        class306 var4 = class236.field3305[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class169 var5 = var4.field4592;
        class169 var6 = var4.field4586;
        if (var5 != null) {
            var5.field2490 = var5.field2490 * arg3 / (0x10 << class9.field75 - 7);
            var5.field2493 = var5.field2493 * arg3 / (0x10 << class9.field75 - 7);
        }
        if (var6 != null) {
            var6.field2490 = var6.field2490 * arg3 / (0x10 << class9.field75 - 7);
            var6.field2493 = var6.field2493 * arg3 / (0x10 << class9.field75 - 7);
        }
    }
}
