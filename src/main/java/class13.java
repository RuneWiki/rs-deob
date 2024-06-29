import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class13 {

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Ljava/lang/String;")
    public static String field160 = "K";

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field162 = 0;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field159;

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 5)
    public class13() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 13)
    public static void method72(byte arg0) {
        if (arg0 == 47) {
            field160 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V", line = 23)
    public static final void method73(byte arg0) {
        field164++;
        if (class176.field2483 != null) {
            return;
        }
        class176.field2483 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var33 << 8) + (var32 << 16) + var34;
            class176.field2483[var3] = var35;
        }
        if (arg0 != -128) {
            field160 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Leb;[BI)V", line = 137)
    public final void method74(class371 arg0, byte[] arg1, int arg2) {
        field161++;
        if (arg0.field5258[arg0.field5273] != 31 || arg0.field5258[arg0.field5273 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field159 == null) {
            this.field159 = new Inflater(true);
        }
        try {
            this.field159.setInput(arg0.field5258, arg0.field5273 + 10, -8 - (arg0.field5273 - arg0.field5258.length + 10));
            this.field159.inflate(arg1);
        } catch (Exception var4) {
            this.field159.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field159.reset();
        if (arg2 < 4) {
            method72((byte) -96);
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V", line = 170)
    public static final void method75(byte arg0) {
        for (int var1 = -1; var1 < class169.field2407; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class67.field1055[var1];
            }
            class354 var6 = class12.field153[var5];
            if (var6 != null && var6.field891 > 0) {
                var6.field891--;
                if (var6.field891 == 0) {
                    var6.field909 = null;
                }
            }
        }
        field165++;
        for (int var2 = 0; var2 < class71.field1096; var2++) {
            int var3 = class280.field3837[var2];
            class437 var4 = class445.field6422[var3];
            if (var4 != null && var4.field891 > 0) {
                var4.field891--;
                if (var4.field891 == 0) {
                    var4.field909 = null;
                }
            }
        }
        if (arg0 < 56) {
            method72((byte) 87);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V", line = 234)
    public static final void method76(int arg0, int arg1) {
        class190 var2 = class71.field1101;
        synchronized (class71.field1101) {
            class71.field1101.method1254(arg1, -75);
        }
        field163++;
        if (arg0 != 256) {
            field162 = 70;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(III)V", line = 250)
    private class13(int arg0, int arg1, int arg2) {
    }
}
