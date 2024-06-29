import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class199 extends class259 {

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field2989 = 0;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "Z")
    public static boolean field2991 = false;

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
    public static int field3000 = 0;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "Lpk;")
    public static class237 field2994;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "Ljava/lang/String;")
    public String field2999;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "[C")
    public char[] field2988;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "[C")
    public char[] field2995;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "[I")
    public static int[] field2985;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "[I")
    public int[] field2987;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "[I")
    public int[] field2998;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V")
    public static void method1328(byte arg0) {
        field2994 = null;
        int var1 = -118 % ((27 - arg0) / 45);
        field2985 = null;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(B)V")
    public static final void method1329(byte arg0) {
        field2986++;
        class66.field1093 = false;
        class236.field3624 = -1;
        class51.field826 = 0;
        class111.field1693 = 0;
        class283.field4336 = 0;
        class45.field784 = 0;
        class59.field964.field887 = 0;
        field3000 = -1;
        class283.field4330 = -1;
        class8.field101 = 0;
        class125.field1847 = 0;
        class163.field2377 = -1;
        class173.field2543.field887 = 0;
        for (int var1 = 0; var1 < class166.field2438.length; var1++) {
            if (class166.field2438[var1] != null) {
                class166.field2438[var1].field430 = -1;
            }
        }
        int var2 = -13 / ((arg0 + 31) / 61);
        for (int var3 = 0; var3 < class243.field3762.length; var3++) {
            if (class243.field3762[var3] != null) {
                class243.field3762[var3].field430 = -1;
            }
        }
        class67.method535((byte) -118);
        class133.field1954 = 1;
        class88.method668(true, 30);
        for (int var4 = 0; var4 < 100; var4++) {
            class17.field315[var4] = true;
        }
        class36.method284(-127);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BC)I")
    public final int method1330(byte arg0, char arg1) {
        field2992++;
        if (this.field2998 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2998.length; var3++) {
            if (this.field2995[var3] == arg1) {
                return this.field2998[var3];
            }
        }
        int var4 = 74 / ((arg0 - 9) / 45);
        return -1;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
    public final void method1331(int arg0) {
        if (arg0 < 30) {
            this.field2995 = null;
        }
        field2996++;
        if (this.field2987 != null) {
            for (int var2 = 0; var2 < this.field2987.length; var2++) {
                this.field2987[var2] = class186.method1215(this.field2987[var2], 32768);
            }
        }
        if (this.field2998 != null) {
            for (int var3 = 0; var3 < this.field2998.length; var3++) {
                this.field2998[var3] = class186.method1215(this.field2998[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IC)I")
    public final int method1332(int arg0, char arg1) {
        field2997++;
        if (this.field2987 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field2987.length; var3++) {
            if (this.field2988[var3] == arg1) {
                return this.field2987[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lca;B)V")
    public final void method1333(class54 arg0, byte arg1) {
        if (arg1 <= 65) {
            return;
        }
        while (true) {
            int var3 = arg0.method407(255);
            if (var3 == 0) {
                field2993++;
                return;
            }
            this.method1334(var3, arg0, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILca;B)V")
    private final void method1334(int arg0, class54 arg1, byte arg2) {
        if (arg2 <= 10) {
            this.method1334(39, (class54) null, (byte) 34);
        }
        if (arg0 == 1) {
            this.field2999 = arg1.method439((byte) -106);
        } else if (arg0 == 2) {
            int var4 = arg1.method407(255);
            this.field2998 = new int[var4];
            this.field2995 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2998[var5] = arg1.method423(-93);
                byte var6 = arg1.method459(false);
                this.field2995[var5] = var6 == 0 ? 0 : class1.method1((byte) 19, var6);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method407(255);
            this.field2988 = new char[var7];
            this.field2987 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2987[var8] = arg1.method423(108);
                byte var9 = arg1.method459(false);
                this.field2988[var8] = var9 == 0 ? 0 : class1.method1((byte) 19, var9);
            }
        }
        field2990++;
    }
}
