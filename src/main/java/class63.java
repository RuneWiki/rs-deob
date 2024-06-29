import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class63 {

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public int field852 = 127;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public int field853 = -1;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
    public int field857 = 0;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
    public int field860 = 64;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "Z")
    public boolean field855 = false;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public int field856 = -1;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
    public int field863 = 8;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
    public int field861 = 1190717;

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "Z")
    public boolean field867 = true;

    @OriginalMember(owner = "client!fw", name = "s", descriptor = "I")
    public int field870 = 512;

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "Z")
    public boolean field868 = true;

    @OriginalMember(owner = "client!fw", name = "t", descriptor = "[I")
    public static int[] field871 = new int[6];

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "[B")
    public static byte[] field866 = new byte[2048];

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "Llk;")
    public class614 field869;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "Z")
    public static boolean field862;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
    public final void method538(int arg0) {
        if (arg0 == 0) {
            this.field863 = this.field865 | this.field863 << 8;
            field854++;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IBLes;)V")
    private final void method539(int arg0, byte arg1, class403 arg2) {
        if (arg1 > -11) {
            return;
        }
        field864++;
        if (arg0 == 1) {
            this.field857 = class343.method2034((byte) -118, arg2.method2358(79));
        } else if (arg0 == 2) {
            this.field856 = arg2.method2396((byte) -114);
        } else if (arg0 == 3) {
            this.field856 = arg2.method2390((byte) 0);
            if (this.field856 == 65535) {
                this.field856 = -1;
            }
        } else if (arg0 == 5) {
            this.field868 = false;
        } else if (arg0 == 7) {
            this.field853 = class343.method2034((byte) -106, arg2.method2358(121));
        } else if (arg0 == 8) {
            this.field869.field8256 = this.field865;
        } else if (arg0 == 9) {
            this.field870 = arg2.method2390((byte) 125) << 2;
        } else if (arg0 == 10) {
            this.field867 = false;
        } else if (arg0 == 11) {
            this.field863 = arg2.method2396((byte) -98);
        } else if (arg0 == 12) {
            this.field855 = true;
            return;
        } else if (arg0 == 13) {
            this.field861 = arg2.method2358(126);
            return;
        } else if (arg0 == 14) {
            this.field860 = arg2.method2396((byte) -109) << 2;
            return;
        } else if (arg0 == 16) {
            this.field852 = arg2.method2396((byte) -93);
            return;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(II)I")
    public static final int method540(int arg0, int arg1) {
        field858++;
        if (arg0 != 127) {
            field866 = null;
        }
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BLes;)V")
    public final void method541(byte arg0, class403 arg1) {
        while (true) {
            int var3 = arg1.method2396((byte) 72);
            if (var3 == 0) {
                if (arg0 <= 33) {
                    method540(105, 36);
                }
                field859++;
                return;
            }
            this.method539(var3, (byte) -20, arg1);
        }
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
    public static void method542(int arg0) {
        field866 = null;
        field871 = null;
        if (arg0 != 0) {
            method542(-112);
        }
    }
}
