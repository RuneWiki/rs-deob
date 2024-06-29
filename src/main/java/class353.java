import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class353 {

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    private int field5071;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Z")
    public static boolean field5072 = false;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BC)V", line = 4)
    public final void method2094(byte arg0, char arg1) {
        if (arg0 < 111) {
            this.field5071 = -52;
        }
        OpenGL.glCallList(this.field5071 + arg1);
        field5065++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZBILoa;)Lta;", line = 15)
    public static final class194 method2095(boolean arg0, byte arg1, int arg2, class638 arg3) {
        field5070++;
        class158 var4 = class164.method1140(arg2, arg3, 0, arg0);
        if (var4 == null) {
            return null;
        } else {
            if (arg1 <= 17) {
                field5072 = false;
            }
            return var4.field2376;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjr;)V", line = 32)
    public static final void method2096(boolean arg0, class96 arg1) {
        field5067++;
        if (arg1.field1316.length - arg1.field1301 < 1 || arg0) {
            return;
        }
        int var2 = arg1.method718(-91);
        if (var2 < 0 || var2 > 1 || (arg1.field1316.length - arg1.field1301) < 2) {
            return;
        }
        int var3 = arg1.method743((byte) -4);
        if (arg1.field1316.length - arg1.field1301 < var3 * 6) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method743((byte) -38);
            int var6 = arg1.method714(false);
            if (class614.field8514.length > var5 && class385.field5394[var5] && (class265.field3750.method1958(28059, var5).field5504 != '1' || var6 >= -1 && var6 <= 1)) {
                class614.field8514[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V", line = 85)
    public final void method2097(int arg0, int arg1) {
        field5066++;
        OpenGL.glNewList(this.field5071 + arg0, 4864);
        if (arg1 != -14434) {
            field5072 = false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 98)
    public static final void method2098(byte arg0) {
        if (arg0 == -101) {
            class87.field1190 = true;
            field5068++;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 111)
    public final void method2099(int arg0) {
        OpenGL.glEndList();
        field5069++;
        if (arg0 != 6493) {
            method2095(true, (byte) -125, 115, null);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Len;I)V", line = 126)
    public class353(class289 arg0, int arg1) {
        this.field5071 = OpenGL.glGenLists(arg1);
    }
}
