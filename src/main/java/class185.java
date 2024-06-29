import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class185 extends class59 {

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    private int field3004;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "Z")
    public static boolean field2999 = false;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "[I")
    public static int[] field2997 = new int[128];

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field3002 = 0;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "Lph;")
    private static class229 field3001 = class266.method1858("white:", 0);

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "Lph;")
    public static class229 field2998 = field3001;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field3008 = -2;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "Lph;")
    public static class229 field3009 = class266.method1858("Benutzeroberfl-=che geladen)3", 0);

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "Z")
    public static boolean field3006 = false;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "Lph;")
    public static class229 field3005 = field3001;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)[I", line = 7)
    public final int[] method63(boolean arg0, int arg1) {
        if (!arg0) {
            field2998 = (class229) null;
        }
        field3000++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            class42.method315(var3, 0, class293.field4789, this.field3004);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILhb;)V", line = 53)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg1 == 0) {
            this.field3004 = (arg2.method1178(8) << 12) / 255;
        }
        if (arg0 == 115) {
            field3007++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "(I)V", line = 74)
    public static void method1301(int arg0) {
        field2997 = null;
        if (arg0 == -257) {
            field3005 = null;
            field3009 = null;
            field3001 = null;
            field2998 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)I", line = 88)
    public static final int method1302(int arg0, int arg1) {
        field3003++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg1 >= -1) {
            return 120;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 144)
    public class185() {
        this(4096);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V", line = 164)
    private class185(int arg0) {
        super(0, true);
        this.field3004 = 4096;
        this.field3004 = arg0;
    }
}
