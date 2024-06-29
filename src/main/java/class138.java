import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class138 extends class279 {

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "Lom;")
    private class642 field2163;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "Lno;")
    private class67 field2169;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "Lhe;")
    private class574 field2161;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "Lln;")
    public static class472 field2160 = new class472(4, 1, 1, 1);

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "Z")
    public static boolean field2166 = true;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    public static int field2167 = -1;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
    public static int field2172 = 0;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "Lnf;")
    public static class19 field2162 = new class19();

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BZ)V", line = 4)
    public final void method441(byte arg0, boolean arg1) {
        ++field2168;
        if (arg0 == 9) {
            super.field4267.method365(class750.field10454, class200.field3408, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZLiu;)V", line = 17)
    public final void method437(int arg0, boolean arg1, class506 arg2) {
        ++field2165;
        if (arg1) {
            this.method442(true);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)V", line = 32)
    public final void method442(boolean arg0) {
        ++field2171;
        if (arg0) {
            this.method442(true);
        }
        super.field4267.method321(class388.field5817, 0, (byte) -95);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)V", line = 46)
    public final void method443(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field2163 = null;
        }
        ++field2170;
        if (!this.field2169.field1050) {
            int var4 = super.field4267.field649 % 4000 * 16 / 4000;
            super.field4267.method215(arg1 + 8, this.field2169.field1052[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field4267.field649 % 4000) / 4000.0F;
            super.field4267.method215(8, this.field2169.field1058);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZI)V", line = 71)
    public final void method435(boolean arg0, int arg1) {
        OpenGL.glBindProgramARB(34336, this.field2161.field8155);
        ++field2164;
        OpenGL.glEnable(34336);
        if (arg1 != 2048) {
            this.method443(-89, 97, -5);
        }
        super.field4267.method321(class493.field7145, 0, (byte) -95);
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lom;Lla;Lno;)V", line = 87)
    public class138(class642 arg0, class422 arg1, class67 arg2) {
        super(arg0);
        this.field2163 = arg0;
        this.field2169 = arg2;
        if (arg1 != null && this.field2169.method646((byte) 75) && this.field2163.field9174) {
            this.field2161 = class612.method3492(this.field2163, arg1.method2638("transparent_water", 97, "gl"), 0, 34336);
        } else {
            this.field2161 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "(I)V", line = 105)
    public static void method1090(int arg0) {
        if (arg0 != 1) {
            field2162 = null;
        }
        field2162 = null;
        field2160 = null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)Z", line = 121)
    public final boolean method438(byte arg0) {
        ++field2173;
        if (arg0 >= -32) {
            this.method438((byte) -23);
        }
        return this.field2161 != null;
    }
}
