import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class288 extends class303 {

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    private int field4395;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4393 = "slide:";

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[I")
    public static int[] field4391 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[J")
    public static long[] field4398 = new long[32];

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public static int field4397 = 255;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)[I", line = 7)
    public final int[] method67(int arg0, int arg1) {
        field4396++;
        if (arg0 != -3) {
            field4391 = (int[]) null;
        }
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            class271.method1955(var3, 0, class70.field1108, this.field4395);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V", line = 34)
    public static final void method2027(byte arg0) {
        field4394++;
        class211.field3367.method1837(-128);
        class83.field1241.method1837(-122);
        if (arg0 >= 73) {
            class285.field4371.method1837(-121);
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V", line = 52)
    public static void method2028(int arg0) {
        int var1 = -78 % ((16 - arg0) / 43);
        field4398 = null;
        field4391 = null;
        field4393 = null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V", line = 120)
    private class288(int arg0) {
        super(0, true);
        this.field4395 = 4096;
        this.field4395 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(III)V", line = 72)
    public static final void method2029(int arg0, int arg1, int arg2) {
        field4390++;
        class4 var3 = class67.method510(1, arg0, arg1);
        var3.method14(24710);
        var3.field20 = arg2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILpe;I)V", line = 85)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            field4393 = (String) null;
        }
        if (arg2 == 0) {
            this.field4395 = (arg1.method741(100) << 12) / 255;
        }
        field4392++;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 110)
    public class288() {
        this(4096);
    }
}
