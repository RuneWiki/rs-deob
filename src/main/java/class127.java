import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class127 extends class413 {

    @OriginalMember(owner = "client!qea", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1331;

    @OriginalMember(owner = "client!qea", name = "s", descriptor = "Z")
    public static boolean field1333 = false;

    @OriginalMember(owner = "client!qea", name = "t", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!qea", name = "u", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!qea", name = "r", descriptor = "[[[S")
    public static short[][][] field1332;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
    public final void method807(int arg0) {
        field1334++;
        if (arg0 != 6033) {
            method809((byte) -6);
        }
        this.field1331.method3808();
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(I)V")
    public class127(int arg0) {
        this.field1331 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "([Lrr;II)V")
    public static final void method808(class361[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class361 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field4639;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field4639 < (var7 & 0x1) + var6) {
                class361 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method808(arg0, arg1, var4 - 1);
        method808(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(B)V")
    public static void method809(byte arg0) {
        field1332 = null;
        if (arg0 != 31) {
            field1333 = true;
        }
    }
}
