import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class52 {

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "Ler;")
    private class157 field700 = new class157(128);

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "Ler;")
    public class157 field705 = new class157(64);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "Lns;")
    private class438 field695;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "Lns;")
    public class438 field698;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field703 = 0;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "Lcm;")
    public static class449 field706;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field704;

    static {
        new class375("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field706 = new class449(33, -1);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BI)V", line = 3)
    public final void method354(byte arg0, int arg1) {
        field697++;
        class157 var3 = this.field700;
        synchronized (this.field700) {
            this.field700.method1016(arg1, (byte) 115);
        }
        if (arg0 <= 74) {
            this.method357(49);
        }
        class157 var4 = this.field705;
        synchronized (this.field705) {
            this.field705.method1016(arg1, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V", line = 21)
    public final void method355(boolean arg0) {
        field704++;
        class157 var2 = this.field700;
        synchronized (this.field700) {
            this.field700.method1015((byte) 115);
        }
        class157 var3 = this.field705;
        synchronized (this.field705) {
            this.field705.method1015((byte) 97);
            if (!arg0) {
                this.field698 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)Lbo;", line = 41)
    public final class24 method356(int arg0, int arg1) {
        field702++;
        class157 var3 = this.field700;
        class24 var4;
        synchronized (this.field700) {
            var4 = (class24) this.field700.method1013((long) arg1, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field695.method2650(arg1, -109, 36);
        if (arg0 != -1) {
            return null;
        }
        class24 var6 = new class24();
        var6.field382 = this;
        var6.field387 = arg1;
        if (var5 != null) {
            var6.method200(-65536, new class91(var5));
        }
        var6.method190(true);
        class157 var7 = this.field700;
        synchronized (this.field700) {
            this.field700.method1012(-67, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V", line = 73)
    public final void method357(int arg0) {
        if (arg0 != 24204) {
            this.method358((byte) 50, -64, -49);
        }
        class157 var2 = this.field700;
        synchronized (this.field700) {
            this.field700.method1022((byte) -34);
        }
        field701++;
        class157 var3 = this.field705;
        synchronized (this.field705) {
            this.field705.method1022((byte) -34);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BII)V", line = 91)
    public final void method358(byte arg0, int arg1, int arg2) {
        field696++;
        this.field700 = new class157(arg1);
        int var4 = 41 / ((14 - arg0) / 61);
        this.field705 = new class157(arg2);
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V", line = 103)
    public static void method359(int arg0) {
        if (arg0 != -22218) {
            field703 = 103;
        }
        field706 = null;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lgo;ILns;Lns;)V", line = 146)
    public class52(class331 arg0, int arg1, class438 arg2, class438 arg3) {
        this.field695 = arg2;
        this.field698 = arg3;
        this.field695.method2645(1, 36);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZI[B)I", line = 119)
    public static final int method360(int arg0, boolean arg1, int arg2, byte[] arg3) {
        field699++;
        int var4 = -1;
        if (!arg1) {
            method359(-55);
        }
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class486.field7130[(arg3[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }
}
