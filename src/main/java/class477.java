import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class477 extends class256 {

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6504;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "[I")
    public static int[] field6508 = new int[2];

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "Leaa;")
    public static class380 field6507 = new class380("WTRC", 1);

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IILka;II)Lgp;")
    public static final class551 method2821(int arg0, int arg1, class283 arg2, int arg3, int arg4) {
        if (arg0 != -1) {
            method2825(31, -58, 78);
        }
        field6506++;
        return arg2 == null ? null : new class551(arg4, arg3, arg1, arg2.method1132(), arg2.method1114(), arg2.method1169(), arg2.method1120(), arg2.method1126(), arg2.method1128(), arg2.method1136());
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lsb;B[BI)Loha;")
    public static final class445 method2822(class93 arg0, byte arg1, byte[] arg2, int arg3) {
        field6509++;
        if (arg2 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramRawARB(arg3, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class112.field1597, 0);
        if (class112.field1597[0] != -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
        if (arg1 != 44) {
            method2821(-70, 7, null, -11, -109);
        }
        OpenGL.glBindProgramARB(arg3, 0);
        return new class445(arg0, arg3, var4);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
    public static final void method2823(byte arg0) {
        class126.field1741.method2132(((float) class674.field9500.field5115.method2769(0) * 0.1F + 0.7F) * class354.field4556);
        field6501++;
        class126.field1741.method2161(class541.field7575, class363.field4652, class504.field7053, (float) (class395.field5492 << 2), (float) (class354.field4554 << 2), (float) (class646.field9165 << 2));
        if (arg0 != 95) {
            method2822(null, (byte) 117, null, -25);
        }
        class126.field1741.method2136(class16.field212);
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(I)V")
    public class477(int arg0) {
        this.field6504 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
    public static void method2824(byte arg0) {
        field6508 = null;
        if (arg0 != -42) {
            method2825(-28, 17, 18);
        }
        field6507 = null;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)I")
    public static final int method2825(int arg0, int arg1, int arg2) {
        field6502++;
        if (class504.field7045 == -1) {
            return 1;
        }
        if (class674.field9500.field5158.method1006(0) != arg1) {
            class118.method774(-25484, arg1, true, class138.field1849.method891(-2041650704, class369.field4721));
            if (arg1 != class674.field9500.field5158.method1006(0)) {
                return -1;
            }
        }
        try {
            Dimension var3 = class438.field6016.getSize();
            class665.method3817(class442.field6064, 69, class138.field1849.method891(arg2 - 2041650654, class369.field4721), class339.field4345, true, class96.field1401);
            class64 var4 = class86.method524(class547.field7709, class504.field7045, -66, 0);
            long var5 = class224.method1457((byte) -62);
            class96.field1401.method2198();
            class123.field1685.method848(0, class457.field6297, 0);
            class96.field1401.method2068(class123.field1685);
            class96.field1401.method2081(var3.width / 2, var3.height / 2, 512, 512);
            class96.field1401.method2132(1.0F);
            class96.field1401.method2161(16777215, 0.5F, 0.5F, 20.0F, (float) arg2, 30.0F);
            class283 var7 = class96.field1401.method2222(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label41: for (int var9 = 0; var9 < 500; var9++) {
                class96.field1401.method563(0);
                class96.field1401.method610();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class383.field5374.method848((int) (((float) var11 - ((float) var10 / 2.0F)) * (float) class96.field1402), 0, (var10 + 1) * class96.field1402);
                        var7.method1168(class383.field5374, null, 0);
                        var8++;
                        if (class224.method1457((byte) -62) - var5 >= (long) arg0) {
                            break label41;
                        }
                    }
                }
            }
            class96.field1401.method589();
            long var12 = (long) (var8 * 1000) / (class224.method1457((byte) -62) - var5);
            class96.field1401.method563(0);
            class96.field1401.method610();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(B)V")
    public final void method2826(byte arg0) {
        field6503++;
        if (arg0 <= -68) {
            this.field6504.method2560();
        }
    }
}
