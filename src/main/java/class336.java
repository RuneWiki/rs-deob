import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class336 extends class333 {

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public int field4224;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "Ljava/lang/String;")
    public String field4225;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "Z")
    public boolean field4223;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "Ljava/lang/String;")
    public String field4221;

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "Z")
    public boolean field4233;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "I")
    public int field4228;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "J")
    public long field4226;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    public int field4229;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "Lcq;")
    public static class110 field4222 = new class110(5, -2);

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "Lcq;")
    public static class110 field4227;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 15)
    public static void method1934(int arg0) {
        field4227 = null;
        if (arg0 != -2) {
            method1934(80);
        }
        field4222 = null;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 33)
    public class336(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field4224 = arg2;
        this.field4225 = arg0;
        this.field4223 = arg9;
        this.field4231 = arg3;
        this.field4221 = arg1;
        this.field4233 = arg8;
        this.field4228 = arg7;
        this.field4230 = arg6;
        this.field4226 = arg5;
        this.field4229 = arg4;
    }
}
