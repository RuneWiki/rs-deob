import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class584 {

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Ljava/lang/String;")
    public String field8323;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public int field8321;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Liu;")
    public static class517 field8325 = new class517(3, 6);

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lio;")
    public static class151 field8326 = new class151(13, 0, 1, 0);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field8324;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Ler;")
    public static class6 field8322;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "[[Lpb;")
    public static class366[][] field8319;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method3341(int arg0) {
        field8322 = null;
        field8319 = null;
        field8326 = null;
        int var1 = 42 / ((arg0 - 5) / 48);
        field8325 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lqa;ILsb;)I")
    public static final int method3342(class167 arg0, int arg1, class278 arg2) {
        field8320++;
        if (arg1 != 6) {
            field8319 = null;
        }
        if (arg2.field4058 != -1) {
            return arg2.field4058;
        }
        if (arg2.field4064 != -1) {
            class576 var3 = arg0.field2443.method2387((byte) 127, arg0.method407() ? arg2.field4064 : arg2.field4063);
            if (!var3.field8222) {
                return var3.field8209;
            }
        }
        return arg2.field4060;
    }

    @OriginalMember(owner = "client!jc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8324++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class584(String arg0, int arg1) {
        this.field8323 = arg0;
        this.field8321 = arg1;
    }
}
