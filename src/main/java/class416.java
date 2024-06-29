import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class416 extends class544 {

    @OriginalMember(owner = "client!mw", name = "C", descriptor = "I")
    public int field5414 = 0;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field5399 = new Hashtable();

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    public int field5398;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
    public int field5401;

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
    public int field5402;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    public int field5403;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
    public int field5405;

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
    public int field5406;

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!mw", name = "w", descriptor = "I")
    public int field5408;

    @OriginalMember(owner = "client!mw", name = "A", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!mw", name = "D", descriptor = "I")
    public int field5415;

    @OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
    public int field5416;

    @OriginalMember(owner = "client!mw", name = "H", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!mw", name = "I", descriptor = "I")
    public int field5420;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "Lbn;")
    public class375 field5404;

    @OriginalMember(owner = "client!mw", name = "F", descriptor = "Lbn;")
    public class375 field5417;

    @OriginalMember(owner = "client!mw", name = "y", descriptor = "Lcn;")
    public class437 field5410;

    @OriginalMember(owner = "client!mw", name = "G", descriptor = "Lvi;")
    public class459 field5418;

    @OriginalMember(owner = "client!mw", name = "x", descriptor = "Lav;")
    public class545 field5409;

    @OriginalMember(owner = "client!mw", name = "J", descriptor = "Lra;")
    public static class90 field5421;

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "Z")
    public boolean field5411;

    @OriginalMember(owner = "client!mw", name = "B", descriptor = "[I")
    public int[] field5413;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V", line = 7)
    public static void method2372(int arg0) {
        field5399 = null;
        if (arg0 == 3767) {
            field5421 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V", line = 30)
    public static final void method2373(int arg0) {
        field5419++;
        if (arg0 != 0 || class110.field1367 != null) {
            return;
        }
        int var1 = class157.field1906;
        int var2 = class244.field3133;
        int var3 = class7.field56 - class185.field2239 - var1;
        int var4 = class202.field2423 - class426.field5495 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class431.field5843 == null) {
                var5 = class74.field873.field2014;
            } else {
                var5 = class431.field5843;
            }
            int var6 = 0;
            int var7 = 0;
            if (class431.field5843 == var5) {
                Insets var8 = class431.field5843.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class202.field2423);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class7.field56, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class7.field56 - var3, var7, var3, class202.field2423);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class202.field2423 + var7 - var4, class7.field56, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIB)Z", line = 95)
    public static final boolean method2374(int arg0, int arg1, byte arg2) {
        if (arg2 == -61) {
            field5400++;
            return class422.method2391((byte) 62, arg1, arg0) & class337.method1897((byte) -128, arg1, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)V", line = 113)
    public final void method2375(int arg0) {
        field5412++;
        int var2 = this.field5401;
        if (this.field5410 != null) {
            class437 var5 = this.field5410.method2545(-1, class281.field3700);
            if (var5 == null) {
                this.field5398 = 0;
                this.field5407 = 0;
                this.field5401 = -1;
                this.field5416 = 0;
                this.field5413 = null;
                this.field5420 = 0;
            } else {
                this.field5407 = var5.field6010;
                this.field5420 = var5.field5995 << 7;
                this.field5401 = var5.field5994;
                this.field5416 = var5.field5992;
                this.field5413 = var5.field5944;
                this.field5398 = var5.field5970;
            }
        } else if (this.field5418 != null) {
            int var3 = class290.method1628(arg0 ^ 0xFFFFFFAB, this.field5418);
            if (var2 != var3) {
                this.field5401 = var3;
                class74 var4 = this.field5418.field6334;
                if (var4.field800 != null) {
                    var4 = var4.method420(class281.field3700, 119);
                }
                if (var4 == null) {
                    this.field5407 = this.field5420 = 0;
                } else {
                    this.field5420 = var4.field861 << 7;
                    this.field5407 = var4.field834;
                }
            }
        } else if (this.field5409 != null) {
            this.field5401 = class519.method2963(this.field5409, 0);
            this.field5420 = this.field5409.field7992 << 7;
            this.field5407 = this.field5409.field8014;
        }
        if (arg0 == 0 && this.field5401 != var2 && this.field5417 != null) {
            class534.field7500.method803(this.field5417);
            this.field5417 = null;
        }
    }
}
