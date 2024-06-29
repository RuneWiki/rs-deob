import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class267 {

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    private int field4053;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "Lje;")
    public static class278 field4052 = new class278(0, 2, 2, 1);

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "[B")
    public static byte[] field4058 = new byte[2048];

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Lph;")
    public static class459 field4056;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public static final void method1698(int arg0) {
        int var1 = 115 % ((arg0 - 21) / 47);
        class502.method3022((byte) -2);
        field4055++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)V")
    public final void method1699(byte arg0, int arg1) {
        OpenGL.glNewList(this.field4053 + arg1, 4864);
        field4051++;
        if (arg0 != 88) {
            this.method1700(-77);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
    public final void method1700(int arg0) {
        if (arg0 != 2) {
            this.method1700(86);
        }
        field4057++;
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V")
    public static void method1701(boolean arg0) {
        field4056 = null;
        field4058 = null;
        if (!arg0) {
            field4058 = null;
        }
        field4052 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IC)V")
    public final void method1702(int arg0, char arg1) {
        if (arg0 >= -17) {
            field4056 = null;
        }
        OpenGL.glCallList(this.field4053 + arg1);
        field4054++;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lda;I)V")
    public class267(class44 arg0, int arg1) {
        this.field4053 = OpenGL.glGenLists(arg1);
    }
}
