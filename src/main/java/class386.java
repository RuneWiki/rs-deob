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

@OriginalClass("client!vm")
public class class386 {

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public int field5372 = 128;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public int field5379 = 128;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public int field5376;

    @OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
    public int field5380;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public int field5370;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public int field5374;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field5375 = 0;

    @OriginalMember(owner = "client!vm", name = "n", descriptor = "[I")
    public static int[] field5381;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public int field5368;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public int field5369;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public int field5371;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
    public int field5377;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BILjj;)V")
    public static final void method2334(byte arg0, int arg1, class66 arg2) {
        int var3 = -15 % ((arg0 - 41) / 59);
        field5373++;
        while (true) {
            class595 var4 = (class595) class588.field8516.method3188((byte) -100);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field8579; var6++) {
                if (var4.field8582[var6] != null) {
                    if (var4.field8582[var6].field6001 == 2) {
                        var4.field8586[var6] = -5;
                    }
                    if (var4.field8582[var6].field6001 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field8577[var6] != null) {
                    if (var4.field8577[var6].field6001 == 2) {
                        var4.field8586[var6] = -6;
                    }
                    if (var4.field8577[var6].field6001 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg2.method374(arg1, 6);
            arg2.method3060(0, -25098);
            int var7 = arg2.field7707;
            arg2.method3071(-74, var4.field8581);
            for (int var8 = 0; var8 < var4.field8579; var8++) {
                if (var4.field8586[var8] == 0) {
                    try {
                        int var9 = var4.field8583[var8];
                        if (var9 == 0) {
                            Field var10 = (Field) var4.field8582[var8].field6000;
                            int var11 = var10.getInt(null);
                            arg2.method3060(0, -25098);
                            arg2.method3071(-72, var11);
                        } else if (var9 == 1) {
                            Field var14 = (Field) var4.field8582[var8].field6000;
                            var14.setInt(null, var4.field8580[var8]);
                            arg2.method3060(0, -25098);
                        } else if (var9 == 2) {
                            Field var12 = (Field) var4.field8582[var8].field6000;
                            int var13 = var12.getModifiers();
                            arg2.method3060(0, -25098);
                            arg2.method3071(-46, var13);
                        }
                        if (var9 == 3) {
                            Method var17 = (Method) var4.field8577[var8].field6000;
                            byte[][] var18 = var4.field8585[var8];
                            Object[] var19 = new Object[var18.length];
                            for (int var20 = 0; var20 < var18.length; var20++) {
                                ObjectInputStream var21 = new ObjectInputStream(new ByteArrayInputStream(var18[var20]));
                                var19[var20] = var21.readObject();
                            }
                            Object var22 = var17.invoke(null, var19);
                            if (var22 == null) {
                                arg2.method3060(0, -25098);
                            } else if ((var22 instanceof Number)) {
                                arg2.method3060(1, -25098);
                                arg2.method3049(false, ((Number) var22).longValue());
                            } else if ((var22 instanceof String)) {
                                arg2.method3060(2, -25098);
                                arg2.method3040(false, (String) var22);
                            } else {
                                arg2.method3060(4, -25098);
                            }
                        } else if (var9 == 4) {
                            Method var15 = (Method) var4.field8577[var8].field6000;
                            int var16 = var15.getModifiers();
                            arg2.method3060(0, -25098);
                            arg2.method3071(-78, var16);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg2.method3060(-10, -25098);
                    } catch (InvalidClassException var24) {
                        arg2.method3060(-11, -25098);
                    } catch (StreamCorruptedException var25) {
                        arg2.method3060(-12, -25098);
                    } catch (OptionalDataException var26) {
                        arg2.method3060(-13, -25098);
                    } catch (IllegalAccessException var27) {
                        arg2.method3060(-14, -25098);
                    } catch (IllegalArgumentException var28) {
                        arg2.method3060(-15, -25098);
                    } catch (InvocationTargetException var29) {
                        arg2.method3060(-16, -25098);
                    } catch (SecurityException var30) {
                        arg2.method3060(-17, -25098);
                    } catch (IOException var31) {
                        arg2.method3060(-18, -25098);
                    } catch (NullPointerException var32) {
                        arg2.method3060(-19, -25098);
                    } catch (Exception var33) {
                        arg2.method3060(-20, -25098);
                    } catch (Throwable var34) {
                        arg2.method3060(-21, -25098);
                    }
                } else {
                    arg2.method3060(var4.field8586[var8], -25098);
                }
            }
            arg2.method3050(4, var7);
            arg2.method3084((byte) -107, arg2.field7707 - var7);
            var4.method589(-8880);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)Lvm;")
    public final class386 method2335(boolean arg0) {
        field5378++;
        if (!arg0) {
            method2337(72);
        }
        return new class386(this.field5376, this.field5379, this.field5372, this.field5370, this.field5374, this.field5380);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILvm;)V")
    public final void method2336(int arg0, class386 arg1) {
        this.field5372 = arg1.field5372;
        this.field5380 = arg1.field5380;
        this.field5374 = arg1.field5374;
        this.field5376 = arg1.field5376;
        field5382++;
        if (arg0 != 0) {
            this.field5372 = 62;
        }
        this.field5370 = arg1.field5370;
        this.field5379 = arg1.field5379;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static void method2337(int arg0) {
        field5381 = null;
        int var1 = -112 % ((-arg0 - 41) / 47);
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(I)V")
    public class386(int arg0) {
        this.field5376 = arg0;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(IIIIII)V")
    private class386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5380 = arg5;
        this.field5372 = arg2;
        this.field5370 = arg3;
        this.field5374 = arg4;
        this.field5376 = arg0;
        this.field5379 = arg1;
    }

    static {
        new class344("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field5381 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
    }
}
