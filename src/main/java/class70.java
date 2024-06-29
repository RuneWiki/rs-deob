import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class class70 {

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public volatile int field869 = 0;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public volatile int field861 = 0;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public int field867 = 0;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "[F")
    public float[] field874 = new float[5000];

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "[Ljava/lang/Object;")
    public Object[] field872 = new Object[5000];

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public int field870 = 0;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "[B")
    public byte[] field875 = new byte[5000];

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field864 = 0;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field866 = -1;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field863 = new String[200];

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "Ljava/lang/String;")
    public static String field873 = "";

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "Ljava/lang/String;")
    public static String field871 = "cyan:";

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "Lgl;")
    public static class356 field862;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "Lld;")
    public static class93 field868;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V", line = 44)
    public static void method439(int arg0) {
        field873 = null;
        field862 = null;
        field863 = null;
        int var1 = -50 / ((-arg0 - 81) / 44);
        field868 = null;
        field871 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "()V", line = 63)
    public static final void method441() {
        class373.field5635 = 0;
        label191: for (int var0 = 0; var0 < class414.field6122; var0++) {
            class262 var1 = class432.field6364[var0];
            if (class99.field1395 != null) {
                for (int var2 = 0; var2 < class99.field1395.length; var2++) {
                    if (class99.field1395[var2] != -1000000 && (var1.field4210 <= class99.field1395[var2] || var1.field4218 <= class99.field1395[var2]) && (var1.field4208 <= class270.field4339[var2] || var1.field4206 <= class270.field4339[var2]) && (var1.field4208 >= class322.field5032[var2] || var1.field4206 >= class322.field5032[var2]) && (var1.field4209 <= class117.field1625[var2] || var1.field4226 <= class117.field1625[var2]) && (var1.field4209 >= class132.field2066[var2] || var1.field4226 >= class132.field2066[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field4222 == 1) {
                int var3 = var1.field4221 + class374.field5649 - class235.field3937;
                if (var3 >= 0 && var3 <= class374.field5649 + class374.field5649) {
                    int var4 = var1.field4204 + class374.field5649 - class181.field2959;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4213 + class374.field5649 - class181.field2959;
                    if (var5 > class374.field5649 + class374.field5649) {
                        var5 = class374.field5649 + class374.field5649;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class241.field3991[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class40.field507 - var1.field4208;
                        if (var7 > 32) {
                            var1.field4224 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4224 = 2;
                            var7 = -var7;
                        }
                        var1.field4223 = (var1.field4209 - class379.field5746 << 8) / var7;
                        var1.field4212 = (var1.field4226 - class379.field5746 << 8) / var7;
                        var1.field4203 = (var1.field4210 - class373.field5630 << 8) / var7;
                        var1.field4220 = (var1.field4218 - class373.field5630 << 8) / var7;
                        class43.field532[class373.field5635++] = var1;
                    }
                }
            } else if (var1.field4222 == 2) {
                int var8 = var1.field4204 + class374.field5649 - class181.field2959;
                if (var8 >= 0 && var8 <= class374.field5649 + class374.field5649) {
                    int var9 = var1.field4221 + class374.field5649 - class235.field3937;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4211 + class374.field5649 - class235.field3937;
                    if (var10 > class374.field5649 + class374.field5649) {
                        var10 = class374.field5649 + class374.field5649;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class241.field3991[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class379.field5746 - var1.field4209;
                        if (var12 > 32) {
                            var1.field4224 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4224 = 4;
                            var12 = -var12;
                        }
                        var1.field4217 = (var1.field4208 - class40.field507 << 8) / var12;
                        var1.field4225 = (var1.field4206 - class40.field507 << 8) / var12;
                        var1.field4203 = (var1.field4210 - class373.field5630 << 8) / var12;
                        var1.field4220 = (var1.field4218 - class373.field5630 << 8) / var12;
                        class43.field532[class373.field5635++] = var1;
                    }
                }
            } else if (var1.field4222 == 4) {
                int var13 = var1.field4210 - class373.field5630;
                if (var13 > 128) {
                    int var14 = var1.field4204 + class374.field5649 - class181.field2959;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4213 + class374.field5649 - class181.field2959;
                    if (var15 > class374.field5649 + class374.field5649) {
                        var15 = class374.field5649 + class374.field5649;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4221 + class374.field5649 - class235.field3937;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4211 + class374.field5649 - class235.field3937;
                        if (var17 > class374.field5649 + class374.field5649) {
                            var17 = class374.field5649 + class374.field5649;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class241.field3991[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4224 = 5;
                            var1.field4217 = (var1.field4208 - class40.field507 << 8) / var13;
                            var1.field4225 = (var1.field4206 - class40.field507 << 8) / var13;
                            var1.field4223 = (var1.field4209 - class379.field5746 << 8) / var13;
                            var1.field4212 = (var1.field4226 - class379.field5746 << 8) / var13;
                            class43.field532[class373.field5635++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V")
    public abstract void method432(int arg0, int arg1);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public abstract void method433(int arg0);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lwe;I)V")
    public abstract void method434(class232 arg0, int arg1);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BI)V")
    public abstract void method435(byte arg0, int arg1);

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
    public abstract void method436(int arg0);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Llf;ZFIZ)V")
    public abstract void method437(class129 arg0, boolean arg1, float arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLwe;)V")
    public abstract void method438(byte arg0, class232 arg1);

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Lwe;I)V")
    public abstract void method440(class232 arg0, int arg1);
}
