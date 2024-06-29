import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class76 implements class297 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Ljl;")
    public static class53 field1237 = new class53();

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Z")
    public static boolean field1241 = false;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lvh;")
    public static class108 field1236;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method462(int arg0) {
        field1237 = null;
        field1236 = null;
        if (arg0 != 16208) {
            field1237 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public static final void method463(int arg0, int arg1) {
        field1242++;
        class96.field1651.method63(0, arg0);
        if (arg1 != 4) {
            method462(48);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IJ[IB)Ljava/lang/String;")
    public final String method464(int arg0, long arg1, int[] arg2, byte arg3) {
        field1238++;
        int var6 = 80 % ((arg3 - 50) / 42);
        if (arg0 == 0) {
            class127 var7 = class135.method946(8792, arg2[0]);
            return var7.method868((int) arg1, -4);
        } else if (arg0 == 1 || arg0 == 10) {
            class199 var8 = class203.method1346(-1, (int) arg1);
            return var8.field3216;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class135.method946(8792, arg2[0]).method868((int) arg1, -4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static final void method465(int arg0) {
        field1243++;
        if (class156.field2613 == null || class42.field620 == null) {
            class42.field620 = new int[256];
            class156.field2613 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class156.field2613[var1] = (int) (Math.sin(var2) * 4096.0D);
                class42.field620[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 <= 63) {
            method465(67);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBIII)V")
    public static final void method466(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1240++;
        class55 var5 = class62.method395(4, arg4, (byte) -66);
        var5.method340((byte) -110);
        var5.field954 = arg2;
        var5.field947 = arg3;
        var5.field953 = arg0;
        if (arg1 != 86) {
            method463(-115, 66);
        }
    }
}
