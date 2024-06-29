import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class593 implements class255 {

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Ldba;")
    private class293 field8426;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[Lko;")
    private class318[] field8422;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "[I")
    public static int[] field8432 = new int[4];

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field8428;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field8433;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lha;")
    private class543 field8431;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lcaa;")
    public static class636 field8429;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Z")
    private boolean field8423;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjava/awt/Canvas;Ld;I)Lha;", line = 4)
    public static final class543 method3478(int arg0, Canvas arg1, class267 arg2, int arg3) {
        field8425++;
        if (arg3 != 4) {
            field8429 = null;
        }
        return new class346(arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)I", line = 15)
    public final int method1341(byte arg0) {
        field8424++;
        if (arg0 <= 124) {
            return 27;
        }
        int var2 = 0;
        class318[] var3 = this.field8422;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class318 var5 = var3[var4];
            if (var5 == null || var5.method418(true)) {
                var2++;
            }
        }
        return var2 * 100 / this.field8422.length;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZJLha;)V", line = 41)
    public static final void method3479(boolean arg0, long arg1, class543 arg2) {
        class301.field4124 = class357.field5266;
        class415.field5903 = 0;
        if (arg0) {
            return;
        }
        class460.field6530 = 0;
        field8433++;
        class357.field5266 = 0;
        long var4 = class465.method2818(255);
        for (class27 var6 = (class27) class293.field4026.method1527(126); var6 != null; var6 = (class27) class293.field4026.method1523(true)) {
            if (var6.method121(arg2, arg1)) {
                class460.field6530++;
            }
        }
        if (class408.field5807 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class293.field4026.method1519(0) + ", running: " + class460.field6530);
            System.out.println("Emitters: " + class415.field5903 + " Particles: " + class357.field5266 + ". Time taken: " + (class465.method2818(255) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BJ)Z", line = 78)
    public final boolean method1336(byte arg0, long arg1) {
        field8430++;
        if (arg0 >= -10) {
            field8432 = null;
        }
        return class465.method2818(255) >= ((long) this.field8426.field4023 + arg1);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 94)
    public static final void method3480(int arg0) {
        field8421++;
        class338.method2080((byte) 74);
        if (arg0 == 25387) {
            class147.field2154 = false;
            class517.method3144(class388.field5606, arg0 ^ 0xFFFF9CA4, class731.field10246, class314.field4246, class132.field1820);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 107)
    public final void method1337(byte arg0) {
        if (class211.field3164 != this.field8431) {
            this.field8423 = true;
            this.field8431 = class211.field3164;
        }
        field8420++;
        this.field8431.method1240(0);
        class318[] var2 = this.field8422;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class318 var4 = var2[var3];
            if (var4 != null) {
                var4.method414((byte) 127);
            }
        }
        if (arg0 != -45) {
            this.field8426 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 139)
    public final void method1343(int arg0) {
        if (arg0 <= 42) {
            this.method1337((byte) -96);
        }
        field8427++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZZ)V", line = 149)
    public final void method1340(boolean arg0, boolean arg1) {
        field8435++;
        boolean var3 = arg0;
        class318[] var4 = this.field8422;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class318 var6 = var4[var5];
            if (var6 != null) {
                var6.method678(var3 || this.field8423, (byte) -53);
            }
        }
        this.field8423 = false;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I", line = 172)
    public final int method1342(byte arg0) {
        field8428++;
        if (arg0 <= 40) {
            this.field8431 = null;
        }
        return this.field8426.field4022;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 183)
    public static final void method3481(int arg0) {
        field8434++;
        if (class243.field3580.field8002.method2026(false) == 0 && class717.field10118 != class687.field9758) {
            class426.method2648(class109.field1560, 11, arg0 ^ 0x3FC8DD67, class401.field5750, false);
            return;
        }
        class196.method1379(class211.field3164, -17930);
        if (class687.field9758 != class35.field319) {
            class726.method4054(arg0 ^ 0xFFFF8E22);
        }
        if (arg0 != -29149) {
            method3481(117);
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V", line = 205)
    public static void method3482(byte arg0) {
        field8432 = null;
        field8429 = null;
        if (arg0 != 33) {
            field8432 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Ldba;Liha;)V", line = 222)
    public class593(class293 arg0, class609 arg1) {
        this.field8426 = arg0;
        this.field8422 = new class318[this.field8426.field4030.length];
        for (int var3 = 0; var3 < this.field8422.length; var3++) {
            this.field8422[var3] = arg1.method3547((byte) 124, this.field8426.field4030[var3]);
        }
    }
}
