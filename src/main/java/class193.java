import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class193 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Z")
    public static boolean field2505 = false;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII)I", line = 9)
    public static final int method1233(int arg0, int arg1, int arg2, int arg3) {
        field2508++;
        if (class143.field1820 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class561.field7661;
        int var7 = arg2 - class561.field7675;
        class588 var8 = (class588) class561.field7658.method374((byte) 99);
        if (arg1 != 985) {
            field2505 = false;
        }
        while (var8 != null) {
            if (var8.field8076 == arg0) {
                int var9 = var8.field8075;
                int var10 = var8.field8074;
                int var11 = var9 + class561.field7661 << 14 | class561.field7675 + var10;
                int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                if (var4 < 0 || var12 < var5) {
                    var5 = var12;
                    var4 = var11;
                }
            }
            var8 = (class588) class561.field7658.method372(arg1 ^ 0xFFFFAD25);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 58)
    public static final void method1234(byte arg0) {
        field2506++;
        class442.field6096 = class446.field6129.field8188 + class446.field6129.field8190 + 2;
        if (arg0 < 41) {
            return;
        }
        class473.field6390 = class278.field3769.field8188 + class278.field3769.field8190 + 2;
        class603.field8242 = new String[500];
        for (int var1 = 0; var1 < class603.field8242.length; var1++) {
            class603.field8242[var1] = "";
        }
    }
}
