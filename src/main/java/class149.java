import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class149 {

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    private int field2615 = 32;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "J")
    private long field2603 = class154.method1114(true);

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    private int field2625 = 0;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    private int field2627 = 0;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "Z")
    private boolean field2624 = true;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "[Lwj;")
    private class207[] field2629 = new class207[8];

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    private int field2633 = 0;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    private int field2630 = 0;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "[Lwj;")
    private class207[] field2634 = new class207[8];

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "J")
    private long field2635 = 0L;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "J")
    private long field2631 = 0L;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Lcd;")
    public static class64 field2607 = class44.method335((byte) 71, "document)3cookie=(R");

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "Lcd;")
    private static class64 field2622 = class44.method335((byte) 71, "glow2:");

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Z")
    public static boolean field2617 = false;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Lcd;")
    public static class64 field2602 = field2622;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "Lcd;")
    public static class64 field2609 = field2622;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field2621 = 0;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "Lig;")
    public static class168 field2616 = new class168(64);

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field2632 = -1;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    private int field2628;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public int field2636;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "Lwj;")
    private class207 field2611;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "[I")
    public int[] field2619;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([II)V", line = 5)
    private final void method1046(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class188.field3233) {
            var3 = arg1 << 1;
        }
        class95.method716(arg0, 0, var3);
        this.field2627 -= arg1;
        if (this.field2611 != null && this.field2627 <= 0) {
            this.field2627 += class63.field1213 >> 4;
            class91.method688(0, this.field2611);
            this.method1051(this.field2611.method1441(), this.field2611, 7994);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class207 var10 = null;
                        class207 var11 = this.field2634[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class98 var12 = var11.field3521;
                                if (var12 == null || var12.field1786 <= var8) {
                                    var11.field3520 = true;
                                    int var13 = var11.method482();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1786 += var13;
                                    }
                                    if (var4 >= this.field2615) {
                                        break label105;
                                    }
                                    class207 var14 = var11.method477();
                                    if (var14 != null) {
                                        int var15 = var11.field3522;
                                        while (var14 != null) {
                                            this.method1051(var15 * var14.method1441() >> 8, var14, 7994);
                                            var14 = var11.method480();
                                        }
                                    }
                                    class207 var16 = var11.field3519;
                                    var11.field3519 = null;
                                    if (var10 == null) {
                                        this.field2634[var7] = var16;
                                    } else {
                                        var10.field3519 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2629[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3519;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class207 var18 = this.field2634[var17];
                this.field2634[var17] = this.field2629[var17] = null;
                while (var18 != null) {
                    class207 var19 = var18.field3519;
                    var18.field3519 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2627 < 0) {
            this.field2627 = 0;
        }
        if (this.field2611 != null) {
            this.field2611.method479(arg0, 0, arg1);
        }
        this.field2603 = class154.method1114(true);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()V", line = 165)
    public void method1047() throws Exception {
        field2608++;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()V", line = 172)
    public void method1048() {
        field2600++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V", line = 183)
    private final void method1049(int arg0, int arg1) {
        if (arg1 != 10200) {
            this.method1058(-86, (class207) null);
        }
        this.field2627 -= arg0;
        if (this.field2627 < 0) {
            this.field2627 = 0;
        }
        if (this.field2611 != null) {
            this.field2611.method478(arg0);
        }
        field2620++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 204)
    public final synchronized void method1050(int arg0) {
        this.field2624 = true;
        field2610++;
        try {
            if (arg0 < 51) {
                return;
            }
            this.method1047();
        } catch (Exception var3) {
            this.method1048();
            this.field2631 = class154.method1114(true) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILwj;I)V", line = 234)
    private final void method1051(int arg0, class207 arg1, int arg2) {
        int var4 = arg0 >> 5;
        field2614++;
        class207 var5 = this.field2629[var4];
        if (var5 == null) {
            this.field2634[var4] = arg1;
        } else {
            var5.field3519 = arg1;
        }
        this.field2629[var4] = arg1;
        if (arg2 != 7994) {
            this.method1055(-70);
        }
        arg1.field3522 = arg0;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 255)
    public void method1052(int arg0) throws Exception {
        field2623++;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "()I", line = 263)
    public int method1053() throws Exception {
        field2605++;
        return this.field2626;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 276)
    public void method1054(Component arg0) throws Exception {
        field2612++;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V", line = 283)
    public final void method1055(int arg0) {
        field2604++;
        if (arg0 != 2000) {
            this.method1046((int[]) null, -3);
        }
        this.field2624 = true;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V", line = 294)
    public static void method1056(int arg0) {
        field2622 = null;
        field2607 = null;
        if (arg0 != -32024) {
            field2622 = (class64) null;
        }
        field2616 = null;
        field2609 = null;
        field2602 = null;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "()V", line = 318)
    public void method1057() throws Exception {
        field2618++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILwj;)V", line = 331)
    public final synchronized void method1058(int arg0, class207 arg1) {
        field2613++;
        if (arg0 != 256) {
            this.field2633 = -51;
        }
        this.field2611 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 354)
    public final synchronized void method1059(byte arg0) {
        if (arg0 > -38) {
            method1056(-121);
        }
        field2606++;
        if (this.field2619 == null) {
            return;
        }
        long var2 = class154.method1114(true);
        try {
            if (this.field2631 != 0L) {
                if (var2 < this.field2631) {
                    return;
                }
                this.method1052(this.field2626);
                this.field2631 = 0L;
                this.field2624 = true;
            }
            int var4 = this.method1053();
            if (this.field2633 < (this.field2625 - var4)) {
                this.field2633 = this.field2625 - var4;
            }
            int var5 = this.field2636 + this.field2628;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field2626 < (var5 + 256)) {
                var4 = 0;
                this.field2626 += 1024;
                if (this.field2626 > 16384) {
                    this.field2626 = 16384;
                }
                this.method1048();
                this.method1052(this.field2626);
                if (var5 + 256 > this.field2626) {
                    var5 = this.field2626 - 256;
                    this.field2628 = var5 - this.field2636;
                }
                this.field2624 = true;
            }
            while (var4 < var5) {
                var4 += 256;
                this.method1046(this.field2619, 256);
                this.method1057();
            }
            if (var2 > this.field2635) {
                if (this.field2624) {
                    this.field2624 = false;
                } else if (this.field2633 == 0 && this.field2630 == 0) {
                    this.method1048();
                    this.field2631 = var2 + 2000L;
                    return;
                } else {
                    this.field2628 = Math.min(this.field2630, this.field2633);
                    this.field2630 = this.field2633;
                }
                this.field2635 = var2 + 2000L;
                this.field2633 = 0;
            }
            this.field2625 = var4;
        } catch (Exception var9) {
            this.method1048();
            this.field2631 = var2 + 2000L;
        }
        try {
            if (this.field2603 + 500000L < var2) {
                var2 = this.field2603;
            }
            while (var2 > (this.field2603 + 5000L)) {
                this.method1049(256, 10200);
                this.field2603 += (long) (256000 / class63.field1213);
            }
        } catch (Exception var8) {
            this.field2603 = var2;
        }
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)V", line = 470)
    public final synchronized void method1060(int arg0) {
        if (class228.field3875 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class228.field3875.field4732[var3] == this) {
                    class228.field3875.field4732[var3] = null;
                }
                if (class228.field3875.field4732[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class228.field3875.field4716 = true;
                while (class228.field3875.field4723) {
                    class267.method1871(10, 50L);
                }
                class228.field3875 = null;
            }
        }
        this.method1048();
        if (arg0 == -27441) {
            this.field2619 = null;
            field2601++;
        }
    }
}
