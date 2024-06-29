import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class class412 extends class15 {

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public int field5865;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "[I")
    public static int[] field5863 = new int[1000];

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "[Z")
    public static boolean[] field5866;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field5864;

    static {
        new class40("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field5866 = new boolean[100];
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I", line = 7)
    public static final int method2443(int arg0, int arg1) {
        field5864++;
        if (arg1 != 1374359425) {
            method2443(-99, 31);
        }
        int var2 = ((arg0 & 0xAAAAAAAB) >>> 1) + (arg0 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCC) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)V", line = 24)
    public static void method2444(boolean arg0) {
        field5866 = null;
        field5863 = null;
        if (!arg0) {
            method2443(21, -20);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V", line = 40)
    public class412(int arg0) {
        this.field5865 = arg0;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method342(int arg0);

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(B)Z")
    public abstract boolean method338(byte arg0);
}
