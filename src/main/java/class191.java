import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class191 extends class480 {

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    private int field2443 = 0;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field2442 = 0;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field2444 = 1;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "[I")
    public static int[] field2440 = new int[4096];

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Lat;")
    public static class143 field2445;

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lpe;Luea;)V", line = 12)
    public class191(class615 arg0, class256 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)V", line = 15)
    public static void method1248(byte arg0) {
        if (arg0 != 127) {
            method1248((byte) 76);
        }
        field2445 = null;
        field2440 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 27)
    public static final String[] method1249(int arg0, String[] arg1) {
        ++field2441;
        if (arg0 != 7489) {
            field2440 = null;
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V", line = 59)
    public final void method448(int arg0, boolean arg1) {
        if (arg0 != -207) {
            method1249(12, (String[]) null);
        }
        ++field2446;
        int var3 = super.field6400.field3257.method3005(class94.field1240, (byte) -123, super.field6397.method602()) + super.field6400.field3258;
        int var4 = super.field6400.field3261.method3059(super.field6397.method595(), class535.field6968, -119) + super.field6400.field3262;
        super.field6397.method2750((float) (var3 + super.field6397.method602() / 2), (float) (super.field6397.method595() / 2 + var4), 4096, this.field2443);
        this.field2443 += ((class256) super.field6400).field3471;
    }
}
