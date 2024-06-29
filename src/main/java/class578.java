import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class578 extends InputStream {

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field8437 = -1;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "J")
    public static long field8440 = 0L;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "Lhw;")
    public static class114 field8439;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 9)
    public static void method3376(int arg0) {
        field8439 = null;
        if (arg0 > -34) {
            field8440 = 92L;
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)Lhw;", line = 19)
    public static final class114 method3377(int arg0) {
        if (arg0 != 15504) {
            method3377(-35);
        }
        field8443++;
        return class550.field7975;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V", line = 30)
    public static final void method3378(byte arg0) {
        if (arg0 < 97) {
            field8444 = 62;
        }
        field8438++;
        for (int var1 = 0; var1 < 5; var1++) {
            class25.field587[var1] = false;
        }
        class25.field582 = class346.field4550;
        class311.field4115 = 0;
        class221.field2860 = -1;
        class51.field842 = -1;
        class196.field2372 = class569.field8329;
        class586.field8507 = 5;
        class40.field752 = -1;
        class528.field7719 = class543.field7882;
        class500.field6997 = class627.field8995;
        class38.field713 = -1;
        class377.field5058 = class614.field8846;
        class227.field2938 = class89.field1250;
        class366.field4932 = 0;
    }

    @OriginalMember(owner = "client!oo", name = "read", descriptor = "()I", line = 72)
    public final int read() {
        class151.method974((byte) -102, 30000L);
        field8441++;
        return -1;
    }
}
