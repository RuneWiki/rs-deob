import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HVMNUAXR")
public class class22 extends class3 {

    @OriginalMember(owner = "client!HVMNUAXR", name = "n", descriptor = "Z")
    private boolean field883 = true;

    @OriginalMember(owner = "client!HVMNUAXR", name = "k", descriptor = "I")
    private int field880;

    @OriginalMember(owner = "client!HVMNUAXR", name = "l", descriptor = "I")
    private int field881;

    @OriginalMember(owner = "client!HVMNUAXR", name = "m", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "client!HVMNUAXR", name = "t", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "client!HVMNUAXR", name = "u", descriptor = "I")
    private int field890;

    @OriginalMember(owner = "client!HVMNUAXR", name = "v", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "client!HVMNUAXR", name = "w", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "client!HVMNUAXR", name = "y", descriptor = "LPVVHTYPN;")
    private class41 field894;

    @OriginalMember(owner = "client!HVMNUAXR", name = "s", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "client!HVMNUAXR", name = "r", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "client!HVMNUAXR", name = "p", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!HVMNUAXR", name = "q", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!HVMNUAXR", name = "x", descriptor = "[I")
    public int[] field893;

    @OriginalMember(owner = "client!HVMNUAXR", name = "o", descriptor = "Lclient;")
    public static client field884;

    @OriginalMember(owner = "client!HVMNUAXR", name = "a", descriptor = "(B)LUNLYQRUD;")
    public final class56 method10(byte arg0) {
        int var2 = -1;
        if (this.field894 != null) {
            int var3 = client.field261 - this.field887;
            if (var3 > 100 && this.field894.field1152 > 0) {
                var3 = 100;
            }
            label53: {
                do {
                    do {
                        if (var3 <= this.field894.method390(this.field888, (byte) -99)) {
                            break label53;
                        }
                        var3 -= this.field894.method390(this.field888, (byte) -99);
                        this.field888++;
                    } while (this.field888 < this.field894.field1148);
                    this.field888 -= this.field894.field1152;
                } while (this.field888 >= 0 && this.field888 < this.field894.field1148);
                this.field894 = null;
            }
            this.field887 = client.field261 - var3;
            if (this.field894 != null) {
                var2 = this.field894.field1149[this.field888];
            }
        }
        class9 var4;
        if (this.field893 == null) {
            var4 = class9.method184(this.field880);
        } else {
            var4 = this.method314(false);
        }
        if (var4 == null) {
            return null;
        }
        class56 var5 = var4.method190(this.field881, this.field882, this.field889, this.field890, this.field891, this.field892, var2);
        if (arg0 != 93) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!HVMNUAXR", name = "a", descriptor = "(Z)LDZZSWICG;")
    public final class9 method314(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field885 != -1) {
            class60 var3 = class60.field1530[this.field885];
            int var4 = var3.field1532;
            int var5 = var3.field1533;
            int var6 = var3.field1534;
            int var7 = client.field114[var6 - var5];
            var2 = field884.field534[var4] >> var5 & var7;
        } else if (this.field886 != -1) {
            var2 = field884.field534[this.field886];
        }
        return var2 < 0 || var2 >= this.field893.length || this.field893[var2] == -1 ? null : class9.method184(this.field893[var2]);
    }

    @OriginalMember(owner = "client!HVMNUAXR", name = "<init>", descriptor = "(IIIZZIIIII)V")
    public class22(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field880 = arg8;
        this.field881 = arg6;
        this.field882 = arg7;
        this.field889 = arg5;
        this.field890 = arg1;
        this.field891 = arg0;
        this.field892 = arg2;
        if (arg9 != -1) {
            this.field894 = class41.field1147[arg9];
            this.field888 = 0;
            this.field887 = client.field261 - 1;
            if (arg3 && this.field894.field1152 != -1) {
                this.field888 = (int) (Math.random() * (double) this.field894.field1148);
                this.field887 -= (int) (Math.random() * (double) this.field894.method390(this.field888, (byte) -99));
            }
        }
        class9 var11 = class9.method184(this.field880);
        this.field885 = var11.field643;
        this.field886 = var11.field651;
        this.field893 = var11.field614;
        if (!arg4) {
            this.field883 = !this.field883;
        }
    }
}
