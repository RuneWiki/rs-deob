import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class377 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Z")
    public static boolean field5665 = true;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)I")
    public static final int method2331(int arg0) {
        field5666++;
        if (arg0 != 0) {
            field5665 = true;
        }
        return class529.field7810;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZZI)I")
    public static final int method2332(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field5667++;
        class15 var5 = class262.method1577((byte) -17, arg1, arg2);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg4 > -67) {
            method2331(53);
        }
        for (int var7 = 0; var7 < var5.field330.length; var7++) {
            if (var5.field330[var7] >= 0 && var5.field330[var7] < class259.field3355.field5795) {
                class390 var8 = class259.field3355.method2382(var5.field330[var7], (byte) 28);
                int var9 = var8.method2410(class141.field2041.method1503(true, arg0).field3615, -15881, arg0);
                if (arg3) {
                    var6 += var5.field328[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }
}
