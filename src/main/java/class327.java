import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class327 extends class371 {

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field4392;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I")
    public static final int method2020(int arg0, int arg1) {
        if (arg0 != -1594581311) {
            method2020(-87, -41);
        }
        field4388++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class327(Object arg0, int arg1) {
        super(arg1);
        this.field4392 = arg0;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1024(int arg0) {
        if (arg0 < 25) {
            this.method1023((byte) 37);
        }
        field4390++;
        return this.field4392;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Z")
    public final boolean method1023(byte arg0) {
        if (arg0 >= -72) {
            return true;
        } else {
            field4389++;
            return false;
        }
    }
}
