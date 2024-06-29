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

@OriginalClass("client!o")
public class class31 {

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Ljava/lang/String;")
    public static String field491 = null;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lhj;")
    public static class596 field493 = new class596(122, -1);

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field498 = 0;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Z")
    public static boolean field499 = true;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public int field489;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Lbr;")
    public class414 field497;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 8)
    public static void method294(byte arg0) {
        field491 = null;
        if (arg0 <= 98) {
            method294((byte) 119);
        }
        field493 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILes;I)V", line = 22)
    private final void method295(int arg0, class403 arg1, int arg2) {
        if (arg2 == 1) {
            this.field495 = arg1.method2390((byte) -108);
        } else if (arg2 == 2) {
            this.field489 = arg1.method2396((byte) 108);
            this.field492 = arg1.method2396((byte) -83);
        }
        if (arg0 >= -95) {
            field493 = null;
        }
        field490++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Lcr;", line = 50)
    public final synchronized class600 method296(int arg0) {
        field500++;
        class600 var2 = (class600) this.field497.field5407.method1684((long) this.field495, -359);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -19) {
            this.method296(15);
        }
        class600 var3 = class600.method3429(this.field497.field5402, this.field495, 0);
        if (var3 != null) {
            this.field497.field5407.method1686(-25638, (long) this.field495, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lbn;I)V", line = 73)
    public static final void method297(class468 arg0, int arg1) {
        field488++;
        class244 var2 = (class244) class130.field1611.method2725(37);
        if (var2 == null) {
            return;
        }
        int var3 = -63 / ((-arg1 - 48) / 42);
        boolean var4 = false;
        for (int var5 = 0; var5 < var2.field2880; var5++) {
            if (var2.field2875[var5] != null) {
                if (var2.field2875[var5].field7769 == 2) {
                    var2.field2879[var5] = -5;
                }
                if (var2.field2875[var5].field7769 == 0) {
                    var4 = true;
                }
            }
            if (var2.field2884[var5] != null) {
                if (var2.field2884[var5].field7769 == 2) {
                    var2.field2879[var5] = -6;
                }
                if (var2.field2884[var5].field7769 == 0) {
                    var4 = true;
                }
            }
        }
        if (var4) {
            return;
        }
        int var6 = arg0.field5262;
        arg0.method2391(74, var2.field2882);
        for (int var7 = 0; var7 < var2.field2880; var7++) {
            if (var2.field2879[var7] == 0) {
                try {
                    int var8 = var2.field2883[var7];
                    if (var8 == 0) {
                        Field var9 = (Field) var2.field2875[var7].field7768;
                        int var10 = var9.getInt(null);
                        arg0.method2353(-85, 0);
                        arg0.method2391(-118, var10);
                    } else if (var8 == 1) {
                        Field var13 = (Field) var2.field2875[var7].field7768;
                        var13.setInt(null, var2.field2881[var7]);
                        arg0.method2353(105, 0);
                    } else if (var8 == 2) {
                        Field var11 = (Field) var2.field2875[var7].field7768;
                        int var12 = var11.getModifiers();
                        arg0.method2353(-79, 0);
                        arg0.method2391(-104, var12);
                    }
                    if (var8 == 3) {
                        Method var16 = (Method) var2.field2884[var7].field7768;
                        byte[][] var17 = var2.field2877[var7];
                        Object[] var18 = new Object[var17.length];
                        for (int var19 = 0; var19 < var17.length; var19++) {
                            ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                            var18[var19] = var20.readObject();
                        }
                        Object var21 = var16.invoke(null, var18);
                        if (var21 == null) {
                            arg0.method2353(101, 0);
                        } else if (var21 instanceof Number) {
                            arg0.method2353(-69, 1);
                            arg0.method2404(-106, ((Number) var21).longValue());
                        } else if (var21 instanceof String) {
                            arg0.method2353(115, 2);
                            arg0.method2388(255, (String) var21);
                        } else {
                            arg0.method2353(-89, 4);
                        }
                    } else if (var8 == 4) {
                        Method var14 = (Method) var2.field2884[var7].field7768;
                        int var15 = var14.getModifiers();
                        arg0.method2353(66, 0);
                        arg0.method2391(99, var15);
                    }
                } catch (ClassNotFoundException var22) {
                    arg0.method2353(82, -10);
                } catch (InvalidClassException var23) {
                    arg0.method2353(-119, -11);
                } catch (StreamCorruptedException var24) {
                    arg0.method2353(-83, -12);
                } catch (OptionalDataException var25) {
                    arg0.method2353(68, -13);
                } catch (IllegalAccessException var26) {
                    arg0.method2353(-76, -14);
                } catch (IllegalArgumentException var27) {
                    arg0.method2353(-88, -15);
                } catch (InvocationTargetException var28) {
                    arg0.method2353(-84, -16);
                } catch (SecurityException var29) {
                    arg0.method2353(95, -17);
                } catch (IOException var30) {
                    arg0.method2353(-102, -18);
                } catch (NullPointerException var31) {
                    arg0.method2353(-115, -19);
                } catch (Exception var32) {
                    arg0.method2353(69, -20);
                } catch (Throwable var33) {
                    arg0.method2353(72, -21);
                }
            } else {
                arg0.method2353(76, var2.field2879[var7]);
            }
        }
        arg0.method2371(var6, 74);
        var2.method2219(13630);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Les;I)V", line = 272)
    public final void method298(class403 arg0, int arg1) {
        int var3 = -101 % ((-arg1 - 50) / 60);
        while (true) {
            int var4 = arg0.method2396((byte) 58);
            if (var4 == 0) {
                field496++;
                return;
            }
            this.method295(-116, arg0, var4);
        }
    }
}
