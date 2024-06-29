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

@OriginalClass("client!ff")
public class class54 extends class142 {

    @OriginalMember(owner = "client!ff", name = "X", descriptor = "Z")
    private boolean field971 = true;

    @OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
    private int field975 = 4096;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "Lai;")
    public static class10 field967 = class44.method278("und loggen sich dann erneut ein)3", -87);

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "Lai;")
    private static class10 field966 = class44.method278("Service unavailable)3", -102);

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "Lai;")
    public static class10 field969 = field966;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "Lai;")
    public static class10 field968 = class44.method278(")3", 109);

    @OriginalMember(owner = "client!ff", name = "Y", descriptor = "Lai;")
    public static class10 field972 = class44.method278("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", 116);

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lmb;")
    public static class111 field973;

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class54() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)I")
    public static final int method375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 3;
        if (arg6 < 48) {
            field967 = null;
        }
        ++field964;
        if ((1 & arg5) == 1) {
            int var8 = arg4;
            arg4 = arg3;
            arg3 = var8;
        }
        if (~var7 == -1) {
            return arg0;
        } else if (~var7 == -2) {
            return arg1;
        } else {
            return ~var7 == -3 ? -arg0 + 7 + -arg4 + 1 : 7 - (arg1 - (-arg3 + 1));
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            int[][] var3 = super.field2666.method956(arg0, -113);
            ++field974;
            if (super.field2666.field2664) {
                int[] var4 = this.method963((byte) -121, 0, class205.field3986 & arg0 + -1);
                int[] var5 = this.method963((byte) -121, 0, arg0);
                int[] var6 = this.method963((byte) -121, 0, class205.field3986 & arg0 + 1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; class133.field2499 > var10; ++var10) {
                    int var11 = (var6[var10] - var4[var10]) * this.field975;
                    int var12 = (var5[var10 + 1 & class56.field997] - var5[var10 - 1 & class56.field997]) * this.field975;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (4096.0D * Math.sqrt((double) ((var15 - -var16 - -4096) / 4096)));
                    int var18;
                    int var19;
                    int var20;
                    if (var17 != 0) {
                        var18 = var12 / var17;
                        var19 = var11 / var17;
                        var20 = 16777216 / var17;
                    } else {
                        var19 = 0;
                        var20 = 0;
                        var18 = 0;
                    }
                    if (this.field971) {
                        var18 = (var18 >> 1) + 2048;
                        var19 = (var19 >> 1) + 2048;
                        var20 = (var20 >> 1) + 2048;
                    }
                    var7[var10] = var18;
                    var8[var10] = var19;
                    var9[var10] = var20;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field971 = arg0.method767(true) == 1;
            }
        } else {
            this.field975 = arg0.method762((byte) 119);
        }
        ++field970;
        if (arg2 >= -34) {
            method377((byte) 9);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILke;)V")
    public static final void method376(int arg0, int arg1, class96 arg2) {
        ++field965;
        if (arg1 < 11) {
            field969 = null;
        }
        while (true) {
            class73 var3 = (class73) class82.field1438.method1223(true);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; ~var3.field1255 < ~var5; ++var5) {
                if (var3.field1259[var5] != null) {
                    if (var3.field1259[var5].field352 == 2) {
                        var3.field1254[var5] = -5;
                    }
                    if (var3.field1259[var5].field352 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1258[var5] != null) {
                    if (~var3.field1258[var5].field352 == -3) {
                        var3.field1254[var5] = -6;
                    }
                    if (var3.field1258[var5].field352 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method635((byte) -115, arg0);
            arg2.method781(0, 0);
            int var6 = arg2.field2170;
            arg2.method786(var3.field1256, (byte) -70);
            for (int var7 = 0; var3.field1255 > var7; ++var7) {
                if (var3.field1254[var7] != 0) {
                    arg2.method781(0, var3.field1254[var7]);
                } else {
                    try {
                        int var8 = var3.field1251[var7];
                        if (~var8 == -1) {
                            Field var9 = (Field) var3.field1259[var7].field353;
                            int var10 = var9.getInt((Object) null);
                            arg2.method781(0, 0);
                            arg2.method786(var10, (byte) -51);
                        } else if (~var8 != -2) {
                            if (var8 == 2) {
                                Field var11 = (Field) var3.field1259[var7].field353;
                                int var12 = var11.getModifiers();
                                arg2.method781(0, 0);
                                arg2.method786(var12, (byte) -56);
                            }
                        } else {
                            Field var13 = (Field) var3.field1259[var7].field353;
                            var13.setInt((Object) null, var3.field1261[var7]);
                            arg2.method781(0, 0);
                        }
                        if (~var8 != -4) {
                            if (~var8 == -5) {
                                Method var14 = (Method) var3.field1258[var7].field353;
                                int var15 = var14.getModifiers();
                                arg2.method781(0, 0);
                                arg2.method786(var15, (byte) -111);
                            }
                        } else {
                            Method var16 = (Method) var3.field1258[var7].field353;
                            byte[][] var17 = var3.field1246[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; ~var19 > ~var17.length; ++var19) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method781(0, 0);
                            } else if (var21 instanceof Number) {
                                arg2.method781(0, 1);
                                arg2.method783(((Number) var21).longValue(), -121);
                            } else if (!(var21 instanceof class10)) {
                                arg2.method781(0, 4);
                            } else {
                                arg2.method781(0, 2);
                                arg2.method769(0, (class10) var21);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method781(0, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method781(0, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method781(0, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method781(0, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method781(0, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method781(0, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method781(0, -16);
                    } catch (SecurityException var29) {
                        arg2.method781(0, -17);
                    } catch (IOException var30) {
                        arg2.method781(0, -18);
                    } catch (NullPointerException var31) {
                        arg2.method781(0, -19);
                    } catch (Exception var32) {
                        arg2.method781(0, -20);
                    } catch (Throwable var33) {
                        arg2.method781(0, -21);
                    }
                }
            }
            arg2.method779(var6, (byte) -12);
            arg2.method789(-var6 + arg2.field2170, (byte) 7);
            var3.method848(false);
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
    public static void method377(byte arg0) {
        field968 = null;
        field966 = null;
        if (arg0 == 58) {
            field969 = null;
            field973 = null;
            field967 = null;
            field972 = null;
        }
    }
}
