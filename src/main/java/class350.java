import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class350 {

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Lfc;")
    private class174 field5030 = new class174(64);

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Loi;")
    private class53 field5032;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Ltn;")
    public static class60 field5028 = new class60(9, 7);

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Leh;")
    public static class246 field5033 = new class246(90, 3);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V", line = 4)
    public final void method2066(int arg0, int arg1) {
        class174 var3 = this.field5030;
        synchronized (this.field5030) {
            this.field5030.method1087(1, arg1);
        }
        field5034++;
        int var4 = -91 / ((arg0 - 17) / 60);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 17)
    public static final void method2067(int arg0) {
        field5029++;
        if (arg0 != -61) {
            field5028 = null;
        }
        class174 var1 = class513.field7581;
        synchronized (class513.field7581) {
            class513.field7581.method1096((byte) 108);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 31)
    public static void method2068(int arg0) {
        field5028 = null;
        field5033 = null;
        if (arg0 != 22547) {
            field5035 = -89;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Lmr;", line = 43)
    public final class98 method2069(byte arg0, int arg1) {
        field5031++;
        class174 var3 = this.field5030;
        class98 var4;
        synchronized (this.field5030) {
            var4 = (class98) this.field5030.method1088((long) arg1, (byte) 41);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field5032;
        byte[] var6;
        synchronized (this.field5032) {
            var6 = this.field5032.method426(32, (byte) 9, arg1);
        }
        class98 var7 = new class98();
        if (arg0 != -9) {
            this.method2069((byte) -11, 90);
        }
        if (var6 != null) {
            var7.method694(-122, new class403(var6));
        }
        class174 var8 = this.field5030;
        synchronized (this.field5030) {
            this.field5030.method1097(19627, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V", line = 76)
    public final void method2070(int arg0) {
        class174 var2 = this.field5030;
        synchronized (this.field5030) {
            this.field5030.method1095(0);
            int var3 = 19 / ((arg0 + 63) / 36);
        }
        field5025++;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V", line = 95)
    public final void method2071(int arg0) {
        field5026++;
        class174 var2 = this.field5030;
        synchronized (this.field5030) {
            this.field5030.method1096((byte) -91);
        }
        if (arg0 != -13022) {
            field5028 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lle;ILoi;)V", line = 137)
    public class350(class205 arg0, int arg1, class53 arg2) {
        this.field5032 = arg2;
        this.field5032.method435(32, 0);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)Z", line = 119)
    public static final boolean method2072(int arg0, byte arg1) {
        if (arg1 < 74) {
            method2067(-61);
        }
        field5027++;
        if (arg0 == 45 || arg0 == 60 || arg0 == 4 || arg0 == 18 || arg0 == 1001) {
            return true;
        } else {
            return arg0 == 8 || arg0 == 1002;
        }
    }
}
