import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class509 {

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
    private int[] field6790 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Ljava/lang/String;")
    public static String field6793 = "";

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lnaa;")
    public class66 field6791;

    // $FF: synthetic field
    @OriginalMember(owner = "client!md", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field6795;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "[I")
    private int[] field6788;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[S")
    private short[] field6783;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "[S")
    private short[] field6786;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "[S")
    private short[] field6787;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "[S")
    private short[] field6792;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBI)Z")
    public static final boolean method2819(int arg0, int arg1, byte arg2, int arg3) {
        field6781++;
        if (arg2 != -79) {
            return true;
        }
        boolean var4 = true;
        class532 var5 = (class532) class219.method1390(arg0, arg3, arg1);
        if (var5 != null) {
            var4 &= class93.method732(117, var5);
        }
        class532 var6 = (class532) class503.method2793(arg0, arg3, arg1, field6795 == null ? (field6795 = method2828("qi")) : field6795);
        if (var6 != null) {
            var4 &= class93.method732(111, var6);
        }
        class532 var7 = (class532) class34.method269(arg0, arg3, arg1);
        if (var7 != null) {
            var4 &= class93.method732(125, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BILeh;)V")
    private final void method2820(byte arg0, int arg1, class335 arg2) {
        field6794++;
        if (arg1 == 1) {
            arg2.method2034(255);
        } else if (arg1 == 2) {
            int var4 = arg2.method2034(arg0 + 195);
            this.field6788 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6788[var5] = arg2.method2001((byte) -83);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg2.method2034(arg0 + 195);
                this.field6783 = new short[var6];
                this.field6787 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6783[var7] = (short) arg2.method2001((byte) -83);
                    this.field6787[var7] = (short) arg2.method2001((byte) -83);
                }
            } else if (arg1 == 41) {
                int var8 = arg2.method2034(255);
                this.field6786 = new short[var8];
                this.field6792 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field6792[var9] = (short) arg2.method2001((byte) -83);
                    this.field6786[var9] = (short) arg2.method2001((byte) -83);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field6790[arg1 - 60] = arg2.method2001((byte) -83);
            }
        }
        if (arg0 != 60) {
            this.field6788 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILeh;)V")
    public final void method2821(int arg0, class335 arg1) {
        while (true) {
            int var3 = arg1.method2034(255);
            if (var3 == 0) {
                if (arg0 < 78) {
                    this.field6792 = null;
                }
                field6780++;
                return;
            }
            this.method2820((byte) 60, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Z")
    public final boolean method2822(byte arg0) {
        field6789++;
        if (this.field6788 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 126) {
            this.field6788 = null;
        }
        class449 var3 = this.field6791.field1010;
        synchronized (this.field6791.field1010) {
            for (int var4 = 0; var4 < this.field6788.length; var4++) {
                if (!this.field6791.field1010.method2538(false, 0, this.field6788[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)Lpf;")
    public final class545 method2823(byte arg0) {
        if (arg0 > -48) {
            method2826(null, null, 116, -57, 63);
        }
        field6782++;
        class545[] var2 = new class545[5];
        int var3 = 0;
        class449 var4 = this.field6791.field1010;
        synchronized (this.field6791.field1010) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field6790[var5] != -1) {
                    var2[var3++] = class590.method3240(this.field6791.field1010, this.field6790[var5], 127, 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7257 < 13) {
                var2[var6].method3027(-256, 2);
            }
        }
        class545 var7 = new class545(var2, var3);
        if (this.field6783 != null) {
            for (int var8 = 0; var8 < this.field6783.length; var8++) {
                var7.method3020(0, this.field6783[var8], this.field6787[var8]);
            }
        }
        if (this.field6792 != null) {
            for (int var9 = 0; var9 < this.field6792.length; var9++) {
                var7.method3028(this.field6786[var9], this.field6792[var9], -28605);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)Z")
    public final boolean method2824(byte arg0) {
        field6785++;
        if (arg0 != 101) {
            return false;
        }
        boolean var2 = true;
        class449 var3 = this.field6791.field1010;
        synchronized (this.field6791.field1010) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field6790[var4] != -1 && !this.field6791.field1010.method2538(false, 0, this.field6790[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Lpf;")
    public final class545 method2825(int arg0) {
        field6784++;
        if (this.field6788 == null) {
            return null;
        } else if (arg0 == -19239) {
            class545[] var2 = new class545[this.field6788.length];
            class449 var3 = this.field6791.field1010;
            synchronized (this.field6791.field1010) {
                int var4 = 0;
                while (true) {
                    if (var4 >= this.field6788.length) {
                        break;
                    }
                    var2[var4] = class590.method3240(this.field6791.field1010, this.field6788[var4], class217.method1381(arg0, -19284), 0);
                    var4++;
                }
            }
            for (int var5 = 0; var5 < this.field6788.length; var5++) {
                if (var2[var5].field7257 < 13) {
                    var2[var5].method3027(-256, 2);
                }
            }
            class545 var6;
            if (var2.length == 1) {
                var6 = var2[0];
            } else {
                var6 = new class545(var2, var2.length);
            }
            if (var6 == null) {
                return null;
            }
            if (this.field6783 != null) {
                for (int var7 = 0; var7 < this.field6783.length; var7++) {
                    var6.method3020(0, this.field6783[var7], this.field6787[var7]);
                }
            }
            if (this.field6792 != null) {
                for (int var8 = 0; var8 < this.field6792.length; var8++) {
                    var6.method3028(this.field6786[var8], this.field6792[var8], -28605);
                }
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Loa;Lni;III)V")
    public static final void method2826(class651 arg0, class487 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class657.field8966) {
            class24 var5 = class703.field9899[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field422 != null && var5.field422.method139(2)) {
                arg1.method141(class587.field7787, arg0, 0, var5.field422, true, true, 0);
            }
        }
        if (arg4 < class657.field8966) {
            class24 var6 = class703.field9899[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field422 != null && var6.field422.method139(2)) {
                arg1.method141(0, arg0, 0, var6.field422, true, true, class587.field7787);
            }
        }
        if (arg3 < class657.field8966 && arg4 < class227.field3196) {
            class24 var7 = class703.field9899[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field422 != null && var7.field422.method139(2)) {
                arg1.method141(class587.field7787, arg0, 0, var7.field422, true, true, class587.field7787);
            }
        }
        if (arg3 < class657.field8966 && arg4 > 0) {
            class24 var8 = class703.field9899[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field422 != null && var8.field422.method139(2)) {
                arg1.method141(class587.field7787, arg0, 0, var8.field422, true, true, -class587.field7787);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static void method2827(boolean arg0) {
        if (arg0) {
            method2826(null, null, 51, -128, -112);
        }
        field6793 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2828(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
