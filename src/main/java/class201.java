import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class201 extends class379 {

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public int field2416;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "[I")
    public int[] field2412;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "[I")
    public int[] field2413;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "[Z")
    public boolean[] field2411;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "[[I")
    public int[][] field2415;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "Lfj;")
    public static class684 field2409 = new class684(10, 16);

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 16)
    public static void method1299(int arg0) {
        if (arg0 >= 12) {
            field2409 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ljava/lang/Object;Llc;B)V", line = 30)
    public static final void method1300(Object arg0, class675 arg1, byte arg2) {
        field2417++;
        if (arg1.field9259 == null) {
            return;
        }
        int var3 = -36 / ((22 - arg2) / 34);
        for (int var4 = 0; var4 < 50 && arg1.field9259.peekEvent() != null; var4++) {
            class594.method3405(1L, 16711680);
        }
        try {
            if (arg0 != null) {
                arg1.field9259.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(I[B)V", line = 56)
    public class201(int arg0, byte[] arg1) {
        this.field2416 = arg0;
        class403 var3 = new class403(arg1);
        this.field2408 = var3.method2396((byte) -124);
        this.field2412 = new int[this.field2408];
        this.field2413 = new int[this.field2408];
        this.field2411 = new boolean[this.field2408];
        this.field2415 = new int[this.field2408][];
        for (int var4 = 0; var4 < this.field2408; var4++) {
            this.field2413[var4] = var3.method2396((byte) 68);
            if (this.field2413[var4] == 6) {
                this.field2413[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field2408; var5++) {
            this.field2411[var5] = var3.method2396((byte) -101) == 1;
        }
        for (int var6 = 0; var6 < this.field2408; var6++) {
            this.field2412[var6] = var3.method2390((byte) 43);
        }
        for (int var7 = 0; var7 < this.field2408; var7++) {
            this.field2415[var7] = new int[var3.method2396((byte) -82)];
        }
        for (int var8 = 0; var8 < this.field2408; var8++) {
            for (int var9 = 0; var9 < this.field2415[var8].length; var9++) {
                this.field2415[var8][var9] = var3.method2396((byte) 91);
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "([IZ[I)V", line = 120)
    public static final void method1301(int[] arg0, boolean arg1, int[] arg2) {
        field2414++;
        if (arg0 == null || arg2 == null) {
            class152.field1900 = null;
            class650.field8861 = null;
            class215.field2538 = null;
            return;
        }
        class215.field2538 = arg0;
        class152.field1900 = new int[arg0.length];
        class650.field8861 = new byte[arg0.length][][];
        if (!arg1) {
            field2410 = 89;
        }
        for (int var3 = 0; var3 < class215.field2538.length; var3++) {
            class650.field8861[var3] = new byte[arg2[var3]][];
        }
    }
}
