import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class17 extends class35 {

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Lnj;")
    public static class204 field316;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)[F", line = 15)
    public static final float[] method121(int arg0) {
        field321++;
        float var1 = class65.method503() + class65.method500();
        int var2 = class65.method498();
        float var3 = (float) ((var2 & 0xFF54) >> 8) / 255.0F;
        class301.field4558[3] = 1.0F;
        float var4 = (float) ((var2 & 0xFF50CD) >> 16) / 255.0F;
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class301.field4558[1] = class33.field668[1] * var3 * var6 * var1;
        class301.field4558[0] = class33.field668[arg0] * var4 * var6 * var1;
        class301.field4558[2] = class33.field668[2] * var5 * var6 * var1;
        return class301.field4558;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BZ)V", line = 42)
    public static final void method122(byte arg0, boolean arg1) {
        class250.field3925 = arg1;
        field319++;
        class180.field2899 = !class19.method127(-104);
        if (arg0 < 111) {
            method123(-92);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V", line = 56)
    public static void method123(int arg0) {
        field316 = null;
        if (arg0 != -22595) {
            field316 = (class204) null;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)[Ltf;", line = 69)
    public static final class112[] method124(byte arg0) {
        field317++;
        class112[] var1 = new class112[class125.field2167];
        if (arg0 > -124) {
            field322 = -46;
        }
        for (int var2 = 0; var2 < class125.field2167; var2++) {
            if (class249.field3893) {
                var1[var2] = new class314(class194.field3127, class321.field4891, class80.field1572[var2], class27.field530[var2], class28.field537[var2], class176.field2833[var2], class254.field3968[var2], class274.field4202);
            } else {
                var1[var2] = new class113(class194.field3127, class321.field4891, class80.field1572[var2], class27.field530[var2], class28.field537[var2], class176.field2833[var2], class254.field3968[var2], class274.field4202);
            }
        }
        class97.method644((byte) 93);
        return var1;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(II)V", line = 95)
    public class17(int arg0, int arg1) {
        this.field320 = arg0;
        this.field318 = arg1;
    }
}
