import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
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

@OriginalClass("client!v")
public class class189 {

    @OriginalMember(owner = "client!v", name = "o", descriptor = "J")
    private long field3597 = -1L;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    private int field3614 = 0;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "J")
    private long field3600 = -1L;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "Ldg;")
    private class36 field3604;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "J")
    private long field3590;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "J")
    private long field3594;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "J")
    private long field3596;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "[B")
    private byte[] field3606;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "[B")
    private byte[] field3610;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lsd;")
    private static class166 field3588 = class135.method935("Prepared visibility map", 0);

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[I")
    public static int[] field3589 = new int[4000];

    @OriginalMember(owner = "client!v", name = "u", descriptor = "Lsd;")
    public static class166 field3603 = field3588;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field3609 = 0;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "[[I")
    public static int[][] field3616 = new int[104][104];

    @OriginalMember(owner = "client!v", name = "b", descriptor = "[I")
    public static int[] field3584 = new int[50];

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    private int field3602;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "J")
    private long field3615;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Ltd;")
    public static class175 field3583;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILf;ZLf;B)Lnc;")
    public static final class120 method1257(int arg0, class47 arg1, boolean arg2, class47 arg3, byte arg4) {
        field3612++;
        int var5 = 36 / ((76 - arg4) / 46);
        boolean var6 = true;
        int[] var7 = arg1.method350(true, arg0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg1.method365(var7[var8], arg0, (byte) 78);
            if (var9 == null) {
                var6 = false;
            } else {
                int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
                byte[] var11;
                if (arg2) {
                    var11 = arg3.method365(var10, 0, (byte) 78);
                } else {
                    var11 = arg3.method365(0, var10, (byte) 78);
                }
                if (var11 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class120(arg1, arg3, arg0, arg2);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method1258(int arg0, byte[] arg1, int arg2, int arg3) {
        class53 var4 = new class53(arg1);
        boolean var5 = true;
        int var6 = -1;
        if (arg3 < 7) {
            method1261(-75);
        }
        label58: while (true) {
            int var7 = var4.method425(-21462);
            if (var7 == 0) {
                field3601++;
                return var5;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var4.method425(-21462);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = arg2 + var13;
                    int var15 = var4.method400(255) >> 2;
                    int var16 = arg0 + var12;
                    if (var14 > 0 && var16 > 0 && var14 < 103 && var16 < 103) {
                        class145 var17 = class170.method1185((byte) 113, var6);
                        if (var15 != 22 || !class97.field1858 || var17.field2839 != 0 || var17.field2819 == 1 || var17.field2835) {
                            if (!var17.method991((byte) -120)) {
                                var5 = false;
                                class9.field175++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var4.method425(-21462);
                if (var10 == 0) {
                    break;
                }
                var4.method400(255);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BJ)V")
    public final void method1259(byte arg0, long arg1) throws IOException {
        if (arg0 > -11) {
            return;
        }
        field3585++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1270(true));
        }
        this.field3596 = arg1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(JI)V")
    public static final void method1260(long arg0, int arg1) {
        field3591++;
        if (arg1 != 1 || arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class182.method1234(1024, arg0 - 1L);
            class182.method1234(1024, 1L);
        } else {
            class182.method1234(arg1 ^ 0x401, arg0);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method1261(int arg0) {
        field3583 = null;
        field3616 = null;
        field3584 = null;
        int var1 = 110 / ((31 - arg0) / 36);
        field3588 = null;
        field3603 = null;
        field3589 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BB)V")
    public final void method1262(byte[] arg0, byte arg1) throws IOException {
        this.method1265(arg0.length, arg0, 0, (byte) 125);
        if (arg1 != 58) {
            method1261(82);
        }
        field3593++;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public final void method1263(int arg0) throws IOException {
        this.method1266(16446);
        this.field3604.method257(-119);
        field3611++;
        if (arg0 != 3070) {
            this.method1268(105);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    private final void method1264(byte arg0) throws IOException {
        field3607++;
        this.field3602 = 0;
        if (this.field3615 != this.field3596) {
            this.field3604.method253((byte) -112, this.field3596);
            this.field3615 = this.field3596;
        }
        this.field3600 = this.field3596;
        while (this.field3602 < this.field3606.length) {
            int var2 = this.field3604.method254(this.field3606.length - this.field3602, this.field3602, this.field3606, (byte) -96);
            if (var2 == -1) {
                break;
            }
            this.field3615 += var2;
            this.field3602 += var2;
        }
        if (arg0 > -108) {
            method1260(60L, 44);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[BIB)V")
    public final void method1265(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field3586++;
        try {
            if (arg0 + arg2 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg0 - arg1.length);
            }
            if (this.field3597 != -1L && this.field3597 <= this.field3596 && (long) this.field3614 + this.field3597 >= (long) arg0 + this.field3596) {
                class71.method569(this.field3610, (int) (this.field3596 - this.field3597), arg1, arg2, arg0);
                this.field3596 += arg0;
                return;
            }
            if (arg3 <= 106) {
                return;
            }
            long var5 = this.field3596;
            int var7 = arg2;
            int var8 = arg0;
            if (this.field3600 <= this.field3596 && this.field3600 + (long) this.field3602 > this.field3596) {
                int var9 = (int) (this.field3600 + (long) this.field3602 - this.field3596);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class71.method569(this.field3606, (int) (this.field3596 - this.field3600), arg1, arg2, var9);
                arg0 -= var9;
                this.field3596 += var9;
                arg2 += var9;
            }
            if (this.field3606.length < arg0) {
                this.field3604.method253((byte) -86, this.field3596);
                this.field3615 = this.field3596;
                while (arg0 > 0) {
                    int var10 = this.field3604.method254(arg0, arg2, arg1, (byte) -48);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 -= var10;
                    this.field3615 += var10;
                    arg2 += var10;
                    this.field3596 += var10;
                }
            } else if (arg0 > 0) {
                this.method1264((byte) -116);
                int var11 = arg0;
                if (arg0 > this.field3602) {
                    var11 = this.field3602;
                }
                class71.method569(this.field3606, 0, arg1, arg2, var11);
                this.field3596 += var11;
                arg2 += var11;
                arg0 -= var11;
            }
            if (this.field3597 != -1L) {
                if (this.field3596 < this.field3597 && arg0 > 0) {
                    int var12 = (int) (this.field3597 - this.field3596) + arg2;
                    if (arg0 + arg2 < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (var12 > arg2) {
                        arg0--;
                        arg1[arg2++] = 0;
                        this.field3596++;
                    }
                }
                long var13 = -1L;
                if (this.field3597 >= var5 && (long) var8 + var5 > this.field3597) {
                    var13 = this.field3597;
                } else if (var5 >= this.field3597 && var5 < (long) this.field3614 + this.field3597) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field3614 + this.field3597 > var5 && (long) this.field3614 + this.field3597 <= var5 - -((long) var8)) {
                    var15 = (long) this.field3614 + this.field3597;
                } else if ((long) var8 + var5 > this.field3597 && (long) var8 + var5 <= this.field3597 - -((long) this.field3614)) {
                    var15 = var5 + (long) var8;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class71.method569(this.field3610, (int) (var13 - this.field3597), arg1, (int) (var13 - var5) + var7, var17);
                    if (this.field3596 < var15) {
                        arg0 = (int) ((long) arg0 + this.field3596 - var15);
                        this.field3596 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3615 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    private final void method1266(int arg0) throws IOException {
        if (arg0 != 16446) {
            this.field3604 = null;
        }
        field3587++;
        if (this.field3597 == -1L) {
            return;
        }
        if (this.field3615 != this.field3597) {
            this.field3604.method253((byte) -102, this.field3597);
            this.field3615 = this.field3597;
        }
        long var2 = -1L;
        this.field3604.method255(125, 0, this.field3614, this.field3610);
        if (this.field3597 >= this.field3600 && this.field3597 < this.field3600 + (long) this.field3602) {
            var2 = this.field3597;
        } else if (this.field3600 >= this.field3597 && this.field3600 < (long) this.field3614 + this.field3597) {
            var2 = this.field3600;
        }
        this.field3615 += this.field3614;
        if (this.field3590 < this.field3615) {
            this.field3590 = this.field3615;
        }
        long var4 = -1L;
        if (this.field3597 + (long) this.field3614 > this.field3600 && (long) this.field3602 + this.field3600 >= (long) this.field3614 + this.field3597) {
            var4 = (long) this.field3614 + this.field3597;
        } else if (this.field3597 < (long) this.field3602 + this.field3600 && (long) this.field3602 + this.field3600 <= (long) this.field3614 + this.field3597) {
            var4 = (long) this.field3602 + this.field3600;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class71.method569(this.field3610, (int) (var2 - this.field3597), this.field3606, (int) (var2 - this.field3600), var6);
        }
        this.field3614 = 0;
        this.field3597 = -1L;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBI[B)V")
    public final void method1267(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field3608++;
        int var5 = -67 % ((arg1 - 66) / 57);
        try {
            if ((long) arg0 + this.field3596 > this.field3594) {
                this.field3594 = (long) arg0 + this.field3596;
            }
            if (this.field3597 != -1L && (this.field3596 < this.field3597 || (long) this.field3614 + this.field3597 < this.field3596)) {
                this.method1266(16446);
            }
            if (this.field3597 != -1L && this.field3597 + (long) this.field3610.length < (long) arg0 + this.field3596) {
                int var6 = (int) (this.field3597 + (long) this.field3610.length - this.field3596);
                arg0 -= var6;
                class71.method569(arg3, arg2, this.field3610, (int) (this.field3596 - this.field3597), var6);
                this.field3596 += var6;
                arg2 += var6;
                this.field3614 = this.field3610.length;
                this.method1266(16446);
            }
            if (arg0 > this.field3610.length) {
                long var7 = -1L;
                if (this.field3615 != this.field3596) {
                    this.field3604.method253((byte) -76, this.field3596);
                    this.field3615 = this.field3596;
                }
                this.field3604.method255(120, arg2, arg0, arg3);
                this.field3615 += arg0;
                if (this.field3590 < this.field3615) {
                    this.field3590 = this.field3615;
                }
                long var9 = -1L;
                if (this.field3596 >= this.field3600 && this.field3596 < this.field3600 + (long) this.field3602) {
                    var7 = this.field3596;
                } else if (this.field3596 <= this.field3600 && this.field3600 < (long) arg0 + this.field3596) {
                    var7 = this.field3600;
                }
                if ((long) arg0 + this.field3596 > this.field3600 && (long) arg0 + this.field3596 <= (long) this.field3602 + this.field3600) {
                    var9 = (long) arg0 + this.field3596;
                } else if ((long) this.field3602 + this.field3600 > this.field3596 && this.field3600 + (long) this.field3602 <= (long) arg0 + this.field3596) {
                    var9 = (long) this.field3602 + this.field3600;
                }
                if (var7 > -1L && var9 > var7) {
                    int var11 = (int) (var9 - var7);
                    class71.method569(arg3, (int) ((long) arg2 + var7 - this.field3596), this.field3606, (int) (var7 - this.field3600), var11);
                }
                this.field3596 += arg0;
            } else if (arg0 > 0) {
                if (this.field3597 == -1L) {
                    this.field3597 = this.field3596;
                }
                class71.method569(arg3, arg2, this.field3610, (int) (this.field3596 - this.field3597), arg0);
                this.field3596 += arg0;
                if (this.field3596 - this.field3597 > (long) this.field3614) {
                    this.field3614 = (int) (this.field3596 - this.field3597);
                }
            }
        } catch (IOException var13) {
            this.field3615 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)J")
    public final long method1268(int arg0) {
        field3613++;
        if (arg0 != 4982) {
            method1257(-40, null, true, null, (byte) 66);
        }
        return this.field3594;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILvd;)Lvd;")
    public static final class193 method1269(int arg0, class193 arg1) {
        if (arg0 != 18822) {
            method1271(-40, null, false);
        }
        field3592++;
        int var2 = class25.method191(class140.method955(arg0 - 18860, arg1), 256);
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class90.method701(-31355, arg1.field3762);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Ljava/io/File;")
    private final File method1270(boolean arg0) {
        field3599++;
        return arg0 ? this.field3604.method256(126) : null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILk;Z)V")
    public static final void method1271(int arg0, class90 arg1, boolean arg2) {
        if (!arg2) {
            field3603 = null;
        }
        field3598++;
        while (true) {
            class178 var3 = (class178) class170.field3274.method1109((byte) -124);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3361; var5++) {
                if (var3.field3369[var5] != null) {
                    if (var3.field3369[var5].field1351 == 2) {
                        var3.field3363[var5] = -5;
                    }
                    if (var3.field3369[var5].field1351 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3366[var5] != null) {
                    if (var3.field3366[var5].field1351 == 2) {
                        var3.field3363[var5] = -6;
                    }
                    if (var3.field3366[var5].field1351 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method705(arg0, (byte) 9);
            arg1.method429(0, (byte) 99);
            int var6 = arg1.field1000;
            arg1.method438(423055928, var3.field3368);
            for (int var7 = 0; var7 < var3.field3361; var7++) {
                if (var3.field3363[var7] == 0) {
                    try {
                        int var8 = var3.field3367[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3369[var7].field1352;
                            int var13 = var12.getInt(null);
                            arg1.method429(0, (byte) 95);
                            arg1.method438(423055928, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field3369[var7].field1352;
                            var9.setInt(null, var3.field3358[var7]);
                            arg1.method429(0, (byte) 115);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field3369[var7].field1352;
                            int var11 = var10.getModifiers();
                            arg1.method429(0, (byte) 108);
                            arg1.method438(423055928, var11);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field3366[var7].field1352;
                            byte[][] var15 = var3.field3362[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg1.method429(0, (byte) 112);
                            } else if (var19 instanceof Number) {
                                arg1.method429(1, (byte) 125);
                                arg1.method428(((Number) var19).longValue(), (byte) 114);
                            } else if (var19 instanceof class166) {
                                arg1.method429(2, (byte) 115);
                                arg1.method396((class166) var19, false);
                            } else {
                                arg1.method429(4, (byte) 110);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field3366[var7].field1352;
                            int var21 = var20.getModifiers();
                            arg1.method429(0, (byte) 85);
                            arg1.method438(423055928, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method429(-10, (byte) 107);
                    } catch (InvalidClassException var23) {
                        arg1.method429(-11, (byte) 117);
                    } catch (StreamCorruptedException var24) {
                        arg1.method429(-12, (byte) 86);
                    } catch (OptionalDataException var25) {
                        arg1.method429(-13, (byte) 98);
                    } catch (IllegalAccessException var26) {
                        arg1.method429(-14, (byte) 118);
                    } catch (IllegalArgumentException var27) {
                        arg1.method429(-15, (byte) 81);
                    } catch (InvocationTargetException var28) {
                        arg1.method429(-16, (byte) 100);
                    } catch (SecurityException var29) {
                        arg1.method429(-17, (byte) 89);
                    } catch (IOException var30) {
                        arg1.method429(-18, (byte) 123);
                    } catch (NullPointerException var31) {
                        arg1.method429(-19, (byte) 86);
                    } catch (Exception var32) {
                        arg1.method429(-20, (byte) 118);
                    } catch (Throwable var33) {
                        arg1.method429(-21, (byte) 106);
                    }
                } else {
                    arg1.method429(var3.field3363[var7], (byte) 125);
                }
            }
            arg1.method435(var6, (byte) 104);
            arg1.method408(arg1.field1000 - var6, -1);
            var3.method915(0);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ldg;II)V")
    public class189(class36 arg0, int arg1, int arg2) throws IOException {
        this.field3604 = arg0;
        this.field3594 = this.field3590 = arg0.method252(0);
        this.field3596 = 0L;
        this.field3606 = new byte[arg1];
        this.field3610 = new byte[arg2];
    }
}
