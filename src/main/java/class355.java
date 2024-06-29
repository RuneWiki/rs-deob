import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class355 implements class632 {

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
    public int field5258;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lcaa;)V", line = 12)
    public static final void method2197(class538 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            int var10002;
            for (int var2 = 0; var2 < class311.field4576[var1]; var2++) {
                if (class313.field4591[var1][var2] == arg0) {
                    class667.method3744(class313.field4591[var1], var2 + 1, class313.field4591[var1], var2, class311.field4576[var1] - var2 - 1);
                    var10002 = class311.field4576[var1]--;
                    return;
                }
            }
            for (int var3 = 0; var3 < class48.field760[var1]; var3++) {
                if (class403.field6051[var1][var3] == arg0) {
                    class667.method3744(class403.field6051[var1], var3 + 1, class403.field6051[var1], var3, class48.field760[var1] - var3 - 1);
                    var10002 = class48.field760[var1]--;
                    return;
                }
            }
            for (int var4 = 0; var4 < class464.field6700[var1]; var4++) {
                if (class153.field2152[var1][var4] == arg0) {
                    class667.method3744(class153.field2152[var1], var4 + 1, class153.field2152[var1], var4, class464.field6700[var1] - var4 - 1);
                    var10002 = class464.field6700[var1]--;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mea", name = "toString", descriptor = "()Ljava/lang/String;", line = 70)
    public final String toString() {
        field5257++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V", line = 78)
    public static final void method2198(byte arg0) {
        field5256++;
        int var1 = 0;
        for (int var2 = 0; var2 < class72.field1144; var2++) {
            for (int var3 = 0; var3 < class668.field9444; var3++) {
                if (class237.method1459(true, var1, var3, var2, class603.field8695, 4095)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != -27) {
            method2197(null);
        }
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 121)
    public class355(String arg0, int arg1) {
        this.field5258 = arg1;
    }
}
