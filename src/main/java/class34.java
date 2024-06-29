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

@OriginalClass("client!eg")
public class class34 {

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    private int field469 = 0;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Lmt;")
    private class517 field463;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Laa;")
    public static class76 field464 = new class76(22, 7);

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Luv;")
    public static class2 field470 = new class2(44, 1);

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Laa;")
    public static class76 field471 = new class76(41, -1);

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field472 = 0;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "[Z")
    public static boolean[] field473 = new boolean[200];

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Ldp;")
    public static class347 field474 = new class347("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Lea;")
    private class115 field466;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)Lea;")
    public final class115 method286(boolean arg0) {
        this.field469 = 0;
        field468++;
        return arg0 ? this.method288((byte) 83) : null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static final void method287(int arg0) {
        if (arg0 >= 104) {
            class93.field1448 = null;
            field460++;
            class110.field1658 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Lea;")
    public final class115 method288(byte arg0) {
        int var2 = 34 / ((4 - arg0) / 46);
        field462++;
        if (this.field469 > 0 && this.field463.field7578[this.field469 - 1] != this.field466) {
            class115 var3 = this.field466;
            this.field466 = var3.field1741;
            return var3;
        }
        while (this.field463.field7582 > this.field469) {
            class115 var4 = this.field463.field7578[this.field469++].field1741;
            if (this.field463.field7578[this.field469 - 1] != var4) {
                this.field466 = var4.field1741;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BILdr;)V")
    public static final void method289(byte arg0, int arg1, class293 arg2) {
        if (arg0 > -27) {
            field473 = null;
        }
        field465++;
        while (true) {
            class332 var3 = (class332) class261.field3905.method2957(108);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field5149; var5++) {
                if (var3.field5151[var5] != null) {
                    if (var3.field5151[var5].field7848 == 2) {
                        var3.field5153[var5] = -5;
                    }
                    if (var3.field5151[var5].field7848 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field5144[var5] != null) {
                    if (var3.field5144[var5].field7848 == 2) {
                        var3.field5153[var5] = -6;
                    }
                    if (var3.field5144[var5].field7848 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method1819(false, arg1);
            arg2.method2754(0, 5574);
            int var6 = arg2.field6830;
            arg2.method2717(var3.field5155, 496598568);
            for (int var7 = 0; var7 < var3.field5149; var7++) {
                if (var3.field5153[var7] == 0) {
                    try {
                        int var8 = var3.field5154[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field5151[var7].field7849;
                            int var13 = var12.getInt(null);
                            arg2.method2754(0, 5574);
                            arg2.method2717(var13, 496598568);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field5151[var7].field7849;
                            var11.setInt(null, var3.field5145[var7]);
                            arg2.method2754(0, 5574);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field5151[var7].field7849;
                            int var10 = var9.getModifiers();
                            arg2.method2754(0, 5574);
                            arg2.method2717(var10, 496598568);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field5144[var7].field7849;
                            byte[][] var15 = var3.field5147[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg2.method2754(0, 5574);
                            } else if ((var19 instanceof Number)) {
                                arg2.method2754(1, 5574);
                                arg2.method2718(((Number) var19).longValue(), -81);
                            } else if (var19 instanceof String) {
                                arg2.method2754(2, 5574);
                                arg2.method2731((String) var19, (byte) -48);
                            } else {
                                arg2.method2754(4, 5574);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field5144[var7].field7849;
                            int var21 = var20.getModifiers();
                            arg2.method2754(0, 5574);
                            arg2.method2717(var21, 496598568);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method2754(-10, 5574);
                    } catch (InvalidClassException var23) {
                        arg2.method2754(-11, 5574);
                    } catch (StreamCorruptedException var24) {
                        arg2.method2754(-12, 5574);
                    } catch (OptionalDataException var25) {
                        arg2.method2754(-13, 5574);
                    } catch (IllegalAccessException var26) {
                        arg2.method2754(-14, 5574);
                    } catch (IllegalArgumentException var27) {
                        arg2.method2754(-15, 5574);
                    } catch (InvocationTargetException var28) {
                        arg2.method2754(-16, 5574);
                    } catch (SecurityException var29) {
                        arg2.method2754(-17, 5574);
                    } catch (IOException var30) {
                        arg2.method2754(-18, 5574);
                    } catch (NullPointerException var31) {
                        arg2.method2754(-19, 5574);
                    } catch (Exception var32) {
                        arg2.method2754(-20, 5574);
                    } catch (Throwable var33) {
                        arg2.method2754(-21, 5574);
                    }
                } else {
                    arg2.method2754(var3.field5153[var7], 5574);
                }
            }
            arg2.method2743(-91, var6);
            arg2.method2744(arg2.field6830 - var6, true);
            var3.method876((byte) -96);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLya;)V")
    public static final void method290(byte arg0, class11 arg1) {
        if (arg0 > -57) {
            return;
        }
        field461++;
        if (class56.field774) {
            class206.method1347(false, arg1);
        } else {
            class297.method1851(-15393, arg1);
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    public static void method291(byte arg0) {
        field474 = null;
        field471 = null;
        field470 = null;
        field473 = null;
        field464 = null;
        if (arg0 > -3) {
            field464 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lmt;)V")
    public class34(class517 arg0) {
        this.field463 = arg0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I")
    public static final int method292(int arg0, int arg1) {
        if (arg1 < 89) {
            field464 = null;
        }
        field467++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }
}
