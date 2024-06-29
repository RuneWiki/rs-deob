import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class28 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lqj;")
    public static class196 field344 = class80.method502("Fertigkeit)2", -48);

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Ls;")
    public static class227 field348 = new class227(100);

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lqj;")
    public static class196 field349 = class80.method502("<img=1>", -48);

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field350 = 0;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lqj;")
    public static class196 field351 = class80.method502("Suche nach Updates )2 ", -48);

    @OriginalMember(owner = "client!te", name = "i", descriptor = "[Lqj;")
    public static class196[] field352 = new class196[200];

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method154(byte arg0) {
        field351 = null;
        if (arg0 != -38) {
            field351 = null;
        }
        field349 = null;
        field344 = null;
        field348 = null;
        field352 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIZI)V")
    public static final void method155(byte arg0, int arg1, boolean arg2, int arg3) {
        field347++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class61.field817 = arg3;
        class165.field2715 = arg2;
        class216.field3884 = arg1;
        int var4 = 39 % ((arg0 + 39) / 43);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZILlj;)V")
    public static final void method156(boolean arg0, int arg1, class205 arg2) {
        if (arg1 != 4334) {
            return;
        }
        field345++;
        if (arg0) {
            class50.field602 = 3;
            class111.method661(false, (byte) 83);
            class132.field1890 = 0;
            class159.field2556 = false;
            class19.field228 = false;
            class70.field977 = 127;
            class203.field3661 = false;
            class240.field4271 = false;
            class211.field3801 = 255;
            class172.field2906 = 0;
            class71.field1004 = false;
            class192.field3371 = false;
            class151.field2444 = false;
            class174.field2935 = false;
            class45.field543 = false;
            class88.field1293 = 0;
            class159.field2554 = 0;
            class189.field3315 = 127;
            class219.field3919 = false;
            class133.field1898 = false;
            class111.method675(-9523, arg2);
            return;
        }
        class50.field602 = 3;
        class111.method661(true, (byte) 115);
        class88.field1293 = 0;
        class174.field2935 = true;
        class133.field1898 = true;
        class45.field543 = true;
        class192.field3371 = true;
        class19.field228 = true;
        class189.field3315 = 127;
        class132.field1890 = 0;
        class159.field2554 = 2;
        class159.field2556 = true;
        class151.field2444 = true;
        class70.field977 = 127;
        class203.field3661 = true;
        class191 var3 = null;
        class71.field1004 = true;
        class211.field3801 = 255;
        class172.field2906 = 0;
        class219.field3919 = true;
        class240.field4271 = true;
        try {
            class139 var4 = arg2.method1393(0, "runescape");
            while (var4.field2140 == 0) {
                class73.method464((byte) 48, 1L);
            }
            if (var4.field2140 == 1) {
                var3 = (class191) var4.field2135;
                int var5 = 0;
                byte[] var6 = new byte[(int) var3.method1266(true)];
                while (var6.length > var5) {
                    int var7 = var3.method1265(var5, var6.length - var5, var6, 117);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                    var5 += var7;
                }
                class253.method1713(arg1 ^ 0xFFFFEF10, new class56(var6));
            }
        } catch (Exception var9) {
        }
        try {
            if (var3 != null) {
                var3.method1263(117);
                return;
            }
        } catch (Exception var8) {
            return;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
    public static final void method157(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class39.field442; var3++) {
            for (int var4 = 0; var4 < class23.field293; var4++) {
                for (int var5 = 0; var5 < class110.field1566; var5++) {
                    class61 var6 = class249.field4410[var3][var4][var5];
                    if (var6 != null) {
                        class221 var7 = var6.field829;
                        if (var7 != null && var7.field3992.method1435()) {
                            class185.method1207(var7.field3992, var3, var4, var5, 1, 1);
                            if (var7.field3979 != null && var7.field3979.method1435()) {
                                class185.method1207(var7.field3979, var3, var4, var5, 1, 1);
                                var7.field3992.method1443(var7.field3979, 0, 0, 0, false);
                                var7.field3979 = var7.field3979.method1419(arg0, arg1, arg2);
                            }
                            var7.field3992 = var7.field3992.method1419(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field836; var8++) {
                            class200 var10 = var6.field823[var8];
                            if (var10 != null && var10.field3544.method1435()) {
                                class185.method1207(var10.field3544, var3, var4, var5, var10.field3539 + 1 - var10.field3549, var10.field3556 - var10.field3548 + 1);
                                var10.field3544 = var10.field3544.method1419(arg0, arg1, arg2);
                            }
                        }
                        class116 var9 = var6.field818;
                        if (var9 != null && var9.field1681.method1435()) {
                            class77.method483(var9.field1681, var3, var4, var5);
                            var9.field1681 = var9.field1681.method1419(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }
}
