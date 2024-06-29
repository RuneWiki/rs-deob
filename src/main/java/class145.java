import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class145 {

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "Leb;")
    private class395 field1960;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "Ljn;")
    public static class409 field1966 = new class409("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "Lbn;")
    public static class160 field1970 = new class160(51, -1);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Lgk;")
    private class264 field1963;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1004(int arg0) {
        field1961++;
        for (int var1 = arg0; var1 < class131.field1790.length; var1++) {
            for (int var2 = 0; var2 < class131.field1790[0].length; var2++) {
                for (int var3 = 0; var3 < class131.field1790[0][0].length; var3++) {
                    class131.field1790[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Lgk;", line = 37)
    public final class264 method1005(int arg0) {
        field1967++;
        if (arg0 != 0) {
            field1966 = null;
        }
        class264 var2 = this.field1960.field5735.field3906;
        if (this.field1960.field5735 == var2) {
            this.field1963 = null;
            return null;
        } else {
            this.field1963 = var2.field3906;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)Lgk;", line = 60)
    public final class264 method1006(byte arg0) {
        field1962++;
        class264 var2 = this.field1963;
        if (this.field1960.field5735 == var2) {
            this.field1963 = null;
            return null;
        } else if (arg0 == -25) {
            this.field1963 = var2.field3906;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)I", line = 83)
    public static final int method1007(int arg0) {
        field1964++;
        return arg0 == -14164 ? class202.field2855 : 1;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Leb;B)V", line = 95)
    public final void method1008(class395 arg0, byte arg1) {
        this.field1960 = arg0;
        field1965++;
        if (arg1 <= 29) {
            method1010(-126, 42, (class380) null, 97, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V", line = 105)
    public class145() {
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Leb;)V", line = 110)
    public class145(class395 arg0) {
        this.field1960 = arg0;
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V", line = 121)
    public static void method1009(int arg0) {
        field1970 = null;
        field1966 = null;
        if (arg0 != 0) {
            method1004(17);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILwc;IB)V", line = 137)
    public static final void method1010(int arg0, int arg1, class380 arg2, int arg3, byte arg4) {
        field1968++;
        int var5 = class139.method924(-4, 0, 0, true, arg0, 0, 0, arg2.field793[0], class15.field241, class382.field5610[arg2.field4960], arg2.field784[0], arg1, class187.field2619.method446(10), 2, class240.field3565);
        if (var5 < 1) {
            return;
        }
        for (int var6 = 0; var6 < var5 - 1; var6++) {
            arg2.method2416(arg4, class240.field3565[var6], class15.field241[var6], (byte) -128);
        }
        if (arg3 >= -30) {
            method1007(57);
        }
    }
}
