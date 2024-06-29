import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class16 {

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "B")
    private byte field200;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "[C")
    public static char[] field196 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "[C")
    public static char[] field189 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "Lpj;")
    public static class79 field197 = new class79(64);

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field205 = 0;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "Lb;")
    public static class183 field190;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public static final void method90(byte arg0) {
        field198++;
        if (arg0 >= 66) {
            class190 var1 = class395.field5776;
            synchronized (class395.field5776) {
                class395.field5776.method1243(1000);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public static final void method91(int arg0) {
        field199++;
        if (class350.field4884) {
            return;
        }
        if (class188.field2609) {
            class140.field2007 = (float) ((int) class140.field2007 - 17 & 0xFFFFFFF0);
        } else {
            class10.field143 += (-12.0F - class10.field143) / 2.0F;
        }
        class350.field4884 = true;
        int var1 = 102 % ((arg0 - 17) / 38);
        class366.field5124 = true;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)I")
    public final int method92(int arg0) {
        field202++;
        if (arg0 <= 24) {
            field196 = null;
        }
        return this.field200 & 0x7;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)I")
    public final int method93(byte arg0) {
        field192++;
        if (arg0 != -64) {
            this.method93((byte) -46);
        }
        return (this.field200 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
    public static void method94(int arg0) {
        if (arg0 == 17958) {
            field196 = null;
            field190 = null;
            field189 = null;
            field197 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
    public class16() {
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Leb;)V")
    public class16(class371 arg0) {
        this.field200 = arg0.method2418(-21337);
        this.field194 = arg0.method2403((byte) 121);
        this.field193 = arg0.method2413((byte) -30);
        this.field191 = arg0.method2413((byte) -30);
        this.field204 = arg0.method2413((byte) -30);
        this.field201 = arg0.method2413((byte) -30);
    }
}
