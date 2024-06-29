import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class142 extends class79 {

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "[I")
    public int[] field2265 = new int[] { -1 };

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "[I")
    public int[] field2270 = new int[] { 0 };

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "Lck;")
    public static class119 field2267 = class298.method1987((byte) 98, " weitere Optionen");

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "[S")
    public static short[] field2271 = new short[256];

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "[I")
    public static int[] field2275 = new int[2];

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field2269 = -1;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "Lva;")
    public static class36 field2276;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "[[B")
    public static byte[][] field2274;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZLck;I)V", line = 9)
    public static final void method930(boolean arg0, class119 arg1, int arg2) {
        field2266++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class8.field167.method1830(arg1, arg2);
        int var7 = class8.field167.method1834(arg1, 250) * 13;
        class121.method811(var4 - var3, -var3 + var5, var6 + var3 + var3, var7 - -var3 - -var3, 0);
        class121.method813(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var3 + var7, 16777215);
        class8.field167.method1846(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class86.method577(var4 - var3, var3 + var7 + var3, var3 + var6 + var3, (byte) 43, var5 - var3);
        if (arg0) {
            class264.method1711();
        } else {
            class193.method1240(var6, var5, (byte) 98, var7, var4);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 46)
    public static final void method931(int arg0) {
        if (arg0 != 3) {
            method934(22);
        }
        field2272++;
        while (class22.field333.method957(8, class4.field123) >= 11) {
            int var1 = class22.field333.method961(-127, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class23.field346[var1] == null) {
                class23.field346[var1] = new class292();
                var2 = true;
                if (class236.field3793[var1] != null) {
                    class23.field346[var1].method1945(31908, class236.field3793[var1]);
                }
            }
            class226.field3609[class233.field3757++] = var1;
            class292 var3 = class23.field346[var1];
            var3.field4984 = class1.field15;
            int var4 = class22.field333.method961(47, 1);
            int var5 = class22.field333.method961(arg0 + 60, 1);
            if (var5 == 1) {
                class113.field1723[class81.field1238++] = var1;
            }
            int var6 = class207.field3294[class22.field333.method961(arg0 - 109, 3)];
            if (var2) {
                var3.field4946 = var3.field5007 = var6;
            }
            int var7 = class22.field333.method961(arg0 ^ 0x41, 5);
            int var8 = class22.field333.method961(-109, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.method1982(class124.field1917.field4973[0] + var7, 7, class124.field1917.field4963[0] + var8, var4 == 1);
        }
        class22.field333.method959(-103);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Led;", line = 111)
    public static final class106 method932(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class106 var4 = var3.field1590;
            var3.field1590 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIILvc;Lvc;IIJ)V", line = 129)
    public static final void method933(int arg0, int arg1, int arg2, int arg3, class293 arg4, class293 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class146 var10 = new class146();
        var10.field2341 = arg8;
        var10.field2344 = arg1 * 128 + 64;
        var10.field2340 = arg2 * 128 + 64;
        var10.field2351 = arg3;
        var10.field2348 = arg4;
        var10.field2347 = arg5;
        var10.field2338 = arg6;
        var10.field2345 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class150.field2390[var11][arg1][arg2] == null) {
                class150.field2390[var11][arg1][arg2] = new class104(var11, arg1, arg2);
            }
        }
        class150.field2390[arg0][arg1][arg2].field1593 = var10;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V", line = 168)
    public static void method934(int arg0) {
        field2271 = null;
        field2276 = null;
        field2275 = null;
        field2274 = (byte[][]) null;
        field2267 = null;
        if (arg0 <= 47) {
            method930(false, (class119) null, -67);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lnl;)V", line = 186)
    public static final void method935(class196 arg0) {
        for (int var1 = arg0.field3131; var1 <= arg0.field3136; var1++) {
            for (int var2 = arg0.field3146; var2 <= arg0.field3137; var2++) {
                class104 var3 = class150.field2390[arg0.field3132][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1596; var4++) {
                        if (var3.field1610[var4] == arg0) {
                            var3.field1596--;
                            for (int var5 = var4; var5 < var3.field1596; var5++) {
                                var3.field1610[var5] = var3.field1610[var5 + 1];
                                var3.field1606[var5] = var3.field1606[var5 + 1];
                            }
                            var3.field1610[var3.field1596] = null;
                            break;
                        }
                    }
                    var3.field1601 = 0;
                    for (int var6 = 0; var6 < var3.field1596; var6++) {
                        var3.field1601 |= var3.field1606[var6];
                    }
                }
            }
        }
    }
}
