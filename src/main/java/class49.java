import java.awt.Component;
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

@OriginalClass("client!hc")
public class class49 {

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lbb;")
    public static class10 field1174 = new class10();

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1177 = -1;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1179 = 0;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Lkc;")
    private static class67 field1183 = class19.method144("skill)2", 72);

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lkc;")
    public static class67 field1180 = class19.method144("Hier klicken)1 um fortzufahren)3)3)3", 74);

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lkc;")
    public static class67 field1178 = field1183;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lkc;")
    public static class67 field1175 = class19.method144("Stufe)2", 85);

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Lkc;")
    private static class67 field1184 = class19.method144("M", 98);

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Lkc;")
    public static class67 field1186 = class19.method144("Das ist eine Mitglieder)2Welt(Q", 123);

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Lkc;")
    public static class67 field1185 = field1184;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BIILjava/awt/Component;)Lta;", line = 17)
    public static final class119 method401(byte arg0, int arg1, int arg2, Component arg3) {
        field1182++;
        try {
            if (arg0 != -16) {
                field1180 = null;
            }
            Class var4 = Class.forName("pa");
            class119 var5 = (class119) var4.getDeclaredConstructor().newInstance();
            var5.method159(arg3, arg1, false, arg2);
            return var5;
        } catch (Throwable var7) {
            class21 var6 = new class21();
            var6.method159(arg3, arg1, false, arg2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Loc;II)V", line = 41)
    public static final void method402(class91 arg0, int arg1, int arg2) {
        if (arg2 < 59) {
            field1183 = null;
        }
        field1173++;
        while (true) {
            class84 var3 = (class84) class109.field2462.method83(64);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1980; var5++) {
                if (var3.field1992[var5] != null) {
                    if (var3.field1992[var5].field1464 == 2) {
                        var3.field1976[var5] = -5;
                    }
                    if (var3.field1992[var5].field1464 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1979[var5] != null) {
                    if (var3.field1979[var5].field1464 == 2) {
                        var3.field1976[var5] = -6;
                    }
                    if (var3.field1979[var5].field1464 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method713(503, arg1);
            arg0.method1115((byte) 49, 0);
            int var6 = arg0.field3347;
            arg0.method1100(var3.field1984, (byte) 116);
            for (int var7 = 0; var7 < var3.field1980; var7++) {
                if (var3.field1976[var7] == 0) {
                    try {
                        int var8 = var3.field1981[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1992[var7].field1467;
                            int var13 = var12.getInt(null);
                            arg0.method1115((byte) 49, 0);
                            arg0.method1100(var13, (byte) -126);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field1992[var7].field1467;
                            var9.setInt(null, var3.field1987[var7]);
                            arg0.method1115((byte) 49, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field1992[var7].field1467;
                            int var11 = var10.getModifiers();
                            arg0.method1115((byte) 49, 0);
                            arg0.method1100(var11, (byte) 121);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field1979[var7].field1467;
                            byte[][] var15 = var3.field1982[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg0.method1115((byte) 49, 0);
                            } else if (var19 instanceof Number) {
                                arg0.method1115((byte) 49, 1);
                                arg0.method1083((byte) -103, ((Number) var19).longValue());
                            } else if (var19 instanceof class67) {
                                arg0.method1115((byte) 49, 2);
                                arg0.method1090((byte) -78, (class67) var19);
                            } else {
                                arg0.method1115((byte) 49, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field1979[var7].field1467;
                            int var21 = var20.getModifiers();
                            arg0.method1115((byte) 49, 0);
                            arg0.method1100(var21, (byte) -64);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1115((byte) 49, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method1115((byte) 49, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1115((byte) 49, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method1115((byte) 49, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method1115((byte) 49, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1115((byte) 49, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method1115((byte) 49, -16);
                    } catch (SecurityException var29) {
                        arg0.method1115((byte) 49, -17);
                    } catch (IOException var30) {
                        arg0.method1115((byte) 49, -18);
                    } catch (NullPointerException var31) {
                        arg0.method1115((byte) 49, -19);
                    } catch (Exception var32) {
                        arg0.method1115((byte) 49, -20);
                    } catch (Throwable var33) {
                        arg0.method1115((byte) 49, -21);
                    }
                } else {
                    arg0.method1115((byte) 49, var3.field1976[var7]);
                }
            }
            arg0.method1099(var6, (byte) 103);
            arg0.method1108(-1, arg0.field3347 - var6);
            var3.method13(76);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([Lkc;I)[Lkc;", line = 230)
    public static final class67[] method403(class67[] arg0, int arg1) {
        if (arg1 > -85) {
            return null;
        }
        field1181++;
        class67[] var2 = new class67[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class63.method479(new class67[] { class71.method586(103, var3), class141.field3401 }, 0);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class63.method479(new class67[] { var2[var3], arg0[var3] }, 0);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 258)
    public static final void method404(byte arg0) {
        field1171++;
        if (arg0 < 76) {
            field1184 = null;
        }
        if (class115.field2705 != 1) {
            return;
        }
        if (class74.field1758 >= 539 && class74.field1758 <= 573 && class109.field2504 >= 169 && class109.field2504 < 205 && class122.field2894[0] != -1) {
            class131.field3089 = 0;
            class121.field2849 = true;
            class96.field2165 = true;
        }
        if (class74.field1758 >= 569 && class74.field1758 <= 599 && class109.field2504 >= 168 && class109.field2504 < 205 && class122.field2894[1] != -1) {
            class96.field2165 = true;
            class121.field2849 = true;
            class131.field3089 = 1;
        }
        if (class74.field1758 >= 597 && class74.field1758 <= 627 && class109.field2504 >= 168 && class109.field2504 < 205 && class122.field2894[2] != -1) {
            class131.field3089 = 2;
            class121.field2849 = true;
            class96.field2165 = true;
        }
        if (class74.field1758 >= 625 && class74.field1758 <= 669 && class109.field2504 >= 168 && class109.field2504 < 203 && class122.field2894[3] != -1) {
            class96.field2165 = true;
            class131.field3089 = 3;
            class121.field2849 = true;
        }
        if (class74.field1758 >= 666 && class74.field1758 <= 696 && class109.field2504 >= 168 && class109.field2504 < 205 && class122.field2894[4] != -1) {
            class96.field2165 = true;
            class121.field2849 = true;
            class131.field3089 = 4;
        }
        if (class74.field1758 >= 694 && class74.field1758 <= 724 && class109.field2504 >= 168 && class109.field2504 < 205 && class122.field2894[5] != -1) {
            class131.field3089 = 5;
            class121.field2849 = true;
            class96.field2165 = true;
        }
        if (class74.field1758 >= 722 && class74.field1758 <= 756 && class109.field2504 >= 169 && class109.field2504 < 205 && class122.field2894[6] != -1) {
            class131.field3089 = 6;
            class96.field2165 = true;
            class121.field2849 = true;
        }
        if (class74.field1758 >= 540 && class74.field1758 <= 574 && class109.field2504 >= 466 && class109.field2504 < 502 && class122.field2894[7] != -1) {
            class121.field2849 = true;
            class96.field2165 = true;
            class131.field3089 = 7;
        }
        if (class74.field1758 >= 572 && class74.field1758 <= 602 && class109.field2504 >= 466 && class109.field2504 < 503 && class122.field2894[8] != -1) {
            class121.field2849 = true;
            class131.field3089 = 8;
            class96.field2165 = true;
        }
        if (class74.field1758 >= 599 && class74.field1758 <= 629 && class109.field2504 >= 466 && class109.field2504 < 503 && class122.field2894[9] != -1) {
            class131.field3089 = 9;
            class121.field2849 = true;
            class96.field2165 = true;
        }
        if (class74.field1758 >= 627 && class74.field1758 <= 671 && class109.field2504 >= 467 && class109.field2504 < 502 && class122.field2894[10] != -1) {
            class96.field2165 = true;
            class121.field2849 = true;
            class131.field3089 = 10;
        }
        if (class74.field1758 >= 669 && class74.field1758 <= 699 && class109.field2504 >= 466 && class109.field2504 < 503 && class122.field2894[11] != -1) {
            class131.field3089 = 11;
            class96.field2165 = true;
            class121.field2849 = true;
        }
        if (class74.field1758 >= 696 && class74.field1758 <= 726 && class109.field2504 >= 466 && class109.field2504 < 503 && class122.field2894[12] != -1) {
            class121.field2849 = true;
            class131.field3089 = 12;
            class96.field2165 = true;
        }
        if (class74.field1758 >= 724 && class74.field1758 <= 758 && class109.field2504 >= 466 && class109.field2504 < 502 && class122.field2894[13] != -1) {
            class96.field2165 = true;
            class121.field2849 = true;
            class131.field3089 = 13;
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I", line = 377)
    public static final int method405(int arg0, int arg1, int arg2) {
        field1170++;
        class102 var3 = (class102) class82.field1954.method462(false, (long) arg1);
        if (var3 == null) {
            return -1;
        } else if (~arg0 <= arg2 && var3.field2299.length > arg0) {
            return var3.field2299[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)I", line = 393)
    public static final int method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1166++;
        int var7 = arg1 & 0x3;
        if (arg2 <= 115) {
            return 31;
        }
        if ((arg3 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 1 + 7 - arg0 - arg6;
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg5;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)I", line = 427)
    public static final int method407(byte arg0) {
        field1167++;
        if (arg0 != -9) {
            method406(-66, 43, 85, 32, 55, 121, -50);
        }
        return 5;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 439)
    public static final void method408(int arg0) {
        class69.field1649 = 0;
        class34.field834 = 0;
        field1172++;
        class127.method990(188);
        class97.method750((byte) 9);
        class24.method189(72);
        for (int var1 = 0; var1 < class34.field834; var1++) {
            int var4 = class60.field1435[var1];
            if (class135.field3243 != class9.field189[var4].field1217) {
                class9.field189[var4].field1542 = null;
                class9.field189[var4] = null;
            }
        }
        if (class133.field3166 != class112.field2558.field3347) {
            throw new RuntimeException("gnp1 pos:" + class112.field2558.field3347 + " psize:" + class133.field3166);
        }
        for (int var2 = 0; var2 < class130.field3042; var2++) {
            if (class9.field189[class65.field1530[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class130.field3042);
            }
        }
        int var3 = -117 / ((arg0 - 59) / 51);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 506)
    public static void method409(int arg0) {
        if (arg0 != -2267) {
            method401((byte) 80, -128, 39, null);
        }
        field1184 = null;
        field1178 = null;
        field1175 = null;
        field1174 = null;
        field1186 = null;
        field1185 = null;
        field1180 = null;
        field1183 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILac;Lac;)V", line = 530)
    public static final void method410(int arg0, class4 arg1, class4 arg2) {
        field1169++;
        class66.field1549 = arg2;
        if (arg0 == -15) {
            class85.field2004 = arg1;
        }
    }
}
