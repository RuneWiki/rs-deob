import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class365 {

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    private int field5243;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field5240 = 0;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "[F")
    public static float[] field5239 = new float[16384];

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field5245 = 1;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "[F")
    public static float[] field5246 = new float[16384];

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "Lka;")
    public static class473 field5248;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "F")
    public static float field5247;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "Lke;")
    public static class364 field5241;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BC)V")
    public final void method2183(byte arg0, char arg1) {
        field5237++;
        OpenGL.glCallList(this.field5243 + arg1);
        if (arg0 != -41) {
            field5246 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V")
    public static final void method2184(int arg0, String arg1, String arg2, int arg3, int arg4, int arg5, String arg6, String arg7) {
        field5238++;
        for (int var8 = 99; var8 > 0; var8--) {
            class403.field5762[var8] = class403.field5762[var8 - 1];
            class135.field2052[var8] = class135.field2052[var8 - 1];
            class10.field118[var8] = class10.field118[var8 - 1];
            class36.field549[var8] = class36.field549[var8 - 1];
            class529.field7736[var8] = class529.field7736[var8 - 1];
            class320.field4404[var8] = class320.field4404[var8 - 1];
            class125.field1939[var8] = class125.field1939[var8 - 1];
        }
        int var9 = 115 % ((-arg3 - 9) / 43);
        class403.field5762[0] = arg4;
        class135.field2052[0] = arg0;
        class10.field118[0] = arg6;
        class36.field549[0] = arg7;
        class529.field7736[0] = arg1;
        class499.field7304++;
        class320.field4404[0] = arg2;
        class125.field1939[0] = arg5;
        class530.field7788 = field5245;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
    public final void method2185(int arg0, int arg1) {
        if (arg0 < -28) {
            OpenGL.glNewList(this.field5243 + arg1, 4864);
            field5242++;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public final void method2186(byte arg0) {
        field5244++;
        OpenGL.glEndList();
        if (arg0 > -86) {
            method2187(77);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static void method2187(int arg0) {
        if (arg0 != 16384) {
            field5247 = 0.27999827F;
        }
        field5246 = null;
        field5239 = null;
        field5248 = null;
        field5241 = null;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lpg;I)V")
    public class365(class333 arg0, int arg1) {
        this.field5243 = OpenGL.glGenLists(arg1);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5246[var2] = (float) Math.sin((double) var2 * var0);
            field5239[var2] = (float) Math.cos((double) var2 * var0);
        }
        field5248 = new class473(4);
        new class157("Ok", "Okay", "OK", "Ok");
    }
}
