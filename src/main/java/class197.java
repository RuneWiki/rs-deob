import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class197 {

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "Lpja;")
    public static class43 field2993 = new class43(128, 4);

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)J")
    public static final synchronized long method1423(int arg0) {
        field2992++;
        long var1 = System.currentTimeMillis();
        if (var1 < class119.field2177) {
            class417.field5699 += class119.field2177 - var1;
        }
        if (arg0 == 1) {
            class119.field2177 = var1;
            return class417.field5699 + var1;
        } else {
            return -1L;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lcn;III)V")
    public static final void method1424(class543 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class441.field5980) {
            class549 var4 = class325.field4448[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field7471 != null && var4.field7471.method904(0)) {
                arg0.method903(class112.field2107, var4.field7471, class365.field4955, 0, (byte) 117, true, 0);
            }
        }
        if (arg3 < class441.field5980) {
            class549 var5 = class325.field4448[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field7471 != null && var5.field7471.method904(0)) {
                arg0.method903(class112.field2107, var5.field7471, 0, class365.field4955, (byte) 117, true, 0);
            }
        }
        if (arg2 < class441.field5980 && arg3 < class375.field5083) {
            class549 var6 = class325.field4448[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field7471 != null && var6.field7471.method904(0)) {
                arg0.method903(class112.field2107, var6.field7471, class365.field4955, class365.field4955, (byte) 57, true, 0);
            }
        }
        if (arg2 < class441.field5980 && arg3 > 0) {
            class549 var7 = class325.field4448[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field7471 != null && var7.field7471.method904(0)) {
                arg0.method903(class112.field2107, var7.field7471, class365.field4955, -class365.field4955, (byte) 60, true, 0);
            }
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I[BI)I")
    public static final int method1425(int arg0, byte[] arg1, int arg2) {
        if (arg2 > -127) {
            field2993 = null;
        }
        field2991++;
        return class211.method1484(84, arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
    public static void method1426(byte arg0) {
        field2993 = null;
        if (arg0 >= -108) {
            field2993 = null;
        }
    }
}
