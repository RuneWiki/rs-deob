import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class356 {

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    private int field5385;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field5382 = 0;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "Z")
    public static boolean field5388 = false;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field5386 = 0;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Lti;")
    public static class303 field5381 = new class303(1);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V", line = 6)
    public final void method2295(int arg0, byte arg1) {
        if (arg1 <= 115) {
            this.method2296(116);
        }
        field5384++;
        OpenGL.glNewList(this.field5385 + arg0, 4864);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 18)
    public final void method2296(int arg0) {
        OpenGL.glEndList();
        int var2 = -96 / ((arg0 - 15) / 57);
        field5383++;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V", line = 37)
    public static void method2297(int arg0) {
        field5381 = null;
        if (arg0 != 0) {
            field5382 = 89;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(CI)V", line = 47)
    public final void method2298(char arg0, int arg1) {
        OpenGL.glCallList(this.field5385 + arg0);
        if (arg1 != 0) {
            this.method2298((char) 65484, 56);
        }
        field5380++;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lqg;I)V", line = 60)
    public class356(class321 arg0, int arg1) {
        this.field5385 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 85)
    public static final void method2299(String arg0, byte arg1) {
        class475.field6992 = arg0;
        if (arg1 != -69) {
            return;
        }
        field5387++;
        if (class112.field1785.field4458 == null) {
            return;
        }
        try {
            String var2 = class112.field1785.field4458.getParameter("cookieprefix");
            String var3 = class112.field1785.field4458.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class482.method2883(class464.method2773((byte) 103) + 94608000000L, 96) + "; Max-Age=" + 94608000L;
            }
            class426.method2605(class112.field1785.field4458, "document.cookie=\"" + var5 + "\"", arg1 + 22551);
        } catch (Throwable var6) {
        }
    }
}
