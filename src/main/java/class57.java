import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class57 extends class334 {

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "J")
    public static long field913 = -1L;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "Lgf;")
    public class46 field914;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "Ljava/lang/String;")
    public String field922;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "[I")
    public int[] field918;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "[I")
    public int[] field919;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "[Lru;")
    public class177[] field911;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field917;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ID)V")
    public static final void method438(int arg0, double arg1) {
        if (arg0 != 255) {
            field913 = -83L;
        }
        if (class517.field7680 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class498.field7494[var3] = var4 <= 255 ? var4 : 255;
            }
            class517.field7680 = arg1;
        }
        field920++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLjava/lang/String;BLla;)V")
    public static final void method439(boolean arg0, String arg1, byte arg2, class299 arg3) {
        field921++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class378.field5807.method2254(null, 250, arg1, -49);
        int var8 = class378.field5807.method2259(7007, null, 250, arg1) * 13;
        class19.field198.method1260(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        if (arg2 != -60) {
            method440(57, null);
        }
        class19.field198.method1284(var5 - var4, var6 - var4, var4 + var4 + var7, var4 + var8 + var4, -1, 0);
        arg3.method2014(-119, var8, 1, -1, var7, var5, null, 1, null, -1, null, arg1, 0, var6, 0, 0);
        class346.method2292(var4 + var7 + var4, 0, var6 - var4, var8 - -var4 + var4, var5 - var4);
        if (arg0) {
            class19.field198.method1255();
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method440(int arg0, String arg1) {
        field923++;
        if (arg0 != 22693) {
            field913 = -18L;
        }
        System.exit(1);
    }
}
