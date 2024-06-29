import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class563 {

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "B")
    public byte field7892 = 0;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "S")
    public short field7900;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "B")
    public byte field7905;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "B")
    public byte field7886;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "S")
    public short field7899;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field7881 = -1;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "B")
    public byte field7887;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "B")
    public byte field7888;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "B")
    public byte field7898;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "B")
    public byte field7904;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Lde;")
    public class15 field7894;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Lkw;")
    public class174 field7903;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Lvh;")
    public class249 field7891;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "Lqh;")
    public class293 field7895;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Ltm;")
    public class486 field7885;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Ltm;")
    public class486 field7889;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "Lrg;")
    public class563 field7893;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lck;")
    public class8 field7884;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "Lck;")
    public class8 field7896;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "S")
    public short field7901;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Z")
    public boolean field7890;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "Z")
    public boolean field7897;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "Z")
    public boolean field7902;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public final void method3160(int arg0) {
        field7883++;
        if (arg0 != -12384) {
            this.field7886 = 110;
        }
        while (this.field7894 != null) {
            class15 var2 = this.field7894.field158;
            this.field7894.method71(106);
            this.field7894 = var2;
        }
        this.field7892 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(III)V")
    public class563(int arg0, int arg1, int arg2) {
        this.field7900 = (short) arg1;
        this.field7886 = this.field7905 = (byte) arg0;
        this.field7899 = (short) arg2;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Z")
    public static final boolean method3161(byte arg0) {
        if (arg0 != -42) {
            field7881 = -53;
        }
        field7882++;
        if (class351.field4936) {
            try {
                if ((Boolean) class499.method2793("showingVideoAd", (byte) 88, class31.field488.field3644)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }
}
