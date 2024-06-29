import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class44 implements Runnable {

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "[Lje;")
    public volatile class173[] field715 = new class173[2];

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Z")
    public volatile boolean field698 = false;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Z")
    public volatile boolean field702 = false;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "Z")
    public static boolean field709 = false;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Ldf;")
    public static class51 field707 = class46.method233("<br>(X", 100);

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Z")
    public static boolean field703 = false;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[I")
    public static int[] field711 = new int[128];

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field712 = 0;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field705 = 0;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lfi;")
    public static class103 field706;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Lu;")
    public static class111 field704;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lgg;")
    public static class182 field699;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Lsc;")
    public class229 field714;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Lja;")
    public static class55 field710;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lu;I)V")
    public static final void method223(class111 arg0, int arg1) {
        field713++;
        class30.field437 = class245.method1672(arg0, -29433, 0, class211.field3507);
        class93.field1557 = new class158[class30.field437.length];
        class48.field764 = new class158[class30.field437.length];
        class166.field2707 = new class158[class30.field437.length];
        for (int var2 = 0; var2 < class30.field437.length; var2++) {
            class30.field437[var2].method1122();
            class93.field1557[var2] = class30.field437[var2].method1125();
            class30.field437[var2].method1122();
            class48.field764[var2] = class30.field437[var2].method1125();
            class30.field437[var2].method1122();
            class166.field2707[var2] = class30.field437[var2].method1125();
            class30.field437[var2].method1122();
        }
        class131.field2187 = class264.method1792((byte) 122, class169.field2757, 0, arg0);
        class181.field2988 = class188.method1344(116, arg0, class75.field1184, 0);
        class143.field2396 = class188.method1344(116, arg0, class76.field1222, 0);
        class4.field33 = class188.method1344(120, arg0, class95.field1572, 0);
        class262.field4566 = class188.method1344(109, arg0, class67.field1097, 0);
        class116.field1968 = class171.method1204(0, 123, class174.field2861, arg0);
        class156.field2573 = class171.method1204(0, 127, class201.field3360, arg0);
        class23.field356 = class163.method1153(class166.field2705, 0, -22081, arg0);
        class108.field1820 = class171.method1204(0, 17, class192.field3206, arg0);
        class255.field4449 = class171.method1204(0, 21, class149.field2502, arg0);
        class36.field559 = class203.method1410(class212.field3520, (byte) -35, 0, arg0);
        class93.field1551 = class203.method1410(class248.field4360, (byte) -35, 0, arg0);
        class4.field34.method1315(class93.field1551, (int[]) null);
        class177.field2891.method1315(class93.field1551, (int[]) null);
        class239.field4161.method1315(class93.field1551, (int[]) null);
        class254 var3 = class47.method242(class193.field3247, (byte) -24, arg0, 0);
        var3.method1733();
        class119.field1984 = var3;
        class254[] var4 = class264.method1792((byte) 118, class66.field1069, 0, arg0);
        if (arg1 > -111) {
            method224(74);
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1733();
        }
        class107.field1762 = var4;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        for (int var10 = 0; var10 < class131.field2187.length; var10++) {
            class131.field2187[var10].method1726(var7 + var9, var8 + var9, var6 + var9);
        }
        class30.field437[0].method1123(var7 + var9, var8 - -var9, var6 + var9);
        class181.field2986 = class131.field2187;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method224(int arg0) {
        field699 = null;
        if (arg0 < 62) {
            field703 = true;
        }
        field704 = null;
        field706 = null;
        field711 = null;
        field707 = null;
        field710 = null;
    }

    @OriginalMember(owner = "client!aj", name = "run", descriptor = "()V")
    public final void run() {
        this.field702 = true;
        try {
            while (!this.field698) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class173 var2 = this.field715[var1];
                    if (var2 != null) {
                        var2.method1211(3);
                    }
                }
                class147.method1066(10L, 0);
                class145.method1040(1001, this.field714, (Object) null);
            }
        } catch (Exception var9) {
            class89.method674(var9, (String) null, 95);
        } finally {
            Object var6 = null;
            this.field702 = false;
        }
        field708++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BJ[II)Ldf;")
    public static final class51 method225(byte arg0, long arg1, int[] arg2, int arg3) {
        field700++;
        if (arg0 < 54) {
            return null;
        }
        if (class109.field1861 != null) {
            class51 var5 = class109.field1861.method369((byte) 34, arg2, arg3, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return arg3 == 5 ? class63.method422(arg1, -105).method304((byte) -92) : class105.method756(false, arg1);
    }
}
