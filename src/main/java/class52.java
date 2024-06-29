import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class52 {

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "F")
    public float field794 = 0.25F;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "F")
    public float field802 = 1.0F;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "F")
    public float field798 = 1.0F;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "F")
    public float field792;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "F")
    public float field803;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "Lbn;")
    public class307 field801;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "F")
    public float field789;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "[I")
    public static int[] field791 = new int[8];

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "Ljp;")
    public static class55 field800 = new class55(80, -2);

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "Ljp;")
    public static class55 field808 = new class55(43, 7);

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 17)
    public static void method340(int arg0) {
        field800 = null;
        if (arg0 > 28) {
            field791 = null;
            field808 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V", line = 29)
    public static final void method341(int arg0) {
        field793++;
        class314.field4777.method2147((byte) -122);
        class118.field1813.method891(-110);
        class306.field4682.method1957(128);
        class247.field3693.method2276(90);
        class462.field6842.method1228(-5610);
        class300.field4608.method2089(6567);
        int var1 = -13 % ((-arg0 - 15) / 53);
        class393.field5735.method1539(-107);
        class232.field3490.method2627((byte) -123);
        class529.field7739.method2101(10);
        class390.field5714.method53((byte) -70);
        class315.field4808.method155(-128);
        class384.field5647.method770(false);
        class455.field6765.method2185(6506);
        class389.field5702.method1826((byte) -114);
        class264.field4225.method2794((byte) -104);
        class335.field5044.method1978((byte) -30);
        class436.field6496.method2980((byte) 95);
        class61.field958.method203(33);
        class256.field4117.method3113((byte) 58);
        class420.field6176.method930((byte) 119);
        class386.method2458((byte) 90);
        class103.method830((byte) 110);
        class81.method718(-92);
        class398.method2511(-16719);
        class81.field1329.method1630(-45);
        class531.field7750.method1630(-34);
        class90.field1445.method1630(-104);
        class194.field3030.method1630(-63);
        class152.field2295.method1630(-116);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V", line = 67)
    public static final void method342(int arg0, int arg1) {
        if (arg0 != 1) {
            return;
        }
        field790++;
        if (arg1 != -1 && class327.field4950[arg1]) {
            class254.field4106.method744(true, arg1);
            class237.field3555[arg1] = null;
            class394.field5749[arg1] = null;
            class327.field4950[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V", line = 294)
    public class52() {
        this.field792 = 0.69921875F;
        this.field788 = -60;
        this.field807 = class46.field729;
        this.field803 = 1.2F;
        this.field787 = -50;
        this.field797 = -50;
        this.field786 = 0;
        this.field805 = class23.field270;
        this.field801 = class489.field7140;
        this.field789 = 1.1523438F;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lfh;)V", line = 310)
    public class52(class194 arg0) {
        int var2 = arg0.method1337((byte) 14);
        if (class40.field667.method1835(class108.field1631, true) && class73.field1248.method572() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field807 = class46.field729;
            } else {
                this.field807 = arg0.method1401(125);
            }
            if ((var2 & 0x2) == 0) {
                this.field789 = 1.1523438F;
            } else {
                this.field789 = (float) arg0.method1396(2) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field792 = 0.69921875F;
            } else {
                this.field792 = (float) arg0.method1396(103) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field803 = 1.2F;
            } else {
                this.field803 = (float) arg0.method1396(18) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1401(-113);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1396(-111);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1396(-105);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1396(110);
            }
            this.field803 = 1.2F;
            this.field807 = class46.field729;
            this.field789 = 1.1523438F;
            this.field792 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field788 = -60;
            this.field787 = -50;
            this.field797 = -50;
        } else {
            this.field797 = arg0.method1384(true);
            this.field788 = arg0.method1384(true);
            this.field787 = arg0.method1384(true);
        }
        if ((var2 & 0x20) == 0) {
            this.field805 = class23.field270;
        } else {
            this.field805 = arg0.method1401(-19);
        }
        if ((var2 & 0x40) == 0) {
            this.field786 = 0;
        } else {
            this.field786 = arg0.method1396(-95);
        }
        if ((var2 & 0x80) == 0) {
            this.field801 = class489.field7140;
        } else {
            int var3 = arg0.method1396(-91);
            int var4 = arg0.method1396(65);
            int var5 = arg0.method1396(22);
            int var6 = arg0.method1396(-100);
            int var7 = arg0.method1396(61);
            int var8 = arg0.method1396(-121);
            this.field801 = class364.method2325(var4, -118, var8, var3, var7, var6, var5);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZIIIZIZ)V", line = 92)
    public static final void method343(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (!arg6) {
            method342(118, -89);
        }
        if (arg3 < arg1) {
            int var7 = (arg1 + arg3) / 2;
            int var8 = arg3;
            class424 var9 = class205.field3154[var7];
            class205.field3154[var7] = class205.field3154[arg1];
            class205.field3154[arg1] = var9;
            for (int var10 = arg3; var10 < arg1; var10++) {
                if (class485.method2933(var9, 86, arg5, arg4, class205.field3154[var10], arg2, arg0) <= 0) {
                    class424 var11 = class205.field3154[var10];
                    class205.field3154[var10] = class205.field3154[var8];
                    class205.field3154[var8++] = var11;
                }
            }
            class205.field3154[arg1] = class205.field3154[var8];
            class205.field3154[var8] = var9;
            method343(arg0, var8 - 1, arg2, arg3, arg4, arg5, arg6);
            method343(arg0, arg1, arg2, var8 + 1, arg4, arg5, true);
        }
        field795++;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lfh;B)V", line = 147)
    public final void method344(class194 arg0, byte arg1) {
        int var3 = 122 % ((arg1 - 50) / 41);
        field804++;
        this.field802 = (float) (arg0.method1337((byte) -116) * 8) / 255.0F;
        this.field794 = (float) (arg0.method1337((byte) -127) * 8) / 255.0F;
        this.field798 = (float) (arg0.method1337((byte) -128) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IJ)V", line = 159)
    public static final void method345(int arg0, long arg1) {
        field796++;
        int var3 = 124 / ((80 - arg0) / 37);
        int var4 = class280.field4364 + class116.field1781.field1275;
        int var5 = class110.field1657 + class116.field1781.field1279;
        if ((class172.field2662 - var4) < -500 || class172.field2662 - var4 > 500 || (class351.field5232 - var5) < -500 || class351.field5232 - var5 > 500) {
            class351.field5232 = var5;
            class172.field2662 = var4;
        }
        if (class172.field2662 != var4) {
            int var6 = var4 - class172.field2662;
            int var7 = (int) ((long) var6 * arg1 / 320L);
            if (var6 <= 0) {
                if (var7 == 0) {
                    var7 = -1;
                } else if (var7 < var6) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = 1;
            } else if (var7 > var6) {
                var7 = var6;
            }
            class172.field2662 += var7;
        }
        if (class351.field5232 != var5) {
            int var8 = var5 - class351.field5232;
            int var9 = (int) ((long) var8 * arg1 / 320L);
            if (var8 <= 0) {
                if (var9 == 0) {
                    var9 = -1;
                } else if (var8 > var9) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (var9 > var8) {
                var9 = var8;
            }
            class351.field5232 += var9;
        }
        if (!class40.field667.field4187) {
            class434.field6466 += (float) arg1 * class305.field4672 / 6.0F;
            class353.field5236 += (float) arg1 * class301.field4616 / 6.0F;
        }
        class70.method613(true);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILpq;)Z", line = 254)
    public final boolean method346(int arg0, class52 arg1) {
        if (arg0 != 8) {
            this.field805 = -60;
        }
        field806++;
        return this.field807 == arg1.field807 && this.field789 == arg1.field789 && this.field792 == arg1.field792 && this.field803 == arg1.field803 && this.field794 == arg1.field794 && this.field802 == arg1.field802 && this.field798 == arg1.field798 && this.field805 == arg1.field805 && this.field786 == arg1.field786 && this.field801 == arg1.field801;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)I", line = 265)
    public static final int method347(int arg0, int arg1, int arg2) {
        field799++;
        if (arg1 != 500) {
            return -5;
        }
        int var3 = 0;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg0--;
            arg2 >>>= 0x1;
        }
        return var3;
    }
}
