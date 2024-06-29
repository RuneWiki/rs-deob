import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class219 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lqk;")
    public class1 field3274;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3270 = new String[5];

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lqf;")
    public static class359 field3271;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "[[B")
    public static byte[][] field3275;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1601(int arg0) {
        if (arg0 != -16620) {
            method1601(6);
        }
        field3276++;
        int var1 = class173.field2499;
        int var2 = class131.field1899;
        int var3 = class172.field2482;
        int var4 = class134.field1957;
        int var5 = 6116423;
        if (class141.field2031) {
            class205.method1499(var1, var2, var3, var4, var5);
            class205.method1499(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class205.method1487(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
        } else {
            class44.method317(var1, var2, var3, var4, var5);
            class44.method317(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class44.method316(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        }
        class126.field1846.method186(class173.field2493, var1 + 3, var2 - -14, var5, -1);
        int var6 = class56.field815;
        int var7 = class165.field2353;
        for (int var8 = 0; var8 < class264.field4043; var8++) {
            int var9 = (class264.field4043 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var1 + var3 > var6 && var7 > (var9 - 13) && (var9 + 3) > var7) {
                var10 = 16776960;
            }
            class126.field1846.method186(class181.method1252(var8, -21419), var1 + 3, var9, var10, 0);
        }
        class135.method965(-105, class172.field2482, class134.field1957, class131.field1899, class173.field2499);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 66)
    public static void method1602(byte arg0) {
        if (arg0 < 3) {
            method1602((byte) -20);
        }
        field3275 = (byte[][]) null;
        field3270 = null;
        field3271 = null;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIII)V", line = 84)
    public class219(int arg0, int arg1, int arg2, int arg3) {
        class1 var5 = class358.method2481(arg0, false);
        this.field3272 = arg2;
        this.field3277 = arg3;
        this.field3273 = arg1;
        if (class141.field2031 || var5.field8 == -1) {
            this.field3274 = var5;
        } else {
            this.field3274 = class358.method2481(var5.field8, false);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lqk;III)V", line = 101)
    public class219(class1 arg0, int arg1, int arg2, int arg3) {
        this.field3274 = arg0;
        this.field3273 = arg1;
        this.field3272 = arg2;
        this.field3277 = arg3;
    }
}
