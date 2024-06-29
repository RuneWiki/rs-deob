import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class24 extends class477 {

    @OriginalMember(owner = "client!wv", name = "D", descriptor = "Z")
    public static boolean field232 = false;

    @OriginalMember(owner = "client!wv", name = "w", descriptor = "Ljj;")
    public static class398 field225 = new class398(56, 7);

    @OriginalMember(owner = "client!wv", name = "F", descriptor = "Lcb;")
    public static class318 field234 = new class318(43, -1);

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!wv", name = "B", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!wv", name = "C", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!wv", name = "E", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!wv", name = "y", descriptor = "Lnj;")
    private class436 field227;

    @OriginalMember(owner = "client!wv", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field229;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZLdga;I)V", line = 4)
    private final void method140(boolean arg0, class138 arg1, int arg2) {
        field231++;
        if (arg0) {
            this.method145((byte) -108, null, -94);
        }
        if (arg2 != 249) {
            return;
        }
        int var4 = arg1.method957((byte) -87);
        if (this.field227 == null) {
            int var5 = class306.method1837((byte) -116, var4);
            this.field227 = new class436(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method957((byte) -98) == 1;
            int var8 = arg1.method904(126);
            class28 var9;
            if (var7) {
                var9 = new class61(arg1.method907(arg0));
            } else {
                var9 = new class360(arg1.method943(-105));
            }
            this.field227.method2504((long) var8, 9, var9);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)I", line = 51)
    public final int method141(int arg0, int arg1, int arg2) {
        field224++;
        if (this.field227 == null) {
            return arg0;
        } else if (arg1 == -21439) {
            class360 var4 = (class360) this.field227.method2506(64, (long) arg2);
            return var4 == null ? arg0 : var4.field5197;
        } else {
            return -80;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILdga;)V", line = 77)
    public final void method142(int arg0, class138 arg1) {
        if (arg0 > -76) {
            return;
        }
        while (true) {
            int var3 = arg1.method957((byte) -72);
            if (var3 == 0) {
                field228++;
                return;
            }
            this.method140(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 99)
    public static final void method143(int arg0) {
        if (arg0 != -9830) {
            field232 = false;
        }
        class560 var1 = class372.field5329;
        synchronized (class372.field5329) {
            class372.field5329.method3144(true);
        }
        field233++;
    }

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "(I)V", line = 112)
    public static void method144(int arg0) {
        field225 = null;
        field229 = null;
        field234 = null;
        if (arg0 != -1) {
            method144(42);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;", line = 141)
    public final String method145(byte arg0, String arg1, int arg2) {
        field226++;
        if (this.field227 == null) {
            return arg1;
        }
        class61 var4 = (class61) this.field227.method2506(119, (long) arg2);
        if (var4 == null) {
            return arg1;
        } else {
            int var5 = -30 % ((arg0 + 71) / 50);
            return var4.field848;
        }
    }
}
