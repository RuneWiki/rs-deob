import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class527 extends class192 implements class459 {

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    private int field7775;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "[[Z")
    public static boolean[][] field7773 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "Lap;")
    public static class335 field7781 = new class335("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public static int field7783 = 0;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "[I")
    public static int[] field7777;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)I")
    public final int method974(int arg0) {
        if (arg0 != 27847) {
            return 2;
        } else {
            ++field7778;
            return super.field2493;
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lug;ILjaggl/memory/NativeBuffer;IZ)V")
    public class527(class395 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7775 = arg1;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)I")
    public final int method969(int arg0) {
        if (arg0 != 8072) {
            field7781 = null;
        }
        ++field7779;
        return this.field7775;
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V")
    public static void method3135(int arg0) {
        if (arg0 != -31469) {
            method3135(43);
        }
        field7781 = null;
        field7773 = null;
        field7777 = null;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lug;I[BIZ)V")
    public class527(class395 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7775 = arg1;
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V")
    public final void method1188(int arg0) {
        if (arg0 != 32299) {
            field7783 = 86;
        }
        super.field2494.method2348(this, arg0 ^ 32296);
        ++field7774;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "([BIIB)V")
    public final void method971(byte[] arg0, int arg1, int arg2, byte arg3) {
        ++field7776;
        this.method1189(-29783, arg2, arg0);
        this.field7775 = arg1;
        int var5 = 58 / ((arg3 - -21) / 52);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)J")
    public final long method972(byte arg0) {
        int var2 = -30 / ((arg0 - -63) / 41);
        ++field7782;
        return 0L;
    }
}
