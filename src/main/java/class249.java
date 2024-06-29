import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class249 extends class205 {

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    private int field3985;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "[F")
    public static float[] field3988 = new float[4];

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "[Lth;")
    public class288[] field3982;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "[[B")
    private byte[][] field3987;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method1708(int arg0) {
        field3984++;
        if (this.field3982 != null) {
            return true;
        }
        if (this.field3987 == null) {
            class422 var2 = class553.field7880;
            synchronized (class553.field7880) {
                if (!class553.field7880.method2607(this.field3985, (byte) -117)) {
                    return false;
                }
                int[] var4 = class553.field7880.method2619(this.field3985, true);
                this.field3987 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field3987[var5] = class553.field7880.method2624(0, this.field3985, var4[var5]);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field3987.length; var7++) {
            byte[] var8 = this.field3987[var7];
            class301 var9 = new class301(var8);
            var9.field4534 = 1;
            int var10 = var9.method1989((byte) -118);
            class422 var11 = class133.field2142;
            synchronized (class133.field2142) {
                var6 &= class133.field2142.method2621(var10, -28975);
            }
        }
        if (!var6) {
            return false;
        }
        class605 var12 = new class605();
        class422 var13 = class553.field7880;
        int[] var15;
        synchronized (class553.field7880) {
            int var14 = class553.field7880.method2615(0, this.field3985);
            this.field3982 = new class288[var14];
            var15 = class553.field7880.method2619(this.field3985, true);
        }
        int var16 = 38 / ((arg0 - 39) / 43);
        for (int var17 = 0; var17 < var15.length; var17++) {
            byte[] var18 = this.field3987[var17];
            class301 var19 = new class301(var18);
            var19.field4534 = 1;
            int var20 = var19.method1989((byte) -115);
            class620 var21 = null;
            for (class620 var22 = (class620) var12.method3463((byte) -50); var22 != null; var22 = (class620) var12.method3469((byte) 107)) {
                if (var22.field8716 == var20) {
                    var21 = var22;
                    break;
                }
            }
            if (var21 == null) {
                class422 var23 = class133.field2142;
                synchronized (class133.field2142) {
                    var21 = new class620(var20, class133.field2142.method2633(true, var20));
                }
                var12.method3472(98, var21);
            }
            this.field3982[var15[var17]] = new class288(var18, var21);
        }
        this.field3987 = null;
        return true;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(II)Z", line = 115)
    public final boolean method1709(int arg0, int arg1) {
        if (arg1 == 4) {
            field3980++;
            return this.field3982[arg0].field4426;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I", line = 131)
    public static final int method1710(byte arg0) {
        if (arg0 < 43) {
            field3988 = null;
        }
        field3986++;
        return 16;
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(II)Z", line = 143)
    public final boolean method1711(int arg0, int arg1) {
        field3981++;
        if (arg1 != 0) {
            field3988 = null;
        }
        return this.field3982[arg0].field4425;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V", line = 156)
    public static void method1712(int arg0) {
        field3988 = null;
        int var1 = -59 % ((arg0 - 46) / 46);
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(II)Z", line = 165)
    public final boolean method1713(int arg0, int arg1) {
        field3983++;
        if (arg0 > -39) {
            this.field3987 = null;
        }
        return this.field3982[arg1].field4438;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V", line = 178)
    public class249(int arg0) {
        this.field3985 = arg0;
    }
}
