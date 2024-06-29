import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class10 implements class98 {

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field191 = -1;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lsf;")
    public static class33 field187 = new class33();

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lia;")
    public static class257 field196 = class28.method234(71, "<br>(X");

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lmb;")
    public static class178 field194;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lvb;")
    public static class226 field195;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[I")
    public static int[] field197;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
    public static final void method116(int arg0, int arg1) {
        if (arg0 <= 63) {
            method121((class257) null, (byte) -66, true);
        }
        class164.field2857.method831(arg1, -128);
        field193++;
        class29.field547.method831(arg1, -123);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    public static final void method117(int arg0, int arg1, int arg2) {
        field186++;
        class33 var3 = class78.field1499[class189.field3261][arg1][arg0];
        if (var3 == null) {
            class83.method630(class189.field3261, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class112 var5 = null;
        class112 var6 = (class112) var3.method288(26111);
        if (arg2 != 4) {
            return;
        }
        while (var6 != null) {
            class14 var13 = class156.method1090(var6.field2043.field3, 0);
            int var14 = var13.field300;
            if (var13.field255 == 1) {
                var14 = (var6.field2043.field10 + 1) * var14;
            }
            if (var14 > var4) {
                var5 = var6;
                var4 = var14;
            }
            var6 = (class112) var3.method277(arg2 - 3);
        }
        if (var5 == null) {
            class83.method630(class189.field3261, arg1, arg0);
            return;
        }
        var3.method284(var5, 27886);
        class112 var7 = (class112) var3.method288(26111);
        class1 var8 = null;
        class1 var9 = null;
        while (var7 != null) {
            class1 var12 = var7.field2043;
            if (var5.field2043.field3 != var12.field3) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field3 != var12.field3 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class112) var3.method277(1);
        }
        long var10 = (long) ((arg0 << 7) + arg1 + 1610612736);
        class109.method800(class189.field3261, arg1, arg0, class109.method803(class189.field3261, arg0 * 128 + 64, (byte) -95, arg1 * 128 + 64), var5.field2043, var10, var8, var9);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static void method118(boolean arg0) {
        field195 = null;
        field194 = null;
        field196 = null;
        field187 = null;
        if (arg0) {
            field197 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IJ[II)Lia;")
    public final class257 method119(int arg0, long arg1, int[] arg2, int arg3) {
        field190++;
        if (arg3 == 0) {
            class81 var6 = class179.method1229(arg2[0], 877891460);
            return var6.method604((byte) 74, (int) arg1);
        } else if (arg3 == 1 || arg3 == 10) {
            class14 var7 = class156.method1090((int) arg1, arg0 ^ 0x6);
            return var7.field295;
        } else if (arg0 == arg3 || arg3 == 7) {
            return class179.method1229(arg2[0], 877891460).method604((byte) 74, (int) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIII)V")
    public static final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = class40.method327(arg0, arg2, arg1);
        field192++;
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = (int) var6 >> 14 & 0x1F;
            int var10 = arg5;
            if (var6 > 0L) {
                var10 = arg4;
            }
            int[] var11 = class23.field445;
            int var12 = 24624 - (-(arg2 * 4) - (52736 - arg1 * 512) * 4);
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class233 var14 = class5.method96(var13, false);
            if (var14.field4021 == -1) {
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
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1537] = var10;
                        var11[var12 + 1538] = var10;
                        var11[var12 + 1539] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1539] = var10;
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
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1537] = var10;
                        var11[var12 + 1538] = var10;
                        var11[var12 + 1539] = var10;
                    }
                }
            } else {
                class155 var15 = class13.field254[var14.field4021];
                if (var15 != null) {
                    int var16 = (var14.field3950 * 4 - var15.field1724) / 2;
                    int var17 = (var14.field3986 * 4 - var15.field1730) / 2;
                    var15.method673(arg2 * 4 + var16 + 48, (104 - (var14.field3986 + arg1)) * 4 + 48 + var17);
                }
            }
        }
        long var18 = class200.method1348(arg0, arg2, arg1);
        if (var18 != 0L) {
            int var20 = ((int) var18 & 0x7CB5C) >> 14;
            int var21 = ((int) var18 & 0x3E2BBE) >> 20;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class233 var23 = class5.method96(var22, false);
            if (var23.field4021 != -1) {
                class155 var24 = class13.field254[var23.field4021];
                if (var24 != null) {
                    int var25 = (var23.field3950 * 4 - var24.field1724) / 2;
                    int var26 = (var23.field3986 * 4 - var24.field1730) / 2;
                    var24.method673(arg2 * 4 + var25 + 48, 48 - -((-var23.field3986 + -arg1 + 104) * 4) + var26);
                }
            } else if (var20 == 9) {
                int var27 = 15658734;
                if (var18 > 0L) {
                    var27 = 15597568;
                }
                int[] var28 = class23.field445;
                int var29 = (103 - arg1) * 4 * 512 + arg2 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1025] = var27;
                    var28[var29 + 2 + 512] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 513] = var27;
                    var28[var29 + 1024 + 2] = var27;
                    var28[var29 + 1536 + 3] = var27;
                }
            }
        }
        long var30 = class129.method900(arg0, arg2, arg1);
        if (var30 != 0L) {
            int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
            class233 var33 = class5.method96(var32, false);
            if (var33.field4021 != -1) {
                class155 var34 = class13.field254[var33.field4021];
                if (var34 != null) {
                    int var35 = (var33.field3950 * 4 - var34.field1724) / 2;
                    int var36 = (var33.field3986 * 4 - var34.field1730) / 2;
                    var34.method673(arg2 * 4 + var35 + 48, 48 - -((-arg1 + 104 + -var33.field3986) * 4) - -var36);
                }
            }
        }
        if (arg3 != -8369) {
            field197 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lia;BZ)V")
    public static final void method121(class257 arg0, byte arg1, boolean arg2) {
        field188++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = -74 % ((arg1 + 26) / 39);
        int var6 = class3.field93.method776(arg0, 250);
        int var7 = var3 + 6;
        int var8 = class3.field93.method781(arg0, 250) * 13;
        class23.method198(var4 - var3, -var3 + var7, var6 + var3 + var3, var3 + var8 + var3, 0);
        class23.method208(var4 - var3, -var3 + var7, var3 + var6 + var3, var3 + var8 + var3, 16777215);
        class3.field93.method775(arg0, var4, var7, var6, var8, 16777215, -1, 1, 1, 0);
        class82.method617(var7 - var3, var3 + var6 + var3, (byte) -121, var3 + var8 + var3, -var3 + var4);
        if (!arg2) {
            class246.method1617(var6, 0, var7, var4, var8);
            return;
        }
        try {
            Graphics var9 = class156.field2728.getGraphics();
            class256.field4387.method830(0, -1097334752, 0, var9);
        } catch (Exception var10) {
            class156.field2728.repaint();
        }
    }
}
