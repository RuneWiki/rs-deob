import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class376 {

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Lff;")
    private class9 field5288 = new class9(64);

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Lvh;")
    private class240 field5286;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field5289 = -2;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Lub;")
    public static class18 field5285;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)Lha;")
    public final class41 method2163(int arg0, byte arg1) {
        field5291++;
        class9 var3 = this.field5288;
        class41 var4;
        synchronized (this.field5288) {
            var4 = (class41) this.field5288.method56((long) arg0, arg1 ^ 0x7B);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5286.method1411(true, arg0, 35);
        class41 var6 = new class41();
        if (var5 != null) {
            var6.method260(false, new class365(var5));
        }
        if (arg1 != 49) {
            field5289 = -25;
        }
        var6.method258(7);
        class9 var7 = this.field5288;
        synchronized (this.field5288) {
            this.field5288.method73((long) arg0, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public final void method2164(int arg0) {
        field5290++;
        if (arg0 <= 101) {
            this.method2163(-126, (byte) 103);
        }
        class9 var2 = this.field5288;
        synchronized (this.field5288) {
            this.field5288.method65(false);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public static final void method2165(int arg0) {
        if (class418.field6109.method465()) {
            class418.field6109.method503(class474.field6924);
            class319.method1805(arg0 ^ 0xFFFFFFFD);
            class418.field6109.method473(class474.field6924);
            class418.field6109.method449(class474.field6924);
        } else {
            class196.method1211(false, class278.field3761);
        }
        if (arg0 != -1) {
            field5289 = -11;
        }
        field5284++;
        class242.method1428((byte) 102);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
    public final void method2166(boolean arg0) {
        class9 var2 = this.field5288;
        synchronized (this.field5288) {
            if (!arg0) {
                this.field5286 = null;
            }
            this.field5288.method67(-104);
        }
        field5283++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIJIIBIZLjava/lang/String;Ljava/lang/String;Z)V")
    public static final void method2167(int arg0, int arg1, long arg2, int arg3, int arg4, byte arg5, int arg6, boolean arg7, String arg8, String arg9, boolean arg10) {
        field5292++;
        if (class9.field86 || class370.field5198 >= 500) {
            return;
        }
        int var12 = arg4 == -1 ? class287.field3858 : arg4;
        class149 var13 = new class149(arg9, arg8, var12, arg3, arg6, arg2, arg0, arg1, arg10, arg7);
        class260.field3585.method3070(var13, (byte) -126);
        class370.field5198++;
        if (arg5 != -90) {
            field5289 = 45;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BB)C")
    public static final char method2168(byte arg0, byte arg1) {
        field5287++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class281.field3798[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        if (arg1 > -122) {
            field5289 = -74;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public static void method2169(int arg0) {
        if (arg0 != -1) {
            method2169(55);
        }
        field5285 = null;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Llf;ILvh;)V")
    public class376(class157 arg0, int arg1, class240 arg2) {
        this.field5286 = arg2;
        if (this.field5286 != null) {
            this.field5286.method1397((byte) -10, 35);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
    public final void method2170(int arg0, int arg1) {
        class9 var3 = this.field5288;
        synchronized (this.field5288) {
            this.field5288.method61((byte) -67, arg0);
        }
        if (arg1 != -1) {
            method2165(70);
        }
        field5282++;
    }
}
