import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class334 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public int field4946 = 64;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public int field4950 = -1;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public int field4954 = 2;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Z")
    public boolean field4951 = false;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Z")
    public boolean field4956 = false;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public int field4955 = 1;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public int field4952 = 64;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[I")
    public static int[] field4948 = new int[14];

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Lci;")
    public static class320 field4945;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "[[Z")
    public static boolean[][] field4958;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILwn;II)V", line = 8)
    private final void method2120(int arg0, class519 arg1, int arg2, int arg3) {
        if (arg0 < 9) {
            this.field4950 = -33;
        }
        field4953++;
        if (arg2 == 1) {
            this.field4950 = arg1.method3018(566990904);
            if (this.field4950 == 65535) {
                this.field4950 = -1;
            }
        } else if (arg2 == 2) {
            this.field4946 = arg1.method3018(566990904) + 1;
            this.field4952 = arg1.method3018(566990904) + 1;
        } else if (arg2 == 3) {
            arg1.method3034((byte) 122);
        } else if (arg2 == 4) {
            this.field4954 = arg1.method3072((byte) -127);
        } else if (arg2 == 5) {
            this.field4955 = arg1.method3072((byte) -122);
        } else if (arg2 == 6) {
            this.field4951 = true;
            return;
        } else if (arg2 == 7) {
            this.field4956 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 68)
    public static void method2121(int arg0) {
        field4945 = null;
        field4958 = null;
        if (arg0 != 5) {
            method2121(26);
        }
        field4948 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 98)
    public static final void method2122(byte arg0) {
        field4949++;
        if (class141.field2180) {
            return;
        }
        if (class220.field3371.field2554) {
            class524.field7655 = ((int) class524.field7655 + 47 & 0xFFFFFFF0);
        } else {
            class294.field4384 += (12.0F - class294.field4384) / 2.0F;
        }
        if (arg0 == -7) {
            class472.field6873 = true;
            class141.field2180 = true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILwn;)V", line = 122)
    public final void method2123(int arg0, int arg1, class519 arg2) {
        while (true) {
            int var4 = arg2.method3072((byte) -123);
            if (var4 == 0) {
                int var5 = 93 % ((-arg1 - 6) / 45);
                field4947++;
                return;
            }
            this.method2120(69, arg2, var4, arg0);
        }
    }
}
