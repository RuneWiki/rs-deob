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

@OriginalClass("client!sd")
public class class129 {

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Z")
    public boolean field2947 = true;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public int field2937;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "[Z")
    public static boolean[] field2938 = new boolean[100];

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field2943 = 0;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Lod;")
    public static class101 field2951 = class46.method335(-57, "null");

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Lod;")
    private static class101 field2953 = class46.method335(-108, "M");

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lod;")
    public static class101 field2946 = field2953;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Lod;")
    public static class101 field2949 = field2953;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Led;")
    public static class33 field2950 = new class33();

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "Lve;")
    public static class151 field2954;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Lc;")
    public static class15 field2955;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lke;")
    public static class74 field2941;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Ln;")
    public static class90 field2939;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static final void method996(int arg0) {
        field2935++;
        if (class151.field3463.toLowerCase().indexOf("microsoft") == -1) {
            class155.field3555[92] = 74;
            class155.field3555[91] = 42;
            class155.field3555[59] = 57;
            class155.field3555[45] = 26;
            class155.field3555[61] = 27;
            class155.field3555[46] = 72;
            class155.field3555[44] = 71;
            class155.field3555[93] = 43;
            class155.field3555[47] = 73;
            if (class151.field3449 == null) {
                class155.field3555[192] = 58;
                class155.field3555[222] = 59;
            } else {
                class155.field3555[222] = 58;
                class155.field3555[192] = 28;
                class155.field3555[520] = 59;
            }
        } else {
            class155.field3555[223] = 28;
            class155.field3555[220] = 74;
            class155.field3555[187] = 27;
            class155.field3555[191] = 73;
            class155.field3555[221] = 43;
            class155.field3555[186] = 57;
            class155.field3555[222] = 59;
            class155.field3555[190] = 72;
            class155.field3555[188] = 71;
            class155.field3555[189] = 26;
            class155.field3555[219] = 42;
            class155.field3555[192] = 58;
        }
        if (arg0 >= -73) {
            method997(null, 77, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lie;IB)V")
    public static final void method997(class61 arg0, int arg1, byte arg2) {
        if (arg2 > -35) {
            return;
        }
        field2942++;
        while (true) {
            class30 var3 = (class30) class35.field884.method523(false);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field785; var5++) {
                if (var3.field791[var5] != null) {
                    if (var3.field791[var5].field1591 == 2) {
                        var3.field789[var5] = -5;
                    }
                    if (var3.field791[var5].field1591 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field781[var5] != null) {
                    if (var3.field781[var5].field1591 == 2) {
                        var3.field789[var5] = -6;
                    }
                    if (var3.field781[var5].field1591 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method419(arg1, (byte) 0);
            arg0.method1101(0, (byte) -32);
            int var6 = arg0.field3175;
            arg0.method1090((byte) 38, var3.field780);
            for (int var7 = 0; var7 < var3.field785; var7++) {
                if (var3.field789[var7] == 0) {
                    try {
                        int var8 = var3.field786[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field791[var7].field1590;
                            int var10 = var9.getInt(null);
                            arg0.method1101(0, (byte) -32);
                            arg0.method1090((byte) 38, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field791[var7].field1590;
                            var13.setInt(null, var3.field782[var7]);
                            arg0.method1101(0, (byte) -32);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field791[var7].field1590;
                            int var12 = var11.getModifiers();
                            arg0.method1101(0, (byte) -32);
                            arg0.method1090((byte) 38, var12);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field781[var7].field1590;
                            byte[][] var15 = var3.field777[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg0.method1101(0, (byte) -32);
                            } else if (var19 instanceof Number) {
                                arg0.method1101(1, (byte) -32);
                                arg0.method1087(((Number) var19).longValue(), -73);
                            } else if (var19 instanceof class101) {
                                arg0.method1101(2, (byte) -32);
                                arg0.method1070((class101) var19, true);
                            } else {
                                arg0.method1101(4, (byte) -32);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field781[var7].field1590;
                            int var21 = var20.getModifiers();
                            arg0.method1101(0, (byte) -32);
                            arg0.method1090((byte) 38, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1101(-10, (byte) -32);
                    } catch (InvalidClassException var23) {
                        arg0.method1101(-11, (byte) -32);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1101(-12, (byte) -32);
                    } catch (OptionalDataException var25) {
                        arg0.method1101(-13, (byte) -32);
                    } catch (IllegalAccessException var26) {
                        arg0.method1101(-14, (byte) -32);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1101(-15, (byte) -32);
                    } catch (InvocationTargetException var28) {
                        arg0.method1101(-16, (byte) -32);
                    } catch (SecurityException var29) {
                        arg0.method1101(-17, (byte) -32);
                    } catch (IOException var30) {
                        arg0.method1101(-18, (byte) -32);
                    } catch (NullPointerException var31) {
                        arg0.method1101(-19, (byte) -32);
                    } catch (Exception var32) {
                        arg0.method1101(-20, (byte) -32);
                    } catch (Throwable var33) {
                        arg0.method1101(-21, (byte) -32);
                    }
                } else {
                    arg0.method1101(var3.field789[var7], (byte) -32);
                }
            }
            arg0.method1089(var6, (byte) 80);
            arg0.method1099(arg0.field3175 - var6, false);
            var3.method959(11835);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
    public static final void method998(int arg0, int arg1, int arg2) {
        field2940++;
        class158 var3 = class15.method111((byte) -41, arg0);
        int var4 = var3.field3641;
        if (arg1 != 57) {
            method1000((byte) -84);
        }
        int var5 = var3.field3634;
        int var6 = var3.field3642;
        int var7 = class82.field1800[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class63.field1388[var4] = class13.method96(class41.method307(arg2 << var5, var8), class41.method307(class63.field1388[var4], ~var8));
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lef;")
    public static final class35 method999(int arg0, int arg1) {
        int var2 = 23 % ((arg0 + 68) / 58);
        field2944++;
        class35 var3 = (class35) class57.field1308.method140(true, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class65.field1484.method114((byte) -30, 16, arg1);
        class35 var5 = new class35();
        if (var4 != null) {
            var5.method260(new class138(var4), -1);
        }
        class57.field1308.method141(var5, (long) arg1, (byte) -128);
        return var5;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method1000(byte arg0) {
        field2953 = null;
        field2938 = null;
        int var1 = -128 / ((arg0 + 15) / 45);
        field2954 = null;
        field2946 = null;
        field2939 = null;
        field2951 = null;
        field2950 = null;
        field2949 = null;
        field2941 = null;
        field2955 = null;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2934 = arg0;
        this.field2947 = arg6;
        this.field2948 = arg2;
        this.field2936 = arg3;
        this.field2952 = arg1;
        this.field2945 = arg4;
        this.field2937 = arg5;
    }
}
