import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class257 {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4230 = "skill: ";

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)I")
    public static final int method1792(int arg0, byte arg1) {
        field4231++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg1 == 0) {
            int var4 = var3 | var3 >>> 4;
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        } else {
            return 6;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ltf;)V")
    public static final void method1793(class114 arg0) {
        for (int var1 = arg0.field1724; var1 <= arg0.field1715; var1++) {
            for (int var2 = arg0.field1719; var2 <= arg0.field1714; var2++) {
                class154 var3 = class27.field346[arg0.field1725][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2431; var4++) {
                        if (var3.field2418[var4] == arg0) {
                            var3.field2431--;
                            for (int var5 = var4; var5 < var3.field2431; var5++) {
                                var3.field2418[var5] = var3.field2418[var5 + 1];
                                var3.field2417[var5] = var3.field2417[var5 + 1];
                            }
                            var3.field2418[var3.field2431] = null;
                            break;
                        }
                    }
                    var3.field2434 = 0;
                    for (int var6 = 0; var6 < var3.field2431; var6++) {
                        var3.field2434 |= var3.field2417[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIII)V")
    public static final void method1794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4232++;
        int var10 = arg5 + 1;
        class71.method451(arg2, true, arg3, arg1, class130.field2005[arg5]);
        int var9 = arg0 - 1;
        class71.method451(arg2, true, arg3, arg1, class130.field2005[arg0]);
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var7 = class130.field2005[var6];
            var7[arg1] = var7[arg3] = arg2;
        }
        if (arg4 != -1) {
            field4230 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
    public static void method1795(boolean arg0) {
        if (arg0) {
            field4230 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static final void method1796(int arg0) {
        int var1 = class7.field56.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class7.field56[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class231.field3703; var4++) {
                    if (class53.field718[var2] == class145.field2275[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class145.field2275[class231.field3703] = class53.field718[var2];
                    var3 = class231.field3703++;
                }
                class202 var5 = new class202(class7.field56[var2]);
                int var6 = 0;
                while (class7.field56[var2].length > var5.field3272 && var6 < 511 && class14.field195 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1419(111);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = (class53.field718[var2] >> 8) * 64 + var10 - class101.field1517;
                    int var12 = var8 & 0x3F;
                    int var13 = (class53.field718[var2] & 0xFF) * 64 + var12 - class254.field4063;
                    class106 var14 = class145.method974(-85, var5.method1419(110));
                    if (class76.field1188[var7] == null && (var14.field1588 & 0x1) > 0 && class102.field1537 == var9 && var11 >= 0 && var14.field1591 + var11 < 104 && var13 >= 0 && var14.field1591 + var13 < 104) {
                        class76.field1188[var7] = new class35();
                        class35 var15 = class76.field1188[var7];
                        class76.field1189[class14.field195++] = var7;
                        var15.field860 = class4.field32;
                        var15.method214(var14, (byte) -39);
                        var15.method365(var15.field442.field1591, -17145);
                        var15.field802 = var15.field855 = class164.field2588[var15.field442.field1620];
                        var15.field841 = var15.field442.field1644;
                        var15.field807 = var15.field442.field1603;
                        if (var15.field841 == 0) {
                            var15.field855 = 0;
                        }
                        var15.method357(true, var15.method362(25892), (byte) -127, var11, var13);
                    }
                }
            }
        }
        field4229++;
        if (arg0 != 104) {
            method1796(87);
        }
    }
}
