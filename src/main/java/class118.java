import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class118 {

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public int field1764 = -1;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public int field1761 = -1;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "Lwj;")
    public static class270 field1756 = new class270(42, -1);

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "Lqp;")
    public static class466 field1763 = new class466(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "Lqp;")
    public static class466 field1766 = new class466("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "Leb;")
    public static class439 field1759;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "[I")
    public int[] field1765;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lsi;II)V", line = 3)
    private final void method832(class391 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1761 = arg0.method2353((byte) 68);
        } else if (arg1 == 2) {
            this.field1765 = new int[arg0.method2348(-2)];
            for (int var4 = 0; var4 < this.field1765.length; var4++) {
                this.field1765[var4] = arg0.method2353((byte) 91);
            }
        } else if (arg1 == 3) {
            this.field1764 = arg0.method2348(-2);
        }
        field1758++;
        if (arg2 != -3) {
            method833(61, -102, -48, 111);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIII)I", line = 37)
    public static final int method833(int arg0, int arg1, int arg2, int arg3) {
        field1762++;
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        if (arg1 != 4) {
            field1766 = null;
        }
        return (arg0 >> 1) + (arg2 >> 5 << 7) + ((arg3 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V", line = 65)
    public static void method834(byte arg0) {
        field1759 = null;
        field1763 = null;
        field1756 = null;
        field1766 = null;
        if (arg0 != 71) {
            field1766 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLsi;)V", line = 89)
    public final void method835(byte arg0, class391 arg1) {
        if (arg0 > -94) {
            method833(-79, 79, -125, -48);
        }
        while (true) {
            int var3 = arg1.method2348(-2);
            if (var3 == 0) {
                field1757++;
                return;
            }
            this.method832(arg1, var3, -3);
        }
    }
}
