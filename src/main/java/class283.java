import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class283 extends class176 {

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!wj", name = "ib", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!wj", name = "jb", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!wj", name = "kb", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!wj", name = "lb", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)[[I", line = 10)
    public final int[][] method391(int arg0, boolean arg1) {
        int[][] var3 = this.field4942.method10((byte) -119, arg0);
        if (this.field4942.field30 && this.method1389(-31317)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = arg0 % this.field2815 * this.field2815;
            for (int var8 = 0; var8 < class261.field4405; var8++) {
                int var9 = this.field2816[var7 + (var8 % this.field2820)];
                var6[var8] = class343.method2418(255, var9) << 4;
                var4[var8] = class343.method2418(4080, var9 >> 4);
                var5[var8] = class343.method2418(4080, var9 >> 12);
            }
        }
        if (!arg1) {
            field4632 = -4;
        }
        field4631++;
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)Lrl;", line = 52)
    public static final class324 method2075(int arg0) {
        field4630++;
        if (arg0 != 1) {
            return (class324) null;
        }
        try {
            return (class324) Class.forName("oi").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BJ)V", line = 71)
    public static final void method2076(byte arg0, long arg1) {
        field4633++;
        if (arg1 <= 0L) {
            return;
        }
        int var3 = 11 % ((arg0 + 54) / 55);
        if ((arg1 % 10L) == 0L) {
            class287.method2088(-8498, arg1 - 1L);
            class287.method2088(-8498, 1L);
        } else {
            class287.method2088(-8498, arg1);
        }
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)Z", line = 92)
    public static final boolean method2077(int arg0) {
        if (arg0 != 672048140) {
            method2076((byte) 97, -101L);
        }
        field4629++;
        class270 var1 = class52.field832;
        synchronized (class52.field832) {
            if (class19.field216 == class101.field1660) {
                return false;
            } else {
                client.field714 = class65.field1158[class101.field1660];
                class333.field5286 = class344.field5471[class101.field1660];
                class101.field1660 = class101.field1660 + 1 & 0x7F;
                return true;
            }
        }
    }
}
