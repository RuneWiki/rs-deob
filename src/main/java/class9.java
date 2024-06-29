import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class224 {

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "Lld;")
    public class105 field125 = new class105();

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "Lfi;")
    public class360 field126 = new class360();

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Lod;")
    private class321 field116;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public static int field117 = 0;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "Lh;")
    public static class434 field123;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()Lll;")
    public final class224 method53() {
        field115++;
        class69 var1 = (class69) this.field125.method652((byte) 37);
        if (var1 == null) {
            return null;
        } else if (var1.field951 == null) {
            return this.method56();
        } else {
            return var1.field951;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static void method54(int arg0) {
        field123 = null;
        int var1 = -117 % (arg0 / 53);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lej;II)V")
    private final void method55(class69 arg0, int arg1, int arg2) {
        if ((this.field116.field4260[arg0.field959] & 0x4) != 0 && arg0.field957 < 0) {
            int var4 = this.field116.field4227[arg0.field959] / class165.field2290;
            int var5 = (var4 + 1048575 - arg0.field958) / var4;
            arg0.field958 = arg1 * var4 + arg0.field958 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field116.field4212[arg0.field959] == 0) {
                    arg0.field951 = class44.method306(arg0.field954, arg0.field951.method289(), arg0.field951.method305(), arg0.field951.method294());
                } else {
                    arg0.field951 = class44.method306(arg0.field954, arg0.field951.method289(), 0, arg0.field951.method294());
                    this.field116.method1750(arg2 - 1048567, arg0.field960.field2601[arg0.field940] < 0, arg0);
                }
                if (arg0.field960.field2601[arg0.field940] < 0) {
                    arg0.field951.method292(-1);
                }
                arg1 = arg0.field958 / var4;
            }
        }
        field121++;
        if (arg2 != 1048575) {
            method62(126, 96, -15);
        }
        arg0.field951.method63(arg1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()Lll;")
    public final class224 method56() {
        field119++;
        class69 var1;
        do {
            var1 = (class69) this.field125.method653(90);
            if (var1 == null) {
                return null;
            }
        } while (var1.field951 == null);
        return var1.field951;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIZILr;)V")
    public static final void method57(int arg0, byte arg1, int arg2, boolean arg3, int arg4, class110 arg5) {
        class410.field5618 = arg4;
        class4.field55 = arg2;
        class425.field5747 = 10000;
        class90.field1315 = arg3;
        int var6 = -50 % ((-arg1 - 47) / 59);
        class409.field5607 = arg5;
        field113++;
        class148.field2106 = 1;
        class165.field2285 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()I")
    public final int method58() {
        field118++;
        return 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([III)V")
    public final void method59(int[] arg0, int arg1, int arg2) {
        field124++;
        this.field126.method59(arg0, arg1, arg2);
        for (class69 var4 = (class69) this.field125.method652((byte) 37); var4 != null; var4 = (class69) this.field125.method653(73)) {
            if (!this.field116.method1753((byte) -52, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field939 >= var5) {
                        this.method60(var6, var5 + var6, arg0, var5, (byte) 121, var4);
                        var4.field939 -= var5;
                        break;
                    }
                    this.method60(var6, var5 + var6, arg0, var4.field939, (byte) 118, var4);
                    var6 += var4.field939;
                    var5 -= var4.field939;
                } while (!this.field116.method1755(var5, true, var6, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[IIBLej;)V")
    private final void method60(int arg0, int arg1, int[] arg2, int arg3, byte arg4, class69 arg5) {
        field120++;
        if (arg4 < 117) {
            this.method55((class69) null, 48, 1);
        }
        if ((this.field116.field4260[arg5.field959] & 0x4) != 0 && arg5.field957 < 0) {
            int var7 = this.field116.field4227[arg5.field959] / class165.field2290;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field958) / var7;
                if (arg3 < var8) {
                    arg5.field958 += arg3 * var7;
                    break;
                }
                arg5.field951.method59(arg2, arg0, var8);
                arg0 += var8;
                arg5.field958 += var7 * var8 - 1048576;
                arg3 -= var8;
                int var9 = class165.field2290 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class44 var11 = arg5.field951;
                if (this.field116.field4212[arg5.field959] == 0) {
                    arg5.field951 = class44.method306(arg5.field954, var11.method289(), var11.method305(), var11.method294());
                } else {
                    arg5.field951 = class44.method306(arg5.field954, var11.method289(), 0, var11.method294());
                    this.field116.method1750(8, arg5.field960.field2601[arg5.field940] < 0, arg5);
                    arg5.field951.method288(var9, var11.method305());
                }
                if (arg5.field960.field2601[arg5.field940] < 0) {
                    arg5.field951.method292(-1);
                }
                var11.method298(var9);
                var11.method59(arg2, arg0, arg1 - arg0);
                if (var11.method297()) {
                    this.field126.method2206(var11);
                }
            }
        }
        arg5.field951.method59(arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIILcj;Lcj;)V")
    public static final void method61(int arg0, int arg1, int arg2, class451 arg3, class451 arg4) {
        class491 var5 = class398.method2420(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6840 = arg3;
            var5.field6849 = arg4;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
    public static final void method62(int arg0, int arg1, int arg2) {
        field114++;
        class485.field6702++;
        class491.method2861(class482.field6652, 1);
        class203.field2751.method199((byte) -117, arg0);
        class203.field2751.method224(arg2, arg1);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public final void method63(int arg0) {
        field122++;
        this.field126.method63(arg0);
        for (class69 var2 = (class69) this.field125.method652((byte) 37); var2 != null; var2 = (class69) this.field125.method653(72)) {
            if (!this.field116.method1753((byte) -52, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field939 >= var3) {
                        this.method55(var2, var3, 1048575);
                        var2.field939 -= var3;
                        break;
                    }
                    this.method55(var2, var2.field939, 1048575);
                    var3 -= var2.field939;
                } while (!this.field116.method1755(var3, true, 0, (int[]) null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lod;)V")
    public class9(class321 arg0) {
        this.field116 = arg0;
    }

    static {
        new class206("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field123 = new class434(53, -1);
    }
}
