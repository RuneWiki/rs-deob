import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class94 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lrd;")
    public static class173 field1756 = class133.method843("; version=1; path=)4; domain=", -90);

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lrd;")
    public static class173 field1758 = class133.method843("sl_flags", 82);

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lrd;")
    public static class173 field1761 = class133.method843("Regeln versto-8en hat)3", 123);

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lrd;")
    public static class173 field1760 = class133.method843(":duelstake:", 83);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "[I")
    public static int[] field1755 = new int[1000];

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lrd;")
    public static class173 field1762 = class133.method843("::autoshadow on", 59);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B[B)V")
    public abstract void method590(byte arg0, byte[] arg1);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLrd;Lbc;Lrd;Lbc;)Lqc;")
    public static final class162 method591(byte arg0, class173 arg1, class14 arg2, class173 arg3, class14 arg4) {
        field1759++;
        int var5 = 109 % ((arg0 - 13) / 41);
        int var6 = arg4.method135(arg1, 126);
        int var7 = arg4.method117(arg3, (byte) -123, var6);
        return class168.method1085(var6, arg4, var7, (byte) -111, arg2);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public static void method592(boolean arg0) {
        field1756 = null;
        field1761 = null;
        field1760 = null;
        field1762 = null;
        field1755 = null;
        if (arg0) {
            method593(68, (byte) 5);
        }
        field1758 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)Led;")
    public static final class45 method593(int arg0, byte arg1) {
        class45 var2 = (class45) class139.field2592.method46((long) arg0, 26580);
        if (arg1 != -38) {
            field1758 = null;
        }
        field1757++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class46.field956.method142(class194.method1289(arg0, 125), class119.method725(arg0, 127), (byte) 2);
        class45 var4 = new class45();
        var4.field927 = arg0;
        if (var3 != null) {
            var4.method316(new class121(var3), 103);
        }
        var4.method319(65);
        class139.field2592.method52(-3583, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method594(boolean arg0);
}
