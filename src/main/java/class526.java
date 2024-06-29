import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class526 extends class316 {

    @OriginalMember(owner = "client!is", name = "s", descriptor = "Ljava/lang/String;")
    private String field7489 = null;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "J")
    private long field7487 = -1L;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "Lga;")
    public static class420 field7486 = new class420();

    @OriginalMember(owner = "client!is", name = "v", descriptor = "[I")
    public static int[] field7492 = new int[32];

    @OriginalMember(owner = "client!is", name = "x", descriptor = "I")
    public static int field7494 = 0;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "B")
    private byte field7482;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    private int field7484;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!is", name = "w", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!is", name = "t", descriptor = "Lgl;")
    public static class624 field7490;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILrv;)V", line = 6)
    public final void method818(int arg0, class120 arg1) {
        field7483++;
        if (arg0 != -2) {
            method3059(-23);
        }
        if (arg1.method842(2384) != 255) {
            arg1.field1521--;
            this.field7487 = arg1.method834(arg0 ^ 0x21A6);
        }
        this.field7489 = arg1.method891(arg0 ^ 0xFFFFB792);
        this.field7484 = arg1.method898((byte) -125);
        this.field7482 = arg1.method877(-252);
        arg1.method834(arg0 ^ 0x21A6);
        if (class368.field5291) {
            System.out.println("memberhash:" + this.field7487 + " membername:" + this.field7489);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lua;I)V", line = 33)
    public final void method819(class692 arg0, int arg1) {
        field7485++;
        if (arg1 != 0) {
            this.method818(62, null);
        }
        class88 var3 = new class88();
        var3.field1145 = this.field7484;
        var3.field1148 = this.field7489;
        var3.field1147 = this.field7482;
        arg0.method3895(var3, (byte) -90);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([[IZ)V", line = 54)
    public static final void method3058(int[][] arg0, boolean arg1) {
        class347.field5087 = arg0;
        field7488++;
        if (arg1) {
            field7492 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V", line = 67)
    public static void method3059(int arg0) {
        field7486 = null;
        field7492 = null;
        field7490 = null;
        if (arg0 <= 31) {
            method3059(43);
        }
    }
}
