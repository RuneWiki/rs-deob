import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class417 {

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "Z")
    public boolean field6013 = false;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "Lec;")
    public static class40 field6012 = new class40(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public int field6005;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public int field6008;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "Lbu;")
    public class237 field6004;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "[[I")
    public static int[][] field6014;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lvt;II)V")
    private final void method2477(class179 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field6005 = arg0.method916(21933);
        } else if (arg1 == 2) {
            this.field6008 = arg0.method899((byte) -63);
        } else if (arg1 == 3) {
            this.field6013 = true;
        } else if (arg1 == 4) {
            this.field6005 = -1;
        }
        if (arg2 < 49) {
            method2481(true, 40L, (int[]) null, -113);
        }
        field6007++;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
    public static void method2478(byte arg0) {
        field6012 = null;
        if (arg0 != -53) {
            field6012 = null;
        }
        field6014 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)Z")
    public final boolean method2479(boolean arg0) {
        field6006++;
        if (arg0) {
            this.field6005 = 120;
        }
        return this.field6004.field3278.method2758(this.field6005, -1);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLvt;)V")
    public final void method2480(boolean arg0, class179 arg1) {
        while (true) {
            int var3 = arg1.method895((byte) -93);
            if (var3 == 0) {
                if (!arg0) {
                    this.method2483(10, 43, (class280) null, false);
                }
                field6009++;
                return;
            }
            this.method2477(arg1, var3, 62);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZJ[II)Ljava/lang/String;")
    public static final String method2481(boolean arg0, long arg1, int[] arg2, int arg3) {
        if (!arg0) {
            field6012 = null;
        }
        field6011++;
        if (class331.field4769 != null) {
            String var5 = class331.field4769.method2213(arg2, arg1, 0, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIILgn;ILgn;BI)V")
    public static final void method2482(int arg0, int arg1, int arg2, int arg3, int arg4, class187 arg5, int arg6, class187 arg7, byte arg8, int arg9) {
        field6003++;
        int var10 = arg7.method652((byte) 111);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class395 var12 = (class395) class319.field4636.method1163((byte) -90, (long) var10);
        if (var12 == null) {
            class473[] var13 = class473.method2794(class171.field2022, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class231.field3205.method1426(var13[0], true);
            class319.field4636.method1172((long) var10, 1, var12);
        }
        class192.method1049((byte) 116, arg5.method1012(false) * 64, arg0, arg9 >> 1, arg5.field994, arg1, arg5.field1005, arg3 >> 1, 0, arg5.field1008);
        int var14 = class398.field5662[0] + arg4 - 18;
        int var15 = arg2 / 4 * 18 + var14;
        int var16 = class398.field5662[1] + arg6 - 16 - 54;
        int var17 = arg2 % 4 * 18 + var16;
        var12.method2363(var15, var17);
        if (arg5 == arg7) {
            class231.field3205.method1755(-4867, 18, var15 - 1, 18, -256, var17 - 1);
        }
        class13 var18 = class144.method683(-93);
        var18.field189 = var15 + 16;
        var18.field184 = var17;
        var18.field188 = var15;
        var18.field185 = var17 + 16;
        var18.field194 = arg7;
        class144.field1733.method2336(var18, arg8);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILoj;Z)Lrg;")
    public final class395 method2483(int arg0, int arg1, class280 arg2, boolean arg3) {
        field6010++;
        if (arg1 != 177437555) {
            return null;
        }
        long var5 = (long) (arg0 << 16 | this.field6005 | (arg3 ? 262144 : 0) | arg2.field4075 << 19);
        class395 var7 = (class395) this.field6004.field3285.method1163((byte) 110, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field6004.field3278.method2758(this.field6005, arg1 - 177437556)) {
            class473 var8 = class473.method2795(this.field6004.field3278, this.field6005, 0);
            if (var8 != null) {
                var8.field6645 = var8.field6651 = var8.field6653 = var8.field6647 = 0;
                if (arg3) {
                    var8.method2800();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method2799();
                }
            }
            class395 var10 = arg2.method1426(var8, true);
            if (var10 != null) {
                this.field6004.field3285.method1172(var5, 1, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    static {
        new class40("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
