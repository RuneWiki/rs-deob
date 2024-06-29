import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class246 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Z")
    public static boolean field3873 = false;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3875 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "[I")
    public static int[] field3879 = new int[4096];

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static volatile int field3880 = -1;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lt;")
    public static class212 field3874;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lwb;")
    public static class28 field3878;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lch;ZI)V")
    public static final void method1668(class306 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3873 = true;
        }
        field3876++;
        while (true) {
            class218 var3 = (class218) class247.field3881.method1553(!arg1);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3419; var5++) {
                if (var3.field3423[var5] != null) {
                    if (var3.field3423[var5].field4929 == 2) {
                        var3.field3431[var5] = -5;
                    }
                    if (var3.field3423[var5].field4929 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3426[var5] != null) {
                    if (var3.field3426[var5].field4929 == 2) {
                        var3.field3431[var5] = -6;
                    }
                    if (var3.field3426[var5].field4929 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method2081(false, arg2);
            arg0.method1865(0, -123);
            int var6 = arg0.field4458;
            arg0.method1831(var3.field3428, 119690440);
            for (int var7 = 0; var7 < var3.field3419; var7++) {
                if (var3.field3431[var7] == 0) {
                    try {
                        int var8 = var3.field3418[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field3423[var7].field4930;
                            int var10 = var9.getInt((Object) null);
                            arg0.method1865(0, 58);
                            arg0.method1831(var10, 119690440);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3423[var7].field4930;
                            var11.setInt((Object) null, var3.field3425[var7]);
                            arg0.method1865(0, -101);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field3423[var7].field4930;
                            int var13 = var12.getModifiers();
                            arg0.method1865(0, 125);
                            arg0.method1831(var13, 119690440);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3426[var7].field4930;
                            byte[][] var17 = var3.field3421[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method1865(0, 44);
                            } else if (var21 instanceof Number) {
                                arg0.method1865(1, -96);
                                arg0.method1840((byte) 47, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg0.method1865(2, 22);
                                arg0.method1859((byte) 58, (String) var21);
                            } else {
                                arg0.method1865(4, -112);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3426[var7].field4930;
                            int var15 = var14.getModifiers();
                            arg0.method1865(0, -122);
                            arg0.method1831(var15, 119690440);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1865(-10, -111);
                    } catch (InvalidClassException var23) {
                        arg0.method1865(-11, -101);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1865(-12, -124);
                    } catch (OptionalDataException var25) {
                        arg0.method1865(-13, -94);
                    } catch (IllegalAccessException var26) {
                        arg0.method1865(-14, -110);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1865(-15, 70);
                    } catch (InvocationTargetException var28) {
                        arg0.method1865(-16, -115);
                    } catch (SecurityException var29) {
                        arg0.method1865(-17, 24);
                    } catch (IOException var30) {
                        arg0.method1865(-18, 102);
                    } catch (NullPointerException var31) {
                        arg0.method1865(-19, -111);
                    } catch (Exception var32) {
                        arg0.method1865(-20, 31);
                    } catch (Throwable var33) {
                        arg0.method1865(-21, -98);
                    }
                } else {
                    arg0.method1865(var3.field3431[var7], -110);
                }
            }
            arg0.method1868(var6, 1);
            arg0.method1843(14058, arg0.field4458 - var6);
            var3.method952((byte) 112);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method1669(byte arg0) {
        int var1 = -72 / ((arg0 - 82) / 43);
        field3874 = null;
        field3879 = null;
        field3875 = null;
        field3878 = null;
    }
}
