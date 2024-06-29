import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class131 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2533 = 0;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lhh;")
    public static class163 field2536 = class137.method1065("Benutzeroberfl-=che geladen)3", 17);

    @OriginalMember(owner = "client!la", name = "c", descriptor = "[Z")
    public static boolean[] field2535 = new boolean[5];

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lhh;")
    public static class163 field2539 = class137.method1065("Ausw-=hlen", 17);

    @OriginalMember(owner = "client!la", name = "h", descriptor = "[Lie;")
    public static class221[] field2540 = new class221[27];

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lad;")
    public static class43 field2537 = new class43(16);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
    public static int[] field2542;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZJI)Z")
    public static final boolean method1035(int arg0, boolean arg1, long arg2, int arg3) {
        int var5 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        int var6 = (int) arg2 >> 14 & 0x1F;
        if (!arg1) {
            return true;
        }
        field2543++;
        int var7 = (int) arg2 >> 20 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class35 var8 = class9.method64(false, var5);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field574;
                var9 = var8.field591;
            } else {
                var9 = var8.field574;
                var10 = var8.field591;
            }
            int var11 = var8.field578;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class239.method1652(arg3, 2, var9, 0, var10, 115, arg0, true, class235.field4203.field3614[0], class235.field4203.field3629[0], var11, 0);
        } else {
            class239.method1652(arg3, 2, 0, var7, 0, -46, arg0, true, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, var6 + 1);
        }
        class21.field333 = 0;
        class65.field1104 = 2;
        class192.field3516 = class84.field1598;
        class246.field4337 = class265.field4604;
        return true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static final void method1036(int arg0) {
        if (arg0 != 10) {
            method1037(false);
        }
        class163.field3008.method916(111);
        field2538++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public static final void method1037(boolean arg0) {
        if (arg0) {
            field2537 = null;
        }
        class215.method1533(0);
        field2534++;
        class223.method1576((byte) -106);
        class90.method701((byte) -107);
        class74.method543(0);
        class127.method1007((byte) 71);
        class170.method1266(-31);
        class111.method885((byte) 82);
        class56.method394((byte) 70);
        class205.method1457(0);
        class39.method273(109);
        class62.method438(true);
        class48.method344(0);
        class72.method530((byte) -114);
        class85.method678((byte) 119);
        ((class122) class98.field1852).method951(1);
        class39.field653.method320((byte) -79);
        class75.field1418.method974(114);
        class38.field640.method974(102);
        class90.field1646.method974(122);
        class149.field2805.method974(-43);
        class139.field2667.method974(122);
        class59.field969.method974(115);
        class221.field4012.method974(107);
        class94.field1786.method974(-128);
        class213.field3880.method974(-87);
        class20.field327.method974(119);
        class165.field3050.method974(-71);
        class124.field2394.method120((byte) -96);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILpa;)Z")
    public static final boolean method1038(int arg0, int arg1, class123 arg2) {
        field2541++;
        byte[] var3 = arg2.method968((byte) -83, arg1);
        if (var3 == null) {
            return false;
        } else if (arg0 == 5825) {
            class164.method1233(var3, true);
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static void method1039(int arg0) {
        field2536 = null;
        if (arg0 != 31) {
            field2536 = null;
        }
        field2535 = null;
        field2537 = null;
        field2542 = null;
        field2540 = null;
        field2539 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static final void method1040(byte arg0) {
        class60.field1020 = null;
        int var1 = -62 % ((arg0 + 70) / 39);
        class119.field2241 = null;
        class37.field631 = null;
        class3.field71 = null;
        class234.field4180 = null;
        class260.field4553 = null;
        field2542 = null;
        field2544++;
        class116.field2206 = null;
        class58.field959 = null;
        class222.field4048 = null;
        class233.field4164 = null;
    }
}
