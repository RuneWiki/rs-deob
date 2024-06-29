import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class317 {

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Z")
    public boolean field5340 = true;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public int field5348 = -1;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public int field5346 = 128;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    private int field5339 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field5337 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "[Z")
    public static boolean[] field5350 = new boolean[112];

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "Ltl;")
    private static class59 field5345 = class85.method639("Members object", 9588);

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Ltl;")
    public static class59 field5344 = field5345;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "Ltl;")
    public static class59 field5347 = class85.method639("(U0a )2 via: ", 9588);

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "F")
    public static float field5351;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public int field5341;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public int field5349;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public int field5352;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public int field5353;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILs;II)V", line = 25)
    private final void method2180(int arg0, class170 arg1, int arg2, int arg3) {
        field5338++;
        if (arg2 != 12672) {
            method2183(18);
        }
        if (arg3 == 1) {
            this.field5339 = arg1.method1208((byte) -114);
            this.method2181((byte) -98, this.field5339);
        } else if (arg3 == 2) {
            this.field5348 = arg1.method1214(-18254);
            if (this.field5348 == 65535) {
                this.field5348 = -1;
            }
        } else if (arg3 == 3) {
            this.field5346 = arg1.method1214(-18254);
        } else if (arg3 == 4) {
            this.field5340 = false;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)V", line = 72)
    private final void method2181(byte arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field5343++;
        double var5 = (double) ((arg1 & 0xFF4F) >> 8) / 256.0D;
        int var7 = 55 % ((arg0 - 46) / 47);
        double var8 = var3;
        double var10 = (double) (arg1 & 0xFF) / 256.0D;
        double var12 = 0.0D;
        double var14 = var3;
        if (var5 < var3) {
            var14 = var5;
        }
        if (var5 > var3) {
            var8 = var5;
        }
        double var16 = 0.0D;
        if (var10 < var14) {
            var14 = var10;
        }
        if (var10 > var8) {
            var8 = var10;
        }
        double var18 = (var8 + var14) / 2.0D;
        this.field5352 = (int) (var18 * 256.0D);
        if (var8 != var14) {
            if (var18 < 0.5D) {
                var16 = (var8 - var14) / (var8 + var14);
            }
            if (var18 >= 0.5D) {
                var16 = (var8 - var14) / (2.0D - var8 - var14);
            }
            if (var3 == var8) {
                var12 = (var5 - var10) / (var8 - var14);
            } else if (var5 == var8) {
                var12 = (var10 - var3) / (var8 - var14) + 2.0D;
            } else if (var8 == var10) {
                var12 = (var3 - var5) / (var8 - var14) + 4.0D;
            }
        }
        this.field5349 = (int) (var16 * 256.0D);
        if (this.field5352 < 0) {
            this.field5352 = 0;
        } else if (this.field5352 > 255) {
            this.field5352 = 255;
        }
        if (this.field5349 < 0) {
            this.field5349 = 0;
        } else if (this.field5349 > 255) {
            this.field5349 = 255;
        }
        double var20 = var12 / 6.0D;
        if (var18 > 0.5D) {
            this.field5353 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field5353 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field5353 < 1) {
            this.field5353 = 1;
        }
        this.field5341 = (int) ((double) this.field5353 * var20);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BILs;)V", line = 161)
    public final void method2182(byte arg0, int arg1, class170 arg2) {
        field5342++;
        if (arg0 <= 100) {
            this.method2182((byte) -46, -101, (class170) null);
        }
        while (true) {
            int var4 = arg2.method1221(123);
            if (var4 == 0) {
                return;
            }
            this.method2180(arg1, arg2, 12672, var4);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 190)
    public static void method2183(int arg0) {
        int var1 = 79 % ((89 - arg0) / 35);
        field5350 = null;
        field5345 = null;
        field5347 = null;
        field5344 = null;
    }
}
