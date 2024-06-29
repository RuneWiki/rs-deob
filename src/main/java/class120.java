import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class120 extends class486 {

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Lgk;")
    private class463 field1671;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Llm;")
    private class244 field1670;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Lhb;")
    public static class250 field1674 = new class250(67, -1);

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Ldn;")
    public static class201 field1676;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static void method761(byte arg0) {
        field1674 = null;
        field1676 = null;
        if (arg0 < 10) {
            field1676 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Llm;")
    public final class244 method762(int arg0) {
        field1673++;
        if (arg0 != 27901) {
            method764(82, -123);
        }
        return this.field1670;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(FLlm;Llm;I)Z")
    public final boolean method763(float arg0, class244 arg1, class244 arg2, int arg3) {
        field1672++;
        boolean var5 = true;
        class453 var6 = this.field1671.field6761;
        class453 var7 = this.field1671.field6715;
        if (this.field1671.field6792.field4409 != arg2.field3130 || this.field1671.field6792.field4416 != arg2.field3130) {
            this.field1671.field6792 = new class346(this.field1671, 3553, 6408, arg2.field3130, arg2.field3130);
        }
        if (this.field1671.field6822.field4409 != arg1.field3130 || this.field1671.field6822.field4416 != arg1.field3130) {
            this.field1671.field6822 = new class346(this.field1671, 3553, 6408, arg1.field3130, arg1.field3130);
        }
        this.field1671.method846(class471.field6889);
        this.field1671.method865();
        this.field1671.method2776((byte) -99);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field1670.field3130, this.field1670.field3130);
        this.field1671.method2766(-32, false);
        this.field1671.method2797(false, (byte) -22);
        this.field1671.method2800(arg3 + 17922, false);
        this.field1671.method2782(-17939, false);
        this.field1671.method2755(-2, true);
        this.field1671.method2741((byte) -38, 1);
        this.field1671.method2801(arg3 ^ arg3, arg0, 0.0F, 0.0F, 0.0F);
        this.field1671.method2794(34165, 34165, true);
        this.field1671.method2771(null, -16785);
        this.field1671.method2741((byte) -38, 0);
        this.field1671.method2739(1, 0);
        this.field1671.method2771(null, -16785);
        int var8 = 0;
        while (var8 < 6) {
            this.field1671.method2722(-4, var6);
            int var9 = var8 + 34069;
            var6.method2692(var9, arg2, 0, (byte) -109);
            this.field1671.method2740(var7, (byte) -55);
            var7.method2687((byte) 91, this.field1671.field6792, 0);
            if (var6.method2693((byte) -114) && var7.method2693((byte) -115)) {
                OpenGL.glBlitFramebufferEXT(0, 0, arg2.field3130, arg2.field3130, 0, 0, arg2.field3130, arg2.field3130, 16384, 9728);
                var6.method2692(var9, arg1, 0, (byte) -109);
                var7.method2687((byte) 85, this.field1671.field6822, 0);
                if (var6.method2693((byte) -116) && var7.method2693((byte) -120)) {
                    OpenGL.glBlitFramebufferEXT(0, 0, arg2.field3130, arg2.field3130, 0, 0, arg2.field3130, arg2.field3130, 16384, 9728);
                    var6.method2684(0, 1);
                    this.field1671.method2757(var6, -84);
                    var7.method2684(0, 1);
                    this.field1671.method2724((byte) -1, var7);
                    this.field1671.method2747(var6, 3);
                    var6.method2692(var9, this.field1670, 0, (byte) -109);
                    if (!var6.method2693((byte) -115)) {
                        var6.method2684(0, arg3 + 9294);
                        this.field1671.method2770(var6, false);
                        var5 = false;
                        break;
                    }
                    this.field1671.method2741((byte) -38, 1);
                    this.field1671.method2771(this.field1671.field6822, -16785);
                    this.field1671.method2741((byte) -38, 0);
                    this.field1671.method2771(this.field1671.field6792, -16785);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord2f(1.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord2f(1.0F, 1.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord2f(0.0F, 1.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                    OpenGL.glEnd();
                    this.field1671.method2741((byte) -38, 1);
                    this.field1671.method2771(null, arg3 ^ 0x65DC);
                    this.field1671.method2741((byte) -38, 0);
                    this.field1671.method2771(null, arg3 - 7492);
                    var6.method2684(0, 1);
                    this.field1671.method2770(var6, false);
                    var8++;
                    continue;
                }
                var6.method2684(0, 1);
                this.field1671.method2757(var6, -89);
                var7.method2684(0, 1);
                this.field1671.method2724((byte) -1, var7);
                var5 = false;
                break;
            }
            var6.method2684(0, arg3 + 9294);
            this.field1671.method2757(var6, -86);
            var7.method2684(0, 1);
            this.field1671.method2724((byte) -1, var7);
            var5 = false;
            break;
        }
        this.field1671.method2741((byte) -38, 1);
        this.field1671.method2794(8448, 8448, true);
        this.field1671.method2741((byte) -38, 0);
        OpenGL.glPopAttrib();
        this.field1671.method925(class471.field6889[0], class471.field6889[1], class471.field6889[2], class471.field6889[3]);
        if (var5) {
            this.field1670.method217(48);
        }
        return var5;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    public static final void method764(int arg0, int arg1) {
        if (arg0 != 5888) {
            method761((byte) -70);
        }
        field1675++;
        class436 var2 = class459.method2712(9, arg1, -1759243680);
        var2.method2567(16013);
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Llk;")
    public static final class311 method765(int arg0) {
        field1669++;
        if (class167.field2177.length > class249.field3182) {
            return class167.field2177[class249.field3182++];
        } else if (arg0 == 1) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB)V")
    public static final void method766(int arg0, int arg1, byte arg2) {
        field1677++;
        int var3 = -47 % ((arg2 + 77) / 44);
        class436 var4 = class459.method2712(5, arg1, -1759243680);
        var4.method2574((byte) 50);
        var4.field5980 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)I")
    public final int method767(int arg0) {
        if (arg0 != 6825) {
            field1676 = null;
        }
        field1668++;
        return this.field1670.field3130;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lgk;I)V")
    public class120(class463 arg0, int arg1) {
        this.field1671 = arg0;
        this.field1670 = new class244(arg0, 6408, arg1);
    }
}
