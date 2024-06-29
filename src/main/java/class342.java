import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class342 {

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field5118 = 0;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public int field5117;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public int field5119;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public int field5120;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method2088(boolean arg0, String arg1, int arg2) {
        field5113++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        if (arg2 != -1) {
            method2088(true, (String) null, 96);
        }
        int var7 = var6 + (arg0 ? class6.field72 : class142.field1905);
        for (int var8 = var6; var8 < var7; var8++) {
            class402 var11 = class75.method495((byte) -10, var8);
            if (var11.field5987 && var11.method2534(80).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class411.field6117 = null;
                    class90.field1279 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class90.field1279 = var5;
        class411.field6117 = var4;
        class337.field5019 = 0;
        String[] var9 = new String[class90.field1279];
        for (int var10 = 0; var10 < class90.field1279; var10++) {
            var9[var10] = class75.method495((byte) -10, var4[var10]).method2534(80);
        }
        class184.method1122((byte) 53, class411.field6117, var9);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Z")
    public final boolean method2089(byte arg0) {
        field5114++;
        int var2 = -79 / ((arg0 + 60) / 55);
        return (this.field5117 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lkq;B)V")
    public static final void method2090(class70 arg0, byte arg1) {
        field5122++;
        arg0.field901 = null;
        int var2 = arg0.field899.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field899[var3].field2200 = false;
        }
        int var4 = -58 / ((-arg1 - 55) / 41);
        class354[] var5 = class292.field4454;
        synchronized (class292.field4454) {
            if (var2 < class292.field4454.length && class280.field4288[var2] < 200) {
                class292.field4454[var2].method2125(arg0, -29983);
                int var10002 = class280.field4288[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Z")
    public final boolean method2091(int arg0) {
        field5123++;
        if (arg0 != 32768) {
            this.method2091(37);
        }
        return (this.field5117 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)Z")
    public final boolean method2092(byte arg0) {
        field5116++;
        int var2 = -34 % ((-arg0 - 11) / 45);
        return (this.field5117 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Z")
    public final boolean method2093(int arg0) {
        if (arg0 > -92) {
            field5118 = -16;
        }
        field5121++;
        return (this.field5117 & 0x4) != 0;
    }
}
