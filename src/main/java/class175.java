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

@OriginalClass("client!sg")
public class class175 extends class12 {

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    private int field3312 = 4096;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    private int field3314 = 4096;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "[I")
    private int[] field3317 = new int[3];

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "I")
    private int field3322 = 4096;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "I")
    private int field3326 = 409;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "Ltg;")
    public static class184 field3315 = class135.method812(" <col=00ff80>", 3);

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
    public static int field3316 = 0;

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
    public static int field3324 = 0;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "Ltg;")
    public static class184 field3328 = class135.method812("::fpsoff", 3);

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "[Z")
    public static boolean[] field3329 = new boolean[100];

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "Lah;")
    public static class9 field3318 = new class9(4096);

    @OriginalMember(owner = "client!sg", name = "fb", descriptor = "I")
    public static int field3330 = 0;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lvb;BLvb;)V")
    public static final void method1078(class197 arg0, byte arg1, class197 arg2) {
        ++field3320;
        class45.field863 = arg0;
        class194.field3760 = arg2;
        if (arg1 < 94) {
            field3318 = null;
        }
        class179.field3419 = class194.field3760.method1272(3, 19661);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZI)Ltg;")
    public static final class184 method1079(int arg0, boolean arg1, int arg2) {
        if (arg2 <= 65) {
            method1079(-115, true, 67);
        }
        ++field3323;
        return class105.method656(arg1, (byte) 127, 10, arg0);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        int var3 = 6 % ((arg1 - -58) / 34);
        ++field3319;
        int[][] var4 = super.field232.method673(arg0, 110);
        if (super.field232.field1962) {
            int[][] var5 = this.method76(arg0, 6218, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~class201.field3889 < ~var12; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field3317[0] + var13;
                if (~var14 > -1) {
                    var14 = -var14;
                }
                if (this.field3326 < var14) {
                    var9[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = -this.field3317[1] + var15;
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (var16 > this.field3326) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field3317[2] + var17;
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (this.field3326 < var18) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field3312 * var13 >> 12;
                            var10[var12] = this.field3314 * var15 >> 12;
                            var11[var12] = this.field3322 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field3327;
        if (arg2) {
            field3316 = -13;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            int var5 = arg0.method568((byte) -115);
                            this.field3317[0] = class10.method61(var5 << 4, 267386880);
                            this.field3317[2] = class10.method61(var5, 255) >> 12;
                            this.field3317[1] = class10.method61(4080, var5 >> 4);
                        }
                    } else {
                        this.field3312 = arg0.method611(false);
                    }
                } else {
                    this.field3314 = arg0.method611(false);
                }
            } else {
                this.field3322 = arg0.method611(false);
            }
        } else {
            this.field3326 = arg0.method611(false);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V")
    public static void method1080(byte arg0) {
        field3318 = null;
        field3328 = null;
        if (arg0 < 21) {
            field3330 = 78;
        }
        field3315 = null;
        field3329 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILbg;I)V")
    public static final void method1081(int arg0, class17 arg1, int arg2) {
        if (arg2 > -47) {
            method1081(124, (class17) null, 25);
        }
        ++field3321;
        while (true) {
            class79 var3 = (class79) class179.field3414.method404(false);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; ~var3.field1427 < ~var5; ++var5) {
                if (var3.field1421[var5] != null) {
                    if (var3.field1421[var5].field1765 == 2) {
                        var3.field1426[var5] = -5;
                    }
                    if (~var3.field1421[var5].field1765 == -1) {
                        var4 = true;
                    }
                }
                if (var3.field1424[var5] != null) {
                    if (var3.field1424[var5].field1765 == 2) {
                        var3.field1426[var5] = -6;
                    }
                    if (var3.field1424[var5].field1765 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method106(arg0, -127);
            arg1.method583((byte) 14, 0);
            int var6 = arg1.field1834;
            arg1.method580(var3.field1422, false);
            for (int var7 = 0; var3.field1427 > var7; ++var7) {
                if (~var3.field1426[var7] != -1) {
                    arg1.method583((byte) 14, var3.field1426[var7]);
                } else {
                    try {
                        int var8 = var3.field1428[var7];
                        if (~var8 == -1) {
                            Field var9 = (Field) var3.field1421[var7].field1767;
                            int var10 = var9.getInt((Object) null);
                            arg1.method583((byte) 14, 0);
                            arg1.method580(var10, false);
                        } else if (~var8 != -2) {
                            if (var8 == 2) {
                                Field var11 = (Field) var3.field1421[var7].field1767;
                                int var12 = var11.getModifiers();
                                arg1.method583((byte) 14, 0);
                                arg1.method580(var12, false);
                            }
                        } else {
                            Field var13 = (Field) var3.field1421[var7].field1767;
                            var13.setInt((Object) null, var3.field1420[var7]);
                            arg1.method583((byte) 14, 0);
                        }
                        if (~var8 != -4) {
                            if (~var8 == -5) {
                                Method var14 = (Method) var3.field1424[var7].field1767;
                                int var15 = var14.getModifiers();
                                arg1.method583((byte) 14, 0);
                                arg1.method580(var15, false);
                            }
                        } else {
                            byte[][] var16 = var3.field1439[var7];
                            Method var17 = (Method) var3.field1424[var7].field1767;
                            Object[] var18 = new Object[var16.length];
                            for (int var19 = 0; ~var19 > ~var16.length; ++var19) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var16[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var17.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method583((byte) 14, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method583((byte) 14, 1);
                                arg1.method607(((Number) var21).longValue(), 126);
                            } else if (!(var21 instanceof class184)) {
                                arg1.method583((byte) 14, 4);
                            } else {
                                arg1.method583((byte) 14, 2);
                                arg1.method600((class184) var21, 17);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method583((byte) 14, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method583((byte) 14, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method583((byte) 14, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method583((byte) 14, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method583((byte) 14, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method583((byte) 14, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method583((byte) 14, -16);
                    } catch (SecurityException var29) {
                        arg1.method583((byte) 14, -17);
                    } catch (IOException var30) {
                        arg1.method583((byte) 14, -18);
                    } catch (NullPointerException var31) {
                        arg1.method583((byte) 14, -19);
                    } catch (Exception var32) {
                        arg1.method583((byte) 14, -20);
                    } catch (Throwable var33) {
                        arg1.method583((byte) 14, -21);
                    }
                }
            }
            arg1.method581(var6, true);
            arg1.method593(105, -var6 + arg1.field1834);
            var3.method797((byte) -107);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class175() {
        super(1, false);
    }
}
