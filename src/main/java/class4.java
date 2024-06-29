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

@OriginalClass("client!ac")
public class class4 extends class189 {

    @OriginalMember(owner = "client!ac", name = "ob", descriptor = "Z")
    private boolean field120 = true;

    @OriginalMember(owner = "client!ac", name = "nb", descriptor = "I")
    private int field119 = 4096;

    @OriginalMember(owner = "client!ac", name = "mb", descriptor = "Lch;")
    public static class29 field118 = new class29(30);

    @OriginalMember(owner = "client!ac", name = "ub", descriptor = "Lgg;")
    private static class63 field126 = class116.method911(43, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!ac", name = "sb", descriptor = "Lgg;")
    public static class63 field124 = field126;

    @OriginalMember(owner = "client!ac", name = "xb", descriptor = "Lgg;")
    public static class63 field129 = class116.method911(43, "<br>(X");

    @OriginalMember(owner = "client!ac", name = "vb", descriptor = "Lgg;")
    public static class63 field127 = class116.method911(43, "null");

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ac", name = "hb", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ac", name = "ib", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ac", name = "jb", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ac", name = "kb", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ac", name = "lb", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ac", name = "pb", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ac", name = "qb", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ac", name = "rb", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ac", name = "tb", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ac", name = "wb", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        ++field121;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field120 = ~arg2.method64(31790) == -2;
            }
        } else {
            this.field119 = arg2.method46((byte) 65);
        }
        if (arg1 < 32) {
            this.field120 = true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static void method78(int arg0) {
        field129 = null;
        field127 = null;
        field126 = null;
        field118 = null;
        if (arg0 != 2) {
            method78(-6);
        }
        field124 = null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)I")
    public static final int method79(int arg0, int arg1, int arg2) {
        ++field122;
        if (arg2 <= 114) {
            method79(46, 49, 112);
        }
        if (arg1 == -1) {
            return 12345678;
        } else {
            int var3 = (arg1 & 127) * arg0 >> 7;
            if (~var3 > -3) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (65408 & arg1) + var3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)Z")
    public static final boolean method80(int arg0, int arg1) {
        ++field125;
        if (arg0 != -759) {
            method81(-83);
        }
        return arg1 >= 48 && ~arg1 >= -58;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public static final void method81(int arg0) {
        class167.field3437.method857((byte) 53);
        ++field113;
        int var1 = class167.field3437.method856((byte) 2, 1);
        if (var1 != 0) {
            int var2 = class167.field3437.method856((byte) 2, 2);
            if (~var2 == arg0) {
                class3.field84[class89.field2092++] = 2047;
            } else if (var2 == 1) {
                int var3 = class167.field3437.method856((byte) 2, 3);
                class3.field72.method466(-96, false, var3);
                int var4 = class167.field3437.method856((byte) 2, 1);
                if (var4 == 1) {
                    class3.field84[class89.field2092++] = 2047;
                }
            } else if (var2 == 2) {
                int var5 = class167.field3437.method856((byte) 2, 3);
                class3.field72.method466(arg0 + -2, true, var5);
                int var6 = class167.field3437.method856((byte) 2, 3);
                class3.field72.method466(arg0 + 93, true, var6);
                int var7 = class167.field3437.method856((byte) 2, 1);
                if (~var7 == -2) {
                    class3.field84[class89.field2092++] = 2047;
                }
            } else if (var2 == 3) {
                int var8 = class167.field3437.method856((byte) 2, 1);
                int var9 = class167.field3437.method856((byte) 2, 7);
                int var10 = class167.field3437.method856((byte) 2, 7);
                class112.field2528 = class167.field3437.method856((byte) 2, 2);
                int var11 = class167.field3437.method856((byte) 2, 1);
                if (~var11 == -2) {
                    class3.field84[class89.field2092++] = 2047;
                }
                class3.field72.method473(var10, var8 == 1, var9, -46);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class4() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lle;IB)V")
    public static final void method82(class104 arg0, int arg1, byte arg2) {
        ++field112;
        if (arg2 != -1) {
            method81(83);
        }
        while (true) {
            class100 var3 = (class100) class134.field2903.method1033(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; ~var5 > ~var3.field2356; ++var5) {
                if (var3.field2354[var5] != null) {
                    if (~var3.field2354[var5].field2058 == -3) {
                        var3.field2361[var5] = -5;
                    }
                    if (~var3.field2354[var5].field2058 == -1) {
                        var4 = true;
                    }
                }
                if (var3.field2347[var5] != null) {
                    if (~var3.field2347[var5].field2058 == -3) {
                        var3.field2361[var5] = -6;
                    }
                    if (~var3.field2347[var5].field2058 == -1) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method854(arg1, true);
            arg0.method66(arg2 ^ -3, 0);
            int var6 = arg0.field54;
            arg0.method76(var3.field2350, (byte) 114);
            for (int var7 = 0; var3.field2356 > var7; ++var7) {
                if (~var3.field2361[var7] != -1) {
                    arg0.method66(2, var3.field2361[var7]);
                } else {
                    try {
                        int var8 = var3.field2353[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2354[var7].field2060;
                            int var10 = var9.getInt((Object) null);
                            arg0.method66(2, 0);
                            arg0.method76(var10, (byte) 114);
                        } else if (~var8 != -2) {
                            if (var8 == 2) {
                                Field var11 = (Field) var3.field2354[var7].field2060;
                                int var12 = var11.getModifiers();
                                arg0.method66(2, 0);
                                arg0.method76(var12, (byte) 114);
                            }
                        } else {
                            Field var13 = (Field) var3.field2354[var7].field2060;
                            var13.setInt((Object) null, var3.field2362[var7]);
                            arg0.method66(2, 0);
                        }
                        if (var8 != 3) {
                            if (var8 == 4) {
                                Method var20 = (Method) var3.field2347[var7].field2060;
                                int var21 = var20.getModifiers();
                                arg0.method66(arg2 ^ -3, 0);
                                arg0.method76(var21, (byte) 114);
                            }
                        } else {
                            Method var14 = (Method) var3.field2347[var7].field2060;
                            byte[][] var15 = var3.field2345[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; ~var15.length < ~var17; ++var17) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 != null) {
                                if (!(var19 instanceof Number)) {
                                    if (!(var19 instanceof class63)) {
                                        arg0.method66(2, 4);
                                    } else {
                                        arg0.method66(2, 2);
                                        arg0.method65((class63) var19, 33);
                                    }
                                } else {
                                    arg0.method66(arg2 + 3, 1);
                                    arg0.method32((byte) 72, ((Number) var19).longValue());
                                }
                            } else {
                                arg0.method66(2, 0);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method66(2, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method66(2, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method66(2, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method66(arg2 + 3, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method66(arg2 + 3, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method66(2, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method66(2, -16);
                    } catch (SecurityException var29) {
                        arg0.method66(2, -17);
                    } catch (IOException var30) {
                        arg0.method66(2, -18);
                    } catch (NullPointerException var31) {
                        arg0.method66(2, -19);
                    } catch (Exception var32) {
                        arg0.method66(2, -20);
                    } catch (Throwable var33) {
                        arg0.method66(2, -21);
                    }
                }
            }
            arg0.method74(var6, (byte) 50);
            arg0.method48((byte) 50, arg0.field54 - var6);
            var3.method1172(-68);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        ++field115;
        int[][] var3 = super.field3808.method237(-1, arg0);
        if (super.field3808.field561) {
            int[] var4 = this.method1245(0, class1.field4 & arg0 + -1, 11433);
            int[] var5 = this.method1245(0, arg0, 11433);
            int[] var6 = this.method1245(0, arg0 + 1 & class1.field4, 11433);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; class54.field1430 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field119;
                int var12 = (var5[var10 + 1 & class75.field1867] + -var5[class75.field1867 & var10 + -1]) * this.field119;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (Math.sqrt((double) ((var16 + 4096 + var15) / 4096)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                } else {
                    var19 = 0;
                    var18 = 0;
                    var20 = 0;
                }
                if (this.field120) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var8[var10] = var20;
                var7[var10] = var18;
                var9[var10] = var19;
            }
        }
        return arg1 <= 34 ? null : var3;
    }
}
