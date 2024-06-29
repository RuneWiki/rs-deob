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

@OriginalClass("client!hi")
public class class206 extends class38 {

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
    private int field3037 = 0;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
    private int field3040 = 4096;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "Lbh;")
    public static class37 field3043;

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 3)
    public class206() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILrg;)V", line = 8)
    public static final void method1398(int arg0, class645 arg1) {
        ++field3041;
        if (arg1.field9068.length + -arg1.field9084 >= 1) {
            int var2 = arg1.method3745(arg0 ^ 6312);
            if (var2 >= 0 && var2 <= 1) {
                if (arg1.field9068.length + -arg1.field9084 >= 2) {
                    int var3 = arg1.method3712((byte) -111);
                    if (~(arg1.field9068.length + -arg1.field9084) <= ~(var3 * 6)) {
                        if (arg0 != -2) {
                            field3043 = null;
                        }
                        for (int var4 = 0; ~var3 < ~var4; ++var4) {
                            int var5 = arg1.method3712((byte) 52);
                            int var6 = arg1.method3720(-19541);
                            if (class461.field6799.length > var5 && class521.field7460[var5] && (~class128.field1729.method2868(var5, (byte) -108).field8504 != -50 || var6 >= -1 && ~var6 >= -2)) {
                                class461.field6799[var5] = var6;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(B)V", line = 54)
    public static void method1399(byte arg0) {
        int var1 = -20 % ((arg0 - -45) / 50);
        field3043 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)[[I", line = 64)
    public final int[][] method196(int arg0, int arg1) {
        if (arg0 != -18210) {
            return null;
        } else {
            ++field3036;
            int[][] var3 = super.field387.method2809(arg1, (byte) -48);
            if (super.field387.field6792) {
                int[][] var4 = this.method195(true, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class729.field10216; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (this.field3037 <= var12) {
                        if (this.field3040 >= var12) {
                            var8[var11] = var12;
                        } else {
                            var8[var11] = this.field3040;
                        }
                    } else {
                        var8[var11] = this.field3037;
                    }
                    if (~this.field3037 < ~var13) {
                        var9[var11] = this.field3037;
                    } else if (var13 <= this.field3040) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field3040;
                    }
                    if (~this.field3037 < ~var14) {
                        var10[var11] = this.field3037;
                    } else if (~this.field3040 > ~var14) {
                        var10[var11] = this.field3040;
                    } else {
                        var10[var11] = var14;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)[I", line = 140)
    public final int[] method199(byte arg0, int arg1) {
        ++field3042;
        int[] var3 = super.field397.method1376(arg1, (byte) 110);
        if (super.field397.field3005) {
            int[] var4 = this.method189(arg1, 0, (byte) -92);
            for (int var5 = 0; class729.field10216 > var5; ++var5) {
                int var6 = var4[var5];
                if (this.field3037 > var6) {
                    var3[var5] = this.field3037;
                } else if (var6 > this.field3040) {
                    var3[var5] = this.field3040;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        if (arg0 > -43) {
            method1400((class304) null, 74);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILrg;)V", line = 187)
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field388 = arg2.method3745(-6314) == 1;
                }
            } else {
                this.field3040 = arg2.method3712((byte) 3);
            }
        } else {
            this.field3037 = arg2.method3712((byte) -113);
        }
        if (arg0 < 34) {
            field3043 = null;
        }
        ++field3039;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lvt;I)V", line = 234)
    public static final void method1400(class304 arg0, int arg1) {
        ++field3038;
        class67 var2 = (class67) class195.field2969.method1195(0);
        if (var2 != null) {
            boolean var3 = false;
            for (int var4 = arg1; ~var4 > ~var2.field959; ++var4) {
                if (var2.field954[var4] != null) {
                    if (~var2.field954[var4].field2986 == -3) {
                        var2.field956[var4] = -5;
                    }
                    if (var2.field954[var4].field2986 == 0) {
                        var3 = true;
                    }
                }
                if (var2.field962[var4] != null) {
                    if (var2.field962[var4].field2986 == 2) {
                        var2.field956[var4] = -6;
                    }
                    if (var2.field962[var4].field2986 == 0) {
                        var3 = true;
                    }
                }
            }
            if (!var3) {
                int var5 = arg0.field9084;
                arg0.method3695(var2.field957, arg1 + 255);
                for (int var6 = 0; var2.field959 > var6; ++var6) {
                    if (~var2.field956[var6] != -1) {
                        arg0.method3730(arg1 + 124, var2.field956[var6]);
                    } else {
                        try {
                            int var7 = var2.field958[var6];
                            if (var7 != 0) {
                                if (~var7 != -2) {
                                    if (~var7 == -3) {
                                        Field var8 = (Field) var2.field954[var6].field2990;
                                        int var9 = var8.getModifiers();
                                        arg0.method3730(119, 0);
                                        arg0.method3695(var9, 255);
                                    }
                                } else {
                                    Field var10 = (Field) var2.field954[var6].field2990;
                                    var10.setInt((Object) null, var2.field966[var6]);
                                    arg0.method3730(arg1 + 116, 0);
                                }
                            } else {
                                Field var11 = (Field) var2.field954[var6].field2990;
                                int var12 = var11.getInt((Object) null);
                                arg0.method3730(114, 0);
                                arg0.method3695(var12, arg1 ^ 255);
                            }
                            if (~var7 != -4) {
                                if (~var7 == -5) {
                                    Method var19 = (Method) var2.field962[var6].field2990;
                                    int var20 = var19.getModifiers();
                                    arg0.method3730(arg1 ^ 125, 0);
                                    arg0.method3695(var20, 255);
                                }
                            } else {
                                Method var13 = (Method) var2.field962[var6].field2990;
                                byte[][] var14 = var2.field965[var6];
                                Object[] var15 = new Object[var14.length];
                                for (int var16 = 0; ~var16 > ~var14.length; ++var16) {
                                    ObjectInputStream var17 = new ObjectInputStream(new ByteArrayInputStream(var14[var16]));
                                    var15[var16] = var17.readObject();
                                }
                                Object var18 = var13.invoke((Object) null, var15);
                                if (var18 != null) {
                                    if (!(var18 instanceof Number)) {
                                        if (var18 instanceof String) {
                                            arg0.method3730(arg1 + 106, 2);
                                            arg0.method3692(125, (String) var18);
                                        } else {
                                            arg0.method3730(107, 4);
                                        }
                                    } else {
                                        arg0.method3730(102, 1);
                                        arg0.method3735(((Number) var18).longValue(), -80);
                                    }
                                } else {
                                    arg0.method3730(arg1 ^ 116, 0);
                                }
                            }
                        } catch (ClassNotFoundException var21) {
                            arg0.method3730(104, -10);
                        } catch (InvalidClassException var22) {
                            arg0.method3730(arg1 ^ 107, -11);
                        } catch (StreamCorruptedException var23) {
                            arg0.method3730(119, -12);
                        } catch (OptionalDataException var24) {
                            arg0.method3730(126, -13);
                        } catch (IllegalAccessException var25) {
                            arg0.method3730(107, -14);
                        } catch (IllegalArgumentException var26) {
                            arg0.method3730(arg1 ^ 126, -15);
                        } catch (InvocationTargetException var27) {
                            arg0.method3730(127, -16);
                        } catch (SecurityException var28) {
                            arg0.method3730(117, -17);
                        } catch (IOException var29) {
                            arg0.method3730(arg1 + 107, -18);
                        } catch (NullPointerException var30) {
                            arg0.method3730(104, -19);
                        } catch (Exception var31) {
                            arg0.method3730(126, -20);
                        } catch (Throwable var32) {
                            arg0.method3730(125, -21);
                        }
                    }
                }
                arg0.method3757(var5, false);
                var2.method1304((byte) 7);
            }
        }
    }
}
