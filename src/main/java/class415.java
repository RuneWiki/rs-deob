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

@OriginalClass("client!vr")
public class class415 {

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "Z")
    public static boolean field6094 = true;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public int field6099;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    private int field6100;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "[I")
    public static int[] field6093;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lwf;II)V")
    public static final void method2640(class1 arg0, int arg1, int arg2) {
        if (arg2 != 16383) {
            method2642(-96, -53);
        }
        field6102++;
        while (true) {
            class262 var3 = (class262) class138.field1902.method332(-2130841184);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3805; var5++) {
                if (var3.field3801[var5] != null) {
                    if (var3.field3801[var5].field6308 == 2) {
                        var3.field3808[var5] = -5;
                    }
                    if (var3.field3801[var5].field6308 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3807[var5] != null) {
                    if (var3.field3807[var5].field6308 == 2) {
                        var3.field3808[var5] = -6;
                    }
                    if (var3.field3807[var5].field6308 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method5(-6445, arg1);
            arg0.method1346(0, 32767);
            int var6 = arg0.field3029;
            arg0.method1330(var3.field3796, -110);
            for (int var7 = 0; var7 < var3.field3805; var7++) {
                if (var3.field3808[var7] == 0) {
                    try {
                        int var8 = var3.field3798[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3801[var7].field6309;
                            int var13 = var12.getInt((Object) null);
                            arg0.method1346(0, arg2 + 16384);
                            arg0.method1330(var13, arg2 - 16365);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3801[var7].field6309;
                            var11.setInt((Object) null, var3.field3800[var7]);
                            arg0.method1346(0, 32767);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field3801[var7].field6309;
                            int var10 = var9.getModifiers();
                            arg0.method1346(0, 32767);
                            arg0.method1330(var10, 57);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field3807[var7].field6309;
                            byte[][] var15 = var3.field3802[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg0.method1346(0, 32767);
                            } else if ((var19 instanceof Number)) {
                                arg0.method1346(1, 32767);
                                arg0.method1372(((Number) var19).longValue(), 1883835216);
                            } else if (var19 instanceof String) {
                                arg0.method1346(2, 32767);
                                arg0.method1380(arg2 + 48897, (String) var19);
                            } else {
                                arg0.method1346(4, 32767);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field3807[var7].field6309;
                            int var21 = var20.getModifiers();
                            arg0.method1346(0, 32767);
                            arg0.method1330(var21, arg2 - 16329);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1346(-10, arg2 + 16384);
                    } catch (InvalidClassException var23) {
                        arg0.method1346(-11, arg2 ^ 0x4000);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1346(-12, 32767);
                    } catch (OptionalDataException var25) {
                        arg0.method1346(-13, arg2 ^ 0x4000);
                    } catch (IllegalAccessException var26) {
                        arg0.method1346(-14, 32767);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1346(-15, 32767);
                    } catch (InvocationTargetException var28) {
                        arg0.method1346(-16, 32767);
                    } catch (SecurityException var29) {
                        arg0.method1346(-17, 32767);
                    } catch (IOException var30) {
                        arg0.method1346(-18, 32767);
                    } catch (NullPointerException var31) {
                        arg0.method1346(-19, 32767);
                    } catch (Exception var32) {
                        arg0.method1346(-20, 32767);
                    } catch (Throwable var33) {
                        arg0.method1346(-21, 32767);
                    }
                } else {
                    arg0.method1346(var3.field3808[var7], 32767);
                }
            }
            arg0.method1320(var6, 2);
            arg0.method1378(arg0.field3029 - var6, -1378);
            var3.method322(11);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)I")
    public final int method2641(byte arg0) {
        field6095++;
        return arg0 > -20 ? -125 : this.field6099 & 0x3FFF;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Lrc;")
    public static final class100 method2642(int arg0, int arg1) {
        if (arg1 != 11619) {
            field6094 = false;
        }
        field6092++;
        class100 var2 = (class100) class333.field4826.method1137((long) arg0, 2108653711);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class253.field3498.method2261(arg0, 4, 126);
        class100 var4 = new class100();
        if (var3 != null) {
            var4.method685(arg0, new class228(var3), (byte) 68);
        }
        var4.method680((byte) -115, arg0);
        class333.field4826.method1144((long) arg0, var4, -3480);
        return var4;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIB)Z")
    public final boolean method2643(int arg0, int arg1, int arg2, byte arg3) {
        field6097++;
        if (arg3 <= 33) {
            method2640((class1) null, 11, -126);
        }
        int var5 = this.field6100;
        if (this.field6099 == arg2 && this.field6100 == 0) {
            return false;
        }
        boolean var8;
        if (this.field6100 == 0) {
            if (this.field6099 < arg2 && this.field6099 + arg1 >= arg2 || this.field6099 > arg2 && (this.field6099 - arg1) <= arg2) {
                this.field6099 = arg2;
                return false;
            }
            var8 = true;
        } else if (this.field6100 > 0 && arg2 > this.field6099) {
            int var6 = this.field6100 * this.field6100 / (arg1 * 2);
            int var7 = this.field6099 + var6;
            if (var7 < arg2 && this.field6099 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field6100 < 0 && arg2 < this.field6099) {
            int var9 = this.field6100 * this.field6100 / (arg1 * 2);
            int var10 = this.field6099 - var9;
            if (var10 > arg2 && var10 <= this.field6099) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field6099 >= arg2) {
                this.field6100 -= arg1;
                if (arg0 != 0 && (-arg0) > this.field6100) {
                    this.field6100 = -arg0;
                }
            } else {
                this.field6100 += arg1;
                if (arg0 != 0 && this.field6100 > arg0) {
                    this.field6100 = arg0;
                }
            }
            if (this.field6100 != var5) {
                int var11 = this.field6100 * this.field6100 / (arg1 * 2);
                if (this.field6099 >= arg2) {
                    if (arg2 < this.field6099 && (this.field6099 - var11) < arg2) {
                        this.field6100 = var5;
                    }
                } else if (this.field6099 + var11 > arg2) {
                    this.field6100 = var5;
                }
            }
        } else if (this.field6100 > 0) {
            this.field6100 -= arg1;
            if (this.field6100 < 0) {
                this.field6100 = 0;
            }
        } else {
            this.field6100 += arg1;
            if (this.field6100 > 0) {
                this.field6100 = 0;
            }
        }
        this.field6099 += this.field6100 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)V")
    public final void method2644(int arg0, int arg1) {
        this.field6099 = arg1;
        this.field6100 = arg0;
        field6096++;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V")
    public static void method2645(byte arg0) {
        if (arg0 < 11) {
            method2640((class1) null, -12, -79);
        }
        field6093 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIII)V")
    public static final void method2646(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= class87.field1227 && arg2 <= class299.field4382) {
            int var5 = class304.method2068(class379.field5521, arg0, -102, class125.field1751);
            int var6 = class304.method2068(class379.field5521, arg4, -109, class125.field1751);
            class83.method595(arg1 + 115, arg3, var5, arg2, var6);
        }
        field6091++;
        if (arg1 != -1) {
            field6093 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)V")
    public final void method2647(boolean arg0) {
        field6098++;
        if (arg0) {
            this.field6099 &= 0x3FFF;
        }
    }
}
