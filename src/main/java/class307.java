import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class307 extends class337 {

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Z")
    public boolean field3854 = false;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public int field3860 = -1;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field3858 = 0;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public int field3855;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public int field3857;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public int field3859;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public int field3861;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Z")
    public static final boolean method1811(int arg0, int arg1, int arg2) {
        field3856++;
        if (arg2 < 55) {
            field3858 = -36;
        }
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V")
    public class307(int arg0) {
        this.field3860 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static final void method1812(int arg0) {
        field3863++;
        if (client.field6070 == -1 || arg0 != -17827) {
            return;
        }
        int var1 = class737.field9980.method210(0);
        int var2 = class737.field9980.method208(-75);
        class793 var3 = (class793) class600.field7629.method3591(0);
        if (var3 != null) {
            var1 = var3.method1592(-19898);
            var2 = var3.method1591(-78);
        }
        int var4 = 0;
        int var5 = 0;
        if (class602.field7657) {
            var4 = class498.method2765((byte) -70);
            var5 = class507.method2806((byte) -80);
        }
        class368.method2116(var2, var4, class372.field4550 + var4, var5, var2 + var5, var1, var4, class463.field6021 + var5, var5, -116, var1 + var4, client.field6070);
        if (class558.field7088 != null) {
            class488.method2731(var1 + var4, var2 + var5, (byte) -115);
        }
    }
}
