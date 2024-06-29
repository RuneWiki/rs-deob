import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class250 {

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lhu;")
    private class76 field3332 = new class76(64);

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Lhu;")
    public class76 field3337 = new class76(30);

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lr;")
    private class110 field3328;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lr;")
    public class110 field3326;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "[I")
    public static int[] field3334;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lmc;")
    public static class78 field3336;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public int field3338;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Las;")
    public static class95 field3335;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lhf;")
    public final class248 method1394(int arg0, int arg1) {
        field3331++;
        class76 var3 = this.field3332;
        class248 var5;
        synchronized (this.field3332) {
            if (arg1 != -7290) {
                return null;
            }
            var5 = (class248) this.field3332.method493((byte) 19, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field3328.method702((byte) -124, class346.method2137((byte) 118, arg0), class35.method265(arg1 + 271305442, arg0));
        class248 var7 = new class248();
        var7.field3302 = this;
        var7.field3318 = arg0;
        if (var6 != null) {
            var7.method1389((byte) -56, new class32(var6));
        }
        class76 var8 = this.field3332;
        synchronized (this.field3332) {
            this.field3332.method505((long) arg0, var7, 122);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public final void method1395(int arg0) {
        class76 var2 = this.field3332;
        synchronized (this.field3332) {
            this.field3332.method502(0);
        }
        field3329++;
        class76 var3 = this.field3337;
        synchronized (this.field3337) {
            this.field3337.method502(0);
        }
        int var4 = 108 / ((12 - arg0) / 48);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method1396(byte arg0) {
        field3336 = null;
        field3335 = null;
        field3334 = null;
        if (arg0 != 64) {
            method1400(110, 114, -70);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public final void method1397(boolean arg0) {
        field3330++;
        class76 var2 = this.field3332;
        synchronized (this.field3332) {
            this.field3332.method495(-69);
        }
        class76 var3 = this.field3337;
        synchronized (this.field3337) {
            this.field3337.method495(-76);
        }
        if (arg0) {
            this.field3337 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V")
    public final void method1398(int arg0, int arg1) {
        field3333++;
        if (arg0 != 31) {
            method1400(-73, -4, 26);
        }
        class76 var3 = this.field3332;
        synchronized (this.field3332) {
            this.field3332.method496(arg1, -32);
        }
        class76 var4 = this.field3337;
        synchronized (this.field3337) {
            this.field3337.method496(arg1, -57);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)V")
    public final void method1399(int arg0, int arg1) {
        field3327++;
        this.field3338 = arg1;
        if (arg0 == 1) {
            class76 var3 = this.field3337;
            synchronized (this.field3337) {
                this.field3337.method495(arg0 - 111);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Lgg;")
    public static final class106 method1400(int arg0, int arg1, int arg2) {
        field3325++;
        class106 var3 = (class106) class63.field845.method1528((long) arg2 | (long) arg0 << 32, 116);
        int var4 = 80 % ((arg1 - 52) / 35);
        if (var3 == null) {
            var3 = new class106(arg0, arg2);
            class63.field845.method1525((byte) 19, var3, var3.field6047);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Ldn;ILr;Lr;)V")
    public class250(class329 arg0, int arg1, class110 arg2, class110 arg3) {
        this.field3328 = arg2;
        this.field3326 = arg3;
        int var5 = this.field3328.method705((byte) -127) - 1;
        this.field3328.method694(var5, (byte) 119);
    }

    static {
        new class206((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field3334 = new int[14];
        field3336 = new class78(31, 3);
        new class206("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }
}
