import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class103 {

    @OriginalMember(owner = "client!ae", name = "Cb", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!ae", name = "pb", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "I")
    private int field113;

    @OriginalMember(owner = "client!ae", name = "ub", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client!ae", name = "qb", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client!ae", name = "xb", descriptor = "Lwc;")
    private class143 field125;

    @OriginalMember(owner = "client!ae", name = "zb", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!ae", name = "Ab", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client!ae", name = "kb", descriptor = "Lvc;")
    public static class137 field112 = class45.method325("blinken2:", -46);

    @OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
    public static int field114 = 0;

    @OriginalMember(owner = "client!ae", name = "Bb", descriptor = "Lvc;")
    public static class137 field129 = class45.method325("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", -46);

    @OriginalMember(owner = "client!ae", name = "wb", descriptor = "Lvc;")
    public static class137 field124 = class45.method325("scrollen:", -46);

    @OriginalMember(owner = "client!ae", name = "ob", descriptor = "[Lvc;")
    public static class137[] field116 = new class137[100];

    @OriginalMember(owner = "client!ae", name = "Db", descriptor = "Lvc;")
    public static class137 field131 = class45.method325("Empf-=nger:", -46);

    @OriginalMember(owner = "client!ae", name = "sb", descriptor = "Lvc;")
    public static class137 field120 = class45.method325("Wen m-Ochten Sie der Liste hinzuf-Ugen?", -46);

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ae", name = "rb", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ae", name = "vb", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ae", name = "yb", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "Lfc;")
    public static class39 field108;

    @OriginalMember(owner = "client!ae", name = "nb", descriptor = "Lia;")
    public static class57 field115;

    @OriginalMember(owner = "client!ae", name = "tb", descriptor = "Lia;")
    public static class57 field121;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "[I")
    public static int[] field107;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
    public static void method37(int arg0) {
        field108 = null;
        field107 = null;
        field129 = null;
        int var1 = 0 / ((-arg0 - 22) / 39);
        field115 = null;
        field124 = null;
        field121 = null;
        field131 = null;
        field116 = null;
        field120 = null;
        field112 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)Lbf;")
    public final class14 method38(boolean arg0) {
        if (this.field125 != null) {
            int var2 = class112.field2667 - this.field128;
            if (var2 > 100 && this.field125.field3369 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (var2 <= this.field125.field3382[this.field127]) {
                            break label42;
                        }
                        var2 -= this.field125.field3382[this.field127];
                        this.field127++;
                    } while (this.field127 < this.field125.field3395.length);
                    this.field127 -= this.field125.field3369;
                } while (this.field127 >= 0 && this.field127 < this.field125.field3395.length);
                this.field125 = null;
            }
            this.field128 = class112.field2667 - var2;
        }
        if (!arg0) {
            field124 = null;
        }
        field126++;
        class126 var3 = class114.method886(6, this.field130);
        if (var3.field2932 != null) {
            var3 = var3.method947(123);
        }
        return var3 == null ? null : var3.method946(768, this.field127, this.field122, this.field117, this.field109, this.field110, this.field125, this.field113, this.field118);
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIIIIIZLpe;)V")
    public class6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class103 arg9) {
        this.field130 = arg0;
        this.field117 = arg2;
        this.field110 = arg1;
        this.field113 = arg6;
        this.field122 = arg5;
        this.field109 = arg4;
        this.field118 = arg3;
        if (arg7 != -1) {
            this.field125 = class68.method481(0, arg7);
            this.field127 = 0;
            this.field128 = class112.field2667 - 1;
            if (this.field125.field3368 == 0 && arg9 != null && arg9 instanceof class6) {
                class6 var11 = (class6) arg9;
                if (this.field125 == var11.field125) {
                    this.field127 = var11.field127;
                    this.field128 = var11.field128;
                    return;
                }
            }
            if (arg8 && this.field125.field3369 != -1) {
                this.field127 = (int) ((double) this.field125.field3395.length * Math.random());
                this.field128 -= (int) ((double) this.field125.field3382[this.field127] * Math.random());
                return;
            }
        }
    }
}
