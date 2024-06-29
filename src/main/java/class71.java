import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class71 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "[Ljd;")
    public static class227[] field1166;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[[Z")
    public static boolean[][] field1168;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lca;I)V")
    public static final void method553(class54 arg0, int arg1) {
        field1167++;
        int var2 = arg0.method436(arg1 + 118);
        class50.field819 = new class247[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class50.field819[var3] = new class247();
            class50.field819[var3].field3846 = arg0.method436(127);
            class50.field819[var3].field3840 = arg0.method435(0);
        }
        class136.field1987 = arg0.method436(126);
        class172.field2523 = arg0.method436(126);
        class66.field1095 = arg0.method436(126);
        class47.field788 = new class293[class172.field2523 + 1 - class136.field1987];
        if (arg1 != 8) {
            method556(false, 126);
        }
        for (int var4 = 0; var4 < class66.field1095; var4++) {
            int var5 = arg0.method436(126);
            class293 var6 = class47.field788[var5] = new class293();
            var6.field2263 = arg0.method407(255);
            var6.field2276 = arg0.method420((byte) 22);
            var6.field4444 = class136.field1987 + var5;
            var6.field4446 = arg0.method435(0);
            var6.field4450 = arg0.method435(0);
        }
        class159.field2318 = arg0.method420((byte) 82);
        class49.field807 = true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(JB)V")
    public static final void method554(long arg0, byte arg1) {
        if (!class117.field1767) {
            class89.field1349 += (float) arg0 * class101.field1482 / 40.0F;
            class281.field4313 += (float) arg0 * class215.field3310 / 40.0F;
        }
        if (arg1 > -40) {
            method555(34);
        }
        field1169++;
        int var3 = class69.field1139 + class185.field2687.field455;
        int var4 = class109.field1605 + class185.field2687.field425;
        if ((class110.field1635 - var4) < -500 || class110.field1635 - var4 > 500 || (class264.field4128 - var3) < -500 || class264.field4128 - var3 > 500) {
            class110.field1635 = var4;
            class264.field4128 = var3;
        }
        if (class110.field1635 != var4) {
            int var5 = var4 - class110.field1635;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class110.field1635 += var6;
        }
        if (class264.field4128 != var3) {
            int var7 = var3 - class264.field4128;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class264.field4128 += var8;
        }
        class82.method642(10344);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method555(int arg0) {
        field1166 = null;
        field1168 = null;
        if (arg0 != -1) {
            method556(true, -1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
    public static final void method556(boolean arg0, int arg1) {
        field1170++;
        if (arg1 != -10501) {
            field1168 = null;
        }
        byte var2 = 4;
        byte[][] var3 = class259.field3974;
        for (int var4 = 0; var4 < var2; var4++) {
            class195.method1316(-30);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class195.field2952[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class18.field323.length; var13++) {
                                if (class18.field323[var13] == var12 && var3[var13] != null) {
                                    class139.method942(var5 * 8, var3[var13], var6 * 8, (var11 & 0x7) * 8, var4, var8, class243.field3763, var9, arg0, (var10 & 0x7) * 8, (byte) -120);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
