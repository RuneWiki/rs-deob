import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class741 implements class255 {

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public int field10357;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public int field10361;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public int field10367;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "Z")
    public boolean field10368;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "Lgq;")
    public class761 field10369;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public int field10366;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public int field10365;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public int field10358;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public int field10362;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "Lkfa;")
    public class407 field10363;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public int field10360;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "Ljava/lang/String;")
    public static String field10370 = null;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "Lmq;")
    public static class78 field10356 = new class78(22, -2);

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "[I")
    public static int[] field10371 = new int[4];

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field10359;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field10364;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)Lqi;", line = 8)
    public final class669 method271(boolean arg0) {
        field10359++;
        if (arg0) {
            this.method271(true);
        }
        return class516.field7273;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 25)
    public static void method4159(int arg0) {
        field10356 = null;
        int var1 = -104 / ((arg0 - 29) / 43);
        field10371 = null;
        field10370 = null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "([BI)V", line = 46)
    public static final void method4160(byte[] arg0, int arg1) {
        field10364++;
        class179 var2 = new class179(arg0);
        if (arg1 != 4) {
            return;
        }
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = var2.method1094(255);
                if (var4 == 0) {
                    if (var3) {
                        return;
                    }
                    if (class252.field3204 == null) {
                        class414.field5849 = new int[4];
                        class252.field3204 = new int[4];
                        class716.field10084 = 4;
                    }
                    for (int var6 = 0; var6 < class252.field3204.length; var6++) {
                        class252.field3204[var6] = 0;
                        class414.field5849[var6] = var6 * 20;
                    }
                    return;
                }
                if (var4 == 1) {
                    if (class252.field3204 == null) {
                        class252.field3204 = new int[4];
                        class414.field5849 = new int[4];
                        class716.field10084 = 4;
                    }
                    for (int var5 = 0; var5 < class252.field3204.length; var5++) {
                        class252.field3204[var5] = var2.method1137((byte) -107);
                        class414.field5849[var5] = var2.method1137((byte) -128);
                    }
                    var3 = true;
                } else if (var4 == 2) {
                    class694.field9819 = var2.method1107(false);
                } else if (var4 == 3) {
                    class716.field10084 = var2.method1094(255);
                    class414.field5849 = new int[class716.field10084];
                    class252.field3204 = new int[class716.field10084];
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(ILgq;Lkfa;IIIIIIIZ)V", line = 127)
    public class741(int arg0, class761 arg1, class407 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field10357 = arg0;
        this.field10361 = arg9;
        this.field10367 = arg5;
        this.field10368 = arg10;
        this.field10369 = arg1;
        this.field10366 = arg4;
        this.field10365 = arg6;
        this.field10358 = arg3;
        this.field10362 = arg7;
        this.field10363 = arg2;
        this.field10360 = arg8;
    }
}
