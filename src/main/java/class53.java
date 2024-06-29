import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class53 extends class239 {

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "Ltm;")
    public static class112 field871 = new class112("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!rn", name = "S", descriptor = "I")
    public static int field874 = 0;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!rn", name = "T", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!rn", name = "U", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!rn", name = "Q", descriptor = "Lnk;")
    public class18 field872;

    @OriginalMember(owner = "client!rn", name = "R", descriptor = "[B")
    public byte[] field873;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "(I)[B")
    public final byte[] method414(int arg0) {
        ++field869;
        if (arg0 != 0) {
            return null;
        } else if (super.field3373) {
            throw new RuntimeException();
        } else {
            return this.field873;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lfc;B)I")
    public static final int method415(class343 arg0, byte arg1) {
        ++field876;
        if (arg1 > -6) {
            field874 = 2;
        }
        int var2 = 0;
        if (arg0.method2034(class289.field3980, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class357.field4989, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class174.field2566, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class440.field6041, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class122.field1701, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class460.field6472, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class19.field318, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class346.field4728, -28758)) {
            ++var2;
        }
        if (arg0.method2034(client.field5503, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class361.field5043, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class135.field1888, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class411.field5704, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class301.field4126, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class396.field5560, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class33.field525, -28758)) {
            ++var2;
        }
        if (arg0.method2034(class136.field1925, -28758)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "(I)V")
    public static void method416(int arg0) {
        field871 = null;
        if (arg0 != -5913) {
            method416(-83);
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)I")
    public final int method417(byte arg0) {
        int var2 = 82 % ((-9 - arg0) / 56);
        ++field875;
        return super.field3373 ? 0 : 100;
    }
}
