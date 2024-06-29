import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class2 extends class202 {

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    private int field9 = -32768;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "[[S")
    public static short[][] field3 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field2 = 0;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "[I")
    public static int[] field13 = new int[100];

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "[Z")
    public static boolean[] field6 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "Llm;")
    public static class150 field1 = new class150(64);

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field15 = 0;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "Lui;")
    public static class286 field16;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "[[[I")
    public static int[][][] field7;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V")
    public final void method7(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10++;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public static void method8(int arg0) {
        if (arg0 != -13004) {
            field13 = null;
        }
        field3 = null;
        field1 = null;
        field7 = null;
        field13 = null;
        field6 = null;
        field16 = null;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "()I")
    public final int method9() {
        field11++;
        return this.field9;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method10(byte arg0, long arg1) {
        field5++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg1;
            if (arg0 >= -40) {
                method8(-56);
            }
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            StringBuffer var6 = new StringBuffer(var5);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class88.field1262[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIIJILte;)V")
    public final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class220 arg10) {
        field4++;
        class94 var13 = class281.method1822((byte) -118, this.field12).method65(-1, 0, (class69) null, this.field8, 0, (byte) -126, (class195) null);
        if (var13 != null) {
            var13.method11(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field9 = var13.method9();
        }
    }
}
