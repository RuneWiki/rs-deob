import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lwf;")
    private class1 field204 = new class1();

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Ltk;")
    private class53 field209 = new class53();

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Ljl;")
    private class253 field208;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[I")
    public static int[] field198 = new int[32];

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lpf;")
    public static class294 field203;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Loi;")
    public final class82 method117(byte arg0) {
        field201++;
        if (arg0 != -17) {
            this.method118((byte) 5);
        }
        return this.field208.method1665(arg0 + 33);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public final void method118(byte arg0) {
        if (arg0 > -2) {
            this.method118((byte) -47);
        }
        this.field209.method366((byte) 9);
        field199++;
        this.field208.method1669(12345678);
        this.field204 = new class1();
        this.field210 = this.field207;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(JLwf;I)V")
    public final void method119(long arg0, class1 arg1, int arg2) {
        if (this.field210 == arg2) {
            class1 var5 = this.field209.method368(0);
            var5.method538(76);
            var5.method4((byte) -55);
            if (this.field204 == var5) {
                class1 var6 = this.field209.method368(0);
                var6.method538(80);
                var6.method4((byte) -55);
            }
        } else {
            this.field210--;
        }
        this.field208.method1663(arg0, arg1, -105);
        field206++;
        this.field209.method363(arg1, arg2 ^ 0xFFFFFF97);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
    public static void method120(byte arg0) {
        field198 = null;
        int var1 = -54 / ((49 - arg0) / 52);
        field203 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method121(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class274.field4120 * arg3 + class180.field2733 * arg0 >> 16;
        int var6 = class180.field2733 * arg3 - class274.field4120 * arg0 >> 16;
        int var7 = class215.field3235 * arg1 + class114.field1744 * var6 >> 16;
        int var8 = class114.field1744 * arg1 - class215.field3235 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class215.field3235 * arg2 + class114.field1744 * var6 >> 16;
        int var12 = class114.field1744 * arg2 - class215.field3235 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class133.field1949 && var13 < class133.field1949) {
            return false;
        } else if (var9 > class148.field2150 && var13 > class148.field2150) {
            return false;
        } else if (var10 < class243.field3643 && var14 < class243.field3643) {
            return false;
        } else {
            return var10 <= class86.field1380 || var14 <= class86.field1380;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(JB)Lwf;")
    public final class1 method122(long arg0, byte arg1) {
        field205++;
        class1 var4 = (class1) this.field208.method1666(arg0, (byte) 99);
        int var5 = 2 % ((arg1 + 15) / 60);
        if (var4 != null) {
            this.field209.method363(var4, -105);
        }
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)Loi;")
    public final class82 method123(byte arg0) {
        field200++;
        if (arg0 < 29) {
            this.field207 = -55;
        }
        return this.field208.method1659((byte) -118);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V")
    public class17(int arg0) {
        this.field210 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field207 = arg0;
        this.field208 = new class253(var2);
    }
}
