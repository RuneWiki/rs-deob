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

@OriginalClass("client!ni")
public class class24 {

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Lqd;")
    private class44 field446 = new class44();

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "Lui;")
    private class268 field453;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field441 = 0;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "S")
    public static short field443 = 1;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[Ljf;")
    public static class229[] field440 = new class229[1000];

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Ljf;")
    public static class229 field436 = class212.method1457((byte) 96, "(U5");

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Z")
    public static boolean field450 = false;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "F")
    public static float field435;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 15)
    public static void method225(byte arg0) {
        if (arg0 == -38) {
            field436 = null;
            field440 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V", line = 32)
    public final void method226(byte arg0) {
        if (arg0 >= -87) {
            this.method227(118, (Object) null, -115L);
        }
        field438++;
        this.field446.method378(true);
        this.field453.method1892((byte) 113);
        this.field437 = this.field451;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/Object;J)V", line = 52)
    public final void method227(int arg0, Object arg1, long arg2) {
        field448++;
        this.method232(true, arg2);
        if (this.field437 == 0) {
            class137 var5 = (class137) this.field446.method372(3791);
            var5.method1747((byte) -70);
            var5.method1986((byte) 86);
        } else {
            this.field437--;
        }
        class84 var6 = new class84(arg1);
        this.field453.method1885(arg2, var6, (byte) -127);
        this.field446.method375(42, var6);
        var6.field4845 = 0L;
        if (arg0 != -25077) {
            field436 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lfa;II)V", line = 91)
    public static final void method228(class200 arg0, int arg1, int arg2) {
        field442++;
        if (arg2 != -15) {
            return;
        }
        while (true) {
            class127 var3 = (class127) class105.field1818.method2078(-113);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2274; var5++) {
                if (var3.field2270[var5] != null) {
                    if (var3.field2270[var5].field4011 == 2) {
                        var3.field2280[var5] = -5;
                    }
                    if (var3.field2270[var5].field4011 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2275[var5] != null) {
                    if (var3.field2275[var5].field4011 == 2) {
                        var3.field2280[var5] = -6;
                    }
                    if (var3.field2275[var5].field4011 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1397(arg1, 0);
            arg0.method140(0, (byte) 75);
            int var6 = arg0.field195;
            arg0.method100(var3.field2267, 65280);
            for (int var7 = 0; var7 < var3.field2274; var7++) {
                if (var3.field2280[var7] == 0) {
                    try {
                        int var8 = var3.field2266[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2270[var7].field4009;
                            int var13 = var12.getInt((Object) null);
                            arg0.method140(0, (byte) 75);
                            arg0.method100(var13, 65280);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field2270[var7].field4009;
                            var9.setInt((Object) null, var3.field2278[var7]);
                            arg0.method140(0, (byte) 75);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field2270[var7].field4009;
                            int var11 = var10.getModifiers();
                            arg0.method140(0, (byte) 75);
                            arg0.method100(var11, 65280);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field2275[var7].field4009;
                            byte[][] var15 = var3.field2277[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method140(0, (byte) 75);
                            } else if (var19 instanceof Number) {
                                arg0.method140(1, (byte) 75);
                                arg0.method118(((Number) var19).longValue(), (byte) -127);
                            } else if (var19 instanceof class229) {
                                arg0.method140(2, (byte) 75);
                                arg0.method107((byte) -21, (class229) var19);
                            } else {
                                arg0.method140(4, (byte) 75);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2275[var7].field4009;
                            int var21 = var20.getModifiers();
                            arg0.method140(0, (byte) 75);
                            arg0.method100(var21, 65280);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method140(-10, (byte) 75);
                    } catch (InvalidClassException var35) {
                        arg0.method140(-11, (byte) 75);
                    } catch (StreamCorruptedException var36) {
                        arg0.method140(-12, (byte) 75);
                    } catch (OptionalDataException var37) {
                        arg0.method140(-13, (byte) 75);
                    } catch (IllegalAccessException var38) {
                        arg0.method140(-14, (byte) 75);
                    } catch (IllegalArgumentException var39) {
                        arg0.method140(-15, (byte) 75);
                    } catch (InvocationTargetException var40) {
                        arg0.method140(-16, (byte) 75);
                    } catch (SecurityException var41) {
                        arg0.method140(-17, (byte) 75);
                    } catch (IOException var42) {
                        arg0.method140(-18, (byte) 75);
                    } catch (NullPointerException var43) {
                        arg0.method140(-19, (byte) 75);
                    } catch (Exception var44) {
                        arg0.method140(-20, (byte) 75);
                    } catch (Throwable var45) {
                        arg0.method140(-21, (byte) 75);
                    }
                } else {
                    arg0.method140(var3.field2280[var7], (byte) 75);
                }
            }
            arg0.method86(var6, 1513784408);
            arg0.method110(arg0.field195 - var6, (byte) 0);
            var3.method1747((byte) -81);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 280)
    public final Object method229(long arg0, int arg1) {
        field439++;
        class137 var4 = (class137) this.field453.method1890(arg0, -110);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method604(95);
        if (var5 == null) {
            var4.method1747((byte) -124);
            var4.method1986((byte) 86);
            this.field437++;
            return null;
        }
        if (var4.method605(0)) {
            class84 var6 = new class84(var5);
            this.field453.method1885(var4.field4265, var6, (byte) -122);
            this.field446.method375(arg1 + 56, var6);
            var6.field4845 = 0L;
            var4.method1747((byte) -120);
            var4.method1986((byte) 86);
        } else {
            this.field446.method375(42, var4);
            var4.field4845 = 0L;
        }
        if (arg1 != -14) {
            this.method230(false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V", line = 329)
    public final void method230(boolean arg0) {
        for (class137 var2 = (class137) this.field446.method383(!arg0); var2 != null; var2 = (class137) this.field446.method382(51)) {
            if (var2.method605(0)) {
                var2.method1747((byte) -52);
                var2.method1986((byte) 86);
                this.field437++;
            }
        }
        field449++;
        if (!arg0) {
            method228((class200) null, -96, -26);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)V", line = 354)
    public final void method231(byte arg0, int arg1) {
        field444++;
        if (arg0 != 113) {
            field452 = 87;
        }
        if (class254.field4426 == null) {
            return;
        }
        for (class137 var3 = (class137) this.field446.method383(false); var3 != null; var3 = (class137) this.field446.method382(arg0 - 45)) {
            if (var3.method605(arg0 - 113)) {
                if (var3.method604(47) == null) {
                    var3.method1747((byte) -57);
                    var3.method1986((byte) 86);
                    this.field437++;
                }
            } else if ((++var3.field4845) > ((long) arg1)) {
                class137 var4 = class254.field4426.method705(-31291, var3);
                this.field453.method1885(var3.field4265, var4, (byte) -109);
                class268.method1893(true, var4, var3);
                var3.method1747((byte) -69);
                var3.method1986((byte) 86);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZJ)V", line = 415)
    public final void method232(boolean arg0, long arg1) {
        if (!arg0) {
            this.method231((byte) 55, 73);
        }
        class137 var4 = (class137) this.field453.method1890(arg1, -114);
        if (var4 != null) {
            var4.method1747((byte) -40);
            var4.method1986((byte) 86);
            this.field437++;
        }
        field445++;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(I)V", line = 437)
    public class24(int arg0) {
        this.field437 = arg0;
        this.field451 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field453 = new class268(var2);
    }
}
