import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class128 extends class121 {

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    public int field2884 = 0;

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
    public static int field2890 = 0;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!sc", name = "eb", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!sc", name = "fb", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([III[II[Lc;)V")
    public static final void method962(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, class15[] arg5) {
        field2891++;
        if (arg2 > arg4) {
            int var6 = arg2 + 1;
            int var7 = (arg2 + arg4) / 2;
            int var8 = arg4 - 1;
            class15 var9 = arg5[var7];
            arg5[var7] = arg5[arg4];
            arg5[arg4] = var9;
            while (var6 > var8) {
                boolean var10 = true;
                do {
                    var6--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg3[var11] == 2) {
                            var13 = arg5[var6].field443;
                            var12 = var9.field443;
                        } else if (arg3[var11] == 1) {
                            var12 = var9.field445;
                            if (var12 == -1 && arg0[var11] == 1) {
                                var12 = 2001;
                            }
                            var13 = arg5[var6].field445;
                            if (var13 == -1 && arg0[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg3[var11] == 3) {
                            var13 = arg5[var6].field447 ? 1 : 0;
                            var12 = var9.field447 ? 1 : 0;
                        } else {
                            var12 = var9.field459;
                            var13 = arg5[var6].field459;
                        }
                        if (var12 != var13) {
                            if ((arg0[var11] != 1 || var12 >= var13) && (arg0[var11] != 0 || var13 >= var12)) {
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
                    var8++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg3[var15] == 2) {
                            var16 = var9.field443;
                            var17 = arg5[var8].field443;
                        } else if (arg3[var15] == 1) {
                            var17 = arg5[var8].field445;
                            if (var17 == -1 && arg0[var15] == 1) {
                                var17 = 2001;
                            }
                            var16 = var9.field445;
                            if (var16 == -1 && arg0[var15] == 1) {
                                var16 = 2001;
                            }
                        } else if (arg3[var15] == 3) {
                            var17 = arg5[var8].field447 ? 1 : 0;
                            var16 = var9.field447 ? 1 : 0;
                        } else {
                            var17 = arg5[var8].field459;
                            var16 = var9.field459;
                        }
                        if (var16 != var17) {
                            if ((arg0[var15] != 1 || var16 <= var17) && (arg0[var15] != 0 || var16 >= var17)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var8 < var6) {
                    class15 var18 = arg5[var8];
                    arg5[var8] = arg5[var6];
                    arg5[var6] = var18;
                }
            }
            method962(arg0, -4, var6, arg3, arg4, arg5);
            method962(arg0, -4, arg2, arg3, var6 + 1, arg5);
        }
        if (arg1 != -4) {
            field2890 = -76;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLef;II)Lce;")
    public static final class20 method963(boolean arg0, class35 arg1, int arg2, int arg3) {
        field2892++;
        if (class107.method814(-30384, arg2, arg3, arg1)) {
            if (!arg0) {
                method964(true);
            }
            return class114.method871(2640);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(Z)V")
    public static final void method964(boolean arg0) {
        for (int var1 = 0; var1 < class21.field579; var1++) {
            int var2 = class89.field2193[var1];
            class22 var3 = class48.field1148[var2];
            int var4 = class40.field1044.method638(0);
            if ((var4 & 0x10) != 0) {
                var4 += class40.field1044.method638(0) << 8;
            }
            class146.method1115(var2, 17933, var3, var4);
        }
        if (arg0) {
            field2890 = 9;
        }
        field2888++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZLm;)V")
    private final void method965(int arg0, boolean arg1, class83 arg2) {
        field2885++;
        if (arg1) {
            field2890 = 115;
        }
        if (arg0 == 5) {
            this.field2884 = arg2.method631((byte) -118);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lm;I)V")
    public final void method966(class83 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method638(0);
            if (var3 == 0) {
                if (arg1 != 4606) {
                    field2890 = -93;
                }
                field2887++;
                return;
            }
            this.method965(var3, false, arg0);
        }
    }
}
