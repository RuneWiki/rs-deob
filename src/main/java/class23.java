import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 {

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lfe;")
    public class41 field555 = new class41();

    @OriginalMember(owner = "client!da", name = "m", descriptor = "[Lu;")
    public static class135[] field563 = new class135[200];

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field567 = 0;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lu;")
    private static class135 field552 = class87.method676((byte) -72, "Bad session id)3");

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Lu;")
    public static class135 field570 = field552;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lda;")
    public static class23 field551 = new class23();

    @OriginalMember(owner = "client!da", name = "C", descriptor = "[I")
    public static int[] field579 = new int[1000];

    @OriginalMember(owner = "client!da", name = "A", descriptor = "Lu;")
    public static class135 field577 = class87.method676((byte) -49, " )2> ");

    @OriginalMember(owner = "client!da", name = "B", descriptor = "Lu;")
    private static class135 field578 = class87.method676((byte) -52, "Please remove ");

    @OriginalMember(owner = "client!da", name = "D", descriptor = "Lu;")
    public static class135 field580 = field578;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "Lu;")
    public static class135 field576 = field578;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "Lr;")
    public static class117 field581 = new class117(5000);

    @OriginalMember(owner = "client!da", name = "F", descriptor = "Lu;")
    public static class135 field582 = class87.method676((byte) -44, "(U3");

    @OriginalMember(owner = "client!da", name = "G", descriptor = "Lu;")
    public static class135 field583 = class87.method676((byte) -89, ")4l");

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lfe;")
    private class41 field566;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Z")
    public static boolean field554;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Lfe;")
    public final class41 method181(byte arg0) {
        class41 var2 = this.field566;
        if (arg0 < 0) {
            this.method186(42);
        }
        field560++;
        if (this.field555 == var2) {
            this.field566 = null;
            return null;
        } else {
            this.field566 = var2.field952;
            return var2;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)Lfe;")
    public final class41 method182(byte arg0) {
        field575++;
        class41 var2 = this.field555.field952;
        if (this.field555 == var2) {
            this.field566 = null;
            return null;
        } else {
            this.field566 = var2.field952;
            return arg0 == 50 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static final void method183(int arg0) {
        field558++;
        class3.field91 = new class23();
        if (arg0 > -125) {
            field563 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
    public static void method184(byte arg0) {
        field577 = null;
        if (arg0 != 39) {
            field552 = null;
        }
        field582 = null;
        field579 = null;
        field552 = null;
        field583 = null;
        field576 = null;
        field581 = null;
        field570 = null;
        field578 = null;
        field580 = null;
        field551 = null;
        field563 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lfe;I)V")
    public final void method185(class41 arg0, int arg1) {
        field568++;
        if (arg0.field954 != null) {
            arg0.method302(4071);
        }
        arg0.field952 = this.field555;
        if (arg1 != -27557) {
            this.field555 = null;
        }
        arg0.field954 = this.field555.field954;
        arg0.field954.field952 = arg0;
        arg0.field952.field954 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)Lfe;")
    public final class41 method186(int arg0) {
        if (arg0 != -32) {
            this.method195(null, -40);
        }
        class41 var2 = this.field555.field952;
        field569++;
        if (this.field555 == var2) {
            return null;
        } else {
            var2.method302(4071);
            return var2;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public static final void method187(int arg0, int arg1, int arg2, int arg3) {
        field562++;
        if (arg2 < 128 || arg3 < 128 || arg2 > 13056 || arg3 > 13056) {
            class65.field1614 = -1;
            class138.field3351 = -1;
            return;
        }
        int var4 = class20.method148(arg2, arg3, class136.field3301, arg0 + 1375023598) - arg1;
        int var5 = class51.field1213[class62.field1552];
        int var6 = var4 - class17.field386;
        int var7 = arg3 - class47.field1122;
        int var8 = class51.field1203[class62.field1552];
        int var9 = arg2 - class132.field3185;
        int var10 = class51.field1203[class117.field2806];
        int var11 = class51.field1213[class117.field2806];
        int var12 = var7 * var11 + var9 * var10 >> 16;
        int var13 = var7 * var10 - var9 * var11 >> 16;
        int var15 = var6 * var8 - var5 * var13 >> 16;
        int var16 = var5 * var6 + var8 * var13 >> 16;
        if (arg0 != -1375023600) {
            method193(37);
        }
        if (var16 >= 50) {
            class65.field1614 = (var15 << 9) / var16 + 167;
            class138.field3351 = (var12 << 9) / var16 + 256;
        } else {
            class138.field3351 = -1;
            class65.field1614 = -1;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public final void method188(int arg0) {
        field572++;
        if (arg0 <= 121) {
            method193(-37);
        }
        while (true) {
            class41 var2 = this.field555.field952;
            if (this.field555 == var2) {
                return;
            }
            var2.method302(4071);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIII)V")
    public static final void method189(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field564++;
        class55.field1318[0].method29(arg0, arg1);
        class55.field1318[1].method29(arg0, arg1 + arg5 - 16);
        class70.method564(arg0, arg1 + 16, 16, arg5 - 32, class113.field2738);
        if (arg2 != -10) {
            return;
        }
        int var6 = (arg5 - 32) * arg5 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg4 / (arg3 - arg5);
        class70.method564(arg0, arg1 + var7 + 16, 16, var6, class2.field63);
        class70.method566(arg0, arg1 + var7 + 16, var6, class102.field2483);
        class70.method566(arg0 + 1, var7 + 16 + arg1, var6, class102.field2483);
        class70.method568(arg0, arg1 + var7 + 16, 16, class102.field2483);
        class70.method568(arg0, arg1 + var7 + 17, 16, class102.field2483);
        class70.method566(arg0 + 15, arg1 + 16 - -var7, var6, class120.field2901);
        class70.method566(arg0 + 14, var7 + 17 + arg1, var6 - 1, class120.field2901);
        class70.method568(arg0, arg1 + var7 + var6 + 15, 16, class120.field2901);
        class70.method568(arg0 + 1, arg1 - -14 + var6 + var7, 15, class120.field2901);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(B)Lfe;")
    public final class41 method190(byte arg0) {
        field556++;
        if (arg0 != -119) {
            return null;
        }
        class41 var2 = this.field555.field954;
        if (this.field555 == var2) {
            return null;
        } else {
            var2.method302(4071);
            return var2;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)Lfe;")
    public final class41 method191(int arg0) {
        field573++;
        class41 var2 = this.field555.field954;
        if (this.field555 == var2) {
            this.field566 = null;
            return null;
        } else {
            this.field566 = var2.field954;
            return arg0 == -8986 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)Lfe;")
    public final class41 method192(int arg0) {
        class41 var2 = this.field566;
        field553++;
        if (this.field555 == var2) {
            this.field566 = null;
            return null;
        } else {
            this.field566 = var2.field954;
            return arg0 == 16 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
    public static final void method193(int arg0) {
        field559++;
        int var1 = 82 % ((-arg0 - 9) / 63);
        client.field526 = 0;
        class126.field3009 = 0;
        class20.method151((byte) 45);
        class44.method348((byte) 49);
        class1.method3((byte) -59);
        for (int var2 = 0; var2 < client.field526; var2++) {
            int var4 = class101.field2443[var2];
            if (class126.field2998 != class96.field2340[var4].field184) {
                class96.field2340[var4].field2697 = null;
                class96.field2340[var4] = null;
            }
        }
        if (class21.field499 != field581.field1485) {
            throw new RuntimeException("gnp1 pos:" + field581.field1485 + " psize:" + class21.field499);
        }
        for (int var3 = 0; var3 < class34.field790; var3++) {
            if (class96.field2340[class47.field1124[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class34.field790);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class23() {
        this.field555.field954 = this.field555;
        this.field555.field952 = this.field555;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLfe;Lfe;)V")
    public final void method194(boolean arg0, class41 arg1, class41 arg2) {
        field565++;
        if (arg0) {
            return;
        }
        if (arg2.field954 != null) {
            arg2.method302(4071);
        }
        arg2.field952 = arg1;
        arg2.field954 = arg1.field954;
        arg2.field954.field952 = arg2;
        arg2.field952.field954 = arg2;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Lfe;I)V")
    public final void method195(class41 arg0, int arg1) {
        field574++;
        if (arg0.field954 != null) {
            arg0.method302(4071);
        }
        if (arg1 != 26364) {
            field583 = null;
        }
        arg0.field954 = this.field555;
        arg0.field952 = this.field555.field952;
        arg0.field954.field952 = arg0;
        arg0.field952.field954 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lve;B)I")
    public static final int method196(class146 arg0, byte arg1) {
        field557++;
        if (arg1 >= -120) {
            return -110;
        } else {
            class8 var2 = (class8) class115.field2751.method842(((long) arg0.field3595 << 32) + (long) arg0.field3580, 123);
            return var2 == null ? arg0.field3621 : var2.field145;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method197(byte arg0, Component arg1) {
        arg1.removeMouseListener(class131.field3158);
        arg1.removeMouseMotionListener(class131.field3158);
        field571++;
        if (arg0 == -3) {
            arg1.removeFocusListener(class131.field3158);
        }
    }
}
