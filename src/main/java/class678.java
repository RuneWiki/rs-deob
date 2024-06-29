import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class678 extends class694 {

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
    private int field9559;

    @OriginalMember(owner = "client!kn", name = "H", descriptor = "I")
    public static int field9556 = -2;

    @OriginalMember(owner = "client!kn", name = "G", descriptor = "I")
    public static int field9555 = 0;

    @OriginalMember(owner = "client!kn", name = "J", descriptor = "Z")
    public static boolean field9558 = false;

    @OriginalMember(owner = "client!kn", name = "F", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
    public static int field9557;

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "I")
    public static int field9562;

    @OriginalMember(owner = "client!kn", name = "O", descriptor = "I")
    public static int field9563;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "Lpj;")
    public static class132 field9561;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field9562;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            class282.method1705(var3, 0, class465.field6544, this.field9559);
        }
        return arg0 < 112 ? null : var3;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    public static void method3743(byte arg0) {
        field9561 = null;
        if (arg0 > -62) {
            field9554 = -20;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
    public class678() {
        this(4096);
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(II)V")
    public static final void method3744(int arg0, int arg1) {
        ++field9563;
        if (class268.field3802 != arg0) {
            class457.field6471 = arg1;
        } else {
            class230.field3284.method2459(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V")
    public class678(int arg0) {
        super(0, true);
        this.field9559 = 4096;
        this.field9559 = arg0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field9557;
        int var4 = -84 % ((arg2 - 58) / 63);
        if (arg0 == 0) {
            this.field9559 = (arg1.method718(74) << 12) / 255;
        }
    }
}
