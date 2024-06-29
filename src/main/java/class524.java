import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class class524 extends class105 {

    @OriginalMember(owner = "client!um", name = "H", descriptor = "B")
    public byte field7416;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "S")
    public short field7415;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "S")
    public short field7409;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "Z")
    public boolean field7414;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "S")
    public short field7413;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "S")
    public short field7418;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    public static int field7420;

    // $FF: synthetic field
    @OriginalMember(owner = "client!um", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field7421;

    // $FF: synthetic method
    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3066(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIBI)V", line = 3)
    public static final void method3063(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 <= -81) {
            class584[] var7 = class98.field1180;
            for (int var8 = 0; var8 < var7.length; ++var8) {
                class584 var9 = var7[var8];
                if (var9 != null && var9.field8214 == 2) {
                    class32.method186(var9.field8221, var9.field8218 * 2, var9.field8217, (byte) -77, arg0, arg4 >> 1, arg1 >> 1, arg6, var9.field8216);
                    if (~class278.field3936[0] < 0 && ~(class740.field10285 % 20) > -11) {
                        class88 var10 = class346.field4870[var9.field8212];
                        int var11 = arg2 - -class278.field3936[0] + -12;
                        int var12 = class278.field3936[1] + arg3 + -28;
                        var10.method658(var11, var12);
                        class189.method1186(var10.method670() + var12, var10.method656() + var11, (byte) -63, var11, var12);
                    }
                }
            }
            ++field7412;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([Lwi;I)I", line = 42)
    public final int method618(class465[] arg0, int arg1) {
        ++field7410;
        int var3 = 0;
        label114: for (int var4 = this.field7415; var4 <= this.field7413; ++var4) {
            label112: for (int var5 = this.field7418; var5 <= this.field7409; ++var5) {
                long var6 = class488.field6906[super.field1266][var4][var5];
                long var8 = 0L;
                while (true) {
                    label107: while (true) {
                        if (var8 > 48L) {
                            continue label112;
                        }
                        int var10 = (int) (var6 >>> (int) var8 & 65535L);
                        if (~var10 >= -1) {
                            continue label112;
                        }
                        class244 var11 = class290.field4085[var10 - 1];
                        for (int var12 = 0; ~var12 > ~var3; ++var12) {
                            if (arg0[var12] == var11.field3265) {
                                var8 += 16L;
                                continue label107;
                            }
                        }
                        arg0[var3++] = var11.field3265;
                        if (var3 == 4) {
                            break label114;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; var13 < 4; ++var13) {
            arg0[var13] = null;
        }
        if (~this.field7416 != arg1) {
            int var14 = -class136.field1982 + this.field7415;
            int var15 = -class481.field6801 + this.field7418;
            int var16;
            int var17;
            short var18;
            short var19;
            if (~this.field7416 != -2) {
                if (var15 <= -var14) {
                    var16 = this.field7418 + 1;
                    var17 = this.field7415 - -1;
                    var18 = this.field7415;
                    var19 = this.field7418;
                } else {
                    var16 = this.field7418 - 1;
                    var18 = this.field7415;
                    var17 = this.field7415 + -1;
                    var19 = this.field7418;
                }
            } else if (var15 <= var14) {
                var19 = this.field7418;
                var18 = this.field7415;
                var16 = this.field7418 + 1;
                var17 = this.field7415 + -1;
            } else {
                var18 = this.field7415;
                var19 = this.field7418;
                var17 = this.field7415 + 1;
                var16 = this.field7418 + -1;
            }
            label78: for (int var20 = 0; ~var3 < ~var20; ++var20) {
                long var21 = class488.field6906[super.field1266][var18][var16];
                while (var21 != 0L) {
                    class244 var27 = class290.field4085[(int) ((var21 & 65535L) + -1L)];
                    var21 >>>= 16;
                    if (arg0[var20] == var27.field3265) {
                        continue label78;
                    }
                }
                long var23 = class488.field6906[super.field1266][var17][var19];
                while (var23 != 0L) {
                    class244 var26 = class290.field4085[(int) ((65535L & var23) + -1L)];
                    var23 >>>= 16;
                    if (arg0[var20] == var26.field3265) {
                        continue label78;
                    }
                }
                for (int var25 = var20; ~var25 > ~(var3 + -1); ++var25) {
                    arg0[var25] = arg0[var25 - -1];
                }
                --var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)V", line = 210)
    public void method1153(boolean arg0) {
        if (!arg0) {
            this.method611(71);
        }
        ++field7417;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z", line = 221)
    public static final boolean method3064(int arg0, Class arg1, String arg2) {
        ++field7420;
        Class var3 = (Class) class427.field5995.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg1.getClassLoader();
        } else {
            int var4 = -123 / ((arg0 - -85) / 40);
            File var5 = null;
            if (var5 == null) {
                var5 = (File) class197.field2615.get(arg2);
            }
            if (var5 != null) {
                try {
                    var5 = new File(var5.getCanonicalPath());
                    Class var6 = Class.forName("java.lang.Runtime");
                    Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var8.invoke(var9, Boolean.TRUE);
                    var9.invoke(Runtime.getRuntime(), arg1, var5.getPath());
                    var8.invoke(var9, Boolean.FALSE);
                    class427.field5995.put(arg2, arg1);
                    return true;
                } catch (NoSuchMethodException var10) {
                    System.load(var5.getPath());
                    class427.field5995.put(arg2, field7421 != null ? field7421 : (field7421 = method3066("hea")));
                    return true;
                } catch (Throwable var11) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIB)V", line = 292)
    public static final void method3065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (~arg4 != -9 && arg4 != 16) {
            class165 var7 = class553.field7776[arg1][arg2][arg0];
            if (var7 == null) {
                var7 = new class165(arg1);
            }
            if (arg4 != 1) {
                if (~arg4 == -3) {
                    var7.field2276 = (short) arg5;
                    var7.field2277 = (short) arg3;
                }
            } else {
                var7.field2273 = (short) arg5;
                var7.field2275 = (short) arg3;
            }
            if (class196.field2608) {
                class514.method3026(0);
            }
        } else if (arg4 != 8) {
            int var8 = (arg2 << class660.field9038) + class586.field8250;
            int var9 = var8 - class586.field8250;
            int var10 = arg0 << class660.field9038;
            int var11 = class586.field8250 + var10;
            int var12 = class588.field8292[arg1].method1816((byte) -48, arg0, arg2 - -1);
            int var13 = class588.field8292[arg1].method1816((byte) 45, arg0 + 1, arg2);
            class21.field319[class626.field8702++] = new class104(arg4, arg1, var8, var9, var9, var8, var12, var13, -arg5 + var13, var12 - arg5, var10, var11, var11, var10);
        } else {
            int var14 = arg2 << class660.field9038;
            int var15 = class586.field8250 + var14;
            int var16 = arg0 << class660.field9038;
            int var17 = var16 - -class586.field8250;
            int var18 = class588.field8292[arg1].method1816((byte) 0, arg0, arg2);
            int var19 = class588.field8292[arg1].method1816((byte) -4, arg0 + 1, arg2 - -1);
            class21.field319[class626.field8702++] = new class104(arg4, arg1, var14, var15, var15, var14, var18, var19, -arg5 + var19, -arg5 + var18, var16, var17, var17, var16);
        }
        ++field7411;
        int var20 = -7 % ((arg6 - 61) / 60);
    }

    @OriginalMember(owner = "client!um", name = "j", descriptor = "(I)Z", line = 364)
    public final boolean method617(int arg0) {
        ++field7408;
        for (int var2 = this.field7415; ~this.field7413 <= ~var2; ++var2) {
            for (int var3 = this.field7418; this.field7409 >= var3; ++var3) {
                int var4 = class453.field6405 + var2 + -class136.field1982;
                if (~var4 <= -1 && ~class589.field8299.length < ~var4) {
                    int var5 = -class481.field6801 + var3 + class453.field6405;
                    if (var5 >= 0 && class589.field8299.length > var5 && class589.field8299[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        if (arg0 != -21499) {
            this.field7418 = 53;
        }
        return false;
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(I)Z", line = 405)
    public final boolean method611(int arg0) {
        ++field7419;
        return arg0 > -85 ? false : class487.method2909(this.field7413, this.field7418, super.field1258, this.method749(32767), (byte) 81, this.field7409, this.field7415);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 422)
    public class524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field7416 = arg10;
        super.field1250 = arg4;
        this.field7415 = (short) arg5;
        this.field7409 = (short) arg8;
        super.field1255 = arg3;
        this.field7414 = arg9;
        this.field7413 = (short) arg6;
        super.field1266 = (byte) arg0;
        super.field1264 = arg2;
        this.field7418 = (short) arg7;
        super.field1258 = (byte) arg1;
    }
}
