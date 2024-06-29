import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class42 {

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field605 = 0;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Loh;")
    public static class281 field607 = new class281(4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Leg;")
    public static class232 field601;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public static final void method308(int arg0, int arg1) {
        field604++;
        if (arg0 == arg1 || !class53.method394(false, arg0)) {
            return;
        }
        class228[] var2 = class193.field3052[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class228 var4 = var2[var3];
            if (var4.field3620 != null) {
                class116 var5 = new class116();
                var5.field1895 = var4.field3620;
                var5.field1892 = var4;
                class158.method1072(2000000, -5103, var5);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public static final void method309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class47.field680[0].method1296(arg5, arg3);
        class47.field680[1].method1296(arg5, arg2 + arg3 - 16);
        int var6 = (arg2 - 32) * arg2 / arg1;
        field600++;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg0 / (arg1 - arg2);
        class211.method1424(arg5, arg3 + 16, 16, arg2 - 32, class162.field2545);
        class211.method1424(arg5, arg3 + var7 + 16, 16, var6, class293.field4620);
        class211.method1426(arg5, var7 + arg3 + 16, var6, class113.field1853);
        class211.method1426(arg5 + 1, arg3 + 16 + var7, var6, class113.field1853);
        class211.method1412(arg5, arg3 + var7 + 16, 16, class113.field1853);
        class211.method1412(arg5, arg3 - (-var7 - 17), 16, class113.field1853);
        class211.method1426(arg5 + 15, arg3 + 16 + var7, var6, class34.field510);
        class211.method1426(arg5 + 14, arg3 + 17 + var7, var6 - 1, class34.field510);
        class211.method1412(arg5, arg3 + var7 + var6 + 15, 16, class34.field510);
        class211.method1412(arg5 + 1, arg3 + var7 + var6 + 14, 15, class34.field510);
        if (arg4 > -114) {
            method313((byte) -33);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Lpl;")
    public static final class293 method310(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field125; var4++) {
            class293 var5 = var3.field134[var4];
            if ((var5.field4618 >> 29 & 0x3L) == 2L && var5.field4616 == arg1 && var5.field4612 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)I")
    public static final int method311(byte arg0, int arg1) {
        field606++;
        double var2 = (double) ((arg1 & 0xFF6A57) >> 16) / 256.0D;
        double var4 = var2;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = 0.0D;
        double var12 = 0.0D;
        double var14 = (double) ((arg1 & 0xFF2E) >> 8) / 256.0D;
        if (var14 > var2) {
            var8 = var14;
        }
        if (var2 > var14) {
            var4 = var14;
        }
        if (var4 > var6) {
            var4 = var6;
        }
        if (var8 < var6) {
            var8 = var6;
        }
        double var16 = (var4 + var8) / 2.0D;
        if (var4 != var8) {
            if (var16 < 0.5D) {
                var12 = (var8 - var4) / (var4 + var8);
            }
            if (var16 >= 0.5D) {
                var12 = (var8 - var4) / (2.0D - var8 - var4);
            }
            if (var2 == var8) {
                var10 = (var14 - var6) / (var8 - var4);
            } else if (var8 == var14) {
                var10 = (var6 - var2) / (var8 - var4) + 2.0D;
            } else if (var6 == var8) {
                var10 = (var2 - var14) / (var8 - var4) + 4.0D;
            }
        }
        int var18 = (int) (var16 * 256.0D);
        int var19 = (int) (var12 * 256.0D);
        int var20 = 125 / ((69 - arg0) / 39);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        double var21 = var10 / 6.0D;
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        int var23 = (int) (var21 * 256.0D);
        return (var18 >> 1) + (var19 >> 5 << 7) + (var23 >> 2 << 10);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Lae;")
    public static final class173 method312(int arg0, int arg1) {
        field603++;
        class173 var2 = (class173) class28.field379.method728((long) arg0, (byte) -104);
        if (var2 != null) {
            return var2;
        } else if (arg1 == -123) {
            byte[] var3 = class37.field519.method1590(class141.method950(arg0, 255), (byte) -25, class117.method823(-410785432, arg0));
            class173 var4 = new class173();
            if (var3 != null) {
                var4.method1179(false, new class88(var3));
            }
            class28.field379.method737((long) arg0, 0, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method313(byte arg0) {
        field601 = null;
        if (arg0 != -111) {
            field607 = null;
        }
        field607 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static final void method314(byte arg0) {
        field602++;
        if (arg0 != -38) {
            field605 = -106;
        }
        if (class3.field21 == 0) {
            return;
        }
        try {
            if ((++class158.field2457) > 1500) {
                if (class249.field4022 != null) {
                    class249.field4022.method899((byte) 121);
                    class249.field4022 = null;
                }
                if (class109.field1793 >= 1) {
                    class217.field3353 = -5;
                    class3.field21 = 0;
                    return;
                }
                class3.field21 = 1;
                class109.field1793++;
                if (class260.field4157 == class238.field3869) {
                    class238.field3869 = class171.field2681;
                } else {
                    class238.field3869 = class260.field4157;
                }
                class158.field2457 = 0;
            }
            if (class3.field21 == 1) {
                class194.field3073 = class179.field2788.method246(class163.field2571, class238.field3869, false);
                class3.field21 = 2;
            }
            if (class3.field21 == 2) {
                if (class194.field3073.field1255 == 2) {
                    throw new IOException();
                }
                if (class194.field3073.field1255 != 1) {
                    return;
                }
                class249.field4022 = new class130((Socket) class194.field3073.field1258, class179.field2788);
                class194.field3073 = null;
                class249.field4022.method897(client.field2435.field1535, client.field2435.field1471, 0, 5000);
                if (class222.field3412 != null) {
                    class222.field3412.method558(arg0 ^ 0xFFFFFFDA);
                }
                if (class183.field2844 != null) {
                    class183.field2844.method558(arg0 + 38);
                }
                int var1 = class249.field4022.method906(-99);
                if (class222.field3412 != null) {
                    class222.field3412.method558(0);
                }
                if (class183.field2844 != null) {
                    class183.field2844.method558(arg0 ^ 0xFFFFFFDA);
                }
                if (var1 != 101) {
                    class217.field3353 = var1;
                    class3.field21 = 0;
                    class249.field4022.method899((byte) 123);
                    class249.field4022 = null;
                    return;
                }
                class3.field21 = 3;
            }
            if (class3.field21 == 3 && class249.field4022.method898(arg0 + 75) >= 2) {
                int var2 = class249.field4022.method906(-109) << 8 | class249.field4022.method906(arg0 - 84);
                class286.method1919(var2, arg0 ^ 0xFFFFFFDA);
                if (class152.field2385 == -1) {
                    class217.field3353 = 6;
                    class3.field21 = 0;
                    class249.field4022.method899((byte) 115);
                    class249.field4022 = null;
                } else {
                    class3.field21 = 0;
                    class249.field4022.method899((byte) 8);
                    class249.field4022 = null;
                    class127.method883(-76);
                }
            }
        } catch (IOException var3) {
            if (class249.field4022 != null) {
                class249.field4022.method899((byte) -98);
                class249.field4022 = null;
            }
            if (class109.field1793 < 1) {
                class158.field2457 = 0;
                class3.field21 = 1;
                if (class260.field4157 == class238.field3869) {
                    class238.field3869 = class171.field2681;
                } else {
                    class238.field3869 = class260.field4157;
                }
                class109.field1793++;
            } else {
                class3.field21 = 0;
                class217.field3353 = -4;
            }
        }
    }
}
