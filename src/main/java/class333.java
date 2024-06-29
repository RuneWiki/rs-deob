import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class333 extends class219 {

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public int field4979;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Lpha;")
    public class172 field4980;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "[F")
    public static float[] field4977 = new float[2];

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZII)Lwq;")
    public static final class176 method2152(boolean arg0, int arg1, int arg2) {
        field4975++;
        class176 var3 = class518.method3014(arg2, 103);
        if (arg0) {
            field4977 = null;
        }
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field2543 == null || arg1 >= var3.field2543.length) {
            return null;
        } else {
            return var3.field2543[arg1];
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static void method2153(int arg0) {
        field4977 = null;
        if (arg0 != 32768) {
            method2153(42);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)Z")
    public static final boolean method2154(byte arg0, int arg1, int arg2) {
        field4978++;
        if (arg0 == -62) {
            return (arg1 & 0x8000) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method2155(int arg0, boolean arg1, String arg2) {
        field4976++;
        class524.method3052(arg2, arg1, arg0, -1, -57);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)Z")
    public abstract boolean method2156(int arg0);

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method2157(int arg0);

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lpha;I)V")
    public class333(class172 arg0, int arg1) {
        this.field4979 = arg1;
        this.field4980 = arg0;
    }
}
