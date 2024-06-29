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

@OriginalClass("client!cj")
public class class644 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Lcj;")
    public static class644 field9053 = new class644();

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Lcj;")
    public static class644 field9054 = new class644();

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Lcj;")
    public static class644 field9055 = new class644();

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Lcj;")
    public static class644 field9056 = new class644();

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Z")
    public static boolean field9057 = true;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field9059 = 0;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Lws;")
    public static class328 field9058 = new class328(1, 3);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!cj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9051++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILoo;)V")
    public static final void method3731(int arg0, class580 arg1) {
        field9052++;
        class318 var2 = (class318) class89.field1077.method3465((byte) 115);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = arg0; var4 < var2.field4990; var4++) {
            if (var2.field4989[var4] != null) {
                if (var2.field4989[var4].field9884 == 2) {
                    var2.field4991[var4] = -5;
                }
                if (var2.field4989[var4].field9884 == 0) {
                    var3 = true;
                }
            }
            if (var2.field4994[var4] != null) {
                if (var2.field4994[var4].field9884 == 2) {
                    var2.field4991[var4] = -6;
                }
                if (var2.field4994[var4].field9884 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg1.field57;
        arg1.method82(false, var2.field4988);
        for (int var6 = 0; var6 < var2.field4990; var6++) {
            if (var2.field4991[var6] == 0) {
                try {
                    int var7 = var2.field4982[var6];
                    if (var7 == 0) {
                        Field var11 = (Field) var2.field4989[var6].field9885;
                        int var12 = var11.getInt(null);
                        arg1.method65(0, -77);
                        arg1.method82(false, var12);
                    } else if (var7 == 1) {
                        Field var8 = (Field) var2.field4989[var6].field9885;
                        var8.setInt(null, var2.field4993[var6]);
                        arg1.method65(0, arg0 ^ 0xFFFFFFB3);
                    } else if (var7 == 2) {
                        Field var9 = (Field) var2.field4989[var6].field9885;
                        int var10 = var9.getModifiers();
                        arg1.method65(0, -77);
                        arg1.method82(false, var10);
                    }
                    if (var7 == 3) {
                        Method var15 = (Method) var2.field4994[var6].field9885;
                        byte[][] var16 = var2.field4984[var6];
                        Object[] var17 = new Object[var16.length];
                        for (int var18 = 0; var18 < var16.length; var18++) {
                            ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                            var17[var18] = var19.readObject();
                        }
                        Object var20 = var15.invoke(null, var17);
                        if (var20 == null) {
                            arg1.method65(0, -77);
                        } else if (var20 instanceof Number) {
                            arg1.method65(1, -77);
                            arg1.method38(((Number) var20).longValue(), arg0 ^ 0xFFFFB739);
                        } else if ((var20 instanceof String)) {
                            arg1.method65(2, -77);
                            arg1.method28((String) var20, arg0);
                        } else {
                            arg1.method65(4, -77);
                        }
                    } else if (var7 == 4) {
                        Method var13 = (Method) var2.field4994[var6].field9885;
                        int var14 = var13.getModifiers();
                        arg1.method65(0, -77);
                        arg1.method82(false, var14);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method65(-10, -77);
                } catch (InvalidClassException var22) {
                    arg1.method65(-11, -77);
                } catch (StreamCorruptedException var23) {
                    arg1.method65(-12, -77);
                } catch (OptionalDataException var24) {
                    arg1.method65(-13, -77);
                } catch (IllegalAccessException var25) {
                    arg1.method65(-14, arg0 ^ -77);
                } catch (IllegalArgumentException var26) {
                    arg1.method65(-15, -77);
                } catch (InvocationTargetException var27) {
                    arg1.method65(-16, -77);
                } catch (SecurityException var28) {
                    arg1.method65(-17, -77);
                } catch (IOException var29) {
                    arg1.method65(-18, arg0 - 77);
                } catch (NullPointerException var30) {
                    arg1.method65(-19, -77);
                } catch (Exception var31) {
                    arg1.method65(-20, arg0 - 77);
                } catch (Throwable var32) {
                    arg1.method65(-21, -77);
                }
            } else {
                arg1.method65(var2.field4991[var6], -77);
            }
        }
        arg1.method71(-15048, var5);
        var2.method707((byte) -111);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)I")
    public static final int method3732(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class180.field3034 - 1; var2++) {
            if (arg0 < class90.field1081[var2] + class547.field7971[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class180.field3034 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public static void method3733(boolean arg0) {
        field9054 = null;
        field9056 = null;
        if (!arg0) {
            field9055 = null;
            field9058 = null;
            field9053 = null;
        }
    }
}
