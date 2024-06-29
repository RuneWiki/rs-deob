import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class89 {

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "Llh;")
    private class364 field1491 = new class364(64);

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "Lhh;")
    private class84 field1490;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "Lgf;")
    public static class180 field1487 = new class180("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "Lao;")
    public static class188 field1494 = new class188(58, 6);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Lmd;")
    public static class379 field1495;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB)V", line = 4)
    public final void method726(int arg0, byte arg1) {
        if (arg1 != -101) {
            field1487 = null;
        }
        class364 var3 = this.field1491;
        synchronized (this.field1491) {
            this.field1491.method2348(arg0, 5);
        }
        field1492++;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 17)
    public static void method727(int arg0) {
        field1487 = null;
        if (arg0 != 64) {
            field1487 = null;
        }
        field1495 = null;
        field1494 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Lun;", line = 35)
    public final class290 method728(int arg0, int arg1) {
        field1486++;
        class364 var3 = this.field1491;
        class290 var4;
        synchronized (this.field1491) {
            var4 = (class290) this.field1491.method2339(-67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 58) {
            this.method730((byte) 20);
        }
        byte[] var5 = this.field1490.method683(16, arg0, 5);
        class290 var6 = new class290();
        if (var5 != null) {
            var6.method1803((byte) -32, new class303(var5));
        }
        class364 var7 = this.field1491;
        synchronized (this.field1491) {
            this.field1491.method2342((long) arg0, var6, 120);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V", line = 66)
    public final void method729(int arg0) {
        field1488++;
        class364 var2 = this.field1491;
        synchronized (this.field1491) {
            this.field1491.method2350((byte) 112);
            int var3 = 53 % ((arg0 - 2) / 46);
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lmt;ILhh;)V", line = 97)
    public class89(class271 arg0, int arg1, class84 arg2) {
        this.field1490 = arg2;
        if (this.field1490 == null) {
            this.field1489 = 0;
        } else {
            this.field1489 = this.field1490.method656((byte) 122, 16);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V", line = 85)
    public final void method730(byte arg0) {
        if (arg0 >= 0) {
            return;
        }
        class364 var2 = this.field1491;
        synchronized (this.field1491) {
            this.field1491.method2349(0);
        }
        field1493++;
    }
}
