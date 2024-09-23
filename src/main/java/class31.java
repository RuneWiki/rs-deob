import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JHKSAGUC")
public class class31 extends class1 {

    @OriginalMember(owner = "JHKSAGUC", name = "i", descriptor = "B")
    private byte field884 = 5;

    @OriginalMember(owner = "JHKSAGUC", name = "j", descriptor = "I")
    private int field885 = 4;

    @OriginalMember(owner = "JHKSAGUC", name = "k", descriptor = "I")
    private int field886 = -874;

    @OriginalMember(owner = "JHKSAGUC", name = "l", descriptor = "I")
    private int field887 = -615;

    @OriginalMember(owner = "JHKSAGUC", name = "m", descriptor = "Z")
    private boolean field888 = false;

    @OriginalMember(owner = "JHKSAGUC", name = "o", descriptor = "Z")
    private boolean field890 = false;

    @OriginalMember(owner = "JHKSAGUC", name = "p", descriptor = "Z")
    private boolean field891 = true;

    @OriginalMember(owner = "JHKSAGUC", name = "q", descriptor = "B")
    private byte field892 = 81;

    @OriginalMember(owner = "JHKSAGUC", name = "r", descriptor = "I")
    private int field893 = 48759;

    @OriginalMember(owner = "JHKSAGUC", name = "s", descriptor = "Z")
    private boolean field894 = true;

    @OriginalMember(owner = "JHKSAGUC", name = "t", descriptor = "Z")
    private boolean field895 = true;

    @OriginalMember(owner = "JHKSAGUC", name = "v", descriptor = "I")
    private int field897 = 6;

    @OriginalMember(owner = "JHKSAGUC", name = "w", descriptor = "Z")
    private boolean field898 = false;

    @OriginalMember(owner = "JHKSAGUC", name = "x", descriptor = "Z")
    private boolean field899 = true;

    @OriginalMember(owner = "JHKSAGUC", name = "y", descriptor = "[B")
    public byte[] field900;

    @OriginalMember(owner = "JHKSAGUC", name = "z", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "JHKSAGUC", name = "B", descriptor = "[I")
    private static int[] field903 = new int[256];

    @OriginalMember(owner = "JHKSAGUC", name = "C", descriptor = "[I")
    private static final int[] field904;

    @OriginalMember(owner = "JHKSAGUC", name = "H", descriptor = "LOUZUCGGU;")
    private static class48 field909;

    @OriginalMember(owner = "JHKSAGUC", name = "I", descriptor = "LOUZUCGGU;")
    private static class48 field910;

    @OriginalMember(owner = "JHKSAGUC", name = "J", descriptor = "LOUZUCGGU;")
    private static class48 field911;

    @OriginalMember(owner = "JHKSAGUC", name = "K", descriptor = "[C")
    private static char[] field912;

    @OriginalMember(owner = "JHKSAGUC", name = "n", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "JHKSAGUC", name = "u", descriptor = "I")
    private int field896;

    @OriginalMember(owner = "JHKSAGUC", name = "A", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "JHKSAGUC", name = "E", descriptor = "I")
    private static int field906;

    @OriginalMember(owner = "JHKSAGUC", name = "F", descriptor = "I")
    private static int field907;

    @OriginalMember(owner = "JHKSAGUC", name = "G", descriptor = "I")
    private static int field908;

    @OriginalMember(owner = "JHKSAGUC", name = "D", descriptor = "LZPIYFABJ;")
    public class72 field905;

    @OriginalMember(owner = "JHKSAGUC", name = "L", descriptor = "Z")
    public static boolean field913;

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(II)LJHKSAGUC;")
    public static class31 method294(int arg0, int arg1) {
        class48 var2 = field910;
        synchronized (field910) {
            class31 var3 = null;
            if (arg1 == 0 && field906 > 0) {
                field906--;
                var3 = (class31) field909.method392();
            } else if (arg1 == 1 && field907 > 0) {
                field907--;
                var3 = (class31) field910.method392();
            } else if (arg1 == 2 && field908 > 0) {
                field908--;
                var3 = (class31) field911.method392();
            }
            if (var3 != null) {
                var3.field901 = 0;
                return var3;
            }
        }
        if (arg0 != -37580) {
            throw new NullPointerException();
        }
        class31 var5 = new class31(38839);
        var5.field901 = 0;
        if (arg1 == 0) {
            var5.field900 = new byte[100];
        } else if (arg1 == 1) {
            var5.field900 = new byte[5000];
        } else {
            var5.field900 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "<init>", descriptor = "(I)V")
    private class31(int arg0) {
        if (arg0 != 38839) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "JHKSAGUC", name = "<init>", descriptor = "([BI)V")
    public class31(byte[] arg0, int arg1) {
        this.field900 = arg0;
        if (arg1 < 8 || arg1 > 8) {
            this.field897 = -241;
        }
        this.field901 = 0;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "b", descriptor = "(II)V")
    public void method295(int arg0, int arg1) {
        if (arg1 != 1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field900[this.field901++] = (byte) (arg0 + this.field905.method589());
    }

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(I)V")
    public void method296(int arg0) {
        this.field900[this.field901++] = (byte) arg0;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "b", descriptor = "(I)V")
    public void method297(int arg0) {
        this.field900[this.field901++] = (byte) (arg0 >> 8);
        this.field900[this.field901++] = (byte) arg0;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "c", descriptor = "(II)V")
    public void method298(int arg0, int arg1) {
        if (arg1 < this.field885 || arg1 > this.field885) {
            this.field895 = !this.field895;
        }
        this.field900[this.field901++] = (byte) arg0;
        this.field900[this.field901++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "c", descriptor = "(I)V")
    public void method299(int arg0) {
        this.field900[this.field901++] = (byte) (arg0 >> 16);
        this.field900[this.field901++] = (byte) (arg0 >> 8);
        this.field900[this.field901++] = (byte) arg0;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "d", descriptor = "(I)V")
    public void method300(int arg0) {
        this.field900[this.field901++] = (byte) (arg0 >> 24);
        this.field900[this.field901++] = (byte) (arg0 >> 16);
        this.field900[this.field901++] = (byte) (arg0 >> 8);
        this.field900[this.field901++] = (byte) arg0;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(IZ)V")
    public void method301(int arg0, boolean arg1) {
        this.field900[this.field901++] = (byte) arg0;
        this.field900[this.field901++] = (byte) (arg0 >> 8);
        this.field900[this.field901++] = (byte) (arg0 >> 16);
        if (!arg1) {
            this.field899 = !this.field899;
        }
        this.field900[this.field901++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(JB)V")
    public void method302(long arg0, byte arg1) {
        if (arg1 != -65) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field900[this.field901++] = (byte) (arg0 >> 56);
        this.field900[this.field901++] = (byte) (arg0 >> 48);
        this.field900[this.field901++] = (byte) (arg0 >> 40);
        this.field900[this.field901++] = (byte) (arg0 >> 32);
        this.field900[this.field901++] = (byte) (arg0 >> 24);
        this.field900[this.field901++] = (byte) (arg0 >> 16);
        this.field900[this.field901++] = (byte) (arg0 >> 8);
        this.field900[this.field901++] = (byte) arg0;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method303(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field900, this.field901);
        this.field901 += arg0.length();
        this.field900[this.field901++] = 10;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(II[BZ)V")
    public void method304(int arg0, int arg1, byte[] arg2, boolean arg3) {
        if (arg3) {
            for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
                this.field900[this.field901++] = arg2[var5];
            }
        }
    }

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(BI)V")
    public void method305(byte arg0, int arg1) {
        if (arg0 != 103) {
            this.field898 = !this.field898;
        }
        this.field900[this.field901 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "c", descriptor = "()I")
    public int method306() {
        return this.field900[this.field901++] & 0xFF;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "d", descriptor = "()B")
    public byte method307() {
        return this.field900[this.field901++];
    }

    @OriginalMember(owner = "JHKSAGUC", name = "e", descriptor = "()I")
    public int method308() {
        this.field901 += 2;
        return ((this.field900[this.field901 - 2] & 0xFF) << 8) + (this.field900[this.field901 - 1] & 0xFF);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "f", descriptor = "()I")
    public int method309() {
        this.field901 += 2;
        int var1 = ((this.field900[this.field901 - 2] & 0xFF) << 8) + (this.field900[this.field901 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "g", descriptor = "()I")
    public int method310() {
        this.field901 += 3;
        return (this.field900[this.field901 - 1] & 0xFF) + ((this.field900[this.field901 - 3] & 0xFF) << 16) + ((this.field900[this.field901 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "h", descriptor = "()I")
    public int method311() {
        this.field901 += 4;
        return (this.field900[this.field901 - 1] & 0xFF) + ((this.field900[this.field901 - 2] & 0xFF) << 8) + ((this.field900[this.field901 - 4] & 0xFF) << 24) + ((this.field900[this.field901 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "e", descriptor = "(I)J")
    public long method312(int arg0) {
        long var2 = (long) this.method311() & 0xFFFFFFFFL;
        long var4 = (long) this.method311() & 0xFFFFFFFFL;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "i", descriptor = "()Ljava/lang/String;")
    public String method313() {
        int var1 = this.field901;
        while (this.field900[this.field901++] != 10) {
        }
        return new String(this.field900, var1, this.field901 - var1 - 1);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "f", descriptor = "(I)[B")
    public byte[] method314(int arg0) {
        int var2 = this.field901;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        while (this.field900[this.field901++] != 10) {
        }
        byte[] var3 = new byte[this.field901 - var2 - 1];
        for (int var4 = var2; var4 < this.field901 - 1; var4++) {
            var3[var4 - var2] = this.field900[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(III[B)V")
    public void method315(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != 0) {
            this.field899 = !this.field899;
        }
        for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
            arg3[var5] = this.field900[this.field901++];
        }
    }

    @OriginalMember(owner = "JHKSAGUC", name = "g", descriptor = "(I)V")
    public void method316(int arg0) {
        this.field902 = this.field901 * 8;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "JHKSAGUC", name = "b", descriptor = "(BI)I")
    public int method317(byte arg0, int arg1) {
        if (arg0 != 9) {
            return 4;
        }
        boolean var3 = false;
        int var4 = this.field902 >> 3;
        int var5 = 8 - (this.field902 & 0x7);
        int var6 = 0;
        this.field902 += arg1;
        while (arg1 > var5) {
            var6 += (this.field900[var4++] & field904[var5]) << arg1 - var5;
            arg1 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg1 == var5) {
            var7 = (this.field900[var4] & field904[var5]) + var6;
        } else {
            var7 = (this.field900[var4] >> var5 - arg1 & field904[arg1]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(B)V")
    public void method318(byte arg0) {
        if (arg0 == -66) {
            this.field901 = (this.field902 + 7) / 8;
        }
    }

    @OriginalMember(owner = "JHKSAGUC", name = "j", descriptor = "()I")
    public int method319() {
        int var1 = this.field900[this.field901] & 0xFF;
        return var1 < 128 ? this.method306() - 64 : this.method308() - 49152;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "k", descriptor = "()I")
    public int method320() {
        int var1 = this.field900[this.field901] & 0xFF;
        return var1 < 128 ? this.method306() : this.method308() - 32768;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method321(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field901;
        this.field901 = 0;
        byte[] var5 = new byte[var4];
        this.method315(0, 0, var4, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg2);
        byte[] var8 = var7.toByteArray();
        this.field901 = 0;
        if (arg0 == 0) {
            this.method296(var8.length);
            this.method304(0, var8.length, var8, true);
        }
    }

    @OriginalMember(owner = "JHKSAGUC", name = "c", descriptor = "(BI)V")
    public void method322(byte arg0, int arg1) {
        if (arg0 != 99) {
            this.field886 = 287;
        }
        this.field900[this.field901++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "b", descriptor = "(IZ)V")
    public void method323(int arg0, boolean arg1) {
        if (!arg1) {
            this.field899 = !this.field899;
        }
        this.field900[this.field901++] = (byte) -arg0;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "d", descriptor = "(II)V")
    public void method324(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field897 = -125;
        }
        this.field900[this.field901++] = (byte) (128 - arg0);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "h", descriptor = "(I)I")
    public int method325(int arg0) {
        if (arg0 != -35277) {
            this.field895 = !this.field895;
        }
        return this.field900[this.field901++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "b", descriptor = "(B)I")
    public int method326(byte arg0) {
        if (arg0 != -15) {
            this.field897 = 46;
        }
        return -this.field900[this.field901++] & 0xFF;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "i", descriptor = "(I)I")
    public int method327(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return 128 - this.field900[this.field901++] & 0xFF;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "j", descriptor = "(I)B")
    public byte method328(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) (this.field900[this.field901++] - 128);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "c", descriptor = "(B)B")
    public byte method329(byte arg0) {
        if (arg0 != 57) {
            throw new NullPointerException();
        }
        return (byte) -this.field900[this.field901++];
    }

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(Z)B")
    public byte method330(boolean arg0) {
        if (arg0) {
            this.field889 = -310;
        }
        return (byte) (128 - this.field900[this.field901++]);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(IB)V")
    public void method331(int arg0, byte arg1) {
        if (this.field892 != arg1) {
            this.field886 = -238;
        }
        this.field900[this.field901++] = (byte) arg0;
        this.field900[this.field901++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "e", descriptor = "(II)V")
    public void method332(int arg0, int arg1) {
        this.field900[this.field901++] = (byte) (arg0 >> 8);
        this.field900[this.field901++] = (byte) (arg0 + 128);
        if (arg1 >= 0) {
            this.field891 = !this.field891;
        }
    }

    @OriginalMember(owner = "JHKSAGUC", name = "f", descriptor = "(II)V")
    public void method333(int arg0, int arg1) {
        this.field900[this.field901++] = (byte) (arg0 + 128);
        this.field900[this.field901++] = (byte) (arg0 >> 8);
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "JHKSAGUC", name = "d", descriptor = "(B)I")
    public int method334(byte arg0) {
        if (arg0 == -45) {
            this.field901 += 2;
            return ((this.field900[this.field901 - 1] & 0xFF) << 8) + (this.field900[this.field901 - 2] & 0xFF);
        } else {
            return this.field896;
        }
    }

    @OriginalMember(owner = "JHKSAGUC", name = "b", descriptor = "(Z)I")
    public int method335(boolean arg0) {
        if (!arg0) {
            this.field897 = 431;
        }
        this.field901 += 2;
        return ((this.field900[this.field901 - 2] & 0xFF) << 8) + (this.field900[this.field901 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "e", descriptor = "(B)I")
    public int method336(byte arg0) {
        if (arg0 != 87) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field901 += 2;
        return ((this.field900[this.field901 - 1] & 0xFF) << 8) + (this.field900[this.field901 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "k", descriptor = "(I)I")
    public int method337(int arg0) {
        this.field901 += 2;
        int var2 = ((this.field900[this.field901 - 1] & 0xFF) << 8) + (this.field900[this.field901 - 2] & 0xFF);
        if (arg0 != 0) {
            this.field896 = 451;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "l", descriptor = "(I)I")
    public int method338(int arg0) {
        int var2 = 70 / arg0;
        this.field901 += 2;
        int var3 = ((this.field900[this.field901 - 2] & 0xFF) << 8) + (this.field900[this.field901 - 1] - 128 & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "JHKSAGUC", name = "m", descriptor = "(I)I")
    public int method339(int arg0) {
        if (this.field893 == arg0) {
            this.field901 += 3;
            return (this.field900[this.field901 - 3] & 0xFF) + ((this.field900[this.field901 - 1] & 0xFF) << 16) + ((this.field900[this.field901 - 2] & 0xFF) << 8);
        } else {
            return this.field889;
        }
    }

    @OriginalMember(owner = "JHKSAGUC", name = "c", descriptor = "(Z)I")
    public int method340(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field901 += 4;
        return (this.field900[this.field901 - 4] & 0xFF) + ((this.field900[this.field901 - 3] & 0xFF) << 8) + ((this.field900[this.field901 - 1] & 0xFF) << 24) + ((this.field900[this.field901 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "d", descriptor = "(Z)I")
    public int method341(boolean arg0) {
        if (arg0) {
            this.field901 += 4;
            return (this.field900[this.field901 - 3] & 0xFF) + ((this.field900[this.field901 - 4] & 0xFF) << 8) + ((this.field900[this.field901 - 2] & 0xFF) << 24) + ((this.field900[this.field901 - 1] & 0xFF) << 16);
        } else {
            return this.field889;
        }
    }

    @OriginalMember(owner = "JHKSAGUC", name = "e", descriptor = "(Z)I")
    public int method342(boolean arg0) {
        this.field901 += 4;
        return arg0 ? this.field887 : (this.field900[this.field901 - 2] & 0xFF) + ((this.field900[this.field901 - 1] & 0xFF) << 8) + ((this.field900[this.field901 - 3] & 0xFF) << 24) + ((this.field900[this.field901 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "JHKSAGUC", name = "a", descriptor = "(BI[BI)V")
    public void method343(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != 80) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg1 + arg3 - 1; var6 >= arg3; var6--) {
            arg2[var6] = this.field900[this.field901++];
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field903[var0] = var1;
        }
        field904 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field909 = new class48(-392);
        field910 = new class48(-392);
        field911 = new class48(-392);
        field912 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
