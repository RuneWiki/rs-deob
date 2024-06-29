import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class354 extends class45 {

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "[B")
    public byte[] field5126;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5119 = "scroll:";

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "S")
    public static short field5125 = 205;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "Llm;")
    public static class347 field5127;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "Ljava/lang/String;")
    public static String field5129;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V", line = 17)
    public static final void method2325(int arg0, int arg1) {
        class98 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class351 var4 = class265.field3846[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class214.field2858; var5++) {
                    for (int var6 = 0; var6 < class104.field1436; var6++) {
                        var2 = var4.method756(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class351 var10 = class265.field3846[var9];
                                if (var10 != null) {
                                    int var11 = var4.method742(var6, var5) - var10.method742(var6, var5);
                                    int var12 = var4.method742(var6 + 1, var5) - var10.method742(var6 + 1, var5);
                                    int var13 = var4.method742(var6 + 1, var5 + 1) - var10.method742(var6 + 1, var5 + 1);
                                    int var14 = var4.method742(var6, var5 + 1) - var10.method742(var6, var5 + 1);
                                    var10.method739(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V", line = 82)
    public static final void method2326(int arg0, int arg1, int arg2) {
        field5128++;
        if (arg0 != -4747) {
            field5125 = 126;
        }
        class263 var3 = class47.method337(5, 0, arg1);
        var3.method1807((byte) -126);
        var3.field3813 = arg2;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V", line = 96)
    public static final void method2327(int arg0, int arg1) {
        field5120++;
        if (class375.field5452 == 0) {
            class321.field4733.method493(arg0, 87);
        } else {
            class159.field2147 = arg0;
        }
        if (arg1 != -14375) {
            method2326(-72, 1, 50);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 120)
    public static final void method2328(String arg0, int arg1, byte arg2) {
        if (arg2 != -95) {
            method2327(-90, -38);
        }
        field5123++;
        class263 var3 = class47.method337(2, 0, arg1);
        var3.method1807((byte) -122);
        var3.field3812 = arg0;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(II)Ljn;", line = 134)
    public static final class396 method2329(int arg0, int arg1) {
        field5124++;
        class189 var2 = class346.field4984;
        class396 var3;
        synchronized (class346.field4984) {
            var3 = (class396) class346.field4984.method1137((long) arg0, 2108653711);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class117.field1651.method2261(arg0, 32, 96);
        class396 var5 = new class396();
        if (var4 != null) {
            var5.method2545(new class228(var4), -1127);
        }
        var5.method2542(128);
        class189 var6 = class346.field4984;
        synchronized (class346.field4984) {
            if (arg1 >= -103) {
                return null;
            } else {
                class346.field4984.method1144((long) arg0, var5, -3480);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V", line = 163)
    public static void method2330(int arg0) {
        field5127 = null;
        field5119 = null;
        if (arg0 != 1) {
            method2327(-19, -9);
        }
        field5129 = null;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "([B)V", line = 174)
    public class354(byte[] arg0) {
        this.field5126 = arg0;
    }
}
