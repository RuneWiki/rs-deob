import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class385 extends class366 {

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    private int field5452;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "[Lui;")
    public class124[] field5447;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "[[B")
    private byte[][] field5450;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "[[[Lls;")
    public static class74[][][] field5449;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Z")
    public final boolean method2444(int arg0, int arg1) {
        if (arg1 != -693) {
            this.method2447(-5, -44);
        }
        field5444++;
        return this.field5447[arg0].field1646;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(Z)V")
    public static void method2445(boolean arg0) {
        if (!arg0) {
            field5449 = null;
        }
        field5449 = null;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)Z")
    public final boolean method2446(byte arg0) {
        field5446++;
        if (this.field5447 != null) {
            return true;
        }
        if (this.field5450 == null) {
            if (!class212.field3003.method638(this.field5452, (byte) -62)) {
                return false;
            }
            int[] var2 = class212.field3003.method634(this.field5452, (byte) -121);
            this.field5450 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field5450[var3] = class212.field3003.method643(this.field5452, var2[var3], true);
            }
        }
        boolean var4 = true;
        if (arg0 > -114) {
            return false;
        }
        for (int var5 = 0; var5 < this.field5450.length; var5++) {
            byte[] var14 = this.field5450[var5];
            int var15 = var14[0] & 0xFF << 8 | var14[1] & 0xFF;
            var4 &= class84.field1070.method660(var15, (byte) -91);
        }
        if (!var4) {
            return false;
        }
        class442 var6 = new class442();
        int var7 = class212.field3003.method651(0, this.field5452);
        this.field5447 = new class124[var7];
        int[] var8 = class212.field3003.method634(this.field5452, (byte) -127);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field5450[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class23 var12 = null;
            for (class23 var13 = (class23) var6.method2752(-99); var13 != null; var13 = (class23) var6.method2754(-1)) {
                if (var13.field281 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class23(var11, class84.field1070.method645((byte) 80, var11));
                var6.method2756(-90, var12);
            }
            this.field5447[var8[var9]] = new class124(var10, var12);
        }
        this.field5450 = null;
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Z")
    public final boolean method2447(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field5447 = null;
        }
        field5448++;
        return this.field5447[arg0].field1657;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
    public class385(int arg0) {
        this.field5452 = arg0;
    }

    static {
        new class349(" days.", " Tage.", " jours.", " dias.");
        field5451 = -1;
    }
}
