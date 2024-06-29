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

@OriginalClass("client!wf")
public class class53 {

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field851 = 0;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "J")
    public static long field854 = 0L;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lum;")
    public static class222 field847;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[I")
    public static int[] field848;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 10)
    public static void method371(int arg0) {
        field847 = null;
        int var1 = 114 / ((-arg0 - 66) / 52);
        field848 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIZ)V", line = 20)
    public static final void method372(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            return;
        }
        field850++;
        if (arg2 > arg0) {
            class114.method780(-54, arg0, arg2, arg3, class73.field1117[arg1]);
        } else {
            class114.method780(125, arg2, arg0, arg3, class73.field1117[arg1]);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 46)
    public static final void method373(int arg0) {
        class20.field270 = 0;
        field853++;
        class106.field1877 = arg0;
        class292.method2013(arg0 - 20039);
        class47.method340((byte) 105);
        class218.method1547((byte) -125);
        class264.method1879((byte) 50);
        for (int var1 = 0; var1 < class20.field270; var1++) {
            int var2 = class149.field2545[var1];
            if (class212.field3708 != class29.field405[var2].field1680) {
                if (class29.field405[var2].field1370 > 0) {
                    class262.method1866(class29.field405[var2], (byte) 103);
                }
                class29.field405[var2] = null;
            }
        }
        if (class199.field3421 != class35.field545.field2611) {
            throw new RuntimeException("gpp1 pos:" + class35.field545.field2611 + " psize:" + class199.field3421);
        }
        for (int var3 = 0; var3 < class297.field5054; var3++) {
            if (class29.field405[class310.field5292[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class297.field5054);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I", line = 104)
    public static final int method374(int arg0, int arg1) {
        field849++;
        int var2 = -27 % ((-arg0 - 34) / 58);
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lva;BI)V", line = 115)
    public static final void method375(class209 arg0, byte arg1, int arg2) {
        int var3 = 100 % ((arg1 + 6) / 61);
        field855++;
        while (true) {
            class291 var4 = (class291) class104.field1840.method1936(16173);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field4890; var6++) {
                if (var4.field4891[var6] != null) {
                    if (var4.field4891[var6].field5121 == 2) {
                        var4.field4885[var6] = -5;
                    }
                    if (var4.field4891[var6].field5121 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field4895[var6] != null) {
                    if (var4.field4895[var6].field5121 == 2) {
                        var4.field4885[var6] = -6;
                    }
                    if (var4.field4895[var6].field5121 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg0.method1504(arg2, -1);
            arg0.method1075(0, -1);
            int var7 = arg0.field2611;
            arg0.method1065(178808912, var4.field4882);
            for (int var8 = 0; var8 < var4.field4890; var8++) {
                if (var4.field4885[var8] == 0) {
                    try {
                        int var9 = var4.field4894[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field4891[var8].field5122;
                            int var14 = var13.getInt((Object) null);
                            arg0.method1075(0, -1);
                            arg0.method1065(178808912, var14);
                        } else if (var9 == 1) {
                            Field var12 = (Field) var4.field4891[var8].field5122;
                            var12.setInt((Object) null, var4.field4886[var8]);
                            arg0.method1075(0, -1);
                        } else if (var9 == 2) {
                            Field var10 = (Field) var4.field4891[var8].field5122;
                            int var11 = var10.getModifiers();
                            arg0.method1075(0, -1);
                            arg0.method1065(178808912, var11);
                        }
                        if (var9 == 3) {
                            Method var17 = (Method) var4.field4895[var8].field5122;
                            byte[][] var18 = var4.field4887[var8];
                            Object[] var19 = new Object[var18.length];
                            for (int var20 = 0; var20 < var18.length; var20++) {
                                ObjectInputStream var21 = new ObjectInputStream(new ByteArrayInputStream(var18[var20]));
                                var19[var20] = var21.readObject();
                            }
                            Object var22 = var17.invoke((Object) null, var19);
                            if (var22 == null) {
                                arg0.method1075(0, -1);
                            } else if ((var22 instanceof Number)) {
                                arg0.method1075(1, -1);
                                arg0.method1057((byte) 43, ((Number) var22).longValue());
                            } else if ((var22 instanceof class82)) {
                                arg0.method1075(2, -1);
                                arg0.method1098((byte) 56, (class82) var22);
                            } else {
                                arg0.method1075(4, -1);
                            }
                        } else if (var9 == 4) {
                            Method var15 = (Method) var4.field4895[var8].field5122;
                            int var16 = var15.getModifiers();
                            arg0.method1075(0, -1);
                            arg0.method1065(178808912, var16);
                        }
                    } catch (ClassNotFoundException var35) {
                        arg0.method1075(-10, -1);
                    } catch (InvalidClassException var36) {
                        arg0.method1075(-11, -1);
                    } catch (StreamCorruptedException var37) {
                        arg0.method1075(-12, -1);
                    } catch (OptionalDataException var38) {
                        arg0.method1075(-13, -1);
                    } catch (IllegalAccessException var39) {
                        arg0.method1075(-14, -1);
                    } catch (IllegalArgumentException var40) {
                        arg0.method1075(-15, -1);
                    } catch (InvocationTargetException var41) {
                        arg0.method1075(-16, -1);
                    } catch (SecurityException var42) {
                        arg0.method1075(-17, -1);
                    } catch (IOException var43) {
                        arg0.method1075(-18, -1);
                    } catch (NullPointerException var44) {
                        arg0.method1075(-19, -1);
                    } catch (Exception var45) {
                        arg0.method1075(-20, -1);
                    } catch (Throwable var46) {
                        arg0.method1075(-21, -1);
                    }
                } else {
                    arg0.method1075(var4.field4885[var8], -1);
                }
            }
            arg0.method1049(109, var7);
            arg0.method1073(-1, arg0.field2611 - var7);
            var4.method961((byte) 111);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)I", line = 304)
    public static final int method376(int arg0, int arg1, int arg2) {
        if (arg0 != -953132769) {
            field848 = (int[]) null;
        }
        field852++;
        int var3 = arg2 - 1 & arg1 >> 31;
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }
}
