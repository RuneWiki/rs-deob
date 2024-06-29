import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class83 {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field1343 = 0;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1347 = 0;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field1348 = 0;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lda;")
    public static class275 field1352 = class255.method1672(97, "leuchten2:");

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1350;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[[[B")
    public static byte[][][] field1341;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)I")
    public static final int method537(boolean arg0, int arg1) {
        double var2 = (double) ((arg1 & 0xFF86D6) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF63) >> 8) / 256.0D;
        field1342++;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 > var2) {
            var8 = var4;
        }
        double var10 = 0.0D;
        if (var8 < var6) {
            var8 = var6;
        }
        double var12 = var2;
        if (var2 > var4) {
            var12 = var4;
        }
        if (!arg0) {
            field1348 = -90;
        }
        double var14 = 0.0D;
        if (var12 > var6) {
            var12 = var6;
        }
        double var16 = (var8 + var12) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var8 != var12) {
            if (var2 == var8) {
                var10 = (var4 - var6) / (var8 - var12);
            } else if (var4 == var8) {
                var10 = (var6 - var2) / (var8 - var12) + 2.0D;
            } else if (var6 == var8) {
                var10 = (var2 - var4) / (var8 - var12) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var8 - var12) / (var8 + var12);
            }
            if (var16 >= 0.5D) {
                var14 = (var8 - var12) / (2.0D - var8 - var12);
            }
        }
        double var19 = var10 / 6.0D;
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var19 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var18 > 243) {
            var21 >>= 0x4;
        } else if (var18 > 217) {
            var21 >>= 0x3;
        } else if (var18 > 192) {
            var21 >>= 0x2;
        } else if (var18 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + (var22 >> 2 << 10) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class83() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method538(int arg0) {
        if (arg0 > -50) {
            return;
        }
        field1351++;
        if (!class262.method1714(-1) && class159.field2790 != class122.field2185) {
            class77.method508(class66.field1094.field1752[0], false, class66.field1094.field1722[0], class66.field1085, class54.field921, class159.field2790, 16055);
        } else if (class178.field3069 != class159.field2790) {
            class178.field3069 = class159.field2790;
            class113.method826(class159.field2790, -3);
            class77.method503(124);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method539(boolean arg0) {
        field1341 = null;
        if (!arg0) {
            field1352 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Lrj;")
    public static final class13 method540(int arg0) {
        class20 var1 = new class20(class267.field4646, class250.field4419, class114.field2010[0], class246.field4357[0], class152.field2662[0], class32.field480[0], class67.field1101[0], class270.field4695);
        class134.method978(-93);
        field1345++;
        if (arg0 < 108) {
            method537(false, -78);
        }
        return var1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lij;B[B)V")
    public final void method541(class85 arg0, byte arg1, byte[] arg2) {
        field1344++;
        if (arg0.field1381[arg0.field1392] != 31 || arg0.field1381[arg0.field1392 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (arg1 >= -81) {
            field1341 = null;
        }
        if (this.field1350 == null) {
            this.field1350 = new Inflater(true);
        }
        try {
            this.field1350.setInput(arg0.field1381, arg0.field1392 + 10, -arg0.field1392 + -8 + -10 + arg0.field1381.length);
            this.field1350.inflate(arg2);
        } catch (Exception var4) {
            this.field1350.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1350.reset();
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public static final void method542(int arg0) {
        field1346++;
        if (arg0 == -14957) {
            class249.field4378.method987((byte) -102);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLma;II)Lwb;")
    public static final class179 method543(boolean arg0, class105 arg1, int arg2, int arg3) {
        if (!arg0) {
            field1348 = -111;
        }
        field1353++;
        return class210.method1353(arg2, arg1, arg3, (byte) -59) ? class174.method1181(0) : null;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(III)V")
    private class83(int arg0, int arg1, int arg2) {
    }
}
