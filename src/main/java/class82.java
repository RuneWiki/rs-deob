import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class82 extends class152 {

    @OriginalMember(owner = "client!gea", name = "y", descriptor = "[B")
    public byte[] field1116;

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "[I")
    public static int[] field1114 = new int[1];

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!gea", name = "A", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1117;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lqq;I)Lqq;", line = 4)
    public static final class502 method774(class502 arg0, int arg1) {
        field1118++;
        class502 var2 = arg0 == null ? new class502() : new class502(arg0);
        if (arg1 < 91) {
            return null;
        } else {
            var2.method3013(128, -1861186618, 9);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)V", line = 18)
    public static final void method775(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class507.field7210 == null) {
            class176 var1 = new class176();
            byte[] var2 = var1.method1202(16, 128, 78, 128);
            class507.field7210 = class606.method3447(false, var2, 0);
        }
        field1113++;
        if (class647.field8810 == null) {
            class433 var3 = new class433();
            byte[] var4 = var3.method2564(128, 0, 128, 16);
            class647.field8810 = class606.method3447(false, var4, 0);
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V", line = 49)
    public static void method776(int arg0) {
        field1117 = null;
        if (arg0 == 7186) {
            field1114 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "([B)V", line = 61)
    public class82(byte[] arg0) {
        this.field1116 = arg0;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIZ)V", line = 71)
    public static final void method777(int arg0, int arg1, boolean arg2) {
        field1115++;
        class430 var3 = class105.method861(arg0, Integer.MIN_VALUE, arg2);
        if (var3 != null) {
            for (int var4 = arg1; var4 < var3.field5670.length; var4++) {
                var3.field5670[var4] = -1;
                var3.field5667[var4] = 0;
            }
        }
    }
}
