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

@OriginalClass("client!wn")
public class class673 implements class258 {

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public int field9578;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Lia;")
    public class547 field9575;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public int field9584;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "Lsc;")
    public class320 field9586;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public int field9577;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field9576 = 0;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field9579 = new String[200];

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field9582;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public static int field9588;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "J")
    public static long field9587;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([FIIIFIFIIIIFI)V")
    public static final void method3793(float[] arg0, int arg1, int arg2, int arg3, float arg4, int arg5, float arg6, int arg7, int arg8, int arg9, int arg10, float arg11, int arg12) {
        int var13 = arg12 - arg5;
        field9583++;
        int var14 = -69 / ((arg7 - 37) / 61);
        int var15 = arg8 - arg3;
        int var16 = arg10 - arg2;
        float var17 = arg0[2] * (float) var16 + arg0[0] * (float) var15 + arg0[1] * (float) var13;
        float var18 = arg0[5] * (float) var16 + arg0[4] * (float) var13 + arg0[3] * (float) var15;
        float var19 = arg0[8] * (float) var16 + arg0[7] * (float) var13 + arg0[6] * (float) var15;
        float var20;
        float var21;
        if (arg1 == 0) {
            var20 = arg4 + var17 + 0.5F;
            var21 = arg11 + 0.5F - var19;
        } else if (arg1 == 1) {
            var20 = arg4 + var17 + 0.5F;
            var21 = arg11 + var19 + 0.5F;
        } else if (arg1 == 2) {
            var21 = arg6 + 0.5F - var18;
            var20 = arg4 + 0.5F - var17;
        } else if (arg1 == 3) {
            var20 = arg4 + var17 + 0.5F;
            var21 = arg6 + 0.5F - var18;
        } else if (arg1 == 4) {
            var20 = arg11 + var19 + 0.5F;
            var21 = arg6 + 0.5F - var18;
        } else {
            var21 = arg6 + 0.5F - var18;
            var20 = arg11 + 0.5F - var19;
        }
        if (arg9 == 1) {
            float var23 = var20;
            var20 = -var21;
            var21 = var23;
        } else if (arg9 == 2) {
            var20 = -var20;
            var21 = -var21;
        } else if (arg9 == 3) {
            float var22 = var20;
            var20 = var21;
            var21 = -var22;
        }
        class397.field5785 = var21;
        class469.field6640 = var20;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLbw;)V")
    public static final void method3794(boolean arg0, class641 arg1) {
        field9580++;
        class485 var2 = (class485) class576.field8367.method1224(-2);
        if (var2 == null) {
            return;
        }
        boolean var3 = arg0;
        for (int var4 = 0; var4 < var2.field6942; var4++) {
            if (var2.field6933[var4] != null) {
                if (var2.field6933[var4].field6502 == 2) {
                    var2.field6938[var4] = -5;
                }
                if (var2.field6933[var4].field6502 == 0) {
                    var3 = true;
                }
            }
            if (var2.field6932[var4] != null) {
                if (var2.field6932[var4].field6502 == 2) {
                    var2.field6938[var4] = -6;
                }
                if (var2.field6932[var4].field6502 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg1.field1393;
        arg1.method715(var2.field6945, 1949991176);
        for (int var6 = 0; var6 < var2.field6942; var6++) {
            if (var2.field6938[var6] == 0) {
                try {
                    int var7 = var2.field6937[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field6933[var6].field6499;
                        int var9 = var8.getInt(null);
                        arg1.method693((byte) 106, 0);
                        arg1.method715(var9, 1949991176);
                    } else if (var7 == 1) {
                        Field var10 = (Field) var2.field6933[var6].field6499;
                        var10.setInt(null, var2.field6936[var6]);
                        arg1.method693((byte) 106, 0);
                    } else if (var7 == 2) {
                        Field var11 = (Field) var2.field6933[var6].field6499;
                        int var12 = var11.getModifiers();
                        arg1.method693((byte) 106, 0);
                        arg1.method715(var12, 1949991176);
                    }
                    if (var7 == 3) {
                        Method var13 = (Method) var2.field6932[var6].field6499;
                        byte[][] var14 = var2.field6943[var6];
                        Object[] var15 = new Object[var14.length];
                        for (int var16 = 0; var16 < var14.length; var16++) {
                            ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                            var15[var16] = var17.readObject();
                        }
                        Object var18 = var13.invoke(null, var15);
                        if (var18 == null) {
                            arg1.method693((byte) 106, 0);
                        } else if ((var18 instanceof Number)) {
                            arg1.method693((byte) 106, 1);
                            arg1.method738(118, ((Number) var18).longValue());
                        } else if ((var18 instanceof String)) {
                            arg1.method693((byte) 106, 2);
                            arg1.method750(114, (String) var18);
                        } else {
                            arg1.method693((byte) 106, 4);
                        }
                    } else if (var7 == 4) {
                        Method var19 = (Method) var2.field6932[var6].field6499;
                        int var20 = var19.getModifiers();
                        arg1.method693((byte) 106, 0);
                        arg1.method715(var20, 1949991176);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method693((byte) 106, -10);
                } catch (InvalidClassException var22) {
                    arg1.method693((byte) 106, -11);
                } catch (StreamCorruptedException var23) {
                    arg1.method693((byte) 106, -12);
                } catch (OptionalDataException var24) {
                    arg1.method693((byte) 106, -13);
                } catch (IllegalAccessException var25) {
                    arg1.method693((byte) 106, -14);
                } catch (IllegalArgumentException var26) {
                    arg1.method693((byte) 106, -15);
                } catch (InvocationTargetException var27) {
                    arg1.method693((byte) 106, -16);
                } catch (SecurityException var28) {
                    arg1.method693((byte) 106, -17);
                } catch (IOException var29) {
                    arg1.method693((byte) 106, -18);
                } catch (NullPointerException var30) {
                    arg1.method693((byte) 106, -19);
                } catch (Exception var31) {
                    arg1.method693((byte) 106, -20);
                } catch (Throwable var32) {
                    arg1.method693((byte) 106, -21);
                }
            } else {
                arg1.method693((byte) 106, var2.field6938[var6]);
            }
        }
        arg1.method687(-86, var5);
        var2.method2588(300);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
    public static void method3795(byte arg0) {
        field9579 = null;
        if (arg0 != 102) {
            method3797(32, -119);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lr;ZBI)Lla;")
    public static final class421 method3796(class167 arg0, boolean arg1, byte arg2, int arg3) {
        field9582++;
        class505 var4 = class370.method2346(arg1, (byte) -35, arg3, arg0);
        if (var4 == null) {
            return null;
        } else {
            int var5 = 44 % ((arg2 - 34) / 36);
            return var4.field7166;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)Z")
    public static final boolean method3797(int arg0, int arg1) {
        field9588++;
        if (arg0 == 1) {
            return arg1 != 1 && arg1 != 7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)Lph;")
    public class598 method474(int arg0) {
        if (arg0 == 6686) {
            field9585++;
            return class147.field2548;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(ILsc;Lia;II)V")
    public class673(int arg0, class320 arg1, class547 arg2, int arg3, int arg4) {
        this.field9578 = arg3;
        this.field9575 = arg2;
        this.field9584 = arg0;
        this.field9586 = arg1;
        this.field9577 = arg4;
    }
}
