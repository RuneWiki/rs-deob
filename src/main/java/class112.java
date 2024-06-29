import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
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

@OriginalClass("client!hw")
public class class112 {

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "I")
    public int field1380;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "Lgh;")
    public static class476 field1376;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hw", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field1383;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method694(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V", line = 9)
    public static void method687(byte arg0) {
        if (arg0 > 0) {
            field1382 = -116;
        }
        field1376 = null;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(BI)I", line = 20)
    public static final int method688(byte arg0, int arg1) {
        field1370++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg0 > -120) {
            field1376 = null;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(BILqf;)Ljava/lang/String;", line = 70)
    public static final String method689(byte arg0, int arg1, class593 arg2) {
        field1375++;
        if (arg0 <= 62) {
            field1382 = -58;
        }
        if (!client.method1682(arg2).method1779(arg1, (byte) 15) && arg2.field8607 == null) {
            return null;
        } else if (arg2.field8542 == null || arg1 >= arg2.field8542.length || arg2.field8542[arg1] == null || arg2.field8542[arg1].trim().length() == 0) {
            return class541.field7761 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field8542[arg1];
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 94)
    public static final void method690(int arg0) {
        if (arg0 != 2) {
            field1382 = 86;
        }
        field1381++;
        class108.field1302.method315(((float) class595.field8694.field6551 * 0.1F + 0.7F) * class181.field2223);
        class108.field1302.method310(class440.field6570, class601.field8778, class592.field8496, (float) (class113.field1399 << 2), (float) (class95.field1126 << 2), (float) (class477.field7040 << 2));
        class108.field1302.method392(class20.field203);
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V", line = 107)
    public static final void method691(int arg0) {
        field1374++;
        class560 var1 = (class560) class283.field3931.method719(false);
        if (arg0 != 1) {
            return;
        }
        while (var1 != null) {
            if (class431.field6408 == null) {
                var1.method2108(true);
            } else if (class287.field3982 >= var1.field7987) {
                int var2 = class547.field7838[var1.field7976];
                if (var2 == 0) {
                    class599 var9 = class491.method2948(var1.field7985, var1.field7973, var1.field7977);
                    if (var9 instanceof class249) {
                        class168.method968(var1.field7985, var1.field7973, var1.field7977);
                        class249 var10 = (class249) var9;
                        if (var10.field3538 != null) {
                            class16.method105(var1.field7985, var1.field7973, var1.field7977, var10.field3538, null);
                        }
                    }
                } else if (var2 == 1) {
                    class356 var3 = class458.method2824(var1.field7985, var1.field7973, var1.field7977);
                    if (var3 instanceof class561) {
                        class198.method1264(var1.field7985, var1.field7973, var1.field7977);
                        class561 var4 = (class561) var3;
                        if (var4.field7997 != null) {
                            class34.method190(var1.field7985, var1.field7973, var1.field7977, var4.field7997, null);
                        }
                    }
                } else if (var2 == 2) {
                    class144 var7 = class226.method1473(var1.field7985, var1.field7973, var1.field7977, field1383 == null ? (field1383 = method694("qn")) : field1383);
                    if (var7 instanceof class343) {
                        class331.method2155(var1.field7985, var1.field7973, var1.field7977, field1383 == null ? (field1383 = method694("qn")) : field1383);
                        class343 var8 = (class343) var7;
                        if (var8.field4887 != null) {
                            class367.method2355(var8.field4887, false);
                        }
                    }
                } else if (var2 == 3) {
                    class111 var5 = class157.method911(var1.field7985, var1.field7973, var1.field7977);
                    if (var5 instanceof class204) {
                        class34.method192(var1.field7985, var1.field7973, var1.field7977);
                        class204 var6 = (class204) var5;
                        if (var6.field2740 != null) {
                            class563.method3254(var1.field7985, var1.field7973, var1.field7977, var6.field2740);
                        }
                    }
                }
                var1.method2108(true);
            } else if (class287.field3982 == var1.field7986) {
                int var11 = class547.field7838[var1.field7976];
                if (var11 == 0) {
                    class599 var12 = class491.method2948(var1.field7985, var1.field7973, var1.field7977);
                    if (var12 instanceof class249) {
                        var1.method2108(true);
                    } else if (class3.method12(var1.field7985, var1.field7973, var1.field7977) == null) {
                        class249 var13 = new class249(var1.field7976, var1.field7970, var1.field7983, var1.field7968, var1.field7980, var12);
                        class16.method105(var1.field7985, var1.field7973, var1.field7977, var13, null);
                    } else {
                        var1.method2108(true);
                    }
                } else if (var11 == 1) {
                    class356 var14 = class458.method2824(var1.field7985, var1.field7973, var1.field7977);
                    if (var14 instanceof class561) {
                        var1.method2108(true);
                    } else if (class395.method2539(var1.field7985, var1.field7973, var1.field7977) == null) {
                        class561 var15 = new class561(var1.field7976, var1.field7970, var1.field7983, var1.field7968, var1.field7980, var14);
                        class34.method190(var1.field7985, var1.field7973, var1.field7977, var15, null);
                    } else {
                        var1.method2108(true);
                    }
                } else if (var11 == 2) {
                    class144 var16 = class226.method1473(var1.field7985, var1.field7973, var1.field7977, field1383 == null ? (field1383 = method694("qn")) : field1383);
                    if (var16 instanceof class343) {
                        var1.method2108(true);
                    } else {
                        class331.method2155(var1.field7985, var1.field7973, var1.field7977, field1383 == null ? (field1383 = method694("qn")) : field1383);
                        class385 var17 = class575.field8301.method1499(arg0 - 7533, var1.field7981);
                        int var18;
                        int var19;
                        if (var1.field7970 == 1 || var1.field7970 == 3) {
                            var18 = var17.field5860;
                            var19 = var17.field5858;
                        } else {
                            var18 = var17.field5858;
                            var19 = var17.field5860;
                        }
                        class343 var20 = new class343(var1.field7976, var1.field7970, var1.field7985, var1.field7983, var1.field7968, var1.field7980, var1.field7973, var19 + var1.field7973 - 1, var1.field7977, var1.field7977 + var18 - 1, var16);
                        class367.method2355(var20, false);
                    }
                } else if (var11 == 3) {
                    class111 var21 = class157.method911(var1.field7985, var1.field7973, var1.field7977);
                    if (var21 instanceof class204) {
                        var1.method2108(true);
                    } else {
                        class204 var22 = new class204(var1.field7983, var1.field7968, var1.field7980, var21);
                        class563.method3254(var1.field7985, var1.field7973, var1.field7977, var22);
                    }
                }
            }
            var1 = (class560) class283.field3931.method716(14);
        }
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V", line = 311)
    public static final void method692(int arg0) {
        field1371++;
        if (class375.field5714 != null || arg0 != -17) {
            return;
        }
        int var1 = class324.field4678;
        int var2 = class59.field674;
        int var3 = class477.field7037 - class581.field8366 - var1;
        int var4 = class434.field6446 - class298.field4407 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class114.field1430 == null) {
                var5 = class635.field9135;
            } else {
                var5 = class114.field1430;
            }
            int var6 = 0;
            int var7 = 0;
            if (class114.field1430 == var5) {
                Insets var8 = class114.field1430.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class434.field6446);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class477.field7037, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class477.field7037 - var3, var7, var3, class434.field6446);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class434.field6446 - var4, class477.field7037, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lkr;II)V", line = 381)
    public static final void method693(class645 arg0, int arg1, int arg2) {
        if (arg2 <= 19) {
            return;
        }
        field1378++;
        while (true) {
            class273 var3 = (class273) class599.field8749.method719(false);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3817; var5++) {
                if (var3.field3818[var5] != null) {
                    if (var3.field3818[var5].field2138 == 2) {
                        var3.field3822[var5] = -5;
                    }
                    if (var3.field3818[var5].field2138 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3823[var5] != null) {
                    if (var3.field3823[var5].field2138 == 2) {
                        var3.field3822[var5] = -6;
                    }
                    if (var3.field3823[var5].field2138 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method3677(-40, arg1);
            arg0.method1205((byte) -69, 0);
            int var6 = arg0.field2610;
            arg0.method1223(true, var3.field3825);
            for (int var7 = 0; var7 < var3.field3817; var7++) {
                if (var3.field3822[var7] == 0) {
                    try {
                        int var8 = var3.field3815[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3818[var7].field2140;
                            int var13 = var12.getInt(null);
                            arg0.method1205((byte) -69, 0);
                            arg0.method1223(true, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3818[var7].field2140;
                            var11.setInt(null, var3.field3819[var7]);
                            arg0.method1205((byte) -69, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field3818[var7].field2140;
                            int var10 = var9.getModifiers();
                            arg0.method1205((byte) -69, 0);
                            arg0.method1223(true, var10);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field3823[var7].field2140;
                            byte[][] var15 = var3.field3826[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg0.method1205((byte) -69, 0);
                            } else if ((var19 instanceof Number)) {
                                arg0.method1205((byte) -69, 1);
                                arg0.method1206(((Number) var19).longValue(), 4);
                            } else if (var19 instanceof String) {
                                arg0.method1205((byte) -69, 2);
                                arg0.method1237(1049279824, (String) var19);
                            } else {
                                arg0.method1205((byte) -69, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field3823[var7].field2140;
                            int var21 = var20.getModifiers();
                            arg0.method1205((byte) -69, 0);
                            arg0.method1223(true, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1205((byte) -69, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method1205((byte) -69, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1205((byte) -69, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method1205((byte) -69, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method1205((byte) -69, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1205((byte) -69, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method1205((byte) -69, -16);
                    } catch (SecurityException var29) {
                        arg0.method1205((byte) -69, -17);
                    } catch (IOException var30) {
                        arg0.method1205((byte) -69, -18);
                    } catch (NullPointerException var31) {
                        arg0.method1205((byte) -69, -19);
                    } catch (Exception var32) {
                        arg0.method1205((byte) -69, -20);
                    } catch (Throwable var33) {
                        arg0.method1205((byte) -69, -21);
                    }
                } else {
                    arg0.method1205((byte) -69, var3.field3822[var7]);
                }
            }
            arg0.method1174(128, var6);
            arg0.method1188(arg0.field2610 - var6, 92);
            var3.method2108(true);
        }
    }
}
