import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class30 extends class291 {

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "Z")
    public boolean field434 = true;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    public static int field433 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "Leg;")
    public static class37 field435 = class174.method1167("Bitte entfernen Sie ", -121);

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "Leg;")
    public static class37 field441 = class174.method1167("Sprites charg-Bs", -58);

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "Z")
    public static boolean field440 = false;

    @OriginalMember(owner = "client!oi", name = "gb", descriptor = "Z")
    public static boolean field452 = false;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "Leg;")
    private static class37 field437 = class174.method1167("Loading title screen )2 ", 118);

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "Leg;")
    public static class37 field443 = field437;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!oi", name = "ab", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!oi", name = "bb", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!oi", name = "db", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!oi", name = "eb", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!oi", name = "fb", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!oi", name = "ib", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!oi", name = "jb", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "Ljl;")
    public static class101 field444;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "[I")
    public int[] field436;

    @OriginalMember(owner = "client!oi", name = "hb", descriptor = "[I")
    private int[] field453;

    @OriginalMember(owner = "client!oi", name = "Z", descriptor = "[Leg;")
    private class37[] field445;

    @OriginalMember(owner = "client!oi", name = "cb", descriptor = "[[I")
    private int[][] field448;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "[[[B")
    public static byte[][][] field432;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        if (arg0) {
            return;
        }
        field447++;
        if (this.field436 != null) {
            for (int var2 = 0; var2 < this.field436.length; var2++) {
                this.field436[var2] = class94.method617(this.field436[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)I")
    public final int method171(int arg0, boolean arg1) {
        field439++;
        if (this.field453 == null || arg0 < 0 || arg0 > this.field453.length) {
            return -1;
        } else if (arg1) {
            return 94;
        } else {
            return this.field453[arg0];
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[ILva;)V")
    public final void method172(int arg0, int[] arg1, class187 arg2) {
        field451++;
        if (this.field453 == null) {
            return;
        }
        for (int var4 = 0; this.field453.length > var4 && var4 < arg1.length; var4++) {
            int var5 = class160.field2670[this.method171(var4, false)];
            if (var5 > 0) {
                arg2.method1279((byte) -128, (long) arg1[var4], var5);
            }
        }
        if (arg0 != 107) {
            this.field445 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILva;I)V")
    private final void method173(int arg0, class187 arg1, int arg2) {
        field449++;
        if (arg0 == arg2) {
            this.field445 = arg1.method1253(53).method218((byte) 86, 60);
        } else if (arg0 == 2) {
            int var4 = arg1.method1268(255);
            this.field436 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field436[var5] = arg1.method1244(false);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method1268(255);
            this.field448 = new int[var6][];
            this.field453 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1244(false);
                this.field453[var7] = var8;
                this.field448[var7] = new int[class154.field2577[var8]];
                for (int var9 = 0; var9 < class154.field2577[var8]; var9++) {
                    this.field448[var7][var9] = arg1.method1244(false);
                }
            }
        } else if (arg0 == 4) {
            this.field434 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lva;Z)V")
    public final void method174(class187 arg0, boolean arg1) {
        field454++;
        if (arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method1268(255);
            if (var3 == 0) {
                return;
            }
            this.method173(var3, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lva;I)Leg;")
    public final class37 method175(class187 arg0, int arg1) {
        field438++;
        class37 var3 = class235.method1612(80, false);
        if (this.field453 != null) {
            for (int var4 = 0; var4 < this.field453.length; var4++) {
                var3.method238(this.field445[var4], (byte) -113);
                var3.method238(class267.method1791(this.field448[var4], arg1 ^ 0xFFFFB4D0, this.field453[var4], arg0.method1300((byte) 17, class200.field3401[this.field453[var4]])), (byte) -96);
            }
        }
        var3.method238(this.field445[this.field445.length - arg1], (byte) -111);
        return var3.method250((byte) -112);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIB)I")
    public final int method176(int arg0, int arg1, byte arg2) {
        field446++;
        if (this.field453 == null || arg1 < 0 || arg1 > this.field453.length) {
            return -1;
        } else if (this.field448[arg1] == null || arg0 < 0 || arg0 > this.field448[arg1].length) {
            return -1;
        } else {
            if (arg2 != 64) {
                this.method172(-36, (int[]) null, (class187) null);
            }
            return this.field448[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)V")
    public static void method177(int arg0) {
        field437 = null;
        field441 = null;
        field432 = null;
        field435 = null;
        field444 = null;
        if (arg0 == 0) {
            field443 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(Z)I")
    public final int method178(boolean arg0) {
        if (arg0) {
            this.method173(37, (class187) null, -103);
        }
        field450++;
        return this.field453 == null ? 0 : this.field453.length;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)Leg;")
    public final class37 method179(byte arg0) {
        class37 var2 = class235.method1612(80, false);
        field442++;
        if (arg0 != -96) {
            this.method179((byte) 12);
        }
        if (this.field445 == null) {
            return class168.field2814;
        }
        var2.method238(this.field445[0], (byte) -89);
        for (int var3 = 1; var3 < this.field445.length; var3++) {
            var2.method238(class146.field2478, (byte) -120);
            var2.method238(this.field445[var3], (byte) -99);
        }
        return var2.method250((byte) 57);
    }
}
