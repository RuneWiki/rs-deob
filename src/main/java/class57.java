import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class57 {

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field765;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field766;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field767;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method376(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class349("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field762 = 0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 13)
    public static final void method371(int arg0) {
        field760++;
        if (class120.field1624 == 0) {
            return;
        }
        try {
            if (++class8.field97 > 1500) {
                if (class199.field2847 != null) {
                    class199.field2847.method1093(false);
                    class199.field2847 = null;
                }
                if (class359.field5186 >= 1) {
                    class384.field5440 = -5;
                    class120.field1624 = 0;
                    return;
                }
                if (class299.field4344 == class165.field2364) {
                    class299.field4344 = class118.field1608;
                } else {
                    class299.field4344 = class165.field2364;
                }
                class120.field1624 = 1;
                class8.field97 = 0;
                class359.field5186++;
            }
            int var1 = -78 / ((-arg0 - 67) / 54);
            if (class120.field1624 == 1) {
                class398.field5596 = class401.field5628.method1536(class299.field4344, class396.field5571, 2099);
                class120.field1624 = 2;
            }
            if (class120.field1624 == 2) {
                if (class398.field5596.field2298 == 2) {
                    throw new IOException();
                }
                if (class398.field5596.field2298 != 1) {
                    return;
                }
                class199.field2847 = new class148((Socket) class398.field5596.field2295, class401.field5628);
                class398.field5596 = null;
                class199.field2847.method1091(false, class407.field5761.field1851, class407.field5761.field1880, 0);
                if (class153.field2271 != null) {
                    class153.field2271.method1363(-112);
                }
                if (class439.field6276 != null) {
                    class439.field6276.method1363(-113);
                }
                int var2 = class199.field2847.method1098((byte) 22);
                if (class153.field2271 != null) {
                    class153.field2271.method1363(-91);
                }
                if (class439.field6276 != null) {
                    class439.field6276.method1363(-86);
                }
                if (var2 != 101) {
                    class120.field1624 = 0;
                    class384.field5440 = var2;
                    class199.field2847.method1093(false);
                    class199.field2847 = null;
                    return;
                }
                class120.field1624 = 3;
            }
            if (class120.field1624 == 3 && class199.field2847.method1089((byte) -52) >= 2) {
                int var3 = class199.field2847.method1098((byte) 22) << 8 | class199.field2847.method1098((byte) 22);
                class409.method2591(var3, 3);
                if (class426.field6087 == -1) {
                    class120.field1624 = 0;
                    class384.field5440 = 6;
                    class199.field2847.method1093(false);
                    class199.field2847 = null;
                } else {
                    class120.field1624 = 0;
                    class199.field2847.method1093(false);
                    class199.field2847 = null;
                    class119.method732(-80);
                }
            }
        } catch (IOException var4) {
            if (class199.field2847 != null) {
                class199.field2847.method1093(false);
                class199.field2847 = null;
            }
            if (class359.field5186 < 1) {
                class8.field97 = 0;
                if (class299.field4344 == class165.field2364) {
                    class299.field4344 = class118.field1608;
                } else {
                    class299.field4344 = class165.field2364;
                }
                class359.field5186++;
                class120.field1624 = 1;
            } else {
                class120.field1624 = 0;
                class384.field5440 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 158)
    public static final void method372(int arg0) {
        if (class219.field3149 == 2) {
            class306.field4461 = 96;
        } else {
            try {
                Method var1 = (field766 == null ? (field766 = method376("java.lang.Runtime")) : field766).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class306.field4461 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field765++;
        if (arg0 != -28908) {
            method372(-85);
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V", line = 192)
    public static final void method373(int arg0) {
        class34.field424 = null;
        if (arg0 != -27054) {
            field762 = -18;
        }
        class295.field4269 = null;
        field763++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 208)
    public static final void method374(byte arg0) {
        int var1 = -56 / ((arg0 + 44) / 57);
        field758++;
        while (true) {
            class254 var2;
            class311 var4;
            do {
                do {
                    var2 = (class254) class342.field4955.method2748(-97);
                    if (var2 == null) {
                        return;
                    }
                } while (class385.field5449 == null);
                if (var2.field3757 >= 0) {
                    int var3 = var2.field3757 - 1;
                    var4 = class442.field6317[var3];
                } else {
                    int var5 = -var2.field3757 - 1;
                    if (class302.field4417 == var5) {
                        var4 = class181.field2555;
                    } else {
                        var4 = class243.field3596[var5];
                    }
                }
            } while (var4 == null);
            class282 var6 = class398.method2496(-121, var2.field3769);
            int var7;
            int var8;
            if (var2.field3767 == 1 || var2.field3767 == 3) {
                var7 = var6.field4090;
                var8 = var6.field4085;
            } else {
                var7 = var6.field4085;
                var8 = var6.field4090;
            }
            int var9 = (var8 >> 1) + var2.field3760;
            int var10 = (var8 + 1 >> 1) + var2.field3760;
            int var11 = var2.field3756 + (var7 >> 1);
            int var12 = (var7 + 1 >> 1) + var2.field3756;
            class92 var13 = class439.field6280[var4.field4464];
            int var14 = var13.method359(var9, var11) + var13.method359(var10, var11) + var13.method359(var9, var12) + var13.method359(var10, var12) >> 2;
            class143 var15 = null;
            int var16 = class278.field4002[var2.field3765];
            if (var16 == 0) {
                var15 = (class143) class431.method2683(var4.field4464, var2.field3760, var2.field3756);
            } else if (var16 == 1) {
                var15 = (class143) class145.method1084(var4.field4464, var2.field3760, var2.field3756);
            } else if (var16 == 2) {
                var15 = (class143) class233.method1613(var4.field4464, var2.field3760, var2.field3756, field767 == null ? (field767 = method376("mb")) : field767);
            } else if (var16 == 3) {
                var15 = (class143) class353.method2309(var4.field4464, var2.field3760, var2.field3756);
            }
            if (var15 != null) {
                class399.method2503(0, var16, var2.field3759, var2.field3760, -1, var2.field3766 + 1, 0, var2.field3756, -109, var4.field4464);
                var4.field4593 = var2.field3756 * 128 + var7 * 64;
                var4.field4600 = var15;
                var4.field4605 = var2.field3760 * 128 + var8 * 64;
                var4.field4598 = class34.field434 + var2.field3759;
                var4.field4602 = var2.field3766 + class34.field434;
                var4.field4592 = var14;
                int var17 = var2.field3763;
                int var18 = var2.field3758;
                int var19 = var2.field3764;
                if (var17 > var18) {
                    int var20 = var17;
                    var17 = var18;
                    var18 = var20;
                }
                int var21 = var2.field3755;
                var4.field4591 = var2.field3760 + var17;
                if (var19 > var21) {
                    int var22 = var19;
                    var19 = var21;
                    var21 = var22;
                }
                var4.field4607 = var2.field3760 + var18;
                var4.field4603 = var2.field3756 + var19;
                var4.field4608 = var2.field3756 + var21;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V", line = 345)
    public static final void method375(int arg0) {
        class228.field3379.method102((byte) -78);
        if (arg0 == 30113) {
            field759++;
        }
    }
}
