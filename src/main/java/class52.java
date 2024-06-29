import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class52 extends class583 {

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public int field585 = 12800;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public int field589 = -1;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public int field583 = -1;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "Z")
    public boolean field584 = true;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public int field587 = 0;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public int field598 = 0;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public int field594 = 12800;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "Ljava/lang/String;")
    public String field590;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Ljava/lang/String;")
    public String field581;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "Lbg;")
    public class464 field591;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "[Z")
    public static boolean[] field596 = new boolean[5];

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "Lfp;")
    public static class323 field592;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public final void method317(int arg0) {
        field579++;
        this.field585 = 12800;
        this.field594 = 12800;
        this.field587 = 0;
        this.field598 = arg0;
        for (class473 var2 = (class473) this.field591.method2765(-12261); var2 != null; var2 = (class473) this.field591.method2759(arg0 ^ 0xFFFFC3FF)) {
            if (this.field598 < var2.field6712) {
                this.field598 = var2.field6712;
            }
            if (this.field594 > var2.field6704) {
                this.field594 = var2.field6704;
            }
            if (this.field585 > var2.field6717) {
                this.field585 = var2.field6717;
            }
            if (var2.field6714 > this.field587) {
                this.field587 = var2.field6714;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
    public static final int method318(int arg0, int arg1) {
        if (arg0 == 0) {
            field595++;
            return arg1 >>> 8;
        } else {
            return -94;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[IIB)Z")
    public final boolean method319(int arg0, int[] arg1, int arg2, byte arg3) {
        field593++;
        for (class473 var5 = (class473) this.field591.method2765(-12261); var5 != null; var5 = (class473) this.field591.method2759(-15361)) {
            if (var5.method2825(arg2, arg0, 101)) {
                var5.method2826(arg0, arg2, arg1, -9528);
                return true;
            }
        }
        if (arg3 <= 40) {
            this.field590 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[III)Z")
    public final boolean method320(int arg0, int[] arg1, int arg2, int arg3) {
        field582++;
        for (class473 var5 = (class473) this.field591.method2765(-12261); var5 != null; var5 = (class473) this.field591.method2759(-15361)) {
            if (var5.method2823(arg3, arg2, (byte) 90)) {
                var5.method2829(arg1, arg2, 0, arg3);
                return true;
            }
        }
        return arg0 > -76 ? false : false;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBI[I)Z")
    public final boolean method321(int arg0, int arg1, byte arg2, int arg3, int[] arg4) {
        field600++;
        if (arg2 != 21) {
            field596 = null;
        }
        for (class473 var6 = (class473) this.field591.method2765(-12261); var6 != null; var6 = (class473) this.field591.method2759(-15361)) {
            if (var6.method2828(arg1, arg3, arg0, (byte) -107)) {
                var6.method2826(arg1, arg3, arg4, arg2 ^ 0xFFFFDADD);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)Z")
    public final boolean method322(int arg0, int arg1, int arg2) {
        field588++;
        for (class473 var4 = (class473) this.field591.method2765(arg1 ^ 0xFFFFE21B); var4 != null; var4 = (class473) this.field591.method2759(-15361)) {
            if (var4.method2825(arg0, arg2, 103)) {
                return true;
            }
        }
        if (arg1 != 12800) {
            method323(85, 37, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method323(int arg0, int arg1, boolean arg2) {
        field586++;
        if (arg2) {
            field592 = null;
        }
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V")
    public static void method324(byte arg0) {
        field596 = null;
        int var1 = 57 / ((arg0 - 45) / 42);
        field592 = null;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
    public static final void method325(int arg0, int arg1) {
        field597++;
        if (arg1 == -1 || !class46.field544[arg1]) {
            return;
        }
        if (arg0 != 0) {
            method323(-29, -62, true);
        }
        class48.field569.method2080(-124, arg1);
        class37.field475[arg1] = null;
        class419.field5914[arg1] = null;
        class46.field544[arg1] = false;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lum;Z)V")
    public static final void method326(class524 arg0, boolean arg1) {
        for (int var2 = arg0.field7415; var2 <= arg0.field7413; var2++) {
            for (int var3 = arg0.field7418; var3 <= arg0.field7409; var3++) {
                class165 var4 = class553.field7776[arg0.field1266][var2][var3];
                if (var4 != null) {
                    class356 var5 = var4.field2270;
                    class356 var6 = null;
                    while (var5 != null) {
                        if (var5.field5067 == arg0) {
                            if (var6 == null) {
                                var4.field2270 = var5.field5066;
                            } else {
                                var6.field5066 = var5.field5066;
                            }
                            var5.method2292(-501);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field5066;
                    }
                }
            }
        }
        if (!arg1) {
            class461.method2739(arg0);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class52(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field589 = arg6;
        this.field584 = arg5;
        this.field583 = arg4;
        this.field599 = arg0;
        this.field590 = arg2;
        this.field580 = arg3;
        this.field581 = arg1;
        if (this.field589 == 255) {
            this.field589 = 0;
        }
        this.field591 = new class464();
    }
}
