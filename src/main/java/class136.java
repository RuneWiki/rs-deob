import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class136 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2117 = "scroll:";

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Lgk;")
    public static class7 field2122 = new class7(5000);

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field2124 = -1;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field2125 = 0;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Llb;")
    public static class211 field2123;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Lgd;")
    public class310 field2121;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lm;")
    public static class48 field2119;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Lom;")
    public class70 field2118;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1037(int arg0) {
        field2120++;
        class279.field4287.method1428(arg0 - 7392);
        if (arg0 != 18327) {
            field2119 = (class48) null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 22)
    public static void method1038(byte arg0) {
        if (arg0 < 19) {
            method1038((byte) -72);
        }
        field2122 = null;
        field2123 = null;
        field2119 = null;
        field2117 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)J", line = 40)
    public static final long method1039(int arg0, int arg1, int arg2) {
        class99 var3 = class250.field3746[arg0][arg1][arg2];
        return var3 == null || var3.field1472 == null ? 0L : var3.field1472.field2568;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V", line = 48)
    public static final void method1040() {
        GL var0 = class36.field518;
        var0.glDisableClientState(32886);
        class36.method337(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class36.method319();
        for (int var1 = 0; var1 < class287.field4423[0].length; var1++) {
            class123 var2 = class287.field4423[0][var1];
            if (var2.field1939 >= 0 && class56.field829.method1743(var2.field1939, (byte) -30) == 4) {
                var0.glColor4fv(class29.method197(3, var2.field1943), 0);
                float var3 = 201.5F - (var2.field1942 ? 1.0F : 0.5F);
                var2.method943(class250.field3746, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class36.method311();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class36.method305();
    }
}
