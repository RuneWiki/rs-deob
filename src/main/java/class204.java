import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class204 implements class335 {

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[F")
    private float[] field3170 = new float[4];

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3178 = " is already on your ignore list.";

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3179 = "K";

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    private int field3168;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Lbn;")
    public static class72 field3172;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "[Lnn;")
    public static class44[] field3177;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 8)
    public final void method786(int arg0) {
        field3182++;
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var3 = (float) (((arg0 & 0x1D) >> 3) + 1) * 0.01F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        GL var5 = class162.field2654;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field3170[2] = 0.0F;
            this.field3170[0] = var4;
            this.field3170[1] = 0.0F;
            this.field3170[3] = 0.0F;
        } else {
            this.field3170[2] = var4;
            this.field3170[0] = 0.0F;
            this.field3170[1] = 0.0F;
            this.field3170[3] = 0.0F;
        }
        var5.glActiveTexture(33985);
        var5.glMatrixMode(5888);
        var5.glPushMatrix();
        var5.glLoadIdentity();
        var5.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var5.glRotatef((float) class331.field5160 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var5.glRotatef((float) class332.field5185 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var5.glTranslatef((float) (-class77.field1213), (float) (-class117.field1894), (float) (-class124.field2006));
        var5.glTexGenfv(8192, 9474, this.field3170, 0);
        this.field3170[2] = 0.0F;
        this.field3170[1] = var4;
        this.field3170[0] = 0.0F;
        this.field3170[3] = (float) class162.field2656 * var2;
        var5.glTexGenfv(8193, 9474, this.field3170, 0);
        var5.glPopMatrix();
        if (class252.field3709) {
            this.field3170[1] = 0.0F;
            this.field3170[2] = 0.0F;
            this.field3170[0] = 0.0F;
            this.field3170[3] = (float) class162.field2656 * var3;
            var5.glTexGenfv(8194, 9473, this.field3170, 0);
        } else {
            int var7 = (int) ((float) class162.field2656 * var3 * 64.0F);
            var5.glBindTexture(3553, class252.field3710[var7 % 64]);
        }
        var5.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 71)
    public static void method1458(int arg0) {
        field3179 = null;
        field3177 = null;
        field3172 = null;
        if (arg0 == 31685) {
            field3178 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lle;II)V", line = 88)
    public static final void method1459(class260 arg0, int arg1, int arg2) {
        int var3 = -93 / ((42 - arg2) / 42);
        field3181++;
        while (true) {
            class310 var4 = (class310) class288.field4508.method268(-1);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field4904; var6++) {
                if (var4.field4905[var6] != null) {
                    if (var4.field4905[var6].field405 == 2) {
                        var4.field4902[var6] = -5;
                    }
                    if (var4.field4905[var6].field405 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field4909[var6] != null) {
                    if (var4.field4909[var6].field405 == 2) {
                        var4.field4902[var6] = -6;
                    }
                    if (var4.field4909[var6].field405 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg0.method1808((byte) -74, arg1);
            arg0.method21(127, 0);
            int var7 = arg0.field48;
            arg0.method11(var4.field4907, 31932);
            for (int var8 = 0; var8 < var4.field4904; var8++) {
                if (var4.field4902[var8] == 0) {
                    try {
                        int var9 = var4.field4908[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field4905[var8].field409;
                            int var14 = var13.getInt((Object) null);
                            arg0.method21(70, 0);
                            arg0.method11(var14, 31932);
                        } else if (var9 == 1) {
                            Field var12 = (Field) var4.field4905[var8].field409;
                            var12.setInt((Object) null, var4.field4896[var8]);
                            arg0.method21(-127, 0);
                        } else if (var9 == 2) {
                            Field var10 = (Field) var4.field4905[var8].field409;
                            int var11 = var10.getModifiers();
                            arg0.method21(77, 0);
                            arg0.method11(var11, 31932);
                        }
                        if (var9 == 3) {
                            Method var15 = (Method) var4.field4909[var8].field409;
                            byte[][] var16 = var4.field4903[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; var18 < var16.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke((Object) null, var17);
                            if (var20 == null) {
                                arg0.method21(107, 0);
                            } else if (var20 instanceof Number) {
                                arg0.method21(-101, 1);
                                arg0.method59(((Number) var20).longValue(), false);
                            } else if ((var20 instanceof String)) {
                                arg0.method21(-114, 2);
                                arg0.method12((String) var20, (byte) -47);
                            } else {
                                arg0.method21(30, 4);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field4909[var8].field409;
                            int var22 = var21.getModifiers();
                            arg0.method21(88, 0);
                            arg0.method11(var22, 31932);
                        }
                    } catch (ClassNotFoundException var35) {
                        arg0.method21(-127, -10);
                    } catch (InvalidClassException var36) {
                        arg0.method21(-126, -11);
                    } catch (StreamCorruptedException var37) {
                        arg0.method21(-98, -12);
                    } catch (OptionalDataException var38) {
                        arg0.method21(32, -13);
                    } catch (IllegalAccessException var39) {
                        arg0.method21(37, -14);
                    } catch (IllegalArgumentException var40) {
                        arg0.method21(-127, -15);
                    } catch (InvocationTargetException var41) {
                        arg0.method21(-103, -16);
                    } catch (SecurityException var42) {
                        arg0.method21(-126, -17);
                    } catch (IOException var43) {
                        arg0.method21(37, -18);
                    } catch (NullPointerException var44) {
                        arg0.method21(-124, -19);
                    } catch (Exception var45) {
                        arg0.method21(119, -20);
                    } catch (Throwable var46) {
                        arg0.method21(90, -21);
                    }
                } else {
                    arg0.method21(56, var4.field4902[var8]);
                }
            }
            arg0.method27(var7, (byte) 31);
            arg0.method2(79, arg0.field48 - var7);
            var4.method489(false);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILaj;)V", line = 277)
    public static final void method1460(int arg0, class1 arg1) {
        field3167++;
        int var2 = 0;
        if (arg0 != -9401) {
            return;
        }
        while (class233.field3547 > var2) {
            int var3 = arg1.method63(127);
            int var4 = arg1.method56(19612);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (field3177[var3] != null) {
                field3177[var3].field2833 = var4;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 307)
    private final void method1461(byte arg0) {
        GL var2 = class162.field2654;
        this.field3168 = var2.glGenLists(2);
        field3180++;
        var2.glNewList(this.field3168, 4864);
        var2.glActiveTexture(33985);
        if (class252.field3709) {
            var2.glBindTexture(32879, class252.field3714);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field3168 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class252.field3709) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        int var3 = 47 / ((arg0 - 70) / 48);
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILtk;)Ljava/lang/String;", line = 351)
    public static final String method1462(int arg0, class266 arg1) {
        field3173++;
        if (arg0 == ~client.method1867(arg1).method1777(-2171)) {
            return null;
        } else if (arg1.field4072 == null || arg1.field4072.trim().length() == 0) {
            return class320.field5011 ? "Hidden-use" : null;
        } else {
            return arg1.field4072;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIII)I", line = 375)
    public static final int method1463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3175++;
        if ((arg3 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg6;
            arg6 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return (7 - arg5) + 1 - arg1;
        } else {
            if (arg2 != -1) {
                field3172 = (class72) null;
            }
            return var8 == 2 ? 7 - (arg6 - 1) - arg0 : arg5;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)V", line = 408)
    public static final void method1464(int arg0, boolean arg1) {
        field3169++;
        if (!arg1) {
            field3179 = (String) null;
        }
        class274.field4284.method2285(arg0, (byte) 111);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLpk;)V", line = 424)
    public static final void method1465(boolean arg0, class120 arg1) {
        if (arg0) {
            field3179 = (String) null;
        }
        class5.field121 = arg1;
        field3183++;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)[F", line = 437)
    public static final float[] method1466(int arg0) {
        field3176++;
        float var1 = class261.method1812() + class261.method1815();
        if (arg0 <= 119) {
            method1465(false, (class120) null);
        }
        int var2 = class261.method1818();
        float var3 = (float) (var2 >> 8 & 0xFF) / 255.0F;
        class140.field2271[3] = 1.0F;
        float var4 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class140.field2271[2] = class55.field849[2] * var5 * var6 * var1;
        class140.field2271[0] = class55.field849[0] * var4 * var6 * var1;
        class140.field2271[1] = class55.field849[1] * var3 * var6 * var1;
        return class140.field2271;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 499)
    public class204() {
        this.method1461((byte) -25);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()V", line = 468)
    public final void method787() {
        GL var1 = class162.field2654;
        field3174++;
        var1.glCallList(this.field3168 + 1);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()I", line = 478)
    public final int method784() {
        field3171++;
        return 0;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()V", line = 486)
    public final void method785() {
        field3184++;
        GL var1 = class162.field2654;
        var1.glCallList(this.field3168);
    }
}
