import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class641 extends class487 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "S")
    public short field8611;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "B")
    public byte field8614;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public int field8612;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "S")
    public short field8622;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public int field8620;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "B")
    public byte field8609;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public int field8616;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "S")
    public short field8610;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "S")
    public short field8618;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Z")
    public boolean field8613;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field8619 = 765;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public int field8615;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "J")
    public static long field8621;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(Z)I")
    public abstract int method729(boolean arg0);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;ZC)I")
    public static final int method3533(String arg0, boolean arg1, char arg2) {
        field8608++;
        int var3 = 0;
        int var4 = arg0.length();
        if (!arg1) {
            field8619 = -117;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2 == arg0.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public void method2351(int arg0) {
        field8617++;
        if (arg0 != 8) {
            method3533(null, true, (char) 65424);
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field8611 = (short) arg4;
        this.field8614 = arg9;
        this.field8612 = arg3;
        this.field8622 = (short) arg5;
        this.field8620 = arg1;
        this.field8609 = (byte) arg0;
        this.field8616 = arg2;
        this.field8610 = (short) arg7;
        this.field8618 = (short) arg6;
        this.field8613 = arg8;
    }
}
