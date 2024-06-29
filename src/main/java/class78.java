import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class78 {

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field1005 = 0;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field1004 = 0;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "Z")
    public static boolean field1006 = false;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public int field1012;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZI)V", line = 11)
    public static final void method555(boolean arg0, int arg1) {
        if (arg0) {
            field1005 = -76;
        }
        field1009++;
        class32.field393 = arg1;
        class83.field1069 = -1;
        class323.field4744 = -1;
        class144.method1122((byte) -106);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lfd;B)V", line = 29)
    public final void method556(class299 arg0, byte arg1) {
        field1010++;
        if (arg1 != 58) {
            method555(true, 65);
        }
        while (true) {
            int var3 = arg0.method2096((byte) -122);
            if (var3 == 0) {
                return;
            }
            this.method557(arg0, (byte) -116, var3);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lfd;BI)V", line = 55)
    private final void method557(class299 arg0, byte arg1, int arg2) {
        if (arg1 >= -98) {
            method559(false, -121);
        }
        if (arg2 == 1) {
            this.field1003 = arg0.method2083((byte) -48);
            this.field1011 = arg0.method2096((byte) -122);
            this.field1012 = arg0.method2096((byte) -122);
        }
        field1007++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V", line = 90)
    public static final void method558(boolean arg0) {
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class255.field3734 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
            if (arg0) {
                field1004 = -32;
            }
        } catch (Exception var7) {
        }
        field1008++;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(ZI)V", line = 115)
    public static final void method559(boolean arg0, int arg1) {
        field1013++;
        int var2 = class112.field1453;
        int var3 = class248.field3606;
        int var4 = class343.field5332;
        int var5 = (int) class302.field4426;
        int var6 = class347.field5398;
        if (class100.field1312 / 256 > var5) {
            var5 = class100.field1312 / 256;
        }
        int var7 = class94.field1222;
        if (class214.field3024[4] && var5 < class355.field5562[4] + 128) {
            var5 = class355.field5562[4] + 128;
        }
        int var8 = (int) class247.field3601 + class59.field753 & 0x7FF;
        class167.method1248(57, var8, class271.method1847(class359.field5616.field4893, arg0, class359.field5616.field4855, class56.field724) - 50, var5, var5 * 3 + 600, class135.field1845, arg1, class322.field4730);
        if (class112.field1453 == var2 && class343.field5332 == var4 && class248.field3606 == var3 && class94.field1222 == var7 && class347.field5398 == var6) {
            client.field1631 = 1;
            return;
        }
        class270.field3881 = 10;
        class157.field2184 = 10;
        class223.field3219 = 10;
        int var9 = class347.field5398 - var6;
        if (var3 < class248.field3606) {
            var3 += (class248.field3606 - var3) * class223.field3219 / 1000 + class157.field2184;
            if (var3 < class248.field3606) {
                class248.field3606 = var3;
            }
        }
        if (class248.field3606 < var3) {
            int var10 = var3 - (class157.field2184 + ((var3 - class248.field3606) * class223.field3219 / 1000));
            if (class248.field3606 < var10) {
                class248.field3606 = var10;
            }
        }
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var4 < class343.field5332) {
            var4 += (class343.field5332 - var4) * class223.field3219 / 1000 + class157.field2184;
            if (class343.field5332 > var4) {
                class343.field5332 = var4;
            }
        }
        if (class343.field5332 < var4) {
            int var11 = var4 - ((var4 - class343.field5332) * class223.field3219 / 1000 + class157.field2184);
            if (var11 > class343.field5332) {
                class343.field5332 = var11;
            }
        }
        if (var2 < class112.field1453) {
            var2 += class157.field2184 + ((class112.field1453 - var2) * class223.field3219 / 1000);
            if (class112.field1453 > var2) {
                class112.field1453 = var2;
            }
        }
        class264.field3840 = 10;
        if (class112.field1453 < var2) {
            int var12 = var2 - ((var2 - class112.field1453) * class223.field3219 / 1000 + class157.field2184);
            if (class112.field1453 < var12) {
                class112.field1453 = var12;
            }
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        if (class94.field1222 > var7) {
            var7 += (class94.field1222 - var7) * class264.field3840 / 1000 + class270.field3881;
            if (var7 < class94.field1222) {
                class94.field1222 = var7;
            }
        }
        if (var9 > 0) {
            int var13 = class264.field3840 * var9 / 1000 + class270.field3881 + var6;
            var6 = var13 & 0x7FF;
        }
        if (class94.field1222 < var7) {
            int var14 = var7 - (class270.field3881 + ((var7 - class94.field1222) * class264.field3840 / 1000));
            if (class94.field1222 < var14) {
                class94.field1222 = var14;
            }
        }
        if (var9 < 0) {
            int var15 = var6 - (-var9 * class264.field3840 / 1000 + class270.field3881);
            var6 = var15 & 0x7FF;
        }
        int var16 = class347.field5398 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var9 <= 0 || var16 > 0 && var9 < 0) {
            class347.field5398 = var6;
        }
    }
}
