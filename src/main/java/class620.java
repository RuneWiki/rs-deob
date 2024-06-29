import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class620 {

    @OriginalMember(owner = "client!kia", name = "k", descriptor = "B")
    public byte field8696;

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "[I")
    public int[] field8689;

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "B")
    public byte field8690;

    @OriginalMember(owner = "client!kia", name = "g", descriptor = "[I")
    public int[] field8692;

    @OriginalMember(owner = "client!kia", name = "i", descriptor = "[I")
    public int[] field8694;

    @OriginalMember(owner = "client!kia", name = "c", descriptor = "S")
    public short field8688;

    @OriginalMember(owner = "client!kia", name = "l", descriptor = "S")
    public short field8697;

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "S")
    public short field8691;

    @OriginalMember(owner = "client!kia", name = "n", descriptor = "S")
    public short field8699;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "[S")
    public short[] field8686;

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "[S")
    public short[] field8687;

    @OriginalMember(owner = "client!kia", name = "m", descriptor = "[S")
    public short[] field8698;

    @OriginalMember(owner = "client!kia", name = "h", descriptor = "I")
    public static int field8693;

    @OriginalMember(owner = "client!kia", name = "j", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(B)Ljha;")
    public static final class695 method3513(byte arg0) {
        field8693++;
        class670.field9317 = 0;
        if (arg0 <= 74) {
            method3513((byte) -118);
        }
        return class497.method2770(200);
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "([BB)V")
    public static final void method3514(byte[] arg0, byte arg1) {
        field8695++;
        class611 var2 = new class611(arg0);
        boolean var3 = false;
        if (arg1 != -25) {
            return;
        }
        while (true) {
            while (true) {
                int var4 = var2.method3428((byte) -105);
                if (var4 == 0) {
                    if (var3) {
                        return;
                    }
                    if (class359.field4755 == null) {
                        class341.field4588 = 4;
                        class606.field8440 = new int[4];
                        class359.field4755 = new int[4];
                    }
                    for (int var6 = 0; var6 < class359.field4755.length; var6++) {
                        class359.field4755[var6] = 0;
                        class606.field8440[var6] = var6 * 20;
                    }
                    return;
                }
                if (var4 == 1) {
                    if (class359.field4755 == null) {
                        class606.field8440 = new int[4];
                        class341.field4588 = 4;
                        class359.field4755 = new int[4];
                    }
                    for (int var5 = 0; var5 < class359.field4755.length; var5++) {
                        class359.field4755[var5] = var2.method3413(false);
                        class606.field8440[var5] = var2.method3413(false);
                    }
                    var3 = true;
                } else if (var4 == 2) {
                    class571.field8038 = var2.method3402((byte) 127);
                } else if (var4 == 3) {
                    class341.field4588 = var2.method3428((byte) -109);
                    class359.field4755 = new int[class341.field4588];
                    class606.field8440 = new int[class341.field4588];
                }
            }
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field8696 = (byte) arg0;
        this.field8689 = new int[4];
        this.field8690 = (byte) arg1;
        this.field8692 = new int[4];
        this.field8694 = new int[4];
        this.field8692[2] = arg4;
        this.field8692[3] = arg5;
        this.field8692[1] = arg3;
        this.field8692[0] = arg2;
        this.field8689[3] = arg9;
        this.field8689[0] = arg6;
        this.field8689[2] = arg8;
        this.field8689[1] = arg7;
        this.field8694[2] = arg12;
        this.field8694[1] = arg11;
        this.field8694[3] = arg13;
        this.field8688 = (short) (arg2 >> class443.field6172);
        this.field8694[0] = arg10;
        this.field8697 = (short) (arg4 >> class443.field6172);
        this.field8691 = (short) (arg10 >> class443.field6172);
        this.field8699 = (short) (arg12 >> class443.field6172);
        this.field8686 = new short[4];
        this.field8687 = new short[4];
        this.field8698 = new short[4];
    }
}
