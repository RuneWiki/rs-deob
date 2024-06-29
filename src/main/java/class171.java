import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class171 {

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Lfa;")
    private class156 field2430 = new class156(64);

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Lfa;")
    public class156 field2438 = new class156(50);

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "Lfa;")
    public class156 field2440 = new class156(5);

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Z")
    public boolean field2433;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "Lfs;")
    private class387 field2432;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "Lfs;")
    public class387 field2436;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "Lbf;")
    public static class372 field2437;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Lrl;")
    public static class506 field2434;

    static {
        new class331("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field2437 = new class372(9, 2);
        field2439 = 0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 5)
    public final void method1207(byte arg0) {
        class156 var2 = this.field2430;
        synchronized (this.field2430) {
            this.field2430.method1119(91);
        }
        if (arg0 < 62) {
            field2437 = null;
        }
        field2431++;
        class156 var3 = this.field2438;
        synchronized (this.field2438) {
            this.field2438.method1119(110);
        }
        class156 var4 = this.field2440;
        synchronized (this.field2440) {
            this.field2440.method1119(125);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBI)Lhp;", line = 25)
    public static final class215 method1208(int arg0, byte arg1, int arg2) {
        if (arg1 <= 115) {
            return null;
        }
        field2423++;
        class215 var3 = (class215) class307.field4351.method875((long) arg2 << 32 | (long) arg0, 124);
        if (var3 == null) {
            var3 = new class215(arg2, arg0);
            class307.field4351.method878(var3.field3271, -2301, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 47)
    public final void method1209(int arg0) {
        field2425++;
        class156 var2 = this.field2438;
        synchronized (this.field2438) {
            this.field2438.method1105(false);
        }
        if (arg0 != 3) {
            method1217(true, -120);
        }
        class156 var3 = this.field2440;
        synchronized (this.field2440) {
            this.field2440.method1105(false);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V", line = 64)
    public static final void method1210(int arg0, int arg1) {
        class148 var2 = class422.field6240[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class148 var4 = class422.field6240[var3][arg0][arg1] = class422.field6240[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2101--;
                for (class480 var5 = var4.field2086; var5 != null; var5 = var5.field7058) {
                    class431 var6 = var5.field7054;
                    if (var6.field6332 == arg0 && var6.field6339 == arg1) {
                        var6.field6328--;
                    }
                }
            }
        }
        if (class422.field6240[0][arg0][arg1] == null) {
            class422.field6240[0][arg0][arg1] = new class148(0, arg0, arg1);
            class422.field6240[0][arg0][arg1].field2100 = 1;
        }
        class422.field6240[0][arg0][arg1].field2091 = var2;
        class422.field6240[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)V", line = 106)
    public final void method1211(int arg0, int arg1) {
        field2435++;
        this.field2441 = arg0;
        class156 var3 = this.field2438;
        synchronized (this.field2438) {
            if (arg1 != 1) {
                this.method1207((byte) 46);
            }
            this.field2438.method1105(false);
        }
        class156 var4 = this.field2440;
        synchronized (this.field2440) {
            this.field2440.method1105(false);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V", line = 124)
    public final void method1212(boolean arg0) {
        field2429++;
        class156 var2 = this.field2430;
        synchronized (this.field2430) {
            this.field2430.method1105(false);
        }
        class156 var3 = this.field2438;
        synchronized (this.field2438) {
            this.field2438.method1105(arg0);
        }
        class156 var4 = this.field2440;
        synchronized (this.field2440) {
            this.field2440.method1105(false);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 140)
    public static void method1213(int arg0) {
        field2434 = null;
        if (arg0 > -114) {
            method1217(false, -27);
        }
        field2437 = null;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(II)V", line = 153)
    public static final void method1214(int arg0, int arg1) {
        class263 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class142 var4 = class283.field4115[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class497.field7388; var5++) {
                    for (int var6 = 0; var6 < class241.field3562; var6++) {
                        var2 = var4.method431(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class527.field7754;
                            int var8 = var5 << class527.field7754;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class142 var10 = class283.field4115[var9];
                                if (var10 != null) {
                                    int var11 = var4.method430(var6, var5) - var10.method430(var6, var5);
                                    int var12 = var4.method430(var6 + 1, var5) - var10.method430(var6 + 1, var5);
                                    int var13 = var4.method430(var6 + 1, var5 + 1) - var10.method430(var6 + 1, var5 + 1);
                                    int var14 = var4.method430(var6, var5 + 1) - var10.method430(var6, var5 + 1);
                                    var10.method415(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(II)Lwh;", line = 217)
    public final class100 method1215(int arg0, int arg1) {
        field2428++;
        class156 var3 = this.field2430;
        class100 var4;
        synchronized (this.field2430) {
            var4 = (class100) this.field2430.method1115((long) arg0, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2432.method2363(class345.method2088((byte) -86, arg0), class72.method683(arg0, (byte) -12), 107);
        class100 var6 = new class100();
        var6.field1357 = arg0;
        var6.field1413 = this;
        if (var5 != null) {
            var6.method855(0, new class65(var5));
        }
        var6.method850(false);
        class156 var7 = this.field2430;
        synchronized (this.field2430) {
            this.field2430.method1107(arg1, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V", line = 245)
    public final void method1216(boolean arg0, int arg1) {
        field2424++;
        if (arg1 >= 26 && arg0 != this.field2433) {
            this.field2433 = arg0;
            this.method1212(false);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(ZI)V", line = 260)
    public static final void method1217(boolean arg0, int arg1) {
        class509.field7504 = 3;
        field2426++;
        class496.field7277 = arg1;
        class392.field5773 = -1;
        if (arg0) {
            method1213(-45);
        }
        class417.field6164 = 100;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)V", line = 278)
    public final void method1218(byte arg0, int arg1) {
        field2427++;
        class156 var3 = this.field2430;
        synchronized (this.field2430) {
            if (arg0 != -127) {
                this.method1211(-54, -85);
            }
            this.field2430.method1116(arg1, -50);
        }
        class156 var4 = this.field2438;
        synchronized (this.field2438) {
            this.field2438.method1116(arg1, -50);
        }
        class156 var5 = this.field2440;
        synchronized (this.field2440) {
            this.field2440.method1116(arg1, -50);
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Ljk;IZLfs;Lfs;)V", line = 324)
    public class171(class446 arg0, int arg1, boolean arg2, class387 arg3, class387 arg4) {
        this.field2433 = arg2;
        this.field2432 = arg3;
        this.field2436 = arg4;
        if (this.field2432 != null) {
            int var6 = this.field2432.method2359((byte) 39) - 1;
            this.field2432.method2367(var6, 28724);
        }
    }
}
