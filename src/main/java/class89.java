import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public abstract class class89 {

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public static int field1250 = 0;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1246 = "";

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "Lfh;")
    public static class210 field1253;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "Lqp;")
    public static class278 field1248;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "Llm;")
    public static class347 field1244;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)Z")
    public final boolean method624(int arg0) {
        if (arg0 != -29648) {
            this.field1255 = 79;
        }
        field1245++;
        return (this.field1243 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)Z")
    public final boolean method625(byte arg0) {
        field1254++;
        if (arg0 != -36) {
            this.method625((byte) -15);
        }
        return (this.field1243 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)Z")
    public final boolean method626(boolean arg0) {
        if (arg0) {
            field1248 = null;
        }
        field1247++;
        return (this.field1243 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZI)V")
    public static final void method627(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method627(126, false, 82);
        }
        field1251++;
        class373 var3 = class16.method97(arg0, (byte) 74);
        int var4 = var3.field5431;
        int var5 = var3.field5420;
        int var6 = var3.field5427;
        int var7 = class125.field1753[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class366.method2389(var8 & arg2 << var5 | ~var8 & class4.field41[var4], 32094, var4);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
    public static void method628(int arg0) {
        field1246 = null;
        field1253 = null;
        field1244 = null;
        if (arg0 != 250) {
            field1244 = null;
        }
        field1248 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZLjava/lang/String;Lwl;)V")
    public static final void method629(int arg0, boolean arg1, String arg2, class273 arg3) {
        field1241++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class283.field4123.method2117(250, arg2, (class67[]) null, 123);
        int var8 = class283.field4123.method2122(250, (class67[]) null, arg2, (byte) 101) * 13;
        class61.field807.method1632(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 - -var4, -16777216, 0);
        class61.field807.method1731(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -1, 0);
        arg3.method1877(0, var6, arg2, (int[]) null, -1, 0, -1, (class67[]) null, var5, var7, (class2) null, 0, var8, (byte) -26, 1, 1);
        class179.method1094(var5 - var4, var4 + var8 + var4, var6 - var4, arg0, var7 + var4 + var4);
        if (arg1) {
            class61.field807.method1748();
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)Z")
    public final boolean method630(byte arg0) {
        int var2 = -39 / ((13 - arg0) / 40);
        field1249++;
        return (this.field1243 & 0x4) != 0;
    }
}
