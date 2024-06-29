import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class614 {

    @OriginalMember(owner = "client!cia", name = "e", descriptor = "I")
    public int field8600;

    @OriginalMember(owner = "client!cia", name = "c", descriptor = "I")
    public int field8598;

    @OriginalMember(owner = "client!cia", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field8609 = new String[5];

    @OriginalMember(owner = "client!cia", name = "p", descriptor = "I")
    public static int field8611 = 0;

    @OriginalMember(owner = "client!cia", name = "k", descriptor = "Lfha;")
    public static class382 field8606 = new class382(7, 19);

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!cia", name = "f", descriptor = "I")
    public int field8601;

    @OriginalMember(owner = "client!cia", name = "g", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!cia", name = "h", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!cia", name = "i", descriptor = "I")
    public int field8604;

    @OriginalMember(owner = "client!cia", name = "j", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!cia", name = "o", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!cia", name = "q", descriptor = "I")
    public int field8612;

    @OriginalMember(owner = "client!cia", name = "m", descriptor = "Lhba;")
    public class10 field8608;

    @OriginalMember(owner = "client!cia", name = "d", descriptor = "Lcia;")
    public class614 field8599;

    @OriginalMember(owner = "client!cia", name = "l", descriptor = "[I")
    public static int[] field8607;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)Lega;")
    public final class711 method3454(byte arg0) {
        if (arg0 < 89) {
            return null;
        } else {
            field8597++;
            return class245.method1474(this.field8600, 31866);
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)I")
    public static final int method3455(int arg0) {
        if (arg0 != 2) {
            method3457(-6);
        }
        field8603++;
        return class427.field6031 == null ? 0 : class427.field6031.length * 2;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lbd;I)V")
    public static final void method3456(class62 arg0, int arg1) {
        int var2 = 120 / ((-arg1 - 58) / 59);
        arg0.field682 = null;
        field8602++;
        int var3 = arg0.field678.length;
        for (int var4 = 0; var4 < var3; var4++) {
            arg0.field678[var4].field6676 = false;
        }
        class29[] var5 = class8.field52;
        synchronized (class8.field52) {
            if (class8.field52.length > var3 && class669.field9308[var3] < 200) {
                class8.field52[var3].method118(true, arg0);
                int var10002 = class669.field9308[var3]++;
            }
        }
    }

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)V")
    public static void method3457(int arg0) {
        if (arg0 > -103) {
            field8609 = null;
        }
        field8606 = null;
        field8607 = null;
        field8609 = null;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(JJ)J")
    public static long method3458(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(II)Lcia;")
    public final class614 method3459(int arg0, int arg1) {
        field8605++;
        if (arg0 != -1854) {
            this.method3454((byte) -2);
        }
        return new class614(this.field8600, arg1);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3460(int arg0, String arg1) {
        field8610++;
        if (!class583.field8162.field10290) {
            return -1;
        } else if (class6.field45.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class566.method3186(79, arg1);
            if (var2 == null) {
                return -1;
            }
            String var3 = class538.field7305 + var2;
            if (!class598.field8331.method2877(true, "", var3)) {
                return -1;
            } else if (class598.field8331.method2881(var3, 0)) {
                if (arg0 > -28) {
                    field8607 = null;
                }
                byte[] var4 = class598.field8331.method2879(var3, "", -32734);
                Object var5 = null;
                File var6;
                try {
                    var6 = class597.method3304(var2, -127);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class447.method2513(-67, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class583.field8162.method4144(var4, true, var6);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class120.method781(var6, arg1, -320);
                return 100;
            } else {
                return class598.field8331.method2888(29952, var3);
            }
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method3461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field8596++;
        int var7 = arg1 & 0x3;
        if (arg6 != -23) {
            return 76;
        }
        if ((arg2 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 1 + 7 - arg5 - arg3;
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(II)V")
    public class614(int arg0, int arg1) {
        this.field8600 = arg0;
        this.field8598 = arg1;
    }
}
