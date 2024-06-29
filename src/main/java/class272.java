import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class272 extends class499 {

    @OriginalMember(owner = "client!gaa", name = "A", descriptor = "I")
    public int field4392;

    @OriginalMember(owner = "client!gaa", name = "C", descriptor = "I")
    public int field4394;

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "I")
    public int field4391;

    @OriginalMember(owner = "client!gaa", name = "x", descriptor = "I")
    public int field4389;

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "[I")
    public static int[] field4388 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!gaa", name = "E", descriptor = "[I")
    public static int[] field4396 = new int[1];

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "Lrl;")
    public static class672 field4386 = new class672(13, -1);

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!gaa", name = "y", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!gaa", name = "B", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!gaa", name = "D", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)Leu;", line = 3)
    public class444 method1247(int arg0) {
        field4390++;
        if (arg0 != 3848) {
            method1921(null, -87);
        }
        return class412.field6320;
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "(I)V", line = 16)
    public static void method1919(int arg0) {
        if (arg0 >= -44) {
            field4396 = null;
        }
        field4386 = null;
        field4388 = null;
        field4396 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIILht;)V", line = 29)
    public static final void method1920(int arg0, int arg1, int arg2, class539 arg3) {
        class252 var4 = class115.method1040(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field4025 = arg3;
        int var5 = class587.field8346 == class493.field7208 ? 1 : 0;
        if (arg3.method414(0)) {
            if (arg3.method402(623404585)) {
                class321.field5016[var5][class124.field2052[var5]++] = arg3;
                return;
            }
            class20.field329[var5][class203.field3310[var5]++] = arg3;
            return;
        }
        class245.field3903[var5][class95.field1483[var5]++] = arg3;
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lja;Lmea;IIIIIIIIIIIII)V", line = 51)
    public class272(class254 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field4392 = arg13;
        this.field4394 = arg12;
        this.field4384 = arg14;
        this.field4391 = arg10;
        this.field4389 = arg11;
        this.field4387 = arg9;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lr;I)V", line = 71)
    public static final void method1921(class167 arg0, int arg1) {
        if (arg1 > -83) {
            return;
        }
        for (class536 var2 = (class536) class364.field5737.method2754((byte) 116); var2 != null; var2 = (class536) class364.field5737.method2759(1486415172)) {
            if (var2.field7848) {
                var2.method3253(arg0);
            }
        }
        field4395++;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILri;Ljava/awt/Canvas;ILfa;)Lr;", line = 92)
    public static final class167 method1922(int arg0, class97 arg1, Canvas arg2, int arg3, class214 arg4) {
        field4385++;
        if (!class31.method438(16776960)) {
            throw new RuntimeException("");
        } else if (arg0 != -9653) {
            return null;
        } else if (class106.method1005("jaggl", (byte) 127)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg3);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class205 var8 = new class205(var5, arg2, var6, arg4, arg1, arg3);
            var8.method2269(arg0 + 33888);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }
}
