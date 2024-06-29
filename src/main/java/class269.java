import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class269 extends class242 {

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "[I")
    public static int[] field3349 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "[[[I")
    public static int[][][] field3348;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1583(int arg0) {
        field3349 = null;
        if (arg0 != -1) {
            method1583(100);
        }
        field3348 = null;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public static final void method1584(int arg0) {
        class531.method2980(class639.field9075.field6797, arg0 ^ 0xFFFFFFFB);
        field3345++;
        int var1 = (class516.field7360 >> 12) + (class26.field245 >> 3);
        class169.field1888 = class362.field4859.field5166 = 0;
        int var2 = (class689.field9698 >> 12) + (class231.field2860 >> 3);
        class362.field4859.method1403(8, -41, 8);
        byte var3 = 18;
        class254.field3181 = new int[var3];
        class684.field9647 = new int[var3];
        class676.field9404 = new int[var3];
        class338.field4249 = new byte[var3][];
        class248.field3079 = new byte[var3][];
        class212.field2576 = new int[var3];
        class314.field3909 = new byte[var3][];
        class306.field3784 = new int[var3];
        class80.field835 = new int[var3][4];
        class400.field5385 = new byte[var3][];
        class222.field2746 = new byte[var3][];
        class383.field5177 = new int[var3];
        int var4 = 0;
        if (arg0 != -1) {
            field3349 = null;
        }
        for (int var5 = (var1 - (class142.field1574 >> 4)) / 8; var5 <= (((class142.field1574 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class140.field1550 >> 4)) / 8; var8 <= (((class140.field1550 >> 4) + var2) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class306.field3784[var4] = var9;
                class383.field5177[var4] = class280.field3475.method3875("m" + var5 + "_" + var8, (byte) -122);
                class684.field9647[var4] = class280.field3475.method3875("l" + var5 + "_" + var8, (byte) -81);
                class254.field3181[var4] = class280.field3475.method3875("n" + var5 + "_" + var8, (byte) -113);
                class212.field2576[var4] = class280.field3475.method3875("um" + var5 + "_" + var8, (byte) -101);
                class676.field9404[var4] = class280.field3475.method3875("ul" + var5 + "_" + var8, (byte) -106);
                if (class254.field3181[var4] == -1) {
                    class383.field5177[var4] = -1;
                    class684.field9647[var4] = -1;
                    class212.field2576[var4] = -1;
                    class676.field9404[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class254.field3181.length; var6++) {
            class254.field3181[var6] = -1;
            class383.field5177[var6] = -1;
            class684.field9647[var6] = -1;
            class212.field2576[var6] = -1;
            class676.field9404[var6] = -1;
        }
        byte var7;
        if (class421.field5601 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class256.method1517((byte) 39, var7, var1, false, var2);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public static final void method1585(boolean arg0) {
        field3347++;
        for (int var1 = 0; var1 < 5; var1++) {
            class689.field9699[var1] = false;
        }
        class157.field1752 = class505.field7273;
        class510.field7319 = -1;
        class307.field3791 = -1;
        if (arg0) {
            return;
        }
        class139.field1539 = class516.field7360;
        class538.field7572 = 5;
        class684.field9646 = class44.field432;
        class475.field6842 = 0;
        class597.field8414 = -1;
        class358.field4797 = -1;
        class649.field9139 = 0;
        class181.field2034 = class678.field9539;
        class19.field158 = class689.field9698;
        class554.field7917 = class485.field6986;
    }
}
