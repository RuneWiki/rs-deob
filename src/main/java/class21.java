import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class21 extends class36 {

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "[J")
    private long[] field222 = new long[10];

    @OriginalMember(owner = "mapview!ka", name = "r", descriptor = "I")
    private int field230 = 256;

    @OriginalMember(owner = "mapview!ka", name = "m", descriptor = "I")
    private int field225 = 1;

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "I")
    private int field220 = 0;

    @OriginalMember(owner = "mapview!ka", name = "n", descriptor = "J")
    private long field226 = class19.method132(14429);

    @OriginalMember(owner = "mapview!ka", name = "q", descriptor = "Lea;")
    public static class10 field229 = class3.method8("Rare Trees", 113);

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "I")
    public static int field224 = 0;

    @OriginalMember(owner = "mapview!ka", name = "p", descriptor = "I")
    public static int field228 = 0;

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "Lea;")
    public static class10 field221 = class3.method8("100(U", -90);

    @OriginalMember(owner = "mapview!ka", name = "o", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "mapview!ka", name = "s", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "mapview!ka", name = "t", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "Lfa;")
    public static class12 field223;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "[Lba;")
    public static class4[] field219;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(ZIII)Lea;", line = 6)
    public static final class10 method142(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 1 || arg3 > 36) {
            arg3 = 10;
        }
        int var4 = 1;
        for (int var5 = arg2 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg2 < arg1 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg2 % arg3;
            arg2 /= arg3;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class10 var10 = new class10();
        var10.field78 = var7;
        var10.field83 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Z[Lea;)V", line = 66)
    public static final void method143(boolean arg0, class10[] arg1) {
        class18.method125(arg1, (byte) 19, arg1.length, 0);
        if (arg0) {
            method142(true, -64, 25, -70);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IIB)B", line = 77)
    public static final byte method144(int arg0, int arg1, byte arg2) {
        int var3 = arg0 >> 6;
        int var4 = arg1 >> 6;
        if (arg2 < 49) {
            field228 = -63;
        }
        if (class1.field7[var4][var3] == null) {
            return 0;
        } else if (class1.field7[var4][var3].field449 == null) {
            return class1.field7[var4][var3].field447;
        } else {
            return class1.field7[var4][var3].field449[(arg1 & 0xFC0) + arg0 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(I)V", line = 105)
    public static void method145(int arg0) {
        field223 = null;
        field221 = null;
        field229 = null;
        if (arg0 == 1) {
            field219 = null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I[B)[B", line = 150)
    public static final byte[] method146(int arg0, byte[] arg1) {
        class11 var2 = new class11(arg1);
        int var3 = var2.method78(arg0 ^ 0xFFFFFF8C);
        int var4 = var2.method83(1);
        if (arg0 > var4 || class3.field20 != 0 && var4 > class3.field20) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method82(0, var7, 114, var4);
            return var7;
        } else {
            int var5 = var2.method83(1);
            if (var5 < 0 || class3.field20 != 0 && class3.field20 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class9.method47(var6, var5, arg1, var4, 9);
            } else {
                class3.field14.method37(true, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)I", line = 202)
    public static final int method147(byte arg0) {
        if (arg0 != -128) {
            return 92;
        } else if (class13.field124 == null) {
            return 0;
        } else if (class13.field124.field449 == null) {
            return class10.field75[class13.field124.field447 & 0xFF];
        } else {
            return class10.field75[class13.field124.field449[class22.field238] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "()V", line = 226)
    public class21() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field222[var1] = this.field226;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(BII)I", line = 249)
    public final int method148(byte arg0, int arg1, int arg2) {
        int var4 = this.field225;
        this.field225 = 1;
        int var5 = this.field230;
        this.field230 = 300;
        this.field226 = class19.method132(arg0 ^ 0xFFFFC7B8);
        if (this.field222[this.field232] == 0L) {
            this.field230 = var5;
            this.field225 = var4;
        } else if (this.field226 > this.field222[this.field232]) {
            this.field230 = (int) ((long) (arg2 * 2560) / (this.field226 - this.field222[this.field232]));
        }
        if (this.field230 < 25) {
            this.field230 = 25;
        }
        if (this.field230 > 256) {
            this.field230 = 256;
            this.field225 = (int) ((long) arg2 - (this.field226 - this.field222[this.field232]) / 10L);
        }
        if (arg2 < this.field225) {
            this.field225 = arg2;
        }
        this.field222[this.field232] = this.field226;
        this.field232 = (this.field232 + 1) % 10;
        if (this.field225 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field222[var6] != 0L) {
                    this.field222[var6] += this.field225;
                }
            }
        }
        if (this.field225 < arg1) {
            this.field225 = arg1;
        }
        class31.method220((long) this.field225, -17164);
        int var7 = 0;
        while (this.field220 < 256) {
            this.field220 += this.field230;
            var7++;
        }
        this.field220 &= 0xFF;
        return arg0 == -27 ? var7 : -102;
    }
}
