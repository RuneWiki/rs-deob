import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class87 extends class46 {

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    private int field974;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field985 = new String[] { method739(method738("\u001c\"ylW")), method739(method738("\u001c\"yaW")), method739(method738("\u001c\"ybW")), method739(method738("\u001c\"y\u0017\u0016\u0019'#\u0015W")), method739(method738("\u001c\"ycW")), method739(method738("\u001c\"ygW")), method739(method738("\u001c\"ymW")), method739(method738("\u001c\"y`W")) };

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "[I")
    public static int[] field981 = null;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "Lwia;")
    public static class790 field978 = new class790(30, -1);

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field984 = 0;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "[Lqk;")
    public class18[] field976;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "[[B")
    private byte[][] field979;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)Z")
    public final boolean method731(boolean arg0, int arg1) {
        try {
            field982++;
            return arg0 ? this.field976[arg1].field218 : true;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field985[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
    public static void method732(int arg0) {
        try {
            field978 = null;
            int var1 = -95 % ((41 - arg0) / 54);
            field981 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field985[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)Z")
    public final boolean method733(int arg0, byte arg1) {
        try {
            if (arg1 != 93) {
                method734(-57);
            }
            field980++;
            return this.field976[arg0].field212;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field985[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static final void method734(int arg0) {
        try {
            field977++;
            for (int var1 = 0; var1 < class601.field8825; var1++) {
                int var2 = class192.method1647(class601.field8825, var1 + class548.field8188, (byte) 127) * class187.field2571;
                for (int var3 = 0; var3 < class187.field2571; var3++) {
                    int var4 = var2 + class192.method1647(class187.field2571, class772.field11216 + var3, (byte) 127);
                    if (class1.field5[var4] == class702.field10205) {
                        class792.field11524[var4].method708(0, 0, class283.field4239, class335.field5236, class283.field4239 * var3, class335.field5236 * var1, true, true);
                    }
                }
            }
            int var5 = 102 / ((arg0 - 70) / 54);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field985[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)Z")
    public static final boolean method735(int arg0, int arg1) {
        try {
            field975++;
            if (arg0 != 28692) {
                method735(-104, -95);
            }
            return arg1 >= 12 && arg1 <= 17;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field985[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(I)V")
    public class87(int arg0) {
        try {
            this.field974 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field985[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)Z")
    public final boolean method736(boolean arg0) {
        try {
            field983++;
            if (this.field976 != null) {
                return true;
            }
            if (this.field979 == null) {
                class476 var2 = class277.field4170;
                synchronized (class277.field4170) {
                    if (!class277.field4170.method3616((byte) -62, this.field974)) {
                        return false;
                    }
                    int[] var4 = class277.field4170.method3620(117, this.field974);
                    this.field979 = new byte[var4.length][];
                    for (int var5 = 0; var5 < var4.length; var5++) {
                        this.field979[var5] = class277.field4170.method3632(this.field974, var4[var5], 14);
                    }
                }
            }
            boolean var6 = true;
            for (int var7 = 0; var7 < this.field979.length; var7++) {
                byte[] var8 = this.field979[var7];
                class163 var9 = new class163(var8);
                var9.field2201 = 1;
                int var10 = var9.method1445((byte) 118);
                class476 var11 = class595.field8725;
                synchronized (class595.field8725) {
                    var6 &= class595.field8725.method3618(var10, 114);
                }
            }
            if (!var6) {
                return false;
            }
            class513 var12 = new class513();
            class476 var13 = class277.field4170;
            int[] var16;
            synchronized (class277.field4170) {
                if (arg0) {
                    return true;
                }
                int var15 = class277.field4170.method3646(this.field974, (byte) -122);
                this.field976 = new class18[var15];
                var16 = class277.field4170.method3620(58, this.field974);
            }
            for (int var17 = 0; var17 < var16.length; var17++) {
                byte[] var18 = this.field979[var17];
                class163 var19 = new class163(var18);
                var19.field2201 = 1;
                int var20 = var19.method1445((byte) 119);
                class311 var21 = null;
                for (class311 var22 = (class311) var12.method3863((byte) 64); var22 != null; var22 = (class311) var12.method3862(-353)) {
                    if (var22.field4928 == var20) {
                        var21 = var22;
                        break;
                    }
                }
                if (var21 == null) {
                    class476 var23 = class595.field8725;
                    synchronized (class595.field8725) {
                        var21 = new class311(var20, class595.field8725.method3638(39, var20));
                    }
                    var12.method3868(90, var21);
                }
                this.field976[var16[var17]] = new class18(var18, var21);
            }
            this.field979 = null;
            return true;
        } catch (RuntimeException var33) {
            throw class759.method5498(var33, field985[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Z")
    public final boolean method737(int arg0, int arg1) {
        try {
            field973++;
            if (arg1 != -25695) {
                this.method733(-23, (byte) -104);
            }
            return this.field976[arg0].field219;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field985[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method738(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method739(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 78;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
