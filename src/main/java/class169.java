import java.awt.FontMetrics;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class169 {

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Lhd;")
    private class129 field2682;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Lfd;")
    private class64 field2679;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Lr;")
    private class255 field2678;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "Lok;")
    public static class41 field2690 = class137.method956("", 45);

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Lda;")
    public static class212 field2687 = new class212();

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "Lok;")
    public static class41 field2695 = class137.method956(":tradereq:", 45);

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "Lok;")
    public static class41 field2694 = class137.method956("http:)4)4", 45);

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "Z")
    public static boolean field2696 = false;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "Lok;")
    public static class41 field2697 = class137.method956("sch-Utteln:", 45);

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "[I")
    public static int[] field2692 = new int[32];

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "Lok;")
    private static class41 field2700 = class137.method956("wave2:", 45);

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Lok;")
    public static class41 field2693 = field2700;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "Lok;")
    public static class41 field2699 = field2700;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "Llb;")
    private class112 field2685;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Lvd;")
    public static class161 field2676;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Lmh;")
    public static class65 field2689;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "Lmh;")
    public static class65 field2698;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2684;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "[Lbe;")
    private class92[] field2673;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1206(byte arg0) {
        int var1 = 20 / ((16 - arg0) / 61);
        field2675++;
        while (class164.field2597.method848(class1.field7, -22) >= 27) {
            int var2 = class164.field2597.method849(15, 38);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class216.field3471[var2] == null) {
                var3 = true;
                class216.field3471[var2] = new class50();
            }
            class50 var4 = class216.field3471[var2];
            class101.field1441[class97.field1419++] = var2;
            var4.field4294 = class18.field234;
            if (var4.field758 != null && var4.field758.method1011(121)) {
                class112.method773((byte) -3, var4);
            }
            var4.field758 = class165.method1156(class164.field2597.method849(14, 38), (byte) -101);
            int var5 = class164.field2597.method849(1, 38);
            if (var5 == 1) {
                class241.field3853[class85.field1239++] = var2;
            }
            int var6 = class234.field3747[class164.field2597.method849(3, 38)];
            if (var3) {
                var4.field4332 = var4.field4297 = var6;
            }
            int var7 = class164.field2597.method849(5, 38);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class164.field2597.method849(1, 38);
            int var9 = class164.field2597.method849(5, 38);
            if (var9 > 15) {
                var9 -= 32;
            }
            var4.method1904(var4.field758.field2251, -27);
            var4.field4321 = var4.field758.field2266;
            var4.field4324 = var4.field758.field2239;
            var4.field4313 = var4.field758.field2273;
            var4.field4282 = var4.field758.field2245;
            var4.field4298 = var4.field758.field2255;
            var4.field4339 = var4.field758.field2287;
            var4.field4277 = var4.field758.field2283;
            if (var4.field4282 == 0) {
                var4.field4297 = 0;
            }
            var4.field4271 = var4.field758.field2270;
            var4.method1906(-1, var8 == 1, class62.field913.field4306[0] + var9, var4.method1753((byte) -15), class62.field913.field4341[0] + var7);
            if (var4.field758.method1011(121)) {
                class74.method546(class55.field807, 5559, (class171) null, var4, 0, var4.field4306[0], var4.field4341[0], (class245) null);
            }
        }
        class164.field2597.method841((byte) 53);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLal;ZILal;)Lbe;", line = 88)
    private final class92 method1207(boolean arg0, class134 arg1, boolean arg2, int arg3, class134 arg4) {
        field2672++;
        if (this.field2685 == null) {
            throw new RuntimeException();
        }
        this.field2685.field1640 = arg3 * 8 + 5;
        if (this.field2685.field1640 >= this.field2685.field1607.length) {
            throw new RuntimeException();
        } else if (this.field2673[arg3] != null) {
            return this.field2673[arg3];
        } else if (arg2) {
            return (class92) null;
        } else {
            int var6 = this.field2685.method779(-27100);
            int var7 = this.field2685.method779(-27100);
            class92 var8 = new class92(arg3, arg1, arg4, this.field2682, this.field2679, var6, var7, arg0);
            this.field2673[arg3] = var8;
            return var8;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILal;Lal;)Lbe;", line = 128)
    public final class92 method1208(int arg0, int arg1, class134 arg2, class134 arg3) {
        field2671++;
        int var5 = 4 % ((arg0 + 38) / 54);
        return this.method1207(true, arg2, false, arg1, arg3);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILol;)V", line = 139)
    public static final void method1209(int arg0, int arg1, class118 arg2) {
        if (arg0 != -13) {
            method1206((byte) 56);
        }
        field2677++;
        while (true) {
            class33 var3 = (class33) class160.field2508.method1495(-312);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field500; var5++) {
                if (var3.field495[var5] != null) {
                    if (var3.field495[var5].field2948 == 2) {
                        var3.field509[var5] = -5;
                    }
                    if (var3.field495[var5].field2948 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field494[var5] != null) {
                    if (var3.field494[var5].field2948 == 2) {
                        var3.field509[var5] = -6;
                    }
                    if (var3.field494[var5].field2948 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method844(-4, arg1);
            arg2.method797(0, -22096);
            int var6 = arg2.field1640;
            arg2.method787(853918096, var3.field503);
            for (int var7 = 0; var7 < var3.field500; var7++) {
                if (var3.field509[var7] == 0) {
                    try {
                        int var8 = var3.field489[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field495[var7].field2945;
                            int var13 = var12.getInt((Object) null);
                            arg2.method797(0, arg0 - 22083);
                            arg2.method787(arg0 ^ 0xCD1A3E63, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field495[var7].field2945;
                            var11.setInt((Object) null, var3.field502[var7]);
                            arg2.method797(0, arg0 ^ 0x5643);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field495[var7].field2945;
                            int var10 = var9.getModifiers();
                            arg2.method797(0, arg0 - 22083);
                            arg2.method787(853918096, var10);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field494[var7].field2945;
                            byte[][] var15 = var3.field504[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method797(0, -22096);
                            } else if ((var19 instanceof Number)) {
                                arg2.method797(1, -22096);
                                arg2.method800(((Number) var19).longValue(), (byte) -113);
                            } else if ((var19 instanceof class41)) {
                                arg2.method797(2, -22096);
                                arg2.method776(arg0 + 341440893, (class41) var19);
                            } else {
                                arg2.method797(4, -22096);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field494[var7].field2945;
                            int var21 = var20.getModifiers();
                            arg2.method797(0, -22096);
                            arg2.method787(853918096, var21);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg2.method797(-10, -22096);
                    } catch (InvalidClassException var35) {
                        arg2.method797(-11, -22096);
                    } catch (StreamCorruptedException var36) {
                        arg2.method797(-12, arg0 - 22083);
                    } catch (OptionalDataException var37) {
                        arg2.method797(-13, -22096);
                    } catch (IllegalAccessException var38) {
                        arg2.method797(-14, -22096);
                    } catch (IllegalArgumentException var39) {
                        arg2.method797(-15, arg0 ^ 0x5643);
                    } catch (InvocationTargetException var40) {
                        arg2.method797(-16, -22096);
                    } catch (SecurityException var41) {
                        arg2.method797(-17, -22096);
                    } catch (IOException var42) {
                        arg2.method797(-18, -22096);
                    } catch (NullPointerException var43) {
                        arg2.method797(-19, -22096);
                    } catch (Exception var44) {
                        arg2.method797(-20, arg0 - 22083);
                    } catch (Throwable var45) {
                        arg2.method797(-21, arg0 - 22083);
                    }
                } else {
                    arg2.method797(var3.field509[var7], -22096);
                }
            }
            arg2.method788(var6, 1986104928);
            arg2.method769(32618, arg2.field1640 - var6);
            var3.method418(6971);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Z", line = 331)
    public final boolean method1210(int arg0) {
        if (arg0 != 8) {
            method1212(-119, (byte) 77);
        }
        field2688++;
        if (this.field2685 != null) {
            return true;
        }
        if (this.field2678 == null) {
            if (this.field2682.method898(true)) {
                return false;
            }
            this.field2678 = this.field2682.method900(255, (byte) 0, true, 20, 255);
        }
        if (this.field2678.field3590) {
            return false;
        } else {
            this.field2685 = new class112(this.field2678.method1266(false));
            this.field2673 = new class92[(this.field2685.field1607.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V", line = 363)
    public static void method1211(byte arg0) {
        field2693 = null;
        if (arg0 != 40) {
            method1215((byte) -41, 6, 53, 111, false, -40);
        }
        field2697 = null;
        field2694 = null;
        field2695 = null;
        field2690 = null;
        field2699 = null;
        field2692 = null;
        field2687 = null;
        field2689 = null;
        field2684 = null;
        field2698 = null;
        field2676 = null;
        field2700 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V", line = 394)
    public static final void method1212(int arg0, byte arg1) {
        field2683++;
        int var2 = 88 % ((arg1 - 12) / 35);
        class35.field532.method138(arg0, 0);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V", line = 404)
    public final void method1213(byte arg0) {
        field2680++;
        if (this.field2673 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2673.length; var2++) {
            if (this.field2673[var2] != null) {
                this.field2673[var2].method652(124);
            }
        }
        if (arg0 <= 85) {
            field2697 = (class41) null;
        }
        for (int var3 = 0; var3 < this.field2673.length; var3++) {
            if (this.field2673[var3] != null) {
                this.field2673[var3].method654((byte) 119);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lmh;B)I", line = 445)
    public static final int method1214(class65 arg0, byte arg1) {
        if (arg1 < 61) {
            return 30;
        }
        field2674++;
        int var2 = 0;
        if (arg0.method463(1, class245.field3929)) {
            var2++;
        }
        if (arg0.method463(1, class165.field2609)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BIIIZI)Ltb;", line = 467)
    public static final class199 method1215(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = (arg4 ? 65536 : 0) + arg2 + (arg5 << 17) + (arg1 << 19);
        field2686++;
        long var8 = (long) arg3 * 3147483667L + (long) var7 * 3849834839L;
        class199 var10 = (class199) class81.field1190.method136(var8, true);
        int var11 = 36 / ((1 - arg0) / 54);
        if (var10 != null) {
            return var10;
        }
        class31.field451 = false;
        class199 var12 = class65.method455(arg1, arg4, false, arg5, arg3, arg2, (byte) 55, false);
        if (var12 != null && !class31.field451) {
            class81.field1190.method132(var8, var12, -1);
        }
        return var12;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 495)
    public static final void method1216(int arg0) {
        class213.method1505();
        field2681++;
        class289.field4701 = -1;
        class88.field1298 = null;
        class235.method1693((byte) -114);
        class4.field46.method548(-100);
        class300.field4859 = new class175();
        ((class305) class31.field461).method2101((byte) -81);
        class179.field2889 = new class297[255];
        class179.field2896 = 0;
        class183.method1308();
        class263.method1868();
        class22.method159(8731);
        class57.method401((byte) 86);
        class191.method1371((byte) 121);
        for (int var1 = arg0; var1 < 2048; var1++) {
            class245 var2 = class246.field3955[var1];
            if (var2 != null) {
                var2.field3907 = null;
            }
        }
        if (class166.field2625) {
            class263.method1865(104, 104);
        }
        class128.method896(class212.field3423, (byte) -125, class181.field2937);
        class180.method1289((byte) 125, class212.field3423);
        if (class94.field1377 == 5) {
            class173.method1240(class212.field3423, 115);
        }
        if (class94.field1377 == 10) {
            class146.method1007(false, false);
        }
        if (class94.field1377 == 30) {
            class282.method1991(-8, 25);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lhd;Lfd;)V", line = 544)
    public class169(class129 arg0, class64 arg1) {
        this.field2682 = arg0;
        this.field2679 = arg1;
        if (!this.field2682.method898(true)) {
            this.field2678 = this.field2682.method900(255, (byte) 0, true, 20, 255);
        }
    }
}
