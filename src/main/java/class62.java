import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class62 extends class225 {

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    private final int field972;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    private final int field966;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    private final int field979;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    private final int field975;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    private final int field969;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    private final int field963;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    private final int field964;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    private final int field977;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static volatile int field962 = 0;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "Lma;")
    public static class5 field971 = class12.method119("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", (byte) 91);

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "Lma;")
    public static class5 field978 = class12.method119("(U4", (byte) 110);

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "Lje;")
    public static class158 field970;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "Lra;")
    public static class40 field974;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "[I")
    public static int[] field976;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIB)V", line = 10)
    public final void method397(int arg0, int arg1, byte arg2) {
        field968++;
        if (arg2 > -104) {
            field973 = -9;
        }
        int var4 = this.field979 * arg0 >> 12;
        int var5 = this.field969 * arg1 >> 12;
        int var6 = this.field963 * arg1 >> 12;
        int var7 = this.field964 * arg0 >> 12;
        int var8 = this.field972 * arg1 >> 12;
        int var9 = this.field977 * arg0 >> 12;
        int var10 = this.field966 * arg1 >> 12;
        int var11 = this.field975 * arg0 >> 12;
        class152.method959(var7, 0, var6, var5, var4, var11, var10, var9, var8, this.field3705);
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(IIB)V", line = 45)
    public final void method395(int arg0, int arg1, byte arg2) {
        field965++;
        if (arg2 != 29) {
            field978 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 64)
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field972 = arg5;
        this.field966 = arg7;
        this.field979 = arg0;
        this.field975 = arg4;
        this.field969 = arg1;
        this.field963 = arg3;
        this.field964 = arg2;
        this.field977 = arg6;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 80)
    public static void method453(byte arg0) {
        field970 = null;
        field971 = null;
        field974 = null;
        field976 = null;
        field978 = null;
        if (arg0 > -4) {
            method454(80, -110, -108, -15);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII)V", line = 95)
    public static final void method454(int arg0, int arg1, int arg2, int arg3) {
        class198 var4 = class43.field646[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class133 var5 = var4.field3144;
        if (var5 != null) {
            var5.field1974 = var5.field1974 * arg3 / 16;
            var5.field1976 = var5.field1976 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IIB)V", line = 114)
    public final void method393(int arg0, int arg1, byte arg2) {
        if (arg2 != -3) {
            this.method397(107, -79, (byte) -100);
        }
        field967++;
    }
}
