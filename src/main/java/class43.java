import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class43 {

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Lwt;")
    public static class194 field649 = new class194("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([IZLcu;[I[I)V", line = 3)
    public static final void method317(int[] arg0, boolean arg1, class139 arg2, int[] arg3, int[] arg4) {
        field650++;
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg2.field4223.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field4223[var9] = null;
                    } else {
                        class168 var10 = class286.field4083.method2602(-24462, var6);
                        int var11 = var10.field2221;
                        class55 var12 = arg2.field4223[var9];
                        if (var12 != null) {
                            if (var12.field848 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field4223[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field852 = 0;
                                    var12.field856 = 0;
                                    var12.field846 = 1;
                                    var12.field850 = 0;
                                    var12.field851 = var8;
                                    class204.method1258(-1, 0, arg2.field2959, false, var10, arg2.field2966, arg2.field2956);
                                } else if (var11 == 2) {
                                    var12.field852 = 0;
                                }
                            } else if (var10.field2217 >= class286.field4083.method2602(-24462, var12.field848).field2217) {
                                var12 = arg2.field4223[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class55 var13 = arg2.field4223[var9] = new class55();
                            var13.field846 = 1;
                            var13.field848 = var6;
                            var13.field851 = var8;
                            var13.field852 = 0;
                            var13.field856 = 0;
                            var13.field850 = 0;
                            class204.method1258(-1, 0, arg2.field2959, false, var10, arg2.field2966, arg2.field2956);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (!arg1) {
            field648 = -107;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 100)
    public static void method318(byte arg0) {
        field649 = null;
        if (arg0 != -48) {
            method319((byte) -12);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Z", line = 114)
    public static final boolean method319(byte arg0) {
        field647++;
        if (arg0 <= 35) {
            method317(null, false, null, null, null);
        }
        return class383.field5696 > 0;
    }
}
