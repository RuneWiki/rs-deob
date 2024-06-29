import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class93 {

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Ler;")
    private class157 field1347 = new class157(64);

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lns;")
    private class438 field1351;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[I")
    public static int[] field1349 = new int[1000];

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[F")
    public static float[] field1355 = new float[4];

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field1352 = 0;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Lhh;")
    public static class125 field1353;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public final void method647(int arg0) {
        field1344++;
        class157 var2 = this.field1347;
        synchronized (this.field1347) {
            if (arg0 >= -70) {
                this.method649(15, -49);
            }
            this.field1347.method1015((byte) 91);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public static void method648(int arg0) {
        field1349 = null;
        field1355 = null;
        if (arg0 != 19334) {
            method648(30);
        }
        field1353 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Lgu;")
    public final class379 method649(int arg0, int arg1) {
        field1348++;
        class157 var3 = this.field1347;
        class379 var4;
        synchronized (this.field1347) {
            var4 = (class379) this.field1347.method1013((long) arg0, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != -12235) {
            method648(-5);
        }
        byte[] var5 = this.field1351.method2650(class275.method1748(arg0, arg1 ^ 0x2FB6), -103, class443.method2674(true, arg0));
        class379 var6 = new class379();
        if (var5 != null) {
            var6.method2351((byte) -98, new class91(var5));
        }
        class157 var7 = this.field1347;
        synchronized (this.field1347) {
            this.field1347.method1012(-75, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V")
    public final void method650(int arg0, int arg1) {
        field1345++;
        class157 var3 = this.field1347;
        synchronized (this.field1347) {
            if (arg1 == 0) {
                this.field1347.method1015((byte) 90);
                this.field1347 = new class157(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)V")
    public final void method651(int arg0, int arg1) {
        field1350++;
        class157 var3 = this.field1347;
        synchronized (this.field1347) {
            int var4 = 28 % ((56 - arg1) / 36);
            this.field1347.method1016(arg0, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILbp;)V")
    public static final void method652(int arg0, class322 arg1) {
        field1354++;
        class119 var2 = (class119) class266.field3707.method943((long) arg1.field5254, -1);
        if (var2 != null) {
            if (var2.field1681 != null) {
                class325.field4996.method1274(var2.field1681);
                var2.field1681 = null;
            }
            var2.method2785((byte) -120);
        }
        if (arg0 >= -88) {
            method648(-98);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public final void method653(boolean arg0) {
        class157 var2 = this.field1347;
        synchronized (this.field1347) {
            this.field1347.method1022((byte) -34);
            if (!arg0) {
                this.method647(-29);
            }
        }
        field1346++;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lgo;ILns;)V")
    public class93(class331 arg0, int arg1, class438 arg2) {
        this.field1351 = arg2;
        if (this.field1351 != null) {
            int var4 = this.field1351.method2649(111) - 1;
            this.field1351.method2645(1, var4);
        }
    }
}
