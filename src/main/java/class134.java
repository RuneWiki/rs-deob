import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public abstract class class134 extends class443 {

    @OriginalMember(owner = "client!ida", name = "w", descriptor = "I")
    public int field2159;

    @OriginalMember(owner = "client!ida", name = "u", descriptor = "Lvp;")
    public class110 field2157;

    @OriginalMember(owner = "client!ida", name = "t", descriptor = "Lpca;")
    public static class362 field2156 = new class362();

    @OriginalMember(owner = "client!ida", name = "x", descriptor = "Lnn;")
    public static class214 field2160 = new class214(10, 7);

    @OriginalMember(owner = "client!ida", name = "A", descriptor = "Lfea;")
    public static class47 field2163 = new class47();

    @OriginalMember(owner = "client!ida", name = "v", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!ida", name = "y", descriptor = "Lqa;")
    public static class167 field2161;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZIIZ)V", line = 8)
    public static final void method1030(boolean arg0, int arg1, int arg2, boolean arg3) {
        field2158++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        } else if (!arg3) {
            class294.field4241 = arg2;
            class604.field8591 = arg1;
            class641.field9295 = arg0;
        }
    }

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "(B)V", line = 30)
    public static void method1032(byte arg0) {
        field2161 = null;
        field2156 = null;
        int var1 = -115 % ((69 - arg0) / 44);
        field2163 = null;
        field2160 = null;
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lvp;I)V", line = 48)
    public class134(class110 arg0, int arg1) {
        this.field2159 = arg1;
        this.field2157 = arg0;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1029(int arg0);

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(B)Z")
    public abstract boolean method1031(byte arg0);
}
