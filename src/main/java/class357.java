import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class357 {

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public int field4794;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public int field4787;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public int field4788;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public int field4792;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "J")
    public static long field4791 = 0L;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILgga;Lgga;)V")
    public static final void method2101(int arg0, class333 arg1, class333 arg2) {
        if (arg2.field4174 != null) {
            arg2.method1922(120);
        }
        field4796++;
        arg2.field4181 = arg1;
        arg2.field4174 = arg1.field4174;
        int var3 = -103 / ((32 - arg0) / 57);
        arg2.field4174.field4181 = arg2;
        arg2.field4181.field4174 = arg2;
    }

    @OriginalMember(owner = "client!wd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4790++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2102(int arg0, String arg1) {
        field4795++;
        if (!class348.field4665 || (class512.field7345 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class306.field3786;
        int[] var4 = class396.field5353;
        for (int var5 = 0; var5 < var3; var5++) {
            class236 var6 = class139.field1540[var4[var5]];
            if (var6.field2893 != null && var6.field2893.equalsIgnoreCase(arg1) && (class362.field4859 == var6 && (class512.field7345 & 0x10) != 0 || var6 != null && (class512.field7345 & 0x8) != 0)) {
                client.field9544++;
                class653 var7 = class699.method3845((byte) 45, class39.field395, class559.field7987);
                var7.field9158.method621(true, var4[var5]);
                var7.field9158.method645(-672168216, class672.field9355);
                var7.field9158.method622(-120, 0);
                var7.field9158.method645(-672168216, class465.field6641);
                var7.field9158.method668(class128.field1439, (byte) -99);
                class568.method3220(var7, (byte) 82);
                class285.method1662(0, 0, -2, var6.method1414(-31789), var6.method1414(-31789), (byte) 15, var6.field9517[0], true, var6.field9513[0]);
                var2 = true;
                break;
            }
        }
        int var8 = 13 / ((14 - arg0) / 55);
        if (!var2) {
            class340.method1964(4, class198.field2306.method1195((byte) 62, class504.field7267) + arg1, 105);
        }
        if (class348.field4665) {
            class204.method1218(-99);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZIZLjava/lang/String;Ljava/lang/String;)V")
    public static final void method2103(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, String arg5, String arg6) {
        class483.field6974.field9837 = 1;
        field4793++;
        String var7 = arg5.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg3 != -1) {
            class166 var11 = class53.field531.method1562(arg3, (byte) -111);
            if (var11 == null || arg2 != var11.method910((byte) 68)) {
                return;
            }
            if (var11.method910((byte) 68)) {
                var10 = var11.field1865;
            } else {
                var9 = var11.field1859;
            }
        }
        int var12 = 0;
        int var13 = 0;
        if (arg0 != -17689) {
            field4791 = 76L;
        }
        while (class19.field153.field522 > var13) {
            class487 var16 = class19.field153.method272(var13, -11824);
            if ((!arg4 || var16.field7045) && var16.field7034 == -1 && var16.field7030 == -1 && var16.field7041 == 0 && var16.field7027.toLowerCase().indexOf(var7) != -1) {
                label98: {
                    if (arg3 != -1) {
                        if (arg2) {
                            if (!arg6.equals(var16.method2828(arg3, arg0 ^ 0x4546, var10))) {
                                break label98;
                            }
                        } else if (arg1 != var16.method2827(var9, arg3, 0)) {
                            break label98;
                        }
                    }
                    if (var12 >= 250) {
                        class613.field8624 = -1;
                        class578.field8185 = null;
                        return;
                    }
                    if (var12 >= var8.length) {
                        short[] var17 = new short[var8.length * 2];
                        for (int var18 = 0; var18 < var12; var18++) {
                            var17[var18] = var8[var18];
                        }
                        var8 = var17;
                    }
                    var8[var12++] = (short) var13;
                }
            }
            var13++;
        }
        class613.field8624 = var12;
        class220.field2625 = 0;
        class578.field8185 = var8;
        String[] var14 = new String[class613.field8624];
        for (int var15 = 0; var15 < class613.field8624; var15++) {
            var14[var15] = class19.field153.method272(var8[var15], class2.method13(arg0, 27447)).field7027;
        }
        class664.method3686(var14, (byte) 83, class578.field8185);
        class483.field6974.method3867(false);
        class483.field6974.field9837 = 2;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIII)V")
    public class357(int arg0, int arg1, int arg2, int arg3) {
        this.field4794 = arg3;
        this.field4787 = arg1;
        this.field4788 = arg2;
        this.field4792 = arg0;
    }
}
