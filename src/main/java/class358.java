import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class358 extends class263 {

    @OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
    public static int field5475 = 13156520;

    @OriginalMember(owner = "client!cu", name = "F", descriptor = "F")
    public static float field5476;

    @OriginalMember(owner = "client!cu", name = "G", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!cu", name = "H", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!cu", name = "I", descriptor = "Z")
    public static boolean field5479;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BII)I")
    private final int method2146(byte arg0, int arg1, int arg2) {
        ++field5477;
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 ^ var4 << 1;
        if (arg0 <= 55) {
            this.method33(-40, (byte) -116);
        }
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 - -789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "()V")
    public class358() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        ++field5478;
        if (arg1 <= 40) {
            return null;
        } else {
            int[] var3 = super.field3917.method41(arg0, 1);
            if (super.field3917.field91) {
                int var4 = class170.field2509[arg0];
                for (int var5 = 0; var5 < class367.field5597; ++var5) {
                    var3[var5] = this.method2146((byte) 107, var4, class379.field5711[var5]) % 4096;
                }
            }
            return var3;
        }
    }

    static {
        new class347((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
    }
}
