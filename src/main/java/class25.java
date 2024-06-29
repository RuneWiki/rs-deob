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

@OriginalClass("client!e")
public class class25 extends class97 {

    @OriginalMember(owner = "client!e", name = "xb", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!e", name = "vb", descriptor = "I")
    private int field588;

    @OriginalMember(owner = "client!e", name = "tb", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!e", name = "Cb", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!e", name = "Ab", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client!e", name = "Jb", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!e", name = "Gb", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "client!e", name = "Lb", descriptor = "Lua;")
    private class118 field604;

    @OriginalMember(owner = "client!e", name = "Ib", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "client!e", name = "ub", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client!e", name = "ob", descriptor = "Lhb;")
    public static class44 field581 = class102.method810("Benutzen Sie bitte eine andere Welt)3", -28606);

    @OriginalMember(owner = "client!e", name = "qb", descriptor = "Lhb;")
    public static class44 field583 = class102.method810("@whi@", -28606);

    @OriginalMember(owner = "client!e", name = "wb", descriptor = "Lhb;")
    public static class44 field589 = class102.method810("da dieser Computer gegen unsere ", -28606);

    @OriginalMember(owner = "client!e", name = "Bb", descriptor = "Lhb;")
    private static class44 field594 = class102.method810("glow2:", -28606);

    @OriginalMember(owner = "client!e", name = "zb", descriptor = "Lhb;")
    public static class44 field592 = field594;

    @OriginalMember(owner = "client!e", name = "yb", descriptor = "Lhb;")
    public static class44 field591 = class102.method810("Chat panel redrawn", -28606);

    @OriginalMember(owner = "client!e", name = "Hb", descriptor = "[I")
    public static int[] field600 = new int[200];

    @OriginalMember(owner = "client!e", name = "Mb", descriptor = "[I")
    public static int[] field605 = new int[] { 0, 5, 0, 0, 1, 6, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, -2, 0, 4, 1, -1, 3, 0, 0, 0, 0, 7, 0, 0, 3, 7, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, -2, 2, 5, 0, 0, 0, -2, 4, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 4, 6, 0, 0, 0, 0, 3, 0, 2, 2, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, -2, -1, 2, 0, 0, 1, 4, 0, 6, 0, 0, 0, 0, 3, 0, 0, 2, 0, 0, 6, 0, 0, 0, 0, 0, 8, 0, -2, 0, 0, 0, 0, 2, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 6, 0, 0, 0, 0, 5, 0, 0, 6, -2, 0, 0, -1, 0, 0, 0, 0, 8, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 1, 2, 0, 0, 0, 6, 0, 0, 0, 14, 0, 8, -2, -1, 1, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, -2, 0, 0, 0, -2, 6, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!e", name = "rb", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!e", name = "sb", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!e", name = "Db", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!e", name = "Eb", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!e", name = "Fb", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!e", name = "Kb", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!e", name = "Nb", descriptor = "Lqd;")
    public static class100 field606;

    @OriginalMember(owner = "client!e", name = "pb", descriptor = "[B")
    public static byte[] field582;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)Lde;", line = 35)
    public final class24 method209(byte arg0) {
        if (this.field604 != null) {
            int var2 = class2.field73 - this.field587;
            if (var2 > 100 && this.field604.field2881 > 0) {
                var2 = 100;
            }
            label38: {
                do {
                    do {
                        if (var2 <= this.field604.field2885[this.field601]) {
                            break label38;
                        }
                        var2 -= this.field604.field2885[this.field601];
                        this.field601++;
                    } while (this.field601 < this.field604.field2883.length);
                    this.field601 -= this.field604.field2881;
                } while (this.field601 >= 0 && this.field604.field2883.length > this.field601);
                this.field604 = null;
            }
            this.field587 = class2.field73 - var2;
        }
        field585++;
        class57 var3 = class130.method965(this.field599, 53);
        if (var3.field1446 != null) {
            var3 = var3.method533((byte) 125);
        }
        int var4 = -110 % ((35 - arg0) / 59);
        return var3 == null ? null : var3.method527(this.field604, this.field586, this.field588, this.field593, 104, this.field595, this.field590, this.field601, this.field602);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILob;I)V", line = 89)
    public static final void method210(int arg0, class86 arg1, int arg2) {
        field598++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            class53 var3 = (class53) class2.field47.method443((byte) -111);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1312; var5++) {
                if (var3.field1305[var5] != null) {
                    if (var3.field1305[var5].field2998 == 2) {
                        var3.field1318[var5] = -5;
                    }
                    if (var3.field1305[var5].field2998 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1317[var5] != null) {
                    if (var3.field1317[var5].field2998 == 2) {
                        var3.field1318[var5] = -6;
                    }
                    if (var3.field1317[var5].field2998 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method702(true, arg2);
            arg1.method993(19579, 0);
            int var6 = arg1.field3182;
            arg1.method975(var3.field1302, false);
            for (int var7 = 0; var7 < var3.field1312; var7++) {
                if (var3.field1318[var7] == 0) {
                    try {
                        int var8 = var3.field1314[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1305[var7].field2995;
                            int var13 = var12.getInt(null);
                            arg1.method993(19579, 0);
                            arg1.method975(var13, false);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field1305[var7].field2995;
                            var9.setInt(null, var3.field1316[var7]);
                            arg1.method993(arg0 ^ 0x4C7B, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field1305[var7].field2995;
                            int var11 = var10.getModifiers();
                            arg1.method993(19579, 0);
                            arg1.method975(var11, false);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field1317[var7].field2995;
                            byte[][] var17 = var3.field1319[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method993(19579, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method993(19579, 1);
                                arg1.method1018(((Number) var21).longValue(), -5952);
                            } else if (var21 instanceof class44) {
                                arg1.method993(19579, 2);
                                arg1.method980(-105, (class44) var21);
                            } else {
                                arg1.method993(19579, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1317[var7].field2995;
                            int var15 = var14.getModifiers();
                            arg1.method993(arg0 + 19579, 0);
                            arg1.method975(var15, false);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method993(19579, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method993(19579, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method993(19579, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method993(arg0 + 19579, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method993(19579, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method993(arg0 ^ 0x4C7B, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method993(19579, -16);
                    } catch (SecurityException var29) {
                        arg1.method993(19579, -17);
                    } catch (IOException var30) {
                        arg1.method993(19579, -18);
                    } catch (NullPointerException var31) {
                        arg1.method993(arg0 ^ 0x4C7B, -19);
                    } catch (Exception var32) {
                        arg1.method993(arg0 + 19579, -20);
                    } catch (Throwable var33) {
                        arg1.method993(19579, -21);
                    }
                } else {
                    arg1.method993(arg0 ^ 0x4C7B, var3.field1318[var7]);
                }
            }
            arg1.method1014((byte) 26, var6);
            arg1.method986(71, arg1.field3182 - var6);
            var3.method948(62);
        }
    }

    @OriginalMember(owner = "client!e", name = "j", descriptor = "(I)V", line = 284)
    public static final void method211(int arg0) {
        class81.field2080 = 0;
        class21.field441 = 0;
        class49.method459(arg0 - 104);
        field603++;
        class43.method366(-29198);
        class74.method622(arg0 + 24143);
        class57.method532(70);
        for (int var1 = 0; var1 < class21.field441; var1++) {
            int var3 = class64.field1614[var1];
            if (class2.field73 != class82.field2110[var3].field1345) {
                class82.field2110[var3] = null;
            }
        }
        if (class14.field275 != class53.field1304.field3182) {
            throw new RuntimeException("gpp1 pos:" + class53.field1304.field3182 + " psize:" + class14.field275);
        }
        for (int var2 = arg0; var2 < class125.field3020; var2++) {
            if (class82.field2110[class118.field2913[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class125.field3020);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIILha;)V", line = 340)
    public static final void method212(int arg0, int arg1, int arg2, int arg3, class43 arg4) {
        field597++;
        if (class71.field1744 >= 400) {
            return;
        }
        if (arg4.field1012 != null) {
            arg4 = arg4.method369(-127);
        }
        if (arg4 == null || !arg4.field998) {
            return;
        }
        class44 var5 = arg4.field1014;
        if (arg4.field1021 != arg1) {
            var5 = class117.method903(new class44[] { var5, class48.method457(class72.field1820.field2618, arg4.field1021, true), class131.field3180, class34.field829, class116.method893(arg1 + 10, arg4.field1021), class82.field2118 }, false);
        }
        if (class48.field1195 == 1) {
            class111.field2765++;
            class52.method495(arg3, 27, arg2, arg0, 1000, class117.method903(new class44[] { class95.field2421, class28.field666, var5 }, false), class11.field211);
        } else if (class44.field1071 != 1) {
            class90.field2305++;
            class44[] var6 = arg4.field990;
            if (class109.field2741) {
                var6 = class11.method77((byte) 19, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method412(0, class130.field3111)) {
                        class81.field2059++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 47;
                        }
                        if (var7 == 1) {
                            var8 = 22;
                        }
                        if (var7 == 2) {
                            var8 = 19;
                        }
                        if (var7 == 3) {
                            var8 = 25;
                        }
                        if (var7 == 4) {
                            var8 = 52;
                        }
                        class52.method495(arg3, var8, arg2, arg0, 1000, class117.method903(new class44[] { class100.field2534, var5 }, false), var6[var7]);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method412(arg1, class130.field3111)) {
                        class110.field2753++;
                        short var10 = 0;
                        if (arg4.field1021 > class72.field1820.field2618) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 47;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 22;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 19;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 25;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 52;
                        }
                        class52.method495(arg3, var11, arg2, arg0, arg1 ^ 0x3E8, class117.method903(new class44[] { class100.field2534, var5 }, false), var6[var9]);
                    }
                }
            }
            class52.method495(arg3, 1002, arg2, arg0, 1000, class117.method903(new class44[] { class100.field2534, var5 }, false), class41.field945);
            return;
        } else if ((class79.field1995 & 0x2) == 2) {
            class100.field2525++;
            class52.method495(arg3, 15, arg2, arg0, 1000, class117.method903(new class44[] { client.field376, class28.field666, var5 }, false), class13.field251);
            return;
        }
    }

    @OriginalMember(owner = "client!e", name = "k", descriptor = "(I)V", line = 481)
    public static void method213(int arg0) {
        field600 = null;
        field581 = null;
        if (arg0 != -21782) {
            method211(-126);
        }
        field592 = null;
        field605 = null;
        field591 = null;
        field594 = null;
        field589 = null;
        field583 = null;
        field582 = null;
        field606 = null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIIZ)V", line = 501)
    public class25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field590 = arg6;
        this.field588 = arg1;
        this.field586 = arg5;
        this.field595 = arg2;
        this.field593 = arg3;
        this.field602 = arg4;
        this.field599 = arg0;
        if (arg7 != -1) {
            this.field604 = client.method139(1, arg7);
            this.field601 = 0;
            this.field587 = class2.field73 - 1;
            if (arg8 && this.field604.field2881 != -1) {
                this.field601 = (int) ((double) this.field604.field2883.length * Math.random());
                this.field587 -= (int) (Math.random() * (double) this.field604.field2885[this.field601]);
                return;
            }
        }
    }
}
