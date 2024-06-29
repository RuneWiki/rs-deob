import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class207 extends class152 {

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
    private int field3541 = 4096;

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "[I")
    private int[] field3542 = new int[3];

    @OriginalMember(owner = "client!lm", name = "fb", descriptor = "I")
    private int field3555 = 3216;

    @OriginalMember(owner = "client!lm", name = "bb", descriptor = "I")
    private int field3551 = 3216;

    @OriginalMember(owner = "client!lm", name = "T", descriptor = "[I")
    public static int[] field3543 = new int[5];

    @OriginalMember(owner = "client!lm", name = "eb", descriptor = "Lce;")
    private static class126 field3554 = class206.method1445(-7923, "Examine");

    @OriginalMember(owner = "client!lm", name = "X", descriptor = "Lce;")
    public static class126 field3547 = field3554;

    @OriginalMember(owner = "client!lm", name = "U", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!lm", name = "V", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!lm", name = "W", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!lm", name = "Y", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!lm", name = "ab", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!lm", name = "cb", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!lm", name = "db", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!lm", name = "gb", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!lm", name = "Z", descriptor = "Lce;")
    public static class126 field3549;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V", line = 4)
    public static void method1449(boolean arg0) {
        field3549 = null;
        field3547 = null;
        field3543 = null;
        field3554 = null;
        if (arg0) {
            method1450((byte) -13);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)[I", line = 22)
    public final int[] method6(boolean arg0, int arg1) {
        field3546++;
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (!arg0) {
            this.method1452((byte) -104);
        }
        if (this.field2776.field4516) {
            int var4 = class165.field2951 * this.field3541 >> 12;
            int[] var5 = this.method1132(class314.field5378 & arg1 - 1, -113, 0);
            int[] var6 = this.method1132(arg1, 108, 0);
            int[] var7 = this.method1132(class314.field5378 & arg1 + 1, 52, 0);
            for (int var8 = 0; var8 < class244.field4133; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                if (var10 < 0) {
                    var10 = -var10;
                }
                int var11 = (var6[var8 - 1 & class321.field5490] - var6[var8 + 1 & class321.field5490]) * var4 >> 12;
                if (var10 > 255) {
                    var10 = 255;
                }
                int var12 = var11 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class7.field71[((var10 + 1) * var10 >> 1) + var12] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = var11 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field3542[1] * var16 >> 12;
                int var18 = this.field3542[2] * var14 >> 12;
                int var19 = this.field3542[0] * var15 >> 12;
                var3[var8] = var19 + var17 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILbb;)V", line = 104)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg1 == 0) {
            this.field3541 = arg2.method942(true);
        } else if (arg1 == 1) {
            this.field3551 = arg2.method942(true);
        } else if (arg1 == 2) {
            this.field3555 = arg2.method942(true);
        }
        if (arg0 == 8) {
            field3552++;
        }
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(B)V", line = 138)
    public static final void method1450(byte arg0) {
        field3550++;
        if (class294.field4879 != null) {
            class127 var1 = class294.field4879;
            synchronized (class294.field4879) {
                class294.field4879 = null;
            }
        }
        if (arg0 <= 42) {
            method1450((byte) -23);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([BI)Lck;", line = 171)
    public static final class275 method1451(byte[] arg0, int arg1) {
        field3548++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == -27293) {
            class275 var2 = new class275(arg0, class27.field386, class63.field1032, class279.field4643, class263.field4389, class190.field3255);
            class197.method1395((byte) 127);
            return var2;
        } else {
            return (class275) null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V", line = 215)
    public class207() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)V", line = 194)
    public final void method2(byte arg0) {
        this.method1452((byte) 91);
        int var2 = -62 / ((arg0 - 2) / 37);
        field3545++;
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "(B)V", line = 219)
    private final void method1452(byte arg0) {
        field3544++;
        double var2 = Math.cos((double) ((float) this.field3555 / 4096.0F));
        this.field3542[0] = (int) (Math.sin((double) ((float) this.field3551 / 4096.0F)) * var2 * 4096.0D);
        if (arg0 <= 0) {
            field3556 = -22;
        }
        this.field3542[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field3551 / 4096.0F)));
        this.field3542[2] = (int) (Math.sin((double) ((float) this.field3555 / 4096.0F)) * 4096.0D);
        int var4 = this.field3542[0] * this.field3542[0] >> 12;
        int var5 = this.field3542[2] * this.field3542[2] >> 12;
        int var6 = this.field3542[1] * this.field3542[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field3542[1] = (this.field3542[1] << 12) / var7;
            this.field3542[0] = (this.field3542[0] << 12) / var7;
            this.field3542[2] = (this.field3542[2] << 12) / var7;
        }
    }
}
