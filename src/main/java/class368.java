import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class368 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lcba;")
    public static class471 field5005 = null;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public int field5003;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public int field5004;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field5008;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public int field5009;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lan;")
    public static class21 field5010;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method2206(int arg0) {
        field5010 = null;
        if (arg0 != -2702) {
            method2206(45);
        }
        field5005 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lfl;")
    public static final class630 method2207(int arg0, int arg1) {
        field5002++;
        class630 var2 = (class630) class494.field6915.method3252((long) arg0, (byte) 65);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class222.field3175.method240(1, arg0, (byte) -124);
        class630 var4 = new class630();
        var4.field9229 = arg0;
        if (var3 != null) {
            var4.method3671(new class11(var3), (byte) -36);
        }
        var4.method3670(arg1 - 20870);
        if (var4.field9219 == 2 && class397.field5663.method1242(0, (long) arg0) == null) {
            class397.field5663.method1241(new class10(class387.field5194), (long) arg0, arg1 ^ 0xFFFFAE33);
            class176.field2521[class387.field5194++] = var4;
        }
        if (arg1 == 20919) {
            class494.field6915.method3243(var4, (long) arg0, arg1 ^ 0xFFFFAE0E);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZZ)V")
    public static final void method2208(boolean arg0, boolean arg1) {
        if (class143.field2203 != null) {
            class143.field2203.method1004(34065);
            class143.field2203 = null;
        }
        field5006++;
        class348.field4669 = 0;
        class461.method2689((byte) 31);
        class1.method3();
        for (int var2 = 0; var2 < 4; var2++) {
            class428.field6075[var2].method962(-78);
        }
        class380.method2248(-63, false);
        System.gc();
        class565.method3220(2, -30488);
        class531.field7446 = -1;
        class144.field2229 = arg0;
        class559.method3183((byte) 111, true);
        class193.field2733 = 0;
        class519.field7304 = 0;
        class6.field80 = 0;
        class489.field6847 = 0;
        class147.field2264 = 0;
        class88.field1390 = 0;
        for (int var3 = 0; var3 < class132.field2113.length; var3++) {
            class132.field2113[var3] = null;
        }
        class122.method848(1582718753);
        for (int var4 = 0; var4 < 2048; var4++) {
            class349.field4696[var4] = null;
        }
        class480.field6764 = 0;
        class278.field3837.method1247(0);
        class204.field2859 = 0;
        class220.field3147.method1247(0);
        class607.method3565(0);
        class467.field6578 = 0;
        class189.field2681.method2683((byte) -106);
        class371.method2212(-1);
        class592.method3492(0);
        class77.field1257 = null;
        class591.field8434 = 0L;
        if (arg1) {
            class45.method440(11, 33);
            return;
        }
        class45.method440(2, 64);
        try {
            class54.method508((byte) 56, class500.field6968.field3975, "loggedout");
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)I")
    public static final int method2209(int arg0) {
        field5007++;
        if (arg0 != 0) {
            field5005 = null;
        }
        return class597.field8634;
    }
}
