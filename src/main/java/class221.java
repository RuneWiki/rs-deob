import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class221 extends class415 {

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3179;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "Z")
    public static boolean field3180 = false;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "Loaa;")
    public static class290 field3178 = new class290(14, 0, 4, 1);

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[BLbga;I)Lqr;")
    public static final class65 method1571(int arg0, byte[] arg1, class358 arg2, int arg3) {
        field3176++;
        if (arg1 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramRawARB(arg0, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class416.field6025, 0);
        if (class416.field6025[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return arg3 == 4 ? new class65(arg2, arg0, var4) : null;
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZLkda;)V")
    public static final void method1572(boolean arg0, class390 arg1) {
        field3175++;
        if (arg1.field5668 == null && arg1.field5722 == null) {
            return;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < arg1.field5668.length; var3++) {
            int var4 = -1;
            if (arg1.field5668 != null) {
                var4 = arg1.field5668[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var9;
                int var11;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var7 = var4 & 0xFFFFFFF;
                    int var8 = var7 >> 14;
                    var9 = arg1.field5922 - (var8 - field3177) * 512 - 256;
                    int var10 = var7 & 0x3FFF;
                    var11 = arg1.field5933 - (var10 - class367.field5236) * 512 - 256;
                } else if ((var4 & 0x8000) == 0) {
                    class751 var12 = (class751) class86.field1546.method1465((long) var4, -6008);
                    if (var12 == null) {
                        arg1.method2446(-96, var3, -1);
                        continue;
                    }
                    class9 var13 = var12.field10510;
                    var11 = arg1.field5933 - var13.field5933;
                    var9 = arg1.field5922 - var13.field5922;
                } else {
                    int var14 = var4 & 0x7FFF;
                    class598 var15 = class49.field1040[var14];
                    if (var15 == null) {
                        arg1.method2446(67, var3, -1);
                        continue;
                    }
                    var11 = arg1.field5933 - var15.field5933;
                    var9 = arg1.field5922 - var15.field5922;
                }
                if (var9 != 0 || var11 != 0) {
                    arg1.method2446(-100, var3, (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF);
                }
            } else if (!arg1.method2446(-80, var3, -1)) {
                var2 = false;
            }
        }
        if (var2) {
            arg1.field5668 = null;
            arg1.field5722 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public static void method1573(int arg0) {
        if (arg0 <= -85) {
            field3178 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
    public final void method1574(int arg0) {
        this.field3179.method3778();
        if (arg0 != -9503) {
            field3177 = -29;
        }
        field3174++;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(I)V")
    public class221(int arg0) {
        this.field3179 = new NativeHeap(arg0);
    }
}
