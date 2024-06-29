import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class319 extends class393 {

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field4839;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lnj;")
    public static class408 field4838 = new class408("LIVE", 0);

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "Lnv;")
    public static class44 field4845 = new class44();

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lza;")
    public static class299 field4840;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Ljq;")
    public static class370 field4844;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZB)V")
    public static final void method2112(boolean arg0, byte arg1) {
        if (arg0) {
            if (class134.field2010 != -1) {
                class52.method342(1, class134.field2010);
            }
            for (class295 var2 = (class295) class215.field3248.method359(true); var2 != null; var2 = (class295) class215.field3248.method365(-128)) {
                if (!var2.method949(1767)) {
                    var2 = (class295) class215.field3248.method359(true);
                    if (var2 == null) {
                        break;
                    }
                }
                class336.method2188(true, 1, false, var2);
            }
            class134.field2010 = -1;
            class215.field3248 = new class56(8);
            class71.method614((byte) 1);
            class134.field2010 = class338.field5078;
            class179.method1264(127, false);
            class80.method713(-14703);
            class152.method1094(class134.field2010);
        }
        field4841++;
        class215.field3256 = false;
        class240.field3598 = "";
        class490.field7159 = "";
        class43.method284(true);
        class282.field4402 = -1;
        class240.method1613(class33.field400, true);
        class116.field1781 = new class511();
        class116.field1781.field1279 = class250.field4077 * 128 / 2;
        int var3 = -6 / ((-arg1 - 10) / 49);
        class116.field1781.field7654[0] = class338.field5076 / 2;
        class116.field1781.field1275 = class338.field5076 * 128 / 2;
        class406.field5999 = 0;
        class128.field1917 = 0;
        class116.field1781.field7653[0] = class250.field4077 / 2;
        if (class33.field401 == 2) {
            class128.field1917 = class522.field7666 << 7;
            class406.field5999 = class457.field6795 << 7;
        } else {
            class442.method2730(118);
        }
        class483.method2912((byte) -50);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2113(String arg0, byte arg1) {
        field4843++;
        if (!class2.field17) {
            return;
        }
        boolean var2 = false;
        int var3 = -47 % ((-arg1 - 44) / 60);
        int var4 = class422.field6205;
        int[] var5 = class506.field7363;
        for (int var6 = 0; var6 < var4; var6++) {
            class511 var7 = class530.field7747[var5[var6]];
            if (var7 != null && class116.field1781 != var7 && var7.field7437 != null && var7.field7437.equalsIgnoreCase(arg0)) {
                class110.method857(4095, class47.field746);
                class37.field461++;
                class312.field4752.method1400(0, true);
                class312.field4752.method1348((byte) -65, class442.field6585);
                class312.field4752.method1364(class291.field4510, true);
                class312.field4752.method1386(true, class511.field7481);
                class312.field4752.method1364(var5[var6], true);
                var2 = true;
                class64.method432(-2, var7.method3045(0), (byte) 57, 0, var7.field7654[0], var7.method3045(0), true, var7.field7653[0], 0);
                break;
            }
        }
        if (!var2) {
            class492.method2961(0, class525.field7694.method1265(class345.field5141, -81) + arg0);
        }
        if (class2.field17) {
            class62.method415(false);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
    public class319(int arg0) {
        this.field4839 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V")
    public final void method2114(int arg0) {
        if (arg0 == 0) {
            this.field4839.method2922();
            field4846++;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static void method2115(byte arg0) {
        if (arg0 != -15) {
            field4840 = null;
        }
        field4838 = null;
        field4840 = null;
        field4845 = null;
        field4844 = null;
    }
}
