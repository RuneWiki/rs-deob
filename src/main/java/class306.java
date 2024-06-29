import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class306 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    private int field5321 = 0;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field5326 = 128;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public int field5333 = -1;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Z")
    public boolean field5329 = true;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Z")
    public static boolean field5325 = false;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Laj;")
    public static class1 field5327 = new class1();

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field5322;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public int field5330;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public int field5331;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public int field5334;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lvc;")
    public static class193 field5332;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BILrm;I)V", line = 8)
    private final void method2146(byte arg0, int arg1, class249 arg2, int arg3) {
        field5328++;
        if (arg0 <= 71) {
            return;
        }
        if (arg3 == 1) {
            this.field5321 = arg2.method1749(false);
            this.method2147(-128, this.field5321);
        } else if (arg3 == 2) {
            this.field5333 = arg2.method1712(-1);
            if (this.field5333 == 65535) {
                this.field5333 = -1;
            }
        } else if (arg3 == 3) {
            this.field5326 = arg2.method1712(-1);
        } else if (arg3 == 4) {
            this.field5329 = false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V", line = 57)
    private final void method2147(int arg0, int arg1) {
        field5323++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var5;
        double var11 = 0.0D;
        double var13 = var5;
        if (var5 < var3) {
            var13 = var3;
        }
        double var15 = 0.0D;
        if (var7 > var13) {
            var13 = var7;
        }
        if (var5 > var3) {
            var9 = var3;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var17 = (var9 + var13) / 2.0D;
        if (var9 != var13) {
            if (var5 == var13) {
                var11 = (var3 - var7) / (var13 - var9);
            } else if (var3 == var13) {
                var11 = (var7 - var5) / (var13 - var9) + 2.0D;
            } else if (var7 == var13) {
                var11 = (var5 - var3) / (var13 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var13 - var9) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var9) / (2.0D - var13 - var9);
            }
        }
        this.field5331 = (int) (var15 * 256.0D);
        double var19 = var11 / 6.0D;
        if (this.field5331 < 0) {
            this.field5331 = 0;
        } else if (this.field5331 > 255) {
            this.field5331 = 255;
        }
        this.field5330 = (int) (var17 * 256.0D);
        if (this.field5330 < 0) {
            this.field5330 = 0;
        } else if (this.field5330 > 255) {
            this.field5330 = 255;
        }
        if (arg0 >= -124) {
            method2148((byte) -22);
        }
        if (var17 > 0.5D) {
            this.field5322 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5322 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field5322 < 1) {
            this.field5322 = 1;
        }
        this.field5334 = (int) ((double) this.field5322 * var19);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 156)
    public static void method2148(byte arg0) {
        field5327 = null;
        field5332 = null;
        int var1 = 34 % ((arg0 - 3) / 55);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILrm;Z)V", line = 171)
    public final void method2149(int arg0, class249 arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        while (true) {
            int var4 = arg1.method1731(true);
            if (var4 == 0) {
                field5324++;
                return;
            }
            this.method2146((byte) 92, arg0, arg1, var4);
        }
    }
}
