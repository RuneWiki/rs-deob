import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class316 extends class111 {

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field4628 = 0;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public int field4629;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public int field4630;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "Lkm;")
    public class198 field4636;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[Lrh;")
    public class144[] field4631;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[B)[B", line = 3)
    public static final byte[] method2106(int arg0, byte[] arg1) {
        field4638++;
        class130 var2 = new class130(arg1);
        int var3 = var2.method837(true);
        int var4 = var2.method815(true);
        if (~var4 > arg0 || !(class318.field4663 == 0 || var4 <= class318.field4663)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method853(0, var4, var7, true);
            return var7;
        } else {
            int var5 = var2.method815(true);
            if (var5 < 0 || class318.field4663 != 0 && var5 > class318.field4663) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class343.method2248(var6, var5, arg1, var4, 9);
            } else {
                class259.field3834.method444(arg0 ^ 0x4C, var2, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V", line = 55)
    public static final void method2107(int arg0, int arg1) {
        if (arg0 != 0) {
            field4635 = 67;
        }
        field4644++;
        class270.field3938 = arg1;
        class419.field6011.method102((byte) -119);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILvq;I)Z", line = 70)
    public final boolean method2108(int arg0, int arg1, class269 arg2, int arg3) {
        field4642++;
        if (this.field4631 != null) {
            for (int var5 = 0; var5 < this.field4631.length; var5++) {
                if (this.field4631[var5].method1069(arg1, arg0) && this.field4636.method16(arg2, arg1, arg0, (byte) 77)) {
                    return true;
                }
            }
        }
        return arg3 != 20975;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Lrj;", line = 101)
    public static final class354 method2109(byte arg0, int arg1) {
        field4632++;
        class354 var2 = (class354) class241.field3562.method99(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -95) {
            field4641 = -29;
        }
        byte[] var3 = class70.field929.method643(26, arg1, true);
        class354 var4 = new class354();
        if (var3 != null) {
            var4.method2319(new class130(var3), -121);
        }
        class241.field3562.method90(var4, (long) arg1, 0);
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 126)
    public static final void method2110(int arg0) {
        field4634++;
        if (arg0 != 0) {
            return;
        }
        for (class117 var1 = (class117) class288.field4198.method1075((byte) -49); var1 != null; var1 = (class117) class288.field4198.method1075((byte) -49)) {
            class347.method2277(var1, (byte) -90);
        }
        client.method1181();
        client.method1188();
        client.method1183();
        client.method1169();
        client.method1189();
        client.method1190();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZILbr;)V", line = 151)
    public static final void method2111(int arg0, boolean arg1, int arg2, class223 arg3) {
        field4639++;
        if (class327.field4749 != null || class359.field5185 || arg3 == null || class59.method391((byte) 44, arg3) == null) {
            return;
        }
        class327.field4749 = arg3;
        class363.field5212 = class59.method391((byte) 91, arg3);
        class13.field186 = 0;
        class94.field1197 = arg1;
        class129.field1817 = arg0;
        class447.field6384 = arg2;
    }
}
