import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class217 extends class46 {

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    private int field3975 = 128;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "Z")
    public boolean field3968 = false;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    private int field3977 = 0;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    private int field3970 = 0;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    private int field3980 = 0;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public int field3979 = -1;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    private int field3982 = 128;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Lmb;")
    public static class132 field3963 = class166.method1092("Fallen lassen", 125);

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "Lmb;")
    public static class132 field3965 = class166.method1092("underlay)3dat", 115);

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field3972 = 2;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "Lmb;")
    public static class132 field3967 = class166.method1092("mapscene", 116);

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    public static int field3983 = 0;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    private int field3964;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "Lnb;")
    public static class143 field3973;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "[S")
    private short[] field3966;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "[S")
    private short[] field3971;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "[S")
    private short[] field3974;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "[S")
    private short[] field3976;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Lug;")
    public final class221 method1353(byte arg0, int arg1) {
        field3961++;
        if (arg0 < 62) {
            return null;
        }
        class221 var3 = (class221) class66.field1093.method1138((long) this.field3978, (byte) 119);
        if (var3 == null) {
            class76 var4 = class76.method466(class26.field422, this.field3964, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3971 != null) {
                for (int var5 = 0; var5 < this.field3971.length; var5++) {
                    var4.method465(this.field3971[var5], this.field3976[var5]);
                }
            }
            if (this.field3974 != null) {
                for (int var6 = 0; var6 < this.field3974.length; var6++) {
                    var4.method453(this.field3974[var6], this.field3966[var6]);
                }
            }
            var3 = var4.method471(this.field3977 + 64, this.field3970 + 850, -30, -50, -30);
            class66.field1093.method1135((long) this.field3978, var3, true);
        }
        class221 var7;
        if (this.field3979 == -1 || arg1 == -1) {
            var7 = var3.method1386(true);
        } else {
            var7 = class99.method619(this.field3979, 4).method1499(var3, arg1, 53);
        }
        if (this.field3982 != 128 || this.field3975 != 128) {
            var7.method1383(this.field3982, this.field3975, this.field3982);
        }
        if (this.field3980 != 0) {
            if (this.field3980 == 90) {
                var7.method1387();
            }
            if (this.field3980 == 180) {
                var7.method1380();
            }
            if (this.field3980 == 270) {
                var7.method1385();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILkd;)V")
    public final void method1354(int arg0, class112 arg1) {
        int var3 = -81 % ((arg0 - 85) / 37);
        field3969++;
        while (true) {
            int var4 = arg1.method716(-1308);
            if (var4 == 0) {
                return;
            }
            this.method1357(0, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(BI)V")
    public static final void method1356(byte arg0, int arg1) {
        for (class171 var2 = (class171) class236.field4269.method811(arg0); var2 != null; var2 = (class171) class236.field4269.method807(-19009)) {
            if ((var2.field2760 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method995((byte) 121);
            }
        }
        field3981++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILkd;I)V")
    private final void method1357(int arg0, class112 arg1, int arg2) {
        field3962++;
        if (arg2 == 1) {
            this.field3964 = arg1.method739(arg0 + 62);
        } else if (arg2 == 2) {
            this.field3979 = arg1.method739(38);
        } else if (arg2 == 4) {
            this.field3982 = arg1.method739(-126);
        } else if (arg2 == 5) {
            this.field3975 = arg1.method739(arg0 + 63);
        } else if (arg2 == 6) {
            this.field3980 = arg1.method739(-127);
        } else if (arg2 == 7) {
            this.field3977 = arg1.method716(-1308);
        } else if (arg2 == 8) {
            this.field3970 = arg1.method716(-1308);
        } else if (arg2 == 9) {
            this.field3968 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method716(arg0 ^ 0xFFFFFAE4);
            this.field3971 = new short[var4];
            this.field3976 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3971[var5] = (short) arg1.method739(-126);
                this.field3976[var5] = (short) arg1.method739(class122.method804(arg0, 100));
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method716(arg0 ^ 0xFFFFFAE4);
            this.field3974 = new short[var6];
            this.field3966 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3974[var7] = (short) arg1.method739(124);
                this.field3966[var7] = (short) arg1.method739(-123);
            }
        }
        if (arg0 != 0) {
            this.method1353((byte) -26, -113);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public static void method1358(int arg0) {
        field3965 = null;
        field3973 = null;
        field3967 = null;
        if (arg0 != -406652944) {
            field3972 = 118;
        }
        field3963 = null;
    }
}
