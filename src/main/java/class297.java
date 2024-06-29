import java.awt.Container;
import java.awt.Insets;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class297 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    private int field4189 = 0;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    private int field4200 = -1;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lcf;")
    private class92 field4193 = new class92();

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "Z")
    public boolean field4208 = false;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    private int field4190;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    private int field4207;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "[[[I")
    private int[][][] field4192;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "[Lom;")
    private class243[] field4197;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "[J")
    public static long[] field4203 = new long[32];

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "[Lrn;")
    public static class417[] field4195;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lfo;I)V", line = 8)
    public static final void method1921(class418 arg0, int arg1) {
        if (arg0 instanceof class361) {
            class361 var2 = (class361) arg0;
            if (var2.field4952 != null) {
                class52.method496(0, var2, class262.field3781.field4531 != var2.field4531);
            }
        } else if (arg0 instanceof class39) {
            class39 var3 = (class39) arg0;
            class397.method2391(class262.field3781.field4531 != var3.field4531, var3, 44);
        }
        if (arg1 != 21945) {
            method1924(-7, 96, (class435) null, -128);
        }
        field4199++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)[[[I", line = 35)
    public final int[][][] method1922(boolean arg0) {
        field4196++;
        if (this.field4207 != this.field4190) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4207; var2++) {
            this.field4197[var2] = class309.field4386;
        }
        return arg0 ? null : this.field4192;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 56)
    public static void method1923(int arg0) {
        field4195 = null;
        if (arg0 == -16433) {
            field4203 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILnl;I)Lkg;", line = 68)
    public static final class194 method1924(int arg0, int arg1, class435 arg2, int arg3) {
        field4206++;
        if (arg0 != -7962) {
            method1921((class418) null, 21);
        }
        byte[] var4 = arg2.method2633(arg1, arg3, 103);
        return var4 == null ? null : new class194(var4);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)V", line = 87)
    public static final void method1925(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg1; var5 < class173.field2636; var5++) {
            Rectangle var6 = class341.field4711[var5];
            if ((var6.x + var6.width) > arg4 && (arg4 + arg0) > var6.x && (var6.y + var6.height) > arg2 && var6.y < arg2 + arg3) {
                class184.field2783[var5] = true;
            }
        }
        field4205++;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(III)V", line = 380)
    public class297(int arg0, int arg1, int arg2) {
        this.field4190 = arg1;
        this.field4207 = arg0;
        this.field4192 = new int[this.field4207][3][arg2];
        this.field4197 = new class243[this.field4190];
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 123)
    public final void method1926(byte arg0) {
        field4204++;
        if (arg0 > -124) {
            return;
        }
        for (int var2 = 0; var2 < this.field4207; var2++) {
            this.field4192[var2][0] = null;
            this.field4192[var2][1] = null;
            this.field4192[var2][2] = null;
            this.field4192[var2] = null;
        }
        this.field4197 = null;
        this.field4192 = null;
        this.field4193.method773(-1568);
        this.field4193 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIZI)V", line = 149)
    public static final void method1927(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4194++;
        if (arg4) {
            class238.method1662(10);
        }
        if (class273.field3967 != null && (arg5 != 3 || class185.field2787 != arg1 || class30.field312 != arg0)) {
            class480.method2834(class273.field3967, class436.field6206, 0);
            class273.field3967 = null;
        }
        if (arg5 == 3 && class273.field3967 == null) {
            class273.field3967 = class349.method2165(0, true, 0, arg1, arg0, class436.field6206);
            if (class273.field3967 != null) {
                class185.field2787 = arg1;
                class30.field312 = arg0;
                class77.method681(class436.field6206, (byte) 51);
            }
        }
        if (arg5 == 3 && class273.field3967 == null) {
            method1927(-1, -1, arg2, 107, true, class223.field3222);
            return;
        }
        int var6 = -120 / ((-arg3 - 82) / 33);
        Container var8;
        if (class273.field3967 != null) {
            field4191 = arg0;
            class59.field847 = arg1;
            var8 = class273.field3967;
        } else if (class467.field6587 == null) {
            var8 = class436.field6206.field960;
            class59.field847 = var8.getSize().width;
            field4191 = var8.getSize().height;
        } else {
            Insets var7 = class467.field6587.getInsets();
            class59.field847 = class467.field6587.getSize().width - var7.left - var7.right;
            int var10001 = var7.top + var7.bottom;
            field4191 = class467.field6587.getSize().height - var10001;
            var8 = class467.field6587;
        }
        if (arg5 == 1) {
            class394.field5444 = 0;
            class97.field1357 = (class59.field847 - class15.field146) / 2;
            class431.field6099 = class364.field5005;
            class364.field5007 = class15.field146;
        } else if (class364.field5008 < 96 && class377.field5192 == 0) {
            int var9 = class59.field847 <= 1024 ? class59.field847 : 1024;
            class364.field5007 = var9;
            class97.field1357 = (class59.field847 - var9) / 2;
            int var10 = field4191 <= 768 ? field4191 : 768;
            class431.field6099 = var10;
            class394.field5444 = 0;
        } else {
            class394.field5444 = 0;
            class97.field1357 = 0;
            class364.field5007 = class59.field847;
            class431.field6099 = field4191;
        }
        if (class480.field6799 != class389.field5379) {
            boolean var10000;
            if (class364.field5007 < 1024 && class431.field6099 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class136.method1006(class377.field5192, -118);
        } else {
            class33.field338.setSize(class364.field5007, class431.field6099);
            if (class374.field5152 != null) {
                class374.field5152.method294();
            }
            if (class467.field6587 == var8) {
                Insets var11 = class467.field6587.getInsets();
                class33.field338.setLocation(var11.left + class97.field1357, var11.top - -class394.field5444);
            } else {
                class33.field338.setLocation(class97.field1357, class394.field5444);
            }
        }
        if (arg5 < 2) {
            class149.field2059 = false;
        } else {
            class149.field2059 = true;
        }
        if (class238.field3475 != -1) {
            class464.method2770((byte) -99, true);
        }
        if (class394.field5440 != null && (class347.field4787 == 30 || class347.field4787 == 25)) {
            class178.method1277(false);
        }
        for (int var12 = 0; var12 < 100; var12++) {
            class424.field5879[var12] = true;
        }
        class464.field6540 = true;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)[[I", line = 302)
    public final int[][] method1928(byte arg0, int arg1) {
        field4198++;
        if (arg0 < 35) {
            this.field4207 = -70;
        }
        if (this.field4207 == this.field4190) {
            this.field4208 = this.field4197[arg1] == null;
            this.field4197[arg1] = class309.field4386;
            return this.field4192[arg1];
        } else if (this.field4207 == 1) {
            this.field4208 = this.field4200 != arg1;
            this.field4200 = arg1;
            return this.field4192[0];
        } else {
            class243 var3 = this.field4197[arg1];
            if (var3 == null) {
                this.field4208 = true;
                if (this.field4207 <= this.field4189) {
                    class243 var4 = (class243) this.field4193.method777(103);
                    var3 = new class243(arg1, var4.field3530);
                    this.field4197[var4.field3528] = null;
                    var4.method2714(106);
                } else {
                    var3 = new class243(arg1, this.field4189);
                    this.field4189++;
                }
                this.field4197[arg1] = var3;
            } else {
                this.field4208 = false;
            }
            this.field4193.method774(var3, (byte) 127);
            return this.field4192[var3.field3530];
        }
    }
}
