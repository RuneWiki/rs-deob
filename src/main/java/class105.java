import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class105 {

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lku;")
    private class232 field1338 = new class232(64);

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lb;")
    private class201 field1334;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[S")
    public static short[] field1332 = new short[256];

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method590(int arg0) {
        class125.field1637 = new class451(class125.field1635.method2065(86, class326.field4711), "", class360.field5183, 1011, -1, 0L, 0, arg0, true, false);
        field1340++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBI)V")
    private static final void method591(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -124) {
            field1339 = 122;
        }
        field1335++;
        class450 var4 = class286.field4169[arg1][arg3];
        class40.method259((byte) 46, arg0, var4 == null ? class266.field3894 : var4);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method592(String arg0, int arg1, String arg2, String arg3) {
        if (arg1 != 0) {
            return null;
        }
        field1333++;
        for (int var4 = arg0.indexOf(arg2); var4 != -1; var4 = arg0.indexOf(arg2, var4 + arg3.length())) {
            arg0 = arg0.substring(0, var4) + arg3 + arg0.substring(arg2.length() + var4);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static void method593(int arg0) {
        if (arg0 < -106) {
            field1332 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public static final void method594(int arg0) {
        field1336++;
        if (class363.field5227 == 10 || class363.field5227 == 28) {
            method591(5000, class490.field6904 >> 10, (byte) -124, class343.field4996 >> 10);
        } else {
            int var1 = class492.field6935.field2163[0] >> 3;
            int var2 = class492.field6935.field2159[0] >> 3;
            if (var1 >= 0 && var1 < (class58.field758 >> 3) && var2 >= 0 && (class287.field4181 >> 3) > var2) {
                method591(5000, var1, (byte) -124, var2);
            } else {
                method591(0, class58.field758 >> 4, (byte) -124, class287.field4181 >> 4);
            }
        }
        class364.method2250(1513438280);
        if (arg0 == 0) {
            class1.method6(17018);
            class153.method960(arg0 - 128);
            class325.method2059(arg0 ^ 0x56);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Lnf;")
    public final class374 method595(byte arg0, int arg1) {
        if (arg0 != 23) {
            this.method595((byte) -26, -21);
        }
        field1337++;
        class232 var3 = this.field1338;
        class374 var4;
        synchronized (this.field1338) {
            var4 = (class374) this.field1338.method1479(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1334.method1257(arg1, 5, 24558);
        class374 var6 = new class374();
        if (var5 != null) {
            var6.method2278(-116, new class276(var5));
        }
        class232 var7 = this.field1338;
        synchronized (this.field1338) {
            this.field1338.method1473(var6, (long) arg1, 125);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class105(class353 arg0, int arg1, class201 arg2) {
        this.field1334 = arg2;
        this.field1334.method1235(0, 5);
    }

    static {
        new class326("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field1339 = 0;
    }
}
