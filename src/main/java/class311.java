import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class311 {

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4444 = "Loaded textures";

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "[I")
    public static int[] field4446 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4435 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "B")
    public byte field4429;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "B")
    public byte field4430;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "B")
    public byte field4432;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "B")
    public byte field4440;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "B")
    public byte field4441;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "B")
    public byte field4447;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "B")
    public byte field4454;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Lra;")
    public static class57 field4438;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "S")
    public short field4451;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Z")
    public boolean field4431;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "Z")
    public boolean field4434;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Z")
    public boolean field4436;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Z")
    public boolean field4437;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Z")
    public boolean field4439;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Z")
    public boolean field4442;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "Z")
    public boolean field4443;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "Z")
    public boolean field4450;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "Z")
    public boolean field4453;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "[[[I")
    public static int[][][] field4449;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1950(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class30.field275[arg0][var8][var14] == -class281.field3953) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class132.field1814[arg0].method1990(arg1, arg3) + arg5;
            if (!class37.method223(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class37.method223(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class37.method223(var9, var11, var13)) {
                return false;
            } else if (class37.method223(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class377.method2370(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class37.method223(var6 + 1, class132.field1814[arg0].method1990(arg1, arg3) + arg5, var7 + 1) && class37.method223(var6 + 128 - 1, class132.field1814[arg0].method1990(arg1 + 1, arg3) + arg5, var7 + 1) && class37.method223(var6 + 128 - 1, class132.field1814[arg0].method1990(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class37.method223(var6 + 1, class132.field1814[arg0].method1990(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjf;IB)V")
    public static final void method1951(int arg0, class119 arg1, int arg2, byte arg3) {
        if (arg3 != -71) {
            field4446 = null;
        }
        class30.field273 = arg2;
        class200.field2736 = arg1;
        field4452++;
        class223.field3051 = arg0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)Z")
    public static final boolean method1952(boolean arg0) {
        if (arg0) {
            field4446 = null;
        }
        field4433++;
        try {
            return class224.method1452(8249);
        } catch (IOException var4) {
            class450.method2801(true);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class367.field5358 + "," + class148.field2070 + "," + class334.field4915 + " - " + class290.field4131 + "," + (class390.field5715.field6351[0] + class40.field427) + "," + (class390.field5715.field6350[0] + class217.field2975) + " - ";
            for (int var3 = 0; var3 < class290.field4131 && var3 < 50; var3++) {
                var2 = var2 + class249.field3379.field2867[var3] + ",";
            }
            class411.method2578(var5, var2, (byte) -68);
            class6.method60((byte) -100);
            return true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lre;I)I")
    public static final int method1953(class358 arg0, int arg1) {
        field4445++;
        class335 var2 = arg0.field5229;
        if (var2.field4984 != null) {
            var2 = var2.method2162(0);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4930;
        class270 var4 = arg0.method2697((byte) 93);
        if (arg0.field6335) {
            var3 = var2.field4917;
        } else if (arg0.field6265 == var4.field3798 || arg0.field6265 == var4.field3815 || arg0.field6265 == var4.field3835 || arg0.field6265 == var4.field3822) {
            var3 = var2.field4958;
        } else if (arg0.field6265 == var4.field3824 || arg0.field6265 == var4.field3811 || arg0.field6265 == var4.field3804 || arg0.field6265 == var4.field3800) {
            var3 = var2.field4955;
        }
        return arg1 == 0 ? var3 : -101;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V")
    public static final void method1954(byte arg0, int arg1) {
        field4428++;
        class331 var2 = class238.field3241;
        synchronized (class238.field3241) {
            if (arg0 != -65) {
                field4449 = null;
            }
            class238.field3241.method2054(-52, arg1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Loj;I)V")
    public static final void method1955(class213 arg0, int arg1) {
        field4448++;
        arg0.field2911 = null;
        if (arg1 == 16711935 && class247.field3359 < 20) {
            class288.field4071.method1605(arg0, -14638);
            class247.field3359++;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public static void method1956(byte arg0) {
        int var1 = -44 / ((73 - arg0) / 41);
        field4438 = null;
        field4449 = null;
        field4444 = null;
        field4435 = null;
        field4446 = null;
    }
}
