import java.awt.Component;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ci")
public class class30 extends class95 {

    @OriginalMember(owner = "ci", name = "ab", descriptor = "I")
    private int field636 = 0;

    @OriginalMember(owner = "ci", name = "rb", descriptor = "Z")
    public boolean field653 = false;

    @OriginalMember(owner = "ci", name = "vb", descriptor = "I")
    private int field657 = 0;

    @OriginalMember(owner = "ci", name = "mb", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "ci", name = "pb", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "ci", name = "sb", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "ci", name = "gb", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "ci", name = "wb", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "ci", name = "ob", descriptor = "I")
    private int field650;

    @OriginalMember(owner = "ci", name = "lb", descriptor = "Lbi;")
    private class20 field647;

    @OriginalMember(owner = "ci", name = "db", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field639 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "ci", name = "jb", descriptor = "Llf;")
    public static class109 field645 = class35.method275("leuchten2:", 2);

    @OriginalMember(owner = "ci", name = "hb", descriptor = "Llf;")
    public static class109 field643 = class35.method275("event_opbase", 2);

    @OriginalMember(owner = "ci", name = "qb", descriptor = "Llf;")
    public static class109 field652 = class35.method275("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 2);

    @OriginalMember(owner = "ci", name = "tb", descriptor = "I")
    public static int field655 = 0;

    @OriginalMember(owner = "ci", name = "nb", descriptor = "Llf;")
    public static class109 field649 = class35.method275("scrollen:", 2);

    @OriginalMember(owner = "ci", name = "xb", descriptor = "[I")
    public static int[] field659 = new int[128];

    @OriginalMember(owner = "ci", name = "bb", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "ci", name = "cb", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "ci", name = "eb", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "ci", name = "fb", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "ci", name = "ib", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "ci", name = "kb", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "ci", name = "ub", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "ci", name = "c", descriptor = "(I)V")
    public static void method240(int arg0) {
        if (arg0 >= -64) {
            return;
        }
        field659 = null;
        field645 = null;
        field639 = null;
        field643 = null;
        field649 = null;
        field652 = null;
    }

    @OriginalMember(owner = "ci", name = "b", descriptor = "(I)Lue;")
    public final class189 method177(int arg0) {
        field638++;
        int var2 = -3 % ((arg0 - 61) / 46);
        class111 var3 = class193.method1297(this.field650, -18753);
        class189 var4;
        if (this.field653) {
            var4 = var3.method822(-1, 117);
        } else {
            var4 = var3.method822(this.field657, 125);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "ci", name = "a", descriptor = "(Ljava/awt/Component;Lke;BII)Lah;")
    public static final class9 method241(Component arg0, class99 arg1, byte arg2, int arg3, int arg4) {
        field646++;
        if (class23.field519 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class9 var5 = (class9) Class.forName("jd").getDeclaredConstructor().newInstance();
                var5.field136 = new int[(class169.field3133 ? 2 : 1) * 256];
                var5.field151 = arg4;
                var5.method54(arg0);
                var5.field154 = (arg4 & -1024) + 1024;
                if (var5.field154 > 16384) {
                    var5.field154 = 16384;
                }
                var5.method42(var5.field154);
                if (class54.field1085 > 0 && class200.field3955 == null) {
                    class200.field3955 = new class69();
                    class200.field3955.field1336 = arg1;
                    arg1.method694(class200.field3955, class54.field1085, (byte) 46);
                }
                if (class200.field3955 != null) {
                    if (class200.field3955.field1346[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class200.field3955.field1346[arg3] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class119 var6 = new class119(arg1, arg3);
                    int var7 = -49 / ((9 - arg2) / 40);
                    var6.field136 = new int[(class169.field3133 ? 2 : 1) * 256];
                    var6.field151 = arg4;
                    var6.method54(arg0);
                    var6.field154 = 16384;
                    var6.method42(var6.field154);
                    if (class54.field1085 > 0 && class200.field3955 == null) {
                        class200.field3955 = new class69();
                        class200.field3955.field1336 = arg1;
                        arg1.method694(class200.field3955, class54.field1085, (byte) 46);
                    }
                    if (class200.field3955 != null) {
                        if (class200.field3955.field1346[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class200.field3955.field1346[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class9();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "ci", name = "a", descriptor = "(IB)V")
    public final void method242(int arg0, byte arg1) {
        if (arg1 > -57) {
            method240(-64);
        }
        field637++;
        if (this.field653) {
            return;
        }
        this.field636 += arg0;
        while (this.field647.field442[this.field657] < this.field636) {
            this.field636 -= this.field647.field442[this.field657];
            this.field657++;
            if (this.field647.field440.length <= this.field657) {
                this.field653 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "ci", name = "a", descriptor = "(II)I")
    public static final int method243(int arg0, int arg1) {
        int var2 = -12 / ((-arg0 - 80) / 39);
        field640++;
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "ci", name = "a", descriptor = "(IBLwa;)V")
    public static final void method244(int arg0, byte arg1, class203 arg2) {
        field641++;
        if (arg1 <= 9) {
            return;
        }
        while (true) {
            class192 var3 = (class192) class206.field4048.method1230(50);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3673; var5++) {
                if (var3.field3664[var5] != null) {
                    if (var3.field3664[var5].field746 == 2) {
                        var3.field3667[var5] = -5;
                    }
                    if (var3.field3664[var5].field746 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3666[var5] != null) {
                    if (var3.field3666[var5].field746 == 2) {
                        var3.field3667[var5] = -6;
                    }
                    if (var3.field3666[var5].field746 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method1339((byte) 104, arg0);
            arg2.method568(-13488, 0);
            int var6 = arg2.field1773;
            arg2.method588((byte) 104, var3.field3671);
            for (int var7 = 0; var7 < var3.field3673; var7++) {
                if (var3.field3667[var7] == 0) {
                    try {
                        int var8 = var3.field3677[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3664[var7].field748;
                            int var13 = var12.getInt(null);
                            arg2.method568(-13488, 0);
                            arg2.method588((byte) 120, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field3664[var7].field748;
                            var9.setInt(null, var3.field3678[var7]);
                            arg2.method568(-13488, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field3664[var7].field748;
                            int var11 = var10.getModifiers();
                            arg2.method568(-13488, 0);
                            arg2.method588((byte) 101, var11);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field3666[var7].field748;
                            byte[][] var15 = var3.field3672[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg2.method568(-13488, 0);
                            } else if (var19 instanceof Number) {
                                arg2.method568(-13488, 1);
                                arg2.method592(((Number) var19).longValue(), -562765672);
                            } else if (var19 instanceof class109) {
                                arg2.method568(-13488, 2);
                                arg2.method585((class109) var19, (byte) -111);
                            } else {
                                arg2.method568(-13488, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field3666[var7].field748;
                            int var21 = var20.getModifiers();
                            arg2.method568(-13488, 0);
                            arg2.method588((byte) 122, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method568(-13488, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method568(-13488, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method568(-13488, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method568(-13488, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method568(-13488, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method568(-13488, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method568(-13488, -16);
                    } catch (SecurityException var29) {
                        arg2.method568(-13488, -17);
                    } catch (IOException var30) {
                        arg2.method568(-13488, -18);
                    } catch (NullPointerException var31) {
                        arg2.method568(-13488, -19);
                    } catch (Exception var32) {
                        arg2.method568(-13488, -20);
                    } catch (Throwable var33) {
                        arg2.method568(-13488, -21);
                    }
                } else {
                    arg2.method568(-13488, var3.field3667[var7]);
                }
            }
            arg2.method602(var6, -1503604504);
            arg2.method565(arg2.field1773 - var6, 61);
            var3.method452(true);
        }
    }

    @OriginalMember(owner = "ci", name = "<init>", descriptor = "(IIIIIII)V")
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field648 = arg1;
        this.field651 = arg2;
        this.field654 = arg3;
        this.field642 = arg5 + arg6;
        this.field658 = arg4;
        this.field650 = arg0;
        int var8 = class193.method1297(this.field650, -18753).field2207;
        if (var8 == -1) {
            this.field653 = true;
        } else {
            this.field653 = false;
            this.field647 = client.method246(12, var8);
        }
    }
}
