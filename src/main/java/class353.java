import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class353 extends class42 {

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Lff;")
    public static class9 field4765 = new class9(108, 12);

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field4777 = 0;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public static int field4778 = 13156520;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public int field4767;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public int field4768;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public int field4769;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public int field4776;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "Lcr;")
    public class403 field4764;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Lcr;")
    public class403 field4770;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "Ljava/lang/String;")
    public String field4773;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Z")
    public boolean field4766;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field4772;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method2065(int arg0) {
        if (arg0 != -32322) {
            method2065(119);
        }
        field4765 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method2066(byte arg0, String arg1, boolean arg2) {
        class277.field3630.field6535 = 1;
        field4774++;
        if (arg0 != -29) {
            return;
        }
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class127.field1852.field5697; var6++) {
            class482 var9 = class127.field1852.method2390(35, var6);
            if ((!arg2 || var9.field6650) && var9.field6639 == -1 && var9.field6665 == -1 && var9.field6657 == 0 && var9.field6697.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class29.field491 = -1;
                    class215.field2897 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class215.field2897 = var4;
        class245.field3255 = 0;
        class29.field491 = var5;
        String[] var7 = new String[class29.field491];
        for (int var8 = 0; var8 < class29.field491; var8++) {
            var7[var8] = class127.field1852.method2390(arg0 + 133, var4[var8]).field6697;
        }
        class430.method2485(class215.field2897, (byte) -72, var7);
        class277.field3630.method2718(arg0 ^ 0xFFFFFF87);
        class277.field3630.field6535 = 2;
    }
}
