import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class65 {

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Laq;")
    private class494 field977 = new class494(64);

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Laq;")
    public class494 field983 = new class494(64);

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lgga;")
    public class513 field974;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lgga;")
    private class513 field976;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field979 = -1;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBI)V")
    public final void method649(int arg0, byte arg1, int arg2) {
        this.field977 = new class494(arg0);
        if (arg1 == 56) {
            field975++;
            this.field983 = new class494(arg2);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
    public final void method650(int arg0, int arg1) {
        field981++;
        class494 var3 = this.field977;
        synchronized (this.field977) {
            this.field977.method2888(arg0, arg1 ^ 0x5F);
        }
        class494 var4 = this.field983;
        synchronized (this.field983) {
            this.field983.method2888(arg0, 125);
        }
        if (arg1 != 34) {
            this.method655(true);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLol;)Lci;")
    public static final class720 method651(byte arg0, class431 arg1) {
        if (arg0 > -124) {
            method651((byte) 89, null);
        }
        field980++;
        return new class720(arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2528((byte) 89), arg1.method2515(55), arg1.method2557(14929));
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BIIB)[B")
    public static final byte[] method652(byte[] arg0, int arg1, int arg2, byte arg3) {
        field973++;
        byte[] var4;
        if (arg1 > 0) {
            var4 = new byte[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                var4[var5] = arg0[arg1 + var5];
            }
        } else {
            var4 = arg0;
        }
        class246 var6 = new class246();
        var6.method1632((byte) 22);
        var6.method1640((byte) -121, (long) (arg2 * 8), var4);
        if (arg3 != -60) {
            method652(null, -79, -6, (byte) 13);
        }
        byte[] var7 = new byte[64];
        var6.method1635((byte) -90, var7, 0);
        return var7;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public final void method653(int arg0) {
        field972++;
        class494 var2 = this.field977;
        synchronized (this.field977) {
            this.field977.method2893((byte) 111);
        }
        class494 var3 = this.field983;
        synchronized (this.field983) {
            this.field983.method2893((byte) -51);
        }
        if (arg0 != -16225) {
            this.method653(-93);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Lff;")
    public final class309 method654(int arg0, int arg1) {
        field971++;
        class494 var3 = this.field977;
        class309 var4;
        synchronized (this.field977) {
            var4 = (class309) this.field977.method2882((long) arg0, (byte) -123);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field976;
        byte[] var6;
        synchronized (this.field976) {
            var6 = this.field976.method3019(34, arg0, 106);
        }
        if (arg1 != -31772) {
            field982 = 124;
        }
        class309 var7 = new class309();
        var7.field4407 = this;
        if (var6 != null) {
            var7.method1897((byte) 26, new class431(var6));
        }
        class494 var8 = this.field977;
        synchronized (this.field977) {
            this.field977.method2890(-7307, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public final void method655(boolean arg0) {
        field970++;
        class494 var2 = this.field977;
        synchronized (this.field977) {
            this.field977.method2881((byte) -19);
        }
        if (!arg0) {
            method651((byte) 43, null);
        }
        class494 var3 = this.field983;
        synchronized (this.field983) {
            this.field983.method2881((byte) -114);
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lmca;ILgga;Lgga;)V")
    public class65(class41 arg0, int arg1, class513 arg2, class513 arg3) {
        this.field974 = arg3;
        this.field976 = arg2;
        this.field976.method3007(-1, 34);
    }
}
