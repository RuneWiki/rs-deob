import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class97 extends class223 {

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "J")
    public long field1308;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "Z")
    public boolean field1304;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "Z")
    public boolean field1298;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "Ljava/lang/String;")
    public String field1300;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "Ljava/lang/String;")
    public String field1303;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "Lfa;")
    public static class156 field1301 = new class156(64);

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "Lsl;")
    public static class318 field1309 = new class318(37, 15);

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "Z")
    public static boolean field1311 = true;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "[S")
    public static short[] field1312 = new short[256];

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "Lbg;")
    public static class324 field1310 = new class324(80, 7);

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V", line = 22)
    public static void method831(byte arg0) {
        field1312 = null;
        field1301 = null;
        if (arg0 != -3) {
            field1309 = null;
        }
        field1309 = null;
        field1310 = null;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 43)
    public class97(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field1299 = arg4;
        this.field1308 = arg5;
        this.field1304 = arg8;
        this.field1305 = arg7;
        this.field1306 = arg2;
        this.field1302 = arg6;
        this.field1307 = arg3;
        this.field1298 = arg9;
        this.field1300 = arg0;
        this.field1303 = arg1;
    }
}
