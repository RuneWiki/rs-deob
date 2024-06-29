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

@OriginalClass("client!ph")
public class class72 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "[I")
    public static int[] field1214 = new int[2048];

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[I")
    public static int[] field1218 = new int[2000];

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1215 = 0;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V", line = 17)
    public static final void method596(int arg0, int arg1) {
        field1219++;
        if (arg1 == -1 || !class51.method375(arg1, arg0 - 113)) {
            return;
        }
        class262[] var2 = class249.field4198[arg1];
        int var3 = 0;
        if (arg0 != 1) {
            method596(61, -3);
        }
        while (var3 < var2.length) {
            class262 var4 = var2[var3];
            if (var4.field4438 != null) {
                class24 var5 = new class24();
                var5.field301 = var4;
                var5.field302 = var4.field4438;
                class167.method1241(var5, 0, 2000000);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lcb;Z)V", line = 62)
    public static final void method597(class267 arg0, boolean arg1) {
        if (!arg1) {
            method602(28);
        }
        class97.field1599 = arg0;
        field1217++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 76)
    public static final void method598(byte arg0, Component arg1) {
        field1216++;
        arg1.removeKeyListener(class13.field171);
        if (arg0 != -59) {
            field1214 = (int[]) null;
        }
        arg1.removeFocusListener(class13.field171);
        class130.field2247 = -1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIILeb;IIIII)V", line = 92)
    public static final void method599(int arg0, int arg1, int arg2, class108 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg5 & 0x3;
        field1213++;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg3.field1856;
            var11 = arg3.field1837;
        } else {
            var10 = arg3.field1837;
            var11 = arg3.field1856;
        }
        int var12;
        int var13;
        if (arg6 + var11 <= 104) {
            var12 = (var11 + 1 >> 1) + arg6;
            var13 = (var11 >> 1) + arg6;
        } else {
            var12 = arg6 + 1;
            var13 = arg6;
        }
        int var14 = (arg6 << 7) + (var11 << 6);
        int var15 = (arg7 << 7) + (var10 << 6);
        int var16;
        int var17;
        if ((arg7 + var10) <= 104) {
            var16 = (var10 >> 1) + arg7;
            var17 = (var10 + 1 >> 1) + arg7;
        } else {
            var17 = arg7 + 1;
            var16 = arg7;
        }
        int[][] var18 = class53.field879[arg4];
        int var19 = 0;
        int var20 = var18[var12][var17] + var18[var13][var17] + var18[var13][var16] + var18[var12][var16] >> 2;
        if (arg4 != 0) {
            int[][] var21 = class53.field879[0];
            var19 = var20 - (var21[var12][var16] + var21[var13][var16] + var21[var12][var17] + var21[var13][var17] >> 2);
        }
        if (arg0 != -13873) {
            return;
        }
        int[][] var22 = (int[][]) null;
        if (arg4 < 3) {
            var22 = class53.field879[arg4 + 1];
        }
        class121 var23 = arg3.method835((byte) 46, arg1, true, var22, var14, var15, var20, arg5, false, (class68) null, var18);
        class18.method110(var23.field2032, var14 - arg2, var19, var15 - arg8);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lja;I)Lgg;", line = 170)
    public static final class66 method600(class60 arg0, int arg1) {
        field1220++;
        return arg1 == -1172989273 ? new class66(arg0.method487((byte) -125), arg0.method487((byte) -117), arg0.method487((byte) -94), arg0.method487((byte) -72), arg0.method489(-116), arg0.method489(-103), arg0.method501(0)) : (class66) null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBLql;)V", line = 195)
    public static final void method601(int arg0, byte arg1, class16 arg2) {
        if (arg1 > -112) {
            return;
        }
        field1221++;
        while (true) {
            class150 var3 = (class150) class191.field3183.method1250(true);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2577; var5++) {
                if (var3.field2581[var5] != null) {
                    if (var3.field2581[var5].field1330 == 2) {
                        var3.field2575[var5] = -5;
                    }
                    if (var3.field2581[var5].field1330 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2579[var5] != null) {
                    if (var3.field2579[var5].field1330 == 2) {
                        var3.field2575[var5] = -6;
                    }
                    if (var3.field2579[var5].field1330 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method87(65280, arg0);
            arg2.method518(116, 0);
            int var6 = arg2.field1012;
            arg2.method510(var3.field2585, -66);
            for (int var7 = 0; var7 < var3.field2577; var7++) {
                if (var3.field2575[var7] == 0) {
                    try {
                        int var8 = var3.field2571[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2581[var7].field1329;
                            int var10 = var9.getInt((Object) null);
                            arg2.method518(114, 0);
                            arg2.method510(var10, 50);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field2581[var7].field1329;
                            var13.setInt((Object) null, var3.field2572[var7]);
                            arg2.method518(127, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field2581[var7].field1329;
                            int var12 = var11.getModifiers();
                            arg2.method518(110, 0);
                            arg2.method510(var12, 115);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2579[var7].field1329;
                            byte[][] var17 = var3.field2582[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method518(112, 0);
                            } else if ((var21 instanceof Number)) {
                                arg2.method518(115, 1);
                                arg2.method514(30009, ((Number) var21).longValue());
                            } else if (var21 instanceof class75) {
                                arg2.method518(111, 2);
                                arg2.method516((byte) -20, (class75) var21);
                            } else {
                                arg2.method518(115, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2579[var7].field1329;
                            int var15 = var14.getModifiers();
                            arg2.method518(111, 0);
                            arg2.method510(var15, -75);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg2.method518(123, -10);
                    } catch (InvalidClassException var35) {
                        arg2.method518(103, -11);
                    } catch (StreamCorruptedException var36) {
                        arg2.method518(112, -12);
                    } catch (OptionalDataException var37) {
                        arg2.method518(124, -13);
                    } catch (IllegalAccessException var38) {
                        arg2.method518(116, -14);
                    } catch (IllegalArgumentException var39) {
                        arg2.method518(104, -15);
                    } catch (InvocationTargetException var40) {
                        arg2.method518(122, -16);
                    } catch (SecurityException var41) {
                        arg2.method518(107, -17);
                    } catch (IOException var42) {
                        arg2.method518(101, -18);
                    } catch (NullPointerException var43) {
                        arg2.method518(121, -19);
                    } catch (Exception var44) {
                        arg2.method518(106, -20);
                    } catch (Throwable var45) {
                        arg2.method518(115, -21);
                    }
                } else {
                    arg2.method518(121, var3.field2575[var7]);
                }
            }
            arg2.method519(var6, (byte) -95);
            arg2.method520(arg2.field1012 - var6, -1);
            var3.method1527(-64);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 385)
    public static void method602(int arg0) {
        field1218 = null;
        field1214 = null;
        if (arg0 != 1854581702) {
            field1218 = (int[]) null;
        }
    }
}
