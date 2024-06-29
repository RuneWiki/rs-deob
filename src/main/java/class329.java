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

@OriginalClass("client!ib")
public class class329 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5223 = "M";

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5226 = "scroll:";

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field5228 = 0;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[I")
    public static int[] field5231 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lvl;")
    public static class164 field5229 = new class164(32);

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lth;")
    public static class57 field5233;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "[[Lua;")
    public static class299[][] field5237;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "[[[B")
    public static byte[][][] field5232;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 7)
    public static void method2316(int arg0) {
        field5232 = (byte[][][]) null;
        field5231 = null;
        if (arg0 <= 11) {
            field5233 = (class57) null;
        }
        field5233 = null;
        field5226 = null;
        field5229 = null;
        field5223 = null;
        field5237 = (class299[][]) null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 36)
    public static final void method2317(byte arg0) {
        if (arg0 >= -25) {
            method2317((byte) 38);
        }
        field5236++;
        class166.field2625.method2327(1);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lji;BI)V", line = 55)
    public static final void method2318(class315 arg0, byte arg1, int arg2) {
        if (arg1 >= -78) {
            field5223 = (String) null;
        }
        field5235++;
        while (true) {
            class292 var3 = (class292) class281.field4616.method2300((byte) 127);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4722; var5++) {
                if (var3.field4721[var5] != null) {
                    if (var3.field4721[var5].field3064 == 2) {
                        var3.field4720[var5] = -5;
                    }
                    if (var3.field4721[var5].field3064 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4714[var5] != null) {
                    if (var3.field4714[var5].field3064 == 2) {
                        var3.field4720[var5] = -6;
                    }
                    if (var3.field4714[var5].field3064 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method2228(arg2, 16547);
            arg0.method1712(0, -82);
            int var6 = arg0.field3760;
            arg0.method1757(var3.field4718, -117);
            for (int var7 = 0; var7 < var3.field4722; var7++) {
                if (var3.field4720[var7] == 0) {
                    try {
                        int var8 = var3.field4716[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field4721[var7].field3066;
                            int var10 = var9.getInt((Object) null);
                            arg0.method1712(0, -67);
                            arg0.method1757(var10, -115);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field4721[var7].field3066;
                            var13.setInt((Object) null, var3.field4725[var7]);
                            arg0.method1712(0, -109);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field4721[var7].field3066;
                            int var12 = var11.getModifiers();
                            arg0.method1712(0, -110);
                            arg0.method1757(var12, -100);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field4714[var7].field3066;
                            byte[][] var17 = var3.field4715[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method1712(0, -85);
                            } else if (var21 instanceof Number) {
                                arg0.method1712(1, -100);
                                arg0.method1714(0, ((Number) var21).longValue());
                            } else if ((var21 instanceof String)) {
                                arg0.method1712(2, -65);
                                arg0.method1709((String) var21, (byte) 110);
                            } else {
                                arg0.method1712(4, -92);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4714[var7].field3066;
                            int var15 = var14.getModifiers();
                            arg0.method1712(0, -91);
                            arg0.method1757(var15, -118);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method1712(-10, -100);
                    } catch (InvalidClassException var35) {
                        arg0.method1712(-11, -90);
                    } catch (StreamCorruptedException var36) {
                        arg0.method1712(-12, -80);
                    } catch (OptionalDataException var37) {
                        arg0.method1712(-13, -89);
                    } catch (IllegalAccessException var38) {
                        arg0.method1712(-14, -125);
                    } catch (IllegalArgumentException var39) {
                        arg0.method1712(-15, -103);
                    } catch (InvocationTargetException var40) {
                        arg0.method1712(-16, -119);
                    } catch (SecurityException var41) {
                        arg0.method1712(-17, -62);
                    } catch (IOException var42) {
                        arg0.method1712(-18, -98);
                    } catch (NullPointerException var43) {
                        arg0.method1712(-19, -57);
                    } catch (Exception var44) {
                        arg0.method1712(-20, -63);
                    } catch (Throwable var45) {
                        arg0.method1712(-21, -103);
                    }
                } else {
                    arg0.method1712(var3.field4720[var7], -59);
                }
            }
            arg0.method1725(var6, (byte) -78);
            arg0.method1739(-32423, arg0.field3760 - var6);
            var3.method330(15);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[Ljava/lang/Object;I[JI)V", line = 245)
    public static final void method2319(int arg0, Object[] arg1, int arg2, long[] arg3, int arg4) {
        if (arg0 > arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var9;
            for (int var10 = arg2; var10 < arg0; var10++) {
                if (arg3[var10] < ((long) (var10 & 0x1) + var7)) {
                    long var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var9;
            method2319(var6 - 1, arg1, arg2, arg3, 127);
            method2319(arg0, arg1, var6 + 1, arg3, -29);
        }
        field5230++;
        int var14 = 89 % ((71 - arg4) / 54);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)[F", line = 299)
    public static final float[] method2320(byte arg0) {
        if (arg0 <= 121) {
            method2320((byte) -37);
        }
        field5234++;
        float var1 = class167.method1303() + class167.method1298();
        int var2 = class167.method1300();
        class102.field1666[3] = 1.0F;
        float var3 = (float) (var2 >> 8 & 0xFF) / 255.0F;
        float var4 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class102.field1666[1] = class140.field2307[1] * var3 * var6 * var1;
        class102.field1666[2] = class140.field2307[2] * var5 * var6 * var1;
        class102.field1666[0] = class140.field2307[0] * var4 * var6 * var1;
        return class102.field1666;
    }
}
