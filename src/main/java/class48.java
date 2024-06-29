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

@OriginalClass("client!hh")
public class class48 {

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    private int field743 = 0;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    private int field748 = 0;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    private int field745 = 0;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    private int field749 = 128;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    private int field752 = 128;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public int field753 = -1;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "Z")
    public boolean field754 = false;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[Z")
    public static boolean[] field736 = new boolean[100];

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field738 = 0;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[I")
    public static int[] field741 = new int[128];

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "[I")
    public static int[] field755;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "[S")
    private short[] field737;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "[S")
    private short[] field742;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[S")
    private short[] field747;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "[S")
    private short[] field751;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lii;BI)V", line = 9)
    private final void method356(class221 arg0, byte arg1, int arg2) {
        if (arg1 != -122) {
            method359(-5, (class210) null, 61);
        }
        field750++;
        if (arg2 == 1) {
            this.field746 = arg0.method1524((byte) 117);
        } else if (arg2 == 2) {
            this.field753 = arg0.method1524((byte) 106);
        } else if (arg2 == 4) {
            this.field749 = arg0.method1524((byte) 107);
        } else if (arg2 == 5) {
            this.field752 = arg0.method1524((byte) 109);
        } else if (arg2 == 6) {
            this.field748 = arg0.method1524((byte) 70);
        } else if (arg2 == 7) {
            this.field743 = arg0.method1509(true);
        } else if (arg2 == 8) {
            this.field745 = arg0.method1509(true);
        } else if (arg2 == 9) {
            this.field754 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method1509(true);
            this.field742 = new short[var4];
            this.field747 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field747[var5] = (short) arg0.method1524((byte) 69);
                this.field742[var5] = (short) arg0.method1524((byte) 58);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method1509(true);
            this.field751 = new short[var6];
            this.field737 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field751[var7] = (short) arg0.method1524((byte) 114);
                this.field737[var7] = (short) arg0.method1524((byte) 63);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILii;)V", line = 98)
    public final void method357(int arg0, class221 arg1) {
        field744++;
        int var3 = -63 % ((-arg0 - 2) / 52);
        while (true) {
            int var4 = arg1.method1509(true);
            if (var4 == 0) {
                return;
            }
            this.method356(arg1, (byte) -122, var4);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 125)
    public static void method358(byte arg0) {
        field741 = null;
        if (arg0 != -73) {
            method361(false, true, (byte[]) null);
        }
        field736 = null;
        field755 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILrc;I)V", line = 137)
    public static final void method359(int arg0, class210 arg1, int arg2) {
        field757++;
        if (arg0 != 4) {
            field741 = (int[]) null;
        }
        while (true) {
            class151 var3 = (class151) class113.field1686.method1475(arg0 ^ 0xA);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2195; var5++) {
                if (var3.field2202[var5] != null) {
                    if (var3.field2202[var5].field497 == 2) {
                        var3.field2186[var5] = -5;
                    }
                    if (var3.field2202[var5].field497 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2185[var5] != null) {
                    if (var3.field2185[var5].field497 == 2) {
                        var3.field2186[var5] = -6;
                    }
                    if (var3.field2185[var5].field497 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1389((byte) -20, arg2);
            arg1.method1542(-78, 0);
            int var6 = arg1.field3610;
            arg1.method1513(var3.field2194, false);
            for (int var7 = 0; var7 < var3.field2195; var7++) {
                if (var3.field2186[var7] == 0) {
                    try {
                        int var8 = var3.field2196[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2202[var7].field496;
                            int var10 = var9.getInt((Object) null);
                            arg1.method1542(-80, 0);
                            arg1.method1513(var10, false);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2202[var7].field496;
                            var11.setInt((Object) null, var3.field2197[var7]);
                            arg1.method1542(-117, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field2202[var7].field496;
                            int var13 = var12.getModifiers();
                            arg1.method1542(-127, 0);
                            arg1.method1513(var13, false);
                        }
                        if (var8 == 3) {
                            byte[][] var14 = var3.field2188[var7];
                            Method var15 = (Method) var3.field2185[var7].field496;
                            Object[] var16 = new Object[var14.length];
                            for (int var17 = 0; var17 < var14.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var14[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var15.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method1542(arg0 - 103, 0);
                            } else if ((var19 instanceof Number)) {
                                arg1.method1542(-122, 1);
                                arg1.method1548(false, ((Number) var19).longValue());
                            } else if (var19 instanceof class5) {
                                arg1.method1542(-108, 2);
                                arg1.method1522((class5) var19, (byte) -96);
                            } else {
                                arg1.method1542(-127, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2185[var7].field496;
                            int var21 = var20.getModifiers();
                            arg1.method1542(-77, 0);
                            arg1.method1513(var21, false);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg1.method1542(-72, -10);
                    } catch (InvalidClassException var35) {
                        arg1.method1542(-104, -11);
                    } catch (StreamCorruptedException var36) {
                        arg1.method1542(arg0 - 73, -12);
                    } catch (OptionalDataException var37) {
                        arg1.method1542(-80, -13);
                    } catch (IllegalAccessException var38) {
                        arg1.method1542(-109, -14);
                    } catch (IllegalArgumentException var39) {
                        arg1.method1542(-98, -15);
                    } catch (InvocationTargetException var40) {
                        arg1.method1542(-119, -16);
                    } catch (SecurityException var41) {
                        arg1.method1542(-92, -17);
                    } catch (IOException var42) {
                        arg1.method1542(-120, -18);
                    } catch (NullPointerException var43) {
                        arg1.method1542(-68, -19);
                    } catch (Exception var44) {
                        arg1.method1542(arg0 ^ 0xFFFFFFBA, -20);
                    } catch (Throwable var45) {
                        arg1.method1542(-111, -21);
                    }
                } else {
                    arg1.method1542(-121, var3.field2186[var7]);
                }
            }
            arg1.method1516(var6, arg0 + 1167156364);
            arg1.method1546(arg1.field3610 - var6, -13204);
            var3.method1997(arg0 ^ 0xFFFF950F);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)Lkl;", line = 370)
    public final class34 method360(int arg0, byte arg1) {
        field758++;
        class34 var3 = (class34) class166.field2528.method521((long) this.field740, (byte) 80);
        if (var3 == null) {
            class183 var4 = class183.method1202(class169.field2597, this.field746, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field747 != null) {
                for (int var5 = 0; var5 < this.field747.length; var5++) {
                    var4.method1203(this.field747[var5], this.field742[var5]);
                }
            }
            if (this.field751 != null) {
                for (int var6 = 0; var6 < this.field751.length; var6++) {
                    var4.method1195(this.field751[var6], this.field737[var6]);
                }
            }
            var3 = var4.method1198(this.field743 + 64, this.field745 + 850, -30, -50, -30);
            class166.field2528.method519((byte) -95, var3, (long) this.field740);
        }
        if (arg1 != 61) {
            return (class34) null;
        }
        class34 var7;
        if (this.field753 == -1 || arg0 == -1) {
            var7 = var3.method241(true, true);
        } else {
            var7 = class171.method1136(this.field753, -6722).method225((byte) 103, arg0, var3);
        }
        if (this.field749 != 128 || this.field752 != 128) {
            var7.method251(this.field749, this.field752, this.field749);
        }
        if (this.field748 != 0) {
            if (this.field748 == 90) {
                var7.method234();
            }
            if (this.field748 == 180) {
                var7.method240();
            }
            if (this.field748 == 270) {
                var7.method230();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZ[B)Ljava/lang/Object;", line = 443)
    public static final Object method361(boolean arg0, boolean arg1, byte[] arg2) {
        if (arg1) {
            method358((byte) 8);
        }
        field756++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class179.field2720) {
            try {
                class243 var3 = (class243) Class.forName("ga").getDeclaredConstructor().newInstance();
                var3.method1024(arg2, (byte) 108);
                return var3;
            } catch (Throwable var5) {
                class179.field2720 = true;
            }
        }
        return arg0 ? class13.method128(arg2, -22046) : arg2;
    }
}
