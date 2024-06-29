import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class318 {

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public int field5242 = 2048;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public int field5245 = 2048;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public int field5240 = 0;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public int field5243 = 0;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 6)
    public static final void method2294(int arg0) {
        if (arg0 != -4) {
            return;
        }
        for (class244 var1 = (class244) class217.field3344.method1081(arg0 ^ 0xFFFFFF8B); var1 != null; var1 = (class244) class217.field3344.method1083((byte) 113)) {
            class61 var2 = var1.field3844;
            if (class120.field1779 != var2.field929 || var2.field944) {
                var1.method1131(8);
            } else if (var2.field927 <= class58.field875) {
                var2.method443(arg0 ^ 0xFFFFFFFC, class215.field3322);
                if (var2.field944) {
                    var1.method1131(8);
                } else {
                    class255.method1816(var2.field929, var2.field930, var2.field922, var2.field937, 60, var2, 0, -1L, false);
                }
            }
        }
        field5239++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILfh;BI)V", line = 53)
    private final void method2295(int arg0, class313 arg1, byte arg2, int arg3) {
        field5236++;
        if (arg3 == 1) {
            this.field5240 = arg1.method2224(-128);
        } else if (arg3 == 2) {
            this.field5245 = arg1.method2250(-1613178296);
        } else if (arg3 == 3) {
            this.field5242 = arg1.method2250(-1613178296);
        } else if (arg3 == 4) {
            this.field5243 = arg1.method2214(0);
        }
        int var5 = -112 / ((arg2 + 90) / 32);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lfh;IB)V", line = 80)
    public final void method2296(class313 arg0, int arg1, byte arg2) {
        if (arg2 < 109) {
            return;
        }
        while (true) {
            int var4 = arg0.method2224(-122);
            if (var4 == 0) {
                field5238++;
                return;
            }
            this.method2295(arg1, arg0, (byte) -128, var4);
        }
    }
}
