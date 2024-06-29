import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class62 extends class34 {

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field1227 = 0;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field1231 = -1;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Lcc;")
    public static class209 field1229 = class95.method669(88, "Mem:");

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Lla;")
    public static class95 field1230 = new class95(64);

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "[Lmb;")
    public static class159[] field1232;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V")
    public static void method461(int arg0) {
        field1232 = null;
        if (arg0 == 7763) {
            field1230 = null;
            field1229 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)I")
    public static final int method462(int arg0, byte arg1) {
        field1224++;
        return arg1 > -24 ? 73 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
    public static final void method463(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1225++;
        int var5 = arg0;
        int var6 = -arg0;
        int var7 = arg1;
        int var8 = -1;
        int var9 = class257.method1787(class262.field4723, arg0 + arg2, arg1 ^ 0x1C, class230.field4184);
        int var10 = class257.method1787(class262.field4723, arg2 - arg0, arg1 ^ 0x1C, class230.field4184);
        class176.method1215(var10, arg4, class252.field4543[arg3], var9, (byte) 121);
        while (var5 > var7) {
            var8 += 2;
            var6 += var8;
            if (var6 > 0) {
                var5--;
                var6 -= var5 << 1;
                int var11 = arg3 - var5;
                int var12 = arg3 + var5;
                if (class102.field1957 <= var12 && class155.field2847 >= var11) {
                    int var13 = class257.method1787(class262.field4723, arg2 + var7, 28, class230.field4184);
                    int var14 = class257.method1787(class262.field4723, arg2 - var7, 28, class230.field4184);
                    if (var12 <= class155.field2847) {
                        class176.method1215(var14, arg4, class252.field4543[var12], var13, (byte) -42);
                    }
                    if (var11 >= class102.field1957) {
                        class176.method1215(var14, arg4, class252.field4543[var11], var13, (byte) 108);
                    }
                }
            }
            var7++;
            int var15 = arg3 + var7;
            int var16 = arg3 - var7;
            if (class102.field1957 <= var15 && class155.field2847 >= var16) {
                int var17 = class257.method1787(class262.field4723, arg2 + var5, arg1 + 28, class230.field4184);
                int var18 = class257.method1787(class262.field4723, arg2 - var5, 28, class230.field4184);
                if (var15 <= class155.field2847) {
                    class176.method1215(var18, arg4, class252.field4543[var15], var17, (byte) -30);
                }
                if (var16 >= class102.field1957) {
                    class176.method1215(var18, arg4, class252.field4543[var16], var17, (byte) 107);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V")
    public static final void method464(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1673439672) {
            field1230 = null;
        }
        class42 var4 = class116.method827(arg0, (byte) 116, arg3);
        if (var4 != null && var4.field711 != null) {
            class227 var5 = new class227();
            var5.field4143 = var4;
            var5.field4134 = var4.field711;
            class147.method1021(var5, 200000);
        }
        class172.field3147 = arg0;
        class49.field948 = arg2;
        class260.field4689 = true;
        class222.field4053 = arg3;
        class126.method907(var4, 0);
        field1233++;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(II)V")
    public class62(int arg0, int arg1) {
        this.field1226 = arg0;
        this.field1228 = arg1;
    }
}
