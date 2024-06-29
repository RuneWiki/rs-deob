import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class119 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Le;")
    public static class191 field1955 = class54.method368("null", 2047);

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Le;")
    public static class191 field1961 = class54.method368("(U0a )2 via: ", 2047);

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Le;")
    public static class191 field1962 = class54.method368("<col=ff7000>", 2047);

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field1963 = 0;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Z")
    public static final boolean method786(int arg0) {
        if (arg0 != 2253) {
            method788((Object) null, true, true);
        }
        field1960++;
        if (class70.field1238 != 0) {
            try {
                class43.field754.method1357(false, class167.field2820.field4379);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method787(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1956++;
        long var6 = class241.method1687(arg0, arg1, arg2);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 14 & 0x1F;
            int var9 = arg4;
            int var10 = ((int) var6 & 0x3EA718) >> 20;
            int var11 = (52736 - (arg2 * 512)) * 4 + ((arg1 * 4) + 24624);
            int[] var12 = class7.field69;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class102 var14 = class31.method216(var13, (byte) 126);
            if (var6 > 0L) {
                var9 = arg3;
            }
            if (var14.field1668 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var10 == 0) {
                        var12[var11] = var9;
                        var12[var11 + 512] = var9;
                        var12[var11 + 1024] = var9;
                        var12[var11 + 1536] = var9;
                    } else if (var10 == 1) {
                        var12[var11] = var9;
                        var12[var11 + 1] = var9;
                        var12[var11 + 2] = var9;
                        var12[var11 + 3] = var9;
                    } else if (var10 == 2) {
                        var12[var11 + 3] = var9;
                        var12[var11 + 515] = var9;
                        var12[var11 + 1027] = var9;
                        var12[var11 + 1536 + 3] = var9;
                    } else if (var10 == 3) {
                        var12[var11 + 1536] = var9;
                        var12[var11 + 1537] = var9;
                        var12[var11 + 1538] = var9;
                        var12[var11 + 1539] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var10 == 0) {
                        var12[var11] = var9;
                    } else if (var10 == 1) {
                        var12[var11 + 3] = var9;
                    } else if (var10 == 2) {
                        var12[var11 + 3 + 1536] = var9;
                    } else if (var10 == 3) {
                        var12[var11 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var10 == 3) {
                        var12[var11] = var9;
                        var12[var11 + 512] = var9;
                        var12[var11 + 1024] = var9;
                        var12[var11 + 1536] = var9;
                    } else if (var10 == 0) {
                        var12[var11] = var9;
                        var12[var11 + 1] = var9;
                        var12[var11 + 2] = var9;
                        var12[var11 + 3] = var9;
                    } else if (var10 == 1) {
                        var12[var11 + 3] = var9;
                        var12[var11 + 515] = var9;
                        var12[var11 + 3 + 1024] = var9;
                        var12[var11 + 3 + 1536] = var9;
                    } else if (var10 == 2) {
                        var12[var11 + 1536] = var9;
                        var12[var11 + 1536 + 1] = var9;
                        var12[var11 + 2 + 1536] = var9;
                        var12[var11 + 1536 + 3] = var9;
                    }
                }
            } else {
                class60 var15 = null;
                if (!var14.field1642) {
                    var15 = class79.field1355[var14.field1668];
                } else if (var10 == 0) {
                    var15 = class79.field1355[var14.field1668];
                } else if (var10 == 1) {
                    var15 = class169.field2857[var14.field1668];
                } else if (var10 == 2) {
                    var15 = class23.field323[var14.field1668];
                } else if (var10 == 3) {
                    var15 = class31.field436[var14.field1668];
                }
                if (var15 != null) {
                    int var16 = (var14.field1652 * 4 - var15.field4146) / 2;
                    int var17 = (var14.field1686 * 4 - var15.field4139) / 2;
                    var15.method404(arg1 * 4 + var16 + 48, (-var14.field1686 + -arg2 + 104) * 4 + 48 + var17);
                }
            }
        }
        long var18 = class197.method1389(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = ((int) var18 & 0x36E72D) >> 20;
            int var21 = ((int) var18 & 0x7D41B) >> 14;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class102 var23 = class31.method216(var22, (byte) 124);
            if (var23.field1668 != -1) {
                class60 var24 = null;
                if (!var23.field1642) {
                    var24 = class79.field1355[var23.field1668];
                } else if (var20 == 0) {
                    var24 = class79.field1355[var23.field1668];
                } else if (var20 == 1) {
                    var24 = class169.field2857[var23.field1668];
                } else if (var20 == 2) {
                    var24 = class23.field323[var23.field1668];
                } else if (var20 == 3) {
                    var24 = class31.field436[var23.field1668];
                }
                if (var24 != null) {
                    int var25 = (var23.field1652 * 4 - var24.field4146) / 2;
                    int var26 = (var23.field1686 * 4 - var24.field4139) / 2;
                    var24.method404(arg1 * 4 + var25 + 48, 48 - (-((-var23.field1686 + 104 - arg2) * 4) - var26));
                }
            } else if (var21 == 9) {
                int var27 = (103 - arg2) * 2048 + ((arg1 * 4) + 24624);
                int[] var28 = class7.field69;
                int var29 = 15658734;
                if (var18 > 0L) {
                    var29 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var28[var27 + 1536] = var29;
                    var28[var27 + 1024 + 1] = var29;
                    var28[var27 + 512 + 2] = var29;
                    var28[var27 + 3] = var29;
                } else {
                    var28[var27] = var29;
                    var28[var27 + 1 + 512] = var29;
                    var28[var27 + 1024 + 2] = var29;
                    var28[var27 + 1536 + 3] = var29;
                }
            }
        }
        long var30 = class192.method1365(arg0, arg1, arg2);
        if (var30 != 0L) {
            int var32 = ((int) var30 & 0x3E5D85) >> 20;
            int var33 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
            class102 var34 = class31.method216(var33, (byte) 126);
            if (var34.field1668 != -1) {
                class60 var35 = null;
                if (!var34.field1642) {
                    var35 = class79.field1355[var34.field1668];
                } else if (var32 == 0) {
                    var35 = class79.field1355[var34.field1668];
                } else if (var32 == 1) {
                    var35 = class169.field2857[var34.field1668];
                } else if (var32 == 2) {
                    var35 = class23.field323[var34.field1668];
                } else if (var32 == 3) {
                    var35 = class31.field436[var34.field1668];
                }
                if (var35 != null) {
                    int var36 = (var34.field1652 * 4 - var35.field4146) / 2;
                    int var37 = (var34.field1686 * 4 - var35.field4139) / 2;
                    var35.method404(arg1 * 4 + (var36 + 48), (-arg2 + 104 + -var34.field1686) * 4 + var37 + 48);
                }
            }
        }
        if (arg5) {
            field1962 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
    public static final byte[] method788(Object arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            field1962 = null;
        }
        field1959++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class26.method187(var3, -113) : var3;
        } else if (arg0 instanceof class42) {
            class42 var4 = (class42) arg0;
            return var4.method276(7752);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static void method789(int arg0) {
        field1962 = null;
        field1961 = null;
        if (arg0 == 4106008) {
            field1955 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLe;)V")
    public static final void method790(int arg0, byte arg1, class191 arg2) {
        class241 var3 = class14.method97(2, arg0, -49);
        if (arg1 > -15) {
            method788((Object) null, false, true);
        }
        field1964++;
        var3.method1694((byte) -90);
        var3.field4298 = arg2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method791(byte arg0) {
        int var1 = class17.field232;
        field1958++;
        int var2 = class118.field1941;
        int var3 = class133.field2240 - class200.field3584 - var1;
        if (arg0 != 71) {
            method786(41);
        }
        int var4 = class249.field4434 - class190.field3337 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class141.field2362 != null) {
                var5 = class141.field2362;
            } else if (class114.field1884 == null) {
                var5 = class167.field2820.field4379;
            } else {
                var5 = class114.field1884;
            }
            int var6 = 0;
            int var7 = 0;
            if (class114.field1884 == var5) {
                Insets var8 = class114.field1884.getInsets();
                var7 = var8.left;
                var6 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var6, var1, class249.field4434);
            }
            if (var2 > 0) {
                var9.fillRect(var7, var6, class133.field2240, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var7 + class133.field2240 - var3, var6, var3, class249.field4434);
            }
            if (var4 > 0) {
                var9.fillRect(var7, var6 - (var4 - class249.field4434), class133.field2240, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }
}
