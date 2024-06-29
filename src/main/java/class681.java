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

@OriginalClass("client!qb")
public class class681 extends class363 implements class599 {

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "Z")
    private boolean field9669 = false;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "Lsw;")
    public class11 field9660;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "Z")
    private boolean field9671;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "Lmca;")
    public static class5 field9668 = new class5(0, -1);

    @OriginalMember(owner = "client!qb", name = "jb", descriptor = "Ltt;")
    public static class338 field9677 = new class338(0, 4);

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "I")
    public static int field9670;

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!qb", name = "hb", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!qb", name = "ib", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!qb", name = "kb", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "Lcu;")
    private class475 field9674;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lr;Z)V")
    public final void method177(class562 arg0, boolean arg1) {
        ++field9657;
        class470 var3 = this.field9660.method67(false, super.field398, super.field397, arg1, arg0, 0, 262144);
        if (var3 != null) {
            int var4 = super.field398 >> 9;
            int var5 = super.field397 >> 9;
            class487 var6 = arg0.method1153();
            var6.method359(super.field398, super.field388, super.field397);
            this.field9660.method62(var6, var5, var3, -20068, arg0, false, var4, var4, var5);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLr;II)Z")
    public final boolean method167(boolean arg0, class562 arg1, int arg2, int arg3) {
        ++field9675;
        class470 var5 = this.field9660.method67(false, super.field398, super.field397, arg0, arg1, 0, 131072);
        if (var5 == null) {
            return false;
        } else {
            class487 var6 = arg1.method1153();
            var6.method359(super.field4796 + super.field398, super.field388, super.field4803 + super.field397);
            return class347.field4632 ? var5.method603(arg3, arg2, var6, false, class414.field5430) : var5.method655(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLr;)Lqw;")
    public final class329 method165(byte arg0, class562 arg1) {
        ++field9659;
        class470 var3 = this.field9660.method67(false, super.field398, super.field397, true, arg1, 0, 2048);
        if (var3 == null) {
            return null;
        } else {
            class487 var4 = arg1.method1153();
            var4.method359(super.field4796 + super.field398, super.field388, super.field397 - -super.field4803);
            if (arg0 < 109) {
                this.field9671 = false;
            }
            class329 var5 = null;
            if (this.field9671) {
                var5 = class541.method3035(27479, 1);
            }
            int var6 = super.field398 >> 9;
            int var7 = super.field397 >> 9;
            this.field9660.method62(var4, var7, var3, -20068, arg1, true, var6, var6, var7);
            if (class347.field4632) {
                var3.method648(var4, var5 != null ? var5.field4414[0] : null, class414.field5430, 0);
            } else {
                var3.method625(var4, var5 != null ? var5.field4414[0] : null, 0);
            }
            if (this.field9660.field122 != null) {
                class144 var8 = this.field9660.field122.method2915();
                if (class347.field4632) {
                    arg1.method1120(var8, class414.field5430);
                } else {
                    arg1.method1096(var8);
                }
            }
            this.field9669 = var3.method657() || this.field9660.field122 != null;
            if (this.field9674 != null) {
                class424.method2404(var3, -17171, super.field397, super.field398, this.field9674, super.field388);
            } else {
                this.field9674 = class258.method1562(super.field398, (byte) -47, super.field397, var3, super.field388);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Lr;I)Lcu;")
    public final class475 method174(class562 arg0, int arg1) {
        if (arg1 != -14700) {
            this.method174((class562) null, 46);
        }
        ++field9667;
        return this.field9674;
    }

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "(I)Z")
    public final boolean method168(int arg0) {
        if (arg0 != 20071) {
            this.field9660 = null;
        }
        ++field9678;
        return this.field9669;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I")
    public final int method710(byte arg0) {
        ++field9662;
        if (arg0 < 55) {
            this.field9674 = null;
        }
        return this.field9660.field131;
    }

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "(I)I")
    public final int method173(int arg0) {
        if (arg0 != 0) {
            field9668 = null;
        }
        ++field9672;
        return this.field9660.method63(-94);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public final void method703(int arg0) {
        ++field9665;
        if (arg0 != 6956) {
            this.method177((class562) null, true);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)I")
    public final int method699(byte arg0) {
        ++field9658;
        if (arg0 >= -32) {
            this.method703(-108);
        }
        return this.field9660.field124;
    }

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "(I)V")
    public static void method3875(int arg0) {
        field9677 = null;
        field9668 = null;
        if (arg0 < 99) {
            field9677 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLjd;)V")
    public static final void method3876(byte arg0, class537 arg1) {
        ++field9661;
        class365 var2 = (class365) class259.field3385.method2506(68);
        if (var2 != null) {
            boolean var3 = false;
            for (int var4 = 0; ~var4 > ~var2.field4825; ++var4) {
                if (var2.field4815[var4] != null) {
                    if (~var2.field4815[var4].field9420 == -3) {
                        var2.field4819[var4] = -5;
                    }
                    if (~var2.field4815[var4].field9420 == -1) {
                        var3 = true;
                    }
                }
                if (var2.field4826[var4] != null) {
                    if (~var2.field4826[var4].field9420 == -3) {
                        var2.field4819[var4] = -6;
                    }
                    if (var2.field4826[var4].field9420 == 0) {
                        var3 = true;
                    }
                }
            }
            if (!var3) {
                if (arg0 <= -52) {
                    int var5 = arg1.field2219;
                    arg1.method958(0, var2.field4824);
                    for (int var6 = 0; ~var6 > ~var2.field4825; ++var6) {
                        if (~var2.field4819[var6] != -1) {
                            arg1.method915(-31914, var2.field4819[var6]);
                        } else {
                            try {
                                int var7 = var2.field4821[var6];
                                if (var7 != 0) {
                                    if (var7 == 1) {
                                        Field var8 = (Field) var2.field4815[var6].field9421;
                                        var8.setInt((Object) null, var2.field4816[var6]);
                                        arg1.method915(-31914, 0);
                                    } else if (~var7 == -3) {
                                        Field var9 = (Field) var2.field4815[var6].field9421;
                                        int var10 = var9.getModifiers();
                                        arg1.method915(-31914, 0);
                                        arg1.method958(0, var10);
                                    }
                                } else {
                                    Field var11 = (Field) var2.field4815[var6].field9421;
                                    int var12 = var11.getInt((Object) null);
                                    arg1.method915(-31914, 0);
                                    arg1.method958(0, var12);
                                }
                                if (var7 != 3) {
                                    if (~var7 == -5) {
                                        Method var19 = (Method) var2.field4826[var6].field9421;
                                        int var20 = var19.getModifiers();
                                        arg1.method915(-31914, 0);
                                        arg1.method958(0, var20);
                                    }
                                } else {
                                    Method var13 = (Method) var2.field4826[var6].field9421;
                                    byte[][] var14 = var2.field4823[var6];
                                    Object[] var15 = new Object[var14.length];
                                    for (int var16 = 0; ~var16 > ~var14.length; ++var16) {
                                        ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                                        var15[var16] = var17.readObject();
                                    }
                                    Object var18 = var13.invoke((Object) null, var15);
                                    if (var18 == null) {
                                        arg1.method915(-31914, 0);
                                    } else if (!(var18 instanceof Number)) {
                                        if (!(var18 instanceof String)) {
                                            arg1.method915(-31914, 4);
                                        } else {
                                            arg1.method915(-31914, 2);
                                            arg1.method936((String) var18, -80);
                                        }
                                    } else {
                                        arg1.method915(-31914, 1);
                                        arg1.method917(1315630008, ((Number) var18).longValue());
                                    }
                                }
                            } catch (ClassNotFoundException var21) {
                                arg1.method915(-31914, -10);
                            } catch (InvalidClassException var22) {
                                arg1.method915(-31914, -11);
                            } catch (StreamCorruptedException var23) {
                                arg1.method915(-31914, -12);
                            } catch (OptionalDataException var24) {
                                arg1.method915(-31914, -13);
                            } catch (IllegalAccessException var25) {
                                arg1.method915(-31914, -14);
                            } catch (IllegalArgumentException var26) {
                                arg1.method915(-31914, -15);
                            } catch (InvocationTargetException var27) {
                                arg1.method915(-31914, -16);
                            } catch (SecurityException var28) {
                                arg1.method915(-31914, -17);
                            } catch (IOException var29) {
                                arg1.method915(-31914, -18);
                            } catch (NullPointerException var30) {
                                arg1.method915(-31914, -19);
                            } catch (Exception var31) {
                                arg1.method915(-31914, -20);
                            } catch (Throwable var32) {
                                arg1.method915(-31914, -21);
                            }
                        }
                    }
                    arg1.method955((byte) 90, var5);
                    var2.method242(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Z")
    public final boolean method705(int arg0) {
        if (arg0 < 67) {
            return false;
        } else {
            ++field9676;
            return this.field9660.method59(0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lr;I)V")
    public final void method700(class562 arg0, int arg1) {
        this.field9660.method65(-104, arg0);
        ++field9670;
        if (arg1 != -21186) {
            field9668 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lr;Ltc;IIIIIZIIIII)V")
    public class681(class562 arg0, class600 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field9660 = new class11(arg0, arg1, arg10, arg11, super.field385, arg3, arg4, arg6, arg7, arg12);
        this.field9671 = ~arg1.field8293 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)I")
    public final int method706(int arg0) {
        ++field9673;
        return arg0 != 16259 ? 118 : this.field9660.field129;
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)Z")
    public final boolean method161(int arg0) {
        ++field9663;
        if (arg0 != 28602) {
            this.field9674 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)I")
    public final int method176(byte arg0) {
        ++field9666;
        if (arg0 >= -114) {
            field9677 = null;
        }
        return this.field9660.method64(-116);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lr;B)V")
    public final void method707(class562 arg0, byte arg1) {
        int var3 = 102 % ((arg1 - -28) / 54);
        ++field9656;
        this.field9660.method61(arg0, (byte) -93);
    }
}
