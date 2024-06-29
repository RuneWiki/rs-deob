import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class520 extends class287 {

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "Z")
    public boolean field7263 = true;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public int field7255 = 0;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public int field7266 = 12800;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public int field7264 = 12800;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public int field7270 = -1;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public int field7271 = 0;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public int field7267 = -1;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public int field7260;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "Ljava/lang/String;")
    public String field7269;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "Ljava/lang/String;")
    public String field7259;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public int field7274;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Lfha;")
    public class522 field7258;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "Lws;")
    public static class693 field7262 = new class693();

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V", line = 10)
    public static void method3089(byte arg0) {
        if (arg0 >= 126) {
            field7262 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[II)Z", line = 20)
    public final boolean method3090(int arg0, int arg1, int[] arg2, int arg3) {
        field7256++;
        for (class688 var5 = (class688) this.field7258.method3118((byte) 73); var5 != null; var5 = (class688) this.field7258.method3111(arg1 ^ 0x450)) {
            if (var5.method3925((byte) -93, arg0, arg3)) {
                var5.method3920(arg3, 0, arg0, arg2);
                return true;
            }
        }
        if (arg1 != 1062) {
            field7272 = 115;
        }
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([IIII)Z", line = 48)
    public final boolean method3091(int[] arg0, int arg1, int arg2, int arg3) {
        field7261++;
        for (class688 var5 = (class688) this.field7258.method3118((byte) 73); var5 != null; var5 = (class688) this.field7258.method3111(121)) {
            if (var5.method3923(arg3, arg2, (byte) -101)) {
                var5.method3924(arg1 ^ 0xFFFFCD95, arg3, arg2, arg0);
                return true;
            }
        }
        if (arg1 != 12800) {
            this.field7259 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 195)
    public class520(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field7270 = arg4;
        this.field7260 = arg3;
        this.field7263 = arg5;
        this.field7267 = arg6;
        this.field7269 = arg1;
        this.field7259 = arg2;
        this.field7274 = arg0;
        if (this.field7267 == 255) {
            this.field7267 = 0;
        }
        this.field7258 = new class522();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Z", line = 77)
    public final boolean method3092(int arg0, int arg1, int arg2) {
        field7257++;
        for (class688 var4 = (class688) this.field7258.method3118((byte) 73); var4 != null; var4 = (class688) this.field7258.method3111(119)) {
            if (var4.method3923(arg2, arg0, (byte) 109)) {
                return true;
            }
        }
        int var5 = -109 % ((48 - arg1) / 47);
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([IIIZI)Z", line = 119)
    public final boolean method3093(int[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field7273++;
        if (!arg3) {
            return true;
        }
        for (class688 var6 = (class688) this.field7258.method3118((byte) 73); var6 != null; var6 = (class688) this.field7258.method3111(127)) {
            if (var6.method3921(arg4, arg1, 0, arg2)) {
                var6.method3924(-72, arg2, arg4, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 159)
    public final void method3094(int arg0) {
        this.field7266 = 12800;
        this.field7255 = 0;
        this.field7264 = 12800;
        field7265++;
        this.field7271 = arg0;
        for (class688 var2 = (class688) this.field7258.method3118((byte) 73); var2 != null; var2 = (class688) this.field7258.method3111(arg0 ^ 0x7A)) {
            if (var2.field9644 > this.field7255) {
                this.field7255 = var2.field9644;
            }
            if (var2.field9650 < this.field7264) {
                this.field7264 = var2.field9650;
            }
            if (var2.field9652 < this.field7266) {
                this.field7266 = var2.field9652;
            }
            if (var2.field9653 > this.field7271) {
                this.field7271 = var2.field9653;
            }
        }
    }
}
