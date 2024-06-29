import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class142 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lpi;")
    public static class340 field1878 = new class340(33, -2);

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1882 = 0;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lpi;")
    public static class340 field1883 = new class340(52, 16);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z", line = 4)
    public static final boolean method976(int arg0) {
        field1880++;
        if (arg0 == 0) {
            return class246.field3151 != class222.field2867 || class363.field4685 >= 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[I[I[ILqt;)V", line = 27)
    public static final void method984(int arg0, int[] arg1, int[] arg2, int[] arg3, class295 arg4) {
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg4.field5183.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field5183[var9] = null;
                    } else {
                        class44 var10 = class403.field5429.method1962(var6, false);
                        int var11 = var10.field643;
                        class447 var12 = arg4.field5183[var9];
                        if (var12 != null) {
                            if (var12.field6218 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field5183[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field6210 = 0;
                                    var12.field6212 = var8;
                                    var12.field6214 = 0;
                                    var12.field6219 = 1;
                                    var12.field6215 = 0;
                                    class284.method1729(arg4.field6239, 0, 105, arg4.field6220, arg4.field6241, var10, false);
                                } else if (var11 == 2) {
                                    var12.field6215 = 0;
                                }
                            } else if (var10.field648 >= class403.field5429.method1962(var12.field6218, false).field648) {
                                var12 = arg4.field5183[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class447 var13 = arg4.field5183[var9] = new class447();
                            var13.field6218 = var6;
                            var13.field6219 = 1;
                            var13.field6210 = 0;
                            var13.field6212 = var8;
                            var13.field6214 = 0;
                            var13.field6215 = 0;
                            class284.method1729(arg4.field6239, 0, 104, arg4.field6220, arg4.field6241, var10, false);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field1879++;
        if (arg0 <= 56) {
            method989(-92);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZI)Z", line = 130)
    public static final boolean method987(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1878 = null;
        }
        field1881++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V", line = 142)
    public static void method989(int arg0) {
        field1883 = null;
        if (arg0 != 1) {
            method989(86);
        }
        field1878 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lia;")
    public abstract class142 method977();

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "(IIIIII)V")
    public abstract void method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "HA", descriptor = "()V")
    public abstract void method979();

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "(III[I)V")
    public abstract void method980(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "na", descriptor = "(I)V")
    public abstract void method981(int arg0);

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "(III)V")
    public abstract void method982(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "([I)V")
    public abstract void method983(int[] arg0);

    @OriginalMember(owner = "client!ia", name = "ma", descriptor = "(I)V")
    public abstract void method985(int arg0);

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "(I)V")
    public abstract void method986(int arg0);

    @OriginalMember(owner = "client!ia", name = "ba", descriptor = "(Lia;)V")
    public abstract void method988(class142 arg0);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public abstract void method990(int arg0);

    @OriginalMember(owner = "client!ia", name = "YA", descriptor = "(I)V")
    public abstract void method991(int arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[I)V")
    public abstract void method992(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "ZA", descriptor = "(III)V")
    public abstract void method993(int arg0, int arg1, int arg2);
}
