import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public abstract class class135 {

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "[I")
    public static int[] field2208 = new int[14];

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2210 = 0;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Lmh;")
    public static class263 field2203 = null;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Lpi;")
    public static class201 field2209 = new class201(4);

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field2213 = 2;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Llc;")
    public static class270 field2204;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Llc;")
    public static class270 field2207;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "[Llf;")
    public static class94[] field2202;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static final void method1019(boolean arg0) {
        field2211++;
        class113.field1883 = 0;
        class255.field3855 = 0;
        class252.field3799 = 0;
        if (!arg0) {
            field2209 = null;
        }
        class201.field2963 = 0;
        class258.field4001 = false;
        class74.field1172 = -1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBI)I")
    public abstract int method127(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1020(byte arg0, String[] arg1) {
        field2212++;
        String[] var2 = new String[5];
        if (arg0 != 0) {
            field2209 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)J")
    public abstract long method125(boolean arg0);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1021(Component arg0, int arg1) {
        field2205++;
        Method var2 = class122.field2032;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class34.field431);
        arg0.addFocusListener(class34.field431);
        int var3 = -64 % ((arg1 - 38) / 36);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static void method1022(byte arg0) {
        field2207 = null;
        field2208 = null;
        field2202 = null;
        field2203 = null;
        field2209 = null;
        if (arg0 != -36) {
            method1021((Component) null, -84);
        }
        field2204 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public abstract void method124(int arg0);
}
