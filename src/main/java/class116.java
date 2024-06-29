import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class116 extends class199 {

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "I")
    private int field1496 = 0;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
    private int field1494 = 8192;

    @OriginalMember(owner = "client!rg", name = "db", descriptor = "I")
    private int field1502 = 2048;

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "I")
    private int field1495 = 0;

    @OriginalMember(owner = "client!rg", name = "lb", descriptor = "I")
    private int field1510 = 2048;

    @OriginalMember(owner = "client!rg", name = "cb", descriptor = "I")
    private int field1501 = 12288;

    @OriginalMember(owner = "client!rg", name = "nb", descriptor = "I")
    private int field1512 = 4096;

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "[I")
    public static int[] field1497 = new int[14];

    @OriginalMember(owner = "client!rg", name = "bb", descriptor = "Z")
    public static volatile boolean field1500 = true;

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "I")
    public static int field1499 = 0;

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "Z")
    public static boolean field1498 = false;

    @OriginalMember(owner = "client!rg", name = "mb", descriptor = "I")
    public static int field1511 = 0;

    @OriginalMember(owner = "client!rg", name = "kb", descriptor = "[J")
    public static long[] field1509 = new long[32];

    @OriginalMember(owner = "client!rg", name = "ob", descriptor = "[Lwb;")
    public static class236[] field1513 = new class236[29];

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!rg", name = "eb", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!rg", name = "fb", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!rg", name = "gb", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!rg", name = "hb", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!rg", name = "ib", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!rg", name = "jb", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(III)Z", line = 8)
    private final boolean method848(int arg0, int arg1, int arg2) {
        int var4 = (arg1 - arg0) * this.field1501 >> 12;
        if (arg2 < 84) {
            field1505 = -62;
        }
        int var5 = class112.field1446[var4 * 255 >> 12 & 0xFF];
        field1491++;
        int var6 = (var5 << 12) / this.field1501;
        int var7 = (var6 << 12) / this.field1494;
        int var8 = this.field1512 * var7 >> 12;
        return var8 > arg0 + arg1 && (-var8) < (arg0 + arg1);
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(B)V", line = 27)
    public static final void method849(byte arg0) {
        class291.field4231.method2258((byte) 86);
        class345.field5360.method2258((byte) 86);
        int var1 = -3 / ((47 - arg0) / 33);
        field1508++;
        class224.field3231.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V", line = 44)
    public static void method850(int arg0) {
        if (arg0 == -9465) {
            field1497 = null;
            field1509 = null;
            field1513 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 134)
    public class116() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIB)Z", line = 65)
    private final boolean method851(int arg0, int arg1, byte arg2) {
        field1493++;
        int var4 = (arg0 + arg1) * this.field1501 >> 12;
        int var5 = class112.field1446[(var4 * 255 & 0xFFAFC) >> 12];
        if (arg2 != -46) {
            method852((class140) null, 23, true, 112);
        }
        int var6 = (var5 << 12) / this.field1501;
        int var7 = (var6 << 12) / this.field1494;
        int var8 = this.field1512 * var7 >> 12;
        return var8 > (arg0 - arg1) && (arg0 - arg1) > (-var8);
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V", line = 85)
    public final void method189(byte arg0) {
        class177.method1304((byte) -29);
        int var2 = 16 % ((arg0 - 36) / 44);
        field1504++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lfh;IZI)Lvn;", line = 116)
    public static final class11 method852(class140 arg0, int arg1, boolean arg2, int arg3) {
        field1492++;
        if (class134.method1020(1, arg0, arg1, arg3)) {
            if (!arg2) {
                field1499 = -41;
            }
            return class103.method733((byte) 102);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLfd;I)V", line = 139)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        field1503++;
        if (arg0 != -43) {
            return;
        }
        if (arg2 == 0) {
            this.field1502 = arg1.method2083((byte) -123);
        } else if (arg2 == 1) {
            this.field1496 = arg1.method2083((byte) -49);
        } else if (arg2 == 2) {
            this.field1495 = arg1.method2083((byte) -127);
        } else if (arg2 == 3) {
            this.field1510 = arg1.method2083((byte) -32);
        } else if (arg2 == 4) {
            this.field1501 = arg1.method2083((byte) -51);
        } else if (arg2 == 5) {
            this.field1512 = arg1.method2083((byte) -22);
        } else if (arg2 == 6) {
            this.field1494 = arg1.method2083((byte) -36);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I", line = 224)
    public final int[] method190(int arg0, int arg1) {
        if (arg0 != -1735) {
            field1498 = false;
        }
        int[] var3 = this.field2802.method2502(arg1, -106);
        if (this.field2802.field5637) {
            int var4 = class274.field3919[arg1] - 2048;
            for (int var5 = 0; var5 < class95.field1235; var5++) {
                int var6 = class82.field1062[var5] - 2048;
                int var7 = this.field1502 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = var4 + this.field1496;
                int var10 = var8 <= 2048 ? var8 : var8 - 4096;
                int var11 = var9 < -2048 ? var9 + 4096 : var9;
                int var12 = var11 <= 2048 ? var11 : var11 - 4096;
                int var13 = this.field1495 + var6;
                int var14 = this.field1510 + var4;
                int var15 = var13 >= -2048 ? var13 : var13 + 4096;
                int var16 = var15 <= 2048 ? var15 : var15 - 4096;
                int var17 = var14 < -2048 ? var14 + 4096 : var14;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = this.method848(var10, var12, 92) || this.method851(var18, var16, (byte) -46) ? 4096 : 0;
            }
        }
        field1506++;
        return var3;
    }
}
