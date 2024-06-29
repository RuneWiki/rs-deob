import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class class503 {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public int field7259;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public int field7261;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public int field7257;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
    public static int[] field7255 = new int[1];

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lak;")
    public static class234 field7262 = new class234(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lga;")
    public static class279 field7264;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[Lug;")
    public static class396[] field7256;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
    public static final int method2988(int arg0, int arg1, int arg2) {
        field7260++;
        if (arg1 == 4 || arg1 == 5) {
            return class390.field5843[arg0 & 0x3];
        } else {
            if (arg2 != -11865) {
                method2988(41, -93, 69);
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
    public static final void method2989(int arg0, int arg1, int arg2) {
        field7263++;
        int var3 = class380.field5735.method2174(-33, class271.field4152.method1635(class224.field3673, (byte) -103));
        for (class295 var4 = (class295) class456.field6644.method1004((byte) -95); var4 != null; var4 = (class295) class456.field6644.method996(1)) {
            int var8 = class360.method2259(var4, (byte) 121);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class382.field5752 * 16 + 21;
        int var6 = arg2 - var3 / 2;
        if (var6 + var3 > class80.field1163) {
            var6 = class80.field1163 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (arg1 != 26) {
            return;
        }
        int var7 = arg0;
        if (class76.field1105 < var5 + arg0) {
            var7 = class76.field1105 - var5;
        }
        class521.field7630 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class498.field7158 = var3;
        class267.field4085 = class382.field5752 * 16 + (class432.field6402 ? 26 : 22);
        class307.field4631 = true;
        class397.field5941 = var7;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(III)V")
    public abstract void method749(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method2990(int arg0) {
        field7256 = null;
        int var1 = 82 % ((-arg0 - 59) / 58);
        field7262 = null;
        field7255 = null;
        field7264 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)V")
    public abstract void method748(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIB)V")
    public abstract void method747(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(III)V")
    public class503(int arg0, int arg1, int arg2) {
        this.field7259 = arg2;
        this.field7261 = arg1;
        this.field7257 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)I")
    public static final int method2991(byte arg0, int arg1) {
        field7258++;
        if (arg0 <= 50) {
            method2989(-43, 108, -6);
        }
        return arg1 >>> 8;
    }
}
