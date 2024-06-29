import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public abstract class class533 {

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field7397 = 2;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "[I")
    public static int[] field7396 = new int[14];

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIB)V")
    public static final void method3163(int arg0, int arg1, byte arg2) {
        class196.field2637 = arg1;
        if (arg2 != 67) {
            field7397 = 59;
        }
        class462.field6420 = arg0;
        field7398++;
        if (class521.field7260 == 0) {
            class559.field7774 = class462.field6420 + (class436.field6091 * 2);
            class239.field3574 = class196.field2637 + (class758.field10576 * 2);
        } else if (class521.field7260 == 1) {
            class557.field7745 = class462.field6420 / class494.field6919 + class27.field349 + 2;
            class17.field172 = class196.field2637 / class319.field4441 + class20.field190 + 2;
            class239.field3574 = class319.field4441 * class17.field172;
            class559.field7774 = class557.field7745 * class494.field6919;
            class758.field10576 = class239.field3574 - class196.field2637 >> 1;
            class436.field6091 = class559.field7774 - class462.field6420 >> 1;
        } else if (class521.field7260 == 2) {
            class559.field7774 = class462.field6420;
            class239.field3574 = class196.field2637;
            return;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method3164(String arg0, int arg1) {
        field7401++;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (arg1 >= ~var3) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(FIFIFIIB[FIF)V")
    public abstract void method2602(float arg0, int arg1, float arg2, int arg3, float arg4, int arg5, int arg6, byte arg7, float[] arg8, int arg9, float arg10);

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V")
    public static final void method3165(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field7397 = -61;
        }
        class329.field4660 = arg1 - class461.field6408;
        field7402++;
        class609.field8207 = arg2 - class461.field6400;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
    public static void method3166(byte arg0) {
        field7396 = null;
        if (arg0 != -74) {
            field7396 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIZ)I")
    public static final int method3167(int arg0, int arg1, boolean arg2) {
        field7399++;
        if (arg2) {
            return 0;
        }
        class169 var3 = class170.method1090(arg2, (byte) -94, arg0);
        if (var3 == null) {
            return class258.field3739.method3295((byte) 81, arg0).field8034;
        }
        if (arg1 != 5265) {
            field7397 = 122;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field2352.length; var5++) {
            if (var3.field2352[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class258.field3739.method3295((byte) 81, arg0).field8034 - var3.field2352.length);
    }
}
