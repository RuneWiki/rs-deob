import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class37 {

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "B")
    private byte field550;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public int field547;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lid;")
    public static class149 field546 = class60.method382("logo", (byte) 2);

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "J")
    public static long field545 = 0L;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lid;")
    private static class149 field552 = class60.method382("Continue", (byte) 38);

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lid;")
    public static class149 field551 = field552;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[I")
    public static int[] field553;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([BIII)Lid;")
    public static final class149 method214(byte[] arg0, int arg1, int arg2, int arg3) {
        field544++;
        class149 var4 = new class149();
        var4.field2694 = new byte[arg2];
        var4.field2670 = arg3;
        for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
            if (arg0[var5] != 0) {
                var4.field2694[var4.field2670++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)I")
    public final int method215(byte arg0) {
        field556++;
        if (arg0 >= -33) {
            method214((byte[]) null, -107, -108, -128);
        }
        return this.field550 & 0x7;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)V")
    public static final void method216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field548++;
        int var6 = arg0 - arg5;
        int var7 = arg4 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class34.method195(arg4, arg3, (byte) -95, arg1, arg5);
            }
        } else if (var7 == 0) {
            class197.method1351(arg1, (byte) 102, arg3, arg5, arg0);
        } else if (arg2 == -30374) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class257.field4496) {
                var10 = (class257.field4496 * var8 >> 12) + var9;
                var11 = class257.field4496;
            } else if (class192.field3449 < arg5) {
                var11 = class192.field3449;
                var10 = var9 + (class192.field3449 * var8 >> 12);
            } else {
                var11 = arg5;
                var10 = arg3;
            }
            int var12;
            int var13;
            if (class257.field4496 > arg0) {
                var13 = (class257.field4496 * var8 >> 12) + var9;
                var12 = class257.field4496;
            } else if (class192.field3449 >= arg0) {
                var12 = arg0;
                var13 = arg4;
            } else {
                var13 = var9 + (class192.field3449 * var8 >> 12);
                var12 = class192.field3449;
            }
            if (class224.field3940 > var10) {
                var11 = (class224.field3940 - var9 << 12) / var8;
                var10 = class224.field3940;
            } else if (var10 > class94.field1655) {
                var11 = (class94.field1655 - var9 << 12) / var8;
                var10 = class94.field1655;
            }
            if (var13 < class224.field3940) {
                var12 = (class224.field3940 - var9 << 12) / var8;
                var13 = class224.field3940;
            } else if (class94.field1655 < var13) {
                var12 = (class94.field1655 - var9 << 12) / var8;
                var13 = class94.field1655;
            }
            class48.method310(var13, (byte) 67, arg1, var12, var10, var11);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public static final void method217(boolean arg0) {
        field555++;
        class86.method640(5, 0);
        class194.method1313(5, !arg0);
        class251.method1745(5, 0);
        class18.method103(!arg0, 5);
        class227.method1522(5, arg0);
        class251.method1743(5, (byte) -98);
        class247.method1719(5, -29406);
        class206.method1407(29469, 5);
        class198.method1356((byte) -126, 5);
        class43.method250((byte) -41, 5);
        class19.method107(5, (byte) -124);
        class116.method808(5, -47);
        class247.method1717(5, (byte) 127);
        class191.method1299(5, 4);
        class236.method1601(5, 0);
        class207.method1414(50, -11770);
        class10.method59(5, (byte) 110);
        class93.method678((byte) 112, 5);
        class271.field4879.method1289(5, 79);
        class249.field4372.method1289(5, 87);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method218(int arg0) {
        field551 = null;
        if (arg0 > -76) {
            field554 = 96;
        }
        field546 = null;
        field553 = null;
        field552 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I")
    public final int method219(int arg0) {
        if (arg0 >= -112) {
            return 51;
        } else {
            field559++;
            return (this.field550 & 0x8) == 8 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method220(int arg0, Component arg1) {
        arg1.removeKeyListener(class288.field5139);
        arg1.removeFocusListener(class288.field5139);
        class110.field1903 = arg0;
        field558++;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class37() {
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lgd;)V")
    public class37(class74 arg0) {
        this.field550 = arg0.method514((byte) 1);
        this.field557 = arg0.method485(-2386);
        this.field547 = arg0.method498((byte) 126);
        this.field549 = arg0.method498((byte) 125);
        this.field560 = arg0.method498((byte) 127);
        this.field543 = arg0.method498((byte) 126);
    }
}
