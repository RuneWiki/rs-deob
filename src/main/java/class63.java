import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class63 {

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "Lkf;")
    private class165 field950;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "Lbd;")
    private class43 field960;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "Ltf;")
    private class192 field952;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "Ldh;")
    private class209 field957;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "[Lsl;")
    private class317[] field953;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Loc;BZILoc;)Lsl;")
    private final class317 method368(class135 arg0, byte arg1, boolean arg2, int arg3, class135 arg4) {
        field954++;
        if (this.field957 == null) {
            throw new RuntimeException();
        }
        this.field957.field3037 = arg3 * 8 + 5;
        if (this.field957.field3037 >= this.field957.field3036.length) {
            throw new RuntimeException();
        } else if (this.field953[arg3] == null) {
            int var6 = this.field957.method1452(arg1 ^ 0xFF74);
            int var7 = this.field957.method1452(65280);
            class317 var8 = new class317(arg3, arg4, arg0, this.field960, this.field950, var6, var7, arg2);
            this.field953[arg3] = var8;
            if (arg1 != 116) {
                this.field952 = null;
            }
            return var8;
        } else {
            return this.field953[arg3];
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lqa;Ler;III)V")
    public static final void method369(class162 arg0, class68 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class361.field5554) {
            class518 var5 = class108.field1553[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field7550 != null && var5.field7550.method18(80)) {
                arg1.method19(true, class352.field5398, 0, var5.field7550, arg0, 0, (byte) -125);
            }
        }
        if (arg4 < class361.field5554) {
            class518 var6 = class108.field1553[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field7550 != null && var6.field7550.method18(91)) {
                arg1.method19(true, 0, 0, var6.field7550, arg0, class352.field5398, (byte) -127);
            }
        }
        if (arg3 < class361.field5554 && arg4 < class484.field7096) {
            class518 var7 = class108.field1553[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field7550 != null && var7.field7550.method18(109)) {
                arg1.method19(true, class352.field5398, 0, var7.field7550, arg0, class352.field5398, (byte) -116);
            }
        }
        if (arg3 < class361.field5554 && arg4 > 0) {
            class518 var8 = class108.field1553[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field7550 != null && var8.field7550.method18(81)) {
                arg1.method19(true, class352.field5398, 0, var8.field7550, arg0, -class352.field5398, (byte) -117);
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public final void method370(int arg0) {
        field956++;
        if (this.field953 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field953.length; var2++) {
            if (this.field953[var2] != null) {
                this.field953[var2].method1975(false);
            }
        }
        for (int var3 = 0; var3 < this.field953.length; var3++) {
            if (this.field953[var3] != null) {
                this.field953[var3].method1981(true);
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)Z")
    public final boolean method371(int arg0) {
        field955++;
        if (this.field957 != null) {
            return true;
        }
        if (this.field952 == null) {
            if (this.field960.method268(4)) {
                return false;
            }
            this.field952 = this.field960.method276((byte) 0, true, -75, 255, 255);
        }
        if (arg0 < 81) {
            method372(103, -86L);
        }
        if (this.field952.field7045) {
            return false;
        } else {
            this.field957 = new class209(this.field952.method1291(0));
            this.field953 = new class317[(this.field957.field3036.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method372(int arg0, long arg1) {
        field959++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = arg0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class307.field4410[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(FFFFFILuv;IZII)[B")
    public static final byte[] method373(float arg0, float arg1, float arg2, float arg3, float arg4, int arg5, class243 arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field958++;
        byte[] var11 = new byte[arg5 * arg7 * arg9];
        class238.method1608(arg2, var11, arg7, arg9, arg4, arg5, arg3, arg0, 11625, arg10, arg6, 0, arg1);
        return arg8 ? var11 : null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILoc;Loc;)Lsl;")
    public final class317 method374(int arg0, int arg1, class135 arg2, class135 arg3) {
        field951++;
        if (arg1 != 1) {
            method373(-0.44871747F, 0.31670338F, -0.07483598F, 1.5446781F, -0.41867256F, 50, null, 15, false, -85, 3);
        }
        return this.method368(arg2, (byte) 116, true, arg0, arg3);
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lbd;Lkf;)V")
    public class63(class43 arg0, class165 arg1) {
        this.field950 = arg1;
        this.field960 = arg0;
        if (!this.field960.method268(4)) {
            this.field952 = this.field960.method276((byte) 0, true, -114, 255, 255);
        }
    }
}
