import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class245 {

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "Z")
    public static boolean field3589 = false;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 3)
    public static final int method1571(String arg0, byte arg1) {
        int var2 = -63 % ((-arg1 - 49) / 39);
        field3591++;
        int var3 = arg0.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) + arg0.charAt(var5) - var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "([[BBLvc;)V", line = 25)
    public static final void method1572(byte[][] arg0, byte arg1, class359 arg2) {
        field3590++;
        int var3 = class162.field2164.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class256.field3741[var4] >> 8) * 64 - class584.field8677;
                int var7 = (class256.field3741[var4] & 0xFF) * 64 - class424.field6061;
                class171.method1090(-13787);
                arg2.method2204(var7, var5, var6, 113, class379.field5558, class67.field772);
            }
        }
        if (arg1 >= -71) {
            field3589 = false;
        }
    }
}
