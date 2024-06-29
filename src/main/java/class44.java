import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class44 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "[I")
    public static int[] field731 = new int[14];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
    public static int method377(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static final void method378(int arg0) {
        field730++;
        if (class128.field1918 == 0) {
            return;
        }
        int var1 = -85 / ((arg0 + 42) / 48);
        try {
            if (++class37.field632 > 2000) {
                if (class301.field4848 != null) {
                    class301.field4848.method1306((byte) -57);
                    class301.field4848 = null;
                }
                if (class163.field2463 >= 1) {
                    class231.field3667 = -5;
                    class128.field1918 = 0;
                    return;
                }
                class128.field1918 = 1;
                class37.field632 = 0;
                if (class270.field4283 == class153.field2259) {
                    class153.field2259 = class235.field3707;
                } else {
                    class153.field2259 = class270.field4283;
                }
                class163.field2463++;
            }
            if (class128.field1918 == 1) {
                class86.field1279 = class123.field1863.method30(class214.field3286, class153.field2259, (byte) 3);
                class128.field1918 = 2;
            }
            if (class128.field1918 == 2) {
                if (class86.field1279.field2082 == 2) {
                    throw new IOException();
                }
                if (class86.field1279.field2082 != 1) {
                    return;
                }
                class301.field4848 = new class182((Socket) class86.field1279.field2080, class123.field1863);
                class86.field1279 = null;
                class301.field4848.method1299(0, class240.field3826.field541, class240.field3826.field560, (byte) 127);
                if (class304.field4889 != null) {
                    class304.field4889.method591(-7123);
                }
                if (class67.field1058 != null) {
                    class67.field1058.method591(-7123);
                }
                int var2 = class301.field4848.method1309((byte) 124);
                if (class304.field4889 != null) {
                    class304.field4889.method591(-7123);
                }
                if (class67.field1058 != null) {
                    class67.field1058.method591(-7123);
                }
                if (var2 != 21) {
                    class231.field3667 = var2;
                    class128.field1918 = 0;
                    class301.field4848.method1306((byte) -45);
                    class301.field4848 = null;
                    return;
                }
                class128.field1918 = 3;
            }
            if (class128.field1918 == 3) {
                if (class301.field4848.method1302(-84) < 1) {
                    return;
                }
                class163.field2450 = new String[class301.field4848.method1309((byte) 124)];
                class128.field1918 = 4;
            }
            if (class128.field1918 == 4 && class301.field4848.method1302(-123) >= class163.field2450.length * 8) {
                class183.field2900.field541 = 0;
                class301.field4848.method1301(0, 6, class163.field2450.length * 8, class183.field2900.field560);
                for (int var3 = 0; var3 < class163.field2450.length; var3++) {
                    class163.field2450[var3] = class257.method1739((byte) 72, class183.field2900.method306(false));
                }
                class231.field3667 = 21;
                class128.field1918 = 0;
                class301.field4848.method1306((byte) -112);
                class301.field4848 = null;
            }
        } catch (IOException var4) {
            if (class301.field4848 != null) {
                class301.field4848.method1306((byte) -85);
                class301.field4848 = null;
            }
            if (class163.field2463 < 1) {
                class163.field2463++;
                class37.field632 = 0;
                class128.field1918 = 1;
                if (class270.field4283 == class153.field2259) {
                    class153.field2259 = class235.field3707;
                } else {
                    class153.field2259 = class270.field4283;
                }
            } else {
                class128.field1918 = 0;
                class231.field3667 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljl;II)V")
    public static final void method379(class263 arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field732 = -34;
        }
        field733++;
        while (true) {
            class183 var3 = (class183) class220.field3360.method6(-116);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2889; var5++) {
                if (var3.field2891[var5] != null) {
                    if (var3.field2891[var5].field2082 == 2) {
                        var3.field2888[var5] = -5;
                    }
                    if (var3.field2891[var5].field2082 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2898[var5] != null) {
                    if (var3.field2898[var5].field2082 == 2) {
                        var3.field2888[var5] = -6;
                    }
                    if (var3.field2898[var5].field2082 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1762(arg2, true);
            arg0.method305(0, true);
            int var6 = arg0.field541;
            arg0.method258(var3.field2890, -1527329320);
            for (int var7 = 0; var7 < var3.field2889; var7++) {
                if (var3.field2888[var7] == 0) {
                    try {
                        int var8 = var3.field2897[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2891[var7].field2080;
                            int var13 = var12.getInt((Object) null);
                            arg0.method305(0, true);
                            arg0.method258(var13, -1527329320);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2891[var7].field2080;
                            var11.setInt((Object) null, var3.field2892[var7]);
                            arg0.method305(0, true);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field2891[var7].field2080;
                            int var10 = var9.getModifiers();
                            arg0.method305(0, true);
                            arg0.method258(var10, -1527329320);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field2898[var7].field2080;
                            byte[][] var15 = var3.field2887[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method305(0, true);
                            } else if (var19 instanceof Number) {
                                arg0.method305(1, true);
                                arg0.method313(-6968, ((Number) var19).longValue());
                            } else if ((var19 instanceof String)) {
                                arg0.method305(2, true);
                                arg0.method288((String) var19, (byte) -43);
                            } else {
                                arg0.method305(4, true);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2898[var7].field2080;
                            int var21 = var20.getModifiers();
                            arg0.method305(0, true);
                            arg0.method258(var21, -1527329320);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method305(-10, true);
                    } catch (InvalidClassException var23) {
                        arg0.method305(-11, true);
                    } catch (StreamCorruptedException var24) {
                        arg0.method305(-12, true);
                    } catch (OptionalDataException var25) {
                        arg0.method305(-13, true);
                    } catch (IllegalAccessException var26) {
                        arg0.method305(-14, true);
                    } catch (IllegalArgumentException var27) {
                        arg0.method305(-15, true);
                    } catch (InvocationTargetException var28) {
                        arg0.method305(-16, true);
                    } catch (SecurityException var29) {
                        arg0.method305(-17, true);
                    } catch (IOException var30) {
                        arg0.method305(-18, true);
                    } catch (NullPointerException var31) {
                        arg0.method305(-19, true);
                    } catch (Exception var32) {
                        arg0.method305(-20, true);
                    } catch (Throwable var33) {
                        arg0.method305(-21, true);
                    }
                } else {
                    arg0.method305(var3.field2888[var7], true);
                }
            }
            arg0.method289(arg1 ^ 0x28D1ACD1, var6);
            arg0.method309(arg0.field541 - var6, true);
            var3.method995((byte) 95);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method380(byte arg0) {
        if (arg0 <= -61) {
            field731 = null;
        }
    }
}
