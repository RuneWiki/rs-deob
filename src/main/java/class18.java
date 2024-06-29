import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class18 extends class249 implements Runnable {

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "Z")
    private boolean field323 = true;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public int field326 = -1;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "Lcj;")
    private class414 field327;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field318 = 0;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field321 = 1;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Z")
    public static boolean field320 = false;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field322 = -1;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "[[I")
    public static int[][] field328 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static void method249(int arg0) {
        if (arg0 != 9789) {
            method249(-50);
        }
        field328 = null;
    }

    @OriginalMember(owner = "client!nc", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field323) {
            this.field327.method2595(this, 20343);
        }
        field316++;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public final void method250(int arg0) {
        if (arg0 == 20716) {
            (new Thread(this, "a")).start();
            field329++;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BZ)V")
    public static final void method251(byte arg0, boolean arg1) {
        if (arg1 && class354.field4829 != null) {
            class47.field656 = class354.field4829.field5750;
        } else {
            class47.field656 = -1;
        }
        field317++;
        class437.field6152 = null;
        class135.field1963 = null;
        class89.field1244 = 0;
        class354.field4829 = null;
        if (arg0 < 78) {
            return;
        }
        class354.method2277();
        class354.field4833.method644(false);
        class354.field4836 = null;
        class277.field3854 = -1;
        class192.field2649 = -1;
        class334.field4602 = null;
        class56.field769 = null;
        class218.field3020 = null;
        class349.field4799 = null;
        class108.field1557 = null;
        class348.field4791 = null;
        class393.field5637 = null;
        class415.field5896 = null;
        class352.field4822 = null;
        class284.method1856(-5465);
        class341.method2166(64, 0, 128);
        class453.method2812(64, 31777, 64);
        class80.method579(64, (byte) 121);
        class418.method2623(0, 64);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public final void method252(byte arg0) {
        if (arg0 != -92) {
            field322 = -101;
        }
        this.field323 = false;
        field331++;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    public static final void method253(int arg0) {
        class99.field1368 = 0;
        field319++;
        class438.field6171 = 0;
        class52.method434(1);
        class397.method2510((byte) -117);
        class416.method2614((byte) 123);
        class109.method773(104);
        int var1 = 0;
        int var2 = 23 % ((-arg0 - 48) / 56);
        while (class99.field1368 > var1) {
            int var4 = class112.field1627[var1];
            if (class276.field3837 != class381.field5447[var4].field5260) {
                if (class381.field5447[var4].field1924 > 0) {
                    class369.method2371(true, class381.field5447[var4]);
                }
                class381.field5447[var4] = null;
            }
            var1++;
        }
        if (class15.field290 != class333.field4591.field191) {
            throw new RuntimeException("gpp1 pos:" + class333.field4591.field191 + " psize:" + class15.field290);
        }
        for (int var3 = 0; var3 < class26.field467; var3++) {
            if (class381.field5447[class66.field974[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class26.field467);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lms;I)Z")
    public static final boolean method254(class453 arg0, int arg1) {
        field325++;
        if (arg1 != 14158) {
            method251((byte) -85, false);
        }
        if (arg0.field6403 == 205) {
            class74.field1061 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lcj;)V")
    public class18(class414 arg0) {
        this.field327 = arg0;
    }
}
