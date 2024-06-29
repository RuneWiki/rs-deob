import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class class367 {

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public int field5312;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public int field5314;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public int field5316;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field5320;

    static {
        new class487("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)Z", line = 8)
    public final boolean method2240(int arg0) {
        if (arg0 == -1) {
            field5311++;
            return (this.field5316 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Z", line = 19)
    public final boolean method2241(int arg0) {
        field5320++;
        if (arg0 != 2) {
            this.method2241(-89);
        }
        return (this.field5316 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)Z", line = 30)
    public final boolean method2242(int arg0) {
        if (arg0 != -1) {
            this.method2243((byte) -12);
        }
        field5317++;
        return (this.field5316 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)Z", line = 46)
    public final boolean method2243(byte arg0) {
        int var2 = 118 % ((arg0 - 62) / 52);
        field5315++;
        return (this.field5316 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(CB)Z", line = 74)
    public static final boolean method2244(char arg0, byte arg1) {
        field5313++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class243.method1570(0, arg0)) {
            return true;
        } else {
            char[] var2 = class163.field2182;
            int var3 = -79 % ((57 - arg1) / 48);
            for (int var4 = 0; var4 < var2.length; var4++) {
                char var8 = var2[var4];
                if (arg0 == var8) {
                    return true;
                }
            }
            char[] var5 = class215.field3166;
            for (int var6 = 0; var6 < var5.length; var6++) {
                char var7 = var5[var6];
                if (arg0 == var7) {
                    return true;
                }
            }
            return false;
        }
    }
}
