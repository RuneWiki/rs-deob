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

@OriginalClass("client!mk")
public class class154 {

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Lgl;")
    public class338 field1942 = new class338();

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "[I")
    public static int[] field1945 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field1949 = 0;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Lgl;")
    private class338 field1950;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "[Ltn;")
    public static class108[] field1952;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Lgl;", line = 5)
    public final class338 method814(byte arg0) {
        field1940++;
        class338 var2 = this.field1942.field4505;
        if (this.field1942 == var2) {
            this.field1950 = null;
            return null;
        } else {
            this.field1950 = var2.field4505;
            return arg0 == 90 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lgl;", line = 25)
    public final class338 method815(int arg0) {
        field1935++;
        class338 var2 = this.field1942.field4505;
        if (this.field1942 == var2) {
            return null;
        } else {
            var2.method1967(-1);
            return arg0 == 12256 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)Lgl;", line = 52)
    public final class338 method816(byte arg0) {
        field1936++;
        int var2 = 14 % ((-arg0 - 51) / 62);
        class338 var3 = this.field1950;
        if (this.field1942 == var3) {
            this.field1950 = null;
            return null;
        } else {
            this.field1950 = var3.field4506;
            return var3;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 72)
    public static void method817(boolean arg0) {
        if (!arg0) {
            method824((byte) -93);
        }
        field1952 = null;
        field1945 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILea;B)V", line = 84)
    public static final void method818(int arg0, class57 arg1, byte arg2) {
        field1939++;
        if (arg2 > -49) {
            return;
        }
        while (true) {
            class444 var3 = (class444) class203.field2721.method814((byte) 90);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field6497; var5++) {
                if (var3.field6485[var5] != null) {
                    if (var3.field6485[var5].field4123 == 2) {
                        var3.field6493[var5] = -5;
                    }
                    if (var3.field6485[var5].field4123 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field6492[var5] != null) {
                    if (var3.field6492[var5].field4123 == 2) {
                        var3.field6493[var5] = -6;
                    }
                    if (var3.field6492[var5].field4123 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method295(20579, arg0);
            arg1.method1386(-222840624, 0);
            int var6 = arg1.field3389;
            arg1.method1357(var3.field6498, 1826838072);
            for (int var7 = 0; var7 < var3.field6497; var7++) {
                if (var3.field6493[var7] == 0) {
                    try {
                        int var8 = var3.field6483[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field6485[var7].field4126;
                            int var10 = var9.getInt((Object) null);
                            arg1.method1386(-222840624, 0);
                            arg1.method1357(var10, 1826838072);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field6485[var7].field4126;
                            var11.setInt((Object) null, var3.field6487[var7]);
                            arg1.method1386(-222840624, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field6485[var7].field4126;
                            int var13 = var12.getModifiers();
                            arg1.method1386(-222840624, 0);
                            arg1.method1357(var13, 1826838072);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field6492[var7].field4126;
                            byte[][] var15 = var3.field6488[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method1386(-222840624, 0);
                            } else if ((var19 instanceof Number)) {
                                arg1.method1386(-222840624, 1);
                                arg1.method1355(((Number) var19).longValue(), (byte) -29);
                            } else if (var19 instanceof String) {
                                arg1.method1386(-222840624, 2);
                                arg1.method1343((String) var19, 22608);
                            } else {
                                arg1.method1386(-222840624, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field6492[var7].field4126;
                            int var21 = var20.getModifiers();
                            arg1.method1386(-222840624, 0);
                            arg1.method1357(var21, 1826838072);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1386(-222840624, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method1386(-222840624, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1386(-222840624, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method1386(-222840624, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method1386(-222840624, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1386(-222840624, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method1386(-222840624, -16);
                    } catch (SecurityException var29) {
                        arg1.method1386(-222840624, -17);
                    } catch (IOException var30) {
                        arg1.method1386(-222840624, -18);
                    } catch (NullPointerException var31) {
                        arg1.method1386(-222840624, -19);
                    } catch (Exception var32) {
                        arg1.method1386(-222840624, -20);
                    } catch (Throwable var33) {
                        arg1.method1386(-222840624, -21);
                    }
                } else {
                    arg1.method1386(-222840624, var3.field6493[var7]);
                }
            }
            arg1.method1330(var6, 121);
            arg1.method1362(arg1.field3389 - var6, (byte) 108);
            var3.method1967(-1);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)I", line = 275)
    public final int method819(boolean arg0) {
        field1955++;
        if (arg0) {
            field1949 = -55;
        }
        int var2 = 0;
        class338 var3 = this.field1942.field4505;
        while (this.field1942 != var3) {
            var3 = var3.field4505;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lgl;B)V", line = 298)
    public final void method820(class338 arg0, byte arg1) {
        if (arg0.field4506 != null) {
            arg0.method1967(-1);
        }
        if (arg1 != 73) {
            return;
        }
        field1953++;
        arg0.field4506 = this.field1942;
        arg0.field4505 = this.field1942.field4505;
        arg0.field4506.field4505 = arg0;
        arg0.field4505.field4506 = arg0;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)Lgl;", line = 317)
    public final class338 method821(byte arg0) {
        field1938++;
        if (arg0 < 115) {
            this.method826((class154) null, 120);
        }
        class338 var2 = this.field1942.field4506;
        if (this.field1942 == var2) {
            this.field1950 = null;
            return null;
        } else {
            this.field1950 = var2.field4506;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 339)
    public static final void method822(int arg0) {
        int var1 = 0;
        int var2 = -58 / ((-arg0 - 68) / 35);
        while (var1 < class119.field1487) {
            int var10002 = class208.field2836[var1]--;
            if (class208.field2836[var1] >= -10) {
                label87: {
                    class93 var4 = class438.field6421[var1];
                    if (var4 == null) {
                        var4 = class93.method511(class321.field4297, class195.field2633[var1], 0);
                        if (var4 == null) {
                            break label87;
                        }
                        class208.field2836[var1] += var4.method510();
                        class438.field6421[var1] = var4;
                    }
                    if (class208.field2836[var1] < 0) {
                        label90: {
                            int var5;
                            if (class344.field4619[var1] == 0) {
                                var5 = class312.field4196[var1] * class63.field653 >> 8;
                            } else {
                                int var6 = (class344.field4619[var1] & 0xFF) * 128;
                                int var7 = class344.field4619[var1] >> 16 & 0xFF;
                                int var8 = var7 * 128 - (class427.field6264.field152 - 64);
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = (class344.field4619[var1] & 0xFF56) >> 8;
                                int var10 = var9 * 128 + 64 - class427.field6264.field154;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var11 > var6) {
                                    class208.field2836[var1] = -100;
                                    break label90;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var5 = class312.field4196[var1] * class295.field4002 * (var6 - var11) / var6 >> 8;
                            }
                            if (var5 > 0) {
                                class52 var12 = var4.method509().method250(class53.field541);
                                class336 var13 = class336.method1938(var12, 100, var5);
                                var13.method1943(class289.field3935[var1] - 1);
                                class374.field5265.method2210(var13);
                            }
                            class208.field2836[var1] = -100;
                        }
                    }
                }
            } else {
                class119.field1487--;
                for (int var3 = var1; var3 < class119.field1487; var3++) {
                    class195.field2633[var3] = class195.field2633[var3 + 1];
                    class438.field6421[var3] = class438.field6421[var3 + 1];
                    class289.field3935[var3] = class289.field3935[var3 + 1];
                    class208.field2836[var3] = class208.field2836[var3 + 1];
                    class344.field4619[var3] = class344.field4619[var3 + 1];
                    class312.field4196[var3] = class312.field4196[var3 + 1];
                }
                var1--;
            }
            var1++;
        }
        field1948++;
        if (class41.field431 && !class319.method1841(125)) {
            if (class160.field2062 != 0 && class200.field2668 != -1) {
                class319.method1840(14652, class283.field3875, class160.field2062, class200.field2668, false, 0);
            }
            class41.field431 = false;
        } else if (class160.field2062 != 0 && class200.field2668 != -1 && !class319.method1841(125)) {
            class281.field3857.method295(20579, 8);
            class210.field2859++;
            class281.field3857.method1357(class200.field2668, 1826838072);
            class200.field2668 = -1;
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)Z", line = 472)
    public final boolean method823(int arg0) {
        field1951++;
        if (arg0 < 124) {
            this.field1942 = null;
        }
        return this.field1942.field4505 == this.field1942;
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)J", line = 483)
    public static final long method824(byte arg0) {
        if (arg0 > -71) {
            return 127L;
        } else {
            field1954++;
            return class327.field4354.method139(true);
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 521)
    public class154() {
        this.field1942.field4506 = this.field1942;
        this.field1942.field4505 = this.field1942;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILgl;)V", line = 502)
    public final void method825(int arg0, class338 arg1) {
        if (arg1.field4506 != null) {
            arg1.method1967(-1);
        }
        field1937++;
        arg1.field4505 = this.field1942;
        arg1.field4506 = this.field1942.field4506;
        arg1.field4506.field4505 = arg1;
        int var3 = -34 / ((arg0 - 3) / 49);
        arg1.field4505.field4506 = arg1;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lmk;I)V", line = 530)
    public final void method826(class154 arg0, int arg1) {
        this.method828((byte) 116, this.field1942.field4505, arg0);
        field1956++;
        if (arg1 != -14) {
            field1952 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)Lgl;", line = 552)
    public final class338 method827(int arg0) {
        int var2 = 7 / ((arg0 + 90) / 36);
        field1941++;
        class338 var3 = this.field1950;
        if (this.field1942 == var3) {
            this.field1950 = null;
            return null;
        } else {
            this.field1950 = var3.field4505;
            return var3;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLgl;Lmk;)V", line = 580)
    private final void method828(byte arg0, class338 arg1, class154 arg2) {
        field1943++;
        class338 var4 = this.field1942.field4506;
        this.field1942.field4506 = arg1.field4506;
        arg1.field4506.field4505 = this.field1942;
        if (arg0 <= 51) {
            this.method816((byte) -101);
        }
        if (this.field1942 != arg1) {
            arg1.field4506 = arg2.field1942.field4506;
            arg1.field4506.field4505 = arg1;
            arg2.field1942.field4506 = var4;
            var4.field4505 = arg2.field1942;
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(Z)V", line = 607)
    public final void method829(boolean arg0) {
        field1944++;
        if (arg0) {
            field1949 = -9;
        }
        while (true) {
            class338 var2 = this.field1942.field4505;
            if (this.field1942 == var2) {
                this.field1950 = null;
                return;
            }
            var2.method1967(-1);
        }
    }
}
