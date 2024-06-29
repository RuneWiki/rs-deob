import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class240 {

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Z")
    public static boolean field3616 = true;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "J")
    public static long field3614 = 0L;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3612 = "skill: ";

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Llc;")
    public static class175 field3611;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([JZ[Ljava/lang/Object;II)V", line = 9)
    public static final void method1722(long[] arg0, boolean arg1, Object[] arg2, int arg3, int arg4) {
        field3613++;
        if (arg1) {
            method1724((byte) -60);
        }
        if (arg4 <= arg3) {
            return;
        }
        int var5 = arg3;
        int var6 = (arg3 + arg4) / 2;
        long var7 = arg0[var6];
        arg0[var6] = arg0[arg4];
        arg0[arg4] = var7;
        Object var9 = arg2[var6];
        arg2[var6] = arg2[arg4];
        arg2[arg4] = var9;
        for (int var10 = arg3; var10 < arg4; var10++) {
            if (arg0[var10] < (var7 + ((long) (var10 & 0x1)))) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var5];
                arg0[var5] = var11;
                Object var13 = arg2[var10];
                arg2[var10] = arg2[var5];
                arg2[var5++] = var13;
            }
        }
        arg0[arg4] = arg0[var5];
        arg0[var5] = var7;
        arg2[arg4] = arg2[var5];
        arg2[var5] = var9;
        method1722(arg0, false, arg2, arg3, var5 - 1);
        method1722(arg0, false, arg2, var5 + 1, arg4);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 71)
    public static final void method1723(byte arg0) {
        if (arg0 != 86) {
            return;
        }
        field3615++;
        if (!class339.method2348((byte) 69) && class244.field3669 != class138.field1940) {
            class149.method1004(class138.field1940, class118.field1664.field2359[0], false, class146.field2033, (byte) 127, class328.field4999, class118.field1664.field2403[0], false);
        } else if (class22.field305 != class138.field1940 && class59.method347(class138.field1940, -121)) {
            class22.field305 = class138.field1940;
            class23.method148((byte) -94);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V", line = 99)
    public static void method1724(byte arg0) {
        int var1 = -67 % ((arg0 + 2) / 42);
        field3612 = null;
        field3611 = null;
    }
}
