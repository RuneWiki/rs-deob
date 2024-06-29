import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class504 extends class370 implements class232 {

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "Ltp;")
    public class370 field7398;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
    public static int field7389 = -1;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "Lgf;")
    public static class180 field7394 = new class180("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!hn", name = "U", descriptor = "Lao;")
    public static class188 field7403 = new class188(98, 3);

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!hn", name = "S", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!hn", name = "T", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!hn", name = "V", descriptor = "[[I")
    public static int[][] field7404;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)I")
    public final int method379(byte arg0) {
        field7385++;
        if (arg0 != -96) {
            field7401 = -110;
        }
        return 0;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILqa;)Lc;")
    public final class121 method381(int arg0, int arg1, class162 arg2) {
        field7386++;
        return arg0 == 1584 ? null : null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lqa;I)V")
    public final void method374(class162 arg0, int arg1) {
        if (arg1 != 28339) {
            this.method122(-82, -49, 11, null);
        }
        field7384++;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(Lqa;I)V")
    public final void method126(class162 arg0, int arg1) {
        if (arg1 > -43) {
            this.method117(92);
        }
        field7383++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)Z")
    public static final boolean method2994(int arg0, int arg1, int arg2) {
        if (arg0 == 458752) {
            field7396++;
            return (arg1 & 0x70000) != 0 | class179.method1270((byte) 13, arg2, arg1) || class415.method2559(arg0 ^ 0x70054, arg1, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)I")
    public final int method375(int arg0) {
        field7382++;
        if (arg0 != -13015) {
            field7404 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(IIIIIIIIIILtp;)V")
    public class504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class370 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class61.method544(arg0, -126, arg1));
        this.field7398 = arg10;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)I")
    public final int method107(boolean arg0) {
        if (arg0) {
            this.method380(true);
        }
        field7381++;
        return 0;
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)Z")
    public final boolean method121(int arg0) {
        field7387++;
        if (arg0 != 26923) {
            method2995(-77);
        }
        return false;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILqa;IZLha;I)V")
    public final void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6) {
        if (arg3 <= 5) {
            field7404 = null;
        }
        field7391++;
    }

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "(I)V")
    public static void method2995(int arg0) {
        field7404 = null;
        field7403 = null;
        field7394 = null;
        if (arg0 != -1706797714) {
            field7389 = -80;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lhh;BLhh;Lqe;Lhh;)Z")
    public static final boolean method2996(class84 arg0, byte arg1, class84 arg2, class326 arg3, class84 arg4) {
        if (arg1 > -59) {
            field7404 = null;
        }
        class225.field3272 = arg0;
        class192.field2818 = arg2;
        class170.field2548 = arg4;
        field7399++;
        class23.field420 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(Lqa;I)V")
    public final void method373(class162 arg0, int arg1) {
        field7395++;
        if (arg1 != -2304) {
            this.method373(null, -51);
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
    public final void method376(int arg0) {
        if (arg0 != 16931) {
            this.method374(null, -77);
        }
        field7402++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        if (arg1 == -1) {
            field7397++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)I")
    public final int method380(boolean arg0) {
        if (!arg0) {
            field7403 = null;
        }
        field7393++;
        return 0;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILqa;)Lbw;")
    public final class482 method114(int arg0, class162 arg1) {
        if (arg0 != -6796) {
            this.method121(88);
        }
        field7388++;
        return null;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(III)V")
    public static final void method2997(int arg0, int arg1, int arg2) {
        field7392++;
        class398 var3 = new class398(16);
        if (arg1 != 26459) {
            return;
        }
        for (class63 var4 = (class63) class73.field1218.method2483(127); var4 != null; var4 = (class63) class73.field1218.method2481((byte) -27)) {
            var4.method2663(arg1 ^ 0xFFFF98D8);
            int var5 = (int) (var4.field6399 >> 28);
            int var6 = (int) (var4.field6399 >> 14 & 0x3FFFL) - arg2;
            int var7 = (int) (var4.field6399 & 0x3FFFL) - arg0;
            if (var7 >= 0 && var6 >= 0 && class237.field3436 > var7 && class83.field1366 > var6) {
                var3.method2486(-107, var4, (long) (var7 | var5 << 28 | var6 << 14));
            }
        }
        class73.field1218 = var3;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
    public final void method117(int arg0) {
        field7400++;
        if (arg0 > -127) {
            field7401 = -16;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Z")
    public final boolean method377(int arg0) {
        if (arg0 >= -27) {
            this.field7398 = null;
        }
        field7390++;
        return false;
    }
}
