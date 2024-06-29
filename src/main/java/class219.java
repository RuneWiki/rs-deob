import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class219 {

    @OriginalMember(owner = "client!we", name = "j", descriptor = "B")
    private byte field3141;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3139 = 0;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3137 = 0;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field3147 = 0;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field3146 = -1;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "F")
    public static float field3148;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[Lkj;")
    public static class31[] field3135;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)I", line = 4)
    public final int method1510(int arg0) {
        field3138++;
        return arg0 == 7 ? this.field3141 & 0x7 : -100;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILkm;)V", line = 20)
    public static final void method1511(int arg0, class133 arg1) {
        if (arg0 == 16) {
            class242.field3462 = arg1;
            field3133++;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)Z", line = 37)
    public static final boolean method1512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class340.field5104 * arg3 + class251.field3596 * arg0 >> 16;
        int var6 = class251.field3596 * arg3 - class340.field5104 * arg0 >> 16;
        int var7 = class193.field2658 * var6 + class115.field1554 * arg1 >> 16;
        int var8 = class193.field2658 * arg1 - class115.field1554 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class193.field2658 * var6 + class115.field1554 * arg2 >> 16;
        int var12 = class193.field2658 * arg2 - class115.field1554 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class313.field4731 && var13 < class313.field4731) {
            return false;
        } else if (var9 > class324.field4913 && var13 > class324.field4913) {
            return false;
        } else if (var10 < class99.field1344 && var14 < class99.field1344) {
            return false;
        } else {
            return var10 <= class185.field2556 || var14 <= class185.field2556;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)V", line = 85)
    public static final void method1513(byte arg0, int arg1) {
        class143 var2 = class163.method1176((byte) 86, arg1, 1);
        if (arg0 >= -122) {
            method1511(73, (class133) null);
        }
        var2.method1038(0);
        field3132++;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I", line = 111)
    public final int method1514(int arg0) {
        if (arg0 == -25792) {
            field3144++;
            return (this.field3141 & 0x8) == 8 ? 1 : 0;
        } else {
            return 38;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 125)
    public static void method1515(byte arg0) {
        int var1 = 81 % ((-arg0 - 53) / 56);
        field3135 = null;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 137)
    public class219() {
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;", line = 147)
    public static final Object method1516(int arg0, boolean arg1, byte[] arg2) {
        field3143++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 >= -116) {
            field3148 = -0.22535504F;
        }
        if (arg2.length > 136 && !class113.field1540) {
            try {
                class294 var3 = (class294) Class.forName("aa").getDeclaredConstructor().newInstance();
                var3.method1489(-119, arg2);
                return var3;
            } catch (Throwable var5) {
                class113.field1540 = true;
            }
        }
        return arg1 ? class52.method354(arg2, (byte) -107) : arg2;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lcg;)V", line = 180)
    public class219(class316 arg0) {
        this.field3141 = arg0.method2192(3);
        this.field3134 = arg0.method2220((byte) 62);
        this.field3142 = arg0.method2172((byte) 71);
        this.field3136 = arg0.method2172((byte) 71);
        this.field3140 = arg0.method2172((byte) 71);
        this.field3145 = arg0.method2172((byte) 71);
    }
}
