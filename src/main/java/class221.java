import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class class221 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lsea;")
    public static class648 field3091;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Lhm;", line = 6)
    public static final class202 method1401(int arg0, int arg1) {
        field3090++;
        if (arg1 != 25200) {
            field3091 = null;
        }
        class202[] var2 = class328.method1954(arg1 - 25177);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class202 var4 = var2[var3];
            if (var4.field2851 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 35)
    public static final void method1402(int arg0) {
        if (class228.field3168 < 1024.0F) {
            class228.field3168 = 1024.0F;
        }
        field3092++;
        if (class228.field3168 > 3072.0F) {
            class228.field3168 = 3072.0F;
        }
        while (class705.field9964 >= 16384.0F) {
            class705.field9964 -= 16384.0F;
        }
        while (class705.field9964 < 0.0F) {
            class705.field9964 += 16384.0F;
        }
        int var1 = class10.field93 >> 9;
        int var2 = class476.field6552 >> 9;
        int var3 = class249.method1533(class367.field4944, class476.field6552, class10.field93, -21);
        int var4 = 0;
        if (~var1 < arg0 && var2 > 3 && var1 < (class401.field5620 - 4) && var2 < (class257.field3508 - 4)) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class367.field4944;
                    if (var7 < 3 && class467.method2640(var5, var6, (byte) -110)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class138.field1953.field3983 != null && class138.field1953.field3983[var7] != null) {
                        var8 = (class138.field1953.field3983[var7][var5][var6] & 0xFF) * 8;
                    }
                    if (class409.field5812 != null && class409.field5812[var7] != null) {
                        int var9 = var8 - (class409.field5812[var7].method332(var6, 1, var5) - var3);
                        if (var4 < var9) {
                            var4 = var9;
                        }
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class604.field8405 < var10) {
            class604.field8405 += (var10 - class604.field8405) / 24;
        } else if (class604.field8405 > var10) {
            class604.field8405 += (var10 - class604.field8405) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V", line = 125)
    public static void method1403(byte arg0) {
        if (arg0 != -53) {
            field3091 = null;
        }
        field3091 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Lfga;")
    public abstract class231 method846(byte arg0);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)I")
    public abstract int method844(int arg0, int arg1);

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)V")
    public abstract void method852(int arg0, int arg1);

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(II)[B")
    public abstract byte[] method849(int arg0, int arg1);
}
