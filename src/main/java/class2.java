import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class113 {

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "[Lka;")
    public class90[] field28;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "Lcd;")
    public static class23 field15 = class54.method414("rect_debug=", -1);

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "Lcd;")
    public static class23 field19 = class54.method414(" x ", -1);

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "Lcd;")
    private static class23 field20 = class54.method414("Hidden", -1);

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "Lcd;")
    public static class23 field18 = class54.method414("titlebox", -1);

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "Lcd;")
    public static class23 field26 = field20;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "Lvd;")
    public static class192 field25;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "Lkh;")
    public static class97 field23;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLkh;)V")
    public static final void method7(byte arg0, class97 arg1) {
        if (arg0 == 27) {
            field17++;
            class39.field815 = arg1;
            class43.field916 = class39.field815.method660(arg0 + 93, 16);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field19 = null;
        field20 = null;
        field26 = null;
        field23 = null;
        field25 = null;
        field15 = null;
        field18 = null;
        int var1 = -128 / ((-arg0 - 14) / 47);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
    public final boolean method9(int arg0, int arg1) {
        if (arg1 > -36) {
            method7((byte) -109, null);
        }
        field22++;
        return this.field28[arg0].field1934;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
    public static final void method10(int arg0, int arg1) {
        field16++;
        class191 var2 = (class191) class204.field4021.method260((long) arg0, (byte) 28);
        if (var2 != null) {
            for (int var3 = arg1; var3 < var2.field3790.length; var3++) {
                var2.field3790[var3] = -1;
                var2.field3786[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lkh;ILcd;Lcd;)Loe;")
    public static final class130 method11(class97 arg0, int arg1, class23 arg2, class23 arg3) {
        field27++;
        int var4 = 42 / ((arg1 - 59) / 40);
        int var5 = arg0.method647((byte) -74, arg2);
        int var6 = arg0.method642(var5, (byte) -112, arg3);
        return class110.method711(-118, var6, var5, arg0);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lkh;Lkh;IZ)V")
    public class2(class97 arg0, class97 arg1, int arg2, boolean arg3) {
        class25 var5 = new class25();
        int var6 = arg0.method660(-99, arg2);
        this.field28 = new class90[var6];
        int[] var7 = arg0.method644(arg2, (byte) 119);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method651(4, var7[var8], arg2);
            int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            class61 var11 = null;
            for (class61 var12 = (class61) var5.method188((byte) 54); var12 != null; var12 = (class61) var5.method185((byte) -102)) {
                if (var12.field1416 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method654(0, var10, 0);
                } else {
                    var13 = arg1.method654(0, 0, var10);
                }
                var11 = new class61(var10, var13);
                var5.method186(var11, -26692);
            }
            this.field28[var7[var8]] = new class90(var9, var11);
        }
    }
}
