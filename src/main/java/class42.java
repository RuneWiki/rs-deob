import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class42 {

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static volatile int field586 = 0;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "F")
    public static float field584;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Lkb;")
    public static class39 field588;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field582;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[[[B")
    public static byte[][][] field587;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V", line = 8)
    public static final void method289(int arg0, int arg1, int arg2) {
        int var3 = 67 % ((arg1 + 28) / 48);
        class29.field422[arg0] = arg2;
        field589++;
        class237 var4 = (class237) class241.field3833.method1743((long) arg0, (byte) -11);
        if (var4 == null) {
            class237 var5 = new class237(class304.method2128((byte) -86) + 500L);
            class241.field3833.method1750(var5, (byte) 121, (long) arg0);
        } else {
            var4.field3753 = class304.method2128((byte) -92) + 500L;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIB)Lnb;", line = 36)
    public static final class330 method290(int arg0, int arg1, byte arg2) {
        field581++;
        class330 var3 = new class330();
        for (class318 var4 = (class318) class225.field3581.method1746((byte) -33); var4 != null; var4 = (class318) class225.field3581.method1749((byte) 107)) {
            if (var4.field4935 && var4.method2214((byte) -78, arg0, arg1)) {
                var3.method2279(var4, (byte) -110);
            }
        }
        if (arg2 == -94) {
            return var3;
        } else {
            return (class330) null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 61)
    public static void method291(int arg0) {
        field582 = null;
        if (arg0 == 8822) {
            field588 = null;
            field587 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I", line = 73)
    public static final int method292(int arg0, int arg1) {
        field580++;
        if (arg0 < 0) {
            return 0;
        }
        class227 var2 = (class227) class164.field2664.method1743((long) arg0, (byte) -76);
        if (var2 == null) {
            return class204.method1500(2, arg0).field4176;
        }
        int var3 = 0;
        if (arg1 <= 41) {
            method291(16);
        }
        for (int var4 = 0; var4 < var2.field3606.length; var4++) {
            if (var2.field3606[var4] == -1) {
                var3++;
            }
        }
        return var3 + class204.method1500(2, arg0).field4176 - var2.field3606.length;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 120)
    public static final void method293(byte arg0) {
        field585++;
        int var1 = -13 / ((arg0 + 63) / 53);
        class56.field737.method1623(1);
    }
}
