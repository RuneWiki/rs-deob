import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class233 extends class29 {

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "S")
    public short field3271;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "B")
    public byte field3285;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Z")
    public boolean field3272;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "S")
    public short field3267;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "B")
    public byte field3270;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "S")
    public short field3268;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "S")
    public short field3275;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "[C")
    public static char[] field3274;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "Ldp;")
    public static class2 field3279;

    static {
        new class362("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field3274 = new char[] { '[', ']', '#' };
        field3286 = 0;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)V", line = 3)
    public static final void method1538(int arg0, int arg1) {
        class425.field6091 = arg0;
        field3277++;
        class237 var2 = class66.field755;
        synchronized (class66.field755) {
            class66.field755.method1618(0);
        }
        int var3 = 83 / ((arg1 + 63) / 48);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V", line = 28)
    public static final void method1539(byte arg0, int arg1) {
        field3278++;
        int var2 = 34 % ((arg0 - 33) / 37);
        class296.field4123 = arg1;
        class237 var3 = class265.field3773;
        synchronized (class265.field3773) {
            class265.field3773.method1618(0);
        }
        class237 var4 = class247.field3528;
        synchronized (class247.field3528) {
            class247.field3528.method1618(0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)V", line = 46)
    public static void method1540(byte arg0) {
        field3274 = null;
        int var1 = -114 / ((arg0 + 82) / 44);
        field3279 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([Lgj;Z)V", line = 59)
    public static final void method1541(class381[] arg0, boolean arg1) {
        class347.field4919 = arg0.length;
        field3282++;
        class170.field2351 = new class381[class347.field4919 + 10];
        class222.field3112 = new int[class347.field4919 + 10];
        class316.method2074(arg0, 0, class170.field2351, 0, class347.field4919);
        for (int var2 = 0; var2 < class347.field4919; var2++) {
            class222.field3112[var2] = class170.field2351[var2].method761();
        }
        if (!arg1) {
            for (int var3 = class347.field4919; var3 < class170.field2351.length; var3++) {
                class222.field3112[var3] = 12;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;)V", line = 87)
    public static final void method1542(int arg0, String arg1) {
        field3280++;
        if (arg1.equals("")) {
            return;
        }
        if (arg0 != 27544) {
            field3273 = 95;
        }
        class215.field3040++;
        class62.field718.method2143(94, -2);
        class62.field718.method1583(class81.method457(arg1, (byte) -49), (byte) -79);
        class62.field718.method1596(arg1, false);
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)V", line = 105)
    public void method1209(int arg0) {
        field3276++;
        if (arg0 != 0) {
            this.method61(-35);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZ)Z", line = 122)
    public static boolean method1543(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 139)
    public class233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field3271 = (short) arg7;
        this.field3287 = (short) arg2;
        this.field3285 = (byte) arg0;
        this.field3272 = arg8;
        this.field3267 = (short) arg6;
        this.field3284 = (short) arg1;
        this.field3270 = arg9;
        this.field3269 = (short) arg3;
        this.field3268 = (short) arg4;
        this.field3275 = (short) arg5;
    }

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "(I)I")
    public abstract int method61(int arg0);
}
