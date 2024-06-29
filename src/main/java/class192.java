import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class192 extends Canvas {

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field2993;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lma;")
    public static class5 field2987 = class12.method119("Mem:", (byte) 74);

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Lma;")
    public static class5 field2994 = class12.method119("Okay", (byte) 66);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Ltj;")
    public static class73 field2986 = new class73(100);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1259(int arg0) {
        field2985++;
        class47.field726 = null;
        class102.field1520 = null;
        class218.field3507 = null;
        if (arg0 != -18) {
            method1260(81, -46, (class253) null);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILeb;)I", line = 21)
    public static final int method1260(int arg0, int arg1, class253 arg2) {
        field2990++;
        if (arg2.field4337 == null || arg0 >= arg2.field4337.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg2.field4337[arg0];
            if (arg1 != -22729) {
                method1261(83);
            }
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = 0;
                int var8 = var4[var5++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var3;
                }
                if (var8 == 1) {
                    var7 = class1.field9[var4[var5++]];
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 2) {
                    var7 = class264.field4519[var4[var5++]];
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 3) {
                    var7 = class219.field3551[var4[var5++]];
                }
                if (var8 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class253 var12 = class172.method1140(var11, -126);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class235.method1664(116, var13).field3098 || class90.field1349)) {
                        for (int var14 = 0; var14 < var12.field4257.length; var14++) {
                            if (var13 + 1 == var12.field4257[var14]) {
                                var7 += var12.field4317[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class149.field2149[var4[var5++]];
                }
                if (var8 == 6) {
                    var7 = class80.field1240[class264.field4519[var4[var5++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class149.field2149[var4[var5++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class151.field2183.field1380;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class214.field3394[var15]) {
                            var7 += class264.field4519[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class253 var18 = class172.method1140(var17, 90);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class235.method1664(arg1 + 22844, var19).field3098 || class90.field1349)) {
                        for (int var20 = 0; var20 < var18.field4257.length; var20++) {
                            if (var19 + 1 == var18.field4257[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class210.field3353;
                }
                if (var8 == 12) {
                    var7 = class195.field3035;
                }
                if (var8 == 13) {
                    int var21 = class149.field2149[var4[var5++]];
                    int var22 = var4[var5++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var4[var5++];
                    var7 = class247.method1731(-29267, var23);
                }
                if (var8 == 18) {
                    var7 = (class151.field2183.field178 >> 7) + class193.field3017;
                }
                if (var8 == 19) {
                    var7 = (class151.field2183.field211 >> 7) + class74.field1158;
                }
                if (var8 == 20) {
                    var7 = var4[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var3 += var7;
                    }
                    if (var6 == 1) {
                        var3 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var6 == 3) {
                        var3 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!jb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 231)
    public final void update(Graphics arg0) {
        this.field2993.update(arg0);
        field2988++;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 239)
    public static final void method1261(int arg0) {
        if (arg0 != 13) {
            method1259(65);
        }
        field2991++;
        class135 var1 = new class135();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class204.field3262[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 270)
    public static void method1262(byte arg0) {
        field2986 = null;
        field2994 = null;
        field2987 = null;
        if (arg0 != -53) {
            method1260(91, -64, (class253) null);
        }
    }

    @OriginalMember(owner = "client!jb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 284)
    public final void paint(Graphics arg0) {
        field2992++;
        this.field2993.paint(arg0);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 301)
    public class192(Component arg0) {
        this.field2993 = arg0;
    }
}
