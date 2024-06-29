import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class553 {

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "Ljava/lang/String;")
    private String field7902 = "null";

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "Ljava/lang/Object;")
    public static volatile Object field7900 = null;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "[I")
    public static int[] field7907 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "C")
    public char field7895;

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "C")
    public char field7910;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
    private int field7908;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "Lwa;")
    public class661 field7901;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "Lwa;")
    private class661 field7906;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZI)Z", line = 3)
    public final boolean method3132(boolean arg0, int arg1) {
        field7896++;
        if (this.field7901 == null) {
            return false;
        }
        if (this.field7906 == null) {
            this.method3142(113);
        }
        class22 var3 = (class22) this.field7906.method3669((long) arg1, -1);
        if (var3 == null) {
            return false;
        } else {
            if (arg0) {
                this.method3141(null, 127);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIII[BB)Z", line = 25)
    public static final boolean method3133(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5) {
        field7903++;
        boolean var6 = true;
        if (arg5 >= -125) {
            field7907 = null;
        }
        class115 var7 = new class115(arg4);
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method663(31856);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class638 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method662(true);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method620((byte) -127);
                                    }
                                    int var12 = var7.method662(true);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = (var10 & 0xFC5) >> 6;
                                    var15 = var7.method620((byte) -128) >> 2;
                                    var16 = var14 + arg1;
                                    var17 = var13 + arg2;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (arg0 - 1 <= var16);
                    } while ((arg3 - 1) <= var17);
                    var18 = class364.field4891.method2134(var8, true);
                } while (var15 == 22 && !class639.field9075.field6796 && var18.field9035 == 0 && var18.field9006 != 1 && !var18.field8979);
                var11 = true;
                if (!var18.method3591(false)) {
                    class129.field1448++;
                    var6 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILnp;)V", line = 107)
    public final void method3134(int arg0, class115 arg1) {
        if (arg0 != -1) {
            this.method3141(null, -61);
        }
        while (true) {
            int var3 = arg1.method620((byte) -126);
            if (var3 == 0) {
                field7904++;
                return;
            }
            this.method3136(-23, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V", line = 128)
    private final void method3135(boolean arg0) {
        field7899++;
        if (!arg0) {
            this.method3136(64, 29, null);
        }
        this.field7906 = new class661(this.field7901.method3677(0));
        for (class302 var2 = (class302) this.field7901.method3674(127); var2 != null; var2 = (class302) this.field7901.method3672(-1)) {
            class420 var3 = new class420(var2.field3752, (int) var2.field4176);
            this.field7906.method3671(false, var3, class542.method3047(-1, var2.field3752));
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILnp;)V", line = 162)
    private final void method3136(int arg0, int arg1, class115 arg2) {
        field7905++;
        if (arg1 == 1) {
            this.field7895 = class161.method876((byte) 104, arg2.method657(false));
        } else if (arg1 == 2) {
            this.field7910 = class161.method876((byte) 84, arg2.method657(false));
        } else if (arg1 == 3) {
            this.field7902 = arg2.method626(113);
        } else if (arg1 == 4) {
            this.field7908 = arg2.method631(false);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method643((byte) -77);
            this.field7901 = new class661(method3138(1781323777, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method631(false);
                class333 var7;
                if (arg1 == 5) {
                    var7 = new class302(arg2.method626(108));
                } else {
                    var7 = new class22(arg2.method631(false));
                }
                this.field7901.method3671(false, var7, (long) var6);
            }
        }
        if (arg0 != -23) {
            this.method3134(54, null);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)I", line = 217)
    public final int method3137(int arg0, int arg1) {
        field7909++;
        if (this.field7901 == null) {
            return this.field7908;
        }
        if (arg0 > -82) {
            this.method3132(false, -2);
        }
        class22 var3 = (class22) this.field7901.method3669((long) arg1, -1);
        return var3 == null ? this.field7908 : var3.field168;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(II)I", line = 240)
    public static final int method3138(int arg0, int arg1) {
        field7898++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg0 != 1781323777) {
            field7892 = 70;
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V", line = 257)
    public static void method3139(int arg0) {
        if (arg0 == 1) {
            field7900 = null;
            field7907 = null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(ZI)Ljava/lang/String;", line = 274)
    public final String method3140(boolean arg0, int arg1) {
        field7894++;
        if (!arg0) {
            return null;
        } else if (this.field7901 == null) {
            return this.field7902;
        } else {
            class302 var3 = (class302) this.field7901.method3669((long) arg1, -1);
            return var3 == null ? this.field7902 : var3.field3752;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 298)
    public final boolean method3141(String arg0, int arg1) {
        field7897++;
        if (this.field7901 == null) {
            return false;
        }
        if (this.field7906 == null) {
            this.method3135(true);
        }
        class420 var3 = (class420) this.field7906.method3669(class542.method3047(-1, arg0), -1);
        if (arg1 != 14087) {
            this.method3142(-95);
        }
        while (var3 != null) {
            if (var3.field5600.equals(arg0)) {
                return true;
            }
            var3 = (class420) this.field7906.method3673((byte) 116);
        }
        return false;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V", line = 328)
    private final void method3142(int arg0) {
        this.field7906 = new class661(this.field7901.method3677(0));
        field7893++;
        if (arg0 >= 74) {
            for (class22 var2 = (class22) this.field7901.method3674(127); var2 != null; var2 = (class22) this.field7901.method3672(-1)) {
                class22 var3 = new class22((int) var2.field4176);
                this.field7906.method3671(false, var3, (long) var2.field168);
            }
        }
    }
}
