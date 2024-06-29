import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class700 extends class513 {

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "Lju;")
    public static class102 field9754 = new class102(69, 0);

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "Lju;")
    public static class102 field9760 = new class102(84, -1);

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "I")
    public int field9747;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
    public int field9749;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    public int field9751;

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "I")
    public int field9753;

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "I")
    public static int field9755;

    @OriginalMember(owner = "client!uca", name = "x", descriptor = "I")
    public int field9758;

    @OriginalMember(owner = "client!uca", name = "y", descriptor = "I")
    public int field9759;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "Lpaa;")
    public class712 field9745;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "Lpaa;")
    public class712 field9752;

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "Ljava/lang/String;")
    public String field9756;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "Z")
    public boolean field9748;

    @OriginalMember(owner = "client!uca", name = "w", descriptor = "[Ljava/lang/Object;")
    public Object[] field9757;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLvj;I)V", line = 6)
    public static final void method3948(byte arg0, class26 arg1, int arg2) {
        if (arg0 != 41) {
            return;
        }
        if (class658.field9296 != null) {
            try {
                class658.field9296.method3008(0L, (byte) -74);
                class658.field9296.method3018(24, arg2, arg1.field279, (byte) -100);
            } catch (Exception var3) {
            }
        }
        field9755++;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(FFFI)F", line = 29)
    public static final float method3949(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 >= -5) {
            return 1.6450592F;
        } else {
            field9750++;
            return (arg2 - arg1) * arg0 + arg1;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V", line = 40)
    public static void method3950(byte arg0) {
        if (arg0 != 70) {
            field9760 = null;
        }
        field9754 = null;
        field9760 = null;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "([[SB[[F)[[S", line = 58)
    public static final short[][] method3951(short[][] arg0, byte arg1, float[][] arg2) {
        field9746++;
        if (arg1 != -105) {
            field9754 = null;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            for (int var4 = 0; var4 < arg0[var3].length; var4++) {
                arg0[var3][var4] = (short) ((int) (arg2[var3][var4] * 16383.0F));
            }
        }
        return arg0;
    }
}
