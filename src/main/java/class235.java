import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class235 {

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Lun;")
    public static class267 field3117 = null;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lmc;")
    public static class78 field3112 = new class78(42, -1);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()V")
    public static final void method1309() {
        if (class109.field1637 != null) {
            for (int var0 = 0; var0 < class109.field1637.length; var0++) {
                for (int var1 = 0; var1 < class143.field2058; var1++) {
                    for (int var2 = 0; var2 < class91.field1344; var2++) {
                        if (class109.field1637[var0][var1][var2] != null) {
                            class109.field1637[var0][var1][var2].method2865(77);
                        }
                        class109.field1637[var0][var1][var2] = null;
                    }
                }
            }
        }
        class109.field1637 = null;
        class289.field3896 = null;
        if (class308.field4077 != null) {
            for (int var3 = 0; var3 < class308.field4077.length; var3++) {
                for (int var4 = 0; var4 < class143.field2058; var4++) {
                    for (int var5 = 0; var5 < class91.field1344; var5++) {
                        if (class308.field4077[var3][var4][var5] != null) {
                            class308.field4077[var3][var4][var5].method2865(94);
                        }
                        class308.field4077[var3][var4][var5] = null;
                    }
                }
            }
        }
        class308.field4077 = null;
        class312.field4112 = null;
        class289.field3897 = null;
        class221.field2945 = null;
        class398.field5490 = 0;
        if (class123.field1800 != null) {
            for (int var6 = 0; var6 < class398.field5490; var6++) {
                class123.field1800[var6] = null;
            }
        }
        if (class480.field6635 != null) {
            for (int var7 = 0; var7 < class400.field5504; var7++) {
                class480.field6635[var7] = null;
            }
            class400.field5504 = 0;
        }
        if (class276.field3652 != null) {
            for (int var8 = 0; var8 < class162.field2259; var8++) {
                class276.field3652[var8] = null;
            }
            for (int var9 = 0; var9 < class142.field2056; var9++) {
                for (int var10 = 0; var10 < class143.field2058; var10++) {
                    for (int var11 = 0; var11 < class91.field1344; var11++) {
                        class132.field1943[var9][var10][var11] = 0L;
                    }
                }
            }
            class162.field2259 = 0;
        }
        class448.field6103 = null;
        class8.method49(30686);
        class32.field488.method2765(-15597);
        class56.field768 = null;
        class136.field1977 = null;
        class246.field3284 = null;
        class67.field913 = null;
        class132.field1937 = null;
        class95.field1404 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method1310(int arg0) {
        if (arg0 >= -31) {
            field3114 = -52;
        }
        field3112 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIB)I")
    public static final int method1311(int arg0, int arg1, byte arg2) {
        if (arg2 > -51) {
            field3112 = null;
        }
        field3113++;
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!oj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3116++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public static final void method1312(int arg0) {
        if (class429.field5844 != -1) {
            class408.method2454(false, -1, class429.field5844, -1, 0);
            class429.field5844 = -1;
        }
        if (arg0 >= 123) {
            field3118++;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I)V")
    public class235(int arg0) {
        this.field3115 = arg0;
    }
}
