import java.awt.Rectangle;
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

@OriginalClass("client!cv")
public class class18 extends class202 {

    @OriginalMember(owner = "client!cv", name = "I", descriptor = "I")
    private int field187 = 4096;

    @OriginalMember(owner = "client!cv", name = "J", descriptor = "I")
    private int field188 = 0;

    @OriginalMember(owner = "client!cv", name = "O", descriptor = "[I")
    public static int[] field193 = new int[256];

    @OriginalMember(owner = "client!cv", name = "P", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field194;

    @OriginalMember(owner = "client!cv", name = "K", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!cv", name = "L", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!cv", name = "N", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!cv", name = "M", descriptor = "Lmn;")
    public static class162 field191;

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V")
    public class18() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "(I)V")
    public static void method94(int arg0) {
        field194 = null;
        int var1 = -119 % ((arg0 - 57) / 41);
        field191 = null;
        field193 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = -80 / ((-46 - arg1) / 50);
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field187 = arg0.method1455(-3387);
            }
        } else {
            this.field188 = arg0.method1455(-3387);
        }
        ++field190;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IBLtq;)V")
    public static final void method95(int arg0, byte arg1, class276 arg2) {
        int var3 = -89 % ((arg1 - 46) / 40);
        ++field192;
        while (true) {
            class540 var4 = (class540) class229.field3804.method2123(107);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; ~var4.field7893 < ~var6; ++var6) {
                if (var4.field7887[var6] != null) {
                    if (~var4.field7887[var6].field7458 == -3) {
                        var4.field7892[var6] = -5;
                    }
                    if (var4.field7887[var6].field7458 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field7889[var6] != null) {
                    if (var4.field7889[var6].field7458 == 2) {
                        var4.field7892[var6] = -6;
                    }
                    if (~var4.field7889[var6].field7458 == -1) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg2.method1851(arg0, -1342326174);
            arg2.method1479((byte) -109, 0);
            int var7 = arg2.field3162;
            arg2.method1477(65280, var4.field7888);
            for (int var8 = 0; ~var8 > ~var4.field7893; ++var8) {
                if (var4.field7892[var8] != 0) {
                    arg2.method1479((byte) -96, var4.field7892[var8]);
                } else {
                    try {
                        int var9 = var4.field7896[var8];
                        if (~var9 != -1) {
                            if (var9 == 1) {
                                Field var10 = (Field) var4.field7887[var8].field7462;
                                var10.setInt((Object) null, var4.field7895[var8]);
                                arg2.method1479((byte) -107, 0);
                            } else if (var9 == 2) {
                                Field var11 = (Field) var4.field7887[var8].field7462;
                                int var12 = var11.getModifiers();
                                arg2.method1479((byte) -116, 0);
                                arg2.method1477(65280, var12);
                            }
                        } else {
                            Field var13 = (Field) var4.field7887[var8].field7462;
                            int var14 = var13.getInt((Object) null);
                            arg2.method1479((byte) -100, 0);
                            arg2.method1477(65280, var14);
                        }
                        if (var9 != 3) {
                            if (~var9 == -5) {
                                Method var21 = (Method) var4.field7889[var8].field7462;
                                int var22 = var21.getModifiers();
                                arg2.method1479((byte) -115, 0);
                                arg2.method1477(65280, var22);
                            }
                        } else {
                            Method var15 = (Method) var4.field7889[var8].field7462;
                            byte[][] var16 = var4.field7891[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; ~var16.length < ~var18; ++var18) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke((Object) null, var17);
                            if (var20 == null) {
                                arg2.method1479((byte) -114, 0);
                            } else if (var20 instanceof Number) {
                                arg2.method1479((byte) -102, 1);
                                arg2.method1439(((Number) var20).longValue(), 116);
                            } else if (!(var20 instanceof String)) {
                                arg2.method1479((byte) -86, 4);
                            } else {
                                arg2.method1479((byte) -102, 2);
                                arg2.method1458((String) var20, (byte) 78);
                            }
                        }
                    } catch (ClassNotFoundException var23) {
                        arg2.method1479((byte) -117, -10);
                    } catch (InvalidClassException var24) {
                        arg2.method1479((byte) -105, -11);
                    } catch (StreamCorruptedException var25) {
                        arg2.method1479((byte) -118, -12);
                    } catch (OptionalDataException var26) {
                        arg2.method1479((byte) -91, -13);
                    } catch (IllegalAccessException var27) {
                        arg2.method1479((byte) -125, -14);
                    } catch (IllegalArgumentException var28) {
                        arg2.method1479((byte) -94, -15);
                    } catch (InvocationTargetException var29) {
                        arg2.method1479((byte) -93, -16);
                    } catch (SecurityException var30) {
                        arg2.method1479((byte) -99, -17);
                    } catch (IOException var31) {
                        arg2.method1479((byte) -97, -18);
                    } catch (NullPointerException var32) {
                        arg2.method1479((byte) -108, -19);
                    } catch (Exception var33) {
                        arg2.method1479((byte) -127, -20);
                    } catch (Throwable var34) {
                        arg2.method1479((byte) -91, -21);
                    }
                }
            }
            arg2.method1470(var7, (byte) 31);
            arg2.method1438(65280, -var7 + arg2.field3162);
            var4.method3149(86);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field189;
        int[] var3 = super.field3064.method2452((byte) 79, arg0);
        if (!arg1) {
            method94(-102);
        }
        if (super.field3064.field5837) {
            int[] var4 = this.method1376(1046794076, 0, arg0);
            for (int var5 = 0; ~var5 > ~class276.field4375; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field188 && this.field187 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var2 = var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if (~(var2 & 1) == -2) {
                    var2 = -306674912 ^ var2 >>> 1;
                } else {
                    var2 >>>= 1;
                }
            }
            field193[var0] = var2;
        }
        field194 = new Rectangle[100];
        for (int var1 = 0; ~var1 > -101; ++var1) {
            field194[var1] = new Rectangle();
        }
    }
}
