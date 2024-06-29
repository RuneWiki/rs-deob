import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PQBRPYKE")
public class class41 extends class65 {

    @OriginalMember(owner = "client!PQBRPYKE", name = "h", descriptor = "Z")
    private boolean field1220 = false;

    @OriginalMember(owner = "client!PQBRPYKE", name = "i", descriptor = "B")
    private byte field1221 = 87;

    @OriginalMember(owner = "client!PQBRPYKE", name = "j", descriptor = "I")
    private int field1222 = 587;

    @OriginalMember(owner = "client!PQBRPYKE", name = "k", descriptor = "Z")
    private boolean field1223 = false;

    @OriginalMember(owner = "client!PQBRPYKE", name = "l", descriptor = "I")
    private int field1224 = 5;

    @OriginalMember(owner = "client!PQBRPYKE", name = "m", descriptor = "Z")
    private boolean field1225 = false;

    @OriginalMember(owner = "client!PQBRPYKE", name = "n", descriptor = "Z")
    private boolean field1226 = false;

    @OriginalMember(owner = "client!PQBRPYKE", name = "p", descriptor = "I")
    private int field1228 = 813;

    @OriginalMember(owner = "client!PQBRPYKE", name = "q", descriptor = "B")
    private byte field1229 = 2;

    @OriginalMember(owner = "client!PQBRPYKE", name = "r", descriptor = "I")
    private int field1230 = 642;

    @OriginalMember(owner = "client!PQBRPYKE", name = "s", descriptor = "I")
    private int field1231 = 759;

    @OriginalMember(owner = "client!PQBRPYKE", name = "t", descriptor = "I")
    private int field1232 = 34;

    @OriginalMember(owner = "client!PQBRPYKE", name = "u", descriptor = "I")
    private int field1233 = 180;

    @OriginalMember(owner = "client!PQBRPYKE", name = "v", descriptor = "I")
    private int field1234 = 5;

    @OriginalMember(owner = "client!PQBRPYKE", name = "w", descriptor = "Z")
    private boolean field1235 = true;

    @OriginalMember(owner = "client!PQBRPYKE", name = "x", descriptor = "Z")
    private boolean field1236 = true;

    @OriginalMember(owner = "client!PQBRPYKE", name = "y", descriptor = "Z")
    private boolean field1237 = false;

    @OriginalMember(owner = "client!PQBRPYKE", name = "z", descriptor = "Z")
    private boolean field1238 = true;

    @OriginalMember(owner = "client!PQBRPYKE", name = "B", descriptor = "[B")
    public byte[] field1240;

    @OriginalMember(owner = "client!PQBRPYKE", name = "C", descriptor = "I")
    public int field1241;

    @OriginalMember(owner = "client!PQBRPYKE", name = "E", descriptor = "[I")
    private static int[] field1243 = new int[256];

    @OriginalMember(owner = "client!PQBRPYKE", name = "F", descriptor = "[I")
    private static final int[] field1244;

    @OriginalMember(owner = "client!PQBRPYKE", name = "K", descriptor = "LVGFLNLXH;")
    private static class55 field1249;

    @OriginalMember(owner = "client!PQBRPYKE", name = "L", descriptor = "LVGFLNLXH;")
    private static class55 field1250;

    @OriginalMember(owner = "client!PQBRPYKE", name = "M", descriptor = "LVGFLNLXH;")
    private static class55 field1251;

    @OriginalMember(owner = "client!PQBRPYKE", name = "N", descriptor = "[C")
    private static char[] field1252;

    @OriginalMember(owner = "client!PQBRPYKE", name = "o", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client!PQBRPYKE", name = "A", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client!PQBRPYKE", name = "D", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!PQBRPYKE", name = "H", descriptor = "I")
    private static int field1246;

    @OriginalMember(owner = "client!PQBRPYKE", name = "I", descriptor = "I")
    private static int field1247;

    @OriginalMember(owner = "client!PQBRPYKE", name = "J", descriptor = "I")
    private static int field1248;

    @OriginalMember(owner = "client!PQBRPYKE", name = "G", descriptor = "LWUYFIEBK;")
    public class59 field1245;

    @OriginalMember(owner = "client!PQBRPYKE", name = "O", descriptor = "Z")
    public static boolean field1253;

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(II)LPQBRPYKE;")
    public static class41 method328(int arg0, int arg1) {
        if (arg0 < 6 || arg0 > 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class55 var3 = field1250;
        synchronized (field1250) {
            class41 var4 = null;
            if (arg1 == 0 && field1246 > 0) {
                field1246--;
                var4 = (class41) field1249.method531();
            } else if (arg1 == 1 && field1247 > 0) {
                field1247--;
                var4 = (class41) field1250.method531();
            } else if (arg1 == 2 && field1248 > 0) {
                field1248--;
                var4 = (class41) field1251.method531();
            }
            if (var4 != null) {
                var4.field1241 = 0;
                return var4;
            }
        }
        class41 var6 = new class41(5);
        var6.field1241 = 0;
        if (arg1 == 0) {
            var6.field1240 = new byte[100];
        } else if (arg1 == 1) {
            var6.field1240 = new byte[5000];
        } else {
            var6.field1240 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "<init>", descriptor = "(I)V")
    private class41(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "<init>", descriptor = "(I[B)V")
    public class41(int arg0, byte[] arg1) {
        int var3 = 49 / arg0;
        this.field1240 = arg1;
        this.field1241 = 0;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(IZ)V")
    public void method329(int arg0, boolean arg1) {
        if (arg1) {
            this.field1238 = !this.field1238;
        }
        this.field1240[this.field1241++] = (byte) (arg0 + this.field1245.method556());
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(I)V")
    public void method330(int arg0) {
        this.field1240[this.field1241++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "b", descriptor = "(I)V")
    public void method331(int arg0) {
        this.field1240[this.field1241++] = (byte) (arg0 >> 8);
        this.field1240[this.field1241++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "b", descriptor = "(II)V")
    public void method332(int arg0, int arg1) {
        this.field1240[this.field1241++] = (byte) arg1;
        this.field1240[this.field1241++] = (byte) (arg1 >> 8);
        if (arg0 != -46595) {
            this.field1232 = -57;
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "c", descriptor = "(I)V")
    public void method333(int arg0) {
        this.field1240[this.field1241++] = (byte) (arg0 >> 16);
        this.field1240[this.field1241++] = (byte) (arg0 >> 8);
        this.field1240[this.field1241++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "d", descriptor = "(I)V")
    public void method334(int arg0) {
        this.field1240[this.field1241++] = (byte) (arg0 >> 24);
        this.field1240[this.field1241++] = (byte) (arg0 >> 16);
        this.field1240[this.field1241++] = (byte) (arg0 >> 8);
        this.field1240[this.field1241++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(IB)V")
    public void method335(int arg0, byte arg1) {
        if (arg1 == 1) {
            this.field1240[this.field1241++] = (byte) arg0;
            this.field1240[this.field1241++] = (byte) (arg0 >> 8);
            this.field1240[this.field1241++] = (byte) (arg0 >> 16);
            this.field1240[this.field1241++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(JI)V")
    public void method336(long arg0, int arg1) {
        this.field1240[this.field1241++] = (byte) (arg0 >> 56);
        this.field1240[this.field1241++] = (byte) (arg0 >> 48);
        this.field1240[this.field1241++] = (byte) (arg0 >> 40);
        if (arg1 != 0) {
            return;
        }
        this.field1240[this.field1241++] = (byte) (arg0 >> 32);
        this.field1240[this.field1241++] = (byte) (arg0 >> 24);
        this.field1240[this.field1241++] = (byte) (arg0 >> 16);
        this.field1240[this.field1241++] = (byte) (arg0 >> 8);
        this.field1240[this.field1241++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method337(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1240, this.field1241);
        this.field1241 += arg0.length();
        this.field1240[this.field1241++] = 10;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(III[B)V")
    public void method338(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 == 0) {
            for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
                this.field1240[this.field1241++] = arg3[var5];
            }
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "b", descriptor = "(IB)V")
    public void method339(int arg0, byte arg1) {
        if (arg1 == 4) {
            this.field1240[this.field1241 - arg0 - 1] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "c", descriptor = "()I")
    public int method340() {
        return this.field1240[this.field1241++] & 0xFF;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "d", descriptor = "()B")
    public byte method341() {
        return this.field1240[this.field1241++];
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "e", descriptor = "()I")
    public int method342() {
        this.field1241 += 2;
        return ((this.field1240[this.field1241 - 2] & 0xFF) << 8) + (this.field1240[this.field1241 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "f", descriptor = "()I")
    public int method343() {
        this.field1241 += 2;
        int var1 = ((this.field1240[this.field1241 - 2] & 0xFF) << 8) + (this.field1240[this.field1241 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "g", descriptor = "()I")
    public int method344() {
        this.field1241 += 3;
        return (this.field1240[this.field1241 - 1] & 0xFF) + ((this.field1240[this.field1241 - 3] & 0xFF) << 16) + ((this.field1240[this.field1241 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "h", descriptor = "()I")
    public int method345() {
        this.field1241 += 4;
        return (this.field1240[this.field1241 - 1] & 0xFF) + ((this.field1240[this.field1241 - 2] & 0xFF) << 8) + ((this.field1240[this.field1241 - 4] & 0xFF) << 24) + ((this.field1240[this.field1241 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(Z)J")
    public long method346(boolean arg0) {
        if (arg0) {
            this.field1239 = -482;
        }
        long var2 = (long) this.method345() & 0xFFFFFFFFL;
        long var4 = (long) this.method345() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "i", descriptor = "()Ljava/lang/String;")
    public String method347() {
        int var1 = this.field1241;
        while (this.field1240[this.field1241++] != 10) {
        }
        return new String(this.field1240, var1, this.field1241 - var1 - 1);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "e", descriptor = "(I)[B")
    public byte[] method348(int arg0) {
        int var2 = this.field1241;
        if (arg0 != -18086) {
            throw new NullPointerException();
        }
        while (this.field1240[this.field1241++] != 10) {
        }
        byte[] var3 = new byte[this.field1241 - var2 - 1];
        for (int var4 = var2; var4 < this.field1241 - 1; var4++) {
            var3[var4 - var2] = this.field1240[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "b", descriptor = "(III[B)V")
    public void method349(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 == 7) {
            for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
                arg3[var5] = this.field1240[this.field1241++];
            }
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "f", descriptor = "(I)V")
    public void method350(int arg0) {
        if (arg0 != -19202) {
            this.field1220 = !this.field1220;
        }
        this.field1242 = this.field1241 * 8;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "c", descriptor = "(II)I")
    public int method351(int arg0, int arg1) {
        int var3 = this.field1242 >> 3;
        int var4 = 8 - (this.field1242 & 0x7);
        int var5 = 0;
        if (arg1 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1242 += arg0;
        while (arg0 > var4) {
            var5 += (this.field1240[var3++] & field1244[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg0 == var4) {
            var7 = (this.field1240[var3] & field1244[var4]) + var5;
        } else {
            var7 = (this.field1240[var3] >> var4 - arg0 & field1244[arg0]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "b", descriptor = "(Z)V")
    public void method352(boolean arg0) {
        if (arg0) {
            this.field1241 = (this.field1242 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "j", descriptor = "()I")
    public int method353() {
        int var1 = this.field1240[this.field1241] & 0xFF;
        return var1 < 128 ? this.method340() - 64 : this.method342() - 49152;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "k", descriptor = "()I")
    public int method354() {
        int var1 = this.field1240[this.field1241] & 0xFF;
        return var1 < 128 ? this.method340() : this.method342() - 32768;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
    public void method355(BigInteger arg0, BigInteger arg1, boolean arg2) {
        int var4 = this.field1241;
        this.field1241 = 0;
        byte[] var5 = new byte[var4];
        this.method349(7, var4, 0, var5);
        BigInteger var6 = new BigInteger(var5);
        if (arg2) {
            this.field1238 = !this.field1238;
        }
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field1241 = 0;
        this.method330(var8.length);
        this.method338(0, 0, var8.length, var8);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "c", descriptor = "(IB)V")
    public void method356(int arg0, byte arg1) {
        if (arg1 == 0) {
            boolean var3 = false;
            this.field1240[this.field1241++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "d", descriptor = "(II)V")
    public void method357(int arg0, int arg1) {
        if (arg1 == -42352) {
            this.field1240[this.field1241++] = (byte) -arg0;
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(BI)V")
    public void method358(byte arg0, int arg1) {
        if (this.field1229 == arg0) {
            this.field1240[this.field1241++] = (byte) (128 - arg1);
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "g", descriptor = "(I)I")
    public int method359(int arg0) {
        return arg0 == 0 ? this.field1240[this.field1241++] - 128 & 0xFF : this.field1222;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "h", descriptor = "(I)I")
    public int method360(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return -this.field1240[this.field1241++] & 0xFF;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "i", descriptor = "(I)I")
    public int method361(int arg0) {
        return arg0 == 0 ? 128 - this.field1240[this.field1241++] & 0xFF : this.field1222;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "j", descriptor = "(I)B")
    public byte method362(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return (byte) (this.field1240[this.field1241++] - 128);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "c", descriptor = "(Z)B")
    public byte method363(boolean arg0) {
        if (!arg0) {
            this.field1220 = !this.field1220;
        }
        return (byte) -this.field1240[this.field1241++];
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "k", descriptor = "(I)B")
    public byte method364(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) (128 - this.field1240[this.field1241++]);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "d", descriptor = "(IB)V")
    public void method365(int arg0, byte arg1) {
        this.field1240[this.field1241++] = (byte) arg0;
        this.field1240[this.field1241++] = (byte) (arg0 >> 8);
        if (arg1 != 77) {
            this.field1223 = !this.field1223;
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(ZI)V")
    public void method366(boolean arg0, int arg1) {
        this.field1240[this.field1241++] = (byte) (arg1 >> 8);
        if (arg0) {
            this.field1238 = !this.field1238;
        }
        this.field1240[this.field1241++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "e", descriptor = "(II)V")
    public void method367(int arg0, int arg1) {
        this.field1240[this.field1241++] = (byte) (arg1 + 128);
        this.field1240[this.field1241++] = (byte) (arg1 >> 8);
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "d", descriptor = "(Z)I")
    public int method368(boolean arg0) {
        this.field1241 += 2;
        if (arg0) {
            this.field1227 = -163;
        }
        return ((this.field1240[this.field1241 - 1] & 0xFF) << 8) + (this.field1240[this.field1241 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "l", descriptor = "(I)I")
    public int method369(int arg0) {
        this.field1241 += 2;
        if (arg0 <= 0) {
            this.field1225 = !this.field1225;
        }
        return ((this.field1240[this.field1241 - 2] & 0xFF) << 8) + (this.field1240[this.field1241 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(B)I")
    public int method370(byte arg0) {
        this.field1241 += 2;
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return ((this.field1240[this.field1241 - 1] & 0xFF) << 8) + (this.field1240[this.field1241 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "e", descriptor = "(Z)I")
    public int method371(boolean arg0) {
        if (arg0) {
            this.field1224 = 476;
        }
        this.field1241 += 2;
        int var2 = ((this.field1240[this.field1241 - 1] & 0xFF) << 8) + (this.field1240[this.field1241 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "b", descriptor = "(B)I")
    public int method372(byte arg0) {
        this.field1241 += 2;
        int var2 = ((this.field1240[this.field1241 - 2] & 0xFF) << 8) + (this.field1240[this.field1241 - 1] - 128 & 0xFF);
        if (arg0 == -26) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return this.field1239;
        }
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "m", descriptor = "(I)I")
    public int method373(int arg0) {
        this.field1241 += 3;
        int var2 = 83 / arg0;
        return (this.field1240[this.field1241 - 2] & 0xFF) + ((this.field1240[this.field1241 - 3] & 0xFF) << 16) + ((this.field1240[this.field1241 - 1] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "n", descriptor = "(I)I")
    public int method374(int arg0) {
        this.field1241 += 4;
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1240[this.field1241 - 3] & 0xFF) + ((this.field1240[this.field1241 - 4] & 0xFF) << 8) + ((this.field1240[this.field1241 - 2] & 0xFF) << 24) + ((this.field1240[this.field1241 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "c", descriptor = "(B)I")
    public int method375(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field1237 = !this.field1237;
        }
        this.field1241 += 4;
        int var10000 = (this.field1240[this.field1241 - 2] & 0xFF) + ((this.field1240[this.field1241 - 1] & 0xFF) << 8) + ((this.field1240[this.field1241 - 3] & 0xFF) << 24) + ((this.field1240[this.field1241 - 4] & 0xFF) << 16);
        if (class8.field622) {
        }
        return var10000;
    }

    @OriginalMember(owner = "client!PQBRPYKE", name = "a", descriptor = "(BI[BI)V")
    public void method376(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 == 7) {
            for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
                arg2[var5] = (byte) (this.field1240[this.field1241++] - 128);
            }
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
            field1243[var0] = var1;
        }
        field1244 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1249 = new class55(826);
        field1250 = new class55(826);
        field1251 = new class55(826);
        field1252 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
