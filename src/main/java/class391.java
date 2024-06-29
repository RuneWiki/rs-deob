import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class391 implements class353 {

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public int field5390;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "J")
    public static long field5386 = 20000000L;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Ler;")
    public static class90 field5388;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2328(int arg0) {
        field5389++;
        if (arg0 != 20000000) {
            method2329(16);
        }
        for (class583 var1 = (class583) class174.field2677.method124((byte) 42); var1 != null; var1 = (class583) class174.field2677.method120(-116)) {
            if (class271.method1707(arg0 ^ 0x1312D47, var1.field8566)) {
                class529.method3188(-19054, var1);
            }
        }
        if (class103.field1484 == 1) {
            class157.method1128((byte) -126);
            return;
        }
        class118.method852(class37.field454, class483.field6896, class131.field1805, class340.field4704, true);
        int var2 = class470.field6636.method2126((byte) 118, class13.field118.method3408(arg0 - 19999923, class63.field795));
        for (class583 var3 = (class583) class174.field2677.method124((byte) 42); var3 != null; var3 = (class583) class174.field2677.method120(57)) {
            int var4 = class526.method3100(var3, 8359);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class131.field1805 = class103.field1484 * 16 + (class398.field5469 ? 26 : 22);
        class340.field4704 = var2 + 8;
    }

    @OriginalMember(owner = "client!sl", name = "toString", descriptor = "()Ljava/lang/String;", line = 60)
    public final String toString() {
        field5391++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 69)
    public static void method2329(int arg0) {
        if (arg0 != 0) {
            method2328(-87);
        }
        field5388 = null;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 79)
    public class391(String arg0, int arg1) {
        this.field5390 = arg1;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Z", line = 94)
    public static final boolean method2330(int arg0, int arg1, int arg2) {
        if (arg1 != 256) {
            method2328(86);
        }
        field5387++;
        return (arg0 & 0x100) != 0;
    }
}
