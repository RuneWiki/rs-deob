import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class217 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Llj;")
    private class25 field3756 = new class25();

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Ljf;")
    private class60 field3770 = new class60();

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    private int field3768;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    private int field3769;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "Lhc;")
    private class212 field3775;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Ldf;")
    public static class51 field3755 = class46.method233("Speicher wird zugewiesen)3", 100);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Led;")
    public static class172 field3754 = new class172(0, 0);

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Ldf;")
    private static class51 field3774 = class46.method233("level)2", 100);

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Ldf;")
    private static class51 field3773 = class46.method233("Loaded config", 100);

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Ldf;")
    public static class51 field3772 = field3774;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Ldf;")
    public static class51 field3771 = field3773;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "Ldf;")
    public static class51 field3776 = class46.method233(":trade:", 100);

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)Z")
    public static final boolean method1486(int arg0, byte arg1) {
        field3764++;
        if (arg0 < 32) {
            return false;
        }
        if (arg1 != -119) {
            field3776 = null;
        }
        if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Lvj;")
    public final class107 method1487(boolean arg0) {
        field3760++;
        if (!arg0) {
            field3771 = null;
        }
        return this.field3775.method1451(-119);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static final void method1488(byte arg0) {
        if (arg0 >= -108) {
            method1493(-109);
        }
        for (int var1 = 0; var1 < class185.field3060; var1++) {
            int var2 = class215.field3732[var1];
            class103 var3 = class66.field1055[var2];
            int var4 = class97.field1622.method897(-100);
            if ((var4 & 0x1) != 0) {
                var4 += class97.field1622.method897(117) << 8;
            }
            class4.method13((byte) 36, var2, var4, var3);
        }
        field3765++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lu;Lu;Lu;BLu;)V")
    public static final void method1489(class111 arg0, class111 arg1, class111 arg2, byte arg3, class111 arg4) {
        if (arg3 != -26) {
            return;
        }
        field3757++;
        class212.field3530 = arg1;
        class139.field2343 = arg4;
        class222.field3865 = arg2;
        class241.field4182 = arg0;
        class10.field106 = new class213[class222.field3865.method818((byte) 55)][];
        class246.field4274 = new boolean[class222.field3865.method818((byte) 72)];
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class149.method1074(98, class175.field2867, class36.field542, arg3);
        field3761++;
        int var7 = class149.method1074(105, class175.field2867, class36.field542, arg5);
        if (arg1 != -130) {
            return;
        }
        int var8 = class149.method1074(-124, class115.field1954, class28.field408, arg0);
        int var9 = class149.method1074(123, class115.field1954, class28.field408, arg2);
        for (int var10 = var6; var10 <= var7; var10++) {
            class242.method1660((byte) -79, class80.field1324[var10], arg4, var9, var8);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(JB)Llj;")
    public final class25 method1491(long arg0, byte arg1) {
        field3767++;
        if (arg1 != 95) {
            this.field3770 = null;
        }
        class25 var4 = (class25) this.field3775.method1453(arg0, arg1 ^ 0x5E);
        if (var4 != null) {
            this.field3770.method404(var4, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZJLlj;)V")
    public final void method1492(boolean arg0, long arg1, class25 arg2) {
        field3763++;
        if (this.field3768 == 0) {
            class25 var5 = this.field3770.method395(-129);
            var5.method764((byte) -126);
            var5.method134(-51);
            if (this.field3756 == var5) {
                class25 var6 = this.field3770.method395(-129);
                var6.method764((byte) -114);
                var6.method134(64);
            }
        } else {
            this.field3768--;
        }
        this.field3775.method1447(61, arg1, arg2);
        this.field3770.method404(arg2, arg0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1493(int arg0) {
        field3754 = null;
        field3776 = null;
        field3771 = null;
        field3772 = null;
        int var1 = -47 % ((-arg0 - 39) / 59);
        field3773 = null;
        field3774 = null;
        field3755 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method1494(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3758++;
        int var8 = 2048 - arg7 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = arg3;
        int var12 = 0;
        if (var8 != 0) {
            int var13 = class73.field1155[var8];
            var12 = -arg3 * var13 >> 16;
            int var14 = class73.field1167[var8];
            var11 = arg3 * var14 >> 16;
        }
        if (!arg2) {
            method1490(-91, -83, 69, 112, -30, -23);
        }
        if (var9 != 0) {
            int var15 = class73.field1155[var9];
            var10 = var11 * var15 >> 16;
            int var16 = class73.field1167[var9];
            var11 = var11 * var16 >> 16;
        }
        class120.field2001 = arg5 - var12;
        class144.field2408 = arg1 - var11;
        class107.field1763 = arg7;
        class209.field3488 = arg0 - var10;
        class128.field2143 = arg4;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public final void method1495(int arg0) {
        this.field3770.method396((byte) -118);
        this.field3775.method1448(0);
        this.field3756 = new class25();
        if (arg0 < 43) {
            method1493(112);
        }
        this.field3768 = this.field3769;
        field3759++;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)Lvj;")
    public final class107 method1496(boolean arg0) {
        if (arg0) {
            field3755 = null;
        }
        field3762++;
        return this.field3775.method1449(-1);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I)V")
    public class217(int arg0) {
        this.field3768 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3769 = arg0;
        this.field3775 = new class212(var2);
    }
}
