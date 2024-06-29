import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class280 {

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "J")
    public long field4325 = 0L;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4322 = "rating: ";

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field4330 = -1;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Ll;")
    public static class66 field4315 = new class66(2);

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "Lrc;")
    public static class217 field4331 = new class217(5000);

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Lqf;")
    public class64 field4317;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Lqf;")
    public class64 field4319;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 4)
    public static void method2044(int arg0) {
        field4315 = null;
        field4331 = null;
        field4322 = null;
        if (arg0 != 3) {
            field4331 = (class217) null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)J", line = 20)
    public static final long method2045(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        return var3 == null || var3.field5064 == null ? 0L : var3.field5064.field3111;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII)I", line = 32)
    public static final int method2046(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field4321++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else {
            if (arg3 >= -44) {
                field4324 = 41;
            }
            return var4 == 2 ? 7 - arg0 : arg1;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I", line = 65)
    public static final int method2047(int arg0) {
        if (arg0 == 5000) {
            field4316++;
            return class224.field3496.method646(arg0 - 5000);
        } else {
            return 125;
        }
    }
}
