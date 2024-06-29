import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class408 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field5877 = 0;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field5882 = 0;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field5880 = 0;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field5885 = 0;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5878;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V", line = 6)
    public static final void method2609() {
        for (int var0 = 0; var0 < class244.field3466; var0++) {
            class233 var1 = class97.field1168[var0];
            class257.method1727(var1);
            class97.field1168[var0] = null;
        }
        class244.field3466 = 0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 26)
    public static void method2610(byte arg0) {
        int var1 = 80 / ((68 - arg0) / 37);
        field5878 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ltq;Ltq;IBZ)V", line = 45)
    public static final void method2611(class376 arg0, class376 arg1, int arg2, byte arg3, boolean arg4) {
        class300.field4215 = arg1;
        class352.field4977 = arg2;
        class178.field2452 = arg4;
        int var5 = -76 % ((arg3 - 65) / 33);
        field5881++;
        class303.field4262 = arg0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V", line = 68)
    public static final void method2612(int arg0, int arg1) {
        field5879++;
        class4.field63 = arg1;
        if (arg0 != 21386) {
            field5878 = null;
        }
        class311.field4396.method1618(arg0 - 21386);
    }
}
