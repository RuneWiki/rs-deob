import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class468 extends class166 {

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public int field6469;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Z")
    public static volatile boolean field6471 = true;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BI)[B")
    public static final byte[] method2634(byte[] arg0, int arg1) {
        field6470++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class373.method2194(arg0, arg1, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lji;I)Luu;")
    public static final class288 method2635(class611 arg0, int arg1) {
        field6474++;
        class203 var2 = class125.method804(-1, arg0);
        int var3 = arg0.method3418(-2);
        int var4 = -102 / ((-arg1 - 42) / 35);
        int var5 = arg0.method3418(-2);
        return new class288(var2.field2408, var2.field2412, var2.field2403, var2.field2406, var2.field2415, var2.field2402, var2.field2407, var2.field2405, var2.field2414, var3, var5);
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(I)V")
    public class468(int arg0) {
        this.field6469 = arg0;
    }
}
