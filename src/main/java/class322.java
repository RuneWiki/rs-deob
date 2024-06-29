import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class322 extends class314 {

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public int field5624;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public int field5629;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "Lud;")
    public static class279 field5617 = class130.method1024("Zugewiesener Speicher)3", 255);

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Z")
    public static boolean field5625 = false;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Ldg;")
    public static class317 field5623 = new class317();

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "[I")
    public static int[] field5634 = new int[14];

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field5628 = 0;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "Lok;")
    public static class149 field5631;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "Lae;")
    public static class277 field5630;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "[[B")
    public static byte[][] field5622;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 4)
    private static final void method2265(int arg0) {
        if (arg0 != 15210) {
            field5622 = (byte[][]) ((byte[][]) null);
        }
        field5618++;
        class98.field1845.method1334((byte) -25);
        class248.field4407.method1334((byte) -25);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V", line = 19)
    public static final void method2266(boolean arg0, int arg1) {
        class140.field2546.method1339(arg1, 19326);
        if (arg0) {
            field5632 = -73;
        }
        field5626++;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 36)
    public static void method2267(int arg0) {
        if (arg0 != 25) {
            method2267(-3);
        }
        field5622 = (byte[][]) null;
        field5631 = null;
        field5623 = null;
        field5617 = null;
        field5634 = null;
        field5630 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V", line = 54)
    public static final void method2268(int arg0, int arg1, int arg2) {
        field5620++;
        int var3 = arg1--;
        int var4 = class105.field1986[arg1];
        if (var3 > 25) {
            var3 = 25;
        }
        int var5 = class211.field3709[arg1];
        if (arg2 == 0) {
            class205.field3653++;
            class314.field5534.method1634(54, 0);
            class314.field5534.method464(var3 + var3 + 3, false);
        }
        if (arg2 == 1) {
            class103.field1949++;
            class314.field5534.method1634(13, 0);
            class314.field5534.method464(var3 + var3 + 3 + 14, false);
        }
        if (arg2 == 2) {
            class62.field1271++;
            class314.field5534.method1634(252, 0);
            class314.field5534.method464(var3 + var3 + 3, false);
        }
        class314.field5534.method493(class112.field2058 + var4, -60);
        class314.field5534.method462(var5 + class12.field396, true);
        class100.field1882 = class105.field1986[0];
        class72.field1415 = class211.field3709[0];
        if (arg0 > -1) {
            method2268(44, -15, -89);
        }
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class314.field5534.method504(class105.field1986[arg1] - var4, (byte) 118);
            class314.field5534.method464(class211.field3709[arg1] - var5, false);
        }
        class314.field5534.method464(class284.field5075[82] ? 1 : 0, false);
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)V", line = 112)
    public static final void method2269(byte arg0) {
        class278.method1962(true);
        class7.method41((byte) -113);
        class109.method900((byte) -97);
        field5627++;
        class209.method1539((byte) 98);
        class63.method553((byte) 11);
        class218.method1595((byte) 26);
        method2265(arg0 + 15211);
        class276.method1952((byte) 77);
        class150.method1197(-19131);
        class276.method1950(arg0 ^ 0xFFFFFF97);
        class28.method261(false);
        class204.method1509(arg0 - 118);
        class1.method9(96);
        class220.method1614((byte) 124);
        class44.method384((byte) -11);
        if (arg0 != -1) {
            return;
        }
        class96.method795(-1);
        class199.method1478((byte) -23);
        class229.method1652(arg0 + 415459757);
        class1.field97.method1334((byte) -25);
        class91.field1715.method1334((byte) -25);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILgf;)Lgf;", line = 159)
    public static final class8 method2270(int arg0, class8 arg1) {
        field5621++;
        if (arg1.field324 != -1) {
            return class273.method1940(arg1.field324, arg0 ^ 0x3BAE);
        }
        int var2 = arg1.field299 >>> 16;
        class57 var3 = new class57(class226.field3977);
        for (class176 var4 = (class176) var3.method523(-24650); var4 != null; var4 = (class176) var3.method522(arg0 + 15287)) {
            if (var4.field3165 == var2) {
                return class273.method1940((int) var4.field5539, 106);
            }
        }
        if (arg0 != -15288) {
            method2266(true, 7);
        }
        return null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(II)V", line = 195)
    public class322(int arg0, int arg1) {
        this.field5624 = arg1;
        this.field5629 = arg0;
    }
}
