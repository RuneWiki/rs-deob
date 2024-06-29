import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class226 extends class22 {

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Z")
    public static boolean field2869 = false;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "[I")
    public static int[] field2864 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "[I")
    public static int[] field2863 = new int[14];

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "[[[I")
    public static int[][][] field2868;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)V")
    public static void method1390(byte arg0) {
        field2863 = null;
        field2868 = null;
        if (arg0 < 123) {
            field2869 = true;
        }
        field2864 = null;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)V")
    public static final void method1391(byte arg0) {
        class365 var1 = class57.field654;
        synchronized (class57.field654) {
            class57.field654.method2298(0);
        }
        field2871++;
        if (arg0 != 107) {
            field2867 = -23;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
    public static final void method1392(int arg0, int arg1, int arg2) {
        field2870++;
        if (arg1 != 2015383932) {
            field2868 = null;
        }
        class349 var3 = new class349(16);
        for (class14 var4 = (class14) class76.field939.method2222(0); var4 != null; var4 = (class14) class76.field939.method2215(false)) {
            var4.method263(false);
            int var5 = (int) (var4.field505 >> 28);
            int var6 = (int) (var4.field505 >> 14 & 0x3FFFL) - arg2;
            int var7 = (int) (var4.field505 & 0x3FFFL) - arg0;
            if (var7 >= 0 && var6 >= 0 && class22.field232 > var7 && class196.field2329 > var6) {
                var3.method2227(var4, -8218, (long) (var5 << 28 | var6 << 14 | var7));
            }
        }
        class76.field939 = var3;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(IIII)V")
    public class226(int arg0, int arg1, int arg2, int arg3) {
        this.field2866 = arg2;
        this.field2872 = arg1;
        this.field2865 = arg0;
        this.field2873 = arg3;
    }
}
