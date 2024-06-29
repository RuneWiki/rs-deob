import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class154 extends class196 {

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    private int field2975 = 0;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    private int field2977 = 128;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    private int field2985 = 128;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public int field2981 = -1;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    private int field2980 = 0;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    private int field2987 = 0;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field2972 = 0;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "Lai;")
    public static class10 field2974 = class44.method278("Verbindung abgebrochen)3", 116);

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public static int field2982 = 0;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "Lai;")
    public static class10 field2990 = class44.method278("Mem:", -52);

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field2969 = -1;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public int field2973;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    private int field2988;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "Lvd;")
    public static class194 field2983;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "[S")
    private short[] field2968;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "[S")
    private short[] field2978;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "[S")
    private short[] field2984;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "[S")
    private short[] field2986;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public static void method1042(byte arg0) {
        field2983 = null;
        if (arg0 != 59) {
            field2969 = -12;
        }
        field2974 = null;
        field2990 = null;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public static final void method1043(int arg0) {
        if (arg0 != 64) {
            field2974 = null;
        }
        field2971++;
        class92.field1643 = true;
        class126.field2406 = true;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lme;B)V")
    public final void method1044(class114 arg0, byte arg1) {
        int var3 = 1 % ((55 - arg1) / 38);
        field2989++;
        while (true) {
            int var4 = arg0.method767(true);
            if (var4 == 0) {
                return;
            }
            this.method1047(var4, (byte) -96, arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method1045(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field2966++;
        if (class42.method270(arg0, (byte) -77)) {
            class46.field754 = null;
            class102.method671(arg2, arg3, arg4, class205.field3990[arg0], (byte) 26, arg7, arg1, -1, arg8, arg6);
            if (arg5 >= 28 && class46.field754 != null) {
                class102.method671(arg2, arg3, arg4, class46.field754, (byte) 26, class149.field2873, class98.field1799, -1412584499, arg8, arg6);
                class46.field754 = null;
            }
        } else if (arg6 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class98.field1810[var9] = true;
            }
        } else {
            class98.field1810[arg6] = true;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
    public static final void method1046(int arg0, int arg1) {
        field2970++;
        if (arg1 > -4) {
            return;
        }
        if (class75.field1290 == 0) {
            class101.field1887.method976(arg0, (byte) 55);
        } else {
            class149.field2872 = arg0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLme;)V")
    private final void method1047(int arg0, byte arg1, class114 arg2) {
        if (arg1 != -96) {
            this.method1048(59, -35);
        }
        field2967++;
        if (arg0 == 1) {
            this.field2988 = arg2.method762((byte) 99);
        } else if (arg0 == 2) {
            this.field2981 = arg2.method762((byte) 110);
        } else if (arg0 == 4) {
            this.field2977 = arg2.method762((byte) 83);
        } else if (arg0 == 5) {
            this.field2985 = arg2.method762((byte) 79);
        } else if (arg0 == 6) {
            this.field2980 = arg2.method762((byte) 79);
        } else if (arg0 == 7) {
            this.field2975 = arg2.method767(true);
        } else if (arg0 == 8) {
            this.field2987 = arg2.method767(true);
        } else if (arg0 == 40) {
            int var4 = arg2.method767(true);
            this.field2984 = new short[var4];
            this.field2968 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2984[var5] = (short) arg2.method762((byte) 84);
                this.field2968[var5] = (short) arg2.method762((byte) 121);
            }
            return;
        } else if (arg0 == 41) {
            int var6 = arg2.method767(true);
            this.field2978 = new short[var6];
            this.field2986 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2986[var7] = (short) arg2.method762((byte) 106);
                this.field2978[var7] = (short) arg2.method762((byte) 91);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)Lsa;")
    public final class164 method1048(int arg0, int arg1) {
        field2979++;
        if (arg1 > -23) {
            method1043(96);
        }
        class164 var3 = (class164) class139.field2629.method222(-3, (long) this.field2973);
        if (var3 == null) {
            class112 var4 = class112.method729(class56.field996, this.field2988, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field2984 != null) {
                for (int var5 = 0; var5 < this.field2984.length; var5++) {
                    var4.method736(this.field2984[var5], this.field2968[var5]);
                }
            }
            if (this.field2986 != null) {
                for (int var6 = 0; var6 < this.field2986.length; var6++) {
                    var4.method740(this.field2986[var6], this.field2978[var6]);
                }
            }
            var3 = var4.method734(this.field2975 + 64, this.field2987 + 850, -30, -50, -30, true, true);
            class139.field2629.method225(-21284, (long) this.field2973, var3);
        }
        class164 var7;
        if (this.field2981 == -1 || arg0 == -1) {
            var7 = var3.method1087(true);
        } else {
            var7 = class142.method958((byte) -123, this.field2981).method474(true, var3, arg0);
        }
        if (this.field2977 != 128 || this.field2985 != 128) {
            var7.method1090(this.field2977, this.field2985, this.field2977);
        }
        if (this.field2980 != 0) {
            if (this.field2980 == 90) {
                var7.method1085();
            }
            if (this.field2980 == 180) {
                var7.method1085();
                var7.method1085();
            }
            if (this.field2980 == 270) {
                var7.method1085();
                var7.method1085();
                var7.method1085();
            }
        }
        return var7;
    }
}
