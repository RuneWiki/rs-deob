import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class class91 {

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public static int field1224 = -1;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "[I")
    public static int[] field1212 = new int[32];

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field1216 = -2;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Lcl;")
    public static class114 field1213;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)Loi;", line = 7)
    public static final class34 method656(int arg0, int arg1, int arg2) {
        if (arg1 != -2) {
            return (class34) null;
        }
        field1211++;
        class34 var3 = (class34) class278.field4291.method2168((long) arg2 << 32 | (long) arg0, (byte) -104);
        if (var3 == null) {
            var3 = new class34(arg2, arg0);
            class278.field4291.method2161(var3, var3.field4430, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lug;ILug;)V", line = 26)
    public static final void method657(class253 arg0, int arg1, class253 arg2) {
        class158.field2456 = arg0;
        class283.field4386 = arg2;
        field1222++;
        if (arg1 != 1943801096) {
            method657((class253) null, 40, (class253) null);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(La;ZZIII)V", line = 39)
    public static final void method658(class281 arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1218++;
        if (class43.field600 >= 50 || arg0.field4332 == null || arg4 >= arg0.field4332.length || arg0.field4332[arg4] == null) {
            return;
        }
        int var6 = arg0.field4332[arg4][0];
        int var7 = (var6 & 0xF1) >> 5;
        int var8 = var6 & 0x1F;
        int var9 = var6 >> 8;
        if (arg0.field4332[arg4].length > 1) {
            int var10 = (int) (Math.random() * (double) arg0.field4332[arg4].length);
            if (var10 > 0) {
                var9 = arg0.field4332[arg4][var10];
            }
        }
        if (var8 == 0) {
            if (arg2) {
                class234.method1681(255, var9, (byte) 39, var7, 0);
            }
        } else if (class10.field183 != 0) {
            class237.field3725[class43.field600] = var9;
            if (arg1) {
                class334.field5207[class43.field600] = var7;
                class86.field1161[class43.field600] = 0;
                class121.field1715[class43.field600] = null;
                class161.field2556[class43.field600] = 255;
                int var11 = (arg3 - 64) / 128;
                int var12 = (arg5 - 64) / 128;
                class22.field347[class43.field600] = (var11 << 16) + (var12 << 8) + var8;
                class43.field600++;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)Z", line = 102)
    public final boolean method659(int arg0) {
        field1214++;
        int var2 = 124 / ((arg0 + 9) / 47);
        return (this.field1210 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 117)
    public static void method660(int arg0) {
        field1212 = null;
        field1213 = null;
        int var1 = -94 % ((arg0 + 53) / 60);
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 137)
    public static final void method661(int arg0) {
        field1220++;
        if (arg0 < 91) {
            method656(108, -52, 121);
        }
        class2.field17.method1355(false);
        class138.field2203.method1355(false);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILjava/lang/String;)I", line = 152)
    public static final int method662(int arg0, String arg1) {
        field1219++;
        if (class278.field4290 == null || arg1.length() == 0) {
            return -1;
        }
        for (int var2 = arg0; var2 < class278.field4290.field4244; var2++) {
            if (class210.method1534(arg1, class110.method783(83, " ", "<br>", class278.field4290.field4246[var2]), (byte) 85)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[Lel;)V", line = 176)
    public static final void method663(int arg0, class247[] arg1) {
        class216.field3403[arg0] = arg1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)Z", line = 183)
    public final boolean method664(byte arg0) {
        if (arg0 != -70) {
            method663(-89, (class247[]) null);
        }
        field1223++;
        return (this.field1210 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)Z", line = 196)
    public final boolean method665(int arg0) {
        field1217++;
        if (arg0 != 30171) {
            this.method666((byte) -117);
        }
        return (this.field1210 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)Z", line = 218)
    public final boolean method666(byte arg0) {
        field1221++;
        if (arg0 != 120) {
            field1212 = (int[]) null;
        }
        return (this.field1210 & 0x8) != 0;
    }
}
