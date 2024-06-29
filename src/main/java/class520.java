import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class520 extends class383 {

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public int field7507;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "J")
    public long field7517;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public int field7515;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public int field7511;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Ljava/lang/String;")
    public String field7506;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public int field7509;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Z")
    public boolean field7516;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public int field7508;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Ljava/lang/String;")
    public String field7513;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Z")
    public boolean field7518;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field7512 = 0;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Lkg;")
    public static class179 field7510 = new class179(0, 0);

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "[Lta;")
    public static class143[] field7520;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I", line = 4)
    public static final int method3091(int arg0, int arg1) {
        field7514++;
        return arg0 == 8841 ? (arg1 & 0x3F94D) >> 11 : -83;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 33)
    public static void method3092(int arg0) {
        if (arg0 != 0) {
            method3092(-8);
        }
        field7520 = null;
        field7510 = null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 45)
    public class520(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field7507 = arg6;
        this.field7517 = arg5;
        this.field7515 = arg4;
        this.field7511 = arg7;
        this.field7506 = arg1;
        this.field7509 = arg2;
        this.field7516 = arg9;
        this.field7508 = arg3;
        this.field7513 = arg0;
        this.field7518 = arg8;
    }
}
