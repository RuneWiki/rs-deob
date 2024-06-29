import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class193 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1262(int arg0, byte arg1, int arg2) {
        field2659++;
        if (!class674.field9590) {
            return false;
        }
        int var3 = 54 % ((arg1 - 22) / 33);
        int var4 = arg0 >> 16;
        int var5 = arg0 & 0xFFFF;
        if (class124.field1729[var4] == null || class124.field1729[var4][var5] == null) {
            return false;
        }
        class423 var6 = class124.field1729[var4][var5];
        if (arg2 == -1 && var6.field5598 == 0) {
            for (class354 var7 = (class354) class101.field1211.method2506(68); var7 != null; var7 = (class354) class101.field1211.method2505(-116)) {
                if (var7.field4729 == 2 || var7.field4729 == 1001 || var7.field4729 == 60 || var7.field4729 == 50 || var7.field4729 == 48) {
                    for (class423 var8 = class592.method3271(var7.field4725, (byte) -76); var8 != null; var8 = class292.method1730(var8, (byte) -122)) {
                        if (var6.field5685 == var8.field5685) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class354 var9 = (class354) class101.field1211.method2506(68); var9 != null; var9 = (class354) class101.field1211.method2505(-120)) {
                if (var9.field4722 == arg2 && var6.field5685 == var9.field4725 && (var9.field4729 == 2 || var9.field4729 == 1001 || var9.field4729 == 60 || var9.field4729 == 50 || var9.field4729 == 48)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Z")
    public static final boolean method1263(int arg0, int arg1, int arg2) {
        int var3 = 39 % ((-arg0 - 30) / 51);
        field2657++;
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1264(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2658++;
        if (arg4 != -34) {
            return;
        }
        int var6 = arg3 - arg0;
        int var7 = arg1 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class499.method2835(arg5, arg3, arg4 + 34, arg0, arg2);
            }
        } else if (var6 == 0) {
            class250.method1521(arg2, arg1, (byte) 94, arg5, arg0);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg5;
                int var10 = arg1;
                arg5 = arg0;
                arg1 = arg3;
                arg0 = var9;
                arg3 = var10;
            }
            if (arg1 < arg5) {
                int var11 = arg5;
                arg5 = arg1;
                int var12 = arg0;
                arg1 = var11;
                arg0 = arg3;
                arg3 = var12;
            }
            int var13 = arg0;
            int var14 = arg1 - arg5;
            int var15 = arg3 - arg0;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg3 <= arg0 ? -1 : 1;
            if (var8) {
                for (int var19 = arg5; var19 <= arg1; var19++) {
                    class315.field4224[var19][var13] = arg2;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg5; var18 <= arg1; var18++) {
                    class315.field4224[var13][var18] = arg2;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BII)V")
    public static final void method1265(byte arg0, int arg1, int arg2) {
        field2660++;
        class34 var3 = class569.field7760[arg1][arg2];
        if (var3 != null) {
            class125.field1742 = var3.field468;
            class498.field6847 = var3.field482;
            class180.field2531 = var3.field481;
        }
        class287.method1700(1);
        if (arg0 <= 34) {
            method1263(44, -48, -97);
        }
    }
}
