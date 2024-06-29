import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class111 extends class317 {

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    private int field1493 = 8192;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
    private int field1494 = 12288;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    private int field1490 = 2048;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    private int field1488 = 0;

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "I")
    private int field1501 = 4096;

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "I")
    private int field1500 = 0;

    @OriginalMember(owner = "client!gm", name = "ab", descriptor = "I")
    private int field1504 = 2048;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field1487 = new String[500];

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    public static int field1491 = -1;

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "[B")
    public static byte[] field1502;

    @OriginalMember(owner = "client!gm", name = "db", descriptor = "[I")
    public static int[] field1507;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!gm", name = "bb", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!gm", name = "cb", descriptor = "Ljn;")
    public static class176 field1506;

    @OriginalMember(owner = "client!gm", name = "eb", descriptor = "Ltd;")
    public static class283 field1508;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(III)Z", line = 4)
    private final boolean method806(int arg0, int arg1, int arg2) {
        field1489++;
        int var4 = (arg1 + arg2) * this.field1494 >> 12;
        int var5 = class257.field3805[(var4 * 255 & 0xFF051) >> 12];
        int var6 = (var5 << 12) / this.field1494;
        int var7 = 79 / ((-arg0 - 73) / 41);
        int var8 = (var6 << 12) / this.field1493;
        int var9 = this.field1501 * var8 >> 12;
        return var9 > (arg1 - arg2) && -var9 < arg1 - arg2;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 24)
    public class111() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)V", line = 30)
    public static void method807(int arg0) {
        field1502 = null;
        if (arg0 != 25132) {
            field1491 = -110;
        }
        field1506 = null;
        field1508 = null;
        field1487 = null;
        field1507 = null;
    }

    static {
        int var0 = 0;
        field1502 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1502[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field1507 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lcg;II)V", line = 51)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field1503++;
        int var4 = -69 / ((-arg1 - 17) / 40);
        if (arg2 == 0) {
            this.field1504 = arg0.method2220((byte) 120);
        } else if (arg2 == 1) {
            this.field1500 = arg0.method2220((byte) 38);
        } else if (arg2 == 2) {
            this.field1488 = arg0.method2220((byte) 87);
        } else if (arg2 == 3) {
            this.field1490 = arg0.method2220((byte) 92);
        } else if (arg2 == 4) {
            this.field1494 = arg0.method2220((byte) 77);
        } else if (arg2 == 5) {
            this.field1501 = arg0.method2220((byte) 119);
        } else if (arg2 == 6) {
            this.field1493 = arg0.method2220((byte) 44);
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V", line = 132)
    public final void method546(int arg0) {
        if (arg0 != -21522) {
            this.method60((class316) null, -76, -106);
        }
        field1495++;
        class98.method714((byte) -60);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(BI)V", line = 143)
    public static final void method808(byte arg0, int arg1) {
        field1498++;
        if (arg0 != 89) {
            field1506 = (class176) null;
        }
        class8.field82[1] = (float) (class47.method303(65297, arg1) >> 8) / 255.0F;
        class8.field82[2] = (float) class47.method303(255, arg1) / 255.0F;
        class8.field82[0] = (float) class47.method303(255, arg1 >> 16) / 255.0F;
        class334.method2322(3, (byte) 105);
        class334.method2322(4, (byte) 103);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)[I", line = 165)
    public final int[] method140(int arg0, int arg1) {
        if (arg0 != 542) {
            this.field1504 = -105;
        }
        int[] var3 = this.field4847.method1387(arg1, (byte) -116);
        field1499++;
        if (this.field4847.field2751) {
            int var4 = class51.field693[arg1] - 2048;
            for (int var5 = 0; var5 < class326.field4933; var5++) {
                int var6 = this.field1500 + var4;
                int var7 = class99.field1360[var5] - 2048;
                int var8 = var6 >= -2048 ? var6 : var6 + 4096;
                int var9 = this.field1488 + var7;
                int var10 = var8 <= 2048 ? var8 : var8 - 4096;
                int var11 = var9 < -2048 ? var9 + 4096 : var9;
                int var12 = this.field1504 + var7;
                int var13 = var12 >= -2048 ? var12 : var12 + 4096;
                int var14 = this.field1490 + var4;
                int var15 = var13 <= 2048 ? var13 : var13 - 4096;
                int var16 = var11 <= 2048 ? var11 : var11 - 4096;
                int var17 = var14 >= -2048 ? var14 : var14 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = this.method809(client.method823(arg0, 626), var10, var15) || this.method806(client.method823(arg0, -617), var18, var16) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(III)Z", line = 233)
    private final boolean method809(int arg0, int arg1, int arg2) {
        field1497++;
        int var4 = (arg1 - arg2) * this.field1494 >> 12;
        int var5 = 37 / ((15 - arg0) / 59);
        int var6 = class257.field3805[(var4 * 255 & 0xFF3E7) >> 12];
        int var7 = (var6 << 12) / this.field1494;
        int var8 = (var7 << 12) / this.field1493;
        int var9 = this.field1501 * var8 >> 12;
        return (arg1 + arg2) < var9 && (-var9) < (arg2 + arg1);
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(III)V", line = 250)
    public static final void method810(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field1502 = (byte[]) null;
        }
        field1496++;
        if (class326.field4933 != arg0) {
            class99.field1360 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class99.field1360[var3] = (var3 << 12) / arg0;
            }
            class209.field3025 = arg0 * 32;
            class326.field4933 = arg0;
            class246.field3548 = arg0 - 1;
        }
        if (class340.field5109 == arg1) {
            return;
        }
        if (class326.field4933 == arg1) {
            class51.field693 = class99.field1360;
        } else {
            class51.field693 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class51.field693[var4] = (var4 << 12) / arg1;
            }
        }
        class340.field5109 = arg1;
        class202.field2889 = arg1 - 1;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILkm;Lkm;)V", line = 296)
    public static final void method811(int arg0, class133 arg1, class133 arg2) {
        if (arg0 != -1) {
            method810(-64, 6, 19);
        }
        field1492++;
        client.field1518 = arg2;
        class10.field90 = arg1;
    }
}
