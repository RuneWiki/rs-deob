import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class584 {

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public int field8326 = 512;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public int field8323 = -1;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public int field8324 = -1;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public int field8331 = 127;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public int field8337 = 0;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Z")
    public boolean field8322 = false;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public int field8325 = 1190717;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Z")
    public boolean field8335 = true;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Z")
    public boolean field8339 = true;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public int field8336 = 64;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public int field8340 = 8;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Z")
    public static boolean field8329 = false;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public int field8330;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Lla;")
    public static class423 field8338;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lsv;")
    public class59 field8327;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field8343;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field8344;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3443(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method3435(boolean arg0) {
        class141.field1924.method2220(arg0);
        field8342++;
        if (arg0) {
            field8338 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 14)
    public static void method3436(byte arg0) {
        field8338 = null;
        if (arg0 != -99) {
            method3439(87);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method3437(int arg0, int arg1, int arg2) {
        field8341++;
        if (!class591.method3472(arg0, arg1, true)) {
            return false;
        } else if (arg2 >= -38) {
            return false;
        } else if ((arg1 & 0xB000) != 0 | class87.method688(arg1, arg0, (byte) 34) | class634.method3631(10, arg0, arg1)) {
            return true;
        } else {
            return (class369.method2318((byte) -117, arg0, arg1) | class209.method1490(arg1, (byte) 117, arg0)) & (arg0 & 0x37) == 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lsl;II)V", line = 49)
    private final void method3438(class479 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field8337 = class20.method97((byte) 125, arg0.method2865(255));
        } else if (arg1 == 2) {
            this.field8323 = arg0.method2886(true);
        } else if (arg1 == 3) {
            this.field8323 = arg0.method2882(-1);
            if (this.field8323 == 65535) {
                this.field8323 = -1;
            }
        } else if (arg1 == 5) {
            this.field8335 = false;
        } else if (arg1 == 7) {
            this.field8324 = class20.method97((byte) 125, arg0.method2865(255));
        } else if (arg1 == 8) {
            this.field8327.field986 = this.field8330;
        } else if (arg1 == 9) {
            this.field8326 = arg0.method2882(-1) << 2;
        } else if (arg1 == 10) {
            this.field8339 = false;
        } else if (arg1 == 11) {
            this.field8340 = arg0.method2886(true);
        } else if (arg1 == 12) {
            this.field8322 = true;
        } else if (arg1 == 13) {
            this.field8325 = arg0.method2865(255);
        } else if (arg1 == 14) {
            this.field8336 = arg0.method2886(true) << 2;
        } else if (arg1 == 16) {
            this.field8331 = arg0.method2886(true);
        }
        field8328++;
        if (arg2 <= 11) {
            method3441(70, (byte) -112, 5, -93);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)I", line = 119)
    public static final int method3439(int arg0) {
        int var1 = -18 / ((67 - arg0) / 52);
        field8332++;
        int var2 = 0;
        Field[] var3 = (field8343 == null ? (field8343 = method3443("gp")) : field8343).getDeclaredFields();
        Field[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            Field var6 = var4[var5];
            if ((field8344 == null ? (field8344 = method3443("uc")) : field8344).isAssignableFrom(var6.getType())) {
                var2++;
            }
        }
        return var2 + 1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILsl;)V", line = 148)
    public final void method3440(int arg0, class479 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method2886(true);
            if (var3 == 0) {
                field8334++;
                return;
            }
            this.method3438(arg1, var3, 52);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBII)V", line = 172)
    public static final void method3441(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -120) {
            field8329 = true;
        }
        int var4 = class243.field3580.field7980.method3577(false) * arg2 >> 8;
        field8333++;
        if (var4 == 0 || arg0 == -1) {
            return;
        }
        if (!class509.field7381 && class428.field6173 != -1 && class236.method1649(3029) && !class749.method4176(arg1 ^ 0xFFFFFF8A)) {
            class4.field32 = class219.method1543(29190);
            class317 var5 = class647.method3738(class4.field32, -27496);
            class726.method4056(true, var5, 512);
        }
        class219.method1545(false, 0, arg0, class429.field6177, var4, 0);
        class147.method1037((byte) -39, -1, 255);
        class509.field7381 = true;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V", line = 221)
    public final void method3442(byte arg0) {
        field8321++;
        if (arg0 >= -91) {
            field8338 = null;
        }
        this.field8340 = this.field8340 << 8 | this.field8330;
    }
}
