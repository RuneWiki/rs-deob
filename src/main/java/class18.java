import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class18 extends class252 {

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Ljava/lang/String;")
    private String field313 = "null";

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field328 = 0;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "Lg;")
    public static class299 field329 = null;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "C")
    public char field330;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "C")
    public char field334;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "Li;")
    public class58 field319;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "Li;")
    private class58 field327;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Loc;")
    public static class63 field322;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ICLjava/lang/String;)I")
    public static final int method135(int arg0, char arg1, String arg2) {
        field332++;
        int var3 = 0;
        int var4 = arg2.length();
        if (arg0 != -2184) {
            return 24;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBII)V")
    public static final void method136(int arg0, byte arg1, int arg2, int arg3) {
        class291 var4 = class61.method389(arg0, 11, arg1 - 4);
        if (arg1 == 4) {
            field325++;
            var4.method2009(arg1 ^ 0xFFFFFFBF);
            var4.field4768 = arg3;
            var4.field4763 = arg2;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;BLfj;)I")
    public static final int method137(String arg0, byte arg1, class274 arg2) {
        field318++;
        if (arg1 < 82) {
            method145(39, -121, -57, -117, -54, 87, -116, 38);
        }
        int var3 = arg2.field4458;
        byte[] var4 = class131.method889(arg0, -34);
        arg2.method1817(var4.length, -28675);
        arg2.field4458 += class162.field2646.method1263(var4.length, var4, arg2.field4458, arg2.field4441, -114, 0);
        return arg2.field4458 - var3;
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static void method138(int arg0) {
        field322 = null;
        if (arg0 < 118) {
            field329 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
    private final void method139(byte arg0) {
        if (arg0 > -44) {
            return;
        }
        field333++;
        this.field327 = new class58(this.field319.method374((byte) 69));
        for (class71 var2 = (class71) this.field319.method379(-21146); var2 != null; var2 = (class71) this.field319.method369(true)) {
            class71 var3 = new class71((int) var2.field2209);
            this.field327.method368((long) var2.field1138, var3, -80);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method140(byte arg0, int arg1) {
        field323++;
        if (arg0 != -102) {
            method138(-5);
        }
        if (this.field319 == null) {
            return this.field313;
        } else {
            class287 var3 = (class287) this.field319.method371(-112, (long) arg1);
            return var3 == null ? this.field313 : var3.field4646;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method141(String arg0, int arg1) {
        if (arg1 < 107) {
            method145(-79, 82, 26, -83, 19, -30, 44, -26);
        }
        field320++;
        if (this.field319 == null) {
            return false;
        }
        if (this.field327 == null) {
            this.method143(false);
        }
        for (class284 var3 = (class284) this.field327.method371(-128, class120.method830((byte) 4, arg0)); var3 != null; var3 = (class284) this.field327.method376(18105)) {
            if (var3.field4604.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lfj;II)V")
    private final void method142(class274 arg0, int arg1, int arg2) {
        field316++;
        if (arg2 <= 36) {
            this.field315 = 48;
        }
        if (arg1 == 1) {
            this.field334 = class88.method614(arg0.method1830((byte) 84), (byte) -85);
        } else if (arg1 == 2) {
            this.field330 = class88.method614(arg0.method1830((byte) 78), (byte) -85);
        } else if (arg1 == 3) {
            this.field313 = arg0.method1855(119);
        } else if (arg1 == 4) {
            this.field315 = arg0.method1833((byte) -104);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1837(252);
            this.field319 = new class58(class128.method873(-17034, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1833((byte) -104);
                class137 var7;
                if (arg1 == 5) {
                    var7 = new class287(arg0.method1855(-105));
                } else {
                    var7 = new class71(arg0.method1833((byte) -104));
                }
                this.field319.method368((long) var6, var7, -107);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    private final void method143(boolean arg0) {
        this.field327 = new class58(this.field319.method374((byte) 102));
        field314++;
        if (arg0) {
            this.field315 = 18;
        }
        for (class287 var2 = (class287) this.field319.method379(-21146); var2 != null; var2 = (class287) this.field319.method369(true)) {
            class284 var3 = new class284(var2.field4646, (int) var2.field2209);
            this.field327.method368(class120.method830((byte) 4, var2.field4646), var3, -78);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
    public final boolean method144(int arg0, int arg1) {
        field331++;
        if (this.field319 == null) {
            return false;
        }
        if (arg0 != 2) {
            this.method144(-88, 108);
        }
        if (this.field327 == null) {
            this.method139((byte) -87);
        }
        class71 var3 = (class71) this.field327.method371(12, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field321++;
        int var8 = -4 % ((-arg2 - 5) / 59);
        long var9 = class180.method1266(arg7, arg1 + arg5, arg3 + arg6);
        if (var9 != 0L) {
            int var11 = ((int) var9 & 0x341BF2) >> 20;
            int var12 = ((int) var9 & 0x7E846) >> 14;
            int var13 = Integer.MAX_VALUE & (int) (var9 >>> 32);
            class172 var14 = class49.method319(var13, 0);
            if (var14.field2875 == -1) {
                int var15 = arg0;
                int var16 = (52736 - (arg6 * 512)) * 4 + arg1 * 4 + 24624;
                if (var9 > 0L) {
                    var15 = arg4;
                }
                int[] var17 = class94.field1495;
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        var17[var16] = var15;
                        var17[var16 + 512] = var15;
                        var17[var16 + 1024] = var15;
                        var17[var16 + 1536] = var15;
                    } else if (var11 == 1) {
                        var17[var16] = var15;
                        var17[var16 + 1] = var15;
                        var17[var16 + 2] = var15;
                        var17[var16 + 3] = var15;
                    } else if (var11 == 2) {
                        var17[var16 + 3] = var15;
                        var17[var16 + 3 + 512] = var15;
                        var17[var16 + 1027] = var15;
                        var17[var16 + 1539] = var15;
                    } else if (var11 == 3) {
                        var17[var16 + 1536] = var15;
                        var17[var16 + 1536 + 1] = var15;
                        var17[var16 + 1536 + 2] = var15;
                        var17[var16 + 1536 + 3] = var15;
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        var17[var16] = var15;
                    } else if (var11 == 1) {
                        var17[var16 + 3] = var15;
                    } else if (var11 == 2) {
                        var17[var16 + 1536 + 3] = var15;
                    } else if (var11 == 3) {
                        var17[var16 + 1536] = var15;
                    }
                }
                if (var12 == 2) {
                    if (var11 == 3) {
                        var17[var16] = var15;
                        var17[var16 + 512] = var15;
                        var17[var16 + 1024] = var15;
                        var17[var16 + 1536] = var15;
                    } else if (var11 == 0) {
                        var17[var16] = var15;
                        var17[var16 + 1] = var15;
                        var17[var16 + 2] = var15;
                        var17[var16 + 3] = var15;
                    } else if (var11 == 1) {
                        var17[var16 + 3] = var15;
                        var17[var16 + 512 + 3] = var15;
                        var17[var16 + 1024 + 3] = var15;
                        var17[var16 + 1536 + 3] = var15;
                    } else if (var11 == 2) {
                        var17[var16 + 1536] = var15;
                        var17[var16 + 1 + 1536] = var15;
                        var17[var16 + 2 + 1536] = var15;
                        var17[var16 + 1536 + 3] = var15;
                    }
                }
            } else if (!class41.method288(var14, var11, arg1, 4, arg3, arg5, arg6)) {
                return false;
            }
        }
        long var18 = class195.method1361(arg7, arg1 + arg5, arg3 + arg6);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            int var22 = (int) var18 >> 14 & 0x1F;
            class172 var23 = class49.method319(var21, 0);
            if (var23.field2875 == -1) {
                if (var22 == 9) {
                    int var24 = 15658734;
                    if (var18 > 0L) {
                        var24 = 15597568;
                    }
                    int[] var25 = class94.field1495;
                    int var26 = arg1 * 4 + (52736 - arg6 * 512) * 4 + 24624;
                    if (var20 == 0 || var20 == 2) {
                        var25[var26 + 1536] = var24;
                        var25[var26 + 1024 + 1] = var24;
                        var25[var26 + 2 + 512] = var24;
                        var25[var26 + 3] = var24;
                    } else {
                        var25[var26] = var24;
                        var25[var26 + 513] = var24;
                        var25[var26 + 1026] = var24;
                        var25[var26 + 1536 + 3] = var24;
                    }
                }
            } else if (!class41.method288(var23, var20, arg1, 4, arg3, arg5, arg6)) {
                return false;
            }
        }
        long var27 = class275.method1874(arg7, arg1 + arg5, arg3 + arg6);
        if (var27 != 0L) {
            int var29 = ((int) var27 & 0x34C59E) >> 20;
            int var30 = Integer.MAX_VALUE & (int) (var27 >>> 32);
            class172 var31 = class49.method319(var30, 0);
            if (var31.field2875 != -1 && !class41.method288(var31, var29, arg1, 4, arg3, arg5, arg6)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
    public static final void method146(byte arg0) {
        class72.field1156.method1873(-7401);
        field326++;
        if (arg0 > -14) {
            method146((byte) 66);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lfj;Z)V")
    public final void method147(class274 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1849(255);
            if (var3 == 0) {
                field324++;
                if (!arg1) {
                    field329 = null;
                    return;
                }
                return;
            }
            this.method142(arg0, var3, 75);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)I")
    public final int method148(int arg0, int arg1) {
        field317++;
        if (this.field319 == null) {
            return this.field315;
        }
        if (arg1 != -15812) {
            this.field330 = 'q';
        }
        class71 var3 = (class71) this.field319.method371(-128, (long) arg0);
        return var3 == null ? this.field315 : var3.field1138;
    }
}
