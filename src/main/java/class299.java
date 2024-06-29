import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class299 {

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    private int field5111 = 0;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    private int field5105 = -1;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lmi;")
    private class12 field5108 = new class12();

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Z")
    public boolean field5115 = false;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    private int field5106;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    private int field5113;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "[Lim;")
    private class176[] field5109;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "[[I")
    private int[][] field5107;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Llg;")
    public static class91 field5112 = new class91();

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Loh;")
    public static class258 field5117 = class153.method1046("<col=00ff80>", 115);

    @OriginalMember(owner = "client!od", name = "q", descriptor = "[J")
    public static long[] field5119 = new long[256];

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field5118 = 0;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "[B")
    public static byte[] field5121;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[[I")
    public static int[][] field5116;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I", line = 14)
    public final int[] method2104(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method2108(true);
        }
        field5114++;
        if (this.field5113 == this.field5106) {
            this.field5115 = this.field5109[arg0] == null;
            this.field5109[arg0] = class68.field1183;
            return this.field5107[arg0];
        } else if (this.field5106 == 1) {
            this.field5115 = this.field5105 != arg0;
            this.field5105 = arg0;
            return this.field5107[0];
        } else {
            class176 var3 = this.field5109[arg0];
            if (var3 == null) {
                this.field5115 = true;
                if (this.field5106 > this.field5111) {
                    var3 = new class176(arg0, this.field5111);
                    this.field5111++;
                } else {
                    class176 var4 = (class176) this.field5108.method78((byte) 58);
                    var3 = new class176(arg0, var4.field3169);
                    this.field5109[var4.field3161] = null;
                    var4.method1054((byte) 112);
                }
                this.field5109[arg0] = var3;
            } else {
                this.field5115 = false;
            }
            this.field5108.method79(var3, 110);
            return this.field5107[var3.field3169];
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lef;I)V", line = 92)
    public static final void method2105(class85 arg0, int arg1) {
        field5103++;
        if (arg1 <= -97) {
            class247.field4281 = arg0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 107)
    public final void method2106(int arg0) {
        field5110++;
        for (int var2 = 0; var2 < this.field5106; var2++) {
            this.field5107[var2] = null;
        }
        this.field5109 = null;
        if (arg0 != -9) {
            field5120 = -31;
        }
        this.field5107 = (int[][]) null;
        this.field5108.method80(0);
        this.field5108 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 130)
    public static void method2107(boolean arg0) {
        field5117 = null;
        field5121 = null;
        field5119 = null;
        field5116 = (int[][]) null;
        field5112 = null;
        if (!arg0) {
            method2105((class85) null, -67);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(III)V", line = 191)
    public class299(int arg0, int arg1, int arg2) {
        this.field5106 = arg0;
        this.field5113 = arg1;
        this.field5109 = new class176[this.field5113];
        this.field5107 = new int[this.field5106][arg2];
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5119[var0] = var1;
        }
        field5122 = -1;
        field5121 = new byte[520];
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)[[I", line = 162)
    public final int[][] method2108(boolean arg0) {
        field5104++;
        if (arg0) {
            method2107(false);
        }
        if (this.field5113 != this.field5106) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field5106; var2++) {
            this.field5109[var2] = class68.field1183;
        }
        return this.field5107;
    }
}
