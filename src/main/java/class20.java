import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class20 implements Runnable {

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "[Lvi;")
    public volatile class257[] field256 = new class257[2];

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Z")
    public volatile boolean field262 = false;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Z")
    public volatile boolean field255 = false;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "[I")
    public static int[] field252 = new int[500];

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "[I")
    public static int[] field264 = new int[14];

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Lkm;")
    public static class133 field260;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "Lkm;")
    public static class133 field263;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Lpn;")
    public static class170 field259;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Lgn;")
    public static class77 field253;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lwa;")
    public class80 field251;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 9)
    public static final String method126(int arg0, byte arg1) {
        field261++;
        String var2 = Integer.toString(arg0);
        int var3 = var2.length() - 3;
        if (arg1 != 93) {
            field259 = (class170) null;
        }
        while (var3 > 0) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            var3 -= 3;
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class90.field1269 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class166.field2272 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 47)
    public static void method127(int arg0) {
        field264 = null;
        field260 = null;
        field253 = null;
        field252 = null;
        if (arg0 == 500) {
            field263 = null;
            field259 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Lin;", line = 66)
    public static final class344 method128(int arg0, int arg1, int arg2) {
        field257++;
        class344 var3 = class151.method1101(-103, arg1);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field5248 == null || arg2 >= var3.field5248.length) {
            return null;
        } else {
            if (arg0 < 111) {
                field259 = (class170) null;
            }
            return var3.field5248[arg2];
        }
    }

    @OriginalMember(owner = "client!mh", name = "run", descriptor = "()V", line = 84)
    public final void run() {
        this.field255 = true;
        field265++;
        try {
            while (!this.field262) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class257 var2 = this.field256[var1];
                    if (var2 != null) {
                        var2.method1768(true);
                    }
                }
                class186.method1304(10, 10L);
                class342.method2360((Object) null, this.field251, 0);
            }
        } catch (Exception var7) {
            class187.method1307((String) null, var7, -96);
        } finally {
            this.field255 = false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V", line = 123)
    public static final void method129() {
        GL var0 = class67.field899;
        var0.glDisableClientState(32886);
        class67.method460(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class67.method475();
        for (int var1 = 0; var1 < class125.field1693[0].length; var1++) {
            class268 var2 = class125.field1693[0][var1];
            if (var2.field3978 >= 0 && class208.method1465(-113, class184.field2543.method667(113, var2.field3978))) {
                var0.glColor4fv(class89.method686(var2.field3969, (byte) -123), 0);
                float var3 = 201.5F - (var2.field3960 ? 1.0F : 0.5F);
                var2.method1846(class142.field1940, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class67.method483();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class67.method482();
    }
}
