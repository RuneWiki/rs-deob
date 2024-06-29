import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class328 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field5072 = 0;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "S")
    public static short field5075 = 1;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field5074 = 0;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field5081 = 0;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z[F)[F", line = 4)
    public static final float[] method2243(boolean arg0, float[] arg1) {
        field5076++;
        if (arg1 == null) {
            return null;
        }
        if (!arg0) {
            field5081 = 124;
        }
        float[] var2 = new float[arg1.length];
        class271.method1956(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 22)
    public static final void method2244(byte arg0) {
        field5078++;
        int var1 = (class19.field356.field1442 >> 7) + class177.field2780;
        if (arg0 > -77) {
            return;
        }
        class64.field1013 = 0;
        int var2 = (class19.field356.field1369 >> 7) + class91.field1485;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class64.field1013 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class64.field1013 = 1;
        }
        if (class64.field1013 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class64.field1013 = 0;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lob;I)Z", line = 48)
    public static final boolean method2245(class292 arg0, int arg1) {
        field5080++;
        if (arg1 > -119) {
            field5075 = 23;
        }
        if (arg0.field4477 == 205) {
            class98.field1622 = 250;
            return true;
        } else {
            return false;
        }
    }
}
