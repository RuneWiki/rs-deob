import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class290 {

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    private int field4200;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4198;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V")
    public final void method1833(byte arg0, int arg1) {
        OpenGL.glNewList(this.field4200 + arg1, 4864);
        field4195++;
        if (arg0 < 87) {
            method1837((byte) -27);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method1834(int arg0) {
        field4197++;
        int var1 = class43.field586;
        int[] var2 = class343.field4927;
        for (int var3 = 0; var3 < var1; var3++) {
            class400 var9 = class39.field536[var2[var3]];
            if (var9 != null && var9.field1562 > 0) {
                var9.field1562--;
                if (var9.field1562 == 0) {
                    var9.field1512 = null;
                }
            }
        }
        for (int var4 = arg0; var4 < class128.field2098; var4++) {
            long var5 = (long) class591.field8401[var4];
            class181 var7 = (class181) class432.field6368.method740(arg0, var5);
            if (var7 != null) {
                class170 var8 = var7.field2623;
                if (var8.field1562 > 0) {
                    var8.field1562--;
                    if (var8.field1562 == 0) {
                        var8.field1512 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BC)V")
    public final void method1835(byte arg0, char arg1) {
        field4201++;
        OpenGL.glCallList(this.field4200 + arg1);
        int var3 = 73 % ((22 - arg0) / 51);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(BI)Lbo;")
    public static final class225 method1836(byte arg0, int arg1) {
        field4199++;
        if (class596.field8491 && class92.field1624 <= arg1 && class12.field129 >= arg1) {
            if (arg0 != 35) {
                method1837((byte) 84);
            }
            return class206.field2916[arg1 - class92.field1624];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method1837(byte arg0) {
        field4198 = null;
        if (arg0 <= 113) {
            field4198 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ljj;I)V")
    public class290(class66 arg0, int arg1) {
        this.field4200 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public final void method1838(int arg0) {
        field4196++;
        if (arg0 == 0) {
            OpenGL.glEndList();
        }
    }

    static {
        new class224("", 73);
        field4198 = new String[100];
    }
}
