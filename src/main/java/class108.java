import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class108 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lff;")
    public static class3 field2009;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIZI)V")
    public void method827(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2004++;
        if (!arg3) {
            this.method827(95, 6, 25, false, -39);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lvi;IIZ)V")
    public static final void method828(class197 arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            method828((class197) null, 52, 14, false);
        }
        if (arg0.field4526 == arg1 && arg1 != -1) {
            class67 var4 = class189.method1332(arg1, 2);
            int var5 = var4.field1162;
            if (var5 == 1) {
                arg0.field4580 = 0;
                arg0.field4529 = arg2;
                arg0.field4576 = 0;
                arg0.field4514 = 0;
                class71.method481(arg0.field4533, true, var4, arg0.field4511, arg0.field4576, false);
            }
            if (var5 == 2) {
                arg0.field4580 = 0;
            }
        } else if (arg1 == -1 || arg0.field4526 == -1 || class189.method1332(arg1, 2).field1138 >= class189.method1332(arg0.field4526, 2).field1138) {
            arg0.field4526 = arg1;
            arg0.field4529 = arg2;
            arg0.field4580 = 0;
            arg0.field4558 = arg0.field4563;
            arg0.field4514 = 0;
            arg0.field4576 = 0;
            if (arg0.field4526 != -1) {
                class71.method481(arg0.field4533, true, class189.method1332(arg0.field4526, 2), arg0.field4511, arg0.field4576, false);
            }
        }
        field2003++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Lnb;")
    public class108 method829(int arg0, int arg1, int arg2) {
        field2008++;
        return this;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static void method830(byte arg0) {
        field2009 = null;
        if (arg0 > -44) {
            field2009 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()Z")
    public boolean method831() {
        field2005++;
        return false;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lnb;IIIZ)V")
    public void method832(class108 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2007++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V")
    public static final void method833(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = class41.method317(arg1, arg4, arg3);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x3F09D4) >> 20;
            int var9 = (int) var6 >> 14 & 0x1F;
            int var10 = arg2;
            int[] var11 = class84.field1427;
            if (var6 > 0L) {
                var10 = arg0;
            }
            int var12 = (103 - arg3) * 2048 + arg4 * 4 + 24624;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class196 var14 = class132.method995(var13, 0);
            if (var14.field3407 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 1027] = var10;
                        var11[var12 + 1539] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1538] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 512 + 3] = var10;
                        var11[var12 + 1027] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1539] = var10;
                    }
                }
            } else {
                class30 var15 = null;
                if (!var14.field3390) {
                    var15 = class196.field3395[var14.field3407];
                } else if (var8 == 0) {
                    var15 = class196.field3395[var14.field3407];
                } else if (var8 == 1) {
                    var15 = class250.field4323[var14.field3407];
                } else if (var8 == 2) {
                    var15 = class103.field1737[var14.field3407];
                } else if (var8 == 3) {
                    var15 = class38.field655[var14.field3407];
                }
                if (var15 != null) {
                    int var16 = (var14.field3415 * 4 - var15.field1464) / 2;
                    int var17 = (var14.field3388 * 4 - var15.field1460) / 2;
                    var15.method197(arg4 * 4 + (var16 + 48), 48 - -((-var14.field3388 + -arg3 + 104) * 4) + var17);
                }
            }
        }
        long var18 = class101.method767(arg1, arg4, arg3);
        if (var18 != 0L) {
            int var20 = ((int) var18 & 0x309882) >> 20;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class196 var23 = class132.method995(var22, 0);
            if (var23.field3407 != -1) {
                class30 var27 = null;
                if (!var23.field3390) {
                    var27 = class196.field3395[var23.field3407];
                } else if (var20 == 0) {
                    var27 = class196.field3395[var23.field3407];
                } else if (var20 == 1) {
                    var27 = class250.field4323[var23.field3407];
                } else if (var20 == 2) {
                    var27 = class103.field1737[var23.field3407];
                } else if (var20 == 3) {
                    var27 = class38.field655[var23.field3407];
                }
                if (var27 != null) {
                    int var28 = (var23.field3415 * 4 - var27.field1464) / 2;
                    int var29 = (var23.field3388 * 4 - var27.field1460) / 2;
                    var27.method197(arg4 * 4 + (var28 + 48), var29 + 48 - -((104 - var23.field3388 + -arg3) * 4));
                }
            } else if (var21 == 9) {
                int var24 = arg4 * 4 + (((52736 - (arg3 * 512)) * 4) + 24624);
                int[] var25 = class84.field1427;
                int var26 = 15658734;
                if (var18 > 0L) {
                    var26 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var25[var24 + 1536] = var26;
                    var25[var24 + 1 + 1024] = var26;
                    var25[var24 + 2 + 512] = var26;
                    var25[var24 + 3] = var26;
                } else {
                    var25[var24] = var26;
                    var25[var24 + 1 + 512] = var26;
                    var25[var24 + 1024 + 2] = var26;
                    var25[var24 + 3 + 1536] = var26;
                }
            }
        }
        long var30 = class169.method1213(arg1, arg4, arg3);
        if (arg5 != -14287) {
            field2009 = null;
        }
        if (var30 != 0L) {
            int var32 = ((int) var30 & 0x35FE9A) >> 20;
            int var33 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
            class196 var34 = class132.method995(var33, 0);
            if (var34.field3407 != -1) {
                class30 var35 = null;
                if (!var34.field3390) {
                    var35 = class196.field3395[var34.field3407];
                } else if (var32 == 0) {
                    var35 = class196.field3395[var34.field3407];
                } else if (var32 == 1) {
                    var35 = class250.field4323[var34.field3407];
                } else if (var32 == 2) {
                    var35 = class103.field1737[var34.field3407];
                } else if (var32 == 3) {
                    var35 = class38.field655[var34.field3407];
                }
                if (var35 != null) {
                    int var36 = (var34.field3415 * 4 - var35.field1464) / 2;
                    int var37 = (var34.field3388 * 4 - var35.field1460) / 2;
                    var35.method197(arg4 * 4 + var36 + 48, (-var34.field3388 + 104 + -arg3) * 4 + var37 + 48);
                }
            }
        }
        field2006++;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()I")
    public abstract int method50();
}
