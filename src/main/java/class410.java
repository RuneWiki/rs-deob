import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class410 extends class175 {

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "[I")
    public int[] field5931;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "[I")
    public int[] field5934;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field5935 = 0;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lvm;Lai;IIIII)V")
    public static final void method2555(class322 arg0, class128 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class366.field5129 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class231.field3184) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class209.field2840 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class96 var15 = class176.field2209[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class98.field1161[var12].method271(var13, var14) + class98.field1161[var12].method271(var13 + 1, var14) + class98.field1161[var12].method271(var13, var14 + 1) + class98.field1161[var12].method271(var13 + 1, var14 + 1)) / 4 - (class98.field1161[arg2].method271(arg3, arg4) + class98.field1161[arg2].method271(arg3 + 1, arg4) + class98.field1161[arg2].method271(arg3, arg4 + 1) + class98.field1161[arg2].method271(arg3 + 1, arg4 + 1)) / 4;
                                    class449 var17 = var15.field1128;
                                    class449 var18 = var15.field1136;
                                    if (var17 != null && var17.method345((byte) -72)) {
                                        arg1.method353(var7, 101, var16, (var13 - arg3) * 128 + (1 - arg5) * 64, var17, (var14 - arg4) * 128 + (1 - arg6) * 64, arg0);
                                    }
                                    if (var18 != null && var18.method345((byte) -72)) {
                                        arg1.method353(var7, 59, var16, (var13 - arg3) * 128 + (1 - arg5) * 64, var18, (var14 - arg4) * 128 + (1 - arg6) * 64, arg0);
                                    }
                                    for (class122 var19 = var15.field1130; var19 != null; var19 = var19.field1511) {
                                        class17 var20 = var19.field1505;
                                        if (var20 != null && var20.method345((byte) -72) && (var20.field168 == var13 || var8 == var13) && (var20.field159 == var14 || var10 == var14)) {
                                            int var21 = var20.field158 + 1 - var20.field168;
                                            int var22 = var20.field153 + 1 - var20.field159;
                                            arg1.method353(var7, 86, var16, (var20.field168 - arg3) * 128 + (var21 - arg5) * 64, var20, (var20.field159 - arg4) * 128 + (var22 - arg6) * 64, arg0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZ)V")
    public static final void method2556(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2557((class286) null, -40, (class286) null, true);
        }
        field5929++;
        class32 var3 = class321.method1849(arg0, (byte) 41);
        int var4 = var3.field322;
        int var5 = var3.field320;
        int var6 = var3.field324;
        int var7 = class85.field946[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class88.method483(false, arg1 << var5 & var8 | class73.field814[var4] & ~var8, var4);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lam;ILam;Z)V")
    public static final void method2557(class286 arg0, int arg1, class286 arg2, boolean arg3) {
        class393.field5649 = arg2;
        class402.field5871 = arg3;
        class153.field1929 = arg0;
        if (arg1 == 29323) {
            field5930++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static final void method2558(int arg0) {
        class386.field5504.method613(true);
        field5936++;
        class249.field3353.method613(true);
        class350.field4869.method613(true);
        class155.field1961.method613(true);
        class208.field2807.method613(true);
        if (arg0 != 64) {
            field5935 = 124;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II[I[I)V")
    public class410(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field5931 = arg2;
        this.field5934 = arg3;
    }
}
