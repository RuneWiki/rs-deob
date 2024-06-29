import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class752 {

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "Lvd;")
    private class39 field10513;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    public int field10512;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
    public static int field10507 = 0;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
    public static int field10510 = 0;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "Lpd;")
    public static class259 field10511 = new class259(4);

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "Z")
    public static boolean field10514 = false;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field10509;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V", line = 3)
    public static void method4194(int arg0) {
        field10511 = null;
        if (arg0 != 6) {
            method4195(-71, (byte) -78);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB)I", line = 16)
    public static final int method4195(int arg0, byte arg1) {
        field10509++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        if (arg1 != -88) {
            method4195(120, (byte) -104);
        }
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lqg;ILvd;)V", line = 64)
    public class752(class464 arg0, int arg1, class39 arg2) {
        new class106(64);
        this.field10513 = arg2;
        this.field10512 = this.field10513.method229(15, 0);
    }
}
