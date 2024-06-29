import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class267 {

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "Z")
    public static boolean field4035 = false;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "F")
    public static float field4033;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "J")
    public static long field4036;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "[[B")
    public static byte[][] field4034;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V", line = 5)
    public static void method1745(int arg0) {
        field4034 = null;
        if (arg0 < 93) {
            field4033 = 0.61758256F;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "([Ljava/lang/String;[SIBI)V", line = 19)
    public static final void method1746(String[] arg0, short[] arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 67) {
            return;
        }
        if (arg2 > arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg4; var9 < arg2; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method1746(arg0, arg1, var6 - 1, (byte) 67, arg4);
            method1746(arg0, arg1, arg2, (byte) 67, var6 + 1);
        }
        field4029++;
    }

    @OriginalMember(owner = "client!gaa", name = "toString", descriptor = "()Ljava/lang/String;", line = 75)
    public final String toString() {
        field4031++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I[Lf;)V", line = 91)
    public static final void method1747(int arg0, class702[] arg1) {
        field4032++;
        class406.field5943 = arg1.length;
        class210.field2948 = new class702[class406.field5943 + 10];
        class165.field2372 = new int[class406.field5943 + 10];
        class476.method2794(arg1, 0, class210.field2948, 0, class406.field5943);
        int var2 = 0;
        if (arg0 != 1) {
            return;
        }
        while (var2 < class406.field5943) {
            class165.field2372[var2] = class210.field2948[var2].method936();
            var2++;
        }
        for (int var3 = class406.field5943; var3 < class210.field2948.length; var3++) {
            class165.field2372[var3] = 12;
        }
    }
}
