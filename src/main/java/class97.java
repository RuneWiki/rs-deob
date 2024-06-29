import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 extends class119 {

    @OriginalMember(owner = "client!o", name = "O", descriptor = "Lv;")
    public class146 field2346 = class146.field3341;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public int field2350 = 0;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field2344 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field2345 = 0;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field2347 = 0;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "Lv;")
    public static class146 field2342 = class159.method1226((byte) -37, "Einloggen");

    @OriginalMember(owner = "client!o", name = "T", descriptor = "Lv;")
    public static class146 field2351 = class159.method1226((byte) -37, "headicons_prayer");

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "Lv;")
    private static class146 field2357 = class159.method1226((byte) -37, "Please reload this page)3");

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field2356 = 0;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Lv;")
    public static class146 field2340 = field2357;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "Lv;")
    public static class146 field2355 = class159.method1226((byte) -37, "<col=ffffff>");

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public int field2352;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public int field2358;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "[I")
    public int[] field2341;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "[I")
    public static int[] field2349;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "[I")
    public int[] field2354;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "[Lrd;")
    public static class122[] field2337;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "[Lv;")
    public class146[] field2348;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public static void method798(byte arg0) {
        field2340 = null;
        field2337 = null;
        field2357 = null;
        if (arg0 != -116) {
            method798((byte) 99);
        }
        field2355 = null;
        field2349 = null;
        field2351 = null;
        field2342 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lne;B)V")
    public final void method799(class95 arg0, byte arg1) {
        if (arg1 != -43) {
            this.field2348 = null;
        }
        field2353++;
        while (true) {
            int var3 = arg0.method790((byte) 73);
            if (var3 == 0) {
                return;
            }
            this.method800(124, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILne;I)V")
    private final void method800(int arg0, class95 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2352 = arg1.method790((byte) 73);
        } else if (arg2 == 2) {
            this.field2338 = arg1.method790((byte) 73);
        } else if (arg2 == 3) {
            this.field2346 = arg1.method772(117);
        } else if (arg2 == 4) {
            this.field2358 = arg1.method740((byte) -83);
        } else if (arg2 == 5) {
            this.field2350 = arg1.method795(1);
            this.field2348 = new class146[this.field2350];
            this.field2354 = new int[this.field2350];
            for (int var4 = 0; var4 < this.field2350; var4++) {
                this.field2354[var4] = arg1.method740((byte) -103);
                this.field2348[var4] = arg1.method772(-56);
            }
        } else if (arg2 == 6) {
            this.field2350 = arg1.method795(1);
            this.field2341 = new int[this.field2350];
            this.field2354 = new int[this.field2350];
            for (int var5 = 0; var5 < this.field2350; var5++) {
                this.field2354[var5] = arg1.method740((byte) 59);
                this.field2341[var5] = arg1.method740((byte) -99);
            }
        }
        field2339++;
        int var6 = -70 / ((56 - arg0) / 49);
    }
}
