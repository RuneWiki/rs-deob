import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class53 extends class65 {

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Lcca;")
    public class461 field847;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lwk;")
    public static class430 field845 = new class430(4, 8);

    @OriginalMember(owner = "client!am", name = "o", descriptor = "Lvj;")
    public static class26 field848 = new class26(1, 2);

    @OriginalMember(owner = "client!am", name = "q", descriptor = "Ljava/util/Calendar;")
    public static Calendar field850 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Led;")
    public static class366 field851;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "Z")
    public static boolean field849;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 5)
    public static void method503(int arg0) {
        field845 = null;
        if (arg0 != -1) {
            field851 = null;
        }
        field850 = null;
        field848 = null;
        field851 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lcca;I[I[I[I)V", line = 22)
    public static final void method504(class461 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        if (arg1 != -1) {
            return;
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && arg0.field1640.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field1640[var9] = null;
                    } else {
                        class82 var10 = class83.field1219.method2358((byte) -128, var6);
                        int var11 = var10.field1195;
                        class253 var12 = arg0.field1640[var9];
                        if (var12 != null) {
                            if (var12.field4013 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field1640[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4017 = 1;
                                    var12.field4019 = 0;
                                    var12.field4011 = var8;
                                    var12.field4018 = 0;
                                    var12.field4016 = 0;
                                    if (!arg0.field1630) {
                                        class262.method1747(arg0, 0, var10, -26868);
                                    }
                                } else if (var11 == 2) {
                                    var12.field4016 = 0;
                                }
                            } else if (var10.field1199 >= class83.field1219.method2358((byte) 79, var12.field4013).field1199) {
                                var12 = arg0.field1640[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class253 var13 = arg0.field1640[var9] = new class253();
                            var13.field4011 = var8;
                            var13.field4019 = 0;
                            var13.field4018 = 0;
                            var13.field4016 = 0;
                            var13.field4013 = var6;
                            var13.field4017 = 1;
                            if (!arg0.field1630) {
                                class262.method1747(arg0, 0, var10, -26868);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field846++;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lcca;)V", line = 125)
    public class53(class461 arg0) {
        this.field847 = arg0;
    }
}
