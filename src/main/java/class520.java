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

@OriginalClass("client!hj")
public class class520 extends class354 implements class670 {

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "B")
    private byte field7433;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "B")
    private byte field7425;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "B")
    private byte field7431;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "Z")
    private boolean field7451;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "S")
    private short field7430;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "Z")
    private boolean field7438;

    @OriginalMember(owner = "client!hj", name = "eb", descriptor = "Z")
    private boolean field7456;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "Z")
    private boolean field7435;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "Lba;")
    public class350 field7429;

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "Lw;")
    private class269 field7449;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "Lmfa;")
    public static class562 field7440 = new class562();

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "[Z")
    public static boolean[] field7452 = new boolean[200];

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "[Lgi;")
    public static class620[] field7448 = new class620[0];

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!hj", name = "cb", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!hj", name = "db", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!hj", name = "fb", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "Lgr;")
    private class396 field7432;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)I")
    public final int method740(int arg0) {
        int var2 = -50 % ((arg0 - -31) / 48);
        ++field7437;
        return this.field7429 == null ? 0 : this.field7429.method864();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILoa;)Lgr;")
    public final class396 method450(int arg0, class635 arg1) {
        ++field7443;
        if (this.field7432 == null) {
            this.field7432 = class426.method2298(super.field4641, this.method2964(0, 72, arg1), 12409, super.field4647, super.field4646);
        }
        int var3 = -71 / ((arg0 - 47) / 34);
        return this.field7432;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLlt;I)V")
    public static final void method2962(byte arg0, class617 arg1, int arg2) {
        if (arg0 > -117) {
            method2962((byte) 23, (class617) null, -121);
        }
        ++field7444;
        while (true) {
            class170 var3 = (class170) class646.field9145.method3174((byte) 49);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; ~var3.field2038 < ~var5; ++var5) {
                if (var3.field2032[var5] != null) {
                    if (var3.field2032[var5].field2437 == 2) {
                        var3.field2030[var5] = -5;
                    }
                    if (~var3.field2032[var5].field2437 == -1) {
                        var4 = true;
                    }
                }
                if (var3.field2031[var5] != null) {
                    if (~var3.field2031[var5].field2437 == -3) {
                        var3.field2030[var5] = -6;
                    }
                    if (~var3.field2031[var5].field2437 == -1) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method3467(arg2, true);
            arg1.method2525(0, -81849);
            int var6 = arg1.field6215;
            arg1.method2554(var3.field2042, 255);
            for (int var7 = 0; ~var7 > ~var3.field2038; ++var7) {
                if (~var3.field2030[var7] != -1) {
                    arg1.method2525(var3.field2030[var7], -81849);
                } else {
                    try {
                        int var8 = var3.field2037[var7];
                        if (~var8 != -1) {
                            if (var8 == 1) {
                                Field var9 = (Field) var3.field2032[var7].field2434;
                                var9.setInt((Object) null, var3.field2036[var7]);
                                arg1.method2525(0, -81849);
                            } else if (var8 == 2) {
                                Field var10 = (Field) var3.field2032[var7].field2434;
                                int var11 = var10.getModifiers();
                                arg1.method2525(0, -81849);
                                arg1.method2554(var11, 255);
                            }
                        } else {
                            Field var12 = (Field) var3.field2032[var7].field2434;
                            int var13 = var12.getInt((Object) null);
                            arg1.method2525(0, -81849);
                            arg1.method2554(var13, 255);
                        }
                        if (var8 != 3) {
                            if (var8 == 4) {
                                Method var20 = (Method) var3.field2031[var7].field2434;
                                int var21 = var20.getModifiers();
                                arg1.method2525(0, -81849);
                                arg1.method2554(var21, 255);
                            }
                        } else {
                            Method var14 = (Method) var3.field2031[var7].field2434;
                            byte[][] var15 = var3.field2034[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; ~var17 > ~var15.length; ++var17) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method2525(0, -81849);
                            } else if (var19 instanceof Number) {
                                arg1.method2525(1, -81849);
                                arg1.method2518((byte) 108, ((Number) var19).longValue());
                            } else if (!(var19 instanceof String)) {
                                arg1.method2525(4, -81849);
                            } else {
                                arg1.method2525(2, -81849);
                                arg1.method2573((String) var19, 16746);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method2525(-10, -81849);
                    } catch (InvalidClassException var23) {
                        arg1.method2525(-11, -81849);
                    } catch (StreamCorruptedException var24) {
                        arg1.method2525(-12, -81849);
                    } catch (OptionalDataException var25) {
                        arg1.method2525(-13, -81849);
                    } catch (IllegalAccessException var26) {
                        arg1.method2525(-14, -81849);
                    } catch (IllegalArgumentException var27) {
                        arg1.method2525(-15, -81849);
                    } catch (InvocationTargetException var28) {
                        arg1.method2525(-16, -81849);
                    } catch (SecurityException var29) {
                        arg1.method2525(-17, -81849);
                    } catch (IOException var30) {
                        arg1.method2525(-18, -81849);
                    } catch (NullPointerException var31) {
                        arg1.method2525(-19, -81849);
                    } catch (Exception var32) {
                        arg1.method2525(-20, -81849);
                    } catch (Throwable var33) {
                        arg1.method2525(-21, -81849);
                    }
                }
            }
            arg1.method2571((byte) 99, var6);
            arg1.method2551(arg1.field6215 - var6, 21);
            var3.method1519((byte) 121);
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)Z")
    public final boolean method449(byte arg0) {
        if (arg0 != -126) {
            this.field7429 = null;
        }
        ++field7427;
        return this.field7451;
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)I")
    public final int method2963(int arg0) {
        ++field7446;
        if (arg0 != 2048) {
            return 71;
        } else {
            return this.field7429 == null ? 15 : this.field7429.method875() / 4;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IILoa;)Lba;")
    private final class350 method2964(int arg0, int arg1, class635 arg2) {
        if (arg1 <= 43) {
            return null;
        } else {
            ++field7439;
            if (this.field7429 != null && ~arg2.method312(this.field7429.method902(), arg0) == -1) {
                return this.field7429;
            } else {
                class671 var4 = this.method2966(false, arg2, -14819, arg0);
                return var4 == null ? null : var4.field9536;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Loa;I)V")
    public final void method456(class635 arg0, int arg1) {
        ++field7434;
        if (arg1 < 97) {
            method2962((byte) 28, (class617) null, -107);
        }
        Object var3 = null;
        class269 var5;
        if (this.field7449 == null && this.field7435) {
            class671 var4 = this.method2966(true, arg0, -14819, 262144);
            var5 = var4 != null ? var4.field9533 : null;
        } else {
            var5 = this.field7449;
            this.field7449 = null;
        }
        if (var5 != null) {
            class461.method2625(var5, this.field7425, super.field4641, super.field4647, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILoa;)Lba;")
    public final class350 method455(int arg0, int arg1, class635 arg2) {
        if (arg1 >= -20) {
            this.field7449 = null;
        }
        ++field7426;
        return this.method2964(arg0, 64, arg2);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)I")
    public final int method444(byte arg0) {
        int var2 = 119 % ((arg0 - 7) / 46);
        ++field7441;
        return this.field7430 & 65535;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method457(int arg0, int arg1, class635 arg2, int arg3) {
        ++field7436;
        class350 var5 = this.method2964(131072, 65, arg2);
        if (arg1 != 1) {
            this.field7425 = -45;
        }
        if (var5 != null) {
            class389 var6 = arg2.method297();
            var6.method228(super.field4641, super.field4646, super.field4647);
            return var5.method910(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(Loa;I)V")
    public final void method451(class635 arg0, int arg1) {
        ++field7447;
        if (arg1 != 31055) {
            this.method443((byte) -105);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Loa;B)V")
    public final void method446(class635 arg0, byte arg1) {
        ++field7453;
        Object var3 = null;
        if (arg1 <= -126) {
            class269 var5;
            if (this.field7449 == null && this.field7435) {
                class671 var4 = this.method2966(true, arg0, -14819, 262144);
                var5 = var4 != null ? var4.field9533 : null;
            } else {
                var5 = this.field7449;
                this.field7449 = null;
            }
            if (var5 != null) {
                class533.method3038(var5, this.field7425, super.field4641, super.field4647, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)I")
    public final int method447(byte arg0) {
        ++field7457;
        if (arg0 != -91) {
            this.field7433 = 54;
        }
        return this.field7431;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Z")
    public final boolean method454(int arg0) {
        if (arg0 < 49) {
            this.field7435 = false;
        }
        ++field7424;
        return this.field7435;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZIZIILfl;Loa;)V")
    public final void method453(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class673 arg5, class635 arg6) {
        if (arg5 instanceof class610) {
            class610 var8 = (class610) arg5;
            if (this.field7429 != null && var8.field8609 != null) {
                this.field7429.method885(var8.field8609, arg4, arg1, arg3, arg0);
            }
        } else if (arg5 instanceof class520) {
            class520 var9 = (class520) arg5;
            if (this.field7429 != null && var9.field7429 != null) {
                this.field7429.method885(var9.field7429, arg4, arg1, arg3, arg0);
            }
        }
        if (arg2) {
            this.field7425 = 37;
        }
        ++field7428;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Loa;I)Lok;")
    public final class231 method442(class635 arg0, int arg1) {
        ++field7455;
        if (this.field7429 == null) {
            return null;
        } else {
            class389 var3 = arg0.method297();
            var3.method228(super.field4641, super.field4646, super.field4647);
            class231 var4 = null;
            if (arg1 != 0) {
                this.method450(-72, (class635) null);
            }
            if (this.field7456) {
                var4 = class526.method2993(1, 32671);
            }
            this.field7429.method904(var3, var4 != null ? var4.field2947[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        if (arg0 != 29877) {
            this.method448(-55);
        }
        ++field7454;
        if (this.field7429 != null) {
            this.field7429.method888();
        }
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(B)V")
    public static void method2965(byte arg0) {
        field7452 = null;
        field7448 = null;
        if (arg0 != -62) {
            method2962((byte) 108, (class617) null, 6);
        }
        field7440 = null;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
    public final void method448(int arg0) {
        this.field7451 = false;
        ++field7445;
        int var2 = 24 % ((12 - arg0) / 56);
        if (this.field7429 != null) {
            this.field7429.method874(-65537 & this.field7429.method902());
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)I")
    public final int method443(byte arg0) {
        ++field7442;
        int var2 = 112 / ((-82 - arg0) / 37);
        return this.field7433;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Loa;Lbfa;IIIIIZIIIIIIZ)V")
    public class520(class635 arg0, class335 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field4402 == -2, class294.method1673(arg12, arg13, 62));
        this.field7433 = (byte) arg13;
        this.field7425 = (byte) arg3;
        this.field7431 = (byte) arg12;
        this.field7451 = arg14;
        this.field7430 = (short) arg1.field4324;
        this.field7438 = arg7;
        this.field7456 = arg1.field4407 != 0 && !arg7;
        this.field7435 = arg0.method316() && arg1.field4349 && !this.field7438 && class601.field8530.method1317((byte) -87, class150.field1711) != 0;
        int var16 = 2048;
        if (this.field7451) {
            var16 |= 65536;
        }
        class671 var17 = this.method2966(this.field7435, arg0, -14819, var16);
        if (var17 != null) {
            this.field7429 = var17.field9536;
            this.field7449 = var17.field9533;
            if (this.field7451) {
                this.field7429 = this.field7429.method602((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLoa;II)Lau;")
    private final class671 method2966(boolean arg0, class635 arg1, int arg2, int arg3) {
        ++field7450;
        if (arg2 != -14819) {
            return null;
        } else {
            class335 var5 = class195.field2339.method3729(this.field7430 & 65535, (byte) 109);
            class137 var6;
            class137 var7;
            if (this.field7438) {
                var6 = class591.field8415[this.field7425];
                var7 = class275.field3477[0];
            } else {
                var6 = class275.field3477[this.field7425];
                if (~this.field7425 <= -4) {
                    var7 = null;
                } else {
                    var7 = class275.field3477[this.field7425 + 1];
                }
            }
            return var5.method1882(arg1, var6, super.field4647, super.field4646, ~this.field7431 != -12 ? this.field7433 : this.field7433 + 4, super.field4641, arg0, arg3, ~this.field7431 != -12 ? this.field7431 : 10, (byte) -120, var7);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
    public static final void method2967() {
        class477.method2790(1, class337.field4416);
    }
}
