import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class437 {

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public int field6435;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field6429 = 0;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Z")
    public static boolean field6428 = false;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
    public static final void method2680(boolean arg0) {
        class241 var1 = class306.field4617;
        synchronized (class306.field4617) {
            class306.field4617.method1482((byte) 115);
        }
        field6424++;
        if (!arg0) {
            field6428 = false;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static final String method2681(boolean arg0, long arg1) {
        field6434++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            if (!arg0) {
                method2686(101, 12, -20, 115);
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class411.field6124[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lfh;I)V")
    public static final void method2682(class170 arg0, int arg1) {
        if (arg1 <= 109) {
            field6428 = false;
        }
        if (arg0.field2558 == 5 && arg0.field2592 != -1) {
            class377.method2270(arg0, 0, class196.field2965);
        }
        field6426++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)V")
    public static final void method2683(int arg0, byte arg1) {
        field6432++;
        class19.field262 = arg0;
        class241 var2 = class136.field1828;
        synchronized (class136.field1828) {
            int var3 = -70 / ((28 - arg1) / 60);
            class136.field1828.method1485(-22032);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static final void method2684(byte arg0) {
        field6427++;
        class251.field3762.method1485(-22032);
        class446.field6580.method1485(-22032);
        if (arg0 != -93) {
            method2685(17, 51);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
    public static final void method2685(int arg0, int arg1) {
        field6433++;
        class318.field4811 = -1;
        if (arg0 >= -85) {
            method2681(true, -118L);
        }
        class217.field3305 = arg1;
        class318.field4811 = -1;
        class353.method2116(false);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)I")
    public static final int method2686(int arg0, int arg1, int arg2, int arg3) {
        field6431++;
        if (class307.field4638 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > class115.field1522 - 1 || var5 > (class198.field3004 - 1)) {
            return 0;
        } else if (arg1 == 0) {
            int var6 = arg0;
            if (arg0 < 3 && (class341.field5085[1][var4][var5] & 0x2) != 0) {
                var6 = arg0 + 1;
            }
            return class307.field4638[var6].method100(arg3, arg2);
        } else {
            return -43;
        }
    }

    @OriginalMember(owner = "client!fj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6430++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(II)V")
    public class437(int arg0, int arg1) {
        this.field6435 = arg0;
    }

    static {
        new class151("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
    }
}
