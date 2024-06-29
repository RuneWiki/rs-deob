import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class669 {

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public int field9156;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lmq;")
    public static class78 field9157 = new class78(3, -2);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "J")
    public static long field9155;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Ltj;")
    public static class662 field9153;

    @OriginalMember(owner = "client!qi", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field9158++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 12)
    public static void method3618(int arg0) {
        if (arg0 < -61) {
            field9153 = null;
            field9157 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([BIILjava/lang/String;)I", line = 25)
    public static final int method3619(byte[] arg0, int arg1, int arg2, String arg3) {
        field9154++;
        int var4 = arg1;
        int var5 = arg3.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class653.method3521(arg3.charAt(var6), (byte) 10);
            int var8 = (var6 + 1) < var5 ? class653.method3521(arg3.charAt(var6 + 1), (byte) 10) : -1;
            int var9 = var5 > var6 + 2 ? class653.method3521(arg3.charAt(var6 + 2), (byte) 10) : -1;
            int var10 = (var6 + 3) < var5 ? class653.method3521(arg3.charAt(var6 + 3), (byte) 10) : -1;
            arg0[arg1++] = (byte) class216.method1308(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg0[arg1++] = (byte) class216.method1308(var9 >>> 2, class272.method1629(240, var8 << 4));
            if (var10 == -1) {
                break;
            }
            arg0[arg1++] = (byte) class216.method1308(class272.method1629(3, var9) << 6, var10);
        }
        if (arg2 >= -82) {
            method3619(null, 5, 27, null);
        }
        return arg1 - var4;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(II)V", line = 71)
    public class669(int arg0, int arg1) {
        this.field9156 = arg1;
    }
}
