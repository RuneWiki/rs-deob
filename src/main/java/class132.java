import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class132 extends class115 {

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "Luv;")
    public static class2 field1978;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public int field1956;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public int field1957;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public int field1959;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public int field1962;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public int field1963;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public int field1964;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public int field1974;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public int field1976;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public int field1977;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public int field1980;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "Lhl;")
    public class234 field1965;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "Lag;")
    public class352 field1973;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Ltd;")
    public class380 field1961;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "Llv;")
    public class528 field1967;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "[Lmv;")
    public static class522[] field1979;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)I")
    public static final int method972(boolean arg0) {
        if (arg0) {
            return 4;
        } else {
            field1972++;
            return 6;
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)Ltr;")
    public static final class245 method973(byte arg0) {
        field1969++;
        int var1 = 119 % ((arg0 + 51) / 40);
        class245 var2 = (class245) class113.field1720.method3090(2);
        if (var2 == null) {
            return new class245();
        } else {
            class364.field5568--;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public final void method974(int arg0) {
        this.field1961 = null;
        field1982++;
        this.field1973 = null;
        this.field1965 = null;
        this.field1967 = null;
        if (arg0 != 10) {
            this.field1977 = 33;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lok;III)Lio;")
    public static final class118 method975(class74 arg0, int arg1, int arg2, int arg3) {
        field1981++;
        byte[] var4 = arg0.method541(arg2, arg1, (byte) -122);
        if (arg3 > -32) {
            method977((byte) -69);
        }
        return var4 == null ? null : new class118(var4);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)V")
    public static final void method976(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 6) {
            class524.field7736 = new byte[arg2][arg0][arg3];
            field1958++;
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(B)V")
    public static void method977(byte arg0) {
        if (arg0 >= -86) {
            method973((byte) 2);
        }
        field1979 = null;
        field1978 = null;
    }

    static {
        new class347("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field1978 = new class2(40, 10);
    }
}
