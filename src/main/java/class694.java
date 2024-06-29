import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class694 extends class45 {

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "Z")
    public boolean field9787 = false;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    public int field9786 = -1;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "Ljb;")
    public static class498 field9783 = new class498();

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "Lvu;")
    public static class204 field9791 = new class204();

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
    public int field9782;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    public int field9784;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
    public int field9788;

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
    public int field9789;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!lv", name = "t", descriptor = "I")
    public int field9793;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lio;I)Llm;", line = 6)
    public static final class335 method3913(class157 arg0, int arg1) {
        arg0.method930(arg1 ^ 0x37F);
        field9792++;
        if (arg1 != 896) {
            field9791 = null;
        }
        int var2 = arg0.method930(255);
        class335 var3 = class602.method3353(var2, -14);
        var3.field4532 = arg0.method930(255);
        int var4 = arg0.method930(255);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method930(255);
            var3.method2(var6, arg0, arg1 - 962);
        }
        var3.method317((byte) -127);
        return var3;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)V", line = 45)
    public static void method3914(boolean arg0) {
        field9783 = null;
        field9791 = null;
        if (arg0) {
            method3913(null, -114);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IBII)I", line = 56)
    public static final int method3915(int arg0, byte arg1, int arg2, int arg3) {
        field9785++;
        if (arg0 == arg3) {
            return arg0;
        }
        int var4 = 128 - arg2;
        int var5 = (arg0 & 0x7F) * var4 + (arg3 & 0x7F) * arg2 >> 7;
        if (arg1 < 121) {
            return 96;
        } else {
            int var6 = (arg0 & 0x380) * var4 + (arg3 & 0x380) * arg2 >> 7;
            int var7 = (arg0 & 0xFC00) * var4 + (arg3 & 0xFC00) * arg2 >> 7;
            return var5 & 0x7F | var7 & 0xFC00 | var6 & 0x380;
        }
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(I)V", line = 96)
    public class694(int arg0) {
        this.field9786 = arg0;
    }
}
