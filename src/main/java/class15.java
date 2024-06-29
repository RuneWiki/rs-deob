import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class15 implements Runnable {

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "Z")
    public boolean field273 = true;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "Ljava/lang/Object;")
    public Object field275 = new Object();

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public int field277 = 0;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "[I")
    public int[] field276 = new int[500];

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "[I")
    public int[] field278 = new int[500];

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field269 = 0;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field270 = 0;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Llc;")
    public static class143 field272 = class66.method374("<col=ffffff>", -1);

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Llc;")
    public static class143 field271 = class66.method374("Stufe: ", -1);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[[I")
    public static int[][] field268;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public static void method116(byte arg0) {
        field272 = null;
        field268 = null;
        if (arg0 != -82) {
            method116((byte) -54);
        }
        field271 = null;
    }

    @OriginalMember(owner = "client!ql", name = "run", descriptor = "()V")
    public final void run() {
        field266++;
        while (this.field273) {
            Object var1 = this.field275;
            synchronized (this.field275) {
                if (this.field277 < 500) {
                    this.field278[this.field277] = class235.field4292;
                    this.field276[this.field277] = class158.field2859;
                    this.field277++;
                }
            }
            class61.method347(50L, 1);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIILqk;Lqk;IIIIJ)V")
    public static final void method117(int arg0, int arg1, int arg2, int arg3, class51 arg4, class51 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class63 var12 = new class63();
        var12.field1191 = arg10;
        var12.field1188 = arg1 * 128 + 64;
        var12.field1194 = arg2 * 128 + 64;
        var12.field1199 = arg3;
        var12.field1182 = arg4;
        var12.field1190 = arg5;
        var12.field1192 = arg6;
        var12.field1202 = arg7;
        var12.field1193 = arg8;
        var12.field1183 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class7.field122[var13][arg1][arg2] == null) {
                class7.field122[var13][arg1][arg2] = new class120(var13, arg1, arg2);
            }
        }
        class7.field122[arg0][arg1][arg2].field2124 = var12;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILgf;IB)Lbc;")
    public static final class100 method118(int arg0, class7 arg1, int arg2, byte arg3) {
        int var4 = 92 / ((-arg3 - 57) / 34);
        field274++;
        return class189.method1223(arg1, arg0, 118, arg2) ? class92.method523(0) : null;
    }
}
