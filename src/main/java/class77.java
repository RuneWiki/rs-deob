import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class77 extends class62 {

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "[B")
    public byte[] field1197;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "Lbf;")
    public static class202 field1198 = new class202(64);

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "[I")
    public static int[] field1203 = new int[200];

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field1205 = 0;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Leg;")
    public static class37 field1204 = class174.method1167("document)3cookie=(R", 122);

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "Leg;")
    public static class37 field1206 = class174.method1167("<col=ffffff>", -69);

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "Leg;")
    public static class37 field1207 = class174.method1167("Impossible de trouver ", -123);

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
    public class77(byte[] arg0) {
        this.field1197 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBI)I")
    public static final int method525(int arg0, byte arg1, int arg2) {
        field1199++;
        if (arg1 != -104) {
            method526(false);
        }
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static void method526(boolean arg0) {
        field1198 = null;
        field1204 = null;
        if (arg0) {
            method525(-103, (byte) 90, 110);
        }
        field1203 = null;
        field1207 = null;
        field1206 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public static final void method527(byte arg0) {
        if (class111.field1854 == null || class43.field676 == null) {
            class43.field676 = new int[256];
            class111.field1854 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var3 = (double) var1 / 255.0D * 6.283185307179586D;
                class111.field1854[var1] = (int) (Math.sin(var3) * 4096.0D);
                class43.field676[var1] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        int var2 = -7 / ((32 - arg0) / 55);
        field1200++;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)V")
    public static final void method528(int arg0, int arg1) {
        class181.field3033.method1402((byte) -66, arg1);
        field1201++;
        class160.field2671.method1402((byte) -69, arg1);
        if (arg0 != 9232) {
            field1205 = -9;
        }
    }
}
