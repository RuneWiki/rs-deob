import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class286 extends class179 {

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public int field4321 = 0;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public static int field4324 = -1;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "Lsk;")
    public static class423 field4331 = new class423("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "Lwa;")
    public static class418 field4343 = new class418("RC", 1);

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public int field4319;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public int field4338;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public int field4340;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "Luj;")
    public class249 field4341;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "Lvm;")
    public class464 field4325;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "Lvm;")
    public class464 field4337;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "Lqh;")
    public static class47 field4329;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "Lqh;")
    public class47 field4334;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "Lin;")
    public class56 field4328;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "Z")
    public boolean field4339;

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "[I")
    public int[] field4342;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)V")
    public static void method1740(int arg0) {
        field4343 = null;
        field4329 = null;
        int var1 = -106 / ((arg0 - 33) / 36);
        field4331 = null;
    }

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "(I)V")
    public static final void method1741(int arg0) {
        class193.field3041++;
        class400.method2379((byte) -75, class311.field4682);
        if (arg0 == -1) {
            field4336++;
            class230.field3508.method246((byte) -98, class379.field5542);
        }
    }

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "(I)V")
    public static final void method1742(int arg0) {
        field4318++;
        class241.field3636 = arg0;
        class23.field293 = null;
    }

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "(I)V")
    public final void method1743(int arg0) {
        if (arg0 != 25996) {
            this.field4334 = null;
        }
        field4327++;
        int var2 = this.field4320;
        if (this.field4328 != null) {
            class56 var3 = this.field4328.method393(class273.field4144, (byte) -126);
            if (var3 == null) {
                this.field4338 = 0;
                this.field4342 = null;
                this.field4320 = -1;
                this.field4323 = 0;
                this.field4319 = 0;
                this.field4335 = 0;
            } else {
                this.field4335 = var3.field906;
                this.field4323 = var3.field903;
                this.field4342 = var3.field939;
                this.field4319 = var3.field954 << 7;
                this.field4320 = var3.field899;
                this.field4338 = var3.field882;
            }
        } else if (this.field4341 != null) {
            int var4 = class108.method782(-1, this.field4341);
            if (var2 != var4) {
                this.field4320 = var4;
                class245 var5 = this.field4341.field3819;
                if (var5.field3703 != null) {
                    var5 = var5.method1477(class273.field4144, -12819);
                }
                if (var5 == null) {
                    this.field4338 = this.field4319 = 0;
                } else {
                    this.field4338 = var5.field3684;
                    this.field4319 = var5.field3691 << 7;
                }
            }
        } else if (this.field4334 != null) {
            this.field4320 = class473.method2848(this.field4334, 0);
            this.field4338 = this.field4334.field678;
            this.field4319 = this.field4334.field702 << 7;
        }
        if (this.field4320 != var2 && this.field4325 != null) {
            class178.field2786.method2099(this.field4325);
            this.field4325 = null;
        }
    }
}
