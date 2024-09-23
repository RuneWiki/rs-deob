import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MUKVLYLC")
public class class33 extends class40 {

    @OriginalMember(owner = "MUKVLYLC", name = "j", descriptor = "I")
    private int field937 = 7;

    @OriginalMember(owner = "MUKVLYLC", name = "k", descriptor = "I")
    private int field938 = 8;

    @OriginalMember(owner = "MUKVLYLC", name = "l", descriptor = "Z")
    private boolean field939 = true;

    @OriginalMember(owner = "MUKVLYLC", name = "m", descriptor = "Z")
    private boolean field940 = true;

    @OriginalMember(owner = "MUKVLYLC", name = "n", descriptor = "Z")
    private boolean field941 = false;

    @OriginalMember(owner = "MUKVLYLC", name = "o", descriptor = "I")
    private int field942 = -10167;

    @OriginalMember(owner = "MUKVLYLC", name = "p", descriptor = "I")
    private int field943 = 224;

    @OriginalMember(owner = "MUKVLYLC", name = "q", descriptor = "I")
    private int field944 = 224;

    @OriginalMember(owner = "MUKVLYLC", name = "r", descriptor = "I")
    private int field945 = 411;

    @OriginalMember(owner = "MUKVLYLC", name = "s", descriptor = "I")
    private int field946 = 8;

    @OriginalMember(owner = "MUKVLYLC", name = "t", descriptor = "Z")
    private boolean field947 = true;

    @OriginalMember(owner = "MUKVLYLC", name = "u", descriptor = "I")
    private int field948 = -777;

    @OriginalMember(owner = "MUKVLYLC", name = "v", descriptor = "Z")
    private boolean field949 = false;

    @OriginalMember(owner = "MUKVLYLC", name = "x", descriptor = "I")
    private int field951 = 393;

    @OriginalMember(owner = "MUKVLYLC", name = "y", descriptor = "Z")
    private boolean field952 = true;

    @OriginalMember(owner = "MUKVLYLC", name = "z", descriptor = "[B")
    public byte[] field953;

    @OriginalMember(owner = "MUKVLYLC", name = "A", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "MUKVLYLC", name = "C", descriptor = "[I")
    private static int[] field956 = new int[256];

    @OriginalMember(owner = "MUKVLYLC", name = "D", descriptor = "[I")
    private static final int[] field957;

    @OriginalMember(owner = "MUKVLYLC", name = "I", descriptor = "LSWVPDERM;")
    private static class56 field962;

    @OriginalMember(owner = "MUKVLYLC", name = "J", descriptor = "LSWVPDERM;")
    private static class56 field963;

    @OriginalMember(owner = "MUKVLYLC", name = "K", descriptor = "LSWVPDERM;")
    private static class56 field964;

    @OriginalMember(owner = "MUKVLYLC", name = "L", descriptor = "[C")
    private static char[] field965;

    @OriginalMember(owner = "MUKVLYLC", name = "w", descriptor = "I")
    private int field950;

    @OriginalMember(owner = "MUKVLYLC", name = "B", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "MUKVLYLC", name = "F", descriptor = "I")
    private static int field959;

    @OriginalMember(owner = "MUKVLYLC", name = "G", descriptor = "I")
    private static int field960;

    @OriginalMember(owner = "MUKVLYLC", name = "H", descriptor = "I")
    private static int field961;

    @OriginalMember(owner = "MUKVLYLC", name = "E", descriptor = "LLUUCVUQY;")
    public class30 field958;

    @OriginalMember(owner = "MUKVLYLC", name = "M", descriptor = "Z")
    public static boolean field966;

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(ZI)LMUKVLYLC;")
    public static class33 method280(boolean arg0, int arg1) {
        class56 var2 = field963;
        synchronized (field963) {
            class33 var3 = null;
            if (arg1 == 0 && field959 > 0) {
                field959--;
                var3 = (class33) field962.method481();
            } else if (arg1 == 1 && field960 > 0) {
                field960--;
                var3 = (class33) field963.method481();
            } else if (arg1 == 2 && field961 > 0) {
                field961--;
                var3 = (class33) field964.method481();
            }
            if (var3 != null) {
                var3.field954 = 0;
                return var3;
            }
        }
        class33 var5 = new class33(-525);
        var5.field954 = 0;
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg1 == 0) {
            var5.field953 = new byte[100];
        } else if (arg1 == 1) {
            var5.field953 = new byte[5000];
        } else {
            var5.field953 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "<init>", descriptor = "(I)V")
    private class33(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "MUKVLYLC", name = "<init>", descriptor = "(I[B)V")
    public class33(int arg0, byte[] arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        this.field953 = arg1;
        this.field954 = 0;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(II)V")
    public void method281(int arg0, int arg1) {
        if (arg1 == -4488) {
            this.field953[this.field954++] = (byte) (arg0 + this.field958.method265());
        }
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(I)V")
    public void method282(int arg0) {
        this.field953[this.field954++] = (byte) arg0;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "b", descriptor = "(I)V")
    public void method283(int arg0) {
        this.field953[this.field954++] = (byte) (arg0 >> 8);
        this.field953[this.field954++] = (byte) arg0;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "b", descriptor = "(II)V")
    public void method284(int arg0, int arg1) {
        this.field953[this.field954++] = (byte) arg0;
        this.field953[this.field954++] = (byte) (arg0 >> 8);
        if (arg1 <= 0) {
            this.field949 = !this.field949;
        }
    }

    @OriginalMember(owner = "MUKVLYLC", name = "c", descriptor = "(I)V")
    public void method285(int arg0) {
        this.field953[this.field954++] = (byte) (arg0 >> 16);
        this.field953[this.field954++] = (byte) (arg0 >> 8);
        this.field953[this.field954++] = (byte) arg0;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "d", descriptor = "(I)V")
    public void method286(int arg0) {
        this.field953[this.field954++] = (byte) (arg0 >> 24);
        this.field953[this.field954++] = (byte) (arg0 >> 16);
        this.field953[this.field954++] = (byte) (arg0 >> 8);
        this.field953[this.field954++] = (byte) arg0;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "c", descriptor = "(II)V")
    public void method287(int arg0, int arg1) {
        this.field953[this.field954++] = (byte) arg0;
        this.field953[this.field954++] = (byte) (arg0 >> 8);
        this.field953[this.field954++] = (byte) (arg0 >> 16);
        this.field953[this.field954++] = (byte) (arg0 >> 24);
        int var3 = 76 / arg1;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(JB)V")
    public void method288(long arg0, byte arg1) {
        if (arg1 != 7) {
            return;
        }
        this.field953[this.field954++] = (byte) (arg0 >> 56);
        this.field953[this.field954++] = (byte) (arg0 >> 48);
        this.field953[this.field954++] = (byte) (arg0 >> 40);
        this.field953[this.field954++] = (byte) (arg0 >> 32);
        this.field953[this.field954++] = (byte) (arg0 >> 24);
        this.field953[this.field954++] = (byte) (arg0 >> 16);
        this.field953[this.field954++] = (byte) (arg0 >> 8);
        this.field953[this.field954++] = (byte) arg0;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method289(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field953, this.field954);
        this.field954 += arg0.length();
        this.field953[this.field954++] = 10;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(I[BII)V")
    public void method290(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 20417) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg2; var6 < arg2 + arg3; var6++) {
            this.field953[this.field954++] = arg1[var6];
        }
    }

    @OriginalMember(owner = "MUKVLYLC", name = "d", descriptor = "(II)V")
    public void method291(int arg0, int arg1) {
        this.field953[this.field954 - arg0 - 1] = (byte) arg0;
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "MUKVLYLC", name = "c", descriptor = "()I")
    public int method292() {
        return this.field953[this.field954++] & 0xFF;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "d", descriptor = "()B")
    public byte method293() {
        return this.field953[this.field954++];
    }

    @OriginalMember(owner = "MUKVLYLC", name = "e", descriptor = "()I")
    public int method294() {
        this.field954 += 2;
        return ((this.field953[this.field954 - 2] & 0xFF) << 8) + (this.field953[this.field954 - 1] & 0xFF);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "f", descriptor = "()I")
    public int method295() {
        this.field954 += 2;
        int var1 = ((this.field953[this.field954 - 2] & 0xFF) << 8) + (this.field953[this.field954 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "g", descriptor = "()I")
    public int method296() {
        this.field954 += 3;
        return (this.field953[this.field954 - 1] & 0xFF) + ((this.field953[this.field954 - 3] & 0xFF) << 16) + ((this.field953[this.field954 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "h", descriptor = "()I")
    public int method297() {
        this.field954 += 4;
        return (this.field953[this.field954 - 1] & 0xFF) + ((this.field953[this.field954 - 2] & 0xFF) << 8) + ((this.field953[this.field954 - 4] & 0xFF) << 24) + ((this.field953[this.field954 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "e", descriptor = "(I)J")
    public long method298(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method297() & 0xFFFFFFFFL;
        long var4 = (long) this.method297() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "i", descriptor = "()Ljava/lang/String;")
    public String method299() {
        int var1 = this.field954;
        while (this.field953[this.field954++] != 10) {
        }
        return new String(this.field953, var1, this.field954 - var1 - 1);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(B)[B")
    public byte[] method300(byte arg0) {
        int var2 = this.field954;
        while (this.field953[this.field954++] != 10) {
        }
        byte[] var3 = new byte[this.field954 - var2 - 1];
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = var2; var5 < this.field954 - 1; var5++) {
            var3[var5 - var2] = this.field953[var5];
        }
        return var3;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "b", descriptor = "(I[BII)V")
    public void method301(int arg0, byte[] arg1, int arg2, int arg3) {
        while (arg2 >= 0) {
            this.field948 = -284;
        }
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            arg1[var5] = this.field953[this.field954++];
        }
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(Z)V")
    public void method302(boolean arg0) {
        if (!arg0) {
            this.field955 = this.field954 * 8;
        }
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(BI)I")
    public int method303(byte arg0, int arg1) {
        if (arg0 != 8) {
            return this.field950;
        }
        int var3 = this.field955 >> 3;
        int var4 = 8 - (this.field955 & 0x7);
        int var5 = 0;
        this.field955 += arg1;
        while (arg1 > var4) {
            var5 += (this.field953[var3++] & field957[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field953[var3] & field957[var4]) + var5;
        } else {
            var6 = (this.field953[var3] >> var4 - arg1 & field957[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "f", descriptor = "(I)V")
    public void method304(int arg0) {
        this.field954 = (this.field955 + 7) / 8;
        if (arg0 != 8) {
            this.field952 = !this.field952;
        }
    }

    @OriginalMember(owner = "MUKVLYLC", name = "j", descriptor = "()I")
    public int method305() {
        int var1 = this.field953[this.field954] & 0xFF;
        return var1 < 128 ? this.method292() - 64 : this.method294() - 49152;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "k", descriptor = "()I")
    public int method306() {
        int var1 = this.field953[this.field954] & 0xFF;
        return var1 < 128 ? this.method292() : this.method294() - 32768;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method307(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field954;
        this.field954 = 0;
        byte[] var5 = new byte[var4];
        if (arg1 <= 0) {
            this.field947 = !this.field947;
        }
        this.method301(var4, var5, -834, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field954 = 0;
        this.method282(var8.length);
        this.method290(20417, var8, 0, var8.length);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "e", descriptor = "(II)V")
    public void method308(int arg0, int arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field953[this.field954++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(IB)V")
    public void method309(int arg0, byte arg1) {
        if (arg1 != 6) {
            this.field948 = -235;
        }
        this.field953[this.field954++] = (byte) -arg0;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "g", descriptor = "(I)I")
    public int method310(int arg0) {
        if (arg0 != 46155) {
            this.field938 = 195;
        }
        return this.field953[this.field954++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "b", descriptor = "(B)I")
    public int method311(byte arg0) {
        return arg0 == -93 ? -this.field953[this.field954++] & 0xFF : this.field937;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "h", descriptor = "(I)I")
    public int method312(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return 128 - this.field953[this.field954++] & 0xFF;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "b", descriptor = "(Z)B")
    public byte method313(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) (this.field953[this.field954++] - 128);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "i", descriptor = "(I)B")
    public byte method314(int arg0) {
        if (arg0 != 33314) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) -this.field953[this.field954++];
    }

    @OriginalMember(owner = "MUKVLYLC", name = "b", descriptor = "(IB)V")
    public void method315(int arg0, byte arg1) {
        if (arg1 != -118) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field953[this.field954++] = (byte) arg0;
        this.field953[this.field954++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "b", descriptor = "(BI)V")
    public void method316(byte arg0, int arg1) {
        if (arg0 == 3) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field953[this.field954++] = (byte) (arg1 >> 8);
        this.field953[this.field954++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "c", descriptor = "(IB)V")
    public void method317(int arg0, byte arg1) {
        this.field953[this.field954++] = (byte) (arg0 + 128);
        if (arg1 == -34) {
            this.field953[this.field954++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "MUKVLYLC", name = "c", descriptor = "(B)I")
    public int method318(byte arg0) {
        this.field954 += 2;
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field938 = -20;
        }
        return ((this.field953[this.field954 - 1] & 0xFF) << 8) + (this.field953[this.field954 - 2] & 0xFF);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "j", descriptor = "(I)I")
    public int method319(int arg0) {
        this.field954 += 2;
        while (arg0 >= 0) {
            this.field949 = !this.field949;
        }
        return ((this.field953[this.field954 - 2] & 0xFF) << 8) + (this.field953[this.field954 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "d", descriptor = "(B)I")
    public int method320(byte arg0) {
        if (arg0 != 1) {
            this.field939 = !this.field939;
        }
        this.field954 += 2;
        return ((this.field953[this.field954 - 1] & 0xFF) << 8) + (this.field953[this.field954 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "e", descriptor = "(B)I")
    public int method321(byte arg0) {
        if (arg0 != 104) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field954 += 2;
        int var3 = ((this.field953[this.field954 - 1] & 0xFF) << 8) + (this.field953[this.field954 - 2] & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "f", descriptor = "(B)I")
    public int method322(byte arg0) {
        this.field954 += 2;
        if (arg0 != -55) {
            return this.field951;
        }
        int var2 = ((this.field953[this.field954 - 2] & 0xFF) << 8) + (this.field953[this.field954 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "c", descriptor = "(Z)I")
    public int method323(boolean arg0) {
        this.field954 += 2;
        if (!arg0) {
            return this.field937;
        }
        int var2 = ((this.field953[this.field954 - 1] & 0xFF) << 8) + (this.field953[this.field954 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "MUKVLYLC", name = "f", descriptor = "(II)V")
    public void method324(int arg0, int arg1) {
        this.field953[this.field954++] = (byte) (arg0 >> 8);
        this.field953[this.field954++] = (byte) arg0;
        this.field953[this.field954++] = (byte) (arg0 >> 24);
        this.field953[this.field954++] = (byte) (arg0 >> 16);
        int var3 = 60 / arg1;
        if (class37.field1083) {
        }
    }

    @OriginalMember(owner = "MUKVLYLC", name = "k", descriptor = "(I)I")
    public int method325(int arg0) {
        this.field954 += 4;
        if (arg0 != 2) {
            this.field939 = !this.field939;
        }
        return (this.field953[this.field954 - 3] & 0xFF) + ((this.field953[this.field954 - 4] & 0xFF) << 8) + ((this.field953[this.field954 - 2] & 0xFF) << 24) + ((this.field953[this.field954 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "l", descriptor = "(I)I")
    public int method326(int arg0) {
        this.field954 += 4;
        if (arg0 != 5419) {
            this.field944 = 298;
        }
        return (this.field953[this.field954 - 2] & 0xFF) + ((this.field953[this.field954 - 1] & 0xFF) << 8) + ((this.field953[this.field954 - 3] & 0xFF) << 24) + ((this.field953[this.field954 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(Z[BII)V")
    public void method327(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg2 + arg3 - 1; var6 >= arg3; var6--) {
            this.field953[this.field954++] = arg1[var6];
        }
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "([BIII)V")
    public void method328(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 5 || arg1 > 5) {
            this.field951 = -470;
        }
        for (int var5 = arg2 + arg3 - 1; var5 >= arg2; var5--) {
            arg0[var5] = this.field953[this.field954++];
        }
    }

    @OriginalMember(owner = "MUKVLYLC", name = "a", descriptor = "(II[BB)V")
    public void method329(int arg0, int arg1, byte[] arg2, byte arg3) {
        if (arg3 == 8) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = arg0 + arg1 - 1; var7 >= arg0; var7--) {
            arg2[var7] = (byte) (this.field953[this.field954++] - 128);
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
            field956[var0] = var1;
        }
        field957 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field962 = new class56(306);
        field963 = new class56(306);
        field964 = new class56(306);
        field965 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
