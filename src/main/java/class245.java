import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class245 extends class168 {

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lfl;")
    public class191 field4363 = new class191();

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "Lrh;")
    public class115 field4368 = new class115();

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Lbk;")
    private class52 field4365;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Lp;")
    public static class82 field4361 = null;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lhi;")
    public static class250 field4359;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method354(int arg0) {
        field4356++;
        this.field4368.method354(arg0);
        for (class43 var2 = (class43) this.field4363.method1375(16259); var2 != null; var2 = (class43) this.field4363.method1377(-19546)) {
            if (!this.field4365.method348((byte) -114, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field666) {
                        this.method1647((byte) -1, var2, var3);
                        var2.field666 -= var3;
                        break;
                    }
                    this.method1647((byte) -1, var2, var2.field666);
                    var3 -= var2.field666;
                } while (!this.field4365.method339((int[]) null, 17591, var2, var3, 0));
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILvb;III[I)V")
    private final void method1645(int arg0, class43 arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if ((this.field4365.field888[arg1.field665] & 0x4) != 0 && arg1.field657 < 0) {
            int var7 = this.field4365.field840[arg1.field665] / class271.field4813;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field675) / var7;
                if (var8 > arg3) {
                    arg1.field675 += arg3 * var7;
                    break;
                }
                int var9 = 262144 / var7;
                arg1.field663.method356(arg5, arg2, var8);
                arg1.field675 += var7 * var8 - 1048576;
                arg3 -= var8;
                class100 var10 = arg1.field663;
                arg2 += var8;
                int var11 = class271.field4813 / 100;
                if (var9 < var11) {
                    var11 = var9;
                }
                if (this.field4365.field865[arg1.field665] == 0) {
                    arg1.field663 = class100.method668(arg1.field676, var10.method677(), var10.method665(), var10.method656());
                } else {
                    arg1.field663 = class100.method668(arg1.field676, var10.method677(), 0, var10.method656());
                    this.field4365.method330(arg1, arg1.field653.field2835[arg1.field661] < 0, true);
                    arg1.field663.method660(var11, var10.method665());
                }
                if (arg1.field653.field2835[arg1.field661] < 0) {
                    arg1.field663.method670(-1);
                }
                var10.method681(var11);
                var10.method356(arg5, arg2, arg4 - arg2);
                if (var10.method678()) {
                    this.field4368.method801(var10);
                }
            }
        }
        arg1.field663.method356(arg5, arg2, arg3);
        if (arg0 < 23) {
            method1646(-1);
        }
        field4364++;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Lhf;")
    public final class168 method342() {
        field4355++;
        class43 var1 = (class43) this.field4363.method1375(16259);
        if (var1 == null) {
            return null;
        } else if (var1.field663 == null) {
            return this.method336();
        } else {
            return var1.field663;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()I")
    public final int method347() {
        field4354++;
        return 0;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public static void method1646(int arg0) {
        field4361 = null;
        field4359 = null;
        if (arg0 < 120) {
            field4361 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Lhf;")
    public final class168 method336() {
        field4367++;
        class43 var1;
        do {
            var1 = (class43) this.field4363.method1377(-19546);
            if (var1 == null) {
                return null;
            }
        } while (var1.field663 == null);
        return var1.field663;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLvb;I)V")
    private final void method1647(byte arg0, class43 arg1, int arg2) {
        field4358++;
        if ((this.field4365.field888[arg1.field665] & 0x4) != 0 && arg1.field657 < 0) {
            int var4 = this.field4365.field840[arg1.field665] / class271.field4813;
            int var5 = (var4 + 1048575 - arg1.field675) / var4;
            arg1.field675 = arg1.field675 + (arg2 * var4) & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field4365.field865[arg1.field665] == 0) {
                    arg1.field663 = class100.method668(arg1.field676, arg1.field663.method677(), arg1.field663.method665(), arg1.field663.method656());
                } else {
                    arg1.field663 = class100.method668(arg1.field676, arg1.field663.method677(), 0, arg1.field663.method656());
                    this.field4365.method330(arg1, arg1.field653.field2835[arg1.field661] < 0, true);
                }
                if (arg1.field653.field2835[arg1.field661] < 0) {
                    arg1.field663.method670(-1);
                }
                arg2 = arg1.field675 / var4;
            }
        }
        if (arg0 == -1) {
            arg1.field663.method354(arg2);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([III)V")
    public final void method356(int[] arg0, int arg1, int arg2) {
        this.field4368.method356(arg0, arg1, arg2);
        field4366++;
        for (class43 var4 = (class43) this.field4363.method1375(16259); var4 != null; var4 = (class43) this.field4363.method1377(-19546)) {
            if (!this.field4365.method348((byte) 62, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field666) {
                        this.method1645(69, var4, var5, var6, var5 + var6, arg0);
                        var4.field666 -= var6;
                        break;
                    }
                    this.method1645(69, var4, var5, var4.field666, var5 + var6, arg0);
                    var5 += var4.field666;
                    var6 -= var4.field666;
                } while (!this.field4365.method339(arg0, 17591, var4, var6, var5));
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLjd;)Lwc;")
    public static final class85 method1648(byte arg0, class118 arg1) {
        class85 var2 = new class85(arg1.method865(9199), arg1.method865(9199), arg1.method827(255), arg1.method827(255), arg1.method875((byte) 81), arg1.method867(false) == 1, arg1.method867(false));
        field4362++;
        int var3 = arg1.method867(false);
        int var4 = 52 / ((51 - arg0) / 34);
        for (int var5 = 0; var5 < var3; var5++) {
            var2.field1676.method1382(new class137(arg1.method827(255), arg1.method827(255), arg1.method827(255), arg1.method827(255)), (byte) -90);
        }
        var2.method555(-24871);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;I)Lli;")
    public static final class185 method1649(String arg0, int arg1) {
        field4360++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class185 var4 = new class185();
        int var5 = 0;
        var4.field3411 = new byte[var3];
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field3411[var4.field3437++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field3411[var4.field3437++] = (byte) var6;
            }
        }
        int var8 = -28 % ((arg1 - 62) / 60);
        var4.method1323((byte) -88);
        return var4.method1307(-70);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lbk;)V")
    public class245(class52 arg0) {
        this.field4365 = arg0;
    }
}
