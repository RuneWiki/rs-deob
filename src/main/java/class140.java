import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class140 extends class179 {

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "I")
    public static int field2216 = 0;

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
    public static int field2218 = 0;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "Z")
    public static boolean field2215 = true;

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "[I")
    public static int[] field2226 = new int[4096];

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "Lue;")
    public static class131 field2217;

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "Ljava/lang/String;")
    public String field2220;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "[I")
    public int[] field2212;

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "[I")
    public int[] field2221;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "[Ljj;")
    public class156[] field2225;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "[Lof;")
    public static class421[] field2223;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field2227;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
    public static void method1125(int arg0) {
        field2223 = null;
        field2226 = null;
        if (arg0 != 31164) {
            method1127(-83);
        }
        field2217 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(JI)V")
    public static final void method1126(long arg0, int arg1) {
        if (class50.field816 != null) {
            if (class322.field4643 == 1 || class322.field4643 == 5) {
                class6.method44(arg0, (byte) 12);
            } else if (class322.field4643 == 2) {
                class315.method2126(0);
            } else if (class322.field4643 == 4) {
                class432.method2684((byte) -96, arg0);
            } else {
                class150.method1163(-13736);
            }
        }
        field2214++;
        class444.method2776((long) class267.field4002, class73.field1235, (byte) -83);
        if (class321.field4642 != -1) {
            class339.method2198((byte) 4, class321.field4642);
        }
        for (int var3 = 0; var3 < class32.field449; var3++) {
            if (class254.field3685[var3]) {
                class255.field3697[var3] = true;
            }
            class371.field5250[var3] = class254.field3685[var3];
            class254.field3685[var3] = false;
        }
        class423.field6169 = class267.field4002;
        if (class73.field1235.method707()) {
            class289.field4316 = true;
        }
        class369.field5235 = null;
        if (class321.field4642 != -1) {
            class32.field449 = 0;
            class129.method1086((byte) 71);
        }
        class73.field1235.method751();
        class292.method2043(-1, class73.field1235);
        int var4 = class191.method1476(true);
        if (var4 == -1) {
            var4 = class206.field3027;
        }
        class58.method449(89, var4);
        class422.method2651(class86.field1394.field6519, (byte) -62, class367.field5213, class86.field1394.field6520, class409.field5967);
        class409.field5967 = arg1;
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V")
    public static final void method1127(int arg0) {
        if (class193.field2851 != null) {
            class365 var1 = class193.field2851;
            synchronized (class193.field2851) {
                class193.field2851 = null;
            }
        }
        field2211++;
        if (arg0 != 0) {
            method1125(116);
        }
    }
}
