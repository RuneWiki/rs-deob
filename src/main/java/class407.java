import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class407 extends class45 {

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field6103 = -1;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "Lpi;")
    public static class342 field6104 = new class342("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!v", name = "O", descriptor = "Lfi;")
    public static class388 field6108 = new class388(1);

    @OriginalMember(owner = "client!v", name = "U", descriptor = "Liv;")
    public static class64 field6114 = new class64(82, 0);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    private int field6102;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    private int field6106;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    private int field6110;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "Lbu;")
    public static class17 field6109;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "[[B")
    public static byte[][] field6111;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)V")
    private final void method2480(int arg0, int arg1) {
        this.field6110 = arg0 >> 4 & 4080;
        ++field6105;
        this.field6106 = arg0 << 4 & 4080;
        this.field6102 = (16711680 & arg0) >> 12;
        int var3 = -125 / ((58 - arg1) / 39);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIZI)V")
    public static final void method2481(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field6113;
        if (~class169.field2624 != -1) {
            class6.field132 = class169.field2624;
            class388.method2394(25, 0);
        } else {
            class54.method479(false, (byte) 114);
        }
        class91.field1571 = arg0;
        class492.field7282 = arg2;
        class398.field6004 = arg3;
        if (arg1 > 41) {
            class509.method3051(arg4);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        ++field6101;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (arg0 != 8) {
            return null;
        } else {
            if (super.field833.field1888) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class259.field3768; ++var7) {
                    var4[var7] = this.field6102;
                    var5[var7] = this.field6110;
                    var6[var7] = this.field6106;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(B)V")
    public static final void method2482(byte arg0) {
        if (arg0 > -72) {
            field6114 = null;
        }
        ++field6112;
        class125.field2022.method488(-3);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
    private class407(int arg0) {
        super(0, false);
        this.method2480(arg0, -114);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class407() {
        this(0);
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
    public static void method2483(int arg0) {
        field6108 = null;
        field6111 = null;
        field6109 = null;
        field6104 = null;
        field6114 = null;
        if (arg0 < 119) {
            method2483(-109);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field6107;
        if (arg1 != -26471) {
            this.method37((class145) null, 89, -67);
        }
        if (arg2 == 0) {
            this.method2480(arg0.method1085(-58), arg1 + 26592);
        }
    }
}
