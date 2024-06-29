import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class34 {

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    private int field425 = -1;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    private int field434 = 0;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "Lub;")
    private class18 field429 = new class18();

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "Z")
    public boolean field436 = false;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "[[I")
    private int[][] field428;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "[Lat;")
    private class257[] field433;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "Lcq;")
    public static class328 field432 = new class328("", 16);

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field431;

    static {
        new class335("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V", line = 4)
    public final void method246(int arg0) {
        for (int var2 = 0; var2 < this.field435; var2++) {
            this.field428[var2] = null;
        }
        field426++;
        this.field433 = null;
        if (arg0 != -22958) {
            this.field423 = -79;
        }
        this.field428 = null;
        this.field429.method154(7491);
        this.field429 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 27)
    public static void method247(byte arg0) {
        if (arg0 > 27) {
            field432 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[I", line = 37)
    public final int[] method248(int arg0, int arg1) {
        if (arg1 != 16776960) {
            this.method246(-31);
        }
        field430++;
        if (this.field435 == this.field423) {
            this.field436 = this.field433[arg0] == null;
            this.field433[arg0] = class120.field1623;
            return this.field428[arg0];
        } else if (this.field435 == 1) {
            this.field436 = this.field425 != arg0;
            this.field425 = arg0;
            return this.field428[0];
        } else {
            class257 var3 = this.field433[arg0];
            if (var3 == null) {
                this.field436 = true;
                if (this.field434 < this.field435) {
                    var3 = new class257(arg0, this.field434);
                    this.field434++;
                } else {
                    class257 var4 = (class257) this.field429.method157(arg1 - 16777026);
                    var3 = new class257(arg0, var4.field3271);
                    this.field433[var4.field3270] = null;
                    var4.method2165(16225);
                }
                this.field433[arg0] = var3;
            } else {
                this.field436 = false;
            }
            this.field429.method164(var3, (byte) -89);
            return this.field428[var3.field3271];
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)[[I", line = 109)
    public final int[][] method249(byte arg0) {
        field427++;
        if (this.field435 != this.field423) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 >= -94) {
            return null;
        } else {
            for (int var2 = 0; var2 < this.field435; var2++) {
                this.field433[var2] = class120.field1623;
            }
            return this.field428;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lya;IIIIB)V", line = 135)
    public static final void method250(class38 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        arg0.method330(arg1, arg2, arg1 + arg4, arg2 + arg3);
        field431++;
        arg0.method364(arg4, arg1, arg3, arg2, (byte) -48, -16777216);
        if (class285.field3646 < 100) {
            return;
        }
        float var6 = (float) class241.field3117 / (float) class241.field3116;
        int var7 = arg4;
        int var8 = arg3;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg3 / var6);
        }
        int var9 = (arg3 - var8) / 2 + arg2;
        int var10 = (arg4 - var7) / 2 + arg1;
        if (class124.field1661 == null || class124.field1661.method134() != arg4 || arg3 != class124.field1661.method137()) {
            class241.method1456(class241.field3112, class241.field3119 + class241.field3117, class241.field3112 - -class241.field3116, class241.field3119, var10, var9, var7 + var10, var8 + var9);
            class241.method1472(arg0);
            class124.field1661 = arg0.method296(var10, var9, var7, var8, false);
        }
        class124.field1661.method130(var10, var9);
        int var11 = class20.field287 * var7 / class241.field3116;
        int var12 = class374.field4837 * var8 / class241.field3117;
        int var13 = var10 + (class203.field2643 * var7 / class241.field3116);
        if (arg5 != 36) {
            method247((byte) 108);
        }
        int var14 = var8 + var9 - (class452.field6529 * var8 / class241.field3117) - var12;
        int var15 = -1996554240;
        if (class530.field7803 == class335.field4230) {
            var15 = -1996488705;
        }
        arg0.method308(var13, var14, var11, var12, var15, 1);
        arg0.method303(var13, var14, var11, var12, var15, 0);
        if (class118.field1593 <= 0) {
            return;
        }
        int var16;
        if (class298.field3833 <= 50) {
            var16 = class298.field3833 * 5;
        } else {
            var16 = 500 - (class298.field3833 * 5);
        }
        for (class160 var17 = (class160) class241.field3099.method153(0); var17 != null; var17 = (class160) class241.field3099.method161(arg5 - 164)) {
            class36 var18 = class241.field3097.method1620(var17.field2035, 36);
            if (class500.method3011(var18, false)) {
                if (class50.field664 == var17.field2035) {
                    int var21 = var10 + (var17.field2043 * var7 / class241.field3116);
                    int var22 = (class241.field3117 - var17.field2036) * var8 / class241.field3117 + var9;
                    arg0.method364(4, var21 - 2, 4, var22 - 2, (byte) -48, var16 << 24 | 0xFFFF00);
                } else if (class24.field352 != -1 && class24.field352 == var18.field483) {
                    int var19 = var17.field2043 * var7 / class241.field3116 + var10;
                    int var20 = (class241.field3117 - var17.field2036) * var8 / class241.field3117 + var9;
                    arg0.method364(4, var19 - 2, 4, var20 - 2, (byte) -48, var16 << 24 | 0xFFFF00);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(III)V", line = 360)
    public class34(int arg0, int arg1, int arg2) {
        this.field423 = arg1;
        this.field435 = arg0;
        this.field428 = new int[this.field435][arg2];
        this.field433 = new class257[this.field423];
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIII)V", line = 252)
    public static final void method251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class289.field3694 >= arg0 && arg5 >= class533.field7845) {
            boolean var6;
            if (arg4 < class147.field1870) {
                arg4 = class147.field1870;
                var6 = false;
            } else if (class237.field3019 >= arg4) {
                var6 = true;
            } else {
                var6 = false;
                arg4 = class237.field3019;
            }
            boolean var7;
            if (arg3 < class147.field1870) {
                var7 = false;
                arg3 = class147.field1870;
            } else if (class237.field3019 >= arg3) {
                var7 = true;
            } else {
                arg3 = class237.field3019;
                var7 = false;
            }
            if (class533.field7845 <= arg0) {
                class184.method1160(class387.field5088[arg0++], -7, arg1, arg3, arg4);
            } else {
                arg0 = class533.field7845;
            }
            if (class289.field3694 >= arg5) {
                class184.method1160(class387.field5088[arg5--], -7, arg1, arg3, arg4);
            } else {
                arg5 = class289.field3694;
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg5; var8++) {
                    int[] var9 = class387.field5088[var8];
                    var9[arg4] = var9[arg3] = arg1;
                }
            } else if (var6) {
                for (int var10 = arg0; var10 <= arg5; var10++) {
                    class387.field5088[var10][arg4] = arg1;
                }
            } else if (var7) {
                for (int var11 = arg0; var11 <= arg5; var11++) {
                    class387.field5088[var11][arg3] = arg1;
                }
            }
        }
        int var12 = -81 / ((arg2 - 40) / 41);
        field424++;
    }
}
