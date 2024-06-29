import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class666 {

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public int field9269 = 0;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public int field9274 = 0;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "Loo;")
    private class652 field9275 = new class652(64);

    @OriginalMember(owner = "client!or", name = "o", descriptor = "Lwc;")
    private class72 field9281 = null;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "Lwia;")
    private class791 field9271;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "Lwia;")
    private class791 field9276;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Ljava/lang/String;")
    public static String field9270 = null;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field9268;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field9272;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field9280;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "Lwia;")
    public static class791 field9273;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Ljava/lang/String;")
    public static String field9267;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
    public static void method3793(byte arg0) {
        field9273 = null;
        field9270 = null;
        int var1 = -96 % ((arg0 + 26) / 39);
        field9267 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Luh;JB[I)Ljava/lang/String;")
    public final String method3794(class176 arg0, long arg1, byte arg2, int[] arg3) {
        if (arg2 <= 126) {
            return null;
        }
        field9279++;
        if (this.field9281 != null) {
            String var6 = this.field9281.method583(arg0, arg3, 0, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)Lvda;")
    public final class193 method3795(int arg0, byte arg1) {
        if (arg1 < 63) {
            this.method3794(null, -94L, (byte) -22, null);
        }
        field9278++;
        class193 var3 = (class193) this.field9275.method3742((byte) 67, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field9276.method4339(arg0, 0, 1);
        } else {
            var4 = this.field9271.method4339(arg0 & 0x7FFF, 0, 1);
        }
        class193 var5 = new class193();
        var5.field2990 = this;
        if (var4 != null) {
            var5.method1350(new class494(var4), (byte) -127);
        }
        if (arg0 >= 32768) {
            var5.method1341(104);
        }
        this.field9275.method3739((long) arg0, (byte) 107, var5);
        return var5;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(B)V")
    public static final void method3796(byte arg0) {
        field9277++;
        int var1 = 0;
        if (class21.field353 != null) {
            var1 = class21.field353.field10087.method3752(-44);
        }
        if (var1 == 2) {
            int var4 = class179.field2787 > 800 ? 800 : class179.field2787;
            int var5 = class63.field759 > 600 ? 600 : class63.field759;
            class428.field5825 = var4;
            class270.field3918 = (class179.field2787 - var4) / 2;
            class714.field9895 = var5;
            class423.field5786 = 0;
        } else if (var1 == 1) {
            int var2 = class179.field2787 <= 1024 ? class179.field2787 : 1024;
            class270.field3918 = (class179.field2787 - var2) / 2;
            class428.field5825 = var2;
            int var3 = class63.field759 <= 768 ? class63.field759 : 768;
            class714.field9895 = var3;
            class423.field5786 = 0;
        } else {
            class714.field9895 = class63.field759;
            class428.field5825 = class179.field2787;
            class270.field3918 = 0;
            class423.field5786 = 0;
        }
        if (arg0 < 5) {
            method3798(90);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIZI)V")
    public static final void method3797(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field9280++;
        if (arg1 >= -88) {
            field9268 = -99;
        }
        class83.method627(808);
        class787.field10813 = 0L;
        int var5 = class592.method3442((byte) -71);
        if (arg4 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (!class37.field491.method494()) {
            arg3 = true;
        }
        class448.method2672(arg2, arg0, arg3, arg4, 2, var5);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
    public static final void method3798(int arg0) {
        field9272++;
        if (arg0 != 26) {
            return;
        }
        if (class477.field6679.toLowerCase().indexOf("microsoft") != -1) {
            class205.field3180[187] = 27;
            class205.field3180[190] = 72;
            class205.field3180[223] = 28;
            class205.field3180[192] = 58;
            class205.field3180[219] = 42;
            class205.field3180[188] = 71;
            class205.field3180[222] = 59;
            class205.field3180[221] = 43;
            class205.field3180[189] = 26;
            class205.field3180[220] = 74;
            class205.field3180[191] = 73;
            class205.field3180[186] = 57;
            return;
        }
        class205.field3180[47] = 73;
        class205.field3180[46] = 72;
        class205.field3180[44] = 71;
        class205.field3180[91] = 42;
        class205.field3180[61] = 27;
        class205.field3180[59] = 57;
        class205.field3180[45] = 26;
        class205.field3180[93] = 43;
        if (class477.field6686 == null) {
            class205.field3180[222] = 59;
            class205.field3180[192] = 58;
        } else {
            class205.field3180[520] = 59;
            class205.field3180[192] = 28;
            class205.field3180[222] = 58;
        }
        class205.field3180[92] = 74;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(ILwia;Lwia;Lwc;)V")
    public class666(int arg0, class791 arg1, class791 arg2, class72 arg3) {
        this.field9271 = arg2;
        this.field9281 = arg3;
        this.field9276 = arg1;
        if (this.field9276 != null) {
            this.field9274 = this.field9276.method4353(1, true);
        }
        if (this.field9271 != null) {
            this.field9269 = this.field9271.method4353(1, true);
        }
    }
}
