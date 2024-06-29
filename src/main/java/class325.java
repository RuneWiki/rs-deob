import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class325 {

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public int field5168;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public int field5166;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public int field5161;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public int field5169;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field5165 = 0;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field5163 = 0;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5162 = "Loading config - ";

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Ljj;")
    public static class122 field5170;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 5)
    public static void method2289(byte arg0) {
        if (arg0 != 14) {
            field5167 = 18;
        }
        field5170 = null;
        field5162 = null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V", line = 20)
    public static final void method2290(byte arg0) {
        class129.field2187.method2327(1);
        class180.field2878.method2327(1);
        if (arg0 < 106) {
            method2290((byte) -39);
        }
        field5164++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lhd;IIIII)V", line = 40)
    public static final void method2291(class161 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class56.field942 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class273.field4526) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class162.field2574 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class36 var14 = class129.field2184[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class101.field1656[var11][var12 + 1][var13] + class101.field1656[var11][var12][var13] + class101.field1656[var11][var12][var13 + 1] + class101.field1656[var11][var12 + 1][var13 + 1]) / 4 - (class101.field1656[arg1][arg2 + 1][arg3] + class101.field1656[arg1][arg2][arg3] + class101.field1656[arg1][arg2][arg3 + 1] + class101.field1656[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class338 var16 = var14.field533;
                                    if (var16 != null) {
                                        if (var16.field5392.method890()) {
                                            arg0.method879(var16.field5392, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field5390 != null && var16.field5390.method890()) {
                                            arg0.method879(var16.field5390, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field531; var17++) {
                                        class209 var18 = var14.field544[var17];
                                        if (var18 != null && var18.field3287.method890() && (var18.field3283 == var12 || var7 == var12) && (var18.field3291 == var13 || var9 == var13)) {
                                            int var19 = var18.field3289 + 1 - var18.field3283;
                                            int var20 = var18.field3280 + 1 - var18.field3291;
                                            arg0.method879(var18.field3287, (var18.field3283 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3291 - arg3) * 128 + (var20 - arg5) * 64, var6);
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

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 144)
    public class325() {
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lbg;)V", line = 146)
    public class325(class325 arg0) {
        this.field5168 = arg0.field5168;
        this.field5166 = arg0.field5166;
        this.field5161 = arg0.field5161;
        this.field5169 = arg0.field5169;
    }
}
