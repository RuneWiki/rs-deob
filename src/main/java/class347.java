import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class347 {

    @OriginalMember(owner = "client!om", name = "f", descriptor = "[F")
    public static float[] field4466 = new float[4];

    @OriginalMember(owner = "client!om", name = "e", descriptor = "[I")
    public static int[] field4465 = new int[3];

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "[I")
    public static int[] field4463;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLpba;)Z", line = 3)
    public static final boolean method2001(boolean arg0, class310 arg1) {
        if (arg0) {
            method2004(true);
        }
        field4462++;
        class687 var2 = class232.field3017.method2358(0, arg1.method131((byte) -97));
        if (var2.field9376 == -1) {
            return true;
        } else {
            class329 var3 = class93.field1189.method1002(var2.field9376, (byte) 105);
            return var3.field4098 == -1 ? true : var3.method1890((byte) 109);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIB)V", line = 25)
    public static final void method2002(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = -63 / ((arg3 + 55) / 40);
        field4461++;
        class284 var5 = class367.field4732[arg1][arg2];
        class589.method3272(arg0, var5 == null ? class593.field7959 : var5, (byte) -31);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 41)
    public static final boolean method2003(String arg0, byte arg1) {
        field4464++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != 22) {
            field4466 = null;
        }
        for (int var2 = 0; var2 < class284.field3600; var2++) {
            if (arg0.equalsIgnoreCase(class136.field1659[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class67.field815.field4673);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 80)
    public static void method2004(boolean arg0) {
        if (arg0) {
            method2003(null, (byte) 92);
        }
        field4463 = null;
        field4466 = null;
        field4465 = null;
    }
}
