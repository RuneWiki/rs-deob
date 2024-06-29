import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class140 extends class270 {

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "I")
    private int field2246 = 204;

    @OriginalMember(owner = "client!ki", name = "eb", descriptor = "I")
    private int field2256 = 1;

    @OriginalMember(owner = "client!ki", name = "fb", descriptor = "I")
    private int field2257 = 1;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "Lmh;")
    public static class62 field2255 = class201.method1405(true, "document)3cookie=(R");

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "Ljg;")
    public static class165 field2253;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V", line = 5)
    public static final void method1045(int arg0) {
        class109 var1 = class111.field1810;
        synchronized (class111.field1810) {
            class206.field3487++;
            class228.field3970 = class155.field2504;
            if (arg0 >= ~class243.field4138) {
                while (class243.field4138 != class118.field1982) {
                    int var3 = class114.field1911[class118.field1982];
                    class118.field1982 = class118.field1982 + 1 & 0x7F;
                    if (var3 < 0) {
                        class291.field4939[~var3] = false;
                    } else {
                        class291.field4939[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class291.field4939[var2] = false;
                }
                class243.field4138 = class118.field1982;
            }
            class155.field2504 = class304.field5229;
        }
        field2254++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lmi;II)V", line = 47)
    public final void method8(class92 arg0, int arg1, int arg2) {
        int var4 = 18 / ((arg2 + 8) / 53);
        field2250++;
        if (arg1 == 0) {
            this.field2256 = arg0.method702(-1);
        } else if (arg1 == 1) {
            this.field2257 = arg0.method702(-1);
        } else if (arg1 == 2) {
            this.field2246 = arg0.method721(121);
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 102)
    public class140() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIBI)V", line = 110)
    public static final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field2252++;
        if (arg7 > -111) {
            method1049(25, 72, 32, -19, 71, -52, -5);
        }
        if (class20.method95(true, arg2)) {
            class41.field624 = null;
            class4.method22(arg0, arg4, arg1, class275.field4713[arg2], arg8, arg5, arg6, -1, 81, arg3);
            if (class41.field624 != null) {
                class4.method22(arg0, arg4, arg1, class41.field624, arg8, class193.field3248, class85.field1380, -1412584499, 122, arg3);
                class41.field624 = null;
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class220.field3784[var9] = true;
            }
        } else {
            class220.field3784[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)I", line = 155)
    public static final int method1047(int arg0) {
        field2249++;
        if (class174.field2804 == 0) {
            return 0;
        } else {
            int var1 = -88 / ((arg0 + 57) / 33);
            return class163.field2647[class174.field2804].method383();
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)[I", line = 174)
    public final int[] method6(int arg0, int arg1) {
        int[] var3 = this.field4573.method919(arg1, arg0 + 7379);
        field2245++;
        if (arg0 != 18693) {
            field2253 = (class165) null;
        }
        if (this.field4573.field1984) {
            for (int var4 = 0; var4 < class109.field1770; var4++) {
                int var5 = class166.field2702[arg1];
                int var6 = class283.field4840[var4];
                int var7 = this.field2256 * var6 >> 12;
                int var8 = this.field2257 * var5 >> 12;
                int var9 = var6 % (4096 / this.field2256) * this.field2256;
                int var10 = var5 % (4096 / this.field2257) * this.field2257;
                if (var10 < this.field2246) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field2246) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field2246) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "(B)V", line = 259)
    public static void method1048(byte arg0) {
        int var1 = 111 / ((-arg0 - 58) / 43);
        field2253 = null;
        field2255 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIII)V", line = 269)
    public static final void method1049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2247++;
        int var7 = arg5 + arg6;
        int var8 = arg1 - arg5;
        for (int var9 = arg6; var9 < var7; var9++) {
            class271.method1861(arg2, true, class282.field4817[var9], arg0, arg3);
        }
        if (arg4 != -24258) {
            field2253 = (class165) null;
        }
        for (int var10 = arg1; var10 > var8; var10--) {
            class271.method1861(arg2, true, class282.field4817[var10], arg0, arg3);
        }
        int var11 = arg0 - arg5;
        int var12 = arg3 + arg5;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class282.field4817[var13];
            class271.method1861(arg2, true, var14, var12, arg3);
            class271.method1861(arg2, true, var14, arg0, var11);
        }
    }
}
