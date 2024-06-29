import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class244 extends class172 {

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "Z")
    public boolean field4285 = true;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "Lid;")
    public static class149 field4282 = class60.method382("Utiliser", (byte) 57);

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "Lid;")
    public static class149 field4294 = class60.method382("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", (byte) 123);

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "Laj;")
    public static class47 field4296 = null;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    public static int field4292 = 0;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "[[I")
    public static int[][] field4291 = new int[104][104];

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "Lid;")
    private static class149 field4302 = class60.method382("Please remove ", (byte) 10);

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "Lid;")
    public static class149 field4299 = field4302;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "Lid;")
    public static class149 field4284 = field4302;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4295;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "[I")
    public int[] field4286;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "[I")
    private int[] field4303;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "[Lid;")
    private class149[] field4290;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "[Lvc;")
    public static class190[] field4278;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "[[I")
    private int[][] field4281;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILgd;[I)V")
    public final void method1693(int arg0, class74 arg1, int[] arg2) {
        field4293++;
        if (arg0 != -28165 || this.field4303 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field4303.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class73.field1257[this.method1700(var4, 28803)];
            if (var5 > 0) {
                arg1.method507(var5, (long) arg2[var4], arg0 ^ 0xFFFFEE04);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public static void method1694(int arg0) {
        field4295 = null;
        field4302 = null;
        field4278 = null;
        field4291 = null;
        if (arg0 <= 83) {
            field4299 = null;
        }
        field4296 = null;
        field4299 = null;
        field4294 = null;
        field4284 = null;
        field4282 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lgd;II)V")
    private final void method1695(class74 arg0, int arg1, int arg2) {
        if (arg2 >= -49) {
            field4295 = null;
        }
        if (arg1 == 1) {
            this.field4290 = arg0.method529(-1).method1016(60, 52);
        } else if (arg1 == 2) {
            int var4 = arg0.method489((byte) 82);
            this.field4286 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4286[var5] = arg0.method485(-2386);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method489((byte) 91);
            this.field4303 = new int[var6];
            this.field4281 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method485(-2386);
                this.field4303[var7] = var8;
                this.field4281[var7] = new int[class113.field1935[var8]];
                for (int var9 = 0; var9 < class113.field1935[var8]; var9++) {
                    this.field4281[var7][var9] = arg0.method485(-2386);
                }
            }
        } else if (arg1 == 4) {
            this.field4285 = false;
        }
        field4283++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V")
    public final void method1696(boolean arg0) {
        if (arg0) {
            return;
        }
        if (this.field4286 != null) {
            for (int var2 = 0; var2 < this.field4286.length; var2++) {
                this.field4286[var2] = class40.method238(this.field4286[var2], 32768);
            }
        }
        field4288++;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)I")
    public final int method1697(int arg0) {
        if (arg0 < 84) {
            this.method1695((class74) null, -89, 80);
        }
        field4277++;
        return this.field4303 == null ? 0 : this.field4303.length;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lng;Lal;ZLal;Lal;)Z")
    public static final boolean method1698(class76 arg0, class230 arg1, boolean arg2, class230 arg3, class230 arg4) {
        if (arg2) {
            field4294 = null;
        }
        class146.field2633 = arg4;
        class269.field4841 = arg3;
        class276.field4938 = arg1;
        field4301++;
        class189.field3382 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)Lid;")
    public final class149 method1699(boolean arg0) {
        field4300++;
        if (arg0) {
            return null;
        }
        class149 var2 = class167.method1215((byte) -120, 80);
        if (this.field4290 == null) {
            return class253.field4429;
        }
        var2.method1066(-63, this.field4290[0]);
        for (int var3 = 1; var3 < this.field4290.length; var3++) {
            var2.method1066(-63, class100.field1770);
            var2.method1066(-63, this.field4290[var3]);
        }
        return var2.method1042((byte) 103);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    public final int method1700(int arg0, int arg1) {
        field4287++;
        if (this.field4303 == null || arg0 < 0 || arg0 > this.field4303.length) {
            return -1;
        } else if (arg1 == 28803) {
            return this.field4303[arg0];
        } else {
            return 70;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLgd;)V")
    public final void method1701(boolean arg0, class74 arg1) {
        field4289++;
        while (true) {
            int var3 = arg1.method489((byte) -57);
            if (var3 == 0) {
                if (arg0) {
                    this.field4286 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1695(arg1, var3, -110);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILgd;)Lid;")
    public final class149 method1702(int arg0, class74 arg1) {
        if (arg0 <= 16) {
            return null;
        }
        field4298++;
        class149 var3 = class167.method1215((byte) -112, 80);
        if (this.field4303 != null) {
            for (int var4 = 0; var4 < this.field4303.length; var4++) {
                var3.method1066(-63, this.field4290[var4]);
                var3.method1066(-63, class18.method104(this.field4303[var4], (byte) -118, arg1.method511((byte) -67, class15.field213[this.field4303[var4]]), this.field4281[var4]));
            }
        }
        var3.method1066(-63, this.field4290[this.field4290.length - 1]);
        return var3.method1042((byte) 107);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZI)I")
    public final int method1703(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return -82;
        }
        field4280++;
        if (this.field4303 == null || arg2 < 0 || arg2 > this.field4303.length) {
            return -1;
        } else if (this.field4281[arg2] == null || arg0 < 0 || arg0 > this.field4281[arg2].length) {
            return -1;
        } else {
            return this.field4281[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I")
    public static final int method1704(int arg0, int arg1) {
        if (arg0 != -1) {
            field4291 = null;
        }
        field4279++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)Z")
    public static final boolean method1705(byte arg0) {
        if (arg0 != 34) {
            field4292 = -42;
        }
        field4297++;
        if (client.field2846) {
            try {
                class219.field3863.method1027(class272.field4900.field436, (byte) 65);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class162.field3017[arg0][var8][var14] == -class96.field1704) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class189.field3393[arg0][arg1][arg3] + arg5;
            if (!class272.method1888(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class272.method1888(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class272.method1888(var9, var11, var13)) {
                return false;
            } else if (class272.method1888(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class7.method37(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class272.method1888(var6 + 1, class189.field3393[arg0][arg1][arg3] + arg5, var7 + 1) && class272.method1888(var6 + 128 - 1, class189.field3393[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class272.method1888(var6 + 128 - 1, class189.field3393[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class272.method1888(var6 + 1, class189.field3393[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
