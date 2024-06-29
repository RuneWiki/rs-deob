import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 {

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "J")
    public long field159 = 0L;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field155 = -1;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "J")
    public static volatile long field161 = 0L;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Lhc;")
    public static class235 field154;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lji;")
    public class43 field149;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lji;")
    public class43 field156;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Z")
    public static boolean field160;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method65(String arg0, int arg1) {
        field152++;
        int var2 = 44 % ((arg1 - 62) / 60);
        return class245.method1688(arg0, 10, true, (byte) 124);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)V")
    public static final void method66(int arg0, byte arg1) {
        if (arg1 != 11) {
            method67((byte) -39);
        }
        class250.field4038 = -1;
        class201.field3148 = arg0;
        class250.field4038 = -1;
        field151++;
        class56.method427(arg1 ^ 0x35);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method67(byte arg0) {
        field154 = null;
        int var1 = -82 / ((arg0 - 62) / 52);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
    public static final void method68() {
        for (int var0 = 0; var0 < class160.field2480; var0++) {
            class293 var1 = class199.field3125[var0];
            class58.method441(var1);
            class199.field3125[var0] = null;
        }
        class160.field2480 = 0;
    }
}
