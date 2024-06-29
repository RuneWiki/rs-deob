import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class299 {

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    private int field5182 = 128;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Z")
    public boolean field5168 = false;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public int field5170 = -1;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    private int field5178 = 128;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    private int field5189 = 0;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    private int field5169 = 0;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    private int field5191 = 0;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field5181 = -1;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "[Lwm;")
    public static class152[] field5184 = null;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field5179 = 1;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "Lwm;")
    public static class152 field5187 = class157.method1048("jaune:", 114);

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "[I")
    public static int[] field5185 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field5190 = 0;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public int field5186;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    private int field5193;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[S")
    private short[] field5173;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[S")
    private short[] field5177;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "[S")
    private short[] field5183;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "[S")
    private short[] field5188;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2090(int arg0) {
        class276.field4729 = 0;
        if (arg0 >= -117) {
            field5187 = (class152) null;
        }
        field5180++;
        int var1 = (class85.field1176.field4231 >> 7) + class199.field3226;
        int var2 = (class85.field1176.field4162 >> 7) + class272.field4670;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class276.field4729 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class276.field4729 = 1;
        }
        if (class276.field4729 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class276.field4729 = 0;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lhi;B)V", line = 44)
    public final void method2091(class291 arg0, byte arg1) {
        int var3 = 45 % ((7 - arg1) / 32);
        field5175++;
        while (true) {
            int var4 = arg0.method2011(-89);
            if (var4 == 0) {
                return;
            }
            this.method2095(var4, (byte) 68, arg0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V", line = 64)
    public static final void method2092(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class303 var5 = class90.method589(false, arg1, 4);
        var5.method2117((byte) 80);
        var5.field5223 = arg3;
        int var6 = -82 / ((-arg2 - 8) / 55);
        field5174++;
        var5.field5208 = arg0;
        var5.field5219 = arg4;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)Lw;", line = 83)
    public final class271 method2093(int arg0, int arg1, int arg2, int arg3) {
        field5172++;
        if (arg0 != -30505) {
            return (class271) null;
        }
        class271 var5 = (class271) class191.field3015.method1620(true, (long) this.field5186);
        if (var5 == null) {
            class220 var6 = class220.method1514(class230.field3754, this.field5193, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field5183 != null) {
                for (int var7 = 0; var7 < this.field5183.length; var7++) {
                    var6.method1511(this.field5183[var7], this.field5188[var7]);
                }
            }
            if (this.field5177 != null) {
                for (int var8 = 0; var8 < this.field5177.length; var8++) {
                    var6.method1510(this.field5177[var8], this.field5173[var8]);
                }
            }
            var5 = var6.method1521(this.field5189 + 64, this.field5169 + 850, -30, -50, -30);
            class191.field3015.method1614(var5, (long) this.field5186, (byte) 78);
        }
        class271 var9;
        if (this.field5170 == -1 || arg3 == -1) {
            var9 = var5.method140(true, true, true);
        } else {
            var9 = class133.method851(this.field5170, 103).method889(arg1, arg3, arg2, var5, arg0 ^ 0xFFFF88D6);
        }
        if (this.field5178 != 128 || this.field5182 != 128) {
            var9.method159(this.field5178, this.field5182, this.field5178);
        }
        if (this.field5191 != 0) {
            if (this.field5191 == 90) {
                var9.method161();
            }
            if (this.field5191 == 180) {
                var9.method131();
            }
            if (this.field5191 == 270) {
                var9.method132();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V", line = 162)
    public static final void method2094(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class17.field248; var3++) {
            for (int var4 = 0; var4 < class112.field1595; var4++) {
                for (int var5 = 0; var5 < class97.field1394; var5++) {
                    class34 var6 = class287.field4857[var3][var4][var5];
                    if (var6 != null) {
                        class294 var7 = var6.field573;
                        if (var7 != null && var7.field5026.method497()) {
                            class84.method549(var7.field5026, var3, var4, var5, 1, 1);
                            if (var7.field5028 != null && var7.field5028.method497()) {
                                class84.method549(var7.field5028, var3, var4, var5, 1, 1);
                                var7.field5026.method494(var7.field5028, 0, 0, 0, false);
                                var7.field5028 = var7.field5028.method495(arg0, arg1, arg2);
                            }
                            var7.field5026 = var7.field5026.method495(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field579; var8++) {
                            class248 var9 = var6.field580[var8];
                            if (var9 != null && var9.field4144.method497()) {
                                class84.method549(var9.field4144, var3, var4, var5, var9.field4153 + 1 - var9.field4157, var9.field4150 - var9.field4151 + 1);
                                var9.field4144 = var9.field4144.method495(arg0, arg1, arg2);
                            }
                        }
                        class120 var10 = var6.field558;
                        if (var10 != null && var10.field1684.method497()) {
                            class155.method1034(var10.field1684, var3, var4, var5);
                            var10.field1684 = var10.field1684.method495(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLhi;)V", line = 233)
    private final void method2095(int arg0, byte arg1, class291 arg2) {
        if (arg1 < 63) {
            return;
        }
        field5176++;
        if (arg0 == 1) {
            this.field5193 = arg2.method2021((byte) 74);
        } else if (arg0 == 2) {
            this.field5170 = arg2.method2021((byte) 74);
        } else if (arg0 == 4) {
            this.field5178 = arg2.method2021((byte) 74);
        } else if (arg0 == 5) {
            this.field5182 = arg2.method2021((byte) 74);
        } else if (arg0 == 6) {
            this.field5191 = arg2.method2021((byte) 74);
        } else if (arg0 == 7) {
            this.field5189 = arg2.method2011(-67);
        } else if (arg0 == 8) {
            this.field5169 = arg2.method2011(-36);
        } else if (arg0 == 9) {
            this.field5168 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method2011(-86);
            this.field5183 = new short[var4];
            this.field5188 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5183[var5] = (short) arg2.method2021((byte) 74);
                this.field5188[var5] = (short) arg2.method2021((byte) 74);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method2011(-72);
            this.field5173 = new short[var6];
            this.field5177 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5177[var7] = (short) arg2.method2021((byte) 74);
                this.field5173[var7] = (short) arg2.method2021((byte) 74);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 318)
    public static void method2096(int arg0) {
        if (arg0 != -1) {
            field5187 = (class152) null;
        }
        field5185 = null;
        field5184 = null;
        field5187 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V", line = 349)
    public static final void method2097(int arg0, int arg1) {
        if (arg0 != -271) {
            field5184 = (class152[]) null;
        }
        if (!class169.field2651) {
            arg1 = -1;
        }
        field5171++;
        if (class162.field2568 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class87 var2 = class185.method1232(21584, arg1);
            class109 var3 = var2.method569(-126);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class34.field572.method957(class224.field3648, var3.field3278, var3.field3283, false, var3.method730(), new Point(var2.field1216, var2.field1218));
                class162.field2568 = arg1;
            }
        }
        if (arg1 == -1 && class162.field2568 != -1) {
            class34.field572.method957(class224.field3648, -1, -1, false, (int[]) null, new Point());
            class162.field2568 = -1;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 406)
    public static final void method2098(byte arg0) {
        class284.field4824 = null;
        class133.field2043 = null;
        field5192++;
        class253.field4382 = null;
        class124.field1742 = null;
        class120.field1702 = null;
        if (arg0 != -127) {
            method2098((byte) 95);
        }
    }
}
