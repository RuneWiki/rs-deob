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

@OriginalClass("client!ts")
public class class495 extends class375 {

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    public int field7031 = 0;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "Lut;")
    public static class109 field7028 = new class109();

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "[Lrv;")
    public static class94[] field7033 = new class94[2048];

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "Lpu;")
    public static class522 field7032;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lqaa;I)V")
    public static final void method2862(class26 arg0, int arg1) {
        field7027++;
        class689 var2 = (class689) class394.field5849.method472((byte) -54);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field9702; var4++) {
            if (var2.field9701[var4] != null) {
                if (var2.field9701[var4].field7024 == 2) {
                    var2.field9700[var4] = -5;
                }
                if (var2.field9701[var4].field7024 == 0) {
                    var3 = true;
                }
            }
            if (var2.field9697[var4] != null) {
                if (var2.field9697[var4].field7024 == 2) {
                    var2.field9700[var4] = -6;
                }
                if (var2.field9697[var4].field7024 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg0.field9761;
        arg0.method3868(var2.field9698, -318419336);
        if (arg1 != -13654) {
            method2864(-50);
        }
        for (int var6 = 0; var6 < var2.field9702; var6++) {
            if (var2.field9700[var6] == 0) {
                try {
                    int var7 = var2.field9692[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field9701[var6].field7019;
                        int var9 = var8.getInt(null);
                        arg0.method3853((byte) 51, 0);
                        arg0.method3868(var9, arg1 ^ 0x12FA84D2);
                    } else if (var7 == 1) {
                        Field var12 = (Field) var2.field9701[var6].field7019;
                        var12.setInt(null, var2.field9695[var6]);
                        arg0.method3853((byte) 51, 0);
                    } else if (var7 == 2) {
                        Field var10 = (Field) var2.field9701[var6].field7019;
                        int var11 = var10.getModifiers();
                        arg0.method3853((byte) 51, 0);
                        arg0.method3868(var11, -318419336);
                    }
                    if (var7 == 3) {
                        Method var13 = (Method) var2.field9697[var6].field7019;
                        byte[][] var14 = var2.field9696[var6];
                        Object[] var15 = new Object[var14.length];
                        for (int var16 = 0; var16 < var14.length; var16++) {
                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                            var15[var16] = var17.readObject();
                        }
                        Object var18 = var13.invoke(null, var15);
                        if (var18 == null) {
                            arg0.method3853((byte) 51, 0);
                        } else if (var18 instanceof Number) {
                            arg0.method3853((byte) 51, 1);
                            arg0.method3824(16384, ((Number) var18).longValue());
                        } else if (var18 instanceof String) {
                            arg0.method3853((byte) 51, 2);
                            arg0.method3837(arg1 ^ 0xFFFFDAAC, (String) var18);
                        } else {
                            arg0.method3853((byte) 51, 4);
                        }
                    } else if (var7 == 4) {
                        Method var19 = (Method) var2.field9697[var6].field7019;
                        int var20 = var19.getModifiers();
                        arg0.method3853((byte) 51, 0);
                        arg0.method3868(var20, arg1 ^ 0x12FA84D2);
                    }
                } catch (ClassNotFoundException var21) {
                    arg0.method3853((byte) 51, -10);
                } catch (InvalidClassException var22) {
                    arg0.method3853((byte) 51, -11);
                } catch (StreamCorruptedException var23) {
                    arg0.method3853((byte) 51, -12);
                } catch (OptionalDataException var24) {
                    arg0.method3853((byte) 51, -13);
                } catch (IllegalAccessException var25) {
                    arg0.method3853((byte) 51, -14);
                } catch (IllegalArgumentException var26) {
                    arg0.method3853((byte) 51, -15);
                } catch (InvocationTargetException var27) {
                    arg0.method3853((byte) 51, -16);
                } catch (SecurityException var28) {
                    arg0.method3853((byte) 51, -17);
                } catch (IOException var29) {
                    arg0.method3853((byte) 51, -18);
                } catch (NullPointerException var30) {
                    arg0.method3853((byte) 51, -19);
                } catch (Exception var31) {
                    arg0.method3853((byte) 51, -20);
                } catch (Throwable var32) {
                    arg0.method3853((byte) 51, -21);
                }
            } else {
                arg0.method3853((byte) 51, var2.field9700[var6]);
            }
        }
        arg0.method3863((byte) -74, var5);
        var2.method3678(arg1 + 13653);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lmo;II)V")
    private final void method2863(class695 arg0, int arg1, int arg2) {
        field7030++;
        if (arg2 < 32) {
            field7028 = null;
        }
        if (arg1 == 2) {
            this.field7031 = arg0.method3847((byte) 118);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static final void method2864(int arg0) {
        int var1 = 23 / ((arg0 + 78) / 36);
        class102.field1605.method1090(107);
        field7029++;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILmo;)V")
    public final void method2865(int arg0, class695 arg1) {
        while (true) {
            int var3 = arg1.method3826(false);
            if (var3 == 0) {
                if (arg0 != 23677) {
                    method2864(80);
                }
                field7026++;
                return;
            }
            this.method2863(arg1, var3, 50);
        }
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(B)V")
    public static void method2866(byte arg0) {
        field7033 = null;
        int var1 = -64 % ((arg0 - 36) / 53);
        field7032 = null;
        field7028 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)Lkg;")
    public static final class244 method2867(int arg0, int arg1, int arg2) {
        class40 var3 = class153.field2210[arg0][arg1][arg2];
        return var3 == null ? null : var3.field669;
    }
}
