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

@OriginalClass("client!db")
public class class327 {

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Ldr;")
    private class721 field4669;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[I")
    public static int[] field4665 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Ldg;")
    private class416 field4672;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[[[B")
    public static byte[][][] field4666;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lwd;B)V")
    public static final void method1973(class276 arg0, byte arg1) {
        field4671++;
        class195 var2 = (class195) class37.field526.method21(2);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field2941; var4++) {
            if (var2.field2936[var4] != null) {
                if (var2.field2936[var4].field2987 == 2) {
                    var2.field2940[var4] = -5;
                }
                if (var2.field2936[var4].field2987 == 0) {
                    var3 = true;
                }
            }
            if (var2.field2937[var4] != null) {
                if (var2.field2937[var4].field2987 == 2) {
                    var2.field2940[var4] = -6;
                }
                if (var2.field2937[var4].field2987 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg0.field9419;
        arg0.method3798(27695, var2.field2944);
        for (int var6 = 0; var6 < var2.field2941; var6++) {
            if (var2.field2940[var6] == 0) {
                try {
                    int var7 = var2.field2934[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field2936[var6].field2986;
                        int var9 = var8.getInt(null);
                        arg0.method3823(-100, 0);
                        arg0.method3798(27695, var9);
                    } else if (var7 == 1) {
                        Field var12 = (Field) var2.field2936[var6].field2986;
                        var12.setInt(null, var2.field2942[var6]);
                        arg0.method3823(-92, 0);
                    } else if (var7 == 2) {
                        Field var10 = (Field) var2.field2936[var6].field2986;
                        int var11 = var10.getModifiers();
                        arg0.method3823(-74, 0);
                        arg0.method3798(27695, var11);
                    }
                    if (var7 == 3) {
                        Method var15 = (Method) var2.field2937[var6].field2986;
                        byte[][] var16 = var2.field2943[var6];
                        Object[] var17 = new Object[var16.length];
                        for (int var18 = 0; var18 < var16.length; var18++) {
                            ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                            var17[var18] = var19.readObject();
                        }
                        Object var20 = var15.invoke(null, var17);
                        if (var20 == null) {
                            arg0.method3823(-56, 0);
                        } else if ((var20 instanceof Number)) {
                            arg0.method3823(-49, 1);
                            arg0.method3829(14731, ((Number) var20).longValue());
                        } else if (var20 instanceof String) {
                            arg0.method3823(-105, 2);
                            arg0.method3795((String) var20, (byte) -110);
                        } else {
                            arg0.method3823(-109, 4);
                        }
                    } else if (var7 == 4) {
                        Method var13 = (Method) var2.field2937[var6].field2986;
                        int var14 = var13.getModifiers();
                        arg0.method3823(-74, 0);
                        arg0.method3798(27695, var14);
                    }
                } catch (ClassNotFoundException var21) {
                    arg0.method3823(-51, -10);
                } catch (InvalidClassException var22) {
                    arg0.method3823(-30, -11);
                } catch (StreamCorruptedException var23) {
                    arg0.method3823(-83, -12);
                } catch (OptionalDataException var24) {
                    arg0.method3823(-73, -13);
                } catch (IllegalAccessException var25) {
                    arg0.method3823(-116, -14);
                } catch (IllegalArgumentException var26) {
                    arg0.method3823(-85, -15);
                } catch (InvocationTargetException var27) {
                    arg0.method3823(-32, -16);
                } catch (SecurityException var28) {
                    arg0.method3823(-74, -17);
                } catch (IOException var29) {
                    arg0.method3823(-111, -18);
                } catch (NullPointerException var30) {
                    arg0.method3823(-34, -19);
                } catch (Exception var31) {
                    arg0.method3823(-60, -20);
                } catch (Throwable var32) {
                    arg0.method3823(-103, -21);
                }
            } else {
                arg0.method3823(-87, var2.field2940[var6]);
            }
        }
        arg0.method3808(var5, false);
        var2.method3564(true);
        if (arg1 < 88) {
            field4675 = 12;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)I")
    public static final int method1974(byte arg0, int arg1) {
        if (arg0 >= -121) {
            method1978((byte) -78);
        }
        field4674++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
    public static final boolean method1975(int arg0, int arg1) {
        field4668++;
        if (arg1 >= -111) {
            method1980(44, 33, true);
        }
        return arg0 == 2 || arg0 == 3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1976(int arg0) {
        field4673++;
        String var1 = "www";
        if (class612.field8154 == class508.field6778) {
            var1 = "www-wtrc";
        } else if (class672.field9266 == class508.field6778) {
            var1 = "www-wtqa";
        } else if (class508.field6778 == class464.field6384) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class686.field9560 != null) {
            var2 = "/p=" + class686.field9560;
        }
        return arg0 == -1 ? "http://" + var1 + "." + class683.field9532.field10630 + ".com/l=" + class713.field9854 + "/a=" + class236.field3316 + var2 + "/" : null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static void method1977(int arg0) {
        field4665 = null;
        if (arg0 == 3200) {
            field4666 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static final void method1978(byte arg0) {
        field4676++;
        if (class411.field5711.field3888.method1289(true) != 2) {
            return;
        }
        if (arg0 != 112) {
            method1973(null, (byte) -59);
        }
        byte var1 = (byte) (class405.field5645 - 4 & 0xFF);
        int var2 = class405.field5645 % class719.field10004;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class107.field1453; var18++) {
                class77.field943[var3][var2][var18] = var1;
            }
        }
        if (class507.field6775 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class419.field5774[var4] = -1000000;
            class727.field10098[var4] = 1000000;
            class756.field10508[var4] = 0;
            class227.field3232[var4] = 1000000;
            class564.field7411[var4] = 0;
        }
        int var5 = class472.field6475.field3505;
        int var6 = class472.field6475.field3502;
        if (class278.field3898 != 1 && class264.field3680 == -1) {
            int var7 = class153.method1118(class314.field4488, class694.field9662, 127, class507.field6775);
            if (var7 - class222.field3162 < 3200 && (class184.field2782[class507.field6775][class694.field9662 >> 9][class314.field4488 >> 9] & 0x4) != 0) {
                class733.method4102(1, class314.field4488 >> 9, false, class694.field9662 >> 9, class660.field8718, 0);
                return;
            }
            return;
        }
        if (class278.field3898 != 1) {
            var5 = class264.field3680;
            var6 = class12.field193;
        }
        if ((class184.field2782[class507.field6775][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class733.method4102(0, var6 >> 9, false, var5 >> 9, class660.field8718, 0);
        }
        if (class332.field4729 >= 2560) {
            return;
        }
        int var8 = class694.field9662 >> 9;
        int var9 = class314.field4488 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var10 > var8) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        int var13;
        if (var11 <= var9) {
            var13 = var9 - var11;
        } else {
            var13 = var11 - var9;
        }
        if ((var12 != 0 || var13 != 0) && (-class719.field10004) < var12 && var12 < class719.field10004 && var13 > -class107.field1453 && class107.field1453 > var13) {
            if (var13 >= var12) {
                int var14 = var12 * 65536 / var13;
                int var15 = 32768;
                while (var9 != var11) {
                    if (var9 < var11) {
                        var9++;
                    } else if (var11 < var9) {
                        var9--;
                    }
                    if ((class184.field2782[class507.field6775][var8][var9] & 0x4) != 0) {
                        class733.method4102(1, var9, false, var8, class660.field8718, arg0 - 112);
                        return;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        if (var8 < var10) {
                            var8++;
                        } else if (var8 > var10) {
                            var8--;
                        }
                        var15 -= 65536;
                        if ((class184.field2782[class507.field6775][var8][var9] & 0x4) != 0) {
                            class733.method4102(1, var9, false, var8, class660.field8718, 0);
                            return;
                        }
                    }
                }
                return;
            }
            int var16 = var13 * 65536 / var12;
            int var17 = 32768;
            while (var8 != var10) {
                if (var10 > var8) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class184.field2782[class507.field6775][var8][var9] & 0x4) != 0) {
                    class733.method4102(1, var9, false, var8, class660.field8718, arg0 - 112);
                    return;
                }
                var17 += var16;
                if (var17 >= 65536) {
                    var17 -= 65536;
                    if (var11 > var9) {
                        var9++;
                    } else if (var9 > var11) {
                        var9--;
                    }
                    if ((class184.field2782[class507.field6775][var8][var9] & 0x4) != 0) {
                        class733.method4102(1, var9, false, var8, class660.field8718, 0);
                        return;
                    }
                }
            }
            return;
        }
        class135.method1056("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class503.field6752 + "," + class334.field4757, null, 1);
        return;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Ldg;")
    public final class416 method1979(boolean arg0) {
        field4664++;
        class416 var2 = this.field4672;
        if (this.field4669.field10032 == var2) {
            this.field4672 = null;
            return null;
        }
        this.field4672 = var2.field5748;
        if (arg0) {
            method1974((byte) -46, -88);
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1980(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1978((byte) -8);
        }
        field4667++;
        return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Ldg;")
    public final class416 method1981(byte arg0) {
        field4670++;
        if (arg0 != 47) {
            return null;
        }
        class416 var2 = this.field4669.field10032.field5748;
        if (this.field4669.field10032 == var2) {
            this.field4672 = null;
            return null;
        } else {
            this.field4672 = var2.field5748;
            return var2;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class327() {
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ldr;)V")
    public class327(class721 arg0) {
        this.field4669 = arg0;
    }
}
