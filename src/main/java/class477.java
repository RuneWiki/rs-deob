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

@OriginalClass("client!iea")
public class class477 {

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
    private int field6789 = -1;

    @OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
    private int field6798 = -1;

    @OriginalMember(owner = "client!iea", name = "o", descriptor = "I")
    private int field6796 = 0;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    private int field6782 = -1;

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "Z")
    private boolean field6790 = false;

    @OriginalMember(owner = "client!iea", name = "D", descriptor = "Z")
    private boolean field6811 = false;

    @OriginalMember(owner = "client!iea", name = "F", descriptor = "I")
    private int field6813 = 0;

    @OriginalMember(owner = "client!iea", name = "t", descriptor = "I")
    public int field6801;

    @OriginalMember(owner = "client!iea", name = "x", descriptor = "B")
    private byte field6805;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
    public int field6786;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "B")
    private byte field6788;

    @OriginalMember(owner = "client!iea", name = "w", descriptor = "I")
    public int field6804;

    @OriginalMember(owner = "client!iea", name = "B", descriptor = "Lrr;")
    private class361 field6809;

    @OriginalMember(owner = "client!iea", name = "J", descriptor = "Z")
    private boolean field6817;

    @OriginalMember(owner = "client!iea", name = "v", descriptor = "I")
    public static int field6803 = 0;

    @OriginalMember(owner = "client!iea", name = "s", descriptor = "Ltp;")
    public static class532 field6800 = null;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    private int field6785;

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
    private int field6793;

    @OriginalMember(owner = "client!iea", name = "m", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!iea", name = "p", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!iea", name = "r", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!iea", name = "u", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!iea", name = "y", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!iea", name = "A", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!iea", name = "E", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!iea", name = "G", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!iea", name = "H", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!iea", name = "I", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!iea", name = "K", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!iea", name = "L", descriptor = "I")
    private int field6819;

    @OriginalMember(owner = "client!iea", name = "M", descriptor = "I")
    private int field6820;

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "Ldfa;")
    public static class165 field6791;

    @OriginalMember(owner = "client!iea", name = "C", descriptor = "Lr;")
    private class182 field6810;

    @OriginalMember(owner = "client!iea", name = "z", descriptor = "Lpd;")
    public class257 field6807;

    @OriginalMember(owner = "client!iea", name = "N", descriptor = "Lfba;")
    private class25 field6821;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "Lka;")
    private class470 field6787;

    @OriginalMember(owner = "client!iea", name = "n", descriptor = "[Z")
    private boolean[] field6795;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)I", line = 3)
    public final int method2860(boolean arg0) {
        if (!arg0) {
            this.method2870(null, 47);
        }
        field6784++;
        return this.field6796;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILig;)V", line = 19)
    public static final void method2861(int arg0, class244 arg1) {
        field6799++;
        if (arg0 != -1) {
            method2873(11);
        }
        if ((arg1.field2912.length - arg1.field2903) < 1) {
            return;
        }
        int var2 = arg1.method1423(-18);
        if (var2 < 0 || var2 > 1 || (arg1.field2912.length - arg1.field2903) < 2) {
            return;
        }
        int var3 = arg1.method1476(-118);
        if ((arg1.field2912.length - arg1.field2903) < (var3 * 6)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method1476(arg0 + 116);
            int var6 = arg1.method1438(arg0 + 110);
            if (class217.field2518.length > var5 && class417.field5905[var5] && (class722.field10123.method4153(var5, (byte) 123).field8029 != '1' || var6 >= -1 && var6 <= 1)) {
                class217.field2518[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(Z)I", line = 67)
    public final int method2862(boolean arg0) {
        if (arg0) {
            field6792++;
            return this.field6813;
        } else {
            return -126;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lwp;I)V", line = 81)
    public static final void method2863(class179 arg0, int arg1) {
        field6802++;
        class36 var2 = (class36) class559.field7984.method1719(65280);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field386; var4++) {
            if (var2.field384[var4] != null) {
                if (var2.field384[var4].field3573 == 2) {
                    var2.field389[var4] = -5;
                }
                if (var2.field384[var4].field3573 == 0) {
                    var3 = true;
                }
            }
            if (var2.field395[var4] != null) {
                if (var2.field395[var4].field3573 == 2) {
                    var2.field389[var4] = -6;
                }
                if (var2.field395[var4].field3573 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg0.field2903;
        arg0.method1421(var2.field385, -20798);
        for (int var6 = 0; var6 < var2.field386; var6++) {
            if (var2.field389[var6] == 0) {
                try {
                    int var7 = var2.field390[var6];
                    if (var7 == 0) {
                        Field var11 = (Field) var2.field384[var6].field3577;
                        int var12 = var11.getInt(null);
                        arg0.method1460(0, 24710);
                        arg0.method1421(var12, -20798);
                    } else if (var7 == 1) {
                        Field var8 = (Field) var2.field384[var6].field3577;
                        var8.setInt(null, var2.field388[var6]);
                        arg0.method1460(0, 24710);
                    } else if (var7 == 2) {
                        Field var9 = (Field) var2.field384[var6].field3577;
                        int var10 = var9.getModifiers();
                        arg0.method1460(0, 24710);
                        arg0.method1421(var10, -20798);
                    }
                    if (var7 == 3) {
                        Method var15 = (Method) var2.field395[var6].field3577;
                        byte[][] var16 = var2.field391[var6];
                        Object[] var17 = new Object[var16.length];
                        for (int var18 = 0; var18 < var16.length; var18++) {
                            ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                            var17[var18] = var19.readObject();
                        }
                        Object var20 = var15.invoke(null, var17);
                        if (var20 == null) {
                            arg0.method1460(0, 24710);
                        } else if ((var20 instanceof Number)) {
                            arg0.method1460(1, 24710);
                            arg0.method1462(24557, ((Number) var20).longValue());
                        } else if ((var20 instanceof String)) {
                            arg0.method1460(2, 24710);
                            arg0.method1480((String) var20, false);
                        } else {
                            arg0.method1460(4, 24710);
                        }
                    } else if (var7 == 4) {
                        Method var13 = (Method) var2.field395[var6].field3577;
                        int var14 = var13.getModifiers();
                        arg0.method1460(0, 24710);
                        arg0.method1421(var14, -20798);
                    }
                } catch (ClassNotFoundException var21) {
                    arg0.method1460(-10, 24710);
                } catch (InvalidClassException var22) {
                    arg0.method1460(-11, 24710);
                } catch (StreamCorruptedException var23) {
                    arg0.method1460(-12, 24710);
                } catch (OptionalDataException var24) {
                    arg0.method1460(-13, 24710);
                } catch (IllegalAccessException var25) {
                    arg0.method1460(-14, 24710);
                } catch (IllegalArgumentException var26) {
                    arg0.method1460(-15, 24710);
                } catch (InvocationTargetException var27) {
                    arg0.method1460(-16, 24710);
                } catch (SecurityException var28) {
                    arg0.method1460(-17, 24710);
                } catch (IOException var29) {
                    arg0.method1460(-18, 24710);
                } catch (NullPointerException var30) {
                    arg0.method1460(-19, 24710);
                } catch (Exception var31) {
                    arg0.method1460(-20, 24710);
                } catch (Throwable var32) {
                    arg0.method1460(-21, 24710);
                }
            } else {
                arg0.method1460(var2.field389[var6], 24710);
            }
        }
        arg0.method1429(var5, (byte) 92);
        if (arg1 >= -79) {
            method2863(null, -20);
        }
        var2.method864(12983);
    }

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "(Z)Z", line = 264)
    public final boolean method2864(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field6808++;
            return this.field6817;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(II)V", line = 277)
    public final void method2865(int arg0, int arg1) {
        this.field6790 = true;
        field6814++;
        this.method2872((byte) -127, arg0);
        if (arg1 != 0) {
            this.field6796 = 92;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZLha;ZII)Lka;", line = 296)
    public final class470 method2866(boolean arg0, class58 arg1, boolean arg2, int arg3, int arg4) {
        field6794++;
        class316 var6 = class445.field6442.method3972((byte) 114, this.field6801);
        if (var6.field4045 != null) {
            var6 = var6.method1886(class722.field10125, 80);
        }
        if (var6 == null) {
            this.method2870(arg1, 107);
            this.field6798 = -1;
            this.field6782 = -1;
            this.field6789 = -1;
            return null;
        }
        if (!this.field6790 && this.field6782 != var6.field3962) {
            this.field6787 = null;
            this.method2872((byte) -124, -1);
        }
        this.method2867(this.field6809, (byte) -38);
        if (arg0) {
            boolean var7 = arg0 & this.field6817 & class654.field9334.field9856.method2185(-126) != 0;
            arg0 = var7 & (this.field6798 != var6.field3962 || this.field6821 != null && class654.field9334.field9856.method2185(-127) >= 2 && (this.field6793 != this.field6789 || (this.field6821.field273 || class16.field153) && this.field6819 != this.field6793));
        }
        if (arg2 && !arg0) {
            this.field6782 = var6.field3962;
            return null;
        }
        if (arg0) {
            class158.method979(this.field6810, this.field6788, this.field6809.field4635, this.field6809.field4629, this.field6795);
            this.field6798 = -1;
            this.field6789 = -1;
        }
        class278 var8 = class504.field7120[this.field6788];
        class278 var9;
        if (this.field6811) {
            var9 = class11.field88[0];
        } else {
            var9 = this.field6788 < 3 ? class504.field7120[this.field6788 + 1] : null;
        }
        class470 var10 = null;
        if (this.field6821 != null) {
            if (arg0) {
                arg4 |= 0x40000;
            }
            var10 = var6.method1898(this.field6821, this.field6819, arg1, true, this.field6809.field4629, this.field6804 == 11 ? 10 : this.field6804, this.field6804 == 11 ? this.field6786 + 4 : this.field6786, this.field6793, var9, this.field6809.field4635, this.field6785, var8.method1675(this.field6809.field4629, this.field6809.field4635, 65286), arg4, var8);
            if (var10 == null) {
                this.field6810 = null;
                this.field6813 = 0;
                this.field6795 = null;
                this.field6796 = 0;
            } else {
                if (arg0) {
                    if (this.field6795 == null) {
                        this.field6795 = new boolean[4];
                    }
                    this.field6810 = var10.method194(this.field6810);
                    class663.method3772(this.field6810, this.field6788, this.field6809.field4635, this.field6809.field4629, this.field6795);
                    this.field6789 = this.field6793;
                    this.field6798 = var6.field3962;
                }
                this.field6796 = var10.method190();
                this.field6813 = var10.method217();
            }
            this.field6787 = null;
        } else if (this.field6787 != null && arg4 == (this.field6787.method213() & arg4) && this.field6782 == var6.field3962) {
            var10 = this.field6787;
        } else {
            if (this.field6787 != null) {
                arg4 |= this.field6787.method213();
            }
            class42 var11 = var6.method1894(this.field6804 == 11 ? this.field6786 + 4 : this.field6786, -39, arg4, var9, arg0, this.field6809.field4629, arg1, var8.method1675(this.field6809.field4629, this.field6809.field4635, 65286), this.field6804 == 11 ? 10 : this.field6804, var8, this.field6809.field4635);
            if (var11 == null) {
                this.field6795 = null;
                this.field6810 = null;
                this.field6796 = 0;
                this.field6787 = null;
                this.field6813 = 0;
            } else {
                var10 = var11.field475;
                this.field6787 = var11.field475;
                if (arg0) {
                    this.field6795 = null;
                    this.field6810 = var11.field474;
                    class663.method3772(this.field6810, this.field6788, this.field6809.field4635, this.field6809.field4629, null);
                    this.field6798 = var6.field3962;
                    this.field6789 = -1;
                }
                this.field6796 = var10.method190();
                this.field6813 = var10.method217();
            }
        }
        if (arg3 != 1) {
            this.method2868(-115, 10, null, -9, null, 2, null, (byte) 122, false);
        }
        this.field6782 = var6.field3962;
        return var10;
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lha;Lvc;IIIILrr;ZI)V", line = 801)
    public class477(class58 arg0, class316 arg1, int arg2, int arg3, int arg4, int arg5, class361 arg6, boolean arg7, int arg8) {
        this.field6801 = arg1.field3962;
        this.field6805 = (byte) arg4;
        this.field6811 = arg7;
        this.field6786 = arg3;
        this.field6788 = (byte) arg5;
        this.field6804 = arg2;
        this.field6809 = arg6;
        this.field6817 = arg0.method376() && arg1.field4029 && !this.field6811;
        if (arg8 != -1) {
            this.field6790 = true;
        }
        this.method2872((byte) -125, arg8);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lrr;B)V", line = 444)
    private final void method2867(class361 arg0, byte arg1) {
        if (arg1 != -38) {
            return;
        }
        field6818++;
        label92: while (true) {
            if (this.field6821 == null) {
                if (this.field6790) {
                    return;
                }
                this.method2872((byte) -128, -1);
                if (this.field6821 == null) {
                    return;
                }
            }
            int var3 = class392.field5398 - this.field6820;
            if (var3 > 100 && this.field6821.field263 > 0) {
                int var4 = this.field6821.field256.length - this.field6821.field263;
                while (this.field6793 < var4 && this.field6821.field253[this.field6793] < var3) {
                    var3 -= this.field6821.field253[this.field6793];
                    this.field6793++;
                }
                if (this.field6793 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field6821.field256.length; var6++) {
                        var5 += this.field6821.field253[var6];
                    }
                    var3 %= var5;
                }
                this.field6819 = this.field6793 + 1;
                if (this.field6819 >= this.field6821.field256.length) {
                    this.field6819 -= this.field6821.field263;
                    if (this.field6819 < 0 || this.field6819 >= this.field6821.field256.length) {
                        this.field6819 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field6821.field253[this.field6793] >= var3) {
                            this.field6785 = var3;
                            this.field6820 = class392.field5398 - var3;
                            return;
                        }
                        class629.method3607(arg0, this.field6821, -115, this.field6793);
                        var3 -= this.field6821.field253[this.field6793];
                        this.field6793++;
                        if (this.field6793 >= this.field6821.field256.length) {
                            this.field6793 -= this.field6821.field263;
                            if (this.field6793 < 0 || this.field6793 >= this.field6821.field256.length) {
                                this.field6821 = null;
                                continue label92;
                            }
                        }
                        this.field6819 = this.field6793 + 1;
                    } while (this.field6821.field256.length > this.field6819);
                    this.field6819 -= this.field6821.field263;
                } while (this.field6819 >= 0 && this.field6819 < this.field6821.field256.length);
                this.field6819 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IILka;ILdfa;ILha;BZ)V", line = 546)
    public final void method2868(int arg0, int arg1, class470 arg2, int arg3, class165 arg4, int arg5, class58 arg6, byte arg7, boolean arg8) {
        field6812++;
        class555[] var10 = arg2.method212();
        if (arg7 != -14) {
            return;
        }
        class88[] var11 = arg2.method186();
        if ((this.field6807 == null || this.field6807.field3136) && (var10 != null || var11 != null)) {
            class316 var12 = class445.field6442.method3972((byte) 100, this.field6801);
            if (var12.field4045 != null) {
                var12 = var12.method1886(class722.field10125, arg7 + 86);
            }
            if (var12 != null) {
                this.field6807 = class257.method1543(class392.field5398, true);
            }
        }
        if (this.field6807 == null) {
            return;
        }
        arg2.method220(arg4);
        if (arg8) {
            this.field6807.method1533(arg6, (long) class392.field5398, var10, var11, false);
        } else {
            this.field6807.method1536((long) class392.field5398);
        }
        this.field6807.method1542(this.field6805, arg5, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V", line = 595)
    public static final void method2869(int arg0) {
        field6783++;
        if (~class283.field3448 != arg0) {
            class714.method3994(-1, 95, class283.field3448, -1, false);
            class283.field3448 = -1;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lha;I)V", line = 608)
    public final void method2870(class58 arg0, int arg1) {
        if (this.field6810 != null) {
            class158.method979(this.field6810, this.field6788, this.field6809.field4635, this.field6809.field4629, this.field6795);
            this.field6810 = null;
            this.field6795 = null;
        }
        field6806++;
        int var3 = -62 / ((arg1 - 20) / 42);
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(Lha;I)V", line = 624)
    public final void method2871(class58 arg0, int arg1) {
        field6815++;
        this.method2866(true, arg0, true, arg1 ^ 0x40001, arg1);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(BI)V", line = 632)
    private final void method2872(byte arg0, int arg1) {
        if (arg0 > -123) {
            return;
        }
        field6797++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class316 var5 = class445.field6442.method3972((byte) 100, this.field6801);
            class316 var6 = var5;
            if (var5.field4045 != null) {
                var5 = var5.method1886(class722.field10125, 78);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4036 != null) {
                if (this.field6821 != null && var5.method1890((byte) -67, this.field6821.field248)) {
                    return;
                }
                var3 = var5.method1897(0);
                if (this.field6782 != var5.field3962) {
                    var4 = var5.field3985;
                }
            } else if (var5.field3965 == -1) {
                if (var6 != null && var6.field4036 != null) {
                    if (this.field6821 != null && var6.method1890((byte) -67, this.field6821.field248)) {
                        return;
                    }
                    var3 = var6.method1897(0);
                    if (this.field6782 != var6.field3962) {
                        var4 = var6.field3985;
                    }
                } else if (var6 != null && var6.field3965 != -1 && this.field6782 != var6.field3962) {
                    var3 = var6.field3965;
                    var4 = var6.field3985;
                }
            } else if (this.field6782 != var5.field3962) {
                var3 = var5.field3965;
                var4 = var5.field3985;
            }
        }
        if (var3 == -1) {
            this.field6821 = null;
            return;
        }
        this.field6787 = null;
        if (this.field6821 == null || this.field6821.field248 != var3) {
            this.field6821 = class637.field9158.method1905(47, var3);
        } else if (this.field6821.field250 == 0) {
            return;
        }
        if (this.field6821.field256 == null) {
            this.field6821 = null;
            return;
        }
        if (var4) {
            this.field6793 = (int) (Math.random() * (double) this.field6821.field256.length);
            this.field6785 = ((int) ((double) this.field6821.field253[this.field6793] * Math.random())) + 1;
        } else {
            this.field6793 = 0;
            this.field6785 = 1;
        }
        this.field6819 = this.field6793 + 1;
        if (this.field6819 < 0 || this.field6819 >= this.field6821.field256.length) {
            this.field6819 = -1;
        }
        this.field6820 = class392.field5398 - this.field6785;
    }

    @OriginalMember(owner = "client!iea", name = "finalize", descriptor = "()V", line = 758)
    protected final void finalize() {
        if (this.field6807 != null) {
            this.field6807.method1529();
        }
        field6816++;
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V", line = 777)
    public static void method2873(int arg0) {
        field6800 = null;
        if (arg0 != -1) {
            method2863(null, 55);
        }
        field6791 = null;
    }
}
