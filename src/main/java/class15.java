import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class15 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    private int field145 = 0;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    private int field147 = -1;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    private int field144 = 0;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    private int field148 = -1;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lvn;")
    private class169 field146 = new class169();

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Z")
    private boolean field150 = true;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "[Lfc;")
    private class141[] field153 = new class141[2];

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Z")
    private boolean field154 = true;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    private int field157 = -1;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Z")
    private boolean field155 = true;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    private int field152 = 0;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Z")
    private boolean field158 = false;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lpo;")
    private class332 field143;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Lib;")
    private class86 field149;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lfc;")
    private class141 field156;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lvf;")
    private class84 field151;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
    public final void method100() {
        if (this.field149 != null) {
            this.field149 = null;
            this.field153 = null;
            this.field151 = null;
            this.field156 = null;
            this.field155 = true;
            this.field154 = true;
            this.field150 = true;
            if (!this.field146.method1122(-5874)) {
                for (class359 var1 = this.field146.method1124(-1); var1 != this.field146.field2358; var1 = var1.field5243) {
                    ((class209) var1).method1323();
                }
            }
        }
        this.field147 = this.field148 = -1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lhe;)Z")
    public final boolean method101(class209 arg0) {
        if (this.field149 != null) {
            if (arg0.method1327() || arg0.method1320()) {
                if (this.field147 != -1 && this.field148 != -1) {
                    arg0.method1321(this.field147, this.field148);
                }
                arg0.field2829 = true;
                this.field146.method1125(-1, arg0);
                this.method104();
                return true;
            }
            arg0.method1323();
        }
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()Z")
    private final boolean method102() {
        return this.field143.method2079() == this.field149;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lhe;)V")
    public final void method103(class209 arg0) {
        this.method106(arg0, true);
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()V")
    private final void method104() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class209 var4 = (class209) this.field146.method1124(-1); var4 != null; var4 = (class209) this.field146.method1119(false)) {
            int var5 = var4.method1324();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method1326(1);
            var3 |= var4.method1328((byte) 117);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field157 != var6) {
            this.field157 = var6;
            this.field155 = true;
        }
        int var7 = this.field152 > 2 ? 2 : this.field152;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field150 = this.field155 = true;
        }
        if (this.field158 != var3) {
            this.field158 = var3;
            this.field154 = true;
        }
        this.field152 = var2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)Z")
    public final boolean method105(int arg0, int arg1, int arg2, int arg3) {
        if (this.field149 == null || this.field146.method1122(-5874)) {
            return false;
        }
        boolean var5 = false;
        if (this.field147 != arg2 || this.field148 != arg3) {
            this.field147 = arg2;
            this.field148 = arg3;
            for (class359 var6 = this.field146.method1124(-1); var6 != this.field146.field2358; var6 = var6.field5243) {
                ((class209) var6).method1321(this.field147, this.field148);
            }
            this.field155 = true;
            this.field154 = true;
        }
        if (this.field154) {
            if (this.field151 != null) {
                this.field151.method459();
                this.field151 = null;
            }
            if (this.field156 != null) {
                this.field156.method2723();
                this.field156 = null;
            }
            if (this.field158) {
                this.field156 = new class141(this.field143, 34037, 6402, this.field147, this.field148);
            } else {
                this.field151 = new class84(this.field143, 6402, this.field147, this.field148);
            }
            this.field150 = true;
            this.field154 = false;
            var5 = true;
        }
        if (this.field155) {
            if (this.field153[0] != null) {
                this.field153[0].method2723();
                this.field153[0] = null;
            }
            if (this.field153[1] != null) {
                this.field153[1].method2723();
                this.field153[1] = null;
            }
            this.field153[0] = new class141(this.field143, 34037, this.field157, this.field147, this.field148);
            this.field153[1] = this.field152 > 1 ? new class141(this.field143, 34037, this.field157, this.field147, this.field148) : null;
            this.field150 = true;
            this.field155 = false;
            var5 = true;
        }
        int var7 = this.field143.method2079().method294();
        this.field143.method2078(this.field149);
        if (this.field150) {
            this.field149.method466(0);
            this.field149.method466(1);
            this.field149.method466(8);
            if (this.field153[0] != null) {
                this.field149.method467(0, this.field153[0]);
            }
            if (this.field153[1] != null) {
                this.field149.method467(1, this.field153[1]);
            }
            if (this.field156 != null) {
                this.field149.method467(8, this.field156);
            }
            if (this.field151 != null) {
                this.field149.method468(8, this.field151);
            }
            this.field149.method471(0);
            this.field150 = false;
            var5 = true;
        }
        if (!var5 || this.field149.method473()) {
            this.field145 = arg0;
            this.field144 = arg1;
            this.field143.method2066(-this.field145, this.field148 + this.field144 - var7);
            return true;
        }
        this.field143.method2104(this.field149);
        this.field155 = true;
        this.field154 = true;
        this.field150 = true;
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lhe;Z)V")
    private final void method106(class209 arg0, boolean arg1) {
        if (arg1) {
            arg0.method1323();
        }
        arg0.field2829 = false;
        arg0.method2290((byte) 98);
        this.method104();
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "()V")
    public final void method107() {
        if (!this.method102()) {
            return;
        }
        opengl var1 = this.field143.field4752;
        this.field143.method2094();
        this.field143.method2131(0);
        this.field143.method957();
        int var2 = 0;
        int var3 = 1;
        class209 var5;
        for (class209 var4 = (class209) this.field146.method1124(-1); var4 != null; var4 = var5) {
            var5 = (class209) this.field146.method1119(false);
            int var6 = var4.method1326(1);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method1325(var7, this.field153[var2], this.field156);
                if (var5 == null && var6 - 1 == var7) {
                    this.field143.method2104(this.field149);
                    this.field143.method2066(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field148);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field145, this.field144);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field145, this.field148 + this.field144);
                    var1.glTexCoord2f((float) this.field147, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field147 + this.field145, this.field148 + this.field144);
                    var1.glTexCoord2f((float) this.field147, (float) this.field148);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field147 + this.field145, this.field144);
                    var1.glEnd();
                } else {
                    this.field149.method471(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field148);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field148);
                    var1.glTexCoord2f((float) this.field147, (float) this.field148);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field147, this.field148);
                    var1.glTexCoord2f((float) this.field147, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field147, 0);
                    var1.glEnd();
                }
                var4.method1322(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lpo;)V")
    public class15(class332 arg0) {
        this.field143 = arg0;
        if (this.field143.field4862 && this.field143.field4837) {
            this.field149 = new class86(this.field143);
        }
    }
}
