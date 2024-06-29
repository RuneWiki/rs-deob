import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class37 extends class111 {

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static volatile int field550 = 0;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "Ltl;")
    public static class59 field549 = class85.method639("Lade Titelbild )2 ", 9588);

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "[I")
    public static int[] field558 = new int[] { 0, 0, 0, 0, 0, 0, 0, -2, 24, -1, 8, 0, 6, 0, 0, 0, 0, 0, 7, 0, 0, 2, 5, 10, 0, 0, 0, -2, -2, 0, 0, 0, 0, 2, 0, 0, 0, 14, 0, 5, -1, 0, 0, 0, 0, 0, -2, 0, 0, 0, 14, -1, 4, -2, 4, 0, 0, 0, 0, 0, 10, 0, 20, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 4, 0, 0, 0, -1, 0, 0, 4, 0, 6, 0, 2, 0, 0, 0, 6, 0, 2, -1, 0, 0, 0, -2, 0, 0, 0, 0, 10, -1, 0, 0, 0, -2, 15, 0, 1, 9, 8, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 6, 0, 7, 0, 0, 5, 2, 9, 6, 3, 5, -2, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 7, 0, 0, 0, 6, 0, 0, 0, 8, 12, 0, 2, 3, 12, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 6, -2, 0, 0, 0, 6, 5, 0, 0, -1, 8, 0, 0, 10, 0, -1, -1, 0, -2, 0, 2, 0, 3, 0, 0, 0, 0, 0, -2, 0, 0, -1, 7, 0, -1, 0, 15, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 3, -2, 4, 0, 0, 0, 6, 0, 1, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 1, 0, 1, 10, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field565 = 0;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "Ltl;")
    private static class59 field556 = class85.method639("Ok", 9588);

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "Ltl;")
    public static class59 field562 = field556;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "Ltl;")
    public static class59 field563 = class85.method639(")3", 9588);

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "Ltl;")
    public static class59 field551 = class85.method639("<col=40ff00>", 9588);

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "[Ltl;")
    public static class59[] field559;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[B", line = 7)
    public static final byte[] method243(int arg0, int arg1) {
        class268 var2 = (class268) class152.field2501.method1006((long) arg0, 1);
        if (arg1 != 511) {
            field563 = (class59) null;
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class215.method1496(var4, -121, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class268(var3);
            class152.field2501.method1008(var2, (long) arg0, 0);
        }
        field560++;
        return var2.field4657;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(Z)V", line = 56)
    public static void method244(boolean arg0) {
        if (arg0) {
            return;
        }
        field559 = null;
        field549 = null;
        field558 = null;
        field551 = null;
        field563 = null;
        field562 = null;
        field556 = null;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)Ljk;", line = 79)
    public static final class317 method245(int arg0, int arg1) {
        field552++;
        if (arg1 != -21177) {
            return (class317) null;
        }
        class317 var2 = (class317) class291.field4977.method1483((byte) -74, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class222.field3598.method2042(1, arg0, (byte) -125);
        class317 var4 = new class317();
        if (var3 != null) {
            var4.method2182((byte) 121, arg0, new class170(var3));
        }
        class291.field4977.method1488((long) arg0, var4, 25838);
        return var4;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lim;Z)V", line = 103)
    public static final void method246(class175 arg0, boolean arg1) {
        field555++;
        class128.field2092 = 3;
        class315 var2 = null;
        class20.method135(true, 14304);
        class308.field5243 = true;
        class262.field4362 = 0;
        class94.field1452 = true;
        class184.field3078 = false;
        class146.field2386 = true;
        class228.field3683 = arg1;
        class268.field4658 = 2;
        class99.field1600 = 255;
        class266.field4584 = true;
        class198.field3288 = true;
        class228.field3686 = 127;
        class193.field3216 = true;
        class148.field2429 = true;
        class67.field1036 = true;
        class191.field3198 = 127;
        class300.field5124 = true;
        class303.field5158 = 0;
        class308.field5207 = 0;
        class227.field3666 = 0;
        class131.field2163 = true;
        class81.field1283 = 0;
        try {
            class257 var3 = arg0.method1300("runescape", (byte) 98);
            while (var3.field4256 == 0) {
                class183.method1360(false, 1L);
            }
            if (var3.field4256 == 1) {
                var2 = (class315) var3.field4255;
                byte[] var4 = new byte[(int) var2.method2171(0)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2172(var4.length - var5, var5, false, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class127.method934((byte) 106, new class170(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method2169((byte) 64);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILme;)V", line = 177)
    public static final void method247(int arg0, class295 arg1) {
        field554++;
        class198.field3273 = class186.method1376(arg1, class284.field4890, 115);
        class223.field3612 = new int[256];
        for (int var2 = arg0; var2 < 3; var2++) {
            int var3 = class4.field49[var2 + 1] >> 16 & 0xFF;
            float var4 = (float) ((class4.field49[var2] & 0xFF0000) >> 16);
            float var5 = ((float) var3 - var4) / 64.0F;
            float var6 = (float) ((class4.field49[var2] & 0xFF00) >> 8);
            float var7 = (float) (class4.field49[var2] & 0xFF);
            int var8 = class4.field49[var2 + 1] & 0xFF;
            int var9 = (class4.field49[var2 + 1] & 0xFF00) >> 8;
            float var10 = ((float) var8 - var7) / 64.0F;
            float var11 = ((float) var9 - var6) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class223.field3612[var2 * 64 + var12] = class239.method1677((int) var7, class239.method1677((int) var6 << 8, (int) var4 << 16));
                var4 += var5;
                var7 += var10;
                var6 += var11;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class223.field3612[var13] = class4.field49[3];
        }
        class70.field1069 = new int[32768];
        class29.field377 = new int[32768];
        class171.method1266((byte) 122, (class5) null);
        class156.field2557 = new int[32768];
        class73.field1170 = new int[32768];
        if (class55.field815) {
            class59.field919 = new class52(128, 254);
        } else {
            class59.field919 = new class47(128, 254);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([II)[I", line = 245)
    public static final int[] method248(int[] arg0, int arg1) {
        field564++;
        if (arg0 == null) {
            return null;
        }
        int[] var2 = new int[arg0.length];
        class63.method518(arg0, 0, var2, 0, arg0.length);
        if (arg1 <= 120) {
            method244(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)Lae;", line = 268)
    public static final class119 method249(int arg0, byte arg1) {
        field548++;
        class119 var2 = (class119) class251.field4185.method1483((byte) -74, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class221.field3575.method2042(class101.method768(-1701288217, arg0), class147.method1063(arg0, (byte) 113), (byte) -122);
        class119 var4 = new class119();
        var4.field1983 = arg0;
        if (var3 != null) {
            var4.method888((byte) 118, new class170(var3));
        }
        if (arg1 <= 68) {
            field556 = (class59) null;
        }
        var4.method878(true);
        class251.field4185.method1488((long) arg0, var4, 25838);
        return var4;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(ILme;)V", line = 332)
    public static final void method250(int arg0, class295 arg1) {
        field557++;
        class264.field4570 = arg1;
        if (arg0 != 0) {
            field550 = -72;
        }
    }
}
