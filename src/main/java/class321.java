import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class321 extends class29 {

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "Ljava/lang/String;")
    public static String field5032 = "M";

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "Z")
    public static boolean field5035 = false;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field5026 = 0;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public int field5027;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public int field5028;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public int field5030;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public int field5033;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public int field5038;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public int field5040;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V", line = 15)
    public static void method2243(boolean arg0) {
        field5032 = null;
        if (!arg0) {
            field5035 = false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLjava/lang/String;)I", line = 29)
    public static final int method2244(byte arg0, String arg1) {
        if (arg0 != -19) {
            field5032 = (String) null;
        }
        field5034++;
        return class181.method1251(10, arg1, (byte) -64, true);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V", line = 43)
    public static final void method2245(int arg0) {
        class126.field1877 = 0;
        class225.field3584 = 0;
        field5036++;
        class209.method1528(-53);
        class164.method1133(15);
        if (arg0 <= 34) {
            field5026 = -9;
        }
        class115.method802((byte) -86);
        for (int var1 = 0; var1 < class225.field3584; var1++) {
            int var2 = class292.field4597[var1];
            if (class48.field648 != class297.field4657[var2].field2008) {
                if (class297.field4657[var2].field3210.method822(1115)) {
                    class286.method2014(class297.field4657[var2], -101);
                }
                class297.field4657[var2].method1439((byte) 21, (class118) null);
                class297.field4657[var2] = null;
            }
        }
        if (class138.field2063 != class336.field5213.field3129) {
            throw new RuntimeException("gnp1 pos:" + class336.field5213.field3129 + " psize:" + class138.field2063);
        }
        for (int var3 = 0; var3 < class176.field2875; var3++) {
            if (class297.field4657[class128.field1906[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class176.field2875);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V", line = 96)
    public static final void method2246(byte arg0) {
        if (class69.field901 != null) {
            class69.field901.method2095(arg0 + 8865);
            class69.field901 = null;
        }
        class204.method1501(0);
        class125.method867();
        for (int var1 = 0; var1 < 4; var1++) {
            class50.field685[var1].method442((byte) 89);
        }
        class116.method808(false, 4);
        field5037++;
        System.gc();
        class145.method1023(-66, 2);
        class59.field771 = -1;
        class334.field5181 = false;
        class194.method1424(true, 123);
        class31.field437 = 0;
        class181.field2925 = 0;
        class24.field351 = 0;
        class336.field5209 = 0;
        class247.field3928 = false;
        for (int var2 = 0; var2 < class283.field4472.length; var2++) {
            class283.field4472[var2] = null;
        }
        class24.field350 = 0;
        if (arg0 != -128) {
            field5032 = (String) null;
        }
        class176.field2875 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class100.field1523[var3] = null;
            class26.field379[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class297.field4657[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class116.field1745[var5][var6][var7] = null;
                }
            }
        }
        class274.method1955((byte) -70);
        class331.field5159 = 0;
        class94.method677(12);
        class224.method1635(Integer.MAX_VALUE, true);
        try {
            class72.method470("loggedout", (byte) -122, class264.field4183.field68);
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)V", line = 198)
    public static final void method2247(boolean arg0, int arg1) {
        class183.field2956 = new int[5];
        field5029++;
        class334.field5195 = new int[104];
        class327.field5092 = new int[104];
        class154.field2350 = new int[104];
        class8.field94 = 99;
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class90.field1370 = new byte[var2][arg1][104];
        class100.field1520 = new byte[var2][105][105];
        class42.field587 = new byte[var2][104][104];
        class221.field3518 = new int[104];
        class297.field4658 = new byte[var2][104][104];
        class231.field3702 = new byte[var2][104][104];
        class196.field3220 = new int[var2][105][105];
        class227.field3603 = new int[104];
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(IIIII)V", line = 230)
    public final void method2248(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field5028 << 3;
        int var7 = this.field5027 << 3;
        int var8 = (arg0 << 4) + (var6 & arg4);
        field5039++;
        int var9 = (arg2 << 4) + (var7 & 0xF);
        this.method80(var6, var7, var8, var9, arg1, arg3);
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(II)I", line = 243)
    public static final int method2249(int arg0, int arg1) {
        field5025++;
        return arg1 < 38 ? 29 : arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
    public abstract void method81(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)V")
    public abstract void method79(int arg0, int arg1);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
    public abstract void method82(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)V")
    public abstract void method88(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)V")
    public abstract void method84(int arg0, int arg1);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V")
    public abstract void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(II)V")
    public abstract void method78(int arg0, int arg1);
}
