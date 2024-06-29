import java.awt.event.ActionEvent;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class267 extends class112 {

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "Lwm;")
    public static class152 field4499 = class157.method1048("mapfunction", 113);

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
    public static int field4495 = 0;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4496 = Calendar.getInstance();

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
    public static int field4501 = 0;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "Lwm;")
    public static class152 field4502 = class157.method1048("::rebuild", 114);

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "J")
    public static volatile long field4505 = 0L;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "Lhh;")
    public static class209 field4504;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(III)I", line = 6)
    private final int method1826(int arg0, int arg1, int arg2) {
        field4500++;
        int var4 = arg2 * 57 + arg1;
        int var5 = -104 % ((33 - arg0) / 62);
        int var6 = var4 ^ var4 << 1;
        return 4096 - ((Integer.MAX_VALUE & (var6 * 15731 * var6 + 789221) * var6 + 1376312589) / 262144);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)[I", line = 19)
    public final int[] method53(byte arg0, int arg1) {
        field4494++;
        if (arg0 != -3) {
            this.method53((byte) -44, -72);
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 59);
        if (this.field1585.field4935) {
            int var4 = class114.field1620[arg1];
            for (int var5 = 0; var5 < class58.field889; var5++) {
                var3[var5] = this.method1826(-109, class131.field1992[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)V", line = 56)
    public static final void method1827(int arg0, int arg1) {
        if (arg1 != -2) {
            field4502 = (class152) null;
        }
        field4492++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class22.method185(arg1 - 114);
        } else if (arg0 == 2) {
            class10.method49(-5001);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "(I)[F", line = 86)
    public static final float[] method1828(int arg0) {
        field4493++;
        int var1 = 46 % ((-arg0 - 6) / 41);
        float var2 = class14.method85() + class14.method89();
        int var3 = class14.method94();
        class86.field1202[3] = 1.0F;
        float var4 = (float) (var3 & 0xFF) / 255.0F;
        float var5 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var6 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class86.field1202[2] = class136.field2087[2] * var4 * var7 * var2;
        class86.field1202[0] = class136.field2087[0] * var6 * var7 * var2;
        class86.field1202[1] = class136.field2087[1] * var5 * var7 * var2;
        return class86.field1202;
    }

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "(I)V", line = 120)
    public static void method1829(int arg0) {
        if (arg0 != -30378) {
            field4504 = (class209) null;
        }
        field4496 = null;
        field4502 = null;
        field4504 = null;
        field4499 = null;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V", line = 134)
    public class267() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/Object;Ldi;B)V", line = 138)
    public static final void method1830(Object arg0, class151 arg1, byte arg2) {
        if (arg2 < 35) {
            field4503 = -92;
        }
        field4498++;
        if (arg1.field2358 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field2358.peekEvent() != null; var3++) {
            class4.method19(0, 1L);
        }
        if (arg0 != null) {
            arg1.field2358.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }
}
