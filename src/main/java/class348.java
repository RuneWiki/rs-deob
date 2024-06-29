import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class348 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lna;")
    public class211 field5398;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Lqu;")
    public static class219 field5401 = new class219(68, 3);

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field5402 = 0;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field5403 = 0;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Z")
    public abstract boolean method267(int arg0);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(CB)C")
    public static final char method2297(char arg0, byte arg1) {
        field5396++;
        int var2 = 118 % ((-arg1 - 88) / 38);
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZB)V")
    public abstract void method262(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)[Lbi;")
    public static final class104[] method2298(int arg0) {
        if (arg0 == 199) {
            field5397++;
            return new class104[] { class170.field2486, class242.field3923, class409.field6202, class436.field6585, class319.field4969, class468.field7173, class325.field5105, class169.field2480, class224.field3766, class371.field5702, class389.field5928, class339.field5289, class340.field5310, class109.field1554, class309.field4831, class94.field1363, class77.field1150, class435.field6561, class129.field1742, class504.field7548, class24.field272, class84.field1227, class59.field946, class211.field3397, class242.field3930, class218.field3708, class70.field1072, class380.field5838, class327.field5134, class168.field2454, class269.field4301, class392.field5956, class67.field1027, class1.field7, class150.field2012, class429.field6509, class262.field4244, class531.field7798, class332.field5193, class365.field5643, class532.field7811, class487.field7385, class479.field7321, class42.field460, class178.field2608, class206.field3141, class373.field5731, class250.field4054, class342.field5333, class532.field7813, class49.field619, class474.field7260, class172.field2522, class228.field3801, class447.field6938, class341.field5317, class405.field6088, class286.field4507, class285.field4497, class15.field158, class13.field145, class508.field7579, class320.field4978, class450.field6975, class6.field74, class299.field4714, class89.field1313, class392.field5954, class23.field262, class517.field7679, class89.field1284, class434.field6555, class535.field7834, class227.field3786, class60.field949, class134.field1807, class112.field1579, class481.field7330, class426.field6446, class249.field4052, class202.field3080, class438.field6800, class343.field5349, class272.field4334, class471.field7185, class403.field6079, class311.field4870, class84.field1225, class101.field1453, class360.field5574, class87.field1263, class358.field5562, class96.field1392, class138.field1892, class510.field7599, class398.field6000, class468.field7176, class329.field5166, class414.field6271, class411.field6234, class219.field3713, class434.field6550, class386.field5899, class192.field2846, class217.field3681, class170.field2483, class452.field7011, class525.field7744, class320.field4979, class196.field3018, class513.field7619, class428.field6484, class464.field7123, class108.field1553 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public abstract void method265(int arg0);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(ZB)V")
    public abstract void method261(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIB)V")
    public abstract void method263(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILed;)V")
    public abstract void method264(int arg0, int arg1, class427 arg2);

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
    public static void method2299(int arg0) {
        field5401 = null;
        if (arg0 <= 124) {
            field5403 = -110;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lna;)V")
    public class348(class211 arg0) {
        this.field5398 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZIIZI)I")
    public static final int method2300(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5399++;
        class339 var5 = class154.method940(arg2, arg3, (byte) 119);
        if (var5 == null) {
            return 0;
        }
        int var6 = arg4;
        for (int var7 = 0; var7 < var5.field5287.length; var7++) {
            if (var5.field5287[var7] >= 0 && var5.field5287[var7] < class337.field5262.field4840) {
                class196 var8 = class337.field5262.method2077((byte) -65, var5.field5287[var7]);
                int var9 = var8.method1350(class274.field4353.method1171((byte) 82, arg1).field6872, (byte) 72, arg1);
                if (arg0) {
                    var6 += var5.field5290[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }
}
