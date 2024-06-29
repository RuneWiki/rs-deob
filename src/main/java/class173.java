import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class173 extends class95 {

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    public int field3159 = 12800;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    public int field3156 = -1;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public int field3152 = 12800;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "Z")
    public boolean field3154 = true;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    public int field3160 = 0;

    @OriginalMember(owner = "client!vk", name = "bb", descriptor = "I")
    public int field3168 = 0;

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "I")
    public int field3163;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "Lsf;")
    public class108 field3153;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!vk", name = "db", descriptor = "Lsf;")
    public class108 field3170;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "Laj;")
    public class1 field3158;

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "Lsf;")
    public static class108 field3164 = class140.method973(255, " )2>");

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "Lsf;")
    private static class108 field3161 = class140.method973(255, "Members object");

    @OriginalMember(owner = "client!vk", name = "cb", descriptor = "Lsf;")
    public static class108 field3169 = class140.method973(255, ":chalreq:");

    @OriginalMember(owner = "client!vk", name = "ab", descriptor = "Lsf;")
    public static class108 field3167 = field3161;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!vk", name = "Y", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!vk", name = "Z", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!vk", name = "eb", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(B)V", line = 7)
    public final void method1228(byte arg0) {
        this.field3159 = 12800;
        this.field3168 = 0;
        field3165++;
        this.field3160 = 0;
        this.field3152 = 12800;
        class63 var2 = (class63) this.field3158.method13(0);
        if (arg0 <= 63) {
            method1233((byte) -25);
        }
        while (var2 != null) {
            if (var2.field1007 > this.field3168) {
                this.field3168 = var2.field1007;
            }
            if (this.field3152 > var2.field1017) {
                this.field3152 = var2.field1017;
            }
            if (var2.field1018 > this.field3160) {
                this.field3160 = var2.field1018;
            }
            if (var2.field1013 < this.field3159) {
                this.field3159 = var2.field1013;
            }
            var2 = (class63) this.field3158.method15((byte) 47);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)V", line = 53)
    public static final void method1229(boolean arg0, int arg1) {
        field3171++;
        if (arg1 == -1 || !class180.field3278[arg1]) {
            return;
        }
        class171.field3102.method1880(arg1, 102);
        if (class320.field5485[arg1] == null) {
            return;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < class320.field5485[arg1].length; var3++) {
            if (class320.field5485[arg1][var3] != null) {
                if (class320.field5485[arg1][var3].field1677 == 2) {
                    var2 = false;
                } else {
                    class320.field5485[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class320.field5485[arg1] = null;
        }
        class180.field3278[arg1] = false;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(Z)V", line = 98)
    public static final void method1230(boolean arg0) {
        field3162++;
        class293.field5127.method1429(false);
        int var1 = class293.field5127.method1431((byte) -94, 8);
        if (class61.field969 > var1) {
            for (int var2 = var1; var2 < class61.field969; var2++) {
                class26.field409[class259.field4572++] = class168.field3020[var2];
            }
        }
        if (var1 > class61.field969) {
            throw new RuntimeException("gnpov1");
        } else if (arg0) {
            class61.field969 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class168.field3020[var3];
                class45 var5 = class159.field2863[var4];
                int var6 = class293.field5127.method1431((byte) -94, 1);
                if (var6 == 0) {
                    class168.field3020[class61.field969++] = var4;
                    var5.field4459 = class116.field2000;
                } else {
                    int var7 = class293.field5127.method1431((byte) -94, 2);
                    if (var7 == 0) {
                        class168.field3020[class61.field969++] = var4;
                        var5.field4459 = class116.field2000;
                        class283.field4947[class312.field5400++] = var4;
                    } else if (var7 == 1) {
                        class168.field3020[class61.field969++] = var4;
                        var5.field4459 = class116.field2000;
                        int var8 = class293.field5127.method1431((byte) -94, 3);
                        var5.method1809(var8, false, 0);
                        int var9 = class293.field5127.method1431((byte) -94, 1);
                        if (var9 == 1) {
                            class283.field4947[class312.field5400++] = var4;
                        }
                    } else if (var7 == 2) {
                        class168.field3020[class61.field969++] = var4;
                        var5.field4459 = class116.field2000;
                        int var10 = class293.field5127.method1431((byte) -94, 3);
                        var5.method1809(var10, true, 0);
                        int var11 = class293.field5127.method1431((byte) -94, 3);
                        var5.method1809(var11, true, 0);
                        int var12 = class293.field5127.method1431((byte) -94, 1);
                        if (var12 == 1) {
                            class283.field4947[class312.field5400++] = var4;
                        }
                    } else if (var7 == 3) {
                        class26.field409[class259.field4572++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lsf;Lsf;IIIZ)V", line = 350)
    public class173(class108 arg0, class108 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3163 = arg2;
        this.field3154 = arg5;
        this.field3153 = arg1;
        this.field3155 = arg3;
        this.field3156 = arg4;
        this.field3170 = arg0;
        this.field3158 = new class1();
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)Z", line = 210)
    public final boolean method1231(int arg0, int arg1, byte arg2) {
        int var4 = -100 % ((-arg2 - 36) / 41);
        field3157++;
        if (this.field3159 > arg0 || arg0 > this.field3160 || this.field3152 > arg1 || arg1 > this.field3168) {
            return false;
        }
        for (class63 var5 = (class63) this.field3158.method13(0); var5 != null; var5 = (class63) this.field3158.method15((byte) 47)) {
            if (var5.method438(arg0, arg1, -2967)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II[II[I)V", line = 244)
    public static final void method1232(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        field3151++;
        if (arg3 < arg1) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var6;
            int var7 = arg3;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg3; var9 < arg1; var9++) {
                if ((var9 & 0x1) + var6 < arg2[var9]) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7++] = var11;
                }
            }
            arg2[arg1] = arg2[var7];
            arg2[var7] = var6;
            arg4[arg1] = arg4[var7];
            arg4[var7] = var8;
            method1232(arg0 ^ 0x0, var7 - 1, arg2, arg3, arg4);
            method1232(1, arg1, arg2, var7 + 1, arg4);
        }
        if (arg0 != 1) {
            field3167 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(B)V", line = 297)
    public static void method1233(byte arg0) {
        field3167 = null;
        if (arg0 != -109) {
            field3169 = (class108) null;
        }
        field3169 = null;
        field3164 = null;
        field3161 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V", line = 315)
    public static final void method1234(int arg0, int arg1, int arg2) {
        field3166++;
        class120 var3 = class248.method1704(arg2, arg2 ^ 0x69, arg1);
        var3.method844((byte) -28);
        var3.field2066 = arg0;
    }
}
