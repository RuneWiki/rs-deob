import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class186 {

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Lta;")
    private class255 field2954;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Lii;")
    private class256 field2948;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lk;")
    private class179 field2945;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "[I")
    public static int[] field2952 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Log;")
    private class221 field2951;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Lea;")
    public static class37 field2953;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "[Lkc;")
    private class279[] field2949;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method1263(int arg0) {
        field2952 = null;
        if (arg0 != -1) {
            field2953 = null;
        }
        field2953 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)Lqi;")
    public static final class129 method1264(int arg0, boolean arg1) {
        class129 var2 = (class129) class229.field3773.method480((long) arg0, 87);
        field2947++;
        if (var2 != null) {
            return var2;
        }
        class129 var3 = class52.method400(10, arg0, false, class22.field385, class136.field2235);
        if (var3 != null) {
            class229.field3773.method474((long) arg0, (byte) 52, var3);
        }
        return arg1 ? var3 : null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILab;Lab;I)Lkc;")
    public final class279 method1265(int arg0, class146 arg1, class146 arg2, int arg3) {
        field2946++;
        if (arg3 != -1) {
            method1266((byte) 26, -114);
        }
        return this.method1268(arg0, arg2, 1, arg1, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)V")
    public static final void method1266(byte arg0, int arg1) {
        if (arg0 > -111) {
            method1266((byte) -97, -35);
        }
        field2944++;
        class129.field2090 = -1;
        class182.field2866 = -1;
        class28.field448 = arg1;
        class6.method47(-119);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public final void method1267(int arg0) {
        field2942++;
        if (this.field2949 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2949.length; var2++) {
            if (this.field2949[var2] != null) {
                this.field2949[var2].method1874(100);
            }
        }
        int var3 = -41 % ((arg0 - 40) / 53);
        for (int var4 = 0; var4 < this.field2949.length; var4++) {
            if (this.field2949[var4] != null) {
                this.field2949[var4].method1881((byte) 56);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILab;ILab;Z)Lkc;")
    private final class279 method1268(int arg0, class146 arg1, int arg2, class146 arg3, boolean arg4) {
        field2950++;
        if (arg2 != 1) {
            return null;
        } else if (this.field2951 == null) {
            throw new RuntimeException();
        } else {
            this.field2951.field3655 = arg0 * 8 + 5;
            if (this.field2951.field3653.length <= this.field2951.field3655) {
                throw new RuntimeException();
            } else if (this.field2949[arg0] == null) {
                int var6 = this.field2951.method1526(-16777216);
                int var7 = this.field2951.method1526(-16777216);
                class279 var8 = new class279(arg0, arg3, arg1, this.field2948, this.field2954, var6, var7, arg4);
                this.field2949[arg0] = var8;
                return var8;
            } else {
                return this.field2949[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Z")
    public final boolean method1269(boolean arg0) {
        field2943++;
        if (this.field2951 != null) {
            return true;
        }
        if (this.field2945 == null) {
            if (this.field2948.method1754((byte) -42)) {
                return false;
            }
            this.field2945 = this.field2948.method1751(255, (byte) 0, 57, true, 255);
        }
        if (arg0) {
            this.field2954 = null;
        }
        if (this.field2945.field2781) {
            return false;
        } else {
            this.field2951 = new class221(this.field2945.method1201((byte) 8));
            this.field2949 = new class279[(this.field2951.field3653.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lii;Lta;)V")
    public class186(class256 arg0, class255 arg1) {
        this.field2954 = arg1;
        this.field2948 = arg0;
        if (!this.field2948.method1754((byte) -42)) {
            this.field2945 = this.field2948.method1751(255, (byte) 0, -116, true, 255);
        }
    }
}
