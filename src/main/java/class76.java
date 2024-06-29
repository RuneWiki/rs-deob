import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class76 {

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static volatile int field1482 = 0;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Lhj;")
    public static class69 field1483 = class181.method1318("settings", (byte) -106);

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Lta;")
    public static class241 field1490 = new class241(30);

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "[I")
    public static int[] field1493 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lhj;")
    public static class69 field1492 = class181.method1318("(U0a )2 via: ", (byte) -110);

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1491 = Calendar.getInstance();

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "Lhj;")
    public static class69 field1494 = class181.method1318(": ", (byte) -112);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lnc;")
    public static class83 field1480;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field1486;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "[I")
    public int[] field1487;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILnc;)V")
    public static final void method547(int arg0, class83 arg1) {
        field1488++;
        class62.field1194 = arg1.method589((byte) -121, class158.field2938);
        if (arg0 > -95) {
            field1494 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method46(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)V")
    public static final void method548(byte arg0, int arg1) {
        class206.field3761.method1708(-1009973721, arg1);
        field1479++;
        if (arg0 < 36) {
            method552(-77);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method51(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIBI)V")
    public static final void method549(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field1481++;
        class99.method740(arg3, class186.field3402[arg2], -1162793114, arg0 + arg1, -arg1 + arg0);
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg5 * arg5;
        int var9 = arg1 * arg1;
        int var10 = arg5 << 1;
        int var11 = var9 << 1;
        int var12 = var9 << 2;
        int var13 = var8 - ((var10 - 1) * var11);
        if (arg4 != 11) {
            method551(-90, true, 78, -76);
        }
        int var14 = var8 << 2;
        int var15 = var8 << 1;
        int var16 = ((var6 << 1) + 3) * var15;
        int var17 = (1 - var10) * var9 + var15;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var14;
        int var20 = (arg5 - 1) * var12;
        while (var7 > 0) {
            var7--;
            int var21 = arg2 - var7;
            if (var17 < 0) {
                while (var17 < 0) {
                    var6++;
                    var13 += var19;
                    var17 += var16;
                    var19 += var14;
                    var16 += var14;
                }
            }
            if (var13 < 0) {
                var17 += var16;
                var16 += var14;
                var6++;
                var13 += var19;
                var19 += var14;
            }
            var13 += -var18;
            int var22 = arg2 + var7;
            int var23 = arg0 - var6;
            int var24 = arg0 + var6;
            var17 += -var20;
            var18 -= var12;
            class99.method740(arg3, class186.field3402[var21], -1162793114, var24, var23);
            class99.method740(arg3, class186.field3402[var22], -1162793114, var24, var23);
            var20 -= var12;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public final void method550(int arg0) {
        class15.method98(this.field1487, this.field1477, this.field1489);
        if (arg0 >= -122) {
            method551(110, true, 110, 66);
        }
        field1478++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZII)I")
    public static final int method551(int arg0, boolean arg1, int arg2, int arg3) {
        class65 var4 = (class65) class4.field25.method769(true, (long) arg2);
        field1485++;
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg3 != -10205) {
            return 84;
        }
        for (int var6 = 0; var6 < var4.field1261.length; var6++) {
            if (var4.field1261[var6] >= 0 && var4.field1261[var6] < class23.field311) {
                class205 var7 = class83.method585(var4.field1261[var6], -1);
                if (var7.field3734 != null) {
                    class3 var8 = (class3) var7.field3734.method769(true, (long) arg0);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field1257[var6] * var8.field6;
                        } else {
                            var5 += var8.field6;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method49(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public static void method552(int arg0) {
        field1480 = null;
        if (arg0 != 30) {
            return;
        }
        field1492 = null;
        field1494 = null;
        field1490 = null;
        field1483 = null;
        field1491 = null;
        field1493 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    protected class76() {
    }
}
