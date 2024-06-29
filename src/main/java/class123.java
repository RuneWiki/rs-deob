import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class123 extends class171 {

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    private int field2059 = -32768;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "[[I")
    public static int[][] field2051 = new int[104][104];

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "Lwa;")
    public static class75 field2060 = class66.method560("leuchten3:", false);

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2057 = Calendar.getInstance();

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public int field2055;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lbl;B)V", line = 22)
    public static final void method929(class295 arg0, byte arg1) {
        field2052++;
        for (class290 var2 = (class290) class166.field2794.method1250(true); var2 != null; var2 = (class290) class166.field2794.method1256((byte) -125)) {
            if (var2.field4962 == arg0) {
                if (var2.field4975 != null) {
                    class94.field1527.method1790(var2.field4975);
                    var2.field4975 = null;
                }
                var2.method1527(-124);
                return;
            }
        }
        if (arg1 < 123) {
            field2061 = 33;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()I", line = 53)
    public final int method443() {
        field2054++;
        return this.field2059;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 62)
    public static final void method930(int arg0) {
        if (arg0 != 0) {
            field2056 = 18;
        }
        field2058++;
        try {
            if (class139.field2413 == 1) {
                int var1 = class279.field4841.method985(0);
                if (var1 > 0 && class279.field4841.method966((byte) -127)) {
                    int var2 = var1 - class136.field2338;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class279.field4841.method993(var2, (byte) 122);
                    return;
                }
                class279.field4841.method964((byte) 106);
                class279.field4841.method955((byte) 8);
                if (class127.field2212 == null) {
                    class139.field2413 = 0;
                } else {
                    class139.field2413 = 2;
                }
                class116.field1966 = null;
                class136.field2326 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class279.field4841.method964((byte) 106);
            class136.field2326 = null;
            class139.field2413 = 0;
            class127.field2212 = null;
            class116.field1966 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIIJ)V", line = 109)
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2049++;
        class234 var11 = class199.method1475(this.field2055, (byte) -49).method1982(-41, (class28) null, 0, this.field2062);
        if (var11 != null) {
            var11.method409(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2059 = var11.method443();
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)[F", line = 138)
    public static final float[] method931(int arg0) {
        field2050++;
        float var1 = class239.method1744() + class239.method1750();
        int var2 = class239.method1747();
        float var3 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        class93.field1513[3] = 1.0F;
        float var4 = (float) ((var2 & 0xFF1B) >> 8) / 255.0F;
        float var5 = 0.58823526F;
        class93.field1513[arg0] = class268.field4638[1] * var4 * var5 * var1;
        float var6 = (float) (var2 & 0xFF) / 255.0F;
        class93.field1513[2] = class268.field4638[2] * var6 * var5 * var1;
        class93.field1513[0] = class268.field4638[0] * var3 * var5 * var1;
        return class93.field1513;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V", line = 166)
    public static void method932(int arg0) {
        field2057 = null;
        if (arg0 != 1309) {
            method932(-28);
        }
        field2051 = (int[][]) null;
        field2060 = null;
    }
}
