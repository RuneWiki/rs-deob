import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class21 extends class106 {

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public int field390 = -1;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    private int field391 = 128;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    private int field407 = 0;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    private int field412 = 0;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
    private int field408 = 0;

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
    private int field413 = 128;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "[[B")
    public static byte[][] field393 = new byte[1000][];

    @OriginalMember(owner = "client!c", name = "P", descriptor = "[I")
    public static int[] field398 = new int[50];

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field396 = -1;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "[S")
    public static short[] field404 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!c", name = "O", descriptor = "Leh;")
    public static class47 field397 = class195.method1282((byte) -4, "event_opbase");

    @OriginalMember(owner = "client!c", name = "T", descriptor = "Leh;")
    public static class47 field401 = class195.method1282((byte) -4, "Null");

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "Leh;")
    public static class47 field406 = class195.method1282((byte) -4, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!c", name = "db", descriptor = "Leh;")
    public static class47 field411 = class195.method1282((byte) -4, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "Lah;")
    public static class9 field409;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "[S")
    private short[] field402;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "[S")
    private short[] field405;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "[S")
    private short[] field410;

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "[S")
    private short[] field414;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLhd;)V")
    public final void method209(byte arg0, class68 arg1) {
        while (true) {
            int var3 = arg1.method604((byte) -19);
            if (var3 == 0) {
                if (arg0 < 62) {
                    this.field413 = 31;
                }
                field395++;
                return;
            }
            this.method210(arg1, var3, 4);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lhd;II)V")
    private final void method210(class68 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field399 = arg0.method569(26496);
        } else if (arg1 == 2) {
            this.field390 = arg0.method569(arg2 + 26492);
        } else if (arg1 == 4) {
            this.field391 = arg0.method569(arg2 ^ 0x6784);
        } else if (arg1 == 5) {
            this.field413 = arg0.method569(arg2 + 26492);
        } else if (arg1 == 6) {
            this.field407 = arg0.method569(26496);
        } else if (arg1 == 7) {
            this.field412 = arg0.method604((byte) -124);
        } else if (arg1 == 8) {
            this.field408 = arg0.method604((byte) -123);
        } else if (arg1 == 40) {
            int var6 = arg0.method604((byte) 34);
            this.field402 = new short[var6];
            this.field405 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field402[var7] = (short) arg0.method569(26496);
                this.field405[var7] = (short) arg0.method569(26496);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method604((byte) 85);
            this.field410 = new short[var4];
            this.field414 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field414[var5] = (short) arg0.method569(class136.method989(arg2, 26500));
                this.field410[var5] = (short) arg0.method569(26496);
            }
        }
        field394++;
        if (arg2 != 4) {
            method211(false);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V")
    public static void method211(boolean arg0) {
        field409 = null;
        field393 = null;
        field406 = null;
        field411 = null;
        field398 = null;
        field397 = null;
        field404 = null;
        if (arg0) {
            method211(false);
        }
        field401 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)Ld;")
    public final class30 method212(int arg0, byte arg1) {
        field400++;
        class30 var3 = (class30) class116.field2357.method986((byte) 50, (long) this.field392);
        if (var3 == null) {
            class102 var4 = class102.method841(class158.field3065, this.field399, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field402 != null) {
                for (int var5 = 0; var5 < this.field402.length; var5++) {
                    var4.method826(this.field402[var5], this.field405[var5]);
                }
            }
            if (this.field414 != null) {
                for (int var6 = 0; var6 < this.field414.length; var6++) {
                    var4.method829(this.field414[var6], this.field410[var6]);
                }
            }
            var3 = var4.method838(this.field412 + 64, this.field408 + 850, -30, -50, -30, true, true);
            class116.field2357.method987((long) this.field392, var3, 28842);
        }
        if (arg1 > -63) {
            this.field408 = -59;
        }
        class30 var7;
        if (this.field390 == -1 || arg0 == -1) {
            var7 = var3.method43(true);
        } else {
            var7 = class25.method236(false, this.field390).method222(arg0, (byte) -41, var3);
        }
        if (this.field391 != 128 || this.field413 != 128) {
            var7.method272(this.field391, this.field413, this.field391);
        }
        if (this.field407 != 0) {
            if (this.field407 == 90) {
                var7.method265();
            }
            if (this.field407 == 180) {
                var7.method265();
                var7.method265();
            }
            if (this.field407 == 270) {
                var7.method265();
                var7.method265();
                var7.method265();
            }
        }
        return var7;
    }
}
