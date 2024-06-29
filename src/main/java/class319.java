import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class319 {

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "Ldc;")
    private class5 field4682 = new class5(256);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "Lps;")
    private class59 field4679;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "Lrl;")
    private class487 field4689;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "Lts;")
    public static class356 field4688 = null;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "Lwt;")
    public static class194 field4685 = new class194("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "Liu;")
    public static class390 field4691 = new class390(106, -2);

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
    public static int field4692 = 0;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "Lqg;")
    public static class307 field4687;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public static void method1919(int arg0) {
        if (arg0 != -8077) {
            method1919(-112);
        }
        field4685 = null;
        field4688 = null;
        field4691 = null;
        field4687 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILhe;I)Lfl;")
    public static final class499 method1920(int arg0, int arg1, class239 arg2, int arg3) {
        if (arg1 != 3424) {
            field4687 = null;
        }
        field4690++;
        byte[] var4 = arg2.method1470(4, arg3, arg0);
        return var4 == null ? null : new class499(var4);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
    public static final void method1921(int arg0, int arg1) {
        field4680++;
        if (class323.field4729 == arg1) {
            return;
        }
        if (class323.field4729 == 0) {
            class334.method2016(arg0 ^ 0x3C97);
        }
        if (arg1 == 40) {
            class435.method2566(true);
        }
        if (arg1 != 40 && class452.field6576 != null) {
            class452.field6576.method2123(124);
            class452.field6576 = null;
        }
        if (class323.field4729 == 25 || class323.field4729 == 28) {
            class235.field3308.field3355 = 2;
            class70.field1035.field3355 = 2;
            class211.field2979.field3355 = 2;
            class192.field2719.field3355 = 2;
            class8.field136.field3355 = 2;
            class69.field1020.field3355 = 2;
            class3.field47.field3355 = 2;
        }
        if (arg1 == 25 || arg1 == 28) {
            class120.field1567 = 0;
            class374.field5601 = 1;
            class507.field7740 = 0;
            class376.field5625 = 0;
            class411.field6031 = 1;
            class265.method1630(true, -30);
            class235.field3308.field3355 = 1;
            class70.field1035.field3355 = 1;
            class211.field2979.field3355 = 1;
            class192.field2719.field3355 = 1;
            class8.field136.field3355 = 1;
            class69.field1020.field3355 = 1;
            class3.field47.field3355 = 1;
        }
        if (arg1 == 25 || arg1 == 10) {
            class347.method2088(75);
        }
        if (arg1 == 5) {
            class465.method2726(class445.field6482, arg0 - 15614, class481.field6937);
        } else {
            class136.method861((byte) -105);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        boolean var3 = class323.field4729 == 5 || class323.field4729 == 10 || class323.field4729 == 28;
        if (arg0 != 15508) {
            return;
        }
        if (var2 != var3) {
            if (var2) {
                class153.field1966 = class105.field1412;
                if (class118.field1533.field6899 == 0) {
                    class371.method2257(2, 107);
                } else {
                    class54.method414(2, 0, class389.field5781, class118.field1533.field6899, false, 127, class105.field1412);
                }
                class90.field1238.method2653(false, (byte) -93);
            } else {
                class371.method2257(2, 123);
                class90.field1238.method2653(true, (byte) -119);
            }
        }
        if (arg1 == 25 || arg1 == 28 || arg1 == 40) {
            class481.field6937.method832();
        }
        class323.field4729 = arg1;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)Lud;")
    public final class26 method1922(int arg0, boolean arg1) {
        field4686++;
        Object var3 = this.field4682.method40(0, (long) arg0);
        if (var3 != null) {
            return (class26) var3;
        } else if (this.field4679.method428(-14471, arg0)) {
            class118 var4 = this.field4679.method432(arg0, arg1);
            int var5 = var4.field1524 ? 64 : this.field4689.field7310;
            class26 var7;
            if (var4.field1536 && this.field4689.method822()) {
                float[] var6 = this.field4679.method431(arg0, false, var5, 0.7F, 106, var5);
                var7 = new class26(this.field4689, 3553, 34842, var5, var5, var4.field1537 != 0, var6, 6408);
            } else {
                int[] var8;
                short var9;
                if (var4.field1523 && class178.method1134(var4.field1540, -8)) {
                    var8 = this.field4679.method429(arg0, var5, false, 0.7F, -2472, var5);
                    var9 = 6407;
                } else {
                    var9 = 6408;
                    var8 = this.field4679.method430(0.7F, var5, false, var5, (byte) -21, arg0);
                }
                var7 = new class26(this.field4689, 3553, var9, var5, var5, var4.field1537 != 0, var8, false);
            }
            var7.method228(var4.field1539, var4.field1529, 0);
            this.field4682.method36(-20960, var7, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
    public final void method1923(int arg0) {
        if (arg0 != 0) {
            method1920(98, -48, null, 82);
        }
        this.field4682.method38((byte) -70);
        field4681++;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZIIIIIII)V")
    public static final void method1924(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4684++;
        class335.method2024(arg3, arg5, arg8, arg6, arg0, 0, 1, arg4, arg2, arg7);
        if (arg1) {
            field4692 = -50;
        }
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(I)V")
    public final void method1925(int arg0) {
        if (arg0 == 2) {
            this.field4682.method39(false, 5);
            field4683++;
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lrl;Lps;)V")
    public class319(class487 arg0, class59 arg1) {
        this.field4679 = arg1;
        this.field4689 = arg0;
    }
}
