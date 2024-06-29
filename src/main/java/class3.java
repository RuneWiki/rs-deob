import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[[[I")
    public static int[][][] field43 = new int[4][13][13];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)[Ld;")
    public static final class238[] method37(byte arg0) {
        class238[] var1 = new class238[class278.field4385];
        field42++;
        int var2 = 69 / ((31 - arg0) / 58);
        for (int var3 = 0; var3 < class278.field4385; var3++) {
            byte[] var4 = class145.field2332[var3];
            int var5 = class236.field3847[var3] * class148.field2385[var3];
            if (class139.field2276[var3]) {
                byte[] var8 = class211.field3447[var3];
                int[] var9 = new int[var5];
                for (int var10 = 0; var10 < var5; var10++) {
                    var9[var10] = class220.method1495(class194.field3113[class202.method1393(var4[var10], 255)], class202.method1393(var8[var10] << 24, -16777216));
                }
                var1[var3] = new class191(class27.field432, class155.field2513, class152.field2464[var3], class74.field1202[var3], class148.field2385[var3], class236.field3847[var3], var9);
            } else {
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = class194.field3113[class202.method1393(255, var4[var7])];
                }
                var1[var3] = new class37(class27.field432, class155.field2513, class152.field2464[var3], class74.field1202[var3], class148.field2385[var3], class236.field3847[var3], var6);
            }
        }
        class287.method1923(0);
        return var1;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    public static void method38(byte arg0) {
        field43 = null;
        int var1 = 54 % ((63 - arg0) / 53);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class3() {
        new class100();
    }
}
