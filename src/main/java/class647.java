import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class647 {

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "Ljava/lang/String;")
    public String field8953;

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "J")
    public long field8961;

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "I")
    public int field8954;

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "I")
    public int field8958;

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "Ljava/lang/String;")
    public String field8956;

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "Z")
    public static volatile boolean field8959 = true;

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "I")
    public static int field8960 = 0;

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "Lhg;")
    public static class693 field8957 = new class693(5, 8);

    @OriginalMember(owner = "client!nia", name = "j", descriptor = "Lkg;")
    public static class275 field8962 = new class275(16, 8);

    @OriginalMember(owner = "client!nia", name = "k", descriptor = "Z")
    public static boolean field8963 = false;

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V", line = 6)
    public static void method3628(int arg0) {
        int var1 = -22 % ((-arg0 - 53) / 50);
        field8962 = null;
        field8957 = null;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(B[Liea;)V", line = 16)
    public static final void method3629(byte arg0, class481[] arg1) {
        field8955++;
        class448.field5938 = arg1.length;
        class679.field9480 = new int[class448.field5938 + 10];
        class120.field1751 = new class481[class448.field5938 + 10];
        class135.method993(arg1, 0, class120.field1751, 0, class448.field5938);
        for (int var2 = 0; var2 < class448.field5938; var2++) {
            class679.field9480[var2] = class120.field1751[var2].method149();
        }
        int var3 = class448.field5938;
        if (arg0 <= 6) {
            method3628(24);
        }
        while (var3 < class120.field1751.length) {
            class679.field9480[var3] = 12;
            var3++;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lrba;III)V", line = 48)
    public static final void method3630(class435 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class289.field3784) {
            class14 var4 = class197.field2689[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field279 != null && var4.field279.method759(0)) {
                arg0.method754(30558, 0, var4.field279, class681.field9504, true, 0, class699.field9729);
            }
        }
        if (arg3 < class289.field3784) {
            class14 var5 = class197.field2689[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field279 != null && var5.field279.method759(0)) {
                arg0.method754(30558, 0, var5.field279, class681.field9504, true, class699.field9729, 0);
            }
        }
        if (arg2 < class289.field3784 && arg3 < class463.field6223) {
            class14 var6 = class197.field2689[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field279 != null && var6.field279.method759(0)) {
                arg0.method754(30558, 0, var6.field279, class681.field9504, true, class699.field9729, class699.field9729);
            }
        }
        if (arg2 < class289.field3784 && arg3 > 0) {
            class14 var7 = class197.field2689[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field279 != null && var7.field279.method759(0)) {
                arg0.method754(30558, 0, var7.field279, class681.field9504, true, -class699.field9729, class699.field9729);
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 104)
    public class647(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field8953 = arg3;
        this.field8961 = arg4;
        this.field8954 = arg0;
        this.field8958 = arg2;
        this.field8956 = arg1;
    }
}
