import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class346 extends class381 {

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public int field4688;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public int field4684;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field4689 = 0;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V", line = 16)
    public static final void method2188(byte arg0) {
        field4683++;
        if (arg0 >= -102) {
            method2188((byte) 108);
        }
        class191.field2753 = class356.method2245(0.4F, 35, true, 2048, 4, 8, 4096, 8);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Ljava/lang/String;", line = 27)
    public static final String method2189(int arg0, int arg1) {
        if (arg1 >= -58) {
            return null;
        } else {
            field4687++;
            return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF0886) >> 16) + "." + ((arg0 & 0xFFE4) >> 8) + "." + (arg0 & 0xFF);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(II)V", line = 47)
    public class346(int arg0, int arg1) {
        this.field4688 = arg1;
        this.field4684 = arg0;
    }
}
