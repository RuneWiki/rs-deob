import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public abstract class class100 {

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "[I")
    public static int[] field1042 = new int[2];

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "[C")
    public static char[] field1045 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "Ld;")
    public static class150 field1044;

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "[[[B")
    public static byte[][][] field1043;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
    public static void method690(int arg0) {
        field1044 = null;
        field1043 = null;
        field1045 = null;
        if (arg0 != 241) {
            field1044 = null;
        }
        field1042 = null;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)I")
    public abstract int method691(byte arg0);

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)Z")
    public abstract boolean method692(boolean arg0);

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)V")
    public abstract void method693(byte arg0);

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(B)I")
    public abstract int method694(byte arg0);

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(Z)Lu;")
    public abstract class73 method695(boolean arg0);

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)V")
    public static final void method696(int arg0, int arg1) {
        class22.field197 = -1;
        class233.field2750 = arg0;
        field1041++;
        class303.field3790 = 3;
        class699.field9857 = arg1;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)Z")
    public final boolean method697(int arg0) {
        field1040++;
        int var2 = 108 / ((-arg0 - 12) / 40);
        return this.method699((byte) 122) || this.method698(true) || this.method692(false);
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(Z)Z")
    public abstract boolean method698(boolean arg0);

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "(B)Z")
    public abstract boolean method699(byte arg0);

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BI)Z")
    public static final boolean method700(byte arg0, int arg1) {
        if (arg0 != 8) {
            method700((byte) 48, -6);
        }
        field1039++;
        return arg1 == 7 || arg1 == 8 || arg1 == 9;
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)V")
    public abstract void method701(int arg0);
}
