import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class49 extends class60 {

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public int field865 = -1;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
    public int field870 = 0;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "Lub;")
    public static class227 field863 = class257.method1749("details)3dat", 17263);

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field858 = 0;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "Lub;")
    public static class227 field869 = class257.method1749("logo", 17263);

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public int field866;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "[Lnf;")
    public static class213[] field872;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lfh;IIIII)V")
    public static final void method288(class180 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class156.field2677 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class15.field285) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class112.field2075 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class108 var14 = class261.field4539[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class98.field1717[var11][var12 + 1][var13] + class98.field1717[var11][var12][var13] + class98.field1717[var11][var12][var13 + 1] + class98.field1717[var11][var12 + 1][var13 + 1]) / 4 - (class98.field1717[arg1][arg2 + 1][arg3] + class98.field1717[arg1][arg2][arg3] + class98.field1717[arg1][arg2][arg3 + 1] + class98.field1717[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class50 var16 = var14.field2024;
                                    if (var16 != null) {
                                        if (var16.field886.method550()) {
                                            arg0.method558(var16.field886, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field880 != null && var16.field880.method550()) {
                                            arg0.method558(var16.field880, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2012; var17++) {
                                        class230 var18 = var14.field2021[var17];
                                        if (var18 != null && var18.field4021.method550() && (var18.field4032 == var12 || var7 == var12) && (var18.field4025 == var13 || var9 == var13)) {
                                            int var19 = var18.field4020 + 1 - var18.field4032;
                                            int var20 = var18.field4015 + 1 - var18.field4025;
                                            arg0.method558(var18.field4021, (var18.field4032 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4025 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public static void method289(int arg0) {
        field869 = null;
        if (arg0 == 64) {
            field863 = null;
            field872 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)J")
    public static final long method290(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        return var3 == null || var3.field2039 == null ? 0L : var3.field2039.field2312;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)I")
    public static final int method291(int arg0, int arg1) {
        if (arg0 < 73) {
            method290(-95, -61, 72);
        }
        field855++;
        return arg1 >>> 7;
    }
}
