import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class278 {

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "J")
    public long field3843;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "Loia;")
    private class97 field3844;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "Lot;")
    public static class617 field3845 = new class617(0);

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "[[[B")
    public static byte[][][] field3848;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public static void method1785(int arg0) {
        int var1 = 95 / ((-arg0 - 19) / 48);
        field3845 = null;
        field3848 = null;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "()V")
    public static final void method1786() {
        if (class224.field3279 != null) {
            for (int var0 = 0; var0 < class224.field3279.length; var0++) {
                for (int var1 = 0; var1 < class441.field5980; var1++) {
                    for (int var2 = 0; var2 < class375.field5083; var2++) {
                        if (class224.field3279[var0][var1][var2] != null) {
                            class224.field3279[var0][var1][var2].method3083((byte) -101);
                        }
                        class224.field3279[var0][var1][var2] = null;
                    }
                }
            }
        }
        class224.field3279 = null;
        class142.field2418 = null;
        if (class1.field1 != null) {
            for (int var3 = 0; var3 < class1.field1.length; var3++) {
                for (int var4 = 0; var4 < class441.field5980; var4++) {
                    for (int var5 = 0; var5 < class375.field5083; var5++) {
                        if (class1.field1[var3][var4][var5] != null) {
                            class1.field1[var3][var4][var5].method3083((byte) -106);
                        }
                        class1.field1[var3][var4][var5] = null;
                    }
                }
            }
        }
        class1.field1 = null;
        class178.field2805 = null;
        class325.field4448 = null;
        class745.field10286 = null;
        class641.field8883 = null;
        class657.field9097 = null;
        class534.field7232 = null;
        class580.field8201 = null;
        class686.field9545 = null;
        class85.method681(18);
        if (class22.field466 != null) {
            for (int var6 = 0; var6 < class171.field2726; var6++) {
                class22.field466[var6] = null;
            }
            class171.field2726 = 0;
        }
        class451.field6179 = null;
        class684.field9523 = null;
        class265.field3738 = null;
        if (class222.field3246 != null) {
            for (int var7 = 0; var7 < class222.field3246.length; var7++) {
                class222.field3246[var7] = null;
            }
            class590.field8308 = 0;
        }
        if (class666.field9266 != null) {
            for (int var8 = 0; var8 < class666.field9266.length; var8++) {
                class666.field9266[var8] = null;
            }
            class28.field530 = 0;
        }
        if (class98.field1601 != null) {
            for (int var9 = 0; var9 < class155.field2534; var9++) {
                class98.field1601[var9] = null;
            }
            for (int var10 = 0; var10 < class62.field856; var10++) {
                for (int var11 = 0; var11 < class441.field5980; var11++) {
                    for (int var12 = 0; var12 < class375.field5083; var12++) {
                        class227.field3295[var10][var11][var12] = 0L;
                    }
                }
            }
            class155.field2534 = 0;
        }
        class203.method1453(26093);
        class677.field9437 = class677.field9436;
        class677.field9437.method2272(12);
        class603.field8438 = null;
        class625.field8717 = null;
        class240.field3420 = null;
        if (class34.field571 != null) {
            class25.method165();
            class112.field2107.method573(1);
            class112.field2107.method545(0);
        }
        if (class102.field1651 != null) {
            class102.field1651 = null;
        }
        class112.field2107 = null;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Loia;J[Lwja;)V")
    public class278(class97 arg0, long arg1, class283[] arg2) {
        this.field3843 = arg1;
        this.field3844 = arg0;
    }

    @OriginalMember(owner = "client!oca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3846++;
        this.field3844.method858(this.field3843, 1217792760);
        super.finalize();
    }
}
