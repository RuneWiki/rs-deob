import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class210 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public int field3242;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public int field3247;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public int field3241;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3243 = 0;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3244 = Calendar.getInstance();

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "[S")
    public static short[] field3248 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Lke;")
    public static class112 field3249;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public static void method1466(boolean arg0) {
        field3248 = null;
        field3244 = null;
        field3249 = null;
        if (!arg0) {
            field3249 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
    public abstract void method504(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)V")
    public abstract void method499(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BILcc;)I")
    public static final int method1467(byte arg0, int arg1, class222 arg2) {
        field3246++;
        if (arg2.field3566 == null || arg1 >= arg2.field3566.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field3566[arg1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            if (arg0 != -103) {
                return 3;
            }
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class9.field160[var3[var5++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = class56.field885[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class207.field3187[var3[var5++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class222 var12 = class169.method1217(var11, arg0 + 12283);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class123.method929(22497, var13).field2769 || class272.field4344)) {
                        for (int var14 = 0; var14 < var12.field3407.length; var14++) {
                            if ((var13 + 1) == var12.field3407[var14]) {
                                var8 += var12.field3567[var14];
                            }
                        }
                    }
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 5) {
                    var8 = class257.field4090[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class7.field120[class56.field885[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class257.field4090[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class263.field4168.field2052;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class156.field2336[var15]) {
                            var8 += class56.field885[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class222 var18 = class169.method1217(var17, 12180);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class123.method929(22497, var19).field2769 || class272.field4344)) {
                        for (int var20 = 0; var20 < var18.field3407.length; var20++) {
                            if (var19 + 1 == var18.field3407[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class203.field3132;
                }
                if (var7 == 12) {
                    var8 = class20.field278;
                }
                if (var7 == 13) {
                    int var21 = class257.field4090[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class41.method362(var23, (byte) -120);
                }
                if (var7 == 18) {
                    var8 = (class263.field4168.field4725 >> 7) + class138.field2072;
                }
                if (var7 == 19) {
                    var8 = (class263.field4168.field4709 >> 7) + class159.field2379;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBI)V")
    public abstract void method502(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(III)V")
    public class210(int arg0, int arg1, int arg2) {
        this.field3242 = arg2;
        this.field3247 = arg1;
        this.field3241 = arg0;
    }
}
