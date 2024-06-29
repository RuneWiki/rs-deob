import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class651 {

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public static int field8725;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!sga", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8725++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BI)V")
    public static final void method3643(byte arg0, int arg1) {
        field8727++;
        int var2 = class483.field6741 - class688.field9580;
        if (var2 >= 100) {
            class221.field2987 = -1;
            class388.field5597 = -1;
            class720.field10023 = 1;
            return;
        }
        int var3 = (int) class589.field8028;
        if ((class302.field4268 >> 8) > var3) {
            var3 = class302.field4268 >> 8;
        }
        if (class396.field5692[4] && var3 < (class548.field7627[4] + 128)) {
            var3 = class548.field7627[4] + 128;
        }
        int var4 = (int) class596.field8093 + class299.field4240 & 0x3FFF;
        class11.method52(class316.field4388, var3, class737.method4102((byte) 19, class388.field5601.field4410, class388.field5601.field4418, class96.field1331) - 200, (var3 >> 3) * 3 + 600 << 2, class357.field5123, arg0 + 68, var4, arg1);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class206.field2702 = (int) ((float) (class206.field2702 - class747.field10287) * var5 + (float) class747.field10287);
        class25.field318 = (int) ((float) (class25.field318 - class103.field1409) * var5 + (float) class103.field1409);
        class671.field9282 = (int) ((float) (class671.field9282 - class521.field7256) * var5 + (float) class521.field7256);
        class123.field1680 = (int) ((float) (class123.field1680 - class720.field10026) * var5 + (float) class720.field10026);
        if (arg0 != -38) {
            method3643((byte) -80, 59);
        }
        int var6 = class230.field3118 - class636.field8550;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class230.field3118 = (int) ((float) var6 * var5 + (float) class636.field8550);
        class230.field3118 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "([Lie;Ldw;B)Lcba;")
    public static final class54 method3644(class193[] arg0, class664 arg1, byte arg2) {
        field8726++;
        if (arg2 != 84) {
            return null;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field2622 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field2622);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class659.field8777, 0);
        if (class659.field8777[0] == 0) {
            if (class659.field8777[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class659.field8777, 1);
            if (class659.field8777[1] > 1) {
                byte[] var7 = new byte[class659.field8777[1]];
                OpenGL.glGetInfoLogARB(var4, class659.field8777[1], class659.field8777, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class659.field8777[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field2622);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class54(arg1, var4, arg0);
    }
}
