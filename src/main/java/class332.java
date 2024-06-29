import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class332 {

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lmq;")
    private class104 field4557 = new class104(128);

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lfc;")
    private class343 field4558;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field4554 = 0;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "J")
    public static long field4559 = 0L;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Z")
    public static boolean field4550;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4552;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method1974(int arg0) {
        field4553++;
        if (class383.field5438 == -1 || class236.field3333 == -1) {
            return;
        }
        int var1 = class383.field5433 + ((class338.field4637 - class383.field5433) * class346.field4730 >> 16);
        class346.field4730 += var1;
        if (class346.field4730 < 65535) {
            class136.field1934 = false;
            class138.field1954 = false;
        } else {
            class346.field4730 = 65535;
            if (class136.field1934) {
                class138.field1954 = false;
            } else {
                class138.field1954 = true;
            }
            class136.field1934 = true;
        }
        float var2 = (float) class346.field4730 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class69.field1026 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class386.field5444[class383.field5438][var4][var5] * 3;
            int var22 = class386.field5444[class383.field5438][var4 + 1][var5] * 3;
            int var23 = (class386.field5444[class383.field5438][var4 + 2][var5] + class386.field5444[class383.field5438][var4 + 2][var5] - class386.field5444[class383.field5438][var4 + 3][var5]) * 3;
            int var24 = class386.field5444[class383.field5438][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class386.field5444[class383.field5438][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class106.field1525 = (int) var3[2] - class325.field4472 * 128;
        class183.field2665 = (int) var3[1] * -1;
        class436.field5982 = (int) var3[0] - (class153.field2204 * 128);
        float[] var6 = new float[3];
        int var7 = class255.field3577 * 2;
        int var8 = 0;
        if (arg0 != 31699) {
            field4550 = true;
        }
        while (var8 < 3) {
            int var14 = class386.field5444[class236.field3333][var7][var8] * 3;
            int var15 = class386.field5444[class236.field3333][var7 + 1][var8] * 3;
            int var16 = (class386.field5444[class236.field3333][var7 + 2][var8] + class386.field5444[class236.field3333][var7 + 2][var8] - class386.field5444[class236.field3333][var7 + 3][var8]) * 3;
            int var17 = class386.field5444[class236.field3333][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - var15 * 2;
            int var20 = class386.field5444[class236.field3333][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            var8++;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class160.field2306 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class200.field2873 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class259.field3618 = ((class386.field5444[class383.field5438][var4 + 2][3] - class386.field5444[class383.field5438][var4][3]) * class346.field4730 >> 16) + class386.field5444[class383.field5438][var4][3];
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public final void method1975(int arg0) {
        field4549++;
        class104 var2 = this.field4557;
        synchronized (this.field4557) {
            this.field4557.method656(arg0 ^ 0xFFFF0073);
        }
        if (arg0 != -65536) {
            field4559 = 83L;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public final void method1976(byte arg0) {
        field4551++;
        class104 var2 = this.field4557;
        synchronized (this.field4557) {
            if (arg0 < 50) {
                this.method1979(-46, 100);
            }
            this.field4557.method654(false);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public final void method1977(int arg0, int arg1) {
        class104 var3 = this.field4557;
        synchronized (this.field4557) {
            this.field4557.method666(arg0, false);
        }
        if (arg1 != 1) {
            this.method1977(121, -54);
        }
        field4560++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public static void method1978(boolean arg0) {
        field4552 = null;
        if (!arg0) {
            method1974(-117);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)Loc;")
    public final class228 method1979(int arg0, int arg1) {
        field4556++;
        class104 var3 = this.field4557;
        class228 var4;
        synchronized (this.field4557) {
            var4 = (class228) this.field4557.method659((long) arg0, (byte) -1);
        }
        if (arg1 != 18926) {
            return null;
        } else if (var4 == null) {
            byte[] var5 = this.field4558.method2029(1, arg0, 0);
            class228 var6 = new class228();
            if (var5 != null) {
                var6.method1438(arg1 ^ 0xFFFFB648, new class425(var5));
            }
            class104 var7 = this.field4557;
            synchronized (this.field4557) {
                this.field4557.method653(83, (long) arg0, var6);
                return var6;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Ldk;ILfc;)V")
    public class332(class328 arg0, int arg1, class343 arg2) {
        this.field4558 = arg2;
        this.field4558.method2054(0, 1);
    }
}
