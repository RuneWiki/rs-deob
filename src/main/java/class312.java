import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class312 {

    @OriginalMember(owner = "client!om", name = "f", descriptor = "Z")
    public boolean field4194 = true;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "Z")
    public boolean field4198 = false;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public int field4200 = 0;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public int field4202 = 1190717;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public int field4191 = 128;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Z")
    public boolean field4192 = true;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public int field4204 = -1;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public int field4208 = 16;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public int field4201 = 127;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public int field4206 = -1;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public int field4213 = -1;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public int field4189 = 8;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "Lcba;")
    public static class471 field4197 = new class471(98, 8);

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field4212 = 0;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "Lcba;")
    public static class471 field4211 = new class471(51, 4);

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public int field4210;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Lns;")
    public class341 field4205;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lfb;)V")
    public static final void method1947(class579 arg0) {
        if (class517.field7258 >= 65535) {
            return;
        }
        class223 var1 = arg0.field7959;
        class363.field4863[class517.field7258] = arg0;
        class335.field4463[class517.field7258] = false;
        class517.field7258++;
        int var2 = arg0.field7956;
        if (arg0.field7970) {
            var2 = 0;
        }
        int var3 = arg0.field7956;
        if (arg0.field7962) {
            var3 = class395.field5610 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method1429(4330) + class194.field2745 - var1.method1433(4294) >> class272.field3786;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method1429(4330) + var1.method1433(4294) - class194.field2745 >> class272.field3786;
            if (var7 >= class34.field624) {
                var7 = class34.field624 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field7963[var5++];
                int var10 = (var1.method1434(7) + class194.field2745 - var1.method1433(4294) >> class272.field3786) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class332.field4447) {
                    var11 = class332.field4447 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class217.field3091[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class217.field3091[var4][var12][var8] = var13 | (long) class517.field7258;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class217.field3091[var4][var12][var8] = var13 | (long) class517.field7258 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class217.field3091[var4][var12][var8] = var13 | (long) class517.field7258 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class217.field3091[var4][var12][var8] = var13 | (long) class517.field7258 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public static final void method1948(int arg0) {
        field4190++;
        class313.field4221.method2549(-122);
        int var1 = -14 / ((arg0 + 71) / 36);
        class479.field6754.field165 = 0;
        class343.field4627.field165 = 0;
        class434.field6185 = null;
        class367.field4996 = null;
        class331.field4422 = 0;
        class625.field9111 = null;
        class407.field5779 = 0;
        class368.field5005 = null;
        class177.method1124(1);
        class594.field8603 = 0;
        class367.field4989 = 0;
        class587.field8394 = null;
        class608.field8764 = 0;
        class572.field7886 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ldaa;I)V")
    public final void method1949(class11 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method110((byte) 102);
            if (var3 == 0) {
                field4195++;
                if (arg1 != 0) {
                    this.method1949(null, -112);
                    return;
                }
                return;
            }
            this.method1952(0, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
    public static final void method1950(boolean arg0) {
        field4209++;
        if (class87.field1383 != null) {
            return;
        }
        int var1 = class32.field519;
        int var2 = class272.field3787;
        int var3 = class342.field4611 - var1 - class387.field5196;
        if (arg0) {
            return;
        }
        int var4 = class178.field2543 - class134.field2128 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class233.field3284 == null) {
                var5 = class500.field6968.field3975;
            } else {
                var5 = class233.field3284;
            }
            int var6 = 0;
            int var7 = 0;
            if (class233.field3284 == var5) {
                Insets var8 = class233.field3284.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class178.field2543);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class342.field4611, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class342.field4611 - var3, var7, var3, class178.field2543);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class178.field2543 - var4, class342.field4611, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public static final void method1951(int arg0) {
        field4193++;
        if (class465.field6552) {
            return;
        }
        class494.field6921 = true;
        if (arg0 != 0) {
            field4207 = -76;
        }
        class465.field6552 = true;
        if (class491.field6875.field3369) {
            class1.field13 = ((int) class1.field13 + 191 & 0xFFFFFF80);
        } else {
            class309.field4169 += (24.0F - class309.field4169) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILdaa;)V")
    private final void method1952(int arg0, int arg1, class11 arg2) {
        if (arg0 != 0) {
            this.field4189 = -20;
        }
        field4203++;
        if (arg1 == 1) {
            this.field4200 = class272.method1765(arg2.method89((byte) -83), -1);
        } else if (arg1 == 2) {
            this.field4204 = arg2.method110((byte) 94);
            return;
        } else if (arg1 == 3) {
            this.field4204 = arg2.method93((byte) 76);
            if (this.field4204 == 65535) {
                this.field4204 = -1;
                return;
            }
        } else if (arg1 == 5) {
            this.field4194 = false;
            return;
        } else if (arg1 == 7) {
            this.field4206 = class272.method1765(arg2.method89((byte) -72), ~arg0);
            return;
        } else if (arg1 == 8) {
            this.field4205.field4598 = this.field4210;
            return;
        } else if (arg1 == 9) {
            this.field4191 = arg2.method93((byte) 97) << 0;
            return;
        } else {
            if (arg1 == 10) {
                this.field4192 = false;
            } else if (arg1 == 11) {
                this.field4189 = arg2.method110((byte) 71);
                return;
            } else if (arg1 == 12) {
                this.field4198 = true;
                return;
            } else if (arg1 == 13) {
                this.field4202 = arg2.method89((byte) -58);
                return;
            } else if (arg1 == 14) {
                this.field4208 = arg2.method110((byte) 91) << 0;
                return;
            } else if (arg1 == 15) {
                this.field4213 = arg2.method93((byte) 106);
                if (this.field4213 == 65535) {
                    this.field4213 = -1;
                    return;
                }
            } else if (arg1 == 16) {
                this.field4201 = arg2.method110((byte) 125);
                return;
            } else {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public final void method1953(byte arg0) {
        if (this.field4213 == -1) {
            this.field4213 = this.field4204;
        }
        this.field4189 = this.field4189 << 8 | this.field4210;
        field4196++;
        if (arg0 <= 108) {
            this.method1949(null, 95);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
    public static void method1954(byte arg0) {
        if (arg0 != 117) {
            field4211 = null;
        }
        field4211 = null;
        field4197 = null;
    }
}
