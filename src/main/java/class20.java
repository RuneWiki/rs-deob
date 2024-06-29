import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class20 {

    @OriginalMember(owner = "client!da", name = "g", descriptor = "[I")
    public static int[] field580 = new int[50];

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lwb;")
    public static class130 field578 = class26.method212("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3", -32376);

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field594 = 0;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Z")
    public static boolean field585 = false;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lwb;")
    public static class130 field588 = class26.method212("@or3@", -32376);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Lqd;")
    public static class100 field586;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lrd;")
    public static class106 field575;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lmc;")
    public static class75 field587;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field574;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Ljava/awt/Image;")
    public Image field579;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "[I")
    public int[] field593;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 5)
    public final void method181(int arg0) {
        class49.method442(this.field593, this.field590, this.field577);
        field589++;
        if (arg0 != 14664) {
            field580 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 32)
    public static final void method182(byte arg0) {
        field582++;
        if (class26.field749 != 0) {
            return;
        }
        if (class119.field2921 == 1) {
            int var1 = class105.field2558 - 25 - 550;
            int var2 = class35.field988 - 5 - 4;
            if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
                var1 -= 73;
                var2 -= 75;
                int var3 = class85.field2041 + class3.field80 & 0x7FF;
                int var4 = class12.field355[var3];
                int var5 = (class115.field2825 + 256) * var4 >> 8;
                int var6 = class12.field363[var3];
                int var7 = (class115.field2825 + 256) * var6 >> 8;
                int var8 = var1 * var7 + var2 * var5 >> 11;
                int var9 = var2 * var7 - var1 * var5 >> 11;
                int var10 = class42.field1179.field2071 + var8 >> 7;
                int var11 = class42.field1179.field2128 - var9 >> 7;
                boolean var12 = class18.method147(0, class42.field1179.field2107[0], 0, 0, 0, 1, true, 0, true, var10, class42.field1179.field2079[0], var11);
                if (var12) {
                    class14.field406.method330(-1, var1);
                    class14.field406.method330(-1, var2);
                    class14.field406.method353(class3.field80, 65280);
                    class14.field406.method330(-1, 57);
                    class14.field406.method330(-1, class85.field2041);
                    class14.field406.method330(-1, class115.field2825);
                    class14.field406.method330(-1, 89);
                    class14.field406.method353(class42.field1179.field2071, 65280);
                    class14.field406.method353(class42.field1179.field2128, 65280);
                    class14.field406.method330(-1, class101.field2433);
                    class14.field406.method330(-1, 63);
                }
            }
        }
        int var13 = -22 % ((arg0 + 56) / 61);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 98)
    public static final void method183(int arg0) {
        class45.field1220 = 0;
        field584++;
        class14.field403 = 0;
        if (arg0 <= 114) {
            return;
        }
        class33.method260(113);
        class17.method143((byte) 111);
        class115.method888((byte) 55);
        for (int var1 = 0; var1 < class14.field403; var1++) {
            int var3 = class81.field1933[var1];
            if (class130.field3128 != class26.field766[var3].field2104) {
                class26.field766[var3].field913 = null;
                class26.field766[var3] = null;
            }
        }
        if (class65.field1661 != class67.field1682.field1057) {
            throw new RuntimeException("gnp1 pos:" + class67.field1682.field1057 + " psize:" + class65.field1661);
        }
        for (int var2 = 0; var2 < class58.field1466; var2++) {
            if (class26.field766[class24.field716[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class58.field1466);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lk;Lk;ILk;)V", line = 150)
    public static final void method184(class60 arg0, class60 arg1, int arg2, class60 arg3) {
        int var4 = -11 / ((arg2 - 51) / 45);
        field583++;
        class23.field676 = arg0;
        class43.field1195 = arg1;
        class58.field1472 = arg3;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBIII)I", line = 169)
    public static final int method185(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field576++;
        if (arg1 == 74) {
            int var5 = 65536 - class12.field363[arg4 * 1024 / arg0] >> 1;
            return ((65536 - var5) * arg3 >> 16) + (arg2 * var5 >> 16);
        } else {
            return -21;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 203)
    public static void method186(boolean arg0) {
        field586 = null;
        field588 = null;
        if (arg0) {
            return;
        }
        field587 = null;
        field578 = null;
        field580 = null;
        field574 = null;
        field575 = null;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 232)
    protected class20() {
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 242)
    public static final void method189(int arg0) {
        class111.field2722++;
        field591++;
        class14.field406.method727(245, -110);
        if (class105.field2538 != -1) {
            class115.method882(class105.field2538, 3);
            class105.field2538 = -1;
            field585 = true;
            class101.field2414 = -1;
            class23.field673 = true;
        }
        if (arg0 != 29989) {
            return;
        }
        if (class22.field632 != -1) {
            class115.method882(class22.field632, 3);
            class22.field632 = -1;
            class129.field3047 = true;
            class101.field2414 = -1;
        }
        if (class112.field2768 != -1) {
            class115.method882(class112.field2768, 3);
            class112.field2768 = -1;
            class90.method669(19013, 30);
        }
        if (class52.field1367 != -1) {
            class115.method882(class52.field1367, arg0 ^ 0x7526);
            class52.field1367 = -1;
        }
        if (class115.field2843 != -1) {
            class115.method882(class115.field2843, 3);
            class115.field2843 = -1;
            class101.field2414 = -1;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method187(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method188(int arg0, Component arg1, int arg2, int arg3);
}
