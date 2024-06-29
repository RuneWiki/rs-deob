import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class422 {

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "Lua;")
    private class188 field6083;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "Ltt;")
    private class403 field6091;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "Lwo;")
    private class57 field6089;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Lec;")
    public static class40 field6080 = new class40("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "Lsd;")
    public static class74 field6087 = new class74(25, 3);

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "Lec;")
    public static class40 field6093 = new class40("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field6098 = 0;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "Lec;")
    public static class40 field6095 = new class40("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "[I")
    public static int[] field6099 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "Lvt;")
    private class179 field6088;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "Lqr;")
    public static class18 field6096;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "Lfn;")
    public static class342 field6084;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "Lkt;")
    public static class51 field6097;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "[Lp;")
    private class483[] field6090;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "[S")
    public static short[] field6094;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method2514(int arg0) {
        field6079++;
        if (this.field6088 != null) {
            return true;
        } else if (arg0 == 16969) {
            if (this.field6089 == null) {
                if (this.field6083.method1024(8)) {
                    return false;
                }
                this.field6089 = this.field6083.method1033((byte) 0, 255, 0, 255, true);
            }
            if (this.field6089.field4927) {
                return false;
            } else {
                this.field6088 = new class179(this.field6089.method294((byte) 68));
                this.field6090 = new class483[(this.field6088.field2159.length - 5) / 8];
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLhc;Lhc;I)Lp;", line = 40)
    public final class483 method2515(byte arg0, class398 arg1, class398 arg2, int arg3) {
        field6081++;
        return arg0 == -102 ? this.method2519(true, arg2, 5, arg1, arg3) : null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V", line = 56)
    public static final void method2516(boolean arg0) {
        field6086++;
        if (arg0) {
            method2517((byte) -75);
        }
        boolean var1 = class484.field6868 != null || class318.field4628 > 0;
        if (var1) {
            class15.field198 = 1;
        }
        if (class224.field3100 && class308.field4529.method1689((byte) -118, 81) && class223.field3099 > 2) {
            if (var1) {
                class210.field2906 = (class158) class485.field6882.field1985.field1777.field1777;
            } else {
                class115.method565(class361.field5205.method490(0), -106, (class158) class485.field6882.field1985.field1777.field1777, class361.field5205.method487((byte) 96));
            }
        } else if (var1) {
            class210.field2906 = (class158) class485.field6882.field1985.field1777;
        } else {
            class115.method565(class361.field5205.method490(0), -113, (class158) class485.field6882.field1985.field1777, class361.field5205.method487((byte) 96));
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V", line = 91)
    public static void method2517(byte arg0) {
        field6099 = null;
        field6097 = null;
        field6084 = null;
        field6094 = null;
        field6096 = null;
        field6087 = null;
        field6093 = null;
        field6080 = null;
        field6095 = null;
        if (arg0 >= -102) {
            field6093 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V", line = 111)
    public final void method2518(int arg0) {
        field6092++;
        if (this.field6090 == null || arg0 < 44) {
            return;
        }
        for (int var2 = 0; var2 < this.field6090.length; var2++) {
            if (this.field6090[var2] != null) {
                this.field6090[var2].method2848(98);
            }
        }
        for (int var3 = 0; var3 < this.field6090.length; var3++) {
            if (this.field6090[var3] != null) {
                this.field6090[var3].method2850(-22326);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZLhc;ILhc;I)Lp;", line = 149)
    private final class483 method2519(boolean arg0, class398 arg1, int arg2, class398 arg3, int arg4) {
        field6082++;
        if (this.field6088 == null) {
            throw new RuntimeException();
        }
        this.field6088.field2206 = arg4 * 8 + arg2;
        if (this.field6088.field2159.length <= this.field6088.field2206) {
            throw new RuntimeException();
        } else if (this.field6090[arg4] == null) {
            int var6 = this.field6088.method939((byte) -65);
            int var7 = this.field6088.method939((byte) 67);
            class483 var8 = new class483(arg4, arg3, arg1, this.field6083, this.field6091, var6, var7, arg0);
            this.field6090[arg4] = var8;
            return var8;
        } else {
            return this.field6090[arg4];
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lua;Ltt;)V", line = 187)
    public class422(class188 arg0, class403 arg1) {
        this.field6083 = arg0;
        this.field6091 = arg1;
        if (!this.field6083.method1024(8)) {
            this.field6089 = this.field6083.method1033((byte) 0, 255, 0, 255, true);
        }
    }
}
