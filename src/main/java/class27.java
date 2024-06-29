import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class class27 extends class162 {

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "Z")
    public volatile boolean field338 = true;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "Lec;")
    public static class25 field342 = new class25(5);

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "Ljava/lang/String;")
    public static String field347 = "Examine";

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "Z")
    public boolean field337;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "Z")
    public boolean field340;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "[[S")
    public static short[][] field345;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "[[[Lab;")
    public static class154[][][] field346;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V")
    public static final void method162(int arg0) {
        field339++;
        class109.field1671.method145(-96);
        if (arg0 == 0) {
            class219.field3502.method145(-84);
        }
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)I")
    public abstract int method163(int arg0);

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)[B")
    public abstract byte[] method164(int arg0);

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)V")
    public static void method165(int arg0) {
        field342 = null;
        field346 = null;
        field347 = null;
        if (arg0 != -3) {
            method165(-90);
        }
        field345 = null;
    }

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "(I)V")
    public static final void method166(int arg0) {
        field343++;
        int var1 = class120.field1847;
        int var2 = class248.field3950;
        int var3 = class307.field4997;
        int var4 = class307.field4990;
        int var5 = 6116423;
        int var6 = -69 / ((-arg0 - 72) / 48);
        class62.method380(var1, var2, var3, var4, var5);
        class62.method380(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class62.method389(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        class202.field3227.method744(class262.field4333, var1 + 3, var2 - -14, var5, -1);
        int var7 = class1.field1;
        int var8 = class60.field924;
        for (int var9 = 0; var9 < class18.field251; var9++) {
            int var10 = (class18.field251 - var9 - 1) * 15 + (var2 + 31);
            int var11 = 16777215;
            if (var7 > var1 && var7 < (var1 + var3) && var8 > (var10 - 13) && var8 < var10 + 3) {
                var11 = 16776960;
            }
            class202.field3227.method744(class11.method60(0, var9), var1 + 3, var10, var11, 0);
        }
        class311.method2112(class248.field3950, -128, class307.field4997, class307.field4990, class120.field1847);
    }
}
