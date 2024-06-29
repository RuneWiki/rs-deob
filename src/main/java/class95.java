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

@OriginalClass("client!uk")
public class class95 extends class177 {

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    private int field1763 = -32768;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "Lhk;")
    private class121 field1780 = null;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    private int field1787 = -1;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    private int field1772 = -1;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
    private int field1779;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    private int field1782;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    private int field1771;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    private int field1767;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    private int field1762;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    private int field1766;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "Lek;")
    private class159 field1775;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    private int field1785;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    private int field1778;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "Lhj;")
    public static class69 field1770 = class181.method1318("cookiehost", (byte) -113);

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "Lhj;")
    public static class69 field1773 = class181.method1318("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", (byte) -122);

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "Z")
    public static boolean field1784 = true;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(IIIII)V")
    public static final void method688(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1786++;
        class135 var5 = class8.method38((byte) 111, arg1, arg0);
        var5.method1011((byte) 122);
        var5.field2534 = arg2;
        var5.field2539 = arg3;
        var5.field2535 = arg4;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(IIIII)V")
    public static final void method689(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class135.field2528 = class84.field1626 * arg3 / arg4;
        class4.field32 = arg1;
        field1781++;
        class102.field1905 = class22.field306 * arg2 / arg0;
        class109.field2089 = -1;
        class69.method456(1);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(III)V")
    private final void method690(int arg0, int arg1, int arg2) {
        if (this.field1775 != null) {
            int var4 = class180.field3272 - this.field1785;
            if (var4 > 100 && this.field1775.field2943 > 0) {
                int var5 = this.field1775.field2962.length - this.field1775.field2943;
                while (this.field1778 < var5 && var4 > this.field1775.field2941[this.field1778]) {
                    var4 -= this.field1775.field2941[this.field1778];
                    this.field1778++;
                }
                if (var5 <= this.field1778) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1775.field2962.length; var7++) {
                        var6 += this.field1775.field2941[var7];
                    }
                    var4 %= var6;
                }
            }
            label58: {
                do {
                    do {
                        if (var4 <= this.field1775.field2941[this.field1778]) {
                            break label58;
                        }
                        class248.method1748(arg1, arg0, this.field1775, -10, this.field1778, false);
                        var4 -= this.field1775.field2941[this.field1778];
                        this.field1778++;
                    } while (this.field1775.field2962.length > this.field1778);
                    this.field1778 -= this.field1775.field2943;
                } while (this.field1778 >= 0 && this.field1778 < this.field1775.field2962.length);
                this.field1775 = null;
            }
            this.field1785 = class180.field3272 - var4;
        }
        field1777++;
        int var8 = -106 / ((-arg2 - 68) / 37);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lkb;II)V")
    public static final void method691(class51 arg0, int arg1, int arg2) {
        if (arg2 != -10) {
            return;
        }
        field1761++;
        while (true) {
            class52 var3 = (class52) class98.field1860.method1724(arg2 + 265);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field931; var5++) {
                if (var3.field914[var5] != null) {
                    if (var3.field914[var5].field1663 == 2) {
                        var3.field915[var5] = -5;
                    }
                    if (var3.field914[var5].field1663 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field919[var5] != null) {
                    if (var3.field919[var5].field1663 == 2) {
                        var3.field915[var5] = -6;
                    }
                    if (var3.field919[var5].field1663 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method301(arg1, -104);
            arg0.method933(0, -20946);
            int var6 = arg0.field2379;
            arg0.method908(false, var3.field933);
            for (int var7 = 0; var7 < var3.field931; var7++) {
                if (var3.field915[var7] == 0) {
                    try {
                        int var8 = var3.field935[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field914[var7].field1666;
                            int var13 = var12.getInt((Object) null);
                            arg0.method933(0, -20946);
                            arg0.method908(false, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field914[var7].field1666;
                            var9.setInt((Object) null, var3.field922[var7]);
                            arg0.method933(0, -20946);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field914[var7].field1666;
                            int var11 = var10.getModifiers();
                            arg0.method933(0, -20946);
                            arg0.method908(false, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field919[var7].field1666;
                            byte[][] var17 = var3.field925[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method933(0, -20946);
                            } else if (var21 instanceof Number) {
                                arg0.method933(1, arg2 ^ 0x51D8);
                                arg0.method918(((Number) var21).longValue(), 18820);
                            } else if (var21 instanceof class69) {
                                arg0.method933(2, arg2 ^ 0x51D8);
                                arg0.method927((class69) var21, (byte) 125);
                            } else {
                                arg0.method933(4, arg2 ^ 0x51D8);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field919[var7].field1666;
                            int var15 = var14.getModifiers();
                            arg0.method933(0, -20946);
                            arg0.method908(false, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method933(-10, arg2 - 20936);
                    } catch (InvalidClassException var23) {
                        arg0.method933(-11, -20946);
                    } catch (StreamCorruptedException var24) {
                        arg0.method933(-12, arg2 - 20936);
                    } catch (OptionalDataException var25) {
                        arg0.method933(-13, -20946);
                    } catch (IllegalAccessException var26) {
                        arg0.method933(-14, arg2 - 20936);
                    } catch (IllegalArgumentException var27) {
                        arg0.method933(-15, arg2 ^ 0x51D8);
                    } catch (InvocationTargetException var28) {
                        arg0.method933(-16, arg2 - 20936);
                    } catch (SecurityException var29) {
                        arg0.method933(-17, -20946);
                    } catch (IOException var30) {
                        arg0.method933(-18, -20946);
                    } catch (NullPointerException var31) {
                        arg0.method933(-19, -20946);
                    } catch (Exception var32) {
                        arg0.method933(-20, -20946);
                    } catch (Throwable var33) {
                        arg0.method933(-21, arg2 - 20936);
                    }
                } else {
                    arg0.method933(var3.field915[var7], arg2 ^ 0x51D8);
                }
            }
            arg0.method939(true, var6);
            arg0.method941(arg2 ^ 0xFFFFFFF4, arg0.field2379 - var6);
            var3.method632(-8296);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lnc;ILnc;)V")
    public static final void method692(class83 arg0, int arg1, class83 arg2) {
        if (arg1 >= -4) {
            field1773 = null;
        }
        field1788++;
        class26.field365 = arg0;
        class122.field2273 = arg2;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
    public final void method693(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method690((arg3 + (arg0 - arg3 >> 1)) * 128 + 64, ((-arg1 + arg2 >> 1) + arg1) * arg4 - -64, -108);
        field1769++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1783++;
        class177 var11 = this.method695(-128);
        if (var11 != null) {
            var11.method212(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1763 = var11.method211();
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BZ)Led;")
    private final class177 method694(byte arg0, boolean arg1) {
        field1776++;
        boolean var3 = class31.field429 != class271.field4793;
        class12 var4 = class145.method1102(this.field1782, 0);
        if (var4.field120 != null) {
            var4 = var4.method63(97);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field1767 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field153;
            var7 = var4.field127;
        } else {
            var6 = var4.field127;
            var7 = var4.field153;
        }
        int var8 = (var7 >> 1) + this.field1779;
        int var9 = (var6 >> 1) + this.field1766;
        int var10 = (var7 + 1 >> 1) + this.field1779;
        int var11 = (var6 + 1 >> 1) + this.field1766;
        this.method690(var8 * 128, var9 * 128, -106);
        boolean var12 = !var3 && var4.field163 && (this.field1772 != var4.field179 || this.field1787 != this.field1778 && class191.field3461 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int var13 = (this.field1779 << 7) + (var7 << 6);
        if (arg0 < 36) {
            this.method693(112, -73, 125, 62, -62);
        }
        int[][] var14 = class271.field4793[this.field1771];
        int var15 = var14[var8][var11] + var14[var10][var9] + var14[var10][var11] + var14[var8][var9] >> 2;
        int var16 = (this.field1766 << 7) + (var6 << 6);
        int[][] var17 = null;
        if (var3) {
            var17 = class31.field429[0];
        } else if (this.field1771 < 3) {
            var17 = class271.field4793[this.field1771 + 1];
        }
        boolean var18 = this.field1780 == null;
        class9 var19;
        if (this.field1775 == null) {
            var19 = var4.method61(var16, var14, this.field1762, var17, var18 ? class103.field1935 : this.field1780, false, this.field1767, var13, var15, (byte) 91, var12);
        } else {
            var19 = var4.method56(var14, this.field1762, var13, var18 ? class103.field1935 : this.field1780, -100, var15, this.field1767, var16, var17, var12, this.field1778, this.field1775);
        }
        return var19 == null ? null : var19.field64;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Led;")
    private final class177 method695(int arg0) {
        field1765++;
        if (arg0 > -127) {
            this.field1763 = -15;
        }
        return this.method694((byte) 94, false);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)I")
    public static final int method696(boolean arg0, int arg1) {
        field1764++;
        if (arg1 < 0) {
            return 0;
        }
        class65 var2 = (class65) class4.field25.method769(true, (long) arg1);
        if (var2 == null) {
            return class242.method1721(0, arg1).field56;
        }
        int var3 = 0;
        if (arg0) {
            return -101;
        }
        for (int var4 = 0; var4 < var2.field1261.length; var4++) {
            if (var2.field1261[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class242.method1721(0, arg1).field56 - var2.field1261.length);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public static void method697(int arg0) {
        if (arg0 != 0) {
            field1770 = null;
        }
        field1773 = null;
        field1770 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()I")
    public final int method211() {
        field1774++;
        return this.field1763;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLnc;)V")
    public static final void method698(byte arg0, class83 arg1) {
        class83.field1594 = arg1;
        if (arg0 > 36) {
            field1768++;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(IIIIIIIZLed;)V")
    public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class177 arg8) {
        this.field1779 = arg4;
        this.field1782 = arg0;
        this.field1771 = arg3;
        this.field1767 = arg2;
        this.field1762 = arg1;
        this.field1766 = arg5;
        if (arg6 != -1) {
            this.field1775 = class211.method1521(-88, arg6);
            this.field1785 = class180.field3272 - 1;
            this.field1778 = 0;
            if (this.field1775.field2963 == 0 && arg8 != null && arg8 instanceof class95) {
                class95 var10 = (class95) arg8;
                if (this.field1775 == var10.field1775) {
                    this.field1785 = var10.field1785;
                    this.field1778 = var10.field1778;
                    return;
                }
            }
            if (arg7 && this.field1775.field2943 != -1) {
                this.field1778 = (int) ((double) this.field1775.field2962.length * Math.random());
                this.field1785 -= (int) (Math.random() * (double) this.field1775.field2941[this.field1778]);
                return;
            }
        }
    }
}
