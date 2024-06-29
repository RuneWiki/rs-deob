import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class242 extends class6 {

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field3385 = -1;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "F")
    public static float field3389 = 1.0F;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "Ldi;")
    public static class83 field3375 = new class83(65, 8);

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "[I")
    public static int[] field3391 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "Lwj;")
    public static class270 field3390 = new class270(99, 6);

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public int field3378;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "Lol;")
    public class187 field3379;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "Ljava/lang/String;")
    public String field3374;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "[I")
    public int[] field3381;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "[I")
    public int[] field3386;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "[Lmn;")
    public class247[] field3387;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "[Ljava/lang/String;")
    public String[] field3382;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)I")
    public static final int method1465(int arg0, int arg1, int arg2, int arg3) {
        field3380++;
        if (class211.field2950 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > (class527.field7799 - 1) || class422.field6182 - 1 < var5) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class267.field3700[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        if (arg0 <= 89) {
            method1466(127);
        }
        return class211.field2950[var6].method361(arg3, arg2);
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
    public static final void method1466(int arg0) {
        if (arg0 != 21924) {
            method1467((byte) 29);
        }
        if (class269.field3721.method294()) {
            class269.field3721.method302(class426.field6248);
            class115.method826(true);
            class269.field3721.method270(class426.field6248);
            class269.field3721.method266(class426.field6248);
        } else {
            class455.method2675(67, class152.field2332);
        }
        field3384++;
        class361.method2180(true);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static void method1467(byte arg0) {
        field3375 = null;
        field3391 = null;
        field3390 = null;
        int var1 = 18 / ((61 - arg0) / 40);
    }
}
