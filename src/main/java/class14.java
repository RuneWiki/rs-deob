import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class14 {

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "[Lpp;")
    public static class38[] field150 = new class38[1024];

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field149 = 0;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field151 = 0;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILhw;I)V")
    public static final void method79(int arg0, class208 arg1, int arg2) {
        if (arg2 >= -20) {
            method81(-17);
        }
        field148++;
        if (class320.field4981 == null) {
            return;
        }
        try {
            class320.field4981.method2589(0L, 0);
            class320.field4981.method2594(arg1.field3193, 24, arg0, -1);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lna;I)V")
    public static final void method80(class211 arg0, int arg1) {
        if (arg1 != 16) {
            field149 = 74;
        }
        if (class15.field162 == null) {
            class263 var2 = new class263();
            byte[] var3 = var2.method1806(16, 128, 128, (byte) -22);
            class15.field162 = class361.method2385(false, -29809, var3);
        }
        field152++;
        if (class221.field3737 == null) {
            class212 var4 = new class212();
            byte[] var5 = var4.method1579(128, 16, -64, 128);
            class221.field3737 = class361.method2385(false, -29809, var5);
        }
        class1 var6 = arg0.field3478;
        if (var6.method4(arg1 ^ 0x8B20) && class181.field2627 == null) {
            byte[] var7 = class122.method766(4.0F, 8, new class364(419684), 0.6F, 0.5F, 128, 4.0F, 0, 16, 16.0F, 128);
            class181.field2627 = class361.method2385(false, -29809, var7);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
    public static void method81(int arg0) {
        if (arg0 != 128) {
            method81(118);
        }
        field150 = null;
    }
}
