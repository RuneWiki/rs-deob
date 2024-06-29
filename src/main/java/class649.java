import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class649 extends class623 {

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "J")
    public long field9266;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Z")
    public boolean field9264;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public int field9268;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    public int field9274;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public int field9270;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "Z")
    public boolean field9267;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "Ljava/lang/String;")
    public String field9265;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public int field9271;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public int field9263;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "J")
    public long field9272;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "Z")
    public boolean field9275;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "Ljava/lang/String;")
    public String field9269;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "Lpia;")
    public static class94 field9276 = new class94(58, 2);

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public static int field9279 = 64;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    public static int field9281 = -1;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field9277 = 0;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "Ljava/lang/String;")
    public String field9280;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 5)
    public static void method3693(int arg0) {
        field9276 = null;
        if (arg0 != 15755) {
            field9278 = -35;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 38)
    public class649(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field9266 = arg10;
        this.field9264 = arg9;
        this.field9268 = arg2;
        this.field9274 = arg7;
        this.field9270 = arg3;
        this.field9267 = arg11;
        this.field9265 = arg0;
        this.field9271 = arg6;
        this.field9263 = arg4;
        this.field9272 = arg5;
        this.field9275 = arg8;
        this.field9269 = arg1;
    }
}
