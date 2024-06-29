import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class80 {

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 4)
    public final void method737(int arg0) {
        field1428++;
        OpenGL.glEndList();
        if (arg0 != -1) {
            this.method741((byte) -56, 72);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZBZII)I", line = 18)
    public static final int method738(boolean arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field1425++;
        if (arg1 != -128) {
            return -20;
        }
        class6 var5 = class284.method1863((byte) -1, arg3, arg2);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field44.length; var7++) {
            if (var5.field44[var7] >= 0 && var5.field44[var7] < class721.field9801.field302) {
                class352 var8 = class721.field9801.method162(-127, var5.field44[var7]);
                int var9 = var8.method2214(class495.field6863.method19(arg4, 28364).field2000, 107, arg4);
                if (arg0) {
                    var6 += var5.field45[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IBLjava/lang/String;)Luu;", line = 58)
    public static final class288 method739(int arg0, byte arg1, String arg2) {
        field1424++;
        class288 var3;
        try {
            var3 = (class288) Class.forName("ip").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class571();
        }
        if (arg1 == -90) {
            var3.field4007 = arg2;
            var3.field4001 = arg0;
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(CI)V", line = 83)
    public final void method740(char arg0, int arg1) {
        field1427++;
        OpenGL.glCallList(this.field1429 + arg0);
        if (arg1 != 28666) {
            this.method737(30);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BI)V", line = 95)
    public final void method741(byte arg0, int arg1) {
        OpenGL.glNewList(this.field1429 + arg1, 4864);
        field1426++;
        if (arg0 <= 101) {
            this.method740((char) 65523, -3);
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lqo;I)V", line = 108)
    public class80(class22 arg0, int arg1) {
        this.field1429 = OpenGL.glGenLists(arg1);
    }
}
