import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class55 extends class14 {

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public int field1396 = -1;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public int field1400 = 0;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public int field1407 = -1;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "Z")
    public boolean field1409 = true;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "[Lqg;")
    public static class150[] field1394 = new class150[6];

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "Lea;")
    public static class38 field1408 = class9.method46((byte) 115, "Fallen lassen");

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field1393 = 0;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
    public final void method405(int arg0) {
        if (~this.field1407 != arg0) {
            this.method406(false, this.field1407);
            this.field1405 = this.field1411;
            this.field1401 = this.field1403;
            this.field1410 = this.field1402;
        }
        field1399++;
        this.method406(false, this.field1400);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
    private final void method406(boolean arg0, int arg1) {
        field1406++;
        double var3 = (double) (arg1 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (arg0) {
            return;
        }
        double var7 = 0.0D;
        double var9 = 0.0D;
        double var11 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var13 = var11;
        if (var11 > var5) {
            var13 = var5;
        }
        double var15 = var11;
        if (var5 > var11) {
            var15 = var5;
        }
        if (var3 > var15) {
            var15 = var3;
        }
        if (var13 > var3) {
            var13 = var3;
        }
        double var17 = (var13 + var15) / 2.0D;
        this.field1403 = (int) (var17 * 256.0D);
        if (this.field1403 < 0) {
            this.field1403 = 0;
        } else if (this.field1403 > 255) {
            this.field1403 = 255;
        }
        if (var13 != var15) {
            if (var17 < 0.5D) {
                var9 = (var15 - var13) / (var13 + var15);
            }
            if (var11 == var15) {
                var7 = (var5 - var3) / (-var13 + var15);
            } else if (var5 == var15) {
                var7 = (var3 - var11) / (-var13 + var15) + 2.0D;
            } else if (var3 == var15) {
                var7 = (var11 - var5) / (var15 - var13) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var9 = (var15 - var13) / (-var15 + 2.0D - var13);
            }
        }
        this.field1402 = (int) (var9 * 256.0D);
        double var19 = var7 / 6.0D;
        this.field1411 = (int) (var19 * 256.0D);
        if (this.field1402 < 0) {
            this.field1402 = 0;
        } else if (this.field1402 > 255) {
            this.field1402 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILhc;)V")
    private final void method407(int arg0, int arg1, int arg2, class66 arg3) {
        field1404++;
        if (arg2 == 1) {
            this.field1400 = arg3.method466(-26256544);
        } else if (arg2 == 2) {
            this.field1396 = arg3.method509(119);
        } else if (arg2 == 3) {
            this.field1396 = arg3.method511(117);
            if (this.field1396 == 65535) {
                this.field1396 = -1;
            }
        } else if (arg2 == 5) {
            this.field1409 = false;
        } else if (arg2 == 7) {
            this.field1407 = arg3.method466(-26256544);
        }
        int var5 = 49 % ((arg0 - 44) / 43);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZI)V")
    public static final void method408(int arg0, boolean arg1, int arg2) {
        field1398++;
        if (class109.field2454 != 0 && arg2 != -1) {
            class32.method204(class109.field2454, 0, false, -15793, class96.field2150, arg2);
            class134.field2826 = true;
        }
        if (!arg1) {
            field1393 = 25;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILhc;I)V")
    public final void method409(int arg0, class66 arg1, int arg2) {
        int var4 = -91 / ((-arg0 - 72) / 32);
        field1395++;
        while (true) {
            int var5 = arg1.method509(116);
            if (var5 == 0) {
                return;
            }
            this.method407(-57, arg2, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!g", name = "h", descriptor = "(I)V")
    public static void method410(int arg0) {
        field1408 = null;
        int var1 = 116 % (-arg0 / 36);
        field1394 = null;
    }
}
