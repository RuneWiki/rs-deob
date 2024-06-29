import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class561 extends class418 {

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7367;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "Lkaa;")
    public static class47 field7362 = new class47(13, 8);

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
    public static int field7366 = 1339;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "Lhda;")
    public static class752 field7364 = new class752(59, 0);

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(Z)V", line = 3)
    public final void method3110(boolean arg0) {
        field7361++;
        this.field7367.method3731();
        if (arg0) {
            this.field7367 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(Z)V", line = 16)
    public static final void method3111(boolean arg0) {
        field7365++;
        class281.field3978 = class474.method2670(107, 0.4F, 8, 8, 4, 35, arg0, 2048);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V", line = 27)
    public static void method3112(byte arg0) {
        field7364 = null;
        if (arg0 <= 4) {
            field7366 = 80;
        }
        field7362 = null;
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)V", line = 44)
    public static final void method3113(byte arg0) {
        int var1 = 23 % ((-arg0 - 45) / 47);
        class475.field6519 = new String[500];
        class582.field7628 = class105.field1446.field7147 + class105.field1446.field7145 + 2;
        field7363++;
        class213.field3117 = class180.field2728.field7145 + class180.field2728.field7147 + 2;
        for (int var2 = 0; var2 < class475.field6519.length; var2++) {
            class475.field6519[var2] = "";
        }
        class710.method3991(class517.field6840.method2877(class713.field9854, (byte) -108), (byte) 126);
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(I)V", line = 72)
    public class561(int arg0) {
        this.field7367 = new NativeHeap(arg0);
    }
}
