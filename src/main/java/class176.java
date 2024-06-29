import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class176 extends class503 {

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "Lgia;")
    public static class285 field2341 = new class285("game4", "Game 4", 3);

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "I")
    public static int field2350 = 0;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "Lib;")
    public static class164 field2349 = new class164("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!dfa", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field2353 = new String[200];

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "Lwea;")
    public class167 field2347;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "Luu;")
    public static class303 field2342;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "Laj;")
    public static class333 field2352;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "Z")
    public boolean field2340;

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "[Ltaa;")
    public class431[] field2345;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "[[I")
    public static int[][] field2351;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method1241(int arg0, int arg1, int arg2, class65 arg3) {
        if (arg1 != 5) {
            method1242((byte) -99);
        }
        field2344++;
        int var5 = this.field2347.method1205(true);
        if (this.field2345 != null) {
            for (int var6 = 0; var6 < this.field2345.length; var6++) {
                this.field2345[var6].field6121 <<= var5;
                if (this.field2345[var6].method2622(arg0, arg2) && this.field2347.method33(4161, arg2, arg0, arg3)) {
                    this.field2345[var6].field6121 >>= var5;
                    return true;
                }
                this.field2345[var6].field6121 >>= var5;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(B)V")
    public static void method1242(byte arg0) {
        field2341 = null;
        field2352 = null;
        field2353 = null;
        if (arg0 == 6) {
            field2351 = null;
            field2342 = null;
            field2349 = null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIBI)V")
    public static final void method1243(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= -117) {
            field2342 = null;
        }
        field2348++;
        int var4 = class712.field9959.field1303.method3352(96) * arg1 >> 8;
        if (var4 == 0 || arg0 == -1) {
            return;
        }
        if (!class645.field8963 && class757.field10503 != -1 && class274.method1784(-96) && !class437.method2635((byte) 124)) {
            class476.field6616 = class156.method1151(-86);
            class751 var5 = class466.method2754(class476.field6616, -127);
            class706.method3961(var5, 36, true);
        }
        class543.method3091(false, arg0, var4, 0, class183.field2444, (byte) -65);
        class186.method1293(0, -1, 255);
        class645.field8963 = true;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1244(String arg0, String arg1, int arg2, String arg3) {
        field2343++;
        if (arg2 != -8560) {
            method1242((byte) 94);
        }
        for (int var4 = arg1.indexOf(arg3); var4 != -1; var4 = arg1.indexOf(arg3, arg0.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg0 + arg1.substring(arg3.length() + var4);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)Z")
    public static final boolean method1245(int arg0) {
        field2346++;
        if (class299.field4335) {
            try {
                class623.method3414(class735.field10183, "showVideoAd", (byte) 120);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -28747) {
            method1243(4, 100, (byte) 30, 42);
        }
        return false;
    }
}
