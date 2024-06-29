import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class259 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
    private int[] field4506 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Z")
    public boolean field4522 = false;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public int field4519 = -1;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Loa;")
    public static class99 field4512 = class221.method1463(2844, ":tradereq:");

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field4521 = 0;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Loa;")
    private static class99 field4517 = class221.method1463(2844, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field4518 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Loa;")
    public static class99 field4526 = field4517;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field4514 = 0;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "[Led;")
    public static class183[] field4515 = new class183[2048];

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field4530 = -1;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "[I")
    private int[] field4510;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "[S")
    private short[] field4513;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "[S")
    private short[] field4525;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "[S")
    private short[] field4531;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "[S")
    private short[] field4532;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Z")
    public final boolean method1675(byte arg0) {
        field4533++;
        boolean var2 = true;
        if (arg0 <= 58) {
            return true;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field4506[var3] != -1 && !class71.field1200.method1239(this.field4506[var3], (byte) -119, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4529++;
        if (arg0 < 128 || arg3 < 128 || arg0 > 13056 || arg3 > 13056) {
            class13.field125 = -1;
            class198.field3448 = -1;
            return;
        }
        int var8 = class115.method777(-1, arg3, class255.field4407, arg0) - arg7;
        int var9 = arg0 - class2.field13;
        int var10 = arg3 - class221.field3850;
        int var11 = var8 - class24.field367;
        int var12 = class134.field2344[class267.field4709];
        int var13 = class134.field2339[class267.field4709];
        int var14 = class134.field2339[class173.field3061];
        int var15 = class134.field2344[class173.field3061];
        int var16 = var9 * var15 + var10 * var14 >> 16;
        int var17 = var10 * var15 - (var9 * var14) >> 16;
        int var19 = var11 * var12 - (var13 * var17) >> 16;
        if (arg2 <= 101) {
            field4512 = null;
        }
        int var20 = var11 * var13 + var12 * var17 >> 16;
        if (var20 >= 50) {
            class198.field3448 = (var19 << 9) / var20 + arg1;
            class13.field125 = (var16 << 9) / var20 + arg5;
        } else {
            class13.field125 = -1;
            class198.field3448 = -1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([Loa;B[S)V")
    public static final void method1677(class99[] arg0, byte arg1, short[] arg2) {
        if (arg1 == -1) {
            field4524++;
            class257.method1662(0, arg0.length - 1, -16338, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Loa;Loa;BI)V")
    public static final void method1678(class99 arg0, class99 arg1, byte arg2, int arg3) {
        class271.method1795(-1, -74, (class99) null, arg1, arg3, arg0);
        field4516++;
        if (arg2 != -126) {
            method1676(-96, 106, 114, 28, 46, -10, -38, -1);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1679(int arg0) {
        if (arg0 != 14547) {
            field4530 = -9;
        }
        field4512 = null;
        field4515 = null;
        field4517 = null;
        field4526 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)Z")
    public final boolean method1680(int arg0) {
        field4511++;
        if (this.field4510 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 2048) {
            this.field4522 = true;
        }
        for (int var3 = 0; var3 < this.field4510.length; var3++) {
            if (!class71.field1200.method1239(this.field4510[var3], (byte) -119, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)Ljh;")
    public final class285 method1681(byte arg0) {
        field4507++;
        if (this.field4510 == null) {
            return null;
        }
        class285[] var2 = new class285[this.field4510.length];
        for (int var3 = 0; var3 < this.field4510.length; var3++) {
            var2[var3] = class285.method1872(class71.field1200, this.field4510[var3], 0);
        }
        if (arg0 != 93) {
            field4512 = null;
        }
        class285 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class285(var2, var2.length);
        }
        if (this.field4532 != null) {
            for (int var5 = 0; var5 < this.field4532.length; var5++) {
                var4.method1870(this.field4532[var5], this.field4525[var5]);
            }
        }
        if (this.field4513 != null) {
            for (int var6 = 0; var6 < this.field4513.length; var6++) {
                var4.method1883(this.field4513[var6], this.field4531[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I")
    public static final int method1682(int arg0, int arg1) {
        field4534++;
        class159 var2 = class77.method539(arg0, arg1 + 1476899887);
        if (arg1 != -1476899920) {
            field4514 = -56;
        }
        int var3 = var2.field2832;
        int var4 = var2.field2829;
        int var5 = var2.field2831;
        int var6 = class170.field3027[var5 - var3];
        return var6 & class43.field733[var4] >> var3;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lik;B)V")
    public static final void method1683(class261 arg0, byte arg1) {
        field4508++;
        byte[] var2 = new byte[24];
        if (class128.field2237 != null) {
            try {
                class128.field2237.method632(0, 0L);
                int var3 = 0;
                class128.field2237.method629(-115, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1703(8388607, 24, var2, 0);
        if (arg1 >= -101) {
            field4518 = -83;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLik;)V")
    public final void method1684(boolean arg0, class261 arg1) {
        field4528++;
        while (true) {
            int var3 = arg1.method1693((byte) 43);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    this.method1681((byte) -64);
                    return;
                }
            }
            this.method1688((byte) 108, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIII)Loa;")
    public static final class99 method1685(boolean arg0, int arg1, int arg2, int arg3) {
        field4509++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 1;
        int var5 = arg2 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg2 % arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            arg2 /= arg1;
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        if (arg3 == 8798) {
            class99 var9 = new class99();
            var9.field1682 = var6;
            var9.field1697 = var7;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)Ljh;")
    public final class285 method1686(int arg0) {
        field4523++;
        class285[] var2 = new class285[5];
        int var3 = 0;
        for (int var4 = arg0; var4 < 5; var4++) {
            if (this.field4506[var4] != -1) {
                var2[var3++] = class285.method1872(class71.field1200, this.field4506[var4], 0);
            }
        }
        class285 var5 = new class285(var2, var3);
        if (this.field4532 != null) {
            for (int var6 = 0; var6 < this.field4532.length; var6++) {
                var5.method1870(this.field4532[var6], this.field4525[var6]);
            }
        }
        if (this.field4513 != null) {
            for (int var7 = 0; var7 < this.field4513.length; var7++) {
                var5.method1883(this.field4513[var7], this.field4531[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIB)V")
    public static final void method1687(int arg0, int arg1, byte arg2) {
        if (arg2 != 73) {
            method1676(126, 118, 84, -62, 115, -50, -107, 121);
        }
        field4527++;
        class65 var3 = class152.method1010(arg0, 13, (byte) -98);
        var3.method433(32);
        var3.field1094 = arg1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLik;I)V")
    private final void method1688(byte arg0, class261 arg1, int arg2) {
        field4520++;
        if (arg2 == 1) {
            this.field4519 = arg1.method1693((byte) 23);
        } else if (arg2 == 2) {
            int var4 = arg1.method1693((byte) -117);
            this.field4510 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4510[var5] = arg1.method1740((byte) 64);
            }
        } else if (arg2 == 3) {
            this.field4522 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1693((byte) 82);
            this.field4532 = new short[var6];
            this.field4525 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4532[var7] = (short) arg1.method1740((byte) 81);
                this.field4525[var7] = (short) arg1.method1740((byte) 72);
            }
        } else if (arg2 == 41) {
            int var8 = arg1.method1693((byte) -79);
            this.field4513 = new short[var8];
            this.field4531 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4513[var9] = (short) arg1.method1740((byte) 90);
                this.field4531[var9] = (short) arg1.method1740((byte) 125);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field4506[arg2 - 60] = arg1.method1740((byte) 102);
        }
        int var10 = 22 / ((40 - arg0) / 39);
    }
}
