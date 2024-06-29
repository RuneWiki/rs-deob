import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class class74 {

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)Z")
    public abstract boolean method696(boolean arg0);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)J")
    public abstract long method697(int arg0);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static final void method698(byte arg0) {
        field1014++;
        if (class485.field7133) {
            return;
        }
        if (arg0 < 82) {
            field1012 = -73;
        }
        class368.method2274(class418.field6169, -75);
        if (class336.field4678 != null) {
            class368.method2274(class336.field4678, -110);
        }
        class485.field7133 = true;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
    public static final void method699(byte arg0) {
        field1009++;
        if (arg0 <= 51) {
            field1012 = 97;
        }
        if (class365.field5281 != class258.field3807) {
            try {
                class505.method3017(class164.field2319, "tbrefresh", 122);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)I")
    public abstract int method700(int arg0);

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)I")
    public abstract int method701(byte arg0);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([[IB)V")
    public static final void method702(int[][] arg0, byte arg1) {
        field1013++;
        if (arg1 == 85) {
            class141.field1996 = arg0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZJIII)Ljava/lang/String;")
    public static final String method703(boolean arg0, long arg1, int arg2, int arg3, int arg4) {
        field1015++;
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var6 = '.';
            var7 = ',';
        }
        int var8 = -90 % ((arg3 + 34) / 62);
        if (arg4 == 2) {
            var7 = ' ';
        }
        boolean var9 = false;
        if (arg1 < 0L) {
            var9 = true;
            arg1 = -arg1;
        }
        StringBuffer var10 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var11 = 0; var11 < arg2; var11++) {
                int var12 = (int) arg1;
                arg1 /= 10L;
                var10.append((char) (var12 + 48 - (int) arg1 * 10));
            }
            var10.append(var6);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg1;
            arg1 /= 10L;
            var10.append((char) (var14 + 48 - ((int) arg1 * 10)));
            if (arg1 == 0L) {
                if (var9) {
                    var10.append('-');
                }
                return var10.reverse().toString();
            }
            if (arg0) {
                var13++;
                if ((var13 % 3) == 0) {
                    var10.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)C")
    public abstract char method704(int arg0);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
    public static final void method705(int arg0, int arg1) {
        field1010++;
        if (arg0 <= 94) {
            field1016 = 48;
        }
        class215 var2 = class171.method1208(arg1, (byte) 119, 9);
        var2.method1469((byte) -60);
    }

    static {
        new class331("Select", "Auswählen", "Sélectionner", "Selecionar");
        field1011 = -1;
        field1012 = -1;
    }
}
