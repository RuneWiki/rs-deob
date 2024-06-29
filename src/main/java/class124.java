import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class124 {

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    private int field1959 = 0;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Lll;")
    private class211 field1958;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1954 = "Created gameworld";

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1964 = "K";

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Luf;")
    public static class176 field1961;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Lud;")
    public static class2 field1953;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Lnc;")
    private class86 field1956;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Lnc;")
    public final class86 method889(byte arg0) {
        field1963++;
        if (this.field1959 > 0 && this.field1958.field3268[this.field1959 - 1] != this.field1956) {
            class86 var2 = this.field1956;
            this.field1956 = var2.field1407;
            return var2;
        }
        while (this.field1959 < this.field1958.field3278) {
            class86 var3 = this.field1958.field3268[this.field1959++].field1407;
            if (this.field1958.field3268[this.field1959 - 1] != var3) {
                this.field1956 = var3.field1407;
                return var3;
            }
        }
        if (arg0 != 94) {
            field1960 = -97;
        }
        return null;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
    public static void method890(byte arg0) {
        field1964 = null;
        int var1 = 74 % ((arg0 - 63) / 56);
        field1954 = null;
        field1961 = null;
        field1953 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static final void method891(int arg0) {
        class142.field2186 = arg0;
        for (int var1 = 0; var1 < class113.field1777; var1++) {
            for (int var2 = 0; var2 < class191.field3032; var2++) {
                if (class255.field3907[arg0][var1][var2] == null) {
                    class255.field3907[arg0][var1][var2] = new class23(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lll;)V")
    public class124(class211 arg0) {
        this.field1958 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)Lnc;")
    public final class86 method892(byte arg0) {
        if (arg0 != 100) {
            this.field1959 = -68;
        }
        this.field1959 = 0;
        field1962++;
        return this.method889((byte) 94);
    }
}
