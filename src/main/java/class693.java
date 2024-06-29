import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class693 {

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    private int field8894 = -1;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "Lfca;")
    private class661 field8893 = new class661();

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "[J")
    public static long[] field8897 = new long[256];

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "J")
    private long field8901;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static void method3700(int arg0) {
        if (arg0 == 10) {
            field8897 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLim;)V")
    public final void method3701(byte arg0, class652 arg1) {
        field8902++;
        if (this.field8901 != arg1.field8352 || this.field8894 != arg1.field8342) {
            throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + class624.method3337(arg1.field8352, 1) + " updateNum:" + arg1.field8342 + " delta.owner:" + class624.method3337(this.field8901, arg0 - 118) + " updateNum:" + this.field8894);
        }
        class258 var3 = (class258) this.field8893.method3591(0);
        if (arg0 != 119) {
            this.method3702((byte) 31, null);
        }
        while (var3 != null) {
            var3.method547(arg1, (byte) 125);
            var3 = (class258) this.field8893.method3600((byte) 66);
        }
        arg1.field8342++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLmc;)V")
    private final void method3702(byte arg0, class234 arg1) {
        this.field8901 = arg1.method1516(-11290);
        field8898++;
        this.field8894 = arg1.method1497((byte) 105);
        if (arg0 < 30) {
            field8896 = -80;
        }
        for (int var3 = arg1.method1509(true); var3 != 0; var3 = arg1.method1509(true)) {
            if (class346.field4235) {
                System.out.println("t:" + var3);
            }
            class258 var4;
            if (var3 == 3) {
                var4 = new class90();
            } else if (var3 == 1) {
                var4 = new class259();
            } else if (var3 == 4) {
                var4 = new class221();
            } else if (var3 == 6) {
                var4 = new class226();
            } else if (var3 == 5) {
                var4 = new class365();
            } else if (var3 == 2) {
                var4 = new class704();
            } else if (var3 == 7) {
                var4 = new class444();
            } else if (var3 == 8) {
                var4 = new class689();
            } else if (var3 == 9) {
                var4 = new class245();
            } else if (var3 == 10) {
                var4 = new class345();
            } else if (var3 == 11) {
                var4 = new class91();
            } else if (var3 == 12) {
                var4 = new class319();
            } else {
                throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
            }
            var4.method546((byte) -115, arg1);
            this.field8893.method3593(var4, 15);
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lmc;)V")
    public class693(class234 arg0) {
        this.method3702((byte) 80, arg0);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field8897[var0] = var1;
        }
        field8900 = 0;
        field8903 = 0;
    }
}
