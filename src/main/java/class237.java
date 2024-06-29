import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class237 extends class180 {

    @OriginalMember(owner = "client!na", name = "B", descriptor = "[I")
    private int[] field3458 = new int[this.field2686];

    @OriginalMember(owner = "client!na", name = "D", descriptor = "Lsh;")
    public static class472 field3460;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "[I")
    public static int[] field3462;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    private int field3453;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    private int field3461;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "Lcs;")
    public static class206 field3463;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "[B")
    private byte[] field3454;

    static {
        new class332("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field3460 = new class472(64, 8);
        field3462 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };
        field3464 = 0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V", line = 4)
    public void method1433(int arg0, byte arg1) {
        ++field3456;
        this.field3454[this.field3461++] = (byte) (class412.method2463(127, arg1 >> 1) + 127);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V", line = 15)
    public final void method395(byte arg0) {
        this.field3461 = 0;
        if (arg0 <= 23) {
            method1539(-21);
        }
        this.field3453 = 0;
        ++field3452;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Lso;", line = 27)
    public static final class187 method1539(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field3459;
            return class281.field4252 < class201.field3056.length ? class201.field3056[class281.field4252++] : null;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V", line = 42)
    public final void method393(byte arg0) {
        ++field3450;
        this.field3453 = Math.abs(this.field3453);
        if (~this.field3453 <= -4097) {
            this.field3453 = 4095;
        }
        int var2 = -90 / ((arg0 - -46) / 50);
        this.method1433(this.field3461++, (byte) (this.field3453 >> 4));
        this.field3453 = 0;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(B)V", line = 61)
    public static final void method1540(byte arg0) {
        class25.field324 = class267.field3960.field6 + class267.field3960.field16 + 2;
        if (arg0 != -28) {
            field3464 = 31;
        }
        class27.field341 = class131.field1828.field16 - (-class131.field1828.field6 + -2);
        ++field3457;
        class362.field5480 = new String[500];
        for (int var1 = 0; ~class362.field5480.length < ~var1; ++var1) {
            class362.field5480[var1] = "";
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V", line = 82)
    public final void method392(int arg0, int arg1, int arg2) {
        if (arg1 != 30864) {
            this.field3453 = -70;
        }
        this.field3453 += this.field3458[arg0] * arg2 >> 12;
        ++field3449;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V", line = 93)
    public static final void method1541(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3447;
        for (int var5 = arg3; ~var5 > ~class267.field3959; ++var5) {
            Rectangle var6 = class398.field5826[var5];
            if (~(var6.x - -var6.width) < ~arg0 && ~var6.x > ~(arg0 + arg2) && arg4 < var6.y + var6.height && arg1 + arg4 > var6.y) {
                class225.field3270[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIF)V", line = 114)
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field2686; ++var7) {
            this.field3458[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V", line = 140)
    public static final void method1542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3451;
        class178 var7 = class331.method2032(arg6, arg1, -1);
        if (var7 != null) {
            if (var7.field2561 != null) {
                class415 var8 = new class415();
                var8.field5989 = var7.field2561;
                var8.field5990 = var7;
                class477.method2797(var8);
            }
            class197.field2960 = arg2;
            class261.field3873 = arg5;
            class467.field6570 = arg1;
            if (arg3 <= 9) {
                field3460 = null;
            }
            class25.field323 = arg0;
            class186.field2830 = arg4;
            class432.field6152 = true;
            class335.field5024 = var7.field2605;
            class65.field898 = arg6;
            class205.method1396(111, var7);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 178)
    public static final void method1543(int arg0) {
        ++field3448;
        if (arg0 != -2) {
            field3463 = null;
        }
        for (class198 var1 = (class198) class428.field6108.method2456(32101); var1 != null; var1 = (class198) class428.field6108.method2461(301)) {
            if (~var1.field2983 == 0) {
                var1.field2987 = 0;
                class141.method972(var1, 0);
            } else {
                var1.method283(2);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V", line = 203)
    public static void method1544(int arg0) {
        field3462 = null;
        field3460 = null;
        field3463 = null;
        if (arg0 > -126) {
            method1544(79);
        }
    }
}
