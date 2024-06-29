import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZZGAIEMG")
public class class72 {

    @OriginalMember(owner = "client!ZZGAIEMG", name = "a", descriptor = "I")
    private int field1757 = 180;

    @OriginalMember(owner = "client!ZZGAIEMG", name = "b", descriptor = "Z")
    private boolean field1758 = true;

    @OriginalMember(owner = "client!ZZGAIEMG", name = "c", descriptor = "I")
    private int field1759 = -420;

    @OriginalMember(owner = "client!ZZGAIEMG", name = "d", descriptor = "Z")
    private boolean field1760 = true;

    @OriginalMember(owner = "client!ZZGAIEMG", name = "e", descriptor = "I")
    private int field1761;

    @OriginalMember(owner = "client!ZZGAIEMG", name = "f", descriptor = "[LCZLFLPZK;")
    private class8[] field1762;

    @OriginalMember(owner = "client!ZZGAIEMG", name = "<init>", descriptor = "(II)V")
    public class72(int arg0, int arg1) {
        this.field1761 = arg0;
        this.field1762 = new class8[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class8 var5 = this.field1762[var3] = new class8();
            var5.field620 = var5;
            var5.field621 = var5;
        }
        int var4 = 95 / arg1;
    }

    @OriginalMember(owner = "client!ZZGAIEMG", name = "a", descriptor = "(J)LCZLFLPZK;")
    public class8 method601(long arg0) {
        class8 var3 = this.field1762[(int) (arg0 & (long) (this.field1761 - 1))];
        for (class8 var4 = var3.field620; var4 != var3; var4 = var4.field620) {
            if (var4.field619 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ZZGAIEMG", name = "a", descriptor = "(IJLCZLFLPZK;)V")
    public void method602(int arg0, long arg1, class8 arg2) {
        if (arg2.field621 != null) {
            arg2.method163();
        }
        class8 var5 = this.field1762[(int) (arg1 & (long) (this.field1761 - 1))];
        if (arg0 != 0) {
            this.field1758 = !this.field1758;
        }
        arg2.field621 = var5.field621;
        arg2.field620 = var5;
        arg2.field621.field620 = arg2;
        arg2.field620.field621 = arg2;
        arg2.field619 = arg1;
    }
}
