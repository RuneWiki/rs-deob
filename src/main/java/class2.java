import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class179 {

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "Z")
    public boolean field18;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "J")
    public long field12;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "Ljava/lang/String;")
    public String field9;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "Z")
    public boolean field13;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "Ljava/lang/String;")
    public String field16;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field14 = -50;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "Loe;")
    public static class127 field15 = new class127(33, 8);

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 15)
    public static void method3(byte arg0) {
        if (arg0 != 58) {
            method3((byte) -93);
        }
        field15 = null;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 32)
    public class2(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field11 = arg2;
        this.field17 = arg3;
        this.field18 = arg9;
        this.field12 = arg5;
        this.field9 = arg0;
        this.field10 = arg6;
        this.field13 = arg8;
        this.field16 = arg1;
        this.field20 = arg7;
        this.field19 = arg4;
    }
}
