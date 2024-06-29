import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
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

@OriginalClass("client!ll")
public abstract class class218 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Z")
    private boolean field3286;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    private int field3292;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    private int field3296;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "Ltt;")
    public class249 field3289;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Z")
    public static boolean field3288 = false;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "J")
    public static long field3293 = -1L;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Z")
    public static boolean field3284 = false;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3297 = null;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILuu;)V")
    public static final void method1502(int arg0, int arg1, class428 arg2) {
        if (arg0 != 31675) {
            field3294 = 40;
        }
        field3285++;
        while (true) {
            class336 var3 = (class336) class195.field3056.method295((byte) -34);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field5066; var5++) {
                if (var3.field5055[var5] != null) {
                    if (var3.field5055[var5].field4974 == 2) {
                        var3.field5065[var5] = -5;
                    }
                    if (var3.field5055[var5].field4974 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field5057[var5] != null) {
                    if (var3.field5057[var5].field4974 == 2) {
                        var3.field5065[var5] = -6;
                    }
                    if (var3.field5057[var5].field4974 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method2675(arg1, -4);
            arg2.method1381(0, (byte) 126);
            int var6 = arg2.field2982;
            arg2.method1348((byte) -65, var3.field5058);
            for (int var7 = 0; var7 < var3.field5066; var7++) {
                if (var3.field5065[var7] == 0) {
                    try {
                        int var8 = var3.field5060[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field5055[var7].field4975;
                            int var10 = var9.getInt(null);
                            arg2.method1381(0, (byte) 101);
                            arg2.method1348((byte) -65, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field5055[var7].field4975;
                            var13.setInt(null, var3.field5063[var7]);
                            arg2.method1381(0, (byte) 101);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field5055[var7].field4975;
                            int var12 = var11.getModifiers();
                            arg2.method1381(0, (byte) 83);
                            arg2.method1348((byte) -65, var12);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field5057[var7].field4975;
                            byte[][] var15 = var3.field5054[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg2.method1381(0, (byte) 82);
                            } else if ((var19 instanceof Number)) {
                                arg2.method1381(1, (byte) 96);
                                arg2.method1385(((Number) var19).longValue(), (byte) -98);
                            } else if (var19 instanceof String) {
                                arg2.method1381(2, (byte) 86);
                                arg2.method1343((String) var19, (byte) -14);
                            } else {
                                arg2.method1381(4, (byte) 123);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field5057[var7].field4975;
                            int var21 = var20.getModifiers();
                            arg2.method1381(0, (byte) 124);
                            arg2.method1348((byte) -65, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1381(-10, (byte) 85);
                    } catch (InvalidClassException var23) {
                        arg2.method1381(-11, (byte) 92);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1381(-12, (byte) 97);
                    } catch (OptionalDataException var25) {
                        arg2.method1381(-13, (byte) 107);
                    } catch (IllegalAccessException var26) {
                        arg2.method1381(-14, (byte) 94);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1381(-15, (byte) 108);
                    } catch (InvocationTargetException var28) {
                        arg2.method1381(-16, (byte) 96);
                    } catch (SecurityException var29) {
                        arg2.method1381(-17, (byte) 120);
                    } catch (IOException var30) {
                        arg2.method1381(-18, (byte) 81);
                    } catch (NullPointerException var31) {
                        arg2.method1381(-19, (byte) 94);
                    } catch (Exception var32) {
                        arg2.method1381(-20, (byte) 109);
                    } catch (Throwable var33) {
                        arg2.method1381(-21, (byte) 107);
                    }
                } else {
                    arg2.method1381(var3.field5065[var7], (byte) 93);
                }
            }
            arg2.method1369(var6, -125);
            arg2.method1354(arg2.field2982 - var6, true);
            var3.method947((byte) 118);
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
    public abstract void method1503(int arg0);

    @OriginalMember(owner = "client!ll", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3289.method1713(this.field3290, this.field3296, 6144);
        field3291++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([BII)V")
    public final void method1504(byte[] arg0, int arg1, int arg2) {
        this.method1503(arg1 + 323963402);
        field3295++;
        if (this.field3296 < arg2) {
            OpenGL.glBufferDataARBub(this.field3292, arg2, arg0, 0, this.field3286 ? 35040 : 35044);
            this.field3289.field3938 += arg2 - this.field3296;
            this.field3296 = arg2;
        } else {
            OpenGL.glBufferSubDataARB(this.field3292, 0, arg2, arg0, 0);
        }
        if (arg1 != 35044) {
            this.field3296 = -56;
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
    public static void method1505(int arg0) {
        if (arg0 == -15) {
            field3297 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ltt;I[BIZ)V")
    public class218(class249 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field3286 = arg4;
        this.field3292 = arg1;
        this.field3296 = arg3;
        this.field3289 = arg0;
        OpenGL.glGenBuffersARB(1, class183.field2798, 0);
        this.field3290 = class183.field2798[0];
        this.method1503(323998446);
        OpenGL.glBufferDataARBub(arg1, this.field3296, arg2, 0, this.field3286 ? 35040 : 35044);
        this.field3289.field3938 += this.field3296;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ltt;ILjaggl/memory/NativeBuffer;IZ)V")
    public class218(class249 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field3292 = arg1;
        this.field3289 = arg0;
        this.field3286 = arg4;
        this.field3296 = arg3;
        OpenGL.glGenBuffersARB(1, class183.field2798, 0);
        this.field3290 = class183.field2798[0];
        this.method1503(323998446);
        OpenGL.glBufferDataARBa(arg1, this.field3296, arg2.method2918(), this.field3286 ? 35040 : 35044);
        this.field3289.field3938 += this.field3296;
    }
}
