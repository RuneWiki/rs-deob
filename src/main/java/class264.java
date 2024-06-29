import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class264 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Z")
    public boolean field3363 = false;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lvt;")
    public static class344 field3370 = new class344("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Z")
    public static boolean field3373 = false;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Lrk;")
    public class419 field3366;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)Z")
    public final boolean method1628(byte arg0) {
        field3364++;
        return arg0 >= -55 ? true : this.field3366.field5726.method2042((byte) -80, this.field3365);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZLqa;B)Lha;")
    public final class116 method1629(int arg0, boolean arg1, class167 arg2, byte arg3) {
        field3367++;
        long var5 = (long) ((arg1 ? 262144 : 0) | this.field3365 | arg0 << 16 | arg2.field2115 << 19);
        class116 var7 = (class116) this.field3366.field5731.method323(var5, -19814);
        if (var7 != null) {
            return var7;
        } else if (this.field3366.field5726.method2042((byte) -80, this.field3365)) {
            if (arg3 < 93) {
                this.method1628((byte) -128);
            }
            class295 var8 = class295.method1806(this.field3366.field5726, this.field3365, 0);
            if (var8 != null) {
                var8.field3827 = var8.field3830 = var8.field3829 = var8.field3832 = 0;
                if (arg1) {
                    var8.method1805();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method1804();
                }
            }
            class116 var10 = arg2.method916(var8, true);
            if (var10 != null) {
                this.field3366.field5731.method316(var5, (byte) -123, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
    public static void method1630(byte arg0) {
        if (arg0 != -43) {
            method1630((byte) 73);
        }
        field3370 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lge;IB)V")
    private final void method1631(class551 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field3365 = arg0.method3090(-85);
        } else if (arg1 == 2) {
            this.field3372 = arg0.method3043((byte) 49);
        } else if (arg1 == 3) {
            this.field3363 = true;
        } else if (arg1 == 4) {
            this.field3365 = -1;
        }
        field3369++;
        int var4 = 114 / ((arg2 - 67) / 59);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lge;B)V")
    public final void method1632(class551 arg0, byte arg1) {
        if (arg1 > -30) {
            return;
        }
        while (true) {
            int var3 = arg0.method3045(-126);
            if (var3 == 0) {
                field3368++;
                return;
            }
            this.method1631(arg0, var3, (byte) 127);
        }
    }
}
