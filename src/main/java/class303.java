import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class303 extends class478 {

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
    public static int field3755 = -1;

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "([BI)Z")
    public static final boolean method1754(byte[] arg0, int arg1) {
        ++field3754;
        class115 var2 = new class115(arg0);
        int var3 = var2.method620((byte) -127);
        if (var3 != 2) {
            return false;
        } else {
            if (arg1 != -21524) {
                field3755 = 124;
            }
            boolean var4 = ~var2.method620((byte) 97) == -2;
            if (var4) {
                class401.method2260(var2, false);
            }
            class170.method926(var2, -1);
            return true;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ltf;Lfa;ILjava/awt/Canvas;B)Lr;")
    public static final class564 method1755(class701 arg0, class524 arg1, int arg2, Canvas arg3, byte arg4) {
        ++field3757;
        if (!class194.method1181((byte) 57)) {
            throw new RuntimeException("");
        } else if (!class166.method908("jaggl", (byte) 99)) {
            throw new RuntimeException("");
        } else if (arg4 <= 71) {
            return null;
        } else {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, 8, 24, 0, arg2);
            if (~var6 == -1L) {
                throw new RuntimeException("");
            } else {
                class221 var8 = new class221(var5, arg3, var6, arg1, arg0, arg2);
                var8.method2017((byte) 59);
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
    public class303() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -11323) {
            return null;
        } else {
            ++field3756;
            int[] var3 = super.field6886.method789(arg0, (byte) 126);
            if (super.field6886.field1592) {
                int[][] var4 = this.method2753(0, arg0, (byte) 11);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; var8 < class436.field6154; ++var8) {
                    var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
                }
            }
            return var3;
        }
    }
}
