import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KSCKZMBT")
public class class31 extends class20 {

    @OriginalMember(owner = "client!KSCKZMBT", name = "k", descriptor = "I")
    private int field1083 = -46103;

    @OriginalMember(owner = "client!KSCKZMBT", name = "q", descriptor = "Z")
    public boolean field1089 = false;

    @OriginalMember(owner = "client!KSCKZMBT", name = "t", descriptor = "B")
    private byte field1092 = -8;

    @OriginalMember(owner = "client!KSCKZMBT", name = "u", descriptor = "LOPHZBIVR;")
    private class44 field1093;

    @OriginalMember(owner = "client!KSCKZMBT", name = "l", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!KSCKZMBT", name = "m", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!KSCKZMBT", name = "n", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!KSCKZMBT", name = "o", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "client!KSCKZMBT", name = "p", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!KSCKZMBT", name = "r", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "client!KSCKZMBT", name = "s", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client!KSCKZMBT", name = "<init>", descriptor = "(IIIIIIZI)V")
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        this.field1093 = class44.field1269[arg0];
        this.field1084 = arg5;
        if (arg6) {
            this.field1083 = 317;
        }
        this.field1085 = arg2;
        this.field1086 = arg1;
        this.field1087 = arg3;
        this.field1088 = arg4 + arg7;
        this.field1089 = false;
    }

    @OriginalMember(owner = "client!KSCKZMBT", name = "a", descriptor = "(I)LIRLTEWJP;")
    public final class26 method168(int arg0) {
        class26 var2 = this.field1093.method435();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1093.field1273.field1338[this.field1090];
        class26 var4 = new class26(var2, false, 0, class17.method211(var3, 47525), true);
        if (!this.field1089) {
            var4.method288(49427);
            var4.method289(var3, true);
            var4.field1023 = null;
            var4.field1022 = null;
        }
        if (this.field1093.field1276 != 128 || this.field1093.field1277 != 128) {
            var4.method297(this.field1093.field1276, this.field1092, this.field1093.field1277, this.field1093.field1276);
        }
        if (this.field1093.field1278 != 0) {
            if (this.field1093.field1278 == 90) {
                var4.method292((byte) 4);
            }
            if (this.field1093.field1278 == 180) {
                var4.method292((byte) 4);
                var4.method292((byte) 4);
            }
            if (this.field1093.field1278 == 270) {
                var4.method292((byte) 4);
                var4.method292((byte) 4);
                var4.method292((byte) 4);
            }
        }
        var4.method298(this.field1093.field1279 + 64, this.field1093.field1280 + 850, -30, -50, -30, true);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!KSCKZMBT", name = "a", descriptor = "(IB)V")
    public final void method317(int arg0, byte arg1) {
        this.field1091 += arg0;
        if (arg1 != 3) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            do {
                do {
                    if (this.field1091 <= this.field1093.field1273.method451(13126, this.field1090)) {
                        return;
                    }
                    this.field1091 -= this.field1093.field1273.method451(13126, this.field1090) + 1;
                    this.field1090++;
                } while (this.field1090 < this.field1093.field1273.field1337);
            } while (this.field1090 >= 0 && this.field1090 < this.field1093.field1273.field1337);
            this.field1090 = 0;
            this.field1089 = true;
        }
    }
}
