import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class45 {

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "Z")
    public static boolean field547 = false;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "S")
    public static short field545 = 320;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "Z")
    public static boolean field542 = false;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Llm;")
    public class45 field537;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Llm;")
    public class45 field546;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lsc;III)V")
    public static final void method250(class248 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class231.field3748) {
            class113 var4 = class184.field2892[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1650 != null && var4.field1650.field856.method908()) {
                arg0.method893(var4.field1650.field856, 128, 0, 0, true);
            }
        }
        if (arg3 < class231.field3748) {
            class113 var5 = class184.field2892[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1650 != null && var5.field1650.field856.method908()) {
                arg0.method893(var5.field1650.field856, 0, 0, 128, true);
            }
        }
        if (arg2 < class231.field3748 && arg3 < class175.field2759) {
            class113 var6 = class184.field2892[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1650 != null && var6.field1650.field856.method908()) {
                arg0.method893(var6.field1650.field856, 128, 0, 128, true);
            }
        }
        if (arg2 < class231.field3748 && arg3 > 0) {
            class113 var7 = class184.field2892[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1650 != null && var7.field1650.field856.method908()) {
                arg0.method893(var7.field1650.field856, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
    public static final void method251(int arg0, int arg1) {
        field540++;
        class181 var2 = class95.method652(arg0, (byte) 34, arg1);
        var2.method1283(192);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public final void method252(int arg0) {
        field544++;
        if (this.field537 == null) {
            return;
        }
        this.field537.field546 = this.field546;
        this.field546.field537 = this.field537;
        this.field546 = null;
        int var2 = 58 % ((arg0 - 42) / 39);
        this.field537 = null;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
    public static final void method253(int arg0) {
        if (arg0 != 18408) {
            method253(-85);
        }
        for (class104 var1 = (class104) class115.field1674.method1065((byte) -59); var1 != null; var1 = (class104) class115.field1674.method1066(-123)) {
            int var2 = var1.field1511;
            if (class190.method1322(var2, (byte) 97)) {
                class231[] var3 = class68.field1018[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field3585;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field4018;
                    class231 var7 = class201.method1398(var6, 0);
                    if (var7 != null) {
                        class247.method1761(var7, (byte) -117);
                    }
                }
            }
        }
        field539++;
    }
}
