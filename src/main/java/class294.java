import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class294 {

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Z")
    public boolean field4832 = true;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public int field4830 = -1;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public int field4833 = -1;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public int field4835 = 0;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field4826 = 0;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lbb;")
    public static class49 field4831;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "[[I")
    public static int[][] field4829;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILab;)V")
    public final void method2032(int arg0, int arg1, class249 arg2) {
        field4828++;
        if (arg0 != -2952) {
            this.method2033(-121, 8, (class249) null, 47);
        }
        while (true) {
            int var4 = arg2.method1802((byte) -88);
            if (var4 == 0) {
                return;
            }
            this.method2033(14, var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILab;I)V")
    private final void method2033(int arg0, int arg1, class249 arg2, int arg3) {
        if (arg1 == 1) {
            this.field4835 = class70.method478(false, arg2.method1812((byte) 52));
        } else if (arg1 == 2) {
            this.field4833 = arg2.method1802((byte) 54);
        } else if (arg1 == 3) {
            this.field4833 = arg2.method1821((byte) 51);
            if (this.field4833 == 65535) {
                this.field4833 = -1;
            }
        } else if (arg1 == 5) {
            this.field4832 = false;
        } else if (arg1 == 7) {
            this.field4830 = class70.method478(false, arg2.method1812((byte) 52));
        } else if (arg1 == 8) {
            class227.field3846 = arg3;
        } else if (arg1 == 9) {
            arg2.method1821((byte) 51);
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg2.method1802((byte) -90);
            } else if (arg1 != 12) {
                if (arg1 == 13) {
                    arg2.method1812((byte) 52);
                } else if (arg1 == 14) {
                    arg2.method1802((byte) 96);
                }
            }
        }
        field4827++;
        if (arg0 != 14) {
            field4829 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public static void method2034(int arg0) {
        field4831 = null;
        if (arg0 != 8347) {
            method2034(17);
        }
        field4829 = null;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
    public static final void method2035(int arg0) {
        int var1 = -111 % ((68 - arg0) / 37);
        field4834++;
        class183.field2921.method94(34);
    }
}
