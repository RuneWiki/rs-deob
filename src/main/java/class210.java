import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class210 extends class44 {

    @OriginalMember(owner = "client!ti", name = "eb", descriptor = "Lbe;")
    public static class283 field3579 = class153.method941(-57, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ti", name = "hb", descriptor = "S")
    public static short field3582 = 205;

    @OriginalMember(owner = "client!ti", name = "gb", descriptor = "[I")
    public static int[] field3581 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ti", name = "lb", descriptor = "I")
    public static int field3586 = 0;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "B")
    public byte field3575;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ti", name = "ib", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ti", name = "jb", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ti", name = "kb", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ti", name = "mb", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ti", name = "nb", descriptor = "I")
    public int field3588;

    @OriginalMember(owner = "client!ti", name = "fb", descriptor = "Lek;")
    public static class172 field3580;

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "Lcm;")
    public static class181 field3577;

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "Lfe;")
    public class229 field3576;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZLfe;IIIIII)V", line = 4)
    public static final void method1384(int arg0, boolean arg1, class229 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3574++;
        if (arg5 != -26634) {
            method1386((class69) null, -79);
        }
        if (arg8 < 0 || arg8 >= 104 || arg6 < 0 || arg6 >= 104) {
            while (true) {
                int var11 = arg2.method1535((byte) 91);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg2.method1535((byte) 110);
                    break;
                }
                if (var11 <= 49) {
                    arg2.method1535((byte) 95);
                }
            }
            return;
        }
        if (!arg1) {
            class252.field4282[arg4][arg8][arg6] = 0;
        }
        while (true) {
            int var9 = arg2.method1535((byte) 127);
            if (var9 == 0) {
                if (arg1) {
                    class65.field890[0][arg8][arg6] = class1.field12[0][arg8][arg6];
                } else if (arg4 == 0) {
                    class65.field890[0][arg8][arg6] = -class72.method484(false, arg6 + arg3 + 556238, arg8 + 932731 + arg0) * 8;
                } else {
                    class65.field890[arg4][arg8][arg6] = class65.field890[arg4 - 1][arg8][arg6] - 240;
                }
                break;
            }
            if (var9 == 1) {
                int var10 = arg2.method1535((byte) 121);
                if (arg1) {
                    class65.field890[0][arg8][arg6] = var10 * 8 + class1.field12[0][arg8][arg6];
                } else {
                    if (var10 == 1) {
                        var10 = 0;
                    }
                    if (arg4 == 0) {
                        class65.field890[0][arg8][arg6] = -var10 * 8;
                    } else {
                        class65.field890[arg4][arg8][arg6] = class65.field890[arg4 - 1][arg8][arg6] - (var10 * 8);
                    }
                }
                break;
            }
            if (var9 <= 49) {
                class122.field2034[arg4][arg8][arg6] = arg2.method1497(false);
                class54.field736[arg4][arg8][arg6] = (byte) ((var9 - 2) / 4);
                class177.field3035[arg4][arg8][arg6] = (byte) class178.method1174(3, var9 + arg7 - 2);
            } else if (var9 > 81) {
                class301.field5092[arg4][arg8][arg6] = (byte) (var9 - 81);
            } else if (!arg1) {
                class252.field4282[arg4][arg8][arg6] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)[B", line = 119)
    public final byte[] method216(boolean arg0) {
        field3583++;
        if (this.field602 || this.field3576.field3879.length - this.field3575 > this.field3576.field3905) {
            throw new RuntimeException();
        }
        if (arg0) {
            field3577 = (class181) null;
        }
        return this.field3576.field3879;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZII)Lbe;", line = 139)
    public static final class283 method1385(int arg0, boolean arg1, int arg2, int arg3) {
        field3587++;
        if (arg0 < ~arg3 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = 1;
        int var5 = arg2 / arg3;
        while (var5 != 0) {
            var5 /= arg3;
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg2 % arg3;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
            arg2 /= arg3;
        }
        class283 var10 = new class283();
        var10.field4843 = var7;
        var10.field4812 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lkg;I)Lbe;", line = 199)
    public static final class283 method1386(class69 arg0, int arg1) {
        field3585++;
        if (class6.method36(client.method1601(arg0), (byte) 67) == arg1) {
            return null;
        } else if (arg0.field1056 == null || arg0.field1056.method1946((byte) -57).method1925((byte) -44) == 0) {
            return class297.field5037 ? class130.field2207 : null;
        } else {
            return arg0.field1056;
        }
    }

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "(I)I", line = 234)
    public final int method212(int arg0) {
        field3584++;
        if (this.field3576 == null) {
            return 0;
        } else if (arg0 == 512) {
            return this.field3576.field3905 * 100 / (this.field3576.field3879.length - this.field3575);
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)V", line = 264)
    public static final void method1387(byte arg0, int arg1) {
        field3578++;
        class72 var2 = class25.method174(arg1, (byte) 100, 1);
        if (arg0 <= -107) {
            var2.method479(119);
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V", line = 282)
    public static void method1388(byte arg0) {
        field3577 = null;
        field3579 = null;
        field3581 = null;
        if (arg0 != -76) {
            method1386((class69) null, -103);
        }
        field3580 = null;
    }
}
