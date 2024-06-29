import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class135 {

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "B")
    private byte field2564;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "[Lrd;")
    public static class173[] field2557 = new class173[8];

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
    public static int[] field2559 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lof;")
    public static class145 field2551 = new class145();

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field2567 = 500;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "Lrd;")
    public static class173 field2565 = class133.method843("Ausw-=hlen", 23);

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "Lbc;")
    public static class14 field2563;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Z")
    public static boolean field2556;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Z")
    public static boolean field2566;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)I")
    public final int method852(byte arg0) {
        if (arg0 < 47) {
            this.method852((byte) -8);
        }
        field2555++;
        return (this.field2564 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method853(int arg0) {
        field2551 = null;
        if (arg0 != -2) {
            field2554 = 74;
        }
        field2559 = null;
        field2565 = null;
        field2557 = null;
        field2563 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ldh;B)V")
    public static final void method854(class39 arg0, byte arg1) {
        field2562++;
        for (int var2 = 0; var2 < class207.field4036.length; var2++) {
            class207.field4036[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * 128.0D * Math.random());
            class207.field4036[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class101.field1855[var15] = (class207.field4036[var15 - 1] + class207.field4036[var15 + 1] + class207.field4036[var15 + -128] + class207.field4036[var15 - -128]) / 4;
                }
            }
            int[] var13 = class207.field4036;
            class207.field4036 = class101.field1855;
            class101.field1855 = var13;
        }
        if (arg1 > -34) {
            field2557 = null;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field809; var7++) {
            for (int var8 = 0; var8 < arg0.field812; var8++) {
                if (arg0.field810[var6++] != 0) {
                    int var9 = arg0.field808 + var8 + 16;
                    int var10 = var7 + arg0.field814 + 16;
                    int var11 = (var10 << 7) + var9;
                    class207.field4036[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)I")
    public final int method855(int arg0) {
        if (arg0 != -31181) {
            this.field2558 = -11;
        }
        field2561++;
        return this.field2564 & 0x7;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class135() {
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lmb;)V")
    public class135(class121 arg0) {
        this.field2564 = arg0.method767(-94);
        this.field2553 = arg0.method755((byte) -65);
        this.field2560 = arg0.method776(80);
        this.field2549 = arg0.method776(116);
        this.field2550 = arg0.method776(-39);
        this.field2558 = arg0.method776(-58);
    }
}
