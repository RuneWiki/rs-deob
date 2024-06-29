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

@OriginalClass("client!ii")
public class class256 {

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Lc;")
    private class106 field4069 = new class106();

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "Lc;")
    private class106 field4072 = new class106();

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Lc;")
    private class106 field4077 = new class106();

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "Lc;")
    private class106 field4081 = new class106();

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "Log;")
    private class221 field4084 = new class221(4);

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public volatile int field4092 = 0;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "B")
    private byte field4089 = 0;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public volatile int field4090 = 0;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "Log;")
    private class221 field4091 = new class221(8);

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "[I")
    public static int[] field4075 = new int[5];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    private int field4086;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "J")
    private long field4088;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "Lk;")
    private class179 field4093;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "Lwf;")
    private class1 field4085;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lqh;")
    public static class201 field4066;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method1740(int arg0) {
        field4066 = null;
        if (arg0 < 3) {
            method1740(100);
        }
        field4075 = null;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public final void method1741(int arg0) {
        field4087++;
        if (this.field4085 != null) {
            this.field4085.method7((byte) 18);
        }
        if (arg0 != -101) {
            this.field4088 = -97L;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)Z")
    public final boolean method1742(byte arg0) {
        field4076++;
        if (this.field4085 != null) {
            long var2 = class276.method1861((byte) 122);
            int var4 = (int) (var2 - this.field4088);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4088 = var2;
            this.field4086 += var4;
            if (this.field4086 > 30000) {
                try {
                    this.field4085.method7((byte) 18);
                } catch (Exception var27) {
                }
                this.field4085 = null;
            }
        }
        if (this.field4085 == null) {
            return this.method1752(0) == 0 && this.method1750(arg0 - 192) == 0;
        }
        try {
            this.field4085.method11((byte) -21);
            for (class179 var5 = (class179) this.field4069.method766((byte) -127); var5 != null; var5 = (class179) this.field4069.method764((byte) -82)) {
                this.field4084.field3655 = 0;
                this.field4084.method1548(-494964184, 1);
                this.field4084.method1524((int) var5.field48, (byte) 90);
                this.field4085.method2(0, this.field4084.field3653, -101, 4);
                this.field4072.method774(arg0 ^ 0x69, var5);
            }
            for (class179 var6 = (class179) this.field4077.method766((byte) -127); var6 != null; var6 = (class179) this.field4077.method764((byte) -82)) {
                this.field4084.field3655 = 0;
                this.field4084.method1548(-494964184, 0);
                this.field4084.method1524((int) var6.field48, (byte) 90);
                this.field4085.method2(0, this.field4084.field3653, -116, 4);
                this.field4081.method774(0, var6);
            }
            if (arg0 != 105) {
                return false;
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4085.method6(-18);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4086 = 0;
                byte var9 = 0;
                if (this.field4093 == null) {
                    var9 = 8;
                } else if (this.field4093.field2816 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = 512 - this.field4093.field2816;
                    int var11 = this.field4093.field2818.field3653.length - this.field4093.field2817;
                    if ((var11 - this.field4093.field2818.field3655) < var10) {
                        var10 = var11 - this.field4093.field2818.field3655;
                    }
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field4085.method4(var10, (byte) 113, this.field4093.field2818.field3655, this.field4093.field2818.field3653);
                    if (this.field4089 != 0) {
                        for (int var12 = 0; var12 < var10; var12++) {
                            this.field4093.field2818.field3653[this.field4093.field2818.field3655 + var12] = (byte) class91.method687(this.field4093.field2818.field3653[this.field4093.field2818.field3655 + var12], this.field4089);
                        }
                    }
                    this.field4093.field2818.field3655 += var10;
                    this.field4093.field2816 += var10;
                    if (this.field4093.field2818.field3655 == var11) {
                        this.field4093.method40(0);
                        this.field4093.field2781 = false;
                        this.field4093 = null;
                    } else if (this.field4093.field2816 == 512) {
                        this.field4093.field2816 = 0;
                    }
                } else {
                    int var13 = var9 - this.field4091.field3655;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field4085.method4(var13, (byte) -63, this.field4091.field3655, this.field4091.field3653);
                    if (this.field4089 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field4091.field3653[this.field4091.field3655 + var14] = (byte) class91.method687(this.field4091.field3653[this.field4091.field3655 + var14], this.field4089);
                        }
                    }
                    this.field4091.field3655 += var13;
                    if (var9 <= this.field4091.field3655) {
                        if (this.field4093 == null) {
                            this.field4091.field3655 = 0;
                            int var15 = this.field4091.method1517((byte) -96);
                            Object var16 = null;
                            int var17 = this.field4091.method1521((byte) 113);
                            long var18 = (long) ((var15 << 16) + var17);
                            int var20 = this.field4091.method1517((byte) -96);
                            int var21 = var20 & 0x7F;
                            boolean var22 = (var20 & 0x80) != 0;
                            int var23 = this.field4091.method1526(arg0 - 16777321);
                            class179 var24;
                            if (var22) {
                                for (var24 = (class179) this.field4081.method766((byte) -127); var24 != null && var24.field48 != var18; var24 = (class179) this.field4081.method764((byte) -82)) {
                                }
                            } else {
                                for (var24 = (class179) this.field4072.method766((byte) -127); var24 != null && var24.field48 != var18; var24 = (class179) this.field4072.method764((byte) -82)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field4093 = var24;
                            int var25 = var21 == 0 ? 5 : 9;
                            this.field4093.field2818 = new class221(var23 + var25 + this.field4093.field2817);
                            this.field4093.field2818.method1548(-494964184, var21);
                            this.field4093.field2818.method1529((byte) 117, var23);
                            this.field4091.field3655 = 0;
                            this.field4093.field2816 = 8;
                        } else if (this.field4093.field2816 != 0) {
                            throw new IOException();
                        } else if (this.field4091.field3653[0] == -1) {
                            this.field4093.field2816 = 1;
                            this.field4091.field3655 = 0;
                        } else {
                            this.field4093 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4085.method7((byte) 18);
            } catch (Exception var26) {
            }
            this.field4092++;
            this.field4090 = -2;
            this.field4085 = null;
            return this.method1752(0) == 0 && this.method1750(103) == 0;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZB)V")
    public final void method1743(boolean arg0, byte arg1) {
        field4080++;
        if (this.field4085 == null) {
            return;
        }
        try {
            if (arg1 < -16) {
                this.field4084.field3655 = 0;
                this.field4084.method1548(-494964184, arg0 ? 2 : 3);
                this.field4084.method1524(0, (byte) 90);
                this.field4085.method2(0, this.field4084.field3653, -128, 4);
            }
        } catch (IOException var4) {
            try {
                this.field4085.method7((byte) 18);
            } catch (Exception var3) {
            }
            this.field4092++;
            this.field4085 = null;
            this.field4090 = -2;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
    public final void method1744(byte arg0) {
        if (this.field4085 != null) {
            this.field4085.method8(-6);
        }
        field4063++;
        if (arg0 > -7) {
            this.field4089 = 21;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)Z")
    public final boolean method1745(int arg0) {
        if (arg0 <= 0) {
            return true;
        } else {
            field4065++;
            return this.method1750(-95) >= 20;
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
    private final void method1746(int arg0) {
        field4079++;
        if (this.field4085 == null || arg0 != -13502) {
            return;
        }
        try {
            this.field4084.field3655 = 0;
            this.field4084.method1548(arg0 - 494950682, 6);
            this.field4084.method1524(3, (byte) 90);
            this.field4085.method2(0, this.field4084.field3653, -122, 4);
        } catch (IOException var3) {
            try {
                this.field4085.method7((byte) 18);
            } catch (Exception var2) {
            }
            this.field4085 = null;
            this.field4092++;
            this.field4090 = -2;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BILng;)V")
    public static final void method1747(byte arg0, int arg1, class76 arg2) {
        if (arg0 > -73) {
            field4071 = 90;
        }
        field4073++;
        while (true) {
            class161 var3 = (class161) class39.field726.method843(124);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2564; var5++) {
                if (var3.field2571[var5] != null) {
                    if (var3.field2571[var5].field2589 == 2) {
                        var3.field2566[var5] = -5;
                    }
                    if (var3.field2571[var5].field2589 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2567[var5] != null) {
                    if (var3.field2567[var5].field2589 == 2) {
                        var3.field2566[var5] = -6;
                    }
                    if (var3.field2567[var5].field2589 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method534((byte) 113, arg1);
            arg2.method1548(-494964184, 0);
            int var6 = arg2.field3655;
            arg2.method1529((byte) 124, var3.field2573);
            for (int var7 = 0; var7 < var3.field2564; var7++) {
                if (var3.field2566[var7] == 0) {
                    try {
                        int var8 = var3.field2565[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2571[var7].field2594;
                            int var13 = var12.getInt((Object) null);
                            arg2.method1548(-494964184, 0);
                            arg2.method1529((byte) 127, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2571[var7].field2594;
                            var11.setInt((Object) null, var3.field2570[var7]);
                            arg2.method1548(-494964184, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field2571[var7].field2594;
                            int var10 = var9.getModifiers();
                            arg2.method1548(-494964184, 0);
                            arg2.method1529((byte) 126, var10);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2567[var7].field2594;
                            byte[][] var17 = var3.field2560[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method1548(-494964184, 0);
                            } else if (var21 instanceof Number) {
                                arg2.method1548(-494964184, 1);
                                arg2.method1502((byte) -21, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg2.method1548(-494964184, 2);
                                arg2.method1563((String) var21, 107);
                            } else {
                                arg2.method1548(-494964184, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2567[var7].field2594;
                            int var15 = var14.getModifiers();
                            arg2.method1548(-494964184, 0);
                            arg2.method1529((byte) 120, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1548(-494964184, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method1548(-494964184, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1548(-494964184, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method1548(-494964184, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method1548(-494964184, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1548(-494964184, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method1548(-494964184, -16);
                    } catch (SecurityException var29) {
                        arg2.method1548(-494964184, -17);
                    } catch (IOException var30) {
                        arg2.method1548(-494964184, -18);
                    } catch (NullPointerException var31) {
                        arg2.method1548(-494964184, -19);
                    } catch (Exception var32) {
                        arg2.method1548(-494964184, -20);
                    } catch (Throwable var33) {
                        arg2.method1548(-494964184, -21);
                    }
                } else {
                    arg2.method1548(-494964184, var3.field2566[var7]);
                }
            }
            arg2.method1556(false, var6);
            arg2.method1509((byte) -48, arg2.field3655 - var6);
            var3.method1388(-112);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public final void method1748(boolean arg0) {
        field4083++;
        if (this.field4085 == null) {
            return;
        }
        try {
            this.field4084.field3655 = 0;
            this.field4084.method1548(-494964184, 7);
            this.field4084.method1524(0, (byte) 90);
            if (arg0) {
                this.method1749((class1) null, true, (byte) -8);
            }
            this.field4085.method2(0, this.field4084.field3653, -110, 4);
        } catch (IOException var3) {
            try {
                this.field4085.method7((byte) 18);
            } catch (Exception var2) {
            }
            this.field4090 = -2;
            this.field4092++;
            this.field4085 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lwf;ZB)V")
    public final void method1749(class1 arg0, boolean arg1, byte arg2) {
        if (arg2 != -111) {
            this.method1746(-30);
        }
        field4064++;
        if (this.field4085 != null) {
            try {
                this.field4085.method7((byte) 18);
            } catch (Exception var8) {
            }
            this.field4085 = null;
        }
        this.field4085 = arg0;
        this.method1746(-13502);
        this.method1743(arg1, (byte) -76);
        this.field4093 = null;
        this.field4091.field3655 = 0;
        while (true) {
            class179 var4 = (class179) this.field4072.method771(-76);
            if (var4 == null) {
                while (true) {
                    class179 var5 = (class179) this.field4081.method771(-89);
                    if (var5 == null) {
                        if (this.field4089 != 0) {
                            try {
                                this.field4084.field3655 = 0;
                                this.field4084.method1548(-494964184, 4);
                                this.field4084.method1548(-494964184, this.field4089);
                                this.field4084.method1554(0, (byte) 89);
                                this.field4085.method2(0, this.field4084.field3653, -109, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field4085.method7((byte) 18);
                                } catch (Exception var6) {
                                }
                                this.field4085 = null;
                                this.field4092++;
                                this.field4090 = -2;
                            }
                        }
                        this.field4086 = 0;
                        this.field4088 = class276.method1861((byte) 122);
                        return;
                    }
                    this.field4077.method774(0, var5);
                }
            }
            this.field4069.method774(0, var4);
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)I")
    private final int method1750(int arg0) {
        field4078++;
        int var2 = 22 % ((arg0 + 16) / 56);
        return this.field4077.method769(93) + this.field4081.method769(86);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBIZI)Lk;")
    public final class179 method1751(int arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field4082++;
        long var6 = (long) ((arg0 << 16) + arg4);
        class179 var8 = new class179();
        var8.field48 = var6;
        var8.field2817 = arg1;
        var8.field2778 = arg3;
        if (arg3) {
            if (this.method1752(0) >= 20) {
                throw new RuntimeException();
            }
            this.field4069.method774(0, var8);
        } else if (this.method1750(-127) < 20) {
            this.field4077.method774(0, var8);
        } else {
            throw new RuntimeException();
        }
        int var9 = 123 / ((-arg2 - 54) / 53);
        return var8;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)I")
    public final int method1752(int arg0) {
        if (arg0 != 0) {
            method1740(96);
        }
        field4074++;
        return this.field4069.method769(108) + this.field4072.method769(80);
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
    public final void method1753(int arg0) {
        if (arg0 != 0) {
            this.field4093 = null;
        }
        try {
            this.field4085.method7((byte) 18);
        } catch (Exception var2) {
        }
        this.field4090 = -1;
        this.field4089 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        field4068++;
        this.field4092++;
        this.field4085 = null;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)Z")
    public final boolean method1754(byte arg0) {
        if (arg0 != -42) {
            this.field4072 = null;
        }
        field4067++;
        return this.method1752(0) >= 20;
    }
}
