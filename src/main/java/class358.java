import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class358 {

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "[[Z")
    public static boolean[][] field4855 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "B")
    public byte field4850;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "B")
    public byte field4852;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "B")
    public byte field4853;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "B")
    public byte field4859;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "B")
    public byte field4861;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "B")
    public byte field4865;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "B")
    public byte field4869;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Lhh;")
    public static class430 field4866;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "S")
    public short field4864;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Z")
    public boolean field4848;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Z")
    public boolean field4849;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Z")
    public boolean field4851;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Z")
    public boolean field4854;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Z")
    public boolean field4856;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Z")
    public boolean field4857;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Z")
    public boolean field4860;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "Z")
    public boolean field4862;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Z")
    public boolean field4868;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "[I")
    public static int[] field4867;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method2264(int arg0) {
        field4867 = null;
        int var1 = -60 / ((arg0 - 15) / 33);
        field4866 = null;
        field4855 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIILsl;)V")
    public static final void method2265(int arg0, int arg1, int arg2, class388 arg3) {
        if (class347.field4722[arg0][arg1][arg2] == null) {
            class75.method443(arg0, arg1, arg2);
        }
        class347.field4722[arg0][arg1][arg2].field4255 = arg3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static final void method2266(byte arg0) {
        int var1 = 80 / ((-arg0 - 11) / 41);
        field4863++;
        if (class102.field1189 == 0) {
            return;
        }
        try {
            if ((++class80.field981) > 2000) {
                if (class181.field2107 != null) {
                    class181.field2107.method2465((byte) -85);
                    class181.field2107 = null;
                }
                if (class265.field3417 >= 1) {
                    class388.field5299 = -5;
                    class102.field1189 = 0;
                    return;
                }
                if (class70.field874 == class249.field3279) {
                    class70.field874 = class389.field5303;
                } else {
                    class70.field874 = class249.field3279;
                }
                class80.field981 = 0;
                class265.field3417++;
                class102.field1189 = 1;
            }
            if (class102.field1189 == 1) {
                class181.field2110 = class401.field5525.method2714(class70.field874, false, class330.field4505);
                class102.field1189 = 2;
            }
            if (class102.field1189 == 2) {
                if (class181.field2110.field4244 == 2) {
                    throw new IOException();
                }
                if (class181.field2110.field4244 != 1) {
                    return;
                }
                class181.field2107 = new class399((Socket) class181.field2110.field4243, class401.field5525);
                class181.field2110 = null;
                class181.field2107.method2464((byte) 78, 0, class427.field5837.field3211, class427.field5837.field3188);
                if (class252.field3301 != null) {
                    class252.field3301.method1113((byte) -126);
                }
                if (class424.field5811 != null) {
                    class424.field5811.method1113((byte) 44);
                }
                int var2 = class181.field2107.method2469(-19969);
                if (class252.field3301 != null) {
                    class252.field3301.method1113((byte) -121);
                }
                if (class424.field5811 != null) {
                    class424.field5811.method1113((byte) -123);
                }
                if (var2 != 21) {
                    class388.field5299 = var2;
                    class102.field1189 = 0;
                    class181.field2107.method2465((byte) -85);
                    class181.field2107 = null;
                    return;
                }
                class102.field1189 = 3;
            }
            if (class102.field1189 == 3) {
                if (class181.field2107.method2467((byte) 100) < 1) {
                    return;
                }
                class279.field3617 = new String[class181.field2107.method2469(-19969)];
                class102.field1189 = 4;
            }
            if (class102.field1189 == 4 && class181.field2107.method2467((byte) 122) >= (class279.field3617.length * 8)) {
                class215.field2658.field3211 = 0;
                class181.field2107.method2466(0, class279.field3617.length * 8, 16752, class215.field2658.field3188);
                for (int var3 = 0; var3 < class279.field3617.length; var3++) {
                    class279.field3617[var3] = class374.method2340(class215.field2658.method1542(-1844808528), -6279);
                }
                class388.field5299 = 21;
                class102.field1189 = 0;
                class181.field2107.method2465((byte) -85);
                class181.field2107 = null;
            }
        } catch (IOException var4) {
            if (class181.field2107 != null) {
                class181.field2107.method2465((byte) -85);
                class181.field2107 = null;
            }
            if (class265.field3417 >= 1) {
                class102.field1189 = 0;
                class388.field5299 = -4;
            } else {
                class102.field1189 = 1;
                if (class70.field874 == class249.field3279) {
                    class70.field874 = class389.field5303;
                } else {
                    class70.field874 = class249.field3279;
                }
                class265.field3417++;
                class80.field981 = 0;
            }
        }
    }
}
