import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class345 extends class539 {

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public int field4977;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "Z")
    public boolean field4984;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "Ljava/lang/String;")
    public String field4988;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "Z")
    public boolean field4989;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "J")
    public long field4979;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "I")
    public int field4983;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public int field4987;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
    public int field4981;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "Ljava/lang/String;")
    public String field4985;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "Lfc;")
    public static class235 field4982 = new class235(90, 8);

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "Lfw;")
    public static class52 field4986 = new class52();

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lvu;B)Z")
    public static final boolean method2055(class307 arg0, byte arg1) {
        field4978++;
        if (arg0 == null) {
            return false;
        } else if (arg1 != 101) {
            return false;
        } else if (!arg0.field4543) {
            return false;
        } else if (!arg0.method1883(-1, class148.field2179)) {
            return false;
        } else if (class278.field3897.method2061(-17305, (long) arg0.field4535) == null) {
            return class638.field9060.method2061(-17305, (long) arg0.field4527) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static void method2056(int arg0) {
        field4986 = null;
        if (arg0 != 90) {
            method2056(-18);
        }
        field4982 = null;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class345(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field4977 = arg6;
        this.field4984 = arg9;
        this.field4988 = arg0;
        this.field4989 = arg8;
        this.field4979 = arg5;
        this.field4983 = arg3;
        this.field4987 = arg7;
        this.field4981 = arg2;
        this.field4980 = arg4;
        this.field4985 = arg1;
    }
}
