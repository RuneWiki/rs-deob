import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class280 extends class504 {

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "Lhfa;")
    public class287 field3983;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "Z")
    public static boolean field3984 = false;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "Lcu;")
    public static class206 field3985 = new class206(77, -1);

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1743(int arg0) {
        field3987++;
        if (arg0 < 106) {
            field3984 = true;
        }
        class251.field3460.method70(class680.field9591, class30.field484, class38.field575);
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lhfa;)V", line = 15)
    public class280(class287 arg0) {
        this.field3983 = arg0;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)Z", line = 23)
    public static final boolean method1744(int arg0, int arg1, int arg2) {
        field3982++;
        if (arg0 != -8401) {
            method1743(63);
        }
        return (arg2 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V", line = 39)
    public static final void method1745(byte arg0) {
        field3986++;
        class666 var1 = class603.field8015;
        synchronized (class603.field8015) {
            if (arg0 < 101) {
                method1744(-52, -106, 32);
            }
            class603.field8015.method3739(0);
        }
        class666 var2 = class174.field2680;
        synchronized (class174.field2680) {
            class174.field2680.method3739(0);
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V", line = 56)
    public static void method1746(int arg0) {
        if (arg0 != -31163) {
            field3985 = null;
        }
        field3985 = null;
    }
}
