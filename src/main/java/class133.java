import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class133 implements class5 {

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Z")
    private boolean field2246 = false;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    private int field2245 = -1;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[Lui;")
    public static class257[] field2244 = new class257[14];

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2239 = "";

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
    public static int[] field2240 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "[I")
    public static int[] field2247;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V", line = 10)
    public final void method18() {
        field2238++;
        GL var1 = class42.field627;
        if (this.field2246) {
            var1.glCallList(this.field2245 + 1);
            this.field2246 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 28)
    public final void method19(int arg0) {
        field2242++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILth;I)Lem;", line = 37)
    public static final class285 method1019(int arg0, class57 arg1, int arg2) {
        int var3 = -87 % ((arg0 + 7) / 38);
        field2249++;
        return class45.method333((byte) 115, arg1, arg2) ? class14.method80(0) : null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 52)
    public static void method1020(byte arg0) {
        if (arg0 > 83) {
            field2240 = null;
            field2244 = null;
            field2239 = null;
            field2247 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lhd;III)V", line = 64)
    public static final void method1021(class161 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class273.field4526) {
            class36 var4 = class129.field2184[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field537 != null && var4.field537.field2968.method890()) {
                arg0.method879(var4.field537.field2968, 128, 0, 0, true);
            }
        }
        if (arg3 < class273.field4526) {
            class36 var5 = class129.field2184[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field537 != null && var5.field537.field2968.method890()) {
                arg0.method879(var5.field537.field2968, 0, 0, 128, true);
            }
        }
        if (arg2 < class273.field4526 && arg3 < class162.field2574) {
            class36 var6 = class129.field2184[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field537 != null && var6.field537.field2968.method890()) {
                arg0.method879(var6.field537.field2968, 128, 0, 128, true);
            }
        }
        if (arg2 < class273.field4526 && arg3 > 0) {
            class36 var7 = class129.field2184[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field537 != null && var7.field537.field2968.method890()) {
                arg0.method879(var7.field537.field2968, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 111)
    public static final void method1022(byte arg0) {
        field2243++;
        if (class125.field2133 || class237.field3922 == 2) {
            return;
        }
        if (arg0 != -48) {
            method1021((class161) null, 108, 26, 73);
        }
        try {
            class88.method702(class215.field3444, "tbrefresh", (byte) 116);
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()I", line = 137)
    public final int method20() {
        field2248++;
        return 4;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 183)
    public class133() {
        if (class42.field621) {
            GL var1 = class42.field627;
            this.field2245 = var1.glGenLists(2);
            var1.glNewList(this.field2245, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 34165);
            var1.glTexEnvi(8960, 34178, 34168);
            var1.glTexEnvi(8960, 34162, 7681);
            var1.glTexEnvi(8960, 34184, 34167);
            var1.glTexGeni(8192, 9472, 34066);
            var1.glTexGeni(8193, 9472, 34066);
            var1.glTexGeni(8194, 9472, 34066);
            var1.glEnable(3168);
            var1.glEnable(3169);
            var1.glEnable(3170);
            var1.glEnable(34067);
            var1.glActiveTexture(33984);
            var1.glEndList();
            var1.glNewList(this.field2245 + 1, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 8448);
            var1.glTexEnvi(8960, 34178, 34166);
            var1.glTexEnvi(8960, 34162, 8448);
            var1.glTexEnvi(8960, 34184, 5890);
            var1.glDisable(3168);
            var1.glDisable(3169);
            var1.glDisable(3170);
            var1.glDisable(34067);
            var1.glMatrixMode(5890);
            var1.glLoadIdentity();
            var1.glMatrixMode(5888);
            var1.glActiveTexture(33984);
            var1.glEndList();
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()V", line = 150)
    public final void method21() {
        GL var1 = class42.field627;
        class42.method277(1);
        if (class236.field3918 == null || this.field2245 < 0 || !class3.field36) {
            var1.glTexEnvi(8960, 34184, 34167);
        } else {
            var1.glCallList(this.field2245);
            var1.glActiveTexture(33985);
            class236.field3918.method1456();
            var1.glMatrixMode(5890);
            var1.glLoadIdentity();
            var1.glRotatef(-((float) class21.field234 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
            var1.glRotatef(-((float) class113.field1848 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
            var1.glScalef(-1.0F, 1.0F, 1.0F);
            var1.glMatrixMode(5888);
            var1.glActiveTexture(33984);
            this.field2246 = true;
        }
        field2237++;
    }
}
