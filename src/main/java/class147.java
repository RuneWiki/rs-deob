import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class147 extends class3 {

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Lih;")
    private class503 field1961;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Law;")
    private class55 field1962;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "[F")
    public static float[] field1960 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Lhm;")
    public static class150 field1965 = null;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Loi;")
    public static class53 field1966;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "[Z")
    public static boolean[] field1955;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Law;", line = 9)
    public final class55 method26(int arg0) {
        field1958++;
        if (arg0 != 9907) {
            method919(null, 78);
        }
        return this.field1962;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 24)
    public static void method918(int arg0) {
        if (arg0 != -65535) {
            field1966 = null;
        }
        field1965 = null;
        field1960 = null;
        field1966 = null;
        field1955 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Loi;I)V", line = 37)
    public static final void method919(class53 arg0, int arg1) {
        class145.field1913 = arg1;
        class428.field6027 = 0;
        field1954++;
        class271.field4027 = new class477();
        class105.field1390 = new class115[1024];
        class410.method2427((byte) -17, arg0);
        class243.method1529(arg0, true);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lih;I)V", line = 51)
    public class147(class503 arg0, int arg1) {
        this.field1961 = arg0;
        this.field1962 = new class55(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Law;Law;FI)Z", line = 60)
    public final boolean method920(class55 arg0, class55 arg1, float arg2, int arg3) {
        field1959++;
        boolean var5 = true;
        class146 var6 = this.field1961.field7381;
        this.field1961.method343(class380.field5361);
        this.field1961.method295();
        this.field1961.method2945(-128);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field1962.field695, this.field1962.field695);
        this.field1961.method2977(-49, false);
        this.field1961.method2962(1, false);
        this.field1961.method2926(false, (byte) -106);
        this.field1961.method2933(false, false);
        this.field1961.method2995(-2, (byte) -127);
        this.field1961.method2940(1, (byte) 124);
        this.field1961.method2954(0.0F, 0.0F, arg2, 0.0F, 1);
        this.field1961.method2935((byte) 87, 34165, 34165);
        this.field1961.method2968(arg1, -109);
        this.field1961.method2940(0, (byte) 85);
        this.field1961.method2999(1, 84);
        if (arg3 != -12163) {
            method918(-41);
        }
        this.field1961.method2968(arg0, arg3 + 12106);
        this.field1961.method2928(var6, (byte) -24);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method901(this.field1962, 0, var8, 0);
            var6.method915(0, -40);
            if (!var6.method916((byte) 123)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method906((byte) 87, 0);
        this.field1961.method2931(false, var6);
        this.field1961.method2940(1, (byte) 88);
        this.field1961.method2968(null, -76);
        this.field1961.method2935((byte) 87, 8448, 8448);
        this.field1961.method2940(0, (byte) 91);
        this.field1961.method2968(null, -77);
        OpenGL.glPopAttrib();
        this.field1961.method301(class380.field5361[0], class380.field5361[1], class380.field5361[2], class380.field5361[3]);
        if (var5 && !this.field1961.field7361) {
            this.field1962.method2761((byte) 121);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)Z", line = 261)
    public static final boolean method921(int arg0, byte arg1) {
        int var2 = 68 / ((arg1 + 49) / 46);
        class198.field2816 = true;
        class121.field1668 = arg0 + 1 & 0xFFFF;
        field1963++;
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)I", line = 282)
    public final int method922(int arg0) {
        field1964++;
        return arg0 < 32 ? 72 : this.field1962.field695;
    }
}
