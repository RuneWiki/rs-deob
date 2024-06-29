import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class class75 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[I")
    public static int[] field884 = new int[64];

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Z")
    public static boolean field890 = false;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "[[I")
    public static int[][] field887 = new int[128][128];

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "[[I")
    public static int[][] field891 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 5)
    public static final void method416(byte arg0) {
        class237 var1 = class88.field1039;
        synchronized (class88.field1039) {
            class88.field1039.method1626((byte) 106);
        }
        field885++;
        if (arg0 != -64) {
            method418(45, true, -100, 59);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 18)
    public static void method417(int arg0) {
        field891 = null;
        field884 = null;
        field887 = null;
        if (arg0 <= 41) {
            field884 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZII)V", line = 36)
    public static final void method418(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return;
        }
        field888++;
        class20 var4 = class369.method2351((byte) 72, 9, arg2);
        var4.method146(77);
        var4.field252 = arg3;
        var4.field255 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V", line = 53)
    public static final void method419(int arg0) {
        class237 var1 = class265.field3773;
        synchronized (class265.field3773) {
            class265.field3773.method1618(0);
        }
        field883++;
        if (arg0 != -21360) {
            method416((byte) -123);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)Z", line = 71)
    public static final boolean method420(int arg0, int arg1) {
        field892++;
        class130 var2 = class106.method586((byte) 60, arg1);
        if (var2 == null) {
            return false;
        } else if (class185.field2686 == 3) {
            String var3 = "";
            if (class237.field3389 != 0) {
                var3 = ":" + (var2.field1575 + 7000);
            }
            String var4 = "";
            if (class292.field4086 != null) {
                var4 = "/p=" + class292.field4086;
            }
            String var5 = "http://" + var2.field1586 + var3 + "/l=" + class271.field3836 + "/a=" + class303.field4269 + var4 + "/j" + (class217.field3066 ? "1" : "0") + ",o" + (class170.field2354 ? "1" : "0") + ",a2";
            try {
                class382.field5381.getAppletContext().showDocument(new URL(var5), "_self");
            } catch (Exception var6) {
                return false;
            }
            return arg0 == -11745 ? true : true;
        } else {
            class397.field5685 = var2.field1575;
            class310.field4384 = var2.field1586;
            if (class237.field3389 != 0) {
                class276.field3917 = class397.field5685 + 50000;
                class154.field1904 = class397.field5685 + 40000;
                class297.field4149 = class154.field1904;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)J")
    public abstract long method399(int arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)I")
    public abstract int method401(byte arg0, int arg1);

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
    public abstract void method400(int arg0);
}
