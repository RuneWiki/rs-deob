import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class248 {

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public int field3958;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field3953 = 0;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3963 = "Connection lost.";

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3956 = "Loaded fonts";

    @OriginalMember(owner = "client!o", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3969 = "flash3:";

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public int field3954;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public int field3965;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Ldd;")
    public class133 field3967;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
    public int[] field3951;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
    public int[] field3952;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[I")
    public int[] field3955;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "[I")
    public int[] field3960;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "[I")
    public int[] field3961;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "[I")
    public int[] field3970;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "[Ldd;")
    public class133[] field3966;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "[[I")
    public int[][] field3957;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "[[I")
    public int[][] field3962;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public static void method1699(boolean arg0) {
        if (!arg0) {
            field3969 = null;
            field3963 = null;
            field3956 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIBII)V")
    public static final void method1700(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class139.field2278 < 100) {
            class184.method1246((byte) 117);
        }
        class2.method28(arg1, arg3, arg0 + arg1, arg3 + arg4);
        field3959++;
        if (class139.field2278 < 100) {
            byte var5 = 20;
            int var6 = arg0 / 2 + arg1;
            int var7 = arg4 / 2 + arg3 - var5 - 18;
            class2.method25(arg1, arg3, arg0, arg4, 0);
            class2.method24(var6 - 152, var7, 304, 34, 9179409);
            class2.method24(var6 - 151, var7 + 1, 302, 32, 0);
            class2.method25(var6 - 150, var7 + 2, class139.field2278 * 3, 30, 9179409);
            class2.method25(class139.field2278 * 3 + var6 - 150, var7 + 2, 300 - (class139.field2278 * 3), 30, 0);
            class262.field4165.method1797(class284.field4484, var6, var5 + var7, 16777215, -1);
            return;
        }
        class120.field1958 = (int) ((float) (arg0 * 2) / class221.field3668);
        class154.field2482 = class126.field2046 - (int) ((float) arg4 / class221.field3668);
        class19.field322 = (int) ((float) (arg4 * 2) / class221.field3668);
        int var8 = class126.field2046 - (int) ((float) arg4 / class221.field3668);
        class143.field2307 = class28.field448 - ((int) ((float) arg0 / class221.field3668));
        int var9 = class28.field448 - ((int) ((float) arg0 / class221.field3668));
        int var10 = (int) ((float) arg0 / class221.field3668) + class28.field448;
        int var11 = (int) ((float) arg4 / class221.field3668) + class126.field2046;
        class73.method518(var8, arg0 + arg1, arg3 + arg4, var10, var9, arg1, arg3, -116, var11);
        class91.method685(arg1, var8, (byte) 17, var11, arg0 + arg1, arg3, var9, var10, arg3 + arg4);
        class196.method1332(arg1 + arg0, arg1, arg3, var9, (byte) 112, arg3 + arg4, var8, var11, var10);
        if (class280.field4433 > 0) {
            class190.field3077--;
            if (class190.field3077 == 0) {
                class190.field3077 = 20;
                class280.field4433--;
            }
        }
        if (class282.field4473) {
            int var12 = arg3 + arg4 - 8;
            int var13 = arg1 + arg0 - 5;
            class184.field2892.method1799("Fps:" + class287.field4538, var13, var12, 16776960, -1);
            int var18 = var12 - 15;
            int var14 = 16776960;
            Runtime var15 = Runtime.getRuntime();
            int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
            if (var16 > 65536) {
                var14 = 16711680;
            }
            class184.field2892.method1799("Mem:" + var16 + "k", var13, var18, var14, -1);
            var12 = var18 - 15;
        }
        int var17 = 75 / ((arg2 + 34) / 55);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[B)V")
    private final void method1701(int arg0, byte[] arg1) {
        field3968++;
        class221 var3 = new class221(class78.method548(arg1, false));
        int var4 = var3.method1517((byte) -96);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        int var5 = 0;
        if (arg0 <= var4) {
            this.field3954 = var3.method1526(arg0 ^ 0xFF000006);
        } else {
            this.field3954 = 0;
        }
        int var6 = var3.method1517((byte) -96);
        this.field3965 = var3.method1521((byte) 113);
        int var7 = -1;
        this.field3961 = new int[this.field3965];
        for (int var8 = 0; var8 < this.field3965; var8++) {
            this.field3961[var8] = var5 += var3.method1521((byte) 113);
            if (var7 < this.field3961[var8]) {
                var7 = this.field3961[var8];
            }
        }
        this.field3964 = var7 + 1;
        this.field3951 = new int[this.field3964];
        this.field3962 = new int[this.field3964][];
        this.field3960 = new int[this.field3964];
        this.field3970 = new int[this.field3964];
        this.field3952 = new int[this.field3964];
        if (var6 != 0) {
            this.field3955 = new int[this.field3964];
            for (int var9 = 0; var9 < this.field3964; var9++) {
                this.field3955[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3965; var10++) {
                this.field3955[this.field3961[var10]] = var3.method1526(class91.method687(arg0, -16777210));
            }
            this.field3967 = new class133(this.field3955);
        }
        for (int var11 = 0; var11 < this.field3965; var11++) {
            this.field3951[this.field3961[var11]] = var3.method1526(-16777216);
        }
        for (int var12 = 0; var12 < this.field3965; var12++) {
            this.field3952[this.field3961[var12]] = var3.method1526(-16777216);
        }
        for (int var13 = 0; var13 < this.field3965; var13++) {
            this.field3970[this.field3961[var13]] = var3.method1521((byte) 113);
        }
        for (int var14 = 0; var14 < this.field3965; var14++) {
            int var21 = this.field3961[var14];
            int var22 = 0;
            int var23 = this.field3970[var21];
            this.field3962[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field3962[var21][var25] = var22 += var3.method1521((byte) 113);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field3960[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field3962[var21] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3957 = new int[var7 + 1][];
        this.field3966 = new class133[var7 + 1];
        for (int var15 = 0; var15 < this.field3965; var15++) {
            int var16 = this.field3961[var15];
            int var17 = this.field3970[var16];
            this.field3957[var16] = new int[this.field3960[var16]];
            for (int var18 = 0; var18 < this.field3960[var16]; var18++) {
                this.field3957[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3962[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3962[var16][var19];
                }
                this.field3957[var16][var20] = var3.method1526(-16777216);
            }
            this.field3966[var16] = new class133(this.field3957[var16]);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "([BI)V")
    public class248(byte[] arg0, int arg1) {
        this.field3958 = class79.method553(98, arg0.length, arg0);
        if (this.field3958 != arg1) {
            throw new RuntimeException();
        }
        this.method1701(6, arg0);
    }
}
