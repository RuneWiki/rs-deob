import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public abstract class class702 {

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "Lkga;")
    public class506 field9912;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "Lfca;")
    public static class75 field9917 = new class75(1);

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "Lwo;")
    public static class690 field9919 = new class690(58, -2);

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
    public static int field9915;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "[Lmfa;")
    public static class570[] field9918;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IBI)V")
    public static final void method3934(int arg0, byte arg1, int arg2) {
        if (arg1 != -125) {
            return;
        }
        field9915++;
        if (class550.field7984 < class550.field7983) {
            class550.field7984 = (float) ((double) class550.field7984 / 30.0D + (double) class550.field7984);
            if (class550.field7984 > class550.field7983) {
                class550.field7984 = class550.field7983;
            }
            class582.method3389(-120);
            class550.field7985 = (int) class550.field7984 >> 1;
            class550.field7981 = class689.method3896(class550.field7985, (byte) -88);
        } else if (class550.field7984 > class550.field7983) {
            class550.field7984 = (float) ((double) class550.field7984 - (double) class550.field7984 / 30.0D);
            if (class550.field7983 > class550.field7984) {
                class550.field7984 = class550.field7983;
            }
            class582.method3389(arg1 ^ 0x42);
            class550.field7985 = (int) class550.field7984 >> 1;
            class550.field7981 = class689.method3896(class550.field7985, (byte) -88);
        }
        if (class113.field1458 != -1 && class440.field6291 != -1) {
            int var3 = class113.field1458 - class418.field5921;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class440.field6291 - class426.field6111;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class418.field5921 -= -var3;
            class426.field6111 += var4;
            if (var3 == 0 && var4 == 0) {
                class440.field6291 = -1;
                class113.field1458 = -1;
            }
            class582.method3389(arg1 + 214);
        }
        if (class200.field2421 <= 0) {
            class409.field5794 = -1;
            class523.field7669 = -1;
        } else {
            class167.field2045--;
            if (class167.field2045 == 0) {
                class167.field2045 = 100;
                class200.field2421--;
            }
        }
        if (!class496.field6908 || class356.field4756 == null) {
            return;
        }
        for (class307 var5 = (class307) class356.field4756.method1132((byte) 36); var5 != null; var5 = (class307) class356.field4756.method1134(arg1 + 8571)) {
            class289 var6 = class550.field7973.method3816(-17, var5.field4081.field90);
            if (var5.method1814(arg2, arg0, Integer.MAX_VALUE)) {
                if (var6.field3924 != null) {
                    if (var6.field3924[4] != null) {
                        class240.method1471((long) var5.field4081.field90, -24453, 1004, false, -1, -1, 0, var6.field3924[4], var6.field3930, true, var6.field3912);
                    }
                    if (var6.field3924[3] != null) {
                        class240.method1471((long) var5.field4081.field90, -24453, 1010, false, -1, -1, 0, var6.field3924[3], var6.field3930, true, var6.field3912);
                    }
                    if (var6.field3924[2] != null) {
                        class240.method1471((long) var5.field4081.field90, -24453, 1012, false, -1, -1, 0, var6.field3924[2], var6.field3930, true, var6.field3912);
                    }
                    if (var6.field3924[1] != null) {
                        class240.method1471((long) var5.field4081.field90, -24453, 1008, false, -1, -1, 0, var6.field3924[1], var6.field3930, true, var6.field3912);
                    }
                    if (var6.field3924[0] != null) {
                        class240.method1471((long) var5.field4081.field90, -24453, 1002, false, -1, -1, 0, var6.field3924[0], var6.field3930, true, var6.field3912);
                    }
                }
                if (!var5.field4081.field87) {
                    var5.field4081.field87 = true;
                    class545.method3194(class86.field1217, var5.field4081.field90, var6.field3930);
                }
                if (var5.field4081.field87) {
                    class545.method3194(class346.field4545, var5.field4081.field90, var6.field3930);
                }
            } else if (var5.field4081.field87) {
                var5.field4081.field87 = false;
                class545.method3194(class293.field3954, var5.field4081.field90, var6.field3930);
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)V")
    public static final void method3935(int arg0, int arg1) {
        class426.field6111 = arg0;
        field9914++;
        class440.field6291 = -1;
        class440.field6291 = arg1;
        class582.method3389(arg1 - 33);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "([[[BIIIIIIIIIIILr;)V")
    public static final void method3936(byte[][][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class165 arg12) {
        int var13 = 56 % ((-arg11 - 57) / 60);
        field9913++;
        if (arg10 == 0 || arg8 == 0) {
            return;
        }
        if (arg10 == 9) {
            arg10 = 1;
            arg7 = arg7 + 1 & 0x3;
        }
        if (arg10 == 10) {
            arg7 = arg7 + 3 & 0x3;
            arg10 = 1;
        }
        if (arg10 == 11) {
            arg10 = 8;
            arg7 = arg7 + 3 & 0x3;
        }
        arg12.method324(arg6, arg2, arg5, arg4, arg3, arg9, arg0[arg10 - 1][arg7], arg8, arg1);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZI)V")
    public abstract void method1005(boolean arg0, int arg1);

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Ljf;II)V")
    public abstract void method1004(class197 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)V")
    public abstract void method1001(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lna;Z)V")
    public static final void method3937(class43 arg0, boolean arg1) {
        for (int var2 = arg0.field769; var2 <= arg0.field770; var2++) {
            for (int var3 = arg0.field768; var3 <= arg0.field765; var3++) {
                class433 var4 = class281.field3808[arg0.field532][var2][var3];
                if (var4 != null) {
                    class182 var5 = var4.field6218;
                    class182 var6 = null;
                    while (var5 != null) {
                        if (var5.field2227 == arg0) {
                            if (var6 == null) {
                                var4.field6218 = var5.field2226;
                            } else {
                                var6.field2226 = var5.field2226;
                            }
                            var5.method1128(-124);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field2226;
                    }
                }
            }
        }
        if (!arg1) {
            class328.method1909(arg0);
        }
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lkga;)V")
    public class702(class506 arg0) {
        this.field9912 = arg0;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
    public static final void method3938(byte arg0) {
        if (arg0 == 94) {
            class228.field2955 = null;
            field9916++;
            class675.field9683 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)V")
    public abstract void method1002(boolean arg0);

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(Z)Z")
    public abstract boolean method998(boolean arg0);

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
    public static void method3939(int arg0) {
        field9918 = null;
        field9919 = null;
        field9917 = null;
        if (arg0 != -15455) {
            method3935(-63, -24);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZZ)V")
    public abstract void method1000(boolean arg0, boolean arg1);
}
