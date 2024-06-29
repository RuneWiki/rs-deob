import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 {

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    private int field8 = 0;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "J")
    private long field14 = -1L;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "J")
    private long field28 = -1L;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lag;")
    private class95 field2;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "J")
    private long field19;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "J")
    private long field20;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "J")
    private long field26;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "[B")
    private byte[] field24;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "[B")
    private byte[] field9;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field16 = -1;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "Lli;")
    public static class185 field23 = class245.method1649("mapdots", -117);

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "Z")
    public static boolean field30 = true;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "J")
    private long field3;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public static final void method1(int arg0, int arg1) {
        if (arg1 != -26927) {
            field16 = 124;
        }
        field5++;
        class99.field1824.method85((byte) 75, arg0);
        class130.field2338.method85((byte) 75, arg0);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)Lpj;")
    public static final class154 method2(int arg0, byte arg1) {
        int var2 = 50 % ((arg1 + 51) / 42);
        class154 var3 = (class154) class132.field2368.method82(-32, (long) arg0);
        field1++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class42.field648.method1688(0, arg0, 3);
        class154 var5 = new class154();
        if (var4 != null) {
            var5.method1098(new class118(var4), false);
        }
        class132.field2368.method84(99, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static final void method3(int arg0) {
        if (arg0 != 128) {
            field23 = null;
        }
        field6++;
        class38.field589.method86(0);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lbb;IIIII)V")
    public static final void method4(class75 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class42.field641 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class264.field4685) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class122.field2214 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class198 var14 = class153.field2896[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class201.field3694[var11][var12 + 1][var13] + class201.field3694[var11][var12][var13] + class201.field3694[var11][var12][var13 + 1] + class201.field3694[var11][var12 + 1][var13 + 1]) / 4 - (class201.field3694[arg1][arg2 + 1][arg3] + class201.field3694[arg1][arg2][arg3] + class201.field3694[arg1][arg2][arg3 + 1] + class201.field3694[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class206 var16 = var14.field3640;
                                    if (var16 != null) {
                                        if (var16.field3787.method65()) {
                                            arg0.method70(var16.field3787, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3780 != null && var16.field3780.method65()) {
                                            arg0.method70(var16.field3780, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3627; var17++) {
                                        class49 var18 = var14.field3646[var17];
                                        if (var18 != null && var18.field800.method65() && (var18.field816 == var12 || var7 == var12) && (var18.field796 == var13 || var9 == var13)) {
                                            int var19 = var18.field812 + 1 - var18.field816;
                                            int var20 = var18.field793 + 1 - var18.field796;
                                            arg0.method70(var18.field800, (var18.field816 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field796 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lli;IZLli;)V")
    public static final void method5(class185 arg0, int arg1, boolean arg2, class185 arg3) {
        field10++;
        class7.method77(arg0, arg1, -1, -14486, (class185) null, arg3);
        if (!arg2) {
            field30 = false;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public final void method6(byte arg0) throws IOException {
        if (arg0 < 44) {
            this.method9(-43);
        }
        this.method7(-1);
        field17++;
        this.field2.method617((byte) -110);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    private final void method7(int arg0) throws IOException {
        if ((long) arg0 != this.field28) {
            if (this.field3 != this.field28) {
                this.field2.method613((byte) -75, this.field28);
                this.field3 = this.field28;
            }
            this.field2.method616(false, this.field24, this.field8, 0);
            long var2 = -1L;
            if (this.field14 < ((long) this.field8 + this.field28) && ((long) this.field8 + this.field28) <= (this.field14 + ((long) this.field27))) {
                var2 = (long) this.field8 + this.field28;
            } else if (this.field28 < (long) this.field27 + this.field14 && ((long) this.field8 + this.field28) >= (this.field14 + ((long) this.field27))) {
                var2 = this.field14 + ((long) this.field27);
            }
            this.field3 += (long) this.field8;
            if (this.field19 < this.field3) {
                this.field19 = this.field3;
            }
            long var4 = -1L;
            if (this.field28 >= this.field14 && this.field28 < (long) this.field27 + this.field14) {
                var4 = this.field28;
            } else if (this.field14 >= this.field28 && this.field14 < this.field28 + ((long) this.field8)) {
                var4 = this.field14;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class190.method1370(this.field24, (int) (var4 - this.field28), this.field9, (int) (var4 - this.field14), var6);
            }
            this.field28 = -1L;
            this.field8 = 0;
        }
        field22++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IJ)V")
    public final void method8(int arg0, long arg1) throws IOException {
        field4++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method9(arg0 - 16196));
        }
        this.field26 = arg1;
        if (arg0 != 16197) {
            method3(11);
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method9(int arg0) {
        field18++;
        if (arg0 != 1) {
            this.field8 = -31;
        }
        return this.field2.method612(arg0 - 120);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
    private final void method10(byte arg0) throws IOException {
        this.field27 = 0;
        if (this.field3 != this.field26) {
            this.field2.method613((byte) -75, this.field26);
            this.field3 = this.field26;
        }
        field29++;
        if (arg0 != 27) {
            method2(3, (byte) -49);
        }
        this.field14 = this.field26;
        while (this.field9.length > this.field27) {
            int var2 = this.field9.length - this.field27;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2.method615(var2, (byte) -92, this.field9, this.field27);
            if (var3 == -1) {
                break;
            }
            this.field3 += (long) var3;
            this.field27 += var3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)[Lse;")
    public static final class10[] method11(byte arg0) {
        class10[] var1 = new class10[class27.field457];
        for (int var2 = 0; var2 < class27.field457; var2++) {
            var1[var2] = new class34(class87.field1716, class210.field3839, class145.field2766[var2], class249.field4418[var2], class55.field940[var2], class258.field4591[var2], class174.field3182[var2], class211.field3842);
        }
        field15++;
        if (arg0 > -117) {
            return null;
        } else {
            class269.method1827((byte) -119);
            return var1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIZ)V")
    public static final void method12(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field12++;
        if (!arg4) {
            field16 = 84;
        }
        if (arg1 < arg0) {
            class157.method1116(arg3, arg1, arg0, class145.field2757[arg2], -29);
        } else {
            class157.method1116(arg3, arg0, arg1, class145.field2757[arg2], -26);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([BIII)V")
    public final void method13(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field7++;
        try {
            if ((long) arg2 + this.field26 > this.field20) {
                this.field20 = (long) arg2 + this.field26;
            }
            if (this.field28 != -1L && (this.field26 < this.field28 || this.field26 > (this.field28 + ((long) this.field8)))) {
                this.method7(~arg1);
            }
            if (this.field28 != -1L && ((long) arg2 + this.field26) > ((long) this.field24.length + this.field28)) {
                int var5 = (int) (this.field28 + (long) this.field24.length - this.field26);
                arg2 -= var5;
                class190.method1370(arg0, arg3, this.field24, (int) (this.field26 - this.field28), var5);
                this.field26 += (long) var5;
                this.field8 = this.field24.length;
                arg3 += var5;
                this.method7(-1);
            }
            if (arg2 > this.field24.length) {
                if (this.field3 != this.field26) {
                    this.field2.method613((byte) -75, this.field26);
                    this.field3 = this.field26;
                }
                long var6 = -1L;
                this.field2.method616(false, arg0, arg2, arg3);
                long var8 = -1L;
                if (this.field14 < (long) arg2 + this.field26 && (long) this.field27 + this.field14 >= (long) arg2 + this.field26) {
                    var8 = (long) arg2 + this.field26;
                } else if (this.field26 < this.field14 + ((long) this.field27) && ((long) this.field27 + this.field14) <= (this.field26 + ((long) arg2))) {
                    var8 = (long) this.field27 + this.field14;
                }
                if (this.field14 <= this.field26 && this.field26 < (long) this.field27 + this.field14) {
                    var6 = this.field26;
                } else if (this.field26 <= this.field14 && this.field14 < ((long) arg2 + this.field26)) {
                    var6 = this.field14;
                }
                this.field3 += (long) arg2;
                if (this.field3 > this.field19) {
                    this.field19 = this.field3;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class190.method1370(arg0, (int) ((long) arg3 + var6 - this.field26), this.field9, (int) (var6 - this.field14), var10);
                }
                this.field26 += (long) arg2;
            } else if (arg1 < arg2) {
                if (this.field28 == -1L) {
                    this.field28 = this.field26;
                }
                class190.method1370(arg0, arg3, this.field24, (int) (this.field26 - this.field28), arg2);
                this.field26 += (long) arg2;
                if (((long) this.field8) < (this.field26 - this.field28)) {
                    this.field8 = (int) (this.field26 - this.field28);
                }
            }
        } catch (IOException var12) {
            this.field3 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method14(String arg0, int arg1) throws ClassNotFoundException {
        field11++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else {
            if (arg1 < 111) {
                method1(-35, 101);
            }
            if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z[B)V")
    public final void method15(boolean arg0, byte[] arg1) throws IOException {
        this.method16(0, 0, arg1, arg1.length);
        field13++;
        if (arg0) {
            this.field8 = -86;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II[BI)V")
    public final void method16(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field25++;
        try {
            if (arg2.length < (arg1 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field28 != -1L && this.field28 <= this.field26 && (long) this.field8 + this.field28 >= (long) arg3 + this.field26) {
                class190.method1370(this.field24, (int) (this.field26 - this.field28), arg2, arg1, arg3);
                this.field26 += (long) arg3;
                return;
            }
            long var5 = this.field26;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field14 <= this.field26 && ((long) this.field27 + this.field14) > this.field26) {
                int var9 = (int) ((long) this.field27 - (this.field26 - this.field14));
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class190.method1370(this.field9, (int) (this.field26 - this.field14), arg2, arg1, var9);
                arg1 += var9;
                this.field26 += (long) var9;
                arg3 -= var9;
            }
            if (this.field9.length < arg3) {
                this.field2.method613((byte) -75, this.field26);
                this.field3 = this.field26;
                while (arg3 > 0) {
                    int var11 = this.field2.method615(arg3, (byte) -92, arg2, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    arg1 += var11;
                    this.field3 += (long) var11;
                    arg3 -= var11;
                    this.field26 += (long) var11;
                }
            } else if (arg3 > 0) {
                int var10 = arg3;
                this.method10((byte) 27);
                if (this.field27 < arg3) {
                    var10 = this.field27;
                }
                class190.method1370(this.field9, 0, arg2, arg1, var10);
                arg1 += var10;
                this.field26 += (long) var10;
                arg3 -= var10;
            }
            if (this.field28 != -1L) {
                if (this.field28 > this.field26 && arg3 > 0) {
                    int var12 = arg1 + ((int) (this.field28 - this.field26));
                    if ((arg1 + arg3) < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (arg1 < var12) {
                        arg3--;
                        arg2[arg1++] = 0;
                        this.field26++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field28 && (var5 + ((long) var7)) > this.field28) {
                    var13 = this.field28;
                } else if (this.field28 <= var5 && var5 < ((long) this.field8 + this.field28)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field8 + this.field28 > var5 && ((long) var7 + var5) >= ((long) this.field8 + this.field28)) {
                    var15 = (long) this.field8 + this.field28;
                } else if (var5 + ((long) var7) > this.field28 && (long) var7 + var5 <= (long) this.field8 + this.field28) {
                    var15 = var5 + ((long) var7);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class190.method1370(this.field24, (int) (var13 - this.field28), arg2, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field26) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field26));
                        this.field26 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3 = -1L;
            throw var19;
        }
        if (arg3 > arg0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(B)J")
    public final long method17(byte arg0) {
        field21++;
        int var2 = -103 % ((arg0 + 11) / 38);
        return this.field20;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
    public static void method18(int arg0) {
        if (arg0 <= -107) {
            field23 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lag;II)V")
    public class1(class95 arg0, int arg1, int arg2) throws IOException {
        this.field2 = arg0;
        this.field20 = this.field19 = arg0.method614(-114);
        this.field26 = 0L;
        this.field24 = new byte[arg2];
        this.field9 = new byte[arg1];
    }
}
