import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class311 {

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "Lui;")
    private class588 field3977 = new class588();

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "Lbda;")
    public static class401 field3974 = new class401("WTWIP", 3);

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "Lui;")
    private class588 field3984;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "[I")
    public static int[] field3982;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1871(byte arg0, String arg1, String arg2, String arg3) {
        field3986++;
        if (arg0 < 11) {
            method1879(111);
        }
        for (int var4 = arg2.indexOf(arg1); var4 != -1; var4 = arg2.indexOf(arg1, arg3.length() + var4)) {
            arg2 = arg2.substring(0, var4) + arg3 + arg2.substring(var4 + arg1.length());
        }
        return arg2;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1872(int arg0, String arg1) {
        if (class14.field143 == null) {
            class126.method679(19454);
        }
        field3979++;
        if (arg0 != -4408) {
            method1871((byte) -98, null, null, null);
        }
        String[] var2 = class455.method2637('\n', (byte) 99, arg1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class82.field1115; var4 > 0; var4--) {
                class14.field143[var4] = class14.field143[var4 - 1];
            }
            class14.field143[0] = var2[var3];
            if (class82.field1115 < (class14.field143.length - 1)) {
                class82.field1115++;
                if (class486.field6792 > 0) {
                    class486.field6792++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lui;Z)V")
    public final void method1873(class588 arg0, boolean arg1) {
        if (!arg1) {
            method1879(91);
        }
        if (arg0.field8515 != null) {
            arg0.method3394(false);
        }
        field3978++;
        arg0.field8515 = this.field3977.field8515;
        arg0.field8514 = this.field3977;
        arg0.field8515.field8514 = arg0;
        arg0.field8514.field8515 = arg0;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
    public final void method1874(int arg0) {
        if (arg0 != -24444) {
            field3974 = null;
        }
        while (true) {
            class588 var2 = this.field3977.field8514;
            if (this.field3977 == var2) {
                field3980++;
                this.field3984 = null;
                return;
            }
            var2.method3394(false);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)Lui;")
    public final class588 method1875(byte arg0) {
        if (arg0 != -15) {
            method1879(-58);
        }
        field3983++;
        class588 var2 = this.field3977.field8515;
        if (this.field3977 == var2) {
            this.field3984 = null;
            return null;
        } else {
            this.field3984 = var2.field8515;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)Lui;")
    public final class588 method1876(byte arg0) {
        field3973++;
        int var2 = -50 / ((arg0 - 13) / 56);
        class588 var3 = this.field3977.field8514;
        if (this.field3977 == var3) {
            this.field3984 = null;
            return null;
        } else {
            this.field3984 = var3.field8514;
            return var3;
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)Lui;")
    public final class588 method1877(int arg0) {
        field3981++;
        class588 var2 = this.field3984;
        if (this.field3977 == var2) {
            this.field3984 = null;
            return null;
        } else if (arg0 == 0) {
            this.field3984 = var2.field8514;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)I")
    public final int method1878(byte arg0) {
        field3985++;
        int var2 = 0;
        for (class588 var3 = this.field3977.field8514; var3 != this.field3977; var3 = var3.field8514) {
            var2++;
        }
        return arg0 == 45 ? var2 : -38;
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
    public static void method1879(int arg0) {
        field3982 = null;
        field3974 = null;
        if (arg0 != -26810) {
            method1879(95);
        }
    }

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "(I)Lui;")
    public final class588 method1880(int arg0) {
        field3975++;
        if (arg0 < 78) {
            method1871((byte) -44, null, null, null);
        }
        class588 var2 = this.field3977.field8514;
        if (this.field3977 == var2) {
            return null;
        } else {
            var2.method3394(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "()V")
    public class311() {
        this.field3977.field8515 = this.field3977;
        this.field3977.field8514 = this.field3977;
    }

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "(I)Z")
    public final boolean method1881(int arg0) {
        if (arg0 != 0) {
            this.field3984 = null;
        }
        field3976++;
        return this.field3977.field8514 == this.field3977;
    }

    static {
        new class344("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}
