import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class class372 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[I")
    public static int[] field5023 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lej;")
    public static class104 field5026 = new class104("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lsi;")
    public static class480 field5027 = class461.method2688(-56);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Z")
    public abstract boolean method2150(int arg0);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static void method2214(int arg0) {
        field5026 = null;
        int var1 = -32 % ((arg0 + 80) / 44);
        field5027 = null;
        field5023 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IJ)V")
    public static final void method2215(int arg0, long arg1) {
        if (arg0 != 1) {
            method2215(-78, 92L);
        }
        field5024++;
        int var3 = class390.field5522 + class645.field9372.field6037;
        int var4 = class171.field2475 + class645.field9372.field6029;
        if (class487.field6841 - var3 < -500 || class487.field6841 - var3 > 500 || class414.field5848 - var4 < -500 || (class414.field5848 - var4) > 500) {
            class414.field5848 = var4;
            class487.field6841 = var3;
        }
        if (class487.field6841 != var3) {
            int var5 = var3 - class487.field6841;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class487.field6841 += var6;
        }
        if (!class491.field6875.field3369) {
            class1.field13 += (float) arg1 * class309.field4169 / 6.0F;
            class18.field224 += (float) arg1 * class301.field4121 / 6.0F;
        }
        if (class414.field5848 != var4) {
            int var7 = var4 - class414.field5848;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class414.field5848 += var8;
        }
        class489.method2839(arg0 ^ 0x4001);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BC)Z")
    public static final boolean method2216(byte arg0, char arg1) {
        if (arg0 != 8) {
            method2215(56, 58L);
        }
        field5025++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public abstract void method2157(byte arg0);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Z")
    public abstract boolean method2151(byte arg0);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Z")
    public abstract boolean method2155(boolean arg0);

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)I")
    public abstract int method2153(byte arg0);

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
    public abstract void method2146(byte arg0);

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)Z")
    public final boolean method2217(byte arg0) {
        field5022++;
        if (arg0 >= -74) {
            return false;
        } else {
            return this.method2151((byte) 54) || this.method2155(false) || this.method2150(6244);
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)I")
    public abstract int method2152(int arg0);

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(B)Lbh;")
    public abstract class32 method2156(byte arg0);
}
