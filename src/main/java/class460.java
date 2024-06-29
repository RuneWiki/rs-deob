import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class460 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lns;")
    public static class62 field6707 = new class62(2);

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[[I")
    public static int[][] field6712 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;IILvd;)Lae;")
    public static final class30 method2666(String arg0, int arg1, int arg2, class258 arg3) {
        field6708++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class263.field3925, 0);
        if (class263.field3925[0] != -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        } else if (arg1 == 12) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class30(arg3, arg2, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method2667(int arg0) {
        if (arg0 != -8462) {
            field6706 = -13;
        }
        field6712 = null;
        field6707 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static final void method2668(byte arg0) {
        for (int var1 = 0; var1 < class519.field7609; var1++) {
            int var2 = class327.field5114[var1];
            class351 var3 = class88.field1375[var2];
            if (var3 != null) {
                class31.method272(var3, true, var3.field5409.field4128);
            }
        }
        if (arg0 != -120) {
            method2667(-30);
        }
        field6709++;
    }
}
