import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class210 {

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public int field3503;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public int field3501;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public int field3506;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public int field3509;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "[Liu;")
    public static class536[] field3507;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([[[Lup;IZIII)Z", line = 8)
    public static final boolean method1596(class252[][][] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field3505++;
        byte var6 = arg2 ? 1 : (byte) (class607.field8632 & 0xFF);
        if (class428.field6538[class423.field6439][arg3][arg4] == var6) {
            return false;
        } else if ((class690.field9676[class423.field6439][arg3][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class629.field8877[var7] = arg3;
            int var8 = 0;
            int var35 = var7 + 1;
            class132.field2174[var7] = arg4;
            class428.field6538[class423.field6439][arg3][arg4] = var6;
            while (var35 != var8) {
                int var9 = class629.field8877[var8] & 0xFFFF;
                int var10 = (class629.field8877[var8] & 0xFF9982) >> 16;
                int var11 = class629.field8877[var8] >> 24 & 0xFF;
                int var12 = class132.field2174[var8] & 0xFFFF;
                int var13 = class132.field2174[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class690.field9676[class423.field6439][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class423.field6439 + 1; var16 <= 3; var16++) {
                    if ((class690.field9676[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field4029 != null) {
                                int var20 = class91.method813(65535, var10);
                                if (arg0[var16][var9][var12].field4029.field8092 == var20 || arg0[var16][var9][var12].field4019 != null && arg0[var16][var9][var12].field4019.field8092 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class91.method813(65535, var11);
                                    if (arg0[var16][var9][var12].field4029.field8092 == var21 || arg0[var16][var9][var12].field4019 != null && arg0[var16][var9][var12].field4019.field8092 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class91.method813(65535, var13);
                                    if (arg0[var16][var9][var12].field4029.field8092 == var22 || arg0[var16][var9][var12].field4019 != null && arg0[var16][var9][var12].field4019.field8092 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class252 var23 = arg0[var16][var9][var12];
                            if (var23.field4026 != null) {
                                for (class531 var24 = var23.field4026; var24 != null; var24 = var24.field7736) {
                                    class459 var25 = var24.field7739;
                                    if (var25 instanceof class302) {
                                        class302 var26 = (class302) var25;
                                        int var27 = var26.method413((byte) 11);
                                        int var28 = var26.method401((byte) 64);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class252 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field4026 != null) {
                            for (class531 var31 = var30.field4026; var31 != null; var31 = var31.field7736) {
                                class459 var32 = var31.field7739;
                                if (var32.field6870 != var32.field6865 || var32.field6871 != var32.field6869) {
                                    for (int var33 = var32.field6865; var33 <= var32.field6870; var33++) {
                                        for (int var34 = var32.field6869; var34 <= var32.field6871; var34++) {
                                            class428.field6538[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class428.field6538[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class587.field8346[class423.field6439 + 1].method479(var12, var9, arg5 ^ 0x27A);
                    if (class645.field9067[arg1] < var17) {
                        class645.field9067[arg1] = var17;
                    }
                    int var18 = var9 << 9;
                    if (var18 < class680.field9541[arg1]) {
                        class680.field9541[arg1] = var18;
                    } else if (class232.field3692[arg1] < var18) {
                        class232.field3692[arg1] = var18;
                    }
                    int var19 = var12 << 9;
                    if (var19 < class257.field4077[arg1]) {
                        class257.field4077[arg1] = var19;
                    } else if (class16.field266[arg1] < var19) {
                        class16.field266[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class428.field6538[class423.field6439][var9 - 1][var12] != var6) {
                        class629.field8877[var35] = class81.method769(class81.method769(var9 - 1, 1179648), -754974720);
                        class132.field2174[var35] = class81.method769(1245184, var12);
                        class428.field6538[class423.field6439][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (class417.field6374 > var12) {
                        if (var9 - 1 >= 0 && class428.field6538[class423.field6439][var9 - 1][var12] != var6 && (class690.field9676[class423.field6439][var9][var12] & 0x4) == 0 && (class690.field9676[class423.field6439][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class629.field8877[var35] = class81.method769(1375731712, class81.method769(1179648, var9 - 1));
                            class132.field2174[var35] = class81.method769(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class428.field6538[class423.field6439][var9 - 1][var12] = var6;
                        }
                        if (class428.field6538[class423.field6439][var9][var12] != var6) {
                            class629.field8877[var35] = class81.method769(class81.method769(var9, 5373952), 318767104);
                            class132.field2174[var35] = class81.method769(var12, 5439488);
                            class428.field6538[class423.field6439][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class275.field4426 && class428.field6538[class423.field6439][var9 + 1][var12] != var6 && (class690.field9676[class423.field6439][var9][var12] & 0x4) == 0 && (class690.field9676[class423.field6439][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class629.field8877[var35] = class81.method769(class81.method769(var9 + 1, 5373952), -1845493760);
                            class132.field2174[var35] = class81.method769(5439488, var12);
                            class428.field6538[class423.field6439][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class275.field4426 > var9 + 1 && class428.field6538[class423.field6439][var9 + 1][var12] != var6) {
                        class629.field8877[var35] = class81.method769(1392508928, class81.method769(var9 + 1, 9568256));
                        class132.field2174[var35] = class81.method769(9633792, var12);
                        class428.field6538[class423.field6439][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class428.field6538[class423.field6439][var9 - 1][var12] != var6 && (class690.field9676[class423.field6439][var9][var12] & 0x4) == 0 && (class690.field9676[class423.field6439][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class629.field8877[var35] = class81.method769(301989888, class81.method769(13762560, var9 - 1));
                            class132.field2174[var35] = class81.method769(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class428.field6538[class423.field6439][var9 - 1][var12] = var6;
                        }
                        if (class428.field6538[class423.field6439][var9][var12] != var6) {
                            class629.field8877[var35] = class81.method769(-1828716544, class81.method769(var9, 13762560));
                            class132.field2174[var35] = class81.method769(13828096, var12);
                            class428.field6538[class423.field6439][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class275.field4426 > var9 + 1 && class428.field6538[class423.field6439][var9 + 1][var12] != var6 && (class690.field9676[class423.field6439][var9][var12] & 0x4) == 0 && (class690.field9676[class423.field6439][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class629.field8877[var35] = class81.method769(class81.method769(var9 + 1, 9568256), -771751936);
                            class132.field2174[var35] = class81.method769(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class428.field6538[class423.field6439][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (arg5 != 512) {
                field3502 = 40;
            }
            if (class645.field9067[arg1] != -1000000) {
                class645.field9067[arg1] += 40;
                class680.field9541[arg1] -= 512;
                class232.field3692[arg1] += 512;
                class16.field266[arg1] += 512;
                class257.field4077[arg1] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "toString", descriptor = "()Ljava/lang/String;", line = 325)
    public final String toString() {
        field3504++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIII)V", line = 340)
    public class210(int arg0, int arg1, int arg2, int arg3) {
        this.field3503 = arg2;
        this.field3501 = arg0;
        this.field3506 = arg1;
        this.field3509 = arg3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 351)
    public static void method1597(int arg0) {
        field3507 = null;
        if (arg0 != -8770) {
            method1597(-63);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)I", line = 361)
    public static final int method1598(int arg0, int arg1, int arg2) {
        field3500++;
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        if (arg2 != 31347) {
            field3507 = null;
        }
        return arg1;
    }
}
