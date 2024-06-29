import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class81 {

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "Lsw;")
    private class641 field974 = new class641(64);

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public int field978 = 0;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "Ldn;")
    private class438 field976;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "Z")
    public static boolean field968 = false;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "Lvj;")
    public static class373 field973;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public static int field975;

    static {
        new class180("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field973 = new class373(57, 0);
        field977 = 0;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method471(int arg0, int arg1) {
        field965++;
        if (arg1 > -52) {
            method479(null, 58);
        }
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V", line = 18)
    public static void method472(int arg0) {
        if (arg0 >= -34) {
            field973 = null;
        }
        field973 = null;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V", line = 29)
    public static final void method473(int arg0) {
        if (class210.field2560.method1194()) {
            class210.field2560.method1149(class41.field331);
            class469.method2733(-9153);
            class210.field2560.method1187(class41.field331);
            class210.field2560.method274(class41.field331);
        } else {
            class24.method144(-2, class529.field7429);
        }
        if (arg0 != 20860) {
            method476(false, 73, null, null);
        }
        field967++;
        class562.method3279((byte) -108);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V", line = 53)
    public final void method474(byte arg0) {
        field971++;
        class641 var2 = this.field974;
        synchronized (this.field974) {
            this.field974.method3694(0);
        }
        int var3 = -74 / ((arg0 + 45) / 61);
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(II)V", line = 70)
    public final void method475(int arg0, int arg1) {
        class641 var3 = this.field974;
        synchronized (this.field974) {
            this.field974.method3686((byte) 53, arg0);
        }
        field970++;
        if (arg1 != -4) {
            this.field969 = 77;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V", line = 88)
    public static final void method476(boolean arg0, int arg1, String arg2, String arg3) {
        class543.field7955 = arg0;
        class249.field3184 = arg2;
        class571.field8376 = arg3;
        int var4 = 117 / ((-arg1 - 63) / 56);
        field972++;
        if (!class543.field7955 && class91.field1121 != 3 && class249.field3184.equals("") || class571.field8376.equals("")) {
            class19.method130((byte) 100, 3);
            return;
        }
        class103.field1264 = false;
        if (class91.field1121 != 1) {
            class164.field2008 = -1;
            class64.field635 = 0;
        }
        class19.method130((byte) 97, -3);
        class583.field8482 = 0;
        class197.field2381 = 1;
        class15.field119 = 0;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)Lvn;", line = 120)
    public final class259 method477(int arg0, byte arg1) {
        field964++;
        class641 var3 = this.field974;
        class259 var4;
        synchronized (this.field974) {
            var4 = (class259) this.field974.method3682(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field976;
        byte[] var7;
        synchronized (this.field976) {
            int var6 = 20 / ((-arg1 - 45) / 61);
            var7 = this.field976.method2558(100, arg0, 4);
        }
        class259 var8 = new class259();
        var8.field3341 = this;
        var8.field3346 = arg0;
        if (var7 != null) {
            var8.method1452(-1, new class374(var7));
        }
        var8.method1454(-1226);
        class641 var9 = this.field974;
        synchronized (this.field974) {
            this.field974.method3684(var8, 0, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V", line = 152)
    public final void method478(int arg0) {
        field966++;
        class641 var2 = this.field974;
        synchronized (this.field974) {
            this.field974.method3687(1402);
        }
        if (arg0 > -121) {
            this.method474((byte) -99);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/io/File;I)[B", line = 171)
    public static final byte[] method479(File arg0, int arg1) {
        field975++;
        if (arg1 != 4) {
            field977 = 115;
        }
        return client.method1398(true, (int) arg0.length(), arg0);
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lre;ILdn;)V", line = 194)
    public class81(class515 arg0, int arg1, class438 arg2) {
        this.field976 = arg2;
        this.field969 = this.field976.method2554(4, 127);
    }
}
