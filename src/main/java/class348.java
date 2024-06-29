import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class348 {

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "Lfr;")
    public class348 field4485;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "Lm;")
    public class163 field4483;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field4479 = 0;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public int field4475;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public int field4476;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public int field4486;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)Lfr;", line = 4)
    public final class348 method1939(int arg0, int arg1) {
        int var3 = -109 / ((arg1 + 92) / 32);
        field4488++;
        return new class348(this.field4474, arg0);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ldn;I)V", line = 29)
    public static final void method1940(class438 arg0, int arg1) {
        class362.field4763 = arg0;
        if (arg1 > -122) {
            field4484 = -70;
        }
        field4481++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljj;I)Ljava/lang/String;", line = 40)
    public static final String method1941(class99 arg0, int arg1) {
        field4489++;
        if (arg1 > -33) {
            method1944(-1.0602252F, 0.569107F, 17, -0.63550544F);
        }
        return arg0.field1229 == null || arg0.field1229.length() <= 0 ? arg0.field1228 : arg0.field1228 + class300.field3852.method987(class31.field247, 22) + arg0.field1229;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)Lpg;", line = 56)
    public final class623 method1942(boolean arg0) {
        if (arg0) {
            method1940(null, -72);
        }
        field4480++;
        return class265.method1484((byte) -121, this.field4474);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILjava/lang/String;)J", line = 68)
    public static final long method1943(int arg0, String arg1) {
        field4477++;
        if (arg0 != 97) {
            method1943(122, null);
        }
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(II)V", line = 113)
    public class348(int arg0, int arg1) {
        this.field4487 = arg1;
        this.field4474 = arg0;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(FFIF)I", line = 122)
    public static final int method1944(float arg0, float arg1, int arg2, float arg3) {
        field4482++;
        float var4 = arg0 < 0.0F ? -arg0 : arg0;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = arg3 < (float) arg2 ? -arg3 : arg3;
        if (var4 < var5 && var6 < var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return (arg3 > 0.0F) ? 2 : 3;
        } else if ((arg0 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lfr;I)V", line = 162)
    public class348(class348 arg0, int arg1) {
        this.field4485 = arg0;
        this.field4474 = this.field4485.field4474;
        this.field4487 = this.field4485.field4487 + arg1;
        this.field4483 = this.field4485.field4483;
    }
}
