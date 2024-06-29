import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class458 extends class698 {

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    private int field6010;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
    private int field6020;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    private int field6016;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    private int field6009;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
    private int field6019;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    private int field6013;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "Lqq;")
    private class651 field6018;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "F")
    public static float field6017;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "Ljn;")
    private class530 field6015;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2572(int arg0) {
        field6014++;
        if (arg0 != 100) {
            method2572(51);
        }
        for (int var1 = 0; var1 < class413.field5414; var1++) {
            class480 var3 = class67.field824[var1];
            boolean var4 = false;
            if (var3.field6683 == null) {
                var3.field6681--;
                if (var3.field6681 < (var3.method2762((byte) 104) ? -1500 : -10)) {
                    var4 = true;
                } else {
                    if (var3.field6674 == 1 && var3.field6676 == null) {
                        var3.field6676 = class486.method2791(class3.field8, var3.field6680, 0);
                        if (var3.field6676 == null) {
                            continue;
                        }
                        var3.field6681 += var3.field6676.method2794();
                    } else if (var3.method2762((byte) 104) && (var3.field6671 == null || var3.field6677 == null)) {
                        if (var3.field6671 == null) {
                            var3.field6671 = class577.method3185(class56.field728, var3.field6680);
                        }
                        if (var3.field6671 == null) {
                            continue;
                        }
                        if (var3.field6677 == null) {
                            var3.field6677 = var3.field6671.method3188(new int[] { 22050 });
                            if (var3.field6677 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field6681 < 0) {
                        int var12;
                        if (var3.field6672 == 0) {
                            var12 = var3.field6684 * (var3.field6674 == 3 ? class602.field8408.field4320 : class602.field8408.field4310) >> 8;
                        } else {
                            int var5 = var3.field6672 >> 24 & 0x3;
                            if (class408.field5369.field385 == var5) {
                                int var6 = var3.field6672 & 0xFF << 9;
                                int var7 = var3.field6672 >> 16 & 0xFF;
                                int var8 = (var7 << 9) + 256 - class408.field5369.field398;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = (var3.field6672 & 0xFFD7) >> 8;
                                int var10 = (var9 << 9) + 256 - class408.field5369.field397;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 512;
                                if (var6 < var11) {
                                    var3.field6681 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var12 = (var6 - var11) * class602.field8408.field4329 * var3.field6684 / var6 >> 8;
                            } else {
                                var12 = 0;
                            }
                        }
                        if (var12 > 0) {
                            class161 var13 = null;
                            if (var3.field6674 == 1) {
                                var13 = var3.field6676.method2792().method993(class383.field5057);
                            } else if (var3.method2762((byte) 104)) {
                                var13 = var3.field6677;
                            }
                            class655 var14 = var3.field6683 = class655.method3722(var13, 100, var12);
                            var14.method3727(var3.field6679 - 1);
                            class126.field1759.method1341(var14);
                        }
                    }
                }
            } else if (!var3.field6683.method241(true)) {
                var4 = true;
            }
            if (var4) {
                class413.field5414--;
                for (int var15 = var1; var15 < class413.field5414; var15++) {
                    class67.field824[var15] = class67.field824[var15 + 1];
                }
                var1--;
            }
        }
        if (class33.field460 && !class487.method2799((byte) 67)) {
            if (class602.field8408.field4323 != 0 && class275.field3659 != -1) {
                class571.method3154(class654.field9309, class602.field8408.field4323, false, (byte) -113, class275.field3659, 0);
            }
            class33.field460 = false;
        } else if (class602.field8408.field4323 != 0 && class275.field3659 != -1 && !class487.method2799((byte) 53)) {
            class89.field1081++;
            class229 var2 = class97.method550(class71.field841, false, class251.field3301);
            var2.field2971.method958(0, class275.field3659);
            class307.method1805(var2, arg0 ^ 0xFFFFC6F4);
            class275.field3659 = -1;
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)Ljn;", line = 178)
    public final class530 method2573(byte arg0) {
        field6011++;
        if (arg0 >= -22) {
            return null;
        }
        if (this.field6015 == null) {
            class409.field5390[1] = this.field6009;
            class409.field5390[5] = this.field6010;
            class409.field5390[0] = this.field6019;
            class409.field5390[4] = this.field6016;
            class409.field5390[3] = this.field6013;
            class522 var2 = this.field6018.field7682;
            class409.field5390[2] = this.field6020;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2961(true, class409.field5390[var5])) {
                    return null;
                }
                class105 var7 = var2.method2959(90, class409.field5390[var5]);
                int var8 = var7.field1260 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field1261 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class273.field3633[var6] = var2.method2964(class409.field5390[var6], (byte) 67, var4, false, 1.0F, var4);
            }
            this.field6015 = this.field6018.method2009((byte) 81, var4, var3 != 0, class273.field3633);
        }
        return this.field6015;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lqq;IIIIII)V", line = 251)
    public class458(class651 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6010 = arg6;
        this.field6020 = arg3;
        this.field6016 = arg5;
        this.field6009 = arg2;
        this.field6019 = arg1;
        this.field6013 = arg4;
        this.field6018 = arg0;
    }
}
