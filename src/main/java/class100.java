import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class100 extends class147 {

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field1218 = 0;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)I")
    public abstract int method487(byte arg0);

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)I")
    public abstract int method488(byte arg0);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)J")
    public abstract long method489(boolean arg0);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)I")
    public abstract int method490(int arg0);

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(B)V")
    public static final void method491(byte arg0) {
        if (class322.field4655 != null) {
            class322.field4655.method669(5000);
            class322.field4655 = null;
        }
        field1216++;
        class247.method1505(62);
        class196.method1074();
        for (int var1 = 0; var1 < 4; var1++) {
            class174.field2093[var1].method2534(-2);
        }
        class137.method649(arg0 ^ 0x5, false);
        System.gc();
        if (arg0 != 123) {
            method491((byte) -102);
        }
        class437.method2595(94, 2);
        class46.field593 = -1;
        class60.field756 = false;
        class110.method533(-1, true);
        class366.field5243 = 0;
        class312.field4565 = 0;
        class349.field5023 = 0;
        class3.field23 = false;
        class93.field1163 = 0;
        for (int var2 = 0; var2 < class251.field3525.length; var2++) {
            class251.field3525[var2] = null;
        }
        class220.method1228(2);
        for (int var3 = 0; var3 < 2048; var3++) {
            class46.field596[var3] = null;
        }
        class356.field5112 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class448.field6366[var4] = null;
        }
        class76.field913.method236(3);
        class347.method2103(arg0 ^ 0xFFFFDA7C);
        class315.field4613 = 0;
        class75.field909.method2717(arg0 - 97);
        class284.method1779(109);
        class217.method1215(arg0 - 39);
        class171.method842(-1, true);
        try {
            class336.method2038(class42.field512.field5106, -123, "loggedout");
        } catch (Throwable var5) {
        }
        class418.field6021 = null;
        class110.field1330 = 0L;
    }
}
