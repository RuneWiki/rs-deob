import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class506 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lfr;")
    private class231 field7362 = new class231(64);

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lqs;")
    private class496 field7368;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[B")
    public static byte[] field7364 = new byte[2048];

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lap;")
    public static class340 field7365 = new class340(5000);

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lfr;")
    public static class231 field7372 = new class231(64);

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field7374;

    static {
        new class306("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field7373 = 16777215;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Llu;", line = 14)
    public static final class35 method2976(byte arg0) {
        field7371++;
        try {
            return new class425();
        } catch (Throwable var2) {
            if (arg0 != -26) {
                field7372 = null;
            }
            try {
                return (class35) Class.forName("gj").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class522();
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 37)
    public final void method2977(int arg0) {
        class231 var2 = this.field7362;
        synchronized (this.field7362) {
            this.field7362.method1604(arg0 + 11696);
        }
        if (arg0 != -11692) {
            field7364 = null;
        }
        field7366++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)V", line = 53)
    public final void method2978(int arg0, boolean arg1) {
        field7369++;
        if (!arg1) {
            method2976((byte) 100);
        }
        class231 var3 = this.field7362;
        synchronized (this.field7362) {
            this.field7362.method1603((byte) -101, arg0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 66)
    public static void method2979(boolean arg0) {
        field7372 = null;
        field7364 = null;
        field7365 = null;
        if (arg0) {
            field7364 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V", line = 78)
    public final void method2980(byte arg0) {
        field7363++;
        if (arg0 < -127) {
            class231 var2 = this.field7362;
            synchronized (this.field7362) {
                this.field7362.method1598(88);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lwv;ILqs;)V", line = 135)
    public class506(class535 arg0, int arg1, class496 arg2) {
        this.field7368 = arg2;
        if (this.field7368 != null) {
            this.field7368.method2940(35, -10511);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Lcu;", line = 97)
    public final class204 method2981(byte arg0, int arg1) {
        field7367++;
        class231 var3 = this.field7362;
        class204 var4;
        synchronized (this.field7362) {
            var4 = (class204) this.field7362.method1593((byte) -74, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field7368;
        byte[] var6;
        synchronized (this.field7368) {
            var6 = this.field7368.method2926(arg1, -82, 35);
        }
        class204 var7 = new class204();
        if (var6 != null) {
            var7.method1339(new class23(var6), 20241);
        }
        var7.method1344(-30712);
        class231 var8 = this.field7362;
        synchronized (this.field7362) {
            this.field7362.method1595(var7, (long) arg1, (byte) -95);
            if (arg0 < 35) {
                this.method2977(114);
            }
            return var7;
        }
    }
}
