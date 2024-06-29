import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class343 extends class80 {

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "Lit;")
    public class456 field4730;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "Le;")
    public class370 field4731;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public static int field4727 = 0;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public int field4721;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public int field4722;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public int field4725;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public int field4729;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I", line = 5)
    public static final int method1913(int arg0, int arg1) {
        field4726++;
        double var2 = (double) ((arg0 & 0xFF5A7C) >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF84) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (arg1 > ~var22) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lit;Lvc;)V", line = 119)
    public class343(class456 arg0, class206 arg1) {
        this.field4730 = arg0;
        this.field4731 = this.field4730.method2687(-2775);
        this.method1914(-27077);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 131)
    public final void method1914(int arg0) {
        field4728++;
        this.field4721 = this.field4730.field6676;
        if (arg0 != -27077) {
            this.field4729 = -89;
        }
        this.field4725 = this.field4730.field6663;
        this.field4729 = this.field4730.field6662;
        if (this.field4730.field6670 != null) {
            this.field4730.field6670.method330(this.field4731.field5189, this.field4731.field5181, this.field4731.field5197, class426.field6238);
        }
        this.field4722 = class426.field6238[0];
        this.field4724 = class426.field6238[2];
    }
}
