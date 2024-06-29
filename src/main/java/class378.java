import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class378 extends class597 {

    @OriginalMember(owner = "client!bga", name = "q", descriptor = "I")
    private int field5530;

    @OriginalMember(owner = "client!bga", name = "l", descriptor = "I")
    private int field5525;

    @OriginalMember(owner = "client!bga", name = "u", descriptor = "I")
    private int field5534;

    @OriginalMember(owner = "client!bga", name = "w", descriptor = "I")
    private int field5536;

    @OriginalMember(owner = "client!bga", name = "m", descriptor = "Lai;")
    private class626 field5526;

    @OriginalMember(owner = "client!bga", name = "s", descriptor = "I")
    private int field5532;

    @OriginalMember(owner = "client!bga", name = "v", descriptor = "I")
    private int field5535;

    @OriginalMember(owner = "client!bga", name = "r", descriptor = "I")
    public static int field5531 = 0;

    @OriginalMember(owner = "client!bga", name = "o", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!bga", name = "p", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!bga", name = "t", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!bga", name = "n", descriptor = "Lfn;")
    private class149 field5527;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(BLwc;Z)V", line = 3)
    public static final void method2416(byte arg0, class73 arg1, boolean arg2) {
        field5529++;
        if (class746.field10297 >= 400) {
            return;
        }
        if (class551.field7456 != arg1) {
            if (arg0 != 77) {
                method2416((byte) -125, null, true);
            }
            String var7;
            if (arg1.field1034 == 0) {
                boolean var3 = true;
                if (class551.field7456.field1044 != -1 && arg1.field1044 != -1) {
                    int var4 = class551.field7456.field1044 >= arg1.field1044 ? arg1.field1044 : class551.field7456.field1044;
                    int var5 = class551.field7456.field1051 - arg1.field1051;
                    if (var5 < 0) {
                        var5 = -var5;
                    }
                    if (var4 < var5) {
                        var3 = false;
                    }
                }
                String var6 = class21.field332 == class180.field2393 ? class474.field6569.method2780(111, class38.field589) : class474.field6567.method2780(98, class38.field589);
                if (arg1.field1051 < arg1.field1030) {
                    var7 = arg1.method642(true, arg0 - 1075074117) + (var3 ? class669.method3720(arg0 - 68, class551.field7456.field1051, arg1.field1051) : "<col=ffffff>") + " (" + var6 + arg1.field1051 + "+" + (arg1.field1030 - arg1.field1051) + ")";
                } else {
                    var7 = arg1.method642(true, arg0 - 1075074117) + (var3 ? class669.method3720(9, class551.field7456.field1051, arg1.field1051) : "<col=ffffff>") + " (" + var6 + arg1.field1051 + ")";
                }
            } else if (arg1.field1034 == -1) {
                var7 = arg1.method642(true, -1075074040);
            } else {
                var7 = arg1.method642(true, -1075074040) + " (" + class474.field6568.method2780(arg0 ^ 0x16, class38.field589) + arg1.field1034 + ")";
            }
            if (class497.field6870 && !arg2 && (class344.field5067 & 0x8) != 0) {
                class201.field2660++;
                class251.method1684(false, class66.field942, false, -1, class341.field4924 + " -> <col=ffffff>" + var7, (byte) -79, true, 0, 49, (long) arg1.field1812, 0, class678.field9483, (long) arg1.field1812);
            }
            if (arg2) {
                class251.method1684(true, "<col=cccccc>" + var7, false, 0, "", (byte) -99, false, 0, -1, (long) arg1.field1812, 0, -1, 0L);
            } else {
                for (int var8 = 7; var8 >= 0; var8--) {
                    if (class315.field4540[var8] != null) {
                        short var9 = 0;
                        if (class380.field5545 == class21.field332 && class315.field4540[var8].equalsIgnoreCase(class474.field6562.method2780(99, class38.field589))) {
                            if (class73.field1068 && arg1.field1051 > class551.field7456.field1051) {
                                var9 = 2000;
                            }
                            if (class551.field7456.field1058 == 0 || arg1.field1058 == 0) {
                                if (arg1.field1052) {
                                    var9 = 2000;
                                }
                            } else if (class551.field7456.field1058 == arg1.field1058) {
                                var9 = 2000;
                            } else {
                                var9 = 0;
                            }
                        } else if (class269.field3960[var8]) {
                            var9 = 2000;
                        }
                        short var10 = (short) (class451.field6281[var8] + var9);
                        int var11 = class85.field1189[var8] == -1 ? class607.field8248 : class85.field1189[var8];
                        class742.field10238++;
                        class251.method1684(false, class315.field4540[var8], false, -1, "<col=ffffff>" + var7, (byte) -98, true, 0, var10, (long) arg1.field1812, 0, var11, (long) arg1.field1812);
                    }
                }
            }
            if (!arg2) {
                for (class275 var12 = (class275) class280.field4138.method2551((byte) -108); var12 != null; var12 = (class275) class280.field4138.method2542(-105)) {
                    if (var12.field4080 == 51) {
                        var12.field4082 = "<col=ffffff>" + var7;
                        return;
                    }
                }
            }
        } else if (class497.field6870 && (class344.field5067 & 0x10) != 0) {
            class317.field4544++;
            class251.method1684(false, class66.field942, false, -1, class341.field4924 + " -> <col=ffffff>" + class474.field6576.method2780(113, class38.field589), (byte) 84, true, 0, 60, (long) arg1.field1812, 0, class678.field9483, 0L);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)Llda;", line = 164)
    public static final class513 method2417(boolean arg0) {
        class196.field2620 = 0;
        if (arg0) {
            field5531 = 71;
        }
        field5533++;
        return class577.method3219(107);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)Lfn;", line = 180)
    public final class149 method2418(int arg0) {
        field5528++;
        if (arg0 != 22113) {
            method2417(true);
        }
        if (this.field5527 == null) {
            class161 var2 = this.field5526.field912;
            class361.field5272[0] = this.field5525;
            class361.field5272[4] = this.field5536;
            class361.field5272[5] = this.field5532;
            class361.field5272[1] = this.field5530;
            class361.field5272[2] = this.field5534;
            class361.field5272[3] = this.field5535;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1173(true, class361.field5272[var5])) {
                    return null;
                }
                class662 var7 = var2.method1174(class361.field5272[var5], true);
                int var8 = var7.field9143 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field9153 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class565.field7568[var6] = var2.method1177(var4, false, var4, 1.0F, class361.field5272[var6], (byte) -112);
            }
            this.field5527 = this.field5526.method869((byte) 102, var3 != 0, var4, class565.field7568);
        }
        return this.field5527;
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lai;IIIIII)V", line = 248)
    public class378(class626 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5530 = arg2;
        this.field5525 = arg1;
        this.field5534 = arg3;
        this.field5536 = arg5;
        this.field5526 = arg0;
        this.field5532 = arg6;
        this.field5535 = arg4;
    }
}
