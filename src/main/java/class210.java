import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class210 extends class173 {

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2752;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Ljv;")
    public static class606 field2753 = new class606(4, 1);

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field2751;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field2754;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public final void method1313(int arg0) {
        field2748++;
        if (arg0 >= 57) {
            this.field2752.method1536();
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lwk;B)V")
    public static final void method1314(class192 arg0, byte arg1) {
        field2750++;
        if (class145.field1841 == null) {
            return;
        }
        class289 var2 = null;
        if (arg0.field2494 == 0) {
            var2 = (class289) class147.method997(arg0.field2496, arg0.field2493, arg0.field2487);
        }
        if (arg1 >= -19) {
            method1316(90, 52, (char) 65478);
        }
        if (arg0.field2494 == 1) {
            var2 = (class289) class7.method44(arg0.field2496, arg0.field2493, arg0.field2487);
        }
        if (arg0.field2494 == 2) {
            var2 = (class289) class609.method3354(arg0.field2496, arg0.field2493, arg0.field2487, field2754 == null ? (field2754 = method1318("dda")) : field2754);
        }
        if (arg0.field2494 == 3) {
            var2 = (class289) class618.method3391(arg0.field2496, arg0.field2493, arg0.field2487);
        }
        if (var2 == null) {
            arg0.field2498 = -1;
            arg0.field2499 = 0;
            arg0.field2495 = 0;
        } else {
            arg0.field2498 = var2.method130(-5582);
            arg0.field2499 = var2.method128((byte) 60);
            arg0.field2495 = var2.method126(20377);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method1315(int arg0) {
        field2751++;
        String var1 = "www";
        if (class375.field5396 == class164.field2067) {
            var1 = "www-wtrc";
        } else if (class577.field7972 == class375.field5396) {
            var1 = "www-wtqa";
        } else if (class375.field5396 == class335.field4924) {
            var1 = "www-wtwip";
        }
        if (arg0 != 0) {
            method1315(-4);
        }
        String var2 = "";
        if (class613.field8363 != null) {
            var2 = "/p=" + class613.field8363;
        }
        return "http://" + var1 + "." + class33.field322.field6548 + ".com/l=" + class350.field5121 + "/a=" + class625.field8511 + var2 + "/";
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIC)I")
    public static final int method1316(int arg0, int arg1, char arg2) {
        field2747++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        if (arg0 != 14088) {
            method1314(null, (byte) 23);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
    public static void method1317(byte arg0) {
        field2753 = null;
        if (arg0 >= -12) {
            method1317((byte) -122);
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I)V")
    public class210(int arg0) {
        this.field2752 = new NativeHeap(arg0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1318(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
