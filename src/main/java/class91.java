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

@OriginalClass("client!ka")
public class class91 implements class168 {

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    private int field1905 = 50;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    private int field1916 = 128;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Lah;")
    private class9 field1909;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lah;")
    private class9 field1906;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Lpa;")
    private class136 field1915;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Leh;")
    public static class47 field1912 = class195.method1282((byte) -4, "p11_full");

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field1914 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lfd;")
    public static class52 field1908;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "Lah;")
    public static class9 field1918;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILib;B)V")
    public static final void method728(int arg0, class75 arg1, byte arg2) {
        int var3 = 87 / ((arg2 - 59) / 58);
        field1917++;
        while (true) {
            class81 var4 = (class81) class51.field996.method345(-118);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field1749; var6++) {
                if (var4.field1755[var6] != null) {
                    if (var4.field1755[var6].field2543 == 2) {
                        var4.field1742[var6] = -5;
                    }
                    if (var4.field1755[var6].field2543 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field1754[var6] != null) {
                    if (var4.field1754[var6].field2543 == 2) {
                        var4.field1742[var6] = -6;
                    }
                    if (var4.field1754[var6].field2543 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg1.method657(28182, arg0);
            arg1.method609(0, (byte) -100);
            int var7 = arg1.field1454;
            arg1.method606(var4.field1737, -1424429928);
            for (int var8 = 0; var8 < var4.field1749; var8++) {
                if (var4.field1742[var8] == 0) {
                    try {
                        int var9 = var4.field1740[var8];
                        if (var9 == 0) {
                            Field var10 = (Field) var4.field1755[var8].field2548;
                            int var11 = var10.getInt(null);
                            arg1.method609(0, (byte) -108);
                            arg1.method606(var11, -1424429928);
                        } else if (var9 == 1) {
                            Field var14 = (Field) var4.field1755[var8].field2548;
                            var14.setInt(null, var4.field1743[var8]);
                            arg1.method609(0, (byte) -105);
                        } else if (var9 == 2) {
                            Field var12 = (Field) var4.field1755[var8].field2548;
                            int var13 = var12.getModifiers();
                            arg1.method609(0, (byte) -126);
                            arg1.method606(var13, -1424429928);
                        }
                        if (var9 == 3) {
                            byte[][] var17 = var4.field1736[var8];
                            Method var18 = (Method) var4.field1754[var8].field2548;
                            Object[] var19 = new Object[var17.length];
                            for (int var20 = 0; var20 < var17.length; var20++) {
                                ObjectInputStream var21 = new ObjectInputStream(new ByteArrayInputStream(var17[var20]));
                                var19[var20] = var21.readObject();
                            }
                            Object var22 = var18.invoke(null, var19);
                            if (var22 == null) {
                                arg1.method609(0, (byte) -116);
                            } else if (var22 instanceof Number) {
                                arg1.method609(1, (byte) -119);
                                arg1.method600(32601, ((Number) var22).longValue());
                            } else if (var22 instanceof class47) {
                                arg1.method609(2, (byte) -127);
                                arg1.method597((class47) var22, (byte) -106);
                            } else {
                                arg1.method609(4, (byte) -128);
                            }
                        } else if (var9 == 4) {
                            Method var15 = (Method) var4.field1754[var8].field2548;
                            int var16 = var15.getModifiers();
                            arg1.method609(0, (byte) -125);
                            arg1.method606(var16, -1424429928);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg1.method609(-10, (byte) -103);
                    } catch (InvalidClassException var24) {
                        arg1.method609(-11, (byte) -114);
                    } catch (StreamCorruptedException var25) {
                        arg1.method609(-12, (byte) -103);
                    } catch (OptionalDataException var26) {
                        arg1.method609(-13, (byte) -104);
                    } catch (IllegalAccessException var27) {
                        arg1.method609(-14, (byte) -121);
                    } catch (IllegalArgumentException var28) {
                        arg1.method609(-15, (byte) -126);
                    } catch (InvocationTargetException var29) {
                        arg1.method609(-16, (byte) -109);
                    } catch (SecurityException var30) {
                        arg1.method609(-17, (byte) -100);
                    } catch (IOException var31) {
                        arg1.method609(-18, (byte) -121);
                    } catch (NullPointerException var32) {
                        arg1.method609(-19, (byte) -123);
                    } catch (Exception var33) {
                        arg1.method609(-20, (byte) -120);
                    } catch (Throwable var34) {
                        arg1.method609(-21, (byte) -112);
                    }
                } else {
                    arg1.method609(var4.field1742[var8], (byte) -98);
                }
            }
            arg1.method607(var7, 73);
            arg1.method581(-1, arg1.field1454 - var7);
            var4.method885(3);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IZ)Z")
    public final boolean method729(int arg0, boolean arg1) {
        field1904++;
        if (arg1) {
            return this.field1916 == 64 || this.method737(0, arg0).field2611 == 64;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)Z")
    public final boolean method730(boolean arg0, int arg1) {
        field1919++;
        if (!arg0) {
            this.field1905 = 41;
        }
        return this.method737(0, arg1).field2631;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)I")
    public final int method731(int arg0, byte arg1) {
        if (arg1 == 60) {
            field1911++;
            return this.method737(0, arg0).field2634;
        } else {
            return 80;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)[I")
    public final int[] method732(int arg0, boolean arg1) {
        field1907++;
        class68 var3 = new class68(this.field1906.method67(0, -1, arg0));
        if (arg1) {
            class133 var4 = new class133(var3);
            return var4.method974(this, this.field1916, this.field1909, (byte) -91);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method733(int arg0) {
        field1908 = null;
        if (arg0 == 322) {
            field1912 = null;
            field1918 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIF)[I")
    public final int[] method734(int arg0, int arg1, float arg2) {
        class133 var4 = this.method737(arg1 ^ arg1, arg0);
        field1903++;
        var4.field2644 = true;
        return var4.method978(arg2, this, 1, this.field1916, this.field1909);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)Z")
    public final boolean method735(int arg0, int arg1) {
        field1900++;
        return arg0 == -18527 ? this.method737(0, arg1).method976(this.field1909, arg0 ^ 0xFFFFB7F4, this) : true;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public final void method736(int arg0) {
        this.field1915 = new class136(this.field1905);
        field1910++;
        if (arg0 != -16) {
            field1908 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)Log;")
    private final class133 method737(int arg0, int arg1) {
        field1901++;
        if (arg0 != 0) {
            return null;
        }
        class133 var3 = (class133) this.field1915.method986((byte) 50, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1906.method67(0, -1, arg1);
        if (var4 == null) {
            return class144.method1028(20481);
        } else {
            class68 var5 = new class68(var4);
            class133 var6 = new class133(var5);
            this.field1915.method987((long) arg1, var6, 28842);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(II)V")
    public final void method738(int arg0, int arg1) {
        field1902++;
        for (class133 var3 = (class133) this.field1915.method992(arg1); var3 != null; var3 = (class133) this.field1915.method991(16446)) {
            if (var3.field2644) {
                var3.method979(arg1 ^ 0x7C, arg0);
                var3.field2644 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Z")
    public final boolean method739(int arg0, int arg1) {
        field1913++;
        if (arg1 != -1193) {
            field1912 = null;
        }
        return this.method737(0, arg0).field2622;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lah;Lah;II)V")
    public class91(class9 arg0, class9 arg1, int arg2, int arg3) {
        this.field1905 = arg2;
        this.field1909 = arg1;
        this.field1916 = arg3;
        this.field1906 = arg0;
        this.field1915 = new class136(this.field1905);
    }
}
