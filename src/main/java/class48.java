import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public abstract class class48 {

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "[Lam;")
    public static class314[] field689 = new class314[2048];

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field690 = " ";

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "S")
    public static short field691 = 205;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Z")
    public static boolean field695 = false;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lbj;Z)Lfh;")
    public static final class114 method295(class215 arg0, boolean arg1) {
        field692++;
        arg0.method1374((byte) -60);
        int var2 = arg0.method1374((byte) -60);
        class114 var3 = class197.method1241(var2, (byte) -59);
        var3.field1641 = arg0.method1374((byte) -60);
        if (!arg1) {
            return null;
        }
        int var4 = arg0.method1374((byte) -60);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1374((byte) -60);
            var3.method13(arg0, var6, 12953);
        }
        var3.method12((byte) 105);
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)I")
    public abstract int method296(int arg0);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method297(int arg0, Component arg1);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method298(byte arg0) {
        if (arg0 != -42) {
            method298((byte) -107);
        }
        field689 = null;
        field690 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
    public static final String method299(int arg0, long arg1, int[] arg2, int arg3) {
        field694++;
        if (arg0 > -53) {
            return null;
        }
        if (class57.field790 != null) {
            String var5 = class57.field790.method479(arg2, -2, arg3, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method300(Component arg0, byte arg1);

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
    public static final void method301(byte arg0) {
        field687++;
        class220.method1435((long) class35.field533);
        if (class104.field1499 != -1) {
            class198.method1250(class104.field1499, 117);
        }
        for (int var1 = 0; var1 < class261.field4206; var1++) {
            if (class274.field4355[var1]) {
                class30.field459[var1] = true;
            }
            class291.field4640[var1] = class274.field4355[var1];
            class274.field4355[var1] = false;
        }
        if (arg0 < 79) {
            method298((byte) -99);
        }
        class164.field2334 = -1;
        class255.field4034 = -1;
        class100.field1442 = class35.field533;
        class10.field106 = null;
        if (class104.field1499 != -1) {
            class261.field4206 = 0;
            class27.method182(0);
        }
        class266.method1738();
        class208.field3094 = 0;
    }
}
