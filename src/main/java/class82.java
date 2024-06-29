import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class82 extends class260 {

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!ju", name = "v", descriptor = "J")
    public long field1238;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "Z")
    public boolean field1234;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!ju", name = "x", descriptor = "Ljava/lang/String;")
    public String field1240;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "Z")
    public boolean field1236;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "Ljava/lang/String;")
    public String field1227;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "[Leq;")
    public static class141[] field1229 = new class141[4];

    @OriginalMember(owner = "client!ju", name = "w", descriptor = "I")
    public static int field1239 = 0;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
    public static int field1232 = 2;

    @OriginalMember(owner = "client!ju", name = "y", descriptor = "Z")
    public static boolean field1241 = false;

    @OriginalMember(owner = "client!ju", name = "u", descriptor = "Lrs;")
    public static class461 field1237;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
    public static void method651(byte arg0) {
        field1237 = null;
        field1229 = null;
        if (arg0 >= -108) {
            method651((byte) 61);
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class82(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field1233 = arg7;
        this.field1238 = arg5;
        this.field1234 = arg8;
        this.field1235 = arg4;
        this.field1228 = arg6;
        this.field1240 = arg1;
        this.field1230 = arg3;
        this.field1236 = arg9;
        this.field1227 = arg0;
        this.field1231 = arg2;
    }
}
