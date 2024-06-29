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

@OriginalClass("client!gn")
public class class419 {

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public int field6006 = 0;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Llm;")
    public static class291 field6005 = new class291(64);

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "Lub;")
    public static class15 field6011 = new class15(10);

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "Ldj;")
    public static class191 field6014 = new class191(128);

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "[Lvj;")
    public static class256[] field6012;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BILlf;)V")
    private final void method2636(byte arg0, int arg1, class130 arg2) {
        if (arg0 < -89) {
            if (arg1 == 5) {
                this.field6006 = arg2.method798(false);
            }
            field6010++;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static void method2637(int arg0) {
        field6014 = null;
        field6012 = null;
        field6011 = null;
        field6005 = null;
        if (arg0 > -38) {
            method2640(3, -76, 97, 88, 32, 83);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BILcb;)V")
    public static final void method2638(byte arg0, int arg1, class304 arg2) {
        field6008++;
        int var3 = 9 / ((arg0 - 12) / 54);
        while (true) {
            class396 var4 = (class396) class34.field427.method2752(-51);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field5575; var6++) {
                if (var4.field5578[var6] != null) {
                    if (var4.field5578[var6].field2298 == 2) {
                        var4.field5580[var6] = -5;
                    }
                    if (var4.field5578[var6].field2298 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field5572[var6] != null) {
                    if (var4.field5572[var6].field2298 == 2) {
                        var4.field5580[var6] = -6;
                    }
                    if (var4.field5572[var6].field2298 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg2.method2048(2040, arg1);
            arg2.method831(0, (byte) 118);
            int var7 = arg2.field1880;
            arg2.method849(var4.field5579, (byte) -116);
            for (int var8 = 0; var8 < var4.field5575; var8++) {
                if (var4.field5580[var8] == 0) {
                    try {
                        int var9 = var4.field5570[var8];
                        if (var9 == 0) {
                            Field var13 = (Field) var4.field5578[var8].field2295;
                            int var14 = var13.getInt((Object) null);
                            arg2.method831(0, (byte) 113);
                            arg2.method849(var14, (byte) -66);
                        } else if (var9 == 1) {
                            Field var12 = (Field) var4.field5578[var8].field2295;
                            var12.setInt((Object) null, var4.field5569[var8]);
                            arg2.method831(0, (byte) 115);
                        } else if (var9 == 2) {
                            Field var10 = (Field) var4.field5578[var8].field2295;
                            int var11 = var10.getModifiers();
                            arg2.method831(0, (byte) -116);
                            arg2.method849(var11, (byte) -61);
                        }
                        if (var9 == 3) {
                            Method var15 = (Method) var4.field5572[var8].field2295;
                            byte[][] var16 = var4.field5574[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; var18 < var16.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke((Object) null, var17);
                            if (var20 == null) {
                                arg2.method831(0, (byte) 121);
                            } else if ((var20 instanceof Number)) {
                                arg2.method831(1, (byte) 119);
                                arg2.method832((byte) -61, ((Number) var20).longValue());
                            } else if (var20 instanceof String) {
                                arg2.method831(2, (byte) 111);
                                arg2.method807((byte) 124, (String) var20);
                            } else {
                                arg2.method831(4, (byte) -96);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field5572[var8].field2295;
                            int var22 = var21.getModifiers();
                            arg2.method831(0, (byte) 112);
                            arg2.method849(var22, (byte) -65);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg2.method831(-10, (byte) 127);
                    } catch (InvalidClassException var24) {
                        arg2.method831(-11, (byte) -87);
                    } catch (StreamCorruptedException var25) {
                        arg2.method831(-12, (byte) 120);
                    } catch (OptionalDataException var26) {
                        arg2.method831(-13, (byte) 122);
                    } catch (IllegalAccessException var27) {
                        arg2.method831(-14, (byte) -46);
                    } catch (IllegalArgumentException var28) {
                        arg2.method831(-15, (byte) 125);
                    } catch (InvocationTargetException var29) {
                        arg2.method831(-16, (byte) 122);
                    } catch (SecurityException var30) {
                        arg2.method831(-17, (byte) -82);
                    } catch (IOException var31) {
                        arg2.method831(-18, (byte) 127);
                    } catch (NullPointerException var32) {
                        arg2.method831(-19, (byte) -119);
                    } catch (Exception var33) {
                        arg2.method831(-20, (byte) 124);
                    } catch (Throwable var34) {
                        arg2.method831(-21, (byte) 114);
                    }
                } else {
                    arg2.method831(var4.field5580[var8], (byte) -68);
                }
            }
            arg2.method834(true, var7);
            arg2.method855(arg2.field1880 - var7, 1);
            var4.method2660((byte) 119);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Llf;I)V")
    public final void method2639(class130 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method837(true);
            if (var3 == 0) {
                field6007++;
                if (arg1 != 0) {
                    this.method2639((class130) null, -52);
                    return;
                }
                return;
            }
            this.method2636((byte) -98, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIII)V")
    public static final void method2640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -1025) {
            field6012 = null;
        }
        class365.field5228 = arg4;
        class32.field397 = arg0;
        class316.field4637 = arg5;
        class223.field3324 = arg1;
        class308.field4486 = arg3;
        field6013++;
        if (class223.field3324 >= 100) {
            int var6 = class32.field397 * 128 + 64;
            int var7 = class308.field4486 * 128 + 64;
            int var8 = class452.method2820(class158.field2302, var7, false, var6) - class365.field5228;
            int var9 = var6 - class386.field5469;
            int var10 = var8 - class249.field3707;
            int var11 = var7 - class417.field5999;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class319.field4676 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class278.field3990 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class214.field3072 = 0;
            if (class319.field4676 < 1024) {
                class319.field4676 = 1024;
            }
            if (class319.field4676 > 3072) {
                class319.field4676 = 3072;
            }
        }
        class336.field4878 = 2;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method2641(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field6009++;
        int var7 = arg3 - arg4;
        if (arg5 != 24) {
            method2637(-86);
        }
        int var8 = arg2 + arg4;
        for (int var9 = arg2; var9 < var8; var9++) {
            class5.method17(class440.field6288[var9], arg6, arg0, (byte) 70, arg1);
        }
        int var10 = arg6 - arg4;
        int var11 = arg1 + arg4;
        for (int var12 = arg3; var12 > var7; var12--) {
            class5.method17(class440.field6288[var12], arg6, arg0, (byte) 103, arg1);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class440.field6288[var13];
            class5.method17(var14, var11, arg0, (byte) 93, arg1);
            class5.method17(var14, arg6, arg0, (byte) 107, var10);
        }
    }
}
