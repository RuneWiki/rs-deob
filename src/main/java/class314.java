import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class314 {

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    private int field5364 = -1;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    private int field5369 = 0;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lih;")
    private class32 field5365 = new class32();

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Z")
    public boolean field5381 = false;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    private int field5370;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    private int field5367;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "[Llb;")
    private class210[] field5373;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[[[I")
    private int[][][] field5359;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lna;")
    public static class26 field5360 = class69.method505("Clientscript error in: ", (byte) -117);

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[B")
    public static byte[] field5361 = new byte[32896];

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Lna;")
    public static class26 field5376;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Lna;")
    public static class26 field5379;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "[[I")
    public static int[][] field5375;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Lna;")
    public static class26 field5382;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Lmm;")
    public static class256 field5383;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Lve;")
    public static class266 field5372;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lve;")
    public static class266 field5374;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "Lve;")
    public static class266 field5378;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lve;")
    public static class266 field5380;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)[[[I", line = 6)
    public final int[][][] method2177(byte arg0) {
        field5363++;
        if (this.field5370 != this.field5367) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 > -12) {
            this.field5364 = -104;
        }
        for (int var2 = 0; var2 < this.field5367; var2++) {
            this.field5373[var2] = class118.field1851;
        }
        return this.field5359;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V", line = 28)
    public final void method2178(byte arg0) {
        if (arg0 >= -1) {
            return;
        }
        for (int var2 = 0; var2 < this.field5367; var2++) {
            this.field5359[var2][0] = null;
            this.field5359[var2][1] = null;
            this.field5359[var2][2] = null;
            this.field5359[var2] = (int[][]) null;
        }
        field5366++;
        this.field5373 = null;
        this.field5359 = (int[][][]) null;
        this.field5365.method253(-118);
        this.field5365 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5361[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field5376 = class69.method505("zap", (byte) -121);
        field5379 = class69.method505("Abbrechen", (byte) -120);
        field5375 = new int[104][104];
        field5382 = class69.method505(")4p=", (byte) -118);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLqb;)V", line = 65)
    public static final void method2179(boolean arg0, class102 arg1) {
        if (arg1.field1642 != null) {
            arg1.field1642.field4200 = 0;
        }
        arg1.field1643 = false;
        for (class102 var2 = arg1.method448(); var2 != null; var2 = arg1.method470()) {
            method2179(true, var2);
        }
        if (!arg0) {
            field5377 = -103;
        }
        field5362++;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V", line = 96)
    public static void method2180(byte arg0) {
        field5378 = null;
        field5380 = null;
        field5375 = (int[][]) null;
        field5360 = null;
        field5383 = null;
        if (arg0 <= 25) {
            return;
        }
        field5379 = null;
        field5382 = null;
        field5374 = null;
        field5372 = null;
        field5361 = null;
        field5376 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V", line = 262)
    public class314(int arg0, int arg1, int arg2) {
        this.field5370 = arg1;
        this.field5367 = arg0;
        this.field5373 = new class210[this.field5370];
        this.field5359 = new int[this.field5367][3][arg2];
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILve;)V", line = 132)
    public static final void method2181(int arg0, class266 arg1) {
        field5368++;
        class307.field5293 = arg1.method1876(class281.field4691, (byte) -30);
        class232.field3674 = arg1.method1876(class313.field5355, (byte) -30);
        if (arg0 <= 108) {
            method2181(14, (class266) null);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)[[I", line = 147)
    public final int[][] method2182(byte arg0, int arg1) {
        field5371++;
        int var3 = -50 % ((arg0 + 57) / 57);
        if (this.field5370 == this.field5367) {
            this.field5381 = this.field5373[arg1] == null;
            this.field5373[arg1] = class118.field1851;
            return this.field5359[arg1];
        } else if (this.field5367 == 1) {
            this.field5381 = this.field5364 != arg1;
            this.field5364 = arg1;
            return this.field5359[0];
        } else {
            class210 var4 = this.field5373[arg1];
            if (var4 == null) {
                this.field5381 = true;
                if (this.field5369 < this.field5367) {
                    var4 = new class210(arg1, this.field5369);
                    this.field5369++;
                } else {
                    class210 var5 = (class210) this.field5365.method254(2);
                    var4 = new class210(arg1, var5.field3262);
                    this.field5373[var5.field3271] = null;
                    var5.method1006(-1024);
                }
                this.field5373[arg1] = var4;
            } else {
                this.field5381 = false;
            }
            this.field5365.method258(64, var4);
            return this.field5359[var4.field3262];
        }
    }
}
