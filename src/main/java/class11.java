import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 extends class153 {

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "Lok;")
    public class39 field202;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field198 = 1;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "Lpj;")
    public static class237 field201 = class33.method353(" loggt sich ein)3", 115);

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "Ljd;")
    public static class86 field199;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "[[S")
    public static short[][] field203;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public static void method115(byte arg0) {
        int var1 = -118 % ((82 - arg0) / 43);
        field201 = null;
        field199 = null;
        field203 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lie;I)Lpj;")
    public static final class237 method116(class32 arg0, int arg1) {
        field200++;
        if (arg1 > -92) {
            method115((byte) 20);
        }
        return class223.method1485(0, 32767, arg0);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lok;)V")
    public class11(class39 arg0) {
        this.field202 = arg0;
    }
}
