import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class208 extends class106 {

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    private int field4049 = 0;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    private int field4057 = 128;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    private int field4048 = 128;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public int field4052 = -1;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    private int field4045 = 0;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    private int field4043 = 0;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "Lrf;")
    private static class163 field4050 = class53.method392(-98, "Checking for updates )2 ");

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "Lrf;")
    public static class163 field4051 = field4050;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "Lrf;")
    private static class163 field4061 = class53.method392(-56, " from your friend list first)3");

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "Lrf;")
    public static class163 field4055 = field4061;

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "Lfc;")
    public static class54 field4064 = new class54(128);

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    private int field4058;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    public int field4062;

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "[S")
    private short[] field4044;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "[S")
    private short[] field4053;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "[S")
    private short[] field4054;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "[S")
    private short[] field4059;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([II[Lcb;[III)V")
    public static final void method1355(int[] arg0, int arg1, class23[] arg2, int[] arg3, int arg4, int arg5) {
        if (arg1 != -15230) {
            return;
        }
        if (arg4 < arg5) {
            int var6 = arg5 + 1;
            int var7 = arg4 - 1;
            int var8 = (arg4 + arg5) / 2;
            class23 var9 = arg2[var8];
            arg2[var8] = arg2[arg4];
            arg2[arg4] = var9;
            while (var7 < var6) {
                boolean var10 = true;
                do {
                    var6--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg0[var11] == 2) {
                            var12 = var9.field405;
                            var13 = arg2[var6].field405;
                        } else if (arg0[var11] == 1) {
                            var13 = arg2[var6].field404;
                            if (var13 == -1 && arg3[var11] == 1) {
                                var13 = 2001;
                            }
                            var12 = var9.field404;
                            if (var12 == -1 && arg3[var11] == 1) {
                                var12 = 2001;
                            }
                        } else if (arg0[var11] == 3) {
                            var12 = var9.field406 ? 1 : 0;
                            var13 = arg2[var6].field406 ? 1 : 0;
                        } else {
                            var12 = var9.field400;
                            var13 = arg2[var6].field400;
                        }
                        if (var12 != var13) {
                            if ((arg3[var11] != 1 || var12 >= var13) && (arg3[var11] != 0 || var13 >= var12)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var7++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg0[var15] == 2) {
                            var16 = var9.field405;
                            var17 = arg2[var7].field405;
                        } else if (arg0[var15] == 1) {
                            var16 = var9.field404;
                            var17 = arg2[var7].field404;
                            if (var17 == -1 && arg3[var15] == 1) {
                                var17 = 2001;
                            }
                            if (var16 == -1 && arg3[var15] == 1) {
                                var16 = 2001;
                            }
                        } else if (arg0[var15] == 3) {
                            var17 = arg2[var7].field406 ? 1 : 0;
                            var16 = var9.field406 ? 1 : 0;
                        } else {
                            var17 = arg2[var7].field400;
                            var16 = var9.field400;
                        }
                        if (var16 != var17) {
                            if ((arg3[var15] != 1 || var17 >= var16) && (arg3[var15] != 0 || var16 >= var17)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var6 > var7) {
                    class23 var18 = arg2[var7];
                    arg2[var7] = arg2[var6];
                    arg2[var6] = var18;
                }
            }
            method1355(arg0, -15230, arg2, arg3, arg4, var6);
            method1355(arg0, -15230, arg2, arg3, var6 + 1, arg5);
        }
        field4060++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLfa;)V")
    public final void method1356(byte arg0, class52 arg1) {
        while (true) {
            int var3 = arg1.method344(arg0 + 192);
            if (var3 == 0) {
                if (arg0 != 63) {
                    method1357((byte) -79);
                }
                field4047++;
                return;
            }
            this.method1358(true, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)V")
    public static void method1357(byte arg0) {
        field4051 = null;
        field4064 = null;
        field4061 = null;
        if (arg0 <= 91) {
            method1357((byte) 29);
        }
        field4055 = null;
        field4050 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZILfa;)V")
    private final void method1358(boolean arg0, int arg1, class52 arg2) {
        if (arg1 == 1) {
            this.field4058 = arg2.method390((byte) 110);
        } else if (arg1 == 2) {
            this.field4052 = arg2.method390((byte) 123);
        } else if (arg1 == 4) {
            this.field4048 = arg2.method390((byte) 127);
        } else if (arg1 == 5) {
            this.field4057 = arg2.method390((byte) 109);
        } else if (arg1 == 6) {
            this.field4045 = arg2.method390((byte) 92);
        } else if (arg1 == 7) {
            this.field4043 = arg2.method344(255);
        } else if (arg1 == 8) {
            this.field4049 = arg2.method344(255);
        } else if (arg1 == 40) {
            int var4 = arg2.method344(255);
            this.field4044 = new short[var4];
            this.field4059 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4044[var5] = (short) arg2.method390((byte) 117);
                this.field4059[var5] = (short) arg2.method390((byte) 93);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method344(255);
            this.field4054 = new short[var6];
            this.field4053 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4053[var7] = (short) arg2.method390((byte) 109);
                this.field4054[var7] = (short) arg2.method390((byte) 91);
            }
        }
        if (!arg0) {
            this.method1359((byte) -95, -63);
        }
        field4063++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)Lje;")
    public final class91 method1359(byte arg0, int arg1) {
        if (arg0 <= 80) {
            return null;
        }
        field4056++;
        class91 var3 = (class91) class32.field632.method401((long) this.field4062, (byte) -44);
        if (var3 == null) {
            class50 var4 = class50.method317(class68.field1431, this.field4058, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field4044 != null) {
                for (int var5 = 0; var5 < this.field4044.length; var5++) {
                    var4.method319(this.field4044[var5], this.field4059[var5]);
                }
            }
            if (this.field4053 != null) {
                for (int var6 = 0; var6 < this.field4053.length; var6++) {
                    var4.method322(this.field4053[var6], this.field4054[var6]);
                }
            }
            var3 = var4.method308(this.field4043 + 64, 850 - -this.field4049, -30, -50, -30, true, true);
            class32.field632.method398(var3, (long) this.field4062, (byte) 103);
        }
        class91 var7;
        if (this.field4052 == -1 || arg1 == -1) {
            var7 = var3.method176(true);
        } else {
            var7 = class97.method668(this.field4052, (byte) 44).method1011((byte) -26, var3, arg1);
        }
        if (this.field4048 != 128 || this.field4057 != 128) {
            var7.method632(this.field4048, this.field4057, this.field4048);
        }
        if (this.field4045 != 0) {
            if (this.field4045 == 90) {
                var7.method636();
            }
            if (this.field4045 == 180) {
                var7.method636();
                var7.method636();
            }
            if (this.field4045 == 270) {
                var7.method636();
                var7.method636();
                var7.method636();
            }
        }
        return var7;
    }
}
