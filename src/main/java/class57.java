import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class57 extends class196 {

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "[I")
    public static int[] field953 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "Ljava/util/Calendar;")
    public static Calendar field949 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "[[[B")
    public static byte[][][] field954;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class57() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIIIIB)Ltg;")
    public static final class171 method366(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 <= 66) {
            return null;
        } else {
            ++field955;
            int var6 = (arg4 << 19) + arg2 - (-(!arg0 ? 0 : 65536) - (arg1 << 17));
            long var8 = (long) var6 * 3849834839L + (long) arg3 * 3147483667L;
            class171 var10 = (class171) class221.field3832.method1357((byte) 94, var8);
            if (var10 != null) {
                return var10;
            } else {
                class73.field1156 = false;
                class171 var11 = class17.method85(true, arg1, arg2, arg3, false, arg0, arg4, false);
                if (var11 != null && !class73.field1156) {
                    class221.field3832.method1351(var11, 2, var8);
                }
                return var11;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 10565) {
            field951 = 98;
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            class256.method1743(var3, 0, class49.field767, class161.field2639[arg0]);
        }
        ++field950;
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public static void method367(int arg0) {
        field949 = null;
        field953 = null;
        if (arg0 == 2047) {
            field954 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(B)V")
    public static final void method368(byte arg0) {
        class97.field1622.method427(false);
        ++field952;
        int var1 = class97.field1622.method428(1, (byte) -125);
        int var2 = -8 / ((arg0 - 29) / 53);
        if (var1 != 0) {
            int var3 = class97.field1622.method428(2, (byte) -120);
            if (var3 == 0) {
                class215.field3732[class185.field3060++] = 2047;
            } else if (~var3 == -2) {
                int var4 = class97.field1622.method428(3, (byte) -119);
                class44.field706.method1687(false, var4, (byte) 28);
                int var5 = class97.field1622.method428(1, (byte) -114);
                if (var5 == 1) {
                    class215.field3732[class185.field3060++] = 2047;
                }
            } else if (~var3 == -3) {
                int var6 = class97.field1622.method428(3, (byte) -122);
                class44.field706.method1687(true, var6, (byte) 28);
                int var7 = class97.field1622.method428(3, (byte) -126);
                class44.field706.method1687(true, var7, (byte) 28);
                int var8 = class97.field1622.method428(1, (byte) -119);
                if (~var8 == -2) {
                    class215.field3732[class185.field3060++] = 2047;
                }
            } else if (~var3 == -4) {
                int var9 = class97.field1622.method428(7, (byte) -122);
                class257.field4496 = class97.field1622.method428(2, (byte) -113);
                int var10 = class97.field1622.method428(1, (byte) -116);
                int var11 = class97.field1622.method428(1, (byte) -124);
                if (var11 == 1) {
                    class215.field3732[class185.field3060++] = 2047;
                }
                int var12 = class97.field1622.method428(7, (byte) -128);
                class44.field706.method1683(var9, 2, var12, ~var10 == -2);
            }
        }
    }
}
