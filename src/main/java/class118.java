import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class118 extends class259 {

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Lee;")
    public class281 field2360;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "Lla;")
    public static class95 field2364 = new class95(64);

    @OriginalMember(owner = "client!u", name = "N", descriptor = "[I")
    public static int[] field2366 = new int[2];

    @OriginalMember(owner = "client!u", name = "P", descriptor = "Z")
    public static boolean field2368 = false;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "Lcc;")
    public static class209 field2371 = class95.method669(90, "Ausw-=hlen");

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "Lha;")
    public static class30 field2369;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "Lsj;")
    public static class49 field2367;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILlk;I)V")
    public static final void method835(int arg0, class81 arg1, int arg2) {
        field2362++;
        if (class163.field2968 < arg1.field1542) {
            class230.method1607(arg1, false);
        } else if (arg1.field1563 < class163.field2968) {
            class22.method188(arg1, (byte) 120);
        } else {
            class241.method1666((byte) 2, arg1);
        }
        if (arg1.field1571 < 128 || arg1.field1534 < 128 || arg1.field1571 >= 13184 || arg1.field1534 >= 13184) {
            arg1.field1541 = -1;
            arg1.field1517 = -1;
            arg1.field1542 = 0;
            arg1.field1563 = 0;
            arg1.field1571 = arg1.field1548[0] * 128 + arg1.method577((byte) 66) * 64;
            arg1.field1534 = arg1.field1567[0] * 128 + (arg1.method577((byte) 71) * 64);
            arg1.method575((byte) -49);
        }
        if (class223.field4069 == arg1 && (arg1.field1571 < 1536 || arg1.field1534 < 1536 || arg1.field1571 >= 11776 || arg1.field1534 >= 11776)) {
            arg1.field1542 = 0;
            arg1.field1563 = 0;
            arg1.field1517 = -1;
            arg1.field1541 = -1;
            arg1.field1571 = arg1.field1548[0] * 128 + (arg1.method577((byte) 123) * 64);
            arg1.field1534 = arg1.field1567[0] * 128 + (arg1.method577((byte) -85) * 64);
            arg1.method575((byte) -49);
        }
        class136.method945(arg2 - 8655, arg1);
        if (arg2 != 8655) {
            field2369 = null;
        }
        class243.method1693(arg1, 116);
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(II)I")
    public static final int method836(int arg0, int arg1) {
        int var2 = 33 / ((arg0 + 12) / 59);
        field2363++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public static void method837(boolean arg0) {
        field2367 = null;
        field2371 = null;
        field2364 = null;
        field2366 = null;
        if (!arg0) {
            method835(71, (class81) null, -53);
        }
        field2369 = null;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lee;)V")
    public class118(class281 arg0) {
        this.field2360 = arg0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLji;)Lji;")
    public static final class42 method838(boolean arg0, class42 arg1) {
        field2365++;
        if (arg1.field710 != -1) {
            return class247.method1719(arg1.field710, -8667);
        }
        if (arg0) {
            field2368 = false;
        }
        int var2 = arg1.field779 >>> 16;
        class85 var3 = new class85(class114.field2288);
        for (class97 var4 = (class97) var3.method614((byte) -58); var4 != null; var4 = (class97) var3.method609((byte) 122)) {
            if (var4.field1895 == var2) {
                return class247.method1719((int) var4.field596, -8667);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lsj;I)V")
    public static final void method839(class49 arg0, int arg1) {
        field2361++;
        if (arg1 != 0) {
            field2370 = 98;
        }
        class261.field4701 = arg0.method364(arg1 - 1, class71.field1353);
        class112.field2256 = arg0.method364(-1, class28.field511);
        class100.field1948 = arg0.method364(-1, class109.field2211);
        class1.field8 = arg0.method364(-1, class258.field4660);
        class253.field4552 = arg0.method364(-1, class216.field3900);
        class36.field619 = arg0.method364(arg1 - 1, class18.field365);
        class239.field4328 = arg0.method364(-1, class13.field247);
        class122.field2412 = arg0.method364(arg1 - 1, class130.field2492);
        class94.field1862 = arg0.method364(arg1 - 1, class182.field3299);
        class201.field3597 = arg0.method364(-1, class289.field5095);
        class144.field2658 = arg0.method364(-1, class237.field4256);
        class257.field4659 = arg0.method364(-1, class134.field2541);
        class75.field1399 = arg0.method364(-1, class34.field597);
        class231.field4202 = arg0.method364(-1, class81.field1564);
        class137.field2565 = arg0.method364(-1, class200.field3584);
        class104.field2009 = arg0.method364(-1, class126.field2434);
        class165.field2982 = arg0.method364(-1, class103.field1989);
        class215.field3870 = arg0.method364(-1, class109.field2202);
        class67.field1278 = arg0.method364(-1, class163.field2965);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(III)J")
    public static final long method840(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        return var3 == null || var3.field2218 == null ? 0L : var3.field2218.field3270;
    }
}
