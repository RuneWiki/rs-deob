import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class332 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lrk;")
    public static class427 field4514;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lrk;")
    public static class427 field4515;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 6)
    public static void method2111(int arg0) {
        if (arg0 <= -40) {
            field4515 = null;
            field4514 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 19)
    public static final void method2112(int arg0) {
        field4512++;
        class355.field4828.field3938 = 0;
        class118.field1648 = 0;
        class213.field2965 = -1;
        class322.field4364 = 0;
        class213.field2961 = 0;
        class35.field533 = arg0;
        class363.field5019 = -1;
        class417.field5851.field3938 = 0;
        class260.field3510 = -1;
        class76.method653((byte) 2);
        class269.method1730((byte) -33);
        for (int var1 = 0; var1 < class220.field3044.length; var1++) {
            if (class220.field3044[var1] != null) {
                class220.field3044[var1].field4988 = -1;
            }
        }
        for (int var2 = 0; var2 < class298.field4012.length; var2++) {
            if (class298.field4012[var2] != null) {
                class298.field4012[var2].field4988 = -1;
            }
        }
        class191.method1374(2);
        class184.field2675 = 1;
        class29.method340(30, (byte) -58);
        for (int var3 = 0; var3 < 100; var3++) {
            class135.field1930[var3] = true;
        }
        class132.method1033(arg0 ^ 0x36);
    }
}
