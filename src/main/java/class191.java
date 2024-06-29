import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class191 {

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "Z")
    public static volatile boolean field2306 = true;

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "Lih;")
    public static class597 field2301 = new class597();

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "Lcaa;")
    public static class251 field2300;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
    public static void method1031(int arg0) {
        field2300 = null;
        if (arg0 != 0) {
            method1032((byte) -24, 105, 61, 35, 77);
        }
        field2301 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BIIII)V")
    public static final void method1032(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2302++;
        for (class416 var5 = (class416) class645.field9394.method1050((byte) 73); var5 != null; var5 = (class416) class645.field9394.method1047(-7962)) {
            class238.method1350(var5, arg2, arg4, arg1, -125, arg3);
        }
        for (class416 var6 = (class416) class542.field7916.method1050((byte) 73); var6 != null; var6 = (class416) class542.field7916.method1047(-7962)) {
            byte var11 = 1;
            class352 var12 = var6.field5418.method2704(0);
            if (var6.field5418.field6430) {
                var11 = 0;
            } else if (var6.field5418.field6474 == var12.field4543 || var6.field5418.field6474 == var12.field4565 || var6.field5418.field6474 == var12.field4546 || var6.field5418.field6474 == var12.field4574) {
                var11 = 2;
            } else if (var6.field5418.field6474 == var12.field4557 || var6.field5418.field6474 == var12.field4575 || var6.field5418.field6474 == var12.field4558 || var6.field5418.field6474 == var12.field4547) {
                var11 = 3;
            }
            if (var6.field5414 != var11) {
                int var13 = class290.method1628(-74, var6.field5418);
                if (var6.field5401 != var13) {
                    if (var6.field5417 != null) {
                        class534.field7500.method803(var6.field5417);
                        var6.field5417 = null;
                    }
                    var6.field5401 = var13;
                }
                var6.field5414 = var11;
            }
            var6.field5408 = var6.field5418.field8661;
            var6.field5403 = var6.field5418.field8661 + (var6.field5418.method2694(28146) << 6);
            var6.field5406 = var6.field5418.field8652;
            var6.field5405 = var6.field5418.field8652 + (var6.field5418.method2694(28146) << 6);
            class238.method1350(var6, arg2, arg4, arg1, -114, arg3);
        }
        if (arg0 < 1) {
            return;
        }
        for (class416 var7 = (class416) class593.field8610.method2638(false); var7 != null; var7 = (class416) class593.field8610.method2641(12089)) {
            byte var8 = 1;
            class352 var9 = var7.field5409.method2704(0);
            if (var7.field5409.field6430) {
                var8 = 0;
            } else if (var7.field5409.field6474 == var9.field4543 || var7.field5409.field6474 == var9.field4565 || var7.field5409.field6474 == var9.field4546 || var7.field5409.field6474 == var9.field4574) {
                var8 = 2;
            } else if (var7.field5409.field6474 == var9.field4557 || var7.field5409.field6474 == var9.field4575 || var7.field5409.field6474 == var9.field4558 || var7.field5409.field6474 == var9.field4547) {
                var8 = 3;
            }
            if (var7.field5414 != var8) {
                int var10 = class519.method2963(var7.field5409, 0);
                if (var7.field5401 != var10) {
                    if (var7.field5417 != null) {
                        class534.field7500.method803(var7.field5417);
                        var7.field5417 = null;
                    }
                    var7.field5401 = var10;
                }
                var7.field5414 = var8;
            }
            var7.field5408 = var7.field5409.field8661;
            var7.field5403 = var7.field5409.field8661 + (var7.field5409.method2694(28146) << 6);
            var7.field5406 = var7.field5409.field8652;
            var7.field5405 = var7.field5409.field8652 + (var7.field5409.method2694(28146) << 6);
            class238.method1350(var7, arg2, arg4, arg1, -121, arg3);
        }
    }
}
