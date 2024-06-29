import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class421 extends class238 {

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Ldk;")
    public static class326 field5878 = new class326("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Lwf;")
    public static class79 field5879 = new class79(8, 2);

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "[I")
    public static int[] field5881 = new int[2];

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "[I")
    public static int[] field5882 = new int[3];

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lne;")
    public static class191 field5880;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)I")
    public abstract int method2162(boolean arg0);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
    public abstract int method2159(int arg0);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
    public abstract int method2157(int arg0);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method2472(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg0) {
            method2473((byte) -66);
        }
        field5876++;
        if (arg6 >= class168.field2449 && class94.field1209 >= arg2 && arg1 >= class345.field5011 && class485.field6827 >= arg3) {
            if (arg4 == 1) {
                class154.method969(arg5, arg3, arg6, arg2, arg1, -1);
            } else {
                class65.method399(arg3, arg1, arg4, arg6, false, arg2, arg5);
            }
        } else if (arg4 == 1) {
            class22.method146(arg3, arg6, arg1, arg5, 0, arg2);
        } else {
            class431.method2553(arg2, arg5, arg1, arg6, arg3, -4734, arg4);
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V")
    public static void method2473(byte arg0) {
        field5879 = null;
        field5880 = null;
        if (arg0 <= 108) {
            field5881 = null;
        }
        field5882 = null;
        field5881 = null;
        field5878 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)V")
    public static final void method2474(byte arg0, int arg1) {
        if (class177.field2545 == null) {
            class177.field2545 = new byte[4][class58.field758][class287.field4181];
        }
        field5877++;
        for (int var2 = arg1; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class58.field758; var3++) {
                for (int var4 = 0; var4 < class287.field4181; var4++) {
                    class177.field2545[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(Z)J")
    public abstract long method2164(boolean arg0);
}
