import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class30 extends class400 {

    @OriginalMember(owner = "client!iha", name = "t", descriptor = "Luh;")
    private class168 field769 = new class168();

    @OriginalMember(owner = "client!iha", name = "S", descriptor = "I")
    private int field793 = 256;

    @OriginalMember(owner = "client!iha", name = "U", descriptor = "I")
    private int field795 = 256;

    @OriginalMember(owner = "client!iha", name = "V", descriptor = "I")
    private int field796 = 0;

    @OriginalMember(owner = "client!iha", name = "M", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "client!iha", name = "C", descriptor = "Z")
    public static boolean field778 = true;

    @OriginalMember(owner = "client!iha", name = "u", descriptor = "[I")
    public static int[] field770 = new int[4096];

    @OriginalMember(owner = "client!iha", name = "G", descriptor = "Z")
    public static boolean field782 = false;

    @OriginalMember(owner = "client!iha", name = "y", descriptor = "J")
    public static long field774 = 0L;

    @OriginalMember(owner = "client!iha", name = "B", descriptor = "D")
    public static double field777;

    @OriginalMember(owner = "client!iha", name = "s", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!iha", name = "v", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!iha", name = "w", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!iha", name = "x", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!iha", name = "z", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!iha", name = "A", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!iha", name = "D", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!iha", name = "E", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!iha", name = "F", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!iha", name = "I", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!iha", name = "J", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!iha", name = "K", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!iha", name = "L", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!iha", name = "N", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!iha", name = "O", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!iha", name = "P", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!iha", name = "Q", descriptor = "I")
    private int field791;

    @OriginalMember(owner = "client!iha", name = "R", descriptor = "Z")
    private boolean field792;

    @OriginalMember(owner = "client!iha", name = "T", descriptor = "Z")
    private boolean field794;

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "(II)V", line = 6)
    public final void method405(int arg0, int arg1) {
        this.field793 = arg1;
        this.field795 = arg1;
        if (arg0 != -17708) {
            method408(-93);
        }
        field788++;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)Llm;", line = 21)
    private final synchronized class500 method406(int arg0) {
        if (arg0 != -23076) {
            this.method92(null, 71, 78);
        }
        field780++;
        return (class500) this.field769.method1269(arg0 + 23080);
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "()Ljba;", line = 32)
    public final class400 method69() {
        field785++;
        return null;
    }

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "(I)I", line = 40)
    public final synchronized int method407(int arg0) {
        field779++;
        if (arg0 >= -33) {
            this.method409((byte) 84);
        }
        return this.field796;
    }

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "(I)V", line = 52)
    public static void method408(int arg0) {
        if (arg0 != 0) {
            method412((byte) 68, null);
        }
        field770 = null;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V", line = 62)
    private final synchronized void method409(byte arg0) {
        field783++;
        int var2 = -13 / ((-arg0 - 66) / 49);
        class500 var3 = this.method406(-23076);
        if (var3 != null) {
            var3.method2314((byte) 71);
            this.field796--;
            this.field791 = 0;
            class593.field8115.method2367(var3.method2949(90), var3, -1);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "([I[JI)V", line = 80)
    public static final void method410(int[] arg0, long[] arg1, int arg2) {
        class82.method781(arg2, arg2 - 107, arg1, arg1.length - 1, arg0);
        field790++;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "([III)V", line = 90)
    public final synchronized void method92(int[] arg0, int arg1, int arg2) {
        field771++;
        if (this.field794) {
            return;
        }
        if (this.method406(-23076) != null) {
            int var4 = arg1 + arg2;
            if (class86.field1544) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field787 == 2) {
                var6 = 1;
            }
            while (arg1 < var4) {
                class500 var7 = this.method406(-23076);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field6987;
                while (arg1 < var4 && this.field791 < var8[0].length) {
                    if (class86.field1544) {
                        arg0[arg1++] = var8[var5][this.field791] * this.field793;
                        arg0[arg1++] = var8[var6][this.field791] * this.field795;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field791] * this.field793 + var8[var6][this.field791] * this.field795;
                    }
                    this.field791++;
                }
                if (var8[0].length <= this.field791) {
                    this.method409((byte) -126);
                }
            }
        } else if (this.field792) {
            this.method2314((byte) 23);
            class593.field8115.method2365(true);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZ)V", line = 157)
    public final synchronized void method411(int arg0, boolean arg1) {
        if (arg0 != 1) {
            field777 = -2.8743710633758983D;
        }
        this.field794 = arg1;
        field786++;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(BLcea;)Lfn;", line = 174)
    public static final class140 method412(byte arg0, class215 arg1) {
        field784++;
        class95 var2 = class590.method3368(15)[arg1.method1535(255)];
        if (arg0 > -113) {
            field777 = -1.5911312034627048D;
        }
        class236 var3 = class554.method3187(20000)[arg1.method1535(255)];
        int var4 = arg1.method1520(13638);
        int var5 = arg1.method1520(13638);
        int var6 = arg1.method1478(842397944);
        int var7 = arg1.method1478(842397944);
        int var8 = arg1.method1520(13638);
        int var9 = arg1.method1533((byte) -126);
        int var10 = arg1.method1533((byte) -126);
        return new class140(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Llm;I)V", line = 206)
    public final synchronized void method413(class500 arg0, int arg1) {
        while (this.field796 >= 100) {
            this.field769.method1271(8);
            this.field796--;
        }
        if (arg1 == 30700) {
            field789++;
            this.field769.method1273(arg0, -20180);
            this.field796++;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "()Ljba;", line = 232)
    public final class400 method103() {
        field775++;
        return null;
    }

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "(I)V", line = 245)
    public final synchronized void method414(int arg0) {
        this.field792 = true;
        if (arg0 != -1) {
            this.field769 = null;
        }
        field773++;
    }

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "(I)D", line = 256)
    public final synchronized double method415(int arg0) {
        field776++;
        if (this.field796 < 1) {
            return -1.0D;
        }
        if (arg0 != -21987) {
            this.method69();
        }
        class500 var2 = (class500) this.field769.method1269(4);
        return var2 == null ? -1.0D : (double) (-((float) var2.field6987[0].length / (float) class103.field1834)) + var2.field6981;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IDI)Llm;", line = 277)
    public final class500 method416(int arg0, double arg1, int arg2) {
        field768++;
        long var5 = (long) (arg0 | this.field787 << 0);
        class500 var7 = (class500) class593.field8115.method2364(var5, (byte) -31);
        if (arg2 != 1401320384) {
            return null;
        }
        if (var7 == null) {
            var7 = new class500(new short[this.field787][arg0], arg1);
        } else {
            var7.field6981 = arg1;
            class593.field8115.method2366(-121, var5);
        }
        return var7;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V", line = 301)
    public final synchronized void method89(int arg0) {
        field772++;
        if (this.field794) {
            return;
        }
        while (true) {
            class500 var2 = this.method406(-23076);
            if (var2 == null) {
                if (this.field792) {
                    this.method2314((byte) 108);
                    class593.field8115.method2365(true);
                }
                return;
            }
            if (arg0 < (var2.field6987[0].length - this.field791)) {
                this.field791 += arg0;
                return;
            }
            arg0 -= var2.field6987[0].length - this.field791;
            this.method409((byte) 111);
        }
    }

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "()I", line = 340)
    public final int method111() {
        field781++;
        return 1;
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(I)V", line = 370)
    public class30(int arg0) {
        this.field787 = arg0;
    }
}
