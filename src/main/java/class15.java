import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class15 extends RuntimeException {

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field194;

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "Ljava/lang/String;")
    public String field197;

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "Lu;")
    public static class33 field196 = null;

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "Lda;")
    public static class8 field195 = new class8();

    @OriginalMember(owner = "mapview!h", name = "e", descriptor = "Lk;")
    public static class21 field198 = class14.method92((byte) 57, "Scimitar Shop");

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(I)V", line = 4)
    public static void method94(int arg0) {
        if (arg0 != 64) {
            method94(-126);
        }
        field195 = null;
        field198 = null;
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 57)
    public class15(Throwable arg0, String arg1) {
        this.field194 = arg0;
        this.field197 = arg1;
    }
}
