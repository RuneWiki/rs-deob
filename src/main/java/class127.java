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

@OriginalClass("client!op")
public class class127 {

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public int field1644;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public int field1647;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "Lop;")
    public class127 field1643;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "Lc;")
    public class124 field1645;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "[Z")
    public static boolean[] field1646 = new boolean[100];

    @OriginalMember(owner = "client!op", name = "m", descriptor = "Z")
    public static boolean field1649 = false;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "[F")
    public static float[] field1650 = new float[4];

    @OriginalMember(owner = "client!op", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field1654 = new String[100];

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIII)V", line = 13)
    public static final void method766(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 32659) {
            field1654 = null;
        }
        class106.field1443.method2398(arg2 ^ 0xFFFF8078, arg0);
        field1642++;
        class106.field1443.method2444((byte) 65, arg1);
        class106.field1443.method2444((byte) 65, arg3);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 26)
    public static final void method767(int arg0) {
        class275.field3667.method1167(class287.field3770, class319.field4256.field4653 ? class303.field4033 + 256 << 0 : -1, 256);
        if (arg0 >= -76) {
            method773(-127, -123, -52, -102);
        }
        field1651++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)Lop;", line = 40)
    public final class127 method768(int arg0, int arg1) {
        field1637++;
        if (arg0 != -1) {
            this.field1653 = -59;
        }
        return new class127(this.field1647, arg1);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(II)I", line = 54)
    public static final int method769(int arg0, int arg1) {
        field1652++;
        if (arg0 != 21816) {
            method766(-98, -91, 85, 36);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V", line = 69)
    public static void method770(byte arg0) {
        if (arg0 != 101) {
            method773(-68, -100, 112, 100);
        }
        field1646 = null;
        field1654 = null;
        field1650 = null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILkh;)V", line = 81)
    public static final void method771(int arg0, int arg1, class13 arg2) {
        if (arg0 != -18) {
            return;
        }
        field1641++;
        while (true) {
            class117 var3 = (class117) class105.field1417.method970(12);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1527; var5++) {
                if (var3.field1522[var5] != null) {
                    if (var3.field1522[var5].field3149 == 2) {
                        var3.field1524[var5] = -5;
                    }
                    if (var3.field1522[var5].field3149 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1528[var5] != null) {
                    if (var3.field1528[var5].field3149 == 2) {
                        var3.field1524[var5] = -6;
                    }
                    if (var3.field1528[var5].field3149 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method74(arg1, (byte) 83);
            arg2.method2449((byte) 125, 0);
            int var6 = arg2.field5729;
            arg2.method2398(arg0 ^ 0x6E, var3.field1529);
            for (int var7 = 0; var7 < var3.field1527; var7++) {
                if (var3.field1524[var7] == 0) {
                    try {
                        int var8 = var3.field1525[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field1522[var7].field3151;
                            int var10 = var9.getInt(null);
                            arg2.method2449((byte) 127, 0);
                            arg2.method2398(118, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1522[var7].field3151;
                            var11.setInt(null, var3.field1523[var7]);
                            arg2.method2449((byte) 115, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field1522[var7].field3151;
                            int var13 = var12.getModifiers();
                            arg2.method2449((byte) 127, 0);
                            arg2.method2398(-74, var13);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field1528[var7].field3151;
                            byte[][] var17 = var3.field1531[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg2.method2449((byte) 123, 0);
                            } else if (var21 instanceof Number) {
                                arg2.method2449((byte) 118, 1);
                                arg2.method2422(((Number) var21).longValue(), 123);
                            } else if ((var21 instanceof String)) {
                                arg2.method2449((byte) 119, 2);
                                arg2.method2415((String) var21, 21742);
                            } else {
                                arg2.method2449((byte) 125, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1528[var7].field3151;
                            int var15 = var14.getModifiers();
                            arg2.method2449((byte) 118, 0);
                            arg2.method2398(-87, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method2449((byte) 116, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method2449((byte) 120, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method2449((byte) 126, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method2449((byte) 122, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method2449((byte) 115, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method2449((byte) 115, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method2449((byte) 123, -16);
                    } catch (SecurityException var29) {
                        arg2.method2449((byte) 126, -17);
                    } catch (IOException var30) {
                        arg2.method2449((byte) 122, -18);
                    } catch (NullPointerException var31) {
                        arg2.method2449((byte) 119, -19);
                    } catch (Exception var32) {
                        arg2.method2449((byte) 115, -20);
                    } catch (Throwable var33) {
                        arg2.method2449((byte) 116, -21);
                    }
                } else {
                    arg2.method2449((byte) 127, var3.field1524[var7]);
                }
            }
            arg2.method2416(false, var6);
            arg2.method2403(arg2.field5729 - var6, (byte) -22);
            var3.method2674(true);
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Lkv;", line = 273)
    public final class178 method772(int arg0) {
        if (arg0 != -1) {
            field1650 = null;
        }
        field1638++;
        return class468.method2859((byte) -115, this.field1647);
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(II)V", line = 288)
    public class127(int arg0, int arg1) {
        this.field1644 = arg1;
        this.field1647 = arg0;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lop;I)V", line = 299)
    public class127(class127 arg0, int arg1) {
        this.field1643 = arg0;
        this.field1647 = this.field1643.field1647;
        this.field1644 = this.field1643.field1644 + arg1;
        this.field1645 = this.field1643.field1645;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(IIII)I", line = 310)
    public static final int method773(int arg0, int arg1, int arg2, int arg3) {
        field1639++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else if (arg1 == 7) {
            return arg3;
        } else {
            return -13;
        }
    }
}
