import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class78 {

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public int field1020;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "B")
    public byte field1015;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "Lp;")
    public class148 field1025;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "Ltc;")
    public class238 field1014;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Lnr;")
    public class42 field1018;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "Lcj;")
    public class499 field1024;

    static {
        new class530(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 4)
    public static final void method596(int arg0) {
        if (arg0 != 1) {
            field1023 = 57;
        }
        field1017++;
        class432 var1 = (class432) class323.field4718.method2655(arg0 + 15151);
        boolean var2 = class471.field6573 != null || class171.field2480 > 0;
        if (var2) {
            class358.field5129 = 1;
        }
        if (class462.field6464 && class345.field5009.method870(81, -127) && class37.field408 > 2) {
            if (var2) {
                class531.field7800 = (class214) class363.field5190.field6378.field7056.field7056;
            } else {
                class52.method417((class214) class363.field5190.field6378.field7056.field7056, true, var1.method1082(arg0 - 770), var1.method1084((byte) -102));
            }
        } else if (var2) {
            class531.field7800 = (class214) class363.field5190.field6378.field7056;
        } else {
            class52.method417((class214) class363.field5190.field6378.field7056, true, var1.method1082(-769), var1.method1084((byte) -102));
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I[Ljava/lang/String;[SBI)V", line = 43)
    public static final void method597(int arg0, String[] arg1, short[] arg2, byte arg3, int arg4) {
        if (arg3 >= -22) {
            return;
        }
        field1022++;
        if (arg0 >= arg4) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg0;
        String var7 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var7;
        short var8 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var8;
        for (int var9 = arg0; var9 < arg4; var9++) {
            if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg1[arg4] = arg1[var6];
        arg1[var6] = var7;
        arg2[arg4] = arg2[var6];
        arg2[var6] = var8;
        method597(arg0, arg1, arg2, (byte) -73, var6 - 1);
        method597(var6 + 1, arg1, arg2, (byte) -119, arg4);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)Z", line = 99)
    public static final boolean method598(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            field1023 = 121;
        }
        field1016++;
        return class375.method2190((byte) 84, arg1, arg0) || class279.method1743(8, arg1, arg0);
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(BIIIII)V", line = 125)
    public class78(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1019 = arg1;
        this.field1020 = arg5;
        this.field1013 = arg4;
        this.field1026 = arg3;
        this.field1021 = arg2;
        this.field1015 = arg0;
    }
}
