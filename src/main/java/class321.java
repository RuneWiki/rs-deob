import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class321 extends class223 {

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "Ljava/lang/Object;")
    private Object field5486;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "Lok;")
    private static class146 field5490 = class235.method1724(-12908, "Loaded textures");

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "Lok;")
    public static class146 field5491 = class235.method1724(-12908, " ");

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "Lok;")
    public static class146 field5492 = field5490;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "J")
    public static volatile long field5488 = 0L;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 6)
    public final Object method722(byte arg0) {
        if (arg0 != 116) {
            method2231(28);
        }
        field5483++;
        return this.field5486;
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)Z", line = 23)
    public static final boolean method2231(int arg0) {
        if (arg0 <= 13) {
            method2233(89);
        }
        field5485++;
        try {
            if (class223.field3718 == 2) {
                if (class132.field2229 == null) {
                    class132.field2229 = class204.method1550(class86.field1372, class195.field3242, class266.field4562);
                    if (class132.field2229 == null) {
                        return false;
                    }
                }
                if (class302.field5179 == null) {
                    class302.field5179 = new class215(class52.field950, class4.field46);
                }
                if (class215.field3560.method871(class132.field2229, 125, class302.field5179, class55.field983, 22050)) {
                    class215.field3560.method896(115);
                    class215.field3560.method870((byte) -112, class146.field2456);
                    class215.field3560.method887(class205.field3412, class132.field2229, false);
                    class86.field1372 = null;
                    class302.field5179 = null;
                    class223.field3718 = 0;
                    class132.field2229 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class215.field3560.method883(false);
            class302.field5179 = null;
            class223.field3718 = 0;
            class86.field1372 = null;
            class132.field2229 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)Z", line = 76)
    public final boolean method721(int arg0) {
        field5487++;
        int var2 = -56 / ((-arg0 - 62) / 62);
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)V", line = 87)
    public static void method2232(int arg0) {
        field5492 = null;
        field5491 = null;
        field5490 = null;
        if (arg0 != 27753) {
            field5492 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)Lje;", line = 103)
    public static final class70 method2233(int arg0) {
        int var1 = class238.field3967[arg0] * class150.field2562[0];
        field5484++;
        byte[] var2 = class17.field353[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class94.field1514[class82.method582(255, var2[var4])];
        }
        class70 var5;
        if (class271.field4640) {
            var5 = new class8(class177.field3006, class242.field4027, class226.field3776[0], class23.field424[0], class238.field3967[0], class150.field2562[0], var3);
        } else {
            var5 = new class307(class177.field3006, class242.field4027, class226.field3776[0], class23.field424[0], class238.field3967[0], class150.field2562[0], var3);
        }
        class301.method2122((byte) 0);
        return var5;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 134)
    public class321(Object arg0) {
        this.field5486 = arg0;
    }
}
