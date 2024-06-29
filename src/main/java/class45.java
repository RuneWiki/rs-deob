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

@OriginalClass("client!vba")
public class class45 {

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field472 = 100;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZLuq;)V", line = 3)
    public static final void method296(boolean arg0, class172 arg1) {
        if (!arg0) {
            field472 = -125;
        }
        class272.field3959 = arg1;
        field476++;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V", line = 14)
    public static final void method297(int arg0) {
        field470++;
        while (class560.field7678.method2726(-126, class442.field6366) >= 15) {
            int var1 = class560.field7678.method2721(15, 1);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class316 var3 = (class316) class176.field2326.method1248(90, (long) var1);
            if (var3 == null) {
                class22 var4 = new class22();
                var4.field6146 = var1;
                var3 = new class316(var4);
                class176.field2326.method1247(4070, (long) var1, var3);
                class110.field1528[class181.field2380++] = var3;
                var2 = true;
            }
            class22 var5 = var3.field4455;
            class245.field3206[class178.field2352++] = var1;
            var5.field6141 = class336.field4733;
            if (var5.field217 != null && var5.field217.method1963(0)) {
                class487.method2846(var5, -12);
            }
            int var6 = class560.field7678.method2721(2, arg0 - 1);
            int var7 = (class560.field7678.method2721(3, 1) + 4 & 0xA5200007) << 11;
            int var8 = class560.field7678.method2721(5, 1);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = class560.field7678.method2721(1, 1);
            if (var9 == 1) {
                class318.field4517[class770.field10602++] = var1;
            }
            int var10 = class560.field7678.method2721(5, 1);
            if (var10 > 15) {
                var10 -= 32;
            }
            int var11 = class560.field7678.method2721(1, 1);
            var5.method132((byte) -123, class107.field1507.method3587(class560.field7678.method2721(14, 1), 0));
            var5.method2559((byte) -81, var5.field217.field4300);
            var5.field6101 = var5.field217.field4299 << 3;
            if (var2) {
                var5.method2561(false, true, var7);
            }
            var5.method115(var11 == 1, var5.method2563(-12840), class625.field8475.field6197[0] + var10, var6, class625.field8475.field6198[0] + var8, (byte) 15);
            if (var5.field217.method1963(0)) {
                class603.method3373(0, var5.field2813, null, 19515, var5.field6198[0], var5, var5.field6197[0], null);
            }
        }
        class560.field7678.method2717((byte) -37);
        if (arg0 != 2) {
            field472 = -92;
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)V", line = 94)
    public static final void method298(int arg0) {
        int var1 = 101 % ((arg0 - 12) / 55);
        field475++;
        if (class574.field7827 != null) {
            class180.field2361 = new class144();
            class180.field2361.method1010((byte) 9, class574.field7827.field3269, class574.field7827.field3266.method365(class55.field647, (byte) 92), class372.field5420, class574.field7827);
            class791.field10862 = new Thread(class180.field2361, "");
            class791.field10862.start();
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Laf;I)V", line = 112)
    public static final void method299(class459 arg0, int arg1) {
        field471++;
        class279 var2 = (class279) class769.field10591.method679((byte) -86);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field4035; var4++) {
            if (var2.field4036[var4] != null) {
                if (var2.field4036[var4].field8405 == 2) {
                    var2.field4043[var4] = -5;
                }
                if (var2.field4036[var4].field8405 == 0) {
                    var3 = true;
                }
            }
            if (var2.field4049[var4] != null) {
                if (var2.field4049[var4].field8405 == 2) {
                    var2.field4043[var4] = -6;
                }
                if (var2.field4049[var4].field8405 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg0.field3725;
        arg0.method1686(123, var2.field4039);
        if (arg1 != -20) {
            method299(null, -94);
        }
        for (int var6 = 0; var6 < var2.field4035; var6++) {
            if (var2.field4043[var6] == 0) {
                try {
                    int var7 = var2.field4048[var6];
                    if (var7 == 0) {
                        Field var11 = (Field) var2.field4036[var6].field8403;
                        int var12 = var11.getInt(null);
                        arg0.method1725(0, 79);
                        arg0.method1686(arg1 ^ 0x44, var12);
                    } else if (var7 == 1) {
                        Field var10 = (Field) var2.field4036[var6].field8403;
                        var10.setInt(null, var2.field4040[var6]);
                        arg0.method1725(0, 114);
                    } else if (var7 == 2) {
                        Field var8 = (Field) var2.field4036[var6].field8403;
                        int var9 = var8.getModifiers();
                        arg0.method1725(0, 22);
                        arg0.method1686(arg1 - 50, var9);
                    }
                    if (var7 == 3) {
                        Method var15 = (Method) var2.field4049[var6].field8403;
                        byte[][] var16 = var2.field4042[var6];
                        Object[] var17 = new Object[var16.length];
                        for (int var18 = 0; var18 < var16.length; var18++) {
                            ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                            var17[var18] = var19.readObject();
                        }
                        Object var20 = var15.invoke(null, var17);
                        if (var20 == null) {
                            arg0.method1725(0, arg1 ^ 0xFFFFFFA1);
                        } else if (var20 instanceof Number) {
                            arg0.method1725(1, 19);
                            arg0.method1670(119, ((Number) var20).longValue());
                        } else if ((var20 instanceof String)) {
                            arg0.method1725(2, 103);
                            arg0.method1678((String) var20, (byte) 53);
                        } else {
                            arg0.method1725(4, 49);
                        }
                    } else if (var7 == 4) {
                        Method var13 = (Method) var2.field4049[var6].field8403;
                        int var14 = var13.getModifiers();
                        arg0.method1725(0, arg1 ^ 0xFFFFFFA2);
                        arg0.method1686(87, var14);
                    }
                } catch (ClassNotFoundException var21) {
                    arg0.method1725(-10, 64);
                } catch (InvalidClassException var22) {
                    arg0.method1725(-11, 69);
                } catch (StreamCorruptedException var23) {
                    arg0.method1725(-12, arg1 + 107);
                } catch (OptionalDataException var24) {
                    arg0.method1725(-13, 114);
                } catch (IllegalAccessException var25) {
                    arg0.method1725(-14, arg1 + 137);
                } catch (IllegalArgumentException var26) {
                    arg0.method1725(-15, arg1 + 143);
                } catch (InvocationTargetException var27) {
                    arg0.method1725(-16, 95);
                } catch (SecurityException var28) {
                    arg0.method1725(-17, arg1 ^ -34);
                } catch (IOException var29) {
                    arg0.method1725(-18, 41);
                } catch (NullPointerException var30) {
                    arg0.method1725(-19, 63);
                } catch (Exception var31) {
                    arg0.method1725(-20, 40);
                } catch (Throwable var32) {
                    arg0.method1725(-21, 59);
                }
            } else {
                arg0.method1725(var2.field4043[var6], arg1 + 56);
            }
        }
        arg0.method1708((byte) -20, var5);
        var2.method1102((byte) 100);
    }

    @OriginalMember(owner = "client!vba", name = "toString", descriptor = "()Ljava/lang/String;", line = 299)
    public final String toString() {
        field473++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)V", line = 311)
    public static final void method300(int arg0, int arg1, int arg2) {
        class194 var3 = class443.field6387[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class755.method4140(var3.field2527);
        class755.method4140(var3.field2523);
        if (var3.field2527 != null) {
            var3.field2527 = null;
        }
        if (var3.field2523 != null) {
            var3.field2523 = null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBI)V", line = 334)
    public static final void method301(int arg0, byte arg1, int arg2) {
        class483.field6763++;
        field474++;
        class43 var3 = class492.method2903(class504.field7086, 0, class73.field983);
        var3.field457.method1690(-516533072, arg0);
        if (arg1 == -72) {
            var3.field457.method1697(arg2, true);
            class409.method2457((byte) -100, var3);
        }
    }
}
