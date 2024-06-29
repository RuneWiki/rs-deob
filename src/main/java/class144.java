import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class144 {

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public int field2117;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Z")
    public static volatile boolean field2124 = true;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lum;")
    public static class83 field2122;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1029(long arg0, int arg1) {
        field2118++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            if (arg1 != -17639) {
                method1031((byte) -125);
            }
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class311.field4742[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Laa;II)Ljf;")
    public static final class21 method1030(class76 arg0, int arg1, int arg2) {
        field2120++;
        class21 var3;
        if (class43.field685 == null) {
            var3 = new class21();
        } else {
            var3 = class43.field685;
            class43.field685 = class43.field685.field235;
            class300.field4610--;
            var3.field235 = null;
        }
        var3.field240 = arg0;
        if (arg1 == 0) {
            var3.field237 = arg2;
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static void method1031(byte arg0) {
        if (arg0 >= 55) {
            field2122 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lwe;")
    public final class144 method1032(int arg0, int arg1) {
        if (arg1 <= 6) {
            return null;
        } else {
            field2119++;
            return new class144(this.field2121, arg0, this.field2123, this.field2117);
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIII)V")
    public class144(int arg0, int arg1, int arg2, int arg3) {
        this.field2117 = arg3;
        this.field2123 = arg2;
        this.field2125 = arg1;
        this.field2121 = arg0;
    }
}
