import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class137 {

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public int field2374 = -1;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public int field2373 = -1;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Z")
    public boolean field2375 = true;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public int field2377 = 0;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Lpj;")
    public static class237 field2379 = class33.method353("::", 98);

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lpj;")
    public static class237 field2376 = class33.method353("Verbindung mit Update)2Server)3)3)3", 124);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public static void method950(boolean arg0) {
        if (arg0) {
            field2376 = null;
            field2379 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILie;)V")
    public final void method951(int arg0, int arg1, class32 arg2) {
        field2378++;
        if (arg0 <= 12) {
            this.method951(-92, 102, (class32) null);
        }
        while (true) {
            int var4 = arg2.method316((byte) 99);
            if (var4 == 0) {
                return;
            }
            this.method952(arg1, 4630, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILie;I)V")
    private final void method952(int arg0, int arg1, class32 arg2, int arg3) {
        if (arg3 == 1) {
            this.field2377 = class253.method1713(arg2.method313((byte) -80), -127);
        } else if (arg3 == 2) {
            this.field2373 = arg2.method316((byte) 102);
        } else if (arg3 == 3) {
            this.field2373 = arg2.method339(-16777216);
            if (this.field2373 == 65535) {
                this.field2373 = -1;
            }
        } else if (arg3 == 5) {
            this.field2375 = false;
        } else if (arg3 == 7) {
            this.field2374 = class253.method1713(arg2.method313((byte) -80), -128);
        } else if (arg3 == 8) {
            class69.field1354 = arg0;
        } else if (arg3 == 9) {
            arg2.method339(-16777216);
        } else if (arg3 != 10) {
            if (arg3 == 11) {
                arg2.method316((byte) 96);
            } else if (arg3 != 12) {
                if (arg3 == 13) {
                    arg2.method313((byte) -80);
                } else if (arg3 == 14) {
                    arg2.method316((byte) -100);
                }
            }
        }
        if (arg1 != 4630) {
            this.field2374 = -56;
        }
        field2371++;
    }
}
