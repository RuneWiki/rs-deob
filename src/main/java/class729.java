import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class729 {

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "I")
    public int field10225 = -1;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field10213 = 0;

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
    public static int field10226 = -1;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "Z")
    public static boolean field10218 = false;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public int field10212;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
    public int field10214;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    public int field10215;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
    public int field10216;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public int field10217;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
    public static int field10219;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public static int field10220;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
    public int field10221;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    public int field10222;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "I")
    public static int field10223;

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
    public int field10224;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lvj;Ljava/lang/String;I)I", line = 8)
    public static final int method4065(class26 arg0, String arg1, int arg2) {
        field10219++;
        int var3 = arg0.field330;
        byte[] var4 = class356.method2014(arg1, (byte) -111);
        arg0.method181((byte) 125, var4.length);
        arg0.field330 += class375.field5218.method1832(0, arg0.field279, var4, var4.length, arg0.field330, (byte) -61);
        int var5 = -52 / ((arg2 + 34) / 41);
        return arg0.field330 - var3;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZZI)V", line = 42)
    public static final void method4066(boolean arg0, boolean arg1, int arg2) {
        if (arg1) {
            class282.field3749--;
            if (class282.field3749 == 0) {
                class278.field3718 = null;
            }
        }
        field10223++;
        if (arg0) {
            class480.field6522--;
            if (class480.field6522 == 0) {
                class673.field9471 = null;
            }
        }
        if (arg2 != -2679) {
            field10213 = 122;
        }
    }
}
