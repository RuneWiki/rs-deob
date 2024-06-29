import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class653 extends class381 {

    @OriginalMember(owner = "client!kca", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9305;

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "Z")
    public static boolean field9302 = true;

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "Leba;")
    public static class550 field9301 = new class550(42, -1);

    @OriginalMember(owner = "client!kca", name = "t", descriptor = "I")
    public static int field9306 = 1;

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!kca", name = "r", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)Z")
    public static final boolean method3693(int arg0) {
        field9303++;
        try {
            if (class574.field7844 == 2) {
                if (class186.field2581 == null) {
                    class186.field2581 = class403.method2303(class285.field3762, class110.field1302, class401.field5322);
                    if (class186.field2581 == null) {
                        return false;
                    }
                }
                if (class307.field4110 == null) {
                    class307.field4110 = new class400(class215.field2828, class25.field318);
                }
                if (class16.field217.method289(class307.field4110, 22050, class186.field2581, -1, class174.field2475)) {
                    class16.field217.method275(29378);
                    if (class288.field3804 > 0) {
                        class574.field7844 = 3;
                        class16.field217.method286(208, 0);
                    } else {
                        class574.field7844 = 0;
                        class16.field217.method286(208, class174.field2461);
                    }
                    if (class542.field7429 > 0L) {
                        class16.field217.method302(false, class542.field7429, class111.field1339, class186.field2581, true);
                    } else {
                        class16.field217.method294(class186.field2581, arg0 ^ 0xFFFFFF8A, class111.field1339);
                    }
                    class307.field4110 = null;
                    class542.field7429 = 0L;
                    class285.field3762 = null;
                    class186.field2581 = null;
                    return true;
                }
            }
            if (arg0 != 0) {
                field9306 = 19;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class16.field217.method301((byte) 106);
            class307.field4110 = null;
            class285.field3762 = null;
            class574.field7844 = 0;
            class186.field2581 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(I)V")
    public class653(int arg0) {
        this.field9305 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
    public final void method3694(byte arg0) {
        field9304++;
        if (arg0 < 12) {
            method3693(56);
        }
        this.field9305.method3427();
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)V")
    public static void method3695(byte arg0) {
        field9301 = null;
        if (arg0 != -112) {
            method3693(81);
        }
    }
}
