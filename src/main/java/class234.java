import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class234 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Ls;")
    public static class190 field4352 = new class190();

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Ldj;")
    public static class44 field4357 = class89.method650(255, "mapflag");

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Ldj;")
    public static class44 field4358 = class89.method650(255, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "[Lod;")
    public static class155[] field4359;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method1528(byte[] arg0, boolean arg1) {
        field4349++;
        if (arg1) {
            method1530(false, -62, 117, -30, 4, 2);
        }
        class66 var2 = new class66(arg0);
        int var3 = var2.method506(255);
        int var4 = var2.method528(true);
        if (var4 < 0 || class239.field4423 != 0 && class239.field4423 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method515(var4, 0, var7, 0);
            return var7;
        } else {
            int var5 = var2.method528(true);
            if (var5 < 0 || class239.field4423 != 0 && var5 > class239.field4423) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class126.method875(var6, var5, arg0, var4, 9);
            } else {
                class60.field1123.method760(var2, var6, (byte) -93);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)Lwd;")
    public class234 method1252(int arg0, int arg1, int arg2) {
        field4350++;
        return this;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1529(int arg0) {
        int var1 = 55 / ((arg0 + 13) / 56);
        field4357 = null;
        field4358 = null;
        field4352 = null;
        field4359 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()I")
    public abstract int method67();

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lwd;IIIZ)V")
    public void method1254(class234 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4353++;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()Z")
    public boolean method1269() {
        field4354++;
        return false;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1530(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4355++;
        if (class134.field2403 == arg3 && class129.field2298 == arg1 && (class88.field1671 == arg5 || !class33.field583)) {
            return;
        }
        class129.field2298 = arg1;
        class134.field2403 = arg3;
        class88.field1671 = arg5;
        if (!class33.field583) {
            class88.field1671 = 0;
        }
        class62.method467(25, (byte) 57);
        class151.method976(true, (byte) 116, class172.field2997);
        int var6 = class143.field2550;
        class143.field2550 = arg1 * 8 - 48;
        int var7 = class222.field4020;
        class222.field4020 = (arg3 - 6) * 8;
        int var8 = class222.field4020 - var7;
        int var9 = class143.field2550 - var6;
        int var10 = class222.field4020;
        int var11 = class143.field2550;
        for (int var12 = 0; var12 < 32768; var12++) {
            class121 var28 = class170.field2960[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field2240[var29] -= var8;
                    var28.field2235[var29] -= var9;
                }
                var28.field2195 -= var9 * 128;
                var28.field2260 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class24 var26 = class122.field2168[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field2240[var27] -= var8;
                    var26.field2235[var27] -= var9;
                }
                var26.field2195 -= var9 * 128;
                var26.field2260 -= var8 * 128;
            }
        }
        byte var14 = 104;
        class194.field3403 = arg5;
        class96.field1774.method854(arg4, arg2, (byte) -29, false);
        byte var15 = 1;
        byte var16 = 0;
        if (var8 < 0) {
            var14 = -1;
            var15 = -1;
            var16 = 103;
        }
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var9 < 0) {
            var18 = -1;
            var17 = 103;
            var19 = -1;
        }
        for (int var20 = var16; var20 != var14; var20 += var15) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var20 + var8;
                int var24 = var9 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        client.field599[var25][var20][var22] = client.field599[var25][var23][var24];
                    } else {
                        client.field599[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class132 var21 = (class132) class210.field3754.method1189(0); var21 != null; var21 = (class132) class210.field3754.method1192((byte) -118)) {
            var21.field2371 -= var9;
            var21.field2363 -= var8;
            if (var21.field2363 < 0 || var21.field2371 < 0 || var21.field2363 >= 104 || var21.field2371 >= 104) {
                var21.method1148(-13215);
            }
        }
        if (class198.field3511 != 0) {
            class198.field3511 -= var8;
            class38.field668 -= var9;
        }
        class73.field1401 = 0;
        class203.field3636 = -1;
        class86.field1658 = arg0;
        field4352.method1193((byte) 26);
        class227.field4266.method1193((byte) 26);
    }
}
