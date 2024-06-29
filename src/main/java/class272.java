import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class272 {

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "J")
    public long field4183 = 0L;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field4180 = 0;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field4168;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public int field4169;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public int field4174;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public int field4176;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public int field4186;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lfe;")
    public class94 field4173;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 6)
    public static final void method1788(byte arg0) {
        field4178++;
        int var1 = 27 % ((11 - arg0) / 42);
        for (int var2 = -1; var2 < class175.field2678; var2++) {
            int var3;
            if (var2 == -1) {
                var3 = 2047;
            } else {
                var3 = class174.field2645[var2];
            }
            class82 var4 = class64.field966[var3];
            if (var4 != null) {
                class40.method292(var4, (byte) 46, var4.method271((byte) 80));
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIZ)I", line = 59)
    public static final int method1789(int arg0, int arg1, int arg2, boolean arg3) {
        field4170++;
        class15 var4 = (class15) class247.field3868.method1558((long) arg2, false);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = arg1; var6 < var4.field154.length; var6++) {
            if (var4.field154[var6] >= 0 && var4.field154[var6] < class298.field4563) {
                class291 var7 = class160.method1106(var4.field154[var6], -89);
                if (var7.field4442 != null) {
                    class27 var8 = (class27) var7.field4442.method1558((long) arg0, false);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field151[var6] * var8.field344;
                        } else {
                            var5 += var8.field344;
                        }
                    }
                }
            }
        }
        return var5;
    }
}
