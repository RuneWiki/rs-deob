import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public abstract class class211 {

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "Lrc;")
    public static class108 field3074 = new class108(12, -2);

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public int field3071;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)Z")
    public final boolean method1431(byte arg0) {
        if (arg0 > -31) {
            field3082 = 44;
        }
        field3069++;
        return (this.field3071 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Z")
    public final boolean method1432(int arg0) {
        if (arg0 != -29579) {
            this.field3075 = -3;
        }
        field3072++;
        return (this.field3071 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V")
    public static final void method1433(byte arg0) {
        if (arg0 > -100) {
            method1437(-11, 75);
        }
        class89.field1266 = -1;
        class437.field6218 = -1;
        field3076++;
        class38.field477 = 0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "([Ljava/lang/Object;B[J)V")
    public static final void method1434(Object[] arg0, byte arg1, long[] arg2) {
        class124.method942(arg1 - 67, 0, arg2, arg0, arg2.length - 1);
        if (arg1 != -51) {
            method1438((byte) 66);
        }
        field3079++;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)Z")
    public final boolean method1435(byte arg0) {
        int var2 = 73 % ((-arg0 - 13) / 36);
        field3077++;
        return (this.field3071 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)Z")
    public final boolean method1436(int arg0) {
        if (arg0 == 0) {
            field3080++;
            return (this.field3071 & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
    public static final void method1437(int arg0, int arg1) {
        if (class18.field195 == null || arg1 > class18.field195.length) {
            class18.field195 = new int[arg1];
        }
        int var2 = -23 / ((arg0 + 15) / 55);
        field3070++;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)V")
    public static void method1438(byte arg0) {
        field3074 = null;
        int var1 = -96 % ((-arg0 - 27) / 56);
    }

    static {
        new class151("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field3081 = 0;
        field3082 = 2;
    }
}
