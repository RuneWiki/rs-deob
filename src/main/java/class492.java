import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class492 {

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public int field6138;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[Z")
    public static boolean[] field6136;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILel;[B)Lnm;", line = 7)
    public static final class441 method2667(int arg0, int arg1, class513 arg2, byte[] arg3) {
        field6132++;
        if (arg3 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        if (arg0 != 6447) {
            method2670(-43);
        }
        OpenGL.glBindProgramARB(arg1, var4);
        OpenGL.glProgramRawARB(arg1, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class560.field6994, 0);
        if (class560.field6994[0] == -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return new class441(arg2, arg1, var4);
        } else {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
    public final String toString() {
        field6134++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[B", line = 46)
    public static final byte[] method2668(int arg0, int arg1) {
        field6137++;
        class160 var2 = (class160) class572.field7300.method1046(100, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class396.method2241(0, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class160(var3);
            class572.field7300.method1042((long) arg0, var2, true);
        }
        if (arg1 < 53) {
            method2667(-8, 48, null, null);
        }
        return var2.field1889;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 97)
    public static void method2669(byte arg0) {
        field6136 = null;
        if (arg0 != -5) {
            field6136 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 107)
    public static final void method2670(int arg0) {
        if (arg0 != 26) {
            field6136 = null;
        }
        field6133++;
        for (class501 var1 = (class501) class345.field4438.method1909(true); var1 != null; var1 = (class501) class345.field4438.method1916((byte) 94)) {
            if (class550.method2943(var1.field6242, false)) {
                class71.method561(var1, false);
            }
        }
        if (class638.field8648 == 1) {
            class75.method598(0);
            return;
        }
        class434.method2390(class284.field3593, class559.field6988, class484.field6012, class465.field5774, (byte) -20);
        int var2 = class36.field540.method127(class671.field9138.method3726((byte) 65, class71.field912), (byte) -50);
        for (class501 var3 = (class501) class345.field4438.method1909(true); var3 != null; var3 = (class501) class345.field4438.method1916((byte) 95)) {
            int var4 = class645.method3610(var3, arg0 ^ 0x62);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class484.field6012 = (class353.field4564 ? 26 : 22) + class638.field8648 * 16;
        class559.field6988 = var2 + 8;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 157)
    public class492(String arg0, int arg1) {
        this.field6138 = arg1;
    }
}
