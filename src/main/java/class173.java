import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class173 implements Runnable {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Z")
    public boolean field2779 = true;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field2781 = new Object();

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public int field2782 = 0;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[I")
    public int[] field2786 = new int[500];

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "[I")
    public int[] field2790 = new int[500];

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[S")
    public static short[] field2784 = new short[256];

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field2787 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field2788 = -1;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Z")
    public static boolean field2789 = false;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[[[I")
    public static int[][][] field2778;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method1279(int arg0) {
        field2787 = null;
        field2778 = null;
        if (arg0 != 50) {
            field2778 = null;
        }
        field2784 = null;
    }

    @OriginalMember(owner = "client!pe", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2779) {
            Object var1 = this.field2781;
            synchronized (this.field2781) {
                if (this.field2782 < 500) {
                    this.field2786[this.field2782] = class96.field1558;
                    this.field2790[this.field2782] = class87.field1448;
                    this.field2782++;
                }
            }
            class28.method182(50L, true);
        }
        field2777++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIILda;Lda;IIJ)V")
    public static final void method1280(int arg0, int arg1, int arg2, int arg3, class312 arg4, class312 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class184 var10 = new class184();
        var10.field2945 = arg8;
        var10.field2934 = arg1 * 128 + 64;
        var10.field2941 = arg2 * 128 + 64;
        var10.field2942 = arg3;
        var10.field2935 = arg4;
        var10.field2937 = arg5;
        var10.field2933 = arg6;
        var10.field2944 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class90.field1498[var11][arg1][arg2] == null) {
                class90.field1498[var11][arg1][arg2] = new class174(var11, arg1, arg2);
            }
        }
        class90.field1498[arg0][arg1][arg2].field2800 = var10;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1281(int arg0, byte[] arg1) {
        field2780++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0 > -105) {
            field2788 = 86;
        }
        class75.method537(arg1, 0, var3, 0, var2);
        return var3;
    }
}
