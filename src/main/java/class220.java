import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class220 extends class130 {

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Lqj;")
    private static class196 field3943 = class80.method502("Checking for updates )2 ", -48);

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field3944 = 0;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field3948 = 0;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Lqj;")
    private static class196 field3955 = class80.method502("Hidden", -48);

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "Lqj;")
    public static class196 field3960 = field3955;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "Lqj;")
    public static class196 field3971 = field3943;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "Lqj;")
    private static class196 field3965 = class80.method502("Examine", -48);

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field3967 = 0;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "Lqj;")
    public static class196 field3961 = field3965;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "Lqj;")
    public static class196 field3977 = class80.method502("<)4col> x", -48);

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "Lqj;")
    public static class196 field3974 = class80.method502("W-=hlen Sie eine Welt", -48);

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public int field3951;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public int field3952;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public int field3953;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public int field3957;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public int field3958;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public int field3962;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public int field3963;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public int field3966;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public int field3972;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Lfc;")
    public class138 field3956;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Lfg;")
    public class225 field3950;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "Lga;")
    public class239 field3945;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "Lfj;")
    public class89 field3964;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static void method1498(int arg0) {
        field3943 = null;
        field3955 = null;
        field3977 = null;
        field3971 = null;
        field3961 = null;
        if (arg0 == -1) {
            field3965 = null;
            field3974 = null;
            field3960 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3954++;
        if (arg6 == arg7) {
            class187.method1223(arg7, arg2, arg0, arg1, arg4, arg3, true);
            return;
        }
        if (arg4 - arg7 >= class188.field3296 && arg4 + arg7 <= class95.field1388 && arg2 - arg6 >= class93.field1361 && class23.field291 >= arg2 + arg6) {
            class129.method788((byte) 72, arg6, arg2, arg7, arg0, arg3, arg1, arg4);
        } else {
            class92.method564(arg7, arg3, arg6, arg1, 28427, arg4, arg2, arg0);
        }
        if (arg5 > -25) {
            method1498(-49);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1500(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3940++;
        long var6 = class63.method399(arg2, arg0, arg1);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = (int) var6 >> 14 & 0x1F;
            int var10 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
            int[] var11 = class55.field683;
            int var12 = arg4;
            if (var6 > 0L) {
                var12 = arg3;
            }
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class145 var14 = class83.method521(var13, (byte) 24);
            if (var14.field2275 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var10] = var12;
                        var11[var10 + 512] = var12;
                        var11[var10 + 1024] = var12;
                        var11[var10 + 1536] = var12;
                    } else if (var8 == 1) {
                        var11[var10] = var12;
                        var11[var10 + 1] = var12;
                        var11[var10 + 2] = var12;
                        var11[var10 + 3] = var12;
                    } else if (var8 == 2) {
                        var11[var10 + 3] = var12;
                        var11[var10 + 3 + 512] = var12;
                        var11[var10 + 1024 + 3] = var12;
                        var11[var10 + 3 + 1536] = var12;
                    } else if (var8 == 3) {
                        var11[var10 + 1536] = var12;
                        var11[var10 + 1536 + 1] = var12;
                        var11[var10 + 2 + 1536] = var12;
                        var11[var10 + 1536 + 3] = var12;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var10] = var12;
                    } else if (var8 == 1) {
                        var11[var10 + 3] = var12;
                    } else if (var8 == 2) {
                        var11[var10 + 1539] = var12;
                    } else if (var8 == 3) {
                        var11[var10 + 1536] = var12;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var10] = var12;
                        var11[var10 + 512] = var12;
                        var11[var10 + 1024] = var12;
                        var11[var10 + 1536] = var12;
                    } else if (var8 == 0) {
                        var11[var10] = var12;
                        var11[var10 + 1] = var12;
                        var11[var10 + 2] = var12;
                        var11[var10 + 3] = var12;
                    } else if (var8 == 1) {
                        var11[var10 + 3] = var12;
                        var11[var10 + 3 + 512] = var12;
                        var11[var10 + 3 + 1024] = var12;
                        var11[var10 + 1539] = var12;
                    } else if (var8 == 2) {
                        var11[var10 + 1536] = var12;
                        var11[var10 + 1536 + 1] = var12;
                        var11[var10 + 1536 + 2] = var12;
                        var11[var10 + 1536 + 3] = var12;
                    }
                }
            } else {
                class68 var15 = class253.field4484[var14.field2275];
                if (var15 != null) {
                    int var16 = (var14.field2278 * 4 - var15.field3812) / 2;
                    int var17 = (var14.field2263 * 4 - var15.field3814) / 2;
                    var15.method442(arg0 * 4 + var17 + 48, 48 - -((-var14.field2278 + 104 - arg1) * 4) + var16);
                }
            }
        }
        long var18 = class45.method241(arg2, arg0, arg1);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 14 & 0x1F;
            int var21 = (int) var18 >> 20 & 0x3;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class145 var23 = class83.method521(var22, (byte) 102);
            if (var23.field2275 != -1) {
                class68 var27 = class253.field4484[var23.field2275];
                if (var27 != null) {
                    int var28 = (var23.field2263 * 4 - var27.field3814) / 2;
                    int var29 = (var23.field2278 * 4 - var27.field3812) / 2;
                    var27.method442(arg0 * 4 + var28 + 48, (-arg1 + 104 - var23.field2278) * 4 + 48 - -var29);
                }
            } else if (var20 == 9) {
                int var24 = 15658734;
                if (var18 > 0L) {
                    var24 = 15597568;
                }
                int[] var25 = class55.field683;
                int var26 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var25[var26 + 1536] = var24;
                    var25[var26 + 1024 + 1] = var24;
                    var25[var26 + 512 + 2] = var24;
                    var25[var26 + 3] = var24;
                } else {
                    var25[var26] = var24;
                    var25[var26 + 513] = var24;
                    var25[var26 + 2 + 1024] = var24;
                    var25[var26 + 3 + 1536] = var24;
                }
            }
        }
        if (arg5) {
            field3955 = null;
        }
        long var30 = class197.method1339(arg2, arg0, arg1);
        if (var30 == 0L) {
            return;
        }
        int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class145 var33 = class83.method521(var32, (byte) 29);
        if (var33.field2275 == -1) {
            return;
        }
        class68 var34 = class253.field4484[var33.field2275];
        if (var34 != null) {
            int var35 = (var33.field2278 * 4 - var34.field3812) / 2;
            int var36 = (var33.field2263 * 4 - var34.field3814) / 2;
            var34.method442(arg0 * 4 + var36 + 48, (-arg1 + 104 - var33.field2278) * 4 + 48 - -var35);
            return;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lbk;Lbk;Z)V")
    public static final void method1501(class136 arg0, class136 arg1, boolean arg2) {
        class146.field2302 = arg1;
        if (arg2) {
            class133.field1903 = arg0;
            field3949++;
            class155.field2507 = class133.field1903.method831(-12858, 3);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lbk;Lbk;Lac;Lbk;Z)Z")
    public static final boolean method1502(class136 arg0, class136 arg1, class165 arg2, class136 arg3, boolean arg4) {
        class143.field2185 = arg2;
        if (arg4) {
            return false;
        }
        field3970++;
        class52.field648 = arg1;
        class200.field3552 = arg3;
        class210.field3784 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
    public final void method1503(byte arg0) {
        this.field3964 = null;
        if (arg0 == 4) {
            this.field3956 = null;
            this.field3950 = null;
            this.field3945 = null;
            field3976++;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method1504(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg4) {
            field3944 = 4;
        }
        field3947++;
        if (class35.method182(arg7, (byte) -91)) {
            client.method613(class91.field1335[arg7], -1, arg3, arg0, arg5, arg2, arg6, arg1);
        }
    }
}
