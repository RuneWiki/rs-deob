import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class207 {

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public int field2925 = -1;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public int field2929 = -1;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lfea;")
    public static class47 field2932 = new class47();

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "[[I")
    public static int[][] field2933 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[I")
    public int[] field2927;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lco;II)V", line = 6)
    private final void method1329(class268 arg0, int arg1, int arg2) {
        int var4 = 6 / ((78 - arg2) / 46);
        if (arg1 == 1) {
            this.field2929 = arg0.method1745(32132);
        } else if (arg1 == 2) {
            this.field2927 = new int[arg0.method1738(255)];
            for (int var5 = 0; var5 < this.field2927.length; var5++) {
                this.field2927[var5] = arg0.method1745(32132);
            }
        } else if (arg1 == 3) {
            this.field2925 = arg0.method1738(255);
        }
        field2926++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZII)I", line = 39)
    public static final int method1330(boolean arg0, int arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        field2930++;
        if (arg0) {
            method1330(false, -41, 74);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)V", line = 61)
    public static final void method1331(int arg0, int arg1, int arg2, int arg3) {
        field2928++;
        class21 var4 = class601.method3413(arg2, arg1, (byte) 108);
        var4.method230(18340);
        var4.field302 = arg0;
        var4.field308 = arg3;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V", line = 78)
    public static void method1332(boolean arg0) {
        field2932 = null;
        if (arg0) {
            field2933 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lco;I)V", line = 93)
    public final void method1333(class268 arg0, int arg1) {
        if (arg1 != -17474) {
            this.method1333(null, 80);
        }
        while (true) {
            int var3 = arg0.method1738(255);
            if (var3 == 0) {
                field2931++;
                return;
            }
            this.method1329(arg0, var3, arg1 ^ 0xFFFFBBC2);
        }
    }
}
